package org.joda.time;

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
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(0L, dateTimeZone5);
        mutableDateTime6.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology9 = mutableDateTime6.getChronology();
        int int10 = mutableDateTime6.getSecondOfMinute();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime6);
        mutableDateTime2.addHours((int) '4');
        mutableDateTime2.setMillis((long) 5);
        mutableDateTime2.addWeeks(1980);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(0L, dateTimeZone19);
        mutableDateTime20.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar23 = mutableDateTime20.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime20.copy();
        java.util.GregorianCalendar gregorianCalendar25 = mutableDateTime20.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(0L, dateTimeZone27);
        mutableDateTime28.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology31 = mutableDateTime28.getChronology();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime28.era();
        mutableDateTime28.setDayOfYear((int) (short) 100);
        int int35 = mutableDateTime28.getYearOfEra();
        boolean boolean36 = mutableDateTime28.isBeforeNow();
        java.util.Locale locale37 = null;
        java.util.Calendar calendar38 = mutableDateTime28.toCalendar(locale37);
        mutableDateTime20.setTime((org.joda.time.ReadableInstant) mutableDateTime28);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime20.yearOfCentury();
        int int41 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime20);
        long long42 = mutableDateTime20.getMillis();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(0L, dateTimeZone44);
        mutableDateTime45.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar48 = mutableDateTime45.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime45.copy();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime45.minuteOfHour();
        long long51 = property50.getMillis();
        java.util.Locale locale52 = null;
        java.lang.String str53 = property50.getAsShortText(locale52);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(0L, dateTimeZone55);
        mutableDateTime56.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar59 = mutableDateTime56.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime60 = mutableDateTime56.copy();
        boolean boolean62 = mutableDateTime56.isBefore((long) '#');
        mutableDateTime56.setDate((long) 40);
        int int65 = mutableDateTime56.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime(0L, dateTimeZone67);
        mutableDateTime68.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology71 = mutableDateTime68.getChronology();
        int int72 = mutableDateTime68.getSecondOfMinute();
        mutableDateTime68.setMinuteOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.MutableDateTime mutableDateTime77 = new org.joda.time.MutableDateTime(0L, dateTimeZone76);
        mutableDateTime77.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar80 = mutableDateTime77.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime81 = mutableDateTime77.copy();
        mutableDateTime77.setDayOfYear((int) (byte) 10);
        boolean boolean84 = mutableDateTime68.isBefore((org.joda.time.ReadableInstant) mutableDateTime77);
        boolean boolean85 = mutableDateTime68.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone86 = mutableDateTime68.getZone();
        mutableDateTime56.setZoneRetainFields(dateTimeZone86);
        org.joda.time.MutableDateTime mutableDateTime88 = new org.joda.time.MutableDateTime((java.lang.Object) str53, dateTimeZone86);
        boolean boolean89 = mutableDateTime20.isEqual((org.joda.time.ReadableInstant) mutableDateTime88);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime20.setMinuteOfHour(70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(gregorianCalendar23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(gregorianCalendar25);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1970 + "'", int35 == 1970);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 35000L + "'", long42 == 35000L);
        org.junit.Assert.assertNotNull(gregorianCalendar48);
        org.junit.Assert.assertNotNull(mutableDateTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 35000L + "'", long51 == 35000L);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "0" + "'", str53, "0");
        org.junit.Assert.assertNotNull(gregorianCalendar59);
        org.junit.Assert.assertNotNull(mutableDateTime60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1970 + "'", int65 == 1970);
        org.junit.Assert.assertNotNull(chronology71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 35 + "'", int72 == 35);
        org.junit.Assert.assertNotNull(gregorianCalendar80);
        org.junit.Assert.assertNotNull(mutableDateTime81);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(dateTimeZone86);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.era();
        mutableDateTime2.setDayOfYear((int) (short) 100);
        int int9 = mutableDateTime2.getYearOfEra();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.era();
        int int11 = mutableDateTime2.getCenturyOfEra();
        mutableDateTime2.addMonths(25235000);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setMinuteOfDay(2000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 19 + "'", int11 == 19);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        mutableDateTime2.addMillis((-1));
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.add((int) (short) -1);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.weekyear();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(0L, dateTimeZone13);
        mutableDateTime14.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar17 = mutableDateTime14.toGregorianCalendar();
        mutableDateTime14.addMillis((-1));
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime14.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime22 = property20.add((int) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime22.toMutableDateTimeISO();
        int int24 = property11.getDifference((org.joda.time.ReadableInstant) mutableDateTime22);
        java.util.Locale locale25 = null;
        java.util.Calendar calendar26 = mutableDateTime22.toCalendar(locale25);
        mutableDateTime22.addHours(2026);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime22.weekOfWeekyear();
        mutableDateTime22.addWeeks(25235);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime22.weekOfWeekyear();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(gregorianCalendar17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(calendar26);
        org.junit.Assert.assertEquals(calendar26.toString(), "sun.util.BuddhistCalendar[time=-3155672489001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2413,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=18,SECOND=30,MILLISECOND=999,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property32);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 12);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime4 = property2.add(25200000L);
        java.util.Locale locale5 = null;
        int int6 = property2.getMaximumTextLength(locale5);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(0L, dateTimeZone2);
        mutableDateTime3.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime3.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime3.copy();
        mutableDateTime0.setTime((org.joda.time.ReadableInstant) mutableDateTime3);
        int int9 = mutableDateTime3.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime3.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.hourOfDay();
        mutableDateTime11.setWeekOfWeekyear(6);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime11.setDate(366, 8, 365);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.addWrapField((int) (byte) 0);
        mutableDateTime10.addWeekyears(100);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime10.year();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.addWrapField(93);
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        mutableDateTime2.setDate(0L);
        int int9 = mutableDateTime2.getMinuteOfDay();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime13 = property10.add((-100L));
        int int14 = property10.getMaximumValue();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 420 + "'", int9 == 420);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.era();
        int int7 = mutableDateTime2.getMillisOfDay();
        mutableDateTime2.add((long) 19);
        int int10 = mutableDateTime2.getSecondOfDay();
        int int11 = mutableDateTime2.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(0L, dateTimeZone13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.monthOfYear();
        long long16 = property15.remainder();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.roundFloor();
        org.joda.time.DateTimeField dateTimeField18 = property15.getField();
        org.joda.time.MutableDateTime.Property property19 = new org.joda.time.MutableDateTime.Property(mutableDateTime2, dateTimeField18);
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime2.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.hourOfDay();
        int int22 = property21.getLeapAmount();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 25235000 + "'", int7 == 25235000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25235 + "'", int10 == 25235);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 19 + "'", int11 == 19);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 25200000L + "'", long16 == 25200000L);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 12);
        mutableDateTime1.setYear(28);
        mutableDateTime1.setDayOfYear((int) ' ');
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
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
        int int23 = mutableDateTime2.getYearOfEra();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime2.millisOfDay();
        org.joda.time.DateTime dateTime25 = mutableDateTime2.toDateTime();
        int int26 = dateTime25.getHourOfDay();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(calendar20);
        org.junit.Assert.assertEquals(calendar20.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1970 + "'", int23 == 1970);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 7 + "'", int26 == 7);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        boolean boolean7 = mutableDateTime2.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(0L, dateTimeZone10);
        mutableDateTime11.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology14 = mutableDateTime11.getChronology();
        org.joda.time.Chronology chronology15 = mutableDateTime11.getChronology();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) ' ', chronology15);
        org.joda.time.DateTime dateTime17 = mutableDateTime2.toDateTime(chronology15);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime2.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundHalfFloor();
        int int20 = mutableDateTime19.getYearOfEra();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.weekOfWeekyear();
        mutableDateTime19.setDate((long) 2000);
        boolean boolean24 = mutableDateTime19.isBeforeNow();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        mutableDateTime2.setSecondOfDay(10);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.millisOfDay();
        int int9 = mutableDateTime2.getMinuteOfDay();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.era();
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(0L, dateTimeZone13);
        mutableDateTime14.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar17 = mutableDateTime14.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime14.copy();
        mutableDateTime11.setTime((org.joda.time.ReadableInstant) mutableDateTime14);
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime14);
        int int21 = mutableDateTime14.getYearOfEra();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime14.era();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(0L, dateTimeZone24);
        java.util.Date date26 = mutableDateTime25.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = null;
        boolean boolean28 = mutableDateTime25.isSupported(dateTimeFieldType27);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(0L, dateTimeZone31);
        mutableDateTime32.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology35 = mutableDateTime32.getChronology();
        org.joda.time.Chronology chronology36 = mutableDateTime32.getChronology();
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((long) ' ', chronology36);
        org.joda.time.DateTime dateTime38 = mutableDateTime25.toDateTime(chronology36);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(chronology36);
        int int40 = mutableDateTime39.getWeekOfWeekyear();
        int int41 = mutableDateTime39.getRoundingMode();
        mutableDateTime39.setMinuteOfHour(3);
        int int44 = mutableDateTime39.getWeekOfWeekyear();
        boolean boolean45 = mutableDateTime39.isAfterNow();
        long long46 = mutableDateTime39.getMillis();
        int int47 = mutableDateTime39.getYearOfCentury();
        int int48 = property22.compareTo((org.joda.time.ReadableInstant) mutableDateTime39);
        org.joda.time.DurationField durationField49 = property22.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime50 = property22.roundFloor();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(gregorianCalendar17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1970 + "'", int21 == 1970);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 40 + "'", int40 == 40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 40 + "'", int44 == 40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
// flaky "1) test3012(org.joda.time.RegressionTest6)":         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1790579027729L + "'", long46 == 1790579027729L);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 26 + "'", int47 == 26);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(durationField49);
        org.junit.Assert.assertNotNull(mutableDateTime50);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        long long4 = property3.remainder();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.roundFloor();
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        org.joda.time.MutableDateTime mutableDateTime8 = property3.set("1");
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime8.toMutableDateTime();
        mutableDateTime9.setMinuteOfDay(33);
        int int12 = mutableDateTime9.getCenturyOfEra();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = mutableDateTime9.toString("yearOfEra");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: r");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 25200000L + "'", long4 == 25200000L);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
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
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime2.centuryOfEra();
        java.lang.String str23 = property22.getAsShortText();
        java.lang.String str24 = property22.getAsString();
        java.util.Locale locale25 = null;
        int int26 = property22.getMaximumShortTextLength(locale25);
        org.joda.time.DurationField durationField27 = property22.getLeapDurationField();
        org.joda.time.MutableDateTime mutableDateTime29 = property22.add(56);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime31 = property22.set("2026-09-28T14:48:18.191+07:00");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2026-09-28T14:48:18.191+07:00\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(calendar20);
        org.junit.Assert.assertEquals(calendar20.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "19" + "'", str23, "19");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "19" + "'", str24, "19");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 7 + "'", int26 == 7);
        org.junit.Assert.assertNull(durationField27);
        org.junit.Assert.assertNotNull(mutableDateTime29);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2026-09-28T14:48:08.433+07:00");
        int int2 = mutableDateTime1.getYearOfEra();
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2026 + "'", int2 == 2026);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.addWrapField((int) '#');
        org.joda.time.MutableDateTime mutableDateTime12 = property7.add(4);
        int int13 = property7.getMinimumValue();
        java.lang.String str14 = property7.getName();
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime17 = property7.set("2026-09-28T14:47:55.119+07:00", locale16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2026-09-28T14:47:55.119+07:00\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "minuteOfHour" + "'", str14, "minuteOfHour");
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(0L, dateTimeZone5);
        mutableDateTime6.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology9 = mutableDateTime6.getChronology();
        int int10 = mutableDateTime6.getSecondOfMinute();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime6);
        int int12 = mutableDateTime2.getYear();
        int int13 = mutableDateTime2.getHourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, dateTimeZone16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.monthOfYear();
        long long19 = property18.remainder();
        org.joda.time.MutableDateTime mutableDateTime20 = property18.roundFloor();
        org.joda.time.DateTimeField dateTimeField21 = property18.getField();
        org.joda.time.MutableDateTime mutableDateTime23 = property18.set("1");
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime23.toMutableDateTimeISO();
        boolean boolean25 = property14.equals((java.lang.Object) mutableDateTime23);
        org.joda.time.DurationField durationField26 = property14.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime28 = property14.addWrapField(2);
        int int29 = property14.getMaximumValue();
        long long30 = property14.remainder();
        org.joda.time.MutableDateTime mutableDateTime31 = property14.roundFloor();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 25200000L + "'", long19 == 25200000L);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 12 + "'", int29 == 12);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 25235000L + "'", long30 == 25235000L);
        org.junit.Assert.assertNotNull(mutableDateTime31);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.addWrapField((int) '#');
        java.lang.String str11 = property7.getAsText();
        java.util.Locale locale13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = property7.set("36", locale13);
        org.joda.time.MutableDateTime mutableDateTime15 = property7.roundHalfFloor();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(0L, dateTimeZone17);
        mutableDateTime18.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology21 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime18.era();
        mutableDateTime18.setDayOfYear((int) (short) 100);
        int int25 = mutableDateTime18.getDayOfWeek();
        org.joda.time.DateTimeField dateTimeField26 = null;
        mutableDateTime18.setRounding(dateTimeField26);
        mutableDateTime18.addWeekyears((int) (byte) 1);
        int int30 = property7.compareTo((org.joda.time.ReadableInstant) mutableDateTime18);
        java.util.Locale locale31 = null;
        int int32 = property7.getMaximumShortTextLength(locale31);
        org.joda.time.DateTimeField dateTimeField33 = property7.getField();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "36" + "'", str11, "36");
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(dateTimeField33);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        boolean boolean8 = mutableDateTime2.isBefore((long) '#');
        mutableDateTime2.setDate((long) 40);
        boolean boolean12 = mutableDateTime2.isAfter((long) '#');
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(0L, dateTimeZone14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.monthOfYear();
        org.joda.time.DateTime dateTime17 = mutableDateTime15.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime15.copy();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime2.centuryOfEra();
        boolean boolean21 = property20.isLeap();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.yearOfEra();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(0L, dateTimeZone4);
        java.util.Date date6 = mutableDateTime5.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = mutableDateTime5.isSupported(dateTimeFieldType7);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(0L, dateTimeZone11);
        mutableDateTime12.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology15 = mutableDateTime12.getChronology();
        org.joda.time.Chronology chronology16 = mutableDateTime12.getChronology();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) ' ', chronology16);
        org.joda.time.DateTime dateTime18 = mutableDateTime5.toDateTime(chronology16);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology16);
        int int20 = mutableDateTime19.getWeekOfWeekyear();
        int int21 = mutableDateTime19.getRoundingMode();
        boolean boolean22 = mutableDateTime19.isAfterNow();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime19.year();
        org.joda.time.DateTimeField dateTimeField24 = property23.getField();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setRounding(dateTimeField24, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 40 + "'", int20 == 40);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(0L, dateTimeZone2);
        mutableDateTime3.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime3.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime3.copy();
        mutableDateTime0.setTime((org.joda.time.ReadableInstant) mutableDateTime3);
        int int9 = mutableDateTime3.getSecondOfMinute();
        mutableDateTime3.addMonths(53320789);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.addWrapField((int) '#');
        org.joda.time.MutableDateTime mutableDateTime12 = property7.add(4);
        mutableDateTime12.addMinutes((-1));
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime12.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime12.copy();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(0L, dateTimeZone18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime19.copy();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(0L, dateTimeZone23);
        mutableDateTime24.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology27 = mutableDateTime24.getChronology();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime24.year();
        org.joda.time.Chronology chronology29 = property28.getChronology();
        long long30 = property28.getMillis();
        org.joda.time.MutableDateTime mutableDateTime31 = property28.roundHalfCeiling();
        org.joda.time.Chronology chronology32 = property28.getChronology();
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime19, chronology32);
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime16.toMutableDateTime(chronology32);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(0L, dateTimeZone36);
        mutableDateTime37.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology40 = mutableDateTime37.getChronology();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime37.year();
        mutableDateTime37.addDays(40);
        java.util.Date date44 = mutableDateTime37.toDate();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime37.dayOfYear();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime37.dayOfMonth();
        long long47 = property46.getMillis();
        org.joda.time.DateTimeField dateTimeField48 = property46.getField();
        int int49 = mutableDateTime16.get(dateTimeField48);
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 35000L + "'", long30 == 35000L);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Tue Feb 10 07:00:35 ICT 1970");
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 3456035000L + "'", long47 == 3456035000L);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfDay();
        java.lang.String str8 = property7.getName();
        long long9 = property7.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property7.getFieldType();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "secondOfDay" + "'", str8, "secondOfDay");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35000L + "'", long9 == 35000L);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTime dateTime4 = mutableDateTime2.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.toMutableDateTime();
        int int7 = mutableDateTime6.getMinuteOfDay();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime6.toString(dateTimeFormatter9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(0L, dateTimeZone12);
        mutableDateTime13.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar16 = mutableDateTime13.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime13.copy();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.minuteOfHour();
        long long19 = property18.getMillis();
        java.util.Locale locale20 = null;
        java.lang.String str21 = property18.getAsShortText(locale20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(0L, dateTimeZone23);
        mutableDateTime24.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar27 = mutableDateTime24.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime24.copy();
        boolean boolean30 = mutableDateTime24.isBefore((long) '#');
        mutableDateTime24.setDate((long) 40);
        int int33 = mutableDateTime24.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(0L, dateTimeZone35);
        mutableDateTime36.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology39 = mutableDateTime36.getChronology();
        int int40 = mutableDateTime36.getSecondOfMinute();
        mutableDateTime36.setMinuteOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(0L, dateTimeZone44);
        mutableDateTime45.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar48 = mutableDateTime45.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime45.copy();
        mutableDateTime45.setDayOfYear((int) (byte) 10);
        boolean boolean52 = mutableDateTime36.isBefore((org.joda.time.ReadableInstant) mutableDateTime45);
        boolean boolean53 = mutableDateTime36.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone54 = mutableDateTime36.getZone();
        mutableDateTime24.setZoneRetainFields(dateTimeZone54);
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime((java.lang.Object) str21, dateTimeZone54);
        mutableDateTime6.setZone(dateTimeZone54);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(0L, dateTimeZone59);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime60.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime(0L, dateTimeZone63);
        mutableDateTime64.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology67 = mutableDateTime64.getChronology();
        int int68 = mutableDateTime64.getSecondOfMinute();
        mutableDateTime60.setTime((org.joda.time.ReadableInstant) mutableDateTime64);
        mutableDateTime60.setSecondOfMinute((int) (short) 0);
        mutableDateTime60.addYears((int) '#');
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime(0L, dateTimeZone75);
        org.joda.time.MutableDateTime.Property property77 = mutableDateTime76.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone79 = null;
        org.joda.time.MutableDateTime mutableDateTime80 = new org.joda.time.MutableDateTime(0L, dateTimeZone79);
        mutableDateTime80.setSecondOfMinute((int) '#');
        boolean boolean83 = mutableDateTime76.equals((java.lang.Object) '#');
        boolean boolean84 = mutableDateTime60.isAfter((org.joda.time.ReadableInstant) mutableDateTime76);
        boolean boolean85 = mutableDateTime60.isAfterNow();
        int int86 = mutableDateTime60.getMillisOfDay();
        boolean boolean87 = mutableDateTime6.isAfter((org.joda.time.ReadableInstant) mutableDateTime60);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime6.setTime(25200000, 53320789, 45, 888);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25200000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 420 + "'", int7 == 420);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01T07:00:00.000+07:00" + "'", str10, "1970-01-01T07:00:00.000+07:00");
        org.junit.Assert.assertNotNull(gregorianCalendar16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35000L + "'", long19 == 35000L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0" + "'", str21, "0");
        org.junit.Assert.assertNotNull(gregorianCalendar27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1970 + "'", int33 == 1970);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
        org.junit.Assert.assertNotNull(gregorianCalendar48);
        org.junit.Assert.assertNotNull(mutableDateTime49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 35 + "'", int68 == 35);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 25200000 + "'", int86 == 25200000);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 12);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(0L, dateTimeZone4);
        mutableDateTime5.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar8 = mutableDateTime5.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.copy();
        java.util.GregorianCalendar gregorianCalendar10 = mutableDateTime5.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(0L, dateTimeZone12);
        mutableDateTime13.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology16 = mutableDateTime13.getChronology();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime13.era();
        mutableDateTime13.setDayOfYear((int) (short) 100);
        int int20 = mutableDateTime13.getYearOfEra();
        boolean boolean21 = mutableDateTime13.isBeforeNow();
        java.util.Locale locale22 = null;
        java.util.Calendar calendar23 = mutableDateTime13.toCalendar(locale22);
        mutableDateTime5.setTime((org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime13.getZone();
        mutableDateTime1.setZone(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(0L, dateTimeZone28);
        mutableDateTime29.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology32 = mutableDateTime29.getChronology();
        org.joda.time.Chronology chronology33 = mutableDateTime29.getChronology();
        boolean boolean34 = mutableDateTime29.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(0L, dateTimeZone37);
        mutableDateTime38.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology41 = mutableDateTime38.getChronology();
        org.joda.time.Chronology chronology42 = mutableDateTime38.getChronology();
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((long) ' ', chronology42);
        org.joda.time.DateTime dateTime44 = mutableDateTime29.toDateTime(chronology42);
        mutableDateTime29.addDays((int) 'a');
        java.lang.Object obj47 = mutableDateTime29.clone();
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        mutableDateTime29.add(readablePeriod48, 888);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(0L, dateTimeZone52);
        mutableDateTime53.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology56 = mutableDateTime53.getChronology();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime53.era();
        int int58 = mutableDateTime53.getMillisOfDay();
        mutableDateTime53.add((long) 19);
        int int61 = mutableDateTime53.getSecondOfDay();
        int int62 = mutableDateTime53.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(0L, dateTimeZone64);
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime65.monthOfYear();
        long long67 = property66.remainder();
        org.joda.time.MutableDateTime mutableDateTime68 = property66.roundFloor();
        org.joda.time.DateTimeField dateTimeField69 = property66.getField();
        org.joda.time.MutableDateTime.Property property70 = new org.joda.time.MutableDateTime.Property(mutableDateTime53, dateTimeField69);
        mutableDateTime29.setRounding(dateTimeField69);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setRounding(dateTimeField69, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(gregorianCalendar8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(gregorianCalendar10);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(calendar23);
        org.junit.Assert.assertEquals(calendar23.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "1970-04-08T07:00:35.000+07:00");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "1970-04-08T07:00:35.000+07:00");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "1970-04-08T07:00:35.000+07:00");
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 25235000 + "'", int58 == 25235000);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 25235 + "'", int61 == 25235);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 19 + "'", int62 == 19);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 25200000L + "'", long67 == 25200000L);
        org.junit.Assert.assertNotNull(mutableDateTime68);
        org.junit.Assert.assertNotNull(dateTimeField69);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.year();
        int int7 = property6.getMaximumValueOverall();
        int int8 = property6.getMaximumValue();
        java.lang.String str9 = property6.getAsText();
        org.joda.time.Chronology chronology10 = property6.getChronology();
        long long11 = property6.getMillis();
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime14 = property6.set("2026-09-28T14:48:17.233+07:00", locale13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2026-09-28T14:48:17.233+07:00\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 292278993 + "'", int7 == 292278993);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 292278993 + "'", int8 == 292278993);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970" + "'", str9, "1970");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35000L + "'", long11 == 35000L);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(0L, dateTimeZone10);
        mutableDateTime11.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology14 = mutableDateTime11.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (short) -1, chronology14);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(chronology14);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 420, chronology14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(957, 53318869, 12, 25233, 2004, 1968, 70, chronology14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25233 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(mutableDateTime17);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(0L, dateTimeZone2);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.monthOfYear();
        org.joda.time.DateTime dateTime5 = mutableDateTime3.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime3.copy();
        java.util.Date date7 = mutableDateTime3.toDate();
        boolean boolean8 = mutableDateTime3.isAfterNow();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime3.hourOfDay();
        org.joda.time.Chronology chronology10 = property9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(8553635000L, chronology10);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 12);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(0L, dateTimeZone4);
        mutableDateTime5.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar8 = mutableDateTime5.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.copy();
        java.util.GregorianCalendar gregorianCalendar10 = mutableDateTime5.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(0L, dateTimeZone12);
        mutableDateTime13.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology16 = mutableDateTime13.getChronology();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime13.era();
        mutableDateTime13.setDayOfYear((int) (short) 100);
        int int20 = mutableDateTime13.getYearOfEra();
        boolean boolean21 = mutableDateTime13.isBeforeNow();
        java.util.Locale locale22 = null;
        java.util.Calendar calendar23 = mutableDateTime13.toCalendar(locale22);
        mutableDateTime5.setTime((org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime13.getZone();
        mutableDateTime1.setZone(dateTimeZone25);
        mutableDateTime1.setDate((long) 1);
        boolean boolean30 = mutableDateTime1.isEqual((long) 100000);
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.parse("1970");
        org.joda.time.DateTime dateTime33 = mutableDateTime32.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime32.getZone();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime32.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(0L, dateTimeZone37);
        mutableDateTime38.setSecondOfMinute((int) '#');
        org.joda.time.DateTime dateTime41 = mutableDateTime38.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(0L, dateTimeZone43);
        mutableDateTime44.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology47 = mutableDateTime44.getChronology();
        int int48 = mutableDateTime44.getSecondOfMinute();
        boolean boolean49 = mutableDateTime44.isEqualNow();
        mutableDateTime44.setYear((int) '#');
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(0L, dateTimeZone53);
        mutableDateTime54.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology57 = mutableDateTime54.getChronology();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime54.era();
        mutableDateTime54.setDayOfYear((int) (short) 100);
        int int61 = mutableDateTime54.getYearOfEra();
        boolean boolean62 = mutableDateTime54.isBeforeNow();
        java.util.Locale locale63 = null;
        java.util.Calendar calendar64 = mutableDateTime54.toCalendar(locale63);
        boolean boolean65 = mutableDateTime44.isAfter((org.joda.time.ReadableInstant) mutableDateTime54);
        mutableDateTime38.setTime((org.joda.time.ReadableInstant) mutableDateTime54);
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime38.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime68 = property67.roundFloor();
        int int69 = property35.getDifference((org.joda.time.ReadableInstant) mutableDateTime68);
        org.joda.time.DateTime dateTime70 = mutableDateTime68.toDateTime();
        java.lang.String str72 = dateTime70.toString("\u0e1e\u0e24.");
        mutableDateTime1.setDate((org.joda.time.ReadableInstant) dateTime70);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(gregorianCalendar8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(gregorianCalendar10);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(calendar23);
        org.junit.Assert.assertEquals(calendar23.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 35 + "'", int48 == 35);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1970 + "'", int61 == 1970);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(calendar64);
        org.junit.Assert.assertEquals(calendar64.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(mutableDateTime68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "\u0e1e\u0e24." + "'", str72, "\u0e1e\u0e24.");
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        long long4 = property3.remainder();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.roundFloor();
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        org.joda.time.MutableDateTime mutableDateTime8 = property3.set("1");
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime8.toMutableDateTime();
        mutableDateTime9.addMillis(26);
        mutableDateTime9.setWeekOfWeekyear(2);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.secondOfDay();
        java.lang.String str15 = property14.toString();
        org.joda.time.Chronology chronology16 = property14.getChronology();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 25200000L + "'", long4 == 25200000L);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Property[secondOfDay]" + "'", str15, "Property[secondOfDay]");
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
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
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology13);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(chronology13);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.minuteOfDay();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime17.secondOfMinute();
        org.joda.time.Chronology chronology20 = property19.getChronology();
        java.lang.String str21 = property19.getAsText();
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(chronology20);
// flaky "2) test3031(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "47" + "'", str21, "47");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        long long4 = property3.remainder();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.roundFloor();
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        org.joda.time.MutableDateTime mutableDateTime8 = property3.set("1");
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime8.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.monthOfYear();
        int int11 = mutableDateTime8.getDayOfWeek();
        mutableDateTime8.addMillis(365);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 25200000L + "'", long4 == 25200000L);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(0L, dateTimeZone5);
        mutableDateTime6.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology9 = mutableDateTime6.getChronology();
        int int10 = mutableDateTime6.getSecondOfMinute();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.Chronology chronology12 = mutableDateTime6.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(chronology12);
        int int14 = mutableDateTime13.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, dateTimeZone16);
        mutableDateTime17.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology20 = mutableDateTime17.getChronology();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.year();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.getMutableDateTime();
        org.joda.time.DurationField durationField23 = property21.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime24 = property21.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime26 = property21.set(25235000);
        org.joda.time.MutableDateTime mutableDateTime28 = property21.add((int) (short) 10);
        org.joda.time.Interval interval29 = property21.toInterval();
        org.joda.time.MutableDateTime mutableDateTime31 = property21.addWrapField((int) (byte) 10);
        int int32 = mutableDateTime31.getMinuteOfHour();
        mutableDateTime13.setMillis((org.joda.time.ReadableInstant) mutableDateTime31);
        int int34 = mutableDateTime31.getCenturyOfEra();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(chronology12);
