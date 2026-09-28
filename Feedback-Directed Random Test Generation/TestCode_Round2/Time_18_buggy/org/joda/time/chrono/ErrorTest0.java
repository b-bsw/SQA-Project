package org.joda.time.chrono;

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DurationField durationField4 = gJChronology0.eras();
        org.joda.time.DurationField durationField5 = gJChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField5, and durationField4", !(durationField4.compareTo(durationField5) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField5.compareTo(durationField4))));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DurationField durationField4 = gJChronology0.eras();
        org.joda.time.DurationField durationField5 = gJChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField5, and durationField4", !(durationField4.compareTo(durationField5) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField5.compareTo(durationField4))));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField6 = gJChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField3, and durationField6", !(durationField8.compareTo(durationField3) == 0) || (Math.signum(durationField8.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology1.monthOfYear();
        org.joda.time.DurationField durationField4 = gJChronology1.weekyears();
        org.joda.time.DurationField durationField5 = gJChronology1.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField4", (durationField5.compareTo(durationField4) == 0) == durationField5.equals(durationField4));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology1.monthOfYear();
        org.joda.time.DurationField durationField4 = gJChronology1.eras();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology1.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField4", Math.signum(durationField2.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField2)));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        long long6 = gJChronology1.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField7 = gJChronology1.eras();
        long long9 = gJChronology1.gregorianToJulianByYear(10000L);
        org.joda.time.DurationField durationField10 = gJChronology1.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField10, and durationField7", !(durationField7.compareTo(durationField10) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField10.compareTo(durationField7))));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology1.monthOfYear();
        org.joda.time.DurationField durationField4 = gJChronology1.eras();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = gJChronology6.centuryOfEra();
        long long11 = gJChronology6.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology6.getZone();
        org.joda.time.Chronology chronology13 = gJChronology1.withZone(dateTimeZone12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField4", Math.signum(durationField2.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField2)));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.Instant instant6 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField7 = gJChronology0.millis();
        org.joda.time.DurationField durationField8 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField3, and durationField7", !(durationField8.compareTo(durationField3) == 0) || (Math.signum(durationField8.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology1.monthOfYear();
        org.joda.time.DurationField durationField4 = gJChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology1.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField4", (durationField2.compareTo(durationField4) == 0) == durationField2.equals(durationField4));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        long long3 = gJChronology0.gregorianToJulianByWeekyear((long) ' ');
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.millisOfDay();
        org.joda.time.Instant instant5 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField6 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = gJChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField9, and durationField6", !(durationField6.compareTo(durationField9) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField9.compareTo(durationField6))));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        long long6 = gJChronology1.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField7 = gJChronology1.eras();
        long long9 = gJChronology1.gregorianToJulianByYear(10000L);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology1.hourOfDay();
        org.joda.time.DurationField durationField14 = gJChronology1.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField14, and durationField7", !(durationField7.compareTo(durationField14) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField14.compareTo(durationField7))));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        long long9 = gJChronology0.add((long) (byte) -1, (long) (short) 0, 4);
        long long11 = gJChronology0.julianToGregorianByWeekyear((long) 4);
        org.joda.time.DurationField durationField12 = gJChronology0.eras();
        org.joda.time.Chronology chronology13 = gJChronology0.withUTC();
        org.joda.time.DurationField durationField14 = gJChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField14, and durationField12", !(durationField12.compareTo(durationField14) == 0) || (Math.signum(durationField12.compareTo(durationField12)) == Math.signum(durationField14.compareTo(durationField12))));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology1.monthOfYear();
        long long7 = gJChronology1.add((-1L), (long) (short) 1, (int) (short) -1);
        org.joda.time.DurationField durationField8 = gJChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology1.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField8", (durationField2.compareTo(durationField8) == 0) == durationField2.equals(durationField8));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        long long6 = gJChronology1.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField7 = gJChronology1.eras();
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.centuryOfEra();
        boolean boolean11 = gJChronology8.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology8.getZone();
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        org.joda.time.Chronology chronology14 = gJChronology1.withZone(dateTimeZone12);
        long long16 = gJChronology1.julianToGregorianByYear((-1L));
        long long18 = gJChronology1.julianToGregorianByWeekyear((long) '#');
        org.joda.time.DurationField durationField19 = gJChronology1.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField19, and durationField7", !(durationField7.compareTo(durationField19) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField19.compareTo(durationField7))));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        long long3 = gJChronology0.gregorianToJulianByWeekyear((long) ' ');
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.millisOfDay();
        org.joda.time.Instant instant5 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField6 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.yearOfEra();
        org.joda.time.DurationField durationField9 = gJChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField9, and durationField6", !(durationField6.compareTo(durationField9) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField9.compareTo(durationField6))));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.millis();
        java.lang.String str2 = gJChronology0.toString();
        org.joda.time.Instant instant3 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField4 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField4", Math.signum(durationField1.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField1)));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        long long6 = gJChronology1.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField7 = gJChronology1.eras();
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.centuryOfEra();
        boolean boolean11 = gJChronology8.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology8.getZone();
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        org.joda.time.Chronology chronology14 = gJChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField16 = gJChronology1.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField16, and durationField7", !(durationField7.compareTo(durationField16) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField16.compareTo(durationField7))));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DurationField durationField2 = gJChronology0.days();
        org.joda.time.DurationField durationField3 = gJChronology0.minutes();
        org.joda.time.DurationField durationField4 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField1, and durationField2", !(durationField4.compareTo(durationField1) == 0) || (Math.signum(durationField4.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.secondOfDay();
        org.joda.time.DurationField durationField7 = gJChronology0.weekyears();
        org.joda.time.DurationField durationField8 = gJChronology0.years();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField8", (durationField7.compareTo(durationField8) == 0) == durationField7.equals(durationField8));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology1.monthOfYear();
        long long7 = gJChronology1.add((-1L), (long) (short) 1, (int) (short) -1);
        org.joda.time.DurationField durationField8 = gJChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology1.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField8", (durationField2.compareTo(durationField8) == 0) == durationField2.equals(durationField8));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.yearOfCentury();
        long long5 = gJChronology0.julianToGregorianByWeekyear((long) (-1));
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.weekOfWeekyear();
        org.joda.time.Chronology chronology7 = gJChronology0.withUTC();
        org.joda.time.DurationField durationField8 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField8", Math.signum(durationField1.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField1)));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        long long6 = gJChronology1.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField7 = gJChronology1.eras();
        long long9 = gJChronology1.gregorianToJulianByYear(10000L);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology1.weekOfWeekyear();
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.minuteOfHour();
        org.joda.time.Instant instant13 = gJChronology11.getGregorianCutover();
        org.joda.time.DurationField durationField14 = gJChronology11.hours();
        org.joda.time.DateTimeZone dateTimeZone15 = gJChronology11.getZone();
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15);
        org.joda.time.Chronology chronology17 = gJChronology1.withZone(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField14", Math.signum(durationField7.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField7)));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        org.joda.time.DurationField durationField2 = gJChronology0.weekyears();
        org.joda.time.DurationField durationField3 = gJChronology0.minutes();
        org.joda.time.DurationField durationField4 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField2, and durationField3", !(durationField4.compareTo(durationField2) == 0) || (Math.signum(durationField4.compareTo(durationField3)) == Math.signum(durationField2.compareTo(durationField3))));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        long long5 = gJChronology0.gregorianToJulianByYear((long) (byte) 0);
        org.joda.time.DurationField durationField6 = gJChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.millisOfSecond();
        org.joda.time.Instant instant8 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField9 = gJChronology0.hours();
        org.joda.time.DurationField durationField10 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField6, and durationField9", !(durationField10.compareTo(durationField6) == 0) || (Math.signum(durationField10.compareTo(durationField9)) == Math.signum(durationField6.compareTo(durationField9))));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        boolean boolean4 = gJChronology0.equals((java.lang.Object) 100.0d);
        org.joda.time.DurationField durationField5 = gJChronology0.eras();
        org.joda.time.DurationField durationField6 = gJChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField6, and durationField5", !(durationField5.compareTo(durationField6) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField6.compareTo(durationField5))));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        boolean boolean7 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.centuryOfEra();
        long long11 = gJChronology8.gregorianToJulianByWeekyear((long) ' ');
        org.joda.time.DateTimeField dateTimeField12 = gJChronology8.millisOfDay();
        org.joda.time.Instant instant13 = gJChronology8.getGregorianCutover();
        org.joda.time.DurationField durationField14 = gJChronology8.eras();
        boolean boolean15 = gJChronology0.equals((java.lang.Object) durationField14);
        org.joda.time.DateTimeField dateTimeField16 = gJChronology0.dayOfYear();
        org.joda.time.DurationField durationField17 = gJChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField17, and durationField14", !(durationField14.compareTo(durationField17) == 0) || (Math.signum(durationField14.compareTo(durationField14)) == Math.signum(durationField17.compareTo(durationField14))));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.minuteOfHour();
        org.joda.time.Instant instant5 = gJChronology3.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.Chronology chronology7 = gJChronology3.withZone(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField9 = gJChronology3.centuries();
        boolean boolean10 = gJChronology1.equals((java.lang.Object) durationField9);
        org.joda.time.DurationField durationField11 = gJChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology1.millisOfSecond();
        org.joda.time.DurationField durationField16 = gJChronology1.weekyears();
        org.joda.time.DurationField durationField17 = gJChronology1.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField16", (durationField2.compareTo(durationField16) == 0) == durationField2.equals(durationField16));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = gJChronology0.withZone(dateTimeZone4);
        org.joda.time.DurationField durationField6 = gJChronology0.millis();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.dayOfWeek();
        org.joda.time.Instant instant8 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField9 = gJChronology0.eras();
        org.joda.time.DurationField durationField10 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField10", Math.signum(durationField6.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField6)));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        long long9 = gJChronology0.add((long) (byte) -1, (long) (short) 0, 4);
        long long11 = gJChronology0.julianToGregorianByWeekyear((long) 4);
        org.joda.time.DurationField durationField12 = gJChronology0.eras();
        org.joda.time.Chronology chronology13 = gJChronology0.withUTC();
        org.joda.time.DurationField durationField14 = gJChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField14, and durationField12", !(durationField12.compareTo(durationField14) == 0) || (Math.signum(durationField12.compareTo(durationField12)) == Math.signum(durationField14.compareTo(durationField12))));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        long long6 = gJChronology1.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField7 = gJChronology1.eras();
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.centuryOfEra();
        boolean boolean11 = gJChronology8.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology8.getZone();
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        org.joda.time.Chronology chronology14 = gJChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField15 = gJChronology1.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField15, and durationField7", !(durationField7.compareTo(durationField15) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField15.compareTo(durationField7))));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology1.monthOfYear();
        org.joda.time.DurationField durationField4 = gJChronology1.weekyears();
        org.joda.time.chrono.AssembledChronology.Fields fields5 = null;
        gJChronology1.assemble(fields5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField4", (durationField2.compareTo(durationField4) == 0) == durationField2.equals(durationField4));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.millis();
        java.lang.String str2 = gJChronology0.toString();
        org.joda.time.Instant instant3 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField4 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField4", Math.signum(durationField1.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField1)));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        long long5 = gJChronology1.add((long) 'a', (long) 10, (int) '#');
        org.joda.time.chrono.AssembledChronology.Fields fields6 = null;
        gJChronology1.assemble(fields6);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology1.yearOfEra();
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.centuryOfEra();
        boolean boolean12 = gJChronology9.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone13 = gJChronology9.getZone();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13);
        org.joda.time.Chronology chronology15 = gJChronology1.withZone(dateTimeZone13);
        org.joda.time.DurationField durationField16 = gJChronology1.years();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology1.secondOfMinute();
        org.joda.time.DurationField durationField18 = gJChronology1.millis();
        org.joda.time.DurationField durationField19 = gJChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField16, and durationField18", !(durationField19.compareTo(durationField16) == 0) || (Math.signum(durationField19.compareTo(durationField18)) == Math.signum(durationField16.compareTo(durationField18))));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        long long3 = gJChronology0.gregorianToJulianByWeekyear((long) ' ');
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.millisOfDay();
        org.joda.time.Instant instant5 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField6 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = gJChronology0.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField10, and durationField6", !(durationField6.compareTo(durationField10) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField10.compareTo(durationField6))));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.weekyear();
        org.joda.time.Chronology chronology4 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.yearOfEra();
        org.joda.time.DurationField durationField6 = gJChronology0.weekyears();
        org.joda.time.DurationField durationField7 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField7", Math.signum(durationField6.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField6)));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField6 = gJChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.secondOfMinute();
        long long12 = gJChronology0.getDateTimeMillis(1, (int) (byte) 10, (int) (byte) 10, (int) '#');
        org.joda.time.Instant instant13 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField14 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField3, and durationField6", !(durationField14.compareTo(durationField3) == 0) || (Math.signum(durationField14.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = gJChronology1.add(readablePeriod3, (long) 0, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = gJChronology1.minuteOfHour();
        long long11 = gJChronology1.add(2246410000L, (-1209599965L), (int) (byte) 10);
        org.joda.time.DurationField durationField12 = gJChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology1.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField12", (durationField2.compareTo(durationField12) == 0) == durationField2.equals(durationField12));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = gJChronology1.add(readablePeriod3, (long) 0, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = gJChronology1.minuteOfHour();
        long long11 = gJChronology1.add(2246410000L, (-1209599965L), (int) (byte) 10);
        org.joda.time.DurationField durationField12 = gJChronology1.weekyears();
        org.joda.time.DurationField durationField13 = gJChronology1.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField12", (durationField2.compareTo(durationField12) == 0) == durationField2.equals(durationField12));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        long long6 = gJChronology1.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField7 = gJChronology1.eras();
        long long9 = gJChronology1.gregorianToJulianByYear(10000L);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology1.millisOfSecond();
        org.joda.time.DurationField durationField13 = gJChronology1.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField13, and durationField7", !(durationField7.compareTo(durationField13) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField13.compareTo(durationField7))));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology1.monthOfYear();
        long long7 = gJChronology1.add((-1L), (long) (short) 1, (int) (short) -1);
        org.joda.time.DurationField durationField8 = gJChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology1.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField8", (durationField2.compareTo(durationField8) == 0) == durationField2.equals(durationField8));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        long long3 = gJChronology0.gregorianToJulianByWeekyear((long) ' ');
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.millisOfDay();
        org.joda.time.Instant instant5 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField6 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.dayOfMonth();
        org.joda.time.DurationField durationField11 = gJChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField11, and durationField6", !(durationField6.compareTo(durationField11) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField11.compareTo(durationField6))));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        org.joda.time.DurationField durationField2 = gJChronology0.weekyears();
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.minuteOfHour();
        org.joda.time.Instant instant5 = gJChronology3.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.Chronology chronology7 = gJChronology3.withZone(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.dayOfMonth();
        long long12 = gJChronology3.add(447L, (long) 0, (int) 'a');
        org.joda.time.DateTimeField dateTimeField13 = gJChronology3.year();
        long long19 = gJChronology3.getDateTimeMillis((long) '4', 1, 0, (int) '4', 0);
        org.joda.time.DateTimeField dateTimeField20 = gJChronology3.millisOfDay();
        org.joda.time.DurationField durationField21 = gJChronology3.eras();
        boolean boolean22 = gJChronology0.equals((java.lang.Object) durationField21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField21", Math.signum(durationField2.compareTo(durationField21)) == -Math.signum(durationField21.compareTo(durationField2)));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        long long6 = gJChronology1.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField7 = gJChronology1.eras();
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.centuryOfEra();
        boolean boolean11 = gJChronology8.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology8.getZone();
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        org.joda.time.Chronology chronology14 = gJChronology1.withZone(dateTimeZone12);
        long long20 = gJChronology1.getDateTimeMillis((-1209599969L), 10, 1, 4, (int) (short) 0);
        org.joda.time.DurationField durationField21 = gJChronology1.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField21, and durationField7", !(durationField7.compareTo(durationField21) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField21.compareTo(durationField7))));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        boolean boolean4 = gJChronology0.equals((java.lang.Object) 100.0d);
        org.joda.time.DurationField durationField5 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.year();
        org.joda.time.DurationField durationField7 = gJChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField7, and durationField5", !(durationField5.compareTo(durationField7) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField7.compareTo(durationField5))));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.Instant instant6 = gJChronology0.getGregorianCutover();
        long long8 = gJChronology0.julianToGregorianByWeekyear((-1123200001L));
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology10.minuteOfHour();
        org.joda.time.Instant instant12 = gJChronology10.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9, (org.joda.time.ReadableInstant) instant12);
        boolean boolean14 = gJChronology0.equals((java.lang.Object) gJChronology13);
        long long16 = gJChronology13.julianToGregorianByWeekyear(3456000447L);
        org.joda.time.DurationField durationField17 = gJChronology13.months();
        long long19 = gJChronology13.gregorianToJulianByYear((-3628800000L));
        org.joda.time.DurationField durationField20 = gJChronology13.halfdays();
        org.joda.time.DurationField durationField21 = gJChronology13.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField20", (durationField3.compareTo(durationField20) == 0) == durationField3.equals(durationField20));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        long long5 = gJChronology1.add((long) 'a', (long) 10, (int) '#');
        org.joda.time.chrono.AssembledChronology.Fields fields6 = null;
        gJChronology1.assemble(fields6);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology1.yearOfEra();
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.centuryOfEra();
        boolean boolean12 = gJChronology9.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone13 = gJChronology9.getZone();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13);
        org.joda.time.Chronology chronology15 = gJChronology1.withZone(dateTimeZone13);
        org.joda.time.DurationField durationField16 = gJChronology1.years();
        long long18 = gJChronology1.gregorianToJulianByYear(14607999L);
        org.joda.time.DurationField durationField19 = gJChronology1.millis();
        org.joda.time.DurationField durationField20 = gJChronology1.weekyears();
        long long22 = gJChronology1.gregorianToJulianByYear(111110400004L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField20", (durationField16.compareTo(durationField20) == 0) == durationField16.equals(durationField20));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.secondOfDay();
        org.joda.time.DurationField durationField7 = gJChronology0.weeks();
        org.joda.time.DurationField durationField8 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField8", Math.signum(durationField7.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField7)));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.yearOfCentury();
        long long5 = gJChronology0.julianToGregorianByWeekyear((long) (-1));
        org.joda.time.Chronology chronology6 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = gJChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.dayOfMonth();
        org.joda.time.DurationField durationField10 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField8", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField8)) == Math.signum(durationField1.compareTo(durationField8))));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField3 = gJChronology0.years();
        org.joda.time.DurationField durationField4 = gJChronology0.weeks();
        org.joda.time.DurationField durationField5 = gJChronology0.seconds();
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology6.centuryOfEra();
        boolean boolean9 = gJChronology6.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone10 = gJChronology6.getZone();
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology13.minuteOfHour();
        int int15 = gJChronology13.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField16 = gJChronology13.halfdays();
        boolean boolean18 = gJChronology13.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField19 = gJChronology13.months();
        org.joda.time.Instant instant20 = gJChronology13.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10, (org.joda.time.ReadableInstant) instant20);
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology22.minuteOfHour();
        org.joda.time.Instant instant24 = gJChronology22.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.Chronology chronology26 = gJChronology22.withZone(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField27 = gJChronology22.secondOfDay();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology22.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = gJChronology22.getZone();
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology30.minuteOfHour();
        int int32 = gJChronology30.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology30.secondOfDay();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology30.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology30.dayOfYear();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology30.secondOfDay();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology30.monthOfYear();
        org.joda.time.Instant instant38 = gJChronology30.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology39 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone29, (org.joda.time.ReadableInstant) instant38);
        org.joda.time.chrono.GJChronology gJChronology40 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone29);
        org.joda.time.chrono.GJChronology gJChronology41 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology41.minuteOfHour();
        int int43 = gJChronology41.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField44 = gJChronology41.halfdays();
        boolean boolean46 = gJChronology41.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField47 = gJChronology41.months();
        org.joda.time.Instant instant48 = gJChronology41.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology50 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone29, (org.joda.time.ReadableInstant) instant48, 1);
        org.joda.time.chrono.GJChronology gJChronology52 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10, (org.joda.time.ReadableInstant) instant48, (int) (short) 1);
        org.joda.time.Chronology chronology53 = gJChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField54 = gJChronology0.centuryOfEra();
        org.joda.time.DurationField durationField55 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField55, durationField1, and durationField3", !(durationField55.compareTo(durationField1) == 0) || (Math.signum(durationField55.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfMonth();
        long long9 = gJChronology0.add(447L, (long) 0, (int) 'a');
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.year();
        long long16 = gJChronology0.getDateTimeMillis((long) '4', 1, 0, (int) '4', 0);
        java.lang.String str17 = gJChronology0.toString();
        org.joda.time.DurationField durationField18 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology0.weekyear();
        org.joda.time.DurationField durationField20 = gJChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField20, and durationField18", !(durationField18.compareTo(durationField20) == 0) || (Math.signum(durationField18.compareTo(durationField18)) == Math.signum(durationField20.compareTo(durationField18))));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        long long9 = gJChronology0.add((long) (byte) -1, (long) (short) 0, 4);
        long long11 = gJChronology0.julianToGregorianByWeekyear((long) 4);
        org.joda.time.DurationField durationField12 = gJChronology0.eras();
        org.joda.time.Chronology chronology13 = gJChronology0.withUTC();
        org.joda.time.DurationField durationField14 = gJChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField14, and durationField12", !(durationField12.compareTo(durationField14) == 0) || (Math.signum(durationField12.compareTo(durationField12)) == Math.signum(durationField14.compareTo(durationField12))));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        long long9 = gJChronology0.add((long) (byte) -1, (long) (short) 0, 4);
        long long11 = gJChronology0.julianToGregorianByWeekyear((long) 4);
        org.joda.time.DurationField durationField12 = gJChronology0.eras();
        org.joda.time.DurationField durationField13 = gJChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField13, and durationField12", !(durationField12.compareTo(durationField13) == 0) || (Math.signum(durationField12.compareTo(durationField12)) == Math.signum(durationField13.compareTo(durationField12))));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.halfdayOfDay();
        long long3 = gJChronology0.julianToGregorianByYear((-9L));
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField5 = gJChronology0.eras();
        org.joda.time.DurationField durationField6 = gJChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField6, and durationField5", !(durationField5.compareTo(durationField6) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField6.compareTo(durationField5))));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology1.monthOfYear();
        org.joda.time.DurationField durationField4 = gJChronology1.eras();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology1.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField4", Math.signum(durationField2.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField2)));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology1.monthOfYear();
        long long7 = gJChronology1.add((-1L), (long) (short) 1, (int) (short) -1);
        org.joda.time.DurationField durationField8 = gJChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology1.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField8", (durationField2.compareTo(durationField8) == 0) == durationField2.equals(durationField8));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = gJChronology0.centuries();
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology7.centuryOfEra();
        boolean boolean10 = gJChronology7.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology7.getZone();
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11);
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology13.minuteOfHour();
        org.joda.time.Instant instant15 = gJChronology13.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) instant15);
        org.joda.time.Chronology chronology17 = gJChronology0.withZone(dateTimeZone11);
        org.joda.time.DurationField durationField18 = gJChronology0.years();
        java.lang.String str19 = gJChronology0.toString();
        org.joda.time.DurationField durationField20 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField6, and durationField18", !(durationField20.compareTo(durationField6) == 0) || (Math.signum(durationField20.compareTo(durationField18)) == Math.signum(durationField6.compareTo(durationField18))));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        long long6 = gJChronology1.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField7 = gJChronology1.eras();
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.centuryOfEra();
        boolean boolean11 = gJChronology8.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology8.getZone();
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        org.joda.time.Chronology chronology14 = gJChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField16 = gJChronology1.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField16, and durationField7", !(durationField7.compareTo(durationField16) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField16.compareTo(durationField7))));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        boolean boolean4 = gJChronology0.equals((java.lang.Object) 100.0d);
        org.joda.time.DurationField durationField5 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.weekyearOfCentury();
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField9 = gJChronology7.hours();
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology10.centuryOfEra();
        boolean boolean13 = gJChronology10.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology10.getZone();
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology15.minuteOfHour();
        int int17 = gJChronology15.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField18 = gJChronology15.halfdays();
        boolean boolean20 = gJChronology15.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField21 = gJChronology15.months();
        org.joda.time.Instant instant22 = gJChronology15.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, (org.joda.time.ReadableInstant) instant22);
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology24.minuteOfHour();
        int int26 = gJChronology24.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField27 = gJChronology24.halfdays();
        boolean boolean29 = gJChronology24.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField30 = gJChronology24.months();
        org.joda.time.Instant instant31 = gJChronology24.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, (org.joda.time.ReadableInstant) instant31);
        org.joda.time.chrono.GJChronology gJChronology35 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, (-2246399996L), (int) (byte) 1);
        org.joda.time.Chronology chronology36 = gJChronology7.withZone(dateTimeZone14);
        org.joda.time.Chronology chronology37 = gJChronology0.withZone(dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField9", Math.signum(durationField5.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField5)));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        long long5 = gJChronology1.add((long) 'a', (long) 10, (int) '#');
        org.joda.time.DateTimeField dateTimeField6 = gJChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = gJChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology1.centuryOfEra();
        long long10 = gJChronology1.gregorianToJulianByWeekyear(1123199988L);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology1.weekOfWeekyear();
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology12.halfdayOfDay();
        org.joda.time.DurationField durationField14 = gJChronology12.hours();
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology15.centuryOfEra();
        boolean boolean18 = gJChronology15.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone19 = gJChronology15.getZone();
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology20.minuteOfHour();
        int int22 = gJChronology20.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField23 = gJChronology20.halfdays();
        boolean boolean25 = gJChronology20.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField26 = gJChronology20.months();
        org.joda.time.Instant instant27 = gJChronology20.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19, (org.joda.time.ReadableInstant) instant27);
        org.joda.time.chrono.GJChronology gJChronology29 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology29.minuteOfHour();
        int int31 = gJChronology29.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField32 = gJChronology29.halfdays();
        boolean boolean34 = gJChronology29.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField35 = gJChronology29.months();
        org.joda.time.Instant instant36 = gJChronology29.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19, (org.joda.time.ReadableInstant) instant36);
        org.joda.time.chrono.GJChronology gJChronology40 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19, (-2246399996L), (int) (byte) 1);
        org.joda.time.Chronology chronology41 = gJChronology12.withZone(dateTimeZone19);
        org.joda.time.Chronology chronology42 = gJChronology1.withZone(dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField23", (durationField7.compareTo(durationField23) == 0) == durationField7.equals(durationField23));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology1.monthOfYear();
        org.joda.time.DurationField durationField4 = gJChronology1.eras();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology1.add(readablePeriod5, (long) (short) 100, (int) '4');
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField4", Math.signum(durationField2.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField2)));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone1 = gJChronology0.getZone();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology0.getZone();
        int int4 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = gJChronology0.eras();
        org.joda.time.DurationField durationField6 = gJChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField6, and durationField5", !(durationField5.compareTo(durationField6) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField6.compareTo(durationField5))));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = gJChronology0.withZone(dateTimeZone4);
        org.joda.time.DurationField durationField6 = gJChronology0.millis();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.dayOfWeek();
        org.joda.time.Instant instant8 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField9 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField9", Math.signum(durationField6.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField6)));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.secondOfDay();
        org.joda.time.DurationField durationField7 = gJChronology0.weeks();
        org.joda.time.DurationField durationField8 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField8", Math.signum(durationField7.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField7)));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        long long5 = gJChronology1.add((long) 'a', (long) 10, (int) '#');
        org.joda.time.chrono.AssembledChronology.Fields fields6 = null;
        gJChronology1.assemble(fields6);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology1.yearOfEra();
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.centuryOfEra();
        boolean boolean12 = gJChronology9.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone13 = gJChronology9.getZone();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13);
        org.joda.time.Chronology chronology15 = gJChronology1.withZone(dateTimeZone13);
        org.joda.time.DurationField durationField16 = gJChronology1.years();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology1.secondOfMinute();
        org.joda.time.DurationField durationField18 = gJChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology1.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField18", (durationField16.compareTo(durationField18) == 0) == durationField16.equals(durationField18));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        long long6 = gJChronology1.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField7 = gJChronology1.eras();
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.centuryOfEra();
        boolean boolean11 = gJChronology8.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology8.getZone();
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        org.joda.time.Chronology chronology14 = gJChronology1.withZone(dateTimeZone12);
        long long16 = gJChronology1.julianToGregorianByYear((-1L));
        long long18 = gJChronology1.julianToGregorianByWeekyear((long) '#');
        org.joda.time.chrono.AssembledChronology.Fields fields19 = null;
        gJChronology1.assemble(fields19);
        org.joda.time.DurationField durationField21 = gJChronology1.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField21, and durationField7", !(durationField7.compareTo(durationField21) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField21.compareTo(durationField7))));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.hourOfDay();
        org.joda.time.DurationField durationField4 = gJChronology0.hours();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.yearOfEra();
        org.joda.time.DurationField durationField6 = gJChronology0.eras();
        org.joda.time.DurationField durationField7 = gJChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField6", Math.signum(durationField7.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField7)));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.Instant instant6 = gJChronology0.getGregorianCutover();
        long long8 = gJChronology0.julianToGregorianByWeekyear((-1123200001L));
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology10.minuteOfHour();
        org.joda.time.Instant instant12 = gJChronology10.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9, (org.joda.time.ReadableInstant) instant12);
        boolean boolean14 = gJChronology0.equals((java.lang.Object) gJChronology13);
        long long16 = gJChronology13.julianToGregorianByWeekyear(3456000447L);
        org.joda.time.DurationField durationField17 = gJChronology13.months();
        org.joda.time.DurationField durationField18 = gJChronology13.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField3, and durationField17", !(durationField18.compareTo(durationField3) == 0) || (Math.signum(durationField18.compareTo(durationField17)) == Math.signum(durationField3.compareTo(durationField17))));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.DurationField durationField2 = gJChronology0.weekyears();
        org.joda.time.DurationField durationField3 = gJChronology0.years();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField3", (durationField2.compareTo(durationField3) == 0) == durationField2.equals(durationField3));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.weekyear();
        org.joda.time.Chronology chronology4 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.yearOfEra();
        org.joda.time.DurationField durationField6 = gJChronology0.weekyears();
        org.joda.time.DurationField durationField7 = gJChronology0.eras();
        org.joda.time.DurationField durationField8 = gJChronology0.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField7", Math.signum(durationField6.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField6)));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology1.monthOfYear();
        long long7 = gJChronology1.add((-1L), (long) (short) 1, (int) (short) -1);
        org.joda.time.DurationField durationField8 = gJChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology1.dayOfYear();
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology10.minuteOfHour();
        org.joda.time.Instant instant12 = gJChronology10.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.Chronology chronology14 = gJChronology10.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology10.clockhourOfDay();
        org.joda.time.DurationField durationField16 = gJChronology10.centuries();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology10.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology10.era();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology10.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology10.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology10.weekyear();
        org.joda.time.DurationField durationField22 = gJChronology10.years();
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone24 = gJChronology23.getZone();
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24);
        org.joda.time.Chronology chronology26 = gJChronology10.withZone(dateTimeZone24);
        boolean boolean27 = gJChronology1.equals((java.lang.Object) chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField22", (durationField2.compareTo(durationField22) == 0) == durationField2.equals(durationField22));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = gJChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.era();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology13.minuteOfHour();
        int int15 = gJChronology13.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField16 = gJChronology13.halfdays();
        boolean boolean18 = gJChronology13.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField19 = gJChronology13.months();
        org.joda.time.Instant instant20 = gJChronology13.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, (org.joda.time.ReadableInstant) instant20);
        org.joda.time.DurationField durationField22 = gJChronology21.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField6, and durationField16", !(durationField22.compareTo(durationField6) == 0) || (Math.signum(durationField22.compareTo(durationField16)) == Math.signum(durationField6.compareTo(durationField16))));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField6 = gJChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.millisOfSecond();
        org.joda.time.DurationField durationField9 = gJChronology0.years();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField9", (durationField6.compareTo(durationField9) == 0) == durationField6.equals(durationField9));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        long long5 = gJChronology1.add((long) 'a', (long) 10, (int) '#');
        org.joda.time.chrono.AssembledChronology.Fields fields6 = null;
        gJChronology1.assemble(fields6);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology1.yearOfEra();
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.centuryOfEra();
        boolean boolean12 = gJChronology9.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone13 = gJChronology9.getZone();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13);
        org.joda.time.Chronology chronology15 = gJChronology1.withZone(dateTimeZone13);
        org.joda.time.DurationField durationField16 = gJChronology1.years();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology1.secondOfMinute();
        org.joda.time.DurationField durationField18 = gJChronology1.millis();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology1.year();
        java.lang.String str20 = gJChronology1.toString();
        org.joda.time.DurationField durationField21 = gJChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField16, and durationField18", !(durationField21.compareTo(durationField16) == 0) || (Math.signum(durationField21.compareTo(durationField18)) == Math.signum(durationField16.compareTo(durationField18))));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        long long6 = gJChronology1.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField7 = gJChronology1.eras();
        long long9 = gJChronology1.gregorianToJulianByYear(10000L);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology1.dayOfWeek();
        java.lang.String str12 = gJChronology1.toString();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology1.clockhourOfDay();
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology15.minuteOfHour();
        int int17 = gJChronology15.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology15.dayOfYear();
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField20 = gJChronology19.seconds();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField22 = gJChronology19.days();
        boolean boolean23 = gJChronology15.equals((java.lang.Object) gJChronology19);
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology24.centuryOfEra();
        boolean boolean27 = gJChronology24.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone28 = gJChronology24.getZone();
        org.joda.time.chrono.GJChronology gJChronology29 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology29.minuteOfHour();
        int int31 = gJChronology29.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField32 = gJChronology29.halfdays();
        boolean boolean34 = gJChronology29.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField35 = gJChronology29.months();
        org.joda.time.Instant instant36 = gJChronology29.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28, (org.joda.time.ReadableInstant) instant36);
        org.joda.time.chrono.GJChronology gJChronology38 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology38.minuteOfHour();
        int int40 = gJChronology38.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField41 = gJChronology38.halfdays();
        boolean boolean43 = gJChronology38.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField44 = gJChronology38.months();
        org.joda.time.Instant instant45 = gJChronology38.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology46 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28, (org.joda.time.ReadableInstant) instant45);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.chrono.GJChronology gJChronology48 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28, readableInstant47);
        org.joda.time.Chronology chronology49 = gJChronology19.withZone(dateTimeZone28);
        int int50 = gJChronology19.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField51 = gJChronology19.dayOfMonth();
        boolean boolean52 = gJChronology1.equals((java.lang.Object) gJChronology19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField20", Math.signum(durationField7.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField7)));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology1.monthOfYear();
        long long7 = gJChronology1.add((-1L), (long) (short) 1, (int) (short) -1);
        org.joda.time.DurationField durationField8 = gJChronology1.weekyears();
        org.joda.time.DurationField durationField9 = gJChronology1.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField8", (durationField2.compareTo(durationField8) == 0) == durationField2.equals(durationField8));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        long long6 = gJChronology1.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField7 = gJChronology1.eras();
        long long9 = gJChronology1.gregorianToJulianByYear(10000L);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology1.halfdayOfDay();
        org.joda.time.chrono.AssembledChronology.Fields fields11 = null;
        gJChronology1.assemble(fields11);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology1.year();
        org.joda.time.DurationField durationField14 = gJChronology1.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField14, and durationField7", !(durationField7.compareTo(durationField14) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField14.compareTo(durationField7))));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.weekyear();
        org.joda.time.Chronology chronology4 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.yearOfEra();
        org.joda.time.DurationField durationField6 = gJChronology0.weekyears();
        long long8 = gJChronology0.julianToGregorianByYear((long) 100);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        boolean boolean10 = gJChronology0.equals((java.lang.Object) gJChronology9);
        org.joda.time.DurationField durationField11 = gJChronology0.days();
        org.joda.time.DurationField durationField12 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField6, and durationField11", !(durationField12.compareTo(durationField6) == 0) || (Math.signum(durationField12.compareTo(durationField11)) == Math.signum(durationField6.compareTo(durationField11))));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField3 = gJChronology0.years();
        org.joda.time.DurationField durationField4 = gJChronology0.weeks();
        org.joda.time.DurationField durationField5 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.dayOfWeek();
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology7.minuteOfHour();
        org.joda.time.Instant instant9 = gJChronology7.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = gJChronology7.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology7.dayOfMonth();
        long long16 = gJChronology7.add(447L, (long) 0, (int) 'a');
        org.joda.time.DateTimeField dateTimeField17 = gJChronology7.year();
        long long23 = gJChronology7.getDateTimeMillis((long) '4', 1, 0, (int) '4', 0);
        org.joda.time.DateTimeField dateTimeField24 = gJChronology7.millisOfDay();
        org.joda.time.DurationField durationField25 = gJChronology7.eras();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology7.dayOfYear();
        boolean boolean27 = gJChronology0.equals((java.lang.Object) gJChronology7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField25", Math.signum(durationField1.compareTo(durationField25)) == -Math.signum(durationField25.compareTo(durationField1)));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology1.monthOfYear();
        long long7 = gJChronology1.add((-1L), (long) (short) 1, (int) (short) -1);
        org.joda.time.DurationField durationField8 = gJChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology1.dayOfYear();
        org.joda.time.DurationField durationField10 = gJChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField2, and durationField8", !(durationField10.compareTo(durationField2) == 0) || (Math.signum(durationField10.compareTo(durationField8)) == Math.signum(durationField2.compareTo(durationField8))));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = gJChronology1.add(readablePeriod3, (long) 0, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = gJChronology1.minuteOfHour();
        long long11 = gJChronology1.add(2246410000L, (-1209599965L), (int) (byte) 10);
        org.joda.time.DurationField durationField12 = gJChronology1.weekyears();
        org.joda.time.DurationField durationField13 = gJChronology1.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField12", (durationField2.compareTo(durationField12) == 0) == durationField2.equals(durationField12));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = gJChronology1.add(readablePeriod3, (long) 0, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = gJChronology1.minuteOfHour();
        long long11 = gJChronology1.add(2246410000L, (-1209599965L), (int) (byte) 10);
        org.joda.time.DurationField durationField12 = gJChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology1.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField12", (durationField2.compareTo(durationField12) == 0) == durationField2.equals(durationField12));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.DurationField durationField2 = gJChronology0.weekyears();
        org.joda.time.DurationField durationField3 = gJChronology0.years();
        org.joda.time.DurationField durationField4 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField3", (durationField2.compareTo(durationField3) == 0) == durationField2.equals(durationField3));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DurationField durationField4 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.secondOfDay();
        long long8 = gJChronology0.julianToGregorianByWeekyear((-2L));
        org.joda.time.DurationField durationField9 = gJChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField9, and durationField4", !(durationField4.compareTo(durationField9) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField9.compareTo(durationField4))));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.millis();
        java.lang.String str2 = gJChronology0.toString();
        org.joda.time.Instant instant3 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField4 = gJChronology0.eras();
        org.joda.time.DurationField durationField5 = gJChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField4", Math.signum(durationField1.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField1)));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.minuteOfHour();
        org.joda.time.Instant instant5 = gJChronology3.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.Chronology chronology7 = gJChronology3.withZone(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField9 = gJChronology3.centuries();
        boolean boolean10 = gJChronology1.equals((java.lang.Object) durationField9);
        java.lang.String str11 = gJChronology1.toString();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology1.yearOfCentury();
        long long14 = gJChronology1.julianToGregorianByYear((-1209599948L));
        org.joda.time.DurationField durationField15 = gJChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField2, and durationField9", !(durationField15.compareTo(durationField2) == 0) || (Math.signum(durationField15.compareTo(durationField9)) == Math.signum(durationField2.compareTo(durationField9))));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology1.dayOfWeek();
        long long7 = gJChronology1.add((long) (byte) -1, 3652000L, 4);
        org.joda.time.DurationField durationField8 = gJChronology1.eras();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology1.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField8", Math.signum(durationField2.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField2)));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = gJChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.era();
        org.joda.time.DurationField durationField9 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField9", Math.signum(durationField6.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField6)));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        long long6 = gJChronology1.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField7 = gJChronology1.eras();
        long long9 = gJChronology1.gregorianToJulianByYear(10000L);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology1.dayOfWeek();
        java.lang.String str12 = gJChronology1.toString();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField14 = gJChronology1.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField14, and durationField7", !(durationField7.compareTo(durationField14) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField14.compareTo(durationField7))));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = gJChronology0.eras();
        org.joda.time.DurationField durationField9 = gJChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField9, and durationField8", !(durationField8.compareTo(durationField9) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField9.compareTo(durationField8))));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.millis();
        java.lang.String str2 = gJChronology0.toString();
        org.joda.time.Instant instant3 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.hourOfDay();
        org.joda.time.DurationField durationField5 = gJChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.dayOfYear();
        org.joda.time.DurationField durationField7 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField1, and durationField5", !(durationField7.compareTo(durationField1) == 0) || (Math.signum(durationField7.compareTo(durationField5)) == Math.signum(durationField1.compareTo(durationField5))));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        long long6 = gJChronology1.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField7 = gJChronology1.eras();
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.centuryOfEra();
        boolean boolean11 = gJChronology8.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology8.getZone();
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        org.joda.time.Chronology chronology14 = gJChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField16 = gJChronology1.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField16, and durationField7", !(durationField7.compareTo(durationField16) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField16.compareTo(durationField7))));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.minuteOfDay();
        org.joda.time.DurationField durationField7 = gJChronology0.eras();
        long long9 = gJChronology0.julianToGregorianByWeekyear(2332799988L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField7", Math.signum(durationField3.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField3)));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.minuteOfHour();
        org.joda.time.DurationField durationField4 = gJChronology0.millis();
        org.joda.time.DurationField durationField5 = gJChronology0.eras();
        org.joda.time.DurationField durationField6 = gJChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField5", Math.signum(durationField4.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField4)));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        long long6 = gJChronology1.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField7 = gJChronology1.eras();
        long long9 = gJChronology1.gregorianToJulianByYear(10000L);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology1.halfdayOfDay();
        org.joda.time.chrono.AssembledChronology.Fields fields11 = null;
        gJChronology1.assemble(fields11);
        org.joda.time.DurationField durationField13 = gJChronology1.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField13, and durationField7", !(durationField7.compareTo(durationField13) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField13.compareTo(durationField7))));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology7.minuteOfHour();
        int int9 = gJChronology7.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField10 = gJChronology7.halfdays();
        boolean boolean12 = gJChronology7.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField13 = gJChronology7.months();
        org.joda.time.Instant instant14 = gJChronology7.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant14);
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology16.centuryOfEra();
        long long19 = gJChronology16.gregorianToJulianByWeekyear((long) ' ');
        org.joda.time.DateTimeField dateTimeField20 = gJChronology16.millisOfDay();
        org.joda.time.Instant instant21 = gJChronology16.getGregorianCutover();
        org.joda.time.DurationField durationField22 = gJChronology16.eras();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology16.weekyearOfCentury();
        org.joda.time.Instant instant24 = gJChronology16.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField22", Math.signum(durationField10.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField10)));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = gJChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.era();
        org.joda.time.DurationField durationField9 = gJChronology0.weekyears();
        org.joda.time.DurationField durationField10 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField6, and durationField9", !(durationField10.compareTo(durationField6) == 0) || (Math.signum(durationField10.compareTo(durationField9)) == Math.signum(durationField6.compareTo(durationField9))));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        long long9 = gJChronology0.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology10.minuteOfHour();
        org.joda.time.Instant instant12 = gJChronology10.getGregorianCutover();
        boolean boolean13 = gJChronology0.equals((java.lang.Object) gJChronology10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = gJChronology0.withZone(dateTimeZone14);
        org.joda.time.DurationField durationField16 = gJChronology0.weekyears();
        org.joda.time.DurationField durationField17 = gJChronology0.centuries();
        org.joda.time.DurationField durationField18 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField16, and durationField17", !(durationField18.compareTo(durationField16) == 0) || (Math.signum(durationField18.compareTo(durationField17)) == Math.signum(durationField16.compareTo(durationField17))));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone1 = gJChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone2);
        long long7 = gJChronology3.add((long) 'a', (long) 10, (int) '#');
        org.joda.time.chrono.AssembledChronology.Fields fields8 = null;
        gJChronology3.assemble(fields8);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.yearOfEra();
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.centuryOfEra();
        boolean boolean14 = gJChronology11.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone15 = gJChronology11.getZone();
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15);
        org.joda.time.Chronology chronology17 = gJChronology3.withZone(dateTimeZone15);
        org.joda.time.DurationField durationField18 = gJChronology3.years();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology3.minuteOfHour();
        org.joda.time.Instant instant21 = gJChronology3.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (org.joda.time.ReadableInstant) instant21);
        org.joda.time.DateTimeZone dateTimeZone23 = gJChronology22.getZone();
        org.joda.time.DurationField durationField24 = gJChronology22.years();
        org.joda.time.DurationField durationField25 = gJChronology22.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField24", (durationField18.compareTo(durationField24) == 0) == durationField18.equals(durationField24));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        long long3 = gJChronology0.gregorianToJulianByWeekyear((long) ' ');
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.millisOfDay();
        org.joda.time.Instant instant5 = gJChronology0.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology6.getZone();
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.minuteOfHour();
        int int10 = gJChronology8.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology8.dayOfYear();
        long long17 = gJChronology8.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField18 = gJChronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology8.centuryOfEra();
        org.joda.time.Instant instant20 = gJChronology8.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant20);
        org.joda.time.Chronology chronology22 = gJChronology0.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField23 = gJChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology0.hourOfHalfday();
        int int26 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField27 = gJChronology0.eras();
        org.joda.time.DurationField durationField28 = gJChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField28, and durationField27", !(durationField27.compareTo(durationField28) == 0) || (Math.signum(durationField27.compareTo(durationField27)) == Math.signum(durationField28.compareTo(durationField27))));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        long long6 = gJChronology1.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField7 = gJChronology1.eras();
        long long9 = gJChronology1.gregorianToJulianByYear(10000L);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology1.weekOfWeekyear();
        long long12 = gJChronology1.julianToGregorianByWeekyear(1209600031L);
        org.joda.time.DurationField durationField13 = gJChronology1.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField13, and durationField7", !(durationField7.compareTo(durationField13) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField13.compareTo(durationField7))));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        long long5 = gJChronology1.add((long) 'a', (long) 10, (int) '#');
        org.joda.time.chrono.AssembledChronology.Fields fields6 = null;
        gJChronology1.assemble(fields6);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology1.yearOfEra();
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.centuryOfEra();
        boolean boolean12 = gJChronology9.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone13 = gJChronology9.getZone();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13);
        org.joda.time.Chronology chronology15 = gJChronology1.withZone(dateTimeZone13);
        org.joda.time.DurationField durationField16 = gJChronology1.years();
        long long18 = gJChronology1.gregorianToJulianByYear(14607999L);
        org.joda.time.DurationField durationField19 = gJChronology1.millis();
        org.joda.time.DurationField durationField20 = gJChronology1.weekyears();
        org.joda.time.DurationField durationField21 = gJChronology1.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField20", (durationField16.compareTo(durationField20) == 0) == durationField16.equals(durationField20));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology5.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.centuryOfEra();
        long long13 = gJChronology8.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology8.getZone();
        org.joda.time.Chronology chronology15 = gJChronology5.withZone(dateTimeZone14);
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology16.minuteOfHour();
        org.joda.time.Instant instant18 = gJChronology16.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.Chronology chronology20 = gJChronology16.withZone(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology16.secondOfDay();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology16.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = gJChronology16.getZone();
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology24.minuteOfHour();
        int int26 = gJChronology24.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology24.secondOfDay();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology24.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology24.dayOfYear();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology24.secondOfDay();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology24.monthOfYear();
        org.joda.time.Instant instant32 = gJChronology24.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23, (org.joda.time.ReadableInstant) instant32);
        org.joda.time.chrono.GJChronology gJChronology34 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23);
        org.joda.time.chrono.GJChronology gJChronology35 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology35.minuteOfHour();
        int int37 = gJChronology35.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField38 = gJChronology35.halfdays();
        boolean boolean40 = gJChronology35.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField41 = gJChronology35.months();
        org.joda.time.Instant instant42 = gJChronology35.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology44 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23, (org.joda.time.ReadableInstant) instant42, 1);
        org.joda.time.chrono.GJChronology gJChronology45 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.chrono.GJChronology gJChronology47 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone46);
        long long51 = gJChronology47.add((long) 'a', (long) 10, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.chrono.GJChronology gJChronology53 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone52);
        org.joda.time.DateTimeField dateTimeField54 = gJChronology53.era();
        boolean boolean55 = gJChronology47.equals((java.lang.Object) gJChronology53);
        long long57 = gJChronology53.julianToGregorianByWeekyear((-2419200000L));
        org.joda.time.DurationField durationField58 = gJChronology53.weeks();
        org.joda.time.Instant instant59 = gJChronology53.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology61 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23, (org.joda.time.ReadableInstant) instant59, 4);
        org.joda.time.chrono.GJChronology gJChronology62 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, (org.joda.time.ReadableInstant) instant59);
        org.joda.time.chrono.GJChronology gJChronology63 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField64 = gJChronology63.minuteOfHour();
        org.joda.time.Instant instant65 = gJChronology63.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.Chronology chronology67 = gJChronology63.withZone(dateTimeZone66);
        org.joda.time.DateTimeField dateTimeField68 = gJChronology63.dayOfMonth();
        long long72 = gJChronology63.add(447L, (long) 0, (int) 'a');
        org.joda.time.DateTimeField dateTimeField73 = gJChronology63.clockhourOfHalfday();
        int int74 = gJChronology63.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField75 = gJChronology63.millis();
        long long79 = gJChronology63.add((long) 4, (long) 10, 1);
        org.joda.time.DurationField durationField80 = gJChronology63.weeks();
        org.joda.time.DateTimeField dateTimeField81 = gJChronology63.millisOfDay();
        org.joda.time.DurationField durationField82 = gJChronology63.months();
        org.joda.time.DateTimeField dateTimeField83 = gJChronology63.millisOfDay();
        org.joda.time.DateTimeField dateTimeField84 = gJChronology63.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone85 = gJChronology63.getZone();
        org.joda.time.chrono.GJChronology gJChronology86 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField87 = gJChronology86.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField88 = gJChronology86.monthOfYear();
        org.joda.time.DateTimeField dateTimeField89 = gJChronology86.centuryOfEra();
        org.joda.time.Instant instant90 = gJChronology86.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology91 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone85, (org.joda.time.ReadableInstant) instant90);
        org.joda.time.chrono.GJChronology gJChronology93 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, (org.joda.time.ReadableInstant) instant90, (int) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField58 and durationField80", (durationField58.compareTo(durationField80) == 0) == durationField58.equals(durationField80));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        long long6 = gJChronology1.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField7 = gJChronology1.eras();
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.centuryOfEra();
        boolean boolean11 = gJChronology8.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology8.getZone();
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        org.joda.time.Chronology chronology14 = gJChronology1.withZone(dateTimeZone12);
        long long20 = gJChronology1.getDateTimeMillis((-1209599969L), 10, 1, 4, (int) (short) 0);
        org.joda.time.DurationField durationField21 = gJChronology1.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField21, and durationField7", !(durationField7.compareTo(durationField21) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField21.compareTo(durationField7))));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfMonth();
        long long9 = gJChronology0.add(447L, (long) 0, (int) 'a');
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.year();
        long long16 = gJChronology0.getDateTimeMillis((long) '4', 1, 0, (int) '4', 0);
        org.joda.time.DateTimeField dateTimeField17 = gJChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology0.yearOfEra();
        org.joda.time.DurationField durationField19 = gJChronology0.eras();
        org.joda.time.DurationField durationField20 = gJChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField20, and durationField19", !(durationField19.compareTo(durationField20) == 0) || (Math.signum(durationField19.compareTo(durationField19)) == Math.signum(durationField20.compareTo(durationField19))));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        long long5 = gJChronology1.add((long) 'a', (long) 10, (int) '#');
        org.joda.time.chrono.AssembledChronology.Fields fields6 = null;
        gJChronology1.assemble(fields6);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology1.yearOfEra();
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.centuryOfEra();
        boolean boolean12 = gJChronology9.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone13 = gJChronology9.getZone();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13);
        org.joda.time.Chronology chronology15 = gJChronology1.withZone(dateTimeZone13);
        org.joda.time.DurationField durationField16 = gJChronology1.years();
        long long18 = gJChronology1.gregorianToJulianByYear(14607999L);
        org.joda.time.DurationField durationField19 = gJChronology1.millis();
        org.joda.time.DurationField durationField20 = gJChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology1.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField20", (durationField16.compareTo(durationField20) == 0) == durationField16.equals(durationField20));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        long long6 = gJChronology1.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField7 = gJChronology1.eras();
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.centuryOfEra();
        boolean boolean11 = gJChronology8.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology8.getZone();
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        org.joda.time.Chronology chronology14 = gJChronology1.withZone(dateTimeZone12);
        long long16 = gJChronology1.julianToGregorianByYear((-1L));
        long long18 = gJChronology1.julianToGregorianByWeekyear((long) '#');
        org.joda.time.chrono.AssembledChronology.Fields fields19 = null;
        gJChronology1.assemble(fields19);
        org.joda.time.DurationField durationField21 = gJChronology1.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField21, and durationField7", !(durationField7.compareTo(durationField21) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField21.compareTo(durationField7))));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = gJChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.era();
        org.joda.time.DurationField durationField9 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.secondOfDay();
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology12.minuteOfHour();
        int int14 = gJChronology12.getMinimumDaysInFirstWeek();
        boolean boolean16 = gJChronology12.equals((java.lang.Object) 100.0d);
        org.joda.time.DurationField durationField17 = gJChronology12.eras();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology12.year();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology12.era();
        boolean boolean20 = gJChronology0.equals((java.lang.Object) dateTimeField19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField17", Math.signum(durationField6.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField6)));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        long long5 = gJChronology1.add((long) 'a', (long) 10, (int) '#');
        org.joda.time.chrono.AssembledChronology.Fields fields6 = null;
        gJChronology1.assemble(fields6);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology1.weekyear();
        org.joda.time.DurationField durationField9 = gJChronology1.days();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField11 = gJChronology1.eras();
        org.joda.time.DurationField durationField12 = gJChronology1.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField11", Math.signum(durationField9.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField9)));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.monthOfYear();
        org.joda.time.Instant instant8 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.yearOfEra();
        org.joda.time.DurationField durationField11 = gJChronology0.eras();
        org.joda.time.DurationField durationField12 = gJChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField12, and durationField11", !(durationField11.compareTo(durationField12) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField12.compareTo(durationField11))));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.minuteOfHour();
        org.joda.time.Instant instant5 = gJChronology3.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.Chronology chronology7 = gJChronology3.withZone(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField9 = gJChronology3.centuries();
        boolean boolean10 = gJChronology1.equals((java.lang.Object) durationField9);
        org.joda.time.DurationField durationField11 = gJChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology1.minuteOfDay();
        org.joda.time.DurationField durationField14 = gJChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology1.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField14", (durationField9.compareTo(durationField14) == 0) == durationField9.equals(durationField14));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        long long9 = gJChronology0.add((long) (byte) -1, (long) (short) 0, 4);
        long long11 = gJChronology0.julianToGregorianByWeekyear((long) 4);
        org.joda.time.DurationField durationField12 = gJChronology0.eras();
        org.joda.time.DurationField durationField13 = gJChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField13, and durationField12", !(durationField12.compareTo(durationField13) == 0) || (Math.signum(durationField12.compareTo(durationField12)) == Math.signum(durationField13.compareTo(durationField12))));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology1.monthOfYear();
        long long7 = gJChronology1.add((-1L), (long) (short) 1, (int) (short) -1);
        org.joda.time.DurationField durationField8 = gJChronology1.weekyears();
        long long12 = gJChronology1.add(1036800010L, (-62165404799998L), (int) 'a');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField8", (durationField2.compareTo(durationField8) == 0) == durationField2.equals(durationField8));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology5.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology5.getZone();
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.minuteOfHour();
        int int10 = gJChronology8.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology8.dayOfYear();
        long long17 = gJChronology8.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField18 = gJChronology8.dayOfWeek();
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology19.minuteOfHour();
        int int21 = gJChronology19.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology19.secondOfDay();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology19.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology19.dayOfYear();
        long long28 = gJChronology19.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField29 = gJChronology19.weekyear();
        boolean boolean30 = gJChronology8.equals((java.lang.Object) gJChronology19);
        int int31 = gJChronology19.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField32 = gJChronology19.centuries();
        long long34 = gJChronology19.gregorianToJulianByYear((-2L));
        org.joda.time.chrono.GJChronology gJChronology35 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology35.minuteOfHour();
        int int37 = gJChronology35.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology35.secondOfDay();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology35.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField40 = gJChronology35.dayOfYear();
        long long44 = gJChronology35.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField45 = gJChronology35.dayOfWeek();
        org.joda.time.chrono.GJChronology gJChronology46 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField47 = gJChronology46.minuteOfHour();
        int int48 = gJChronology46.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField49 = gJChronology46.secondOfDay();
        org.joda.time.DateTimeField dateTimeField50 = gJChronology46.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField51 = gJChronology46.dayOfYear();
        long long55 = gJChronology46.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField56 = gJChronology46.weekyear();
        boolean boolean57 = gJChronology35.equals((java.lang.Object) gJChronology46);
        org.joda.time.DateTimeZone dateTimeZone58 = gJChronology35.getZone();
        org.joda.time.Chronology chronology59 = gJChronology19.withZone(dateTimeZone58);
        org.joda.time.chrono.GJChronology gJChronology60 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField61 = gJChronology60.minuteOfHour();
        int int62 = gJChronology60.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField63 = gJChronology60.secondOfDay();
        org.joda.time.DateTimeField dateTimeField64 = gJChronology60.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField65 = gJChronology60.dayOfYear();
        org.joda.time.Instant instant66 = gJChronology60.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology67 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone58, (org.joda.time.ReadableInstant) instant66);
        org.joda.time.chrono.GJChronology gJChronology68 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant66);
        org.joda.time.chrono.GJChronology gJChronology69 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField70 = gJChronology69.centuryOfEra();
        long long72 = gJChronology69.gregorianToJulianByWeekyear((long) ' ');
        org.joda.time.DateTimeField dateTimeField73 = gJChronology69.millisOfDay();
        org.joda.time.Instant instant74 = gJChronology69.getGregorianCutover();
        org.joda.time.DurationField durationField75 = gJChronology69.eras();
        org.joda.time.DateTimeField dateTimeField76 = gJChronology69.weekyearOfCentury();
        org.joda.time.Instant instant77 = gJChronology69.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology78 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField32 and durationField75", Math.signum(durationField32.compareTo(durationField75)) == -Math.signum(durationField75.compareTo(durationField32)));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.minuteOfDay();
        org.joda.time.DurationField durationField7 = gJChronology0.eras();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = gJChronology0.add(readablePeriod8, (-1209599969L), (int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField7", Math.signum(durationField3.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField3)));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = gJChronology0.eras();
        org.joda.time.DurationField durationField9 = gJChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField9, and durationField8", !(durationField8.compareTo(durationField9) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField9.compareTo(durationField8))));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        long long3 = gJChronology0.gregorianToJulianByWeekyear((long) ' ');
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.millisOfDay();
        org.joda.time.Instant instant5 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField6 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.dayOfMonth();
        org.joda.time.DurationField durationField11 = gJChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField11, and durationField6", !(durationField6.compareTo(durationField11) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField11.compareTo(durationField6))));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        long long5 = gJChronology1.add((long) 'a', (long) 10, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology7.era();
        boolean boolean9 = gJChronology1.equals((java.lang.Object) gJChronology7);
        org.joda.time.DurationField durationField10 = gJChronology7.hours();
        org.joda.time.DurationField durationField11 = gJChronology7.centuries();
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology12.minuteOfHour();
        org.joda.time.Instant instant14 = gJChronology12.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.Chronology chronology16 = gJChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = gJChronology12.clockhourOfDay();
        org.joda.time.DurationField durationField18 = gJChronology12.centuries();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology12.hourOfHalfday();
        boolean boolean20 = gJChronology7.equals((java.lang.Object) gJChronology12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField18", (durationField11.compareTo(durationField18) == 0) == durationField11.equals(durationField18));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        long long6 = gJChronology1.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField7 = gJChronology1.eras();
        long long9 = gJChronology1.gregorianToJulianByYear(10000L);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology1.dayOfWeek();
        org.joda.time.DurationField durationField12 = gJChronology1.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField12, and durationField7", !(durationField7.compareTo(durationField12) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField12.compareTo(durationField7))));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        long long3 = gJChronology0.gregorianToJulianByWeekyear((long) ' ');
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.millisOfDay();
        org.joda.time.Instant instant5 = gJChronology0.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology6.getZone();
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.minuteOfHour();
        int int10 = gJChronology8.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology8.dayOfYear();
        long long17 = gJChronology8.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField18 = gJChronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology8.centuryOfEra();
        org.joda.time.Instant instant20 = gJChronology8.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant20);
        org.joda.time.Chronology chronology22 = gJChronology0.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField23 = gJChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology0.hourOfHalfday();
        int int26 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField27 = gJChronology0.eras();
        org.joda.time.DurationField durationField28 = gJChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField28, and durationField27", !(durationField27.compareTo(durationField28) == 0) || (Math.signum(durationField27.compareTo(durationField27)) == Math.signum(durationField28.compareTo(durationField27))));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = gJChronology0.withZone(dateTimeZone4);
        org.joda.time.DurationField durationField6 = gJChronology0.millis();
        org.joda.time.DurationField durationField7 = gJChronology0.years();
        org.joda.time.DurationField durationField8 = gJChronology0.hours();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.era();
        org.joda.time.DurationField durationField10 = gJChronology0.weeks();
        long long14 = gJChronology0.add((-71792001L), (-12L), 4);
        org.joda.time.DurationField durationField15 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField6, and durationField7", !(durationField15.compareTo(durationField6) == 0) || (Math.signum(durationField15.compareTo(durationField7)) == Math.signum(durationField6.compareTo(durationField7))));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DurationField durationField4 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.secondOfDay();
        long long8 = gJChronology0.julianToGregorianByWeekyear((-2L));
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.minuteOfHour();
        org.joda.time.Instant instant11 = gJChronology9.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.Chronology chronology13 = gJChronology9.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = gJChronology9.dayOfMonth();
        long long18 = gJChronology9.add(447L, (long) 0, (int) 'a');
        org.joda.time.DateTimeField dateTimeField19 = gJChronology9.year();
        long long23 = gJChronology9.add((long) ' ', (long) (-1), 1);
        org.joda.time.DurationField durationField24 = gJChronology9.halfdays();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology9.year();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology9.dayOfYear();
        boolean boolean27 = gJChronology0.equals((java.lang.Object) gJChronology9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField24", Math.signum(durationField4.compareTo(durationField24)) == -Math.signum(durationField24.compareTo(durationField4)));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.centuryOfEra();
        long long13 = gJChronology8.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField14 = gJChronology8.eras();
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology15.centuryOfEra();
        boolean boolean18 = gJChronology15.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone19 = gJChronology15.getZone();
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19);
        org.joda.time.Chronology chronology21 = gJChronology8.withZone(dateTimeZone19);
        boolean boolean22 = gJChronology0.equals((java.lang.Object) gJChronology8);
        org.joda.time.DurationField durationField23 = gJChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField23, and durationField14", !(durationField14.compareTo(durationField23) == 0) || (Math.signum(durationField14.compareTo(durationField14)) == Math.signum(durationField23.compareTo(durationField14))));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        long long6 = gJChronology1.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField7 = gJChronology1.eras();
        long long9 = gJChronology1.gregorianToJulianByYear(10000L);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology1.hourOfDay();
        org.joda.time.Chronology chronology14 = gJChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField16 = gJChronology1.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField16, and durationField7", !(durationField7.compareTo(durationField16) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField16.compareTo(durationField7))));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        long long5 = gJChronology1.add((long) 'a', (long) 10, (int) '#');
        org.joda.time.DateTimeField dateTimeField6 = gJChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = gJChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology1.centuryOfEra();
        org.joda.time.chrono.AssembledChronology.Fields fields9 = null;
        gJChronology1.assemble(fields9);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology1.hourOfHalfday();
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology12.minuteOfHour();
        int int14 = gJChronology12.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField15 = gJChronology12.halfdays();
        boolean boolean17 = gJChronology12.equals((java.lang.Object) 100);
        org.joda.time.DateTimeField dateTimeField18 = gJChronology12.clockhourOfHalfday();
        long long22 = gJChronology12.add(52L, (-1123200001L), 100);
        boolean boolean23 = gJChronology1.equals((java.lang.Object) 52L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField15", (durationField7.compareTo(durationField15) == 0) == durationField7.equals(durationField15));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        long long5 = gJChronology0.gregorianToJulianByYear((long) (byte) 0);
        org.joda.time.DurationField durationField6 = gJChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.millisOfSecond();
        org.joda.time.Instant instant8 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField9 = gJChronology0.hours();
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology10.minuteOfHour();
        int int12 = gJChronology10.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology10.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology10.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology10.dayOfYear();
        long long19 = gJChronology10.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology20.minuteOfHour();
        org.joda.time.Instant instant22 = gJChronology20.getGregorianCutover();
        boolean boolean23 = gJChronology10.equals((java.lang.Object) gJChronology20);
        org.joda.time.DateTimeField dateTimeField24 = gJChronology20.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology20.minuteOfHour();
        boolean boolean26 = gJChronology0.equals((java.lang.Object) gJChronology20);
        org.joda.time.DurationField durationField27 = gJChronology20.days();
        org.joda.time.DurationField durationField28 = gJChronology20.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField6, and durationField9", !(durationField28.compareTo(durationField6) == 0) || (Math.signum(durationField28.compareTo(durationField9)) == Math.signum(durationField6.compareTo(durationField9))));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        long long4 = gJChronology0.julianToGregorianByYear((-1L));
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology5.centuryOfEra();
        boolean boolean8 = gJChronology5.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone9 = gJChronology5.getZone();
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology10.minuteOfHour();
        org.joda.time.Instant instant12 = gJChronology10.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.Chronology chronology14 = gJChronology10.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology10.clockhourOfDay();
        org.joda.time.DurationField durationField16 = gJChronology10.centuries();
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology17.centuryOfEra();
        boolean boolean20 = gJChronology17.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone21 = gJChronology17.getZone();
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone21);
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology23.minuteOfHour();
        org.joda.time.Instant instant25 = gJChronology23.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone21, (org.joda.time.ReadableInstant) instant25);
        org.joda.time.Chronology chronology27 = gJChronology10.withZone(dateTimeZone21);
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology28.minuteOfHour();
        int int30 = gJChronology28.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology28.weekyear();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.Chronology chronology33 = gJChronology28.withZone(dateTimeZone32);
        org.joda.time.DurationField durationField34 = gJChronology28.millis();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology28.dayOfWeek();
        org.joda.time.Instant instant36 = gJChronology28.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone21, (org.joda.time.ReadableInstant) instant36);
        org.joda.time.chrono.GJChronology gJChronology38 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9, (org.joda.time.ReadableInstant) instant36);
        org.joda.time.Chronology chronology39 = gJChronology0.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField40 = gJChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology0.secondOfDay();
        long long43 = gJChronology0.gregorianToJulianByYear((-2332799948L));
        org.joda.time.Instant instant44 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField45 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField45, durationField16, and durationField34", !(durationField45.compareTo(durationField16) == 0) || (Math.signum(durationField45.compareTo(durationField34)) == Math.signum(durationField16.compareTo(durationField34))));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.minuteOfHour();
        org.joda.time.Instant instant5 = gJChronology3.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.Chronology chronology7 = gJChronology3.withZone(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField9 = gJChronology3.centuries();
        boolean boolean10 = gJChronology1.equals((java.lang.Object) durationField9);
        java.lang.String str11 = gJChronology1.toString();
        int int12 = gJChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField13 = gJChronology1.halfdays();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.minuteOfHour();
        org.joda.time.DurationField durationField16 = gJChronology14.weekyears();
        org.joda.time.DurationField durationField17 = gJChronology14.weeks();
        org.joda.time.DurationField durationField18 = gJChronology14.days();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology14.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology14.weekyear();
        org.joda.time.DurationField durationField21 = gJChronology14.years();
        boolean boolean22 = gJChronology1.equals((java.lang.Object) gJChronology14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField16", (durationField2.compareTo(durationField16) == 0) == durationField2.equals(durationField16));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        long long5 = gJChronology1.add((long) 'a', (long) 10, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology7.era();
        boolean boolean9 = gJChronology1.equals((java.lang.Object) gJChronology7);
        long long11 = gJChronology7.julianToGregorianByWeekyear((-2419200000L));
        org.joda.time.DurationField durationField12 = gJChronology7.weeks();
        org.joda.time.Instant instant13 = gJChronology7.getGregorianCutover();
        org.joda.time.DurationField durationField14 = gJChronology7.eras();
        int int15 = gJChronology7.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField12 and durationField14", Math.signum(durationField12.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField12)));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        long long3 = gJChronology0.gregorianToJulianByWeekyear((long) ' ');
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.millisOfDay();
        org.joda.time.Instant instant5 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField6 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology0.getZone();
        org.joda.time.DurationField durationField12 = gJChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField12, and durationField6", !(durationField6.compareTo(durationField12) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField12.compareTo(durationField6))));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.minuteOfHour();
        org.joda.time.Instant instant5 = gJChronology3.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.Chronology chronology7 = gJChronology3.withZone(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField9 = gJChronology3.centuries();
        boolean boolean10 = gJChronology1.equals((java.lang.Object) durationField9);
        org.joda.time.DurationField durationField11 = gJChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology1.minuteOfDay();
        org.joda.time.DurationField durationField14 = gJChronology1.centuries();
        org.joda.time.DurationField durationField15 = gJChronology1.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField14", (durationField9.compareTo(durationField14) == 0) == durationField9.equals(durationField14));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfMonth();
        long long9 = gJChronology0.add(447L, (long) 0, (int) 'a');
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.year();
        org.joda.time.DurationField durationField11 = gJChronology0.days();
        org.joda.time.DurationField durationField12 = gJChronology0.weekyears();
        long long14 = gJChronology0.gregorianToJulianByWeekyear((long) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = gJChronology0.add(readablePeriod15, 3456000447L, (int) '4');
        org.joda.time.DateTimeField dateTimeField19 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = gJChronology0.add(readablePeriod21, 1209600091L, (int) '4');
        org.joda.time.DateTimeField dateTimeField25 = gJChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField26 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField11, and durationField12", !(durationField26.compareTo(durationField11) == 0) || (Math.signum(durationField26.compareTo(durationField12)) == Math.signum(durationField11.compareTo(durationField12))));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        long long5 = gJChronology1.add((long) 'a', (long) 10, (int) '#');
        org.joda.time.chrono.AssembledChronology.Fields fields6 = null;
        gJChronology1.assemble(fields6);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology1.yearOfEra();
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.centuryOfEra();
        boolean boolean12 = gJChronology9.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone13 = gJChronology9.getZone();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13);
        org.joda.time.Chronology chronology15 = gJChronology1.withZone(dateTimeZone13);
        org.joda.time.DurationField durationField16 = gJChronology1.years();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology1.minuteOfHour();
        int int19 = gJChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField20 = gJChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology1.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField20", (durationField16.compareTo(durationField20) == 0) == durationField16.equals(durationField20));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology1.weekOfWeekyear();
        org.joda.time.Chronology chronology4 = gJChronology1.withUTC();
        long long8 = gJChronology1.add((-58987180799968L), (-1209599903L), 0);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.centuryOfEra();
        org.joda.time.DurationField durationField11 = gJChronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology9.hourOfHalfday();
        org.joda.time.DurationField durationField13 = gJChronology9.minutes();
        boolean boolean14 = gJChronology1.equals((java.lang.Object) gJChronology9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField11", (durationField2.compareTo(durationField11) == 0) == durationField2.equals(durationField11));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.weekyear();
        org.joda.time.Chronology chronology4 = gJChronology0.withUTC();
        long long6 = gJChronology0.gregorianToJulianByWeekyear((-1209599996L));
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = gJChronology0.add(readablePeriod8, 1209600001L, (int) (short) 100);
        org.joda.time.DurationField durationField12 = gJChronology0.years();
        org.joda.time.DurationField durationField13 = gJChronology0.weekyears();
        java.lang.Class<?> wildcardClass14 = durationField13.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField13", (durationField12.compareTo(durationField13) == 0) == durationField12.equals(durationField13));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        long long5 = gJChronology1.add((long) 'a', (long) 10, (int) '#');
        org.joda.time.chrono.AssembledChronology.Fields fields6 = null;
        gJChronology1.assemble(fields6);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology1.weekyear();
        org.joda.time.DurationField durationField9 = gJChronology1.days();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField11 = gJChronology1.eras();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology1.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField11", Math.signum(durationField9.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField9)));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology5.minuteOfHour();
        org.joda.time.Instant instant7 = gJChronology5.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.Chronology chronology9 = gJChronology5.withZone(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology5.secondOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology5.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology5.getZone();
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology13.minuteOfHour();
        int int15 = gJChronology13.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology13.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology13.dayOfYear();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology13.monthOfYear();
        org.joda.time.Instant instant21 = gJChronology13.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, (org.joda.time.ReadableInstant) instant21);
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology24.minuteOfHour();
        int int26 = gJChronology24.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField27 = gJChronology24.halfdays();
        boolean boolean29 = gJChronology24.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField30 = gJChronology24.months();
        org.joda.time.Instant instant31 = gJChronology24.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, (org.joda.time.ReadableInstant) instant31, 1);
        org.joda.time.chrono.GJChronology gJChronology34 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant31);
        java.lang.String str35 = gJChronology34.toString();
        org.joda.time.DurationField durationField36 = gJChronology34.hours();
        org.joda.time.DurationField durationField37 = gJChronology34.years();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology34.dayOfYear();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology34.weekyear();
        org.joda.time.DurationField durationField40 = gJChronology34.weekyears();
        java.lang.String str41 = gJChronology34.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField37 and durationField40", (durationField37.compareTo(durationField40) == 0) == durationField37.equals(durationField40));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField3 = gJChronology0.years();
        org.joda.time.DurationField durationField4 = gJChronology0.weeks();
        org.joda.time.DurationField durationField5 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField12 = gJChronology11.years();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology11.monthOfYear();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology11.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15);
        long long20 = gJChronology16.add((long) 'a', (long) 10, (int) '#');
        org.joda.time.DateTimeField dateTimeField21 = gJChronology16.hourOfDay();
        org.joda.time.Chronology chronology22 = gJChronology16.withUTC();
        boolean boolean23 = gJChronology11.equals((java.lang.Object) gJChronology16);
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        java.lang.String str25 = gJChronology24.toString();
        org.joda.time.Instant instant26 = gJChronology24.getGregorianCutover();
        boolean boolean27 = gJChronology11.equals((java.lang.Object) gJChronology24);
        org.joda.time.DateTimeZone dateTimeZone28 = gJChronology11.getZone();
        org.joda.time.DurationField durationField29 = gJChronology11.years();
        boolean boolean30 = gJChronology0.equals((java.lang.Object) gJChronology11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField12", (durationField3.compareTo(durationField12) == 0) == durationField3.equals(durationField12));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.yearOfCentury();
        long long5 = gJChronology0.julianToGregorianByWeekyear((long) (-1));
        org.joda.time.Chronology chronology6 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = gJChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.year();
        long long12 = gJChronology0.gregorianToJulianByYear(3369610000L);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology0.secondOfMinute();
        org.joda.time.DurationField durationField14 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField1, and durationField8", !(durationField14.compareTo(durationField1) == 0) || (Math.signum(durationField14.compareTo(durationField8)) == Math.signum(durationField1.compareTo(durationField8))));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        long long3 = gJChronology0.gregorianToJulianByWeekyear((long) ' ');
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.millisOfDay();
        org.joda.time.Instant instant5 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField6 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField11 = gJChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField11, and durationField6", !(durationField6.compareTo(durationField11) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField11.compareTo(durationField6))));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.Instant instant6 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField7 = gJChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.weekyear();
        org.joda.time.DurationField durationField9 = gJChronology0.months();
        org.joda.time.Instant instant10 = gJChronology0.getGregorianCutover();
        int int11 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField12 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField3, and durationField7", !(durationField12.compareTo(durationField3) == 0) || (Math.signum(durationField12.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        org.joda.time.DurationField durationField2 = gJChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.hourOfDay();
        org.joda.time.DurationField durationField5 = gJChronology0.eras();
        org.joda.time.DurationField durationField6 = gJChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField5", Math.signum(durationField2.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField2)));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.Instant instant6 = gJChronology0.getGregorianCutover();
        long long8 = gJChronology0.julianToGregorianByWeekyear((-1123200001L));
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.minuteOfHour();
        org.joda.time.DurationField durationField10 = gJChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.secondOfDay();
        org.joda.time.DurationField durationField12 = gJChronology0.eras();
        org.joda.time.DurationField durationField13 = gJChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField12", Math.signum(durationField13.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField13)));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfMonth();
        long long9 = gJChronology0.add(447L, (long) 0, (int) 'a');
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.year();
        long long16 = gJChronology0.getDateTimeMillis((long) '4', 1, 0, (int) '4', 0);
        org.joda.time.DateTimeField dateTimeField17 = gJChronology0.millisOfDay();
        org.joda.time.DurationField durationField18 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField20 = gJChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField20, and durationField18", !(durationField18.compareTo(durationField20) == 0) || (Math.signum(durationField18.compareTo(durationField18)) == Math.signum(durationField20.compareTo(durationField18))));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.era();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.hourOfDay();
        org.joda.time.DurationField durationField8 = gJChronology0.days();
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.minuteOfHour();
        int int11 = gJChronology9.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology9.weekyear();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.Chronology chronology14 = gJChronology9.withZone(dateTimeZone13);
        long long16 = gJChronology9.gregorianToJulianByWeekyear(1L);
        org.joda.time.DurationField durationField17 = gJChronology9.eras();
        boolean boolean18 = gJChronology0.equals((java.lang.Object) gJChronology9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField17", Math.signum(durationField8.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField8)));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        long long5 = gJChronology0.gregorianToJulianByYear((long) (byte) 0);
        org.joda.time.DurationField durationField6 = gJChronology0.years();
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology7.centuryOfEra();
        boolean boolean10 = gJChronology7.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology7.getZone();
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11);
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.minuteOfHour();
        int int16 = gJChronology14.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField17 = gJChronology14.halfdays();
        boolean boolean19 = gJChronology14.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField20 = gJChronology14.months();
        org.joda.time.Instant instant21 = gJChronology14.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) instant21);
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology23.minuteOfHour();
        org.joda.time.Instant instant25 = gJChronology23.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.Chronology chronology27 = gJChronology23.withZone(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = gJChronology23.secondOfDay();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology23.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone30 = gJChronology23.getZone();
        org.joda.time.chrono.GJChronology gJChronology31 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology31.minuteOfHour();
        int int33 = gJChronology31.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology31.secondOfDay();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology31.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology31.dayOfYear();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology31.secondOfDay();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology31.monthOfYear();
        org.joda.time.Instant instant39 = gJChronology31.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology40 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone30, (org.joda.time.ReadableInstant) instant39);
        org.joda.time.chrono.GJChronology gJChronology41 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone30);
        org.joda.time.chrono.GJChronology gJChronology42 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology42.minuteOfHour();
        int int44 = gJChronology42.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField45 = gJChronology42.halfdays();
        boolean boolean47 = gJChronology42.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField48 = gJChronology42.months();
        org.joda.time.Instant instant49 = gJChronology42.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology51 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone30, (org.joda.time.ReadableInstant) instant49, 1);
        org.joda.time.chrono.GJChronology gJChronology53 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) instant49, (int) (short) 1);
        org.joda.time.Chronology chronology54 = gJChronology0.withZone(dateTimeZone11);
        org.joda.time.DurationField durationField55 = gJChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField56 = gJChronology0.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField55", (durationField6.compareTo(durationField55) == 0) == durationField6.equals(durationField55));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology1.dayOfYear();
        long long5 = gJChronology1.julianToGregorianByWeekyear((-1L));
        long long9 = gJChronology1.add(1123200014L, (long) ' ', (int) ' ');
        org.joda.time.DateTimeField dateTimeField10 = gJChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology1.centuryOfEra();
        org.joda.time.DurationField durationField12 = gJChronology1.seconds();
        org.joda.time.chrono.AssembledChronology.Fields fields13 = null;
        gJChronology1.assemble(fields13);
        org.joda.time.DurationField durationField15 = gJChronology1.days();
        org.joda.time.DurationField durationField16 = gJChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField2, and durationField12", !(durationField16.compareTo(durationField2) == 0) || (Math.signum(durationField16.compareTo(durationField12)) == Math.signum(durationField2.compareTo(durationField12))));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.weekyear();
        org.joda.time.Chronology chronology4 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.yearOfEra();
        org.joda.time.DurationField durationField6 = gJChronology0.weekyears();
        org.joda.time.DurationField durationField7 = gJChronology0.eras();
        org.joda.time.DurationField durationField8 = gJChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField7", Math.signum(durationField6.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField6)));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        java.lang.String str2 = gJChronology0.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = gJChronology0.add(readablePeriod3, (long) '4', (int) '4');
        org.joda.time.DurationField durationField7 = gJChronology0.minutes();
        org.joda.time.DurationField durationField8 = gJChronology0.eras();
        long long10 = gJChronology0.gregorianToJulianByYear((-1209600002L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField8", Math.signum(durationField7.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField7)));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = gJChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.era();
        org.joda.time.DurationField durationField9 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField9", Math.signum(durationField6.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField6)));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        long long6 = gJChronology1.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField7 = gJChronology1.eras();
        long long9 = gJChronology1.gregorianToJulianByYear(10000L);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology1.halfdayOfDay();
        org.joda.time.chrono.AssembledChronology.Fields fields11 = null;
        gJChronology1.assemble(fields11);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology1.year();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology1.yearOfCentury();
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology15.minuteOfHour();
        org.joda.time.Instant instant17 = gJChronology15.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology18.centuryOfEra();
        boolean boolean21 = gJChronology18.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone22 = gJChronology18.getZone();
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone22);
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology24.minuteOfHour();
        int int26 = gJChronology24.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField27 = gJChronology24.halfdays();
        boolean boolean29 = gJChronology24.equals((java.lang.Object) 100);
        org.joda.time.Instant instant30 = gJChronology24.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology31 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone22, (org.joda.time.ReadableInstant) instant30);
        org.joda.time.Chronology chronology32 = gJChronology15.withZone(dateTimeZone22);
        boolean boolean33 = gJChronology1.equals((java.lang.Object) chronology32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField27", Math.signum(durationField7.compareTo(durationField27)) == -Math.signum(durationField27.compareTo(durationField7)));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.secondOfDay();
        org.joda.time.DurationField durationField7 = gJChronology0.weeks();
        org.joda.time.DurationField durationField8 = gJChronology0.eras();
        org.joda.time.DurationField durationField9 = gJChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField8", Math.signum(durationField9.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField9)));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        org.joda.time.DurationField durationField2 = gJChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.centuryOfEra();
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.centuryOfEra();
        boolean boolean7 = gJChronology4.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology4.getZone();
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8);
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8);
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.minuteOfHour();
        int int13 = gJChronology11.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField14 = gJChronology11.halfdays();
        boolean boolean16 = gJChronology11.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField17 = gJChronology11.months();
        org.joda.time.Instant instant18 = gJChronology11.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, (org.joda.time.ReadableInstant) instant18);
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology20.minuteOfHour();
        org.joda.time.Instant instant22 = gJChronology20.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.Chronology chronology24 = gJChronology20.withZone(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField25 = gJChronology20.secondOfDay();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology20.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone27 = gJChronology20.getZone();
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology28.minuteOfHour();
        int int30 = gJChronology28.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology28.secondOfDay();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology28.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology28.dayOfYear();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology28.secondOfDay();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology28.monthOfYear();
        org.joda.time.Instant instant36 = gJChronology28.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27, (org.joda.time.ReadableInstant) instant36);
        org.joda.time.chrono.GJChronology gJChronology38 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27);
        org.joda.time.chrono.GJChronology gJChronology39 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField40 = gJChronology39.minuteOfHour();
        int int41 = gJChronology39.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField42 = gJChronology39.halfdays();
        boolean boolean44 = gJChronology39.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField45 = gJChronology39.months();
        org.joda.time.Instant instant46 = gJChronology39.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology48 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27, (org.joda.time.ReadableInstant) instant46, 1);
        org.joda.time.chrono.GJChronology gJChronology50 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, (org.joda.time.ReadableInstant) instant46, (int) (short) 1);
        org.joda.time.chrono.GJChronology gJChronology51 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField52 = gJChronology51.minuteOfHour();
        int int53 = gJChronology51.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField54 = gJChronology51.weekyear();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.Chronology chronology56 = gJChronology51.withZone(dateTimeZone55);
        org.joda.time.DurationField durationField57 = gJChronology51.millis();
        org.joda.time.DateTimeField dateTimeField58 = gJChronology51.clockhourOfHalfday();
        org.joda.time.Instant instant59 = gJChronology51.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology60 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, (org.joda.time.ReadableInstant) instant59);
        org.joda.time.Chronology chronology61 = gJChronology0.withZone(dateTimeZone8);
        org.joda.time.chrono.GJChronology gJChronology64 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, 3652000L, (int) (short) 1);
        org.joda.time.DurationField durationField65 = gJChronology64.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField65, durationField2, and durationField14", !(durationField65.compareTo(durationField2) == 0) || (Math.signum(durationField65.compareTo(durationField14)) == Math.signum(durationField2.compareTo(durationField14))));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        long long5 = gJChronology1.add((long) 'a', (long) 10, (int) '#');
        org.joda.time.DateTimeField dateTimeField6 = gJChronology1.hourOfDay();
        org.joda.time.Chronology chronology7 = gJChronology1.withUTC();
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.centuryOfEra();
        boolean boolean11 = gJChronology8.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology8.getZone();
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology15.minuteOfHour();
        int int17 = gJChronology15.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField18 = gJChronology15.halfdays();
        boolean boolean20 = gJChronology15.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField21 = gJChronology15.months();
        org.joda.time.Instant instant22 = gJChronology15.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, (org.joda.time.ReadableInstant) instant22);
        org.joda.time.Chronology chronology24 = gJChronology1.withZone(dateTimeZone12);
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField26 = gJChronology25.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology25.weekyear();
        org.joda.time.DurationField durationField28 = gJChronology25.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField18, and durationField21", !(durationField28.compareTo(durationField18) == 0) || (Math.signum(durationField28.compareTo(durationField21)) == Math.signum(durationField18.compareTo(durationField21))));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        long long6 = gJChronology1.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField7 = gJChronology1.eras();
        long long9 = gJChronology1.gregorianToJulianByYear(10000L);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology1.dayOfWeek();
        java.lang.String str12 = gJChronology1.toString();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology1.year();
        org.joda.time.DurationField durationField16 = gJChronology1.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField16, and durationField7", !(durationField7.compareTo(durationField16) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField16.compareTo(durationField7))));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = gJChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.era();
        org.joda.time.DurationField durationField9 = gJChronology0.eras();
        org.joda.time.Chronology chronology10 = gJChronology0.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField9", Math.signum(durationField6.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField6)));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        long long9 = gJChronology0.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology10.minuteOfHour();
        org.joda.time.Instant instant12 = gJChronology10.getGregorianCutover();
        boolean boolean13 = gJChronology0.equals((java.lang.Object) gJChronology10);
        org.joda.time.DateTimeField dateTimeField14 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField16 = gJChronology0.months();
        org.joda.time.DurationField durationField17 = gJChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology0.year();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField20 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField16, and durationField17", !(durationField20.compareTo(durationField16) == 0) || (Math.signum(durationField20.compareTo(durationField17)) == Math.signum(durationField16.compareTo(durationField17))));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField2 = gJChronology0.hours();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.era();
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.minuteOfHour();
        int int6 = gJChronology4.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology4.weekyear();
        org.joda.time.Chronology chronology8 = gJChronology4.withUTC();
        long long10 = gJChronology4.gregorianToJulianByWeekyear((-1209599996L));
        org.joda.time.DateTimeField dateTimeField11 = gJChronology4.weekOfWeekyear();
        java.lang.String str12 = gJChronology4.toString();
        long long17 = gJChronology4.getDateTimeMillis((int) (byte) -1, (int) (short) 1, (int) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField18 = gJChronology4.clockhourOfDay();
        org.joda.time.DurationField durationField19 = gJChronology4.months();
        boolean boolean20 = gJChronology0.equals((java.lang.Object) gJChronology4);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology4.year();
        org.joda.time.DurationField durationField22 = gJChronology4.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField2, and durationField19", !(durationField22.compareTo(durationField2) == 0) || (Math.signum(durationField22.compareTo(durationField19)) == Math.signum(durationField2.compareTo(durationField19))));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.minuteOfHour();
        org.joda.time.Instant instant5 = gJChronology3.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.Chronology chronology7 = gJChronology3.withZone(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField9 = gJChronology3.centuries();
        boolean boolean10 = gJChronology1.equals((java.lang.Object) durationField9);
        java.lang.String str11 = gJChronology1.toString();
        org.joda.time.DurationField durationField12 = gJChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField2, and durationField9", !(durationField12.compareTo(durationField2) == 0) || (Math.signum(durationField12.compareTo(durationField9)) == Math.signum(durationField2.compareTo(durationField9))));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField3 = gJChronology0.hours();
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology6.centuryOfEra();
        boolean boolean9 = gJChronology6.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone10 = gJChronology6.getZone();
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology12.minuteOfHour();
        org.joda.time.Instant instant14 = gJChronology12.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10, (org.joda.time.ReadableInstant) instant14);
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant14);
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone18 = gJChronology17.getZone();
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology19.minuteOfHour();
        int int21 = gJChronology19.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology19.secondOfDay();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology19.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology19.dayOfYear();
        long long28 = gJChronology19.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField29 = gJChronology19.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology19.centuryOfEra();
        org.joda.time.Instant instant31 = gJChronology19.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18, (org.joda.time.ReadableInstant) instant31);
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant31);
        org.joda.time.DateTimeField dateTimeField34 = gJChronology33.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology33.millisOfSecond();
        org.joda.time.chrono.GJChronology gJChronology36 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology36.centuryOfEra();
        long long39 = gJChronology36.gregorianToJulianByWeekyear((long) ' ');
        org.joda.time.DateTimeField dateTimeField40 = gJChronology36.millisOfDay();
        org.joda.time.Instant instant41 = gJChronology36.getGregorianCutover();
        org.joda.time.DurationField durationField42 = gJChronology36.eras();
        boolean boolean43 = gJChronology33.equals((java.lang.Object) gJChronology36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField42", Math.signum(durationField3.compareTo(durationField42)) == -Math.signum(durationField42.compareTo(durationField3)));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology7.minuteOfHour();
        int int9 = gJChronology7.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField10 = gJChronology7.halfdays();
        boolean boolean12 = gJChronology7.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField13 = gJChronology7.months();
        org.joda.time.Instant instant14 = gJChronology7.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant14);
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology16.minuteOfHour();
        org.joda.time.Instant instant18 = gJChronology16.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.Chronology chronology20 = gJChronology16.withZone(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology16.secondOfDay();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology16.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = gJChronology16.getZone();
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology24.minuteOfHour();
        int int26 = gJChronology24.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology24.secondOfDay();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology24.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology24.dayOfYear();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology24.secondOfDay();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology24.monthOfYear();
        org.joda.time.Instant instant32 = gJChronology24.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23, (org.joda.time.ReadableInstant) instant32);
        org.joda.time.chrono.GJChronology gJChronology34 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23);
        org.joda.time.chrono.GJChronology gJChronology35 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology35.minuteOfHour();
        int int37 = gJChronology35.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField38 = gJChronology35.halfdays();
        boolean boolean40 = gJChronology35.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField41 = gJChronology35.months();
        org.joda.time.Instant instant42 = gJChronology35.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology44 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23, (org.joda.time.ReadableInstant) instant42, 1);
        org.joda.time.chrono.GJChronology gJChronology46 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant42, (int) (short) 1);
        org.joda.time.chrono.GJChronology gJChronology47 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField48 = gJChronology47.minuteOfHour();
        int int49 = gJChronology47.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField50 = gJChronology47.weekyear();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.Chronology chronology52 = gJChronology47.withZone(dateTimeZone51);
        org.joda.time.DurationField durationField53 = gJChronology47.millis();
        org.joda.time.DateTimeField dateTimeField54 = gJChronology47.clockhourOfHalfday();
        org.joda.time.Instant instant55 = gJChronology47.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology56 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant55);
        int int57 = gJChronology56.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField58 = gJChronology56.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField58, durationField10, and durationField13", !(durationField58.compareTo(durationField10) == 0) || (Math.signum(durationField58.compareTo(durationField13)) == Math.signum(durationField10.compareTo(durationField13))));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        long long6 = gJChronology1.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField7 = gJChronology1.eras();
        long long9 = gJChronology1.gregorianToJulianByYear(10000L);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology1.dayOfWeek();
        java.lang.String str12 = gJChronology1.toString();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology1.weekyear();
        org.joda.time.DurationField durationField15 = gJChronology1.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField15, and durationField7", !(durationField7.compareTo(durationField15) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField15.compareTo(durationField7))));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        org.joda.time.DurationField durationField2 = gJChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.centuryOfEra();
        long long5 = gJChronology0.gregorianToJulianByYear((long) ' ');
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology6.minuteOfHour();
        org.joda.time.Instant instant8 = gJChronology6.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Chronology chronology10 = gJChronology6.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology6.clockhourOfDay();
        org.joda.time.DurationField durationField12 = gJChronology6.centuries();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology6.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology6.era();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology6.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology6.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology6.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology6.hourOfHalfday();
        boolean boolean19 = gJChronology0.equals((java.lang.Object) dateTimeField18);
        org.joda.time.DurationField durationField20 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField2, and durationField12", !(durationField20.compareTo(durationField2) == 0) || (Math.signum(durationField20.compareTo(durationField12)) == Math.signum(durationField2.compareTo(durationField12))));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.dayOfYear();
        org.joda.time.DurationField durationField10 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.year();
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology12.minuteOfHour();
        int int14 = gJChronology12.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology12.dayOfYear();
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField17 = gJChronology16.seconds();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology16.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = gJChronology16.days();
        boolean boolean20 = gJChronology12.equals((java.lang.Object) gJChronology16);
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology21.centuryOfEra();
        boolean boolean24 = gJChronology21.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone25 = gJChronology21.getZone();
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology26.minuteOfHour();
        int int28 = gJChronology26.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField29 = gJChronology26.halfdays();
        boolean boolean31 = gJChronology26.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField32 = gJChronology26.months();
        org.joda.time.Instant instant33 = gJChronology26.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology34 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25, (org.joda.time.ReadableInstant) instant33);
        org.joda.time.chrono.GJChronology gJChronology35 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology35.minuteOfHour();
        int int37 = gJChronology35.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField38 = gJChronology35.halfdays();
        boolean boolean40 = gJChronology35.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField41 = gJChronology35.months();
        org.joda.time.Instant instant42 = gJChronology35.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology43 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25, (org.joda.time.ReadableInstant) instant42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.chrono.GJChronology gJChronology45 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25, readableInstant44);
        org.joda.time.Chronology chronology46 = gJChronology16.withZone(dateTimeZone25);
        org.joda.time.Chronology chronology47 = gJChronology0.withZone(dateTimeZone25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField17", Math.signum(durationField10.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField10)));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.monthOfYear();
        long long7 = gJChronology0.julianToGregorianByWeekyear((long) 'a');
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.minuteOfHour();
        org.joda.time.Instant instant10 = gJChronology8.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Chronology chronology12 = gJChronology8.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology8.clockhourOfDay();
        org.joda.time.DurationField durationField14 = gJChronology8.centuries();
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology15.centuryOfEra();
        boolean boolean18 = gJChronology15.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone19 = gJChronology15.getZone();
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19);
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology21.minuteOfHour();
        org.joda.time.Instant instant23 = gJChronology21.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19, (org.joda.time.ReadableInstant) instant23);
        org.joda.time.Chronology chronology25 = gJChronology8.withZone(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.chrono.GJChronology gJChronology27 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology27.minuteOfHour();
        org.joda.time.Instant instant29 = gJChronology27.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone26, (org.joda.time.ReadableInstant) instant29);
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19, (org.joda.time.ReadableInstant) instant29, (int) (short) 1);
        org.joda.time.Chronology chronology33 = gJChronology0.withZone(dateTimeZone19);
        org.joda.time.DurationField durationField34 = gJChronology0.hours();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology0.dayOfYear();
        org.joda.time.DurationField durationField37 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField37, durationField14, and durationField34", !(durationField37.compareTo(durationField14) == 0) || (Math.signum(durationField37.compareTo(durationField34)) == Math.signum(durationField14.compareTo(durationField34))));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.secondOfMinute();
        org.joda.time.DurationField durationField9 = gJChronology0.seconds();
        org.joda.time.DurationField durationField10 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField3, and durationField9", !(durationField10.compareTo(durationField3) == 0) || (Math.signum(durationField10.compareTo(durationField9)) == Math.signum(durationField3.compareTo(durationField9))));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        org.joda.time.DurationField durationField2 = gJChronology0.weekyears();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = gJChronology0.add(readablePeriod3, 100L, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.millisOfSecond();
        org.joda.time.Instant instant8 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.secondOfMinute();
        org.joda.time.DurationField durationField10 = gJChronology0.years();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField10", (durationField2.compareTo(durationField10) == 0) == durationField2.equals(durationField10));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField3 = gJChronology0.hours();
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology6.centuryOfEra();
        boolean boolean9 = gJChronology6.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone10 = gJChronology6.getZone();
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology12.minuteOfHour();
        org.joda.time.Instant instant14 = gJChronology12.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10, (org.joda.time.ReadableInstant) instant14);
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant14);
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone18 = gJChronology17.getZone();
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology19.minuteOfHour();
        int int21 = gJChronology19.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology19.secondOfDay();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology19.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology19.dayOfYear();
        long long28 = gJChronology19.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField29 = gJChronology19.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology19.centuryOfEra();
        org.joda.time.Instant instant31 = gJChronology19.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18, (org.joda.time.ReadableInstant) instant31);
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant31);
        org.joda.time.DurationField durationField34 = gJChronology33.years();
        org.joda.time.DurationField durationField35 = gJChronology33.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField35, durationField3, and durationField34", !(durationField35.compareTo(durationField3) == 0) || (Math.signum(durationField35.compareTo(durationField34)) == Math.signum(durationField3.compareTo(durationField34))));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField3 = gJChronology0.years();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology6.minuteOfHour();
        org.joda.time.Instant instant8 = gJChronology6.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5, (org.joda.time.ReadableInstant) instant8);
        java.lang.String str10 = gJChronology9.toString();
        org.joda.time.DurationField durationField11 = gJChronology9.years();
        boolean boolean12 = gJChronology0.equals((java.lang.Object) gJChronology9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField11", (durationField3.compareTo(durationField11) == 0) == durationField3.equals(durationField11));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.DurationField durationField3 = gJChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology1.yearOfCentury();
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology6.minuteOfHour();
        int int8 = gJChronology6.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology6.secondOfDay();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology6.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology6.dayOfYear();
        long long15 = gJChronology6.add((long) (byte) -1, (long) (short) 0, 4);
        long long17 = gJChronology6.julianToGregorianByWeekyear((long) 4);
        org.joda.time.DurationField durationField18 = gJChronology6.eras();
        org.joda.time.Chronology chronology19 = gJChronology6.withUTC();
        long long23 = gJChronology6.add(0L, 111060060001L, (int) '4');
        boolean boolean24 = gJChronology1.equals((java.lang.Object) 0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField18", Math.signum(durationField2.compareTo(durationField18)) == -Math.signum(durationField18.compareTo(durationField2)));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfMonth();
        long long9 = gJChronology0.add(447L, (long) 0, (int) 'a');
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.year();
        long long16 = gJChronology0.getDateTimeMillis((long) '4', 1, 0, (int) '4', 0);
        java.lang.String str17 = gJChronology0.toString();
        org.joda.time.DurationField durationField18 = gJChronology0.eras();
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology19.minuteOfHour();
        int int21 = gJChronology19.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology19.secondOfDay();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology19.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology19.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25);
        org.joda.time.DurationField durationField27 = gJChronology26.years();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology26.monthOfYear();
        long long32 = gJChronology26.add((-1L), (long) (short) 1, (int) (short) -1);
        boolean boolean33 = gJChronology19.equals((java.lang.Object) long32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        long long37 = gJChronology19.add(readablePeriod34, 2246401038L, 100);
        org.joda.time.DurationField durationField38 = gJChronology19.days();
        boolean boolean39 = gJChronology0.equals((java.lang.Object) durationField38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField27", Math.signum(durationField18.compareTo(durationField27)) == -Math.signum(durationField27.compareTo(durationField18)));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.Instant instant6 = gJChronology0.getGregorianCutover();
        long long8 = gJChronology0.julianToGregorianByWeekyear((-1123200001L));
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.minuteOfHour();
        org.joda.time.DurationField durationField10 = gJChronology0.halfdays();
        org.joda.time.DurationField durationField11 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology0.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField11", Math.signum(durationField3.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField3)));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        boolean boolean7 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.centuryOfEra();
        long long11 = gJChronology8.gregorianToJulianByWeekyear((long) ' ');
        org.joda.time.DateTimeField dateTimeField12 = gJChronology8.millisOfDay();
        org.joda.time.Instant instant13 = gJChronology8.getGregorianCutover();
        org.joda.time.DurationField durationField14 = gJChronology8.eras();
        boolean boolean15 = gJChronology0.equals((java.lang.Object) durationField14);
        org.joda.time.DurationField durationField16 = gJChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField16, and durationField14", !(durationField14.compareTo(durationField16) == 0) || (Math.signum(durationField14.compareTo(durationField14)) == Math.signum(durationField16.compareTo(durationField14))));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = gJChronology0.withZone(dateTimeZone4);
        org.joda.time.DurationField durationField6 = gJChronology0.millis();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.hourOfDay();
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology10.minuteOfHour();
        org.joda.time.Instant instant12 = gJChronology10.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.Chronology chronology14 = gJChronology10.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology10.clockhourOfDay();
        org.joda.time.DurationField durationField16 = gJChronology10.centuries();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology10.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology10.era();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology10.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology10.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone21 = gJChronology10.getZone();
        org.joda.time.Chronology chronology22 = gJChronology0.withZone(dateTimeZone21);
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = gJChronology23.seconds();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology23.weekOfWeekyear();
        org.joda.time.DurationField durationField26 = gJChronology23.years();
        org.joda.time.DurationField durationField27 = gJChronology23.years();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology23.yearOfEra();
        org.joda.time.Instant instant29 = gJChronology23.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone21, (org.joda.time.ReadableInstant) instant29);
        org.joda.time.DateTimeZone dateTimeZone31 = gJChronology30.getZone();
        org.joda.time.chrono.GJChronology gJChronology34 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31, 0L, 1);
        org.joda.time.chrono.GJChronology gJChronology35 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology35.minuteOfHour();
        int int37 = gJChronology35.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField38 = gJChronology35.halfdays();
        boolean boolean40 = gJChronology35.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField41 = gJChronology35.weekyears();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology35.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology35.weekOfWeekyear();
        org.joda.time.Instant instant44 = gJChronology35.getGregorianCutover();
        org.joda.time.Instant instant45 = gJChronology35.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology46 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31, (org.joda.time.ReadableInstant) instant45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField26 and durationField41", (durationField26.compareTo(durationField41) == 0) == durationField26.equals(durationField41));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology5.minuteOfHour();
        int int7 = gJChronology5.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField8 = gJChronology5.halfdays();
        boolean boolean10 = gJChronology5.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField11 = gJChronology5.months();
        org.joda.time.Instant instant12 = gJChronology5.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant12);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.minuteOfHour();
        int int16 = gJChronology14.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField17 = gJChronology14.halfdays();
        boolean boolean19 = gJChronology14.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField20 = gJChronology14.months();
        org.joda.time.Instant instant21 = gJChronology14.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant21);
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (-2246399996L), (int) (byte) 1);
        org.joda.time.DurationField durationField26 = gJChronology25.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField8, and durationField11", !(durationField26.compareTo(durationField8) == 0) || (Math.signum(durationField26.compareTo(durationField11)) == Math.signum(durationField8.compareTo(durationField11))));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DateTimeZone dateTimeZone2 = gJChronology0.getZone();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = gJChronology0.add(readablePeriod3, (long) (byte) -1, (int) (byte) 0);
        long long8 = gJChronology0.gregorianToJulianByWeekyear(2246400010L);
        org.joda.time.DurationField durationField9 = gJChronology0.months();
        org.joda.time.DurationField durationField10 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField9", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField9)) == Math.signum(durationField1.compareTo(durationField9))));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        long long6 = gJChronology1.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField7 = gJChronology1.eras();
        long long9 = gJChronology1.gregorianToJulianByYear(10000L);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology1.hourOfDay();
        org.joda.time.Chronology chronology14 = gJChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology1.centuryOfEra();
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology17.centuryOfEra();
        boolean boolean20 = gJChronology17.equals((java.lang.Object) 10L);
        long long22 = gJChronology17.gregorianToJulianByYear((long) (byte) 0);
        org.joda.time.DateTimeField dateTimeField23 = gJChronology17.hourOfDay();
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology24.centuryOfEra();
        boolean boolean27 = gJChronology24.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone28 = gJChronology24.getZone();
        org.joda.time.chrono.GJChronology gJChronology29 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology29.minuteOfHour();
        int int31 = gJChronology29.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField32 = gJChronology29.halfdays();
        boolean boolean34 = gJChronology29.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField35 = gJChronology29.months();
        org.joda.time.Instant instant36 = gJChronology29.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28, (org.joda.time.ReadableInstant) instant36);
        org.joda.time.chrono.GJChronology gJChronology38 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology38.minuteOfHour();
        int int40 = gJChronology38.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology38.secondOfDay();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology38.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology38.dayOfYear();
        org.joda.time.Instant instant44 = gJChronology38.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology45 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28, (org.joda.time.ReadableInstant) instant44);
        org.joda.time.chrono.GJChronology gJChronology46 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28);
        org.joda.time.Chronology chronology47 = gJChronology17.withZone(dateTimeZone28);
        org.joda.time.Chronology chronology48 = gJChronology1.withZone(dateTimeZone28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField32", Math.signum(durationField7.compareTo(durationField32)) == -Math.signum(durationField32.compareTo(durationField7)));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        long long6 = gJChronology1.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField7 = gJChronology1.eras();
        long long9 = gJChronology1.gregorianToJulianByYear(10000L);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology1.halfdayOfDay();
        org.joda.time.chrono.AssembledChronology.Fields fields11 = null;
        gJChronology1.assemble(fields11);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology1.year();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology1.yearOfCentury();
        org.joda.time.DurationField durationField15 = gJChronology1.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField15, and durationField7", !(durationField7.compareTo(durationField15) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField15.compareTo(durationField7))));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.weekyear();
        org.joda.time.Chronology chronology4 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.yearOfEra();
        org.joda.time.DurationField durationField6 = gJChronology0.weekyears();
        long long8 = gJChronology0.julianToGregorianByYear((long) 100);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        boolean boolean10 = gJChronology0.equals((java.lang.Object) gJChronology9);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField12 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology0.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField12", Math.signum(durationField6.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField6)));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField6 = gJChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = gJChronology0.centuries();
        org.joda.time.DurationField durationField9 = gJChronology0.centuries();
        org.joda.time.DurationField durationField10 = gJChronology0.years();
        org.joda.time.DurationField durationField11 = gJChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField10", (durationField11.compareTo(durationField10) == 0) == durationField11.equals(durationField10));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = gJChronology0.years();
        org.joda.time.DurationField durationField9 = gJChronology0.eras();
        java.lang.Class<?> wildcardClass10 = durationField9.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField9", Math.signum(durationField8.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField8)));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology6.minuteOfHour();
        int int8 = gJChronology6.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField9 = gJChronology6.halfdays();
        boolean boolean11 = gJChronology6.equals((java.lang.Object) 100);
        org.joda.time.Instant instant12 = gJChronology6.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant12);
        long long15 = gJChronology13.julianToGregorianByWeekyear(100L);
        org.joda.time.DurationField durationField16 = gJChronology13.years();
        org.joda.time.DurationField durationField17 = gJChronology13.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField9, and durationField16", !(durationField17.compareTo(durationField9) == 0) || (Math.signum(durationField17.compareTo(durationField16)) == Math.signum(durationField9.compareTo(durationField16))));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology5.minuteOfHour();
        int int7 = gJChronology5.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField8 = gJChronology5.halfdays();
        boolean boolean10 = gJChronology5.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField11 = gJChronology5.months();
        org.joda.time.Instant instant12 = gJChronology5.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant12);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology15.halfdayOfDay();
        int int17 = gJChronology15.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology15.yearOfCentury();
        long long22 = gJChronology15.add(1209600001L, (long) (short) 1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField23 = gJChronology15.centuryOfEra();
        org.joda.time.DurationField durationField24 = gJChronology15.weeks();
        org.joda.time.DurationField durationField25 = gJChronology15.centuries();
        org.joda.time.DateTimeZone dateTimeZone26 = gJChronology15.getZone();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = gJChronology28.era();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        long long33 = gJChronology28.add(readablePeriod30, (-9L), (int) '#');
        org.joda.time.DurationField durationField34 = gJChronology28.days();
        org.joda.time.Instant instant35 = gJChronology28.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology36 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone26, (org.joda.time.ReadableInstant) instant35);
        org.joda.time.chrono.GJChronology gJChronology38 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant35, 4);
        org.joda.time.chrono.GJChronology gJChronology41 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, 1123210000L, 4);
        org.joda.time.DurationField durationField42 = gJChronology41.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField42, durationField8, and durationField11", !(durationField42.compareTo(durationField8) == 0) || (Math.signum(durationField42.compareTo(durationField11)) == Math.signum(durationField8.compareTo(durationField11))));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        boolean boolean4 = gJChronology0.equals((java.lang.Object) 100.0d);
        org.joda.time.DurationField durationField5 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.hourOfDay();
        org.joda.time.DurationField durationField8 = gJChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField8, and durationField5", !(durationField5.compareTo(durationField8) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField8.compareTo(durationField5))));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.dayOfMonth();
        org.joda.time.DurationField durationField3 = gJChronology0.months();
        org.joda.time.DurationField durationField4 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField1, and durationField3", !(durationField4.compareTo(durationField1) == 0) || (Math.signum(durationField4.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        org.joda.time.DurationField durationField2 = gJChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.hourOfDay();
        org.joda.time.DurationField durationField5 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField5", Math.signum(durationField2.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField2)));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        long long3 = gJChronology0.gregorianToJulianByWeekyear((long) ' ');
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.minuteOfDay();
        long long6 = gJChronology0.gregorianToJulianByYear(2332800447L);
        org.joda.time.DurationField durationField7 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.weekyear();
        org.joda.time.DurationField durationField9 = gJChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField9, and durationField7", !(durationField7.compareTo(durationField9) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField9.compareTo(durationField7))));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = gJChronology0.seconds();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.centuryOfEra();
        long long13 = gJChronology8.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField14 = gJChronology8.eras();
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology15.centuryOfEra();
        boolean boolean18 = gJChronology15.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone19 = gJChronology15.getZone();
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19);
        org.joda.time.Chronology chronology21 = gJChronology8.withZone(dateTimeZone19);
        org.joda.time.Chronology chronology22 = gJChronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology8.halfdayOfDay();
        org.joda.time.Instant instant24 = gJChronology8.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField14", Math.signum(durationField5.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField5)));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = gJChronology0.withZone(dateTimeZone4);
        org.joda.time.DurationField durationField6 = gJChronology0.millis();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = gJChronology0.halfdays();
        java.lang.String str9 = gJChronology0.toString();
        org.joda.time.DurationField durationField10 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField6, and durationField8", !(durationField10.compareTo(durationField6) == 0) || (Math.signum(durationField10.compareTo(durationField8)) == Math.signum(durationField6.compareTo(durationField8))));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        long long6 = gJChronology1.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField7 = gJChronology1.eras();
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.centuryOfEra();
        boolean boolean11 = gJChronology8.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology8.getZone();
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        org.joda.time.Chronology chronology14 = gJChronology1.withZone(dateTimeZone12);
        long long16 = gJChronology1.julianToGregorianByYear((-1L));
        long long18 = gJChronology1.julianToGregorianByWeekyear((long) '#');
        org.joda.time.chrono.AssembledChronology.Fields fields19 = null;
        gJChronology1.assemble(fields19);
        org.joda.time.DurationField durationField21 = gJChronology1.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField21, and durationField7", !(durationField7.compareTo(durationField21) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField21.compareTo(durationField7))));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone1 = gJChronology0.getZone();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.minuteOfHour();
        org.joda.time.Instant instant6 = gJChronology4.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Chronology chronology8 = gJChronology4.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = gJChronology4.secondOfDay();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology4.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology4.getZone();
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology12.minuteOfHour();
        int int14 = gJChronology12.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology12.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology12.secondOfDay();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology12.monthOfYear();
        org.joda.time.Instant instant20 = gJChronology12.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) instant20);
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11);
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology23.minuteOfHour();
        int int25 = gJChronology23.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField26 = gJChronology23.halfdays();
        boolean boolean28 = gJChronology23.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField29 = gJChronology23.months();
        org.joda.time.Instant instant30 = gJChronology23.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) instant30, 1);
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3, (org.joda.time.ReadableInstant) instant30);
        org.joda.time.DurationField durationField34 = gJChronology33.years();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology33.secondOfMinute();
        org.joda.time.DurationField durationField36 = gJChronology33.weekyears();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology33.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField34 and durationField36", (durationField34.compareTo(durationField36) == 0) == durationField34.equals(durationField36));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.Instant instant6 = gJChronology0.getGregorianCutover();
        long long8 = gJChronology0.julianToGregorianByWeekyear((-1123200001L));
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology10.minuteOfHour();
        org.joda.time.Instant instant12 = gJChronology10.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9, (org.joda.time.ReadableInstant) instant12);
        boolean boolean14 = gJChronology0.equals((java.lang.Object) gJChronology13);
        long long16 = gJChronology13.julianToGregorianByWeekyear(3456000447L);
        org.joda.time.DurationField durationField17 = gJChronology13.months();
        long long19 = gJChronology13.gregorianToJulianByYear((-3628800000L));
        org.joda.time.DurationField durationField20 = gJChronology13.halfdays();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology13.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField20", (durationField3.compareTo(durationField20) == 0) == durationField3.equals(durationField20));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfMonth();
        long long9 = gJChronology0.add(447L, (long) 0, (int) 'a');
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.year();
        long long16 = gJChronology0.getDateTimeMillis((long) '4', 1, 0, (int) '4', 0);
        java.lang.String str17 = gJChronology0.toString();
        org.joda.time.DurationField durationField18 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology0.yearOfEra();
        org.joda.time.DurationField durationField21 = gJChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField21, and durationField18", !(durationField18.compareTo(durationField21) == 0) || (Math.signum(durationField18.compareTo(durationField18)) == Math.signum(durationField21.compareTo(durationField18))));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.DurationField durationField2 = gJChronology0.weekyears();
        org.joda.time.DurationField durationField3 = gJChronology0.weeks();
        org.joda.time.DurationField durationField4 = gJChronology0.days();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology5.centuryOfEra();
        boolean boolean8 = gJChronology5.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone9 = gJChronology5.getZone();
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology10.minuteOfHour();
        org.joda.time.Instant instant12 = gJChronology10.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.Chronology chronology14 = gJChronology10.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology10.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology10.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology10.getZone();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology18.minuteOfHour();
        int int20 = gJChronology18.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology18.secondOfDay();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology18.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology18.dayOfYear();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology18.secondOfDay();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology18.monthOfYear();
        org.joda.time.Instant instant26 = gJChronology18.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology27 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17, (org.joda.time.ReadableInstant) instant26);
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17);
        org.joda.time.chrono.GJChronology gJChronology29 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology29.minuteOfHour();
        int int31 = gJChronology29.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField32 = gJChronology29.halfdays();
        boolean boolean34 = gJChronology29.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField35 = gJChronology29.months();
        org.joda.time.Instant instant36 = gJChronology29.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology38 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17, (org.joda.time.ReadableInstant) instant36, 1);
        org.joda.time.chrono.GJChronology gJChronology39 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9, (org.joda.time.ReadableInstant) instant36);
        java.lang.String str40 = gJChronology39.toString();
        org.joda.time.DurationField durationField41 = gJChronology39.hours();
        org.joda.time.DurationField durationField42 = gJChronology39.years();
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        long long46 = gJChronology39.add(readablePeriod43, 2368852097L, (-1));
        org.joda.time.DateTimeZone dateTimeZone47 = gJChronology39.getZone();
        org.joda.time.Chronology chronology48 = gJChronology0.withZone(dateTimeZone47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField42", (durationField2.compareTo(durationField42) == 0) == durationField2.equals(durationField42));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DateTimeZone dateTimeZone2 = gJChronology0.getZone();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = gJChronology0.add(readablePeriod3, (long) (byte) -1, (int) (byte) 0);
        org.joda.time.DurationField durationField7 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField7", Math.signum(durationField1.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField1)));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.yearOfCentury();
        long long5 = gJChronology0.julianToGregorianByWeekyear((long) (-1));
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.weekOfWeekyear();
        org.joda.time.Chronology chronology7 = gJChronology0.withUTC();
        org.joda.time.DurationField durationField8 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField8", Math.signum(durationField1.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField1)));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.weekyear();
        org.joda.time.Chronology chronology4 = gJChronology0.withUTC();
        org.joda.time.Instant instant5 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.minuteOfDay();
        org.joda.time.DurationField durationField10 = gJChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField10, and durationField7", !(durationField7.compareTo(durationField10) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField10.compareTo(durationField7))));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.Instant instant6 = gJChronology0.getGregorianCutover();
        long long8 = gJChronology0.julianToGregorianByWeekyear((-1123200001L));
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.minuteOfHour();
        org.joda.time.DurationField durationField10 = gJChronology0.halfdays();
        org.joda.time.DurationField durationField11 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology0.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField11", Math.signum(durationField3.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField3)));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField6 = gJChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = gJChronology0.years();
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology10.centuryOfEra();
        boolean boolean13 = gJChronology10.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology10.getZone();
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14);
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology16.minuteOfHour();
        int int18 = gJChronology16.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField19 = gJChronology16.halfdays();
        boolean boolean21 = gJChronology16.equals((java.lang.Object) 100);
        org.joda.time.Instant instant22 = gJChronology16.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, (org.joda.time.ReadableInstant) instant22);
        long long25 = gJChronology23.julianToGregorianByWeekyear(100L);
        org.joda.time.DurationField durationField26 = gJChronology23.years();
        boolean boolean27 = gJChronology0.equals((java.lang.Object) durationField26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField26", (durationField6.compareTo(durationField26) == 0) == durationField6.equals(durationField26));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.minuteOfHour();
        org.joda.time.Instant instant5 = gJChronology3.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.Chronology chronology7 = gJChronology3.withZone(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField9 = gJChronology3.centuries();
        boolean boolean10 = gJChronology1.equals((java.lang.Object) durationField9);
        org.joda.time.DurationField durationField11 = gJChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology1.minuteOfDay();
        org.joda.time.DurationField durationField14 = gJChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology1.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField14", (durationField9.compareTo(durationField14) == 0) == durationField9.equals(durationField14));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology5.minuteOfHour();
        int int7 = gJChronology5.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField8 = gJChronology5.halfdays();
        boolean boolean10 = gJChronology5.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField11 = gJChronology5.months();
        org.joda.time.Instant instant12 = gJChronology5.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant12);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.DurationField durationField15 = gJChronology14.months();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.monthOfYear();
        org.joda.time.DurationField durationField17 = gJChronology14.halfdays();
        org.joda.time.DurationField durationField18 = gJChronology14.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField8, and durationField11", !(durationField18.compareTo(durationField8) == 0) || (Math.signum(durationField18.compareTo(durationField11)) == Math.signum(durationField8.compareTo(durationField11))));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DurationField durationField4 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.secondOfDay();
        long long8 = gJChronology0.julianToGregorianByWeekyear((-2L));
        org.joda.time.DurationField durationField9 = gJChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField9, and durationField4", !(durationField4.compareTo(durationField9) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField9.compareTo(durationField4))));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        boolean boolean4 = gJChronology0.equals((java.lang.Object) 100.0d);
        org.joda.time.DurationField durationField5 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.year();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.era();
        org.joda.time.DurationField durationField8 = gJChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField8, and durationField5", !(durationField5.compareTo(durationField8) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField8.compareTo(durationField5))));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology5.minuteOfHour();
        int int7 = gJChronology5.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField8 = gJChronology5.halfdays();
        boolean boolean10 = gJChronology5.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField11 = gJChronology5.months();
        org.joda.time.Instant instant12 = gJChronology5.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant12);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.minuteOfHour();
        int int16 = gJChronology14.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology14.secondOfDay();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology14.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology14.dayOfYear();
        org.joda.time.Instant instant20 = gJChronology14.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant20);
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.DurationField durationField23 = gJChronology22.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField8, and durationField11", !(durationField23.compareTo(durationField8) == 0) || (Math.signum(durationField23.compareTo(durationField11)) == Math.signum(durationField8.compareTo(durationField11))));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        long long3 = gJChronology0.gregorianToJulianByWeekyear((long) ' ');
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.millisOfDay();
        org.joda.time.Instant instant5 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField6 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.clockhourOfHalfday();
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology9.yearOfEra();
        boolean boolean13 = gJChronology0.equals((java.lang.Object) dateTimeField12);
        org.joda.time.DurationField durationField14 = gJChronology0.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField14, and durationField6", !(durationField6.compareTo(durationField14) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField14.compareTo(durationField6))));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        long long5 = gJChronology0.gregorianToJulianByYear((long) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = gJChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.dayOfWeek();
        org.joda.time.DurationField durationField10 = gJChronology0.minutes();
        org.joda.time.DurationField durationField11 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField8, and durationField10", !(durationField11.compareTo(durationField8) == 0) || (Math.signum(durationField11.compareTo(durationField10)) == Math.signum(durationField8.compareTo(durationField10))));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        long long6 = gJChronology1.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField7 = gJChronology1.eras();
        long long9 = gJChronology1.gregorianToJulianByYear(10000L);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology1.dayOfWeek();
        java.lang.String str12 = gJChronology1.toString();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology1.era();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology1.secondOfMinute();
        long long18 = gJChronology1.julianToGregorianByWeekyear((-10108798000L));
        org.joda.time.DurationField durationField19 = gJChronology1.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField19, and durationField7", !(durationField7.compareTo(durationField19) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField19.compareTo(durationField7))));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.weekyear();
        org.joda.time.Chronology chronology4 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.yearOfEra();
        org.joda.time.DurationField durationField6 = gJChronology0.weekyears();
        org.joda.time.DurationField durationField7 = gJChronology0.years();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField7", (durationField6.compareTo(durationField7) == 0) == durationField6.equals(durationField7));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        org.joda.time.DurationField durationField2 = gJChronology0.weekyears();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = gJChronology0.add(readablePeriod3, 100L, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.millisOfSecond();
        org.joda.time.Instant instant8 = gJChronology0.getGregorianCutover();
        boolean boolean10 = gJChronology0.equals((java.lang.Object) (-1.0f));
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.yearOfCentury();
        org.joda.time.DurationField durationField12 = gJChronology0.millis();
        java.lang.String str13 = gJChronology0.toString();
        org.joda.time.DurationField durationField14 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField2, and durationField12", !(durationField14.compareTo(durationField2) == 0) || (Math.signum(durationField14.compareTo(durationField12)) == Math.signum(durationField2.compareTo(durationField12))));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.era();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = gJChronology1.add(readablePeriod3, (-9L), (int) '#');
        org.joda.time.DurationField durationField7 = gJChronology1.days();
        org.joda.time.Instant instant8 = gJChronology1.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField10 = gJChronology1.eras();
        long long12 = gJChronology1.gregorianToJulianByYear((-120959989968L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField10", Math.signum(durationField7.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField7)));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.centuryOfEra();
        long long13 = gJChronology8.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField14 = gJChronology8.eras();
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology15.centuryOfEra();
        boolean boolean18 = gJChronology15.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone19 = gJChronology15.getZone();
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19);
        org.joda.time.Chronology chronology21 = gJChronology8.withZone(dateTimeZone19);
        boolean boolean22 = gJChronology0.equals((java.lang.Object) gJChronology8);
        org.joda.time.DurationField durationField23 = gJChronology8.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField23, and durationField14", !(durationField14.compareTo(durationField23) == 0) || (Math.signum(durationField14.compareTo(durationField14)) == Math.signum(durationField23.compareTo(durationField14))));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        long long9 = gJChronology0.add((long) (byte) -1, (long) (short) 0, 4);
        long long11 = gJChronology0.julianToGregorianByWeekyear((long) 4);
        org.joda.time.DurationField durationField12 = gJChronology0.months();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology0.dayOfYear();
        org.joda.time.DurationField durationField14 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology0.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField12 and durationField14", Math.signum(durationField12.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField12)));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.monthOfYear();
        org.joda.time.DurationField durationField6 = gJChronology0.years();
        org.joda.time.DurationField durationField7 = gJChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField7", (durationField6.compareTo(durationField7) == 0) == durationField6.equals(durationField7));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.Instant instant6 = gJChronology0.getGregorianCutover();
        long long8 = gJChronology0.julianToGregorianByWeekyear((-1123200001L));
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.minuteOfHour();
        org.joda.time.DurationField durationField10 = gJChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.secondOfDay();
        org.joda.time.DurationField durationField12 = gJChronology0.eras();
        org.joda.time.DurationField durationField13 = gJChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField12", Math.signum(durationField3.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField3)));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.monthOfYear();
        org.joda.time.DurationField durationField8 = gJChronology0.days();
        org.joda.time.DurationField durationField9 = gJChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.minuteOfDay();
        org.joda.time.DurationField durationField12 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField8, and durationField9", !(durationField12.compareTo(durationField8) == 0) || (Math.signum(durationField12.compareTo(durationField9)) == Math.signum(durationField8.compareTo(durationField9))));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfMonth();
        long long9 = gJChronology0.add(447L, (long) 0, (int) 'a');
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.year();
        long long16 = gJChronology0.getDateTimeMillis((long) '4', 1, 0, (int) '4', 0);
        org.joda.time.DateTimeField dateTimeField17 = gJChronology0.millisOfDay();
        org.joda.time.DurationField durationField18 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone21 = gJChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology0.hourOfDay();
        org.joda.time.DurationField durationField23 = gJChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField23, and durationField18", !(durationField18.compareTo(durationField23) == 0) || (Math.signum(durationField18.compareTo(durationField18)) == Math.signum(durationField23.compareTo(durationField18))));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.secondOfDay();
        long long6 = gJChronology0.gregorianToJulianByYear((long) (byte) 10);
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = gJChronology0.seconds();
        org.joda.time.DurationField durationField9 = gJChronology0.months();
        org.joda.time.DurationField durationField10 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField8, and durationField9", !(durationField10.compareTo(durationField8) == 0) || (Math.signum(durationField10.compareTo(durationField9)) == Math.signum(durationField8.compareTo(durationField9))));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.weekyear();
        org.joda.time.Chronology chronology4 = gJChronology0.withUTC();
        long long6 = gJChronology0.gregorianToJulianByWeekyear((-1209599996L));
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField9 = gJChronology0.eras();
        org.joda.time.DurationField durationField10 = gJChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField10, and durationField9", !(durationField9.compareTo(durationField10) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField10.compareTo(durationField9))));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.yearOfCentury();
        long long5 = gJChronology0.julianToGregorianByWeekyear((long) (-1));
        org.joda.time.Chronology chronology6 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = gJChronology0.millis();
        org.joda.time.DurationField durationField9 = gJChronology0.centuries();
        org.joda.time.DurationField durationField10 = gJChronology0.days();
        org.joda.time.DurationField durationField11 = gJChronology0.minutes();
        org.joda.time.DurationField durationField12 = gJChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14);
        org.joda.time.DurationField durationField16 = gJChronology15.years();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology15.dayOfYear();
        long long19 = gJChronology15.julianToGregorianByWeekyear((-1L));
        long long23 = gJChronology15.add(1123200014L, (long) ' ', (int) ' ');
        org.joda.time.DateTimeField dateTimeField24 = gJChronology15.weekOfWeekyear();
        org.joda.time.DurationField durationField25 = gJChronology15.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology15.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology15.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology15.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology15.yearOfCentury();
        boolean boolean30 = gJChronology0.equals((java.lang.Object) dateTimeField29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField16", (durationField12.compareTo(durationField16) == 0) == durationField12.equals(durationField16));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.era();
        org.joda.time.DurationField durationField5 = gJChronology0.eras();
        org.joda.time.DurationField durationField6 = gJChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField6, and durationField5", !(durationField5.compareTo(durationField6) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField6.compareTo(durationField5))));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField6 = gJChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = gJChronology0.centuries();
        int int9 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology10.minuteOfHour();
        int int12 = gJChronology10.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology10.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology10.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology10.dayOfYear();
        long long19 = gJChronology10.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField20 = gJChronology10.weekyear();
        org.joda.time.DurationField durationField21 = gJChronology10.minutes();
        int int22 = gJChronology10.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField23 = gJChronology10.years();
        boolean boolean24 = gJChronology0.equals((java.lang.Object) gJChronology10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField23", (durationField6.compareTo(durationField23) == 0) == durationField6.equals(durationField23));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology5.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.centuryOfEra();
        long long13 = gJChronology8.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology8.getZone();
        org.joda.time.Chronology chronology15 = gJChronology5.withZone(dateTimeZone14);
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology16.minuteOfHour();
        int int18 = gJChronology16.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField19 = gJChronology16.halfdays();
        boolean boolean21 = gJChronology16.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField22 = gJChronology16.months();
        org.joda.time.Instant instant23 = gJChronology16.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, (org.joda.time.ReadableInstant) instant23, 1);
        org.joda.time.DateTimeField dateTimeField26 = gJChronology25.weekOfWeekyear();
        org.joda.time.DurationField durationField27 = gJChronology25.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField19, and durationField22", !(durationField27.compareTo(durationField19) == 0) || (Math.signum(durationField27.compareTo(durationField22)) == Math.signum(durationField19.compareTo(durationField22))));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        long long6 = gJChronology1.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField7 = gJChronology1.eras();
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.centuryOfEra();
        boolean boolean11 = gJChronology8.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology8.getZone();
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        org.joda.time.Chronology chronology14 = gJChronology1.withZone(dateTimeZone12);
        long long16 = gJChronology1.julianToGregorianByYear((-1L));
        long long18 = gJChronology1.julianToGregorianByWeekyear((long) '#');
        org.joda.time.DateTimeField dateTimeField19 = gJChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology1.weekyearOfCentury();
        long long22 = gJChronology1.gregorianToJulianByWeekyear(2246399988L);
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology23.minuteOfHour();
        org.joda.time.Instant instant25 = gJChronology23.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.Chronology chronology27 = gJChronology23.withZone(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = gJChronology23.dayOfMonth();
        long long32 = gJChronology23.add(447L, (long) 0, (int) 'a');
        org.joda.time.DateTimeField dateTimeField33 = gJChronology23.year();
        long long37 = gJChronology23.add((long) ' ', (long) (-1), 1);
        org.joda.time.DurationField durationField38 = gJChronology23.days();
        org.joda.time.DateTimeZone dateTimeZone39 = gJChronology23.getZone();
        org.joda.time.chrono.GJChronology gJChronology40 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone39);
        org.joda.time.Chronology chronology41 = gJChronology1.withZone(dateTimeZone39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField38", Math.signum(durationField7.compareTo(durationField38)) == -Math.signum(durationField38.compareTo(durationField7)));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.weekyear();
        org.joda.time.Chronology chronology4 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = gJChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.centuryOfEra();
        org.joda.time.DurationField durationField9 = gJChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField11 = gJChronology0.weeks();
        org.joda.time.DurationField durationField12 = gJChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology0.yearOfEra();
        org.joda.time.DurationField durationField15 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField7, and durationField9", !(durationField15.compareTo(durationField7) == 0) || (Math.signum(durationField15.compareTo(durationField9)) == Math.signum(durationField7.compareTo(durationField9))));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology5.minuteOfHour();
        int int7 = gJChronology5.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField8 = gJChronology5.halfdays();
        boolean boolean10 = gJChronology5.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField11 = gJChronology5.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology5.secondOfMinute();
        long long17 = gJChronology5.getDateTimeMillis(1, (int) (byte) 10, (int) (byte) 10, (int) '#');
        org.joda.time.Instant instant18 = gJChronology5.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant18);
        org.joda.time.DurationField durationField20 = gJChronology19.millis();
        org.joda.time.Chronology chronology21 = gJChronology19.withUTC();
        org.joda.time.Chronology chronology22 = gJChronology19.withUTC();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology19.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24);
        org.joda.time.DurationField durationField26 = gJChronology25.years();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology25.dayOfYear();
        long long29 = gJChronology25.julianToGregorianByWeekyear((-1L));
        long long33 = gJChronology25.add(1123200014L, (long) ' ', (int) ' ');
        org.joda.time.DateTimeField dateTimeField34 = gJChronology25.monthOfYear();
        boolean boolean35 = gJChronology19.equals((java.lang.Object) gJChronology25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField26", (durationField11.compareTo(durationField26) == 0) == durationField11.equals(durationField26));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField3 = gJChronology0.hours();
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, readableInstant6);
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.centuryOfEra();
        org.joda.time.DurationField durationField10 = gJChronology8.eras();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology8.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField10", Math.signum(durationField3.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField3)));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.dayOfYear();
        org.joda.time.DurationField durationField10 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.minuteOfHour();
        org.joda.time.DurationField durationField12 = gJChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField12, and durationField10", !(durationField10.compareTo(durationField12) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField12.compareTo(durationField10))));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        long long9 = gJChronology0.add((long) (byte) -1, (long) (short) 0, 4);
        long long11 = gJChronology0.julianToGregorianByWeekyear((long) 4);
        org.joda.time.DurationField durationField12 = gJChronology0.eras();
        org.joda.time.Chronology chronology13 = gJChronology0.withUTC();
        long long15 = gJChronology0.gregorianToJulianByWeekyear(0L);
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology16.getZone();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField19 = gJChronology18.weekyearOfCentury();
        long long25 = gJChronology18.getDateTimeMillis(14L, (int) (short) 10, (int) (short) 0, (int) '4', (int) 'a');
        org.joda.time.DateTimeField dateTimeField26 = gJChronology18.dayOfWeek();
        boolean boolean27 = gJChronology0.equals((java.lang.Object) dateTimeField26);
        org.joda.time.DateTimeField dateTimeField28 = gJChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField29 = gJChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField29, and durationField12", !(durationField12.compareTo(durationField29) == 0) || (Math.signum(durationField12.compareTo(durationField12)) == Math.signum(durationField29.compareTo(durationField12))));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.dayOfYear();
        org.joda.time.DurationField durationField10 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.year();
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology12.monthOfYear();
        long long16 = gJChronology12.gregorianToJulianByYear(1245652097L);
        org.joda.time.DurationField durationField17 = gJChronology12.seconds();
        boolean boolean18 = gJChronology0.equals((java.lang.Object) gJChronology12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField17", Math.signum(durationField10.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField10)));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        long long3 = gJChronology0.gregorianToJulianByWeekyear((long) ' ');
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.minuteOfDay();
        long long6 = gJChronology0.gregorianToJulianByYear(2332800447L);
        org.joda.time.DurationField durationField7 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.weekyear();
        org.joda.time.DurationField durationField9 = gJChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField9, and durationField7", !(durationField7.compareTo(durationField9) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField9.compareTo(durationField7))));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology1.year();
        int int6 = gJChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField7 = gJChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology1.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField7", (durationField2.compareTo(durationField7) == 0) == durationField2.equals(durationField7));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.secondOfDay();
        org.joda.time.DurationField durationField2 = gJChronology0.weekyears();
        int int3 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology5.centuryOfEra();
        org.joda.time.DurationField durationField7 = gJChronology5.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology5.centuryOfEra();
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.centuryOfEra();
        boolean boolean12 = gJChronology9.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone13 = gJChronology9.getZone();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13);
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13);
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology16.minuteOfHour();
        int int18 = gJChronology16.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField19 = gJChronology16.halfdays();
        boolean boolean21 = gJChronology16.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField22 = gJChronology16.months();
        org.joda.time.Instant instant23 = gJChronology16.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13, (org.joda.time.ReadableInstant) instant23);
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology25.minuteOfHour();
        org.joda.time.Instant instant27 = gJChronology25.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.Chronology chronology29 = gJChronology25.withZone(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField30 = gJChronology25.secondOfDay();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology25.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone32 = gJChronology25.getZone();
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology33.minuteOfHour();
        int int35 = gJChronology33.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology33.secondOfDay();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology33.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology33.dayOfYear();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology33.secondOfDay();
        org.joda.time.DateTimeField dateTimeField40 = gJChronology33.monthOfYear();
        org.joda.time.Instant instant41 = gJChronology33.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology42 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone32, (org.joda.time.ReadableInstant) instant41);
        org.joda.time.chrono.GJChronology gJChronology43 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone32);
        org.joda.time.chrono.GJChronology gJChronology44 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField45 = gJChronology44.minuteOfHour();
        int int46 = gJChronology44.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField47 = gJChronology44.halfdays();
        boolean boolean49 = gJChronology44.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField50 = gJChronology44.months();
        org.joda.time.Instant instant51 = gJChronology44.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology53 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone32, (org.joda.time.ReadableInstant) instant51, 1);
        org.joda.time.chrono.GJChronology gJChronology55 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13, (org.joda.time.ReadableInstant) instant51, (int) (short) 1);
        org.joda.time.chrono.GJChronology gJChronology56 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField57 = gJChronology56.minuteOfHour();
        int int58 = gJChronology56.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField59 = gJChronology56.weekyear();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.Chronology chronology61 = gJChronology56.withZone(dateTimeZone60);
        org.joda.time.DurationField durationField62 = gJChronology56.millis();
        org.joda.time.DateTimeField dateTimeField63 = gJChronology56.clockhourOfHalfday();
        org.joda.time.Instant instant64 = gJChronology56.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology65 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13, (org.joda.time.ReadableInstant) instant64);
        org.joda.time.Chronology chronology66 = gJChronology5.withZone(dateTimeZone13);
        org.joda.time.chrono.GJChronology gJChronology67 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13);
        org.joda.time.Chronology chronology68 = gJChronology0.withZone(dateTimeZone13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField7", (durationField2.compareTo(durationField7) == 0) == durationField2.equals(durationField7));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfMonth();
        long long9 = gJChronology0.add(447L, (long) 0, (int) 'a');
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.year();
        org.joda.time.DurationField durationField11 = gJChronology0.days();
        org.joda.time.DurationField durationField12 = gJChronology0.weekyears();
        org.joda.time.DurationField durationField13 = gJChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology0.minuteOfHour();
        org.joda.time.DurationField durationField15 = gJChronology0.hours();
        org.joda.time.DurationField durationField16 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField11, and durationField12", !(durationField16.compareTo(durationField11) == 0) || (Math.signum(durationField16.compareTo(durationField12)) == Math.signum(durationField11.compareTo(durationField12))));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        long long3 = gJChronology0.gregorianToJulianByWeekyear((long) ' ');
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.millisOfDay();
        org.joda.time.Instant instant5 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField6 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.hourOfDay();
        org.joda.time.DurationField durationField8 = gJChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField8, and durationField6", !(durationField6.compareTo(durationField8) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField8.compareTo(durationField6))));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        org.joda.time.DurationField durationField3 = gJChronology1.seconds();
        long long5 = gJChronology1.julianToGregorianByWeekyear(2332800001L);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology1.dayOfWeek();
        org.joda.time.DurationField durationField7 = gJChronology1.months();
        org.joda.time.DurationField durationField8 = gJChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField3, and durationField7", !(durationField8.compareTo(durationField3) == 0) || (Math.signum(durationField8.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = gJChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.secondOfMinute();
        org.joda.time.DurationField durationField8 = gJChronology0.seconds();
        org.joda.time.DurationField durationField9 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField6, and durationField8", !(durationField9.compareTo(durationField6) == 0) || (Math.signum(durationField9.compareTo(durationField8)) == Math.signum(durationField6.compareTo(durationField8))));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        long long6 = gJChronology1.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField7 = gJChronology1.eras();
        long long9 = gJChronology1.gregorianToJulianByYear(10000L);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology1.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = gJChronology1.add(readablePeriod11, 12182400009L, 100);
        org.joda.time.DurationField durationField15 = gJChronology1.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField15, and durationField7", !(durationField7.compareTo(durationField15) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField15.compareTo(durationField7))));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        long long3 = gJChronology0.gregorianToJulianByWeekyear((long) ' ');
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.millisOfDay();
        org.joda.time.Instant instant5 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField6 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology0.getZone();
        org.joda.time.DurationField durationField12 = gJChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField12, and durationField6", !(durationField6.compareTo(durationField12) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField12.compareTo(durationField6))));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology7.getZone();
        int int9 = gJChronology7.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone10 = gJChronology7.getZone();
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.minuteOfHour();
        org.joda.time.Instant instant13 = gJChronology11.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = gJChronology11.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = gJChronology11.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology11.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = gJChronology11.getZone();
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology19.minuteOfHour();
        int int21 = gJChronology19.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology19.secondOfDay();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology19.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology19.dayOfYear();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology19.secondOfDay();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology19.monthOfYear();
        org.joda.time.Instant instant27 = gJChronology19.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18, (org.joda.time.ReadableInstant) instant27);
        org.joda.time.chrono.GJChronology gJChronology29 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18);
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology30.minuteOfHour();
        int int32 = gJChronology30.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField33 = gJChronology30.halfdays();
        boolean boolean35 = gJChronology30.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField36 = gJChronology30.months();
        org.joda.time.Instant instant37 = gJChronology30.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology39 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18, (org.joda.time.ReadableInstant) instant37, 1);
        org.joda.time.chrono.GJChronology gJChronology40 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10, (org.joda.time.ReadableInstant) instant37);
        org.joda.time.chrono.GJChronology gJChronology41 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant37);
        org.joda.time.DateTimeField dateTimeField42 = gJChronology41.yearOfCentury();
        org.joda.time.Instant instant43 = gJChronology41.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone44 = gJChronology41.getZone();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.chrono.GJChronology gJChronology46 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone45);
        org.joda.time.chrono.GJChronology gJChronology47 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField48 = gJChronology47.minuteOfHour();
        int int49 = gJChronology47.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField50 = gJChronology47.secondOfDay();
        org.joda.time.DateTimeField dateTimeField51 = gJChronology47.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField52 = gJChronology47.weekOfWeekyear();
        long long56 = gJChronology47.add((long) 1, (-1L), (int) (byte) 10);
        boolean boolean57 = gJChronology46.equals((java.lang.Object) 1);
        org.joda.time.DurationField durationField58 = gJChronology46.months();
        org.joda.time.Instant instant59 = gJChronology46.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology60 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone44, (org.joda.time.ReadableInstant) instant59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField36 and durationField58", (durationField36.compareTo(durationField58) == 0) == durationField36.equals(durationField58));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.minuteOfHour();
        int int4 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.weekOfWeekyear();
        long long11 = gJChronology2.add((long) 1, (-1L), (int) (byte) 10);
        boolean boolean12 = gJChronology1.equals((java.lang.Object) 1);
        long long14 = gJChronology1.julianToGregorianByWeekyear(1137807999L);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology1.dayOfWeek();
        org.joda.time.DurationField durationField16 = gJChronology1.eras();
        org.joda.time.DurationField durationField17 = gJChronology1.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField17, and durationField16", !(durationField16.compareTo(durationField17) == 0) || (Math.signum(durationField16.compareTo(durationField16)) == Math.signum(durationField17.compareTo(durationField16))));
    }
}

