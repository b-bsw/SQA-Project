package org.joda.time.chrono;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.weekyear();
        org.joda.time.Chronology chronology4 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = gJChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.era();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.weekyear();
        org.joda.time.Chronology chronology4 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.secondOfDay();
        org.joda.time.DurationField durationField7 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        long long9 = gJChronology0.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DurationField durationField10 = gJChronology0.millis();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14);
        long long19 = gJChronology15.add((long) 'a', (long) 10, (int) '#');
        org.joda.time.DateTimeField dateTimeField20 = gJChronology15.monthOfYear();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology15.era();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology15.secondOfDay();
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology23.minuteOfHour();
        int int25 = gJChronology23.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology23.secondOfDay();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology23.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology23.dayOfYear();
        long long32 = gJChronology23.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology33.minuteOfHour();
        org.joda.time.Instant instant35 = gJChronology33.getGregorianCutover();
        boolean boolean36 = gJChronology23.equals((java.lang.Object) gJChronology33);
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology37.centuryOfEra();
        boolean boolean40 = gJChronology37.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone41 = gJChronology37.getZone();
        org.joda.time.chrono.GJChronology gJChronology42 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone41);
        org.joda.time.Chronology chronology43 = gJChronology23.withZone(dateTimeZone41);
        boolean boolean44 = gJChronology15.equals((java.lang.Object) dateTimeZone41);
        org.joda.time.Chronology chronology45 = gJChronology0.withZone(dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField46 = gJChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField47 = gJChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField48 = gJChronology0.era();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(gJChronology15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 447L + "'", long19 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(gJChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertNotNull(gJChronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(instant35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(gJChronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(gJChronology42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.monthOfYear();
        org.joda.time.DurationField durationField8 = gJChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.millisOfDay();
        long long8 = gJChronology0.julianToGregorianByYear((-1123199903L));
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = gJChronology0.add(readablePeriod10, (-4665599999L), (int) ' ');
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-2246399903L) + "'", long8 == (-2246399903L));
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-4665599999L) + "'", long13 == (-4665599999L));
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        long long5 = gJChronology0.gregorianToJulianByYear((long) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.secondOfDay();
        long long8 = gJChronology0.gregorianToJulianByWeekyear((long) (short) 0);
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1123200000L + "'", long5 == 1123200000L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1209600000L + "'", long8 == 1209600000L);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
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
        org.joda.time.DateTimeField dateTimeField15 = gJChronology1.centuryOfEra();
        org.joda.time.Instant instant16 = gJChronology1.getGregorianCutover();
        org.joda.time.DurationField durationField17 = gJChronology1.halfdays();
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-9L) + "'", long11 == (-9L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-71792001L) + "'", long14 == (-71792001L));
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = gJChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.era();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.millisOfSecond();
        org.joda.time.chrono.AssembledChronology.Fields fields10 = null;
        // The following exception was thrown during execution in test generation
        try {
            gJChronology0.assemble(fields10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
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
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = gJChronology1.add(readablePeriod14, (-58987180799970L), (int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = gJChronology1.add(readablePeriod18, 6730100L, (int) (byte) 100);
        int int22 = gJChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField23 = gJChronology1.months();
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-58987180799970L) + "'", long17 == (-58987180799970L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 6730100L + "'", long21 == 6730100L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone1 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.centuryOfEra();
        boolean boolean6 = gJChronology3.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology10.minuteOfHour();
        int int12 = gJChronology10.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField13 = gJChronology10.halfdays();
        boolean boolean15 = gJChronology10.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField16 = gJChronology10.months();
        org.joda.time.Instant instant17 = gJChronology10.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant17);
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (org.joda.time.ReadableInstant) instant17, 4);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology20.clockhourOfDay();
        org.joda.time.DurationField durationField22 = gJChronology20.centuries();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology20.weekyear();
        org.joda.time.DurationField durationField24 = gJChronology20.months();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
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
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.minuteOfHour();
        org.joda.time.DurationField durationField12 = gJChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology0.yearOfEra();
        org.joda.time.Instant instant15 = gJChronology0.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology16.minuteOfHour();
        int int18 = gJChronology16.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology16.weekyear();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.Chronology chronology21 = gJChronology16.withZone(dateTimeZone20);
        org.joda.time.DurationField durationField22 = gJChronology16.millis();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology16.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology16.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology16.hourOfDay();
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology26.minuteOfHour();
        org.joda.time.Instant instant28 = gJChronology26.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.Chronology chronology30 = gJChronology26.withZone(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField31 = gJChronology26.clockhourOfDay();
        org.joda.time.DurationField durationField32 = gJChronology26.centuries();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology26.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology26.era();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology26.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology26.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone37 = gJChronology26.getZone();
        org.joda.time.Chronology chronology38 = gJChronology16.withZone(dateTimeZone37);
        org.joda.time.chrono.GJChronology gJChronology39 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField40 = gJChronology39.centuryOfEra();
        boolean boolean42 = gJChronology39.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone43 = gJChronology39.getZone();
        org.joda.time.chrono.GJChronology gJChronology44 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone43);
        org.joda.time.chrono.GJChronology gJChronology45 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone43);
        org.joda.time.chrono.GJChronology gJChronology46 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField47 = gJChronology46.minuteOfHour();
        int int48 = gJChronology46.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField49 = gJChronology46.halfdays();
        boolean boolean51 = gJChronology46.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField52 = gJChronology46.months();
        org.joda.time.Instant instant53 = gJChronology46.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology54 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone43, (org.joda.time.ReadableInstant) instant53);
        org.joda.time.chrono.GJChronology gJChronology55 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField56 = gJChronology55.minuteOfHour();
        org.joda.time.Instant instant57 = gJChronology55.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.Chronology chronology59 = gJChronology55.withZone(dateTimeZone58);
        org.joda.time.DateTimeField dateTimeField60 = gJChronology55.secondOfDay();
        org.joda.time.DateTimeField dateTimeField61 = gJChronology55.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone62 = gJChronology55.getZone();
        org.joda.time.chrono.GJChronology gJChronology63 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField64 = gJChronology63.minuteOfHour();
        int int65 = gJChronology63.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField66 = gJChronology63.secondOfDay();
        org.joda.time.DateTimeField dateTimeField67 = gJChronology63.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField68 = gJChronology63.dayOfYear();
        org.joda.time.DateTimeField dateTimeField69 = gJChronology63.secondOfDay();
        org.joda.time.DateTimeField dateTimeField70 = gJChronology63.monthOfYear();
        org.joda.time.Instant instant71 = gJChronology63.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology72 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone62, (org.joda.time.ReadableInstant) instant71);
        org.joda.time.chrono.GJChronology gJChronology73 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone62);
        org.joda.time.chrono.GJChronology gJChronology74 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField75 = gJChronology74.minuteOfHour();
        int int76 = gJChronology74.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField77 = gJChronology74.halfdays();
        boolean boolean79 = gJChronology74.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField80 = gJChronology74.months();
        org.joda.time.Instant instant81 = gJChronology74.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology83 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone62, (org.joda.time.ReadableInstant) instant81, 1);
        org.joda.time.chrono.GJChronology gJChronology85 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone43, (org.joda.time.ReadableInstant) instant81, (int) (short) 1);
        org.joda.time.chrono.GJChronology gJChronology86 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField87 = gJChronology86.minuteOfHour();
        int int88 = gJChronology86.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField89 = gJChronology86.weekyear();
        org.joda.time.DateTimeZone dateTimeZone90 = null;
        org.joda.time.Chronology chronology91 = gJChronology86.withZone(dateTimeZone90);
        org.joda.time.DurationField durationField92 = gJChronology86.millis();
        org.joda.time.DateTimeField dateTimeField93 = gJChronology86.clockhourOfHalfday();
        org.joda.time.Instant instant94 = gJChronology86.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology95 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone43, (org.joda.time.ReadableInstant) instant94);
        org.joda.time.chrono.GJChronology gJChronology96 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone37, (org.joda.time.ReadableInstant) instant94);
        org.joda.time.Chronology chronology97 = gJChronology0.withZone(dateTimeZone37);
        org.joda.time.ReadableInstant readableInstant98 = null;
        org.joda.time.chrono.GJChronology gJChronology99 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone37, readableInstant98);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(gJChronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(gJChronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(gJChronology44);
        org.junit.Assert.assertNotNull(gJChronology45);
        org.junit.Assert.assertNotNull(gJChronology46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 4 + "'", int48 == 4);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertNotNull(instant53);
        org.junit.Assert.assertNotNull(gJChronology54);
        org.junit.Assert.assertNotNull(gJChronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(instant57);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(dateTimeZone62);
        org.junit.Assert.assertNotNull(gJChronology63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 4 + "'", int65 == 4);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertNotNull(instant71);
        org.junit.Assert.assertNotNull(gJChronology72);
        org.junit.Assert.assertNotNull(gJChronology73);
        org.junit.Assert.assertNotNull(gJChronology74);
        org.junit.Assert.assertNotNull(dateTimeField75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 4 + "'", int76 == 4);
        org.junit.Assert.assertNotNull(durationField77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(durationField80);
        org.junit.Assert.assertNotNull(instant81);
        org.junit.Assert.assertNotNull(gJChronology83);
        org.junit.Assert.assertNotNull(gJChronology85);
        org.junit.Assert.assertNotNull(gJChronology86);
        org.junit.Assert.assertNotNull(dateTimeField87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 4 + "'", int88 == 4);
        org.junit.Assert.assertNotNull(dateTimeField89);
        org.junit.Assert.assertNotNull(chronology91);
        org.junit.Assert.assertNotNull(durationField92);
        org.junit.Assert.assertNotNull(dateTimeField93);
        org.junit.Assert.assertNotNull(instant94);
        org.junit.Assert.assertNotNull(gJChronology95);
        org.junit.Assert.assertNotNull(gJChronology96);
        org.junit.Assert.assertNotNull(chronology97);
        org.junit.Assert.assertNotNull(gJChronology99);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        long long6 = gJChronology4.gregorianToJulianByYear(111110400004L);
        org.joda.time.DateTimeField dateTimeField7 = gJChronology4.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology4.hourOfHalfday();
        org.joda.time.Instant instant9 = gJChronology4.getGregorianCutover();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = gJChronology4.set(readablePartial10, 4579199988L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 112233600004L + "'", long6 == 112233600004L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(instant9);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
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
        org.joda.time.DateTimeField dateTimeField14 = gJChronology10.secondOfMinute();
        org.joda.time.DurationField durationField15 = gJChronology10.millis();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology10.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology10.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology10.weekOfWeekyear();
        org.joda.time.Chronology chronology19 = gJChronology10.withUTC();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology10.weekOfWeekyear();
        java.lang.Class<?> wildcardClass21 = dateTimeField20.getClass();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DurationField durationField2 = gJChronology0.days();
        org.joda.time.DurationField durationField3 = gJChronology0.minutes();
        org.joda.time.DurationField durationField4 = gJChronology0.weekyears();
        org.joda.time.Instant instant5 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField6 = gJChronology0.seconds();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
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
        long long19 = gJChronology0.gregorianToJulianByYear(1209599999L);
        org.joda.time.DateTimeField dateTimeField20 = gJChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 2332799999L + "'", long19 == 2332799999L);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField2 = gJChronology0.years();
        org.joda.time.ReadablePartial readablePartial3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = gJChronology0.get(readablePartial3, 1209600014L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        long long9 = gJChronology0.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.centuryOfEra();
        org.joda.time.Instant instant12 = gJChronology0.getGregorianCutover();
        long long14 = gJChronology0.julianToGregorianByWeekyear((-1209600000L));
        org.joda.time.DateTimeField dateTimeField15 = gJChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology0.yearOfCentury();
        org.joda.time.Chronology chronology17 = gJChronology0.withUTC();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-2419200000L) + "'", long14 == (-2419200000L));
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(chronology17);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
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
        org.joda.time.DateTimeField dateTimeField16 = gJChronology5.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology5.weekyear();
        org.joda.time.ReadablePartial readablePartial18 = null;
        int[] intArray21 = new int[] { (-1), 100 };
        // The following exception was thrown during execution in test generation
        try {
            gJChronology5.validate(readablePartial18, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { (-1), 100 });
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.dayOfYear();
        int int4 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = gJChronology0.add(readablePeriod6, 0L, (int) (byte) -1);
        org.joda.time.DurationField durationField10 = gJChronology0.months();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
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
        org.joda.time.chrono.GJChronology gJChronology55 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField56 = gJChronology55.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField57 = gJChronology55.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField58 = gJChronology55.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone59 = gJChronology55.getZone();
        org.joda.time.DateTimeZone dateTimeZone60 = gJChronology55.getZone();
        org.joda.time.chrono.GJChronology gJChronology61 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField62 = gJChronology61.minuteOfHour();
        int int63 = gJChronology61.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField64 = gJChronology61.halfdays();
        boolean boolean66 = gJChronology61.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField67 = gJChronology61.months();
        org.joda.time.Instant instant68 = gJChronology61.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology69 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone60, (org.joda.time.ReadableInstant) instant68);
        org.joda.time.chrono.GJChronology gJChronology70 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) instant68);
        org.joda.time.chrono.GJChronology gJChronology71 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField72 = gJChronology71.minuteOfHour();
        int int73 = gJChronology71.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField74 = gJChronology71.weekyear();
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.Chronology chronology76 = gJChronology71.withZone(dateTimeZone75);
        org.joda.time.DurationField durationField77 = gJChronology71.millis();
        org.joda.time.DateTimeField dateTimeField78 = gJChronology71.clockhourOfHalfday();
        org.joda.time.Instant instant79 = gJChronology71.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology80 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) instant79);
        org.joda.time.DateTimeField dateTimeField81 = gJChronology80.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField82 = gJChronology80.weekyearOfCentury();
        org.joda.time.DurationField durationField83 = gJChronology80.millis();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1123200000L + "'", long5 == 1123200000L);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(gJChronology12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(gJChronology22);
        org.junit.Assert.assertNotNull(gJChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(gJChronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(instant39);
        org.junit.Assert.assertNotNull(gJChronology40);
        org.junit.Assert.assertNotNull(gJChronology41);
        org.junit.Assert.assertNotNull(gJChronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 4 + "'", int44 == 4);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(instant49);
        org.junit.Assert.assertNotNull(gJChronology51);
        org.junit.Assert.assertNotNull(gJChronology53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(gJChronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertNotNull(gJChronology61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 4 + "'", int63 == 4);
        org.junit.Assert.assertNotNull(durationField64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(durationField67);
        org.junit.Assert.assertNotNull(instant68);
        org.junit.Assert.assertNotNull(gJChronology69);
        org.junit.Assert.assertNotNull(gJChronology70);
        org.junit.Assert.assertNotNull(gJChronology71);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 4 + "'", int73 == 4);
        org.junit.Assert.assertNotNull(dateTimeField74);
        org.junit.Assert.assertNotNull(chronology76);
        org.junit.Assert.assertNotNull(durationField77);
        org.junit.Assert.assertNotNull(dateTimeField78);
        org.junit.Assert.assertNotNull(instant79);
        org.junit.Assert.assertNotNull(gJChronology80);
        org.junit.Assert.assertNotNull(dateTimeField81);
        org.junit.Assert.assertNotNull(dateTimeField82);
        org.junit.Assert.assertNotNull(durationField83);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        long long5 = gJChronology0.gregorianToJulianByYear((long) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.secondOfDay();
        long long8 = gJChronology0.gregorianToJulianByWeekyear((long) (short) 0);
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology13.minuteOfHour();
        int int15 = gJChronology13.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField16 = gJChronology13.halfdays();
        boolean boolean18 = gJChronology13.equals((java.lang.Object) 100);
        org.joda.time.Instant instant19 = gJChronology13.getGregorianCutover();
        long long21 = gJChronology13.julianToGregorianByWeekyear((-1123200001L));
        org.joda.time.DateTimeField dateTimeField22 = gJChronology13.monthOfYear();
        org.joda.time.Instant instant23 = gJChronology13.getGregorianCutover();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, (org.joda.time.ReadableInstant) instant23, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1123200000L + "'", long5 == 1123200000L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1209600000L + "'", long8 == 1209600000L);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-2332800001L) + "'", long21 == (-2332800001L));
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(instant23);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
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
        long long14 = gJChronology1.gregorianToJulianByWeekyear((-1209600008L));
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-8L) + "'", long14 == (-8L));
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        org.joda.time.DurationField durationField4 = gJChronology0.months();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology0.add(readablePeriod5, 14611499L, 0);
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.weekyear();
        org.joda.time.DurationField durationField10 = gJChronology0.hours();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 14611499L + "'", long8 == 14611499L);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField3 = gJChronology0.years();
        org.joda.time.DurationField durationField4 = gJChronology0.years();
        long long8 = gJChronology0.add((-3628800000L), (-5615990036L), (int) 'a');
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-548379833492L) + "'", long8 == (-548379833492L));
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
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
        long long17 = gJChronology1.julianToGregorianByYear(14607999L);
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1123210000L + "'", long9 == 1123210000L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1108592001L) + "'", long17 == (-1108592001L));
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfMonth();
        long long9 = gJChronology0.add(447L, (long) 0, (int) 'a');
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.year();
        long long14 = gJChronology0.add((long) ' ', (long) (-1), 1);
        org.joda.time.DurationField durationField15 = gJChronology0.days();
        org.joda.time.DateTimeZone dateTimeZone16 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = gJChronology17.monthOfYear();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 447L + "'", long9 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 31L + "'", long14 == 31L);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(gJChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
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
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = gJChronology0.add(readablePeriod10, 14L, (int) 'a');
        long long15 = gJChronology0.julianToGregorianByYear((-1209590000L));
        org.joda.time.DateTimeField dateTimeField16 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 14L + "'", long13 == 14L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-2332790000L) + "'", long15 == (-2332790000L));
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = gJChronology0.withZone(dateTimeZone4);
        org.joda.time.DurationField durationField6 = gJChronology0.millis();
        org.joda.time.DurationField durationField7 = gJChronology0.years();
        org.joda.time.DurationField durationField8 = gJChronology0.hours();
        org.joda.time.DurationField durationField9 = gJChronology0.centuries();
        org.joda.time.DurationField durationField10 = gJChronology0.weeks();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        long long5 = gJChronology1.add((long) 'a', (long) 10, (int) '#');
        org.joda.time.chrono.AssembledChronology.Fields fields6 = null;
        gJChronology1.assemble(fields6);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology1.weekyearOfCentury();
        long long13 = gJChronology1.add((-2L), 1209600010L, (int) (byte) -1);
        org.joda.time.DurationField durationField14 = gJChronology1.days();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = gJChronology17.era();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = gJChronology17.add(readablePeriod19, (-9L), (int) '#');
        org.joda.time.DateTimeField dateTimeField23 = gJChronology17.weekOfWeekyear();
        boolean boolean24 = gJChronology1.equals((java.lang.Object) gJChronology17);
        org.joda.time.ReadablePartial readablePartial25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = gJChronology1.get(readablePartial25, 1109721601078L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 447L + "'", long5 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1209600012L) + "'", long13 == (-1209600012L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(gJChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-9L) + "'", long22 == (-9L));
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.era();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = gJChronology0.get(readablePeriod10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DateTimeZone dateTimeZone2 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.Instant instant5 = gJChronology3.getGregorianCutover();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone2, (org.joda.time.ReadableInstant) instant5, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[UTC]" + "'", str4, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(instant5);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
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
        org.joda.time.DateTimeField dateTimeField13 = gJChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology1.era();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology1.year();
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.minuteOfHour();
        int int3 = gJChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology1.dayOfYear();
        long long10 = gJChronology1.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology1.centuryOfEra();
        org.joda.time.Instant instant13 = gJChronology1.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) instant13);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.hourOfDay();
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology16.halfdayOfDay();
        org.joda.time.DurationField durationField18 = gJChronology16.hours();
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology19.centuryOfEra();
        boolean boolean22 = gJChronology19.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone23 = gJChronology19.getZone();
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology24.minuteOfHour();
        int int26 = gJChronology24.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField27 = gJChronology24.halfdays();
        boolean boolean29 = gJChronology24.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField30 = gJChronology24.months();
        org.joda.time.Instant instant31 = gJChronology24.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23, (org.joda.time.ReadableInstant) instant31);
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology33.minuteOfHour();
        int int35 = gJChronology33.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField36 = gJChronology33.halfdays();
        boolean boolean38 = gJChronology33.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField39 = gJChronology33.months();
        org.joda.time.Instant instant40 = gJChronology33.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology41 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23, (org.joda.time.ReadableInstant) instant40);
        org.joda.time.chrono.GJChronology gJChronology44 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23, (-2246399996L), (int) (byte) 1);
        org.joda.time.Chronology chronology45 = gJChronology16.withZone(dateTimeZone23);
        org.joda.time.Chronology chronology46 = gJChronology14.withZone(dateTimeZone23);
        long long52 = gJChronology14.getDateTimeMillis((-1123200009L), 4, (int) '#', 10, 0);
        org.joda.time.DateTimeField dateTimeField53 = gJChronology14.weekyear();
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(gJChronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertNotNull(gJChronology32);
        org.junit.Assert.assertNotNull(gJChronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(instant40);
        org.junit.Assert.assertNotNull(gJChronology41);
        org.junit.Assert.assertNotNull(gJChronology44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-1131890000L) + "'", long52 == (-1131890000L));
        org.junit.Assert.assertNotNull(dateTimeField53);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology5.minuteOfHour();
        org.joda.time.Instant instant7 = gJChronology5.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.Chronology chronology9 = gJChronology5.withZone(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology5.clockhourOfDay();
        org.joda.time.DurationField durationField11 = gJChronology5.centuries();
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology12.centuryOfEra();
        boolean boolean15 = gJChronology12.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone16 = gJChronology12.getZone();
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone16);
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology18.minuteOfHour();
        org.joda.time.Instant instant20 = gJChronology18.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone16, (org.joda.time.ReadableInstant) instant20);
        org.joda.time.Chronology chronology22 = gJChronology5.withZone(dateTimeZone16);
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology23.minuteOfHour();
        int int25 = gJChronology23.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology23.weekyear();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.Chronology chronology28 = gJChronology23.withZone(dateTimeZone27);
        org.joda.time.DurationField durationField29 = gJChronology23.millis();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology23.dayOfWeek();
        org.joda.time.Instant instant31 = gJChronology23.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone16, (org.joda.time.ReadableInstant) instant31);
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant31);
        org.joda.time.chrono.GJChronology gJChronology36 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (-1209599965L), 4);
        org.joda.time.DateTimeField dateTimeField37 = gJChronology36.dayOfYear();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(gJChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(gJChronology17);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(gJChronology21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(gJChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertNotNull(gJChronology32);
        org.junit.Assert.assertNotNull(gJChronology33);
        org.junit.Assert.assertNotNull(gJChronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.weekyearOfCentury();
        org.joda.time.Chronology chronology2 = gJChronology0.withUTC();
        org.joda.time.Chronology chronology3 = gJChronology0.withUTC();
        long long9 = gJChronology0.getDateTimeMillis(12873620281L, (int) (byte) 0, 1, (int) ' ', (int) '4');
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 12848492052L + "'", long9 == 12848492052L);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Chronology chronology8 = gJChronology0.withZone(dateTimeZone7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = gJChronology0.add(readablePeriod9, 1209599999L, 0);
        org.joda.time.Instant instant13 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1209599999L + "'", long12 == 1209599999L);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
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
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology13.millisOfSecond();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology18.minuteOfHour();
        int int20 = gJChronology18.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField21 = gJChronology18.halfdays();
        boolean boolean23 = gJChronology18.equals((java.lang.Object) 100);
        org.joda.time.Instant instant24 = gJChronology18.getGregorianCutover();
        org.joda.time.DurationField durationField25 = gJChronology18.hours();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology18.weekyear();
        org.joda.time.DurationField durationField27 = gJChronology18.months();
        org.joda.time.Instant instant28 = gJChronology18.getGregorianCutover();
        org.joda.time.DurationField durationField29 = gJChronology18.minutes();
        boolean boolean30 = gJChronology13.equals((java.lang.Object) durationField29);
        org.joda.time.DateTimeZone dateTimeZone31 = gJChronology13.getZone();
        org.joda.time.DurationField durationField32 = gJChronology13.days();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray36 = gJChronology13.get(readablePeriod33, 1126852000L, 5702401031L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(gJChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1209599900L) + "'", long15 == (-1209599900L));
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(durationField32);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField3 = gJChronology0.hours();
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, readableInstant6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.centuryOfEra();
        long long14 = gJChronology9.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = gJChronology9.add(readablePeriod15, 100L, 100);
        org.joda.time.Instant instant19 = gJChronology9.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant19, (int) (short) 1);
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (-2332799900L), 4);
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(gJChronology21);
        org.junit.Assert.assertNotNull(gJChronology24);
        org.junit.Assert.assertNotNull(gJChronology25);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
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
        org.joda.time.DurationField durationField11 = gJChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology0.year();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology0.minuteOfHour();
        org.joda.time.DurationField durationField15 = gJChronology0.halfdays();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.yearOfCentury();
        long long5 = gJChronology0.julianToGregorianByWeekyear((long) (-1));
        org.joda.time.Chronology chronology6 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = gJChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField12 = gJChronology0.halfdays();
        int int13 = gJChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1209600001L) + "'", long5 == (-1209600001L));
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.yearOfCentury();
        long long5 = gJChronology0.julianToGregorianByWeekyear((long) (-1));
        org.joda.time.Chronology chronology6 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = gJChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.monthOfYear();
        org.joda.time.DurationField durationField11 = gJChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1209600001L) + "'", long5 == (-1209600001L));
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = gJChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.millisOfDay();
        long long8 = gJChronology0.julianToGregorianByYear(2347407999L);
        org.joda.time.DurationField durationField9 = gJChronology0.millis();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.minuteOfHour();
        org.joda.time.DurationField durationField11 = gJChronology0.weeks();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1224207999L + "'", long8 == 1224207999L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        long long5 = gJChronology0.gregorianToJulianByYear((long) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = gJChronology0.get(readablePeriod7, 1123200000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1123200000L + "'", long5 == 1123200000L);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField3 = gJChronology0.hours();
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, readableInstant6);
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.minuteOfHour();
        org.joda.time.Instant instant11 = gJChronology9.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.Chronology chronology13 = gJChronology9.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = gJChronology9.clockhourOfDay();
        org.joda.time.DurationField durationField15 = gJChronology9.centuries();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology9.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology9.era();
        boolean boolean18 = gJChronology8.equals((java.lang.Object) gJChronology9);
        org.joda.time.DateTimeField dateTimeField19 = gJChronology9.yearOfCentury();
        java.lang.Object obj20 = null;
        boolean boolean21 = gJChronology9.equals(obj20);
        org.joda.time.DurationField durationField22 = gJChronology9.years();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(durationField22);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
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
        org.joda.time.DateTimeField dateTimeField26 = gJChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone27 = gJChronology0.getZone();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 447L + "'", long9 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1209599999L + "'", long14 == 1209599999L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3456000447L + "'", long18 == 3456000447L);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1209600091L + "'", long24 == 1209600091L);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
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
        org.joda.time.DateTimeField dateTimeField20 = gJChronology14.secondOfDay();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology14.monthOfYear();
        org.joda.time.Instant instant22 = gJChronology14.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant22);
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone25 = gJChronology24.getZone();
        int int26 = gJChronology24.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone27 = gJChronology24.getZone();
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology28.minuteOfHour();
        org.joda.time.Instant instant30 = gJChronology28.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.Chronology chronology32 = gJChronology28.withZone(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField33 = gJChronology28.secondOfDay();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology28.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone35 = gJChronology28.getZone();
        org.joda.time.chrono.GJChronology gJChronology36 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology36.minuteOfHour();
        int int38 = gJChronology36.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology36.secondOfDay();
        org.joda.time.DateTimeField dateTimeField40 = gJChronology36.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology36.dayOfYear();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology36.secondOfDay();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology36.monthOfYear();
        org.joda.time.Instant instant44 = gJChronology36.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology45 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone35, (org.joda.time.ReadableInstant) instant44);
        org.joda.time.chrono.GJChronology gJChronology46 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone35);
        org.joda.time.chrono.GJChronology gJChronology47 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField48 = gJChronology47.minuteOfHour();
        int int49 = gJChronology47.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField50 = gJChronology47.halfdays();
        boolean boolean52 = gJChronology47.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField53 = gJChronology47.months();
        org.joda.time.Instant instant54 = gJChronology47.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology56 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone35, (org.joda.time.ReadableInstant) instant54, 1);
        org.joda.time.chrono.GJChronology gJChronology57 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27, (org.joda.time.ReadableInstant) instant54);
        org.joda.time.chrono.GJChronology gJChronology58 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant54);
        long long62 = gJChronology58.add(2246399988L, (-4751999996L), (int) (byte) 100);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(gJChronology23);
        org.junit.Assert.assertNotNull(gJChronology24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(gJChronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(gJChronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(instant44);
        org.junit.Assert.assertNotNull(gJChronology45);
        org.junit.Assert.assertNotNull(gJChronology46);
        org.junit.Assert.assertNotNull(gJChronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 4 + "'", int49 == 4);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertNotNull(instant54);
        org.junit.Assert.assertNotNull(gJChronology56);
        org.junit.Assert.assertNotNull(gJChronology57);
        org.junit.Assert.assertNotNull(gJChronology58);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-472953599612L) + "'", long62 == (-472953599612L));
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
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
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.minuteOfDay();
        org.joda.time.DurationField durationField17 = gJChronology13.days();
        org.joda.time.DurationField durationField18 = gJChronology13.centuries();
        org.joda.time.DurationField durationField19 = gJChronology13.millis();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(gJChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1209599900L) + "'", long15 == (-1209599900L));
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.monthOfYear();
        org.joda.time.DurationField durationField7 = gJChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.year();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.minuteOfHour();
        org.joda.time.Instant instant3 = gJChronology1.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) instant3);
        int int5 = gJChronology4.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField6 = gJChronology4.hours();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology4.weekOfWeekyear();
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology5.yearOfEra();
        org.joda.time.DurationField durationField7 = gJChronology5.hours();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.DurationField durationField6 = gJChronology5.months();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology5.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology5.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology5.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology5.yearOfEra();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.minuteOfHour();
        int int3 = gJChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology1.dayOfYear();
        long long10 = gJChronology1.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology1.centuryOfEra();
        org.joda.time.Instant instant13 = gJChronology1.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) instant13);
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology15.minuteOfHour();
        java.lang.String str17 = gJChronology15.toString();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = gJChronology15.add(readablePeriod18, (long) '4', (int) '4');
        org.joda.time.DateTimeField dateTimeField22 = gJChronology15.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = gJChronology15.add(readablePeriod23, (long) (short) 0, (int) (byte) 100);
        org.joda.time.chrono.GJChronology gJChronology27 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology27.minuteOfHour();
        org.joda.time.Instant instant29 = gJChronology27.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.Chronology chronology31 = gJChronology27.withZone(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = gJChronology27.secondOfDay();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology27.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone34 = gJChronology27.getZone();
        org.joda.time.chrono.GJChronology gJChronology35 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology35.minuteOfHour();
        int int37 = gJChronology35.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology35.secondOfDay();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology35.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField40 = gJChronology35.dayOfYear();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology35.secondOfDay();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology35.monthOfYear();
        org.joda.time.Instant instant43 = gJChronology35.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology44 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone34, (org.joda.time.ReadableInstant) instant43);
        org.joda.time.Chronology chronology45 = gJChronology15.withZone(dateTimeZone34);
        org.joda.time.Chronology chronology46 = gJChronology14.withZone(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField47 = gJChronology14.secondOfDay();
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(gJChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GJChronology[UTC]" + "'", str17, "GJChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 52L + "'", long21 == 52L);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(gJChronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(gJChronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(instant43);
        org.junit.Assert.assertNotNull(gJChronology44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeField47);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
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
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.centuryOfEra();
        boolean boolean17 = gJChronology14.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone18 = gJChronology14.getZone();
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18);
        org.joda.time.Chronology chronology20 = gJChronology0.withZone(dateTimeZone18);
        org.joda.time.DurationField durationField21 = gJChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        long long9 = gJChronology0.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.dayOfWeek();
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.minuteOfHour();
        int int13 = gJChronology11.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology11.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology11.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology11.dayOfYear();
        long long20 = gJChronology11.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology11.weekyear();
        boolean boolean22 = gJChronology0.equals((java.lang.Object) gJChronology11);
        org.joda.time.DateTimeZone dateTimeZone23 = gJChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone25 = gJChronology0.getZone();
        int int26 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField27 = gJChronology0.months();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(durationField27);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        long long9 = gJChronology0.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology0.minuteOfDay();
        org.joda.time.DurationField durationField13 = gJChronology0.minutes();
        int int14 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField15 = gJChronology0.minutes();
        org.joda.time.DurationField durationField16 = gJChronology0.millis();
        java.lang.Class<?> wildcardClass17 = durationField16.getClass();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.DurationField durationField3 = gJChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology1.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone5 = gJChronology1.getZone();
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology6.getZone();
        org.joda.time.Chronology chronology8 = gJChronology1.withZone(dateTimeZone7);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(gJChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(gJChronology9);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        long long5 = gJChronology0.gregorianToJulianByYear((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.Chronology chronology7 = gJChronology0.withZone(dateTimeZone6);
        org.joda.time.DurationField durationField8 = gJChronology0.months();
        org.joda.time.DurationField durationField9 = gJChronology0.seconds();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1123200000L + "'", long5 == 1123200000L);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.Instant instant6 = gJChronology0.getGregorianCutover();
        long long8 = gJChronology0.julianToGregorianByWeekyear((-1123200001L));
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.monthOfYear();
        org.joda.time.Instant instant10 = gJChronology0.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.centuryOfEra();
        boolean boolean14 = gJChronology11.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone15 = gJChronology11.getZone();
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology16.minuteOfHour();
        int int18 = gJChronology16.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField19 = gJChronology16.halfdays();
        boolean boolean21 = gJChronology16.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField22 = gJChronology16.months();
        org.joda.time.Instant instant23 = gJChronology16.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15, (org.joda.time.ReadableInstant) instant23);
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15);
        org.joda.time.Chronology chronology26 = gJChronology0.withZone(dateTimeZone15);
        org.joda.time.chrono.GJChronology gJChronology27 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField28 = gJChronology27.seconds();
        org.joda.time.DurationField durationField29 = gJChronology27.days();
        org.joda.time.DurationField durationField30 = gJChronology27.minutes();
        org.joda.time.Instant instant31 = gJChronology27.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15, (org.joda.time.ReadableInstant) instant31);
        org.joda.time.DateTimeField dateTimeField33 = gJChronology32.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology32.era();
        long long36 = gJChronology32.julianToGregorianByWeekyear(12182400009L);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-2332800001L) + "'", long8 == (-2332800001L));
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(gJChronology24);
        org.junit.Assert.assertNotNull(gJChronology25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(gJChronology27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertNotNull(gJChronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10972800009L + "'", long36 == 10972800009L);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.minuteOfHour();
        int int10 = gJChronology8.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology8.monthOfYear();
        org.joda.time.Instant instant16 = gJChronology8.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant16);
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology19.minuteOfHour();
        int int21 = gJChronology19.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField22 = gJChronology19.halfdays();
        boolean boolean24 = gJChronology19.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField25 = gJChronology19.months();
        org.joda.time.Instant instant26 = gJChronology19.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant26, 1);
        org.joda.time.chrono.GJChronology gJChronology29 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField30 = gJChronology29.monthOfYear();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology29.halfdayOfDay();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(gJChronology17);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(gJChronology28);
        org.junit.Assert.assertNotNull(gJChronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        long long6 = gJChronology1.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField7 = gJChronology1.eras();
        long long9 = gJChronology1.gregorianToJulianByYear(10000L);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology1.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = gJChronology1.add(readablePeriod11, 12182400009L, 100);
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1123210000L + "'", long9 == 1123210000L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 12182400009L + "'", long14 == 12182400009L);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        long long9 = gJChronology0.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology0.minuteOfDay();
        org.joda.time.DurationField durationField13 = gJChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology0.year();
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology15.minuteOfHour();
        int int17 = gJChronology15.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField18 = gJChronology15.halfdays();
        boolean boolean20 = gJChronology15.equals((java.lang.Object) 100);
        org.joda.time.Instant instant21 = gJChronology15.getGregorianCutover();
        org.joda.time.DurationField durationField22 = gJChronology15.hours();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology15.weekyear();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology15.secondOfMinute();
        java.lang.String str25 = gJChronology15.toString();
        boolean boolean26 = gJChronology0.equals((java.lang.Object) gJChronology15);
        org.joda.time.DateTimeField dateTimeField27 = gJChronology15.halfdayOfDay();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(gJChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "GJChronology[UTC]" + "'", str25, "GJChronology[UTC]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTimeField27);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
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
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = gJChronology9.add(readablePeriod11, 1051407999L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology9.centuryOfEra();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1123199900L) + "'", long8 == (-1123199900L));
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1051407999L + "'", long14 == 1051407999L);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        long long9 = gJChronology0.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DurationField durationField10 = gJChronology0.millis();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology0.halfdayOfDay();
        long long14 = gJChronology0.julianToGregorianByWeekyear((long) (short) -1);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology0.yearOfCentury();
        org.joda.time.DurationField durationField16 = gJChronology0.years();
        org.joda.time.DurationField durationField17 = gJChronology0.millis();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1209600001L) + "'", long14 == (-1209600001L));
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
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
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology13.getZone();
        int int15 = gJChronology13.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone16 = gJChronology13.getZone();
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology17.minuteOfHour();
        org.joda.time.Instant instant19 = gJChronology17.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.Chronology chronology21 = gJChronology17.withZone(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField22 = gJChronology17.secondOfDay();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology17.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = gJChronology17.getZone();
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology25.minuteOfHour();
        int int27 = gJChronology25.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology25.secondOfDay();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology25.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology25.dayOfYear();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology25.secondOfDay();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology25.monthOfYear();
        org.joda.time.Instant instant33 = gJChronology25.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology34 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24, (org.joda.time.ReadableInstant) instant33);
        org.joda.time.chrono.GJChronology gJChronology35 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24);
        org.joda.time.chrono.GJChronology gJChronology36 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology36.minuteOfHour();
        int int38 = gJChronology36.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField39 = gJChronology36.halfdays();
        boolean boolean41 = gJChronology36.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField42 = gJChronology36.months();
        org.joda.time.Instant instant43 = gJChronology36.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology45 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24, (org.joda.time.ReadableInstant) instant43, 1);
        org.joda.time.chrono.GJChronology gJChronology46 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone16, (org.joda.time.ReadableInstant) instant43);
        org.joda.time.chrono.GJChronology gJChronology47 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, (org.joda.time.ReadableInstant) instant43);
        java.lang.Class<?> wildcardClass48 = instant43.getClass();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(gJChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(gJChronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertNotNull(gJChronology34);
        org.junit.Assert.assertNotNull(gJChronology35);
        org.junit.Assert.assertNotNull(gJChronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(instant43);
        org.junit.Assert.assertNotNull(gJChronology45);
        org.junit.Assert.assertNotNull(gJChronology46);
        org.junit.Assert.assertNotNull(gJChronology47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone1 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (-1123199903L), (int) (short) 1);
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(gJChronology6);
        org.junit.Assert.assertNotNull(gJChronology7);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.minuteOfHour();
        int int10 = gJChronology8.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField11 = gJChronology8.halfdays();
        boolean boolean13 = gJChronology8.equals((java.lang.Object) 100);
        org.joda.time.Instant instant14 = gJChronology8.getGregorianCutover();
        org.joda.time.DurationField durationField15 = gJChronology8.hours();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology8.weekyear();
        org.joda.time.DurationField durationField17 = gJChronology8.months();
        org.joda.time.Instant instant18 = gJChronology8.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant18);
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (-9L), 4);
        org.joda.time.DateTimeField dateTimeField23 = gJChronology22.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology22.hourOfHalfday();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(gJChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
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
        org.joda.time.DurationField durationField18 = gJChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology1.year();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology1.yearOfEra();
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 447L + "'", long5 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        long long5 = gJChronology1.add((long) 'a', (long) 10, (int) '#');
        org.joda.time.DateTimeField dateTimeField6 = gJChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = gJChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology1.centuryOfEra();
        long long10 = gJChronology1.gregorianToJulianByWeekyear(1123199988L);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology1.weekOfWeekyear();
        long long13 = gJChronology1.gregorianToJulianByWeekyear((long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = gJChronology1.getDateTimeMillis(0, (int) 'a', (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 447L + "'", long5 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2332799988L + "'", long10 == 2332799988L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1209600001L + "'", long13 == 1209600001L);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.era();
        long long6 = gJChronology0.gregorianToJulianByYear(14607999L);
        org.joda.time.Instant instant7 = gJChronology0.getGregorianCutover();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1137807999L + "'", long6 == 1137807999L);
        org.junit.Assert.assertNotNull(instant7);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.weekOfWeekyear();
        long long7 = gJChronology0.gregorianToJulianByYear(447L);
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
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology24.minuteOfHour();
        org.joda.time.Instant instant26 = gJChronology24.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.Chronology chronology28 = gJChronology24.withZone(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = gJChronology24.secondOfDay();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology24.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone31 = gJChronology24.getZone();
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology32.minuteOfHour();
        int int34 = gJChronology32.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology32.secondOfDay();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology32.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology32.dayOfYear();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology32.secondOfDay();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology32.monthOfYear();
        org.joda.time.Instant instant40 = gJChronology32.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology41 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31, (org.joda.time.ReadableInstant) instant40);
        org.joda.time.chrono.GJChronology gJChronology42 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31);
        org.joda.time.chrono.GJChronology gJChronology43 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField44 = gJChronology43.minuteOfHour();
        int int45 = gJChronology43.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField46 = gJChronology43.halfdays();
        boolean boolean48 = gJChronology43.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField49 = gJChronology43.months();
        org.joda.time.Instant instant50 = gJChronology43.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology52 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31, (org.joda.time.ReadableInstant) instant50, 1);
        org.joda.time.chrono.GJChronology gJChronology54 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, (org.joda.time.ReadableInstant) instant50, (int) (short) 1);
        org.joda.time.chrono.GJChronology gJChronology55 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField56 = gJChronology55.minuteOfHour();
        int int57 = gJChronology55.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField58 = gJChronology55.weekyear();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.Chronology chronology60 = gJChronology55.withZone(dateTimeZone59);
        org.joda.time.DurationField durationField61 = gJChronology55.millis();
        org.joda.time.DateTimeField dateTimeField62 = gJChronology55.clockhourOfHalfday();
        org.joda.time.Instant instant63 = gJChronology55.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology64 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, (org.joda.time.ReadableInstant) instant63);
        org.joda.time.Chronology chronology65 = gJChronology0.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField66 = gJChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1123200447L + "'", long7 == 1123200447L);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(gJChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(gJChronology23);
        org.junit.Assert.assertNotNull(gJChronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(gJChronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(instant40);
        org.junit.Assert.assertNotNull(gJChronology41);
        org.junit.Assert.assertNotNull(gJChronology42);
        org.junit.Assert.assertNotNull(gJChronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(instant50);
        org.junit.Assert.assertNotNull(gJChronology52);
        org.junit.Assert.assertNotNull(gJChronology54);
        org.junit.Assert.assertNotNull(gJChronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 4 + "'", int57 == 4);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(durationField61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(instant63);
        org.junit.Assert.assertNotNull(gJChronology64);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(dateTimeField66);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.weekOfWeekyear();
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology10.centuryOfEra();
        boolean boolean13 = gJChronology10.equals((java.lang.Object) 10L);
        org.joda.time.DurationField durationField14 = gJChronology10.months();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology10.millisOfDay();
        boolean boolean16 = gJChronology0.equals((java.lang.Object) gJChronology10);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
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
        org.joda.time.DateTimeField dateTimeField23 = gJChronology19.year();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-62111404799965L) + "'", long17 == (-62111404799965L));
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        long long5 = gJChronology1.add((long) 'a', (long) 10, (int) '#');
        org.joda.time.DateTimeField dateTimeField6 = gJChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology1.era();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology1.secondOfDay();
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.minuteOfHour();
        int int11 = gJChronology9.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology9.secondOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology9.dayOfYear();
        long long18 = gJChronology9.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DurationField durationField19 = gJChronology9.millis();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology9.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology9.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology9.halfdayOfDay();
        boolean boolean24 = gJChronology1.equals((java.lang.Object) dateTimeField23);
        org.joda.time.DurationField durationField25 = gJChronology1.weekyears();
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 447L + "'", long5 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(durationField25);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.weekyear();
        org.joda.time.Chronology chronology4 = gJChronology0.withUTC();
        long long6 = gJChronology0.gregorianToJulianByWeekyear((-1209599996L));
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.weekOfWeekyear();
        java.lang.String str8 = gJChronology0.toString();
        long long13 = gJChronology0.getDateTimeMillis((int) (byte) -1, (int) (short) 1, (int) (byte) 10, 0);
        org.joda.time.DurationField durationField14 = gJChronology0.centuries();
        long long16 = gJChronology0.julianToGregorianByWeekyear(4579199990L);
        int int17 = gJChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4L + "'", long6 == 4L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[UTC]" + "'", str8, "GJChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-62166614400000L) + "'", long13 == (-62166614400000L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3369599990L + "'", long16 == 3369599990L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
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
        org.joda.time.DateTimeField dateTimeField14 = gJChronology10.secondOfMinute();
        org.joda.time.DurationField durationField15 = gJChronology10.millis();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology10.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology10.getZone();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17);
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17);
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology20.minuteOfHour();
        int int22 = gJChronology20.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology20.dayOfYear();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology20.secondOfDay();
        org.joda.time.DurationField durationField25 = gJChronology20.centuries();
        java.lang.Object obj26 = null;
        boolean boolean27 = gJChronology20.equals(obj26);
        org.joda.time.DateTimeField dateTimeField28 = gJChronology20.secondOfMinute();
        org.joda.time.Instant instant29 = gJChronology20.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17, (org.joda.time.ReadableInstant) instant29);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(gJChronology30);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField3 = gJChronology0.hours();
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.DurationField durationField6 = gJChronology5.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology5.clockhourOfDay();
        long long9 = gJChronology5.gregorianToJulianByWeekyear((-62111232000000L));
        org.joda.time.DurationField durationField10 = gJChronology5.minutes();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-62111232000000L) + "'", long9 == (-62111232000000L));
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        java.lang.String str2 = gJChronology0.toString();
        org.joda.time.DurationField durationField3 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.dayOfWeek();
        org.joda.time.ReadablePartial readablePartial5 = null;
        int[] intArray12 = new int[] { (short) 100, 4, (-1), (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            gJChronology0.validate(readablePartial5, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GJChronology[UTC]" + "'", str2, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 100, 4, (-1), 10, 1, (-1) });
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology1.getZone();
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
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
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, readableInstant23);
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(gJChronology22);
        org.junit.Assert.assertNotNull(gJChronology24);
        org.junit.Assert.assertNotNull(gJChronology25);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.dayOfYear();
        long long6 = gJChronology0.gregorianToJulianByWeekyear((long) 10);
        long long8 = gJChronology0.julianToGregorianByWeekyear((long) (byte) 1);
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.weekyear();
        org.joda.time.DurationField durationField10 = gJChronology0.eras();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1209600010L + "'", long6 == 1209600010L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1209599999L) + "'", long8 == (-1209599999L));
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.weekyear();
        org.joda.time.Chronology chronology4 = gJChronology0.withUTC();
        org.joda.time.Instant instant5 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
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
        org.joda.time.DateTimeField dateTimeField35 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1209599903L) + "'", long7 == (-1209599903L));
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(gJChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertNotNull(gJChronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(gJChronology24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(gJChronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(gJChronology30);
        org.junit.Assert.assertNotNull(gJChronology32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        long long5 = gJChronology1.add((long) 'a', (long) 10, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology7.era();
        boolean boolean9 = gJChronology1.equals((java.lang.Object) gJChronology7);
        long long11 = gJChronology7.julianToGregorianByWeekyear((-2419200000L));
        org.joda.time.DateTimeField dateTimeField12 = gJChronology7.weekyear();
        long long14 = gJChronology7.gregorianToJulianByYear(1123199998L);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology7.millisOfDay();
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 447L + "'", long5 == 447L);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-3628800000L) + "'", long11 == (-3628800000L));
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2246399998L + "'", long14 == 2246399998L);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.weekyear();
        org.joda.time.Chronology chronology4 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.yearOfEra();
        org.joda.time.DurationField durationField6 = gJChronology0.weekyears();
        org.joda.time.DurationField durationField7 = gJChronology0.halfdays();
        org.joda.time.DurationField durationField8 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.millisOfDay();
        org.joda.time.DurationField durationField10 = gJChronology0.weeks();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.yearOfCentury();
        long long5 = gJChronology0.julianToGregorianByWeekyear((long) (-1));
        org.joda.time.Chronology chronology6 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = gJChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.yearOfCentury();
        long long11 = gJChronology0.gregorianToJulianByWeekyear((-2332799996L));
        org.joda.time.DurationField durationField12 = gJChronology0.days();
        org.joda.time.DurationField durationField13 = gJChronology0.years();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1209600001L) + "'", long5 == (-1209600001L));
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1123199996L) + "'", long11 == (-1123199996L));
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField3 = gJChronology0.years();
        org.joda.time.DurationField durationField4 = gJChronology0.years();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField7 = gJChronology0.minutes();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = gJChronology0.get(readablePartial8, (-11318398000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.centuryOfEra();
        org.joda.time.Instant instant4 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField7 = gJChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.clockhourOfHalfday();
        long long11 = gJChronology0.gregorianToJulianByYear((-61828185599903L));
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = gJChronology0.add(readablePeriod12, 0L, 0);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-61828358399903L) + "'", long11 == (-61828358399903L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.millisOfDay();
        org.joda.time.Instant instant5 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField6 = gJChronology0.weekyears();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone1 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.centuryOfEra();
        boolean boolean6 = gJChronology3.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology10.minuteOfHour();
        int int12 = gJChronology10.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField13 = gJChronology10.halfdays();
        boolean boolean15 = gJChronology10.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField16 = gJChronology10.months();
        org.joda.time.Instant instant17 = gJChronology10.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant17);
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (org.joda.time.ReadableInstant) instant17, 4);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology20.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology20.yearOfCentury();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology8.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology8.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = gJChronology8.getZone();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology8.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone15 = gJChronology8.getZone();
        org.joda.time.Chronology chronology16 = gJChronology0.withZone(dateTimeZone15);
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(gJChronology17);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        long long3 = gJChronology0.gregorianToJulianByWeekyear((long) ' ');
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.millisOfDay();
        org.joda.time.DurationField durationField5 = gJChronology0.minutes();
        org.joda.time.DurationField durationField6 = gJChronology0.days();
        org.joda.time.DurationField durationField7 = gJChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.clockhourOfHalfday();
        long long10 = gJChronology0.julianToGregorianByWeekyear(10108799031L);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1209600032L + "'", long3 == 1209600032L);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 8899199031L + "'", long10 == 8899199031L);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField7 = gJChronology6.dayOfMonth();
        org.joda.time.DurationField durationField8 = gJChronology6.weeks();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology6.clockhourOfHalfday();
        long long11 = gJChronology6.julianToGregorianByWeekyear((-234403184800L));
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(gJChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-235612784800L) + "'", long11 == (-235612784800L));
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField3 = gJChronology0.hours();
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, readableInstant6);
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.clockhourOfDay();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
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
        org.joda.time.DateTimeField dateTimeField65 = gJChronology64.dayOfYear();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(gJChronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(instant36);
        org.junit.Assert.assertNotNull(gJChronology37);
        org.junit.Assert.assertNotNull(gJChronology38);
        org.junit.Assert.assertNotNull(gJChronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(instant46);
        org.junit.Assert.assertNotNull(gJChronology48);
        org.junit.Assert.assertNotNull(gJChronology50);
        org.junit.Assert.assertNotNull(gJChronology51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 4 + "'", int53 == 4);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(instant59);
        org.junit.Assert.assertNotNull(gJChronology60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(gJChronology64);
        org.junit.Assert.assertNotNull(dateTimeField65);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.ReadablePartial readablePartial3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = gJChronology0.get(readablePartial3, (-86399968L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.dayOfWeek();
        int int4 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.weekyearOfCentury();
        org.joda.time.chrono.AssembledChronology.Fields fields8 = null;
        // The following exception was thrown during execution in test generation
        try {
            gJChronology0.assemble(fields8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
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
        org.joda.time.DateTimeField dateTimeField15 = gJChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField17 = gJChronology0.minutes();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-2332800001L) + "'", long8 == (-2332800001L));
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        java.lang.String str2 = gJChronology0.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = gJChronology0.add(readablePeriod3, (long) '4', (int) '4');
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = gJChronology0.add(readablePeriod9, 1123210000L, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.minuteOfHour();
        int int16 = gJChronology14.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField17 = gJChronology14.halfdays();
        boolean boolean19 = gJChronology14.equals((java.lang.Object) 100);
        org.joda.time.Instant instant20 = gJChronology14.getGregorianCutover();
        org.joda.time.DurationField durationField21 = gJChronology14.hours();
        java.lang.String str22 = gJChronology14.toString();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology14.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology14.yearOfEra();
        boolean boolean25 = gJChronology0.equals((java.lang.Object) gJChronology14);
        long long29 = gJChronology14.add((-3542399990L), (-1209590000L), (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.GJChronology gJChronology31 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone30);
        org.joda.time.DurationField durationField32 = gJChronology31.years();
        boolean boolean33 = gJChronology14.equals((java.lang.Object) durationField32);
        org.joda.time.DateTimeField dateTimeField34 = gJChronology14.dayOfWeek();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GJChronology[UTC]" + "'", str2, "GJChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1123210000L + "'", long12 == 1123210000L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "GJChronology[UTC]" + "'", str22, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-3542399990L) + "'", long29 == (-3542399990L));
        org.junit.Assert.assertNotNull(gJChronology31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTimeField34);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.secondOfDay();
        org.joda.time.DurationField durationField7 = gJChronology0.millis();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.secondOfDay();
        java.lang.Class<?> wildcardClass9 = gJChronology0.getClass();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField6 = gJChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.dayOfYear();
        org.joda.time.DurationField durationField9 = gJChronology0.millis();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField6 = gJChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.weekOfWeekyear();
        org.joda.time.Instant instant9 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField11 = gJChronology0.days();
        org.joda.time.DurationField durationField12 = gJChronology0.days();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.era();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Chronology chronology8 = gJChronology0.withZone(dateTimeZone7);
        java.lang.Object obj9 = null;
        boolean boolean10 = gJChronology0.equals(obj9);
        org.joda.time.Instant instant11 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology0.clockhourOfDay();
        long long14 = gJChronology0.julianToGregorianByWeekyear(1123199988L);
        org.joda.time.DurationField durationField15 = gJChronology0.minutes();
        long long17 = gJChronology0.julianToGregorianByWeekyear((-4236622648928L));
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology19.minuteOfHour();
        org.joda.time.Instant instant21 = gJChronology19.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18, (org.joda.time.ReadableInstant) instant21);
        int int23 = gJChronology22.getMinimumDaysInFirstWeek();
        long long25 = gJChronology22.gregorianToJulianByYear(0L);
        org.joda.time.DateTimeField dateTimeField26 = gJChronology22.year();
        org.joda.time.DateTimeZone dateTimeZone27 = gJChronology22.getZone();
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27);
        org.joda.time.chrono.GJChronology gJChronology29 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27);
        org.joda.time.Chronology chronology30 = gJChronology0.withZone(dateTimeZone27);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-86400012L) + "'", long14 == (-86400012L));
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-4237832248928L) + "'", long17 == (-4237832248928L));
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(gJChronology22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1123200000L + "'", long25 == 1123200000L);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(gJChronology28);
        org.junit.Assert.assertNotNull(gJChronology29);
        org.junit.Assert.assertNotNull(chronology30);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
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
        org.joda.time.DateTimeField dateTimeField18 = gJChronology0.year();
        java.lang.String str19 = gJChronology0.toString();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology0.weekyear();
        org.joda.time.DurationField durationField21 = gJChronology0.months();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 447L + "'", long9 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3652000L + "'", long16 == 3652000L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GJChronology[UTC]" + "'", str17, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "GJChronology[UTC]" + "'", str19, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = gJChronology0.withZone(dateTimeZone4);
        org.joda.time.DurationField durationField6 = gJChronology0.millis();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.clockhourOfHalfday();
        org.joda.time.Instant instant8 = gJChronology0.getGregorianCutover();
        long long13 = gJChronology0.getDateTimeMillis((int) (byte) 10, 10, 1, (int) (short) 1);
        long long15 = gJChronology0.gregorianToJulianByWeekyear((-21340799039L));
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61828185599999L) + "'", long13 == (-61828185599999L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-20131199039L) + "'", long15 == (-20131199039L));
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = gJChronology0.getDateTimeMillis(0, (int) (short) 10, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86400000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
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
        org.joda.time.DateTimeField dateTimeField15 = gJChronology1.era();
        org.joda.time.Chronology chronology16 = gJChronology1.withUTC();
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.minuteOfHour();
        org.joda.time.Instant instant3 = gJChronology1.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) instant3);
        int int5 = gJChronology4.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology4.weekOfWeekyear();
        long long8 = gJChronology4.julianToGregorianByYear((long) (byte) 10);
        org.joda.time.DurationField durationField9 = gJChronology4.hours();
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = gJChronology10.seconds();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology10.clockhourOfHalfday();
        org.joda.time.DurationField durationField13 = gJChronology10.millis();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology10.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology10.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology10.clockhourOfDay();
        boolean boolean17 = gJChronology4.equals((java.lang.Object) dateTimeField16);
        org.joda.time.DurationField durationField18 = gJChronology4.halfdays();
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1123199990L) + "'", long8 == (-1123199990L));
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.era();
        org.joda.time.DurationField durationField5 = gJChronology0.months();
        org.joda.time.DurationField durationField6 = gJChronology0.days();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
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
        org.joda.time.chrono.GJChronology gJChronology55 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField56 = gJChronology55.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField57 = gJChronology55.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField58 = gJChronology55.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone59 = gJChronology55.getZone();
        org.joda.time.DateTimeZone dateTimeZone60 = gJChronology55.getZone();
        org.joda.time.chrono.GJChronology gJChronology61 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField62 = gJChronology61.minuteOfHour();
        int int63 = gJChronology61.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField64 = gJChronology61.halfdays();
        boolean boolean66 = gJChronology61.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField67 = gJChronology61.months();
        org.joda.time.Instant instant68 = gJChronology61.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology69 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone60, (org.joda.time.ReadableInstant) instant68);
        org.joda.time.chrono.GJChronology gJChronology70 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) instant68);
        org.joda.time.DateTimeField dateTimeField71 = gJChronology70.dayOfWeek();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1123200000L + "'", long5 == 1123200000L);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(gJChronology12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(gJChronology22);
        org.junit.Assert.assertNotNull(gJChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(gJChronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(instant39);
        org.junit.Assert.assertNotNull(gJChronology40);
        org.junit.Assert.assertNotNull(gJChronology41);
        org.junit.Assert.assertNotNull(gJChronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 4 + "'", int44 == 4);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(instant49);
        org.junit.Assert.assertNotNull(gJChronology51);
        org.junit.Assert.assertNotNull(gJChronology53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(gJChronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertNotNull(gJChronology61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 4 + "'", int63 == 4);
        org.junit.Assert.assertNotNull(durationField64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(durationField67);
        org.junit.Assert.assertNotNull(instant68);
        org.junit.Assert.assertNotNull(gJChronology69);
        org.junit.Assert.assertNotNull(gJChronology70);
        org.junit.Assert.assertNotNull(dateTimeField71);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
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
        org.joda.time.DurationField durationField65 = gJChronology64.years();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(gJChronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(instant36);
        org.junit.Assert.assertNotNull(gJChronology37);
        org.junit.Assert.assertNotNull(gJChronology38);
        org.junit.Assert.assertNotNull(gJChronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(instant46);
        org.junit.Assert.assertNotNull(gJChronology48);
        org.junit.Assert.assertNotNull(gJChronology50);
        org.junit.Assert.assertNotNull(gJChronology51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 4 + "'", int53 == 4);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(instant59);
        org.junit.Assert.assertNotNull(gJChronology60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(gJChronology64);
        org.junit.Assert.assertNotNull(durationField65);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.minuteOfDay();
        org.joda.time.DurationField durationField8 = gJChronology0.hours();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        java.lang.String str2 = gJChronology0.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = gJChronology0.add(readablePeriod3, (long) '4', (int) '4');
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone9 = gJChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GJChronology[UTC]" + "'", str2, "GJChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
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
        org.joda.time.DateTimeField dateTimeField16 = gJChronology1.secondOfDay();
        long long18 = gJChronology1.gregorianToJulianByYear(111146460001L);
        long long22 = gJChronology1.add(6730100L, 3652000L, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField23 = gJChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology1.dayOfYear();
        long long26 = gJChronology1.julianToGregorianByWeekyear((-112320000048L));
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-9L) + "'", long11 == (-9L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-71792001L) + "'", long14 == (-71792001L));
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 112269660001L + "'", long18 == 112269660001L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 6730100L + "'", long22 == 6730100L);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-113529600048L) + "'", long26 == (-113529600048L));
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = gJChronology0.withZone(dateTimeZone4);
        org.joda.time.DurationField durationField6 = gJChronology0.millis();
        org.joda.time.DurationField durationField7 = gJChronology0.years();
        org.joda.time.DurationField durationField8 = gJChronology0.hours();
        org.joda.time.Chronology chronology9 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField6 = gJChronology0.months();
        org.joda.time.Instant instant7 = gJChronology0.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.centuryOfEra();
        boolean boolean11 = gJChronology8.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology8.getZone();
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        org.joda.time.Chronology chronology14 = gJChronology0.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfMonth();
        long long9 = gJChronology0.add(447L, (long) 0, (int) 'a');
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.year();
        long long14 = gJChronology0.add((long) ' ', (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology0.secondOfMinute();
        long long18 = gJChronology0.gregorianToJulianByYear(2246410000L);
        org.joda.time.DateTimeZone dateTimeZone19 = gJChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField22 = gJChronology21.centuryOfEra();
        long long26 = gJChronology21.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField27 = gJChronology21.eras();
        long long29 = gJChronology21.gregorianToJulianByYear(10000L);
        org.joda.time.DateTimeField dateTimeField30 = gJChronology21.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology21.dayOfWeek();
        java.lang.String str32 = gJChronology21.toString();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology21.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology21.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology21.era();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology21.secondOfMinute();
        org.joda.time.Instant instant37 = gJChronology21.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology38 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19, (org.joda.time.ReadableInstant) instant37);
        org.joda.time.chrono.GJChronology gJChronology39 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField40 = gJChronology39.minuteOfHour();
        int int41 = gJChronology39.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology39.weekyear();
        org.joda.time.Chronology chronology43 = gJChronology39.withUTC();
        long long45 = gJChronology39.gregorianToJulianByWeekyear((-1209599996L));
        org.joda.time.DateTimeField dateTimeField46 = gJChronology39.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        long long50 = gJChronology39.add(readablePeriod47, 1209600001L, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField51 = gJChronology39.secondOfDay();
        org.joda.time.chrono.GJChronology gJChronology52 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField53 = gJChronology52.minuteOfHour();
        int int54 = gJChronology52.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField55 = gJChronology52.halfdays();
        boolean boolean57 = gJChronology52.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField58 = gJChronology52.weekyears();
        org.joda.time.DateTimeField dateTimeField59 = gJChronology52.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField60 = gJChronology52.dayOfWeek();
        boolean boolean61 = gJChronology39.equals((java.lang.Object) dateTimeField60);
        org.joda.time.DurationField durationField62 = gJChronology39.months();
        org.joda.time.DurationField durationField63 = gJChronology39.hours();
        org.joda.time.Instant instant64 = gJChronology39.getGregorianCutover();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology66 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19, (org.joda.time.ReadableInstant) instant64, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 447L + "'", long9 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 31L + "'", long14 == 31L);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3369610000L + "'", long18 == 3369610000L);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(gJChronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1123210000L + "'", long29 == 1123210000L);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "GJChronology[Asia/Bangkok]" + "'", str32, "GJChronology[Asia/Bangkok]");
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(instant37);
        org.junit.Assert.assertNotNull(gJChronology38);
        org.junit.Assert.assertNotNull(gJChronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 4L + "'", long45 == 4L);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1209600001L + "'", long50 == 1209600001L);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(gJChronology52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 4 + "'", int54 == 4);
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(durationField62);
        org.junit.Assert.assertNotNull(durationField63);
        org.junit.Assert.assertNotNull(instant64);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
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
        org.joda.time.DateTimeField dateTimeField18 = gJChronology0.year();
        java.lang.String str19 = gJChronology0.toString();
        org.joda.time.DurationField durationField20 = gJChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone23 = gJChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 447L + "'", long9 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3652000L + "'", long16 == 3652000L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GJChronology[UTC]" + "'", str17, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "GJChronology[UTC]" + "'", str19, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfMonth();
        long long9 = gJChronology0.add(447L, (long) 0, (int) 'a');
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.year();
        org.joda.time.DurationField durationField11 = gJChronology0.days();
        org.joda.time.DurationField durationField12 = gJChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology0.hourOfHalfday();
        org.joda.time.Chronology chronology14 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 447L + "'", long9 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology1.secondOfMinute();
        java.lang.String str6 = gJChronology1.toString();
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GJChronology[Asia/Bangkok]" + "'", str6, "GJChronology[Asia/Bangkok]");
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone1 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.minuteOfHour();
        int int4 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        long long11 = gJChronology2.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.centuryOfEra();
        org.joda.time.Instant instant14 = gJChronology2.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (org.joda.time.ReadableInstant) instant14);
        org.joda.time.DurationField durationField16 = gJChronology15.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology15.year();
        org.joda.time.DurationField durationField18 = gJChronology15.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology15.era();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(gJChronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.centuryOfEra();
        org.joda.time.DurationField durationField8 = gJChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.minuteOfHour();
        int int10 = gJChronology8.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField11 = gJChronology8.halfdays();
        boolean boolean13 = gJChronology8.equals((java.lang.Object) 100);
        org.joda.time.Instant instant14 = gJChronology8.getGregorianCutover();
        org.joda.time.DurationField durationField15 = gJChronology8.hours();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology8.weekyear();
        org.joda.time.DurationField durationField17 = gJChronology8.months();
        org.joda.time.Instant instant18 = gJChronology8.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant18);
        org.joda.time.DurationField durationField20 = gJChronology19.halfdays();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology19.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology19.hourOfHalfday();
        long long24 = gJChronology19.gregorianToJulianByWeekyear((-61827749938999L));
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-61828354738999L) + "'", long24 == (-61828354738999L));
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.dayOfYear();
        int int4 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology5.minuteOfHour();
        org.joda.time.Instant instant7 = gJChronology5.getGregorianCutover();
        org.joda.time.Instant instant8 = gJChronology5.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant8, 4);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology10.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology10.minuteOfHour();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.weekOfWeekyear();
        long long7 = gJChronology0.gregorianToJulianByYear(447L);
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
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology24.minuteOfHour();
        org.joda.time.Instant instant26 = gJChronology24.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.Chronology chronology28 = gJChronology24.withZone(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = gJChronology24.secondOfDay();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology24.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone31 = gJChronology24.getZone();
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology32.minuteOfHour();
        int int34 = gJChronology32.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology32.secondOfDay();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology32.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology32.dayOfYear();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology32.secondOfDay();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology32.monthOfYear();
        org.joda.time.Instant instant40 = gJChronology32.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology41 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31, (org.joda.time.ReadableInstant) instant40);
        org.joda.time.chrono.GJChronology gJChronology42 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31);
        org.joda.time.chrono.GJChronology gJChronology43 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField44 = gJChronology43.minuteOfHour();
        int int45 = gJChronology43.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField46 = gJChronology43.halfdays();
        boolean boolean48 = gJChronology43.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField49 = gJChronology43.months();
        org.joda.time.Instant instant50 = gJChronology43.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology52 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31, (org.joda.time.ReadableInstant) instant50, 1);
        org.joda.time.chrono.GJChronology gJChronology54 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, (org.joda.time.ReadableInstant) instant50, (int) (short) 1);
        org.joda.time.chrono.GJChronology gJChronology55 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField56 = gJChronology55.minuteOfHour();
        int int57 = gJChronology55.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField58 = gJChronology55.weekyear();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.Chronology chronology60 = gJChronology55.withZone(dateTimeZone59);
        org.joda.time.DurationField durationField61 = gJChronology55.millis();
        org.joda.time.DateTimeField dateTimeField62 = gJChronology55.clockhourOfHalfday();
        org.joda.time.Instant instant63 = gJChronology55.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology64 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, (org.joda.time.ReadableInstant) instant63);
        org.joda.time.Chronology chronology65 = gJChronology0.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField66 = gJChronology0.halfdays();
        long long68 = gJChronology0.gregorianToJulianByWeekyear(0L);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1123200447L + "'", long7 == 1123200447L);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(gJChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(gJChronology23);
        org.junit.Assert.assertNotNull(gJChronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(gJChronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(instant40);
        org.junit.Assert.assertNotNull(gJChronology41);
        org.junit.Assert.assertNotNull(gJChronology42);
        org.junit.Assert.assertNotNull(gJChronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(instant50);
        org.junit.Assert.assertNotNull(gJChronology52);
        org.junit.Assert.assertNotNull(gJChronology54);
        org.junit.Assert.assertNotNull(gJChronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 4 + "'", int57 == 4);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(durationField61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(instant63);
        org.junit.Assert.assertNotNull(gJChronology64);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(durationField66);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1209600000L + "'", long68 == 1209600000L);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        long long3 = gJChronology0.gregorianToJulianByWeekyear((long) ' ');
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.minuteOfDay();
        long long6 = gJChronology0.gregorianToJulianByYear(2332800447L);
        org.joda.time.DurationField durationField7 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone9 = gJChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.weekyear();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1209600032L + "'", long3 == 1209600032L);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3456000447L + "'", long6 == 3456000447L);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.yearOfCentury();
        long long5 = gJChronology0.julianToGregorianByWeekyear((long) (-1));
        org.joda.time.Chronology chronology6 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.monthOfYear();
        org.joda.time.Instant instant9 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.weekyear();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1209600001L) + "'", long5 == (-1209600001L));
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.clockhourOfHalfday();
        long long10 = gJChronology0.add(52L, (-1123200001L), 100);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField12 = gJChronology0.millis();
        long long14 = gJChronology0.julianToGregorianByWeekyear((-3455999999L));
        org.joda.time.DateTimeField dateTimeField15 = gJChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-112320000048L) + "'", long10 == (-112320000048L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-4665599999L) + "'", long14 == (-4665599999L));
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.era();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.year();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.dayOfYear();
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.centuryOfEra();
        boolean boolean14 = gJChronology11.equals((java.lang.Object) 10L);
        long long16 = gJChronology11.gregorianToJulianByYear((long) (byte) 0);
        org.joda.time.DurationField durationField17 = gJChronology11.days();
        long long19 = gJChronology11.gregorianToJulianByYear(2246401038L);
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology20.minuteOfHour();
        int int22 = gJChronology20.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology20.weekyear();
        org.joda.time.Chronology chronology24 = gJChronology20.withUTC();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology20.yearOfEra();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology20.dayOfMonth();
        org.joda.time.DurationField durationField27 = gJChronology20.days();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology20.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology20.dayOfYear();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology20.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone31 = gJChronology20.getZone();
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31);
        org.joda.time.Chronology chronology33 = gJChronology11.withZone(dateTimeZone31);
        org.joda.time.Chronology chronology34 = gJChronology0.withZone(dateTimeZone31);
        org.joda.time.chrono.GJChronology gJChronology35 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology35.minuteOfHour();
        int int37 = gJChronology35.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology35.secondOfDay();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology35.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField40 = gJChronology35.dayOfYear();
        org.joda.time.Instant instant41 = gJChronology35.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology42 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31, (org.joda.time.ReadableInstant) instant41);
        org.joda.time.DurationField durationField43 = gJChronology42.months();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1123200000L + "'", long16 == 1123200000L);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3369601038L + "'", long19 == 3369601038L);
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(gJChronology32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(gJChronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(instant41);
        org.junit.Assert.assertNotNull(gJChronology42);
        org.junit.Assert.assertNotNull(durationField43);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.yearOfCentury();
        long long5 = gJChronology0.julianToGregorianByWeekyear((long) (-1));
        org.joda.time.Chronology chronology6 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = gJChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.yearOfCentury();
        org.joda.time.Chronology chronology10 = gJChronology0.withUTC();
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = gJChronology0.set(readablePartial11, (-1209600001L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1209600001L) + "'", long5 == (-1209600001L));
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField3 = gJChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = gJChronology0.add(readablePeriod4, 1209600091L, (int) '#');
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1209600091L + "'", long7 == 1209600091L);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology1.dayOfYear();
        long long5 = gJChronology1.julianToGregorianByWeekyear((-1L));
        long long9 = gJChronology1.add(1123200014L, (long) ' ', (int) ' ');
        org.joda.time.DateTimeField dateTimeField10 = gJChronology1.monthOfYear();
        org.joda.time.DurationField durationField11 = gJChronology1.months();
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1209600001L) + "'", long5 == (-1209600001L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1123201038L + "'", long9 == 1123201038L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField3 = gJChronology0.hours();
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, readableInstant6);
        long long9 = gJChronology7.julianToGregorianByWeekyear(2332799999L);
        org.joda.time.DurationField durationField10 = gJChronology7.days();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1123199999L + "'", long9 == 1123199999L);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.dayOfYear();
        int int4 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.yearOfEra();
        java.lang.String str7 = gJChronology0.toString();
        java.lang.Class<?> wildcardClass8 = gJChronology0.getClass();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GJChronology[UTC]" + "'", str7, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.weekyear();
        org.joda.time.Chronology chronology4 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.yearOfEra();
        org.joda.time.DurationField durationField6 = gJChronology0.weekyears();
        org.joda.time.DurationField durationField7 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Chronology chronology8 = gJChronology0.withZone(dateTimeZone7);
        org.joda.time.Chronology chronology9 = gJChronology0.withUTC();
        org.joda.time.DurationField durationField10 = gJChronology0.years();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology0.secondOfMinute();
        org.joda.time.DurationField durationField13 = gJChronology0.millis();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.clockhourOfHalfday();
        long long10 = gJChronology0.add(52L, (-1123200001L), 100);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.weekyearOfCentury();
        long long15 = gJChronology0.add(5775068101001L, 10972800009L, 10);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-112320000048L) + "'", long10 == (-112320000048L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5884796101091L + "'", long15 == 5884796101091L);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        long long5 = gJChronology0.gregorianToJulianByYear((long) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.secondOfDay();
        long long8 = gJChronology0.gregorianToJulianByWeekyear((long) (short) 0);
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.dayOfWeek();
        org.joda.time.DurationField durationField11 = gJChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1123200000L + "'", long5 == 1123200000L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1209600000L + "'", long8 == 1209600000L);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.secondOfDay();
        org.joda.time.DurationField durationField7 = gJChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField9 = gJChronology0.months();
        org.joda.time.DurationField durationField10 = gJChronology0.halfdays();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.hourOfDay();
        long long4 = gJChronology0.julianToGregorianByWeekyear(86399999L);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1123200001L) + "'", long4 == (-1123200001L));
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.secondOfDay();
        org.joda.time.DurationField durationField7 = gJChronology0.millis();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.secondOfDay();
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology10.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology10.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology10.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology10.weekyear();
        org.joda.time.DurationField durationField15 = gJChronology10.centuries();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = gJChronology10.add(readablePeriod16, 3369610000L, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField20 = gJChronology10.halfdayOfDay();
        org.joda.time.DurationField durationField21 = gJChronology10.seconds();
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology22.minuteOfHour();
        org.joda.time.Instant instant24 = gJChronology22.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.Chronology chronology26 = gJChronology22.withZone(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField27 = gJChronology22.clockhourOfDay();
        org.joda.time.DurationField durationField28 = gJChronology22.centuries();
        org.joda.time.chrono.GJChronology gJChronology29 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology29.centuryOfEra();
        boolean boolean32 = gJChronology29.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone33 = gJChronology29.getZone();
        org.joda.time.chrono.GJChronology gJChronology34 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone33);
        org.joda.time.chrono.GJChronology gJChronology35 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology35.minuteOfHour();
        org.joda.time.Instant instant37 = gJChronology35.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology38 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone33, (org.joda.time.ReadableInstant) instant37);
        org.joda.time.Chronology chronology39 = gJChronology22.withZone(dateTimeZone33);
        org.joda.time.chrono.GJChronology gJChronology40 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology40.minuteOfHour();
        int int42 = gJChronology40.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology40.weekyear();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.Chronology chronology45 = gJChronology40.withZone(dateTimeZone44);
        org.joda.time.DurationField durationField46 = gJChronology40.millis();
        org.joda.time.DateTimeField dateTimeField47 = gJChronology40.dayOfWeek();
        org.joda.time.Instant instant48 = gJChronology40.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology49 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone33, (org.joda.time.ReadableInstant) instant48);
        org.joda.time.Chronology chronology50 = gJChronology10.withZone(dateTimeZone33);
        org.joda.time.Chronology chronology51 = gJChronology0.withZone(dateTimeZone33);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3369610000L + "'", long19 == 3369610000L);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(gJChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(gJChronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(gJChronology34);
        org.junit.Assert.assertNotNull(gJChronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(instant37);
        org.junit.Assert.assertNotNull(gJChronology38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(gJChronology40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(instant48);
        org.junit.Assert.assertNotNull(gJChronology49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(chronology51);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Chronology chronology8 = gJChronology0.withZone(dateTimeZone7);
        org.joda.time.Chronology chronology9 = gJChronology0.withUTC();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = gJChronology0.add(readablePeriod10, 2246399988L, (int) (short) 0);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2246399988L + "'", long13 == 2246399988L);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        long long9 = gJChronology0.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.dayOfWeek();
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.minuteOfHour();
        int int13 = gJChronology11.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology11.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology11.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology11.dayOfYear();
        long long20 = gJChronology11.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology11.weekyear();
        boolean boolean22 = gJChronology0.equals((java.lang.Object) gJChronology11);
        int int23 = gJChronology11.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField24 = gJChronology11.centuries();
        long long26 = gJChronology11.gregorianToJulianByYear((-2L));
        org.joda.time.chrono.GJChronology gJChronology27 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology27.minuteOfHour();
        int int29 = gJChronology27.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology27.secondOfDay();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology27.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology27.dayOfYear();
        long long36 = gJChronology27.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField37 = gJChronology27.dayOfWeek();
        org.joda.time.chrono.GJChronology gJChronology38 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology38.minuteOfHour();
        int int40 = gJChronology38.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology38.secondOfDay();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology38.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology38.dayOfYear();
        long long47 = gJChronology38.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField48 = gJChronology38.weekyear();
        boolean boolean49 = gJChronology27.equals((java.lang.Object) gJChronology38);
        org.joda.time.DateTimeZone dateTimeZone50 = gJChronology27.getZone();
        org.joda.time.Chronology chronology51 = gJChronology11.withZone(dateTimeZone50);
        org.joda.time.DurationField durationField52 = gJChronology11.centuries();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1123199998L + "'", long26 == 1123199998L);
        org.junit.Assert.assertNotNull(gJChronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(gJChronology38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(durationField52);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.era();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.hourOfDay();
        org.joda.time.DurationField durationField8 = gJChronology0.days();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.dayOfYear();
        org.joda.time.DurationField durationField10 = gJChronology0.millis();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
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
        org.joda.time.DateTimeField dateTimeField44 = gJChronology0.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        long long48 = gJChronology0.add(readablePeriod45, (-2296747903L), 0);
        org.joda.time.chrono.GJChronology gJChronology49 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField50 = gJChronology49.minuteOfHour();
        org.joda.time.Instant instant51 = gJChronology49.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.Chronology chronology53 = gJChronology49.withZone(dateTimeZone52);
        org.joda.time.DateTimeField dateTimeField54 = gJChronology49.clockhourOfDay();
        org.joda.time.DurationField durationField55 = gJChronology49.centuries();
        org.joda.time.DateTimeField dateTimeField56 = gJChronology49.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField57 = gJChronology49.era();
        org.joda.time.DateTimeField dateTimeField58 = gJChronology49.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField59 = gJChronology49.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone60 = gJChronology49.getZone();
        org.joda.time.chrono.GJChronology gJChronology61 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone60);
        org.joda.time.chrono.GJChronology gJChronology62 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField63 = gJChronology62.minuteOfHour();
        int int64 = gJChronology62.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField65 = gJChronology62.halfdays();
        org.joda.time.DurationField durationField66 = gJChronology62.centuries();
        long long68 = gJChronology62.julianToGregorianByYear(1137807999L);
        org.joda.time.Instant instant69 = gJChronology62.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology70 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone60, (org.joda.time.ReadableInstant) instant69);
        org.joda.time.Chronology chronology71 = gJChronology0.withZone(dateTimeZone60);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1123200001L) + "'", long4 == (-1123200001L));
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(gJChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(gJChronology22);
        org.junit.Assert.assertNotNull(gJChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(gJChronology26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(gJChronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(instant36);
        org.junit.Assert.assertNotNull(gJChronology37);
        org.junit.Assert.assertNotNull(gJChronology38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1209599948L) + "'", long43 == (-1209599948L));
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-2296747903L) + "'", long48 == (-2296747903L));
        org.junit.Assert.assertNotNull(gJChronology49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(instant51);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertNotNull(gJChronology61);
        org.junit.Assert.assertNotNull(gJChronology62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 4 + "'", int64 == 4);
        org.junit.Assert.assertNotNull(durationField65);
        org.junit.Assert.assertNotNull(durationField66);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 14607999L + "'", long68 == 14607999L);
        org.junit.Assert.assertNotNull(instant69);
        org.junit.Assert.assertNotNull(gJChronology70);
        org.junit.Assert.assertNotNull(chronology71);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = gJChronology0.add(readablePeriod6, 112269660001L, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 112269660001L + "'", long9 == 112269660001L);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField3 = gJChronology0.hours();
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, readableInstant6);
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.minuteOfHour();
        org.joda.time.Instant instant11 = gJChronology9.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.Chronology chronology13 = gJChronology9.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = gJChronology9.clockhourOfDay();
        org.joda.time.DurationField durationField15 = gJChronology9.centuries();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology9.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology9.era();
        boolean boolean18 = gJChronology8.equals((java.lang.Object) gJChronology9);
        org.joda.time.DateTimeField dateTimeField19 = gJChronology9.yearOfCentury();
        java.lang.Object obj20 = null;
        boolean boolean21 = gJChronology9.equals(obj20);
        org.joda.time.DateTimeField dateTimeField22 = gJChronology9.era();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = gJChronology9.gregorianToJulianByWeekyear((-62165404799998L));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
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
        org.joda.time.chrono.GJChronology gJChronology55 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField56 = gJChronology55.centuryOfEra();
        boolean boolean58 = gJChronology55.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone59 = gJChronology55.getZone();
        org.joda.time.chrono.GJChronology gJChronology60 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField61 = gJChronology60.minuteOfHour();
        int int62 = gJChronology60.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField63 = gJChronology60.halfdays();
        boolean boolean65 = gJChronology60.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField66 = gJChronology60.months();
        org.joda.time.Instant instant67 = gJChronology60.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology68 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone59, (org.joda.time.ReadableInstant) instant67);
        org.joda.time.chrono.GJChronology gJChronology69 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField70 = gJChronology69.minuteOfHour();
        int int71 = gJChronology69.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField72 = gJChronology69.secondOfDay();
        org.joda.time.DateTimeField dateTimeField73 = gJChronology69.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField74 = gJChronology69.dayOfYear();
        org.joda.time.Instant instant75 = gJChronology69.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology76 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone59, (org.joda.time.ReadableInstant) instant75);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology78 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) instant75, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1123200000L + "'", long5 == 1123200000L);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(gJChronology12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(gJChronology22);
        org.junit.Assert.assertNotNull(gJChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(gJChronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(instant39);
        org.junit.Assert.assertNotNull(gJChronology40);
        org.junit.Assert.assertNotNull(gJChronology41);
        org.junit.Assert.assertNotNull(gJChronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 4 + "'", int44 == 4);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(instant49);
        org.junit.Assert.assertNotNull(gJChronology51);
        org.junit.Assert.assertNotNull(gJChronology53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(gJChronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertNotNull(gJChronology60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 4 + "'", int62 == 4);
        org.junit.Assert.assertNotNull(durationField63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(durationField66);
        org.junit.Assert.assertNotNull(instant67);
        org.junit.Assert.assertNotNull(gJChronology68);
        org.junit.Assert.assertNotNull(gJChronology69);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 4 + "'", int71 == 4);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertNotNull(dateTimeField73);
        org.junit.Assert.assertNotNull(dateTimeField74);
        org.junit.Assert.assertNotNull(instant75);
        org.junit.Assert.assertNotNull(gJChronology76);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField3 = gJChronology0.hours();
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.DurationField durationField6 = gJChronology5.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology5.clockhourOfDay();
        long long9 = gJChronology5.gregorianToJulianByWeekyear((-62111232000000L));
        org.joda.time.DurationField durationField10 = gJChronology5.months();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-62111232000000L) + "'", long9 == (-62111232000000L));
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.era();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Chronology chronology8 = gJChronology0.withZone(dateTimeZone7);
        java.lang.Object obj9 = null;
        boolean boolean10 = gJChronology0.equals(obj9);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.clockhourOfHalfday();
        long long15 = gJChronology0.add(238550438558L, (-2332799999L), 0);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 238550438558L + "'", long15 == 238550438558L);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
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
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.centuryOfEra();
        boolean boolean17 = gJChronology14.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone18 = gJChronology14.getZone();
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18);
        org.joda.time.Chronology chronology20 = gJChronology0.withZone(dateTimeZone18);
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField22 = gJChronology21.seconds();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology21.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology21.yearOfCentury();
        long long26 = gJChronology21.julianToGregorianByWeekyear((long) (-1));
        org.joda.time.Chronology chronology27 = gJChronology21.withUTC();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology21.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology21.monthOfYear();
        boolean boolean30 = gJChronology0.equals((java.lang.Object) gJChronology21);
        org.joda.time.ReadablePartial readablePartial31 = null;
        int[] intArray35 = new int[] { (byte) 10, (short) 0, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            gJChronology21.validate(readablePartial31, intArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(gJChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1209600001L) + "'", long26 == (-1209600001L));
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 10, 0, 1 });
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        long long9 = gJChronology0.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.era();
        long long13 = gJChronology0.julianToGregorianByWeekyear(1209600000L);
        org.joda.time.DurationField durationField14 = gJChronology0.weekyears();
        org.joda.time.DurationField durationField15 = gJChronology0.days();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        long long3 = gJChronology0.julianToGregorianByYear((-1209599900L));
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.era();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology5.minuteOfHour();
        java.lang.String str7 = gJChronology5.toString();
        org.joda.time.DurationField durationField8 = gJChronology5.centuries();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology5.year();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = gJChronology5.add(readablePeriod10, 2332800002L, (int) (short) 10);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.minuteOfHour();
        org.joda.time.Instant instant16 = gJChronology14.getGregorianCutover();
        org.joda.time.Instant instant17 = gJChronology14.getGregorianCutover();
        long long19 = gJChronology14.gregorianToJulianByYear(14L);
        long long25 = gJChronology14.getDateTimeMillis(1137807999L, 1, (int) '#', (int) ' ', 1);
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology26.minuteOfHour();
        int int28 = gJChronology26.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology26.secondOfDay();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology26.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology26.dayOfYear();
        long long35 = gJChronology26.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField36 = gJChronology26.dayOfWeek();
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology37.minuteOfHour();
        int int39 = gJChronology37.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField40 = gJChronology37.secondOfDay();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology37.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology37.dayOfYear();
        long long46 = gJChronology37.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField47 = gJChronology37.weekyear();
        boolean boolean48 = gJChronology26.equals((java.lang.Object) gJChronology37);
        org.joda.time.DateTimeZone dateTimeZone49 = gJChronology26.getZone();
        org.joda.time.chrono.GJChronology gJChronology50 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone49);
        org.joda.time.Chronology chronology51 = gJChronology14.withZone(dateTimeZone49);
        org.joda.time.Chronology chronology52 = gJChronology5.withZone(dateTimeZone49);
        org.joda.time.Chronology chronology53 = gJChronology0.withZone(dateTimeZone49);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-2332799900L) + "'", long3 == (-2332799900L));
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GJChronology[UTC]" + "'", str7, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2332800002L + "'", long13 == 2332800002L);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1123200014L + "'", long19 == 1123200014L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1128932001L + "'", long25 == 1128932001L);
        org.junit.Assert.assertNotNull(gJChronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(gJChronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(gJChronology50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(chronology53);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        long long5 = gJChronology1.add((long) 'a', (long) 10, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology7.era();
        boolean boolean9 = gJChronology1.equals((java.lang.Object) gJChronology7);
        org.joda.time.DurationField durationField10 = gJChronology7.hours();
        org.joda.time.DurationField durationField11 = gJChronology7.centuries();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField13 = gJChronology7.minutes();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.minuteOfHour();
        int int16 = gJChronology14.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology14.secondOfDay();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology14.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology14.dayOfYear();
        long long23 = gJChronology14.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField24 = gJChronology14.dayOfWeek();
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology25.minuteOfHour();
        int int27 = gJChronology25.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology25.secondOfDay();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology25.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology25.dayOfYear();
        long long34 = gJChronology25.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField35 = gJChronology25.weekyear();
        boolean boolean36 = gJChronology14.equals((java.lang.Object) gJChronology25);
        int int37 = gJChronology25.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology25.era();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology25.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField40 = gJChronology25.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone41 = gJChronology25.getZone();
        org.joda.time.chrono.GJChronology gJChronology42 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone41);
        org.joda.time.Chronology chronology43 = gJChronology7.withZone(dateTimeZone41);
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 447L + "'", long5 == 447L);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(gJChronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(gJChronology42);
        org.junit.Assert.assertNotNull(chronology43);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
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
        org.joda.time.DateTimeField dateTimeField14 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 447L + "'", long9 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
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
        org.joda.time.DateTimeField dateTimeField16 = gJChronology0.secondOfDay();
        org.joda.time.DurationField durationField17 = gJChronology0.days();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.dayOfYear();
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField5 = gJChronology4.seconds();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology4.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = gJChronology4.days();
        boolean boolean8 = gJChronology0.equals((java.lang.Object) gJChronology4);
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.yearOfEra();
        org.joda.time.DurationField durationField10 = gJChronology0.days();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = gJChronology0.get(readablePeriod12, (-2246399999L), (-3369599996L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.weekOfWeekyear();
        long long7 = gJChronology0.gregorianToJulianByYear(447L);
        org.joda.time.DurationField durationField8 = gJChronology0.halfdays();
        long long10 = gJChronology0.gregorianToJulianByYear(70001L);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1123200447L + "'", long7 == 1123200447L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1123270001L + "'", long10 == 1123270001L);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        long long3 = gJChronology0.gregorianToJulianByWeekyear((long) ' ');
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.millisOfDay();
        org.joda.time.Instant instant5 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField6 = gJChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.centuryOfEra();
        boolean boolean12 = gJChronology9.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone13 = gJChronology9.getZone();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13);
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology15.minuteOfHour();
        int int17 = gJChronology15.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField18 = gJChronology15.halfdays();
        boolean boolean20 = gJChronology15.equals((java.lang.Object) 100);
        org.joda.time.Instant instant21 = gJChronology15.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13, (org.joda.time.ReadableInstant) instant21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, (org.joda.time.ReadableInstant) instant21, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1209600032L + "'", long3 == 1209600032L);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(gJChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(gJChronology22);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.yearOfCentury();
        long long5 = gJChronology0.julianToGregorianByWeekyear((long) (-1));
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.era();
        org.joda.time.DurationField durationField7 = gJChronology0.years();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1209600001L) + "'", long5 == (-1209600001L));
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        long long9 = gJChronology0.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.centuryOfEra();
        org.joda.time.Instant instant12 = gJChronology0.getGregorianCutover();
        int int13 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology0.year();
        org.joda.time.DurationField durationField16 = gJChronology0.centuries();
        org.joda.time.DurationField durationField17 = gJChronology0.weeks();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        long long3 = gJChronology0.gregorianToJulianByWeekyear((long) ' ');
        org.joda.time.DurationField durationField4 = gJChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.minuteOfHour();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = gJChronology0.get(readablePartial8, (-5961599999L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1209600032L + "'", long3 == 1209600032L);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        java.lang.String str2 = gJChronology0.toString();
        org.joda.time.DurationField durationField3 = gJChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology0.add(readablePeriod5, 2332800002L, (int) (short) 10);
        long long10 = gJChronology0.gregorianToJulianByYear(1209600100L);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.year();
        java.lang.Class<?> wildcardClass12 = dateTimeField11.getClass();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GJChronology[UTC]" + "'", str2, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2332800002L + "'", long8 == 2332800002L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2332800100L + "'", long10 == 2332800100L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.DurationField durationField3 = gJChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology1.year();
        org.joda.time.DurationField durationField6 = gJChronology1.millis();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology1.hourOfDay();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = gJChronology1.get(readablePartial8, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6);
        org.joda.time.DurationField durationField8 = gJChronology7.years();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology7.monthOfYear();
        long long13 = gJChronology7.add((-1L), (long) (short) 1, (int) (short) -1);
        boolean boolean14 = gJChronology0.equals((java.lang.Object) long13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = gJChronology0.add(readablePeriod15, 2246401038L, 100);
        org.joda.time.Chronology chronology19 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-2L) + "'", long13 == (-2L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2246401038L + "'", long18 == 2246401038L);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.minuteOfHour();
        org.joda.time.Instant instant3 = gJChronology1.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) instant3);
        int int5 = gJChronology4.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField6 = gJChronology4.hours();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology4.minuteOfHour();
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.centuryOfEra();
        boolean boolean11 = gJChronology8.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology8.getZone();
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField15 = gJChronology14.days();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology14.getZone();
        org.joda.time.Chronology chronology18 = gJChronology4.withZone(dateTimeZone17);
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17);
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17);
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(gJChronology20);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = gJChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.millisOfDay();
        long long8 = gJChronology0.add(10000L, 2419200097L, (int) (short) 0);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10000L + "'", long8 == 10000L);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.minuteOfHour();
        int int10 = gJChronology8.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField11 = gJChronology8.halfdays();
        boolean boolean13 = gJChronology8.equals((java.lang.Object) 100);
        org.joda.time.Instant instant14 = gJChronology8.getGregorianCutover();
        org.joda.time.DurationField durationField15 = gJChronology8.hours();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology8.weekyear();
        org.joda.time.DurationField durationField17 = gJChronology8.months();
        org.joda.time.Instant instant18 = gJChronology8.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant18);
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (-9L), 4);
        org.joda.time.DateTimeField dateTimeField23 = gJChronology22.dayOfWeek();
        org.joda.time.DurationField durationField24 = gJChronology22.weekyears();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology22.dayOfMonth();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(gJChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.secondOfDay();
        org.joda.time.DurationField durationField7 = gJChronology0.weekyears();
        org.joda.time.DurationField durationField8 = gJChronology0.seconds();
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.centuryOfEra();
        long long12 = gJChronology9.gregorianToJulianByWeekyear((long) ' ');
        org.joda.time.DurationField durationField13 = gJChronology9.seconds();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology9.weekyear();
        boolean boolean15 = gJChronology0.equals((java.lang.Object) gJChronology9);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = gJChronology0.getDateTimeMillis((int) '#', (int) '4', (-1), (int) 'a', (int) ' ', 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1209600032L + "'", long12 == 1209600032L);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
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
        org.joda.time.DateTimeField dateTimeField18 = gJChronology0.year();
        java.lang.String str19 = gJChronology0.toString();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 447L + "'", long9 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3652000L + "'", long16 == 3652000L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GJChronology[UTC]" + "'", str17, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "GJChronology[UTC]" + "'", str19, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        boolean boolean4 = gJChronology0.equals((java.lang.Object) 100.0d);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.year();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.centuryOfEra();
        org.joda.time.Chronology chronology7 = gJChronology0.withUTC();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
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
        org.joda.time.DurationField durationField18 = gJChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology0.era();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 447L + "'", long9 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3652000L + "'", long16 == 3652000L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GJChronology[UTC]" + "'", str17, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.secondOfDay();
        org.joda.time.DurationField durationField5 = gJChronology0.centuries();
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology6.minuteOfHour();
        org.joda.time.Instant instant8 = gJChronology6.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Chronology chronology10 = gJChronology6.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology6.dayOfMonth();
        long long15 = gJChronology6.add(447L, (long) 0, (int) 'a');
        org.joda.time.DateTimeField dateTimeField16 = gJChronology6.clockhourOfHalfday();
        int int17 = gJChronology6.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology6.weekOfWeekyear();
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone20 = gJChronology19.getZone();
        long long22 = gJChronology19.gregorianToJulianByYear(1123200032L);
        boolean boolean23 = gJChronology6.equals((java.lang.Object) gJChronology19);
        org.joda.time.Chronology chronology24 = gJChronology19.withUTC();
        boolean boolean25 = gJChronology0.equals((java.lang.Object) gJChronology19);
        org.joda.time.DateTimeZone dateTimeZone26 = gJChronology19.getZone();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(gJChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 447L + "'", long15 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2246400032L + "'", long22 == 2246400032L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(dateTimeZone26);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.halfdayOfDay();
        long long3 = gJChronology0.julianToGregorianByYear((-9L));
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.yearOfCentury();
        long long7 = gJChronology0.julianToGregorianByWeekyear(1123200091L);
        org.joda.time.chrono.AssembledChronology.Fields fields8 = null;
        // The following exception was thrown during execution in test generation
        try {
            gJChronology0.assemble(fields8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1123200009L) + "'", long3 == (-1123200009L));
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-86399909L) + "'", long7 == (-86399909L));
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
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
        org.joda.time.DateTimeField dateTimeField65 = gJChronology64.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField66 = gJChronology64.millisOfSecond();
        org.joda.time.DurationField durationField67 = gJChronology64.years();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(gJChronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(instant36);
        org.junit.Assert.assertNotNull(gJChronology37);
        org.junit.Assert.assertNotNull(gJChronology38);
        org.junit.Assert.assertNotNull(gJChronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(instant46);
        org.junit.Assert.assertNotNull(gJChronology48);
        org.junit.Assert.assertNotNull(gJChronology50);
        org.junit.Assert.assertNotNull(gJChronology51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 4 + "'", int53 == 4);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(instant59);
        org.junit.Assert.assertNotNull(gJChronology60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(gJChronology64);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertNotNull(durationField67);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
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
        org.joda.time.DateTimeField dateTimeField17 = gJChronology16.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology16.year();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology16.hourOfHalfday();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(gJChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(gJChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(gJChronology15);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.monthOfYear();
        long long7 = gJChronology0.julianToGregorianByWeekyear((long) 'a');
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.dayOfMonth();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = gJChronology0.get(readablePartial9, 1036800010L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1209599903L) + "'", long7 == (-1209599903L));
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        long long6 = gJChronology1.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DurationField durationField7 = gJChronology1.weekyears();
        org.joda.time.DurationField durationField8 = gJChronology1.weekyears();
        long long12 = gJChronology1.add(1112300631997L, (-871429364798L), (int) (short) -1);
        long long16 = gJChronology1.add((-234489584800L), (-1194992001L), (int) ' ');
        org.joda.time.DateTimeField dateTimeField17 = gJChronology1.weekyear();
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1983729996795L + "'", long12 == 1983729996795L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-272729328832L) + "'", long16 == (-272729328832L));
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfMonth();
        long long9 = gJChronology0.add(447L, (long) 0, (int) 'a');
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.clockhourOfHalfday();
        int int11 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology0.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = gJChronology0.get(readablePeriod14, 2784399999L, 12873620281L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 447L + "'", long9 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.weekOfWeekyear();
        long long9 = gJChronology0.add((long) 1, (-1L), (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology10.minuteOfHour();
        int int12 = gJChronology10.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology10.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology10.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology10.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology10.secondOfDay();
        org.joda.time.DurationField durationField17 = gJChronology10.weeks();
        org.joda.time.DurationField durationField18 = gJChronology10.centuries();
        boolean boolean19 = gJChronology0.equals((java.lang.Object) durationField18);
        org.joda.time.DateTimeField dateTimeField20 = gJChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-9L) + "'", long9 == (-9L));
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.Instant instant3 = gJChronology0.getGregorianCutover();
        long long5 = gJChronology0.gregorianToJulianByYear(14L);
        long long11 = gJChronology0.getDateTimeMillis(1137807999L, 1, (int) '#', (int) ' ', 1);
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology12.minuteOfHour();
        int int14 = gJChronology12.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology12.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology12.dayOfYear();
        long long21 = gJChronology12.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField22 = gJChronology12.dayOfWeek();
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology23.minuteOfHour();
        int int25 = gJChronology23.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology23.secondOfDay();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology23.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology23.dayOfYear();
        long long32 = gJChronology23.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField33 = gJChronology23.weekyear();
        boolean boolean34 = gJChronology12.equals((java.lang.Object) gJChronology23);
        org.joda.time.DateTimeZone dateTimeZone35 = gJChronology12.getZone();
        org.joda.time.chrono.GJChronology gJChronology36 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone35);
        org.joda.time.Chronology chronology37 = gJChronology0.withZone(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField38 = gJChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1123200014L + "'", long5 == 1123200014L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1128932001L + "'", long11 == 1128932001L);
        org.junit.Assert.assertNotNull(gJChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(gJChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(gJChronology36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        long long9 = gJChronology0.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.era();
        long long13 = gJChronology0.julianToGregorianByWeekyear(1209600000L);
        long long15 = gJChronology0.gregorianToJulianByYear((long) (byte) -1);
        org.joda.time.DateTimeField dateTimeField16 = gJChronology0.yearOfEra();
        org.joda.time.DurationField durationField17 = gJChronology0.weeks();
        org.joda.time.Chronology chronology18 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology0.year();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1123199999L + "'", long15 == 1123199999L);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
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
        org.joda.time.DurationField durationField11 = gJChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField13 = gJChronology0.minutes();
        long long15 = gJChronology0.gregorianToJulianByYear((-1198736000L));
        org.joda.time.DateTimeZone dateTimeZone16 = gJChronology0.getZone();
        int int17 = gJChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-75536000L) + "'", long15 == (-75536000L));
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone1 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.weekyearOfCentury();
        long long9 = gJChronology2.getDateTimeMillis(14L, (int) (short) 10, (int) (short) 0, (int) '4', (int) 'a');
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.year();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.weekyear();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 36052097L + "'", long9 == 36052097L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfMonth();
        long long9 = gJChronology0.add(447L, (long) 0, (int) 'a');
        org.joda.time.DurationField durationField10 = gJChronology0.days();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.minuteOfDay();
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology12.minuteOfHour();
        org.joda.time.Instant instant14 = gJChronology12.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.Chronology chronology16 = gJChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = gJChronology12.secondOfDay();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology12.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = gJChronology12.getZone();
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology20.minuteOfHour();
        int int22 = gJChronology20.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology20.secondOfDay();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology20.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology20.dayOfYear();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology20.secondOfDay();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology20.monthOfYear();
        org.joda.time.Instant instant28 = gJChronology20.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology29 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19, (org.joda.time.ReadableInstant) instant28);
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19);
        org.joda.time.Chronology chronology31 = gJChronology0.withZone(dateTimeZone19);
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology32.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology32.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology32.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone36 = gJChronology32.getZone();
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology37.minuteOfHour();
        org.joda.time.Instant instant39 = gJChronology37.getGregorianCutover();
        org.joda.time.Instant instant40 = gJChronology37.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology42 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone36, (org.joda.time.ReadableInstant) instant40, 4);
        org.joda.time.chrono.GJChronology gJChronology43 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19, (org.joda.time.ReadableInstant) instant40);
        org.joda.time.DateTimeField dateTimeField44 = gJChronology43.era();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 447L + "'", long9 == 447L);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(gJChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertNotNull(gJChronology29);
        org.junit.Assert.assertNotNull(gJChronology30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(gJChronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(gJChronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(instant39);
        org.junit.Assert.assertNotNull(instant40);
        org.junit.Assert.assertNotNull(gJChronology42);
        org.junit.Assert.assertNotNull(gJChronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField3 = gJChronology0.hours();
        org.joda.time.DurationField durationField4 = gJChronology0.minutes();
        org.joda.time.DurationField durationField5 = gJChronology0.millis();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.yearOfCentury();
        long long5 = gJChronology0.julianToGregorianByWeekyear((long) (-1));
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.weekOfWeekyear();
        org.joda.time.Chronology chronology7 = gJChronology0.withUTC();
        org.joda.time.DurationField durationField8 = gJChronology0.days();
        long long10 = gJChronology0.julianToGregorianByYear(12873620281L);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1209600001L) + "'", long5 == (-1209600001L));
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11750420281L + "'", long10 == 11750420281L);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
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
        org.joda.time.DurationField durationField19 = gJChronology0.months();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(gJChronology12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
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
        org.joda.time.DateTimeField dateTimeField14 = gJChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField15 = gJChronology0.minutes();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = gJChronology0.add(readablePeriod16, 1209601052L, 10);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 447L + "'", long9 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1209601052L + "'", long19 == 1209601052L);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
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
        org.joda.time.DateTimeField dateTimeField23 = gJChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.monthOfYear();
        int int7 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = gJChronology0.add(readablePeriod8, (long) 1, 1);
        org.joda.time.DurationField durationField12 = gJChronology0.years();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology0.weekyear();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.DurationField durationField7 = gJChronology6.days();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology6.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9);
        org.joda.time.DurationField durationField11 = gJChronology10.years();
        org.joda.time.DurationField durationField12 = gJChronology10.minutes();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology10.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology10.getZone();
        org.joda.time.Chronology chronology15 = gJChronology6.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = gJChronology6.dayOfYear();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(gJChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
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
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.year();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology0.centuryOfEra();
        org.joda.time.DurationField durationField14 = gJChronology0.days();
        org.joda.time.DurationField durationField15 = gJChronology0.days();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        long long5 = gJChronology0.gregorianToJulianByYear((long) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.secondOfDay();
        long long8 = gJChronology0.gregorianToJulianByWeekyear((long) (short) 0);
        long long10 = gJChronology0.julianToGregorianByWeekyear((-1123199996L));
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField12 = gJChronology0.millis();
        org.joda.time.DurationField durationField13 = gJChronology0.weekyears();
        org.joda.time.DurationField durationField14 = gJChronology0.months();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1123200000L + "'", long5 == 1123200000L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1209600000L + "'", long8 == 1209600000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2332799996L) + "'", long10 == (-2332799996L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.weekyear();
        org.joda.time.Chronology chronology4 = gJChronology0.withUTC();
        long long6 = gJChronology0.gregorianToJulianByWeekyear((-1209599996L));
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.weekOfWeekyear();
        java.lang.String str8 = gJChronology0.toString();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.year();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4L + "'", long6 == 4L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[UTC]" + "'", str8, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology0.getZone();
        org.joda.time.DurationField durationField8 = gJChronology0.years();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfMonth();
        long long9 = gJChronology0.add(447L, (long) 0, (int) 'a');
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.year();
        long long14 = gJChronology0.add((long) ' ', (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology0.secondOfMinute();
        long long18 = gJChronology0.gregorianToJulianByYear(2246410000L);
        org.joda.time.DateTimeZone dateTimeZone19 = gJChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 447L + "'", long9 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 31L + "'", long14 == 31L);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3369610000L + "'", long18 == 3369610000L);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
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
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology13.millisOfSecond();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology18.minuteOfHour();
        int int20 = gJChronology18.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField21 = gJChronology18.halfdays();
        boolean boolean23 = gJChronology18.equals((java.lang.Object) 100);
        org.joda.time.Instant instant24 = gJChronology18.getGregorianCutover();
        org.joda.time.DurationField durationField25 = gJChronology18.hours();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology18.weekyear();
        org.joda.time.DurationField durationField27 = gJChronology18.months();
        org.joda.time.Instant instant28 = gJChronology18.getGregorianCutover();
        org.joda.time.DurationField durationField29 = gJChronology18.minutes();
        boolean boolean30 = gJChronology13.equals((java.lang.Object) durationField29);
        long long35 = gJChronology13.getDateTimeMillis((int) (byte) -1, (int) (short) 10, 10, 100);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(gJChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1209599900L) + "'", long15 == (-1209599900L));
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-62142940799900L) + "'", long35 == (-62142940799900L));
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.minuteOfHour();
        int int10 = gJChronology8.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField11 = gJChronology8.halfdays();
        boolean boolean13 = gJChronology8.equals((java.lang.Object) 100);
        org.joda.time.Instant instant14 = gJChronology8.getGregorianCutover();
        org.joda.time.DurationField durationField15 = gJChronology8.hours();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology8.weekyear();
        org.joda.time.DurationField durationField17 = gJChronology8.months();
        org.joda.time.Instant instant18 = gJChronology8.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant18);
        org.joda.time.DateTimeField dateTimeField20 = gJChronology19.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology19.weekyear();
        org.joda.time.chrono.AssembledChronology.Fields fields22 = null;
        // The following exception was thrown during execution in test generation
        try {
            gJChronology19.assemble(fields22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology7.minuteOfHour();
        org.joda.time.Instant instant9 = gJChronology7.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant9);
        int int11 = gJChronology10.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField12 = gJChronology10.hours();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology10.minuteOfHour();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.centuryOfEra();
        boolean boolean17 = gJChronology14.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone18 = gJChronology14.getZone();
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18);
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18);
        org.joda.time.DurationField durationField21 = gJChronology20.days();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology20.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone23 = gJChronology20.getZone();
        org.joda.time.Chronology chronology24 = gJChronology10.withZone(dateTimeZone23);
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23);
        org.joda.time.Chronology chronology26 = gJChronology0.withZone(dateTimeZone23);
        org.joda.time.chrono.GJChronology gJChronology27 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(gJChronology25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(gJChronology27);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        long long6 = gJChronology4.gregorianToJulianByYear(111110400004L);
        org.joda.time.DateTimeField dateTimeField7 = gJChronology4.clockhourOfDay();
        java.lang.String str8 = gJChronology4.toString();
        org.joda.time.DurationField durationField9 = gJChronology4.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology4.yearOfEra();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 112233600004L + "'", long6 == 112233600004L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[UTC]" + "'", str8, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        long long9 = gJChronology0.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.dayOfWeek();
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.minuteOfHour();
        int int13 = gJChronology11.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology11.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology11.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology11.dayOfYear();
        long long20 = gJChronology11.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology11.weekyear();
        boolean boolean22 = gJChronology0.equals((java.lang.Object) gJChronology11);
        org.joda.time.DateTimeZone dateTimeZone23 = gJChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology25.minuteOfHour();
        int int27 = gJChronology25.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField28 = gJChronology25.halfdays();
        boolean boolean30 = gJChronology25.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField31 = gJChronology25.weekyears();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology25.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology25.weekOfWeekyear();
        org.joda.time.Instant instant34 = gJChronology25.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology35 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24, (org.joda.time.ReadableInstant) instant34);
        org.joda.time.chrono.GJChronology gJChronology36 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23, (org.joda.time.ReadableInstant) instant34);
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology37.minuteOfHour();
        int int39 = gJChronology37.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField40 = gJChronology37.secondOfDay();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology37.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology37.dayOfYear();
        long long46 = gJChronology37.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DurationField durationField47 = gJChronology37.millis();
        org.joda.time.DateTimeField dateTimeField48 = gJChronology37.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField49 = gJChronology37.halfdayOfDay();
        long long51 = gJChronology37.julianToGregorianByWeekyear((long) (short) -1);
        org.joda.time.DateTimeField dateTimeField52 = gJChronology37.hourOfDay();
        org.joda.time.Instant instant53 = gJChronology37.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology54 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23, (org.joda.time.ReadableInstant) instant53);
        org.joda.time.chrono.GJChronology gJChronology55 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23);
        org.joda.time.chrono.GJChronology gJChronology56 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(gJChronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(instant34);
        org.junit.Assert.assertNotNull(gJChronology35);
        org.junit.Assert.assertNotNull(gJChronology36);
        org.junit.Assert.assertNotNull(gJChronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertNotNull(durationField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1209600001L) + "'", long51 == (-1209600001L));
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(instant53);
        org.junit.Assert.assertNotNull(gJChronology54);
        org.junit.Assert.assertNotNull(gJChronology55);
        org.junit.Assert.assertNotNull(gJChronology56);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        org.joda.time.DurationField durationField2 = gJChronology0.weekyears();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = gJChronology0.add(readablePeriod3, 100L, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.millisOfSecond();
        org.joda.time.Instant instant8 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.minuteOfDay();
        long long15 = gJChronology0.getDateTimeMillis(1123199908L, 1, (int) (byte) 10, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1041001032L + "'", long15 == 1041001032L);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DateTimeZone dateTimeZone2 = gJChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        long long8 = gJChronology4.add((long) 'a', (long) 10, (int) '#');
        org.joda.time.DateTimeField dateTimeField9 = gJChronology4.hourOfDay();
        org.joda.time.Chronology chronology10 = gJChronology4.withUTC();
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.centuryOfEra();
        boolean boolean14 = gJChronology11.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone15 = gJChronology11.getZone();
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15);
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15);
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology18.minuteOfHour();
        int int20 = gJChronology18.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField21 = gJChronology18.halfdays();
        boolean boolean23 = gJChronology18.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField24 = gJChronology18.months();
        org.joda.time.Instant instant25 = gJChronology18.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15, (org.joda.time.ReadableInstant) instant25);
        org.joda.time.Chronology chronology27 = gJChronology4.withZone(dateTimeZone15);
        org.joda.time.DurationField durationField28 = gJChronology4.days();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology4.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone30 = gJChronology4.getZone();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology32.minuteOfHour();
        int int34 = gJChronology32.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology32.secondOfDay();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology32.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology32.dayOfYear();
        long long41 = gJChronology32.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField42 = gJChronology32.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology32.centuryOfEra();
        org.joda.time.Instant instant44 = gJChronology32.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology45 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31, (org.joda.time.ReadableInstant) instant44);
        org.joda.time.chrono.GJChronology gJChronology46 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone30, (org.joda.time.ReadableInstant) instant44);
        org.joda.time.chrono.GJChronology gJChronology47 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone2, (org.joda.time.ReadableInstant) instant44);
        org.joda.time.DateTimeField dateTimeField48 = gJChronology47.minuteOfHour();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 447L + "'", long8 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertNotNull(gJChronology17);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(gJChronology26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(gJChronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(instant44);
        org.junit.Assert.assertNotNull(gJChronology45);
        org.junit.Assert.assertNotNull(gJChronology46);
        org.junit.Assert.assertNotNull(gJChronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        long long3 = gJChronology0.gregorianToJulianByWeekyear((long) ' ');
        org.joda.time.DurationField durationField4 = gJChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1209600032L + "'", long3 == 1209600032L);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
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
        org.joda.time.DurationField durationField22 = gJChronology21.months();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = gJChronology21.get(readablePeriod23, (-472953599612L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(gJChronology21);
        org.junit.Assert.assertNotNull(durationField22);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfMonth();
        long long9 = gJChronology0.add(447L, (long) 0, (int) 'a');
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.year();
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.centuryOfEra();
        boolean boolean14 = gJChronology11.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone15 = gJChronology11.getZone();
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15);
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology17.minuteOfHour();
        org.joda.time.Instant instant19 = gJChronology17.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15, (org.joda.time.ReadableInstant) instant19);
        org.joda.time.Chronology chronology21 = gJChronology0.withZone(dateTimeZone15);
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology22.minuteOfHour();
        org.joda.time.Instant instant24 = gJChronology22.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.Chronology chronology26 = gJChronology22.withZone(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField27 = gJChronology22.clockhourOfDay();
        org.joda.time.DurationField durationField28 = gJChronology22.centuries();
        org.joda.time.chrono.GJChronology gJChronology29 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology29.centuryOfEra();
        boolean boolean32 = gJChronology29.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone33 = gJChronology29.getZone();
        org.joda.time.chrono.GJChronology gJChronology34 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone33);
        org.joda.time.chrono.GJChronology gJChronology35 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology35.minuteOfHour();
        org.joda.time.Instant instant37 = gJChronology35.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology38 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone33, (org.joda.time.ReadableInstant) instant37);
        org.joda.time.Chronology chronology39 = gJChronology22.withZone(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.chrono.GJChronology gJChronology41 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology41.minuteOfHour();
        org.joda.time.Instant instant43 = gJChronology41.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology44 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone40, (org.joda.time.ReadableInstant) instant43);
        org.joda.time.chrono.GJChronology gJChronology46 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone33, (org.joda.time.ReadableInstant) instant43, (int) (short) 1);
        org.joda.time.chrono.GJChronology gJChronology47 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15, (org.joda.time.ReadableInstant) instant43);
        org.joda.time.chrono.GJChronology gJChronology48 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray52 = gJChronology48.get(readablePeriod49, (-1209599903L), 2419199991L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 447L + "'", long9 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertNotNull(gJChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(gJChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(gJChronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(gJChronology34);
        org.junit.Assert.assertNotNull(gJChronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(instant37);
        org.junit.Assert.assertNotNull(gJChronology38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(gJChronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(instant43);
        org.junit.Assert.assertNotNull(gJChronology44);
        org.junit.Assert.assertNotNull(gJChronology46);
        org.junit.Assert.assertNotNull(gJChronology47);
        org.junit.Assert.assertNotNull(gJChronology48);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        long long9 = gJChronology0.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.dayOfWeek();
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.minuteOfHour();
        int int13 = gJChronology11.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology11.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology11.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology11.dayOfYear();
        long long20 = gJChronology11.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology11.weekyear();
        boolean boolean22 = gJChronology0.equals((java.lang.Object) gJChronology11);
        org.joda.time.DateTimeZone dateTimeZone23 = gJChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology25.minuteOfHour();
        int int27 = gJChronology25.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField28 = gJChronology25.halfdays();
        boolean boolean30 = gJChronology25.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField31 = gJChronology25.weekyears();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology25.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology25.weekOfWeekyear();
        org.joda.time.Instant instant34 = gJChronology25.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology35 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24, (org.joda.time.ReadableInstant) instant34);
        org.joda.time.chrono.GJChronology gJChronology36 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23, (org.joda.time.ReadableInstant) instant34);
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology37.minuteOfHour();
        int int39 = gJChronology37.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField40 = gJChronology37.secondOfDay();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology37.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology37.dayOfYear();
        long long46 = gJChronology37.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DurationField durationField47 = gJChronology37.millis();
        org.joda.time.DateTimeField dateTimeField48 = gJChronology37.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField49 = gJChronology37.halfdayOfDay();
        long long51 = gJChronology37.julianToGregorianByWeekyear((long) (short) -1);
        org.joda.time.DateTimeField dateTimeField52 = gJChronology37.hourOfDay();
        org.joda.time.Instant instant53 = gJChronology37.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology54 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23, (org.joda.time.ReadableInstant) instant53);
        org.joda.time.chrono.GJChronology gJChronology55 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23);
        org.joda.time.chrono.GJChronology gJChronology56 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone57 = gJChronology56.getZone();
        org.joda.time.chrono.GJChronology gJChronology58 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone57);
        org.joda.time.chrono.GJChronology gJChronology59 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField60 = gJChronology59.centuryOfEra();
        boolean boolean62 = gJChronology59.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone63 = gJChronology59.getZone();
        org.joda.time.chrono.GJChronology gJChronology64 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone63);
        org.joda.time.chrono.GJChronology gJChronology65 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone63);
        org.joda.time.chrono.GJChronology gJChronology66 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField67 = gJChronology66.minuteOfHour();
        int int68 = gJChronology66.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField69 = gJChronology66.halfdays();
        boolean boolean71 = gJChronology66.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField72 = gJChronology66.months();
        org.joda.time.Instant instant73 = gJChronology66.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology74 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone63, (org.joda.time.ReadableInstant) instant73);
        org.joda.time.chrono.GJChronology gJChronology76 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone57, (org.joda.time.ReadableInstant) instant73, 4);
        org.joda.time.chrono.GJChronology gJChronology77 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23, (org.joda.time.ReadableInstant) instant73);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(gJChronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(instant34);
        org.junit.Assert.assertNotNull(gJChronology35);
        org.junit.Assert.assertNotNull(gJChronology36);
        org.junit.Assert.assertNotNull(gJChronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertNotNull(durationField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1209600001L) + "'", long51 == (-1209600001L));
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(instant53);
        org.junit.Assert.assertNotNull(gJChronology54);
        org.junit.Assert.assertNotNull(gJChronology55);
        org.junit.Assert.assertNotNull(gJChronology56);
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertNotNull(gJChronology58);
        org.junit.Assert.assertNotNull(gJChronology59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertNotNull(gJChronology64);
        org.junit.Assert.assertNotNull(gJChronology65);
        org.junit.Assert.assertNotNull(gJChronology66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 4 + "'", int68 == 4);
        org.junit.Assert.assertNotNull(durationField69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(durationField72);
        org.junit.Assert.assertNotNull(instant73);
        org.junit.Assert.assertNotNull(gJChronology74);
        org.junit.Assert.assertNotNull(gJChronology76);
        org.junit.Assert.assertNotNull(gJChronology77);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        long long9 = gJChronology0.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.centuryOfEra();
        org.joda.time.Instant instant12 = gJChronology0.getGregorianCutover();
        int int13 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology0.year();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology0.dayOfWeek();
        org.joda.time.DurationField durationField16 = gJChronology0.hours();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.secondOfDay();
        org.joda.time.DurationField durationField5 = gJChronology0.centuries();
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology6.minuteOfHour();
        org.joda.time.Instant instant8 = gJChronology6.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Chronology chronology10 = gJChronology6.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology6.dayOfMonth();
        long long15 = gJChronology6.add(447L, (long) 0, (int) 'a');
        org.joda.time.DateTimeField dateTimeField16 = gJChronology6.clockhourOfHalfday();
        int int17 = gJChronology6.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology6.weekOfWeekyear();
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone20 = gJChronology19.getZone();
        long long22 = gJChronology19.gregorianToJulianByYear(1123200032L);
        boolean boolean23 = gJChronology6.equals((java.lang.Object) gJChronology19);
        org.joda.time.Chronology chronology24 = gJChronology19.withUTC();
        boolean boolean25 = gJChronology0.equals((java.lang.Object) gJChronology19);
        org.joda.time.DurationField durationField26 = gJChronology19.days();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(gJChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 447L + "'", long15 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2246400032L + "'", long22 == 2246400032L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(durationField26);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        long long9 = gJChronology0.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology0.yearOfCentury();
        org.joda.time.Instant instant13 = gJChronology0.getGregorianCutover();
        org.joda.time.Instant instant14 = gJChronology0.getGregorianCutover();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(instant14);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        java.lang.String str2 = gJChronology0.toString();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.year();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField6 = gJChronology0.years();
        org.joda.time.DurationField durationField7 = gJChronology0.centuries();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GJChronology[UTC]" + "'", str2, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.weekyear();
        org.joda.time.Chronology chronology4 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.secondOfDay();
        org.joda.time.Instant instant8 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField3 = gJChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.year();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.secondOfDay();
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology6.centuryOfEra();
        boolean boolean9 = gJChronology6.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone10 = gJChronology6.getZone();
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.minuteOfHour();
        int int13 = gJChronology11.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField14 = gJChronology11.halfdays();
        boolean boolean16 = gJChronology11.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField17 = gJChronology11.months();
        org.joda.time.Instant instant18 = gJChronology11.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10, (org.joda.time.ReadableInstant) instant18);
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        org.joda.time.Chronology chronology21 = gJChronology0.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField22 = gJChronology0.weeks();
        org.joda.time.DurationField durationField23 = gJChronology0.years();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(gJChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
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
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology23.minuteOfHour();
        org.joda.time.Instant instant25 = gJChronology23.getGregorianCutover();
        org.joda.time.DurationField durationField26 = gJChronology23.hours();
        org.joda.time.DateTimeZone dateTimeZone27 = gJChronology23.getZone();
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27, readableInstant29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField33 = gJChronology32.centuryOfEra();
        long long37 = gJChronology32.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        long long41 = gJChronology32.add(readablePeriod38, 100L, 100);
        org.joda.time.Instant instant42 = gJChronology32.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology44 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27, (org.joda.time.ReadableInstant) instant42, (int) (short) 1);
        org.joda.time.chrono.GJChronology gJChronology45 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant42);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(gJChronology21);
        org.junit.Assert.assertNotNull(gJChronology22);
        org.junit.Assert.assertNotNull(gJChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(gJChronology28);
        org.junit.Assert.assertNotNull(gJChronology30);
        org.junit.Assert.assertNotNull(gJChronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 100L + "'", long41 == 100L);
        org.junit.Assert.assertNotNull(instant42);
        org.junit.Assert.assertNotNull(gJChronology44);
        org.junit.Assert.assertNotNull(gJChronology45);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = gJChronology0.withZone(dateTimeZone4);
        org.joda.time.DurationField durationField6 = gJChronology0.millis();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = gJChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.era();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = gJChronology0.add(readablePeriod10, (-2332799900L), (int) '4');
        org.joda.time.DateTimeField dateTimeField14 = gJChronology0.year();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology0.year();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology0.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = gJChronology0.get(readablePeriod17, 2246400032L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-2332799900L) + "'", long13 == (-2332799900L));
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
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
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.centuryOfEra();
        boolean boolean17 = gJChronology14.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone18 = gJChronology14.getZone();
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18);
        org.joda.time.Chronology chronology20 = gJChronology0.withZone(dateTimeZone18);
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField22 = gJChronology21.seconds();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology21.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology21.yearOfCentury();
        long long26 = gJChronology21.julianToGregorianByWeekyear((long) (-1));
        org.joda.time.Chronology chronology27 = gJChronology21.withUTC();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology21.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology21.monthOfYear();
        boolean boolean30 = gJChronology0.equals((java.lang.Object) gJChronology21);
        org.joda.time.DateTimeField dateTimeField31 = gJChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(gJChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1209600001L) + "'", long26 == (-1209600001L));
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
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
        org.joda.time.DateTimeField dateTimeField19 = gJChronology1.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = gJChronology1.getDateTimeMillis(0, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86400000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 447L + "'", long5 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1137807999L + "'", long18 == 1137807999L);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.Instant instant6 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField7 = gJChronology0.millis();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = gJChronology0.getDateTimeMillis((int) '#', (int) (byte) 1, (int) (byte) -1, 4, 1, (int) (byte) 100, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.weekyear();
        long long7 = gJChronology0.add((-58987180799968L), (-2L), (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology0.getZone();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-58987180799970L) + "'", long7 == (-58987180799970L));
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
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
        org.joda.time.DateTimeZone dateTimeZone37 = gJChronology34.getZone();
        org.joda.time.chrono.GJChronology gJChronology38 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology38.minuteOfHour();
        int int40 = gJChronology38.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField41 = gJChronology38.halfdays();
        boolean boolean43 = gJChronology38.equals((java.lang.Object) 100);
        org.joda.time.Instant instant44 = gJChronology38.getGregorianCutover();
        long long46 = gJChronology38.julianToGregorianByWeekyear((-1123200001L));
        java.lang.String str47 = gJChronology38.toString();
        org.joda.time.DateTimeField dateTimeField48 = gJChronology38.millisOfSecond();
        org.joda.time.Instant instant49 = gJChronology38.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology50 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone37, (org.joda.time.ReadableInstant) instant49);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(gJChronology22);
        org.junit.Assert.assertNotNull(gJChronology23);
        org.junit.Assert.assertNotNull(gJChronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertNotNull(gJChronology33);
        org.junit.Assert.assertNotNull(gJChronology34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "GJChronology[UTC]" + "'", str35, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(gJChronology38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(instant44);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-2332800001L) + "'", long46 == (-2332800001L));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "GJChronology[UTC]" + "'", str47, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(instant49);
        org.junit.Assert.assertNotNull(gJChronology50);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfMonth();
        long long9 = gJChronology0.add(447L, (long) 0, (int) 'a');
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.year();
        org.joda.time.DurationField durationField11 = gJChronology0.days();
        org.joda.time.DurationField durationField12 = gJChronology0.halfdays();
        org.joda.time.DurationField durationField13 = gJChronology0.millis();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology0.hourOfDay();
        org.joda.time.DurationField durationField15 = gJChronology0.months();
        java.lang.Class<?> wildcardClass16 = gJChronology0.getClass();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 447L + "'", long9 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfMonth();
        long long9 = gJChronology0.add(447L, (long) 0, (int) 'a');
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.year();
        long long14 = gJChronology0.add((long) ' ', (long) (-1), 1);
        org.joda.time.DurationField durationField15 = gJChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology0.year();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology0.dayOfYear();
        org.joda.time.DurationField durationField18 = gJChronology0.seconds();
        org.joda.time.DurationField durationField19 = gJChronology0.hours();
        long long23 = gJChronology0.add(2505600398L, 0L, (-1));
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 447L + "'", long9 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 31L + "'", long14 == 31L);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 2505600398L + "'", long23 == 2505600398L);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        boolean boolean7 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.secondOfMinute();
        org.joda.time.DurationField durationField10 = gJChronology0.centuries();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.days();
        long long3 = gJChronology0.gregorianToJulianByWeekyear(1137807999L);
        org.joda.time.DurationField durationField4 = gJChronology0.years();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.weekOfWeekyear();
        long long7 = gJChronology0.gregorianToJulianByWeekyear(1036800091L);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2347407999L + "'", long3 == 2347407999L);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2246400091L + "'", long7 == 2246400091L);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfMonth();
        long long9 = gJChronology0.add(447L, (long) 0, (int) 'a');
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.year();
        org.joda.time.DurationField durationField11 = gJChronology0.days();
        org.joda.time.DurationField durationField12 = gJChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology0.hourOfHalfday();
        org.joda.time.Chronology chronology14 = gJChronology0.withUTC();
        org.joda.time.DurationField durationField15 = gJChronology0.hours();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 447L + "'", long9 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        long long9 = gJChronology0.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DurationField durationField10 = gJChronology0.millis();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology0.minuteOfHour();
        org.joda.time.DurationField durationField13 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
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
        org.joda.time.DurationField durationField12 = gJChronology0.days();
        org.joda.time.DurationField durationField13 = gJChronology0.months();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.minuteOfHour();
        org.joda.time.Instant instant16 = gJChronology14.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.Chronology chronology18 = gJChronology14.withZone(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField19 = gJChronology14.monthOfYear();
        org.joda.time.DurationField durationField20 = gJChronology14.years();
        org.joda.time.DateTimeZone dateTimeZone21 = gJChronology14.getZone();
        org.joda.time.Chronology chronology22 = gJChronology0.withZone(dateTimeZone21);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-2332800001L) + "'", long8 == (-2332800001L));
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(chronology22);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology0.getZone();
        org.joda.time.DurationField durationField4 = gJChronology0.seconds();
        long long6 = gJChronology0.gregorianToJulianByWeekyear((-111110400048L));
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-109900800048L) + "'", long6 == (-109900800048L));
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
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
        org.joda.time.DurationField durationField10 = gJChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
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
        int int14 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField15 = gJChronology0.days();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
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
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.minuteOfDay();
        org.joda.time.DurationField durationField17 = gJChronology13.days();
        org.joda.time.DurationField durationField18 = gJChronology13.centuries();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology13.hourOfDay();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(gJChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1209599900L) + "'", long15 == (-1209599900L));
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
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
        org.joda.time.DateTimeField dateTimeField13 = gJChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology1.minuteOfDay();
        org.joda.time.DurationField durationField15 = gJChronology1.hours();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology1.secondOfDay();
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-9L) + "'", long11 == (-9L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = gJChronology0.seconds();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology7);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology7.minuteOfHour();
        org.joda.time.Instant instant9 = gJChronology7.getGregorianCutover();
        org.joda.time.DurationField durationField10 = gJChronology7.hours();
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology7.getZone();
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11);
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology13.centuryOfEra();
        boolean boolean16 = gJChronology13.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology13.getZone();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17);
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology19.minuteOfHour();
        org.joda.time.Instant instant21 = gJChronology19.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17, (org.joda.time.ReadableInstant) instant21);
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) instant21);
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone25 = gJChronology24.getZone();
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology26.minuteOfHour();
        int int28 = gJChronology26.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology26.secondOfDay();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology26.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology26.dayOfYear();
        long long35 = gJChronology26.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField36 = gJChronology26.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology26.centuryOfEra();
        org.joda.time.Instant instant38 = gJChronology26.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology39 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25, (org.joda.time.ReadableInstant) instant38);
        org.joda.time.chrono.GJChronology gJChronology40 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) instant38);
        org.joda.time.chrono.GJChronology gJChronology41 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant38);
        org.joda.time.chrono.GJChronology gJChronology42 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology42.minuteOfHour();
        org.joda.time.Instant instant44 = gJChronology42.getGregorianCutover();
        org.joda.time.DurationField durationField45 = gJChronology42.hours();
        org.joda.time.DateTimeZone dateTimeZone46 = gJChronology42.getZone();
        org.joda.time.chrono.GJChronology gJChronology47 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone46);
        org.joda.time.chrono.GJChronology gJChronology48 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField49 = gJChronology48.centuryOfEra();
        boolean boolean51 = gJChronology48.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone52 = gJChronology48.getZone();
        org.joda.time.chrono.GJChronology gJChronology53 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone52);
        org.joda.time.chrono.GJChronology gJChronology54 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField55 = gJChronology54.minuteOfHour();
        org.joda.time.Instant instant56 = gJChronology54.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology57 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone52, (org.joda.time.ReadableInstant) instant56);
        org.joda.time.chrono.GJChronology gJChronology58 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone46, (org.joda.time.ReadableInstant) instant56);
        org.joda.time.chrono.GJChronology gJChronology59 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone60 = gJChronology59.getZone();
        org.joda.time.chrono.GJChronology gJChronology61 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField62 = gJChronology61.minuteOfHour();
        int int63 = gJChronology61.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField64 = gJChronology61.secondOfDay();
        org.joda.time.DateTimeField dateTimeField65 = gJChronology61.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField66 = gJChronology61.dayOfYear();
        long long70 = gJChronology61.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField71 = gJChronology61.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField72 = gJChronology61.centuryOfEra();
        org.joda.time.Instant instant73 = gJChronology61.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology74 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone60, (org.joda.time.ReadableInstant) instant73);
        org.joda.time.chrono.GJChronology gJChronology75 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone46, (org.joda.time.ReadableInstant) instant73);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology77 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant73, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(gJChronology6);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(gJChronology12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(gJChronology22);
        org.junit.Assert.assertNotNull(gJChronology23);
        org.junit.Assert.assertNotNull(gJChronology24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(gJChronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertNotNull(gJChronology39);
        org.junit.Assert.assertNotNull(gJChronology40);
        org.junit.Assert.assertNotNull(gJChronology41);
        org.junit.Assert.assertNotNull(gJChronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(instant44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(gJChronology47);
        org.junit.Assert.assertNotNull(gJChronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(gJChronology53);
        org.junit.Assert.assertNotNull(gJChronology54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(instant56);
        org.junit.Assert.assertNotNull(gJChronology57);
        org.junit.Assert.assertNotNull(gJChronology58);
        org.junit.Assert.assertNotNull(gJChronology59);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertNotNull(gJChronology61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 4 + "'", int63 == 4);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + (-1L) + "'", long70 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertNotNull(instant73);
        org.junit.Assert.assertNotNull(gJChronology74);
        org.junit.Assert.assertNotNull(gJChronology75);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.era();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.yearOfEra();
        org.joda.time.DurationField durationField9 = gJChronology0.days();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = gJChronology0.get(readablePeriod10, (-86399968L), (-61827749938999L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.hourOfDay();
        long long5 = gJChronology0.julianToGregorianByWeekyear((-111110400048L));
        org.joda.time.DurationField durationField6 = gJChronology0.eras();
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = gJChronology0.get(readablePartial7, 1113797400022L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-112320000048L) + "'", long5 == (-112320000048L));
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        long long9 = gJChronology0.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.dayOfWeek();
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.minuteOfHour();
        int int13 = gJChronology11.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology11.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology11.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology11.dayOfYear();
        long long20 = gJChronology11.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology11.weekyear();
        boolean boolean22 = gJChronology0.equals((java.lang.Object) gJChronology11);
        org.joda.time.DurationField durationField23 = gJChronology11.days();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        java.lang.String str2 = gJChronology0.toString();
        org.joda.time.DurationField durationField3 = gJChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.monthOfYear();
        org.joda.time.DurationField durationField6 = gJChronology0.centuries();
        long long8 = gJChronology0.gregorianToJulianByYear(1L);
        java.lang.String str9 = gJChronology0.toString();
        org.joda.time.DurationField durationField10 = gJChronology0.minutes();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GJChronology[UTC]" + "'", str2, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1123200001L + "'", long8 == 1123200001L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GJChronology[UTC]" + "'", str9, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
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
        int int18 = gJChronology16.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField19 = gJChronology16.halfdays();
        boolean boolean21 = gJChronology16.equals((java.lang.Object) 100);
        org.joda.time.Instant instant22 = gJChronology16.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant22);
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology24.centuryOfEra();
        boolean boolean27 = gJChronology24.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone28 = gJChronology24.getZone();
        org.joda.time.chrono.GJChronology gJChronology29 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28);
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology30.minuteOfHour();
        org.joda.time.Instant instant32 = gJChronology30.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28, (org.joda.time.ReadableInstant) instant32);
        org.joda.time.chrono.GJChronology gJChronology34 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology34.minuteOfHour();
        org.joda.time.Instant instant36 = gJChronology34.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.Chronology chronology38 = gJChronology34.withZone(dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField39 = gJChronology34.clockhourOfDay();
        org.joda.time.DurationField durationField40 = gJChronology34.centuries();
        org.joda.time.chrono.GJChronology gJChronology41 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology41.centuryOfEra();
        boolean boolean44 = gJChronology41.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone45 = gJChronology41.getZone();
        org.joda.time.chrono.GJChronology gJChronology46 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone45);
        org.joda.time.chrono.GJChronology gJChronology47 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField48 = gJChronology47.minuteOfHour();
        org.joda.time.Instant instant49 = gJChronology47.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology50 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone45, (org.joda.time.ReadableInstant) instant49);
        org.joda.time.Chronology chronology51 = gJChronology34.withZone(dateTimeZone45);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.chrono.GJChronology gJChronology53 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField54 = gJChronology53.minuteOfHour();
        org.joda.time.Instant instant55 = gJChronology53.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology56 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone52, (org.joda.time.ReadableInstant) instant55);
        org.joda.time.chrono.GJChronology gJChronology58 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone45, (org.joda.time.ReadableInstant) instant55, (int) (short) 1);
        org.joda.time.chrono.GJChronology gJChronology59 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28, (org.joda.time.ReadableInstant) instant55);
        org.joda.time.chrono.GJChronology gJChronology60 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant55);
        org.joda.time.chrono.GJChronology gJChronology61 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField62 = gJChronology61.minuteOfHour();
        int int63 = gJChronology61.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField64 = gJChronology61.halfdays();
        org.joda.time.DurationField durationField65 = gJChronology61.centuries();
        long long67 = gJChronology61.julianToGregorianByYear(1137807999L);
        org.joda.time.Instant instant68 = gJChronology61.getGregorianCutover();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology70 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant68, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(gJChronology6);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(gJChronology15);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(gJChronology23);
        org.junit.Assert.assertNotNull(gJChronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(gJChronology29);
        org.junit.Assert.assertNotNull(gJChronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(instant32);
        org.junit.Assert.assertNotNull(gJChronology33);
        org.junit.Assert.assertNotNull(gJChronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(instant36);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(gJChronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(gJChronology46);
        org.junit.Assert.assertNotNull(gJChronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(instant49);
        org.junit.Assert.assertNotNull(gJChronology50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(gJChronology53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(instant55);
        org.junit.Assert.assertNotNull(gJChronology56);
        org.junit.Assert.assertNotNull(gJChronology58);
        org.junit.Assert.assertNotNull(gJChronology59);
        org.junit.Assert.assertNotNull(gJChronology60);
        org.junit.Assert.assertNotNull(gJChronology61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 4 + "'", int63 == 4);
        org.junit.Assert.assertNotNull(durationField64);
        org.junit.Assert.assertNotNull(durationField65);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 14607999L + "'", long67 == 14607999L);
        org.junit.Assert.assertNotNull(instant68);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
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
        org.joda.time.ReadablePartial readablePartial25 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long27 = gJChronology1.set(readablePartial25, (-3369599996L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 447L + "'", long5 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(gJChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(gJChronology23);
        org.junit.Assert.assertNotNull(chronology24);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology0.getZone();
        org.joda.time.DurationField durationField4 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
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
        org.joda.time.DateTimeZone dateTimeZone27 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27);
        org.joda.time.chrono.GJChronology gJChronology31 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27, 5776332720052L, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology34 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27, (-3369599996L), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1123200000L + "'", long5 == 1123200000L);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(gJChronology28);
        org.junit.Assert.assertNotNull(gJChronology31);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
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
        org.joda.time.DurationField durationField35 = gJChronology34.seconds();
        long long37 = gJChronology34.julianToGregorianByYear(109936860001L);
        org.joda.time.DateTimeField dateTimeField38 = gJChronology34.minuteOfDay();
        org.joda.time.ReadablePartial readablePartial39 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray41 = gJChronology34.get(readablePartial39, (-23327999960L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(gJChronology22);
        org.junit.Assert.assertNotNull(gJChronology23);
        org.junit.Assert.assertNotNull(gJChronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertNotNull(gJChronology33);
        org.junit.Assert.assertNotNull(gJChronology34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 108813660001L + "'", long37 == 108813660001L);
        org.junit.Assert.assertNotNull(dateTimeField38);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        long long5 = gJChronology1.add((long) 'a', (long) 10, (int) '#');
        org.joda.time.DateTimeField dateTimeField6 = gJChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology1.era();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology1.weekOfWeekyear();
        org.joda.time.Instant instant9 = gJChronology1.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology10.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology10.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology10.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology10.getZone();
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology15.minuteOfHour();
        org.joda.time.Instant instant17 = gJChronology15.getGregorianCutover();
        org.joda.time.Instant instant18 = gJChronology15.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, (org.joda.time.ReadableInstant) instant18, 4);
        org.joda.time.Chronology chronology21 = gJChronology1.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField22 = gJChronology1.weekyear();
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 447L + "'", long5 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(gJChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        long long9 = gJChronology0.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DurationField durationField10 = gJChronology0.millis();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology0.era();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        long long6 = gJChronology1.add((long) 1, (long) (byte) -1, 1);
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology1.getZone();
        org.joda.time.chrono.AssembledChronology.Fields fields8 = null;
        gJChronology1.assemble(fields8);
        org.joda.time.chrono.AssembledChronology.Fields fields10 = null;
        gJChronology1.assemble(fields10);
        int int12 = gJChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone13 = gJChronology1.getZone();
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
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
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.weekyear();
        org.joda.time.DurationField durationField12 = gJChronology0.years();
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology13.getZone();
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14);
        org.joda.time.Chronology chronology16 = gJChronology0.withZone(dateTimeZone14);
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14);
        org.joda.time.DurationField durationField18 = gJChronology17.millis();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(gJChronology15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(gJChronology17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        long long9 = gJChronology0.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.centuryOfEra();
        org.joda.time.DurationField durationField12 = gJChronology0.hours();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.weekyear();
        org.joda.time.Chronology chronology4 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = gJChronology0.add(readablePeriod6, 1128932001L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.era();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1128932001L + "'", long9 == 1128932001L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = gJChronology1.years();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology1.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5);
        long long10 = gJChronology6.add((long) 'a', (long) 10, (int) '#');
        org.joda.time.DateTimeField dateTimeField11 = gJChronology6.hourOfDay();
        org.joda.time.Chronology chronology12 = gJChronology6.withUTC();
        boolean boolean13 = gJChronology1.equals((java.lang.Object) gJChronology6);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        java.lang.String str15 = gJChronology14.toString();
        org.joda.time.Instant instant16 = gJChronology14.getGregorianCutover();
        boolean boolean17 = gJChronology1.equals((java.lang.Object) gJChronology14);
        org.joda.time.DateTimeZone dateTimeZone18 = gJChronology1.getZone();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19);
        long long24 = gJChronology20.add((long) 'a', (long) 10, (int) '#');
        org.joda.time.chrono.AssembledChronology.Fields fields25 = null;
        gJChronology20.assemble(fields25);
        org.joda.time.DateTimeField dateTimeField27 = gJChronology20.yearOfEra();
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology28.centuryOfEra();
        boolean boolean31 = gJChronology28.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone32 = gJChronology28.getZone();
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone32);
        org.joda.time.Chronology chronology34 = gJChronology20.withZone(dateTimeZone32);
        org.joda.time.DurationField durationField35 = gJChronology20.years();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology20.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology20.minuteOfHour();
        org.joda.time.Instant instant38 = gJChronology20.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology39 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18, (org.joda.time.ReadableInstant) instant38);
        org.joda.time.chrono.GJChronology gJChronology40 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18);
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(gJChronology6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 447L + "'", long10 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GJChronology[UTC]" + "'", str15, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 447L + "'", long24 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(gJChronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(gJChronology33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertNotNull(gJChronology39);
        org.junit.Assert.assertNotNull(gJChronology40);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.minuteOfHour();
        org.joda.time.Instant instant3 = gJChronology1.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) instant3);
        int int5 = gJChronology4.getMinimumDaysInFirstWeek();
        long long7 = gJChronology4.gregorianToJulianByYear(0L);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology4.year();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology4.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1123200000L + "'", long7 == 1123200000L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = gJChronology0.add(readablePeriod4, 0L, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology0.getZone();
        org.joda.time.DurationField durationField9 = gJChronology0.years();
        org.joda.time.DurationField durationField10 = gJChronology0.minutes();
        int int11 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField12 = gJChronology0.seconds();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.Instant instant6 = gJChronology0.getGregorianCutover();
        java.lang.String str7 = gJChronology0.toString();
        org.joda.time.DurationField durationField8 = gJChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.weekyear();
        org.joda.time.DurationField durationField10 = gJChronology0.centuries();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology12.halfdayOfDay();
        boolean boolean16 = gJChronology0.equals((java.lang.Object) gJChronology12);
        org.joda.time.DateTimeField dateTimeField17 = gJChronology0.era();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GJChronology[UTC]" + "'", str7, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(gJChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.centuryOfEra();
        org.joda.time.DurationField durationField3 = gJChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology1.halfdayOfDay();
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
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
        org.joda.time.DateTimeField dateTimeField20 = gJChronology1.millisOfSecond();
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 447L + "'", long5 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.millisOfDay();
        org.joda.time.DurationField durationField6 = gJChronology0.centuries();
        int int7 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.Instant instant8 = gJChronology0.getGregorianCutover();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(instant8);
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        long long9 = gJChronology0.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.dayOfWeek();
        long long14 = gJChronology0.add(3652000L, 0L, (int) (byte) 10);
        long long16 = gJChronology0.gregorianToJulianByWeekyear(36052097L);
        org.joda.time.DateTimeField dateTimeField17 = gJChronology0.yearOfCentury();
        org.joda.time.DurationField durationField18 = gJChronology0.hours();
        org.joda.time.DurationField durationField19 = gJChronology0.millis();
        int int20 = gJChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3652000L + "'", long14 == 3652000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1245652097L + "'", long16 == 1245652097L);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        long long9 = gJChronology0.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology0.minuteOfDay();
        org.joda.time.DurationField durationField13 = gJChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology0.year();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology0.millisOfSecond();
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology16.minuteOfHour();
        int int18 = gJChronology16.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology16.secondOfDay();
        org.joda.time.DurationField durationField21 = gJChronology16.centuries();
        java.lang.Object obj22 = null;
        boolean boolean23 = gJChronology16.equals(obj22);
        org.joda.time.DateTimeField dateTimeField24 = gJChronology16.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone25 = gJChronology16.getZone();
        org.joda.time.Chronology chronology26 = gJChronology0.withZone(dateTimeZone25);
        org.joda.time.chrono.GJChronology gJChronology27 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology27.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology27.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology27.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone31 = gJChronology27.getZone();
        org.joda.time.DateTimeZone dateTimeZone32 = gJChronology27.getZone();
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology33.minuteOfHour();
        int int35 = gJChronology33.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology33.secondOfDay();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology33.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology33.dayOfYear();
        long long42 = gJChronology33.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField43 = gJChronology33.dayOfWeek();
        org.joda.time.chrono.GJChronology gJChronology44 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField45 = gJChronology44.minuteOfHour();
        int int46 = gJChronology44.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField47 = gJChronology44.secondOfDay();
        org.joda.time.DateTimeField dateTimeField48 = gJChronology44.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField49 = gJChronology44.dayOfYear();
        long long53 = gJChronology44.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField54 = gJChronology44.weekyear();
        boolean boolean55 = gJChronology33.equals((java.lang.Object) gJChronology44);
        org.joda.time.DateTimeField dateTimeField56 = gJChronology44.hourOfHalfday();
        org.joda.time.DurationField durationField57 = gJChronology44.seconds();
        org.joda.time.DateTimeField dateTimeField58 = gJChronology44.secondOfDay();
        org.joda.time.Instant instant59 = gJChronology44.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology60 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone32, (org.joda.time.ReadableInstant) instant59);
        boolean boolean61 = gJChronology0.equals((java.lang.Object) gJChronology60);
        org.joda.time.DateTimeField dateTimeField62 = gJChronology60.dayOfWeek();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(gJChronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(gJChronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(gJChronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(instant59);
        org.junit.Assert.assertNotNull(gJChronology60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(dateTimeField62);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.monthOfYear();
        long long8 = gJChronology0.gregorianToJulianByYear(1123200010L);
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.year();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.era();
        long long16 = gJChronology0.getDateTimeMillis(111060060001L, 4, (int) (byte) 10, (int) ' ', (int) '#');
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2246400010L + "'", long8 == 2246400010L);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 111039032035L + "'", long16 == 111039032035L);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
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
        org.joda.time.DateTimeField dateTimeField15 = gJChronology1.minuteOfHour();
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-9L) + "'", long11 == (-9L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-71792001L) + "'", long14 == (-71792001L));
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
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
        org.joda.time.DateTimeField dateTimeField26 = gJChronology0.millisOfDay();
        long long28 = gJChronology0.julianToGregorianByYear(2332800447L);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 447L + "'", long9 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1209599999L + "'", long14 == 1209599999L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3456000447L + "'", long18 == 3456000447L);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1209600091L + "'", long24 == 1209600091L);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1209600447L + "'", long28 == 1209600447L);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = gJChronology0.add(readablePeriod4, 0L, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology0.getZone();
        org.joda.time.DurationField durationField9 = gJChronology0.years();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
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
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.weekyear();
        org.joda.time.DurationField durationField12 = gJChronology0.years();
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology13.getZone();
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14);
        org.joda.time.Chronology chronology16 = gJChronology0.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField17 = gJChronology0.era();
        org.joda.time.DurationField durationField18 = gJChronology0.weeks();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(gJChronology15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
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
        org.joda.time.DateTimeField dateTimeField14 = gJChronology1.millisOfDay();
        long long16 = gJChronology1.julianToGregorianByYear(3628800398L);
        int int17 = gJChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField18 = gJChronology1.weekyears();
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GJChronology[Asia/Bangkok]" + "'", str11, "GJChronology[Asia/Bangkok]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2505600398L + "'", long16 == 2505600398L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField6 = gJChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.weekOfWeekyear();
        org.joda.time.Instant instant9 = gJChronology0.getGregorianCutover();
        long long11 = gJChronology0.julianToGregorianByYear(1123200447L);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = gJChronology0.add(readablePeriod13, 86399991L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField17 = gJChronology0.dayOfWeek();
        java.lang.String str18 = gJChronology0.toString();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 447L + "'", long11 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 86399991L + "'", long16 == 86399991L);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "GJChronology[UTC]" + "'", str18, "GJChronology[UTC]");
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        org.joda.time.DurationField durationField2 = gJChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.monthOfYear();
        org.joda.time.DurationField durationField5 = gJChronology0.years();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        long long5 = gJChronology1.add((long) 'a', (long) 10, (int) '#');
        org.joda.time.DateTimeField dateTimeField6 = gJChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = gJChronology1.halfdays();
        long long9 = gJChronology1.julianToGregorianByWeekyear((-1123199996L));
        org.joda.time.Chronology chronology10 = gJChronology1.withUTC();
        org.joda.time.DurationField durationField11 = gJChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology1.yearOfCentury();
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 447L + "'", long5 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-2332799996L) + "'", long9 == (-2332799996L));
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
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
        org.joda.time.DurationField durationField11 = gJChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology0.dayOfWeek();
        org.joda.time.DurationField durationField15 = gJChronology0.minutes();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.Instant instant3 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField4 = gJChronology0.millis();
        long long6 = gJChronology0.gregorianToJulianByYear((-10108799000L));
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology7.minuteOfHour();
        int int9 = gJChronology7.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology7.weekyear();
        org.joda.time.Chronology chronology11 = gJChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology7.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology7.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology7.hourOfDay();
        org.joda.time.DurationField durationField16 = gJChronology7.months();
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology7.getZone();
        org.joda.time.Chronology chronology18 = gJChronology0.withZone(dateTimeZone17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17, 3993999999L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-8985599000L) + "'", long6 == (-8985599000L));
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField3 = gJChronology0.hours();
        org.joda.time.DurationField durationField4 = gJChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.weekyear();
        long long7 = gJChronology0.julianToGregorianByYear((-113443200048L));
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-114566400048L) + "'", long7 == (-114566400048L));
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        boolean boolean3 = gJChronology0.equals((java.lang.Object) 10L);
        long long5 = gJChronology0.gregorianToJulianByYear((long) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1123200000L + "'", long5 == 1123200000L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.centuryOfEra();
        org.joda.time.ReadablePartial readablePartial4 = null;
        int[] intArray11 = new int[] { (-1), 10, (byte) 0, (-1), 'a', 1 };
        // The following exception was thrown during execution in test generation
        try {
            gJChronology0.validate(readablePartial4, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-1), 10, 0, (-1), 97, 1 });
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField3 = gJChronology0.hours();
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, readableInstant6);
        long long9 = gJChronology7.julianToGregorianByWeekyear(2332799999L);
        org.joda.time.Instant instant10 = gJChronology7.getGregorianCutover();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1123199999L + "'", long9 == 1123199999L);
        org.junit.Assert.assertNotNull(instant10);
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.secondOfDay();
        org.joda.time.DurationField durationField7 = gJChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.monthOfYear();
        java.lang.String str9 = gJChronology0.toString();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GJChronology[UTC]" + "'", str9, "GJChronology[UTC]");
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        long long6 = gJChronology4.gregorianToJulianByYear(111110400004L);
        org.joda.time.DurationField durationField7 = gJChronology4.halfdays();
        long long12 = gJChronology4.getDateTimeMillis(100, (int) (byte) 10, (int) (byte) 1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField13 = gJChronology4.weekOfWeekyear();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 112233600004L + "'", long6 == 112233600004L);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-58987958399903L) + "'", long12 == (-58987958399903L));
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        boolean boolean5 = gJChronology0.equals((java.lang.Object) 100);
        org.joda.time.DurationField durationField6 = gJChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.secondOfMinute();
        org.joda.time.DurationField durationField9 = gJChronology0.seconds();
        org.joda.time.DurationField durationField10 = gJChronology0.millis();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.year();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfMonth();
        long long9 = gJChronology0.add(447L, (long) 0, (int) 'a');
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.year();
        long long14 = gJChronology0.add((long) ' ', (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology0.halfdayOfDay();
        java.lang.String str16 = gJChronology0.toString();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 447L + "'", long9 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 31L + "'", long14 == 31L);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GJChronology[UTC]" + "'", str16, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.weekyear();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone1 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.weekyearOfCentury();
        long long9 = gJChronology2.getDateTimeMillis(14L, (int) (short) 10, (int) (short) 0, (int) '4', (int) 'a');
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.minuteOfHour();
        long long12 = gJChronology2.julianToGregorianByWeekyear(3456000002L);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.centuryOfEra();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 36052097L + "'", long9 == 36052097L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2246400002L + "'", long12 == 2246400002L);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = gJChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField7 = gJChronology0.millis();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
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
        org.joda.time.DurationField durationField10 = gJChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
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
        org.joda.time.DateTimeField dateTimeField16 = gJChronology1.secondOfDay();
        long long18 = gJChronology1.gregorianToJulianByYear(111146460001L);
        long long22 = gJChronology1.add(6730100L, 3652000L, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField23 = gJChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField25 = gJChronology1.years();
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-9L) + "'", long11 == (-9L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-71792001L) + "'", long14 == (-71792001L));
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 112269660001L + "'", long18 == 112269660001L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 6730100L + "'", long22 == 6730100L);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
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
        org.joda.time.DateTimeField dateTimeField42 = gJChronology41.clockhourOfDay();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(gJChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1209600002L + "'", long22 == 1209600002L);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(gJChronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-9L) + "'", long33 == (-9L));
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(instant35);
        org.junit.Assert.assertNotNull(gJChronology36);
        org.junit.Assert.assertNotNull(gJChronology38);
        org.junit.Assert.assertNotNull(gJChronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gJChronology0.seconds();
        org.joda.time.DurationField durationField2 = gJChronology0.days();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.centuryOfEra();
        org.joda.time.Instant instant4 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField7 = gJChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.minuteOfHour();
        org.joda.time.DurationField durationField10 = gJChronology0.minutes();
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = gJChronology0.get(readablePartial11, (-3628800000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        java.lang.String str2 = gJChronology0.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = gJChronology0.add(readablePeriod3, (long) '4', (int) '4');
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.secondOfMinute();
        org.joda.time.DurationField durationField8 = gJChronology0.days();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.dayOfYear();
        long long12 = gJChronology0.gregorianToJulianByWeekyear((-2332790000L));
        java.lang.String str13 = gJChronology0.toString();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GJChronology[UTC]" + "'", str2, "GJChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1123190000L) + "'", long12 == (-1123190000L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GJChronology[UTC]" + "'", str13, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        long long9 = gJChronology0.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DurationField durationField10 = gJChronology0.millis();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology0.minuteOfHour();
        long long15 = gJChronology0.gregorianToJulianByYear((-1123199903L));
        org.joda.time.DurationField durationField16 = gJChronology0.days();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology0.era();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        long long5 = gJChronology1.add((long) 'a', (long) 10, (int) '#');
        org.joda.time.chrono.AssembledChronology.Fields fields6 = null;
        gJChronology1.assemble(fields6);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology1.weekyear();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9);
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.minuteOfHour();
        int int13 = gJChronology11.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology11.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology11.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology11.weekOfWeekyear();
        long long20 = gJChronology11.add((long) 1, (-1L), (int) (byte) 10);
        boolean boolean21 = gJChronology10.equals((java.lang.Object) 1);
        org.joda.time.DateTimeField dateTimeField22 = gJChronology10.minuteOfHour();
        boolean boolean23 = gJChronology1.equals((java.lang.Object) gJChronology10);
        org.joda.time.DateTimeField dateTimeField24 = gJChronology1.dayOfWeek();
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology25.minuteOfHour();
        int int27 = gJChronology25.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology25.secondOfDay();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology25.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology25.dayOfYear();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology25.secondOfDay();
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology32.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology32.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology32.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone36 = gJChronology32.getZone();
        org.joda.time.Chronology chronology37 = gJChronology25.withZone(dateTimeZone36);
        org.joda.time.Chronology chronology38 = gJChronology1.withZone(dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField39 = gJChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField40 = gJChronology1.millisOfDay();
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 447L + "'", long5 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-9L) + "'", long20 == (-9L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(gJChronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(gJChronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
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
        org.joda.time.DateTimeField dateTimeField26 = gJChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1209600032L + "'", long3 == 1209600032L);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(gJChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(gJChronology21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.Instant instant2 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = gJChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfMonth();
        long long9 = gJChronology0.add(447L, (long) 0, (int) 'a');
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.year();
        long long14 = gJChronology0.add((long) ' ', (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology0.minuteOfHour();
        long long20 = gJChronology0.add(1209600002L, (-62166614400000L), (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 447L + "'", long9 == 447L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 31L + "'", long14 == 31L);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-62165404799998L) + "'", long20 == (-62165404799998L));
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        int int2 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.dayOfYear();
        long long9 = gJChronology0.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.dayOfWeek();
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.minuteOfHour();
        int int13 = gJChronology11.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology11.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology11.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology11.dayOfYear();
        long long20 = gJChronology11.add((long) (byte) -1, (long) (short) 0, 4);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology11.weekyear();
        boolean boolean22 = gJChronology0.equals((java.lang.Object) gJChronology11);
        org.joda.time.DateTimeZone dateTimeZone23 = gJChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone25 = gJChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology0.secondOfMinute();
        org.joda.time.Chronology chronology27 = gJChronology0.withUTC();
        org.joda.time.chrono.AssembledChronology.Fields fields28 = null;
        // The following exception was thrown during execution in test generation
        try {
            gJChronology0.assemble(fields28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(chronology27);
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.dayOfMonth();
        long long4 = gJChronology0.gregorianToJulianByYear((-8899199000L));
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = gJChronology0.add(readablePeriod6, (-61828700338999L), (int) (byte) 10);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-7775999000L) + "'", long4 == (-7775999000L));
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-61828700338999L) + "'", long9 == (-61828700338999L));
    }
}