// flaky "3) test3033(org.joda.time.RegressionTest6)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 928 + "'", int14 == 928);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNull(durationField23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 252350 + "'", int34 == 252350);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        int int6 = mutableDateTime2.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(0L, dateTimeZone8);
        java.util.Date date10 = mutableDateTime9.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = mutableDateTime9.isSupported(dateTimeFieldType11);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, dateTimeZone15);
        mutableDateTime16.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology19 = mutableDateTime16.getChronology();
        org.joda.time.Chronology chronology20 = mutableDateTime16.getChronology();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) ' ', chronology20);
        org.joda.time.DateTime dateTime22 = mutableDateTime9.toDateTime(chronology20);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(chronology20);
        boolean boolean24 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime23);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(0L, dateTimeZone26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.monthOfYear();
        org.joda.time.DateTime dateTime29 = mutableDateTime27.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime27.copy();
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime27.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(0L, dateTimeZone33);
        mutableDateTime34.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology37 = mutableDateTime34.getChronology();
        org.joda.time.Chronology chronology38 = mutableDateTime34.getChronology();
        boolean boolean39 = mutableDateTime34.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(0L, dateTimeZone42);
        mutableDateTime43.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology46 = mutableDateTime43.getChronology();
        org.joda.time.Chronology chronology47 = mutableDateTime43.getChronology();
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((long) ' ', chronology47);
        org.joda.time.DateTime dateTime49 = mutableDateTime34.toDateTime(chronology47);
        mutableDateTime27.setChronology(chronology47);
        org.joda.time.DateTime dateTime51 = mutableDateTime23.toDateTime(chronology47);
        java.util.GregorianCalendar gregorianCalendar52 = dateTime51.toGregorianCalendar();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25235000 + "'", int6 == 25235000);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(gregorianCalendar52);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfDay();
        java.lang.String str8 = property7.toString();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.add((long) 25200012);
        org.joda.time.DateTimeField dateTimeField11 = property7.getField();
        org.joda.time.DateTimeField dateTimeField12 = property7.getField();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[secondOfDay]" + "'", str8, "Property[secondOfDay]");
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.era();
        int int7 = mutableDateTime2.getMillisOfDay();
        mutableDateTime2.add((long) 19);
        int int10 = mutableDateTime2.getSecondOfDay();
        int int11 = mutableDateTime2.getMillisOfSecond();
        long long12 = mutableDateTime2.getMillis();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.getMutableDateTime();
        java.util.Locale locale15 = null;
        java.util.Calendar calendar16 = mutableDateTime14.toCalendar(locale15);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 25235000 + "'", int7 == 25235000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25235 + "'", int10 == 25235);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 19 + "'", int11 == 19);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35019L + "'", long12 == 35019L);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(calendar16);
        org.junit.Assert.assertEquals(calendar16.toString(), "sun.util.BuddhistCalendar[time=35019,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=19,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
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
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology13);
        int int17 = mutableDateTime16.getWeekOfWeekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime16.toString(dateTimeFormatter18);
        mutableDateTime16.addMonths(25235);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime16.minuteOfDay();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime16.hourOfDay();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime16.monthOfYear();
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 40 + "'", int17 == 40);
// flaky "4) test3037(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2026-09-28T14:48:47.965+07:00" + "'", str19, "2026-09-28T14:48:47.965+07:00");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
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
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime10.getZone();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(0L, dateTimeZone24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime25.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(0L, dateTimeZone28);
        mutableDateTime29.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology32 = mutableDateTime29.getChronology();
        int int33 = mutableDateTime29.getSecondOfMinute();
        mutableDateTime25.setTime((org.joda.time.ReadableInstant) mutableDateTime29);
        mutableDateTime25.setSecondOfMinute((int) (short) 0);
        mutableDateTime25.addYears((int) '#');
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(0L, dateTimeZone40);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime41.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(0L, dateTimeZone44);
        mutableDateTime45.setSecondOfMinute((int) '#');
        boolean boolean48 = mutableDateTime41.equals((java.lang.Object) '#');
        boolean boolean49 = mutableDateTime25.isAfter((org.joda.time.ReadableInstant) mutableDateTime41);
        boolean boolean50 = mutableDateTime10.isBefore((org.joda.time.ReadableInstant) mutableDateTime41);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(0L, dateTimeZone52);
        java.util.Date date54 = mutableDateTime53.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = null;
        boolean boolean56 = mutableDateTime53.isSupported(dateTimeFieldType55);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(0L, dateTimeZone59);
        mutableDateTime60.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology63 = mutableDateTime60.getChronology();
        org.joda.time.Chronology chronology64 = mutableDateTime60.getChronology();
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime((long) ' ', chronology64);
        org.joda.time.DateTime dateTime66 = mutableDateTime53.toDateTime(chronology64);
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime(chronology64);
        int int68 = mutableDateTime67.getWeekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField69 = mutableDateTime67.getRoundingField();
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime(0L, dateTimeZone71);
        mutableDateTime72.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology75 = mutableDateTime72.getChronology();
        org.joda.time.MutableDateTime.Property property76 = mutableDateTime72.year();
        int int77 = property76.getMaximumValueOverall();
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = property76.getFieldType();
        int int79 = mutableDateTime67.get(dateTimeFieldType78);
        int int80 = mutableDateTime67.getDayOfWeek();
        mutableDateTime10.setDate((org.joda.time.ReadableInstant) mutableDateTime67);
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(calendar20);
        org.junit.Assert.assertEquals(calendar20.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 40 + "'", int68 == 40);
        org.junit.Assert.assertNull(dateTimeField69);
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 292278993 + "'", int77 == 292278993);
        org.junit.Assert.assertNotNull(dateTimeFieldType78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2026 + "'", int79 == 2026);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
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
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology13);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(chronology13);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(0L, dateTimeZone20);
        mutableDateTime21.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology24 = mutableDateTime21.getChronology();
        org.joda.time.Chronology chronology25 = mutableDateTime21.getChronology();
        boolean boolean26 = mutableDateTime21.isEqualNow();
        mutableDateTime17.setTime((org.joda.time.ReadableInstant) mutableDateTime21);
        int int28 = mutableDateTime17.getMonthOfYear();
        mutableDateTime17.addSeconds((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(0L, dateTimeZone32);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime33.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(0L, dateTimeZone36);
        mutableDateTime37.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology40 = mutableDateTime37.getChronology();
        int int41 = mutableDateTime37.getSecondOfMinute();
        mutableDateTime33.setTime((org.joda.time.ReadableInstant) mutableDateTime37);
        org.joda.time.Chronology chronology43 = mutableDateTime37.getChronology();
        org.joda.time.MutableDateTime mutableDateTime44 = org.joda.time.MutableDateTime.now(chronology43);
        mutableDateTime17.setChronology(chronology43);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 9 + "'", int28 == 9);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 35 + "'", int41 == 35);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(mutableDateTime44);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTime dateTime4 = mutableDateTime2.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime2.add(readableDuration7);
        int int9 = mutableDateTime2.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.secondOfMinute();
        boolean boolean11 = mutableDateTime2.isEqualNow();
        int int12 = mutableDateTime2.getRoundingMode();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        int int7 = mutableDateTime6.getWeekyear();
        int int8 = mutableDateTime6.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(0L, dateTimeZone10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.monthOfYear();
        org.joda.time.DateTime dateTime13 = mutableDateTime11.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime11.copy();
        org.joda.time.DateTimeField dateTimeField15 = mutableDateTime14.getRoundingField();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(0L, dateTimeZone17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.monthOfYear();
        org.joda.time.DateTime dateTime20 = mutableDateTime18.toDateTime();
        java.util.Locale locale21 = null;
        java.util.Calendar calendar22 = dateTime20.toCalendar(locale21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(0L, dateTimeZone24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime25.monthOfYear();
        long long27 = property26.remainder();
        org.joda.time.MutableDateTime mutableDateTime28 = property26.roundFloor();
        org.joda.time.DateTimeField dateTimeField29 = property26.getField();
        int int30 = dateTime20.get(dateTimeField29);
        int int31 = mutableDateTime14.get(dateTimeField29);
        org.joda.time.DateTime dateTime32 = mutableDateTime14.toDateTime();
        int int33 = mutableDateTime14.getMonthOfYear();
        int int34 = mutableDateTime14.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(0L, dateTimeZone36);
        mutableDateTime37.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar40 = mutableDateTime37.toGregorianCalendar();
        mutableDateTime37.setSecondOfDay(10);
        int int43 = mutableDateTime37.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone44 = mutableDateTime37.getZone();
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime14.toMutableDateTime(dateTimeZone44);
        int int46 = mutableDateTime14.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime14.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(0L, dateTimeZone49);
        mutableDateTime50.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology53 = mutableDateTime50.getChronology();
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime50.year();
        org.joda.time.MutableDateTime mutableDateTime55 = property54.getMutableDateTime();
        org.joda.time.DurationField durationField56 = property54.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime57 = property54.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime59 = property54.set(25235000);
        org.joda.time.MutableDateTime mutableDateTime61 = property54.add((int) (short) 10);
        org.joda.time.Interval interval62 = property54.toInterval();
        org.joda.time.MutableDateTime mutableDateTime64 = property54.addWrapField((int) (byte) 10);
        int int65 = mutableDateTime64.getMinuteOfHour();
        boolean boolean66 = mutableDateTime14.isAfter((org.joda.time.ReadableInstant) mutableDateTime64);
        boolean boolean67 = mutableDateTime6.isAfter((org.joda.time.ReadableInstant) mutableDateTime14);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime6.setDayOfWeek(31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 31 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1970 + "'", int7 == 1970);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 70 + "'", int8 == 70);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNull(dateTimeField15);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(calendar22);
        org.junit.Assert.assertEquals(calendar22.toString(), "sun.util.BuddhistCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 25200000L + "'", long27 == 25200000L);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 7 + "'", int34 == 7);
        org.junit.Assert.assertNotNull(gregorianCalendar40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(mutableDateTime55);
        org.junit.Assert.assertNull(durationField56);
        org.junit.Assert.assertNotNull(mutableDateTime57);
        org.junit.Assert.assertNotNull(mutableDateTime59);
        org.junit.Assert.assertNotNull(mutableDateTime61);
        org.junit.Assert.assertNotNull(interval62);
        org.junit.Assert.assertNotNull(mutableDateTime64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.addWrapField((int) '#');
        java.lang.String str11 = property7.getAsText();
        java.util.Locale locale13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = property7.set("36", locale13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.weekyear();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime14.add(readablePeriod16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(0L, dateTimeZone19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(0L, dateTimeZone23);
        mutableDateTime24.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology27 = mutableDateTime24.getChronology();
        int int28 = mutableDateTime24.getSecondOfMinute();
        mutableDateTime20.setTime((org.joda.time.ReadableInstant) mutableDateTime24);
        java.util.Date date30 = mutableDateTime20.toDate();
        int int31 = mutableDateTime20.getMillisOfSecond();
        boolean boolean33 = mutableDateTime20.isBefore((long) 292278993);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime20.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(0L, dateTimeZone36);
        java.util.Date date38 = mutableDateTime37.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = null;
        boolean boolean40 = mutableDateTime37.isSupported(dateTimeFieldType39);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(0L, dateTimeZone43);
        mutableDateTime44.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology47 = mutableDateTime44.getChronology();
        org.joda.time.Chronology chronology48 = mutableDateTime44.getChronology();
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((long) ' ', chronology48);
        org.joda.time.DateTime dateTime50 = mutableDateTime37.toDateTime(chronology48);
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(chronology48);
        org.joda.time.MutableDateTime mutableDateTime52 = org.joda.time.MutableDateTime.now(chronology48);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime52.minuteOfDay();
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime52.secondOfMinute();
        org.joda.time.Chronology chronology55 = property54.getChronology();
        mutableDateTime20.setChronology(chronology55);
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(chronology55);
        org.joda.time.MutableDateTime mutableDateTime58 = mutableDateTime14.toMutableDateTime(chronology55);
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "36" + "'", str11, "36");
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 07:00:35 ICT 1970");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(mutableDateTime58);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
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
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology13);
        int int17 = mutableDateTime16.getWeekOfWeekyear();
        int int18 = mutableDateTime16.getRoundingMode();
        java.lang.Object obj19 = mutableDateTime16.clone();
        boolean boolean20 = mutableDateTime16.isAfterNow();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime16.setTime(25234999, 46, 957, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25234999 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 40 + "'", int17 == 40);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
// flaky "5) test3043(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals(obj19.toString(), "2026-09-28T14:48:48.050+07:00");
// flaky "1) test3043(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "2026-09-28T14:48:48.050+07:00");
// flaky "1) test3043(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "2026-09-28T14:48:48.050+07:00");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(0L, dateTimeZone2);
        mutableDateTime3.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime3.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime3.copy();
        java.util.GregorianCalendar gregorianCalendar8 = mutableDateTime3.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(0L, dateTimeZone10);
        mutableDateTime11.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology14 = mutableDateTime11.getChronology();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime11.era();
        mutableDateTime11.setDayOfYear((int) (short) 100);
        int int18 = mutableDateTime11.getYearOfEra();
        boolean boolean19 = mutableDateTime11.isBeforeNow();
        java.util.Locale locale20 = null;
        java.util.Calendar calendar21 = mutableDateTime11.toCalendar(locale20);
        mutableDateTime3.setTime((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime3.centuryOfEra();
        org.joda.time.Chronology chronology24 = property23.getChronology();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(100L, chronology24);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(gregorianCalendar8);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1970 + "'", int18 == 1970);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(chronology24);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.year();
        org.joda.time.DateTimeField dateTimeField7 = null;
        mutableDateTime2.setRounding(dateTimeField7, (int) 'a');
        org.joda.time.ReadableDuration readableDuration10 = null;
        mutableDateTime2.add(readableDuration10);
        mutableDateTime2.addHours(27360000);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setSecondOfMinute(53295259);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53295259 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.year();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.getMutableDateTime();
        org.joda.time.DurationField durationField8 = property6.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(0L, dateTimeZone10);
        mutableDateTime11.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology14 = mutableDateTime11.getChronology();
        org.joda.time.Chronology chronology15 = mutableDateTime11.getChronology();
        boolean boolean16 = mutableDateTime11.isEqualNow();
        int int17 = property6.compareTo((org.joda.time.ReadableInstant) mutableDateTime11);
        int int18 = mutableDateTime11.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime11.secondOfDay();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNull(durationField8);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(0L, dateTimeZone8);
        mutableDateTime9.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar12 = mutableDateTime9.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime9.copy();
        java.util.GregorianCalendar gregorianCalendar14 = mutableDateTime9.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, dateTimeZone16);
        mutableDateTime17.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology20 = mutableDateTime17.getChronology();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.era();
        mutableDateTime17.setDayOfYear((int) (short) 100);
        int int24 = mutableDateTime17.getYearOfEra();
        boolean boolean25 = mutableDateTime17.isBeforeNow();
        java.util.Locale locale26 = null;
        java.util.Calendar calendar27 = mutableDateTime17.toCalendar(locale26);
        mutableDateTime9.setTime((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime17.getZone();
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(dateTimeZone29);
        org.joda.time.DateTime dateTime31 = mutableDateTime2.toDateTime(dateTimeZone29);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        mutableDateTime2.add(readablePeriod32);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime2.yearOfCentury();
        java.lang.String str35 = property34.getAsText();
        org.joda.time.MutableDateTime mutableDateTime37 = property34.add((long) 58);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime37.yearOfEra();
        int int39 = property38.getMaximumValue();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(gregorianCalendar12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(gregorianCalendar14);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1970 + "'", int24 == 1970);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(calendar27);
        org.junit.Assert.assertEquals(calendar27.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "70" + "'", str35, "70");
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 292278993 + "'", int39 == 292278993);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
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
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology13);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(chronology13);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(0L, dateTimeZone20);
        mutableDateTime21.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology24 = mutableDateTime21.getChronology();
        org.joda.time.Chronology chronology25 = mutableDateTime21.getChronology();
        boolean boolean26 = mutableDateTime21.isEqualNow();
        mutableDateTime17.setTime((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.ReadableDuration readableDuration28 = null;
        mutableDateTime21.add(readableDuration28, 59);
        mutableDateTime21.addMinutes(19);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(0L, dateTimeZone34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(0L, dateTimeZone38);
        mutableDateTime39.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology42 = mutableDateTime39.getChronology();
        int int43 = mutableDateTime39.getSecondOfMinute();
        mutableDateTime35.setTime((org.joda.time.ReadableInstant) mutableDateTime39);
        mutableDateTime35.setSecondOfMinute((int) (short) 0);
        mutableDateTime35.addYears((int) '#');
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(0L, dateTimeZone50);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime51.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(0L, dateTimeZone54);
        mutableDateTime55.setSecondOfMinute((int) '#');
        boolean boolean58 = mutableDateTime51.equals((java.lang.Object) '#');
        boolean boolean59 = mutableDateTime35.isAfter((org.joda.time.ReadableInstant) mutableDateTime51);
        int int60 = mutableDateTime35.getWeekyear();
        org.joda.time.MutableDateTime mutableDateTime61 = mutableDateTime35.toMutableDateTime();
        mutableDateTime61.setMillisOfSecond(12);
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(0L, dateTimeZone65);
        java.util.Date date67 = mutableDateTime66.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = null;
        boolean boolean69 = mutableDateTime66.isSupported(dateTimeFieldType68);
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.MutableDateTime mutableDateTime73 = new org.joda.time.MutableDateTime(0L, dateTimeZone72);
        mutableDateTime73.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology76 = mutableDateTime73.getChronology();
        org.joda.time.Chronology chronology77 = mutableDateTime73.getChronology();
        org.joda.time.MutableDateTime mutableDateTime78 = new org.joda.time.MutableDateTime((long) ' ', chronology77);
        org.joda.time.DateTime dateTime79 = mutableDateTime66.toDateTime(chronology77);
        int int80 = mutableDateTime66.getMillisOfSecond();
        org.joda.time.MutableDateTime.Property property81 = mutableDateTime66.yearOfEra();
        org.joda.time.MutableDateTime.Property property82 = mutableDateTime66.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime84 = org.joda.time.MutableDateTime.parse("1");
        org.joda.time.DateTimeZone dateTimeZone86 = null;
        org.joda.time.MutableDateTime mutableDateTime87 = new org.joda.time.MutableDateTime(0L, dateTimeZone86);
        org.joda.time.MutableDateTime.Property property88 = mutableDateTime87.monthOfYear();
        long long89 = property88.remainder();
        org.joda.time.MutableDateTime mutableDateTime90 = property88.roundFloor();
        org.joda.time.DateTimeField dateTimeField91 = property88.getField();
        int int92 = mutableDateTime84.get(dateTimeField91);
        mutableDateTime66.setRounding(dateTimeField91, 1);
        mutableDateTime61.setRounding(dateTimeField91);
        mutableDateTime21.setRounding(dateTimeField91);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 35 + "'", int43 == 35);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2004 + "'", int60 == 2004);
        org.junit.Assert.assertNotNull(mutableDateTime61);
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(chronology76);
        org.junit.Assert.assertNotNull(chronology77);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(property81);
        org.junit.Assert.assertNotNull(property82);
        org.junit.Assert.assertNotNull(mutableDateTime84);
        org.junit.Assert.assertNotNull(property88);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 25200000L + "'", long89 == 25200000L);
        org.junit.Assert.assertNotNull(mutableDateTime90);
        org.junit.Assert.assertNotNull(dateTimeField91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        boolean boolean8 = mutableDateTime2.isBefore((long) '#');
        mutableDateTime2.setDate((long) 40);
        boolean boolean12 = mutableDateTime2.isAfter((long) '#');
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(0L, dateTimeZone14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.monthOfYear();
        org.joda.time.DateTime dateTime17 = mutableDateTime15.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime15.copy();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField21 = mutableDateTime2.getRoundingField();
        org.joda.time.DateTime dateTime22 = mutableDateTime2.toDateTimeISO();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
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
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology13);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(chronology13);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(0L, dateTimeZone20);
        mutableDateTime21.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology24 = mutableDateTime21.getChronology();
        org.joda.time.Chronology chronology25 = mutableDateTime21.getChronology();
        boolean boolean26 = mutableDateTime21.isEqualNow();
        mutableDateTime17.setTime((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime21.dayOfWeek();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime21.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(0L, dateTimeZone31);
        mutableDateTime32.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology35 = mutableDateTime32.getChronology();
        int int36 = mutableDateTime32.getSecondOfMinute();
        mutableDateTime21.setMillis((org.joda.time.ReadableInstant) mutableDateTime32);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime21.era();
        boolean boolean39 = property38.isLeap();
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
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
        int int32 = mutableDateTime11.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(0L, dateTimeZone34);
        java.util.Date date36 = mutableDateTime35.toDate();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime35.era();
        long long38 = property37.getMillis();
        org.joda.time.Chronology chronology39 = property37.getChronology();
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(chronology39);
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.now(chronology39);
        boolean boolean42 = mutableDateTime11.isEqual((org.joda.time.ReadableInstant) mutableDateTime41);
        boolean boolean44 = mutableDateTime11.isAfter((long) 26);
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35000L + "'", long8 == 35000L);
        org.junit.Assert.assertNotNull(gregorianCalendar14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(gregorianCalendar16);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1970 + "'", int26 == 1970);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(calendar29);
        org.junit.Assert.assertEquals(calendar29.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTime dateTime4 = mutableDateTime2.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.copy();
        int int6 = mutableDateTime2.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(0L, dateTimeZone8);
        mutableDateTime9.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology12 = mutableDateTime9.getChronology();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        boolean boolean14 = mutableDateTime9.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(0L, dateTimeZone17);
        mutableDateTime18.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology21 = mutableDateTime18.getChronology();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) ' ', chronology22);
        org.joda.time.DateTime dateTime24 = mutableDateTime9.toDateTime(chronology22);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime24);
        boolean boolean26 = mutableDateTime2.isAfterNow();
        mutableDateTime2.addMinutes((int) (short) -1);
        int int29 = mutableDateTime2.getSecondOfDay();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime2.dayOfYear();
        long long31 = property30.getMillis();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 25140 + "'", int29 == 25140);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-60000L) + "'", long31 == (-60000L));
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.era();
        mutableDateTime2.setDayOfYear((int) (short) 100);
        int int9 = mutableDateTime2.getDayOfWeek();
        mutableDateTime2.addWeeks((int) (short) 0);
        mutableDateTime2.addHours(58);
        mutableDateTime2.addWeeks(12);
        mutableDateTime2.addMonths((int) (byte) -1);
        java.util.Date date18 = mutableDateTime2.toDate();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime2.add(readablePeriod19, 0);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Fri Jun 05 17:00:35 ICT 1970");
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(25234999, 26, 1439, 442, 25233, 4, 25200012, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 442 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        int int6 = mutableDateTime2.getSecondOfMinute();
        int int7 = mutableDateTime2.getMinuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setMinuteOfHour(86399);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 420 + "'", int7 == 420);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.era();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.set((int) (byte) 1);
        org.joda.time.Chronology chronology9 = mutableDateTime8.getChronology();
        mutableDateTime8.addSeconds(19);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(0L, dateTimeZone13);
        mutableDateTime14.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology17 = mutableDateTime14.getChronology();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime14.era();
        mutableDateTime14.setDayOfYear((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(0L, dateTimeZone22);
        java.util.Date date24 = mutableDateTime23.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        boolean boolean26 = mutableDateTime23.isSupported(dateTimeFieldType25);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(0L, dateTimeZone29);
        mutableDateTime30.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology33 = mutableDateTime30.getChronology();
        org.joda.time.Chronology chronology34 = mutableDateTime30.getChronology();
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) ' ', chronology34);
        org.joda.time.DateTime dateTime36 = mutableDateTime23.toDateTime(chronology34);
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(chronology34);
        mutableDateTime14.setChronology(chronology34);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(0L, dateTimeZone40);
        mutableDateTime41.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar44 = mutableDateTime41.toGregorianCalendar();
        mutableDateTime41.setSecondOfDay(10);
        int int47 = mutableDateTime41.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone48 = mutableDateTime41.getZone();
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime14, dateTimeZone48);
        mutableDateTime8.setZoneRetainFields(dateTimeZone48);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(gregorianCalendar44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone48);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        java.util.GregorianCalendar gregorianCalendar7 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.weekOfWeekyear();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfHour();
        long long8 = property7.getMillis();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property7.getAsShortText(locale9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime12 = property7.set(564);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 564 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35000L + "'", long8 == 35000L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.era();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(0L, dateTimeZone6);
        mutableDateTime7.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology10 = mutableDateTime7.getChronology();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime7.year();
        org.joda.time.Chronology chronology12 = property11.getChronology();
        org.joda.time.DateTime dateTime13 = mutableDateTime2.toDateTime(chronology12);
        mutableDateTime2.addMonths(1972);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        int int7 = mutableDateTime6.getWeekyear();
        mutableDateTime6.addWeeks((int) (short) 100);
        int int10 = mutableDateTime6.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundCeiling();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1970 + "'", int7 == 1970);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        int int6 = mutableDateTime2.getSecondOfMinute();
        boolean boolean7 = mutableDateTime2.isEqualNow();
        mutableDateTime2.setYear((int) '#');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(0L, dateTimeZone11);
        mutableDateTime12.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology15 = mutableDateTime12.getChronology();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime12.era();
        mutableDateTime12.setDayOfYear((int) (short) 100);
        int int19 = mutableDateTime12.getYearOfEra();
        boolean boolean20 = mutableDateTime12.isBeforeNow();
        java.util.Locale locale21 = null;
        java.util.Calendar calendar22 = mutableDateTime12.toCalendar(locale21);
        boolean boolean23 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime12);
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
        mutableDateTime12.setMillis((org.joda.time.ReadableInstant) dateTime39);
        java.util.Date date41 = dateTime39.toDate();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(calendar22);
        org.junit.Assert.assertEquals(calendar22.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 07:00:00 ICT 1970");
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
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
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology13);
        int int17 = mutableDateTime16.getWeekOfWeekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime16.toString(dateTimeFormatter18);
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime16.copy();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.secondOfDay();
        org.joda.time.DurationField durationField22 = property21.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(0L, dateTimeZone24);
        mutableDateTime25.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar28 = mutableDateTime25.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime25.copy();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime25.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime31 = property30.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime33 = property30.addWrapField((int) (byte) 0);
        int int34 = mutableDateTime33.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(0L, dateTimeZone36);
        mutableDateTime37.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar40 = mutableDateTime37.toGregorianCalendar();
        mutableDateTime37.setTime(100L);
        boolean boolean43 = mutableDateTime33.isBefore((org.joda.time.ReadableInstant) mutableDateTime37);
        mutableDateTime33.setSecondOfMinute((int) '#');
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(0L, dateTimeZone47);
        mutableDateTime48.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology51 = mutableDateTime48.getChronology();
        int int52 = mutableDateTime48.getSecondOfMinute();
        mutableDateTime48.setMinuteOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(0L, dateTimeZone56);
        mutableDateTime57.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar60 = mutableDateTime57.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime61 = mutableDateTime57.copy();
        mutableDateTime57.setDayOfYear((int) (byte) 10);
        boolean boolean64 = mutableDateTime48.isBefore((org.joda.time.ReadableInstant) mutableDateTime57);
        org.joda.time.MutableDateTime mutableDateTime65 = mutableDateTime57.copy();
        int int66 = mutableDateTime33.compareTo((org.joda.time.ReadableInstant) mutableDateTime57);
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime57.weekyear();
        java.lang.String str68 = property67.getName();
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.MutableDateTime mutableDateTime71 = new org.joda.time.MutableDateTime(0L, dateTimeZone70);
        mutableDateTime71.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology74 = mutableDateTime71.getChronology();
        org.joda.time.Chronology chronology75 = mutableDateTime71.getChronology();
        boolean boolean76 = mutableDateTime71.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone79 = null;
        org.joda.time.MutableDateTime mutableDateTime80 = new org.joda.time.MutableDateTime(0L, dateTimeZone79);
        mutableDateTime80.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology83 = mutableDateTime80.getChronology();
        org.joda.time.Chronology chronology84 = mutableDateTime80.getChronology();
        org.joda.time.MutableDateTime mutableDateTime85 = new org.joda.time.MutableDateTime((long) ' ', chronology84);
        org.joda.time.DateTime dateTime86 = mutableDateTime71.toDateTime(chronology84);
        int int87 = mutableDateTime71.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property88 = mutableDateTime71.dayOfYear();
        org.joda.time.MutableDateTime.Property property89 = mutableDateTime71.dayOfYear();
        boolean boolean90 = property67.equals((java.lang.Object) mutableDateTime71);
        boolean boolean91 = property21.equals((java.lang.Object) property67);
        int int92 = property67.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime93 = property67.roundCeiling();
        java.lang.String str94 = property67.getName();
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 40 + "'", int17 == 40);
// flaky "6) test3062(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2026-09-28T14:48:48.242+07:00" + "'", str19, "2026-09-28T14:48:48.242+07:00");
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(gregorianCalendar28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1970 + "'", int34 == 1970);
        org.junit.Assert.assertNotNull(gregorianCalendar40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 35 + "'", int52 == 35);
        org.junit.Assert.assertNotNull(gregorianCalendar60);
        org.junit.Assert.assertNotNull(mutableDateTime61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(mutableDateTime65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "weekyear" + "'", str68, "weekyear");
        org.junit.Assert.assertNotNull(chronology74);
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(chronology83);
        org.junit.Assert.assertNotNull(chronology84);
        org.junit.Assert.assertNotNull(dateTime86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 35 + "'", int87 == 35);
        org.junit.Assert.assertNotNull(property88);
        org.junit.Assert.assertNotNull(property89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "weekyear" + "'", str94, "weekyear");
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        int int6 = mutableDateTime2.getSecondOfMinute();
        int int7 = mutableDateTime2.getMinuteOfDay();
        int int8 = mutableDateTime2.getHourOfDay();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = mutableDateTime2.toDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(0L, dateTimeZone13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(0L, dateTimeZone17);
        mutableDateTime18.setSecondOfMinute((int) '#');
        boolean boolean21 = mutableDateTime14.equals((java.lang.Object) '#');
        org.joda.time.DateTimeField dateTimeField22 = null;
        mutableDateTime14.setRounding(dateTimeField22, 25235000);
        boolean boolean25 = mutableDateTime14.isEqualNow();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime14.era();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime14.era();
        java.util.Date date28 = mutableDateTime14.toDate();
        int int29 = mutableDateTime14.getHourOfDay();
        boolean boolean31 = mutableDateTime14.isEqual((-1L));
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(0L, dateTimeZone33);
        mutableDateTime34.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology37 = mutableDateTime34.getChronology();
        int int38 = mutableDateTime34.getSecondOfMinute();
        int int39 = mutableDateTime34.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(0L, dateTimeZone41);
        mutableDateTime42.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar45 = mutableDateTime42.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime42.copy();
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime42.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime48 = property47.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime50 = property47.addWrapField((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = property47.getFieldType();
        mutableDateTime34.set(dateTimeFieldType51, (int) (short) 1);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime14.property(dateTimeFieldType51);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime2.property(dateTimeFieldType51);
        java.lang.String str56 = property55.getName();
        org.joda.time.DurationField durationField57 = property55.getLeapDurationField();
        org.joda.time.MutableDateTime mutableDateTime59 = property55.add((long) 59);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(0L, dateTimeZone61);
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime62.monthOfYear();
        long long64 = property63.remainder();
        org.joda.time.MutableDateTime mutableDateTime65 = property63.roundFloor();
        org.joda.time.DateTimeField dateTimeField66 = property63.getField();
        org.joda.time.MutableDateTime mutableDateTime68 = property63.set("1");
        org.joda.time.MutableDateTime mutableDateTime69 = mutableDateTime68.toMutableDateTimeISO();
        mutableDateTime68.addHours(25200000);
        int int72 = mutableDateTime68.getHourOfDay();
        int int73 = property55.getDifference((org.joda.time.ReadableInstant) mutableDateTime68);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 420 + "'", int7 == 420);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 7 + "'", int29 == 7);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 420 + "'", int39 == 420);
        org.junit.Assert.assertNotNull(gregorianCalendar45);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "minuteOfHour" + "'", str56, "minuteOfHour");
        org.junit.Assert.assertNull(durationField57);
        org.junit.Assert.assertNotNull(mutableDateTime59);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 25200000L + "'", long64 == 25200000L);
        org.junit.Assert.assertNotNull(mutableDateTime65);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertNotNull(mutableDateTime68);
        org.junit.Assert.assertNotNull(mutableDateTime69);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1511999520) + "'", int73 == (-1511999520));
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(0L, dateTimeZone2);
        mutableDateTime3.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime3.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime3.copy();
        java.util.GregorianCalendar gregorianCalendar8 = mutableDateTime3.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(0L, dateTimeZone10);
        mutableDateTime11.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology14 = mutableDateTime11.getChronology();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime11.era();
        mutableDateTime11.setDayOfYear((int) (short) 100);
        int int18 = mutableDateTime11.getYearOfEra();
        boolean boolean19 = mutableDateTime11.isBeforeNow();
        java.util.Locale locale20 = null;
        java.util.Calendar calendar21 = mutableDateTime11.toCalendar(locale20);
        mutableDateTime3.setTime((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) 25235000, dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone23);
        org.joda.time.Instant instant26 = mutableDateTime25.toInstant();
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(gregorianCalendar8);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1970 + "'", int18 == 1970);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(instant26);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.year();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.getMutableDateTime();
        org.joda.time.DurationField durationField8 = property6.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime9 = property6.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime11 = property6.set(25235000);
        org.joda.time.MutableDateTime mutableDateTime13 = property6.add((int) (short) 10);
        org.joda.time.Interval interval14 = property6.toInterval();
        org.joda.time.MutableDateTime mutableDateTime16 = property6.addWrapField((int) (byte) 10);
        int int17 = mutableDateTime16.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(0L, dateTimeZone19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.parse("0");
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(0L, dateTimeZone25);
        mutableDateTime26.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology29 = mutableDateTime26.getChronology();
        int int30 = mutableDateTime26.getSecondOfMinute();
        mutableDateTime26.setMinuteOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(0L, dateTimeZone34);
        mutableDateTime35.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar38 = mutableDateTime35.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime35.copy();
        mutableDateTime35.setDayOfYear((int) (byte) 10);
        boolean boolean42 = mutableDateTime26.isBefore((org.joda.time.ReadableInstant) mutableDateTime35);
        int int43 = mutableDateTime35.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(0L, dateTimeZone45);
        mutableDateTime46.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology49 = mutableDateTime46.getChronology();
        org.joda.time.Chronology chronology50 = mutableDateTime46.getChronology();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(0L, dateTimeZone52);
        mutableDateTime53.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar56 = mutableDateTime53.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime57 = mutableDateTime53.copy();
        java.util.GregorianCalendar gregorianCalendar58 = mutableDateTime53.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(0L, dateTimeZone60);
        mutableDateTime61.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology64 = mutableDateTime61.getChronology();
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime61.era();
        mutableDateTime61.setDayOfYear((int) (short) 100);
        int int68 = mutableDateTime61.getYearOfEra();
        boolean boolean69 = mutableDateTime61.isBeforeNow();
        java.util.Locale locale70 = null;
        java.util.Calendar calendar71 = mutableDateTime61.toCalendar(locale70);
        mutableDateTime53.setTime((org.joda.time.ReadableInstant) mutableDateTime61);
        org.joda.time.DateTimeZone dateTimeZone73 = mutableDateTime61.getZone();
        org.joda.time.MutableDateTime mutableDateTime74 = org.joda.time.MutableDateTime.now(dateTimeZone73);
        org.joda.time.DateTime dateTime75 = mutableDateTime46.toDateTime(dateTimeZone73);
        mutableDateTime35.setZone(dateTimeZone73);
        org.joda.time.DateTime dateTime77 = mutableDateTime23.toDateTime(dateTimeZone73);
        org.joda.time.MutableDateTime mutableDateTime78 = mutableDateTime20.toMutableDateTime(dateTimeZone73);
        boolean boolean79 = mutableDateTime16.isAfter((org.joda.time.ReadableInstant) mutableDateTime20);
        boolean boolean81 = mutableDateTime16.isEqual(62135596810000L);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNull(durationField8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertNotNull(gregorianCalendar38);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 35 + "'", int43 == 35);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(gregorianCalendar56);
        org.junit.Assert.assertNotNull(mutableDateTime57);
        org.junit.Assert.assertNotNull(gregorianCalendar58);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1970 + "'", int68 == 1970);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(calendar71);
        org.junit.Assert.assertEquals(calendar71.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone73);
        org.junit.Assert.assertNotNull(mutableDateTime74);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(mutableDateTime78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.lang.Object obj5 = mutableDateTime2.clone();
        mutableDateTime2.setWeekyear(40);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundFloor();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) 12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.weekOfWeekyear();
        long long15 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.Chronology chronology16 = property11.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property11.getFieldType();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T07:00:35.000+07:00");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T07:00:35.000+07:00");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T07:00:35.000+07:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-16917935L) + "'", long15 == (-16917935L));
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.parse("0");
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(0L, dateTimeZone5);
        mutableDateTime6.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology9 = mutableDateTime6.getChronology();
        int int10 = mutableDateTime6.getSecondOfMinute();
        mutableDateTime6.setMinuteOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(0L, dateTimeZone14);
        mutableDateTime15.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar18 = mutableDateTime15.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime15.copy();
        mutableDateTime15.setDayOfYear((int) (byte) 10);
        boolean boolean22 = mutableDateTime6.isBefore((org.joda.time.ReadableInstant) mutableDateTime15);
        int int23 = mutableDateTime15.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(0L, dateTimeZone25);
        mutableDateTime26.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology29 = mutableDateTime26.getChronology();
        org.joda.time.Chronology chronology30 = mutableDateTime26.getChronology();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(0L, dateTimeZone32);
        mutableDateTime33.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar36 = mutableDateTime33.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime33.copy();
        java.util.GregorianCalendar gregorianCalendar38 = mutableDateTime33.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(0L, dateTimeZone40);
        mutableDateTime41.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology44 = mutableDateTime41.getChronology();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime41.era();
        mutableDateTime41.setDayOfYear((int) (short) 100);
        int int48 = mutableDateTime41.getYearOfEra();
        boolean boolean49 = mutableDateTime41.isBeforeNow();
        java.util.Locale locale50 = null;
        java.util.Calendar calendar51 = mutableDateTime41.toCalendar(locale50);
        mutableDateTime33.setTime((org.joda.time.ReadableInstant) mutableDateTime41);
        org.joda.time.DateTimeZone dateTimeZone53 = mutableDateTime41.getZone();
        org.joda.time.MutableDateTime mutableDateTime54 = org.joda.time.MutableDateTime.now(dateTimeZone53);
        org.joda.time.DateTime dateTime55 = mutableDateTime26.toDateTime(dateTimeZone53);
        mutableDateTime15.setZone(dateTimeZone53);
        org.joda.time.DateTime dateTime57 = mutableDateTime3.toDateTime(dateTimeZone53);
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(10L, dateTimeZone53);
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(35L, dateTimeZone53);
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime59.dayOfYear();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(gregorianCalendar18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(gregorianCalendar36);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(gregorianCalendar38);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1970 + "'", int48 == 1970);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(calendar51);
        org.junit.Assert.assertEquals(calendar51.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(mutableDateTime54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(property60);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        int int6 = mutableDateTime2.getSecondOfMinute();
        int int7 = mutableDateTime2.getMinuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) 12);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(0L, dateTimeZone12);
        mutableDateTime13.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar16 = mutableDateTime13.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime13.copy();
        java.util.GregorianCalendar gregorianCalendar18 = mutableDateTime13.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(0L, dateTimeZone20);
        mutableDateTime21.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology24 = mutableDateTime21.getChronology();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime21.era();
        mutableDateTime21.setDayOfYear((int) (short) 100);
        int int28 = mutableDateTime21.getYearOfEra();
        boolean boolean29 = mutableDateTime21.isBeforeNow();
        java.util.Locale locale30 = null;
        java.util.Calendar calendar31 = mutableDateTime21.toCalendar(locale30);
        mutableDateTime13.setTime((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime21.getZone();
        mutableDateTime9.setZone(dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime2.toMutableDateTime(dateTimeZone33);
        mutableDateTime35.setMillisOfSecond((int) (byte) 1);
        boolean boolean38 = mutableDateTime35.isBeforeNow();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime35.monthOfYear();
        java.lang.String str40 = property39.getName();
        java.lang.String str41 = property39.getAsShortText();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime43 = property39.set("888");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"888\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 420 + "'", int7 == 420);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(gregorianCalendar16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(gregorianCalendar18);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1970 + "'", int28 == 1970);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(calendar31);
        org.junit.Assert.assertEquals(calendar31.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "monthOfYear" + "'", str40, "monthOfYear");
// flaky "7) test3068(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\u0e21\u0e04." + "'", str41, "\u0e21\u0e04.");
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTime dateTime4 = mutableDateTime2.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.copy();
        mutableDateTime8.addMillis(3);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.year();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.getMutableDateTime();
        org.joda.time.DurationField durationField8 = property6.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime9 = property6.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = property6.roundCeiling();
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime10.add(readableDuration11, (int) (byte) 10);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNull(durationField8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
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
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime2.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundFloor();
        boolean boolean16 = property14.isLeap();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        java.util.Date date3 = mutableDateTime2.toDate();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.era();
        boolean boolean6 = mutableDateTime2.isEqual(0L);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        java.lang.String str8 = property7.toString();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.addWrapField(25200012);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime10.toMutableDateTime();
        int int12 = mutableDateTime11.getMinuteOfHour();
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[secondOfMinute]" + "'", str8, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(0L, dateTimeZone5);
        mutableDateTime6.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology9 = mutableDateTime6.getChronology();
        int int10 = mutableDateTime6.getSecondOfMinute();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime6);
        java.util.Date date12 = mutableDateTime2.toDate();
        int int13 = mutableDateTime2.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, dateTimeZone15);
        mutableDateTime16.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology19 = mutableDateTime16.getChronology();
        int int20 = mutableDateTime16.getSecondOfMinute();
        mutableDateTime16.setMinuteOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(0L, dateTimeZone24);
        mutableDateTime25.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar28 = mutableDateTime25.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime25.copy();
        mutableDateTime25.setDayOfYear((int) (byte) 10);
        boolean boolean32 = mutableDateTime16.isBefore((org.joda.time.ReadableInstant) mutableDateTime25);
        int int33 = mutableDateTime25.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(0L, dateTimeZone35);
        mutableDateTime36.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology39 = mutableDateTime36.getChronology();
        org.joda.time.Chronology chronology40 = mutableDateTime36.getChronology();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(0L, dateTimeZone42);
        mutableDateTime43.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar46 = mutableDateTime43.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime43.copy();
        java.util.GregorianCalendar gregorianCalendar48 = mutableDateTime43.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(0L, dateTimeZone50);
        mutableDateTime51.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology54 = mutableDateTime51.getChronology();
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime51.era();
        mutableDateTime51.setDayOfYear((int) (short) 100);
        int int58 = mutableDateTime51.getYearOfEra();
        boolean boolean59 = mutableDateTime51.isBeforeNow();
        java.util.Locale locale60 = null;
        java.util.Calendar calendar61 = mutableDateTime51.toCalendar(locale60);
        mutableDateTime43.setTime((org.joda.time.ReadableInstant) mutableDateTime51);
        org.joda.time.DateTimeZone dateTimeZone63 = mutableDateTime51.getZone();
        org.joda.time.MutableDateTime mutableDateTime64 = org.joda.time.MutableDateTime.now(dateTimeZone63);
        org.joda.time.DateTime dateTime65 = mutableDateTime36.toDateTime(dateTimeZone63);
        mutableDateTime25.setZone(dateTimeZone63);
        boolean boolean67 = mutableDateTime2.equals((java.lang.Object) mutableDateTime25);
        org.joda.time.MutableDateTime.Property property68 = mutableDateTime2.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.MutableDateTime mutableDateTime71 = new org.joda.time.MutableDateTime(0L, dateTimeZone70);
        org.joda.time.MutableDateTime.Property property72 = mutableDateTime71.monthOfYear();
        org.joda.time.DateTime dateTime73 = mutableDateTime71.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime74 = mutableDateTime71.copy();
        int int75 = property68.getDifference((org.joda.time.ReadableInstant) mutableDateTime71);
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime71);
        org.joda.time.MutableDateTime.Property property77 = mutableDateTime76.minuteOfHour();
        org.joda.time.Chronology chronology78 = property77.getChronology();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 07:00:35 ICT 1970");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(gregorianCalendar28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(gregorianCalendar46);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertNotNull(gregorianCalendar48);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1970 + "'", int58 == 1970);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(calendar61);
        org.junit.Assert.assertEquals(calendar61.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertNotNull(mutableDateTime64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(mutableDateTime74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertNotNull(chronology78);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.year();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.getMutableDateTime();
        org.joda.time.DurationField durationField8 = property6.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime9 = property6.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime11 = property6.set(25235000);
        org.joda.time.MutableDateTime mutableDateTime13 = property6.add((int) (short) 10);
        org.joda.time.MutableDateTime mutableDateTime14 = property6.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime15 = property6.roundHalfEven();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(0L, dateTimeZone17);
        mutableDateTime18.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology21 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime18.year();
        int int23 = property22.getMaximumValueOverall();
        java.lang.String str24 = property22.getAsString();
        org.joda.time.MutableDateTime mutableDateTime25 = property22.roundHalfCeiling();
        org.joda.time.Chronology chronology26 = mutableDateTime25.getChronology();
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime15.toMutableDateTime(chronology26);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(0L, dateTimeZone29);
        java.util.Date date31 = mutableDateTime30.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = null;
        boolean boolean33 = mutableDateTime30.isSupported(dateTimeFieldType32);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(0L, dateTimeZone36);
        mutableDateTime37.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology40 = mutableDateTime37.getChronology();
        org.joda.time.Chronology chronology41 = mutableDateTime37.getChronology();
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((long) ' ', chronology41);
        org.joda.time.DateTime dateTime43 = mutableDateTime30.toDateTime(chronology41);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(chronology41);
        int int45 = mutableDateTime44.getWeekOfWeekyear();
        int int46 = mutableDateTime44.getRoundingMode();
        java.lang.Object obj47 = mutableDateTime44.clone();
        boolean boolean48 = mutableDateTime44.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(0L, dateTimeZone50);
        mutableDateTime51.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar54 = mutableDateTime51.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime55 = mutableDateTime51.copy();
        int int56 = mutableDateTime55.getWeekyear();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime55.year();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(0L, dateTimeZone59);
        mutableDateTime60.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology63 = mutableDateTime60.getChronology();
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime60.era();
        mutableDateTime60.setDayOfYear((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime(0L, dateTimeZone68);
        java.util.Date date70 = mutableDateTime69.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = null;
        boolean boolean72 = mutableDateTime69.isSupported(dateTimeFieldType71);
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime(0L, dateTimeZone75);
        mutableDateTime76.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology79 = mutableDateTime76.getChronology();
        org.joda.time.Chronology chronology80 = mutableDateTime76.getChronology();
        org.joda.time.MutableDateTime mutableDateTime81 = new org.joda.time.MutableDateTime((long) ' ', chronology80);
        org.joda.time.DateTime dateTime82 = mutableDateTime69.toDateTime(chronology80);
        org.joda.time.MutableDateTime mutableDateTime83 = new org.joda.time.MutableDateTime(chronology80);
        mutableDateTime60.setChronology(chronology80);
        org.joda.time.DateTimeZone dateTimeZone86 = null;
        org.joda.time.MutableDateTime mutableDateTime87 = new org.joda.time.MutableDateTime(0L, dateTimeZone86);
        mutableDateTime87.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar90 = mutableDateTime87.toGregorianCalendar();
        mutableDateTime87.setSecondOfDay(10);
        int int93 = mutableDateTime87.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone94 = mutableDateTime87.getZone();
        org.joda.time.MutableDateTime mutableDateTime95 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime60, dateTimeZone94);
        org.joda.time.DateTime dateTime96 = mutableDateTime55.toDateTime(dateTimeZone94);
        org.joda.time.DateTime dateTime97 = mutableDateTime44.toDateTime(dateTimeZone94);
        mutableDateTime15.setZone(dateTimeZone94);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNull(durationField8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 292278993 + "'", int23 == 292278993);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970" + "'", str24, "1970");
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 40 + "'", int45 == 40);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(obj47);
// flaky "8) test3074(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals(obj47.toString(), "2026-09-28T14:48:48.375+07:00");
// flaky "2) test3074(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "2026-09-28T14:48:48.375+07:00");
// flaky "2) test3074(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "2026-09-28T14:48:48.375+07:00");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(gregorianCalendar54);
        org.junit.Assert.assertNotNull(mutableDateTime55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1970 + "'", int56 == 1970);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(chronology79);
        org.junit.Assert.assertNotNull(chronology80);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(gregorianCalendar90);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 1 + "'", int93 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone94);
        org.junit.Assert.assertNotNull(dateTime96);
        org.junit.Assert.assertNotNull(dateTime97);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTime dateTime4 = mutableDateTime2.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.copy();
        int int6 = mutableDateTime2.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(0L, dateTimeZone8);
        mutableDateTime9.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology12 = mutableDateTime9.getChronology();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        boolean boolean14 = mutableDateTime9.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(0L, dateTimeZone17);
        mutableDateTime18.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology21 = mutableDateTime18.getChronology();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) ' ', chronology22);
        org.joda.time.DateTime dateTime24 = mutableDateTime9.toDateTime(chronology22);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime24);
        boolean boolean26 = mutableDateTime2.isAfterNow();
        mutableDateTime2.addMinutes((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(0L, dateTimeZone30);
        mutableDateTime31.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar34 = mutableDateTime31.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime31.copy();
        int int36 = mutableDateTime35.getWeekyear();
        mutableDateTime35.addWeeks((int) (short) 100);
        int int39 = mutableDateTime35.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime35.dayOfWeek();
        int int41 = mutableDateTime35.getDayOfMonth();
        boolean boolean42 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime35);
        int int43 = mutableDateTime35.getYearOfEra();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(gregorianCalendar34);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1970 + "'", int36 == 1970);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 12 + "'", int39 == 12);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1971 + "'", int43 == 1971);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        boolean boolean7 = mutableDateTime2.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(0L, dateTimeZone10);
        mutableDateTime11.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology14 = mutableDateTime11.getChronology();
        org.joda.time.Chronology chronology15 = mutableDateTime11.getChronology();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) ' ', chronology15);
        org.joda.time.DateTime dateTime17 = mutableDateTime2.toDateTime(chronology15);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime2.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundHalfFloor();
        int int20 = mutableDateTime19.getYearOfEra();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.weekOfWeekyear();
        boolean boolean23 = mutableDateTime19.isAfter(0L);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(0L, dateTimeZone5);
        mutableDateTime6.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology9 = mutableDateTime6.getChronology();
        int int10 = mutableDateTime6.getSecondOfMinute();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.Chronology chronology12 = mutableDateTime6.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(chronology12);
        int int14 = mutableDateTime13.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, dateTimeZone16);
        mutableDateTime17.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology20 = mutableDateTime17.getChronology();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.year();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.getMutableDateTime();
        org.joda.time.DurationField durationField23 = property21.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime24 = property21.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime26 = property21.set(25235000);
        org.joda.time.MutableDateTime mutableDateTime28 = property21.add((int) (short) 10);
        org.joda.time.Interval interval29 = property21.toInterval();
        org.joda.time.MutableDateTime mutableDateTime31 = property21.addWrapField((int) (byte) 10);
        int int32 = mutableDateTime31.getMinuteOfHour();
        mutableDateTime13.setMillis((org.joda.time.ReadableInstant) mutableDateTime31);
        int int34 = mutableDateTime31.getDayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime31.setDayOfMonth((int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(chronology12);
// flaky "9) test3077(org.joda.time.RegressionTest6)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 421 + "'", int14 == 421);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNull(durationField23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
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
        mutableDateTime2.addMillis(1422);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.weekyear();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime2.secondOfMinute();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        mutableDateTime2.addMillis((-1));
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.add((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(0L, dateTimeZone12);
        mutableDateTime13.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology16 = mutableDateTime13.getChronology();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime13.year();
        int int18 = property17.getMaximumValueOverall();
        java.lang.String str19 = property17.getAsString();
        org.joda.time.MutableDateTime mutableDateTime20 = property17.getMutableDateTime();
        long long21 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime20);
        mutableDateTime20.addWeeks((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime20.minuteOfDay();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 292278993 + "'", int18 == 292278993);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970" + "'", str19, "1970");
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.era();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.millisOfSecond();
        java.util.Locale locale8 = null;
        int int9 = property7.getMaximumShortTextLength(locale8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(0L, dateTimeZone11);
        mutableDateTime12.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology15 = mutableDateTime12.getChronology();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime12.year();
        int int17 = property16.getMaximumValueOverall();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property16.getFieldType();
        java.util.Locale locale19 = null;
        java.lang.String str20 = property16.getAsText(locale19);
        boolean boolean21 = property7.equals((java.lang.Object) property16);
        int int22 = property7.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(0L, dateTimeZone24);
        mutableDateTime25.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology28 = mutableDateTime25.getChronology();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime25.era();
        mutableDateTime25.setDayOfYear((int) (short) 100);
        int int32 = mutableDateTime25.getYearOfEra();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime25.yearOfCentury();
        int int34 = property33.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime35 = property33.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime36 = mutableDateTime35.toMutableDateTimeISO();
        mutableDateTime35.setHourOfDay(12);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime35.yearOfCentury();
        boolean boolean40 = property7.equals((java.lang.Object) mutableDateTime35);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 292278993 + "'", int17 == 292278993);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970" + "'", str20, "1970");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1970 + "'", int32 == 1970);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(0L, dateTimeZone5);
        mutableDateTime6.setSecondOfMinute((int) '#');
        boolean boolean9 = mutableDateTime2.equals((java.lang.Object) '#');
        org.joda.time.DateTimeField dateTimeField10 = null;
        mutableDateTime2.setRounding(dateTimeField10, 25235000);
        boolean boolean13 = mutableDateTime2.isEqualNow();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime2.era();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime2.weekyear();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(0L, dateTimeZone19);
        mutableDateTime20.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar23 = mutableDateTime20.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime20.copy();
        int int25 = mutableDateTime24.getWeekyear();
        mutableDateTime24.addWeeks((int) (short) 100);
        int int28 = mutableDateTime24.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.dayOfWeek();
        int int30 = mutableDateTime24.getDayOfMonth();
        int int31 = mutableDateTime24.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(0L, dateTimeZone33);
        mutableDateTime34.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology37 = mutableDateTime34.getChronology();
        int int38 = mutableDateTime34.getSecondOfMinute();
        int int39 = mutableDateTime34.getMinuteOfDay();
        int int40 = mutableDateTime34.getHourOfDay();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime34.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = mutableDateTime34.toDateTime(dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(0L, dateTimeZone45);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime46.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(0L, dateTimeZone49);
        mutableDateTime50.setSecondOfMinute((int) '#');
        boolean boolean53 = mutableDateTime46.equals((java.lang.Object) '#');
        org.joda.time.DateTimeField dateTimeField54 = null;
        mutableDateTime46.setRounding(dateTimeField54, 25235000);
        boolean boolean57 = mutableDateTime46.isEqualNow();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime46.era();
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime46.era();
        java.util.Date date60 = mutableDateTime46.toDate();
        int int61 = mutableDateTime46.getHourOfDay();
        boolean boolean63 = mutableDateTime46.isEqual((-1L));
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(0L, dateTimeZone65);
        mutableDateTime66.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology69 = mutableDateTime66.getChronology();
        int int70 = mutableDateTime66.getSecondOfMinute();
        int int71 = mutableDateTime66.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.MutableDateTime mutableDateTime74 = new org.joda.time.MutableDateTime(0L, dateTimeZone73);
        mutableDateTime74.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar77 = mutableDateTime74.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime78 = mutableDateTime74.copy();
        org.joda.time.MutableDateTime.Property property79 = mutableDateTime74.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime80 = property79.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime82 = property79.addWrapField((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType83 = property79.getFieldType();
        mutableDateTime66.set(dateTimeFieldType83, (int) (short) 1);
        org.joda.time.MutableDateTime.Property property86 = mutableDateTime46.property(dateTimeFieldType83);
        org.joda.time.MutableDateTime.Property property87 = mutableDateTime34.property(dateTimeFieldType83);
        org.joda.time.MutableDateTime.Property property88 = mutableDateTime24.property(dateTimeFieldType83);
        mutableDateTime17.set(dateTimeFieldType83, 47);
        org.joda.time.MutableDateTime.Property property91 = mutableDateTime17.secondOfDay();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(gregorianCalendar23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1970 + "'", int25 == 1970);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 12 + "'", int28 == 12);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 7 + "'", int31 == 7);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 420 + "'", int39 == 420);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 7 + "'", int40 == 7);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 7 + "'", int61 == 7);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 35 + "'", int70 == 35);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 420 + "'", int71 == 420);
        org.junit.Assert.assertNotNull(gregorianCalendar77);
        org.junit.Assert.assertNotNull(mutableDateTime78);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertNotNull(mutableDateTime80);
        org.junit.Assert.assertNotNull(mutableDateTime82);
        org.junit.Assert.assertNotNull(dateTimeFieldType83);
        org.junit.Assert.assertNotNull(property86);
        org.junit.Assert.assertNotNull(property87);
        org.junit.Assert.assertNotNull(property88);
        org.junit.Assert.assertNotNull(property91);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
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
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology13);
        int int17 = mutableDateTime16.getWeekOfWeekyear();
        int int18 = mutableDateTime16.getRoundingMode();
        java.lang.Object obj19 = mutableDateTime16.clone();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime16.toMutableDateTimeISO();
        java.util.Date date21 = mutableDateTime20.toDate();
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 40 + "'", int17 == 40);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
// flaky "10) test3082(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals(obj19.toString(), "2026-09-28T14:48:48.471+07:00");
// flaky "3) test3082(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "2026-09-28T14:48:48.471+07:00");
// flaky "3) test3082(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "2026-09-28T14:48:48.471+07:00");
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(date21);
// flaky "1) test3082(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals(date21.toString(), "Mon Sep 28 14:48:48 ICT 2026");
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.era();
        int int7 = mutableDateTime2.getMillisOfDay();
        mutableDateTime2.add((long) 19);
        int int10 = mutableDateTime2.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.year();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime2.add(readablePeriod13, (int) (short) 100);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 25235000 + "'", int7 == 25235000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        mutableDateTime2.setDayOfYear((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(0L, dateTimeZone10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.monthOfYear();
        java.util.Locale locale14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = property12.set("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21", locale14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(0L, dateTimeZone17);
        mutableDateTime18.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology21 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime18.year();
        int int23 = property22.getMaximumValueOverall();
        java.lang.String str24 = property22.getAsText();
        org.joda.time.DurationField durationField25 = property22.getLeapDurationField();
        org.joda.time.MutableDateTime mutableDateTime26 = property22.roundHalfFloor();
        mutableDateTime26.setYear(10);
        boolean boolean29 = mutableDateTime15.isBefore((org.joda.time.ReadableInstant) mutableDateTime26);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(0L, dateTimeZone31);
        mutableDateTime32.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar35 = mutableDateTime32.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime36 = mutableDateTime32.copy();
        int int37 = mutableDateTime36.getWeekyear();
        mutableDateTime36.addWeeks((int) (short) 100);
        mutableDateTime36.addMonths((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(0L, dateTimeZone43);
        mutableDateTime44.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology47 = mutableDateTime44.getChronology();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime44.year();
        int int49 = property48.getMaximumValueOverall();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = property48.getFieldType();
        int int51 = mutableDateTime36.get(dateTimeFieldType50);
        mutableDateTime15.setMillis((org.joda.time.ReadableInstant) mutableDateTime36);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime15.dayOfMonth();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime15);
        int int55 = mutableDateTime15.getMillisOfDay();
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime15.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime58 = property56.add(53310496);
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 292278993 + "'", int23 == 292278993);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970" + "'", str24, "1970");
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(gregorianCalendar35);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1970 + "'", int37 == 1970);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 292278993 + "'", int49 == 292278993);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1980 + "'", int51 == 1980);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 25235000 + "'", int55 == 25235000);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(mutableDateTime58);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.yearOfEra();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.weekOfWeekyear();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime0.era();
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime0.add(readableDuration4);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        mutableDateTime2.setSecondOfDay(10);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.monthOfYear();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.year();
        int int7 = property6.getMaximumValueOverall();
        java.lang.String str8 = property6.getAsString();
        int int9 = property6.getMaximumValue();
        org.joda.time.Interval interval10 = property6.toInterval();
        org.joda.time.MutableDateTime mutableDateTime12 = property6.set(1870);
        int int13 = property6.getMaximumValueOverall();
        java.lang.String str14 = property6.getName();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 292278993 + "'", int7 == 292278993);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970" + "'", str8, "1970");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 292278993 + "'", int9 == 292278993);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 292278993 + "'", int13 == 292278993);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "year" + "'", str14, "year");
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(0L, dateTimeZone8);
        mutableDateTime9.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar12 = mutableDateTime9.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime9.copy();
        java.util.GregorianCalendar gregorianCalendar14 = mutableDateTime9.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, dateTimeZone16);
        mutableDateTime17.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology20 = mutableDateTime17.getChronology();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.era();
        mutableDateTime17.setDayOfYear((int) (short) 100);
        int int24 = mutableDateTime17.getYearOfEra();
        boolean boolean25 = mutableDateTime17.isBeforeNow();
        java.util.Locale locale26 = null;
        java.util.Calendar calendar27 = mutableDateTime17.toCalendar(locale26);
        mutableDateTime9.setTime((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime17.getZone();
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(dateTimeZone29);
        org.joda.time.DateTime dateTime31 = mutableDateTime2.toDateTime(dateTimeZone29);
        mutableDateTime2.setMillisOfDay(25235);
        java.util.Date date34 = mutableDateTime2.toDate();
        int int35 = mutableDateTime2.getYearOfCentury();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(gregorianCalendar12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(gregorianCalendar14);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1970 + "'", int24 == 1970);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(calendar27);
        org.junit.Assert.assertEquals(calendar27.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:25 ICT 1970");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 70 + "'", int35 == 70);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
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
        int int16 = mutableDateTime2.getMillisOfSecond();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime2.yearOfEra();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime2.centuryOfEra();
        java.lang.Object obj19 = mutableDateTime2.clone();
        mutableDateTime2.setMillis(1L);
        org.joda.time.ReadableDuration readableDuration22 = null;
        mutableDateTime2.add(readableDuration22, 2026);
        mutableDateTime2.addHours(53275119);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "1970-01-01T07:00:00.000+07:00");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "1970-01-01T07:00:00.000+07:00");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "1970-01-01T07:00:00.000+07:00");
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
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
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology13);
        int int17 = mutableDateTime16.getWeekOfWeekyear();
        int int18 = mutableDateTime16.getRoundingMode();
        java.lang.Object obj19 = mutableDateTime16.clone();
        int int20 = mutableDateTime16.getYearOfEra();
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 40 + "'", int17 == 40);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
// flaky "11) test3090(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals(obj19.toString(), "2026-09-28T14:48:48.532+07:00");
// flaky "4) test3090(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "2026-09-28T14:48:48.532+07:00");
// flaky "4) test3090(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "2026-09-28T14:48:48.532+07:00");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2026 + "'", int20 == 2026);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        int int7 = mutableDateTime6.getWeekyear();
        mutableDateTime6.addWeeks((int) (short) 100);
        int int10 = mutableDateTime6.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.dayOfWeek();
        int int12 = mutableDateTime6.getMinuteOfHour();
        mutableDateTime6.setMillisOfSecond(127);
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1970 + "'", int7 == 1970);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        java.util.Date date3 = mutableDateTime2.toDate();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.era();
        boolean boolean6 = mutableDateTime2.isEqual(0L);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        boolean boolean8 = mutableDateTime2.isBeforeNow();
        mutableDateTime2.setMillisOfSecond(3);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.secondOfDay();
        mutableDateTime2.setMillisOfSecond(502);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.addWrapField((int) (byte) 0);
        int int11 = mutableDateTime10.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(0L, dateTimeZone13);
        mutableDateTime14.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar17 = mutableDateTime14.toGregorianCalendar();
        mutableDateTime14.setTime(100L);
        boolean boolean20 = mutableDateTime10.isBefore((org.joda.time.ReadableInstant) mutableDateTime14);
        mutableDateTime10.setSecondOfMinute((int) '#');
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(0L, dateTimeZone24);
        mutableDateTime25.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology28 = mutableDateTime25.getChronology();
        int int29 = mutableDateTime25.getSecondOfMinute();
        mutableDateTime25.setMinuteOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(0L, dateTimeZone33);
        mutableDateTime34.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar37 = mutableDateTime34.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime34.copy();
        mutableDateTime34.setDayOfYear((int) (byte) 10);
        boolean boolean41 = mutableDateTime25.isBefore((org.joda.time.ReadableInstant) mutableDateTime34);
        org.joda.time.MutableDateTime mutableDateTime42 = mutableDateTime34.copy();
        int int43 = mutableDateTime10.compareTo((org.joda.time.ReadableInstant) mutableDateTime34);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(0L, dateTimeZone45);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime46.monthOfYear();
        org.joda.time.DateTime dateTime48 = mutableDateTime46.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime46.copy();
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime46.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(0L, dateTimeZone52);
        mutableDateTime53.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology56 = mutableDateTime53.getChronology();
        org.joda.time.Chronology chronology57 = mutableDateTime53.getChronology();
        boolean boolean58 = mutableDateTime53.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(0L, dateTimeZone61);
        mutableDateTime62.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology65 = mutableDateTime62.getChronology();
        org.joda.time.Chronology chronology66 = mutableDateTime62.getChronology();
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime((long) ' ', chronology66);
        org.joda.time.DateTime dateTime68 = mutableDateTime53.toDateTime(chronology66);
        mutableDateTime46.setChronology(chronology66);
        mutableDateTime10.setMillis((org.joda.time.ReadableInstant) mutableDateTime46);
        org.joda.time.MutableDateTime.Property property71 = mutableDateTime46.year();
        java.lang.String str72 = mutableDateTime46.toString();
        mutableDateTime46.addWeeks(2004);
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertNotNull(gregorianCalendar17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertNotNull(gregorianCalendar37);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(mutableDateTime49);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "1970-01-01T07:00:00.000+07:00" + "'", str72, "1970-01-01T07:00:00.000+07:00");
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        int int6 = mutableDateTime2.getSecondOfMinute();
        boolean boolean7 = mutableDateTime2.isEqualNow();
        mutableDateTime2.setYear((int) '#');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(0L, dateTimeZone11);
        mutableDateTime12.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology15 = mutableDateTime12.getChronology();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime12.era();
        mutableDateTime12.setDayOfYear((int) (short) 100);
        int int19 = mutableDateTime12.getYearOfEra();
        boolean boolean20 = mutableDateTime12.isBeforeNow();
        java.util.Locale locale21 = null;
        java.util.Calendar calendar22 = mutableDateTime12.toCalendar(locale21);
        boolean boolean23 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime12.add(readablePeriod24, 0);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime12.dayOfYear();
        mutableDateTime12.setSecondOfDay(1422);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(calendar22);
        org.junit.Assert.assertEquals(calendar22.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(property27);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.era();
        mutableDateTime2.setDayOfYear((int) (short) 100);
        int int9 = mutableDateTime2.getYearOfEra();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.era();
        int int11 = mutableDateTime2.getCenturyOfEra();
        mutableDateTime2.addDays(1970);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, dateTimeZone15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.monthOfYear();
        org.joda.time.DateTime dateTime18 = mutableDateTime16.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime16.copy();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(0L, dateTimeZone21);
        mutableDateTime22.setSecondOfMinute((int) '#');
        java.lang.Object obj25 = mutableDateTime22.clone();
        mutableDateTime22.setWeekyear(40);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime22.getZone();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime16.toMutableDateTime(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, dateTimeZone28);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.minuteOfHour();
        int int32 = mutableDateTime30.getSecondOfMinute();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 19 + "'", int11 == 19);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "1970-01-01T07:00:35.000+07:00");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "1970-01-01T07:00:35.000+07:00");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "1970-01-01T07:00:35.000+07:00");
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(0L, dateTimeZone2);
        mutableDateTime3.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime3.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime3.copy();
        int int8 = mutableDateTime7.getWeekyear();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime7.year();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(0L, dateTimeZone11);
        mutableDateTime12.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology15 = mutableDateTime12.getChronology();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime12.era();
        mutableDateTime12.setDayOfYear((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(0L, dateTimeZone20);
        java.util.Date date22 = mutableDateTime21.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        boolean boolean24 = mutableDateTime21.isSupported(dateTimeFieldType23);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(0L, dateTimeZone27);
        mutableDateTime28.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology31 = mutableDateTime28.getChronology();
        org.joda.time.Chronology chronology32 = mutableDateTime28.getChronology();
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) ' ', chronology32);
        org.joda.time.DateTime dateTime34 = mutableDateTime21.toDateTime(chronology32);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(chronology32);
        mutableDateTime12.setChronology(chronology32);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(0L, dateTimeZone38);
        mutableDateTime39.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar42 = mutableDateTime39.toGregorianCalendar();
        mutableDateTime39.setSecondOfDay(10);
        int int45 = mutableDateTime39.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone46 = mutableDateTime39.getZone();
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime12, dateTimeZone46);
        org.joda.time.DateTime dateTime48 = mutableDateTime7.toDateTime(dateTimeZone46);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(0L, dateTimeZone50);
        java.util.Date date52 = mutableDateTime51.toDate();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime51.era();
        boolean boolean55 = mutableDateTime51.isEqual(0L);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime51.secondOfMinute();
        boolean boolean57 = mutableDateTime51.isBeforeNow();
        mutableDateTime51.setMillisOfSecond(3);
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime51.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone61 = mutableDateTime51.getZone();
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime7, dateTimeZone61);
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime((long) 2922789, dateTimeZone61);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(gregorianCalendar42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(dateTimeZone61);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.set(40);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.weekOfWeekyear();
        long long12 = mutableDateTime10.getMillis();
        mutableDateTime10.setMillisOfDay(1997);
        org.joda.time.ReadableInstant readableInstant15 = null;
        mutableDateTime10.setDate(readableInstant15);
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2400000L + "'", long12 == 2400000L);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(0L, dateTimeZone5);
        mutableDateTime6.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology9 = mutableDateTime6.getChronology();
        int int10 = mutableDateTime6.getSecondOfMinute();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime6);
        java.util.Date date12 = mutableDateTime2.toDate();
        mutableDateTime2.setYear((int) '4');
        java.util.GregorianCalendar gregorianCalendar15 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.millisOfSecond();
        java.lang.String str17 = property16.toString();
        long long18 = property16.remainder();
        java.lang.String str19 = property16.getName();
        java.lang.String str20 = property16.getAsShortText();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(0L, dateTimeZone22);
        mutableDateTime23.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar26 = mutableDateTime23.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime23.copy();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime31 = property28.addWrapField((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime31.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime33 = property32.roundHalfFloor();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(0L, dateTimeZone35);
        mutableDateTime36.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar39 = mutableDateTime36.toGregorianCalendar();
        boolean boolean40 = mutableDateTime36.isAfterNow();
        mutableDateTime33.setMillis((org.joda.time.ReadableInstant) mutableDateTime36);
        mutableDateTime33.addMillis((int) '#');
        mutableDateTime33.addSeconds(0);
        long long46 = property16.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime33);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime33.year();
        int int48 = mutableDateTime33.getDayOfMonth();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 07:00:35 ICT 1970");
        org.junit.Assert.assertNotNull(gregorianCalendar15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Property[millisOfSecond]" + "'", str17, "Property[millisOfSecond]");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "millisOfSecond" + "'", str19, "millisOfSecond");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
        org.junit.Assert.assertNotNull(gregorianCalendar26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(gregorianCalendar39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-60526222924035L) + "'", long46 == (-60526222924035L));
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
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
        mutableDateTime2.addYears((int) ' ');
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime2.minuteOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property25.getFieldType();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(calendar20);
        org.junit.Assert.assertEquals(calendar20.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.weekyear();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.add((int) (short) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(0L, dateTimeZone12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, dateTimeZone16);
        mutableDateTime17.setSecondOfMinute((int) '#');
        boolean boolean20 = mutableDateTime13.equals((java.lang.Object) '#');
        org.joda.time.DateTimeField dateTimeField21 = null;
        mutableDateTime13.setRounding(dateTimeField21, 25235000);
        boolean boolean24 = mutableDateTime13.isEqualNow();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime13.era();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime13.weekyear();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime13.hourOfDay();
        long long28 = property27.getMillis();
        org.joda.time.DateTimeField dateTimeField29 = property27.getField();
        org.joda.time.MutableDateTime.Property property30 = new org.joda.time.MutableDateTime.Property(mutableDateTime8, dateTimeField29);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2070-01-02T07:00:35.000+07:00" + "'", str10, "2070-01-02T07:00:35.000+07:00");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField29);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.lang.Object obj5 = mutableDateTime2.clone();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.roundHalfFloor();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(0L, dateTimeZone10);
        mutableDateTime11.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology14 = mutableDateTime11.getChronology();
        org.joda.time.Chronology chronology15 = mutableDateTime11.getChronology();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) ' ', chronology15);
        mutableDateTime16.setMinuteOfDay(420);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime16.toMutableDateTimeISO();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime16.add(readablePeriod20, (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(0L, dateTimeZone24);
        mutableDateTime25.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar28 = mutableDateTime25.toGregorianCalendar();
        boolean boolean29 = mutableDateTime25.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(0L, dateTimeZone31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime32.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(0L, dateTimeZone35);
        mutableDateTime36.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology39 = mutableDateTime36.getChronology();
        int int40 = mutableDateTime36.getSecondOfMinute();
        mutableDateTime32.setTime((org.joda.time.ReadableInstant) mutableDateTime36);
        int int42 = mutableDateTime32.getYear();
        int int43 = mutableDateTime32.getHourOfDay();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime32.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(0L, dateTimeZone46);
        mutableDateTime47.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology50 = mutableDateTime47.getChronology();
        org.joda.time.Chronology chronology51 = mutableDateTime47.getChronology();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(0L, dateTimeZone53);
        mutableDateTime54.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar57 = mutableDateTime54.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime58 = mutableDateTime54.copy();
        java.util.GregorianCalendar gregorianCalendar59 = mutableDateTime54.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(0L, dateTimeZone61);
        mutableDateTime62.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology65 = mutableDateTime62.getChronology();
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime62.era();
        mutableDateTime62.setDayOfYear((int) (short) 100);
        int int69 = mutableDateTime62.getYearOfEra();
        boolean boolean70 = mutableDateTime62.isBeforeNow();
        java.util.Locale locale71 = null;
        java.util.Calendar calendar72 = mutableDateTime62.toCalendar(locale71);
        mutableDateTime54.setTime((org.joda.time.ReadableInstant) mutableDateTime62);
        org.joda.time.DateTimeZone dateTimeZone74 = mutableDateTime62.getZone();
        org.joda.time.MutableDateTime mutableDateTime75 = org.joda.time.MutableDateTime.now(dateTimeZone74);
        org.joda.time.DateTime dateTime76 = mutableDateTime47.toDateTime(dateTimeZone74);
        org.joda.time.MutableDateTime mutableDateTime77 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime32, dateTimeZone74);
        org.joda.time.DateTimeZone dateTimeZone79 = null;
        org.joda.time.MutableDateTime mutableDateTime80 = new org.joda.time.MutableDateTime(0L, dateTimeZone79);
        org.joda.time.MutableDateTime.Property property81 = mutableDateTime80.monthOfYear();
        long long82 = property81.remainder();
        org.joda.time.MutableDateTime mutableDateTime83 = property81.roundFloor();
        org.joda.time.DateTimeField dateTimeField84 = property81.getField();
        mutableDateTime77.setRounding(dateTimeField84, 2);
        int int87 = mutableDateTime25.get(dateTimeField84);
        int int88 = mutableDateTime16.get(dateTimeField84);
        int int89 = mutableDateTime7.get(dateTimeField84);
        int int90 = mutableDateTime7.getYear();
        org.joda.time.MutableDateTime.Property property91 = mutableDateTime7.centuryOfEra();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T07:00:35.000+07:00");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T07:00:35.000+07:00");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T07:00:35.000+07:00");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(gregorianCalendar28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1970 + "'", int42 == 1970);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 7 + "'", int43 == 7);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(gregorianCalendar57);
        org.junit.Assert.assertNotNull(mutableDateTime58);
        org.junit.Assert.assertNotNull(gregorianCalendar59);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1970 + "'", int69 == 1970);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(calendar72);
        org.junit.Assert.assertEquals(calendar72.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone74);
        org.junit.Assert.assertNotNull(mutableDateTime75);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(property81);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 25200000L + "'", long82 == 25200000L);
        org.junit.Assert.assertNotNull(mutableDateTime83);
        org.junit.Assert.assertNotNull(dateTimeField84);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1 + "'", int89 == 1);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1970 + "'", int90 == 1970);
        org.junit.Assert.assertNotNull(property91);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.era();
        mutableDateTime2.setDayOfYear((int) (short) 100);
        int int9 = mutableDateTime2.getYearOfEra();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.era();
        int int11 = mutableDateTime2.getCenturyOfEra();
        mutableDateTime2.addDays(1970);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime2.toMutableDateTime(dateTimeZone15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime2.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime19 = property17.set(25140);
        org.joda.time.MutableDateTime mutableDateTime21 = property17.add((long) 2026);
        long long22 = mutableDateTime21.getMillis();
        int int23 = mutableDateTime21.getDayOfYear();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime21.era();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 19 + "'", int11 == 19);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 178736427166L + "'", long22 == 178736427166L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 244 + "'", int23 == 244);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
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
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime10.getZone();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(0L, dateTimeZone24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime25.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(0L, dateTimeZone28);
        mutableDateTime29.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology32 = mutableDateTime29.getChronology();
        int int33 = mutableDateTime29.getSecondOfMinute();
        mutableDateTime25.setTime((org.joda.time.ReadableInstant) mutableDateTime29);
        mutableDateTime25.setSecondOfMinute((int) (short) 0);
        mutableDateTime25.addYears((int) '#');
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(0L, dateTimeZone40);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime41.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(0L, dateTimeZone44);
        mutableDateTime45.setSecondOfMinute((int) '#');
        boolean boolean48 = mutableDateTime41.equals((java.lang.Object) '#');
        boolean boolean49 = mutableDateTime25.isAfter((org.joda.time.ReadableInstant) mutableDateTime41);
        boolean boolean50 = mutableDateTime10.isBefore((org.joda.time.ReadableInstant) mutableDateTime41);
        mutableDateTime41.addMillis(25252000);
        boolean boolean53 = mutableDateTime41.isEqualNow();
        java.util.Date date54 = mutableDateTime41.toDate();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(calendar20);
        org.junit.Assert.assertEquals(calendar20.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 14:00:52 ICT 1970");
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(0L, dateTimeZone10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.monthOfYear();
        org.joda.time.DateTime dateTime13 = mutableDateTime11.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime11.copy();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime11.toMutableDateTime();
        mutableDateTime11.addMonths(35);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(0L, dateTimeZone19);
        mutableDateTime20.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar23 = mutableDateTime20.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime20.copy();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime26 = property25.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime28 = property25.addWrapField((int) '#');
        org.joda.time.MutableDateTime mutableDateTime30 = property25.add(4);
        int int31 = property25.getMinimumValue();
        java.lang.String str32 = property25.getName();
        org.joda.time.MutableDateTime mutableDateTime34 = property25.add(0L);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(0L, dateTimeZone36);
        java.util.Date date38 = mutableDateTime37.toDate();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime37.era();
        boolean boolean41 = mutableDateTime37.isEqual(0L);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime37.secondOfMinute();
        int int43 = property25.compareTo((org.joda.time.ReadableInstant) mutableDateTime37);
        boolean boolean44 = mutableDateTime11.equals((java.lang.Object) property25);
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime11.copy();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(0L, dateTimeZone47);
        java.util.Date date49 = mutableDateTime48.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = null;
        boolean boolean51 = mutableDateTime48.isSupported(dateTimeFieldType50);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(0L, dateTimeZone54);
        mutableDateTime55.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology58 = mutableDateTime55.getChronology();
        org.joda.time.Chronology chronology59 = mutableDateTime55.getChronology();
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime((long) ' ', chronology59);
        org.joda.time.DateTime dateTime61 = mutableDateTime48.toDateTime(chronology59);
        int int62 = mutableDateTime48.getMillisOfSecond();
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime48.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(0L, dateTimeZone65);
        mutableDateTime66.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology69 = mutableDateTime66.getChronology();
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime(chronology69);
        mutableDateTime70.addHours(2004);
        boolean boolean73 = property63.equals((java.lang.Object) mutableDateTime70);
        org.joda.time.MutableDateTime mutableDateTime74 = property63.roundFloor();
        org.joda.time.DateTimeField dateTimeField75 = property63.getField();
        org.joda.time.MutableDateTime.Property property76 = new org.joda.time.MutableDateTime.Property(mutableDateTime45, dateTimeField75);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime45);
        org.joda.time.MutableDateTime mutableDateTime78 = mutableDateTime45.toMutableDateTime();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(gregorianCalendar23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "minuteOfHour" + "'", str32, "minuteOfHour");
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(mutableDateTime74);
        org.junit.Assert.assertNotNull(dateTimeField75);
        org.junit.Assert.assertNotNull(mutableDateTime78);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        java.util.Locale locale4 = null;
        java.lang.String str5 = property3.getAsText(locale4);
        java.lang.String str6 = property3.toString();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(0L, dateTimeZone8);
        java.util.Date date10 = mutableDateTime9.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = mutableDateTime9.isSupported(dateTimeFieldType11);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, dateTimeZone15);
        mutableDateTime16.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology19 = mutableDateTime16.getChronology();
        org.joda.time.Chronology chronology20 = mutableDateTime16.getChronology();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) ' ', chronology20);
        org.joda.time.DateTime dateTime22 = mutableDateTime9.toDateTime(chronology20);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(chronology20);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(chronology20);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(0L, dateTimeZone27);
        mutableDateTime28.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology31 = mutableDateTime28.getChronology();
        org.joda.time.Chronology chronology32 = mutableDateTime28.getChronology();
        boolean boolean33 = mutableDateTime28.isEqualNow();
        mutableDateTime24.setTime((org.joda.time.ReadableInstant) mutableDateTime28);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime28.dayOfWeek();
        int int36 = property3.compareTo((org.joda.time.ReadableInstant) mutableDateTime28);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime28.minuteOfDay();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime28.secondOfMinute();
        org.joda.time.DurationField durationField39 = property38.getLeapDurationField();
        org.joda.time.MutableDateTime mutableDateTime40 = property38.getMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = mutableDateTime40.toString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21" + "'", str5, "\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Property[monthOfYear]" + "'", str6, "Property[monthOfYear]");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNull(durationField39);
        org.junit.Assert.assertNotNull(mutableDateTime40);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 12);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(0L, dateTimeZone3);
        java.util.Date date5 = mutableDateTime4.toDate();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.era();
        boolean boolean8 = mutableDateTime4.isEqual(0L);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(0L, dateTimeZone10);
        mutableDateTime11.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar14 = mutableDateTime11.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime11.copy();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(0L, dateTimeZone18);
        mutableDateTime19.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar22 = mutableDateTime19.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime19.copy();
        java.util.GregorianCalendar gregorianCalendar24 = mutableDateTime19.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(0L, dateTimeZone26);
        mutableDateTime27.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology30 = mutableDateTime27.getChronology();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime27.era();
        mutableDateTime27.setDayOfYear((int) (short) 100);
        int int34 = mutableDateTime27.getYearOfEra();
        boolean boolean35 = mutableDateTime27.isBeforeNow();
        java.util.Locale locale36 = null;
        java.util.Calendar calendar37 = mutableDateTime27.toCalendar(locale36);
        mutableDateTime19.setTime((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.DateTimeZone dateTimeZone39 = mutableDateTime27.getZone();
        org.joda.time.MutableDateTime mutableDateTime40 = org.joda.time.MutableDateTime.now(dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(0L, dateTimeZone42);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime43.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(0L, dateTimeZone46);
        mutableDateTime47.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology50 = mutableDateTime47.getChronology();
        org.joda.time.Chronology chronology51 = mutableDateTime47.getChronology();
        org.joda.time.DateTime dateTime52 = mutableDateTime43.toDateTime(chronology51);
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime40, chronology51);
        org.joda.time.DateTime dateTime54 = mutableDateTime11.toDateTime(chronology51);
        mutableDateTime4.setChronology(chronology51);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(0L, dateTimeZone58);
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime59.monthOfYear();
        org.joda.time.DateTime dateTime61 = mutableDateTime59.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime62 = mutableDateTime59.copy();
        org.joda.time.DateTimeField dateTimeField63 = mutableDateTime62.getRoundingField();
        int int64 = mutableDateTime62.getMinuteOfHour();
        int int65 = mutableDateTime62.getCenturyOfEra();
        mutableDateTime4.setTime((org.joda.time.ReadableInstant) mutableDateTime62);
        int int67 = mutableDateTime4.getWeekyear();
        int int68 = mutableDateTime4.getHourOfDay();
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(gregorianCalendar14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(gregorianCalendar22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(gregorianCalendar24);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1970 + "'", int34 == 1970);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(calendar37);
        org.junit.Assert.assertEquals(calendar37.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(mutableDateTime62);
        org.junit.Assert.assertNull(dateTimeField63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 19 + "'", int65 == 19);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1970 + "'", int67 == 1970);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 7 + "'", int68 == 7);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(0L, dateTimeZone5);
        mutableDateTime6.setSecondOfMinute((int) '#');
        boolean boolean9 = mutableDateTime2.equals((java.lang.Object) '#');
        org.joda.time.DateTimeField dateTimeField10 = null;
        mutableDateTime2.setRounding(dateTimeField10, 25235000);
        boolean boolean13 = mutableDateTime2.isEqualNow();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime2.era();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime2.era();
        java.util.Date date16 = mutableDateTime2.toDate();
        int int17 = mutableDateTime2.getHourOfDay();
        boolean boolean19 = mutableDateTime2.isEqual((-1L));
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(0L, dateTimeZone21);
        mutableDateTime22.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology25 = mutableDateTime22.getChronology();
        int int26 = mutableDateTime22.getSecondOfMinute();
        int int27 = mutableDateTime22.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(0L, dateTimeZone29);
        mutableDateTime30.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar33 = mutableDateTime30.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime30.copy();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime30.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime36 = property35.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime38 = property35.addWrapField((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = property35.getFieldType();
        mutableDateTime22.set(dateTimeFieldType39, (int) (short) 1);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime2.property(dateTimeFieldType39);
        org.joda.time.DurationField durationField43 = property42.getDurationField();
        java.util.Locale locale44 = null;
        int int45 = property42.getMaximumShortTextLength(locale44);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 420 + "'", int27 == 420);
        org.junit.Assert.assertNotNull(gregorianCalendar33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(0L, dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(0L, dateTimeZone7);
        mutableDateTime8.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology11 = mutableDateTime8.getChronology();
        int int12 = mutableDateTime8.getSecondOfMinute();
        mutableDateTime4.setTime((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.Chronology chronology14 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) 271, chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology14);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) 86399999, chronology14);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.era();
        int int7 = mutableDateTime2.getMillisOfDay();
        mutableDateTime2.add((long) 19);
        int int10 = mutableDateTime2.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = mutableDateTime2.toDateTime();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.centuryOfEra();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 25235000 + "'", int7 == 25235000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25235 + "'", int10 == 25235);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(0L, dateTimeZone5);
        mutableDateTime6.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology9 = mutableDateTime6.getChronology();
        int int10 = mutableDateTime6.getSecondOfMinute();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime6);
        mutableDateTime2.setSecondOfMinute((int) (short) 0);
        mutableDateTime2.addYears((int) '#');
        mutableDateTime2.setHourOfDay(10);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime2.secondOfMinute();
        java.util.Locale locale19 = null;
        java.lang.String str20 = property18.getAsShortText(locale19);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
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
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime11.copy();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime19.add(readablePeriod20, 59);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime19.yearOfCentury();
        mutableDateTime19.addWeekyears(25235000);
        java.util.Date date26 = mutableDateTime19.toDate();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(gregorianCalendar14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sat Jan 13 07:00:35 ICT 25236970");
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
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
        org.joda.time.MutableDateTime mutableDateTime32 = property7.roundCeiling();
        mutableDateTime32.setMillisOfSecond(0);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime32.centuryOfEra();
        int int36 = mutableDateTime32.getEra();
        mutableDateTime32.setWeekOfWeekyear(10);
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35000L + "'", long8 == 35000L);
        org.junit.Assert.assertNotNull(gregorianCalendar14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(gregorianCalendar16);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1970 + "'", int26 == 1970);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(calendar29);
        org.junit.Assert.assertEquals(calendar29.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
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
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(0L, dateTimeZone21);
        mutableDateTime22.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology25 = mutableDateTime22.getChronology();
        org.joda.time.Chronology chronology26 = mutableDateTime22.getChronology();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(0L, dateTimeZone28);
        mutableDateTime29.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar32 = mutableDateTime29.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime29.copy();
        java.util.GregorianCalendar gregorianCalendar34 = mutableDateTime29.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(0L, dateTimeZone36);
        mutableDateTime37.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology40 = mutableDateTime37.getChronology();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime37.era();
        mutableDateTime37.setDayOfYear((int) (short) 100);
        int int44 = mutableDateTime37.getYearOfEra();
        boolean boolean45 = mutableDateTime37.isBeforeNow();
        java.util.Locale locale46 = null;
        java.util.Calendar calendar47 = mutableDateTime37.toCalendar(locale46);
        mutableDateTime29.setTime((org.joda.time.ReadableInstant) mutableDateTime37);
        org.joda.time.DateTimeZone dateTimeZone49 = mutableDateTime37.getZone();
        org.joda.time.MutableDateTime mutableDateTime50 = org.joda.time.MutableDateTime.now(dateTimeZone49);
        org.joda.time.DateTime dateTime51 = mutableDateTime22.toDateTime(dateTimeZone49);
        mutableDateTime11.setZone(dateTimeZone49);
        org.joda.time.MutableDateTime mutableDateTime53 = org.joda.time.MutableDateTime.now(dateTimeZone49);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(gregorianCalendar14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(gregorianCalendar32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(gregorianCalendar34);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1970 + "'", int44 == 1970);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(calendar47);
        org.junit.Assert.assertEquals(calendar47.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(mutableDateTime53);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(0L, dateTimeZone5);
        mutableDateTime6.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology9 = mutableDateTime6.getChronology();
        int int10 = mutableDateTime6.getSecondOfMinute();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime6);
        java.util.Date date12 = mutableDateTime2.toDate();
        int int13 = mutableDateTime2.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, dateTimeZone15);
        mutableDateTime16.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology19 = mutableDateTime16.getChronology();
        int int20 = mutableDateTime16.getSecondOfMinute();
        mutableDateTime16.setMinuteOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(0L, dateTimeZone24);
        mutableDateTime25.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar28 = mutableDateTime25.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime25.copy();
        mutableDateTime25.setDayOfYear((int) (byte) 10);
        boolean boolean32 = mutableDateTime16.isBefore((org.joda.time.ReadableInstant) mutableDateTime25);
        int int33 = mutableDateTime25.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(0L, dateTimeZone35);
        mutableDateTime36.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology39 = mutableDateTime36.getChronology();
        org.joda.time.Chronology chronology40 = mutableDateTime36.getChronology();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(0L, dateTimeZone42);
        mutableDateTime43.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar46 = mutableDateTime43.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime43.copy();
        java.util.GregorianCalendar gregorianCalendar48 = mutableDateTime43.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(0L, dateTimeZone50);
        mutableDateTime51.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology54 = mutableDateTime51.getChronology();
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime51.era();
        mutableDateTime51.setDayOfYear((int) (short) 100);
        int int58 = mutableDateTime51.getYearOfEra();
        boolean boolean59 = mutableDateTime51.isBeforeNow();
        java.util.Locale locale60 = null;
        java.util.Calendar calendar61 = mutableDateTime51.toCalendar(locale60);
        mutableDateTime43.setTime((org.joda.time.ReadableInstant) mutableDateTime51);
        org.joda.time.DateTimeZone dateTimeZone63 = mutableDateTime51.getZone();
        org.joda.time.MutableDateTime mutableDateTime64 = org.joda.time.MutableDateTime.now(dateTimeZone63);
        org.joda.time.DateTime dateTime65 = mutableDateTime36.toDateTime(dateTimeZone63);
        mutableDateTime25.setZone(dateTimeZone63);
        boolean boolean67 = mutableDateTime2.equals((java.lang.Object) mutableDateTime25);
        org.joda.time.MutableDateTime.Property property68 = mutableDateTime2.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.MutableDateTime mutableDateTime71 = new org.joda.time.MutableDateTime(0L, dateTimeZone70);
        org.joda.time.MutableDateTime.Property property72 = mutableDateTime71.monthOfYear();
        org.joda.time.DateTime dateTime73 = mutableDateTime71.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime74 = mutableDateTime71.copy();
        int int75 = property68.getDifference((org.joda.time.ReadableInstant) mutableDateTime71);
        int int76 = mutableDateTime71.getMillisOfDay();
        org.joda.time.MutableDateTime.Property property77 = mutableDateTime71.millisOfSecond();
        org.joda.time.MutableDateTime.Property property78 = mutableDateTime71.minuteOfDay();
        org.joda.time.MutableDateTime.Property property79 = mutableDateTime71.secondOfDay();
        mutableDateTime71.add((long) 25235000);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 07:00:35 ICT 1970");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(gregorianCalendar28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(gregorianCalendar46);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertNotNull(gregorianCalendar48);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1970 + "'", int58 == 1970);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(calendar61);
        org.junit.Assert.assertEquals(calendar61.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertNotNull(mutableDateTime64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(mutableDateTime74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 25200000 + "'", int76 == 25200000);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertNotNull(property79);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
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
        org.joda.time.MutableDateTime mutableDateTime32 = property7.roundCeiling();
        int int33 = mutableDateTime32.getYearOfCentury();
        org.joda.time.DateTime dateTime34 = mutableDateTime32.toDateTime();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35000L + "'", long8 == 35000L);
        org.junit.Assert.assertNotNull(gregorianCalendar14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(gregorianCalendar16);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1970 + "'", int26 == 1970);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(calendar29);
        org.junit.Assert.assertEquals(calendar29.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 70 + "'", int33 == 70);
        org.junit.Assert.assertNotNull(dateTime34);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.era();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.set((int) (byte) 1);
        java.lang.String str9 = property6.getAsShortText();
        java.lang.String str10 = property6.getName();
        org.joda.time.DurationField durationField11 = property6.getLeapDurationField();
        int int12 = property6.getMaximumValue();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
// flaky "12) test3117(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u0e04\u0e28." + "'", str9, "\u0e04\u0e28.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "era" + "'", str10, "era");
        org.junit.Assert.assertNull(durationField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.addWrapField((int) '#');
        org.joda.time.MutableDateTime mutableDateTime12 = property7.add(4);
        int int13 = property7.getMinimumValue();
        java.lang.String str14 = property7.getName();
        org.joda.time.MutableDateTime mutableDateTime16 = property7.add(0L);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.era();
        int int18 = property17.getMinimumValue();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "minuteOfHour" + "'", str14, "minuteOfHour");
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
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
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology13);
        int int17 = mutableDateTime16.getWeekOfWeekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime16.toString(dateTimeFormatter18);
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime16.copy();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.secondOfDay();
        int int22 = mutableDateTime20.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(0L, dateTimeZone24);
        mutableDateTime25.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar28 = mutableDateTime25.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime25.copy();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime25.minuteOfHour();
        long long31 = property30.getMillis();
        java.util.Locale locale32 = null;
        java.lang.String str33 = property30.getAsShortText(locale32);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(0L, dateTimeZone35);
        mutableDateTime36.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar39 = mutableDateTime36.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime36.copy();
        boolean boolean42 = mutableDateTime36.isBefore((long) '#');
        mutableDateTime36.setDate((long) 40);
        int int45 = mutableDateTime36.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(0L, dateTimeZone47);
        mutableDateTime48.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology51 = mutableDateTime48.getChronology();
        int int52 = mutableDateTime48.getSecondOfMinute();
        mutableDateTime48.setMinuteOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(0L, dateTimeZone56);
        mutableDateTime57.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar60 = mutableDateTime57.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime61 = mutableDateTime57.copy();
        mutableDateTime57.setDayOfYear((int) (byte) 10);
        boolean boolean64 = mutableDateTime48.isBefore((org.joda.time.ReadableInstant) mutableDateTime57);
        boolean boolean65 = mutableDateTime48.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone66 = mutableDateTime48.getZone();
        mutableDateTime36.setZoneRetainFields(dateTimeZone66);
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime((java.lang.Object) str33, dateTimeZone66);
        boolean boolean69 = mutableDateTime20.isEqual((org.joda.time.ReadableInstant) mutableDateTime68);
        org.joda.time.MutableDateTime.Property property70 = mutableDateTime68.secondOfDay();
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 40 + "'", int17 == 40);
// flaky "13) test3119(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2026-09-28T14:48:48.848+07:00" + "'", str19, "2026-09-28T14:48:48.848+07:00");
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 271 + "'", int22 == 271);
        org.junit.Assert.assertNotNull(gregorianCalendar28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 35000L + "'", long31 == 35000L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0" + "'", str33, "0");
        org.junit.Assert.assertNotNull(gregorianCalendar39);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1970 + "'", int45 == 1970);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 35 + "'", int52 == 35);
        org.junit.Assert.assertNotNull(gregorianCalendar60);
        org.junit.Assert.assertNotNull(mutableDateTime61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(dateTimeZone66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(property70);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        mutableDateTime2.setSecondOfDay(10);
        int int8 = mutableDateTime2.getDayOfYear();
        org.joda.time.ReadableInstant readableInstant9 = null;
        mutableDateTime2.setTime(readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(0L, dateTimeZone12);
        mutableDateTime13.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology16 = mutableDateTime13.getChronology();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime13.era();
        int int18 = mutableDateTime13.getMillisOfDay();
        mutableDateTime13.add((long) 19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(0L, dateTimeZone22);
        mutableDateTime23.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar26 = mutableDateTime23.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime23.copy();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime31 = property28.addWrapField((int) (byte) 0);
        int int32 = mutableDateTime31.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(0L, dateTimeZone34);
        mutableDateTime35.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar38 = mutableDateTime35.toGregorianCalendar();
        mutableDateTime35.setTime(100L);
        boolean boolean41 = mutableDateTime31.isBefore((org.joda.time.ReadableInstant) mutableDateTime35);
        mutableDateTime13.setTime((org.joda.time.ReadableInstant) mutableDateTime31);
        mutableDateTime13.addMonths(2922789);
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime13.copy();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(0L, dateTimeZone47);
        mutableDateTime48.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar51 = mutableDateTime48.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime52 = mutableDateTime48.copy();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime48.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime54 = property53.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime56 = property53.addWrapField((int) (byte) 0);
        java.lang.String str57 = property53.getAsString();
        int int58 = property53.getMinimumValue();
        org.joda.time.MutableDateTime mutableDateTime59 = property53.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(0L, dateTimeZone61);
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime62.monthOfYear();
        long long64 = property63.remainder();
        org.joda.time.MutableDateTime mutableDateTime65 = property63.roundFloor();
        org.joda.time.DateTimeField dateTimeField66 = property63.getField();
        org.joda.time.MutableDateTime mutableDateTime68 = property63.set("1");
        org.joda.time.MutableDateTime mutableDateTime69 = mutableDateTime68.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime70 = mutableDateTime68.toMutableDateTime();
        long long71 = property53.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime68);
        org.joda.time.Chronology chronology72 = property53.getChronology();
        org.joda.time.MutableDateTime mutableDateTime73 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime13, chronology72);
        mutableDateTime2.setChronology(chronology72);
        org.joda.time.DateTime dateTime75 = mutableDateTime2.toDateTimeISO();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 25235000 + "'", int18 == 25235000);
        org.junit.Assert.assertNotNull(gregorianCalendar26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1970 + "'", int32 == 1970);
        org.junit.Assert.assertNotNull(gregorianCalendar38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(gregorianCalendar51);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(mutableDateTime54);
        org.junit.Assert.assertNotNull(mutableDateTime56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "1" + "'", str57, "1");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime59);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 25200000L + "'", long64 == 25200000L);
        org.junit.Assert.assertNotNull(mutableDateTime65);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertNotNull(mutableDateTime68);
        org.junit.Assert.assertNotNull(mutableDateTime69);
        org.junit.Assert.assertNotNull(mutableDateTime70);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 421L + "'", long71 == 421L);
        org.junit.Assert.assertNotNull(chronology72);
        org.junit.Assert.assertNotNull(dateTime75);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
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
        mutableDateTime2.addYears((int) ' ');
        java.util.GregorianCalendar gregorianCalendar25 = mutableDateTime2.toGregorianCalendar();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(calendar20);
        org.junit.Assert.assertEquals(calendar20.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(gregorianCalendar25);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfDay();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property7.getAsText(locale8);
        int int10 = property7.getMinimumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime12 = property7.set(2004);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(0L, dateTimeZone14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(0L, dateTimeZone18);
        mutableDateTime19.setSecondOfMinute((int) '#');
        boolean boolean22 = mutableDateTime15.equals((java.lang.Object) '#');
        org.joda.time.DateTimeField dateTimeField23 = null;
        mutableDateTime15.setRounding(dateTimeField23, 25235000);
        int int26 = mutableDateTime15.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(0L, dateTimeZone28);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime29.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(0L, dateTimeZone32);
        mutableDateTime33.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology36 = mutableDateTime33.getChronology();
        int int37 = mutableDateTime33.getSecondOfMinute();
        mutableDateTime29.setTime((org.joda.time.ReadableInstant) mutableDateTime33);
        mutableDateTime29.setSecondOfMinute((int) (short) 0);
        mutableDateTime29.addMonths(0);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(0L, dateTimeZone44);
        mutableDateTime45.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology48 = mutableDateTime45.getChronology();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime45.era();
        org.joda.time.MutableDateTime mutableDateTime51 = property49.set((int) (byte) 1);
        org.joda.time.Chronology chronology52 = mutableDateTime51.getChronology();
        org.joda.time.MutableDateTime mutableDateTime53 = mutableDateTime29.toMutableDateTime(chronology52);
        mutableDateTime15.setChronology(chronology52);
        mutableDateTime12.setChronology(chronology52);
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "25235" + "'", str9, "25235");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(mutableDateTime53);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.addWrapField((int) '#');
        java.lang.String str11 = property7.getAsText();
        java.util.Locale locale13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = property7.set("36", locale13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.weekyear();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.hourOfDay();
        int int17 = mutableDateTime14.getMillisOfDay();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime14.millisOfDay();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "36" + "'", str11, "36");
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 27360000 + "'", int17 == 27360000);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.year();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.getMutableDateTime();
        org.joda.time.DurationField durationField8 = property6.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime9 = property6.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime11 = property6.set(25235000);
        org.joda.time.MutableDateTime mutableDateTime13 = property6.add((int) (short) 10);
        org.joda.time.MutableDateTime mutableDateTime14 = property6.roundHalfCeiling();
        org.joda.time.ReadableDuration readableDuration15 = null;
        mutableDateTime14.add(readableDuration15, 1970);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNull(durationField8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.weekyear();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.add((int) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime10 = property6.set(292278993);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.weekyear();
        java.lang.String str12 = property11.getAsText();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "292278993" + "'", str12, "292278993");
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(0L, dateTimeZone5);
        mutableDateTime6.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology9 = mutableDateTime6.getChronology();
        int int10 = mutableDateTime6.getSecondOfMinute();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime6);
        java.util.Date date12 = mutableDateTime2.toDate();
        int int13 = mutableDateTime2.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, dateTimeZone15);
        mutableDateTime16.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology19 = mutableDateTime16.getChronology();
        int int20 = mutableDateTime16.getSecondOfMinute();
        mutableDateTime16.setMinuteOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(0L, dateTimeZone24);
        mutableDateTime25.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar28 = mutableDateTime25.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime25.copy();
        mutableDateTime25.setDayOfYear((int) (byte) 10);
        boolean boolean32 = mutableDateTime16.isBefore((org.joda.time.ReadableInstant) mutableDateTime25);
        int int33 = mutableDateTime25.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(0L, dateTimeZone35);
        mutableDateTime36.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology39 = mutableDateTime36.getChronology();
        org.joda.time.Chronology chronology40 = mutableDateTime36.getChronology();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(0L, dateTimeZone42);
        mutableDateTime43.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar46 = mutableDateTime43.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime43.copy();
        java.util.GregorianCalendar gregorianCalendar48 = mutableDateTime43.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(0L, dateTimeZone50);
        mutableDateTime51.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology54 = mutableDateTime51.getChronology();
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime51.era();
        mutableDateTime51.setDayOfYear((int) (short) 100);
        int int58 = mutableDateTime51.getYearOfEra();
        boolean boolean59 = mutableDateTime51.isBeforeNow();
        java.util.Locale locale60 = null;
        java.util.Calendar calendar61 = mutableDateTime51.toCalendar(locale60);
        mutableDateTime43.setTime((org.joda.time.ReadableInstant) mutableDateTime51);
        org.joda.time.DateTimeZone dateTimeZone63 = mutableDateTime51.getZone();
        org.joda.time.MutableDateTime mutableDateTime64 = org.joda.time.MutableDateTime.now(dateTimeZone63);
        org.joda.time.DateTime dateTime65 = mutableDateTime36.toDateTime(dateTimeZone63);
        mutableDateTime25.setZone(dateTimeZone63);
        boolean boolean67 = mutableDateTime2.equals((java.lang.Object) mutableDateTime25);
        org.joda.time.MutableDateTime.Property property68 = mutableDateTime2.year();
        int int69 = property68.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 07:00:35 ICT 1970");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(gregorianCalendar28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(gregorianCalendar46);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertNotNull(gregorianCalendar48);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1970 + "'", int58 == 1970);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(calendar61);
        org.junit.Assert.assertEquals(calendar61.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertNotNull(mutableDateTime64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 292278993 + "'", int69 == 292278993);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(0L, dateTimeZone5);
        mutableDateTime6.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology9 = mutableDateTime6.getChronology();
        int int10 = mutableDateTime6.getSecondOfMinute();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime6);
        java.util.Date date12 = mutableDateTime2.toDate();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.secondOfMinute();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime2.toString(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 07:00:35 ICT 1970");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01T07:00:35.000+07:00" + "'", str15, "1970-01-01T07:00:35.000+07:00");
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        java.util.Date date3 = mutableDateTime2.toDate();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.era();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(0L, dateTimeZone6);
        mutableDateTime7.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology10 = mutableDateTime7.getChronology();
        org.joda.time.Chronology chronology11 = mutableDateTime7.getChronology();
        boolean boolean12 = mutableDateTime7.isEqualNow();
        boolean boolean13 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime7);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, dateTimeZone15);
        mutableDateTime16.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar19 = mutableDateTime16.toGregorianCalendar();
        boolean boolean20 = mutableDateTime16.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(0L, dateTimeZone22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(0L, dateTimeZone26);
        mutableDateTime27.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology30 = mutableDateTime27.getChronology();
        int int31 = mutableDateTime27.getSecondOfMinute();
        mutableDateTime23.setTime((org.joda.time.ReadableInstant) mutableDateTime27);
        int int33 = mutableDateTime23.getYear();
        int int34 = mutableDateTime23.getHourOfDay();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime23.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(0L, dateTimeZone37);
        mutableDateTime38.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology41 = mutableDateTime38.getChronology();
        org.joda.time.Chronology chronology42 = mutableDateTime38.getChronology();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(0L, dateTimeZone44);
        mutableDateTime45.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar48 = mutableDateTime45.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime45.copy();
        java.util.GregorianCalendar gregorianCalendar50 = mutableDateTime45.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(0L, dateTimeZone52);
        mutableDateTime53.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology56 = mutableDateTime53.getChronology();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime53.era();
        mutableDateTime53.setDayOfYear((int) (short) 100);
        int int60 = mutableDateTime53.getYearOfEra();
        boolean boolean61 = mutableDateTime53.isBeforeNow();
        java.util.Locale locale62 = null;
        java.util.Calendar calendar63 = mutableDateTime53.toCalendar(locale62);
        mutableDateTime45.setTime((org.joda.time.ReadableInstant) mutableDateTime53);
        org.joda.time.DateTimeZone dateTimeZone65 = mutableDateTime53.getZone();
        org.joda.time.MutableDateTime mutableDateTime66 = org.joda.time.MutableDateTime.now(dateTimeZone65);
        org.joda.time.DateTime dateTime67 = mutableDateTime38.toDateTime(dateTimeZone65);
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime23, dateTimeZone65);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.MutableDateTime mutableDateTime71 = new org.joda.time.MutableDateTime(0L, dateTimeZone70);
        org.joda.time.MutableDateTime.Property property72 = mutableDateTime71.monthOfYear();
        long long73 = property72.remainder();
        org.joda.time.MutableDateTime mutableDateTime74 = property72.roundFloor();
        org.joda.time.DateTimeField dateTimeField75 = property72.getField();
        mutableDateTime68.setRounding(dateTimeField75, 2);
        int int78 = mutableDateTime16.get(dateTimeField75);
        mutableDateTime2.setRounding(dateTimeField75);
        org.joda.time.MutableDateTime.Property property80 = mutableDateTime2.hourOfDay();
        java.util.Locale locale81 = null;
        java.lang.String str82 = property80.getAsShortText(locale81);
        java.util.Locale locale83 = null;
        int int84 = property80.getMaximumShortTextLength(locale83);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(gregorianCalendar19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1970 + "'", int33 == 1970);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 7 + "'", int34 == 7);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(gregorianCalendar48);
        org.junit.Assert.assertNotNull(mutableDateTime49);
        org.junit.Assert.assertNotNull(gregorianCalendar50);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1970 + "'", int60 == 1970);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(calendar63);
        org.junit.Assert.assertEquals(calendar63.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertNotNull(mutableDateTime66);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 25200000L + "'", long73 == 25200000L);
        org.junit.Assert.assertNotNull(mutableDateTime74);
        org.junit.Assert.assertNotNull(dateTimeField75);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertNotNull(property80);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "0" + "'", str82, "0");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 2 + "'", int84 == 2);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.year();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.roundFloor();
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
        org.joda.time.DateTime dateTime29 = mutableDateTime7.toDateTime(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(dateTimeZone28);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(gregorianCalendar22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.era();
        int int7 = mutableDateTime2.getMillisOfDay();
        mutableDateTime2.add((long) 19);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(0L, dateTimeZone11);
        mutableDateTime12.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology15 = mutableDateTime12.getChronology();
        int int16 = mutableDateTime12.getSecondOfMinute();
        mutableDateTime12.setMinuteOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(0L, dateTimeZone20);
        mutableDateTime21.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar24 = mutableDateTime21.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime21.copy();
        mutableDateTime21.setDayOfYear((int) (byte) 10);
        boolean boolean28 = mutableDateTime12.isBefore((org.joda.time.ReadableInstant) mutableDateTime21);
        int int29 = mutableDateTime21.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(0L, dateTimeZone31);
        mutableDateTime32.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology35 = mutableDateTime32.getChronology();
        org.joda.time.Chronology chronology36 = mutableDateTime32.getChronology();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(0L, dateTimeZone38);
        mutableDateTime39.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar42 = mutableDateTime39.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime39.copy();
        java.util.GregorianCalendar gregorianCalendar44 = mutableDateTime39.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(0L, dateTimeZone46);
        mutableDateTime47.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology50 = mutableDateTime47.getChronology();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime47.era();
        mutableDateTime47.setDayOfYear((int) (short) 100);
        int int54 = mutableDateTime47.getYearOfEra();
        boolean boolean55 = mutableDateTime47.isBeforeNow();
        java.util.Locale locale56 = null;
        java.util.Calendar calendar57 = mutableDateTime47.toCalendar(locale56);
        mutableDateTime39.setTime((org.joda.time.ReadableInstant) mutableDateTime47);
        org.joda.time.DateTimeZone dateTimeZone59 = mutableDateTime47.getZone();
        org.joda.time.MutableDateTime mutableDateTime60 = org.joda.time.MutableDateTime.now(dateTimeZone59);
        org.joda.time.DateTime dateTime61 = mutableDateTime32.toDateTime(dateTimeZone59);
        mutableDateTime21.setZone(dateTimeZone59);
        mutableDateTime2.setZoneRetainFields(dateTimeZone59);
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime2.era();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 25235000 + "'", int7 == 25235000);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(gregorianCalendar24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(gregorianCalendar42);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(gregorianCalendar44);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1970 + "'", int54 == 1970);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(calendar57);
        org.junit.Assert.assertEquals(calendar57.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertNotNull(mutableDateTime60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(property65);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        java.util.Locale locale5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = property3.set("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21", locale5);
        java.lang.String str7 = property3.getAsString();
        java.lang.String str8 = property3.getAsShortText();
        org.joda.time.DurationField durationField9 = property3.getLeapDurationField();
        java.lang.String str10 = property3.getName();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
// flaky "14) test3131(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u0e21\u0e04." + "'", str8, "\u0e21\u0e04.");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "monthOfYear" + "'", str10, "monthOfYear");
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = mutableDateTime2.getRoundingField();
        mutableDateTime2.setDate((long) 5);
        org.joda.time.DateTimeField dateTimeField11 = mutableDateTime2.getRoundingField();
        int int12 = mutableDateTime2.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNull(dateTimeField8);
        org.junit.Assert.assertNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(0L, dateTimeZone5);
        mutableDateTime6.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology9 = mutableDateTime6.getChronology();
        int int10 = mutableDateTime6.getSecondOfMinute();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime6);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime6.monthOfYear();
        org.joda.time.Interval interval14 = property13.toInterval();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.roundFloor();
        java.util.Locale locale16 = null;
        java.lang.String str17 = property13.getAsShortText(locale16);
        java.lang.String str18 = property13.getAsString();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
// flaky "15) test3133(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u0e21\u0e04." + "'", str17, "\u0e21\u0e04.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1" + "'", str18, "1");
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.era();
        mutableDateTime2.setDayOfYear((int) (short) 100);
        int int9 = mutableDateTime2.getYearOfEra();
        boolean boolean10 = mutableDateTime2.isBeforeNow();
        mutableDateTime2.setSecondOfMinute(0);
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.copy();
        java.lang.String str14 = mutableDateTime13.toString();
        int int15 = mutableDateTime13.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-04-10T07:00:00.000+07:00" + "'", str14, "1970-04-10T07:00:00.000+07:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        boolean boolean7 = mutableDateTime2.isEqualNow();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.era();
        java.util.Locale locale9 = null;
        java.util.Calendar calendar10 = mutableDateTime2.toCalendar(locale9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundFloor();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(calendar10);
        org.junit.Assert.assertEquals(calendar10.toString(), "sun.util.BuddhistCalendar[time=35000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.year();
        int int7 = property6.getMaximumValueOverall();
        java.lang.String str8 = property6.getAsText();
        org.joda.time.DurationField durationField9 = property6.getLeapDurationField();
        org.joda.time.MutableDateTime mutableDateTime10 = property6.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime12 = property6.addWrapField(1422);
        java.lang.String str13 = property6.getAsShortText();
        org.joda.time.DurationField durationField14 = property6.getRangeDurationField();
        java.util.Locale locale15 = null;
        int int16 = property6.getMaximumTextLength(locale15);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 292278993 + "'", int7 == 292278993);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970" + "'", str8, "1970");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3392" + "'", str13, "3392");
        org.junit.Assert.assertNull(durationField14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.era();
        int int7 = mutableDateTime2.getMillisOfDay();
        mutableDateTime2.add((long) 19);
        int int10 = mutableDateTime2.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.year();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property11.getAsText(locale12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, dateTimeZone15);
        mutableDateTime16.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology19 = mutableDateTime16.getChronology();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime16.era();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(0L, dateTimeZone23);
        mutableDateTime24.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar27 = mutableDateTime24.toGregorianCalendar();
        mutableDateTime24.addMillis((-1));
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime24.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime32 = property30.add((int) (short) -1);
        boolean boolean33 = mutableDateTime16.isEqual((org.joda.time.ReadableInstant) mutableDateTime32);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(0L, dateTimeZone35);
        mutableDateTime36.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology39 = mutableDateTime36.getChronology();
        int int40 = mutableDateTime36.getSecondOfMinute();
        int int41 = mutableDateTime36.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(0L, dateTimeZone43);
        mutableDateTime44.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar47 = mutableDateTime44.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime44.copy();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime44.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime50 = property49.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime52 = property49.addWrapField((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = property49.getFieldType();
        mutableDateTime36.set(dateTimeFieldType53, (int) (short) 1);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime16.property(dateTimeFieldType53);
        java.util.Locale locale57 = null;
        java.lang.String str58 = property56.getAsShortText(locale57);
        java.util.Locale locale59 = null;
        int int60 = property56.getMaximumTextLength(locale59);
        org.joda.time.DateTimeField dateTimeField61 = property56.getField();
        boolean boolean62 = property11.equals((java.lang.Object) property56);
        int int63 = property11.get();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 25235000 + "'", int7 == 25235000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970" + "'", str13, "1970");
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(gregorianCalendar27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 420 + "'", int41 == 420);
        org.junit.Assert.assertNotNull(gregorianCalendar47);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "0" + "'", str58, "0");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2 + "'", int60 == 2);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1970 + "'", int63 == 1970);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        java.util.Locale locale5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = property3.set("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21", locale5);
        java.lang.String str7 = property3.getAsString();
        java.lang.String str8 = property3.getAsShortText();
        org.joda.time.DurationField durationField9 = property3.getLeapDurationField();
        org.joda.time.DurationField durationField10 = property3.getLeapDurationField();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(0L, dateTimeZone12);
        mutableDateTime13.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar16 = mutableDateTime13.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime13.copy();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundHalfFloor();
        boolean boolean20 = property3.equals((java.lang.Object) mutableDateTime19);
        mutableDateTime19.setSecondOfDay(0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
// flaky "16) test3138(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u0e21\u0e04." + "'", str8, "\u0e21\u0e04.");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(gregorianCalendar16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.addWrapField((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = property7.getFieldType();
        org.joda.time.MutableDateTime mutableDateTime13 = property7.set((int) (byte) 1);
        java.util.Locale locale15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = property7.set("19", locale15);
        java.util.Locale locale18 = null;
        java.lang.String str19 = mutableDateTime16.toString("420", locale18);
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "420" + "'", str19, "420");
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(0L, dateTimeZone4);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.monthOfYear();
        java.util.Locale locale8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = property6.set("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21", locale8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.weekyear();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(0L, dateTimeZone12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, dateTimeZone16);
        mutableDateTime17.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology20 = mutableDateTime17.getChronology();
        int int21 = mutableDateTime17.getSecondOfMinute();
        mutableDateTime13.setTime((org.joda.time.ReadableInstant) mutableDateTime17);
        int int23 = mutableDateTime13.getYear();
        int int24 = mutableDateTime13.getHourOfDay();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(0L, dateTimeZone27);
        mutableDateTime28.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology31 = mutableDateTime28.getChronology();
        org.joda.time.Chronology chronology32 = mutableDateTime28.getChronology();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(0L, dateTimeZone34);
        mutableDateTime35.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar38 = mutableDateTime35.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime35.copy();
        java.util.GregorianCalendar gregorianCalendar40 = mutableDateTime35.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(0L, dateTimeZone42);
        mutableDateTime43.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology46 = mutableDateTime43.getChronology();
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime43.era();
        mutableDateTime43.setDayOfYear((int) (short) 100);
        int int50 = mutableDateTime43.getYearOfEra();
        boolean boolean51 = mutableDateTime43.isBeforeNow();
        java.util.Locale locale52 = null;
        java.util.Calendar calendar53 = mutableDateTime43.toCalendar(locale52);
        mutableDateTime35.setTime((org.joda.time.ReadableInstant) mutableDateTime43);
        org.joda.time.DateTimeZone dateTimeZone55 = mutableDateTime43.getZone();
        org.joda.time.MutableDateTime mutableDateTime56 = org.joda.time.MutableDateTime.now(dateTimeZone55);
        org.joda.time.DateTime dateTime57 = mutableDateTime28.toDateTime(dateTimeZone55);
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime13, dateTimeZone55);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(0L, dateTimeZone60);
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime61.monthOfYear();
        long long63 = property62.remainder();
        org.joda.time.MutableDateTime mutableDateTime64 = property62.roundFloor();
        org.joda.time.DateTimeField dateTimeField65 = property62.getField();
        mutableDateTime58.setRounding(dateTimeField65, 2);
        mutableDateTime9.setRounding(dateTimeField65);
        org.joda.time.MutableDateTime.Property property69 = new org.joda.time.MutableDateTime.Property(mutableDateTime2, dateTimeField65);
        boolean boolean71 = mutableDateTime2.isBefore(1790579002106L);
        org.joda.time.MutableDateTime mutableDateTime72 = mutableDateTime2.copy();
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1970 + "'", int23 == 1970);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(gregorianCalendar38);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertNotNull(gregorianCalendar40);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1970 + "'", int50 == 1970);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(calendar53);
        org.junit.Assert.assertEquals(calendar53.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(mutableDateTime56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 25200000L + "'", long63 == 25200000L);
        org.junit.Assert.assertNotNull(mutableDateTime64);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(mutableDateTime72);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
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
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology13);
        int int17 = mutableDateTime16.getWeekOfWeekyear();
        int int18 = mutableDateTime16.getRoundingMode();
        mutableDateTime16.setMinuteOfHour(3);
        int int21 = mutableDateTime16.getWeekOfWeekyear();
        int int22 = mutableDateTime16.getEra();
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 40 + "'", int17 == 40);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 40 + "'", int21 == 40);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
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
        int int23 = mutableDateTime2.getYearOfEra();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime2.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime25 = property24.getMutableDateTime();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(calendar20);
        org.junit.Assert.assertEquals(calendar20.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1970 + "'", int23 == 1970);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(0L, dateTimeZone5);
        mutableDateTime6.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology9 = mutableDateTime6.getChronology();
        int int10 = mutableDateTime6.getSecondOfMinute();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime6);
        java.util.Date date12 = mutableDateTime2.toDate();
        mutableDateTime2.setYear((int) '4');
        java.util.GregorianCalendar gregorianCalendar15 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.millisOfSecond();
        java.lang.String str17 = property16.toString();
        long long18 = property16.remainder();
        java.lang.String str19 = property16.getName();
        java.lang.String str20 = property16.getAsShortText();
        java.lang.String str21 = property16.getAsText();
        org.joda.time.MutableDateTime mutableDateTime23 = property16.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.yearOfEra();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 07:00:35 ICT 1970");
        org.junit.Assert.assertNotNull(gregorianCalendar15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Property[millisOfSecond]" + "'", str17, "Property[millisOfSecond]");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "millisOfSecond" + "'", str19, "millisOfSecond");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0" + "'", str21, "0");
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(0L, dateTimeZone2);
        mutableDateTime3.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime3.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime3.copy();
        int int8 = mutableDateTime7.getWeekyear();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime7.year();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(0L, dateTimeZone11);
        mutableDateTime12.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology15 = mutableDateTime12.getChronology();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime12.era();
        mutableDateTime12.setDayOfYear((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(0L, dateTimeZone20);
        java.util.Date date22 = mutableDateTime21.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        boolean boolean24 = mutableDateTime21.isSupported(dateTimeFieldType23);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(0L, dateTimeZone27);
        mutableDateTime28.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology31 = mutableDateTime28.getChronology();
        org.joda.time.Chronology chronology32 = mutableDateTime28.getChronology();
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) ' ', chronology32);
        org.joda.time.DateTime dateTime34 = mutableDateTime21.toDateTime(chronology32);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(chronology32);
        mutableDateTime12.setChronology(chronology32);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(0L, dateTimeZone38);
        mutableDateTime39.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar42 = mutableDateTime39.toGregorianCalendar();
        mutableDateTime39.setSecondOfDay(10);
        int int45 = mutableDateTime39.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone46 = mutableDateTime39.getZone();
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime12, dateTimeZone46);
        org.joda.time.DateTime dateTime48 = mutableDateTime7.toDateTime(dateTimeZone46);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(dateTimeZone46);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((long) 47, dateTimeZone46);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(gregorianCalendar42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateTime48);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTime dateTime4 = mutableDateTime2.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime2.add(readableDuration7);
        int int9 = mutableDateTime2.getDayOfWeek();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.secondOfMinute();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
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
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology13);
        int int17 = mutableDateTime16.getWeekOfWeekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime16.toString(dateTimeFormatter18);
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime16.copy();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.secondOfDay();
        int int22 = mutableDateTime20.getDayOfYear();
        mutableDateTime20.setSecondOfDay(10);
        mutableDateTime20.setMillisOfDay(46);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 40 + "'", int17 == 40);
