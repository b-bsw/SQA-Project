package org.joda.time;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 1, (long) '4');
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) (byte) -1);
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = period1.withPeriodType(periodType2);
        int[] intArray4 = period1.getValues();
        org.joda.time.Period period7 = new org.joda.time.Period((long) (short) 10, (long) (short) 0);
        org.joda.time.Period period8 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period8.toDurationTo(readableInstant9);
        org.joda.time.Period period12 = period8.plusHours((-1));
        int int13 = period12.getSeconds();
        org.joda.time.Period period15 = period12.withSeconds(10);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant16, readableDuration17);
        org.joda.time.Period period20 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period22 = period20.minusYears((int) (byte) -1);
        org.joda.time.Period period23 = period18.withFields((org.joda.time.ReadablePeriod) period20);
        int[] intArray24 = period18.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter25 = null;
        java.lang.String str26 = period18.toString(periodFormatter25);
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType35);
        org.joda.time.Period period38 = period36.withMillis((int) (short) 10);
        org.joda.time.Period period40 = period36.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType42 = period36.getFieldType((int) (short) 1);
        org.joda.time.Period period44 = period18.withField(durationFieldType42, (int) (short) 10);
        org.joda.time.Period period46 = period15.withFieldAdded(durationFieldType42, (int) (byte) 10);
        int int47 = period7.indexOf(durationFieldType42);
        int int48 = period1.get(durationFieldType42);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period49 = new org.joda.time.Period((java.lang.Object) durationFieldType42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DurationFieldType$StandardDurationFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, (-1), 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PT0S" + "'", str26, "PT0S");
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(durationFieldType42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.plusYears((int) '#');
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) 10, (int) (byte) 100, (int) '#', (int) (byte) 10);
        org.joda.time.Period period9 = period3.plus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.MutablePeriod mutablePeriod10 = period3.toMutablePeriod();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(mutablePeriod10);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period2 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period4 = period2.minusYears((int) (byte) -1);
        org.joda.time.Duration duration5 = period2.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration5, readableInstant6);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration5, periodType8);
        org.joda.time.Period period11 = period9.plusMonths((int) '4');
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(35);
        org.joda.time.Period period3 = period1.withDays(100);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.joda.time.Period period3 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period5 = period3.withMillis((int) (byte) 100);
        org.joda.time.Period period6 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationTo(readableInstant7);
        org.joda.time.Period period10 = period6.plusHours((-1));
        int int11 = period10.getSeconds();
        org.joda.time.Period period12 = period5.withFields((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Period period14 = period12.withMonths(1);
        org.joda.time.Period period16 = period14.multipliedBy((-1));
        org.joda.time.PeriodType periodType17 = period14.getPeriodType();
        org.joda.time.Period period18 = new org.joda.time.Period((long) ' ', (long) (byte) 1, periodType17);
        org.joda.time.Period period19 = period18.normalizedStandard();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.Period period8 = period4.plusHours((-1));
        int int9 = period8.getSeconds();
        org.joda.time.Period period10 = period3.withFields((org.joda.time.ReadablePeriod) period8);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableDuration13, readableInstant14, periodType15);
        org.joda.time.PeriodType periodType17 = period16.getPeriodType();
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant11, readableInstant12, periodType17);
        org.joda.time.Period period19 = period3.normalizedStandard(periodType17);
        org.joda.time.Period period21 = period19.withHours((int) (byte) -1);
        org.joda.time.DurationFieldType[] durationFieldTypeArray22 = period21.getFieldTypes();
        org.joda.time.Period period24 = period21.withWeeks((-4));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(durationFieldTypeArray22);
        org.junit.Assert.assertNotNull(period24);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableDuration3, readableInstant4, periodType5);
        org.joda.time.PeriodType periodType7 = period6.getPeriodType();
        org.joda.time.Period period9 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period11 = period9.withMillis((int) (byte) 100);
        org.joda.time.Period period12 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period12.toDurationTo(readableInstant13);
        org.joda.time.Period period16 = period12.plusHours((-1));
        int int17 = period16.getSeconds();
        org.joda.time.Period period18 = period11.withFields((org.joda.time.ReadablePeriod) period16);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableDuration21, readableInstant22, periodType23);
        org.joda.time.PeriodType periodType25 = period24.getPeriodType();
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant19, readableInstant20, periodType25);
        org.joda.time.Period period27 = period11.normalizedStandard(periodType25);
        org.joda.time.Period period28 = period6.normalizedStandard(periodType25);
        org.joda.time.Period period29 = new org.joda.time.Period((long) (byte) 10, periodType25);
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType25);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period28);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        int[] intArray5 = period4.getValues();
        org.joda.time.Period period7 = period4.minusMinutes((int) '#');
        org.joda.time.PeriodType periodType8 = period4.getPeriodType();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableDuration17, readableInstant18, periodType19);
        org.joda.time.PeriodType periodType21 = period20.getPeriodType();
        org.joda.time.Period period22 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType21);
        org.joda.time.Period period24 = period22.minusMonths((int) (short) 100);
        org.joda.time.Period period26 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period28 = period26.minusMillis((int) (short) 0);
        org.joda.time.Period period30 = org.joda.time.Period.minutes((int) (byte) 0);
        org.joda.time.Period period32 = period30.withSeconds((-1));
        org.joda.time.Period period33 = period28.minus((org.joda.time.ReadablePeriod) period32);
        org.joda.time.Period period35 = org.joda.time.Period.seconds(0);
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType44);
        org.joda.time.Period period47 = period45.withMillis((int) (short) 10);
        org.joda.time.Period period49 = period45.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType51 = period45.getFieldType((int) (short) 1);
        int int52 = period35.indexOf(durationFieldType51);
        org.joda.time.Period period54 = period33.withField(durationFieldType51, 100);
        org.joda.time.Period period56 = period22.withField(durationFieldType51, (int) '#');
        int int57 = period4.indexOf(durationFieldType51);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(durationFieldType51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.plusYears((int) '#');
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) 10, (int) (byte) 100, (int) '#', (int) (byte) 10);
        org.joda.time.Period period9 = period3.plus((org.joda.time.ReadablePeriod) period8);
        int int10 = period8.getMillis();
        org.joda.time.Period period11 = period8.normalizedStandard();
        org.joda.time.Period period13 = period11.withMillis(1);
        org.joda.time.Period period15 = period13.withYears(65);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.joda.time.Period period4 = new org.joda.time.Period((-1), (int) (short) 100, (int) (short) 0, (int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period12 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period14 = period12.minusYears((int) (byte) -1);
        org.joda.time.Duration duration15 = period12.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableDuration19, readableInstant20, periodType21);
        org.joda.time.PeriodType periodType23 = period22.getPeriodType();
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant17, readableInstant18, periodType23);
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration15, readableInstant16, periodType23);
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant9, readableInstant10, periodType23);
        org.joda.time.Period period27 = new org.joda.time.Period((long) (short) 1, periodType23);
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, readableInstant7, periodType23);
        org.joda.time.Period period30 = period28.withSeconds((int) (short) 1);
        int int31 = period28.getMinutes();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 40 + "'", int31 == 40);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableDuration5, readableInstant6, periodType7);
        org.joda.time.PeriodType periodType9 = period8.getPeriodType();
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(0L, 0L, periodType9, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) 0, periodType9, chronology13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period14.toDurationFrom(readableInstant15);
        org.joda.time.DurationFieldType durationFieldType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period19 = period14.withField(durationFieldType17, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(duration16);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationTo(readableInstant11);
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant9, (org.joda.time.ReadableDuration) duration12);
        org.joda.time.Hours hours14 = period13.toStandardHours();
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period13.toDurationTo(readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration16, readableInstant17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period21 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period23 = period21.withMillis((int) (byte) 100);
        org.joda.time.Period period25 = period21.withMonths((int) ' ');
        org.joda.time.Period period27 = period21.withHours(100);
        int int28 = period27.getMinutes();
        org.joda.time.Period period30 = period27.withWeeks((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = period30.toDurationFrom(readableInstant31);
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period(readableDuration49, readableInstant50, periodType51);
        org.joda.time.PeriodType periodType53 = period52.getPeriodType();
        org.joda.time.Period period54 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType53);
        org.joda.time.Period period55 = new org.joda.time.Period((-1), 0, (int) (short) 1, (int) '4', 10, (int) (byte) 0, 100, (int) (byte) 1, periodType53);
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant19, (org.joda.time.ReadableDuration) duration32, periodType53);
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant8, (org.joda.time.ReadableDuration) duration16, periodType53);
        org.joda.time.Period period58 = new org.joda.time.Period((int) (byte) 10, (-1), (int) '#', 100, 65, (-4), 0, (int) '#', periodType53);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(periodType53);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType9);
        org.joda.time.Period period12 = period10.withMillis((int) (short) 10);
        org.joda.time.Period period14 = period10.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType16 = period10.getFieldType((int) (short) 1);
        org.joda.time.PeriodType periodType17 = period10.getPeriodType();
        org.joda.time.Period period19 = period10.minusMinutes(32);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Period period31 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period33 = period31.minusYears((int) (byte) -1);
        org.joda.time.Duration duration34 = period31.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period(readableDuration38, readableInstant39, periodType40);
        org.joda.time.PeriodType periodType42 = period41.getPeriodType();
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant36, readableInstant37, periodType42);
        org.joda.time.Period period44 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration34, readableInstant35, periodType42);
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant28, readableInstant29, periodType42);
        org.joda.time.Period period46 = new org.joda.time.Period((int) (short) 10, (int) (short) 0, (int) (byte) 1, (int) (short) 1, 8, (int) (short) -1, 0, 100, periodType42);
        org.joda.time.Period period48 = period46.plusDays((int) (short) 10);
        org.joda.time.PeriodType periodType49 = period46.getPeriodType();
        org.joda.time.Period period50 = period10.withPeriodType(periodType49);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period((long) (byte) 1, periodType49, chronology51);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(period50);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) 0, (-4), 135, (-10), 97, (int) (byte) 10, 68, (int) (short) 100);
        org.joda.time.Period period9 = period8.negated();
        org.joda.time.PeriodType periodType10 = period8.getPeriodType();
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = org.joda.time.Period.ZERO;
        org.joda.time.Period period7 = period5.plusHours(100);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period7.toDurationFrom(readableInstant8);
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant4, (org.joda.time.ReadableDuration) duration9, periodType10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant3, (org.joda.time.ReadableDuration) duration9, periodType12);
        org.joda.time.Period period15 = period13.minusMonths(10);
        org.joda.time.Period period17 = period15.withSeconds((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period15.toDurationFrom(readableInstant18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period22 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period24 = period22.withMillis((int) (byte) 100);
        org.joda.time.Period period26 = period22.withMonths((int) ' ');
        org.joda.time.Period period28 = period22.withHours(100);
        int int29 = period28.getMinutes();
        org.joda.time.Period period31 = period28.withWeeks((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = period31.toDurationFrom(readableInstant32);
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period(readableDuration50, readableInstant51, periodType52);
        org.joda.time.PeriodType periodType54 = period53.getPeriodType();
        org.joda.time.Period period55 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType54);
        org.joda.time.Period period56 = new org.joda.time.Period((-1), 0, (int) (short) 1, (int) '4', 10, (int) (byte) 0, 100, (int) (byte) 1, periodType54);
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant20, (org.joda.time.ReadableDuration) duration33, periodType54);
        org.joda.time.Period period58 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration19, periodType54);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period((-1L), periodType54, chronology59);
        org.joda.time.Period period61 = new org.joda.time.Period(0L, periodType54);
        int int62 = period61.getMinutes();
        org.joda.time.Period period64 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period66 = period64.withMillis((int) (byte) 100);
        org.joda.time.Period period68 = period66.plusSeconds((int) ' ');
        int[] intArray69 = period66.getValues();
        org.joda.time.Period period71 = period66.withMonths(1);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.Period period73 = new org.joda.time.Period((java.lang.Object) period66, chronology72);
        org.joda.time.Period period75 = period66.minusYears((int) 'a');
        org.joda.time.Period period77 = org.joda.time.Period.days((int) (byte) 100);
        org.joda.time.Period period79 = period77.withMinutes(35);
        org.joda.time.Period period81 = period79.minusMinutes((int) (short) 1);
        org.joda.time.Period period83 = period81.minusMillis(97);
        org.joda.time.format.PeriodFormatter periodFormatter84 = null;
        java.lang.String str85 = period81.toString(periodFormatter84);
        org.joda.time.DurationFieldType durationFieldType87 = period81.getFieldType((int) (short) 0);
        int int88 = period75.indexOf(durationFieldType87);
        int int89 = period61.get(durationFieldType87);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertArrayEquals(intArray69, new int[] { 0, 0, 0, 0, 0, 0, 0, 100 });
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "P100DT34M" + "'", str85, "P100DT34M");
        org.junit.Assert.assertNotNull(durationFieldType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.Period period8 = period4.plusHours((-1));
        int int9 = period8.getSeconds();
        org.joda.time.Period period10 = period3.withFields((org.joda.time.ReadablePeriod) period8);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableDuration13, readableInstant14, periodType15);
        org.joda.time.PeriodType periodType17 = period16.getPeriodType();
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant11, readableInstant12, periodType17);
        org.joda.time.Period period19 = period3.normalizedStandard(periodType17);
        org.joda.time.Period period21 = period3.withHours((-35));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (byte) 10, (int) (byte) 100, (int) '#', (int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationTo(readableInstant11);
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant9, (org.joda.time.ReadableDuration) duration12);
        org.joda.time.Period period15 = period13.withWeeks(0);
        org.joda.time.Period period16 = period13.toPeriod();
        org.joda.time.Period period18 = period16.withDays(8);
        boolean boolean19 = period8.equals((java.lang.Object) period16);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        org.joda.time.Period period1 = org.joda.time.Period.years(4);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType4, chronology5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationFrom(readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.Period period13 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period15 = period13.minusYears((int) (byte) -1);
        org.joda.time.Period period16 = period11.withFields((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period18 = period13.withMinutes((int) (short) -1);
        org.joda.time.Period period19 = period6.plus((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Period period20 = period1.minus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationTo(readableInstant23);
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant21, (org.joda.time.ReadableDuration) duration24);
        org.joda.time.Period period27 = period25.withMillis((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Period period30 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = period30.toDurationTo(readableInstant31);
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant29, (org.joda.time.ReadableDuration) duration32);
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant28, (org.joda.time.ReadableDuration) duration32, periodType34);
        org.joda.time.Period period37 = period35.plusWeeks(0);
        org.joda.time.Period period38 = period27.withFields((org.joda.time.ReadablePeriod) period37);
        org.joda.time.Period period39 = period27.negated();
        int int40 = period39.getWeeks();
        org.joda.time.Period period42 = period39.minusHours(1);
        org.joda.time.DurationFieldType durationFieldType44 = period39.getFieldType((int) (short) 0);
        org.joda.time.Period period46 = period1.withField(durationFieldType44, 65);
        org.joda.time.Period period47 = period46.toPeriod();
        org.joda.time.Period period48 = new org.joda.time.Period((java.lang.Object) period46);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period47);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        java.lang.String str8 = period7.toString();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableDuration25, readableInstant26, periodType27);
        org.joda.time.PeriodType periodType29 = period28.getPeriodType();
        org.joda.time.Period period30 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType29);
        org.joda.time.Period period31 = new org.joda.time.Period((-1), 0, (int) (short) 1, (int) '4', 10, (int) (byte) 0, 100, (int) (byte) 1, periodType29);
        org.joda.time.Period period33 = period31.plusHours((int) (short) -1);
        org.joda.time.Period period35 = period31.withWeeks((int) (byte) -1);
        int int36 = period31.size();
        boolean boolean37 = period7.equals((java.lang.Object) int36);
        org.joda.time.Period period39 = period7.minusWeeks(0);
        org.joda.time.Period period41 = period39.minusMinutes((int) ' ');
        org.joda.time.Days days42 = period41.toStandardDays();
        org.joda.time.Period period44 = period41.withMillis(100);
        int int45 = period41.getDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT100H" + "'", str8, "PT100H");
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8 + "'", int36 == 8);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(days42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period3 = period1.plusDays((int) (byte) 0);
        org.joda.time.Period period7 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period8 = period7.negated();
        org.joda.time.PeriodType periodType9 = period8.getPeriodType();
        org.joda.time.Period period10 = new org.joda.time.Period((long) '4', (long) (short) 0, periodType9);
        org.joda.time.Period period11 = period1.normalizedStandard(periodType9);
        org.joda.time.Period period13 = period1.minusHours(97);
        org.joda.time.Period period14 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period14.toDurationTo(readableInstant15);
        org.joda.time.DurationFieldType durationFieldType17 = null;
        int int18 = period14.get(durationFieldType17);
        org.joda.time.PeriodType periodType19 = period14.getPeriodType();
        org.joda.time.Period period20 = period13.plus((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Period period22 = period14.plusMillis(1000);
        org.joda.time.Period period25 = new org.joda.time.Period((long) (short) 10, (long) (short) 0);
        org.joda.time.Period period26 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = period26.toDurationTo(readableInstant27);
        org.joda.time.Period period30 = period26.plusHours((-1));
        int int31 = period30.getSeconds();
        org.joda.time.Period period33 = period30.withSeconds(10);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant34, readableDuration35);
        org.joda.time.Period period38 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period40 = period38.minusYears((int) (byte) -1);
        org.joda.time.Period period41 = period36.withFields((org.joda.time.ReadablePeriod) period38);
        int[] intArray42 = period36.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter43 = null;
        java.lang.String str44 = period36.toString(periodFormatter43);
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType53);
        org.joda.time.Period period56 = period54.withMillis((int) (short) 10);
        org.joda.time.Period period58 = period54.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType60 = period54.getFieldType((int) (short) 1);
        org.joda.time.Period period62 = period36.withField(durationFieldType60, (int) (short) 10);
        org.joda.time.Period period64 = period33.withFieldAdded(durationFieldType60, (int) (byte) 10);
        int int65 = period25.indexOf(durationFieldType60);
        int int66 = period14.get(durationFieldType60);
        int int67 = period14.getWeeks();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "PT0S" + "'", str44, "PT0S");
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(durationFieldType60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.minusMillis((int) (short) 0);
        org.joda.time.Minutes minutes4 = period1.toStandardMinutes();
        org.joda.time.Period period6 = period1.multipliedBy((-11));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period11 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period13 = period11.minusYears((int) (byte) -1);
        org.joda.time.Duration duration14 = period11.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableDuration18, readableInstant19, periodType20);
        org.joda.time.PeriodType periodType22 = period21.getPeriodType();
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant16, readableInstant17, periodType22);
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration14, readableInstant15, periodType22);
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant8, readableInstant9, periodType22);
        org.joda.time.Period period26 = new org.joda.time.Period((int) (short) 10, (int) (short) 0, (int) (byte) 1, (int) (short) 1, 8, (int) (short) -1, 0, 100, periodType22);
        org.joda.time.Period period28 = period26.plusDays((int) (short) 10);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) (short) 1, chronology30);
        org.joda.time.Period period35 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period37 = period35.minusYears((int) (byte) -1);
        org.joda.time.Duration duration38 = period35.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableDuration42, readableInstant43, periodType44);
        org.joda.time.PeriodType periodType46 = period45.getPeriodType();
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant40, readableInstant41, periodType46);
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration38, readableInstant39, periodType46);
        org.joda.time.Period period49 = new org.joda.time.Period(1L, (long) (short) 10, periodType46);
        org.joda.time.Period period50 = period31.withPeriodType(periodType46);
        org.joda.time.Period period51 = period28.withFields((org.joda.time.ReadablePeriod) period31);
        org.joda.time.Period period53 = period51.minusMillis(52);
        org.joda.time.MutablePeriod mutablePeriod54 = period51.toMutablePeriod();
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(mutablePeriod54);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        org.joda.time.Period period1 = new org.joda.time.Period(10L);
        java.lang.String str2 = period1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT0.010S" + "'", str2, "PT0.010S");
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableDuration0, readableInstant1, periodType2);
        org.joda.time.PeriodType periodType4 = period3.getPeriodType();
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 10, periodType6);
        org.joda.time.Period period9 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period11 = period9.withMillis((int) (byte) 100);
        org.joda.time.Period period12 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period12.toDurationTo(readableInstant13);
        org.joda.time.Period period16 = period12.plusHours((-1));
        int int17 = period16.getSeconds();
        org.joda.time.Period period18 = period11.withFields((org.joda.time.ReadablePeriod) period16);
        int int19 = period16.getHours();
        org.joda.time.Period period20 = period7.minus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant21, readableDuration22);
        org.joda.time.Period period25 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period27 = period25.minusYears((int) (byte) -1);
        org.joda.time.Period period28 = period23.withFields((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Period period30 = period25.withMinutes((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = period30.toDurationTo(readableInstant31);
        org.joda.time.Period period33 = period7.withFields((org.joda.time.ReadablePeriod) period30);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType36, chronology37);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = period38.toDurationFrom(readableInstant39);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant41, readableDuration42);
        org.joda.time.Period period45 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period47 = period45.minusYears((int) (byte) -1);
        org.joda.time.Period period48 = period43.withFields((org.joda.time.ReadablePeriod) period45);
        org.joda.time.Period period50 = period45.withMinutes((int) (short) -1);
        org.joda.time.Period period51 = period38.plus((org.joda.time.ReadablePeriod) period50);
        org.joda.time.Period period53 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period55 = period53.withMillis((int) (byte) 100);
        org.joda.time.Period period56 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Duration duration58 = period56.toDurationTo(readableInstant57);
        org.joda.time.Period period60 = period56.plusHours((-1));
        int int61 = period60.getSeconds();
        org.joda.time.Period period62 = period55.withFields((org.joda.time.ReadablePeriod) period60);
        org.joda.time.PeriodType periodType71 = null;
        org.joda.time.Period period72 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType71);
        org.joda.time.Period period74 = period72.withMillis((int) (short) 10);
        org.joda.time.Period period76 = period72.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType78 = period72.getFieldType((int) (short) 1);
        org.joda.time.Period period80 = period55.withField(durationFieldType78, 100);
        boolean boolean81 = period38.isSupported(durationFieldType78);
        org.joda.time.Period period83 = period33.withField(durationFieldType78, 35);
        org.joda.time.Period period85 = period3.withFieldAdded(durationFieldType78, 8);
        org.joda.time.Period period87 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period89 = period87.minusMillis((int) (short) 0);
        org.joda.time.Period period91 = org.joda.time.Period.minutes((int) (byte) 0);
        org.joda.time.Period period93 = period91.withSeconds((-1));
        org.joda.time.Period period94 = period89.minus((org.joda.time.ReadablePeriod) period93);
        boolean boolean95 = period3.equals((java.lang.Object) period94);
        int int96 = period3.getSeconds();
        int int97 = period3.getYears();
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(durationFieldType78);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertNotNull(period91);
        org.junit.Assert.assertNotNull(period93);
        org.junit.Assert.assertNotNull(period94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        org.joda.time.Weeks weeks5 = period4.toStandardWeeks();
        org.joda.time.Period period7 = period4.minusDays(100);
        int int8 = period4.getDays();
        org.joda.time.Period period10 = period4.withMillis((int) ' ');
        org.joda.time.format.PeriodFormatter periodFormatter11 = null;
        java.lang.String str12 = period10.toString(periodFormatter11);
        org.joda.time.DurationFieldType[] durationFieldTypeArray13 = period10.getFieldTypes();
        org.joda.time.Period period15 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period17 = period15.minusMillis((int) (short) 0);
        org.joda.time.Period period19 = org.joda.time.Period.minutes((int) (byte) 0);
        org.joda.time.Period period21 = period19.withSeconds((-1));
        org.joda.time.Period period22 = period17.minus((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period24 = period17.withMillis((int) (byte) 1);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) (short) 0, chronology26);
        org.joda.time.Period period29 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period31 = period29.withMillis((int) (byte) 100);
        org.joda.time.Period period33 = period31.plusSeconds((int) ' ');
        org.joda.time.Period period35 = period31.minusWeeks(10);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant36, readableDuration37);
        org.joda.time.Period period40 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period42 = period40.minusYears((int) (byte) -1);
        org.joda.time.Period period43 = period38.withFields((org.joda.time.ReadablePeriod) period40);
        int[] intArray44 = period38.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter45 = null;
        java.lang.String str46 = period38.toString(periodFormatter45);
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType55);
        org.joda.time.Period period58 = period56.withMillis((int) (short) 10);
        org.joda.time.Period period60 = period56.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType62 = period56.getFieldType((int) (short) 1);
        org.joda.time.Period period64 = period38.withField(durationFieldType62, (int) (short) 10);
        int int65 = period35.indexOf(durationFieldType62);
        org.joda.time.DurationFieldType durationFieldType67 = period35.getFieldType((int) (short) 1);
        int int68 = period27.get(durationFieldType67);
        int int69 = period24.get(durationFieldType67);
        org.joda.time.Period period71 = period10.withField(durationFieldType67, 0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT0.032S" + "'", str12, "PT0.032S");
        org.junit.Assert.assertNotNull(durationFieldTypeArray13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "PT0S" + "'", str46, "PT0S");
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(durationFieldType62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(durationFieldType67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(period71);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableDuration0, readableInstant1, periodType2);
        org.joda.time.PeriodType periodType4 = period3.getPeriodType();
        org.joda.time.Period period6 = period3.plusMonths(8);
        org.joda.time.Period period8 = period6.plusYears((int) (short) 1);
        org.joda.time.Period period10 = period8.plusHours((int) (byte) -1);
        org.joda.time.Period period12 = period8.minusSeconds((int) (byte) 10);
        org.joda.time.Period period14 = period8.minusYears((int) 'a');
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableDuration26, readableInstant27, periodType28);
        org.joda.time.PeriodType periodType30 = period29.getPeriodType();
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant24, readableInstant25, periodType30);
        org.joda.time.Period period32 = new org.joda.time.Period((long) '#', periodType30);
        org.joda.time.Period period33 = new org.joda.time.Period(0, (int) (short) 10, 97, 0, (int) (short) 0, 4, (int) (short) 10, 97, periodType30);
        org.joda.time.Period period34 = new org.joda.time.Period((java.lang.Object) period8, periodType30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period35 = new org.joda.time.Period((java.lang.Object) periodType30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(periodType30);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.Period period8 = period4.plusHours((-1));
        int int9 = period8.getSeconds();
        org.joda.time.Period period10 = period3.withFields((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Hours hours11 = period8.toStandardHours();
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = period8.normalizedStandard(periodType12);
        org.joda.time.Hours hours14 = period8.toStandardHours();
        org.joda.time.Period period15 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period15.toDurationTo(readableInstant16);
        org.joda.time.Period period19 = period15.plusHours((-1));
        org.joda.time.Period period21 = period19.plusYears((int) (short) -1);
        org.joda.time.Period period23 = period21.minusWeeks((int) (short) 100);
        org.joda.time.PeriodType periodType24 = period23.getPeriodType();
        org.joda.time.Period period25 = period8.withPeriodType(periodType24);
        org.joda.time.Period period27 = period8.plusSeconds((int) '#');
        org.joda.time.Period period29 = period27.withMillis((int) ' ');
        org.joda.time.Period period31 = period29.plusHours(40);
        org.joda.time.Period period33 = period29.withMillis((int) (byte) 100);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.minusYears((int) (byte) -1);
        org.joda.time.Duration duration4 = period1.toStandardDuration();
        org.joda.time.Period period6 = period1.minusDays(0);
        org.joda.time.Days days7 = period6.toStandardDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks1 = period0.toStandardWeeks();
        org.joda.time.Period period3 = period0.minusSeconds((int) (byte) 1);
        org.joda.time.Period period5 = period0.withYears((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((-1), (int) (byte) 10, 8, 1, (int) (byte) 10, 10, (int) (byte) 1, 1);
        org.joda.time.PeriodType periodType18 = period17.getPeriodType();
        org.joda.time.Period period19 = new org.joda.time.Period((long) (short) 100, periodType18);
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant6, readableInstant7, periodType18);
        org.joda.time.Period period22 = period20.minusSeconds((int) (short) 1);
        org.joda.time.PeriodType periodType23 = period20.getPeriodType();
        org.joda.time.Period period24 = new org.joda.time.Period((java.lang.Object) period0, periodType23);
        org.joda.time.Period period26 = period24.multipliedBy((int) 'a');
        org.joda.time.Period period28 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period30 = period28.withMillis((int) (byte) 100);
        org.joda.time.Period period32 = period28.withMonths((int) ' ');
        org.joda.time.Period period34 = period28.withDays((int) '4');
        org.joda.time.Period period35 = period26.minus((org.joda.time.ReadablePeriod) period28);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period35);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period11 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period13 = period11.minusYears((int) (byte) -1);
        org.joda.time.Duration duration14 = period11.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableDuration18, readableInstant19, periodType20);
        org.joda.time.PeriodType periodType22 = period21.getPeriodType();
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant16, readableInstant17, periodType22);
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration14, readableInstant15, periodType22);
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant8, readableInstant9, periodType22);
        org.joda.time.Period period26 = new org.joda.time.Period((int) (short) 10, (int) (short) 0, (int) (byte) 1, (int) (short) 1, 8, (int) (short) -1, 0, 100, periodType22);
        org.joda.time.Period period28 = period26.plusDays((int) (short) 10);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) (short) 1, chronology30);
        org.joda.time.Period period35 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period37 = period35.minusYears((int) (byte) -1);
        org.joda.time.Duration duration38 = period35.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableDuration42, readableInstant43, periodType44);
        org.joda.time.PeriodType periodType46 = period45.getPeriodType();
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant40, readableInstant41, periodType46);
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration38, readableInstant39, periodType46);
        org.joda.time.Period period49 = new org.joda.time.Period(1L, (long) (short) 10, periodType46);
        org.joda.time.Period period50 = period31.withPeriodType(periodType46);
        org.joda.time.Period period51 = period28.withFields((org.joda.time.ReadablePeriod) period31);
        org.joda.time.Period period53 = period51.minusMillis(52);
        org.joda.time.Period period55 = period51.plusDays((int) ' ');
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period13 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period15 = period13.minusYears((int) (byte) -1);
        org.joda.time.Duration duration16 = period13.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableDuration20, readableInstant21, periodType22);
        org.joda.time.PeriodType periodType24 = period23.getPeriodType();
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant18, readableInstant19, periodType24);
        org.joda.time.Period period26 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration16, readableInstant17, periodType24);
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType24);
        org.joda.time.Period period28 = new org.joda.time.Period((int) (short) 10, (int) (short) 0, (int) (byte) 1, (int) (short) 1, 8, (int) (short) -1, 0, 100, periodType24);
        org.joda.time.Period period30 = period28.plusDays((int) (short) 10);
        org.joda.time.PeriodType periodType31 = period28.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period32 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(periodType31);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationTo(readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period9 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period10 = period9.negated();
        org.joda.time.PeriodType periodType11 = period10.getPeriodType();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '4', (long) (short) 0, periodType11);
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5, periodType11);
        org.joda.time.Period period15 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period17 = period15.withMillis((int) (byte) 100);
        org.joda.time.Period period19 = period15.withMonths((int) ' ');
        org.joda.time.PeriodType periodType20 = period19.getPeriodType();
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration4, periodType20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableDuration41, readableInstant42, periodType43);
        org.joda.time.PeriodType periodType45 = period44.getPeriodType();
        org.joda.time.Period period46 = new org.joda.time.Period(readableInstant39, readableInstant40, periodType45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((long) (byte) -1, (long) (byte) 1, periodType45, chronology47);
        org.joda.time.Period period49 = new org.joda.time.Period((long) 10, periodType45);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period((long) (-1), (long) '#', periodType45, chronology50);
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant32, readableInstant33, periodType45);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((long) 10, periodType45, chronology53);
        org.joda.time.Period period55 = new org.joda.time.Period(10, 0, 100, (int) (byte) -1, 32, (int) (byte) -1, (int) (byte) 0, 100, periodType45);
        org.joda.time.Period period56 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant22, periodType45);
        org.joda.time.Period period57 = new org.joda.time.Period((long) (short) 1, periodType45);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType45);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.joda.time.Period period2 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period4 = period2.plusYears((int) '#');
        org.joda.time.format.PeriodFormatter periodFormatter5 = null;
        java.lang.String str6 = period2.toString(periodFormatter5);
        int int7 = period2.getWeeks();
        org.joda.time.PeriodType periodType8 = period2.getPeriodType();
        org.joda.time.Period period9 = new org.joda.time.Period((long) (byte) 0, periodType8);
        org.joda.time.Period period11 = period9.plusMillis((-10));
        int int12 = period9.getSeconds();
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT-1S" + "'", str6, "PT-1S");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.Period period13 = period9.plusYears((int) (byte) 10);
        org.joda.time.Period period14 = period13.normalizedStandard();
        int int15 = period13.getMinutes();
        org.joda.time.Period period17 = period13.withMonths((int) (byte) 100);
        org.joda.time.Period period19 = period17.plusSeconds(0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMinutes((int) (byte) 0);
        org.joda.time.Period period7 = period1.plusHours((int) ' ');
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((java.lang.Object) period1, chronology8);
        org.joda.time.Period period11 = period1.minusMillis(68);
        org.joda.time.Period period13 = period11.plusHours(52);
        org.joda.time.Period period15 = period11.minusMinutes(0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((-1), (int) (byte) 10, 8, 1, (int) (byte) 10, 10, (int) (byte) 1, 1);
        org.joda.time.PeriodType periodType13 = period12.getPeriodType();
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType13);
        org.joda.time.Period period15 = new org.joda.time.Period((long) 52, (long) 8, periodType13);
        org.junit.Assert.assertNotNull(periodType13);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.joda.time.Period period1 = org.joda.time.Period.years(4);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType4, chronology5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationFrom(readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.Period period13 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period15 = period13.minusYears((int) (byte) -1);
        org.joda.time.Period period16 = period11.withFields((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period18 = period13.withMinutes((int) (short) -1);
        org.joda.time.Period period19 = period6.plus((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Period period20 = period1.minus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period22 = period20.minusMillis((int) '4');
        org.joda.time.DurationFieldType durationFieldType24 = period20.getFieldType(0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(durationFieldType24);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        int int5 = period4.size();
        org.joda.time.Period period7 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period9 = period7.withMillis((int) (byte) 100);
        org.joda.time.Period period10 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationTo(readableInstant11);
        org.joda.time.Period period14 = period10.plusHours((-1));
        int int15 = period14.getSeconds();
        org.joda.time.Period period16 = period9.withFields((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Period period18 = period14.withMinutes((int) (short) 0);
        org.joda.time.Period period20 = period14.withMinutes(10);
        org.joda.time.Period period22 = period14.minusHours(100);
        org.joda.time.Period period23 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks24 = period23.toStandardWeeks();
        org.joda.time.Period period25 = period23.negated();
        org.joda.time.Period period27 = org.joda.time.Period.seconds(0);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType36);
        org.joda.time.Period period39 = period37.withMillis((int) (short) 10);
        org.joda.time.Period period41 = period37.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType43 = period37.getFieldType((int) (short) 1);
        int int44 = period27.indexOf(durationFieldType43);
        org.joda.time.Period period46 = period25.withFieldAdded(durationFieldType43, (int) 'a');
        org.joda.time.Period period48 = period14.withFieldAdded(durationFieldType43, 0);
        org.joda.time.Period period50 = period4.withField(durationFieldType43, (int) (byte) 1);
        org.joda.time.Period period52 = period50.minusHours((int) (byte) 1);
        int int54 = period50.getValue(4);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.plusYears((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period4.toDurationTo(readableInstant7);
        org.joda.time.Weeks weeks9 = period4.toStandardWeeks();
        org.joda.time.Period period11 = period4.minusMonths((int) (short) 100);
        org.joda.time.Period period13 = period4.plusHours(100);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableDuration7, readableInstant8, periodType9);
        org.joda.time.PeriodType periodType11 = period10.getPeriodType();
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant5, readableInstant6, periodType11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) (byte) -1, (long) (byte) 1, periodType11, chronology13);
        org.joda.time.Period period15 = new org.joda.time.Period((long) 10, periodType11);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) (-1), (long) '#', periodType11, chronology16);
        org.joda.time.Period period18 = period17.toPeriod();
        org.joda.time.Period period20 = period18.withHours((int) 'a');
        org.joda.time.Period period22 = period20.minusWeeks(97);
        org.joda.time.Period period23 = period20.negated();
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.joda.time.Period period8 = new org.joda.time.Period((-1), (int) (byte) 10, 8, 1, (int) (byte) 10, 10, (int) (byte) 1, 1);
        org.joda.time.Period period10 = period8.multipliedBy((int) (short) -1);
        int int11 = period10.getMonths();
        org.joda.time.Period period13 = period10.minusSeconds((int) (short) -1);
        org.joda.time.Period period15 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period17 = period15.withMillis((int) (byte) 100);
        org.joda.time.Period period19 = period17.plusSeconds((int) ' ');
        org.joda.time.Period period21 = period17.minusWeeks(10);
        org.joda.time.Period period23 = period17.minusMonths((int) '4');
        org.joda.time.Period period24 = period10.plus((org.joda.time.ReadablePeriod) period23);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-10) + "'", int11 == (-10));
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        org.joda.time.Period period4 = new org.joda.time.Period(52, 0, (int) ' ', (-4));
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.Period period8 = period4.plusHours((-1));
        int int9 = period8.getSeconds();
        org.joda.time.Period period10 = period3.withFields((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period12 = period8.withMinutes((int) (short) 0);
        org.joda.time.Period period14 = period8.plusYears((int) '4');
        org.joda.time.Period period16 = period14.minusMinutes(68);
        org.joda.time.Period period18 = period16.plusYears(68);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        org.joda.time.Period period4 = new org.joda.time.Period(0, (int) (byte) 1, (-90), 97);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period3.plusSeconds((int) ' ');
        org.joda.time.Period period7 = period3.minusWeeks(10);
        org.joda.time.Period period8 = period3.toPeriod();
        int int9 = period3.getMillis();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) -1, chronology1);
        int int3 = period2.getMonths();
        org.joda.time.format.PeriodFormatter periodFormatter4 = null;
        java.lang.String str5 = period2.toString(periodFormatter4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT-0.001S" + "'", str5, "PT-0.001S");
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period11, periodType12);
        org.joda.time.Period period15 = period13.withHours((int) 'a');
        org.joda.time.Period period17 = period13.withMonths(0);
        org.joda.time.Period period19 = period13.plusYears((-1));
        org.joda.time.Period period21 = period13.withWeeks((-35));
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) 1);
        org.joda.time.Period period2 = period1.toPeriod();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        org.joda.time.Period period7 = period5.withMinutes((int) (byte) -1);
        org.joda.time.Period period8 = period1.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableDuration17, readableInstant18, periodType19);
        org.joda.time.PeriodType periodType21 = period20.getPeriodType();
        org.joda.time.Period period22 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType21);
        org.joda.time.Period period24 = period22.minusMonths((int) (short) 100);
        org.joda.time.Period period26 = period24.multipliedBy((int) (byte) 10);
        int int27 = period24.getSeconds();
        int int28 = period24.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod29 = period24.toMutablePeriod();
        org.joda.time.Period period31 = period24.minusYears(40);
        org.joda.time.Period period32 = period8.minus((org.joda.time.ReadablePeriod) period31);
        org.joda.time.Period period34 = period32.minusMonths(135);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(mutablePeriod29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        org.joda.time.Period period2 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period2.negated();
        org.joda.time.PeriodType periodType4 = period3.getPeriodType();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 135, periodType4, chronology5);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(periodType4);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = org.joda.time.Period.ZERO;
        org.joda.time.Period period4 = period2.plusHours(100);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration6, periodType7);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration6, periodType9);
        org.joda.time.Period period12 = period10.multipliedBy(0);
        org.joda.time.Period period14 = period10.plusHours((int) (byte) 0);
        org.joda.time.Period period16 = period10.minusDays((int) '#');
        org.joda.time.Period period18 = period16.minusDays((-33));
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        org.joda.time.Period period4 = new org.joda.time.Period(35, (int) (short) -1, (-90), 8);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 1, chronology1);
        org.joda.time.Period period6 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period8 = period6.minusYears((int) (byte) -1);
        org.joda.time.Duration duration9 = period6.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableDuration13, readableInstant14, periodType15);
        org.joda.time.PeriodType periodType17 = period16.getPeriodType();
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant11, readableInstant12, periodType17);
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration9, readableInstant10, periodType17);
        org.joda.time.Period period20 = new org.joda.time.Period(1L, (long) (short) 10, periodType17);
        org.joda.time.Period period21 = period2.withPeriodType(periodType17);
        int int22 = period2.getSeconds();
        org.joda.time.Period period24 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period26 = period24.withMillis((int) (byte) 100);
        org.joda.time.Period period27 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period27.toDurationTo(readableInstant28);
        org.joda.time.Period period31 = period27.plusHours((-1));
        int int32 = period31.getSeconds();
        org.joda.time.Period period33 = period26.withFields((org.joda.time.ReadablePeriod) period31);
        org.joda.time.Hours hours34 = period31.toStandardHours();
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Period period36 = period31.normalizedStandard(periodType35);
        org.joda.time.Hours hours37 = period31.toStandardHours();
        org.joda.time.Period period38 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = period38.toDurationTo(readableInstant39);
        org.joda.time.Period period42 = period38.plusHours((-1));
        org.joda.time.Period period44 = period42.plusYears((int) (short) -1);
        org.joda.time.Period period46 = period44.minusWeeks((int) (short) 100);
        org.joda.time.PeriodType periodType47 = period46.getPeriodType();
        org.joda.time.Period period48 = period31.withPeriodType(periodType47);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period49 = new org.joda.time.Period((java.lang.Object) int22, periodType47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(hours34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(hours37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(period48);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        org.joda.time.Period period9 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period11 = period9.withMillis((int) (byte) 100);
        org.joda.time.Period period13 = period9.withMonths((int) ' ');
        org.joda.time.Period period15 = period9.withHours(100);
        int int16 = period15.getMinutes();
        org.joda.time.Period period18 = period15.withMinutes(0);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((java.lang.Object) period15, chronology19);
        org.joda.time.Period period22 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period24 = period22.withMillis((int) (byte) 100);
        org.joda.time.Period period26 = period22.withMinutes((int) (byte) 0);
        org.joda.time.MutablePeriod mutablePeriod27 = period26.toMutablePeriod();
        org.joda.time.Period period28 = period26.normalizedStandard();
        int int29 = period26.getMonths();
        org.joda.time.Period period31 = period26.withDays((int) (short) 100);
        org.joda.time.Period period32 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = period32.toDurationTo(readableInstant33);
        org.joda.time.Period period36 = period32.plusHours((-1));
        org.joda.time.Period period38 = period36.plusYears((int) (short) -1);
        org.joda.time.Period period40 = period36.plusMillis((int) ' ');
        org.joda.time.MutablePeriod mutablePeriod41 = period40.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant42, readableDuration43);
        org.joda.time.Period period46 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period48 = period46.minusYears((int) (byte) -1);
        org.joda.time.Period period49 = period44.withFields((org.joda.time.ReadablePeriod) period46);
        int[] intArray50 = period44.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter51 = null;
        java.lang.String str52 = period44.toString(periodFormatter51);
        org.joda.time.PeriodType periodType61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType61);
        org.joda.time.Period period64 = period62.withMillis((int) (short) 10);
        org.joda.time.Period period66 = period62.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType68 = period62.getFieldType((int) (short) 1);
        org.joda.time.Period period70 = period44.withField(durationFieldType68, (int) (short) 10);
        int int71 = period40.get(durationFieldType68);
        boolean boolean72 = period31.isSupported(durationFieldType68);
        int int73 = period20.indexOf(durationFieldType68);
        org.joda.time.Period period75 = period7.withField(durationFieldType68, 32);
        org.joda.time.Period period77 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period79 = period77.withMillis((int) (byte) 100);
        org.joda.time.Period period81 = period77.withMonths((int) ' ');
        org.joda.time.Period period83 = period77.withHours(100);
        org.joda.time.Period period85 = period83.withYears((int) ' ');
        org.joda.time.Period period87 = period85.withMonths((-1));
        org.joda.time.Period period89 = period87.minusMonths((int) '#');
        org.joda.time.Period period91 = period89.plusDays(68);
        org.joda.time.Period period92 = period7.minus((org.joda.time.ReadablePeriod) period91);
        org.joda.time.Period period94 = period7.plusSeconds(35);
        org.joda.time.Period period95 = period94.normalizedStandard();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(mutablePeriod27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(mutablePeriod41);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "PT0S" + "'", str52, "PT0S");
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(durationFieldType68);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertNotNull(period91);
        org.junit.Assert.assertNotNull(period92);
        org.junit.Assert.assertNotNull(period94);
        org.junit.Assert.assertNotNull(period95);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMinutes((int) (byte) 0);
        org.joda.time.MutablePeriod mutablePeriod6 = period5.toMutablePeriod();
        org.joda.time.Period period7 = period5.normalizedStandard();
        int int8 = period5.getMonths();
        org.joda.time.Period period10 = period5.withDays((int) (short) 100);
        org.joda.time.Period period12 = period5.minusYears((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds13 = period12.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Seconds as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.plusYears((int) (short) -1);
        int[] intArray7 = period4.getValues();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((java.lang.Object) period4, chronology8);
        org.joda.time.Period period10 = period9.toPeriod();
        org.joda.time.Period period12 = period10.minusMonths(52);
        org.joda.time.Period period14 = period10.plusYears(8);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0, 0, 0, 0, (-1), 0, 0, 0 });
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period6 = period4.minusYears((int) (byte) -1);
        org.joda.time.Period period7 = period2.withFields((org.joda.time.ReadablePeriod) period4);
        int[] intArray8 = period2.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter9 = null;
        java.lang.String str10 = period2.toString(periodFormatter9);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType19);
        org.joda.time.Period period22 = period20.withMillis((int) (short) 10);
        org.joda.time.Period period24 = period20.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType26 = period20.getFieldType((int) (short) 1);
        org.joda.time.Period period28 = period2.withField(durationFieldType26, (int) (short) 10);
        org.joda.time.MutablePeriod mutablePeriod29 = period28.toMutablePeriod();
        org.joda.time.Period period31 = period28.minusYears(100);
        org.joda.time.Period period33 = org.joda.time.Period.years((-1));
        org.joda.time.Period period35 = period33.withHours(0);
        org.joda.time.Period period37 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period39 = period37.withMillis((int) (byte) 100);
        org.joda.time.Period period40 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Duration duration42 = period40.toDurationTo(readableInstant41);
        org.joda.time.Period period44 = period40.plusHours((-1));
        int int45 = period44.getSeconds();
        org.joda.time.Period period46 = period39.withFields((org.joda.time.ReadablePeriod) period44);
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType55);
        org.joda.time.Period period58 = period56.withMillis((int) (short) 10);
        org.joda.time.Period period60 = period56.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType62 = period56.getFieldType((int) (short) 1);
        org.joda.time.Period period64 = period39.withField(durationFieldType62, 100);
        boolean boolean65 = period33.isSupported(durationFieldType62);
        org.joda.time.Period period67 = period28.withFieldAdded(durationFieldType62, 0);
        org.joda.time.Period period69 = period28.minusMinutes((int) (byte) -1);
        org.joda.time.Period period71 = period28.withHours(11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration72 = period71.toStandardDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Duration as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT0S" + "'", str10, "PT0S");
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(mutablePeriod29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(durationFieldType62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(period71);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period11, periodType12);
        org.joda.time.Period period15 = period11.withMonths(0);
        org.joda.time.Period period17 = period15.plusMonths(100);
        org.joda.time.Period period19 = period17.plusYears(10);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period23 = period21.withMillis((int) (byte) 100);
        org.joda.time.Period period24 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period24.toDurationTo(readableInstant25);
        org.joda.time.Period period28 = period24.plusHours((-1));
        int int29 = period28.getSeconds();
        org.joda.time.Period period30 = period23.withFields((org.joda.time.ReadablePeriod) period28);
        org.joda.time.Hours hours31 = period28.toStandardHours();
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Period period33 = period28.normalizedStandard(periodType32);
        org.joda.time.Period period35 = period28.withWeeks((int) (byte) 10);
        org.joda.time.Period period37 = period35.withHours(40);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period(0L, (long) (byte) -1, periodType40);
        org.joda.time.Period period43 = period41.withHours((int) '#');
        org.joda.time.Period period45 = org.joda.time.Period.millis((int) (byte) -1);
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableDuration47, readableInstant48, periodType49);
        org.joda.time.PeriodType periodType51 = period50.getPeriodType();
        org.joda.time.Period period52 = new org.joda.time.Period((long) 97, periodType51);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((java.lang.Object) period45, periodType51, chronology53);
        org.joda.time.Period period56 = period54.plusMillis(11);
        org.joda.time.DurationFieldType durationFieldType58 = period56.getFieldType(0);
        int int59 = period43.get(durationFieldType58);
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.Period period63 = new org.joda.time.Period(0L, (long) (byte) -1, periodType62);
        org.joda.time.Period period65 = period63.withHours((int) '#');
        org.joda.time.Period period67 = org.joda.time.Period.millis((int) (byte) -1);
        org.joda.time.ReadableDuration readableDuration69 = null;
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.PeriodType periodType71 = null;
        org.joda.time.Period period72 = new org.joda.time.Period(readableDuration69, readableInstant70, periodType71);
        org.joda.time.PeriodType periodType73 = period72.getPeriodType();
        org.joda.time.Period period74 = new org.joda.time.Period((long) 97, periodType73);
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.Period period76 = new org.joda.time.Period((java.lang.Object) period67, periodType73, chronology75);
        org.joda.time.Period period78 = period76.plusMillis(11);
        org.joda.time.DurationFieldType durationFieldType80 = period78.getFieldType(0);
        int int81 = period65.get(durationFieldType80);
        int int82 = period43.get(durationFieldType80);
        boolean boolean83 = period37.isSupported(durationFieldType80);
        int int84 = period19.get(durationFieldType80);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(hours31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(durationFieldType58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(periodType73);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(durationFieldType80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 20 + "'", int84 == 20);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 0, chronology1);
        org.joda.time.Period period4 = period2.multipliedBy(0);
        org.joda.time.format.PeriodFormatter periodFormatter5 = null;
        java.lang.String str6 = period2.toString(periodFormatter5);
        int int7 = period2.getWeeks();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT0S" + "'", str6, "PT0S");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType2, chronology3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant7, readableDuration8);
        org.joda.time.Period period11 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period13 = period11.minusYears((int) (byte) -1);
        org.joda.time.Period period14 = period9.withFields((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period16 = period11.withMinutes((int) (short) -1);
        org.joda.time.Period period17 = period4.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Period period19 = org.joda.time.Period.years((int) (short) 10);
        org.joda.time.Period period21 = period19.withDays((int) (byte) -1);
        org.joda.time.Period period23 = period19.withYears((int) (byte) 10);
        org.joda.time.Period period24 = period17.plus((org.joda.time.ReadablePeriod) period23);
        int int25 = period23.getYears();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 0, chronology1);
        org.joda.time.Period period4 = period2.multipliedBy(0);
        org.joda.time.Period period6 = period4.withMonths(10);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType15);
        org.joda.time.Period period18 = period16.withMillis((int) (short) 10);
        org.joda.time.Period period20 = period16.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType22 = period16.getFieldType((int) (short) 1);
        org.joda.time.format.PeriodFormatter periodFormatter23 = null;
        java.lang.String str24 = period16.toString(periodFormatter23);
        org.joda.time.Period period26 = period16.minusSeconds(4);
        org.joda.time.Period period31 = new org.joda.time.Period((int) (short) 0, (int) (byte) 1, 8, (int) ' ');
        org.joda.time.Period period33 = period31.minusMonths((int) (byte) -1);
        org.joda.time.Period period35 = period33.minusSeconds((int) '#');
        org.joda.time.Period period36 = period26.plus((org.joda.time.ReadablePeriod) period35);
        org.joda.time.Period period37 = period6.plus((org.joda.time.ReadablePeriod) period36);
        int int38 = period37.getMillis();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "P10Y32M-1WT35H100M10.001S" + "'", str24, "P10Y32M-1WT35H100M10.001S");
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 33 + "'", int38 == 33);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        org.joda.time.Period period9 = period7.withSeconds((int) (short) 1);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant10, readableDuration11);
        org.joda.time.Period period14 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period16 = period14.minusYears((int) (byte) -1);
        org.joda.time.Period period17 = period12.withFields((org.joda.time.ReadablePeriod) period14);
        int[] intArray18 = period12.getValues();
        org.joda.time.Period period19 = period7.plus((org.joda.time.ReadablePeriod) period12);
        int int20 = period7.getMonths();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((java.lang.Object) period7, chronology21);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        int int1 = period0.getHours();
        org.joda.time.Period period3 = period0.multipliedBy((-1));
        org.joda.time.Period period5 = period0.plusHours((int) (byte) 0);
        int int6 = period5.getMonths();
        org.joda.time.Period period8 = period5.minusMinutes(11);
        org.joda.time.Period period10 = period8.plusWeeks((-11));
        int int11 = period10.getMillis();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((-1), (int) (byte) 10, 8, 1, (int) (byte) 10, 10, (int) (byte) 1, 1);
        org.joda.time.PeriodType periodType11 = period10.getPeriodType();
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType11);
        org.joda.time.Period period13 = period12.toPeriod();
        org.joda.time.Period period14 = period13.negated();
        org.joda.time.Hours hours15 = period13.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period18 = period13.withFieldAdded(durationFieldType16, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(hours15);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period4 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period6 = period4.minusYears((int) (byte) -1);
        org.joda.time.Duration duration7 = period4.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableDuration11, readableInstant12, periodType13);
        org.joda.time.PeriodType periodType15 = period14.getPeriodType();
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant9, readableInstant10, periodType15);
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration7, readableInstant8, periodType15);
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant1, readableInstant2, periodType15);
        org.joda.time.Period period19 = new org.joda.time.Period((long) ' ', periodType15);
        org.joda.time.Weeks weeks20 = period19.toStandardWeeks();
        int int21 = period19.getMillis();
        org.joda.time.Period period23 = period19.minusWeeks((-3));
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(period23);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        org.joda.time.Period period4 = new org.joda.time.Period((-11), (int) (byte) -1, 8, 11);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) 100, 40, 32, (int) (short) 1, (int) (byte) 10, 35, (int) (byte) 100, 4);
        org.joda.time.Period period10 = period8.plusWeeks((-100));
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.plusYears((int) (short) -1);
        int[] intArray7 = period4.getValues();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((java.lang.Object) period4, chronology8);
        org.joda.time.Period period10 = period9.toPeriod();
        org.joda.time.DurationFieldType[] durationFieldTypeArray11 = period9.getFieldTypes();
        org.joda.time.Period period12 = period9.negated();
        org.joda.time.format.PeriodFormatter periodFormatter13 = null;
        java.lang.String str14 = period9.toString(periodFormatter13);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0, 0, 0, 0, (-1), 0, 0, 0 });
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(durationFieldTypeArray11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT-1H" + "'", str14, "PT-1H");
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.Period period8 = period4.plusHours((-1));
        int int9 = period8.getSeconds();
        org.joda.time.Period period10 = period3.withFields((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period12 = period8.withMinutes((int) (short) 0);
        org.joda.time.Period period14 = period8.withMinutes(10);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant15, readableDuration16);
        org.joda.time.Period period19 = period17.plusDays((int) 'a');
        org.joda.time.Period period20 = period8.plus((org.joda.time.ReadablePeriod) period19);
        int int21 = period8.getYears();
        org.joda.time.Period period23 = period8.plusHours((int) (short) 1);
        org.joda.time.Period period24 = new org.joda.time.Period((java.lang.Object) period23);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(period23);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        org.joda.time.Period period1 = new org.joda.time.Period((long) ' ');
        org.joda.time.Period period3 = period1.withDays(40);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.Period period8 = period4.plusHours((-1));
        int int9 = period8.getSeconds();
        org.joda.time.Period period10 = period3.withFields((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period12 = period8.withMinutes((int) (short) 0);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period8, chronology13);
        org.joda.time.Period period15 = new org.joda.time.Period((java.lang.Object) period14);
        org.joda.time.Period period17 = period15.withYears(40);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        org.joda.time.Period period9 = period7.withYears((int) ' ');
        org.joda.time.Period period11 = period9.withMonths((-1));
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationFrom(readableInstant12);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration13);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (byte) -1);
        int int2 = period1.getYears();
        org.joda.time.Period period4 = period1.plusYears((-97));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(period4);
    }
}