// flaky "17) test3146(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2026-09-28T14:48:49.114+07:00" + "'", str19, "2026-09-28T14:48:49.114+07:00");
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 271 + "'", int22 == 271);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.DateTime dateTime6 = mutableDateTime2.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(0L, dateTimeZone8);
        java.util.Date date10 = mutableDateTime9.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = mutableDateTime9.isSupported(dateTimeFieldType11);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, dateTimeZone15);
        mutableDateTime16.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology19 = mutableDateTime16.getChronology();
        org.joda.time.Chronology chronology20 = mutableDateTime16.getChronology();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) ' ', chronology20);
        org.joda.time.DateTime dateTime22 = mutableDateTime9.toDateTime(chronology20);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(chronology20);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(chronology20);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(0L, dateTimeZone27);
        mutableDateTime28.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology31 = mutableDateTime28.getChronology();
        org.joda.time.Chronology chronology32 = mutableDateTime28.getChronology();
        boolean boolean33 = mutableDateTime28.isEqualNow();
        mutableDateTime24.setTime((org.joda.time.ReadableInstant) mutableDateTime28);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(0L, dateTimeZone36);
        java.util.Date date38 = mutableDateTime37.toDate();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime37.era();
        long long40 = property39.getMillis();
        org.joda.time.Chronology chronology41 = property39.getChronology();
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(chronology41);
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now(chronology41);
        org.joda.time.MutableDateTime mutableDateTime44 = org.joda.time.MutableDateTime.now(chronology41);
        mutableDateTime24.setChronology(chronology41);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, chronology41);
        int int47 = mutableDateTime2.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfDay();
        java.lang.String str8 = property7.getName();
        int int9 = property7.getMaximumValueOverall();
        java.lang.Class<?> wildcardClass10 = property7.getClass();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "secondOfDay" + "'", str8, "secondOfDay");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 86399 + "'", int9 == 86399);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        boolean boolean7 = mutableDateTime2.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(0L, dateTimeZone10);
        mutableDateTime11.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology14 = mutableDateTime11.getChronology();
        org.joda.time.Chronology chronology15 = mutableDateTime11.getChronology();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) ' ', chronology15);
        org.joda.time.DateTime dateTime17 = mutableDateTime2.toDateTime(chronology15);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime2.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundHalfFloor();
        int int20 = mutableDateTime19.getYearOfEra();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundHalfCeiling();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTime dateTime4 = mutableDateTime2.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.copy();
        java.util.Date date6 = mutableDateTime2.toDate();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfDay();
        java.lang.String str8 = property7.getAsString();
        int int9 = property7.getMaximumValue();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "420" + "'", str8, "420");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1439 + "'", int9 == 1439);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
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
        org.joda.time.MutableDateTime mutableDateTime32 = property7.roundCeiling();
        java.util.Locale locale33 = null;
        int int34 = property7.getMaximumTextLength(locale33);
        long long35 = property7.getMillis();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(0L, dateTimeZone37);
        mutableDateTime38.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar41 = mutableDateTime38.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime42 = mutableDateTime38.copy();
        java.util.GregorianCalendar gregorianCalendar43 = mutableDateTime38.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(0L, dateTimeZone45);
        mutableDateTime46.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology49 = mutableDateTime46.getChronology();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime46.era();
        mutableDateTime46.setDayOfYear((int) (short) 100);
        int int53 = mutableDateTime46.getYearOfEra();
        boolean boolean54 = mutableDateTime46.isBeforeNow();
        java.util.Locale locale55 = null;
        java.util.Calendar calendar56 = mutableDateTime46.toCalendar(locale55);
        mutableDateTime38.setTime((org.joda.time.ReadableInstant) mutableDateTime46);
        org.joda.time.ReadableDuration readableDuration58 = null;
        mutableDateTime38.add(readableDuration58);
        mutableDateTime38.setMillis((long) 4);
        boolean boolean62 = property7.equals((java.lang.Object) mutableDateTime38);
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime38.minuteOfHour();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35000L + "'", long8 == 35000L);
        org.junit.Assert.assertNotNull(gregorianCalendar14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(gregorianCalendar16);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1970 + "'", int26 == 1970);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(calendar29);
        org.junit.Assert.assertEquals(calendar29.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 60000L + "'", long35 == 60000L);
        org.junit.Assert.assertNotNull(gregorianCalendar41);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertNotNull(gregorianCalendar43);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1970 + "'", int53 == 1970);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(calendar56);
        org.junit.Assert.assertEquals(calendar56.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(property63);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(0L, dateTimeZone2);
        mutableDateTime3.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology6 = mutableDateTime3.getChronology();
        int int7 = mutableDateTime3.getSecondOfMinute();
        mutableDateTime3.setMinuteOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(0L, dateTimeZone11);
        mutableDateTime12.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar15 = mutableDateTime12.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime12.copy();
        mutableDateTime12.setDayOfYear((int) (byte) 10);
        boolean boolean19 = mutableDateTime3.isBefore((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime12.copy();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime12.toMutableDateTime(chronology21);
        boolean boolean24 = mutableDateTime22.isAfter((long) 56);
        mutableDateTime22.addWeeks(4);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(0L, dateTimeZone28);
        mutableDateTime29.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar32 = mutableDateTime29.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime29.copy();
        java.util.GregorianCalendar gregorianCalendar34 = mutableDateTime29.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(0L, dateTimeZone36);
        mutableDateTime37.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology40 = mutableDateTime37.getChronology();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime37.era();
        mutableDateTime37.setDayOfYear((int) (short) 100);
        int int44 = mutableDateTime37.getYearOfEra();
        boolean boolean45 = mutableDateTime37.isBeforeNow();
        java.util.Locale locale46 = null;
        java.util.Calendar calendar47 = mutableDateTime37.toCalendar(locale46);
        mutableDateTime29.setTime((org.joda.time.ReadableInstant) mutableDateTime37);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime29.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime50 = property49.roundHalfEven();
        mutableDateTime50.addSeconds((int) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime50);
        boolean boolean54 = mutableDateTime22.equals((java.lang.Object) mutableDateTime53);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(0L, dateTimeZone56);
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime57.monthOfYear();
        org.joda.time.DateTime dateTime59 = mutableDateTime57.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime60 = mutableDateTime57.copy();
        java.util.Date date61 = mutableDateTime57.toDate();
        boolean boolean62 = mutableDateTime57.isAfterNow();
        mutableDateTime57.addWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime(0L, dateTimeZone66);
        mutableDateTime67.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology70 = mutableDateTime67.getChronology();
        org.joda.time.MutableDateTime.Property property71 = mutableDateTime67.year();
        org.joda.time.MutableDateTime mutableDateTime72 = property71.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.MutableDateTime mutableDateTime75 = new org.joda.time.MutableDateTime(0L, dateTimeZone74);
        org.joda.time.MutableDateTime.Property property76 = mutableDateTime75.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.MutableDateTime mutableDateTime79 = new org.joda.time.MutableDateTime(0L, dateTimeZone78);
        mutableDateTime79.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology82 = mutableDateTime79.getChronology();
        int int83 = mutableDateTime79.getSecondOfMinute();
        mutableDateTime75.setTime((org.joda.time.ReadableInstant) mutableDateTime79);
        mutableDateTime72.setMillis((org.joda.time.ReadableInstant) mutableDateTime79);
        org.joda.time.Chronology chronology86 = mutableDateTime72.getChronology();
        org.joda.time.DateTime dateTime87 = mutableDateTime57.toDateTime(chronology86);
        org.joda.time.DateTime dateTime88 = mutableDateTime22.toDateTime(chronology86);
        org.joda.time.MutableDateTime mutableDateTime89 = new org.joda.time.MutableDateTime((long) 366, chronology86);
        org.joda.time.ReadablePeriod readablePeriod90 = null;
        mutableDateTime89.add(readablePeriod90);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(gregorianCalendar15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(gregorianCalendar32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(gregorianCalendar34);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1970 + "'", int44 == 1970);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(calendar47);
        org.junit.Assert.assertEquals(calendar47.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(mutableDateTime60);
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(chronology70);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(mutableDateTime72);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(chronology82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 35 + "'", int83 == 35);
        org.junit.Assert.assertNotNull(chronology86);
        org.junit.Assert.assertNotNull(dateTime87);
        org.junit.Assert.assertNotNull(dateTime88);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.era();
        int int7 = mutableDateTime2.getMillisOfDay();
        mutableDateTime2.add((long) 19);
        int int10 = mutableDateTime2.getSecondOfDay();
        int int11 = mutableDateTime2.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(0L, dateTimeZone13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.monthOfYear();
        long long16 = property15.remainder();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.roundFloor();
        org.joda.time.DateTimeField dateTimeField18 = property15.getField();
        org.joda.time.MutableDateTime.Property property19 = new org.joda.time.MutableDateTime.Property(mutableDateTime2, dateTimeField18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(0L, dateTimeZone21);
        mutableDateTime22.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology25 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime22.year();
        org.joda.time.MutableDateTime mutableDateTime27 = property26.getMutableDateTime();
        org.joda.time.DurationField durationField28 = property26.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime29 = property26.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime31 = property26.set(25235000);
        org.joda.time.MutableDateTime mutableDateTime33 = property26.add((int) (short) 10);
        org.joda.time.MutableDateTime mutableDateTime34 = property26.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime35 = property26.roundHalfEven();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(0L, dateTimeZone37);
        mutableDateTime38.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology41 = mutableDateTime38.getChronology();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime38.year();
        int int43 = property42.getMaximumValueOverall();
        java.lang.String str44 = property42.getAsString();
        org.joda.time.MutableDateTime mutableDateTime45 = property42.roundHalfCeiling();
        org.joda.time.Chronology chronology46 = mutableDateTime45.getChronology();
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime35.toMutableDateTime(chronology46);
        boolean boolean48 = property19.equals((java.lang.Object) mutableDateTime35);
        org.joda.time.MutableDateTime mutableDateTime50 = property19.add((long) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime51 = property19.roundHalfFloor();
        int int52 = property19.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 25235000 + "'", int7 == 25235000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25235 + "'", int10 == 25235);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 19 + "'", int11 == 19);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 25200000L + "'", long16 == 25200000L);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNull(durationField28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 292278993 + "'", int43 == 292278993);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1970" + "'", str44, "1970");
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 12 + "'", int52 == 12);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.addWrapField((int) (byte) 0);
        int int11 = mutableDateTime10.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(0L, dateTimeZone13);
        mutableDateTime14.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar17 = mutableDateTime14.toGregorianCalendar();
        int int18 = mutableDateTime14.getMillisOfDay();
        org.joda.time.Chronology chronology19 = mutableDateTime14.getChronology();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(0L, dateTimeZone21);
        mutableDateTime22.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology25 = mutableDateTime22.getChronology();
        int int26 = mutableDateTime22.getSecondOfMinute();
        mutableDateTime22.setMinuteOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(0L, dateTimeZone30);
        mutableDateTime31.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar34 = mutableDateTime31.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime31.copy();
        mutableDateTime31.setDayOfYear((int) (byte) 10);
        boolean boolean38 = mutableDateTime22.isBefore((org.joda.time.ReadableInstant) mutableDateTime31);
        int int39 = mutableDateTime31.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(0L, dateTimeZone41);
        mutableDateTime42.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology45 = mutableDateTime42.getChronology();
        org.joda.time.Chronology chronology46 = mutableDateTime42.getChronology();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(0L, dateTimeZone48);
        mutableDateTime49.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar52 = mutableDateTime49.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime53 = mutableDateTime49.copy();
        java.util.GregorianCalendar gregorianCalendar54 = mutableDateTime49.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(0L, dateTimeZone56);
        mutableDateTime57.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology60 = mutableDateTime57.getChronology();
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime57.era();
        mutableDateTime57.setDayOfYear((int) (short) 100);
        int int64 = mutableDateTime57.getYearOfEra();
        boolean boolean65 = mutableDateTime57.isBeforeNow();
        java.util.Locale locale66 = null;
        java.util.Calendar calendar67 = mutableDateTime57.toCalendar(locale66);
        mutableDateTime49.setTime((org.joda.time.ReadableInstant) mutableDateTime57);
        org.joda.time.DateTimeZone dateTimeZone69 = mutableDateTime57.getZone();
        org.joda.time.MutableDateTime mutableDateTime70 = org.joda.time.MutableDateTime.now(dateTimeZone69);
        org.joda.time.DateTime dateTime71 = mutableDateTime42.toDateTime(dateTimeZone69);
        mutableDateTime31.setZone(dateTimeZone69);
        mutableDateTime14.setZone(dateTimeZone69);
        org.joda.time.MutableDateTime mutableDateTime74 = mutableDateTime10.toMutableDateTime(dateTimeZone69);
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.MutableDateTime mutableDateTime77 = new org.joda.time.MutableDateTime(0L, dateTimeZone76);
        mutableDateTime77.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology80 = mutableDateTime77.getChronology();
        org.joda.time.MutableDateTime mutableDateTime81 = new org.joda.time.MutableDateTime(chronology80);
        org.joda.time.MutableDateTime mutableDateTime82 = org.joda.time.MutableDateTime.now(chronology80);
        boolean boolean84 = mutableDateTime82.isBefore((long) (byte) 0);
        mutableDateTime74.setTime((org.joda.time.ReadableInstant) mutableDateTime82);
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertNotNull(gregorianCalendar17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 25235000 + "'", int18 == 25235000);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertNotNull(gregorianCalendar34);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(gregorianCalendar52);
        org.junit.Assert.assertNotNull(mutableDateTime53);
        org.junit.Assert.assertNotNull(gregorianCalendar54);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1970 + "'", int64 == 1970);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(calendar67);
        org.junit.Assert.assertEquals(calendar67.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone69);
        org.junit.Assert.assertNotNull(mutableDateTime70);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(mutableDateTime74);
        org.junit.Assert.assertNotNull(chronology80);
        org.junit.Assert.assertNotNull(mutableDateTime82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.era();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(0L, dateTimeZone6);
        mutableDateTime7.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology10 = mutableDateTime7.getChronology();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime7.year();
        org.joda.time.Chronology chronology12 = property11.getChronology();
        org.joda.time.DateTime dateTime13 = mutableDateTime2.toDateTime(chronology12);
        org.joda.time.DateTime dateTime14 = dateTime13.toDateTime();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime9 = property6.add((-680));
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(0L, dateTimeZone11);
        java.util.Date date13 = mutableDateTime12.toDate();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.era();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, dateTimeZone16);
        mutableDateTime17.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology20 = mutableDateTime17.getChronology();
        org.joda.time.Chronology chronology21 = mutableDateTime17.getChronology();
        boolean boolean22 = mutableDateTime17.isEqualNow();
        boolean boolean23 = mutableDateTime12.isBefore((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(0L, dateTimeZone25);
        mutableDateTime26.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar29 = mutableDateTime26.toGregorianCalendar();
        mutableDateTime26.addMillis((-1));
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime26.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime33 = property32.roundHalfEven();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(0L, dateTimeZone35);
        mutableDateTime36.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar39 = mutableDateTime36.toGregorianCalendar();
        int int40 = mutableDateTime36.getMillisOfDay();
        org.joda.time.Chronology chronology41 = mutableDateTime36.getChronology();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(0L, dateTimeZone43);
        mutableDateTime44.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology47 = mutableDateTime44.getChronology();
        int int48 = mutableDateTime44.getSecondOfMinute();
        mutableDateTime44.setMinuteOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(0L, dateTimeZone52);
        mutableDateTime53.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar56 = mutableDateTime53.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime57 = mutableDateTime53.copy();
        mutableDateTime53.setDayOfYear((int) (byte) 10);
        boolean boolean60 = mutableDateTime44.isBefore((org.joda.time.ReadableInstant) mutableDateTime53);
        int int61 = mutableDateTime53.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime(0L, dateTimeZone63);
        mutableDateTime64.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology67 = mutableDateTime64.getChronology();
        org.joda.time.Chronology chronology68 = mutableDateTime64.getChronology();
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.MutableDateTime mutableDateTime71 = new org.joda.time.MutableDateTime(0L, dateTimeZone70);
        mutableDateTime71.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar74 = mutableDateTime71.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime75 = mutableDateTime71.copy();
        java.util.GregorianCalendar gregorianCalendar76 = mutableDateTime71.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.MutableDateTime mutableDateTime79 = new org.joda.time.MutableDateTime(0L, dateTimeZone78);
        mutableDateTime79.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology82 = mutableDateTime79.getChronology();
        org.joda.time.MutableDateTime.Property property83 = mutableDateTime79.era();
        mutableDateTime79.setDayOfYear((int) (short) 100);
        int int86 = mutableDateTime79.getYearOfEra();
        boolean boolean87 = mutableDateTime79.isBeforeNow();
        java.util.Locale locale88 = null;
        java.util.Calendar calendar89 = mutableDateTime79.toCalendar(locale88);
        mutableDateTime71.setTime((org.joda.time.ReadableInstant) mutableDateTime79);
        org.joda.time.DateTimeZone dateTimeZone91 = mutableDateTime79.getZone();
        org.joda.time.MutableDateTime mutableDateTime92 = org.joda.time.MutableDateTime.now(dateTimeZone91);
        org.joda.time.DateTime dateTime93 = mutableDateTime64.toDateTime(dateTimeZone91);
        mutableDateTime53.setZone(dateTimeZone91);
        mutableDateTime36.setZone(dateTimeZone91);
        mutableDateTime33.setZone(dateTimeZone91);
        org.joda.time.DateTime dateTime97 = mutableDateTime17.toDateTime(dateTimeZone91);
        mutableDateTime9.setZone(dateTimeZone91);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(gregorianCalendar29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(gregorianCalendar39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 25235000 + "'", int40 == 25235000);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 35 + "'", int48 == 35);
        org.junit.Assert.assertNotNull(gregorianCalendar56);
        org.junit.Assert.assertNotNull(mutableDateTime57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 35 + "'", int61 == 35);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertNotNull(chronology68);
        org.junit.Assert.assertNotNull(gregorianCalendar74);
        org.junit.Assert.assertNotNull(mutableDateTime75);
        org.junit.Assert.assertNotNull(gregorianCalendar76);
        org.junit.Assert.assertNotNull(chronology82);
        org.junit.Assert.assertNotNull(property83);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1970 + "'", int86 == 1970);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(calendar89);
        org.junit.Assert.assertEquals(calendar89.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone91);
        org.junit.Assert.assertNotNull(mutableDateTime92);
        org.junit.Assert.assertNotNull(dateTime93);
        org.junit.Assert.assertNotNull(dateTime97);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(0L, dateTimeZone2);
        mutableDateTime3.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime3.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime3.copy();
        mutableDateTime0.setTime((org.joda.time.ReadableInstant) mutableDateTime3);
        int int9 = mutableDateTime3.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime3.millisOfDay();
        java.lang.String str11 = property10.toString();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(0L, dateTimeZone13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(0L, dateTimeZone17);
        mutableDateTime18.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology21 = mutableDateTime18.getChronology();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        org.joda.time.DateTime dateTime23 = mutableDateTime14.toDateTime(chronology22);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(chronology22);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.millisOfSecond();
        boolean boolean26 = property10.equals((java.lang.Object) property25);
        java.lang.String str27 = property10.getAsText();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Property[millisOfDay]" + "'", str11, "Property[millisOfDay]");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "25235000" + "'", str27, "25235000");
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.era();
        mutableDateTime2.setDayOfYear((int) (short) 100);
        int int9 = mutableDateTime2.getDayOfWeek();
        org.joda.time.Chronology chronology10 = mutableDateTime2.getChronology();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(0L, dateTimeZone12);
        java.util.Date date14 = mutableDateTime13.toDate();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, dateTimeZone16);
        mutableDateTime17.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology20 = mutableDateTime17.getChronology();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.era();
        mutableDateTime17.setDayOfYear((int) (short) 100);
        int int24 = mutableDateTime17.getYearOfEra();
        boolean boolean25 = mutableDateTime17.isBeforeNow();
        mutableDateTime17.setSecondOfMinute(0);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(0L, dateTimeZone29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(0L, dateTimeZone33);
        mutableDateTime34.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology37 = mutableDateTime34.getChronology();
        int int38 = mutableDateTime34.getSecondOfMinute();
        mutableDateTime30.setTime((org.joda.time.ReadableInstant) mutableDateTime34);
        int int40 = mutableDateTime30.getYear();
        int int41 = mutableDateTime30.getHourOfDay();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime30.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(0L, dateTimeZone44);
        mutableDateTime45.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology48 = mutableDateTime45.getChronology();
        org.joda.time.Chronology chronology49 = mutableDateTime45.getChronology();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(0L, dateTimeZone51);
        mutableDateTime52.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar55 = mutableDateTime52.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime56 = mutableDateTime52.copy();
        java.util.GregorianCalendar gregorianCalendar57 = mutableDateTime52.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(0L, dateTimeZone59);
        mutableDateTime60.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology63 = mutableDateTime60.getChronology();
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime60.era();
        mutableDateTime60.setDayOfYear((int) (short) 100);
        int int67 = mutableDateTime60.getYearOfEra();
        boolean boolean68 = mutableDateTime60.isBeforeNow();
        java.util.Locale locale69 = null;
        java.util.Calendar calendar70 = mutableDateTime60.toCalendar(locale69);
        mutableDateTime52.setTime((org.joda.time.ReadableInstant) mutableDateTime60);
        org.joda.time.DateTimeZone dateTimeZone72 = mutableDateTime60.getZone();
        org.joda.time.MutableDateTime mutableDateTime73 = org.joda.time.MutableDateTime.now(dateTimeZone72);
        org.joda.time.DateTime dateTime74 = mutableDateTime45.toDateTime(dateTimeZone72);
        org.joda.time.MutableDateTime mutableDateTime75 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime30, dateTimeZone72);
        org.joda.time.DateTimeZone dateTimeZone77 = null;
        org.joda.time.MutableDateTime mutableDateTime78 = new org.joda.time.MutableDateTime(0L, dateTimeZone77);
        org.joda.time.MutableDateTime.Property property79 = mutableDateTime78.monthOfYear();
        long long80 = property79.remainder();
        org.joda.time.MutableDateTime mutableDateTime81 = property79.roundFloor();
        org.joda.time.DateTimeField dateTimeField82 = property79.getField();
        mutableDateTime75.setRounding(dateTimeField82, 2);
        int int85 = mutableDateTime17.get(dateTimeField82);
        org.joda.time.MutableDateTime.Property property86 = new org.joda.time.MutableDateTime.Property(mutableDateTime13, dateTimeField82);
        org.joda.time.MutableDateTime.Property property87 = new org.joda.time.MutableDateTime.Property(mutableDateTime2, dateTimeField82);
        int int88 = property87.get();
        org.joda.time.MutableDateTime mutableDateTime89 = property87.roundHalfEven();
        org.joda.time.DateTimeField dateTimeField90 = mutableDateTime89.getRoundingField();
        mutableDateTime89.setDate((long) 82847);
        org.joda.time.DateTime dateTime93 = mutableDateTime89.toDateTime();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1970 + "'", int24 == 1970);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1970 + "'", int40 == 1970);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 7 + "'", int41 == 7);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(gregorianCalendar55);
        org.junit.Assert.assertNotNull(mutableDateTime56);
        org.junit.Assert.assertNotNull(gregorianCalendar57);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1970 + "'", int67 == 1970);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(calendar70);
        org.junit.Assert.assertEquals(calendar70.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone72);
        org.junit.Assert.assertNotNull(mutableDateTime73);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 25200000L + "'", long80 == 25200000L);
        org.junit.Assert.assertNotNull(mutableDateTime81);
        org.junit.Assert.assertNotNull(dateTimeField82);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 4 + "'", int85 == 4);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 4 + "'", int88 == 4);
        org.junit.Assert.assertNotNull(mutableDateTime89);
        org.junit.Assert.assertNull(dateTimeField90);
        org.junit.Assert.assertNotNull(dateTime93);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.year();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.getMutableDateTime();
        org.joda.time.DurationField durationField8 = property6.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime9 = property6.roundHalfFloor();
        int int10 = mutableDateTime9.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(0L, dateTimeZone13);
        mutableDateTime14.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar17 = mutableDateTime14.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime14.copy();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime20 = property19.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime22 = property19.addWrapField((int) (byte) 0);
        int int23 = mutableDateTime22.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(0L, dateTimeZone25);
        mutableDateTime26.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar29 = mutableDateTime26.toGregorianCalendar();
        int int30 = mutableDateTime26.getMillisOfDay();
        org.joda.time.Chronology chronology31 = mutableDateTime26.getChronology();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(0L, dateTimeZone33);
        mutableDateTime34.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology37 = mutableDateTime34.getChronology();
        int int38 = mutableDateTime34.getSecondOfMinute();
        mutableDateTime34.setMinuteOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(0L, dateTimeZone42);
        mutableDateTime43.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar46 = mutableDateTime43.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime43.copy();
        mutableDateTime43.setDayOfYear((int) (byte) 10);
        boolean boolean50 = mutableDateTime34.isBefore((org.joda.time.ReadableInstant) mutableDateTime43);
        int int51 = mutableDateTime43.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(0L, dateTimeZone53);
        mutableDateTime54.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology57 = mutableDateTime54.getChronology();
        org.joda.time.Chronology chronology58 = mutableDateTime54.getChronology();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(0L, dateTimeZone60);
        mutableDateTime61.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar64 = mutableDateTime61.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime65 = mutableDateTime61.copy();
        java.util.GregorianCalendar gregorianCalendar66 = mutableDateTime61.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime(0L, dateTimeZone68);
        mutableDateTime69.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology72 = mutableDateTime69.getChronology();
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime69.era();
        mutableDateTime69.setDayOfYear((int) (short) 100);
        int int76 = mutableDateTime69.getYearOfEra();
        boolean boolean77 = mutableDateTime69.isBeforeNow();
        java.util.Locale locale78 = null;
        java.util.Calendar calendar79 = mutableDateTime69.toCalendar(locale78);
        mutableDateTime61.setTime((org.joda.time.ReadableInstant) mutableDateTime69);
        org.joda.time.DateTimeZone dateTimeZone81 = mutableDateTime69.getZone();
        org.joda.time.MutableDateTime mutableDateTime82 = org.joda.time.MutableDateTime.now(dateTimeZone81);
        org.joda.time.DateTime dateTime83 = mutableDateTime54.toDateTime(dateTimeZone81);
        mutableDateTime43.setZone(dateTimeZone81);
        mutableDateTime26.setZone(dateTimeZone81);
        org.joda.time.MutableDateTime mutableDateTime86 = mutableDateTime22.toMutableDateTime(dateTimeZone81);
        org.joda.time.MutableDateTime mutableDateTime87 = new org.joda.time.MutableDateTime(1790581679300L, dateTimeZone81);
        org.joda.time.MutableDateTime mutableDateTime88 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime9, dateTimeZone81);
        org.joda.time.MutableDateTime mutableDateTime89 = mutableDateTime9.toMutableDateTime();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNull(durationField8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(gregorianCalendar17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1970 + "'", int23 == 1970);
        org.junit.Assert.assertNotNull(gregorianCalendar29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 25235000 + "'", int30 == 25235000);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
        org.junit.Assert.assertNotNull(gregorianCalendar46);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 35 + "'", int51 == 35);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(gregorianCalendar64);
        org.junit.Assert.assertNotNull(mutableDateTime65);
        org.junit.Assert.assertNotNull(gregorianCalendar66);
        org.junit.Assert.assertNotNull(chronology72);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1970 + "'", int76 == 1970);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(calendar79);
        org.junit.Assert.assertEquals(calendar79.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone81);
        org.junit.Assert.assertNotNull(mutableDateTime82);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertNotNull(mutableDateTime86);
        org.junit.Assert.assertNotNull(mutableDateTime89);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
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
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime2.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime23 = property22.roundHalfEven();
        mutableDateTime23.addSeconds((int) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime23);
        mutableDateTime23.setMillisOfSecond(3);
        int int29 = mutableDateTime23.getMillisOfSecond();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(calendar20);
        org.junit.Assert.assertEquals(calendar20.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
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
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology13);
        int int17 = mutableDateTime16.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.minuteOfHour();
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 40 + "'", int17 == 40);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.lang.Object obj5 = mutableDateTime2.clone();
        mutableDateTime2.setWeekyear(40);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.millisOfSecond();
        java.lang.String str10 = property9.getAsString();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.roundHalfEven();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(0L, dateTimeZone13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(0L, dateTimeZone17);
        mutableDateTime18.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology21 = mutableDateTime18.getChronology();
        int int22 = mutableDateTime18.getSecondOfMinute();
        mutableDateTime14.setTime((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime18);
        boolean boolean25 = mutableDateTime18.isAfterNow();
        mutableDateTime11.setTime((org.joda.time.ReadableInstant) mutableDateTime18);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T07:00:35.000+07:00");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T07:00:35.000+07:00");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T07:00:35.000+07:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(0L, dateTimeZone5);
        mutableDateTime6.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology9 = mutableDateTime6.getChronology();
        int int10 = mutableDateTime6.getSecondOfMinute();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime6);
        int int12 = mutableDateTime2.getYear();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime();
        mutableDateTime2.setDayOfYear(100);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(0L, dateTimeZone17);
        mutableDateTime18.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology21 = mutableDateTime18.getChronology();
        int int22 = mutableDateTime18.getSecondOfMinute();
        int int23 = mutableDateTime18.getMinuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 12);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime25.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(0L, dateTimeZone28);
        mutableDateTime29.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar32 = mutableDateTime29.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime29.copy();
        java.util.GregorianCalendar gregorianCalendar34 = mutableDateTime29.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(0L, dateTimeZone36);
        mutableDateTime37.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology40 = mutableDateTime37.getChronology();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime37.era();
        mutableDateTime37.setDayOfYear((int) (short) 100);
        int int44 = mutableDateTime37.getYearOfEra();
        boolean boolean45 = mutableDateTime37.isBeforeNow();
        java.util.Locale locale46 = null;
        java.util.Calendar calendar47 = mutableDateTime37.toCalendar(locale46);
        mutableDateTime29.setTime((org.joda.time.ReadableInstant) mutableDateTime37);
        org.joda.time.DateTimeZone dateTimeZone49 = mutableDateTime37.getZone();
        mutableDateTime25.setZone(dateTimeZone49);
        org.joda.time.MutableDateTime mutableDateTime51 = mutableDateTime18.toMutableDateTime(dateTimeZone49);
        mutableDateTime51.setMillisOfSecond((int) (byte) 1);
        boolean boolean54 = mutableDateTime51.isBeforeNow();
        boolean boolean55 = mutableDateTime2.equals((java.lang.Object) mutableDateTime51);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime51.era();
        org.joda.time.DateTimeField dateTimeField57 = mutableDateTime51.getRoundingField();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 420 + "'", int23 == 420);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(gregorianCalendar32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(gregorianCalendar34);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1970 + "'", int44 == 1970);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(calendar47);
        org.junit.Assert.assertEquals(calendar47.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNull(dateTimeField57);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(0L, dateTimeZone5);
        mutableDateTime6.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology9 = mutableDateTime6.getChronology();
        int int10 = mutableDateTime6.getSecondOfMinute();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime6);
        int int12 = mutableDateTime2.getYear();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime();
        mutableDateTime2.setDayOfYear(100);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(0L, dateTimeZone17);
        mutableDateTime18.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology21 = mutableDateTime18.getChronology();
        int int22 = mutableDateTime18.getSecondOfMinute();
        int int23 = mutableDateTime18.getMinuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 12);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime25.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(0L, dateTimeZone28);
        mutableDateTime29.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar32 = mutableDateTime29.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime29.copy();
        java.util.GregorianCalendar gregorianCalendar34 = mutableDateTime29.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(0L, dateTimeZone36);
        mutableDateTime37.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology40 = mutableDateTime37.getChronology();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime37.era();
        mutableDateTime37.setDayOfYear((int) (short) 100);
        int int44 = mutableDateTime37.getYearOfEra();
        boolean boolean45 = mutableDateTime37.isBeforeNow();
        java.util.Locale locale46 = null;
        java.util.Calendar calendar47 = mutableDateTime37.toCalendar(locale46);
        mutableDateTime29.setTime((org.joda.time.ReadableInstant) mutableDateTime37);
        org.joda.time.DateTimeZone dateTimeZone49 = mutableDateTime37.getZone();
        mutableDateTime25.setZone(dateTimeZone49);
        org.joda.time.MutableDateTime mutableDateTime51 = mutableDateTime18.toMutableDateTime(dateTimeZone49);
        mutableDateTime51.setMillisOfSecond((int) (byte) 1);
        boolean boolean54 = mutableDateTime51.isBeforeNow();
        boolean boolean55 = mutableDateTime2.equals((java.lang.Object) mutableDateTime51);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(0L, dateTimeZone57);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime58.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(0L, dateTimeZone61);
        mutableDateTime62.setSecondOfMinute((int) '#');
        boolean boolean65 = mutableDateTime58.equals((java.lang.Object) '#');
        org.joda.time.DateTimeField dateTimeField66 = null;
        mutableDateTime58.setRounding(dateTimeField66, 25235000);
        int int69 = mutableDateTime58.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime(0L, dateTimeZone71);
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime72.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime(0L, dateTimeZone75);
        mutableDateTime76.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology79 = mutableDateTime76.getChronology();
        int int80 = mutableDateTime76.getSecondOfMinute();
        mutableDateTime72.setTime((org.joda.time.ReadableInstant) mutableDateTime76);
        mutableDateTime72.setSecondOfMinute((int) (short) 0);
        mutableDateTime72.addMonths(0);
        org.joda.time.DateTimeZone dateTimeZone87 = null;
        org.joda.time.MutableDateTime mutableDateTime88 = new org.joda.time.MutableDateTime(0L, dateTimeZone87);
        mutableDateTime88.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology91 = mutableDateTime88.getChronology();
        org.joda.time.MutableDateTime.Property property92 = mutableDateTime88.era();
        org.joda.time.MutableDateTime mutableDateTime94 = property92.set((int) (byte) 1);
        org.joda.time.Chronology chronology95 = mutableDateTime94.getChronology();
        org.joda.time.MutableDateTime mutableDateTime96 = mutableDateTime72.toMutableDateTime(chronology95);
        mutableDateTime58.setChronology(chronology95);
        org.joda.time.MutableDateTime mutableDateTime98 = mutableDateTime2.toMutableDateTime(chronology95);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 420 + "'", int23 == 420);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(gregorianCalendar32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(gregorianCalendar34);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1970 + "'", int44 == 1970);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(calendar47);
        org.junit.Assert.assertEquals(calendar47.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(chronology79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 35 + "'", int80 == 35);
        org.junit.Assert.assertNotNull(chronology91);
        org.junit.Assert.assertNotNull(property92);
        org.junit.Assert.assertNotNull(mutableDateTime94);
        org.junit.Assert.assertNotNull(chronology95);
        org.junit.Assert.assertNotNull(mutableDateTime96);
        org.junit.Assert.assertNotNull(mutableDateTime98);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 9);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime1.toMutableDateTimeISO();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime8.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(0L, dateTimeZone11);
        mutableDateTime12.setSecondOfMinute((int) '#');
        org.joda.time.DateTime dateTime15 = mutableDateTime12.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(0L, dateTimeZone17);
        mutableDateTime18.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology21 = mutableDateTime18.getChronology();
        int int22 = mutableDateTime18.getSecondOfMinute();
        boolean boolean23 = mutableDateTime18.isEqualNow();
        mutableDateTime18.setYear((int) '#');
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(0L, dateTimeZone27);
        mutableDateTime28.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology31 = mutableDateTime28.getChronology();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime28.era();
        mutableDateTime28.setDayOfYear((int) (short) 100);
        int int35 = mutableDateTime28.getYearOfEra();
        boolean boolean36 = mutableDateTime28.isBeforeNow();
        java.util.Locale locale37 = null;
        java.util.Calendar calendar38 = mutableDateTime28.toCalendar(locale37);
        boolean boolean39 = mutableDateTime18.isAfter((org.joda.time.ReadableInstant) mutableDateTime28);
        mutableDateTime12.setTime((org.joda.time.ReadableInstant) mutableDateTime28);
        int int41 = mutableDateTime28.getRoundingMode();
        int int42 = mutableDateTime8.compareTo((org.joda.time.ReadableInstant) mutableDateTime28);
        int int43 = mutableDateTime28.getHourOfDay();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1970 + "'", int35 == 1970);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 7 + "'", int43 == 7);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
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
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology13);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(chronology13);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.minuteOfDay();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime17.secondOfMinute();
        int int20 = mutableDateTime17.getCenturyOfEra();
        java.lang.Object obj21 = mutableDateTime17.clone();
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
        org.junit.Assert.assertNotNull(obj21);
// flaky "18) test3167(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals(obj21.toString(), "2026-09-28T14:48:49.411+07:00");
// flaky "5) test3167(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "2026-09-28T14:48:49.411+07:00");
// flaky "5) test3167(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "2026-09-28T14:48:49.411+07:00");
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
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
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology13);
        int int17 = mutableDateTime16.getWeekOfWeekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime16.toString(dateTimeFormatter18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime16.add(readablePeriod20, (int) (byte) 1);
        int int23 = mutableDateTime16.getWeekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration24 = null;
        mutableDateTime16.add(readableDuration24, (int) (short) -1);
        boolean boolean27 = mutableDateTime16.isBeforeNow();
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 40 + "'", int17 == 40);
// flaky "19) test3168(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2026-09-28T14:48:49.420+07:00" + "'", str19, "2026-09-28T14:48:49.420+07:00");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 40 + "'", int23 == 40);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        mutableDateTime2.setSecondOfDay(10);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.set(28);
        java.lang.String str11 = property8.getAsString();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "28" + "'", str11, "28");
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.addWrapField((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = property7.getFieldType();
        java.lang.String str12 = property7.getAsString();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(0L, dateTimeZone14);
        mutableDateTime15.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar18 = mutableDateTime15.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime15.copy();
        boolean boolean21 = mutableDateTime15.isBefore((long) '#');
        mutableDateTime15.setDate((long) 40);
        long long24 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.MutableDateTime mutableDateTime26 = property7.add((long) 53321972);
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "36" + "'", str12, "36");
        org.junit.Assert.assertNotNull(gregorianCalendar18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 35L + "'", long24 == 35L);
        org.junit.Assert.assertNotNull(mutableDateTime26);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.era();
        int int7 = mutableDateTime2.getMillisOfDay();
        mutableDateTime2.add((long) 19);
        int int10 = mutableDateTime2.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = mutableDateTime2.toDateTime();
        int int12 = mutableDateTime2.getWeekyear();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.secondOfMinute();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 25235000 + "'", int7 == 25235000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25235 + "'", int10 == 25235);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        int int6 = mutableDateTime2.getSecondOfMinute();
        boolean boolean7 = mutableDateTime2.isEqualNow();
        mutableDateTime2.setYear((int) '#');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(0L, dateTimeZone11);
        mutableDateTime12.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology15 = mutableDateTime12.getChronology();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime12.era();
        mutableDateTime12.setDayOfYear((int) (short) 100);
        int int19 = mutableDateTime12.getYearOfEra();
        boolean boolean20 = mutableDateTime12.isBeforeNow();
        java.util.Locale locale21 = null;
        java.util.Calendar calendar22 = mutableDateTime12.toCalendar(locale21);
        boolean boolean23 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(0L, dateTimeZone25);
        mutableDateTime26.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar29 = mutableDateTime26.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime26.copy();
        int int31 = mutableDateTime30.getWeekyear();
        mutableDateTime30.addWeeks((int) (short) 100);
        boolean boolean34 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime30);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(0L, dateTimeZone36);
        java.util.Date date38 = mutableDateTime37.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = null;
        boolean boolean40 = mutableDateTime37.isSupported(dateTimeFieldType39);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(0L, dateTimeZone43);
        mutableDateTime44.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology47 = mutableDateTime44.getChronology();
        org.joda.time.Chronology chronology48 = mutableDateTime44.getChronology();
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((long) ' ', chronology48);
        org.joda.time.DateTime dateTime50 = mutableDateTime37.toDateTime(chronology48);
        org.joda.time.Chronology chronology51 = mutableDateTime37.getChronology();
        org.joda.time.MutableDateTime mutableDateTime52 = mutableDateTime30.toMutableDateTime(chronology51);
        boolean boolean54 = mutableDateTime52.isEqual(1L);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(0L, dateTimeZone56);
        mutableDateTime57.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar60 = mutableDateTime57.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime61 = mutableDateTime57.copy();
        java.util.GregorianCalendar gregorianCalendar62 = mutableDateTime57.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(0L, dateTimeZone64);
        mutableDateTime65.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology68 = mutableDateTime65.getChronology();
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime65.era();
        mutableDateTime65.setDayOfYear((int) (short) 100);
        int int72 = mutableDateTime65.getYearOfEra();
        boolean boolean73 = mutableDateTime65.isBeforeNow();
        java.util.Locale locale74 = null;
        java.util.Calendar calendar75 = mutableDateTime65.toCalendar(locale74);
        mutableDateTime57.setTime((org.joda.time.ReadableInstant) mutableDateTime65);
        org.joda.time.DateTimeZone dateTimeZone77 = mutableDateTime65.getZone();
        org.joda.time.DateTime dateTime78 = mutableDateTime52.toDateTime(dateTimeZone77);
        org.joda.time.MutableDateTime mutableDateTime79 = new org.joda.time.MutableDateTime(dateTimeZone77);
        mutableDateTime79.addMillis(58);
        mutableDateTime79.setSecondOfMinute(58);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(calendar22);
        org.junit.Assert.assertEquals(calendar22.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(gregorianCalendar29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1970 + "'", int31 == 1970);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(gregorianCalendar60);
        org.junit.Assert.assertNotNull(mutableDateTime61);
        org.junit.Assert.assertNotNull(gregorianCalendar62);
        org.junit.Assert.assertNotNull(chronology68);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1970 + "'", int72 == 1970);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(calendar75);
        org.junit.Assert.assertEquals(calendar75.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone77);
        org.junit.Assert.assertNotNull(dateTime78);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
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
        boolean boolean32 = mutableDateTime11.isBeforeNow();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime11.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(0L, dateTimeZone35);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime36.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(0L, dateTimeZone39);
        mutableDateTime40.setSecondOfMinute((int) '#');
        boolean boolean43 = mutableDateTime36.equals((java.lang.Object) '#');
        org.joda.time.DateTimeField dateTimeField44 = null;
        mutableDateTime36.setRounding(dateTimeField44, 25235000);
        boolean boolean47 = mutableDateTime36.isEqualNow();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime36.era();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime36.era();
        java.util.Date date50 = mutableDateTime36.toDate();
        int int51 = mutableDateTime36.getHourOfDay();
        long long52 = property33.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime36);
        int int53 = mutableDateTime36.getYearOfEra();
        org.joda.time.DateTime dateTime54 = mutableDateTime36.toDateTime();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35000L + "'", long8 == 35000L);
        org.junit.Assert.assertNotNull(gregorianCalendar14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(gregorianCalendar16);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1970 + "'", int26 == 1970);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(calendar29);
        org.junit.Assert.assertEquals(calendar29.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 7 + "'", int51 == 7);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 35L + "'", long52 == 35L);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1970 + "'", int53 == 1970);
        org.junit.Assert.assertNotNull(dateTime54);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.year();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(0L, dateTimeZone9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(0L, dateTimeZone13);
        mutableDateTime14.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology17 = mutableDateTime14.getChronology();
        int int18 = mutableDateTime14.getSecondOfMinute();
        mutableDateTime10.setTime((org.joda.time.ReadableInstant) mutableDateTime14);
        mutableDateTime7.setMillis((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(0L, dateTimeZone22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.monthOfYear();
        long long25 = property24.remainder();
        org.joda.time.MutableDateTime mutableDateTime26 = property24.roundFloor();
        org.joda.time.DateTimeField dateTimeField27 = property24.getField();
        org.joda.time.MutableDateTime mutableDateTime29 = property24.set("1");
        mutableDateTime29.setDayOfWeek(7);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(0L, dateTimeZone33);
        mutableDateTime34.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar37 = mutableDateTime34.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime34.copy();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime34.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime40 = property39.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime42 = property39.addWrapField((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = property39.getFieldType();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime29.property(dateTimeFieldType43);
        org.joda.time.MutableDateTime mutableDateTime46 = property44.addWrapField(4);
        java.util.Date date47 = mutableDateTime46.toDate();
        mutableDateTime7.setTime((org.joda.time.ReadableInstant) mutableDateTime46);
        org.joda.time.ReadableDuration readableDuration49 = null;
        mutableDateTime46.add(readableDuration49, 9);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 25200000L + "'", long25 == 25200000L);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(gregorianCalendar37);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Sun Jan 04 00:04:00 ICT 1970");
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
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
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime2.centuryOfEra();
        java.lang.String str23 = property22.getAsShortText();
        java.lang.String str24 = property22.getAsString();
        org.joda.time.MutableDateTime mutableDateTime25 = property22.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime26 = property22.roundHalfCeiling();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(0L, dateTimeZone28);
        mutableDateTime29.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology32 = mutableDateTime29.getChronology();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime29.year();
        mutableDateTime29.addDays(40);
        java.util.Date date36 = mutableDateTime29.toDate();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime29.dayOfYear();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime29.dayOfMonth();
        long long39 = property38.getMillis();
        org.joda.time.DateTimeField dateTimeField40 = property38.getField();
        int int41 = mutableDateTime26.get(dateTimeField40);
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(calendar20);
        org.junit.Assert.assertEquals(calendar20.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "19" + "'", str23, "19");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "19" + "'", str24, "19");
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Tue Feb 10 07:00:35 ICT 1970");
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 3456035000L + "'", long39 == 3456035000L);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(0L, dateTimeZone5);
        mutableDateTime6.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology9 = mutableDateTime6.getChronology();
        int int10 = mutableDateTime6.getSecondOfMinute();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime6);
        java.util.Date date12 = mutableDateTime2.toDate();
        int int13 = mutableDateTime2.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, dateTimeZone15);
        mutableDateTime16.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology19 = mutableDateTime16.getChronology();
        int int20 = mutableDateTime16.getSecondOfMinute();
        mutableDateTime16.setMinuteOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(0L, dateTimeZone24);
        mutableDateTime25.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar28 = mutableDateTime25.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime25.copy();
        mutableDateTime25.setDayOfYear((int) (byte) 10);
        boolean boolean32 = mutableDateTime16.isBefore((org.joda.time.ReadableInstant) mutableDateTime25);
        int int33 = mutableDateTime25.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(0L, dateTimeZone35);
        mutableDateTime36.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology39 = mutableDateTime36.getChronology();
        org.joda.time.Chronology chronology40 = mutableDateTime36.getChronology();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(0L, dateTimeZone42);
        mutableDateTime43.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar46 = mutableDateTime43.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime43.copy();
        java.util.GregorianCalendar gregorianCalendar48 = mutableDateTime43.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(0L, dateTimeZone50);
        mutableDateTime51.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology54 = mutableDateTime51.getChronology();
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime51.era();
        mutableDateTime51.setDayOfYear((int) (short) 100);
        int int58 = mutableDateTime51.getYearOfEra();
        boolean boolean59 = mutableDateTime51.isBeforeNow();
        java.util.Locale locale60 = null;
        java.util.Calendar calendar61 = mutableDateTime51.toCalendar(locale60);
        mutableDateTime43.setTime((org.joda.time.ReadableInstant) mutableDateTime51);
        org.joda.time.DateTimeZone dateTimeZone63 = mutableDateTime51.getZone();
        org.joda.time.MutableDateTime mutableDateTime64 = org.joda.time.MutableDateTime.now(dateTimeZone63);
        org.joda.time.DateTime dateTime65 = mutableDateTime36.toDateTime(dateTimeZone63);
        mutableDateTime25.setZone(dateTimeZone63);
        boolean boolean67 = mutableDateTime2.equals((java.lang.Object) mutableDateTime25);
        org.joda.time.MutableDateTime.Property property68 = mutableDateTime2.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime70 = property68.add((long) 25200012);
        mutableDateTime70.setWeekyear(25200012);
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime70.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime(0L, dateTimeZone75);
        mutableDateTime76.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology79 = mutableDateTime76.getChronology();
        int int80 = mutableDateTime76.getSecondOfMinute();
        int int81 = mutableDateTime76.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone83 = null;
        org.joda.time.MutableDateTime mutableDateTime84 = new org.joda.time.MutableDateTime(0L, dateTimeZone83);
        mutableDateTime84.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar87 = mutableDateTime84.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime88 = mutableDateTime84.copy();
        org.joda.time.MutableDateTime.Property property89 = mutableDateTime84.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime90 = property89.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime92 = property89.addWrapField((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType93 = property89.getFieldType();
        mutableDateTime76.set(dateTimeFieldType93, (int) (short) 1);
        mutableDateTime70.setTime((org.joda.time.ReadableInstant) mutableDateTime76);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 07:00:35 ICT 1970");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(gregorianCalendar28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(gregorianCalendar46);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertNotNull(gregorianCalendar48);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1970 + "'", int58 == 1970);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(calendar61);
        org.junit.Assert.assertEquals(calendar61.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertNotNull(mutableDateTime64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(mutableDateTime70);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(chronology79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 35 + "'", int80 == 35);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 420 + "'", int81 == 420);
        org.junit.Assert.assertNotNull(gregorianCalendar87);
        org.junit.Assert.assertNotNull(mutableDateTime88);
        org.junit.Assert.assertNotNull(property89);
        org.junit.Assert.assertNotNull(mutableDateTime90);
        org.junit.Assert.assertNotNull(mutableDateTime92);
        org.junit.Assert.assertNotNull(dateTimeFieldType93);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(0L, dateTimeZone5);
        mutableDateTime6.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology9 = mutableDateTime6.getChronology();
        int int10 = mutableDateTime6.getSecondOfMinute();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime6);
        java.util.Date date12 = mutableDateTime2.toDate();
        int int13 = mutableDateTime2.getMillisOfSecond();
        boolean boolean15 = mutableDateTime2.isBefore((long) 292278993);
        int int16 = mutableDateTime2.getYearOfEra();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 07:00:35 ICT 1970");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1970 + "'", int16 == 1970);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTime dateTime4 = mutableDateTime2.toDateTime();
        mutableDateTime2.addDays(33);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(0L, dateTimeZone2);
        mutableDateTime3.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime3.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime3.copy();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField((int) '#');
        org.joda.time.MutableDateTime mutableDateTime13 = property8.add(4);
        int int14 = property8.getMinimumValue();
        java.lang.String str15 = property8.getName();
        org.joda.time.MutableDateTime mutableDateTime17 = property8.add(0L);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(0L, dateTimeZone19);
        java.util.Date date21 = mutableDateTime20.toDate();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.era();
        boolean boolean24 = mutableDateTime20.isEqual(0L);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.secondOfMinute();
        int int26 = property8.compareTo((org.joda.time.ReadableInstant) mutableDateTime20);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(0L, dateTimeZone28);
        mutableDateTime29.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar32 = mutableDateTime29.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime29.copy();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime29.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime35 = property34.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime37 = property34.addWrapField((int) (byte) 0);
        int int38 = mutableDateTime37.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(0L, dateTimeZone40);
        mutableDateTime41.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar44 = mutableDateTime41.toGregorianCalendar();
        mutableDateTime41.setTime(100L);
        boolean boolean47 = mutableDateTime37.isBefore((org.joda.time.ReadableInstant) mutableDateTime41);
        int int48 = mutableDateTime41.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(0L, dateTimeZone50);
        mutableDateTime51.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar54 = mutableDateTime51.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime55 = mutableDateTime51.copy();
        int int56 = mutableDateTime55.getWeekyear();
        mutableDateTime55.addWeeks((int) (short) 100);
        mutableDateTime55.addMonths((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime(0L, dateTimeZone62);
        mutableDateTime63.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology66 = mutableDateTime63.getChronology();
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime63.year();
        int int68 = property67.getMaximumValueOverall();
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = property67.getFieldType();
        int int70 = mutableDateTime55.get(dateTimeFieldType69);
        mutableDateTime41.set(dateTimeFieldType69, 58);
        boolean boolean73 = mutableDateTime20.isSupported(dateTimeFieldType69);
        int int74 = mutableDateTime20.getRoundingMode();
        java.util.GregorianCalendar gregorianCalendar75 = mutableDateTime20.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime76 = mutableDateTime20.copy();
        org.joda.time.Chronology chronology77 = mutableDateTime20.getChronology();
        org.joda.time.MutableDateTime mutableDateTime78 = new org.joda.time.MutableDateTime(chronology77);
        org.joda.time.MutableDateTime mutableDateTime79 = new org.joda.time.MutableDateTime((long) (-3), chronology77);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "minuteOfHour" + "'", str15, "minuteOfHour");
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(gregorianCalendar32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1970 + "'", int38 == 1970);
        org.junit.Assert.assertNotNull(gregorianCalendar44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 4 + "'", int48 == 4);
        org.junit.Assert.assertNotNull(gregorianCalendar54);
        org.junit.Assert.assertNotNull(mutableDateTime55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1970 + "'", int56 == 1970);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 292278993 + "'", int68 == 292278993);
        org.junit.Assert.assertNotNull(dateTimeFieldType69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1980 + "'", int70 == 1980);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(gregorianCalendar75);
        org.junit.Assert.assertNotNull(mutableDateTime76);
        org.junit.Assert.assertNotNull(chronology77);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.era();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.set((int) (byte) 1);
        java.util.Locale locale9 = null;
        int int10 = property6.getMaximumShortTextLength(locale9);
        int int11 = property6.getMinimumValueOverall();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property6.getAsText(locale12);
        int int14 = property6.getMinimumValue();
        java.lang.String str15 = property6.getAsString();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "20) test3180(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u0e04\u0e28." + "'", str13, "\u0e04\u0e28.");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
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
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology13);
        int int17 = mutableDateTime16.getWeekOfWeekyear();
        mutableDateTime16.setWeekyear((int) (byte) -1);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime16.era();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.millisOfDay();
        int int22 = property21.getMaximumValue();
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 40 + "'", int17 == 40);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 86399999 + "'", int22 == 86399999);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
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
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology13);
        int int17 = mutableDateTime16.getWeekOfWeekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime16.toString(dateTimeFormatter18);
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime16.copy();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.secondOfDay();
        int int22 = property21.getMaximumValueOverall();
        java.util.Locale locale23 = null;
        java.lang.String str24 = property21.getAsShortText(locale23);
        org.joda.time.MutableDateTime mutableDateTime25 = property21.roundCeiling();
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 40 + "'", int17 == 40);
// flaky "21) test3182(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2026-09-28T14:48:49.580+07:00" + "'", str19, "2026-09-28T14:48:49.580+07:00");
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 86399 + "'", int22 == 86399);
// flaky "6) test3182(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "53329" + "'", str24, "53329");
        org.junit.Assert.assertNotNull(mutableDateTime25);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
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
        int int16 = mutableDateTime2.getMillisOfSecond();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime2.yearOfEra();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime2.centuryOfEra();
        java.lang.Object obj19 = mutableDateTime2.clone();
        mutableDateTime2.setMillis(1L);
        mutableDateTime2.addSeconds(1);
        java.util.GregorianCalendar gregorianCalendar24 = mutableDateTime2.toGregorianCalendar();
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "1970-01-01T07:00:00.000+07:00");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "1970-01-01T07:00:00.000+07:00");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "1970-01-01T07:00:00.000+07:00");
        org.junit.Assert.assertNotNull(gregorianCalendar24);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.year();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.getMutableDateTime();
        org.joda.time.DurationField durationField8 = property6.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(0L, dateTimeZone10);
        mutableDateTime11.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology14 = mutableDateTime11.getChronology();
        org.joda.time.Chronology chronology15 = mutableDateTime11.getChronology();
        boolean boolean16 = mutableDateTime11.isEqualNow();
        int int17 = property6.compareTo((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime11.year();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundHalfFloor();
        mutableDateTime19.setYear(1980);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime19.setDayOfMonth(53324418);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53324418 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNull(durationField8);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.year();
        int int7 = property6.getMaximumValueOverall();
        java.lang.String str8 = property6.getAsText();
        org.joda.time.DurationField durationField9 = property6.getLeapDurationField();
        org.joda.time.MutableDateTime mutableDateTime10 = property6.roundHalfFloor();
        org.joda.time.Chronology chronology11 = mutableDateTime10.getChronology();
        mutableDateTime10.addYears(1);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime10.setDateTime(1870, (int) (byte) 0, 843, 25200012, 1968, (int) (short) 10, 26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25200012 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 292278993 + "'", int7 == 292278993);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970" + "'", str8, "1970");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.addWrapField((int) (byte) 0);
        int int11 = mutableDateTime10.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(0L, dateTimeZone13);
        mutableDateTime14.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar17 = mutableDateTime14.toGregorianCalendar();
        mutableDateTime14.setTime(100L);
        boolean boolean20 = mutableDateTime10.isBefore((org.joda.time.ReadableInstant) mutableDateTime14);
        mutableDateTime10.setSecondOfMinute((int) '#');
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(0L, dateTimeZone24);
        mutableDateTime25.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology28 = mutableDateTime25.getChronology();
        int int29 = mutableDateTime25.getSecondOfMinute();
        mutableDateTime25.setMinuteOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(0L, dateTimeZone33);
        mutableDateTime34.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar37 = mutableDateTime34.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime34.copy();
        mutableDateTime34.setDayOfYear((int) (byte) 10);
        boolean boolean41 = mutableDateTime25.isBefore((org.joda.time.ReadableInstant) mutableDateTime34);
        org.joda.time.MutableDateTime mutableDateTime42 = mutableDateTime34.copy();
        int int43 = mutableDateTime10.compareTo((org.joda.time.ReadableInstant) mutableDateTime34);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime34.year();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime34.weekyear();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime34.secondOfMinute();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertNotNull(gregorianCalendar17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertNotNull(gregorianCalendar37);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(property46);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("0");
        mutableDateTime1.add((long) 59);
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.parse("0");
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(0L, dateTimeZone8);
        mutableDateTime9.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology12 = mutableDateTime9.getChronology();
        int int13 = mutableDateTime9.getSecondOfMinute();
        mutableDateTime9.setMinuteOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(0L, dateTimeZone17);
        mutableDateTime18.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar21 = mutableDateTime18.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime18.copy();
        mutableDateTime18.setDayOfYear((int) (byte) 10);
        boolean boolean25 = mutableDateTime9.isBefore((org.joda.time.ReadableInstant) mutableDateTime18);
        int int26 = mutableDateTime18.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(0L, dateTimeZone28);
        mutableDateTime29.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology32 = mutableDateTime29.getChronology();
        org.joda.time.Chronology chronology33 = mutableDateTime29.getChronology();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(0L, dateTimeZone35);
        mutableDateTime36.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar39 = mutableDateTime36.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime36.copy();
        java.util.GregorianCalendar gregorianCalendar41 = mutableDateTime36.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(0L, dateTimeZone43);
        mutableDateTime44.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology47 = mutableDateTime44.getChronology();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime44.era();
        mutableDateTime44.setDayOfYear((int) (short) 100);
        int int51 = mutableDateTime44.getYearOfEra();
        boolean boolean52 = mutableDateTime44.isBeforeNow();
        java.util.Locale locale53 = null;
        java.util.Calendar calendar54 = mutableDateTime44.toCalendar(locale53);
        mutableDateTime36.setTime((org.joda.time.ReadableInstant) mutableDateTime44);
        org.joda.time.DateTimeZone dateTimeZone56 = mutableDateTime44.getZone();
        org.joda.time.MutableDateTime mutableDateTime57 = org.joda.time.MutableDateTime.now(dateTimeZone56);
        org.joda.time.DateTime dateTime58 = mutableDateTime29.toDateTime(dateTimeZone56);
        mutableDateTime18.setZone(dateTimeZone56);
        org.joda.time.DateTime dateTime60 = mutableDateTime6.toDateTime(dateTimeZone56);
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime((long) (-680), dateTimeZone56);
        mutableDateTime61.addMinutes(25200012);
        int int64 = mutableDateTime61.getRoundingMode();
        int int65 = mutableDateTime61.getWeekOfWeekyear();
        boolean boolean66 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) mutableDateTime61);
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        mutableDateTime1.add(readablePeriod67, 18);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(gregorianCalendar21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(gregorianCalendar39);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(gregorianCalendar41);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1970 + "'", int51 == 1970);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(calendar54);
        org.junit.Assert.assertEquals(calendar54.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(mutableDateTime57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 48 + "'", int65 == 48);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.year();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.getMutableDateTime();
        org.joda.time.DurationField durationField8 = property6.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(0L, dateTimeZone10);
        mutableDateTime11.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology14 = mutableDateTime11.getChronology();
        org.joda.time.Chronology chronology15 = mutableDateTime11.getChronology();
        boolean boolean16 = mutableDateTime11.isEqualNow();
        int int17 = property6.compareTo((org.joda.time.ReadableInstant) mutableDateTime11);
        java.util.Date date18 = mutableDateTime11.toDate();
        org.joda.time.ReadableDuration readableDuration19 = null;
        mutableDateTime11.add(readableDuration19, 25235);
        mutableDateTime11.addHours((int) (byte) 0);
        int int24 = mutableDateTime11.getDayOfYear();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime11.weekyear();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNull(durationField8);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 07:00:35 ICT 1970");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        java.util.Locale locale5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = property3.set("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21", locale5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(0L, dateTimeZone8);
        mutableDateTime9.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology12 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime9.year();
        int int14 = property13.getMaximumValueOverall();
        java.lang.String str15 = property13.getAsText();
        org.joda.time.DurationField durationField16 = property13.getLeapDurationField();
        org.joda.time.MutableDateTime mutableDateTime17 = property13.roundHalfFloor();
        mutableDateTime17.setYear(10);
        boolean boolean20 = mutableDateTime6.isBefore((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(0L, dateTimeZone22);
        mutableDateTime23.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar26 = mutableDateTime23.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime23.copy();
        int int28 = mutableDateTime27.getWeekyear();
        mutableDateTime27.addWeeks((int) (short) 100);
        mutableDateTime27.addMonths((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(0L, dateTimeZone34);
        mutableDateTime35.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology38 = mutableDateTime35.getChronology();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime35.year();
        int int40 = property39.getMaximumValueOverall();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property39.getFieldType();
        int int42 = mutableDateTime27.get(dateTimeFieldType41);
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime6.minuteOfHour();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime6.era();
        int int46 = mutableDateTime6.getSecondOfDay();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 292278993 + "'", int14 == 292278993);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970" + "'", str15, "1970");
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(gregorianCalendar26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1970 + "'", int28 == 1970);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 292278993 + "'", int40 == 292278993);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1980 + "'", int42 == 1980);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 25235 + "'", int46 == 25235);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.weekyear();
        mutableDateTime2.addMillis(336);
        mutableDateTime2.addWeekyears(25200000);
        int int11 = mutableDateTime2.getSecondOfMinute();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.era();
        int int7 = mutableDateTime2.getMillisOfDay();
        org.joda.time.DateTime dateTime8 = mutableDateTime2.toDateTimeISO();
        int int9 = dateTime8.getSecondOfDay();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 25235000 + "'", int7 == 25235000);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25235 + "'", int9 == 25235);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.year();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.getMutableDateTime();
        org.joda.time.DurationField durationField8 = property6.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime10 = property6.set(292278993);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime10.add(readableDuration11);
        boolean boolean14 = mutableDateTime10.isAfter(62135622000000L);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.secondOfDay();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNull(durationField8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(0L, dateTimeZone5);
        mutableDateTime6.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology9 = mutableDateTime6.getChronology();
        int int10 = mutableDateTime6.getSecondOfMinute();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime6);
        int int12 = mutableDateTime2.getYear();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.add((long) 1);
        org.joda.time.Interval interval16 = property13.toInterval();
        org.joda.time.MutableDateTime mutableDateTime17 = property13.roundHalfEven();
        int int18 = mutableDateTime17.getMillisOfSecond();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        mutableDateTime2.addMillis((-1));
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.add((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(0L, dateTimeZone12);
        mutableDateTime13.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology16 = mutableDateTime13.getChronology();
        int int17 = mutableDateTime13.getSecondOfMinute();
        int int18 = mutableDateTime13.getMinuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) 12);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(0L, dateTimeZone23);
        mutableDateTime24.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar27 = mutableDateTime24.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime24.copy();
        java.util.GregorianCalendar gregorianCalendar29 = mutableDateTime24.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(0L, dateTimeZone31);
        mutableDateTime32.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology35 = mutableDateTime32.getChronology();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime32.era();
        mutableDateTime32.setDayOfYear((int) (short) 100);
        int int39 = mutableDateTime32.getYearOfEra();
        boolean boolean40 = mutableDateTime32.isBeforeNow();
        java.util.Locale locale41 = null;
        java.util.Calendar calendar42 = mutableDateTime32.toCalendar(locale41);
        mutableDateTime24.setTime((org.joda.time.ReadableInstant) mutableDateTime32);
        org.joda.time.DateTimeZone dateTimeZone44 = mutableDateTime32.getZone();
        mutableDateTime20.setZone(dateTimeZone44);
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime13.toMutableDateTime(dateTimeZone44);
        mutableDateTime46.setMillisOfSecond((int) (byte) 1);
        boolean boolean49 = mutableDateTime46.isBeforeNow();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime46.monthOfYear();
        int int51 = mutableDateTime46.getRoundingMode();
        int int52 = mutableDateTime46.getWeekyear();
        int int53 = property8.compareTo((org.joda.time.ReadableInstant) mutableDateTime46);
        int int54 = mutableDateTime46.getMillisOfDay();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 420 + "'", int18 == 420);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(gregorianCalendar27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(gregorianCalendar29);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1970 + "'", int39 == 1970);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(calendar42);
        org.junit.Assert.assertEquals(calendar42.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1970 + "'", int52 == 1970);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 25235001 + "'", int54 == 25235001);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(0L, dateTimeZone5);
        mutableDateTime6.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology9 = mutableDateTime6.getChronology();
        int int10 = mutableDateTime6.getSecondOfMinute();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime6);
        mutableDateTime2.setSecondOfDay(0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(chronology5);
        mutableDateTime6.addHours(2004);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(0L, dateTimeZone10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.monthOfYear();
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = property12.getDifference(readableInstant13);
        org.joda.time.MutableDateTime mutableDateTime15 = property12.roundHalfCeiling();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(0L, dateTimeZone17);
        java.util.Date date19 = mutableDateTime18.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        boolean boolean21 = mutableDateTime18.isSupported(dateTimeFieldType20);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(0L, dateTimeZone24);
        mutableDateTime25.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology28 = mutableDateTime25.getChronology();
        org.joda.time.Chronology chronology29 = mutableDateTime25.getChronology();
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) ' ', chronology29);
        org.joda.time.DateTime dateTime31 = mutableDateTime18.toDateTime(chronology29);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(chronology29);
        int int33 = mutableDateTime32.getWeekOfWeekyear();
        int int34 = mutableDateTime32.getRoundingMode();
        java.lang.Object obj35 = mutableDateTime32.clone();
        boolean boolean36 = mutableDateTime32.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(0L, dateTimeZone38);
        mutableDateTime39.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar42 = mutableDateTime39.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime39.copy();
        int int44 = mutableDateTime43.getWeekyear();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime43.year();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(0L, dateTimeZone47);
        mutableDateTime48.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology51 = mutableDateTime48.getChronology();
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime48.era();
        mutableDateTime48.setDayOfYear((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(0L, dateTimeZone56);
        java.util.Date date58 = mutableDateTime57.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = null;
        boolean boolean60 = mutableDateTime57.isSupported(dateTimeFieldType59);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime(0L, dateTimeZone63);
        mutableDateTime64.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology67 = mutableDateTime64.getChronology();
        org.joda.time.Chronology chronology68 = mutableDateTime64.getChronology();
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime((long) ' ', chronology68);
        org.joda.time.DateTime dateTime70 = mutableDateTime57.toDateTime(chronology68);
        org.joda.time.MutableDateTime mutableDateTime71 = new org.joda.time.MutableDateTime(chronology68);
        mutableDateTime48.setChronology(chronology68);
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.MutableDateTime mutableDateTime75 = new org.joda.time.MutableDateTime(0L, dateTimeZone74);
        mutableDateTime75.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar78 = mutableDateTime75.toGregorianCalendar();
        mutableDateTime75.setSecondOfDay(10);
        int int81 = mutableDateTime75.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone82 = mutableDateTime75.getZone();
        org.joda.time.MutableDateTime mutableDateTime83 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime48, dateTimeZone82);
        org.joda.time.DateTime dateTime84 = mutableDateTime43.toDateTime(dateTimeZone82);
        org.joda.time.DateTime dateTime85 = mutableDateTime32.toDateTime(dateTimeZone82);
        mutableDateTime32.setYear((-680));
        int int88 = property12.getDifference((org.joda.time.ReadableInstant) mutableDateTime32);
        org.joda.time.MutableDateTime mutableDateTime89 = property12.roundCeiling();
        org.joda.time.Chronology chronology90 = mutableDateTime89.getChronology();
        org.joda.time.MutableDateTime mutableDateTime91 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime6, chronology90);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-680) + "'", int14 == (-680));
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 40 + "'", int33 == 40);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(obj35);
// flaky "22) test3196(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals(obj35.toString(), "2026-09-28T14:48:49.695+07:00");
// flaky "7) test3196(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "2026-09-28T14:48:49.695+07:00");
// flaky "6) test3196(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "2026-09-28T14:48:49.695+07:00");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(gregorianCalendar42);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1970 + "'", int44 == 1970);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertNotNull(chronology68);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(gregorianCalendar78);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone82);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 31791 + "'", int88 == 31791);
        org.junit.Assert.assertNotNull(mutableDateTime89);
        org.junit.Assert.assertNotNull(chronology90);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(0L, dateTimeZone10);
        mutableDateTime11.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar14 = mutableDateTime11.toGregorianCalendar();
        int int15 = mutableDateTime11.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(0L, dateTimeZone17);
        mutableDateTime18.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar21 = mutableDateTime18.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime18.copy();
        java.util.GregorianCalendar gregorianCalendar23 = mutableDateTime18.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(0L, dateTimeZone25);
        mutableDateTime26.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology29 = mutableDateTime26.getChronology();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime26.era();
        mutableDateTime26.setDayOfYear((int) (short) 100);
        int int33 = mutableDateTime26.getYearOfEra();
        boolean boolean34 = mutableDateTime26.isBeforeNow();
        java.util.Locale locale35 = null;
        java.util.Calendar calendar36 = mutableDateTime26.toCalendar(locale35);
        mutableDateTime18.setTime((org.joda.time.ReadableInstant) mutableDateTime26);
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime26.getZone();
        org.joda.time.MutableDateTime mutableDateTime39 = org.joda.time.MutableDateTime.now(dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(0L, dateTimeZone41);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime42.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(0L, dateTimeZone45);
        mutableDateTime46.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology49 = mutableDateTime46.getChronology();
        org.joda.time.Chronology chronology50 = mutableDateTime46.getChronology();
        org.joda.time.DateTime dateTime51 = mutableDateTime42.toDateTime(chronology50);
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime39, chronology50);
        org.joda.time.MutableDateTime mutableDateTime53 = mutableDateTime11.toMutableDateTime(chronology50);
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime((java.lang.Object) "1970", chronology50);
        org.joda.time.DateTime dateTime55 = mutableDateTime7.toDateTime(chronology50);
        int int56 = mutableDateTime7.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime7.weekOfWeekyear();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(gregorianCalendar14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertNotNull(gregorianCalendar21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(gregorianCalendar23);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1970 + "'", int33 == 1970);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(calendar36);
        org.junit.Assert.assertEquals(calendar36.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(mutableDateTime53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(property57);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTime dateTime4 = mutableDateTime2.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.copy();
        int int6 = mutableDateTime2.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(0L, dateTimeZone8);
        mutableDateTime9.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology12 = mutableDateTime9.getChronology();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        boolean boolean14 = mutableDateTime9.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(0L, dateTimeZone17);
        mutableDateTime18.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology21 = mutableDateTime18.getChronology();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) ' ', chronology22);
        org.joda.time.DateTime dateTime24 = mutableDateTime9.toDateTime(chronology22);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(0L, dateTimeZone27);
        mutableDateTime28.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar31 = mutableDateTime28.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime28.copy();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime34 = property33.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime36 = property33.addWrapField((int) (byte) 0);
        java.lang.String str37 = property33.getAsString();
        int int38 = property33.getMinimumValue();
        org.joda.time.MutableDateTime mutableDateTime39 = property33.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(0L, dateTimeZone41);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime42.monthOfYear();
        long long44 = property43.remainder();
        org.joda.time.MutableDateTime mutableDateTime45 = property43.roundFloor();
        org.joda.time.DateTimeField dateTimeField46 = property43.getField();
        org.joda.time.MutableDateTime mutableDateTime48 = property43.set("1");
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime48.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime48.toMutableDateTime();
        long long51 = property33.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime48);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = property33.getFieldType();
        int int53 = dateTime24.get(dateTimeFieldType52);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(gregorianCalendar31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1" + "'", str37, "1");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 25200000L + "'", long44 == 25200000L);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertNotNull(mutableDateTime49);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 421L + "'", long51 == 421L);
        org.junit.Assert.assertNotNull(dateTimeFieldType52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(0L, dateTimeZone2);
        java.util.Date date4 = mutableDateTime3.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        boolean boolean6 = mutableDateTime3.isSupported(dateTimeFieldType5);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(0L, dateTimeZone9);
        mutableDateTime10.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology13 = mutableDateTime10.getChronology();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) ' ', chronology14);
        org.joda.time.DateTime dateTime16 = mutableDateTime3.toDateTime(chronology14);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(chronology14);
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology14);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(0L, dateTimeZone21);
        mutableDateTime22.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology25 = mutableDateTime22.getChronology();
        org.joda.time.Chronology chronology26 = mutableDateTime22.getChronology();
        boolean boolean27 = mutableDateTime22.isEqualNow();
        mutableDateTime18.setTime((org.joda.time.ReadableInstant) mutableDateTime22);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(0L, dateTimeZone30);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime31.monthOfYear();
        org.joda.time.DateTime dateTime33 = mutableDateTime31.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime31.copy();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(0L, dateTimeZone36);
        mutableDateTime37.setSecondOfMinute((int) '#');
        java.lang.Object obj40 = mutableDateTime37.clone();
        mutableDateTime37.setWeekyear(40);
        org.joda.time.DateTimeZone dateTimeZone43 = mutableDateTime37.getZone();
        org.joda.time.MutableDateTime mutableDateTime44 = mutableDateTime31.toMutableDateTime(dateTimeZone43);
        mutableDateTime22.setZoneRetainFields(dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(1790581710170L, dateTimeZone43);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals(obj40.toString(), "1970-01-01T07:00:35.000+07:00");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj40), "1970-01-01T07:00:35.000+07:00");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj40), "1970-01-01T07:00:35.000+07:00");
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(mutableDateTime44);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        java.util.Date date3 = mutableDateTime2.toDate();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.era();
        int int5 = property4.getMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(0L, dateTimeZone7);
        mutableDateTime8.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology11 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime8.era();
        mutableDateTime8.setDayOfYear((int) (short) 100);
        int int15 = mutableDateTime8.getYearOfEra();
        boolean boolean16 = mutableDateTime8.isBeforeNow();
        java.util.Locale locale17 = null;
        java.util.Calendar calendar18 = mutableDateTime8.toCalendar(locale17);
        mutableDateTime8.setMillis((long) 0);
        int int21 = mutableDateTime8.getYear();
        long long22 = mutableDateTime8.getMillis();
        java.util.Locale locale23 = null;
        java.util.Calendar calendar24 = mutableDateTime8.toCalendar(locale23);
        int int25 = property4.compareTo((org.joda.time.ReadableInstant) mutableDateTime8);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(calendar18);
        org.junit.Assert.assertEquals(calendar18.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1970 + "'", int21 == 1970);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(calendar24);
        org.junit.Assert.assertEquals(calendar24.toString(), "sun.util.BuddhistCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(0L, dateTimeZone5);
        mutableDateTime6.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology9 = mutableDateTime6.getChronology();
        org.joda.time.Chronology chronology10 = mutableDateTime6.getChronology();
        org.joda.time.DateTime dateTime11 = mutableDateTime2.toDateTime(chronology10);
        mutableDateTime2.addDays(100);
        int int14 = mutableDateTime2.getMillisOfDay();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 25200000 + "'", int14 == 25200000);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.year();
        org.joda.time.ReadableInstant readableInstant7 = null;
        mutableDateTime2.setDate(readableInstant7);
        int int9 = mutableDateTime2.getMonthOfYear();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        java.util.GregorianCalendar gregorianCalendar7 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.hourOfDay();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime8.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(0L, dateTimeZone11);
        mutableDateTime12.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology15 = mutableDateTime12.getChronology();
        org.joda.time.DateTime dateTime16 = mutableDateTime8.toDateTime(chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime8.toMutableDateTime();
        int int18 = mutableDateTime17.getWeekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime17.toString(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1970 + "'", int18 == 1970);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01T07:01:00.000+07:00" + "'", str20, "1970-01-01T07:01:00.000+07:00");
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.era();
        mutableDateTime2.setDayOfYear((int) (short) 100);
        int int9 = mutableDateTime2.getDayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = null;
        mutableDateTime2.setRounding(dateTimeField10);
        mutableDateTime2.addWeekyears((int) (byte) 1);
        boolean boolean15 = mutableDateTime2.isEqual(42000L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime2.toString(dateTimeFormatter16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(0L, dateTimeZone19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(0L, dateTimeZone23);
        mutableDateTime24.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology27 = mutableDateTime24.getChronology();
        int int28 = mutableDateTime24.getSecondOfMinute();
        mutableDateTime20.setTime((org.joda.time.ReadableInstant) mutableDateTime24);
        mutableDateTime20.setSecondOfMinute((int) (short) 0);
        boolean boolean32 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime20);
        int int33 = mutableDateTime20.getEra();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(0L, dateTimeZone35);
        mutableDateTime36.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology39 = mutableDateTime36.getChronology();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime36.year();
        org.joda.time.MutableDateTime mutableDateTime41 = property40.getMutableDateTime();
        org.joda.time.DurationField durationField42 = property40.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(0L, dateTimeZone44);
        mutableDateTime45.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology48 = mutableDateTime45.getChronology();
        org.joda.time.Chronology chronology49 = mutableDateTime45.getChronology();
        boolean boolean50 = mutableDateTime45.isEqualNow();
        int int51 = property40.compareTo((org.joda.time.ReadableInstant) mutableDateTime45);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime45.year();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime45.yearOfEra();
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime45.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(0L, dateTimeZone57);
        mutableDateTime58.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology61 = mutableDateTime58.getChronology();
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime58.era();
        org.joda.time.Chronology chronology63 = property62.getChronology();
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime((long) 25235000, chronology63);
        boolean boolean65 = mutableDateTime45.isAfter((org.joda.time.ReadableInstant) mutableDateTime64);
        boolean boolean66 = mutableDateTime20.isBefore((org.joda.time.ReadableInstant) mutableDateTime45);
        int int67 = mutableDateTime45.getDayOfMonth();
        org.joda.time.MutableDateTime.Property property68 = mutableDateTime45.yearOfEra();
        int int69 = mutableDateTime45.getEra();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1971-04-16T07:00:35.000+07:00" + "'", str17, "1971-04-16T07:00:35.000+07:00");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNull(durationField42);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(0L, dateTimeZone5);
        mutableDateTime6.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology9 = mutableDateTime6.getChronology();
        int int10 = mutableDateTime6.getSecondOfMinute();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime6);
        int int12 = mutableDateTime2.getYear();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.set(5);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.millisOfSecond();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
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
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology13);
        int int17 = mutableDateTime16.getWeekOfWeekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime16.toString(dateTimeFormatter18);
        mutableDateTime16.addMonths(25235);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime16.minuteOfDay();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime16.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(0L, dateTimeZone25);
        mutableDateTime26.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology29 = mutableDateTime26.getChronology();
        int int30 = mutableDateTime26.getSecondOfMinute();
        boolean boolean31 = mutableDateTime26.isEqualNow();
        mutableDateTime26.setYear((int) '#');
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(0L, dateTimeZone35);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime36.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(0L, dateTimeZone39);
        mutableDateTime40.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology43 = mutableDateTime40.getChronology();
        int int44 = mutableDateTime40.getSecondOfMinute();
        mutableDateTime36.setTime((org.joda.time.ReadableInstant) mutableDateTime40);
        mutableDateTime36.setSecondOfMinute((int) (short) 0);
        mutableDateTime36.addMonths(0);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(0L, dateTimeZone51);
        mutableDateTime52.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology55 = mutableDateTime52.getChronology();
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime52.era();
        org.joda.time.MutableDateTime mutableDateTime58 = property56.set((int) (byte) 1);
        org.joda.time.Chronology chronology59 = mutableDateTime58.getChronology();
        org.joda.time.MutableDateTime mutableDateTime60 = mutableDateTime36.toMutableDateTime(chronology59);
        org.joda.time.DateTimeZone dateTimeZone61 = mutableDateTime60.getZone();
        mutableDateTime26.setZone(dateTimeZone61);
        org.joda.time.DateTime dateTime63 = mutableDateTime16.toDateTime(dateTimeZone61);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 40 + "'", int17 == 40);
// flaky "23) test3207(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2026-09-28T14:48:49.830+07:00" + "'", str19, "2026-09-28T14:48:49.830+07:00");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 35 + "'", int44 == 35);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(mutableDateTime58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(mutableDateTime60);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertNotNull(dateTime63);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        mutableDateTime2.setSecondOfDay(10);
        int int8 = mutableDateTime2.getDayOfYear();
        org.joda.time.ReadableInstant readableInstant9 = null;
        mutableDateTime2.setTime(readableInstant9);
        boolean boolean11 = mutableDateTime2.isBeforeNow();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.era();
        int int7 = mutableDateTime2.getEra();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableDateTime2.add(readablePeriod8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(0L, dateTimeZone11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.monthOfYear();
        org.joda.time.DateTime dateTime14 = mutableDateTime12.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime12.copy();
        org.joda.time.DateTimeField dateTimeField16 = mutableDateTime15.getRoundingField();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(0L, dateTimeZone18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.monthOfYear();
        org.joda.time.DateTime dateTime21 = mutableDateTime19.toDateTime();
        java.util.Locale locale22 = null;
        java.util.Calendar calendar23 = dateTime21.toCalendar(locale22);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(0L, dateTimeZone25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.monthOfYear();
        long long28 = property27.remainder();
        org.joda.time.MutableDateTime mutableDateTime29 = property27.roundFloor();
        org.joda.time.DateTimeField dateTimeField30 = property27.getField();
        int int31 = dateTime21.get(dateTimeField30);
        int int32 = mutableDateTime15.get(dateTimeField30);
        org.joda.time.DateTime dateTime33 = mutableDateTime15.toDateTime();
        int int34 = mutableDateTime15.getMonthOfYear();
        int int35 = mutableDateTime15.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(0L, dateTimeZone37);
        mutableDateTime38.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar41 = mutableDateTime38.toGregorianCalendar();
        mutableDateTime38.setSecondOfDay(10);
        int int44 = mutableDateTime38.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone45 = mutableDateTime38.getZone();
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime15.toMutableDateTime(dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime2.toMutableDateTime(dateTimeZone45);
        boolean boolean48 = mutableDateTime47.isBeforeNow();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime47.secondOfDay();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNull(dateTimeField16);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(calendar23);
        org.junit.Assert.assertEquals(calendar23.toString(), "sun.util.BuddhistCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 25200000L + "'", long28 == 25200000L);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 7 + "'", int35 == 7);
        org.junit.Assert.assertNotNull(gregorianCalendar41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(property49);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.era();
        mutableDateTime2.setDayOfYear((int) (short) 100);
        int int9 = mutableDateTime2.getDayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = null;
        mutableDateTime2.setRounding(dateTimeField10);
        int int12 = mutableDateTime2.getYear();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime2.year();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        mutableDateTime2.setDate(0L);
        int int9 = mutableDateTime2.getYearOfEra();
        java.util.Locale locale10 = null;
        java.util.Calendar calendar11 = mutableDateTime2.toCalendar(locale10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.yearOfEra();
        java.util.Locale locale13 = null;
        java.lang.String str14 = property12.getAsShortText(locale13);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "sun.util.BuddhistCalendar[time=35000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970" + "'", str14, "1970");
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfDay();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property7.getAsText(locale8);
        int int10 = property7.getMinimumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime12 = property7.set(2004);
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime15 = property7.set("Property[monthOfYear]", locale14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Property[monthOfYear]\" for secondOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "25235" + "'", str9, "25235");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(0L, dateTimeZone2);
        mutableDateTime3.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology6 = mutableDateTime3.getChronology();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime3.year();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.getMutableDateTime();
        org.joda.time.DurationField durationField9 = property7.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime12 = property7.set(25235000);
        org.joda.time.MutableDateTime mutableDateTime14 = property7.add((int) (short) 10);
        org.joda.time.Interval interval15 = property7.toInterval();
        org.joda.time.MutableDateTime mutableDateTime17 = property7.addWrapField((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime17.add(readablePeriod18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(0L, dateTimeZone21);
        mutableDateTime22.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar25 = mutableDateTime22.toGregorianCalendar();
        mutableDateTime22.addMillis((-1));
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime22.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.roundHalfEven();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(0L, dateTimeZone31);
        mutableDateTime32.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar35 = mutableDateTime32.toGregorianCalendar();
        int int36 = mutableDateTime32.getMillisOfDay();
        org.joda.time.Chronology chronology37 = mutableDateTime32.getChronology();
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
        int int57 = mutableDateTime49.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(0L, dateTimeZone59);
        mutableDateTime60.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology63 = mutableDateTime60.getChronology();
        org.joda.time.Chronology chronology64 = mutableDateTime60.getChronology();
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime(0L, dateTimeZone66);
        mutableDateTime67.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar70 = mutableDateTime67.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime71 = mutableDateTime67.copy();
        java.util.GregorianCalendar gregorianCalendar72 = mutableDateTime67.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.MutableDateTime mutableDateTime75 = new org.joda.time.MutableDateTime(0L, dateTimeZone74);
        mutableDateTime75.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology78 = mutableDateTime75.getChronology();
        org.joda.time.MutableDateTime.Property property79 = mutableDateTime75.era();
        mutableDateTime75.setDayOfYear((int) (short) 100);
        int int82 = mutableDateTime75.getYearOfEra();
        boolean boolean83 = mutableDateTime75.isBeforeNow();
        java.util.Locale locale84 = null;
        java.util.Calendar calendar85 = mutableDateTime75.toCalendar(locale84);
        mutableDateTime67.setTime((org.joda.time.ReadableInstant) mutableDateTime75);
        org.joda.time.DateTimeZone dateTimeZone87 = mutableDateTime75.getZone();
        org.joda.time.MutableDateTime mutableDateTime88 = org.joda.time.MutableDateTime.now(dateTimeZone87);
        org.joda.time.DateTime dateTime89 = mutableDateTime60.toDateTime(dateTimeZone87);
        mutableDateTime49.setZone(dateTimeZone87);
        mutableDateTime32.setZone(dateTimeZone87);
        mutableDateTime29.setZone(dateTimeZone87);
        org.joda.time.DateTime dateTime93 = mutableDateTime17.toDateTime(dateTimeZone87);
        org.joda.time.MutableDateTime mutableDateTime94 = new org.joda.time.MutableDateTime((long) 9, dateTimeZone87);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(gregorianCalendar25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(gregorianCalendar35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 25235000 + "'", int36 == 25235000);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 35 + "'", int44 == 35);
        org.junit.Assert.assertNotNull(gregorianCalendar52);
        org.junit.Assert.assertNotNull(mutableDateTime53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 35 + "'", int57 == 35);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(gregorianCalendar70);
        org.junit.Assert.assertNotNull(mutableDateTime71);
        org.junit.Assert.assertNotNull(gregorianCalendar72);
        org.junit.Assert.assertNotNull(chronology78);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1970 + "'", int82 == 1970);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(calendar85);
        org.junit.Assert.assertEquals(calendar85.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone87);
        org.junit.Assert.assertNotNull(mutableDateTime88);
        org.junit.Assert.assertNotNull(dateTime89);
        org.junit.Assert.assertNotNull(dateTime93);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        boolean boolean6 = mutableDateTime2.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(0L, dateTimeZone8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(0L, dateTimeZone12);
        mutableDateTime13.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology16 = mutableDateTime13.getChronology();
        int int17 = mutableDateTime13.getSecondOfMinute();
        mutableDateTime9.setTime((org.joda.time.ReadableInstant) mutableDateTime13);
        int int19 = mutableDateTime9.getYear();
        int int20 = mutableDateTime9.getHourOfDay();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime9.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(0L, dateTimeZone23);
        mutableDateTime24.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology27 = mutableDateTime24.getChronology();
        org.joda.time.Chronology chronology28 = mutableDateTime24.getChronology();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(0L, dateTimeZone30);
        mutableDateTime31.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar34 = mutableDateTime31.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime31.copy();
        java.util.GregorianCalendar gregorianCalendar36 = mutableDateTime31.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(0L, dateTimeZone38);
        mutableDateTime39.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology42 = mutableDateTime39.getChronology();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime39.era();
        mutableDateTime39.setDayOfYear((int) (short) 100);
        int int46 = mutableDateTime39.getYearOfEra();
        boolean boolean47 = mutableDateTime39.isBeforeNow();
        java.util.Locale locale48 = null;
        java.util.Calendar calendar49 = mutableDateTime39.toCalendar(locale48);
        mutableDateTime31.setTime((org.joda.time.ReadableInstant) mutableDateTime39);
        org.joda.time.DateTimeZone dateTimeZone51 = mutableDateTime39.getZone();
        org.joda.time.MutableDateTime mutableDateTime52 = org.joda.time.MutableDateTime.now(dateTimeZone51);
        org.joda.time.DateTime dateTime53 = mutableDateTime24.toDateTime(dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime9, dateTimeZone51);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(0L, dateTimeZone56);
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime57.monthOfYear();
        long long59 = property58.remainder();
        org.joda.time.MutableDateTime mutableDateTime60 = property58.roundFloor();
        org.joda.time.DateTimeField dateTimeField61 = property58.getField();
        mutableDateTime54.setRounding(dateTimeField61, 2);
        int int64 = mutableDateTime2.get(dateTimeField61);
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField66 = property65.getField();
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(gregorianCalendar34);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(gregorianCalendar36);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1970 + "'", int46 == 1970);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(calendar49);
        org.junit.Assert.assertEquals(calendar49.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 25200000L + "'", long59 == 25200000L);
        org.junit.Assert.assertNotNull(mutableDateTime60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(dateTimeField66);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(0L, dateTimeZone5);
        mutableDateTime6.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology9 = mutableDateTime6.getChronology();
        int int10 = mutableDateTime6.getSecondOfMinute();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime6);
        java.util.Date date12 = mutableDateTime2.toDate();
        int int13 = mutableDateTime2.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, dateTimeZone15);
        mutableDateTime16.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology19 = mutableDateTime16.getChronology();
        int int20 = mutableDateTime16.getSecondOfMinute();
        mutableDateTime16.setMinuteOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(0L, dateTimeZone24);
        mutableDateTime25.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar28 = mutableDateTime25.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime25.copy();
        mutableDateTime25.setDayOfYear((int) (byte) 10);
        boolean boolean32 = mutableDateTime16.isBefore((org.joda.time.ReadableInstant) mutableDateTime25);
        int int33 = mutableDateTime25.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(0L, dateTimeZone35);
        mutableDateTime36.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology39 = mutableDateTime36.getChronology();
        org.joda.time.Chronology chronology40 = mutableDateTime36.getChronology();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(0L, dateTimeZone42);
        mutableDateTime43.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar46 = mutableDateTime43.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime43.copy();
        java.util.GregorianCalendar gregorianCalendar48 = mutableDateTime43.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(0L, dateTimeZone50);
        mutableDateTime51.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology54 = mutableDateTime51.getChronology();
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime51.era();
        mutableDateTime51.setDayOfYear((int) (short) 100);
        int int58 = mutableDateTime51.getYearOfEra();
        boolean boolean59 = mutableDateTime51.isBeforeNow();
        java.util.Locale locale60 = null;
        java.util.Calendar calendar61 = mutableDateTime51.toCalendar(locale60);
        mutableDateTime43.setTime((org.joda.time.ReadableInstant) mutableDateTime51);
        org.joda.time.DateTimeZone dateTimeZone63 = mutableDateTime51.getZone();
        org.joda.time.MutableDateTime mutableDateTime64 = org.joda.time.MutableDateTime.now(dateTimeZone63);
        org.joda.time.DateTime dateTime65 = mutableDateTime36.toDateTime(dateTimeZone63);
        mutableDateTime25.setZone(dateTimeZone63);
        boolean boolean67 = mutableDateTime2.equals((java.lang.Object) mutableDateTime25);
        org.joda.time.MutableDateTime.Property property68 = mutableDateTime2.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.MutableDateTime mutableDateTime71 = new org.joda.time.MutableDateTime(0L, dateTimeZone70);
        org.joda.time.MutableDateTime.Property property72 = mutableDateTime71.monthOfYear();
        org.joda.time.DateTime dateTime73 = mutableDateTime71.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime74 = mutableDateTime71.copy();
        int int75 = property68.getDifference((org.joda.time.ReadableInstant) mutableDateTime71);
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime71);
        org.joda.time.MutableDateTime.Property property77 = mutableDateTime76.minuteOfHour();
        java.util.Locale locale78 = null;
        java.lang.String str79 = property77.getAsText(locale78);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 07:00:35 ICT 1970");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(gregorianCalendar28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(gregorianCalendar46);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertNotNull(gregorianCalendar48);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1970 + "'", int58 == 1970);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(calendar61);
        org.junit.Assert.assertEquals(calendar61.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertNotNull(mutableDateTime64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(mutableDateTime74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "0" + "'", str79, "0");
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
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
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology13);
        int int17 = mutableDateTime16.getWeekOfWeekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime16.toString(dateTimeFormatter18);
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime16.copy();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime16.copy();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(0L, dateTimeZone23);
        mutableDateTime24.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar27 = mutableDateTime24.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime24.copy();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime30 = property29.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime30.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(0L, dateTimeZone33);
        java.util.Date date35 = mutableDateTime34.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = null;
        boolean boolean37 = mutableDateTime34.isSupported(dateTimeFieldType36);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(0L, dateTimeZone40);
        mutableDateTime41.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology44 = mutableDateTime41.getChronology();
        org.joda.time.Chronology chronology45 = mutableDateTime41.getChronology();
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((long) ' ', chronology45);
        org.joda.time.DateTime dateTime47 = mutableDateTime34.toDateTime(chronology45);
        org.joda.time.Chronology chronology48 = mutableDateTime34.getChronology();
        org.joda.time.MutableDateTime mutableDateTime49 = org.joda.time.MutableDateTime.now(chronology48);
        mutableDateTime31.setChronology(chronology48);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(0L, dateTimeZone52);
        mutableDateTime53.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology56 = mutableDateTime53.getChronology();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime53.year();
        int int58 = property57.getMaximumValueOverall();
        java.lang.String str59 = property57.getAsText();
        org.joda.time.DurationField durationField60 = property57.getLeapDurationField();
        org.joda.time.MutableDateTime mutableDateTime61 = property57.roundHalfFloor();
        org.joda.time.Chronology chronology62 = mutableDateTime61.getChronology();
        mutableDateTime61.addHours(7);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime(0L, dateTimeZone66);
        java.util.Date date68 = mutableDateTime67.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = null;
        boolean boolean70 = mutableDateTime67.isSupported(dateTimeFieldType69);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.MutableDateTime mutableDateTime74 = new org.joda.time.MutableDateTime(0L, dateTimeZone73);
        mutableDateTime74.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology77 = mutableDateTime74.getChronology();
        org.joda.time.Chronology chronology78 = mutableDateTime74.getChronology();
        org.joda.time.MutableDateTime mutableDateTime79 = new org.joda.time.MutableDateTime((long) ' ', chronology78);
        org.joda.time.DateTime dateTime80 = mutableDateTime67.toDateTime(chronology78);
        org.joda.time.MutableDateTime mutableDateTime81 = new org.joda.time.MutableDateTime(chronology78);
        int int82 = mutableDateTime81.getWeekOfWeekyear();
        int int83 = mutableDateTime81.getRoundingMode();
        java.lang.Object obj84 = mutableDateTime81.clone();
        org.joda.time.MutableDateTime.Property property85 = mutableDateTime81.weekyear();
        org.joda.time.DateTimeZone dateTimeZone87 = null;
        org.joda.time.MutableDateTime mutableDateTime88 = new org.joda.time.MutableDateTime(0L, dateTimeZone87);
        org.joda.time.MutableDateTime.Property property89 = mutableDateTime88.monthOfYear();
        long long90 = property89.remainder();
        org.joda.time.MutableDateTime mutableDateTime91 = property89.roundFloor();
        org.joda.time.DateTimeField dateTimeField92 = property89.getField();
        org.joda.time.MutableDateTime.Property property93 = new org.joda.time.MutableDateTime.Property(mutableDateTime81, dateTimeField92);
        org.joda.time.MutableDateTime.Property property94 = new org.joda.time.MutableDateTime.Property(mutableDateTime61, dateTimeField92);
        org.joda.time.DateTimeZone dateTimeZone95 = mutableDateTime61.getZone();
        org.joda.time.MutableDateTime mutableDateTime96 = mutableDateTime31.toMutableDateTime(dateTimeZone95);
        int int97 = mutableDateTime96.getWeekOfWeekyear();
        int int98 = mutableDateTime21.compareTo((org.joda.time.ReadableInstant) mutableDateTime96);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 40 + "'", int17 == 40);
// flaky "24) test3216(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2026-09-28T14:48:49.940+07:00" + "'", str19, "2026-09-28T14:48:49.940+07:00");
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(gregorianCalendar27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(mutableDateTime49);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 292278993 + "'", int58 == 292278993);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "1970" + "'", str59, "1970");
        org.junit.Assert.assertNotNull(durationField60);
        org.junit.Assert.assertNotNull(mutableDateTime61);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(chronology77);
        org.junit.Assert.assertNotNull(chronology78);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 40 + "'", int82 == 40);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(obj84);
// flaky "8) test3216(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals(obj84.toString(), "2026-09-28T14:48:49.940+07:00");
// flaky "7) test3216(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj84), "2026-09-28T14:48:49.940+07:00");
// flaky "2) test3216(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals(java.util.Objects.toString(obj84), "2026-09-28T14:48:49.940+07:00");
        org.junit.Assert.assertNotNull(property85);
        org.junit.Assert.assertNotNull(property89);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 25200000L + "'", long90 == 25200000L);
        org.junit.Assert.assertNotNull(mutableDateTime91);
        org.junit.Assert.assertNotNull(dateTimeField92);
        org.junit.Assert.assertNotNull(dateTimeZone95);
        org.junit.Assert.assertNotNull(mutableDateTime96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 1 + "'", int97 == 1);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 1 + "'", int98 == 1);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
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
        int int16 = mutableDateTime2.getMillisOfSecond();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime2.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(0L, dateTimeZone19);
        mutableDateTime20.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology23 = mutableDateTime20.getChronology();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(chronology23);
        mutableDateTime24.addHours(2004);
        boolean boolean27 = property17.equals((java.lang.Object) mutableDateTime24);
        mutableDateTime24.addSeconds(2026);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(0L, dateTimeZone5);
        mutableDateTime6.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology9 = mutableDateTime6.getChronology();
        int int10 = mutableDateTime6.getSecondOfMinute();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime6);
        java.util.Date date12 = mutableDateTime2.toDate();
        int int13 = mutableDateTime2.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, dateTimeZone15);
        mutableDateTime16.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology19 = mutableDateTime16.getChronology();
        int int20 = mutableDateTime16.getSecondOfMinute();
        mutableDateTime16.setMinuteOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(0L, dateTimeZone24);
        mutableDateTime25.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar28 = mutableDateTime25.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime25.copy();
        mutableDateTime25.setDayOfYear((int) (byte) 10);
        boolean boolean32 = mutableDateTime16.isBefore((org.joda.time.ReadableInstant) mutableDateTime25);
        int int33 = mutableDateTime25.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(0L, dateTimeZone35);
        mutableDateTime36.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology39 = mutableDateTime36.getChronology();
        org.joda.time.Chronology chronology40 = mutableDateTime36.getChronology();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(0L, dateTimeZone42);
        mutableDateTime43.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar46 = mutableDateTime43.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime43.copy();
        java.util.GregorianCalendar gregorianCalendar48 = mutableDateTime43.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(0L, dateTimeZone50);
        mutableDateTime51.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology54 = mutableDateTime51.getChronology();
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime51.era();
        mutableDateTime51.setDayOfYear((int) (short) 100);
        int int58 = mutableDateTime51.getYearOfEra();
        boolean boolean59 = mutableDateTime51.isBeforeNow();
        java.util.Locale locale60 = null;
        java.util.Calendar calendar61 = mutableDateTime51.toCalendar(locale60);
        mutableDateTime43.setTime((org.joda.time.ReadableInstant) mutableDateTime51);
        org.joda.time.DateTimeZone dateTimeZone63 = mutableDateTime51.getZone();
        org.joda.time.MutableDateTime mutableDateTime64 = org.joda.time.MutableDateTime.now(dateTimeZone63);
        org.joda.time.DateTime dateTime65 = mutableDateTime36.toDateTime(dateTimeZone63);
        mutableDateTime25.setZone(dateTimeZone63);
        boolean boolean67 = mutableDateTime2.equals((java.lang.Object) mutableDateTime25);
        org.joda.time.MutableDateTime.Property property68 = mutableDateTime2.yearOfEra();
        org.joda.time.DurationField durationField69 = property68.getLeapDurationField();
        org.joda.time.Interval interval70 = property68.toInterval();
        int int71 = property68.getLeapAmount();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 07:00:35 ICT 1970");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(gregorianCalendar28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(gregorianCalendar46);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertNotNull(gregorianCalendar48);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1970 + "'", int58 == 1970);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(calendar61);
        org.junit.Assert.assertEquals(calendar61.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertNotNull(mutableDateTime64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNull(durationField69);
        org.junit.Assert.assertNotNull(interval70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(0L, dateTimeZone2);
        mutableDateTime3.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime3.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime3.copy();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.minuteOfHour();
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
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(0L, dateTimeZone34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(0L, dateTimeZone38);
        mutableDateTime39.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology42 = mutableDateTime39.getChronology();
        org.joda.time.Chronology chronology43 = mutableDateTime39.getChronology();
        org.joda.time.DateTime dateTime44 = mutableDateTime35.toDateTime(chronology43);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime32, chronology43);
        org.joda.time.DateTime dateTime46 = mutableDateTime3.toDateTime(chronology43);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(35019L, chronology43);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime47.toMutableDateTime(chronology48);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(0L, dateTimeZone51);
        mutableDateTime52.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar55 = mutableDateTime52.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime56 = mutableDateTime52.copy();
        java.util.GregorianCalendar gregorianCalendar57 = mutableDateTime52.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(0L, dateTimeZone59);
        mutableDateTime60.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology63 = mutableDateTime60.getChronology();
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime60.era();
        mutableDateTime60.setDayOfYear((int) (short) 100);
        int int67 = mutableDateTime60.getYearOfEra();
        boolean boolean68 = mutableDateTime60.isBeforeNow();
        java.util.Locale locale69 = null;
        java.util.Calendar calendar70 = mutableDateTime60.toCalendar(locale69);
        mutableDateTime52.setTime((org.joda.time.ReadableInstant) mutableDateTime60);
        int int72 = mutableDateTime52.getMinuteOfHour();
        mutableDateTime52.addYears((int) ' ');
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime52.minuteOfDay();
        boolean boolean76 = mutableDateTime47.isAfter((org.joda.time.ReadableInstant) mutableDateTime52);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(gregorianCalendar14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(gregorianCalendar16);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1970 + "'", int26 == 1970);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(calendar29);
        org.junit.Assert.assertEquals(calendar29.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(mutableDateTime49);
        org.junit.Assert.assertNotNull(gregorianCalendar55);
        org.junit.Assert.assertNotNull(mutableDateTime56);
        org.junit.Assert.assertNotNull(gregorianCalendar57);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1970 + "'", int67 == 1970);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(calendar70);
        org.junit.Assert.assertEquals(calendar70.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.era();
        mutableDateTime2.setDayOfYear((int) (short) 100);
        int int9 = mutableDateTime2.getYearOfEra();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.era();
        int int11 = mutableDateTime2.getCenturyOfEra();
        mutableDateTime2.addDays(1970);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime2.toMutableDateTime(dateTimeZone15);
        mutableDateTime16.setDayOfYear(56);
        mutableDateTime16.addMinutes(25200000);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 19 + "'", int11 == 19);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime16);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        long long4 = property3.remainder();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.roundFloor();
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        org.joda.time.MutableDateTime mutableDateTime8 = property3.set("1");
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime8.toMutableDateTimeISO();
        mutableDateTime9.addYears((int) (short) -1);
        int int12 = mutableDateTime9.getDayOfMonth();
        java.lang.Class<?> wildcardClass13 = mutableDateTime9.getClass();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 25200000L + "'", long4 == 25200000L);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.year();
        org.joda.time.Chronology chronology7 = property6.getChronology();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology7);
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
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(0L, dateTimeZone34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(0L, dateTimeZone38);
        mutableDateTime39.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology42 = mutableDateTime39.getChronology();
        org.joda.time.Chronology chronology43 = mutableDateTime39.getChronology();
        org.joda.time.DateTime dateTime44 = mutableDateTime35.toDateTime(chronology43);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime32, chronology43);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime8, chronology43);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime46.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone48 = mutableDateTime46.getZone();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime46.millisOfDay();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(gregorianCalendar14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(gregorianCalendar16);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1970 + "'", int26 == 1970);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(calendar29);
        org.junit.Assert.assertEquals(calendar29.toString(), "sun.util.BuddhistCalendar[time=8553635000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=35,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(property49);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTime dateTime4 = mutableDateTime2.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.copy();
        org.joda.time.DateTimeField dateTimeField6 = mutableDateTime5.getRoundingField();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(0L, dateTimeZone8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.monthOfYear();
        org.joda.time.DateTime dateTime11 = mutableDateTime9.toDateTime();
        java.util.Locale locale12 = null;
        java.util.Calendar calendar13 = dateTime11.toCalendar(locale12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, dateTimeZone15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.monthOfYear();
        long long18 = property17.remainder();
        org.joda.time.MutableDateTime mutableDateTime19 = property17.roundFloor();
        org.joda.time.DateTimeField dateTimeField20 = property17.getField();
        int int21 = dateTime11.get(dateTimeField20);
        int int22 = mutableDateTime5.get(dateTimeField20);
        org.joda.time.DateTime dateTime23 = mutableDateTime5.toDateTime();
        int int24 = mutableDateTime5.getMonthOfYear();
        int int25 = mutableDateTime5.getHourOfDay();
        mutableDateTime5.addMonths(53324418);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNull(dateTimeField6);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(calendar13);
        org.junit.Assert.assertEquals(calendar13.toString(), "sun.util.BuddhistCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 25200000L + "'", long18 == 25200000L);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 7 + "'", int25 == 7);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
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
        mutableDateTime2.addSeconds((int) (byte) -1);
        int int23 = mutableDateTime2.getDayOfWeek();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 25235000 + "'", int7 == 25235000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25235 + "'", int10 == 25235);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        mutableDateTime2.setDate(0L);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(0L, dateTimeZone10);
        java.util.Date date12 = mutableDateTime11.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = mutableDateTime11.isSupported(dateTimeFieldType13);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(0L, dateTimeZone17);
        mutableDateTime18.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology21 = mutableDateTime18.getChronology();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) ' ', chronology22);
        org.joda.time.DateTime dateTime24 = mutableDateTime11.toDateTime(chronology22);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(chronology22);
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(chronology22);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.minuteOfDay();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime26.secondOfMinute();
        org.joda.time.Chronology chronology29 = property28.getChronology();
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((java.lang.Object) 0L, chronology29);
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(chronology29);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(0L, dateTimeZone33);
        mutableDateTime34.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar37 = mutableDateTime34.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime34.copy();
        mutableDateTime34.setDayOfYear((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(0L, dateTimeZone42);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime43.monthOfYear();
        java.util.Locale locale46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = property44.set("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21", locale46);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(0L, dateTimeZone49);
        mutableDateTime50.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology53 = mutableDateTime50.getChronology();
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime50.year();
        int int55 = property54.getMaximumValueOverall();
        java.lang.String str56 = property54.getAsText();
        org.joda.time.DurationField durationField57 = property54.getLeapDurationField();
        org.joda.time.MutableDateTime mutableDateTime58 = property54.roundHalfFloor();
        mutableDateTime58.setYear(10);
        boolean boolean61 = mutableDateTime47.isBefore((org.joda.time.ReadableInstant) mutableDateTime58);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime(0L, dateTimeZone63);
        mutableDateTime64.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar67 = mutableDateTime64.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime68 = mutableDateTime64.copy();
        int int69 = mutableDateTime68.getWeekyear();
        mutableDateTime68.addWeeks((int) (short) 100);
        mutableDateTime68.addMonths((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime(0L, dateTimeZone75);
        mutableDateTime76.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology79 = mutableDateTime76.getChronology();
        org.joda.time.MutableDateTime.Property property80 = mutableDateTime76.year();
        int int81 = property80.getMaximumValueOverall();
        org.joda.time.DateTimeFieldType dateTimeFieldType82 = property80.getFieldType();
        int int83 = mutableDateTime68.get(dateTimeFieldType82);
        mutableDateTime47.setMillis((org.joda.time.ReadableInstant) mutableDateTime68);
        org.joda.time.MutableDateTime.Property property85 = mutableDateTime47.dayOfMonth();
        mutableDateTime34.setDate((org.joda.time.ReadableInstant) mutableDateTime47);
        mutableDateTime34.addHours(0);
        mutableDateTime31.setMillis((org.joda.time.ReadableInstant) mutableDateTime34);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(gregorianCalendar37);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 292278993 + "'", int55 == 292278993);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "1970" + "'", str56, "1970");
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(mutableDateTime58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(gregorianCalendar67);
        org.junit.Assert.assertNotNull(mutableDateTime68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1970 + "'", int69 == 1970);
        org.junit.Assert.assertNotNull(chronology79);
        org.junit.Assert.assertNotNull(property80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 292278993 + "'", int81 == 292278993);
        org.junit.Assert.assertNotNull(dateTimeFieldType82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1980 + "'", int83 == 1980);
        org.junit.Assert.assertNotNull(property85);
    }
}
