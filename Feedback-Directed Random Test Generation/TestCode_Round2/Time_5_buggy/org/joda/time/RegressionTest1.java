package org.joda.time;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 0, (long) (short) 10, chronology2);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType4, chronology5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationFrom(readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationTo(readableInstant11);
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant9, (org.joda.time.ReadableDuration) duration12);
        org.joda.time.Weeks weeks14 = period13.toStandardWeeks();
        org.joda.time.Period period15 = period13.toPeriod();
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((java.lang.Object) period15, periodType16);
        org.joda.time.Period period19 = period17.plusHours(8);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableDuration24, readableInstant25, periodType26);
        org.joda.time.PeriodType periodType28 = period27.getPeriodType();
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant22, readableInstant23, periodType28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) (byte) -1, (long) (byte) 1, periodType28, chronology30);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((java.lang.Object) period19, periodType28, chronology32);
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration8, periodType28);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((long) 4, chronology38);
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType48);
        org.joda.time.Period period51 = period49.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period((java.lang.Object) period51, periodType52);
        org.joda.time.Period period55 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period57 = period55.withMillis((int) (byte) 100);
        org.joda.time.Period period59 = period55.withMonths((int) ' ');
        org.joda.time.Period period61 = period55.withHours(100);
        org.joda.time.Period period62 = period51.withFields((org.joda.time.ReadablePeriod) period55);
        org.joda.time.Period period64 = period62.plusMonths(100);
        org.joda.time.PeriodType periodType75 = null;
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.Period period77 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType75, chronology76);
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.Duration duration79 = period77.toDurationFrom(readableInstant78);
        org.joda.time.ReadableInstant readableInstant80 = null;
        org.joda.time.ReadableDuration readableDuration81 = null;
        org.joda.time.Period period82 = new org.joda.time.Period(readableInstant80, readableDuration81);
        org.joda.time.Period period84 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period86 = period84.minusYears((int) (byte) -1);
        org.joda.time.Period period87 = period82.withFields((org.joda.time.ReadablePeriod) period84);
        org.joda.time.Period period89 = period84.withMinutes((int) (short) -1);
        org.joda.time.Period period90 = period77.plus((org.joda.time.ReadablePeriod) period89);
        org.joda.time.PeriodType periodType91 = period90.getPeriodType();
        org.joda.time.Period period92 = new org.joda.time.Period((int) '4', (int) 'a', (int) (short) -1, 100, 100, 10, (int) '4', 10, periodType91);
        org.joda.time.Chronology chronology93 = null;
        org.joda.time.Period period94 = new org.joda.time.Period((java.lang.Object) period64, periodType91, chronology93);
        org.joda.time.Period period95 = period39.normalizedStandard(periodType91);
        org.joda.time.Period period96 = new org.joda.time.Period(readableInstant35, readableInstant36, periodType91);
        org.joda.time.Period period97 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration8, periodType91);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(duration79);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertNotNull(period90);
        org.junit.Assert.assertNotNull(periodType91);
        org.junit.Assert.assertNotNull(period95);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        int int5 = period4.size();
        org.joda.time.Period period6 = period4.negated();
        org.joda.time.Period period8 = period4.plusMillis((int) (byte) 10);
        org.joda.time.Period period9 = new org.joda.time.Period((java.lang.Object) period4);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period6 = period4.minusYears((int) (byte) -1);
        org.joda.time.Period period7 = period2.withFields((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period9 = period7.minusMillis(35);
        org.joda.time.Period period11 = period9.withDays((int) ' ');
        org.joda.time.Period period13 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period15 = period13.withMillis((int) (byte) 100);
        org.joda.time.Period period17 = period15.plusSeconds((int) ' ');
        org.joda.time.Period period19 = period15.minusWeeks(10);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableDuration21);
        org.joda.time.Period period24 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period26 = period24.minusYears((int) (byte) -1);
        org.joda.time.Period period27 = period22.withFields((org.joda.time.ReadablePeriod) period24);
        int[] intArray28 = period22.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter29 = null;
        java.lang.String str30 = period22.toString(periodFormatter29);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType39);
        org.joda.time.Period period42 = period40.withMillis((int) (short) 10);
        org.joda.time.Period period44 = period40.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType46 = period40.getFieldType((int) (short) 1);
        org.joda.time.Period period48 = period22.withField(durationFieldType46, (int) (short) 10);
        int int49 = period19.indexOf(durationFieldType46);
        int int50 = period9.indexOf(durationFieldType46);
        int int51 = period9.getDays();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PT0S" + "'", str30, "PT0S");
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(durationFieldType46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 35, (long) 10, chronology2);
        org.joda.time.Period period5 = period3.withSeconds(1);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period3.toDurationFrom(readableInstant6);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration7);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
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
        org.joda.time.Period period18 = period4.toPeriod();
        org.joda.time.Period period20 = period18.plusWeeks((int) (byte) 100);
        int int21 = period20.getDays();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) (byte) 100);
        org.joda.time.Period period3 = period1.withWeeks((int) '#');
        org.joda.time.format.PeriodFormatter periodFormatter4 = null;
        java.lang.String str5 = period3.toString(periodFormatter4);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P35WT100S" + "'", str5, "P35WT100S");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.joda.time.Period period2 = new org.joda.time.Period((-1L), (long) ' ');
        org.joda.time.Period period3 = period2.toPeriod();
        int[] intArray4 = period3.getValues();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 33 });
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 'a', chronology1);
        java.lang.String str3 = period2.toString();
        org.joda.time.Hours hours4 = period2.toStandardHours();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0.097S" + "'", str3, "PT0.097S");
        org.junit.Assert.assertNotNull(hours4);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 11, 0L, chronology2);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (-35));
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) 4, chronology3);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType13);
        org.joda.time.Period period16 = period14.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((java.lang.Object) period16, periodType17);
        org.joda.time.Period period20 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period22 = period20.withMillis((int) (byte) 100);
        org.joda.time.Period period24 = period20.withMonths((int) ' ');
        org.joda.time.Period period26 = period20.withHours(100);
        org.joda.time.Period period27 = period16.withFields((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Period period29 = period27.plusMonths(100);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType40, chronology41);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Duration duration44 = period42.toDurationFrom(readableInstant43);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant45, readableDuration46);
        org.joda.time.Period period49 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period51 = period49.minusYears((int) (byte) -1);
        org.joda.time.Period period52 = period47.withFields((org.joda.time.ReadablePeriod) period49);
        org.joda.time.Period period54 = period49.withMinutes((int) (short) -1);
        org.joda.time.Period period55 = period42.plus((org.joda.time.ReadablePeriod) period54);
        org.joda.time.PeriodType periodType56 = period55.getPeriodType();
        org.joda.time.Period period57 = new org.joda.time.Period((int) '4', (int) 'a', (int) (short) -1, 100, 100, 10, (int) '4', 10, periodType56);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period((java.lang.Object) period29, periodType56, chronology58);
        org.joda.time.Period period60 = period4.normalizedStandard(periodType56);
        org.joda.time.Period period61 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType56);
        org.joda.time.Period period63 = period61.withDays((int) (byte) 0);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(periodType56);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period63);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Period period3 = org.joda.time.Period.millis((int) (byte) -1);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableDuration5, readableInstant6, periodType7);
        org.joda.time.PeriodType periodType9 = period8.getPeriodType();
        org.joda.time.Period period10 = new org.joda.time.Period((long) 97, periodType9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((java.lang.Object) period3, periodType9, chronology11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (short) 0);
        org.joda.time.Period period3 = period1.minusHours((int) (byte) -1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 10, periodType5);
        org.joda.time.Period period8 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period10 = period8.withMillis((int) (byte) 100);
        org.joda.time.Period period11 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationTo(readableInstant12);
        org.joda.time.Period period15 = period11.plusHours((-1));
        int int16 = period15.getSeconds();
        org.joda.time.Period period17 = period10.withFields((org.joda.time.ReadablePeriod) period15);
        int int18 = period15.getHours();
        org.joda.time.Period period19 = period6.minus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Period period21 = period6.multipliedBy((int) (byte) 100);
        org.joda.time.Period period22 = period6.toPeriod();
        org.joda.time.Period period24 = org.joda.time.Period.minutes(35);
        org.joda.time.Period period27 = new org.joda.time.Period((long) (short) 10, (long) (short) 0);
        org.joda.time.Period period28 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = period28.toDurationTo(readableInstant29);
        org.joda.time.Period period32 = period28.plusHours((-1));
        int int33 = period32.getSeconds();
        org.joda.time.Period period35 = period32.withSeconds(10);
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
        org.joda.time.Period period66 = period35.withFieldAdded(durationFieldType62, (int) (byte) 10);
        int int67 = period27.indexOf(durationFieldType62);
        boolean boolean68 = period24.isSupported(durationFieldType62);
        org.joda.time.Period period70 = period6.withField(durationFieldType62, (int) '4');
        boolean boolean71 = period1.isSupported(durationFieldType62);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
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
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(8);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) '#');
        org.joda.time.MutablePeriod mutablePeriod2 = period1.toMutablePeriod();
        org.joda.time.Period period4 = period1.minusSeconds((int) 'a');
        org.joda.time.Period period6 = period1.plusWeeks((int) (short) 0);
        int int7 = period1.getDays();
        java.lang.String str8 = period1.toString();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT35S" + "'", str8, "PT35S");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period11, periodType12);
        org.joda.time.Period period15 = period11.withMonths(0);
        org.joda.time.Period period17 = period15.minusWeeks((int) (short) -1);
        org.joda.time.Period period19 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period21 = period19.withMillis((int) (byte) 100);
        org.joda.time.Period period22 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationTo(readableInstant23);
        org.joda.time.Period period26 = period22.plusHours((-1));
        int int27 = period26.getSeconds();
        org.joda.time.Period period28 = period21.withFields((org.joda.time.ReadablePeriod) period26);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableDuration31, readableInstant32, periodType33);
        org.joda.time.PeriodType periodType35 = period34.getPeriodType();
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant29, readableInstant30, periodType35);
        org.joda.time.Period period37 = period21.normalizedStandard(periodType35);
        org.joda.time.Period period39 = period21.minusYears((int) (byte) 1);
        org.joda.time.Period period40 = period17.plus((org.joda.time.ReadablePeriod) period39);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType42 = period17.getFieldType(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period40);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType10, chronology11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period12.toDurationFrom(readableInstant13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant15, readableDuration16);
        org.joda.time.Period period19 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period21 = period19.minusYears((int) (byte) -1);
        org.joda.time.Period period22 = period17.withFields((org.joda.time.ReadablePeriod) period19);
        org.joda.time.Period period24 = period19.withMinutes((int) (short) -1);
        org.joda.time.Period period25 = period12.plus((org.joda.time.ReadablePeriod) period24);
        org.joda.time.PeriodType periodType26 = period25.getPeriodType();
        org.joda.time.Period period27 = new org.joda.time.Period((int) '4', (int) 'a', (int) (short) -1, 100, 100, 10, (int) '4', 10, periodType26);
        org.joda.time.Period period29 = period27.plusMillis((-1));
        int int30 = period29.getMinutes();
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((int) ' ', 0, (int) (short) 100, 100, (int) (byte) 10, 100, (-1), (int) (short) 100, periodType39);
        org.joda.time.Period period42 = period40.minusYears((int) '#');
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Period period47 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period49 = period47.minusYears((int) (byte) -1);
        org.joda.time.Duration duration50 = period47.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period(readableDuration54, readableInstant55, periodType56);
        org.joda.time.PeriodType periodType58 = period57.getPeriodType();
        org.joda.time.Period period59 = new org.joda.time.Period(readableInstant52, readableInstant53, periodType58);
        org.joda.time.Period period60 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration50, readableInstant51, periodType58);
        org.joda.time.Period period61 = new org.joda.time.Period(readableInstant44, readableInstant45, periodType58);
        org.joda.time.Period period62 = new org.joda.time.Period((long) (short) 1, periodType58);
        org.joda.time.Period period63 = period42.normalizedStandard(periodType58);
        org.joda.time.Chronology chronology64 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period65 = new org.joda.time.Period((java.lang.Object) int30, periodType58, chronology64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertNotNull(period63);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) (short) 1, chronology3);
        int int5 = period4.getMonths();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant7, readableInstant8);
        org.joda.time.Period period10 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationTo(readableInstant11);
        boolean boolean13 = period9.equals((java.lang.Object) duration12);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((int) ' ', 0, (int) (short) 100, 100, (int) (byte) 10, 100, (-1), (int) (short) 100, periodType22);
        org.joda.time.Period period25 = period23.minusYears((int) '#');
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Period period30 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period32 = period30.minusYears((int) (byte) -1);
        org.joda.time.Duration duration33 = period30.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period(readableDuration37, readableInstant38, periodType39);
        org.joda.time.PeriodType periodType41 = period40.getPeriodType();
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant35, readableInstant36, periodType41);
        org.joda.time.Period period43 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration33, readableInstant34, periodType41);
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant27, readableInstant28, periodType41);
        org.joda.time.Period period45 = new org.joda.time.Period((long) (short) 1, periodType41);
        org.joda.time.Period period46 = period25.normalizedStandard(periodType41);
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant6, (org.joda.time.ReadableDuration) duration12, periodType41);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period((java.lang.Object) period4, periodType41, chronology48);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period50 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(period46);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.plusYears((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period4.toDurationTo(readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) 35, chronology12);
        int int14 = period13.size();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableDuration15, readableInstant16, periodType17);
        org.joda.time.PeriodType periodType19 = period18.getPeriodType();
        org.joda.time.Period period21 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period23 = period21.withMillis((int) (byte) 100);
        org.joda.time.Period period24 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period24.toDurationTo(readableInstant25);
        org.joda.time.Period period28 = period24.plusHours((-1));
        int int29 = period28.getSeconds();
        org.joda.time.Period period30 = period23.withFields((org.joda.time.ReadablePeriod) period28);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(readableDuration33, readableInstant34, periodType35);
        org.joda.time.PeriodType periodType37 = period36.getPeriodType();
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant31, readableInstant32, periodType37);
        org.joda.time.Period period39 = period23.normalizedStandard(periodType37);
        org.joda.time.Period period40 = period18.normalizedStandard(periodType37);
        org.joda.time.Period period41 = period13.normalizedStandard(periodType37);
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration8, readableInstant9, periodType37);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period41);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (byte) -1);
        int int2 = period1.size();
        org.joda.time.Period period4 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period6 = period4.withMillis((int) (byte) 100);
        org.joda.time.Period period7 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period7.toDurationTo(readableInstant8);
        org.joda.time.Period period11 = period7.plusHours((-1));
        int int12 = period11.getSeconds();
        org.joda.time.Period period13 = period6.withFields((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period15 = period13.plusMillis((int) '#');
        org.joda.time.Period period17 = period15.plusMinutes((int) (short) -1);
        org.joda.time.Period period18 = period1.minus((org.joda.time.ReadablePeriod) period17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes19 = period1.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType10, chronology11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period12.toDurationFrom(readableInstant13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant15, readableDuration16);
        org.joda.time.Period period19 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period21 = period19.minusYears((int) (byte) -1);
        org.joda.time.Period period22 = period17.withFields((org.joda.time.ReadablePeriod) period19);
        org.joda.time.Period period24 = period19.withMinutes((int) (short) -1);
        org.joda.time.Period period25 = period12.plus((org.joda.time.ReadablePeriod) period24);
        org.joda.time.PeriodType periodType26 = period25.getPeriodType();
        org.joda.time.Period period27 = new org.joda.time.Period((int) '4', (int) 'a', (int) (short) -1, 100, 100, 10, (int) '4', 10, periodType26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration28 = period27.toStandardDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Duration as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(periodType26);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
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
        org.joda.time.Duration duration16 = period8.toDurationFrom(readableInstant15);
        org.joda.time.Period period17 = period8.toPeriod();
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType20, chronology21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationFrom(readableInstant23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableDuration26);
        org.joda.time.Period period29 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period31 = period29.minusYears((int) (byte) -1);
        org.joda.time.Period period32 = period27.withFields((org.joda.time.ReadablePeriod) period29);
        org.joda.time.Period period34 = period29.withMinutes((int) (short) -1);
        org.joda.time.Period period35 = period22.plus((org.joda.time.ReadablePeriod) period34);
        org.joda.time.PeriodType periodType36 = period35.getPeriodType();
        org.joda.time.Period period37 = new org.joda.time.Period((java.lang.Object) period8, periodType36);
        org.joda.time.Period period39 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period41 = period39.plusDays((int) (byte) 0);
        org.joda.time.Period period45 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period46 = period45.negated();
        org.joda.time.PeriodType periodType47 = period46.getPeriodType();
        org.joda.time.Period period48 = new org.joda.time.Period((long) '4', (long) (short) 0, periodType47);
        org.joda.time.Period period49 = period39.normalizedStandard(periodType47);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period50 = new org.joda.time.Period((java.lang.Object) periodType36, periodType47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(period49);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period2 = period1.negated();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableDuration4, readableInstant5, periodType6);
        org.joda.time.PeriodType periodType8 = period7.getPeriodType();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) (byte) 10, periodType8, chronology9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((java.lang.Object) period2, periodType8, chronology11);
        org.joda.time.Period period14 = period12.minusMonths((int) 'a');
        org.joda.time.Period period15 = period14.negated();
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
        org.joda.time.MutablePeriod mutablePeriod45 = period44.toMutablePeriod();
        org.joda.time.Period period47 = period44.minusYears(100);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period(readableDuration50, readableInstant51, periodType52);
        org.joda.time.PeriodType periodType54 = period53.getPeriodType();
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant48, readableInstant49, periodType54);
        org.joda.time.Period period57 = period55.withMinutes((int) '#');
        org.joda.time.Period period59 = org.joda.time.Period.seconds(0);
        org.joda.time.PeriodType periodType68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType68);
        org.joda.time.Period period71 = period69.withMillis((int) (short) 10);
        org.joda.time.Period period73 = period69.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType75 = period69.getFieldType((int) (short) 1);
        int int76 = period59.indexOf(durationFieldType75);
        boolean boolean77 = period55.isSupported(durationFieldType75);
        boolean boolean78 = period44.isSupported(durationFieldType75);
        int int79 = period14.indexOf(durationFieldType75);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period14);
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
        org.junit.Assert.assertNotNull(mutablePeriod45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(durationFieldType75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        int[] intArray5 = period4.getValues();
        org.joda.time.Period period7 = period4.minusYears((int) (byte) 100);
        int int8 = period4.getMinutes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        org.joda.time.Weeks weeks5 = period4.toStandardWeeks();
        org.joda.time.Period period7 = period4.minusDays(100);
        int int8 = period4.getDays();
        org.joda.time.Period period10 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period12 = period10.plusYears((int) '#');
        org.joda.time.Period period17 = new org.joda.time.Period((int) (byte) 10, (int) (byte) 100, (int) '#', (int) (byte) 10);
        org.joda.time.Period period18 = period12.plus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Period period20 = period18.plusMonths(0);
        org.joda.time.Period period21 = period4.minus((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Period period23 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period25 = period23.withMillis((int) (byte) 100);
        org.joda.time.Period period26 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = period26.toDurationTo(readableInstant27);
        org.joda.time.Period period30 = period26.plusHours((-1));
        int int31 = period30.getSeconds();
        org.joda.time.Period period32 = period25.withFields((org.joda.time.ReadablePeriod) period30);
        org.joda.time.Period period34 = period32.plusMillis((int) '#');
        org.joda.time.Period period39 = new org.joda.time.Period((int) (byte) 10, (int) (byte) 100, (int) '#', (int) (byte) 10);
        org.joda.time.Period period40 = period32.plus((org.joda.time.ReadablePeriod) period39);
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((int) ' ', 0, (int) (short) 100, 100, (int) (byte) 10, 100, (-1), (int) (short) 100, periodType49);
        org.joda.time.Period period52 = period50.minusYears((int) '#');
        org.joda.time.Period period54 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period56 = period54.withMillis((int) (byte) 100);
        org.joda.time.Period period57 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.Duration duration59 = period57.toDurationTo(readableInstant58);
        org.joda.time.Period period61 = period57.plusHours((-1));
        int int62 = period61.getSeconds();
        org.joda.time.Period period63 = period56.withFields((org.joda.time.ReadablePeriod) period61);
        org.joda.time.PeriodType periodType72 = null;
        org.joda.time.Period period73 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType72);
        org.joda.time.Period period75 = period73.withMillis((int) (short) 10);
        org.joda.time.Period period77 = period73.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType79 = period73.getFieldType((int) (short) 1);
        org.joda.time.Period period81 = period56.withField(durationFieldType79, 100);
        int int82 = period50.indexOf(durationFieldType79);
        int int83 = period39.get(durationFieldType79);
        org.joda.time.Period period85 = period18.withFieldAdded(durationFieldType79, 4);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(durationFieldType79);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(period85);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.Period period8 = period4.plusHours((-1));
        int int9 = period8.getSeconds();
        org.joda.time.Period period10 = period3.withFields((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period12 = period10.withMonths(1);
        org.joda.time.Period period14 = period12.multipliedBy((-1));
        org.joda.time.PeriodType periodType15 = period12.getPeriodType();
        org.joda.time.Period period16 = period12.toPeriod();
        java.lang.String str17 = period16.toString();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "P1MT-1H" + "'", str17, "P1MT-1H");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 32, (long) 1, chronology2);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.joda.time.Period period1 = org.joda.time.Period.days((-1));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (byte) 0, (int) (byte) -1, 35, 8);
        org.joda.time.Period period6 = period4.withSeconds((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationFrom(readableInstant7);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        int int2 = period1.getSeconds();
        int int3 = period1.getYears();
        org.joda.time.Period period5 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period7 = period5.withMillis((int) (byte) 100);
        org.joda.time.Period period9 = period5.withMonths((int) ' ');
        org.joda.time.Period period11 = period5.withHours(100);
        java.lang.String str12 = period11.toString();
        org.joda.time.Period period13 = period1.plus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period15 = period11.minusWeeks(0);
        org.joda.time.Period period17 = period11.withHours(0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT100H" + "'", str12, "PT100H");
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        int int4 = period3.getSeconds();
        org.joda.time.Period period5 = period3.toPeriod();
        org.joda.time.Period period7 = period5.minusMonths((int) ' ');
        org.joda.time.Period period9 = period5.minusSeconds((int) (byte) 1);
        int int10 = period5.getHours();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 10, (long) 10);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.joda.time.Period period1 = org.joda.time.Period.days(35);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
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
        org.joda.time.Period period16 = period14.minusHours((int) (short) 1);
        org.joda.time.Seconds seconds17 = period16.toStandardSeconds();
        org.joda.time.Period period19 = period16.withYears((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period20 = new org.joda.time.Period((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (byte) 1);
        org.joda.time.Period period3 = period1.plusYears(40);
        int int4 = period3.getMinutes();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.joda.time.Period period4 = new org.joda.time.Period(1, 0, (int) (short) 1, (int) (short) 10);
        org.joda.time.Period period6 = period4.minusYears((int) (short) -1);
        org.joda.time.Period period7 = period4.negated();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 'a', chronology1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationTo(readableInstant3);
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) period2);
        org.junit.Assert.assertNotNull(duration4);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period7 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period9 = period7.withMillis((int) (byte) 100);
        org.joda.time.Period period10 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationTo(readableInstant11);
        org.joda.time.Period period14 = period10.plusHours((-1));
        int int15 = period14.getSeconds();
        org.joda.time.Period period16 = period9.withFields((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Period period18 = period16.withMonths(1);
        org.joda.time.Period period20 = period18.multipliedBy((-1));
        org.joda.time.PeriodType periodType21 = period18.getPeriodType();
        org.joda.time.Period period22 = new org.joda.time.Period((long) ' ', (long) (byte) 1, periodType21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((long) ' ', (long) (byte) -1, periodType21, chronology23);
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType27 = period25.getFieldType((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (byte) 100);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) 1, 10L, periodType2, chronology3);
        org.joda.time.Period period6 = period4.minusWeeks(35);
        org.joda.time.Period period8 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period10 = period8.withMillis((int) (byte) 100);
        org.joda.time.Period period11 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationTo(readableInstant12);
        org.joda.time.Period period15 = period11.plusHours((-1));
        int int16 = period15.getSeconds();
        org.joda.time.Period period17 = period10.withFields((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Period period19 = period15.withMinutes((int) (short) 0);
        org.joda.time.Period period21 = period15.withMinutes(10);
        org.joda.time.Period period23 = period15.minusHours(100);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant24, readableDuration25);
        org.joda.time.Period period28 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period30 = period28.minusYears((int) (byte) -1);
        org.joda.time.Period period31 = period26.withFields((org.joda.time.ReadablePeriod) period28);
        org.joda.time.Period period33 = period26.withHours((int) (short) 0);
        org.joda.time.Period period35 = period26.multipliedBy((int) (short) 10);
        boolean boolean36 = period15.equals((java.lang.Object) period26);
        int int37 = period15.getSeconds();
        org.joda.time.Period period38 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = period38.toDurationTo(readableInstant39);
        org.joda.time.Period period42 = period38.plusHours((-1));
        org.joda.time.Period period44 = period42.withMillis((int) (short) 1);
        org.joda.time.Period period46 = period42.minusMinutes((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Period period57 = new org.joda.time.Period((-1), (int) (byte) 10, 8, 1, (int) (byte) 10, 10, (int) (byte) 1, 1);
        org.joda.time.PeriodType periodType58 = period57.getPeriodType();
        org.joda.time.Period period59 = new org.joda.time.Period(readableInstant47, readableInstant48, periodType58);
        org.joda.time.Period period60 = new org.joda.time.Period((java.lang.Object) period42, periodType58);
        org.joda.time.Period period61 = period15.normalizedStandard(periodType58);
        org.joda.time.Period period62 = period6.withPeriodType(periodType58);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period62);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.joda.time.Period period1 = org.joda.time.Period.parse("P35Y7M3W4DT12H40M10.001S");
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType16);
        org.joda.time.Period period19 = period17.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((java.lang.Object) period19, periodType20);
        org.joda.time.Period period23 = period21.withHours((int) 'a');
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType27, chronology28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = period29.toDurationFrom(readableInstant30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Period period33 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Duration duration35 = period33.toDurationTo(readableInstant34);
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant32, (org.joda.time.ReadableDuration) duration35);
        org.joda.time.Weeks weeks37 = period36.toStandardWeeks();
        org.joda.time.Period period38 = period36.toPeriod();
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((java.lang.Object) period38, periodType39);
        org.joda.time.Period period42 = period40.plusHours(8);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableDuration47, readableInstant48, periodType49);
        org.joda.time.PeriodType periodType51 = period50.getPeriodType();
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant45, readableInstant46, periodType51);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((long) (byte) -1, (long) (byte) 1, periodType51, chronology53);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period((java.lang.Object) period42, periodType51, chronology55);
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant24, (org.joda.time.ReadableDuration) duration31, periodType51);
        org.joda.time.Period period58 = period21.withPeriodType(periodType51);
        org.joda.time.Period period59 = new org.joda.time.Period(0, (int) '4', 100, (int) (byte) 10, 40, 0, 1, 97, periodType51);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(weeks37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(period58);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.joda.time.Period period1 = org.joda.time.Period.millis(35);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks1 = period0.toStandardWeeks();
        org.joda.time.Period period3 = period0.withDays((int) (short) 0);
        org.joda.time.DurationFieldType[] durationFieldTypeArray4 = period0.getFieldTypes();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(durationFieldTypeArray4);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (short) -1);
        org.joda.time.Period period3 = period1.plusYears(32);
        org.joda.time.Period period5 = period3.withDays((int) ' ');
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks1 = period0.toStandardWeeks();
        org.joda.time.Period period3 = period0.minusSeconds((int) (byte) 1);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = period3.withPeriodType(periodType4);
        org.joda.time.Period period7 = org.joda.time.Period.seconds((int) (short) 10);
        org.joda.time.Period period8 = period5.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period7.toDurationFrom(readableInstant9);
        org.joda.time.Period period11 = period7.toPeriod();
        int int12 = period11.getDays();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.minusYears((int) (byte) -1);
        org.joda.time.Duration duration4 = period1.toStandardDuration();
        int int5 = period1.getMinutes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
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
        org.joda.time.Period period16 = period8.minusHours(100);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant17, readableDuration18);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period23 = period21.minusYears((int) (byte) -1);
        org.joda.time.Period period24 = period19.withFields((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period26 = period19.withHours((int) (short) 0);
        org.joda.time.Period period28 = period19.multipliedBy((int) (short) 10);
        boolean boolean29 = period8.equals((java.lang.Object) period19);
        int int30 = period8.getSeconds();
        org.joda.time.Period period31 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = period31.toDurationTo(readableInstant32);
        org.joda.time.Period period35 = period31.plusHours((-1));
        org.joda.time.Period period37 = period35.withMillis((int) (short) 1);
        org.joda.time.Period period39 = period35.minusMinutes((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((-1), (int) (byte) 10, 8, 1, (int) (byte) 10, 10, (int) (byte) 1, 1);
        org.joda.time.PeriodType periodType51 = period50.getPeriodType();
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant40, readableInstant41, periodType51);
        org.joda.time.Period period53 = new org.joda.time.Period((java.lang.Object) period35, periodType51);
        org.joda.time.Period period54 = period8.normalizedStandard(periodType51);
        java.lang.Class<?> wildcardClass55 = period54.getClass();
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
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
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
        org.joda.time.Period period21 = period19.negated();
        org.joda.time.Period period23 = period21.plusMillis(8);
        int int24 = period21.getSeconds();
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
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.joda.time.Period period4 = new org.joda.time.Period(1, 0, (int) (short) 1, (int) (short) 10);
        int[] intArray5 = period4.getValues();
        org.joda.time.Period period7 = period4.minusSeconds((int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 0, 0, 0, 1, 0, 1, 10 });
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.withMillis((int) (short) 1);
        org.joda.time.Period period8 = org.joda.time.Period.seconds(0);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType17);
        org.joda.time.Period period20 = period18.withMillis((int) (short) 10);
        org.joda.time.Period period22 = period18.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType24 = period18.getFieldType((int) (short) 1);
        int int25 = period8.indexOf(durationFieldType24);
        boolean boolean26 = period6.equals((java.lang.Object) int25);
        int int27 = period6.getWeeks();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period11, periodType12);
        org.joda.time.Period period15 = period11.withMonths(0);
        org.joda.time.Period period17 = period15.plusHours(4);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period3.plusSeconds((int) ' ');
        org.joda.time.Period period7 = period3.minusWeeks(10);
        org.joda.time.Period period9 = period3.minusWeeks((int) (byte) 100);
        org.joda.time.Period period11 = period9.minusHours(1);
        org.joda.time.Minutes minutes12 = period9.toStandardMinutes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("P35M", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 35, chronology1);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 0, chronology1);
        org.joda.time.Period period3 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationTo(readableInstant4);
        org.joda.time.Period period7 = period3.plusDays((int) (byte) 10);
        org.joda.time.Period period9 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period10 = period9.negated();
        org.joda.time.PeriodType periodType11 = period10.getPeriodType();
        org.joda.time.Period period12 = new org.joda.time.Period((java.lang.Object) period7, periodType11);
        org.joda.time.Period period14 = period12.minusMillis((int) (short) 0);
        org.joda.time.Period period15 = period2.withFields((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Period period17 = period2.plusMonths(68);
        org.joda.time.Period period18 = period2.toPeriod();
        org.joda.time.Period period20 = period2.minusHours((int) '#');
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) 10, (int) 'a', 8, 35, (int) (short) -1, (int) (short) 1, (int) (short) 100, 10);
        org.joda.time.Period period10 = period8.minusMillis(0);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.plusYears((int) '#');
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) 10, (int) (byte) 100, (int) '#', (int) (byte) 10);
        org.joda.time.Period period9 = period3.plus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period11 = period9.plusMonths(0);
        org.joda.time.Period period12 = period11.normalizedStandard();
        org.joda.time.Period period14 = period12.withSeconds(0);
        org.joda.time.Period period15 = period12.normalizedStandard();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds16 = period15.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Seconds as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMinutes((int) (byte) 0);
        org.joda.time.Period period7 = period1.plusHours((int) ' ');
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((java.lang.Object) period1, chronology8);
        org.joda.time.Period period11 = period1.plusWeeks((int) (short) 100);
        org.joda.time.Period period13 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period15 = period13.minusYears((int) (byte) -1);
        org.joda.time.Period period17 = period15.minusMinutes((int) ' ');
        org.joda.time.Period period19 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period21 = period19.withMillis((int) (byte) 100);
        org.joda.time.Period period22 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationTo(readableInstant23);
        org.joda.time.Period period26 = period22.plusHours((-1));
        int int27 = period26.getSeconds();
        org.joda.time.Period period28 = period21.withFields((org.joda.time.ReadablePeriod) period26);
        org.joda.time.Period period30 = period26.withMinutes((int) (short) 0);
        org.joda.time.Period period32 = period26.withMinutes(10);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant33, readableDuration34);
        org.joda.time.Period period37 = period35.plusDays((int) 'a');
        org.joda.time.Period period38 = period26.plus((org.joda.time.ReadablePeriod) period37);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Period period40 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Duration duration42 = period40.toDurationTo(readableInstant41);
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant39, (org.joda.time.ReadableDuration) duration42);
        int int44 = period43.size();
        org.joda.time.Period period46 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period48 = period46.withMillis((int) (byte) 100);
        org.joda.time.Period period49 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = period49.toDurationTo(readableInstant50);
        org.joda.time.Period period53 = period49.plusHours((-1));
        int int54 = period53.getSeconds();
        org.joda.time.Period period55 = period48.withFields((org.joda.time.ReadablePeriod) period53);
        org.joda.time.Period period57 = period53.withMinutes((int) (short) 0);
        org.joda.time.Period period59 = period53.withMinutes(10);
        org.joda.time.Period period61 = period53.minusHours(100);
        org.joda.time.Period period62 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks63 = period62.toStandardWeeks();
        org.joda.time.Period period64 = period62.negated();
        org.joda.time.Period period66 = org.joda.time.Period.seconds(0);
        org.joda.time.PeriodType periodType75 = null;
        org.joda.time.Period period76 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType75);
        org.joda.time.Period period78 = period76.withMillis((int) (short) 10);
        org.joda.time.Period period80 = period76.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType82 = period76.getFieldType((int) (short) 1);
        int int83 = period66.indexOf(durationFieldType82);
        org.joda.time.Period period85 = period64.withFieldAdded(durationFieldType82, (int) 'a');
        org.joda.time.Period period87 = period53.withFieldAdded(durationFieldType82, 0);
        org.joda.time.Period period89 = period43.withField(durationFieldType82, (int) (byte) 1);
        org.joda.time.Period period91 = period38.withFieldAdded(durationFieldType82, 0);
        boolean boolean92 = period15.isSupported(durationFieldType82);
        org.joda.time.Period period94 = period11.withFieldAdded(durationFieldType82, 11);
        org.joda.time.Period period96 = period11.minusYears(32);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 8 + "'", int44 == 8);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(weeks63);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(durationFieldType82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertNotNull(period91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(period94);
        org.junit.Assert.assertNotNull(period96);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.joda.time.Period period1 = org.joda.time.Period.days(1);
        org.joda.time.Period period3 = period1.plusDays((int) (short) 100);
        org.joda.time.Period period5 = period3.plusHours((int) (byte) 1);
        org.joda.time.Period period7 = period5.withDays(0);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.Period period9 = period7.minus(readablePeriod8);
        java.lang.Class<?> wildcardClass10 = period7.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        org.joda.time.Period period9 = period1.withSeconds((int) (short) 1);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) 1, 10L, periodType12, chronology13);
        org.joda.time.Period period16 = period14.plusWeeks((int) (byte) -1);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) 0, (long) 1, chronology19);
        org.joda.time.Period period21 = period20.negated();
        org.joda.time.Period period23 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period25 = period23.withMillis((int) (byte) 100);
        org.joda.time.Period period26 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = period26.toDurationTo(readableInstant27);
        org.joda.time.Period period30 = period26.plusHours((-1));
        int int31 = period30.getSeconds();
        org.joda.time.Period period32 = period25.withFields((org.joda.time.ReadablePeriod) period30);
        org.joda.time.Period period34 = period32.plusMillis((int) '#');
        org.joda.time.Period period36 = period34.plusMinutes((int) (short) -1);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType39, chronology40);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Duration duration43 = period41.toDurationFrom(readableInstant42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period(readableInstant44, readableDuration45);
        org.joda.time.Period period48 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period50 = period48.minusYears((int) (byte) -1);
        org.joda.time.Period period51 = period46.withFields((org.joda.time.ReadablePeriod) period48);
        org.joda.time.Period period53 = period48.withMinutes((int) (short) -1);
        org.joda.time.Period period54 = period41.plus((org.joda.time.ReadablePeriod) period53);
        org.joda.time.Period period55 = period36.plus((org.joda.time.ReadablePeriod) period54);
        org.joda.time.Period period57 = period54.plusYears(8);
        org.joda.time.Period period59 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period61 = period59.withMillis((int) (byte) 100);
        org.joda.time.Period period62 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.Duration duration64 = period62.toDurationTo(readableInstant63);
        org.joda.time.Period period66 = period62.plusHours((-1));
        int int67 = period66.getSeconds();
        org.joda.time.Period period68 = period61.withFields((org.joda.time.ReadablePeriod) period66);
        org.joda.time.PeriodType periodType77 = null;
        org.joda.time.Period period78 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType77);
        org.joda.time.Period period80 = period78.withMillis((int) (short) 10);
        org.joda.time.Period period82 = period78.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType84 = period78.getFieldType((int) (short) 1);
        org.joda.time.Period period86 = period61.withField(durationFieldType84, 100);
        boolean boolean87 = period57.isSupported(durationFieldType84);
        boolean boolean88 = period21.isSupported(durationFieldType84);
        org.joda.time.Period period90 = period14.withField(durationFieldType84, 100);
        org.joda.time.Period period92 = period9.withFieldAdded(durationFieldType84, (int) (short) 1);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(duration64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(durationFieldType84);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(period90);
        org.junit.Assert.assertNotNull(period92);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period11, periodType12);
        org.joda.time.Period period15 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period17 = period15.withMillis((int) (byte) 100);
        org.joda.time.Period period19 = period15.withMonths((int) ' ');
        org.joda.time.Period period21 = period15.withHours(100);
        org.joda.time.Period period22 = period11.withFields((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Period period24 = period22.withWeeks((int) (short) 10);
        org.joda.time.Period period26 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period28 = period26.withMillis((int) (byte) 100);
        org.joda.time.Period period29 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = period29.toDurationTo(readableInstant30);
        org.joda.time.Period period33 = period29.plusHours((-1));
        int int34 = period33.getSeconds();
        org.joda.time.Period period35 = period28.withFields((org.joda.time.ReadablePeriod) period33);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Duration duration37 = period33.toDurationTo(readableInstant36);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((long) 'a', chronology40);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Duration duration43 = period41.toDurationTo(readableInstant42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableDuration46, readableInstant47, periodType48);
        org.joda.time.PeriodType periodType50 = period49.getPeriodType();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period((long) (byte) 10, periodType50, chronology51);
        org.joda.time.Period period53 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration43, readableInstant44, periodType50);
        org.joda.time.Period period54 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration37, readableInstant38, periodType50);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period((java.lang.Object) period24, periodType50, chronology55);
        org.joda.time.Period period58 = period56.plusMinutes(1);
        org.joda.time.Period period60 = period56.withWeeks(0);
        int[] intArray61 = period60.getValues();
        org.joda.time.Period period63 = period60.minusYears(35);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(period63);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, (long) 97);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 4);
        org.joda.time.Period period3 = period1.withSeconds(68);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.plusYears((int) '#');
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.DurationFieldType durationFieldType7 = null;
        int int8 = period4.get(durationFieldType7);
        org.joda.time.Period period9 = period3.plus((org.joda.time.ReadablePeriod) period4);
        int[] intArray10 = period9.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = period9.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 35, 0, 0, 0, 0, 0, (-1), 0 });
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        java.lang.String str5 = period4.toString();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT-1H" + "'", str5, "PT-1H");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 40, chronology1);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.Period period8 = period4.plusHours((-1));
        int int9 = period8.getSeconds();
        org.joda.time.Period period10 = period3.withFields((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period12 = period10.plusMillis((int) '#');
        org.joda.time.Period period14 = period12.plusMinutes((int) (short) -1);
        org.joda.time.Seconds seconds15 = period12.toStandardSeconds();
        org.joda.time.Period period17 = period12.minusMinutes((int) (byte) 0);
        org.joda.time.Period period19 = period12.withDays(32);
        org.joda.time.Period period21 = period19.minusMillis(97);
        int int22 = period19.getMinutes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT35S");
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableDuration11, readableInstant12, periodType13);
        org.joda.time.PeriodType periodType15 = period14.getPeriodType();
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant9, readableInstant10, periodType15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) (byte) -1, (long) (byte) 1, periodType15, chronology17);
        org.joda.time.Period period19 = new org.joda.time.Period((long) 10, periodType15);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) (-1), (long) '#', periodType15, chronology20);
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType15);
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType15);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (short) 1, 0, (int) ' ', (-1));
        org.joda.time.DurationFieldType durationFieldType6 = period4.getFieldType((int) (byte) 1);
        org.junit.Assert.assertNotNull(durationFieldType6);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.plusYears((int) '#');
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) 10, (int) (byte) 100, (int) '#', (int) (byte) 10);
        org.joda.time.Period period9 = period3.plus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period11 = period9.plusMonths(0);
        org.joda.time.Period period12 = period11.normalizedStandard();
        org.joda.time.Period period14 = period12.withSeconds(0);
        int int15 = period14.getMinutes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 40 + "'", int15 == 40);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.joda.time.Period period8 = new org.joda.time.Period(35, 11, (int) (byte) 1, 0, 1, 32, (int) ' ', 68);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration9 = period8.toStandardDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Duration as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(10L, (long) (byte) 0, chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 100, chronology5);
        org.joda.time.Period period8 = period6.withMinutes((int) (short) 0);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableDuration9, readableInstant10, periodType11);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableDuration18, readableInstant19, periodType20);
        org.joda.time.PeriodType periodType22 = period21.getPeriodType();
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant16, readableInstant17, periodType22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) (byte) -1, (long) (byte) 1, periodType22, chronology24);
        org.joda.time.Period period26 = new org.joda.time.Period((long) 10, periodType22);
        int int27 = period26.getMonths();
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Period period29 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = period29.toDurationTo(readableInstant30);
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant28, (org.joda.time.ReadableDuration) duration31);
        int int33 = period32.size();
        org.joda.time.Period period35 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period37 = period35.withMillis((int) (byte) 100);
        org.joda.time.Period period38 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = period38.toDurationTo(readableInstant39);
        org.joda.time.Period period42 = period38.plusHours((-1));
        int int43 = period42.getSeconds();
        org.joda.time.Period period44 = period37.withFields((org.joda.time.ReadablePeriod) period42);
        org.joda.time.Period period46 = period42.withMinutes((int) (short) 0);
        org.joda.time.Period period48 = period42.withMinutes(10);
        org.joda.time.Period period50 = period42.minusHours(100);
        org.joda.time.Period period51 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks52 = period51.toStandardWeeks();
        org.joda.time.Period period53 = period51.negated();
        org.joda.time.Period period55 = org.joda.time.Period.seconds(0);
        org.joda.time.PeriodType periodType64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType64);
        org.joda.time.Period period67 = period65.withMillis((int) (short) 10);
        org.joda.time.Period period69 = period65.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType71 = period65.getFieldType((int) (short) 1);
        int int72 = period55.indexOf(durationFieldType71);
        org.joda.time.Period period74 = period53.withFieldAdded(durationFieldType71, (int) 'a');
        org.joda.time.Period period76 = period42.withFieldAdded(durationFieldType71, 0);
        org.joda.time.Period period78 = period32.withField(durationFieldType71, (int) (byte) 1);
        org.joda.time.Period period80 = period26.withFieldAdded(durationFieldType71, (int) (byte) 10);
        int int81 = period12.get(durationFieldType71);
        org.joda.time.Period period83 = period6.withFieldAdded(durationFieldType71, (int) (byte) -1);
        org.joda.time.Period period85 = period3.withFieldAdded(durationFieldType71, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int87 = period85.getValue(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(weeks52);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(durationFieldType71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(period85);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, chronology1);
        org.joda.time.Period period4 = period2.withMinutes((int) (short) 0);
        org.joda.time.Period period6 = period2.minusSeconds((int) '4');
        org.joda.time.Weeks weeks7 = period2.toStandardWeeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType9 = period2.getFieldType(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(weeks7);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (byte) 0);
        java.lang.String str2 = period1.toString();
        org.joda.time.Period period3 = period1.negated();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT0S" + "'", str2, "PT0S");
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.minusMillis((int) (short) 0);
        org.joda.time.Period period5 = org.joda.time.Period.minutes((int) (byte) 0);
        org.joda.time.Period period7 = period5.withSeconds((-1));
        org.joda.time.Period period8 = period3.minus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Duration duration9 = period3.toStandardDuration();
        org.joda.time.Period period10 = new org.joda.time.Period((java.lang.Object) duration9);
        int int11 = period10.getDays();
        org.joda.time.Period period13 = period10.plusWeeks((int) (byte) 10);
        org.joda.time.Period period15 = new org.joda.time.Period((long) 8);
        org.joda.time.Period period17 = period15.plusWeeks((int) (short) 1);
        org.joda.time.Duration duration18 = period15.toStandardDuration();
        boolean boolean19 = period13.equals((java.lang.Object) duration18);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(0);
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType10);
        org.joda.time.Period period13 = period11.withMillis((int) (short) 10);
        org.joda.time.Period period15 = period11.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType17 = period11.getFieldType((int) (short) 1);
        int int18 = period1.indexOf(durationFieldType17);
        org.joda.time.Period period20 = period1.withMinutes(68);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks1 = period0.toStandardWeeks();
        org.joda.time.Period period3 = period0.minusSeconds((int) (byte) 1);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = period3.withPeriodType(periodType4);
        org.joda.time.Period period7 = org.joda.time.Period.seconds((int) (short) 10);
        org.joda.time.Period period8 = period5.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Duration duration9 = period7.toStandardDuration();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration9);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
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
        org.joda.time.format.PeriodFormatter periodFormatter20 = null;
        java.lang.String str21 = period19.toString(periodFormatter20);
        org.joda.time.Period period23 = period19.withDays((int) (byte) 0);
        org.joda.time.format.PeriodFormatter periodFormatter24 = null;
        java.lang.String str25 = period19.toString(periodFormatter24);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PT0.032S" + "'", str21, "PT0.032S");
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PT0.032S" + "'", str25, "PT0.032S");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) ' ', 0, (int) (short) 100, 100, (int) (byte) 10, 100, (-1), (int) (short) 100, periodType8);
        org.joda.time.Period period11 = period9.minusYears((int) '#');
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) (short) 1, chronology13);
        org.joda.time.Period period18 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period20 = period18.minusYears((int) (byte) -1);
        org.joda.time.Duration duration21 = period18.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableDuration25, readableInstant26, periodType27);
        org.joda.time.PeriodType periodType29 = period28.getPeriodType();
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant23, readableInstant24, periodType29);
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration21, readableInstant22, periodType29);
        org.joda.time.Period period32 = new org.joda.time.Period(1L, (long) (short) 10, periodType29);
        org.joda.time.Period period33 = period14.withPeriodType(periodType29);
        org.joda.time.Period period35 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period36 = period35.negated();
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period(readableDuration38, readableInstant39, periodType40);
        org.joda.time.PeriodType periodType42 = period41.getPeriodType();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((long) (byte) 10, periodType42, chronology43);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((java.lang.Object) period36, periodType42, chronology45);
        org.joda.time.Period period47 = period33.minus((org.joda.time.ReadablePeriod) period36);
        org.joda.time.Period period48 = period9.withFields((org.joda.time.ReadablePeriod) period36);
        int int49 = period48.getSeconds();
        int int50 = period48.getMinutes();
        org.joda.time.Period period52 = period48.minusHours(0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(period52);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableDuration12, readableInstant13, periodType14);
        org.joda.time.PeriodType periodType16 = period15.getPeriodType();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) (byte) 10, periodType16, chronology17);
        org.joda.time.Period period19 = new org.joda.time.Period((long) (byte) 10, periodType16);
        org.joda.time.Period period20 = new org.joda.time.Period(8, 8, 35, (int) (short) 1, (int) (short) 100, (int) (byte) 100, (int) '#', (int) '#', periodType16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period21 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period11, periodType12);
        org.joda.time.Period period15 = period13.withHours((int) 'a');
        org.joda.time.Period period17 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period19 = period17.withMillis((int) (byte) 100);
        org.joda.time.Period period20 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = period20.toDurationTo(readableInstant21);
        org.joda.time.Period period24 = period20.plusHours((-1));
        int int25 = period24.getSeconds();
        org.joda.time.Period period26 = period19.withFields((org.joda.time.ReadablePeriod) period24);
        org.joda.time.Period period28 = period26.withMonths(1);
        org.joda.time.Period period30 = period28.multipliedBy((-1));
        org.joda.time.Period period32 = period30.plusDays(0);
        org.joda.time.Period period33 = period15.minus((org.joda.time.ReadablePeriod) period30);
        int int34 = period33.getSeconds();
        org.joda.time.Period period36 = period33.minusYears((int) ' ');
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertNotNull(period36);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.minusMillis((int) (short) 0);
        org.joda.time.Period period5 = org.joda.time.Period.minutes((int) (byte) 0);
        org.joda.time.Period period7 = period5.withSeconds((-1));
        org.joda.time.Period period8 = period3.minus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period9 = new org.joda.time.Period((java.lang.Object) period3);
        org.joda.time.Period period11 = period3.plusHours((int) '4');
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(8);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableDuration10, readableInstant11, periodType12);
        org.joda.time.PeriodType periodType14 = period13.getPeriodType();
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant8, readableInstant9, periodType14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) (byte) -1, (long) (byte) 1, periodType14, chronology16);
        org.joda.time.Period period18 = new org.joda.time.Period((long) (short) 1, (long) (short) -1, periodType14);
        org.joda.time.Period period19 = new org.joda.time.Period(1L, (long) 10, periodType14);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) (byte) 1, (long) (short) 100, periodType14, chronology20);
        org.junit.Assert.assertNotNull(periodType14);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes2 = period1.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period11, periodType12);
        org.joda.time.Period period15 = period13.withHours((int) 'a');
        org.joda.time.Period period17 = period13.withMonths(0);
        org.joda.time.Period period19 = period13.minusWeeks((int) (byte) 10);
        org.joda.time.Period period21 = period19.plusSeconds((int) (short) 10);
        org.joda.time.Period period23 = period19.plusMinutes(0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.joda.time.Period period1 = org.joda.time.Period.parse("P10Y32M-1WT35H100M10.001S");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType3 = period1.getFieldType((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, chronology1);
        org.joda.time.Period period4 = period2.withMinutes((int) (short) 0);
        org.joda.time.DurationFieldType durationFieldType6 = period4.getFieldType((int) (byte) 1);
        org.joda.time.Period period7 = period4.toPeriod();
        org.joda.time.Period period8 = period4.toPeriod();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period11, periodType12);
        org.joda.time.Period period15 = period11.withMonths(0);
        org.joda.time.Period period17 = period15.minusWeeks((int) (short) -1);
        org.joda.time.Period period19 = period17.withHours((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks20 = period19.toStandardWeeks();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Weeks as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.minusYears((int) (byte) -1);
        org.joda.time.Duration duration4 = period1.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.DurationFieldType durationFieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = period6.withField(durationFieldType7, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration4);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.Period period13 = period9.plusYears((int) (byte) 10);
        org.joda.time.Period period14 = period13.normalizedStandard();
        int int15 = period13.getMinutes();
        org.joda.time.Period period17 = period13.withMonths((int) (byte) 100);
        org.joda.time.MutablePeriod mutablePeriod18 = period17.toMutablePeriod();
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(mutablePeriod18);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 35, (long) 0);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
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
        org.joda.time.Period period12 = period10.minusMonths(10);
        org.joda.time.Period period14 = period12.withSeconds((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period12.toDurationFrom(readableInstant15);
        org.joda.time.Period period18 = period12.plusWeeks((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours19 = period18.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Hours as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        java.lang.Object obj0 = null;
        org.joda.time.Period period1 = new org.joda.time.Period(obj0);
        int int2 = period1.getYears();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (short) 1, (int) (short) -1, (int) (short) 10, 4);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        org.joda.time.Period period9 = period7.withYears((int) ' ');
        org.joda.time.Period period11 = period7.withDays(11);
        org.joda.time.Weeks weeks12 = period11.toStandardWeeks();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(weeks12);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 0);
        org.joda.time.Days days2 = period1.toStandardDays();
        int[] intArray3 = period1.getValues();
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 10, periodType5);
        org.joda.time.Period period8 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period10 = period8.withMillis((int) (byte) 100);
        org.joda.time.Period period11 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationTo(readableInstant12);
        org.joda.time.Period period15 = period11.plusHours((-1));
        int int16 = period15.getSeconds();
        org.joda.time.Period period17 = period10.withFields((org.joda.time.ReadablePeriod) period15);
        int int18 = period15.getHours();
        org.joda.time.Period period19 = period6.minus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.PeriodType periodType20 = period15.getPeriodType();
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType23, chronology24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period25.toDurationFrom(readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant28, readableDuration29);
        org.joda.time.Period period32 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period34 = period32.minusYears((int) (byte) -1);
        org.joda.time.Period period35 = period30.withFields((org.joda.time.ReadablePeriod) period32);
        org.joda.time.Period period37 = period32.withMinutes((int) (short) -1);
        org.joda.time.Period period38 = period25.plus((org.joda.time.ReadablePeriod) period37);
        org.joda.time.Period period40 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period42 = period40.withMillis((int) (byte) 100);
        org.joda.time.Period period43 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = period43.toDurationTo(readableInstant44);
        org.joda.time.Period period47 = period43.plusHours((-1));
        int int48 = period47.getSeconds();
        org.joda.time.Period period49 = period42.withFields((org.joda.time.ReadablePeriod) period47);
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType58);
        org.joda.time.Period period61 = period59.withMillis((int) (short) 10);
        org.joda.time.Period period63 = period59.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType65 = period59.getFieldType((int) (short) 1);
        org.joda.time.Period period67 = period42.withField(durationFieldType65, 100);
        boolean boolean68 = period25.isSupported(durationFieldType65);
        org.joda.time.Period period70 = period15.withField(durationFieldType65, (int) '#');
        org.joda.time.Period period72 = period1.withField(durationFieldType65, 0);
        org.joda.time.Period period74 = period72.withDays(100);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(durationFieldType65);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(period74);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("P35WT100S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
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
        int int21 = period8.getDays();
        org.joda.time.Period period22 = period8.normalizedStandard();
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
        org.junit.Assert.assertNotNull(period22);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        int int8 = period7.getMinutes();
        org.joda.time.Period period10 = period7.withMinutes(0);
        org.joda.time.Period period12 = period7.withWeeks(0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 10, periodType1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period6 = period4.withMillis((int) (byte) 100);
        org.joda.time.Period period7 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period7.toDurationTo(readableInstant8);
        org.joda.time.Period period11 = period7.plusHours((-1));
        int int12 = period11.getSeconds();
        org.joda.time.Period period13 = period6.withFields((org.joda.time.ReadablePeriod) period11);
        int int14 = period11.getHours();
        org.joda.time.Period period15 = period2.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Days days16 = period15.toStandardDays();
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) 'a', chronology19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = period20.toDurationTo(readableInstant21);
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant17, (org.joda.time.ReadableDuration) duration22);
        org.joda.time.Period period25 = period23.withWeeks(8);
        boolean boolean26 = period15.equals((java.lang.Object) 8);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.joda.time.Period period4 = new org.joda.time.Period((int) 'a', (int) (short) 100, 1, (int) '4');
        org.joda.time.Period period6 = period4.minusMillis((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(mutablePeriod7);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        org.joda.time.Weeks weeks5 = period4.toStandardWeeks();
        java.lang.Class<?> wildcardClass6 = weeks5.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        int int4 = period3.getSeconds();
        org.joda.time.Period period5 = period3.toPeriod();
        org.joda.time.Period period7 = period5.minusMonths((int) ' ');
        org.joda.time.Period period9 = org.joda.time.Period.minutes(0);
        int int10 = period9.getSeconds();
        int int11 = period9.getYears();
        org.joda.time.Period period13 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period15 = period13.withMillis((int) (byte) 100);
        org.joda.time.Period period17 = period13.withMonths((int) ' ');
        org.joda.time.Period period19 = period13.withHours(100);
        java.lang.String str20 = period19.toString();
        org.joda.time.Period period21 = period9.plus((org.joda.time.ReadablePeriod) period19);
        boolean boolean22 = period7.equals((java.lang.Object) period9);
        org.joda.time.Days days23 = period9.toStandardDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PT100H" + "'", str20, "PT100H");
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(days23);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.plusYears((int) '#');
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.DurationFieldType durationFieldType7 = null;
        int int8 = period4.get(durationFieldType7);
        org.joda.time.Period period9 = period3.plus((org.joda.time.ReadablePeriod) period4);
        int[] intArray10 = period9.getValues();
        org.joda.time.Period period12 = period9.withSeconds((int) (byte) -1);
        org.joda.time.format.PeriodFormatter periodFormatter13 = null;
        java.lang.String str14 = period12.toString(periodFormatter13);
        org.joda.time.DurationFieldType[] durationFieldTypeArray15 = period12.getFieldTypes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 35, 0, 0, 0, 0, 0, (-1), 0 });
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "P35YT-1S" + "'", str14, "P35YT-1S");
        org.junit.Assert.assertNotNull(durationFieldTypeArray15);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period0.withYears(1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationTo(readableInstant10);
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant8, (org.joda.time.ReadableDuration) duration11);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant7, (org.joda.time.ReadableDuration) duration11, periodType13);
        org.joda.time.Period period16 = period14.plusWeeks(0);
        org.joda.time.Period period18 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period19 = period18.negated();
        org.joda.time.Period period20 = period14.withFields((org.joda.time.ReadablePeriod) period19);
        org.joda.time.PeriodType periodType21 = period20.getPeriodType();
        org.joda.time.Period period22 = period6.withPeriodType(periodType21);
        org.joda.time.Period period24 = period22.plusMonths((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType26 = period22.getFieldType((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
        org.joda.time.Period period16 = period14.minusHours((int) (short) 1);
        org.joda.time.Seconds seconds17 = period16.toStandardSeconds();
        org.joda.time.Period period19 = period16.withYears((int) 'a');
        org.joda.time.Period period21 = period19.withMonths(11);
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
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) '4');
        org.joda.time.Period period3 = period1.minusSeconds(4);
        int int4 = period1.getMinutes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableDuration10, readableInstant11, periodType12);
        org.joda.time.PeriodType periodType14 = period13.getPeriodType();
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant8, readableInstant9, periodType14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) (byte) -1, (long) (byte) 1, periodType14, chronology16);
        org.joda.time.Period period18 = new org.joda.time.Period((long) 10, periodType14);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) (-1), (long) '#', periodType14, chronology19);
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant1, readableInstant2, periodType14);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) 10, periodType14, chronology22);
        org.joda.time.Period period24 = period23.toPeriod();
        org.joda.time.Days days25 = period24.toStandardDays();
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(days25);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.minusMillis((int) (short) 0);
        org.joda.time.Period period4 = period1.negated();
        org.joda.time.Period period5 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationTo(readableInstant6);
        org.joda.time.Period period9 = period5.plusHours((-1));
        org.joda.time.Period period11 = period5.withYears(1);
        org.joda.time.Period period12 = new org.joda.time.Period((java.lang.Object) period11);
        org.joda.time.PeriodType periodType13 = period11.getPeriodType();
        org.joda.time.Period period14 = period4.normalizedStandard(periodType13);
        org.joda.time.Period period16 = period14.minusWeeks((int) ' ');
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.plusYears((int) (short) -1);
        org.joda.time.Period period8 = period4.plusMillis((int) ' ');
        org.joda.time.Period period10 = period4.minusDays(1);
        org.joda.time.Period period12 = period10.plusMillis(100);
        org.joda.time.Minutes minutes13 = period10.toStandardMinutes();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(minutes13);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '4', (long) 1);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-1), (long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = period2.getValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
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
        org.joda.time.Period period16 = period8.minusHours(100);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant17, readableDuration18);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period23 = period21.minusYears((int) (byte) -1);
        org.joda.time.Period period24 = period19.withFields((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period26 = period19.withHours((int) (short) 0);
        org.joda.time.Period period28 = period19.multipliedBy((int) (short) 10);
        boolean boolean29 = period8.equals((java.lang.Object) period19);
        org.joda.time.Period period31 = period8.plusSeconds(1);
        org.joda.time.Days days32 = period31.toStandardDays();
        int int33 = period31.getHours();
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
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableDuration10, readableInstant11, periodType12);
        org.joda.time.PeriodType periodType14 = period13.getPeriodType();
        org.joda.time.Period period15 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType14);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 0);
        org.joda.time.Days days2 = period1.toStandardDays();
        int[] intArray3 = period1.getValues();
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 10, periodType5);
        org.joda.time.Period period8 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period10 = period8.withMillis((int) (byte) 100);
        org.joda.time.Period period11 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationTo(readableInstant12);
        org.joda.time.Period period15 = period11.plusHours((-1));
        int int16 = period15.getSeconds();
        org.joda.time.Period period17 = period10.withFields((org.joda.time.ReadablePeriod) period15);
        int int18 = period15.getHours();
        org.joda.time.Period period19 = period6.minus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.PeriodType periodType20 = period15.getPeriodType();
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType23, chronology24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period25.toDurationFrom(readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant28, readableDuration29);
        org.joda.time.Period period32 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period34 = period32.minusYears((int) (byte) -1);
        org.joda.time.Period period35 = period30.withFields((org.joda.time.ReadablePeriod) period32);
        org.joda.time.Period period37 = period32.withMinutes((int) (short) -1);
        org.joda.time.Period period38 = period25.plus((org.joda.time.ReadablePeriod) period37);
        org.joda.time.Period period40 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period42 = period40.withMillis((int) (byte) 100);
        org.joda.time.Period period43 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = period43.toDurationTo(readableInstant44);
        org.joda.time.Period period47 = period43.plusHours((-1));
        int int48 = period47.getSeconds();
        org.joda.time.Period period49 = period42.withFields((org.joda.time.ReadablePeriod) period47);
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType58);
        org.joda.time.Period period61 = period59.withMillis((int) (short) 10);
        org.joda.time.Period period63 = period59.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType65 = period59.getFieldType((int) (short) 1);
        org.joda.time.Period period67 = period42.withField(durationFieldType65, 100);
        boolean boolean68 = period25.isSupported(durationFieldType65);
        org.joda.time.Period period70 = period15.withField(durationFieldType65, (int) '#');
        org.joda.time.Period period72 = period1.withField(durationFieldType65, 0);
        org.joda.time.Period period74 = period1.minusYears((int) (short) 100);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(durationFieldType65);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(period74);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 'a', (long) 10);
        org.joda.time.Period period3 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks4 = period3.toStandardWeeks();
        org.joda.time.Period period5 = period3.negated();
        org.joda.time.Period period7 = org.joda.time.Period.seconds(0);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType16);
        org.joda.time.Period period19 = period17.withMillis((int) (short) 10);
        org.joda.time.Period period21 = period17.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType23 = period17.getFieldType((int) (short) 1);
        int int24 = period7.indexOf(durationFieldType23);
        org.joda.time.Period period26 = period5.withFieldAdded(durationFieldType23, (int) 'a');
        org.joda.time.Period period28 = period2.withField(durationFieldType23, (-1));
        int int29 = period2.size();
        int int30 = period2.getDays();
        org.joda.time.Period period32 = period2.withSeconds(32);
        org.joda.time.Period period34 = period2.plusYears(40);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 8 + "'", int29 == 8);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.Period period4 = period2.minusHours(0);
        org.joda.time.Period period6 = period2.minusMonths((-35));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType8 = period6.getFieldType((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period4 = period2.withMinutes((int) (byte) -1);
        org.joda.time.Period period6 = period2.minusMillis((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType8 = period2.getFieldType((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period3.plusSeconds((int) ' ');
        int[] intArray6 = period3.getValues();
        org.joda.time.Period period8 = period3.withMonths(1);
        org.joda.time.Period period10 = period8.withDays((int) (short) 0);
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
        org.joda.time.Period period26 = period8.plus((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Period period27 = period26.negated();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration28 = period26.toStandardDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Duration as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 100 });
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period27);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 52, (long) 32);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.joda.time.Period period1 = org.joda.time.Period.weeks(52);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(100L, (long) (byte) 10, chronology2);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.joda.time.Period period4 = new org.joda.time.Period((int) 'a', 0, 4, 40);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period2 = period1.negated();
        org.joda.time.PeriodType periodType3 = period2.getPeriodType();
        org.joda.time.Period period5 = period2.plusWeeks((int) (byte) 1);
        org.joda.time.Period period7 = period5.withMillis(52);
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
        org.joda.time.Period period27 = new org.joda.time.Period((long) ' ', periodType23);
        org.joda.time.Period period28 = period7.normalizedStandard(periodType23);
        org.joda.time.Period period30 = period7.minusYears((int) (byte) 0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.withMillis((int) (short) 1);
        boolean boolean8 = period4.equals((java.lang.Object) 100.0d);
        org.joda.time.Period period10 = period4.plusMonths((int) '#');
        org.joda.time.Period period12 = period10.withMillis((int) (byte) 10);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        org.joda.time.Period period6 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationTo(readableInstant7);
        boolean boolean9 = period5.equals((java.lang.Object) duration8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration8, readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = org.joda.time.Period.ZERO;
        org.joda.time.Period period17 = period15.plusHours(100);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period17.toDurationFrom(readableInstant18);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant14, (org.joda.time.ReadableDuration) duration19, periodType20);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant13, (org.joda.time.ReadableDuration) duration19, periodType22);
        org.joda.time.Period period25 = period23.minusMonths(10);
        org.joda.time.Period period27 = period25.withSeconds((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period25.toDurationFrom(readableInstant28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Period period32 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period34 = period32.withMillis((int) (byte) 100);
        org.joda.time.Period period36 = period32.withMonths((int) ' ');
        org.joda.time.Period period38 = period32.withHours(100);
        int int39 = period38.getMinutes();
        org.joda.time.Period period41 = period38.withWeeks((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Duration duration43 = period41.toDurationFrom(readableInstant42);
        org.joda.time.ReadableDuration readableDuration60 = null;
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.Period period63 = new org.joda.time.Period(readableDuration60, readableInstant61, periodType62);
        org.joda.time.PeriodType periodType64 = period63.getPeriodType();
        org.joda.time.Period period65 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType64);
        org.joda.time.Period period66 = new org.joda.time.Period((-1), 0, (int) (short) 1, (int) '4', 10, (int) (byte) 0, 100, (int) (byte) 1, periodType64);
        org.joda.time.Period period67 = new org.joda.time.Period(readableInstant30, (org.joda.time.ReadableDuration) duration43, periodType64);
        org.joda.time.Period period68 = new org.joda.time.Period(readableInstant12, (org.joda.time.ReadableDuration) duration29, periodType64);
        org.joda.time.Period period69 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration8, periodType64);
        org.joda.time.Period period70 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType64);
        org.joda.time.Period period72 = period70.plusMonths(10);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertNotNull(period72);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(10L, (long) (byte) 0, chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 100, chronology5);
        org.joda.time.Period period8 = period6.withMinutes((int) (short) 0);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableDuration9, readableInstant10, periodType11);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableDuration18, readableInstant19, periodType20);
        org.joda.time.PeriodType periodType22 = period21.getPeriodType();
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant16, readableInstant17, periodType22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) (byte) -1, (long) (byte) 1, periodType22, chronology24);
        org.joda.time.Period period26 = new org.joda.time.Period((long) 10, periodType22);
        int int27 = period26.getMonths();
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Period period29 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = period29.toDurationTo(readableInstant30);
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant28, (org.joda.time.ReadableDuration) duration31);
        int int33 = period32.size();
        org.joda.time.Period period35 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period37 = period35.withMillis((int) (byte) 100);
        org.joda.time.Period period38 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = period38.toDurationTo(readableInstant39);
        org.joda.time.Period period42 = period38.plusHours((-1));
        int int43 = period42.getSeconds();
        org.joda.time.Period period44 = period37.withFields((org.joda.time.ReadablePeriod) period42);
        org.joda.time.Period period46 = period42.withMinutes((int) (short) 0);
        org.joda.time.Period period48 = period42.withMinutes(10);
        org.joda.time.Period period50 = period42.minusHours(100);
        org.joda.time.Period period51 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks52 = period51.toStandardWeeks();
        org.joda.time.Period period53 = period51.negated();
        org.joda.time.Period period55 = org.joda.time.Period.seconds(0);
        org.joda.time.PeriodType periodType64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType64);
        org.joda.time.Period period67 = period65.withMillis((int) (short) 10);
        org.joda.time.Period period69 = period65.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType71 = period65.getFieldType((int) (short) 1);
        int int72 = period55.indexOf(durationFieldType71);
        org.joda.time.Period period74 = period53.withFieldAdded(durationFieldType71, (int) 'a');
        org.joda.time.Period period76 = period42.withFieldAdded(durationFieldType71, 0);
        org.joda.time.Period period78 = period32.withField(durationFieldType71, (int) (byte) 1);
        org.joda.time.Period period80 = period26.withFieldAdded(durationFieldType71, (int) (byte) 10);
        int int81 = period12.get(durationFieldType71);
        org.joda.time.Period period83 = period6.withFieldAdded(durationFieldType71, (int) (byte) -1);
        org.joda.time.Period period85 = period3.withFieldAdded(durationFieldType71, (int) '#');
        int[] intArray86 = period3.getValues();
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(weeks52);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(durationFieldType71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertArrayEquals(intArray86, new int[] { 0, 0, 0, 0, 0, 0, 0, (-10) });
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        org.joda.time.Period period9 = period7.withYears((int) ' ');
        org.joda.time.Period period11 = period9.withMonths((-1));
        org.joda.time.Period period13 = period9.plusMillis((int) (short) 1);
        int int14 = period9.getHours();
        org.joda.time.Period period16 = period9.plusMonths(52);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        int int5 = period4.getSeconds();
        org.joda.time.Period period7 = period4.withSeconds(10);
        int int8 = period7.getDays();
        int int9 = period7.getSeconds();
        org.joda.time.Period period11 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period13 = period11.withMillis((int) (byte) 100);
        org.joda.time.Period period14 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period14.toDurationTo(readableInstant15);
        org.joda.time.Period period18 = period14.plusHours((-1));
        int int19 = period18.getSeconds();
        org.joda.time.Period period20 = period13.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType29);
        org.joda.time.Period period32 = period30.withMillis((int) (short) 10);
        org.joda.time.Period period34 = period30.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType36 = period30.getFieldType((int) (short) 1);
        org.joda.time.Period period38 = period13.withField(durationFieldType36, 100);
        org.joda.time.Period period40 = period7.withField(durationFieldType36, (int) (byte) 100);
        org.joda.time.Period period42 = period40.plusYears((int) (byte) 100);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.joda.time.Period period1 = org.joda.time.Period.years(40);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.Period period8 = period4.plusHours((-1));
        int int9 = period8.getSeconds();
        org.joda.time.Period period10 = period3.withFields((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period12 = period10.withMonths(1);
        org.joda.time.Period period14 = period12.multipliedBy((-1));
        org.joda.time.Period period16 = period12.withDays(8);
        org.joda.time.Period period18 = period16.plusHours((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes19 = period16.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
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
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) ' ', 0, (int) (short) 100, 100, (int) (byte) 10, 100, (-1), (int) (short) 100, periodType8);
        org.joda.time.Period period11 = period9.minusYears((int) '#');
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period16 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period18 = period16.minusYears((int) (byte) -1);
        org.joda.time.Duration duration19 = period16.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableDuration23, readableInstant24, periodType25);
        org.joda.time.PeriodType periodType27 = period26.getPeriodType();
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant21, readableInstant22, periodType27);
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration19, readableInstant20, periodType27);
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant13, readableInstant14, periodType27);
        org.joda.time.Period period31 = new org.joda.time.Period((long) (short) 1, periodType27);
        org.joda.time.Period period32 = period11.normalizedStandard(periodType27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks33 = period32.toStandardWeeks();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Weeks as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(period32);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.plusYears((int) (short) -1);
        org.joda.time.Period period8 = period4.plusMillis((int) ' ');
        org.joda.time.Period period10 = period4.minusDays(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType12 = period4.getFieldType((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMinutes((int) (byte) 0);
        org.joda.time.MutablePeriod mutablePeriod6 = period5.toMutablePeriod();
        org.joda.time.Period period7 = period5.normalizedStandard();
        int int8 = period5.getMonths();
        org.joda.time.Period period10 = period5.minusMinutes((int) ' ');
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 4, chronology1);
        org.joda.time.Period period4 = period2.minusYears(1);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationTo(readableInstant7);
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant5, (org.joda.time.ReadableDuration) duration8);
        org.joda.time.Weeks weeks10 = period9.toStandardWeeks();
        org.joda.time.Period period12 = period9.minusDays(100);
        int int13 = period9.getDays();
        org.joda.time.Period period14 = period9.negated();
        org.joda.time.Period period15 = period2.minus((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Period period17 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period19 = period17.minusYears((int) (byte) -1);
        org.joda.time.Duration duration20 = period17.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableDuration24, readableInstant25, periodType26);
        org.joda.time.PeriodType periodType28 = period27.getPeriodType();
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant22, readableInstant23, periodType28);
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration20, readableInstant21, periodType28);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((java.lang.Object) period14, periodType28, chronology31);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(periodType28);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.Period period8 = period4.plusHours((-1));
        int int9 = period8.getSeconds();
        org.joda.time.Period period10 = period3.withFields((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period12 = period10.withMonths(1);
        org.joda.time.Period period14 = period12.multipliedBy((-1));
        org.joda.time.PeriodType periodType15 = period12.getPeriodType();
        org.joda.time.Period period16 = period12.toPeriod();
        int int17 = period16.getMinutes();
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType20, chronology21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationFrom(readableInstant23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableDuration26);
        org.joda.time.Period period29 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period31 = period29.minusYears((int) (byte) -1);
        org.joda.time.Period period32 = period27.withFields((org.joda.time.ReadablePeriod) period29);
        org.joda.time.Period period34 = period29.withMinutes((int) (short) -1);
        org.joda.time.Period period35 = period22.plus((org.joda.time.ReadablePeriod) period34);
        org.joda.time.Period period37 = period35.withMinutes((int) (byte) 1);
        org.joda.time.Period period39 = period37.minusDays((int) '#');
        org.joda.time.Period period41 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period43 = period41.minusMillis((int) (short) 0);
        org.joda.time.Period period45 = org.joda.time.Period.minutes((int) (byte) 0);
        org.joda.time.Period period47 = period45.withSeconds((-1));
        org.joda.time.Period period48 = period43.minus((org.joda.time.ReadablePeriod) period47);
        org.joda.time.Duration duration49 = period43.toStandardDuration();
        org.joda.time.Period period50 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Duration duration52 = period50.toDurationTo(readableInstant51);
        org.joda.time.Period period54 = period50.plusHours((-1));
        int int55 = period54.getSeconds();
        org.joda.time.Period period57 = period54.withSeconds(10);
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period(readableInstant58, readableDuration59);
        org.joda.time.Period period62 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period64 = period62.minusYears((int) (byte) -1);
        org.joda.time.Period period65 = period60.withFields((org.joda.time.ReadablePeriod) period62);
        int[] intArray66 = period60.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter67 = null;
        java.lang.String str68 = period60.toString(periodFormatter67);
        org.joda.time.PeriodType periodType77 = null;
        org.joda.time.Period period78 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType77);
        org.joda.time.Period period80 = period78.withMillis((int) (short) 10);
        org.joda.time.Period period82 = period78.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType84 = period78.getFieldType((int) (short) 1);
        org.joda.time.Period period86 = period60.withField(durationFieldType84, (int) (short) 10);
        org.joda.time.Period period88 = period57.withFieldAdded(durationFieldType84, (int) (byte) 10);
        int int89 = period43.indexOf(durationFieldType84);
        int int90 = period37.indexOf(durationFieldType84);
        int int91 = period16.indexOf(durationFieldType84);
        org.joda.time.DurationFieldType durationFieldType92 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period94 = period16.withField(durationFieldType92, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "PT0S" + "'", str68, "PT0S");
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(durationFieldType84);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(period88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1 + "'", int89 == 1);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableDuration16, readableInstant17, periodType18);
        org.joda.time.PeriodType periodType20 = period19.getPeriodType();
        org.joda.time.Period period21 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType20);
        org.joda.time.Period period22 = new org.joda.time.Period((-1), 0, (int) (short) 1, (int) '4', 10, (int) (byte) 0, 100, (int) (byte) 1, periodType20);
        org.joda.time.Period period24 = period22.plusHours((int) (short) -1);
        org.joda.time.Period period26 = period22.withWeeks((int) (byte) -1);
        int int27 = period26.getMinutes();
        org.joda.time.Period period29 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period30 = period29.negated();
        org.joda.time.Period period32 = period29.minusDays((-1));
        org.joda.time.Period period34 = period32.plusWeeks(0);
        org.joda.time.Period period36 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period38 = period36.withMillis((int) (byte) 100);
        org.joda.time.Period period40 = period38.plusSeconds((int) ' ');
        org.joda.time.Period period42 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period44 = period42.withMillis((int) (byte) 100);
        org.joda.time.Period period45 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Duration duration47 = period45.toDurationTo(readableInstant46);
        org.joda.time.Period period49 = period45.plusHours((-1));
        int int50 = period49.getSeconds();
        org.joda.time.Period period51 = period44.withFields((org.joda.time.ReadablePeriod) period49);
        org.joda.time.Period period53 = period49.withMinutes((int) (short) 0);
        org.joda.time.Period period55 = period49.withMinutes(10);
        org.joda.time.Period period57 = period49.minusHours(100);
        org.joda.time.Period period58 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks59 = period58.toStandardWeeks();
        org.joda.time.Period period60 = period58.negated();
        org.joda.time.Period period62 = org.joda.time.Period.seconds(0);
        org.joda.time.PeriodType periodType71 = null;
        org.joda.time.Period period72 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType71);
        org.joda.time.Period period74 = period72.withMillis((int) (short) 10);
        org.joda.time.Period period76 = period72.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType78 = period72.getFieldType((int) (short) 1);
        int int79 = period62.indexOf(durationFieldType78);
        org.joda.time.Period period81 = period60.withFieldAdded(durationFieldType78, (int) 'a');
        org.joda.time.Period period83 = period49.withFieldAdded(durationFieldType78, 0);
        org.joda.time.Period period85 = period38.withField(durationFieldType78, 0);
        int int86 = period32.get(durationFieldType78);
        org.joda.time.Period period88 = period26.withField(durationFieldType78, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType90 = period88.getFieldType((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(weeks59);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(durationFieldType78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(period88);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.joda.time.Period period2 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationTo(readableInstant3);
        org.joda.time.Period period6 = period2.plusHours((-1));
        org.joda.time.Period period8 = period2.withYears(1);
        org.joda.time.Period period9 = new org.joda.time.Period((java.lang.Object) period8);
        org.joda.time.PeriodType periodType10 = period8.getPeriodType();
        org.joda.time.Period period11 = new org.joda.time.Period((long) '4', 10L, periodType10);
        org.joda.time.Weeks weeks12 = period11.toStandardWeeks();
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(weeks12);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
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
        org.joda.time.Period period97 = period94.minusMonths((-1));
        org.joda.time.Period period99 = period97.minusMillis((int) (byte) 10);
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
        org.junit.Assert.assertNotNull(period97);
        org.junit.Assert.assertNotNull(period99);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period6 = period4.minusYears((int) (byte) -1);
        org.joda.time.Period period7 = period2.withFields((org.joda.time.ReadablePeriod) period4);
        int[] intArray8 = period2.getValues();
        org.joda.time.MutablePeriod mutablePeriod9 = period2.toMutablePeriod();
        org.joda.time.Period period11 = period2.plusMinutes((int) (short) 1);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableDuration10, readableInstant11, periodType12);
        org.joda.time.PeriodType periodType14 = period13.getPeriodType();
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant8, readableInstant9, periodType14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) (byte) -1, (long) (byte) 1, periodType14, chronology16);
        org.joda.time.Period period18 = new org.joda.time.Period((long) 10, periodType14);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) (-1), (long) '#', periodType14, chronology19);
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant1, readableInstant2, periodType14);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) 10, periodType14, chronology22);
        int int24 = period23.getSeconds();
        org.joda.time.Period period26 = period23.withDays((int) ' ');
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(period26);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, chronology1);
        org.joda.time.Period period4 = period2.withMinutes((int) (short) 0);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableDuration5, readableInstant6, periodType7);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableDuration14, readableInstant15, periodType16);
        org.joda.time.PeriodType periodType18 = period17.getPeriodType();
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant12, readableInstant13, periodType18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) (byte) -1, (long) (byte) 1, periodType18, chronology20);
        org.joda.time.Period period22 = new org.joda.time.Period((long) 10, periodType18);
        int int23 = period22.getMonths();
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Period period25 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period25.toDurationTo(readableInstant26);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant24, (org.joda.time.ReadableDuration) duration27);
        int int29 = period28.size();
        org.joda.time.Period period31 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period33 = period31.withMillis((int) (byte) 100);
        org.joda.time.Period period34 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = period34.toDurationTo(readableInstant35);
        org.joda.time.Period period38 = period34.plusHours((-1));
        int int39 = period38.getSeconds();
        org.joda.time.Period period40 = period33.withFields((org.joda.time.ReadablePeriod) period38);
        org.joda.time.Period period42 = period38.withMinutes((int) (short) 0);
        org.joda.time.Period period44 = period38.withMinutes(10);
        org.joda.time.Period period46 = period38.minusHours(100);
        org.joda.time.Period period47 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks48 = period47.toStandardWeeks();
        org.joda.time.Period period49 = period47.negated();
        org.joda.time.Period period51 = org.joda.time.Period.seconds(0);
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.Period period61 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType60);
        org.joda.time.Period period63 = period61.withMillis((int) (short) 10);
        org.joda.time.Period period65 = period61.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType67 = period61.getFieldType((int) (short) 1);
        int int68 = period51.indexOf(durationFieldType67);
        org.joda.time.Period period70 = period49.withFieldAdded(durationFieldType67, (int) 'a');
        org.joda.time.Period period72 = period38.withFieldAdded(durationFieldType67, 0);
        org.joda.time.Period period74 = period28.withField(durationFieldType67, (int) (byte) 1);
        org.joda.time.Period period76 = period22.withFieldAdded(durationFieldType67, (int) (byte) 10);
        int int77 = period8.get(durationFieldType67);
        org.joda.time.Period period79 = period2.withFieldAdded(durationFieldType67, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant80 = null;
        org.joda.time.Duration duration81 = period2.toDurationTo(readableInstant80);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 8 + "'", int29 == 8);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(weeks48);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(durationFieldType67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(duration81);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(0L, (long) 11, chronology2);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((-1), (int) (byte) 10, 8, 1, (int) (byte) 10, 10, (int) (byte) 1, 1);
        org.joda.time.PeriodType periodType12 = period11.getPeriodType();
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant1, readableInstant2, periodType12);
        org.joda.time.Period period14 = new org.joda.time.Period((long) (short) 10, periodType12);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 0, (long) 1, chronology5);
        org.joda.time.Period period7 = period6.negated();
        org.joda.time.Period period8 = period2.withFields((org.joda.time.ReadablePeriod) period6);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = period2.getValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period7 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period9 = period7.withMillis((int) (byte) 100);
        org.joda.time.Period period10 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationTo(readableInstant11);
        org.joda.time.Period period14 = period10.plusHours((-1));
        int int15 = period14.getSeconds();
        org.joda.time.Period period16 = period9.withFields((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Period period18 = period16.withMonths(1);
        org.joda.time.Period period20 = period18.multipliedBy((-1));
        org.joda.time.PeriodType periodType21 = period18.getPeriodType();
        org.joda.time.Period period22 = new org.joda.time.Period((long) ' ', (long) (byte) 1, periodType21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((long) ' ', (long) (byte) -1, periodType21, chronology23);
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType21);
        org.joda.time.Period period27 = period25.plusMillis(1);
        int int28 = period27.getYears();
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableDuration16, readableInstant17, periodType18);
        org.joda.time.PeriodType periodType20 = period19.getPeriodType();
        org.joda.time.Period period21 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType20);
        org.joda.time.Period period22 = new org.joda.time.Period((-1), 0, (int) (short) 1, (int) '4', 10, (int) (byte) 0, 100, (int) (byte) 1, periodType20);
        org.joda.time.Period period24 = period22.plusHours((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours25 = period22.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Hours as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(period24);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(1L, 0L, chronology2);
        org.joda.time.Period period5 = period3.minusYears((int) (byte) 0);
        org.joda.time.Period period7 = period5.withDays(11);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(10L, periodType1, chronology2);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 0, chronology1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType4 = period2.getFieldType(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        int int8 = period7.getMinutes();
        org.joda.time.Period period10 = period7.withMinutes(0);
        org.joda.time.Period period12 = period7.minusMonths((int) (byte) 10);
        org.joda.time.Period period13 = period12.toPeriod();
        org.joda.time.Period period15 = period12.minusHours((int) (byte) 100);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
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
        int int20 = period18.getDays();
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableDuration28, readableInstant29, periodType30);
        org.joda.time.PeriodType periodType32 = period31.getPeriodType();
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant26, readableInstant27, periodType32);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((long) (byte) -1, (long) (byte) 1, periodType32, chronology34);
        org.joda.time.Period period36 = new org.joda.time.Period((long) 10, periodType32);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((long) (-1), (long) '#', periodType32, chronology37);
        boolean boolean39 = period18.equals((java.lang.Object) '#');
        org.joda.time.Period period41 = period18.minusMonths((int) 'a');
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableDuration47, readableInstant48, periodType49);
        org.joda.time.PeriodType periodType51 = period50.getPeriodType();
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant45, readableInstant46, periodType51);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((long) (byte) -1, (long) (byte) 1, periodType51, chronology53);
        org.joda.time.Period period55 = new org.joda.time.Period((long) 10, periodType51);
        org.joda.time.Period period56 = period41.normalizedStandard(periodType51);
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period((long) 10, periodType58);
        org.joda.time.Period period61 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period63 = period61.withMillis((int) (byte) 100);
        org.joda.time.Period period64 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.Duration duration66 = period64.toDurationTo(readableInstant65);
        org.joda.time.Period period68 = period64.plusHours((-1));
        int int69 = period68.getSeconds();
        org.joda.time.Period period70 = period63.withFields((org.joda.time.ReadablePeriod) period68);
        int int71 = period68.getHours();
        org.joda.time.Period period72 = period59.minus((org.joda.time.ReadablePeriod) period68);
        org.joda.time.PeriodType periodType73 = period68.getPeriodType();
        org.joda.time.Period period74 = period56.withPeriodType(periodType73);
        org.joda.time.Period period75 = new org.joda.time.Period((long) (byte) 100, (long) (byte) -1, periodType73);
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.Duration duration77 = period75.toDurationFrom(readableInstant76);
        org.joda.time.Period period79 = period75.minusMonths(1);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(periodType73);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(duration77);
        org.junit.Assert.assertNotNull(period79);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 0, (long) 1, chronology2);
        org.joda.time.Period period5 = period3.plusYears((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration6 = period5.toStandardDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Duration as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.joda.time.Period period1 = org.joda.time.Period.parse("P10Y32M-1WT35H100M10.001S");
        org.joda.time.Period period4 = new org.joda.time.Period((long) 'a', (long) 10);
        org.joda.time.Period period5 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks6 = period5.toStandardWeeks();
        org.joda.time.Period period7 = period5.negated();
        org.joda.time.Period period9 = org.joda.time.Period.seconds(0);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType18);
        org.joda.time.Period period21 = period19.withMillis((int) (short) 10);
        org.joda.time.Period period23 = period19.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType25 = period19.getFieldType((int) (short) 1);
        int int26 = period9.indexOf(durationFieldType25);
        org.joda.time.Period period28 = period7.withFieldAdded(durationFieldType25, (int) 'a');
        org.joda.time.Period period30 = period4.withField(durationFieldType25, (-1));
        int int31 = period1.indexOf(durationFieldType25);
        org.joda.time.Period period33 = period1.plusMonths((int) (byte) 0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(period33);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        int int8 = period7.getMinutes();
        org.joda.time.Period period10 = period7.withMinutes(0);
        org.joda.time.MutablePeriod mutablePeriod11 = period7.toMutablePeriod();
        org.joda.time.format.PeriodFormatter periodFormatter12 = null;
        java.lang.String str13 = period7.toString(periodFormatter12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableDuration15);
        org.joda.time.Period period18 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period20 = period18.minusYears((int) (byte) -1);
        org.joda.time.Period period21 = period16.withFields((org.joda.time.ReadablePeriod) period18);
        int[] intArray22 = period16.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter23 = null;
        java.lang.String str24 = period16.toString(periodFormatter23);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType33);
        org.joda.time.Period period36 = period34.withMillis((int) (short) 10);
        org.joda.time.Period period38 = period34.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType40 = period34.getFieldType((int) (short) 1);
        org.joda.time.Period period42 = period16.withField(durationFieldType40, (int) (short) 10);
        org.joda.time.Period period44 = period7.withField(durationFieldType40, (int) (short) 100);
        org.joda.time.Period period46 = period7.minusWeeks(1000);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PT100H" + "'", str13, "PT100H");
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PT0S" + "'", str24, "PT0S");
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(durationFieldType40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.Period period5 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationTo(readableInstant6);
        boolean boolean8 = period4.equals((java.lang.Object) duration7);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((int) ' ', 0, (int) (short) 100, 100, (int) (byte) 10, 100, (-1), (int) (short) 100, periodType17);
        org.joda.time.Period period20 = period18.minusYears((int) '#');
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Period period25 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period27 = period25.minusYears((int) (byte) -1);
        org.joda.time.Duration duration28 = period25.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableDuration32, readableInstant33, periodType34);
        org.joda.time.PeriodType periodType36 = period35.getPeriodType();
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant30, readableInstant31, periodType36);
        org.joda.time.Period period38 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration28, readableInstant29, periodType36);
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant22, readableInstant23, periodType36);
        org.joda.time.Period period40 = new org.joda.time.Period((long) (short) 1, periodType36);
        org.joda.time.Period period41 = period20.normalizedStandard(periodType36);
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration7, periodType36);
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration7);
        org.joda.time.Period period53 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period55 = period53.withMillis((int) (byte) 100);
        org.joda.time.Period period56 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Duration duration58 = period56.toDurationTo(readableInstant57);
        org.joda.time.Period period60 = period56.plusHours((-1));
        int int61 = period60.getSeconds();
        org.joda.time.Period period62 = period55.withFields((org.joda.time.ReadablePeriod) period60);
        org.joda.time.Period period64 = period62.plusMillis((int) '#');
        org.joda.time.Period period66 = period64.plusMinutes((int) (short) -1);
        org.joda.time.Seconds seconds67 = period64.toStandardSeconds();
        org.joda.time.Period period69 = period64.minusMinutes((int) (byte) 0);
        org.joda.time.PeriodType periodType70 = period64.getPeriodType();
        org.joda.time.Period period71 = new org.joda.time.Period((int) (byte) 0, (int) '#', (-1), 0, (int) (short) 10, (int) (short) 10, 8, (int) (short) -1, periodType70);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.Period period73 = new org.joda.time.Period((java.lang.Object) readableInstant0, periodType70, chronology72);
        int int74 = period73.getMillis();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(seconds67);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(periodType70);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period2 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period4 = period2.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationTo(readableInstant6);
        org.joda.time.Period period9 = period5.plusHours((-1));
        int int10 = period9.getSeconds();
        org.joda.time.Period period11 = period4.withFields((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period13 = period11.withMonths(1);
        org.joda.time.Period period15 = period13.multipliedBy((-1));
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period13.toDurationFrom(readableInstant16);
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration17);
        org.joda.time.Hours hours19 = period18.toStandardHours();
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(hours19);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.plusYears((int) (short) -1);
        org.joda.time.Period period8 = period4.plusMillis((int) ' ');
        org.joda.time.MutablePeriod mutablePeriod9 = period8.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant10, readableDuration11);
        org.joda.time.Period period14 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period16 = period14.minusYears((int) (byte) -1);
        org.joda.time.Period period17 = period12.withFields((org.joda.time.ReadablePeriod) period14);
        int[] intArray18 = period12.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter19 = null;
        java.lang.String str20 = period12.toString(periodFormatter19);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType29);
        org.joda.time.Period period32 = period30.withMillis((int) (short) 10);
        org.joda.time.Period period34 = period30.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType36 = period30.getFieldType((int) (short) 1);
        org.joda.time.Period period38 = period12.withField(durationFieldType36, (int) (short) 10);
        int int39 = period8.get(durationFieldType36);
        org.joda.time.Period period41 = period8.minusYears((int) '4');
        org.joda.time.MutablePeriod mutablePeriod42 = period8.toMutablePeriod();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PT0S" + "'", str20, "PT0S");
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(mutablePeriod42);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 0, (long) 97);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType10, chronology11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period12.toDurationFrom(readableInstant13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant15, readableDuration16);
        org.joda.time.Period period19 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period21 = period19.minusYears((int) (byte) -1);
        org.joda.time.Period period22 = period17.withFields((org.joda.time.ReadablePeriod) period19);
        org.joda.time.Period period24 = period19.withMinutes((int) (short) -1);
        org.joda.time.Period period25 = period12.plus((org.joda.time.ReadablePeriod) period24);
        org.joda.time.PeriodType periodType26 = period25.getPeriodType();
        org.joda.time.Period period27 = new org.joda.time.Period((int) '4', (int) 'a', (int) (short) -1, 100, 100, 10, (int) '4', 10, periodType26);
        org.joda.time.Period period29 = period27.plusMillis((-1));
        int int30 = period29.getMinutes();
        int int31 = period29.getMonths();
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.Period period13 = period9.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType15 = period9.getFieldType((int) (short) 1);
        org.joda.time.format.PeriodFormatter periodFormatter16 = null;
        java.lang.String str17 = period9.toString(periodFormatter16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes18 = period9.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "P10Y32M-1WT35H100M10.001S" + "'", str17, "P10Y32M-1WT35H100M10.001S");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period4 = period2.withMinutes((int) (byte) -1);
        org.joda.time.Period period6 = period4.plusDays((int) (byte) 1);
        org.joda.time.Period period8 = period4.minusMillis(8);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((java.lang.Object) period8, chronology9);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.minusMillis((int) (short) 0);
        org.joda.time.Period period5 = period3.withHours((int) (short) 100);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) (short) 10);
        org.joda.time.Period period3 = period1.withDays((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration4 = period3.toStandardDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Duration as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableDuration25, readableInstant26, periodType27);
        org.joda.time.PeriodType periodType29 = period28.getPeriodType();
        org.joda.time.Period period30 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType29);
        org.joda.time.Period period31 = new org.joda.time.Period((int) (byte) 100, 0, 35, 100, (int) (byte) -1, (int) (byte) -1, (int) (byte) 0, (int) (byte) 10, periodType29);
        org.joda.time.Period period32 = new org.joda.time.Period((int) (byte) 0, 0, (int) '#', (int) (short) 1, 0, (int) (byte) 100, 100, (int) (byte) -1, periodType29);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((long) 97, periodType29, chronology33);
        java.lang.Class<?> wildcardClass35 = period34.getClass();
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.withYears((int) 'a');
        org.joda.time.Period period7 = period6.normalizedStandard();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days8 = period6.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) -1, 100L, chronology2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationTo(readableInstant4);
        org.joda.time.Period period7 = period3.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) 100, chronology9);
        org.joda.time.Period period12 = period10.withMinutes((int) (short) 0);
        org.joda.time.DurationFieldType durationFieldType14 = period12.getFieldType((int) (byte) 1);
        org.joda.time.Period period16 = period7.withField(durationFieldType14, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration17 = period16.toStandardDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Duration as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        int int5 = period4.getSeconds();
        org.joda.time.Period period7 = period4.withSeconds(10);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableDuration9);
        org.joda.time.Period period12 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period14 = period12.minusYears((int) (byte) -1);
        org.joda.time.Period period15 = period10.withFields((org.joda.time.ReadablePeriod) period12);
        int[] intArray16 = period10.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter17 = null;
        java.lang.String str18 = period10.toString(periodFormatter17);
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType27);
        org.joda.time.Period period30 = period28.withMillis((int) (short) 10);
        org.joda.time.Period period32 = period28.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType34 = period28.getFieldType((int) (short) 1);
        org.joda.time.Period period36 = period10.withField(durationFieldType34, (int) (short) 10);
        org.joda.time.Period period38 = period7.withFieldAdded(durationFieldType34, (int) (byte) 10);
        int int39 = period38.getYears();
        org.joda.time.Period period48 = new org.joda.time.Period((int) (short) 10, (-1), 4, (-35), (int) (byte) 10, (int) '4', 4, (int) (byte) 100);
        org.joda.time.Period period49 = period38.withFields((org.joda.time.ReadablePeriod) period48);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT0S" + "'", str18, "PT0S");
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(period49);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.joda.time.Period period8 = new org.joda.time.Period(100, 4, (int) (byte) -1, (-1), 35, 8, 10, (int) (short) 1);
        org.joda.time.format.PeriodFormatter periodFormatter9 = null;
        java.lang.String str10 = period8.toString(periodFormatter9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "P100Y4M-1W-1DT35H8M10.001S" + "'", str10, "P100Y4M-1W-1DT35H8M10.001S");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
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
        int int15 = period8.getMillis();
        org.joda.time.Period period16 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationTo(readableInstant17);
        org.joda.time.Period period20 = period16.plusHours((-1));
        org.joda.time.Period period22 = period20.plusYears((int) (short) -1);
        org.joda.time.Period period31 = new org.joda.time.Period((-1), (int) (byte) 10, 8, 1, (int) (byte) 10, 10, (int) (byte) 1, 1);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Period period33 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Duration duration35 = period33.toDurationTo(readableInstant34);
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant32, (org.joda.time.ReadableDuration) duration35);
        int[] intArray37 = period36.getValues();
        org.joda.time.Period period39 = period36.minusMinutes((int) '#');
        org.joda.time.Period period40 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Duration duration42 = period40.toDurationTo(readableInstant41);
        org.joda.time.Period period44 = period40.plusHours((-1));
        int int45 = period44.getSeconds();
        org.joda.time.Period period47 = period44.withSeconds(10);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant48, readableDuration49);
        org.joda.time.Period period52 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period54 = period52.minusYears((int) (byte) -1);
        org.joda.time.Period period55 = period50.withFields((org.joda.time.ReadablePeriod) period52);
        int[] intArray56 = period50.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter57 = null;
        java.lang.String str58 = period50.toString(periodFormatter57);
        org.joda.time.PeriodType periodType67 = null;
        org.joda.time.Period period68 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType67);
        org.joda.time.Period period70 = period68.withMillis((int) (short) 10);
        org.joda.time.Period period72 = period68.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType74 = period68.getFieldType((int) (short) 1);
        org.joda.time.Period period76 = period50.withField(durationFieldType74, (int) (short) 10);
        org.joda.time.Period period78 = period47.withFieldAdded(durationFieldType74, (int) (byte) 10);
        int int79 = period36.indexOf(durationFieldType74);
        int int80 = period31.indexOf(durationFieldType74);
        int int81 = period22.get(durationFieldType74);
        int int82 = period8.get(durationFieldType74);
        org.joda.time.Period period84 = period8.minusYears(0);
        java.lang.Class<?> wildcardClass85 = period8.getClass();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "PT0S" + "'", str58, "PT0S");
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(durationFieldType74);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period11, periodType12);
        org.joda.time.Period period15 = period13.withHours((int) 'a');
        org.joda.time.Period period17 = period13.withMonths(0);
        org.joda.time.Period period19 = period13.plusYears(1);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableDuration24, readableInstant25, periodType26);
        org.joda.time.PeriodType periodType28 = period27.getPeriodType();
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant22, readableInstant23, periodType28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(0L, 0L, periodType28, chronology30);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((java.lang.Object) period19, periodType28, chronology32);
        org.joda.time.Period period35 = period33.withHours((-35));
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(period35);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
        int[] intArray22 = period21.getValues();
        org.joda.time.Period period26 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period28 = period26.minusYears((int) (byte) -1);
        org.joda.time.Duration duration29 = period26.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(readableDuration33, readableInstant34, periodType35);
        org.joda.time.PeriodType periodType37 = period36.getPeriodType();
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant31, readableInstant32, periodType37);
        org.joda.time.Period period39 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration29, readableInstant30, periodType37);
        org.joda.time.Period period40 = new org.joda.time.Period(1L, (long) (short) 10, periodType37);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period41 = new org.joda.time.Period((java.lang.Object) intArray22, periodType37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: [I");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 0, 0, 0, 0, 0, 0, 0, 1 });
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(periodType37);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (byte) -1);
        int int2 = period1.size();
        org.joda.time.Period period4 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period6 = period4.withMillis((int) (byte) 100);
        org.joda.time.Period period7 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period7.toDurationTo(readableInstant8);
        org.joda.time.Period period11 = period7.plusHours((-1));
        int int12 = period11.getSeconds();
        org.joda.time.Period period13 = period6.withFields((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period15 = period13.plusMillis((int) '#');
        org.joda.time.Period period17 = period15.plusMinutes((int) (short) -1);
        org.joda.time.Period period18 = period1.minus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Period period20 = period17.plusMillis(0);
        org.joda.time.Period period22 = period20.plusMinutes(10);
        org.joda.time.Period period24 = period20.withSeconds((int) '4');
        org.joda.time.Hours hours25 = period20.toStandardHours();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(hours25);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) (short) 100);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
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
        org.joda.time.Period period11 = period10.normalizedStandard();
        org.joda.time.Period period13 = period10.withMonths(10);
        int int14 = period10.getMonths();
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType10);
        org.joda.time.Period period13 = period11.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((java.lang.Object) period13, periodType14);
        org.joda.time.Period period17 = period15.withHours((int) 'a');
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType21, chronology22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period23.toDurationFrom(readableInstant24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period27.toDurationTo(readableInstant28);
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant26, (org.joda.time.ReadableDuration) duration29);
        org.joda.time.Weeks weeks31 = period30.toStandardWeeks();
        org.joda.time.Period period32 = period30.toPeriod();
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((java.lang.Object) period32, periodType33);
        org.joda.time.Period period36 = period34.plusHours(8);
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
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((java.lang.Object) period36, periodType45, chronology49);
        org.joda.time.Period period51 = new org.joda.time.Period(readableInstant18, (org.joda.time.ReadableDuration) duration25, periodType45);
        org.joda.time.Period period52 = period15.withPeriodType(periodType45);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((long) (byte) 10, (long) (short) 10, periodType45, chronology53);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(weeks31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(period52);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.Period period13 = period9.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType15 = period9.getFieldType((int) (short) 1);
        org.joda.time.format.PeriodFormatter periodFormatter16 = null;
        java.lang.String str17 = period9.toString(periodFormatter16);
        int int18 = period9.getMinutes();
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "P10Y32M-1WT35H100M10.001S" + "'", str17, "P10Y32M-1WT35H100M10.001S");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
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
        org.joda.time.Period period19 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period21 = period19.withMillis((int) (byte) 100);
        org.joda.time.Period period22 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationTo(readableInstant23);
        org.joda.time.Period period26 = period22.plusHours((-1));
        int int27 = period26.getSeconds();
        org.joda.time.Period period28 = period21.withFields((org.joda.time.ReadablePeriod) period26);
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType37);
        org.joda.time.Period period40 = period38.withMillis((int) (short) 10);
        org.joda.time.Period period42 = period38.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType44 = period38.getFieldType((int) (short) 1);
        org.joda.time.Period period46 = period21.withField(durationFieldType44, 100);
        boolean boolean47 = period4.isSupported(durationFieldType44);
        java.lang.Object obj48 = null;
        boolean boolean49 = period4.equals(obj48);
        org.joda.time.Period period51 = period4.plusMinutes((int) '#');
        int int53 = period4.getValue(0);
        int int54 = period4.getMonths();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period2 = period1.negated();
        org.joda.time.Period period4 = period1.minusDays((-1));
        org.joda.time.Period period6 = period4.plusWeeks(0);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationTo(readableInstant7);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.Period period13 = period9.plusYears((int) (byte) 10);
        org.joda.time.Period period14 = period13.normalizedStandard();
        int int15 = period13.getDays();
        org.joda.time.Period period18 = new org.joda.time.Period((long) (short) 10, (long) (short) 0);
        org.joda.time.Period period19 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period19.toDurationTo(readableInstant20);
        org.joda.time.Period period23 = period19.plusHours((-1));
        int int24 = period23.getSeconds();
        org.joda.time.Period period26 = period23.withSeconds(10);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant27, readableDuration28);
        org.joda.time.Period period31 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period33 = period31.minusYears((int) (byte) -1);
        org.joda.time.Period period34 = period29.withFields((org.joda.time.ReadablePeriod) period31);
        int[] intArray35 = period29.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter36 = null;
        java.lang.String str37 = period29.toString(periodFormatter36);
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType46);
        org.joda.time.Period period49 = period47.withMillis((int) (short) 10);
        org.joda.time.Period period51 = period47.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType53 = period47.getFieldType((int) (short) 1);
        org.joda.time.Period period55 = period29.withField(durationFieldType53, (int) (short) 10);
        org.joda.time.Period period57 = period26.withFieldAdded(durationFieldType53, (int) (byte) 10);
        int int58 = period18.indexOf(durationFieldType53);
        boolean boolean59 = period13.isSupported(durationFieldType53);
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period((java.lang.Object) period13, periodType60, chronology61);
        org.joda.time.format.PeriodFormatter periodFormatter63 = null;
        java.lang.String str64 = period13.toString(periodFormatter63);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "PT0S" + "'", str37, "PT0S");
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(durationFieldType53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "P20Y32M-1WT35H100M10.001S" + "'", str64, "P20Y32M-1WT35H100M10.001S");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 100);
        org.joda.time.Duration duration2 = period1.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableDuration15, readableInstant16, periodType17);
        org.joda.time.PeriodType periodType19 = period18.getPeriodType();
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant13, readableInstant14, periodType19);
        org.joda.time.Period period21 = new org.joda.time.Period((long) '#', periodType19);
        org.joda.time.Period period22 = new org.joda.time.Period(0, (int) (short) 10, 97, 0, (int) (short) 0, 4, (int) (short) 10, 97, periodType19);
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration2, readableInstant3, periodType19);
        org.joda.time.Period period25 = period23.plusHours(8);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(period25);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableDuration0, readableInstant1, periodType2);
        org.joda.time.PeriodType periodType4 = period3.getPeriodType();
        org.joda.time.Period period6 = period3.plusMonths(8);
        org.joda.time.Period period8 = period6.withDays(35);
        org.joda.time.Period period10 = period6.plusHours((int) (byte) 0);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.withYears((int) 'a');
        java.lang.String str7 = period6.toString();
        org.joda.time.Period period9 = period6.withMonths((int) (short) 1);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "P97YT-1H" + "'", str7, "P97YT-1H");
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 10, periodType1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period6 = period4.withMillis((int) (byte) 100);
        org.joda.time.Period period7 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period7.toDurationTo(readableInstant8);
        org.joda.time.Period period11 = period7.plusHours((-1));
        int int12 = period11.getSeconds();
        org.joda.time.Period period13 = period6.withFields((org.joda.time.ReadablePeriod) period11);
        int int14 = period11.getHours();
        org.joda.time.Period period15 = period2.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period17 = period2.multipliedBy((int) (byte) 100);
        org.joda.time.Period period18 = period2.negated();
        org.joda.time.Period period20 = period18.withMinutes((-1));
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) 1, 10L, periodType2, chronology3);
        org.joda.time.Period period6 = period4.plusWeeks((int) (byte) -1);
        org.joda.time.Period period8 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period10 = period8.withMillis((int) (byte) 100);
        org.joda.time.Period period12 = period10.plusSeconds((int) ' ');
        org.joda.time.DurationFieldType durationFieldType13 = null;
        int int14 = period10.indexOf(durationFieldType13);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = period10.withPeriodType(periodType15);
        org.joda.time.Period period17 = period4.withFields((org.joda.time.ReadablePeriod) period16);
        java.lang.String str18 = period4.toString();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT0.009S" + "'", str18, "PT0.009S");
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) (byte) -1);
        org.joda.time.Period period3 = period1.withSeconds((int) (short) 0);
        java.lang.Class<?> wildcardClass4 = period3.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.joda.time.Period period5 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period7 = period5.minusYears((int) (byte) -1);
        org.joda.time.Duration duration8 = period5.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableDuration12, readableInstant13, periodType14);
        org.joda.time.PeriodType periodType16 = period15.getPeriodType();
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType16);
        org.joda.time.Period period18 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration8, readableInstant9, periodType16);
        org.joda.time.Period period19 = new org.joda.time.Period(1L, (long) (short) 10, periodType16);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period22 = period21.negated();
        org.joda.time.PeriodType periodType23 = period22.getPeriodType();
        org.joda.time.Period period24 = period19.withPeriodType(periodType23);
        org.joda.time.Period period25 = new org.joda.time.Period((long) (byte) 0, (long) (byte) 10, periodType23);
        org.joda.time.Period period26 = new org.joda.time.Period((java.lang.Object) period25);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(period24);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period6 = period4.minusYears((int) (byte) -1);
        org.joda.time.Period period7 = period2.withFields((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period9 = period4.withMinutes((int) (short) -1);
        java.lang.Class<?> wildcardClass10 = period9.getClass();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period11, periodType12);
        org.joda.time.Period period15 = period11.minusYears((int) '#');
        org.joda.time.MutablePeriod mutablePeriod16 = period11.toMutablePeriod();
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(mutablePeriod16);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((-1), (int) (short) 100, (int) (short) 0, (int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period8.toDurationTo(readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period16 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period18 = period16.minusYears((int) (byte) -1);
        org.joda.time.Duration duration19 = period16.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableDuration23, readableInstant24, periodType25);
        org.joda.time.PeriodType periodType27 = period26.getPeriodType();
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant21, readableInstant22, periodType27);
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration19, readableInstant20, periodType27);
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant13, readableInstant14, periodType27);
        org.joda.time.Period period31 = new org.joda.time.Period((long) (short) 1, periodType27);
        org.joda.time.Period period32 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration10, readableInstant11, periodType27);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((long) 97, (long) 0, periodType27, chronology33);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period35 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(periodType27);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableDuration0, readableInstant1, periodType2);
        org.joda.time.PeriodType periodType4 = period3.getPeriodType();
        org.joda.time.Period period6 = period3.plusMonths(8);
        org.joda.time.Period period8 = period6.plusYears((int) (short) 1);
        org.joda.time.Period period10 = period8.plusHours((int) (byte) -1);
        org.joda.time.Period period12 = period8.withMillis((int) (byte) 10);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType9);
        org.joda.time.Period period12 = period10.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period12, periodType13);
        org.joda.time.Period period16 = period14.withHours((int) 'a');
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType20, chronology21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationFrom(readableInstant23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Period period26 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = period26.toDurationTo(readableInstant27);
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant25, (org.joda.time.ReadableDuration) duration28);
        org.joda.time.Weeks weeks30 = period29.toStandardWeeks();
        org.joda.time.Period period31 = period29.toPeriod();
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((java.lang.Object) period31, periodType32);
        org.joda.time.Period period35 = period33.plusHours(8);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableDuration40, readableInstant41, periodType42);
        org.joda.time.PeriodType periodType44 = period43.getPeriodType();
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant38, readableInstant39, periodType44);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((long) (byte) -1, (long) (byte) 1, periodType44, chronology46);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period((java.lang.Object) period35, periodType44, chronology48);
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant17, (org.joda.time.ReadableDuration) duration24, periodType44);
        org.joda.time.Period period51 = period14.withPeriodType(periodType44);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period((long) 100, periodType44, chronology52);
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period((long) 1, periodType55, chronology56);
        org.joda.time.Period period58 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks59 = period58.toStandardWeeks();
        org.joda.time.Period period60 = period57.plus((org.joda.time.ReadablePeriod) period58);
        org.joda.time.Period period61 = period53.minus((org.joda.time.ReadablePeriod) period58);
        org.joda.time.Period period63 = period58.withDays(0);
        int int64 = period63.getWeeks();
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(weeks59);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) (short) 1, chronology5);
        int int7 = period6.getMonths();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableInstant10);
        org.joda.time.Period period12 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period12.toDurationTo(readableInstant13);
        boolean boolean15 = period11.equals((java.lang.Object) duration14);
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((int) ' ', 0, (int) (short) 100, 100, (int) (byte) 10, 100, (-1), (int) (short) 100, periodType24);
        org.joda.time.Period period27 = period25.minusYears((int) '#');
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Period period32 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period34 = period32.minusYears((int) (byte) -1);
        org.joda.time.Duration duration35 = period32.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableDuration39, readableInstant40, periodType41);
        org.joda.time.PeriodType periodType43 = period42.getPeriodType();
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant37, readableInstant38, periodType43);
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration35, readableInstant36, periodType43);
        org.joda.time.Period period46 = new org.joda.time.Period(readableInstant29, readableInstant30, periodType43);
        org.joda.time.Period period47 = new org.joda.time.Period((long) (short) 1, periodType43);
        org.joda.time.Period period48 = period27.normalizedStandard(periodType43);
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant8, (org.joda.time.ReadableDuration) duration14, periodType43);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period((java.lang.Object) period6, periodType43, chronology50);
        org.joda.time.Period period52 = new org.joda.time.Period((long) (short) 100, (long) (byte) 100, periodType43);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period53 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(period48);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.Period period13 = period9.plus(readablePeriod12);
        org.joda.time.Period period15 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period17 = period15.withMillis((int) (byte) 100);
        org.joda.time.Period period18 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = period18.toDurationTo(readableInstant19);
        org.joda.time.Period period22 = period18.plusHours((-1));
        int int23 = period22.getSeconds();
        org.joda.time.Period period24 = period17.withFields((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Period period26 = period24.withMonths(1);
        org.joda.time.Period period28 = period26.multipliedBy((-1));
        org.joda.time.Period period30 = period26.withDays(8);
        org.joda.time.Period period32 = period26.plusHours(68);
        org.joda.time.Period period41 = new org.joda.time.Period((-1), (int) (byte) 10, 8, 1, (int) (byte) 10, 10, (int) (byte) 1, 1);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Period period43 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = period43.toDurationTo(readableInstant44);
        org.joda.time.Period period46 = new org.joda.time.Period(readableInstant42, (org.joda.time.ReadableDuration) duration45);
        int[] intArray47 = period46.getValues();
        org.joda.time.Period period49 = period46.minusMinutes((int) '#');
        org.joda.time.Period period50 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Duration duration52 = period50.toDurationTo(readableInstant51);
        org.joda.time.Period period54 = period50.plusHours((-1));
        int int55 = period54.getSeconds();
        org.joda.time.Period period57 = period54.withSeconds(10);
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period(readableInstant58, readableDuration59);
        org.joda.time.Period period62 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period64 = period62.minusYears((int) (byte) -1);
        org.joda.time.Period period65 = period60.withFields((org.joda.time.ReadablePeriod) period62);
        int[] intArray66 = period60.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter67 = null;
        java.lang.String str68 = period60.toString(periodFormatter67);
        org.joda.time.PeriodType periodType77 = null;
        org.joda.time.Period period78 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType77);
        org.joda.time.Period period80 = period78.withMillis((int) (short) 10);
        org.joda.time.Period period82 = period78.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType84 = period78.getFieldType((int) (short) 1);
        org.joda.time.Period period86 = period60.withField(durationFieldType84, (int) (short) 10);
        org.joda.time.Period period88 = period57.withFieldAdded(durationFieldType84, (int) (byte) 10);
        int int89 = period46.indexOf(durationFieldType84);
        int int90 = period41.indexOf(durationFieldType84);
        int int91 = period32.get(durationFieldType84);
        int int92 = period13.get(durationFieldType84);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "PT0S" + "'", str68, "PT0S");
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(durationFieldType84);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(period88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1 + "'", int89 == 1);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 32 + "'", int92 == 32);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableDuration16, readableInstant17, periodType18);
        org.joda.time.PeriodType periodType20 = period19.getPeriodType();
        org.joda.time.Period period21 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType20);
        org.joda.time.Period period22 = new org.joda.time.Period((-1), 0, (int) (short) 1, (int) '4', 10, (int) (byte) 0, 100, (int) (byte) 1, periodType20);
        org.joda.time.Period period24 = period22.plusHours((int) (short) -1);
        org.joda.time.Period period26 = period22.withWeeks((int) (byte) -1);
        int int27 = period22.getHours();
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period22.toDurationFrom(readableInstant28);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(duration29);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period11, periodType12);
        org.joda.time.Period period15 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period17 = period15.withMillis((int) (byte) 100);
        org.joda.time.Period period19 = period15.withMonths((int) ' ');
        org.joda.time.Period period21 = period15.withHours(100);
        org.joda.time.Period period22 = period11.withFields((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Period period24 = period22.withWeeks((int) (short) 10);
        org.joda.time.Period period26 = period24.withDays(0);
        org.joda.time.Seconds seconds27 = period26.toStandardSeconds();
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType36);
        org.joda.time.Period period39 = period37.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((java.lang.Object) period39, periodType40);
        org.joda.time.Period period43 = period39.withMonths(0);
        org.joda.time.Period period45 = period43.minusWeeks((int) (short) -1);
        org.joda.time.Period period47 = period45.withHours((int) ' ');
        org.joda.time.Period period48 = period26.plus((org.joda.time.ReadablePeriod) period45);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = period26.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period48);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 0, (long) 1, chronology2);
        org.joda.time.Period period4 = period3.negated();
        org.joda.time.Period period6 = period3.minusMillis((int) (short) -1);
        org.joda.time.Seconds seconds7 = period6.toStandardSeconds();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(seconds7);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.Period period8 = period4.plusHours((-1));
        int int9 = period8.getSeconds();
        org.joda.time.Period period10 = period3.withFields((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period12 = period10.withMonths(1);
        org.joda.time.Period period14 = period12.multipliedBy((-1));
        org.joda.time.Period period16 = period12.withSeconds((int) (short) 100);
        org.joda.time.Period period18 = period16.plusMonths((int) (byte) 100);
        org.joda.time.Period period19 = period18.negated();
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
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 10, periodType1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period6 = period4.withMillis((int) (byte) 100);
        org.joda.time.Period period7 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period7.toDurationTo(readableInstant8);
        org.joda.time.Period period11 = period7.plusHours((-1));
        int int12 = period11.getSeconds();
        org.joda.time.Period period13 = period6.withFields((org.joda.time.ReadablePeriod) period11);
        int int14 = period11.getHours();
        org.joda.time.Period period15 = period2.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period17 = period15.withHours(10);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.Period period19 = period15.minus(readablePeriod18);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (byte) 0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
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
        org.joda.time.Period period12 = period10.minusMonths(10);
        org.joda.time.Period period14 = period10.minusDays(0);
        org.joda.time.Period period16 = period10.withSeconds((int) (byte) 0);
        org.joda.time.Period period20 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period22 = period20.withMillis((int) (byte) 100);
        org.joda.time.Period period23 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period23.toDurationTo(readableInstant24);
        org.joda.time.Period period27 = period23.plusHours((-1));
        int int28 = period27.getSeconds();
        org.joda.time.Period period29 = period22.withFields((org.joda.time.ReadablePeriod) period27);
        org.joda.time.Period period31 = period29.withMonths(1);
        org.joda.time.Period period33 = period31.multipliedBy((-1));
        org.joda.time.PeriodType periodType34 = period31.getPeriodType();
        org.joda.time.Period period35 = new org.joda.time.Period((long) ' ', (long) (byte) 1, periodType34);
        org.joda.time.Period period36 = period10.withPeriodType(periodType34);
        org.joda.time.Period period38 = period36.withHours((int) 'a');
        java.lang.Class<?> wildcardClass39 = period38.getClass();
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.minusYears((int) (byte) -1);
        org.joda.time.Duration duration4 = period1.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableDuration8, readableInstant9, periodType10);
        org.joda.time.PeriodType periodType12 = period11.getPeriodType();
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant6, readableInstant7, periodType12);
        org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5, periodType12);
        org.joda.time.Period period16 = period14.plusWeeks((int) (byte) 1);
        int int17 = period16.getYears();
        int[] intArray18 = period16.getValues();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 0, 0, 1, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMinutes((int) (byte) 0);
        org.joda.time.MutablePeriod mutablePeriod6 = period5.toMutablePeriod();
        org.joda.time.Period period7 = period5.normalizedStandard();
        int int8 = period5.getMonths();
        org.joda.time.Period period10 = period5.withDays((int) (short) 100);
        org.joda.time.Period period11 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationTo(readableInstant12);
        org.joda.time.Period period15 = period11.plusHours((-1));
        org.joda.time.Period period17 = period15.plusYears((int) (short) -1);
        org.joda.time.Period period19 = period15.plusMillis((int) ' ');
        org.joda.time.MutablePeriod mutablePeriod20 = period19.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant21, readableDuration22);
        org.joda.time.Period period25 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period27 = period25.minusYears((int) (byte) -1);
        org.joda.time.Period period28 = period23.withFields((org.joda.time.ReadablePeriod) period25);
        int[] intArray29 = period23.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter30 = null;
        java.lang.String str31 = period23.toString(periodFormatter30);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType40);
        org.joda.time.Period period43 = period41.withMillis((int) (short) 10);
        org.joda.time.Period period45 = period41.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType47 = period41.getFieldType((int) (short) 1);
        org.joda.time.Period period49 = period23.withField(durationFieldType47, (int) (short) 10);
        int int50 = period19.get(durationFieldType47);
        boolean boolean51 = period10.isSupported(durationFieldType47);
        org.joda.time.Duration duration52 = period10.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration52, readableInstant53);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(mutablePeriod20);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PT0S" + "'", str31, "PT0S");
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(durationFieldType47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(duration52);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.joda.time.Period period8 = new org.joda.time.Period((-1), (int) (byte) 10, 8, 1, (int) (byte) 10, 10, (int) (byte) 1, 1);
        org.joda.time.Period period10 = period8.multipliedBy((int) (short) -1);
        org.joda.time.Period period12 = period8.plusMonths((int) (byte) 0);
        org.joda.time.Period period14 = period12.plusSeconds((int) (short) 1);
        int int15 = period12.getMinutes();
        org.joda.time.Period period17 = period12.minusMonths((int) 'a');
        int int18 = period17.getHours();
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period2 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period4 = period2.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationTo(readableInstant6);
        org.joda.time.Period period9 = period5.plusHours((-1));
        int int10 = period9.getSeconds();
        org.joda.time.Period period11 = period4.withFields((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period13 = period11.withMonths(1);
        org.joda.time.Weeks weeks14 = period11.toStandardWeeks();
        int int15 = period11.size();
        org.joda.time.Period period17 = period11.withYears((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period11.toDurationTo(readableInstant18);
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration19);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(duration19);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
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
        org.joda.time.Period period12 = period10.minusDays(8);
        org.joda.time.Period period13 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period13.toDurationTo(readableInstant14);
        org.joda.time.Period period17 = period13.plusHours((-1));
        org.joda.time.Period period19 = period13.withYears(1);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationTo(readableInstant23);
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant21, (org.joda.time.ReadableDuration) duration24);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant20, (org.joda.time.ReadableDuration) duration24, periodType26);
        org.joda.time.Period period29 = period27.plusWeeks(0);
        org.joda.time.Period period31 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period32 = period31.negated();
        org.joda.time.Period period33 = period27.withFields((org.joda.time.ReadablePeriod) period32);
        org.joda.time.PeriodType periodType34 = period33.getPeriodType();
        org.joda.time.Period period35 = period19.withPeriodType(periodType34);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period36 = new org.joda.time.Period((java.lang.Object) 8, periodType34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(period35);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT0.001S");
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.joda.time.Period period8 = new org.joda.time.Period(8, 35, (int) 'a', 52, 8, 8, (-1), 11);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(100);
        org.joda.time.format.PeriodFormatter periodFormatter2 = null;
        java.lang.String str3 = period1.toString(periodFormatter2);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT100S" + "'", str3, "PT100S");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 1, chronology2);
        org.joda.time.Period period7 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period9 = period7.minusYears((int) (byte) -1);
        org.joda.time.Duration duration10 = period7.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableDuration14, readableInstant15, periodType16);
        org.joda.time.PeriodType periodType18 = period17.getPeriodType();
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant12, readableInstant13, periodType18);
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration10, readableInstant11, periodType18);
        org.joda.time.Period period21 = new org.joda.time.Period(1L, (long) (short) 10, periodType18);
        org.joda.time.Period period22 = period3.withPeriodType(periodType18);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(0L, periodType18, chronology23);
        org.joda.time.Period period26 = period24.minusSeconds((int) (byte) -1);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period26);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.joda.time.Period period1 = org.joda.time.Period.years((-1));
        org.joda.time.Period period3 = period1.withHours(0);
        org.joda.time.Period period5 = period3.withSeconds((int) (short) 10);
        org.joda.time.Period period7 = period5.minusMinutes((int) (byte) 100);
        org.joda.time.Period period9 = period5.withSeconds((int) (byte) 1);
        org.joda.time.Period period11 = new org.joda.time.Period((long) 8);
        org.joda.time.Period period13 = period11.plusWeeks((int) (short) 1);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period13.toDurationFrom(readableInstant14);
        org.joda.time.Period period17 = period13.minusWeeks((int) (short) 1);
        org.joda.time.Period period18 = period9.minus((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period20 = period18.plusSeconds(40);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = period18.getValue(40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableDuration1, readableInstant2, periodType3);
        org.joda.time.PeriodType periodType5 = period4.getPeriodType();
        org.joda.time.Period period7 = period4.plusMonths(8);
        org.joda.time.Period period9 = period7.withDays(35);
        org.joda.time.Period period11 = period9.withWeeks(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period9.toDurationFrom(readableInstant12);
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration13);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration13);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.joda.time.Period period2 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period4 = period2.withMillis((int) (byte) 100);
        org.joda.time.Period period6 = period2.withMonths((int) ' ');
        org.joda.time.PeriodType periodType7 = period6.getPeriodType();
        org.joda.time.Period period8 = new org.joda.time.Period((long) 32, periodType7);
        java.lang.Class<?> wildcardClass9 = periodType7.getClass();
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
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
        int int21 = period20.getMonths();
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
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        org.joda.time.Period period6 = period4.withWeeks(0);
        org.joda.time.Period period7 = period4.toPeriod();
        org.joda.time.Period period9 = period7.plusHours((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = period9.getValue((-35));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusDays((int) (byte) 10);
        org.joda.time.Period period6 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period7 = period6.negated();
        org.joda.time.PeriodType periodType8 = period7.getPeriodType();
        org.joda.time.Period period9 = new org.joda.time.Period((java.lang.Object) period4, periodType8);
        org.joda.time.Period period11 = period4.plusWeeks((int) (short) 1);
        org.joda.time.Period period13 = period11.plusWeeks(97);
        org.joda.time.Period period15 = period11.withMonths((-1));
        org.joda.time.Period period17 = period15.withWeeks(100);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) (byte) 1);
        int int2 = period1.getYears();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.minusYears((int) (byte) -1);
        org.joda.time.Duration duration4 = period1.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        int int7 = period6.getHours();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        java.lang.String str2 = period1.toString();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT0S" + "'", str2, "PT0S");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 1000, (long) 97, chronology2);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', (long) (-10), chronology2);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationTo(readableInstant12);
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration13);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration13, periodType15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration13, readableInstant17);
        org.junit.Assert.assertNotNull(duration13);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.withMillis((int) (short) 1);
        org.joda.time.Period period8 = period4.minusMinutes((int) (short) 0);
        org.joda.time.Period period10 = new org.joda.time.Period((long) 8);
        org.joda.time.PeriodType periodType11 = period10.getPeriodType();
        org.joda.time.Period period12 = period4.withFields((org.joda.time.ReadablePeriod) period10);
        int[] intArray13 = period4.getValues();
        java.lang.String str14 = period4.toString();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0, 0, 0, 0, (-1), 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT-1H" + "'", str14, "PT-1H");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(1);
        org.joda.time.DurationFieldType[] durationFieldTypeArray2 = period1.getFieldTypes();
        org.joda.time.Period period4 = period1.plusMinutes((int) (byte) -1);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(durationFieldTypeArray2);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (short) 0);
        org.joda.time.Period period3 = period1.minusHours((int) (byte) -1);
        int int4 = period3.getDays();
        org.joda.time.Period period5 = period3.negated();
        org.joda.time.Period period7 = period3.withSeconds(68);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.Period period8 = period4.plusHours((-1));
        int int9 = period8.getSeconds();
        org.joda.time.Period period10 = period3.withFields((org.joda.time.ReadablePeriod) period8);
        int int11 = period8.getMillis();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        org.joda.time.DurationFieldType[] durationFieldTypeArray8 = period1.getFieldTypes();
        org.joda.time.Period period10 = period1.plusYears(0);
        org.joda.time.Period period12 = period1.minusHours((int) (short) 1);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(durationFieldTypeArray8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
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
        int int13 = period10.getMinutes();
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusDays((int) (byte) 10);
        org.joda.time.Period period6 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period7 = period6.negated();
        org.joda.time.PeriodType periodType8 = period7.getPeriodType();
        org.joda.time.Period period9 = new org.joda.time.Period((java.lang.Object) period4, periodType8);
        org.joda.time.Period period11 = period4.plusWeeks((int) (short) 1);
        org.joda.time.Duration duration12 = period4.toStandardDuration();
        java.lang.String str13 = period4.toString();
        int int14 = period4.getHours();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P10D" + "'", str13, "P10D");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks1 = period0.toStandardWeeks();
        org.joda.time.Period period3 = period0.minusSeconds((int) (byte) 1);
        org.joda.time.Period period5 = period0.withYears((int) (byte) 10);
        int int6 = period0.size();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (short) -1, (-35), 0, (-1));
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withDays((int) '4');
        org.joda.time.Seconds seconds8 = period7.toStandardSeconds();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableDuration9, readableInstant10, periodType11);
        org.joda.time.PeriodType periodType13 = period12.getPeriodType();
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 10, periodType15);
        org.joda.time.Period period18 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period20 = period18.withMillis((int) (byte) 100);
        org.joda.time.Period period21 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = period21.toDurationTo(readableInstant22);
        org.joda.time.Period period25 = period21.plusHours((-1));
        int int26 = period25.getSeconds();
        org.joda.time.Period period27 = period20.withFields((org.joda.time.ReadablePeriod) period25);
        int int28 = period25.getHours();
        org.joda.time.Period period29 = period16.minus((org.joda.time.ReadablePeriod) period25);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant30, readableDuration31);
        org.joda.time.Period period34 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period36 = period34.minusYears((int) (byte) -1);
        org.joda.time.Period period37 = period32.withFields((org.joda.time.ReadablePeriod) period34);
        org.joda.time.Period period39 = period34.withMinutes((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Duration duration41 = period39.toDurationTo(readableInstant40);
        org.joda.time.Period period42 = period16.withFields((org.joda.time.ReadablePeriod) period39);
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType45, chronology46);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Duration duration49 = period47.toDurationFrom(readableInstant48);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant50, readableDuration51);
        org.joda.time.Period period54 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period56 = period54.minusYears((int) (byte) -1);
        org.joda.time.Period period57 = period52.withFields((org.joda.time.ReadablePeriod) period54);
        org.joda.time.Period period59 = period54.withMinutes((int) (short) -1);
        org.joda.time.Period period60 = period47.plus((org.joda.time.ReadablePeriod) period59);
        org.joda.time.Period period62 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period64 = period62.withMillis((int) (byte) 100);
        org.joda.time.Period period65 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.Duration duration67 = period65.toDurationTo(readableInstant66);
        org.joda.time.Period period69 = period65.plusHours((-1));
        int int70 = period69.getSeconds();
        org.joda.time.Period period71 = period64.withFields((org.joda.time.ReadablePeriod) period69);
        org.joda.time.PeriodType periodType80 = null;
        org.joda.time.Period period81 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType80);
        org.joda.time.Period period83 = period81.withMillis((int) (short) 10);
        org.joda.time.Period period85 = period81.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType87 = period81.getFieldType((int) (short) 1);
        org.joda.time.Period period89 = period64.withField(durationFieldType87, 100);
        boolean boolean90 = period47.isSupported(durationFieldType87);
        org.joda.time.Period period92 = period42.withField(durationFieldType87, 35);
        org.joda.time.Period period94 = period12.withFieldAdded(durationFieldType87, 8);
        int int95 = period7.get(durationFieldType87);
        int int96 = period7.getMonths();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertNotNull(durationFieldType87);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(period92);
        org.junit.Assert.assertNotNull(period94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 'a', chronology1);
        int int3 = period2.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period11, periodType12);
        org.joda.time.Period period15 = period11.withMonths(0);
        org.joda.time.Period period17 = period15.plusMonths(100);
        org.joda.time.Period period19 = period17.plusYears(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType21 = period19.getFieldType((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
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
        org.joda.time.Period period30 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period32 = period30.minusYears((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType33 = null;
        int int34 = period30.get(durationFieldType33);
        org.joda.time.MutablePeriod mutablePeriod35 = period30.toMutablePeriod();
        org.joda.time.Period period36 = period28.plus((org.joda.time.ReadablePeriod) mutablePeriod35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = period36.toDurationFrom(readableInstant37);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes39 = period36.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains months and months vary in length");
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
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(duration38);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.Period period8 = period4.plusHours((-1));
        int int9 = period8.getSeconds();
        org.joda.time.Period period10 = period3.withFields((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period12 = period10.plusMillis((int) '#');
        org.joda.time.Period period14 = period12.plusMinutes((int) (short) -1);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType17, chronology18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period19.toDurationFrom(readableInstant20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant22, readableDuration23);
        org.joda.time.Period period26 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period28 = period26.minusYears((int) (byte) -1);
        org.joda.time.Period period29 = period24.withFields((org.joda.time.ReadablePeriod) period26);
        org.joda.time.Period period31 = period26.withMinutes((int) (short) -1);
        org.joda.time.Period period32 = period19.plus((org.joda.time.ReadablePeriod) period31);
        org.joda.time.Period period33 = period14.plus((org.joda.time.ReadablePeriod) period32);
        org.joda.time.Period period35 = period32.plusYears(8);
        int int36 = period32.getMonths();
        org.joda.time.Period period38 = period32.plusMinutes((int) (byte) 10);
        org.joda.time.Period period40 = period32.withMinutes((int) (byte) -1);
        org.joda.time.Period period41 = period32.toPeriod();
        int int42 = period32.getMillis();
        org.joda.time.Period period44 = period32.plusDays((int) '#');
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 68 + "'", int42 == 68);
        org.junit.Assert.assertNotNull(period44);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.minusMillis((int) (short) 0);
        org.joda.time.Minutes minutes4 = period1.toStandardMinutes();
        org.joda.time.Period period6 = period1.minusYears((int) (byte) -1);
        org.joda.time.Period period9 = new org.joda.time.Period((long) 10, 10L);
        org.joda.time.Period period10 = period6.plus((org.joda.time.ReadablePeriod) period9);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationTo(readableInstant3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration4);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration4, periodType6);
        org.joda.time.Period period9 = period7.plusWeeks(0);
        org.joda.time.Period period11 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period12 = period11.negated();
        org.joda.time.Period period13 = period7.withFields((org.joda.time.ReadablePeriod) period12);
        int int14 = period13.getWeeks();
        org.joda.time.Hours hours15 = period13.toStandardHours();
        org.joda.time.Period period16 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationTo(readableInstant17);
        org.joda.time.Period period20 = period16.plusHours((-1));
        int int21 = period20.getSeconds();
        org.joda.time.Period period23 = period20.withSeconds(10);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant24, readableDuration25);
        org.joda.time.Period period28 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period30 = period28.minusYears((int) (byte) -1);
        org.joda.time.Period period31 = period26.withFields((org.joda.time.ReadablePeriod) period28);
        int[] intArray32 = period26.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter33 = null;
        java.lang.String str34 = period26.toString(periodFormatter33);
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType43);
        org.joda.time.Period period46 = period44.withMillis((int) (short) 10);
        org.joda.time.Period period48 = period44.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType50 = period44.getFieldType((int) (short) 1);
        org.joda.time.Period period52 = period26.withField(durationFieldType50, (int) (short) 10);
        org.joda.time.Period period54 = period23.withFieldAdded(durationFieldType50, (int) (byte) 10);
        org.joda.time.Period period55 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.Duration duration57 = period55.toDurationTo(readableInstant56);
        org.joda.time.Period period59 = period55.plusHours((-1));
        org.joda.time.Period period61 = period59.plusYears((int) (short) -1);
        org.joda.time.Period period63 = period59.plusMillis((int) ' ');
        org.joda.time.MutablePeriod mutablePeriod64 = period63.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.ReadableDuration readableDuration66 = null;
        org.joda.time.Period period67 = new org.joda.time.Period(readableInstant65, readableDuration66);
        org.joda.time.Period period69 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period71 = period69.minusYears((int) (byte) -1);
        org.joda.time.Period period72 = period67.withFields((org.joda.time.ReadablePeriod) period69);
        int[] intArray73 = period67.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter74 = null;
        java.lang.String str75 = period67.toString(periodFormatter74);
        org.joda.time.PeriodType periodType84 = null;
        org.joda.time.Period period85 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType84);
        org.joda.time.Period period87 = period85.withMillis((int) (short) 10);
        org.joda.time.Period period89 = period85.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType91 = period85.getFieldType((int) (short) 1);
        org.joda.time.Period period93 = period67.withField(durationFieldType91, (int) (short) 10);
        int int94 = period63.get(durationFieldType91);
        boolean boolean95 = period23.isSupported(durationFieldType91);
        org.joda.time.Period period97 = period13.withFieldAdded(durationFieldType91, (int) (short) 1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PT0S" + "'", str34, "PT0S");
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(durationFieldType50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(mutablePeriod64);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "PT0S" + "'", str75, "PT0S");
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertNotNull(durationFieldType91);
        org.junit.Assert.assertNotNull(period93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(period97);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((-10));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.joda.time.Period period1 = org.joda.time.Period.days(40);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.Period period5 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationTo(readableInstant6);
        boolean boolean8 = period4.equals((java.lang.Object) duration7);
        org.joda.time.Period period9 = period1.plus((org.joda.time.ReadablePeriod) period4);
        int int10 = period1.getMinutes();
        org.joda.time.Period period12 = period1.withSeconds(8);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) 'a');
        org.joda.time.Chronology chronology2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period3 = new org.joda.time.Period((java.lang.Object) 'a', chronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
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
        org.joda.time.Period period19 = period17.withMinutes((int) (byte) 1);
        int int20 = period17.getMinutes();
        org.joda.time.Period period22 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period24 = period22.withMillis((int) (byte) 100);
        org.joda.time.Period period25 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period25.toDurationTo(readableInstant26);
        org.joda.time.Period period29 = period25.plusHours((-1));
        int int30 = period29.getSeconds();
        org.joda.time.Period period31 = period24.withFields((org.joda.time.ReadablePeriod) period29);
        int int32 = period29.getHours();
        org.joda.time.Weeks weeks33 = period29.toStandardWeeks();
        org.joda.time.Period period34 = period17.withFields((org.joda.time.ReadablePeriod) period29);
        int int35 = period29.getMillis();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(weeks33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        org.joda.time.Period period9 = period7.withYears((int) ' ');
        org.joda.time.Period period11 = period9.withMonths((-1));
        org.joda.time.Period period13 = period11.minusMonths((int) '#');
        int int14 = period13.getDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks1 = period0.toStandardWeeks();
        org.joda.time.Period period2 = new org.joda.time.Period((java.lang.Object) weeks1);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(weeks1);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        java.lang.Object obj1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableDuration7, readableInstant8, periodType9);
        org.joda.time.PeriodType periodType11 = period10.getPeriodType();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) (byte) 10, periodType11, chronology12);
        org.joda.time.Period period14 = new org.joda.time.Period((long) (byte) 10, periodType11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(100L, periodType11, chronology15);
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType11);
        org.joda.time.Period period18 = new org.joda.time.Period(obj1, periodType11);
        org.joda.time.Period period19 = new org.joda.time.Period(0L, periodType11);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(35);
        org.joda.time.Period period4 = new org.joda.time.Period((long) (short) 10, (long) (short) 0);
        org.joda.time.Period period5 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationTo(readableInstant6);
        org.joda.time.Period period9 = period5.plusHours((-1));
        int int10 = period9.getSeconds();
        org.joda.time.Period period12 = period9.withSeconds(10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant13, readableDuration14);
        org.joda.time.Period period17 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period19 = period17.minusYears((int) (byte) -1);
        org.joda.time.Period period20 = period15.withFields((org.joda.time.ReadablePeriod) period17);
        int[] intArray21 = period15.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter22 = null;
        java.lang.String str23 = period15.toString(periodFormatter22);
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType32);
        org.joda.time.Period period35 = period33.withMillis((int) (short) 10);
        org.joda.time.Period period37 = period33.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType39 = period33.getFieldType((int) (short) 1);
        org.joda.time.Period period41 = period15.withField(durationFieldType39, (int) (short) 10);
        org.joda.time.Period period43 = period12.withFieldAdded(durationFieldType39, (int) (byte) 10);
        int int44 = period4.indexOf(durationFieldType39);
        boolean boolean45 = period1.isSupported(durationFieldType39);
        int int46 = period1.getWeeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType48 = period1.getFieldType((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PT0S" + "'", str23, "PT0S");
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(durationFieldType39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (byte) 0, (int) (short) 1, (int) (short) -1, (int) (byte) 100);
        org.joda.time.MutablePeriod mutablePeriod5 = period4.toMutablePeriod();
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType14);
        org.joda.time.Period period17 = period15.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((java.lang.Object) period17, periodType18);
        org.joda.time.Period period21 = period17.withMonths(0);
        org.joda.time.format.PeriodFormatter periodFormatter22 = null;
        java.lang.String str23 = period17.toString(periodFormatter22);
        org.joda.time.Period period24 = period4.withFields((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Period period26 = period4.withHours(52);
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "P10Y32M-1WT35H100M10.010S" + "'", str23, "P10Y32M-1WT35H100M10.010S");
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.joda.time.Period period4 = new org.joda.time.Period(1, (int) (byte) 1, (-35), (-35));
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (byte) 100);
        org.joda.time.Period period3 = period1.plusHours((int) (short) 100);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.withMillis((int) (short) 1);
        org.joda.time.Period period8 = period4.withMinutes((int) (byte) 100);
        org.joda.time.Period period17 = new org.joda.time.Period((-1), (int) (byte) 10, 8, 1, (int) (byte) 10, 10, (int) (byte) 1, 1);
        org.joda.time.Period period19 = period17.multipliedBy((int) (short) -1);
        org.joda.time.Period period21 = period17.plusMonths((int) (byte) 0);
        org.joda.time.Period period23 = period21.plusSeconds((int) (short) 1);
        boolean boolean24 = period4.equals((java.lang.Object) period21);
        org.joda.time.Period period26 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period28 = period26.withMillis((int) (byte) 100);
        org.joda.time.Period period30 = period28.plusSeconds((int) ' ');
        org.joda.time.Period period32 = period28.minusWeeks(10);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant33, readableDuration34);
        org.joda.time.Period period37 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period39 = period37.minusYears((int) (byte) -1);
        org.joda.time.Period period40 = period35.withFields((org.joda.time.ReadablePeriod) period37);
        int[] intArray41 = period35.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter42 = null;
        java.lang.String str43 = period35.toString(periodFormatter42);
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType52);
        org.joda.time.Period period55 = period53.withMillis((int) (short) 10);
        org.joda.time.Period period57 = period53.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType59 = period53.getFieldType((int) (short) 1);
        org.joda.time.Period period61 = period35.withField(durationFieldType59, (int) (short) 10);
        int int62 = period32.indexOf(durationFieldType59);
        int int63 = period4.get(durationFieldType59);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType65 = period4.getFieldType(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "PT0S" + "'", str43, "PT0S");
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(durationFieldType59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (byte) 1);
        org.joda.time.Period period3 = period1.plusYears(40);
        org.joda.time.Period period5 = period3.withDays(0);
        org.joda.time.DurationFieldType[] durationFieldTypeArray6 = period3.getFieldTypes();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(durationFieldTypeArray6);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableDuration0, readableInstant1, periodType2);
        org.joda.time.PeriodType periodType4 = period3.getPeriodType();
        org.joda.time.Period period6 = period3.plusMonths(8);
        org.joda.time.Period period8 = period6.plusHours(0);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("PT0.100S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
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
        org.joda.time.Period period23 = period2.minusHours((int) (short) 10);
        org.joda.time.Period period25 = period23.withMillis(1);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (byte) 0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 52, (-1L));
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period2 = period1.negated();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableDuration4, readableInstant5, periodType6);
        org.joda.time.PeriodType periodType8 = period7.getPeriodType();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) (byte) 10, periodType8, chronology9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((java.lang.Object) period2, periodType8, chronology11);
        org.joda.time.Period period14 = period12.minusMonths((int) 'a');
        org.joda.time.Period period16 = org.joda.time.Period.years((-1));
        org.joda.time.Period period18 = period16.withHours(0);
        org.joda.time.Period period20 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period22 = period20.withMillis((int) (byte) 100);
        org.joda.time.Period period23 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period23.toDurationTo(readableInstant24);
        org.joda.time.Period period27 = period23.plusHours((-1));
        int int28 = period27.getSeconds();
        org.joda.time.Period period29 = period22.withFields((org.joda.time.ReadablePeriod) period27);
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType38);
        org.joda.time.Period period41 = period39.withMillis((int) (short) 10);
        org.joda.time.Period period43 = period39.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType45 = period39.getFieldType((int) (short) 1);
        org.joda.time.Period period47 = period22.withField(durationFieldType45, 100);
        boolean boolean48 = period16.isSupported(durationFieldType45);
        org.joda.time.Period period50 = period14.withFieldAdded(durationFieldType45, (int) '#');
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period((int) ' ', 0, (int) (short) 100, 100, (int) (byte) 10, 100, (-1), (int) (short) 100, periodType59);
        org.joda.time.Period period62 = period60.minusYears((int) '#');
        int[] intArray63 = period62.getValues();
        org.joda.time.Period period65 = org.joda.time.Period.hours(4);
        org.joda.time.Period period66 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks67 = period66.toStandardWeeks();
        org.joda.time.Period period68 = period66.negated();
        org.joda.time.Period period70 = org.joda.time.Period.seconds(0);
        org.joda.time.PeriodType periodType79 = null;
        org.joda.time.Period period80 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType79);
        org.joda.time.Period period82 = period80.withMillis((int) (short) 10);
        org.joda.time.Period period84 = period80.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType86 = period80.getFieldType((int) (short) 1);
        int int87 = period70.indexOf(durationFieldType86);
        org.joda.time.Period period89 = period68.withFieldAdded(durationFieldType86, (int) 'a');
        org.joda.time.Period period91 = period65.withFieldAdded(durationFieldType86, (int) (byte) 10);
        int int92 = period62.indexOf(durationFieldType86);
        org.joda.time.Period period94 = period50.withField(durationFieldType86, (int) (short) 100);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(durationFieldType45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { (-3), 0, 100, 100, 10, 100, (-1), 100 });
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(weeks67);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(durationFieldType86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertNotNull(period91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertNotNull(period94);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 1, chronology1);
        int int3 = period2.getMonths();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant5, readableInstant6);
        org.joda.time.Period period8 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period8.toDurationTo(readableInstant9);
        boolean boolean11 = period7.equals((java.lang.Object) duration10);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((int) ' ', 0, (int) (short) 100, 100, (int) (byte) 10, 100, (-1), (int) (short) 100, periodType20);
        org.joda.time.Period period23 = period21.minusYears((int) '#');
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period28 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period30 = period28.minusYears((int) (byte) -1);
        org.joda.time.Duration duration31 = period28.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period(readableDuration35, readableInstant36, periodType37);
        org.joda.time.PeriodType periodType39 = period38.getPeriodType();
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant33, readableInstant34, periodType39);
        org.joda.time.Period period41 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration31, readableInstant32, periodType39);
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant25, readableInstant26, periodType39);
        org.joda.time.Period period43 = new org.joda.time.Period((long) (short) 1, periodType39);
        org.joda.time.Period period44 = period23.normalizedStandard(periodType39);
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant4, (org.joda.time.ReadableDuration) duration10, periodType39);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((java.lang.Object) period2, periodType39, chronology46);
        org.joda.time.Period period49 = period47.minusMonths(68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period49);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) (short) -1);
        org.joda.time.Period period3 = period1.minusYears((-1));
        org.joda.time.Period period5 = period1.withDays((int) ' ');
        org.joda.time.Period period7 = period5.multipliedBy((int) (byte) 1);
        org.joda.time.Minutes minutes8 = period5.toStandardMinutes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(minutes8);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        org.joda.time.Period period6 = period4.withWeeks(0);
        org.joda.time.Period period7 = period4.toPeriod();
        org.joda.time.Period period9 = period7.withDays(8);
        org.joda.time.Period period11 = period9.withMillis(11);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
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
        int int18 = period16.getDays();
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableDuration26, readableInstant27, periodType28);
        org.joda.time.PeriodType periodType30 = period29.getPeriodType();
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant24, readableInstant25, periodType30);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) (byte) -1, (long) (byte) 1, periodType30, chronology32);
        org.joda.time.Period period34 = new org.joda.time.Period((long) 10, periodType30);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((long) (-1), (long) '#', periodType30, chronology35);
        boolean boolean37 = period16.equals((java.lang.Object) '#');
        org.joda.time.Period period39 = period16.minusMonths((int) 'a');
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(readableDuration45, readableInstant46, periodType47);
        org.joda.time.PeriodType periodType49 = period48.getPeriodType();
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant43, readableInstant44, periodType49);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period((long) (byte) -1, (long) (byte) 1, periodType49, chronology51);
        org.joda.time.Period period53 = new org.joda.time.Period((long) 10, periodType49);
        org.joda.time.Period period54 = period39.normalizedStandard(periodType49);
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period((long) 10, periodType56);
        org.joda.time.Period period59 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period61 = period59.withMillis((int) (byte) 100);
        org.joda.time.Period period62 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.Duration duration64 = period62.toDurationTo(readableInstant63);
        org.joda.time.Period period66 = period62.plusHours((-1));
        int int67 = period66.getSeconds();
        org.joda.time.Period period68 = period61.withFields((org.joda.time.ReadablePeriod) period66);
        int int69 = period66.getHours();
        org.joda.time.Period period70 = period57.minus((org.joda.time.ReadablePeriod) period66);
        org.joda.time.PeriodType periodType71 = period66.getPeriodType();
        org.joda.time.Period period72 = period54.withPeriodType(periodType71);
        org.joda.time.Period period74 = period72.plusSeconds(97);
        org.joda.time.Period period76 = period74.withMinutes(11);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(duration64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(periodType71);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(period76);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.withYears((int) 'a');
        org.joda.time.Period period7 = period6.normalizedStandard();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) (short) 1, chronology9);
        org.joda.time.Period period14 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period16 = period14.minusYears((int) (byte) -1);
        org.joda.time.Duration duration17 = period14.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableDuration21, readableInstant22, periodType23);
        org.joda.time.PeriodType periodType25 = period24.getPeriodType();
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant19, readableInstant20, periodType25);
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration17, readableInstant18, periodType25);
        org.joda.time.Period period28 = new org.joda.time.Period(1L, (long) (short) 10, periodType25);
        org.joda.time.Period period29 = period10.withPeriodType(periodType25);
        org.joda.time.Period period31 = period29.minusSeconds(100);
        org.joda.time.Period period33 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period35 = period33.withMillis((int) (byte) 100);
        org.joda.time.Period period36 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = period36.toDurationTo(readableInstant37);
        org.joda.time.Period period40 = period36.plusHours((-1));
        int int41 = period40.getSeconds();
        org.joda.time.Period period42 = period35.withFields((org.joda.time.ReadablePeriod) period40);
        org.joda.time.Period period44 = period42.plusMillis((int) '#');
        org.joda.time.Period period46 = period44.plusMinutes((int) (short) -1);
        org.joda.time.Period period48 = period44.plusYears((int) '#');
        org.joda.time.Period period49 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = period49.toDurationTo(readableInstant50);
        org.joda.time.Period period53 = period49.plusHours((-1));
        int int54 = period53.getSeconds();
        org.joda.time.Period period56 = period53.withSeconds(10);
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period(readableInstant57, readableDuration58);
        org.joda.time.Period period61 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period63 = period61.minusYears((int) (byte) -1);
        org.joda.time.Period period64 = period59.withFields((org.joda.time.ReadablePeriod) period61);
        int[] intArray65 = period59.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter66 = null;
        java.lang.String str67 = period59.toString(periodFormatter66);
        org.joda.time.PeriodType periodType76 = null;
        org.joda.time.Period period77 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType76);
        org.joda.time.Period period79 = period77.withMillis((int) (short) 10);
        org.joda.time.Period period81 = period77.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType83 = period77.getFieldType((int) (short) 1);
        org.joda.time.Period period85 = period59.withField(durationFieldType83, (int) (short) 10);
        org.joda.time.Period period87 = period56.withFieldAdded(durationFieldType83, (int) (byte) 10);
        int int88 = period48.indexOf(durationFieldType83);
        boolean boolean89 = period29.isSupported(durationFieldType83);
        int int90 = period7.indexOf(durationFieldType83);
        org.joda.time.MutablePeriod mutablePeriod91 = period7.toMutablePeriod();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "PT0S" + "'", str67, "PT0S");
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(durationFieldType83);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertNotNull(mutablePeriod91);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period11, periodType12);
        org.joda.time.Period period15 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period17 = period15.withMillis((int) (byte) 100);
        org.joda.time.Period period19 = period15.withMonths((int) ' ');
        org.joda.time.Period period21 = period15.withHours(100);
        org.joda.time.Period period22 = period11.withFields((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Period period24 = period22.withWeeks((int) (short) 10);
        org.joda.time.Period period26 = period24.withDays(0);
        org.joda.time.Seconds seconds27 = period26.toStandardSeconds();
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType36);
        org.joda.time.Period period39 = period37.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((java.lang.Object) period39, periodType40);
        org.joda.time.Period period43 = period39.withMonths(0);
        org.joda.time.Period period45 = period43.minusWeeks((int) (short) -1);
        org.joda.time.Period period47 = period45.withHours((int) ' ');
        org.joda.time.Period period48 = period26.plus((org.joda.time.ReadablePeriod) period45);
        int int49 = period45.getMonths();
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.joda.time.Period period1 = org.joda.time.Period.hours(1);
        org.joda.time.Period period2 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationTo(readableInstant3);
        org.joda.time.Period period6 = org.joda.time.Period.minutes((int) (byte) 0);
        boolean boolean7 = period2.equals((java.lang.Object) period6);
        org.joda.time.Period period8 = period6.negated();
        org.joda.time.DurationFieldType durationFieldType10 = period8.getFieldType((int) (short) 1);
        org.joda.time.Period period12 = period1.withFieldAdded(durationFieldType10, (int) (short) 1);
        org.joda.time.Period period14 = period12.plusYears(40);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 0, chronology1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period6 = period4.withMillis((int) (byte) 100);
        org.joda.time.Period period8 = period6.plusSeconds((int) ' ');
        org.joda.time.Period period10 = period6.minusWeeks(10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableDuration12);
        org.joda.time.Period period15 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period17 = period15.minusYears((int) (byte) -1);
        org.joda.time.Period period18 = period13.withFields((org.joda.time.ReadablePeriod) period15);
        int[] intArray19 = period13.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter20 = null;
        java.lang.String str21 = period13.toString(periodFormatter20);
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType30);
        org.joda.time.Period period33 = period31.withMillis((int) (short) 10);
        org.joda.time.Period period35 = period31.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType37 = period31.getFieldType((int) (short) 1);
        org.joda.time.Period period39 = period13.withField(durationFieldType37, (int) (short) 10);
        int int40 = period10.indexOf(durationFieldType37);
        org.joda.time.DurationFieldType durationFieldType42 = period10.getFieldType((int) (short) 1);
        int int43 = period2.get(durationFieldType42);
        int int44 = period2.getMillis();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PT0S" + "'", str21, "PT0S");
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(durationFieldType42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (byte) 1);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period2 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period4 = period2.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationTo(readableInstant6);
        org.joda.time.Period period9 = period5.plusHours((-1));
        int int10 = period9.getSeconds();
        org.joda.time.Period period11 = period4.withFields((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period13 = period11.withMonths(1);
        org.joda.time.Period period15 = period13.multipliedBy((-1));
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period13.toDurationFrom(readableInstant16);
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Period period24 = org.joda.time.Period.ZERO;
        org.joda.time.Period period26 = period24.plusHours(100);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = period26.toDurationFrom(readableInstant27);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant23, (org.joda.time.ReadableDuration) duration28, periodType29);
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant22, (org.joda.time.ReadableDuration) duration28, periodType31);
        org.joda.time.Period period34 = period32.minusMonths(10);
        org.joda.time.Period period36 = period34.withSeconds((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = period34.toDurationFrom(readableInstant37);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Period period41 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period43 = period41.withMillis((int) (byte) 100);
        org.joda.time.Period period45 = period41.withMonths((int) ' ');
        org.joda.time.Period period47 = period41.withHours(100);
        int int48 = period47.getMinutes();
        org.joda.time.Period period50 = period47.withWeeks((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Duration duration52 = period50.toDurationFrom(readableInstant51);
        org.joda.time.ReadableDuration readableDuration69 = null;
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.PeriodType periodType71 = null;
        org.joda.time.Period period72 = new org.joda.time.Period(readableDuration69, readableInstant70, periodType71);
        org.joda.time.PeriodType periodType73 = period72.getPeriodType();
        org.joda.time.Period period74 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType73);
        org.joda.time.Period period75 = new org.joda.time.Period((-1), 0, (int) (short) 1, (int) '4', 10, (int) (byte) 0, 100, (int) (byte) 1, periodType73);
        org.joda.time.Period period76 = new org.joda.time.Period(readableInstant39, (org.joda.time.ReadableDuration) duration52, periodType73);
        org.joda.time.Period period77 = new org.joda.time.Period(readableInstant21, (org.joda.time.ReadableDuration) duration38, periodType73);
        org.joda.time.Period period78 = new org.joda.time.Period((long) 10, periodType73);
        org.joda.time.Period period79 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration17, readableInstant19, periodType73);
        org.joda.time.Period period81 = period79.minusSeconds(40);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(periodType73);
        org.junit.Assert.assertNotNull(period81);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.Period period8 = period4.plusHours((-1));
        int int9 = period8.getSeconds();
        org.joda.time.Period period10 = period3.withFields((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period12 = period8.withMinutes((int) (short) 0);
        org.joda.time.DurationFieldType[] durationFieldTypeArray13 = period12.getFieldTypes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldTypeArray13);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks1 = period0.toStandardWeeks();
        org.joda.time.Period period2 = period0.negated();
        org.joda.time.Period period4 = period2.withYears(8);
        org.joda.time.Period period6 = period2.minusMillis((int) (byte) 1);
        org.joda.time.Period period8 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period10 = period8.withMillis((int) (byte) 100);
        org.joda.time.Period period11 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationTo(readableInstant12);
        org.joda.time.Period period15 = period11.plusHours((-1));
        int int16 = period15.getSeconds();
        org.joda.time.Period period17 = period10.withFields((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Period period19 = period15.withMinutes((int) (short) 0);
        org.joda.time.Period period21 = period15.withMinutes(10);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant22, readableDuration23);
        org.joda.time.Period period26 = period24.plusDays((int) 'a');
        org.joda.time.Period period27 = period15.plus((org.joda.time.ReadablePeriod) period26);
        org.joda.time.Period period29 = period27.withMinutes((int) (short) -1);
        org.joda.time.Period period31 = period27.minusMinutes((-1));
        org.joda.time.Period period33 = org.joda.time.Period.years((int) (short) 10);
        org.joda.time.Period period35 = period33.withDays((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Period period37 = org.joda.time.Period.ZERO;
        org.joda.time.Period period39 = period37.plusHours(100);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Duration duration41 = period39.toDurationFrom(readableInstant40);
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant36, (org.joda.time.ReadableDuration) duration41, periodType42);
        org.joda.time.DurationFieldType durationFieldType45 = period43.getFieldType(0);
        boolean boolean46 = period35.isSupported(durationFieldType45);
        int int47 = period27.get(durationFieldType45);
        int int48 = period6.get(durationFieldType45);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(durationFieldType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        org.joda.time.Hours hours5 = period4.toStandardHours();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period4.toDurationTo(readableInstant6);
        org.joda.time.Period period8 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period8.toDurationTo(readableInstant9);
        org.joda.time.Period period12 = period8.plusHours((-1));
        org.joda.time.Period period14 = period12.plusYears((int) (short) -1);
        org.joda.time.Period period16 = period12.plusMillis((int) ' ');
        org.joda.time.MutablePeriod mutablePeriod17 = period16.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant18, readableDuration19);
        org.joda.time.Period period22 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period24 = period22.minusYears((int) (byte) -1);
        org.joda.time.Period period25 = period20.withFields((org.joda.time.ReadablePeriod) period22);
        int[] intArray26 = period20.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter27 = null;
        java.lang.String str28 = period20.toString(periodFormatter27);
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType37);
        org.joda.time.Period period40 = period38.withMillis((int) (short) 10);
        org.joda.time.Period period42 = period38.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType44 = period38.getFieldType((int) (short) 1);
        org.joda.time.Period period46 = period20.withField(durationFieldType44, (int) (short) 10);
        int int47 = period16.get(durationFieldType44);
        boolean boolean48 = period4.isSupported(durationFieldType44);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = period4.getValue((-35));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PT0S" + "'", str28, "PT0S");
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
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
        org.joda.time.Period period12 = period10.withDays(1);
        org.joda.time.Period period14 = period10.withMillis((int) (byte) -1);
        org.joda.time.Period period16 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period18 = period16.withMillis((int) (byte) 100);
        org.joda.time.Period period19 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period19.toDurationTo(readableInstant20);
        org.joda.time.Period period23 = period19.plusHours((-1));
        int int24 = period23.getSeconds();
        org.joda.time.Period period25 = period18.withFields((org.joda.time.ReadablePeriod) period23);
        org.joda.time.Period period27 = period25.withMonths(1);
        org.joda.time.Period period29 = period27.multipliedBy((-1));
        org.joda.time.Period period31 = period27.withDays(8);
        org.joda.time.Period period33 = period31.withYears((int) (short) 100);
        boolean boolean34 = period10.equals((java.lang.Object) (short) 100);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period11, periodType12);
        org.joda.time.Period period15 = period13.withHours((int) 'a');
        org.joda.time.Period period17 = period13.withMonths(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes18 = period17.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) -1, chronology1);
        int int3 = period2.getMonths();
        org.joda.time.Duration duration4 = period2.toStandardDuration();
        org.joda.time.Period period6 = period2.withSeconds((int) '#');
        org.joda.time.Minutes minutes7 = period2.toStandardMinutes();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(minutes7);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 10, periodType1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period6 = period4.withMillis((int) (byte) 100);
        org.joda.time.Period period7 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period7.toDurationTo(readableInstant8);
        org.joda.time.Period period11 = period7.plusHours((-1));
        int int12 = period11.getSeconds();
        org.joda.time.Period period13 = period6.withFields((org.joda.time.ReadablePeriod) period11);
        int int14 = period11.getHours();
        org.joda.time.Period period15 = period2.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.PeriodType periodType16 = period11.getPeriodType();
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType19, chronology20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = period21.toDurationFrom(readableInstant22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant24, readableDuration25);
        org.joda.time.Period period28 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period30 = period28.minusYears((int) (byte) -1);
        org.joda.time.Period period31 = period26.withFields((org.joda.time.ReadablePeriod) period28);
        org.joda.time.Period period33 = period28.withMinutes((int) (short) -1);
        org.joda.time.Period period34 = period21.plus((org.joda.time.ReadablePeriod) period33);
        org.joda.time.Period period36 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period38 = period36.withMillis((int) (byte) 100);
        org.joda.time.Period period39 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Duration duration41 = period39.toDurationTo(readableInstant40);
        org.joda.time.Period period43 = period39.plusHours((-1));
        int int44 = period43.getSeconds();
        org.joda.time.Period period45 = period38.withFields((org.joda.time.ReadablePeriod) period43);
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType54);
        org.joda.time.Period period57 = period55.withMillis((int) (short) 10);
        org.joda.time.Period period59 = period55.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType61 = period55.getFieldType((int) (short) 1);
        org.joda.time.Period period63 = period38.withField(durationFieldType61, 100);
        boolean boolean64 = period21.isSupported(durationFieldType61);
        org.joda.time.Period period66 = period11.withField(durationFieldType61, (int) '#');
        org.joda.time.PeriodType periodType67 = period66.getPeriodType();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(durationFieldType61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(periodType67);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period11, periodType12);
        org.joda.time.Period period15 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period17 = period15.withMillis((int) (byte) 100);
        org.joda.time.Period period19 = period15.withMonths((int) ' ');
        org.joda.time.Period period21 = period15.withHours(100);
        org.joda.time.Period period22 = period11.withFields((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Period period24 = period22.plusMonths(100);
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType35, chronology36);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Duration duration39 = period37.toDurationFrom(readableInstant38);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant40, readableDuration41);
        org.joda.time.Period period44 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period46 = period44.minusYears((int) (byte) -1);
        org.joda.time.Period period47 = period42.withFields((org.joda.time.ReadablePeriod) period44);
        org.joda.time.Period period49 = period44.withMinutes((int) (short) -1);
        org.joda.time.Period period50 = period37.plus((org.joda.time.ReadablePeriod) period49);
        org.joda.time.PeriodType periodType51 = period50.getPeriodType();
        org.joda.time.Period period52 = new org.joda.time.Period((int) '4', (int) 'a', (int) (short) -1, 100, 100, 10, (int) '4', 10, periodType51);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((java.lang.Object) period24, periodType51, chronology53);
        java.lang.Object obj55 = null;
        boolean boolean56 = period54.equals(obj55);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.withYears((int) 'a');
        org.joda.time.Period period7 = period6.normalizedStandard();
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
        org.joda.time.Period period29 = period11.minusYears((int) (byte) 1);
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((long) 10, periodType31);
        org.joda.time.Period period34 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period36 = period34.withMillis((int) (byte) 100);
        org.joda.time.Period period37 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Duration duration39 = period37.toDurationTo(readableInstant38);
        org.joda.time.Period period41 = period37.plusHours((-1));
        int int42 = period41.getSeconds();
        org.joda.time.Period period43 = period36.withFields((org.joda.time.ReadablePeriod) period41);
        int int44 = period41.getHours();
        org.joda.time.Period period45 = period32.minus((org.joda.time.ReadablePeriod) period41);
        org.joda.time.PeriodType periodType46 = period41.getPeriodType();
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType49, chronology50);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Duration duration53 = period51.toDurationFrom(readableInstant52);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.ReadableDuration readableDuration55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant54, readableDuration55);
        org.joda.time.Period period58 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period60 = period58.minusYears((int) (byte) -1);
        org.joda.time.Period period61 = period56.withFields((org.joda.time.ReadablePeriod) period58);
        org.joda.time.Period period63 = period58.withMinutes((int) (short) -1);
        org.joda.time.Period period64 = period51.plus((org.joda.time.ReadablePeriod) period63);
        org.joda.time.Period period66 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period68 = period66.withMillis((int) (byte) 100);
        org.joda.time.Period period69 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.Duration duration71 = period69.toDurationTo(readableInstant70);
        org.joda.time.Period period73 = period69.plusHours((-1));
        int int74 = period73.getSeconds();
        org.joda.time.Period period75 = period68.withFields((org.joda.time.ReadablePeriod) period73);
        org.joda.time.PeriodType periodType84 = null;
        org.joda.time.Period period85 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType84);
        org.joda.time.Period period87 = period85.withMillis((int) (short) 10);
        org.joda.time.Period period89 = period85.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType91 = period85.getFieldType((int) (short) 1);
        org.joda.time.Period period93 = period68.withField(durationFieldType91, 100);
        boolean boolean94 = period51.isSupported(durationFieldType91);
        org.joda.time.Period period96 = period41.withField(durationFieldType91, (int) '#');
        org.joda.time.Period period98 = period29.withField(durationFieldType91, (int) (byte) 1);
        boolean boolean99 = period7.isSupported(durationFieldType91);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertNotNull(durationFieldType91);
        org.junit.Assert.assertNotNull(period93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(period96);
        org.junit.Assert.assertNotNull(period98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period5 = period0.toPeriod();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableInstant7);
        org.joda.time.Period period10 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period12 = period10.withMillis((int) (byte) 100);
        org.joda.time.Period period13 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period13.toDurationTo(readableInstant14);
        org.joda.time.Period period17 = period13.plusHours((-1));
        int int18 = period17.getSeconds();
        org.joda.time.Period period19 = period12.withFields((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Period period21 = period19.withMonths(1);
        org.joda.time.Period period23 = period21.multipliedBy((-1));
        org.joda.time.PeriodType periodType24 = period21.getPeriodType();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((java.lang.Object) period8, periodType24, chronology25);
        org.joda.time.Period period27 = period0.normalizedStandard(periodType24);
        org.joda.time.Period period29 = period0.withMinutes((int) ' ');
        org.joda.time.Period period31 = period29.minusSeconds(1);
        org.joda.time.Period period33 = org.joda.time.Period.minutes(35);
        org.joda.time.Period period36 = new org.joda.time.Period((long) (short) 10, (long) (short) 0);
        org.joda.time.Period period37 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Duration duration39 = period37.toDurationTo(readableInstant38);
        org.joda.time.Period period41 = period37.plusHours((-1));
        int int42 = period41.getSeconds();
        org.joda.time.Period period44 = period41.withSeconds(10);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant45, readableDuration46);
        org.joda.time.Period period49 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period51 = period49.minusYears((int) (byte) -1);
        org.joda.time.Period period52 = period47.withFields((org.joda.time.ReadablePeriod) period49);
        int[] intArray53 = period47.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter54 = null;
        java.lang.String str55 = period47.toString(periodFormatter54);
        org.joda.time.PeriodType periodType64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType64);
        org.joda.time.Period period67 = period65.withMillis((int) (short) 10);
        org.joda.time.Period period69 = period65.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType71 = period65.getFieldType((int) (short) 1);
        org.joda.time.Period period73 = period47.withField(durationFieldType71, (int) (short) 10);
        org.joda.time.Period period75 = period44.withFieldAdded(durationFieldType71, (int) (byte) 10);
        int int76 = period36.indexOf(durationFieldType71);
        boolean boolean77 = period33.isSupported(durationFieldType71);
        int int78 = period29.get(durationFieldType71);
        org.joda.time.Period period80 = period29.withYears((int) (short) 1);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "PT0S" + "'", str55, "PT0S");
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(durationFieldType71);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(period80);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) 100);
        int int2 = period1.getWeeks();
        org.joda.time.Period period4 = period1.plusMillis((int) (byte) 0);
        org.joda.time.Period period5 = period1.normalizedStandard();
        org.joda.time.Period period7 = period1.withWeeks((-10));
        org.joda.time.Period period9 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period11 = period9.withMillis((int) (byte) 100);
        int int12 = period11.getSeconds();
        org.joda.time.Period period13 = period11.toPeriod();
        org.joda.time.Period period15 = period13.minusMonths((int) ' ');
        org.joda.time.Period period17 = period13.minusSeconds((int) (byte) 1);
        org.joda.time.Period period18 = period1.minus((org.joda.time.ReadablePeriod) period17);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.plusYears((int) (short) -1);
        org.joda.time.Period period8 = period4.plusMinutes(0);
        org.joda.time.Period period10 = period8.minusYears((int) '4');
        org.joda.time.Period period12 = period10.minusSeconds((int) ' ');
        org.joda.time.Period period14 = period12.minusWeeks(1);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.joda.time.Period period8 = new org.joda.time.Period(1000, 1, 0, 0, 35, (-100), (int) '4', (-10));
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(10L, (long) (byte) 0, chronology2);
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.Period period8 = period4.plusHours((-1));
        org.joda.time.Period period10 = period8.plusYears((int) (short) -1);
        org.joda.time.Period period12 = period10.minusWeeks((int) (short) 100);
        org.joda.time.PeriodType periodType13 = period12.getPeriodType();
        org.joda.time.Chronology chronology14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period15 = new org.joda.time.Period((java.lang.Object) (byte) 0, periodType13, chronology14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodType13);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
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
        org.joda.time.PeriodType periodType18 = period17.getPeriodType();
        int[] intArray19 = period17.getValues();
        org.joda.time.Chronology chronology20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period21 = new org.joda.time.Period((java.lang.Object) intArray19, chronology20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: [I");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 0, 0, 0, 0, 0, (-1), 0, 68 });
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.joda.time.Period period8 = new org.joda.time.Period((-1), (int) (byte) 10, 8, 1, (int) (byte) 10, 10, (int) (byte) 1, 1);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableDuration9, readableInstant10, periodType11);
        org.joda.time.PeriodType periodType13 = period12.getPeriodType();
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 10, periodType15);
        org.joda.time.Period period18 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period20 = period18.withMillis((int) (byte) 100);
        org.joda.time.Period period21 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = period21.toDurationTo(readableInstant22);
        org.joda.time.Period period25 = period21.plusHours((-1));
        int int26 = period25.getSeconds();
        org.joda.time.Period period27 = period20.withFields((org.joda.time.ReadablePeriod) period25);
        int int28 = period25.getHours();
        org.joda.time.Period period29 = period16.minus((org.joda.time.ReadablePeriod) period25);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant30, readableDuration31);
        org.joda.time.Period period34 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period36 = period34.minusYears((int) (byte) -1);
        org.joda.time.Period period37 = period32.withFields((org.joda.time.ReadablePeriod) period34);
        org.joda.time.Period period39 = period34.withMinutes((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Duration duration41 = period39.toDurationTo(readableInstant40);
        org.joda.time.Period period42 = period16.withFields((org.joda.time.ReadablePeriod) period39);
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType45, chronology46);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Duration duration49 = period47.toDurationFrom(readableInstant48);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant50, readableDuration51);
        org.joda.time.Period period54 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period56 = period54.minusYears((int) (byte) -1);
        org.joda.time.Period period57 = period52.withFields((org.joda.time.ReadablePeriod) period54);
        org.joda.time.Period period59 = period54.withMinutes((int) (short) -1);
        org.joda.time.Period period60 = period47.plus((org.joda.time.ReadablePeriod) period59);
        org.joda.time.Period period62 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period64 = period62.withMillis((int) (byte) 100);
        org.joda.time.Period period65 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.Duration duration67 = period65.toDurationTo(readableInstant66);
        org.joda.time.Period period69 = period65.plusHours((-1));
        int int70 = period69.getSeconds();
        org.joda.time.Period period71 = period64.withFields((org.joda.time.ReadablePeriod) period69);
        org.joda.time.PeriodType periodType80 = null;
        org.joda.time.Period period81 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType80);
        org.joda.time.Period period83 = period81.withMillis((int) (short) 10);
        org.joda.time.Period period85 = period81.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType87 = period81.getFieldType((int) (short) 1);
        org.joda.time.Period period89 = period64.withField(durationFieldType87, 100);
        boolean boolean90 = period47.isSupported(durationFieldType87);
        org.joda.time.Period period92 = period42.withField(durationFieldType87, 35);
        org.joda.time.Period period94 = period12.withFieldAdded(durationFieldType87, 8);
        org.joda.time.Period period96 = period8.withField(durationFieldType87, 1);
        int int97 = period8.getMinutes();
        org.joda.time.Period period99 = period8.plusMonths(32);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertNotNull(durationFieldType87);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(period92);
        org.junit.Assert.assertNotNull(period94);
        org.junit.Assert.assertNotNull(period96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 10 + "'", int97 == 10);
        org.junit.Assert.assertNotNull(period99);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.joda.time.Period period2 = new org.joda.time.Period(0L, (long) (byte) 100);
        org.joda.time.Minutes minutes3 = period2.toStandardMinutes();
        org.joda.time.Period period5 = period2.minusHours(35);
        org.joda.time.Minutes minutes6 = period2.toStandardMinutes();
        java.lang.Class<?> wildcardClass7 = period2.getClass();
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.Period period8 = period4.plusHours((-1));
        int int9 = period8.getSeconds();
        org.joda.time.Period period10 = period3.withFields((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period12 = period10.withMonths(1);
        org.joda.time.Weeks weeks13 = period10.toStandardWeeks();
        int int14 = period10.size();
        org.joda.time.Period period16 = period10.plusYears((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes17 = period16.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (short) 0);
        org.joda.time.Period period3 = period1.withDays((int) ' ');
        org.joda.time.Period period5 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period7 = period5.withMillis((int) (byte) 100);
        org.joda.time.Period period8 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period8.toDurationTo(readableInstant9);
        org.joda.time.Period period12 = period8.plusHours((-1));
        int int13 = period12.getSeconds();
        org.joda.time.Period period14 = period7.withFields((org.joda.time.ReadablePeriod) period12);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableDuration17, readableInstant18, periodType19);
        org.joda.time.PeriodType periodType21 = period20.getPeriodType();
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant15, readableInstant16, periodType21);
        org.joda.time.Period period23 = period7.normalizedStandard(periodType21);
        org.joda.time.Hours hours24 = period23.toStandardHours();
        org.joda.time.Period period26 = period23.withWeeks(8);
        org.joda.time.Period period27 = period1.plus((org.joda.time.ReadablePeriod) period26);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(hours24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period27);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.Period period6 = period4.plusHours(100);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationFrom(readableInstant7);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant3, (org.joda.time.ReadableDuration) duration8, periodType9);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration8, periodType11);
        org.joda.time.Period period14 = period12.minusMonths(10);
        org.joda.time.Period period17 = new org.joda.time.Period((long) 'a', (long) 10);
        org.joda.time.Period period18 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks19 = period18.toStandardWeeks();
        org.joda.time.Period period20 = period18.negated();
        org.joda.time.Period period22 = org.joda.time.Period.seconds(0);
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType31);
        org.joda.time.Period period34 = period32.withMillis((int) (short) 10);
        org.joda.time.Period period36 = period32.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType38 = period32.getFieldType((int) (short) 1);
        int int39 = period22.indexOf(durationFieldType38);
        org.joda.time.Period period41 = period20.withFieldAdded(durationFieldType38, (int) 'a');
        org.joda.time.Period period43 = period17.withField(durationFieldType38, (-1));
        org.joda.time.Period period44 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = period44.toDurationTo(readableInstant45);
        org.joda.time.Period period48 = period44.plusHours((-1));
        org.joda.time.Period period50 = period44.withYears(1);
        org.joda.time.Period period52 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period54 = period52.withMillis((int) (byte) 100);
        org.joda.time.Period period55 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.Duration duration57 = period55.toDurationTo(readableInstant56);
        org.joda.time.Period period59 = period55.plusHours((-1));
        int int60 = period59.getSeconds();
        org.joda.time.Period period61 = period54.withFields((org.joda.time.ReadablePeriod) period59);
        org.joda.time.Period period63 = period59.withMinutes((int) (short) 0);
        org.joda.time.Period period65 = period59.withMinutes(10);
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.Duration duration67 = period59.toDurationFrom(readableInstant66);
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.ReadableDuration readableDuration70 = null;
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.PeriodType periodType72 = null;
        org.joda.time.Period period73 = new org.joda.time.Period(readableDuration70, readableInstant71, periodType72);
        org.joda.time.PeriodType periodType74 = period73.getPeriodType();
        org.joda.time.Period period75 = new org.joda.time.Period(readableInstant68, readableInstant69, periodType74);
        org.joda.time.Period period76 = period59.normalizedStandard(periodType74);
        org.joda.time.Period period77 = period44.withPeriodType(periodType74);
        org.joda.time.Period period78 = period43.withPeriodType(periodType74);
        org.joda.time.Period period79 = period14.withPeriodType(periodType74);
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.Period period81 = new org.joda.time.Period((long) 100, (long) 'a', periodType74, chronology80);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(durationFieldType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertNotNull(periodType74);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(period79);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.Period period6 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period8 = period6.withMillis((int) (byte) 100);
        org.joda.time.Period period9 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationTo(readableInstant10);
        org.joda.time.Period period13 = period9.plusHours((-1));
        int int14 = period13.getSeconds();
        org.joda.time.Period period15 = period8.withFields((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period17 = period15.withMonths(1);
        org.joda.time.Period period19 = period17.multipliedBy((-1));
        org.joda.time.PeriodType periodType20 = period17.getPeriodType();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((java.lang.Object) period4, periodType20, chronology21);
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType20);
        org.joda.time.DurationFieldType durationFieldType24 = null;
        int int25 = period23.get(durationFieldType24);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 0);
        org.joda.time.MutablePeriod mutablePeriod2 = period1.toMutablePeriod();
        org.joda.time.Period period4 = period1.minusMonths((int) (byte) -1);
        int int5 = period4.size();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableDuration4, readableInstant5, periodType6);
        org.joda.time.PeriodType periodType8 = period7.getPeriodType();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) (byte) 10, periodType8, chronology9);
        org.joda.time.Period period11 = new org.joda.time.Period((long) (byte) 10, periodType8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) 11, (long) 68, periodType8, chronology12);
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Period period3 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period5 = period3.plusDays((int) (byte) 0);
        org.joda.time.Period period9 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period10 = period9.negated();
        org.joda.time.PeriodType periodType11 = period10.getPeriodType();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '4', (long) (short) 0, periodType11);
        org.joda.time.Period period13 = period3.normalizedStandard(periodType11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period14 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableDuration0, readableInstant1, periodType2);
        org.joda.time.PeriodType periodType4 = period3.getPeriodType();
        org.joda.time.Period period6 = period3.plusMonths(8);
        org.joda.time.Period period8 = period6.withDays(35);
        org.joda.time.Period period10 = period8.withWeeks(0);
        org.joda.time.Period period12 = period8.plusMinutes((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = period12.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.joda.time.Period period8 = new org.joda.time.Period((-1), (int) (byte) 10, 8, 1, (int) (byte) 10, 10, (int) (byte) 1, 1);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableDuration9, readableInstant10, periodType11);
        org.joda.time.PeriodType periodType13 = period12.getPeriodType();
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 10, periodType15);
        org.joda.time.Period period18 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period20 = period18.withMillis((int) (byte) 100);
        org.joda.time.Period period21 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = period21.toDurationTo(readableInstant22);
        org.joda.time.Period period25 = period21.plusHours((-1));
        int int26 = period25.getSeconds();
        org.joda.time.Period period27 = period20.withFields((org.joda.time.ReadablePeriod) period25);
        int int28 = period25.getHours();
        org.joda.time.Period period29 = period16.minus((org.joda.time.ReadablePeriod) period25);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant30, readableDuration31);
        org.joda.time.Period period34 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period36 = period34.minusYears((int) (byte) -1);
        org.joda.time.Period period37 = period32.withFields((org.joda.time.ReadablePeriod) period34);
        org.joda.time.Period period39 = period34.withMinutes((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Duration duration41 = period39.toDurationTo(readableInstant40);
        org.joda.time.Period period42 = period16.withFields((org.joda.time.ReadablePeriod) period39);
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType45, chronology46);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Duration duration49 = period47.toDurationFrom(readableInstant48);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant50, readableDuration51);
        org.joda.time.Period period54 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period56 = period54.minusYears((int) (byte) -1);
        org.joda.time.Period period57 = period52.withFields((org.joda.time.ReadablePeriod) period54);
        org.joda.time.Period period59 = period54.withMinutes((int) (short) -1);
        org.joda.time.Period period60 = period47.plus((org.joda.time.ReadablePeriod) period59);
        org.joda.time.Period period62 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period64 = period62.withMillis((int) (byte) 100);
        org.joda.time.Period period65 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.Duration duration67 = period65.toDurationTo(readableInstant66);
        org.joda.time.Period period69 = period65.plusHours((-1));
        int int70 = period69.getSeconds();
        org.joda.time.Period period71 = period64.withFields((org.joda.time.ReadablePeriod) period69);
        org.joda.time.PeriodType periodType80 = null;
        org.joda.time.Period period81 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType80);
        org.joda.time.Period period83 = period81.withMillis((int) (short) 10);
        org.joda.time.Period period85 = period81.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType87 = period81.getFieldType((int) (short) 1);
        org.joda.time.Period period89 = period64.withField(durationFieldType87, 100);
        boolean boolean90 = period47.isSupported(durationFieldType87);
        org.joda.time.Period period92 = period42.withField(durationFieldType87, 35);
        org.joda.time.Period period94 = period12.withFieldAdded(durationFieldType87, 8);
        org.joda.time.Period period96 = period8.withField(durationFieldType87, 1);
        org.joda.time.DurationFieldType durationFieldType97 = null;
        int int98 = period96.get(durationFieldType97);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertNotNull(durationFieldType87);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(period92);
        org.junit.Assert.assertNotNull(period94);
        org.junit.Assert.assertNotNull(period96);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.Period period8 = period4.plusHours((-1));
        int int9 = period8.getSeconds();
        org.joda.time.Period period10 = period3.withFields((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period12 = period10.withMonths(1);
        org.joda.time.Period period14 = period12.multipliedBy((-1));
        org.joda.time.PeriodType periodType15 = period12.getPeriodType();
        org.joda.time.Period period19 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period19.toDurationTo(readableInstant20);
        org.joda.time.Period period23 = period19.plusDays((int) (byte) 10);
        org.joda.time.Period period25 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period26 = period25.negated();
        org.joda.time.PeriodType periodType27 = period26.getPeriodType();
        org.joda.time.Period period28 = new org.joda.time.Period((java.lang.Object) period23, periodType27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) (short) 10, (long) '#', periodType27, chronology29);
        org.joda.time.Period period31 = new org.joda.time.Period(10L, periodType27);
        org.joda.time.Period period32 = period12.normalizedStandard(periodType27);
        org.joda.time.Period period33 = period32.normalizedStandard();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days34 = period32.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period33);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
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
        org.joda.time.Period period97 = period3.minusYears((int) (short) 1);
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
        org.junit.Assert.assertNotNull(period97);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period14 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period16 = period14.withMillis((int) (byte) 100);
        org.joda.time.Period period17 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period17.toDurationTo(readableInstant18);
        org.joda.time.Period period21 = period17.plusHours((-1));
        int int22 = period21.getSeconds();
        org.joda.time.Period period23 = period16.withFields((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period25 = period23.withMonths(1);
        org.joda.time.Period period27 = period25.multipliedBy((-1));
        org.joda.time.PeriodType periodType28 = period25.getPeriodType();
        org.joda.time.Period period29 = new org.joda.time.Period((long) ' ', (long) (byte) 1, periodType28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) ' ', (long) (byte) -1, periodType28, chronology30);
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant7, readableInstant8, periodType28);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((long) 10, (long) (short) 100, periodType28, chronology33);
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType28);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) (byte) 1, periodType28, chronology36);
        org.joda.time.Period period38 = new org.joda.time.Period((long) 68, (long) (short) -1, periodType28);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(periodType28);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.Period period8 = period4.plusHours((-1));
        int int9 = period8.getSeconds();
        org.joda.time.Period period10 = period3.withFields((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period12 = period10.plusMillis((int) '#');
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period14 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period14.toDurationTo(readableInstant15);
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant13, (org.joda.time.ReadableDuration) duration16);
        int int18 = period17.size();
        org.joda.time.Period period19 = period12.withFields((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Period period21 = period19.withSeconds((-1));
        org.joda.time.DurationFieldType[] durationFieldTypeArray22 = period21.getFieldTypes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(durationFieldTypeArray22);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMinutes((int) (byte) 0);
        org.joda.time.MutablePeriod mutablePeriod6 = period5.toMutablePeriod();
        org.joda.time.Period period7 = period5.normalizedStandard();
        int int8 = period5.getMonths();
        org.joda.time.Period period10 = period5.withDays((int) (short) 100);
        org.joda.time.Period period11 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationTo(readableInstant12);
        org.joda.time.Period period15 = period11.plusHours((-1));
        org.joda.time.Period period17 = period15.plusYears((int) (short) -1);
        org.joda.time.Period period19 = period15.plusMillis((int) ' ');
        org.joda.time.MutablePeriod mutablePeriod20 = period19.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant21, readableDuration22);
        org.joda.time.Period period25 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period27 = period25.minusYears((int) (byte) -1);
        org.joda.time.Period period28 = period23.withFields((org.joda.time.ReadablePeriod) period25);
        int[] intArray29 = period23.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter30 = null;
        java.lang.String str31 = period23.toString(periodFormatter30);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType40);
        org.joda.time.Period period43 = period41.withMillis((int) (short) 10);
        org.joda.time.Period period45 = period41.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType47 = period41.getFieldType((int) (short) 1);
        org.joda.time.Period period49 = period23.withField(durationFieldType47, (int) (short) 10);
        int int50 = period19.get(durationFieldType47);
        boolean boolean51 = period10.isSupported(durationFieldType47);
        org.joda.time.Period period53 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period55 = period53.withMillis((int) (byte) 100);
        org.joda.time.Period period57 = period55.plusSeconds((int) ' ');
        org.joda.time.Period period59 = period55.minusWeeks(10);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.ReadableDuration readableDuration61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period(readableInstant60, readableDuration61);
        org.joda.time.Period period64 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period66 = period64.minusYears((int) (byte) -1);
        org.joda.time.Period period67 = period62.withFields((org.joda.time.ReadablePeriod) period64);
        int[] intArray68 = period62.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter69 = null;
        java.lang.String str70 = period62.toString(periodFormatter69);
        org.joda.time.PeriodType periodType79 = null;
        org.joda.time.Period period80 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType79);
        org.joda.time.Period period82 = period80.withMillis((int) (short) 10);
        org.joda.time.Period period84 = period80.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType86 = period80.getFieldType((int) (short) 1);
        org.joda.time.Period period88 = period62.withField(durationFieldType86, (int) (short) 10);
        int int89 = period59.indexOf(durationFieldType86);
        int int90 = period10.get(durationFieldType86);
        org.joda.time.Period period92 = period10.minusHours((int) (byte) 10);
        org.joda.time.Period period94 = period92.withMonths(52);
        org.joda.time.Period period96 = period92.minusMinutes(4);
        org.joda.time.Period period98 = period92.withHours(0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(mutablePeriod20);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PT0S" + "'", str31, "PT0S");
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(durationFieldType47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertArrayEquals(intArray68, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "PT0S" + "'", str70, "PT0S");
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(durationFieldType86);
        org.junit.Assert.assertNotNull(period88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1 + "'", int89 == 1);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNotNull(period92);
        org.junit.Assert.assertNotNull(period94);
        org.junit.Assert.assertNotNull(period96);
        org.junit.Assert.assertNotNull(period98);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 0);
        org.joda.time.Period period3 = period1.withDays((int) (short) 100);
        org.joda.time.Period period5 = period3.plusMillis(97);
        int int6 = period3.getMillis();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, chronology1);
        org.joda.time.Period period4 = period2.withMinutes((int) (short) 0);
        org.joda.time.DurationFieldType durationFieldType6 = period4.getFieldType((int) (byte) 1);
        org.joda.time.Period period7 = period4.toPeriod();
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(hours8);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.plusYears((int) '#');
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.DurationFieldType durationFieldType7 = null;
        int int8 = period4.get(durationFieldType7);
        org.joda.time.Period period9 = period3.plus((org.joda.time.ReadablePeriod) period4);
        int[] intArray10 = period9.getValues();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period12.toDurationTo(readableInstant13);
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant11, (org.joda.time.ReadableDuration) duration14);
        int[] intArray16 = period15.getValues();
        org.joda.time.Period period17 = period9.withFields((org.joda.time.ReadablePeriod) period15);
        int int18 = period15.getSeconds();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 35, 0, 0, 0, 0, 0, (-1), 0 });
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.minusYears((int) (byte) -1);
        org.joda.time.Duration duration4 = period1.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationTo(readableInstant7);
        org.joda.time.Period period10 = period6.plusHours((-1));
        org.joda.time.Period period12 = period10.plusYears((int) (short) -1);
        org.joda.time.Period period14 = period12.minusWeeks((int) (short) 100);
        org.joda.time.PeriodType periodType15 = period14.getPeriodType();
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5, periodType15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = period20.toDurationTo(readableInstant21);
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant19, (org.joda.time.ReadableDuration) duration22);
        org.joda.time.Hours hours24 = period23.toStandardHours();
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period23.toDurationTo(readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration26, readableInstant27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Period period31 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period33 = period31.withMillis((int) (byte) 100);
        org.joda.time.Period period35 = period31.withMonths((int) ' ');
        org.joda.time.Period period37 = period31.withHours(100);
        int int38 = period37.getMinutes();
        org.joda.time.Period period40 = period37.withWeeks((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Duration duration42 = period40.toDurationFrom(readableInstant41);
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.PeriodType periodType61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period(readableDuration59, readableInstant60, periodType61);
        org.joda.time.PeriodType periodType63 = period62.getPeriodType();
        org.joda.time.Period period64 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType63);
        org.joda.time.Period period65 = new org.joda.time.Period((-1), 0, (int) (short) 1, (int) '4', 10, (int) (byte) 0, 100, (int) (byte) 1, periodType63);
        org.joda.time.Period period66 = new org.joda.time.Period(readableInstant29, (org.joda.time.ReadableDuration) duration42, periodType63);
        org.joda.time.Period period67 = new org.joda.time.Period(readableInstant18, (org.joda.time.ReadableDuration) duration26, periodType63);
        org.joda.time.Period period68 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant17, periodType63);
        org.joda.time.Period period70 = period68.minusMillis((int) (byte) 100);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(hours24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(periodType63);
        org.junit.Assert.assertNotNull(period70);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (byte) 0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 10, periodType1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period6 = period4.withMillis((int) (byte) 100);
        org.joda.time.Period period7 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period7.toDurationTo(readableInstant8);
        org.joda.time.Period period11 = period7.plusHours((-1));
        int int12 = period11.getSeconds();
        org.joda.time.Period period13 = period6.withFields((org.joda.time.ReadablePeriod) period11);
        int int14 = period11.getHours();
        org.joda.time.Period period15 = period2.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant16, readableDuration17);
        org.joda.time.Period period20 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period22 = period20.minusYears((int) (byte) -1);
        org.joda.time.Period period23 = period18.withFields((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Period period25 = period20.withMinutes((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period25.toDurationTo(readableInstant26);
        org.joda.time.Period period28 = period2.withFields((org.joda.time.ReadablePeriod) period25);
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) 10, periodType30);
        org.joda.time.Period period33 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period35 = period33.withMillis((int) (byte) 100);
        org.joda.time.Period period36 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = period36.toDurationTo(readableInstant37);
        org.joda.time.Period period40 = period36.plusHours((-1));
        int int41 = period40.getSeconds();
        org.joda.time.Period period42 = period35.withFields((org.joda.time.ReadablePeriod) period40);
        int int43 = period40.getHours();
        org.joda.time.Period period44 = period31.minus((org.joda.time.ReadablePeriod) period40);
        org.joda.time.PeriodType periodType45 = period40.getPeriodType();
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType48, chronology49);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Duration duration52 = period50.toDurationFrom(readableInstant51);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant53, readableDuration54);
        org.joda.time.Period period57 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period59 = period57.minusYears((int) (byte) -1);
        org.joda.time.Period period60 = period55.withFields((org.joda.time.ReadablePeriod) period57);
        org.joda.time.Period period62 = period57.withMinutes((int) (short) -1);
        org.joda.time.Period period63 = period50.plus((org.joda.time.ReadablePeriod) period62);
        org.joda.time.Period period65 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period67 = period65.withMillis((int) (byte) 100);
        org.joda.time.Period period68 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.Duration duration70 = period68.toDurationTo(readableInstant69);
        org.joda.time.Period period72 = period68.plusHours((-1));
        int int73 = period72.getSeconds();
        org.joda.time.Period period74 = period67.withFields((org.joda.time.ReadablePeriod) period72);
        org.joda.time.PeriodType periodType83 = null;
        org.joda.time.Period period84 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType83);
        org.joda.time.Period period86 = period84.withMillis((int) (short) 10);
        org.joda.time.Period period88 = period84.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType90 = period84.getFieldType((int) (short) 1);
        org.joda.time.Period period92 = period67.withField(durationFieldType90, 100);
        boolean boolean93 = period50.isSupported(durationFieldType90);
        org.joda.time.Period period95 = period40.withField(durationFieldType90, (int) '#');
        int int96 = period2.indexOf(durationFieldType90);
        org.joda.time.Period period98 = period2.plusSeconds((int) (short) -1);
        int[] intArray99 = period98.getValues();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(period88);
        org.junit.Assert.assertNotNull(durationFieldType90);
        org.junit.Assert.assertNotNull(period92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(period95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 1 + "'", int96 == 1);
        org.junit.Assert.assertNotNull(period98);
        org.junit.Assert.assertNotNull(intArray99);
        org.junit.Assert.assertArrayEquals(intArray99, new int[] { 0, 0, 0, 0, 0, 0, (-1), 10 });
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.Period period8 = period4.plusHours((-1));
        int int9 = period8.getSeconds();
        org.joda.time.Period period10 = period3.withFields((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period12 = period10.withMonths(1);
        org.joda.time.Period period14 = period10.plusMonths((int) (byte) 100);
        int[] intArray15 = period10.getValues();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0, 0, 0, 0, (-1), 0, 0, 0 });
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(4);
        org.joda.time.Period period3 = period1.minusMillis((-1));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 4, chronology1);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType11);
        org.joda.time.Period period14 = period12.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((java.lang.Object) period14, periodType15);
        org.joda.time.Period period18 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period20 = period18.withMillis((int) (byte) 100);
        org.joda.time.Period period22 = period18.withMonths((int) ' ');
        org.joda.time.Period period24 = period18.withHours(100);
        org.joda.time.Period period25 = period14.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Period period27 = period25.plusMonths(100);
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType38, chronology39);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Duration duration42 = period40.toDurationFrom(readableInstant41);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant43, readableDuration44);
        org.joda.time.Period period47 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period49 = period47.minusYears((int) (byte) -1);
        org.joda.time.Period period50 = period45.withFields((org.joda.time.ReadablePeriod) period47);
        org.joda.time.Period period52 = period47.withMinutes((int) (short) -1);
        org.joda.time.Period period53 = period40.plus((org.joda.time.ReadablePeriod) period52);
        org.joda.time.PeriodType periodType54 = period53.getPeriodType();
        org.joda.time.Period period55 = new org.joda.time.Period((int) '4', (int) 'a', (int) (short) -1, 100, 100, 10, (int) '4', 10, periodType54);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period((java.lang.Object) period27, periodType54, chronology56);
        org.joda.time.Period period58 = period2.normalizedStandard(periodType54);
        org.joda.time.Duration duration59 = period58.toStandardDuration();
        org.joda.time.Period period61 = period58.plusMinutes(4);
        org.joda.time.Period period63 = period58.plusDays(10);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period63);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.Period period4 = period2.plusDays((int) 'a');
        org.joda.time.Period period6 = period4.withMinutes((int) (short) -1);
        org.joda.time.Period period8 = period4.plusHours(35);
        org.joda.time.format.PeriodFormatter periodFormatter9 = null;
        java.lang.String str10 = period4.toString(periodFormatter9);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "P97D" + "'", str10, "P97D");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) -1, chronology1);
        int int3 = period2.getMonths();
        org.joda.time.Period period4 = period2.negated();
        org.joda.time.Period period6 = period2.minusMinutes((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        org.joda.time.Period period9 = period7.withYears((int) ' ');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = org.joda.time.Period.ZERO;
        org.joda.time.Period period15 = period13.plusHours(100);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period15.toDurationFrom(readableInstant16);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant12, (org.joda.time.ReadableDuration) duration17, periodType18);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant11, (org.joda.time.ReadableDuration) duration17, periodType20);
        org.joda.time.Period period23 = period21.minusMonths(10);
        org.joda.time.Period period25 = period23.withSeconds((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period23.toDurationFrom(readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Period period30 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period32 = period30.withMillis((int) (byte) 100);
        org.joda.time.Period period34 = period30.withMonths((int) ' ');
        org.joda.time.Period period36 = period30.withHours(100);
        int int37 = period36.getMinutes();
        org.joda.time.Period period39 = period36.withWeeks((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Duration duration41 = period39.toDurationFrom(readableInstant40);
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.Period period61 = new org.joda.time.Period(readableDuration58, readableInstant59, periodType60);
        org.joda.time.PeriodType periodType62 = period61.getPeriodType();
        org.joda.time.Period period63 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType62);
        org.joda.time.Period period64 = new org.joda.time.Period((-1), 0, (int) (short) 1, (int) '4', 10, (int) (byte) 0, 100, (int) (byte) 1, periodType62);
        org.joda.time.Period period65 = new org.joda.time.Period(readableInstant28, (org.joda.time.ReadableDuration) duration41, periodType62);
        org.joda.time.Period period66 = new org.joda.time.Period(readableInstant10, (org.joda.time.ReadableDuration) duration27, periodType62);
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.Period period68 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration27, readableInstant67);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.ReadableDuration readableDuration78 = null;
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.PeriodType periodType80 = null;
        org.joda.time.Period period81 = new org.joda.time.Period(readableDuration78, readableInstant79, periodType80);
        org.joda.time.PeriodType periodType82 = period81.getPeriodType();
        org.joda.time.Period period83 = new org.joda.time.Period(readableInstant76, readableInstant77, periodType82);
        org.joda.time.Chronology chronology84 = null;
        org.joda.time.Period period85 = new org.joda.time.Period((long) (byte) -1, (long) (byte) 1, periodType82, chronology84);
        org.joda.time.Period period86 = new org.joda.time.Period((long) 10, periodType82);
        org.joda.time.Chronology chronology87 = null;
        org.joda.time.Period period88 = new org.joda.time.Period((long) (byte) 10, (long) ' ', periodType82, chronology87);
        org.joda.time.Period period89 = new org.joda.time.Period((long) (byte) 1, periodType82);
        org.joda.time.Period period90 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration27, readableInstant69, periodType82);
        org.joda.time.Period period92 = period90.withMillis(0);
        org.joda.time.Period period93 = period9.minus((org.joda.time.ReadablePeriod) period90);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertNotNull(periodType82);
        org.junit.Assert.assertNotNull(period92);
        org.junit.Assert.assertNotNull(period93);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.joda.time.Period period5 = period1.plusHours((-1));
        org.joda.time.Period period7 = period5.plusYears((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period5.toDurationTo(readableInstant8);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableDuration11, readableInstant12, periodType13);
        org.joda.time.PeriodType periodType15 = period14.getPeriodType();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) (byte) 10, periodType15, chronology16);
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration9, periodType15);
        org.joda.time.Period period20 = period18.minusHours(8);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        int int10 = period9.getMillis();
        int int11 = period9.getWeeks();
        org.joda.time.Period period13 = period9.withDays(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes14 = period9.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableDuration10, readableInstant11, periodType12);
        org.joda.time.PeriodType periodType14 = period13.getPeriodType();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) (byte) 10, periodType14, chronology15);
        org.joda.time.Period period17 = new org.joda.time.Period((long) (byte) 10, periodType14);
        org.joda.time.Period period18 = new org.joda.time.Period(8, 8, 35, (int) (short) 1, (int) (short) 100, (int) (byte) 100, (int) '#', (int) '#', periodType14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds19 = period18.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Seconds as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType14);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((-1), (int) (byte) 10, 8, 1, (int) (byte) 10, 10, (int) (byte) 1, 1);
        org.joda.time.PeriodType periodType21 = period20.getPeriodType();
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType21);
        org.joda.time.Period period23 = new org.joda.time.Period((int) (short) 100, (int) '#', (int) (byte) -1, (-1), 32, (int) (byte) 1, 8, (-1), periodType21);
        org.joda.time.Period period24 = new org.joda.time.Period((long) (byte) 10, (long) (short) -1, periodType21);
        int int25 = period24.getMillis();
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-11) + "'", int25 == (-11));
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.joda.time.Period period1 = org.joda.time.Period.hours(10);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (byte) -1);
        int int2 = period1.getMonths();
        org.joda.time.Period period3 = period1.toPeriod();
        int int4 = period1.size();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.joda.time.Period period2 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period4 = period2.withMillis((int) (byte) 100);
        org.joda.time.Period period6 = period2.withMinutes((int) (byte) 0);
        org.joda.time.Period period8 = period6.plusHours((int) (short) 1);
        org.joda.time.Hours hours9 = period8.toStandardHours();
        org.joda.time.PeriodType periodType10 = period8.getPeriodType();
        org.joda.time.Chronology chronology11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = new org.joda.time.Period((java.lang.Object) 8, periodType10, chronology11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableDuration0, readableInstant1, periodType2);
        org.joda.time.PeriodType periodType4 = period3.getPeriodType();
        org.joda.time.Period period6 = period3.plusMonths(8);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period3.toDurationTo(readableInstant7);
        org.joda.time.Period period10 = period3.withDays((int) (byte) 100);
        int int11 = period10.getYears();
        org.joda.time.DurationFieldType durationFieldType13 = period10.getFieldType((int) (byte) 0);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(durationFieldType13);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (short) 100);
        org.joda.time.Period period4 = new org.joda.time.Period((long) 'a', (long) 10);
        org.joda.time.Period period5 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks6 = period5.toStandardWeeks();
        org.joda.time.Period period7 = period5.negated();
        org.joda.time.Period period9 = org.joda.time.Period.seconds(0);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType18);
        org.joda.time.Period period21 = period19.withMillis((int) (short) 10);
        org.joda.time.Period period23 = period19.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType25 = period19.getFieldType((int) (short) 1);
        int int26 = period9.indexOf(durationFieldType25);
        org.joda.time.Period period28 = period7.withFieldAdded(durationFieldType25, (int) 'a');
        org.joda.time.Period period30 = period4.withField(durationFieldType25, (-1));
        int int31 = period1.get(durationFieldType25);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant32, readableDuration33);
        org.joda.time.Period period36 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period38 = period36.minusYears((int) (byte) -1);
        org.joda.time.Period period39 = period34.withFields((org.joda.time.ReadablePeriod) period36);
        org.joda.time.Period period41 = period39.minusMillis(35);
        org.joda.time.Period period43 = period41.withDays((int) ' ');
        org.joda.time.Period period45 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period47 = period45.withMillis((int) (byte) 100);
        org.joda.time.Period period49 = period47.plusSeconds((int) ' ');
        org.joda.time.Period period51 = period47.minusWeeks(10);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant52, readableDuration53);
        org.joda.time.Period period56 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period58 = period56.minusYears((int) (byte) -1);
        org.joda.time.Period period59 = period54.withFields((org.joda.time.ReadablePeriod) period56);
        int[] intArray60 = period54.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter61 = null;
        java.lang.String str62 = period54.toString(periodFormatter61);
        org.joda.time.PeriodType periodType71 = null;
        org.joda.time.Period period72 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType71);
        org.joda.time.Period period74 = period72.withMillis((int) (short) 10);
        org.joda.time.Period period76 = period72.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType78 = period72.getFieldType((int) (short) 1);
        org.joda.time.Period period80 = period54.withField(durationFieldType78, (int) (short) 10);
        int int81 = period51.indexOf(durationFieldType78);
        int int82 = period41.indexOf(durationFieldType78);
        int int83 = period1.indexOf(durationFieldType78);
        org.joda.time.Period period84 = period1.normalizedStandard();
        int int85 = period1.getYears();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "PT0S" + "'", str62, "PT0S");
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(durationFieldType78);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.joda.time.Period period1 = org.joda.time.Period.years(11);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMinutes((int) (byte) 0);
        org.joda.time.Period period7 = period5.plusHours((int) (short) 1);
        org.joda.time.DurationFieldType[] durationFieldTypeArray8 = period7.getFieldTypes();
        org.joda.time.Period period10 = period7.plusMinutes(0);
        org.joda.time.MutablePeriod mutablePeriod11 = period7.toMutablePeriod();
        org.joda.time.Weeks weeks12 = period7.toStandardWeeks();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(durationFieldTypeArray8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertNotNull(weeks12);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.joda.time.Period period1 = org.joda.time.Period.weeks(1000);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 1000, chronology1);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        int int8 = period7.getMinutes();
        org.joda.time.Period period10 = period7.withMinutes(0);
        org.joda.time.MutablePeriod mutablePeriod11 = period7.toMutablePeriod();
        org.joda.time.Period period13 = period7.minusDays((int) (byte) -1);
        int int14 = period7.getMinutes();
        int int15 = period7.getMinutes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.Period period8 = period4.plusHours((-1));
        int int9 = period8.getSeconds();
        org.joda.time.Period period10 = period3.withFields((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period12 = period10.plusMillis((int) '#');
        org.joda.time.Period period14 = period12.plusMinutes((int) (short) -1);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType17, chronology18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period19.toDurationFrom(readableInstant20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant22, readableDuration23);
        org.joda.time.Period period26 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period28 = period26.minusYears((int) (byte) -1);
        org.joda.time.Period period29 = period24.withFields((org.joda.time.ReadablePeriod) period26);
        org.joda.time.Period period31 = period26.withMinutes((int) (short) -1);
        org.joda.time.Period period32 = period19.plus((org.joda.time.ReadablePeriod) period31);
        org.joda.time.Period period33 = period14.plus((org.joda.time.ReadablePeriod) period32);
        org.joda.time.Period period35 = period32.plusYears(8);
        int int36 = period32.getMonths();
        org.joda.time.Period period38 = period32.plusMinutes((int) (byte) 10);
        org.joda.time.Hours hours39 = period38.toStandardHours();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(hours39);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(97);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        int int12 = period11.getHours();
        org.joda.time.Period period13 = period11.normalizedStandard();
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.joda.time.Period period1 = org.joda.time.Period.hours((-965));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period2 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period4 = period2.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationTo(readableInstant6);
        org.joda.time.Period period9 = period5.plusHours((-1));
        int int10 = period9.getSeconds();
        org.joda.time.Period period11 = period4.withFields((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period13 = period11.withMonths(1);
        org.joda.time.Period period15 = period13.multipliedBy((-1));
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period13.toDurationFrom(readableInstant16);
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration17);
        org.joda.time.Period period19 = period18.negated();
        java.lang.Class<?> wildcardClass20 = period19.getClass();
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period2 = period1.negated();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableDuration4, readableInstant5, periodType6);
        org.joda.time.PeriodType periodType8 = period7.getPeriodType();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) (byte) 10, periodType8, chronology9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((java.lang.Object) period2, periodType8, chronology11);
        org.joda.time.Period period14 = period12.minusMonths((int) 'a');
        int int15 = period12.getMinutes();
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant16, readableDuration17);
        org.joda.time.Period period20 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period22 = period20.minusYears((int) (byte) -1);
        org.joda.time.Period period23 = period18.withFields((org.joda.time.ReadablePeriod) period20);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Period period26 = org.joda.time.Period.ZERO;
        org.joda.time.Period period28 = period26.plusHours(100);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = period28.toDurationFrom(readableInstant29);
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant25, (org.joda.time.ReadableDuration) duration30, periodType31);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant24, (org.joda.time.ReadableDuration) duration30, periodType33);
        org.joda.time.Period period35 = period34.normalizedStandard();
        org.joda.time.Period period37 = period34.withMonths(10);
        org.joda.time.Period period39 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period41 = period39.withMillis((int) (byte) 100);
        org.joda.time.Period period42 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Duration duration44 = period42.toDurationTo(readableInstant43);
        org.joda.time.Period period46 = period42.plusHours((-1));
        int int47 = period46.getSeconds();
        org.joda.time.Period period48 = period41.withFields((org.joda.time.ReadablePeriod) period46);
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType57);
        org.joda.time.Period period60 = period58.withMillis((int) (short) 10);
        org.joda.time.Period period62 = period58.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType64 = period58.getFieldType((int) (short) 1);
        org.joda.time.Period period66 = period41.withField(durationFieldType64, 100);
        int int67 = period34.get(durationFieldType64);
        org.joda.time.Period period69 = period20.withField(durationFieldType64, (-1));
        int int70 = period12.indexOf(durationFieldType64);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(durationFieldType64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 11, (long) 10);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType11);
        org.joda.time.Period period14 = period12.withMillis((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.Period period16 = period12.plus(readablePeriod15);
        org.joda.time.Period period17 = period2.withFields((org.joda.time.ReadablePeriod) period16);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) (short) -1);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
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
        int int11 = period10.getYears();
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 35, (long) 10, chronology2);
        org.joda.time.Seconds seconds4 = period3.toStandardSeconds();
        org.junit.Assert.assertNotNull(seconds4);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period3 = period1.plusDays((int) (byte) 0);
        org.joda.time.Period period7 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period8 = period7.negated();
        org.joda.time.PeriodType periodType9 = period8.getPeriodType();
        org.joda.time.Period period10 = new org.joda.time.Period((long) '4', (long) (short) 0, periodType9);
        org.joda.time.Period period11 = period1.normalizedStandard(periodType9);
        org.joda.time.Period period13 = period1.minusHours(97);
        org.joda.time.Period period15 = period13.plusMillis((int) (short) 1);
        org.joda.time.Period period17 = period13.withSeconds((int) 'a');
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        int int51 = period4.getDays();
        org.joda.time.Period period53 = period4.withHours((int) (byte) -1);
        org.joda.time.Period period55 = period53.plusDays((-10));
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 0, (long) 1, chronology2);
        org.joda.time.Period period4 = period3.negated();
        org.joda.time.Period period6 = period3.minusWeeks((int) (short) -1);
        org.joda.time.Period period8 = period6.withWeeks((int) '#');
        java.lang.String str9 = period8.toString();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P35WT0.001S" + "'", str9, "P35WT0.001S");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((-1), (int) (byte) 10, 8, 1, (int) (byte) 10, 10, (int) (byte) 1, 1);
        org.joda.time.PeriodType periodType11 = period10.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
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
        org.joda.time.Period period19 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period21 = period19.withMillis((int) (byte) 100);
        org.joda.time.Period period22 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationTo(readableInstant23);
        org.joda.time.Period period26 = period22.plusHours((-1));
        int int27 = period26.getSeconds();
        org.joda.time.Period period28 = period21.withFields((org.joda.time.ReadablePeriod) period26);
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType37);
        org.joda.time.Period period40 = period38.withMillis((int) (short) 10);
        org.joda.time.Period period42 = period38.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType44 = period38.getFieldType((int) (short) 1);
        org.joda.time.Period period46 = period21.withField(durationFieldType44, 100);
        boolean boolean47 = period4.isSupported(durationFieldType44);
        java.lang.Object obj48 = null;
        boolean boolean49 = period4.equals(obj48);
        org.joda.time.Period period51 = period4.plusHours(100);
        org.joda.time.Period period53 = period4.minusHours(0);
        org.joda.time.Period period54 = period53.toPeriod();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period54);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        java.lang.String str8 = period7.toString();
        java.lang.String str9 = period7.toString();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant10, readableDuration11);
        org.joda.time.Period period14 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period16 = period14.minusYears((int) (byte) -1);
        org.joda.time.Period period17 = period12.withFields((org.joda.time.ReadablePeriod) period14);
        int[] intArray18 = period12.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter19 = null;
        java.lang.String str20 = period12.toString(periodFormatter19);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType29);
        org.joda.time.Period period32 = period30.withMillis((int) (short) 10);
        org.joda.time.Period period34 = period30.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType36 = period30.getFieldType((int) (short) 1);
        org.joda.time.Period period38 = period12.withField(durationFieldType36, (int) (short) 10);
        org.joda.time.MutablePeriod mutablePeriod39 = period38.toMutablePeriod();
        org.joda.time.Period period41 = period38.minusYears(100);
        org.joda.time.Period period43 = org.joda.time.Period.years((-1));
        org.joda.time.Period period45 = period43.withHours(0);
        org.joda.time.Period period47 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period49 = period47.withMillis((int) (byte) 100);
        org.joda.time.Period period50 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Duration duration52 = period50.toDurationTo(readableInstant51);
        org.joda.time.Period period54 = period50.plusHours((-1));
        int int55 = period54.getSeconds();
        org.joda.time.Period period56 = period49.withFields((org.joda.time.ReadablePeriod) period54);
        org.joda.time.PeriodType periodType65 = null;
        org.joda.time.Period period66 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType65);
        org.joda.time.Period period68 = period66.withMillis((int) (short) 10);
        org.joda.time.Period period70 = period66.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType72 = period66.getFieldType((int) (short) 1);
        org.joda.time.Period period74 = period49.withField(durationFieldType72, 100);
        boolean boolean75 = period43.isSupported(durationFieldType72);
        org.joda.time.Period period77 = period38.withFieldAdded(durationFieldType72, 0);
        org.joda.time.Period period79 = period38.minusMinutes((int) (byte) -1);
        org.joda.time.Period period81 = period38.minusYears((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType83 = period81.getFieldType(4);
        int int84 = period7.indexOf(durationFieldType83);
        org.joda.time.Period period85 = period7.negated();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT100H" + "'", str8, "PT100H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT100H" + "'", str9, "PT100H");
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PT0S" + "'", str20, "PT0S");
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(mutablePeriod39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(durationFieldType72);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(durationFieldType83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 4 + "'", int84 == 4);
        org.junit.Assert.assertNotNull(period85);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.joda.time.Period period1 = org.joda.time.Period.hours(1);
        org.joda.time.Period period2 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationTo(readableInstant3);
        org.joda.time.Period period6 = org.joda.time.Period.minutes((int) (byte) 0);
        boolean boolean7 = period2.equals((java.lang.Object) period6);
        org.joda.time.Period period8 = period6.negated();
        org.joda.time.DurationFieldType durationFieldType10 = period8.getFieldType((int) (short) 1);
        org.joda.time.Period period12 = period1.withFieldAdded(durationFieldType10, (int) (short) 1);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period1, chronology13);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period11, periodType12);
        org.joda.time.Period period15 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period17 = period15.withMillis((int) (byte) 100);
        org.joda.time.Period period19 = period15.withMonths((int) ' ');
        org.joda.time.Period period21 = period15.withHours(100);
        org.joda.time.Period period22 = period11.withFields((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Period period24 = period11.plusWeeks(100);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.plusYears((int) (short) -1);
        org.joda.time.Period period8 = period6.minusWeeks((int) (short) 100);
        org.joda.time.Period period10 = period6.withDays((int) (byte) 0);
        org.joda.time.Period period12 = period10.withWeeks((int) (byte) 1);
        org.joda.time.Period period14 = period12.plusMonths(4);
        org.joda.time.Period period16 = period12.minusMillis((int) (byte) 100);
        org.joda.time.Period period18 = period12.plusDays((-1));
        org.joda.time.Period period20 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period22 = period20.withMillis((int) (byte) 100);
        org.joda.time.Period period23 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period23.toDurationTo(readableInstant24);
        org.joda.time.Period period27 = period23.plusHours((-1));
        int int28 = period27.getSeconds();
        org.joda.time.Period period29 = period22.withFields((org.joda.time.ReadablePeriod) period27);
        org.joda.time.Hours hours30 = period27.toStandardHours();
        org.joda.time.Period period31 = new org.joda.time.Period((java.lang.Object) hours30);
        org.joda.time.Period period32 = period12.minus((org.joda.time.ReadablePeriod) period31);
        java.lang.Class<?> wildcardClass33 = period31.getClass();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(hours30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) 'a');
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 0, (long) 1, chronology2);
        org.joda.time.Period period4 = period3.negated();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableDuration22, readableInstant23, periodType24);
        org.joda.time.PeriodType periodType26 = period25.getPeriodType();
        org.joda.time.Period period27 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType26);
        org.joda.time.Period period28 = new org.joda.time.Period((-1), 0, (int) (short) 1, (int) '4', 10, (int) (byte) 0, 100, (int) (byte) 1, periodType26);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) 100, periodType26, chronology29);
        org.joda.time.Period period31 = period3.normalizedStandard(periodType26);
        int int32 = period31.size();
        org.joda.time.Period period34 = period31.withMillis((int) '#');
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 8 + "'", int32 == 8);
        org.junit.Assert.assertNotNull(period34);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.joda.time.Period period8 = new org.joda.time.Period(40, 97, (int) ' ', (-35), (int) (byte) 1, 32, 10, 100);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.DurationFieldType[] durationFieldTypeArray6 = period1.getFieldTypes();
        org.joda.time.Period period10 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period12 = period10.minusYears((int) (byte) -1);
        org.joda.time.Duration duration13 = period10.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableDuration17, readableInstant18, periodType19);
        org.joda.time.PeriodType periodType21 = period20.getPeriodType();
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant15, readableInstant16, periodType21);
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration13, readableInstant14, periodType21);
        org.joda.time.Period period24 = new org.joda.time.Period(0L, (long) (byte) -1, periodType21);
        org.joda.time.Chronology chronology25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period26 = new org.joda.time.Period((java.lang.Object) durationFieldTypeArray6, periodType21, chronology25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: [Lorg.joda.time.DurationFieldType;");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(durationFieldTypeArray6);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(periodType21);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 11, (long) 10);
        org.joda.time.Chronology chronology3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period4 = new org.joda.time.Period((java.lang.Object) 10, chronology3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) 1, 0, (int) (byte) 100, 0, 0, (int) (byte) 1, (int) (short) 10, 0);
        org.joda.time.Period period10 = period8.plusMonths(1);
        org.joda.time.Period period12 = org.joda.time.Period.seconds(0);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType21);
        org.joda.time.Period period24 = period22.withMillis((int) (short) 10);
        org.joda.time.Period period26 = period22.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType28 = period22.getFieldType((int) (short) 1);
        int int29 = period12.indexOf(durationFieldType28);
        org.joda.time.Period period31 = period10.withField(durationFieldType28, (int) (short) 100);
        org.joda.time.Period period33 = period31.minusMinutes((int) (short) 10);
        int int34 = period31.size();
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 8 + "'", int34 == 8);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        int int5 = period4.getSeconds();
        org.joda.time.Period period7 = period4.withSeconds(10);
        int int8 = period7.getSeconds();
        org.joda.time.Period period10 = period7.plusYears((int) (byte) 0);
        int int11 = period7.getMinutes();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.joda.time.Period period1 = org.joda.time.Period.days(68);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period3 = period1.plusDays((int) (byte) 0);
        org.joda.time.Period period5 = period3.minusMonths((int) (short) 0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType5, chronology6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period7.toDurationFrom(readableInstant8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration9, readableInstant10, periodType11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant13, readableDuration14);
        org.joda.time.Period period17 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period19 = period17.minusYears((int) (byte) -1);
        org.joda.time.Period period20 = period15.withFields((org.joda.time.ReadablePeriod) period17);
        org.joda.time.PeriodType periodType21 = period17.getPeriodType();
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration9, periodType21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period23 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.Period period4 = period2.plusDays((int) 'a');
        org.joda.time.Period period6 = period4.withMillis((int) (short) -1);
        int int7 = period4.size();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.Period period3 = period1.withMonths(1);
        org.joda.time.Period period5 = period3.multipliedBy((int) '4');
        org.joda.time.Period period7 = period3.plusMinutes(10);
        org.joda.time.DurationFieldType[] durationFieldTypeArray8 = period3.getFieldTypes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(durationFieldTypeArray8);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.withYears((int) (short) 10);
        org.joda.time.Period period8 = period4.withDays((int) (short) 100);
        org.joda.time.Period period10 = period4.plusMillis((int) (short) -1);
        org.joda.time.Period period14 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period15 = period14.negated();
        org.joda.time.PeriodType periodType16 = period15.getPeriodType();
        org.joda.time.Period period17 = new org.joda.time.Period((long) '4', (long) (short) 0, periodType16);
        org.joda.time.Period period18 = period10.normalizedStandard(periodType16);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = period10.toDurationFrom(readableInstant19);
        org.joda.time.Period period22 = period10.withHours(1000);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = period22.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period22);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', (long) (byte) 1, chronology2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType5 = period3.getFieldType((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 0, (long) 10);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.joda.time.Period period1 = org.joda.time.Period.days(1);
        org.joda.time.Period period3 = period1.plusDays((int) (short) 100);
        int int4 = period1.getMillis();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) (short) 10);
        org.joda.time.Period period3 = period1.withDays((int) (byte) -1);
        org.joda.time.Period period5 = period1.plusDays(4);
        int int6 = period1.getMinutes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period2 = period1.negated();
        org.joda.time.PeriodType periodType3 = period2.getPeriodType();
        org.joda.time.Period period5 = period2.plusWeeks((int) (byte) 1);
        org.joda.time.Period period7 = period5.withMillis(52);
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
        org.joda.time.Period period27 = new org.joda.time.Period((long) ' ', periodType23);
        org.joda.time.Period period28 = period7.normalizedStandard(periodType23);
        org.joda.time.Minutes minutes29 = period7.toStandardMinutes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(minutes29);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.withMillis((int) (short) 1);
        org.joda.time.Period period8 = org.joda.time.Period.seconds(0);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType17);
        org.joda.time.Period period20 = period18.withMillis((int) (short) 10);
        org.joda.time.Period period22 = period18.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType24 = period18.getFieldType((int) (short) 1);
        int int25 = period8.indexOf(durationFieldType24);
        boolean boolean26 = period6.equals((java.lang.Object) int25);
        org.joda.time.Period period28 = period6.plusYears((int) ' ');
        org.joda.time.Period period29 = period28.negated();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period11, periodType12);
        org.joda.time.Period period15 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period17 = period15.withMillis((int) (byte) 100);
        org.joda.time.Period period19 = period15.withMonths((int) ' ');
        org.joda.time.Period period21 = period15.withHours(100);
        org.joda.time.Period period22 = period11.withFields((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Period period24 = period22.plusMonths(100);
        int int25 = period22.getWeeks();
        int int26 = period22.getYears();
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
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
        org.joda.time.Period period30 = period2.withDays(100);
        org.joda.time.Period period32 = period2.withWeeks(97);
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
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.withMillis((int) (short) 1);
        org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) period4);
        org.joda.time.Duration duration8 = period4.toStandardDuration();
        org.joda.time.Period period10 = period4.plusSeconds((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType12 = period10.getFieldType(1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1000 out of bounds for length 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.joda.time.Period period3 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period4 = period3.negated();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableDuration6, readableInstant7, periodType8);
        org.joda.time.PeriodType periodType10 = period9.getPeriodType();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) (byte) 10, periodType10, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period4, periodType10, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(0L, (long) (short) -1, periodType10, chronology15);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.minusYears((int) (byte) -1);
        org.joda.time.Period period5 = period3.minusMinutes((int) ' ');
        org.joda.time.Period period7 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period7.toDurationTo(readableInstant8);
        org.joda.time.Period period11 = period7.plusHours((-1));
        org.joda.time.Period period13 = period7.withYears(1);
        org.joda.time.Period period15 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period17 = period15.withMillis((int) (byte) 100);
        org.joda.time.Period period18 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = period18.toDurationTo(readableInstant19);
        org.joda.time.Period period22 = period18.plusHours((-1));
        int int23 = period22.getSeconds();
        org.joda.time.Period period24 = period17.withFields((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Period period26 = period22.withMinutes((int) (short) 0);
        org.joda.time.Period period28 = period22.withMinutes(10);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = period22.toDurationFrom(readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(readableDuration33, readableInstant34, periodType35);
        org.joda.time.PeriodType periodType37 = period36.getPeriodType();
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant31, readableInstant32, periodType37);
        org.joda.time.Period period39 = period22.normalizedStandard(periodType37);
        org.joda.time.Period period40 = period7.withPeriodType(periodType37);
        org.joda.time.Period period41 = new org.joda.time.Period((long) 1, periodType37);
        org.joda.time.Period period42 = period5.normalizedStandard(periodType37);
        org.joda.time.Period period44 = period5.withSeconds(40);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType12, chronology13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period14.toDurationFrom(readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant17, readableDuration18);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period23 = period21.minusYears((int) (byte) -1);
        org.joda.time.Period period24 = period19.withFields((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period26 = period21.withMinutes((int) (short) -1);
        org.joda.time.Period period27 = period14.plus((org.joda.time.ReadablePeriod) period26);
        org.joda.time.PeriodType periodType28 = period27.getPeriodType();
        org.joda.time.Period period29 = new org.joda.time.Period((int) '4', (int) 'a', (int) (short) -1, 100, 100, 10, (int) '4', 10, periodType28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period30 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(periodType28);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.plusYears((int) '#');
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) 10, (int) (byte) 100, (int) '#', (int) (byte) 10);
        org.joda.time.Period period9 = period3.plus((org.joda.time.ReadablePeriod) period8);
        int int10 = period8.getMillis();
        org.joda.time.Hours hours11 = period8.toStandardHours();
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableDuration20, readableInstant21, periodType22);
        org.joda.time.PeriodType periodType24 = period23.getPeriodType();
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant18, readableInstant19, periodType24);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) (byte) -1, (long) (byte) 1, periodType24, chronology26);
        org.joda.time.Period period28 = new org.joda.time.Period((long) (short) 1, (long) (short) -1, periodType24);
        org.joda.time.Period period29 = new org.joda.time.Period(1L, (long) 10, periodType24);
        org.joda.time.Period period30 = new org.joda.time.Period((java.lang.Object) hours11, periodType24);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(periodType24);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
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
        org.joda.time.Period period12 = period10.minusMonths(10);
        org.joda.time.Period period14 = period10.minusDays(0);
        org.joda.time.Period period16 = period10.withSeconds((int) (byte) 0);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableDuration27, readableInstant28, periodType29);
        org.joda.time.PeriodType periodType31 = period30.getPeriodType();
        org.joda.time.Period period32 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType31);
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant17, readableInstant18, periodType31);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((java.lang.Object) period10, periodType31, chronology34);
        org.joda.time.Period period37 = period35.withHours((int) (byte) -1);
        int int38 = period37.size();
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 8 + "'", int38 == 8);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(11);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.Period period6 = period4.plusHours(100);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationFrom(readableInstant7);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant3, (org.joda.time.ReadableDuration) duration8, periodType9);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration8, periodType11);
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration8);
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration8);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration8, readableInstant15);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
        org.joda.time.Period period87 = period85.plusHours((int) '4');
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
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) ' ', 0, (int) (short) 100, 100, (int) (byte) 10, 100, (-1), (int) (short) 100, periodType8);
        org.joda.time.Period period11 = period9.minusYears((int) '#');
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) (short) 1, chronology13);
        org.joda.time.Period period18 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period20 = period18.minusYears((int) (byte) -1);
        org.joda.time.Duration duration21 = period18.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableDuration25, readableInstant26, periodType27);
        org.joda.time.PeriodType periodType29 = period28.getPeriodType();
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant23, readableInstant24, periodType29);
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration21, readableInstant22, periodType29);
        org.joda.time.Period period32 = new org.joda.time.Period(1L, (long) (short) 10, periodType29);
        org.joda.time.Period period33 = period14.withPeriodType(periodType29);
        org.joda.time.Period period35 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period36 = period35.negated();
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period(readableDuration38, readableInstant39, periodType40);
        org.joda.time.PeriodType periodType42 = period41.getPeriodType();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((long) (byte) 10, periodType42, chronology43);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((java.lang.Object) period36, periodType42, chronology45);
        org.joda.time.Period period47 = period33.minus((org.joda.time.ReadablePeriod) period36);
        org.joda.time.Period period48 = period9.withFields((org.joda.time.ReadablePeriod) period36);
        int int49 = period48.getSeconds();
        int int50 = period48.getMinutes();
        org.joda.time.Hours hours51 = period48.toStandardHours();
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(hours51);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.joda.time.Period period1 = org.joda.time.Period.millis((-1));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableDuration20, readableInstant21, periodType22);
        org.joda.time.PeriodType periodType24 = period23.getPeriodType();
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant18, readableInstant19, periodType24);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) (byte) -1, (long) (byte) 1, periodType24, chronology26);
        org.joda.time.Period period28 = new org.joda.time.Period((long) 10, periodType24);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) (-1), (long) '#', periodType24, chronology29);
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant11, readableInstant12, periodType24);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) 10, periodType24, chronology32);
        org.joda.time.Period period34 = new org.joda.time.Period(10, 0, 100, (int) (byte) -1, 32, (int) (byte) -1, (int) (byte) 0, 100, periodType24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period35 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType24);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
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
        org.joda.time.Period period20 = period18.plusMonths(0);
        org.joda.time.Duration duration21 = period18.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration21, readableInstant22);
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
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration21);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.Period period8 = period4.plusHours((-1));
        int int9 = period8.getSeconds();
        org.joda.time.Period period10 = period3.withFields((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period12 = period10.plusMillis((int) '#');
        org.joda.time.Weeks weeks13 = period12.toStandardWeeks();
        int int14 = period12.getSeconds();
        int int15 = period12.getYears();
        int int16 = period12.size();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-35), chronology1);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
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
        org.joda.time.Period period12 = period10.minusMonths(10);
        org.joda.time.Period period14 = period10.minusDays(0);
        org.joda.time.Period period16 = period10.withSeconds((int) (byte) 0);
        org.joda.time.Minutes minutes17 = period10.toStandardMinutes();
        org.joda.time.Period period19 = period10.minusMillis((-10));
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("P-8Y-1MT-1M", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.joda.time.Period period1 = org.joda.time.Period.months(32);
        org.joda.time.Period period2 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationTo(readableInstant3);
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = period2.get(durationFieldType5);
        org.joda.time.Period period8 = period2.plusHours((int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType10 = period2.getFieldType((int) (byte) 1);
        org.joda.time.Period period12 = period1.withField(durationFieldType10, (int) (byte) 1);
        int int13 = period1.getDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.joda.time.Period period4 = new org.joda.time.Period((-10), (int) (short) 100, (int) (byte) 1, (-10));
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (short) 0);
        org.joda.time.Period period3 = period1.withDays((int) ' ');
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period1.toDurationFrom(readableInstant4);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
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
        org.joda.time.DurationFieldType[] durationFieldTypeArray25 = period23.getFieldTypes();
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
        org.junit.Assert.assertNotNull(durationFieldTypeArray25);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.joda.time.Period period2 = new org.joda.time.Period(0L, 0L);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        org.joda.time.Period period6 = period4.withMillis((int) (short) 10);
        org.joda.time.Period period8 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period10 = period8.withMillis((int) (byte) 100);
        org.joda.time.Period period12 = period8.withMonths((int) ' ');
        boolean boolean13 = period4.equals((java.lang.Object) period8);
        int int14 = period8.getHours();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("P97D", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.joda.time.Period period8 = new org.joda.time.Period(0, 1, 40, (-100), (int) (byte) 1, 8, (int) (byte) 10, 8);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.joda.time.Period period2 = new org.joda.time.Period(0L, (long) (byte) 100);
        org.joda.time.Minutes minutes3 = period2.toStandardMinutes();
        org.joda.time.Period period5 = period2.minusHours(35);
        org.joda.time.Period period7 = period5.withMinutes((-965));
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableDuration5, readableInstant6, periodType7);
        org.joda.time.PeriodType periodType9 = period8.getPeriodType();
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) (byte) -1, (long) (byte) 1, periodType9, chronology11);
        org.joda.time.Period period13 = new org.joda.time.Period((long) 10, periodType9);
        int int14 = period13.getMonths();
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationTo(readableInstant17);
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant15, (org.joda.time.ReadableDuration) duration18);
        int int20 = period19.size();
        org.joda.time.Period period22 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period24 = period22.withMillis((int) (byte) 100);
        org.joda.time.Period period25 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period25.toDurationTo(readableInstant26);
        org.joda.time.Period period29 = period25.plusHours((-1));
        int int30 = period29.getSeconds();
        org.joda.time.Period period31 = period24.withFields((org.joda.time.ReadablePeriod) period29);
        org.joda.time.Period period33 = period29.withMinutes((int) (short) 0);
        org.joda.time.Period period35 = period29.withMinutes(10);
        org.joda.time.Period period37 = period29.minusHours(100);
        org.joda.time.Period period38 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks39 = period38.toStandardWeeks();
        org.joda.time.Period period40 = period38.negated();
        org.joda.time.Period period42 = org.joda.time.Period.seconds(0);
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType51);
        org.joda.time.Period period54 = period52.withMillis((int) (short) 10);
        org.joda.time.Period period56 = period52.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType58 = period52.getFieldType((int) (short) 1);
        int int59 = period42.indexOf(durationFieldType58);
        org.joda.time.Period period61 = period40.withFieldAdded(durationFieldType58, (int) 'a');
        org.joda.time.Period period63 = period29.withFieldAdded(durationFieldType58, 0);
        org.joda.time.Period period65 = period19.withField(durationFieldType58, (int) (byte) 1);
        org.joda.time.Period period67 = period13.withFieldAdded(durationFieldType58, (int) (byte) 10);
        org.joda.time.Period period69 = period13.plusYears((int) (byte) 0);
        org.joda.time.PeriodType periodType78 = null;
        org.joda.time.Period period79 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType78);
        org.joda.time.Period period81 = period79.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType82 = null;
        org.joda.time.Period period83 = new org.joda.time.Period((java.lang.Object) period81, periodType82);
        org.joda.time.Period period85 = period81.withMonths(0);
        org.joda.time.Period period87 = period85.minusWeeks((int) (short) -1);
        org.joda.time.Period period89 = period87.withHours((int) ' ');
        org.joda.time.Period period90 = period69.withFields((org.joda.time.ReadablePeriod) period89);
        org.joda.time.PeriodType periodType91 = period90.getPeriodType();
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(weeks39);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(durationFieldType58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertNotNull(period90);
        org.junit.Assert.assertNotNull(periodType91);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period11, periodType12);
        org.joda.time.Period period15 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period17 = period15.withMillis((int) (byte) 100);
        org.joda.time.Period period19 = period15.withMonths((int) ' ');
        org.joda.time.Period period21 = period15.withHours(100);
        org.joda.time.Period period22 = period11.withFields((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Period period24 = period22.withWeeks((int) (short) 10);
        org.joda.time.Period period26 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period28 = period26.withMillis((int) (byte) 100);
        org.joda.time.Period period29 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = period29.toDurationTo(readableInstant30);
        org.joda.time.Period period33 = period29.plusHours((-1));
        int int34 = period33.getSeconds();
        org.joda.time.Period period35 = period28.withFields((org.joda.time.ReadablePeriod) period33);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Duration duration37 = period33.toDurationTo(readableInstant36);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((long) 'a', chronology40);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Duration duration43 = period41.toDurationTo(readableInstant42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableDuration46, readableInstant47, periodType48);
        org.joda.time.PeriodType periodType50 = period49.getPeriodType();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period((long) (byte) 10, periodType50, chronology51);
        org.joda.time.Period period53 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration43, readableInstant44, periodType50);
        org.joda.time.Period period54 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration37, readableInstant38, periodType50);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period((java.lang.Object) period24, periodType50, chronology55);
        org.joda.time.Period period58 = period56.plusMinutes(1);
        org.joda.time.Duration duration59 = period56.toStandardDuration();
        org.joda.time.DurationFieldType[] durationFieldTypeArray60 = period56.getFieldTypes();
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertNotNull(durationFieldTypeArray60);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.plusYears((int) (short) -1);
        org.joda.time.Period period8 = period4.plusMillis((int) ' ');
        org.joda.time.Period period10 = period4.minusDays(1);
        org.joda.time.Minutes minutes11 = period4.toStandardMinutes();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(minutes11);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
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
        org.joda.time.Period period19 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period21 = period19.withMillis((int) (byte) 100);
        org.joda.time.Period period22 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationTo(readableInstant23);
        org.joda.time.Period period26 = period22.plusHours((-1));
        int int27 = period26.getSeconds();
        org.joda.time.Period period28 = period21.withFields((org.joda.time.ReadablePeriod) period26);
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType37);
        org.joda.time.Period period40 = period38.withMillis((int) (short) 10);
        org.joda.time.Period period42 = period38.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType44 = period38.getFieldType((int) (short) 1);
        org.joda.time.Period period46 = period21.withField(durationFieldType44, 100);
        boolean boolean47 = period4.isSupported(durationFieldType44);
        int int48 = period4.getMinutes();
        org.joda.time.Period period50 = org.joda.time.Period.months(32);
        org.joda.time.Period period51 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Duration duration53 = period51.toDurationTo(readableInstant52);
        org.joda.time.DurationFieldType durationFieldType54 = null;
        int int55 = period51.get(durationFieldType54);
        org.joda.time.Period period57 = period51.plusHours((int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType59 = period51.getFieldType((int) (byte) 1);
        org.joda.time.Period period61 = period50.withField(durationFieldType59, (int) (byte) 1);
        int int62 = period4.get(durationFieldType59);
        // The following exception was thrown during execution in test generation
        try {
            int int64 = period4.getValue(1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(durationFieldType59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        org.joda.time.Weeks weeks5 = period4.toStandardWeeks();
        org.joda.time.Period period6 = period4.toPeriod();
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((java.lang.Object) period6, periodType7);
        org.joda.time.Period period9 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationTo(readableInstant10);
        org.joda.time.Period period13 = period9.plusHours((-1));
        org.joda.time.Period period15 = period13.withMillis((int) (short) 1);
        org.joda.time.Period period16 = new org.joda.time.Period((java.lang.Object) period13);
        org.joda.time.Duration duration17 = period13.toStandardDuration();
        org.joda.time.Period period18 = period13.toPeriod();
        org.joda.time.Period period20 = period18.plusYears(0);
        int int21 = period18.size();
        org.joda.time.Period period23 = period18.minusDays((int) (byte) 10);
        boolean boolean24 = period6.equals((java.lang.Object) period23);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
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
        org.joda.time.Period period22 = period21.normalizedStandard();
        org.joda.time.Period period24 = period22.withMillis((int) (short) 1);
        org.joda.time.Period period26 = period24.minusSeconds(1000);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 10, (long) (short) 10, chronology2);
        org.joda.time.Duration duration4 = period3.toStandardDuration();
        org.junit.Assert.assertNotNull(duration4);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 0, (long) (-10), chronology2);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period11, periodType12);
        org.joda.time.Period period15 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period17 = period15.withMillis((int) (byte) 100);
        org.joda.time.Period period19 = period15.withMonths((int) ' ');
        org.joda.time.Period period21 = period15.withHours(100);
        org.joda.time.Period period22 = period11.withFields((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Period period24 = period22.plusMonths(100);
        int int25 = period22.getMonths();
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (short) 1, 0, (int) ' ', (-1));
        org.joda.time.Period period6 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period7 = period6.negated();
        org.joda.time.Period period9 = period6.minusDays((-1));
        org.joda.time.Period period11 = period9.plusWeeks(0);
        org.joda.time.Period period13 = period11.minusMinutes((int) (short) 10);
        org.joda.time.Period period14 = period4.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period16 = period14.withHours((-965));
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.joda.time.Period period1 = org.joda.time.Period.weeks(97);
        org.joda.time.MutablePeriod mutablePeriod2 = period1.toMutablePeriod();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 35, (-1L), chronology2);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period11, periodType12);
        org.joda.time.Period period15 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period17 = period15.withMillis((int) (byte) 100);
        org.joda.time.Period period19 = period15.withMonths((int) ' ');
        org.joda.time.Period period21 = period15.withHours(100);
        org.joda.time.Period period22 = period11.withFields((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Period period24 = period22.withWeeks((int) (short) 10);
        org.joda.time.Period period26 = period24.withDays(0);
        org.joda.time.Seconds seconds27 = period26.toStandardSeconds();
        org.joda.time.Period period29 = period26.plusHours((-35));
        org.joda.time.Period period31 = period26.plusMinutes((-1));
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (byte) -1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableDuration3, readableInstant4, periodType5);
        org.joda.time.PeriodType periodType7 = period6.getPeriodType();
        org.joda.time.Period period8 = new org.joda.time.Period((long) 97, periodType7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((java.lang.Object) period1, periodType7, chronology9);
        org.joda.time.DurationFieldType[] durationFieldTypeArray11 = period1.getFieldTypes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(durationFieldTypeArray11);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.joda.time.Period period1 = org.joda.time.Period.parse("P100D");
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableDuration0, readableInstant1);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        org.joda.time.Period period9 = period7.withSeconds((int) (short) 1);
        int int11 = period9.getValue(1);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.plusYears((int) (short) -1);
        org.joda.time.Period period8 = period6.minusWeeks((int) (short) 100);
        org.joda.time.Period period10 = period6.withDays((int) (byte) 0);
        org.joda.time.Period period12 = period10.withWeeks((int) (byte) 1);
        org.joda.time.Period period14 = period10.minusMillis((int) (byte) 0);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withDays((int) '4');
        java.lang.Class<?> wildcardClass8 = period7.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks1 = period0.toStandardWeeks();
        org.joda.time.Period period3 = period0.minusSeconds((int) (byte) 1);
        int[] intArray4 = period3.getValues();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, (-1), 0 });
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period2 = period0.plusHours(100);
        org.joda.time.Period period4 = period2.minusMillis((int) '4');
        org.joda.time.Minutes minutes5 = period2.toStandardMinutes();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (-965));
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        int int8 = period7.getMinutes();
        org.joda.time.Period period10 = period7.withMinutes(0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((java.lang.Object) period7, chronology11);
        int int14 = period7.getValue((int) (byte) 1);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.plusYears((int) (short) -1);
        org.joda.time.Period period8 = period6.minusWeeks((int) (short) 100);
        org.joda.time.Period period10 = period6.withDays((int) (byte) 0);
        org.joda.time.Period period12 = period10.withWeeks((int) (byte) 1);
        org.joda.time.Period period14 = period12.plusMonths(4);
        org.joda.time.Period period16 = period12.minusMillis((int) (byte) 100);
        org.joda.time.Period period18 = period12.plusDays((-1));
        int int19 = period12.getMillis();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Period period5 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period7 = period5.withMillis((int) (byte) 100);
        org.joda.time.Period period8 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period8.toDurationTo(readableInstant9);
        org.joda.time.Period period12 = period8.plusHours((-1));
        int int13 = period12.getSeconds();
        org.joda.time.Period period14 = period7.withFields((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Period period16 = period12.withMinutes((int) (short) 0);
        org.joda.time.Period period18 = period12.withMinutes(10);
        int int19 = period18.getMonths();
        int int20 = period18.getSeconds();
        org.joda.time.Period period21 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = period21.toDurationTo(readableInstant22);
        org.joda.time.DurationFieldType durationFieldType24 = null;
        int int25 = period21.get(durationFieldType24);
        org.joda.time.Period period26 = period18.plus((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period27 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period27.toDurationTo(readableInstant28);
        org.joda.time.DurationFieldType durationFieldType30 = null;
        int int31 = period27.get(durationFieldType30);
        org.joda.time.PeriodType periodType32 = period27.getPeriodType();
        org.joda.time.Period period33 = period18.withPeriodType(periodType32);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((long) (byte) 1, (long) (short) -1, periodType32, chronology34);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period36 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(period33);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableDuration0, readableInstant1, periodType2);
        org.joda.time.PeriodType periodType4 = period3.getPeriodType();
        org.joda.time.Period period6 = period3.plusMonths(8);
        org.joda.time.Period period8 = period6.plusYears((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days9 = period8.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMinutes((int) (byte) 0);
        org.joda.time.MutablePeriod mutablePeriod6 = period5.toMutablePeriod();
        org.joda.time.Period period7 = period5.normalizedStandard();
        int int8 = period5.getMonths();
        org.joda.time.Period period10 = period5.withDays((int) (short) 100);
        org.joda.time.Period period11 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationTo(readableInstant12);
        org.joda.time.Period period15 = period11.plusHours((-1));
        org.joda.time.Period period17 = period15.plusYears((int) (short) -1);
        org.joda.time.Period period19 = period15.plusMillis((int) ' ');
        org.joda.time.MutablePeriod mutablePeriod20 = period19.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant21, readableDuration22);
        org.joda.time.Period period25 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period27 = period25.minusYears((int) (byte) -1);
        org.joda.time.Period period28 = period23.withFields((org.joda.time.ReadablePeriod) period25);
        int[] intArray29 = period23.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter30 = null;
        java.lang.String str31 = period23.toString(periodFormatter30);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType40);
        org.joda.time.Period period43 = period41.withMillis((int) (short) 10);
        org.joda.time.Period period45 = period41.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType47 = period41.getFieldType((int) (short) 1);
        org.joda.time.Period period49 = period23.withField(durationFieldType47, (int) (short) 10);
        int int50 = period19.get(durationFieldType47);
        boolean boolean51 = period10.isSupported(durationFieldType47);
        org.joda.time.Period period53 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period55 = period53.withMillis((int) (byte) 100);
        org.joda.time.Period period57 = period55.plusSeconds((int) ' ');
        org.joda.time.Period period59 = period55.minusWeeks(10);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.ReadableDuration readableDuration61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period(readableInstant60, readableDuration61);
        org.joda.time.Period period64 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period66 = period64.minusYears((int) (byte) -1);
        org.joda.time.Period period67 = period62.withFields((org.joda.time.ReadablePeriod) period64);
        int[] intArray68 = period62.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter69 = null;
        java.lang.String str70 = period62.toString(periodFormatter69);
        org.joda.time.PeriodType periodType79 = null;
        org.joda.time.Period period80 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType79);
        org.joda.time.Period period82 = period80.withMillis((int) (short) 10);
        org.joda.time.Period period84 = period80.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType86 = period80.getFieldType((int) (short) 1);
        org.joda.time.Period period88 = period62.withField(durationFieldType86, (int) (short) 10);
        int int89 = period59.indexOf(durationFieldType86);
        int int90 = period10.get(durationFieldType86);
        org.joda.time.Period period92 = period10.minusHours((int) (byte) 10);
        org.joda.time.Seconds seconds93 = period92.toStandardSeconds();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(mutablePeriod20);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PT0S" + "'", str31, "PT0S");
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(durationFieldType47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertArrayEquals(intArray68, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "PT0S" + "'", str70, "PT0S");
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(durationFieldType86);
        org.junit.Assert.assertNotNull(period88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1 + "'", int89 == 1);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNotNull(period92);
        org.junit.Assert.assertNotNull(seconds93);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 'a', chronology1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationTo(readableInstant3);
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = period2.indexOf(durationFieldType5);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.joda.time.Period period1 = org.joda.time.Period.days(1);
        org.joda.time.Period period3 = period1.plusDays((int) (short) 100);
        org.joda.time.Period period5 = period3.plusHours((int) (byte) 1);
        org.joda.time.Period period6 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks7 = period6.toStandardWeeks();
        org.joda.time.Period period9 = period6.minusSeconds((int) (byte) 1);
        org.joda.time.Period period10 = period5.minus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period12 = period10.withMillis((int) (short) -1);
        org.joda.time.Period period13 = period10.toPeriod();
        org.joda.time.Period period15 = period10.minusYears((int) (byte) 100);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationTo(readableInstant4);
        boolean boolean6 = period2.equals((java.lang.Object) duration5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration5, readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration5, readableInstant9);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.joda.time.Period period4 = new org.joda.time.Period((int) 'a', (int) (short) 100, 1, (int) '4');
        org.joda.time.Period period6 = period4.minusMillis((int) (short) 0);
        org.joda.time.Period period8 = period6.withMillis((-965));
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        int int5 = period4.getSeconds();
        org.joda.time.Period period7 = period4.withSeconds(10);
        int int8 = period7.getSeconds();
        org.joda.time.Period period10 = period7.plusMonths(1);
        org.joda.time.Period period12 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period14 = period12.withMillis((int) (byte) 100);
        org.joda.time.Period period15 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period15.toDurationTo(readableInstant16);
        org.joda.time.Period period19 = period15.plusHours((-1));
        int int20 = period19.getSeconds();
        org.joda.time.Period period21 = period14.withFields((org.joda.time.ReadablePeriod) period19);
        org.joda.time.Period period23 = period21.plusMillis((int) '#');
        org.joda.time.Period period28 = new org.joda.time.Period((int) (byte) 10, (int) (byte) 100, (int) '#', (int) (byte) 10);
        org.joda.time.Period period29 = period21.plus((org.joda.time.ReadablePeriod) period28);
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((int) ' ', 0, (int) (short) 100, 100, (int) (byte) 10, 100, (-1), (int) (short) 100, periodType38);
        org.joda.time.Period period41 = period39.minusYears((int) '#');
        org.joda.time.Period period43 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period45 = period43.withMillis((int) (byte) 100);
        org.joda.time.Period period46 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Duration duration48 = period46.toDurationTo(readableInstant47);
        org.joda.time.Period period50 = period46.plusHours((-1));
        int int51 = period50.getSeconds();
        org.joda.time.Period period52 = period45.withFields((org.joda.time.ReadablePeriod) period50);
        org.joda.time.PeriodType periodType61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType61);
        org.joda.time.Period period64 = period62.withMillis((int) (short) 10);
        org.joda.time.Period period66 = period62.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType68 = period62.getFieldType((int) (short) 1);
        org.joda.time.Period period70 = period45.withField(durationFieldType68, 100);
        int int71 = period39.indexOf(durationFieldType68);
        int int72 = period28.get(durationFieldType68);
        int int73 = period10.indexOf(durationFieldType68);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds74 = period10.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Seconds as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(durationFieldType68);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        org.joda.time.Hours hours5 = period4.toStandardHours();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period4.toDurationTo(readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration7, readableInstant8);
        org.joda.time.Period period11 = period9.minusMonths(11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) (short) -1, 100L, chronology14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period15.toDurationTo(readableInstant16);
        org.joda.time.Period period19 = period15.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) 100, chronology21);
        org.joda.time.Period period24 = period22.withMinutes((int) (short) 0);
        org.joda.time.DurationFieldType durationFieldType26 = period24.getFieldType((int) (byte) 1);
        org.joda.time.Period period28 = period19.withField(durationFieldType26, (int) '4');
        boolean boolean29 = period9.equals((java.lang.Object) '4');
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = period0.get(durationFieldType3);
        org.joda.time.Period period6 = period0.withMonths((int) ' ');
        int int7 = period6.getHours();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 8);
        org.joda.time.Period period3 = period1.plusWeeks((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableDuration4, readableInstant5, periodType6);
        org.joda.time.PeriodType periodType8 = period7.getPeriodType();
        org.joda.time.Period period10 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period12 = period10.withMillis((int) (byte) 100);
        org.joda.time.Period period13 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period13.toDurationTo(readableInstant14);
        org.joda.time.Period period17 = period13.plusHours((-1));
        int int18 = period17.getSeconds();
        org.joda.time.Period period19 = period12.withFields((org.joda.time.ReadablePeriod) period17);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableDuration22, readableInstant23, periodType24);
        org.joda.time.PeriodType periodType26 = period25.getPeriodType();
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant20, readableInstant21, periodType26);
        org.joda.time.Period period28 = period12.normalizedStandard(periodType26);
        org.joda.time.Period period29 = period7.normalizedStandard(periodType26);
        org.joda.time.Period period30 = period3.normalizedStandard(periodType26);
        org.joda.time.Period period32 = period3.withDays((int) (byte) 100);
        org.joda.time.Weeks weeks33 = period32.toStandardWeeks();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(weeks33);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableDuration0, readableInstant1, periodType2);
        org.joda.time.PeriodType periodType4 = period3.getPeriodType();
        org.joda.time.Duration duration5 = period3.toStandardDuration();
        org.joda.time.Period period7 = period3.minusYears(35);
        org.joda.time.Period period9 = period7.minusMillis((int) (byte) -1);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 0);
        org.joda.time.Period period3 = period1.withSeconds((-1));
        org.joda.time.format.PeriodFormatter periodFormatter4 = null;
        java.lang.String str5 = period1.toString(periodFormatter4);
        org.joda.time.DurationFieldType[] durationFieldTypeArray6 = period1.getFieldTypes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT0S" + "'", str5, "PT0S");
        org.junit.Assert.assertNotNull(durationFieldTypeArray6);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.withMillis((int) (short) 1);
        org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) period4);
        org.joda.time.Duration duration8 = period4.toStandardDuration();
        org.joda.time.Period period9 = period4.toPeriod();
        org.joda.time.Period period11 = period9.plusYears(0);
        int int12 = period9.size();
        org.joda.time.Period period14 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period16 = period14.withMillis((int) (byte) 100);
        org.joda.time.Period period18 = period14.withMonths((int) ' ');
        org.joda.time.Period period20 = period14.withHours(100);
        java.lang.String str21 = period20.toString();
        java.lang.String str22 = period20.toString();
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant23, readableDuration24);
        org.joda.time.Period period27 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period29 = period27.minusYears((int) (byte) -1);
        org.joda.time.Period period30 = period25.withFields((org.joda.time.ReadablePeriod) period27);
        int[] intArray31 = period25.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter32 = null;
        java.lang.String str33 = period25.toString(periodFormatter32);
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType42);
        org.joda.time.Period period45 = period43.withMillis((int) (short) 10);
        org.joda.time.Period period47 = period43.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType49 = period43.getFieldType((int) (short) 1);
        org.joda.time.Period period51 = period25.withField(durationFieldType49, (int) (short) 10);
        org.joda.time.MutablePeriod mutablePeriod52 = period51.toMutablePeriod();
        org.joda.time.Period period54 = period51.minusYears(100);
        org.joda.time.Period period56 = org.joda.time.Period.years((-1));
        org.joda.time.Period period58 = period56.withHours(0);
        org.joda.time.Period period60 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period62 = period60.withMillis((int) (byte) 100);
        org.joda.time.Period period63 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.Duration duration65 = period63.toDurationTo(readableInstant64);
        org.joda.time.Period period67 = period63.plusHours((-1));
        int int68 = period67.getSeconds();
        org.joda.time.Period period69 = period62.withFields((org.joda.time.ReadablePeriod) period67);
        org.joda.time.PeriodType periodType78 = null;
        org.joda.time.Period period79 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType78);
        org.joda.time.Period period81 = period79.withMillis((int) (short) 10);
        org.joda.time.Period period83 = period79.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType85 = period79.getFieldType((int) (short) 1);
        org.joda.time.Period period87 = period62.withField(durationFieldType85, 100);
        boolean boolean88 = period56.isSupported(durationFieldType85);
        org.joda.time.Period period90 = period51.withFieldAdded(durationFieldType85, 0);
        org.joda.time.Period period92 = period51.minusMinutes((int) (byte) -1);
        org.joda.time.Period period94 = period51.minusYears((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType96 = period94.getFieldType(4);
        int int97 = period20.indexOf(durationFieldType96);
        int int98 = period9.indexOf(durationFieldType96);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PT100H" + "'", str21, "PT100H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PT100H" + "'", str22, "PT100H");
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PT0S" + "'", str33, "PT0S");
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(durationFieldType49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(mutablePeriod52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(durationFieldType85);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(period90);
        org.junit.Assert.assertNotNull(period92);
        org.junit.Assert.assertNotNull(period94);
        org.junit.Assert.assertNotNull(durationFieldType96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 4 + "'", int97 == 4);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 4 + "'", int98 == 4);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (byte) 10);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.joda.time.Period period4 = new org.joda.time.Period((int) 'a', (int) (short) -1, (-35), (int) (byte) 100);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) '#');
        org.joda.time.Seconds seconds2 = period1.toStandardSeconds();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(seconds2);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.joda.time.Period period2 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period4 = period2.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationTo(readableInstant6);
        org.joda.time.Period period9 = period5.plusHours((-1));
        int int10 = period9.getSeconds();
        org.joda.time.Period period11 = period4.withFields((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period13 = period11.plusMillis((int) '#');
        org.joda.time.Period period15 = period13.plusMinutes((int) (short) -1);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType18, chronology19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = period20.toDurationFrom(readableInstant21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant23, readableDuration24);
        org.joda.time.Period period27 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period29 = period27.minusYears((int) (byte) -1);
        org.joda.time.Period period30 = period25.withFields((org.joda.time.ReadablePeriod) period27);
        org.joda.time.Period period32 = period27.withMinutes((int) (short) -1);
        org.joda.time.Period period33 = period20.plus((org.joda.time.ReadablePeriod) period32);
        org.joda.time.Period period34 = period15.plus((org.joda.time.ReadablePeriod) period33);
        org.joda.time.Period period36 = period15.withWeeks(100);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Period period41 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period43 = period41.minusYears((int) (byte) -1);
        org.joda.time.Duration duration44 = period41.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period(readableDuration48, readableInstant49, periodType50);
        org.joda.time.PeriodType periodType52 = period51.getPeriodType();
        org.joda.time.Period period53 = new org.joda.time.Period(readableInstant46, readableInstant47, periodType52);
        org.joda.time.Period period54 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration44, readableInstant45, periodType52);
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant38, readableInstant39, periodType52);
        org.joda.time.Period period56 = new org.joda.time.Period((long) ' ', periodType52);
        org.joda.time.Period period57 = period15.withPeriodType(periodType52);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period((long) 32, periodType52, chronology58);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(period57);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) (short) 0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (byte) 0);
        org.joda.time.Period period3 = period1.plusMonths((int) (short) 100);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) (short) 1);
        org.joda.time.Period period3 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period5 = period3.withMillis((int) (byte) 100);
        org.joda.time.Period period6 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationTo(readableInstant7);
        org.joda.time.Period period10 = period6.plusHours((-1));
        int int11 = period10.getSeconds();
        org.joda.time.Period period12 = period5.withFields((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Period period14 = period12.plusMillis((int) '#');
        org.joda.time.Period period16 = period14.plusMinutes((int) (short) -1);
        org.joda.time.Seconds seconds17 = period14.toStandardSeconds();
        org.joda.time.Period period19 = period14.minusMinutes((int) (byte) 0);
        int int20 = period19.getYears();
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType23, chronology24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period25.toDurationFrom(readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant28, readableDuration29);
        org.joda.time.Period period32 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period34 = period32.minusYears((int) (byte) -1);
        org.joda.time.Period period35 = period30.withFields((org.joda.time.ReadablePeriod) period32);
        org.joda.time.Period period37 = period32.withMinutes((int) (short) -1);
        org.joda.time.Period period38 = period25.plus((org.joda.time.ReadablePeriod) period37);
        org.joda.time.Period period40 = period38.withMinutes((int) (byte) 1);
        org.joda.time.Period period42 = period40.minusDays((int) '#');
        org.joda.time.Period period44 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period46 = period44.minusMillis((int) (short) 0);
        org.joda.time.Period period48 = org.joda.time.Period.minutes((int) (byte) 0);
        org.joda.time.Period period50 = period48.withSeconds((-1));
        org.joda.time.Period period51 = period46.minus((org.joda.time.ReadablePeriod) period50);
        org.joda.time.Duration duration52 = period46.toStandardDuration();
        org.joda.time.Period period53 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Duration duration55 = period53.toDurationTo(readableInstant54);
        org.joda.time.Period period57 = period53.plusHours((-1));
        int int58 = period57.getSeconds();
        org.joda.time.Period period60 = period57.withSeconds(10);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.ReadableDuration readableDuration62 = null;
        org.joda.time.Period period63 = new org.joda.time.Period(readableInstant61, readableDuration62);
        org.joda.time.Period period65 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period67 = period65.minusYears((int) (byte) -1);
        org.joda.time.Period period68 = period63.withFields((org.joda.time.ReadablePeriod) period65);
        int[] intArray69 = period63.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter70 = null;
        java.lang.String str71 = period63.toString(periodFormatter70);
        org.joda.time.PeriodType periodType80 = null;
        org.joda.time.Period period81 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType80);
        org.joda.time.Period period83 = period81.withMillis((int) (short) 10);
        org.joda.time.Period period85 = period81.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType87 = period81.getFieldType((int) (short) 1);
        org.joda.time.Period period89 = period63.withField(durationFieldType87, (int) (short) 10);
        org.joda.time.Period period91 = period60.withFieldAdded(durationFieldType87, (int) (byte) 10);
        int int92 = period46.indexOf(durationFieldType87);
        int int93 = period40.indexOf(durationFieldType87);
        int int94 = period19.get(durationFieldType87);
        int int95 = period1.indexOf(durationFieldType87);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertArrayEquals(intArray69, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "PT0S" + "'", str71, "PT0S");
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertNotNull(durationFieldType87);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertNotNull(period91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 1 + "'", int93 == 1);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 1 + "'", int95 == 1);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period2 = period1.negated();
        org.joda.time.Period period4 = period1.minusDays((-1));
        int int5 = period4.size();
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Period period18 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = period18.toDurationTo(readableInstant19);
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant17, (org.joda.time.ReadableDuration) duration20);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant16, (org.joda.time.ReadableDuration) duration20, periodType22);
        org.joda.time.Period period25 = period23.plusWeeks(0);
        org.joda.time.Period period27 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period28 = period27.negated();
        org.joda.time.Period period29 = period23.withFields((org.joda.time.ReadablePeriod) period28);
        int int30 = period29.getWeeks();
        org.joda.time.PeriodType periodType31 = period29.getPeriodType();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) 97, (long) (short) -1, periodType31, chronology32);
        org.joda.time.Period period34 = new org.joda.time.Period((int) '#', 40, (-100), (-1), (int) (byte) 0, (int) (short) 0, 11, 32, periodType31);
        org.joda.time.Period period35 = period4.normalizedStandard(periodType31);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(period35);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 0);
        boolean boolean5 = period0.equals((java.lang.Object) period4);
        org.joda.time.Period period6 = period4.negated();
        org.joda.time.DurationFieldType durationFieldType8 = period6.getFieldType((int) (short) 1);
        org.joda.time.format.PeriodFormatter periodFormatter9 = null;
        java.lang.String str10 = period6.toString(periodFormatter9);
        java.lang.String str11 = period6.toString();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT0S" + "'", str10, "PT0S");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT0S" + "'", str11, "PT0S");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) (byte) -1);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT35H");
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) ' ');
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("P-100W", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.Period period8 = period4.plusHours((-1));
        int int9 = period8.getSeconds();
        org.joda.time.Period period10 = period3.withFields((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Hours hours11 = period8.toStandardHours();
        org.joda.time.Period period12 = new org.joda.time.Period((java.lang.Object) hours11);
        org.joda.time.Period period15 = new org.joda.time.Period((long) (short) 10, (long) (short) 0);
        org.joda.time.Period period16 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationTo(readableInstant17);
        org.joda.time.Period period20 = period16.plusHours((-1));
        int int21 = period20.getSeconds();
        org.joda.time.Period period23 = period20.withSeconds(10);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant24, readableDuration25);
        org.joda.time.Period period28 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period30 = period28.minusYears((int) (byte) -1);
        org.joda.time.Period period31 = period26.withFields((org.joda.time.ReadablePeriod) period28);
        int[] intArray32 = period26.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter33 = null;
        java.lang.String str34 = period26.toString(periodFormatter33);
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType43);
        org.joda.time.Period period46 = period44.withMillis((int) (short) 10);
        org.joda.time.Period period48 = period44.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType50 = period44.getFieldType((int) (short) 1);
        org.joda.time.Period period52 = period26.withField(durationFieldType50, (int) (short) 10);
        org.joda.time.Period period54 = period23.withFieldAdded(durationFieldType50, (int) (byte) 10);
        int int55 = period15.indexOf(durationFieldType50);
        org.joda.time.Period period57 = period12.withFieldAdded(durationFieldType50, 0);
        org.joda.time.Period period59 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period61 = period59.plusYears((int) '#');
        org.joda.time.format.PeriodFormatter periodFormatter62 = null;
        java.lang.String str63 = period59.toString(periodFormatter62);
        int int64 = period59.getWeeks();
        org.joda.time.PeriodType periodType65 = period59.getPeriodType();
        org.joda.time.Period period67 = period59.withDays(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period68 = period12.plus((org.joda.time.ReadablePeriod) period59);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PT0S" + "'", str34, "PT0S");
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(durationFieldType50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "PT-1S" + "'", str63, "PT-1S");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(periodType65);
        org.junit.Assert.assertNotNull(period67);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationTo(readableInstant4);
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration5);
        org.joda.time.Period period8 = period6.withMillis((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationTo(readableInstant12);
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant10, (org.joda.time.ReadableDuration) duration13);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant9, (org.joda.time.ReadableDuration) duration13, periodType15);
        org.joda.time.Period period18 = period16.plusWeeks(0);
        org.joda.time.Period period19 = period8.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableDuration30, readableInstant31, periodType32);
        org.joda.time.PeriodType periodType34 = period33.getPeriodType();
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant28, readableInstant29, periodType34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) (byte) -1, (long) (byte) 1, periodType34, chronology36);
        org.joda.time.Period period38 = new org.joda.time.Period((long) 10, periodType34);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((long) (-1), (long) '#', periodType34, chronology39);
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant21, readableInstant22, periodType34);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) 10, periodType34, chronology42);
        org.joda.time.Period period44 = period18.normalizedStandard(periodType34);
        org.joda.time.Period period45 = new org.joda.time.Period((long) '4', (long) (short) 1, periodType34);
        org.joda.time.Period period47 = period45.minusHours((-965));
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period47);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationTo(readableInstant4);
        boolean boolean6 = period2.equals((java.lang.Object) duration5);
        org.joda.time.Period period8 = period2.withMonths((-10));
        org.joda.time.Days days9 = period2.toStandardDays();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(days9);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
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
        org.joda.time.Period period22 = period21.normalizedStandard();
        org.joda.time.MutablePeriod mutablePeriod23 = period22.toMutablePeriod();
        org.joda.time.Period period25 = period22.minusMillis((int) '4');
        org.joda.time.Weeks weeks26 = period22.toStandardWeeks();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(mutablePeriod23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(weeks26);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        int[] intArray5 = period4.getValues();
        org.joda.time.Period period7 = period4.minusMinutes((int) '#');
        int int8 = period7.getMinutes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-35) + "'", int8 == (-35));
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("P10D", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        org.joda.time.DurationFieldType[] durationFieldTypeArray8 = period1.getFieldTypes();
        org.joda.time.Period period10 = period1.minusSeconds((int) (byte) 1);
        org.joda.time.Period period12 = period1.plusWeeks((int) (short) 1);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period1.toDurationFrom(readableInstant13);
        org.joda.time.Period period16 = period1.withSeconds(8);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(durationFieldTypeArray8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.joda.time.Period period1 = org.joda.time.Period.weeks(0);
        int int2 = period1.getMinutes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period3.plusSeconds((int) ' ');
        int[] intArray6 = period3.getValues();
        org.joda.time.Period period8 = period3.withMonths(1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((java.lang.Object) period3, chronology9);
        org.joda.time.Period period12 = period3.minusMinutes((int) (short) 100);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 100 });
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) ' ', 0, (int) (short) 100, 100, (int) (byte) 10, 100, (-1), (int) (short) 100, periodType8);
        org.joda.time.Period period11 = period9.minusYears((int) '#');
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) (short) 1, chronology13);
        org.joda.time.Period period18 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period20 = period18.minusYears((int) (byte) -1);
        org.joda.time.Duration duration21 = period18.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableDuration25, readableInstant26, periodType27);
        org.joda.time.PeriodType periodType29 = period28.getPeriodType();
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant23, readableInstant24, periodType29);
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration21, readableInstant22, periodType29);
        org.joda.time.Period period32 = new org.joda.time.Period(1L, (long) (short) 10, periodType29);
        org.joda.time.Period period33 = period14.withPeriodType(periodType29);
        org.joda.time.Period period35 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period36 = period35.negated();
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period(readableDuration38, readableInstant39, periodType40);
        org.joda.time.PeriodType periodType42 = period41.getPeriodType();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((long) (byte) 10, periodType42, chronology43);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((java.lang.Object) period36, periodType42, chronology45);
        org.joda.time.Period period47 = period33.minus((org.joda.time.ReadablePeriod) period36);
        org.joda.time.Period period48 = period9.withFields((org.joda.time.ReadablePeriod) period36);
        org.joda.time.Period period50 = period48.multipliedBy(97);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period((java.lang.Object) period50, chronology51);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        org.joda.time.DurationFieldType[] durationFieldTypeArray8 = period1.getFieldTypes();
        org.joda.time.Period period10 = period1.minusSeconds((int) (byte) 1);
        org.joda.time.Period period12 = period1.plusWeeks((int) (short) 1);
        org.joda.time.format.PeriodFormatter periodFormatter13 = null;
        java.lang.String str14 = period1.toString(periodFormatter13);
        org.joda.time.Period period16 = period1.withHours((int) (byte) 0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(durationFieldTypeArray8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT0S" + "'", str14, "PT0S");
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        java.lang.String str8 = period7.toString();
        java.lang.String str9 = period7.toString();
        org.joda.time.Period period11 = period7.minusMinutes(100);
        org.joda.time.Period period13 = period11.plusMonths((int) (byte) 1);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT100H" + "'", str8, "PT100H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT100H" + "'", str9, "PT100H");
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 4, chronology1);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType11);
        org.joda.time.Period period14 = period12.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((java.lang.Object) period14, periodType15);
        org.joda.time.Period period18 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period20 = period18.withMillis((int) (byte) 100);
        org.joda.time.Period period22 = period18.withMonths((int) ' ');
        org.joda.time.Period period24 = period18.withHours(100);
        org.joda.time.Period period25 = period14.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Period period27 = period25.plusMonths(100);
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType38, chronology39);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Duration duration42 = period40.toDurationFrom(readableInstant41);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant43, readableDuration44);
        org.joda.time.Period period47 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period49 = period47.minusYears((int) (byte) -1);
        org.joda.time.Period period50 = period45.withFields((org.joda.time.ReadablePeriod) period47);
        org.joda.time.Period period52 = period47.withMinutes((int) (short) -1);
        org.joda.time.Period period53 = period40.plus((org.joda.time.ReadablePeriod) period52);
        org.joda.time.PeriodType periodType54 = period53.getPeriodType();
        org.joda.time.Period period55 = new org.joda.time.Period((int) '4', (int) 'a', (int) (short) -1, 100, 100, 10, (int) '4', 10, periodType54);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period((java.lang.Object) period27, periodType54, chronology56);
        org.joda.time.Period period58 = period2.normalizedStandard(periodType54);
        org.joda.time.Duration duration59 = period58.toStandardDuration();
        org.joda.time.Period period61 = period58.plusMinutes(4);
        int int62 = period58.getYears();
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
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
        org.joda.time.Minutes minutes11 = period10.toStandardMinutes();
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes11);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableDuration26, readableInstant27, periodType28);
        org.joda.time.PeriodType periodType30 = period29.getPeriodType();
        org.joda.time.Period period31 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType30);
        org.joda.time.Period period32 = new org.joda.time.Period((int) (byte) 100, 0, 35, 100, (int) (byte) -1, (int) (byte) -1, (int) (byte) 0, (int) (byte) 10, periodType30);
        org.joda.time.Period period33 = new org.joda.time.Period((int) (byte) 0, 0, (int) '#', (int) (short) 1, 0, (int) (byte) 100, 100, (int) (byte) -1, periodType30);
        org.joda.time.Period period34 = new org.joda.time.Period((long) (-100), (long) 1, periodType30);
        org.junit.Assert.assertNotNull(periodType30);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.minusYears((int) (byte) -1);
        org.joda.time.Period period5 = period3.minusMinutes((int) ' ');
        org.joda.time.PeriodType periodType6 = period5.getPeriodType();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((java.lang.Object) period5, chronology7);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("P35WT0.001S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusDays((int) (byte) 10);
        org.joda.time.Period period6 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period7 = period6.negated();
        org.joda.time.PeriodType periodType8 = period7.getPeriodType();
        org.joda.time.Period period9 = new org.joda.time.Period((java.lang.Object) period4, periodType8);
        org.joda.time.Period period11 = period4.plusWeeks((int) (short) 1);
        org.joda.time.Period period13 = period11.withMinutes((int) (byte) -1);
        org.joda.time.Minutes minutes14 = period13.toStandardMinutes();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(minutes14);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 0, (long) 1, chronology5);
        org.joda.time.Period period7 = period6.negated();
        org.joda.time.Period period8 = period2.withFields((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period10 = period6.withMillis((int) ' ');
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period13.toDurationTo(readableInstant14);
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant12, (org.joda.time.ReadableDuration) duration15);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant11, (org.joda.time.ReadableDuration) duration15, periodType17);
        org.joda.time.Period period20 = period18.plusWeeks(0);
        org.joda.time.Period period22 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period23 = period22.negated();
        org.joda.time.Period period24 = period18.withFields((org.joda.time.ReadablePeriod) period23);
        org.joda.time.Period period26 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period28 = period26.withMillis((int) (byte) 100);
        org.joda.time.Period period29 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = period29.toDurationTo(readableInstant30);
        org.joda.time.Period period33 = period29.plusHours((-1));
        int int34 = period33.getSeconds();
        org.joda.time.Period period35 = period28.withFields((org.joda.time.ReadablePeriod) period33);
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType44);
        org.joda.time.Period period47 = period45.withMillis((int) (short) 10);
        org.joda.time.Period period49 = period45.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType51 = period45.getFieldType((int) (short) 1);
        org.joda.time.Period period53 = period28.withField(durationFieldType51, 100);
        boolean boolean54 = period24.isSupported(durationFieldType51);
        int int55 = period10.indexOf(durationFieldType51);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(durationFieldType51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.joda.time.Period period3 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period4 = period3.negated();
        org.joda.time.PeriodType periodType5 = period4.getPeriodType();
        org.joda.time.Period period6 = new org.joda.time.Period((long) '4', (long) (short) 0, periodType5);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 10, periodType8);
        org.joda.time.Period period11 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period13 = period11.withMillis((int) (byte) 100);
        org.joda.time.Period period14 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period14.toDurationTo(readableInstant15);
        org.joda.time.Period period18 = period14.plusHours((-1));
        int int19 = period18.getSeconds();
        org.joda.time.Period period20 = period13.withFields((org.joda.time.ReadablePeriod) period18);
        int int21 = period18.getHours();
        org.joda.time.Period period22 = period9.minus((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Period period24 = period9.multipliedBy((int) (byte) 100);
        org.joda.time.Period period25 = period9.negated();
        org.joda.time.Weeks weeks26 = period25.toStandardWeeks();
        org.joda.time.Period period27 = period6.minus((org.joda.time.ReadablePeriod) weeks26);
        org.joda.time.Period period29 = period6.plusMonths(32);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
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
        org.joda.time.Period period23 = period8.plusHours(100);
        org.joda.time.Period period25 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period27 = period25.withMillis((int) (byte) 100);
        org.joda.time.Period period29 = period25.withMonths((int) ' ');
        org.joda.time.Period period31 = period25.withHours(100);
        org.joda.time.DurationFieldType[] durationFieldTypeArray32 = period25.getFieldTypes();
        org.joda.time.Period period34 = period25.minusSeconds((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType36 = period34.getFieldType((int) (short) 0);
        org.joda.time.Period period38 = period8.withField(durationFieldType36, (-11));
        org.joda.time.Period period40 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period42 = period40.withMillis((int) (byte) 100);
        org.joda.time.Period period43 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = period43.toDurationTo(readableInstant44);
        org.joda.time.Period period47 = period43.plusHours((-1));
        int int48 = period47.getSeconds();
        org.joda.time.Period period49 = period42.withFields((org.joda.time.ReadablePeriod) period47);
        org.joda.time.Period period50 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Duration duration52 = period50.toDurationTo(readableInstant51);
        org.joda.time.Period period54 = period50.plusHours((-1));
        int int55 = period54.getSeconds();
        org.joda.time.Period period57 = period54.withSeconds(10);
        int int58 = period57.getDays();
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Duration duration60 = period57.toDurationFrom(readableInstant59);
        org.joda.time.ReadableDuration readableDuration78 = null;
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.PeriodType periodType80 = null;
        org.joda.time.Period period81 = new org.joda.time.Period(readableDuration78, readableInstant79, periodType80);
        org.joda.time.PeriodType periodType82 = period81.getPeriodType();
        org.joda.time.Period period83 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType82);
        org.joda.time.Period period84 = new org.joda.time.Period((-1), 0, (int) (short) 1, (int) '4', 10, (int) (byte) 0, 100, (int) (byte) 1, periodType82);
        org.joda.time.Chronology chronology85 = null;
        org.joda.time.Period period86 = new org.joda.time.Period((long) 100, periodType82, chronology85);
        org.joda.time.Period period87 = period57.normalizedStandard(periodType82);
        org.joda.time.Period period88 = new org.joda.time.Period((java.lang.Object) period49, periodType82);
        org.joda.time.Period period90 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period92 = period90.minusYears((int) (byte) -1);
        org.joda.time.Period period94 = period92.minusMinutes((int) ' ');
        org.joda.time.PeriodType periodType95 = period94.getPeriodType();
        org.joda.time.Period period96 = period49.normalizedStandard(periodType95);
        org.joda.time.Period period97 = period38.normalizedStandard(periodType95);
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
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(durationFieldTypeArray32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertNotNull(periodType82);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNotNull(period90);
        org.junit.Assert.assertNotNull(period92);
        org.junit.Assert.assertNotNull(period94);
        org.junit.Assert.assertNotNull(periodType95);
        org.junit.Assert.assertNotNull(period96);
        org.junit.Assert.assertNotNull(period97);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) 35, chronology2);
        org.joda.time.Period period5 = period3.plusWeeks((int) 'a');
        org.joda.time.Period period7 = period5.minusMillis(100);
        int int8 = period5.getYears();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.Period period13 = period9.plusYears((int) (byte) 10);
        org.joda.time.format.PeriodFormatter periodFormatter14 = null;
        java.lang.String str15 = period13.toString(periodFormatter14);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P20Y32M-1WT35H100M10.001S" + "'", str15, "P20Y32M-1WT35H100M10.001S");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        org.joda.time.DurationFieldType[] durationFieldTypeArray8 = period1.getFieldTypes();
        org.joda.time.Period period10 = period1.minusSeconds((int) (byte) 1);
        org.joda.time.Period period12 = period1.plusWeeks((int) (short) 1);
        int int13 = period12.getMonths();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(durationFieldTypeArray8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration2, readableInstant3, periodType4);
        org.joda.time.PeriodType periodType6 = period5.getPeriodType();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((long) (byte) 10, periodType6, chronology7);
        org.joda.time.Period period9 = new org.joda.time.Period((long) (byte) 10, periodType6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = new org.joda.time.Period((java.lang.Object) periodType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        boolean boolean7 = period3.equals((java.lang.Object) duration6);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((int) ' ', 0, (int) (short) 100, 100, (int) (byte) 10, 100, (-1), (int) (short) 100, periodType16);
        org.joda.time.Period period19 = period17.minusYears((int) '#');
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period24 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period26 = period24.minusYears((int) (byte) -1);
        org.joda.time.Duration duration27 = period24.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableDuration31, readableInstant32, periodType33);
        org.joda.time.PeriodType periodType35 = period34.getPeriodType();
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant29, readableInstant30, periodType35);
        org.joda.time.Period period37 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration27, readableInstant28, periodType35);
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant21, readableInstant22, periodType35);
        org.joda.time.Period period39 = new org.joda.time.Period((long) (short) 1, periodType35);
        org.joda.time.Period period40 = period19.normalizedStandard(periodType35);
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration6, periodType35);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Period period47 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period49 = period47.minusYears((int) (byte) -1);
        org.joda.time.Duration duration50 = period47.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period(readableDuration54, readableInstant55, periodType56);
        org.joda.time.PeriodType periodType58 = period57.getPeriodType();
        org.joda.time.Period period59 = new org.joda.time.Period(readableInstant52, readableInstant53, periodType58);
        org.joda.time.Period period60 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration50, readableInstant51, periodType58);
        org.joda.time.Period period61 = new org.joda.time.Period(readableInstant44, readableInstant45, periodType58);
        org.joda.time.Period period62 = new org.joda.time.Period((long) (short) 1, periodType58);
        org.joda.time.Period period63 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, readableInstant42, periodType58);
        org.joda.time.Period period65 = period63.minusMillis(68);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertNotNull(period65);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
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
        org.joda.time.Period period19 = period16.plusMillis(0);
        org.joda.time.Period period20 = period19.negated();
        org.joda.time.Period period22 = period19.withWeeks(1);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) 35, chronology2);
        org.joda.time.Period period5 = period3.plusWeeks((int) 'a');
        org.joda.time.Period period7 = period5.minusMillis(100);
        int int8 = period5.getMonths();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) -1, chronology1);
        int int3 = period2.getMonths();
        org.joda.time.Duration duration4 = period2.toStandardDuration();
        org.joda.time.Period period6 = period2.withSeconds((int) '#');
        org.joda.time.Period period8 = period2.minusMinutes((-1));
        org.joda.time.Period period9 = period2.negated();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((-10));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType6, chronology7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period8.toDurationFrom(readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableDuration12);
        org.joda.time.Period period15 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period17 = period15.minusYears((int) (byte) -1);
        org.joda.time.Period period18 = period13.withFields((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Period period20 = period15.withMinutes((int) (short) -1);
        org.joda.time.Period period21 = period8.plus((org.joda.time.ReadablePeriod) period20);
        org.joda.time.PeriodType periodType22 = period21.getPeriodType();
        org.joda.time.Period period23 = new org.joda.time.Period((long) (-1), 1L, periodType22);
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType22);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(periodType22);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((-1), (int) (byte) 10, 8, 1, (int) (byte) 10, 10, (int) (byte) 1, 1);
        org.joda.time.Period period11 = period9.multipliedBy((int) (short) -1);
        org.joda.time.Period period13 = period9.plusMonths((int) (byte) 0);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period9.toDurationTo(readableInstant14);
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration15);
        org.joda.time.DurationFieldType durationFieldType18 = period16.getFieldType((int) (byte) 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(durationFieldType18);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period3.plusSeconds((int) ' ');
        int[] intArray6 = period3.getValues();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((java.lang.Object) period3, chronology7);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 100 });
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.joda.time.Period period4 = new org.joda.time.Period((-965), 1, (-35), (int) (byte) 100);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableDuration10, readableInstant11, periodType12);
        org.joda.time.PeriodType periodType14 = period13.getPeriodType();
        org.joda.time.Period period15 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType14);
        org.joda.time.Period period17 = period15.minusMonths((int) (short) 100);
        org.joda.time.Period period19 = period17.multipliedBy((int) (byte) 10);
        int int20 = period19.getMinutes();
        int int21 = period19.getHours();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) (short) 1, chronology26);
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
        org.joda.time.Period period45 = new org.joda.time.Period(1L, (long) (short) 10, periodType42);
        org.joda.time.Period period46 = period27.withPeriodType(periodType42);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(0L, periodType42, chronology47);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((long) (byte) 0, (long) 10, periodType42, chronology49);
        org.joda.time.Period period51 = period19.withPeriodType(periodType42);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period52 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1000 + "'", int21 == 1000);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period51);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period2 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period4 = period2.minusYears((int) (byte) -1);
        org.joda.time.Duration duration5 = period2.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration5, readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration5, readableInstant8);
        org.joda.time.Period period11 = new org.joda.time.Period((long) 8);
        org.joda.time.PeriodType periodType12 = period11.getPeriodType();
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration5, periodType12);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (-10));
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, chronology1);
        org.joda.time.Period period4 = period2.withMinutes((int) (short) 0);
        java.lang.Class<?> wildcardClass5 = period2.getClass();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.Period period13 = period9.plusYears((int) (byte) 10);
        org.joda.time.Period period14 = period13.normalizedStandard();
        int int15 = period13.getMinutes();
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = period13.withPeriodType(periodType16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks18 = period17.toStandardWeeks();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Weeks as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        int int5 = period4.getSeconds();
        org.joda.time.Period period7 = period4.withSeconds(10);
        int int8 = period7.getDays();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period7.toDurationFrom(readableInstant9);
        int int11 = period7.getYears();
        org.joda.time.Period period12 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period12.toDurationTo(readableInstant13);
        org.joda.time.Period period16 = period12.plusDays((int) (byte) 10);
        org.joda.time.Period period18 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period19 = period18.negated();
        org.joda.time.PeriodType periodType20 = period19.getPeriodType();
        org.joda.time.Period period21 = new org.joda.time.Period((java.lang.Object) period16, periodType20);
        org.joda.time.Period period22 = period7.normalizedStandard(periodType20);
        org.joda.time.Period period24 = period7.multipliedBy(1000);
        org.joda.time.DurationFieldType[] durationFieldTypeArray25 = period7.getFieldTypes();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(durationFieldTypeArray25);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        org.joda.time.Weeks weeks5 = period4.toStandardWeeks();
        org.joda.time.Period period7 = period4.minusDays(100);
        int int8 = period4.getDays();
        org.joda.time.Period period9 = period4.negated();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = period9.getValue((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.withMillis((int) (short) 1);
        org.joda.time.Period period8 = period4.minusMinutes((int) (short) 0);
        org.joda.time.Period period10 = new org.joda.time.Period((long) 8);
        org.joda.time.PeriodType periodType11 = period10.getPeriodType();
        org.joda.time.Period period12 = period4.withFields((org.joda.time.ReadablePeriod) period10);
        int[] intArray13 = period4.getValues();
        org.joda.time.Period period15 = period4.plusWeeks((-11));
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0, 0, 0, 0, (-1), 0, 0, 0 });
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) -1, (int) (byte) 1, (int) (short) 10, 1, (int) (byte) 100, (int) (short) 10, (int) (short) 100, 100);
        int int9 = period8.getMinutes();
        int int10 = period8.getMonths();
        int int11 = period8.getHours();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 0);
        org.joda.time.Days days2 = period1.toStandardDays();
        int[] intArray3 = period1.getValues();
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 10, periodType5);
        org.joda.time.Period period8 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period10 = period8.withMillis((int) (byte) 100);
        org.joda.time.Period period11 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationTo(readableInstant12);
        org.joda.time.Period period15 = period11.plusHours((-1));
        int int16 = period15.getSeconds();
        org.joda.time.Period period17 = period10.withFields((org.joda.time.ReadablePeriod) period15);
        int int18 = period15.getHours();
        org.joda.time.Period period19 = period6.minus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.PeriodType periodType20 = period15.getPeriodType();
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType23, chronology24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period25.toDurationFrom(readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant28, readableDuration29);
        org.joda.time.Period period32 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period34 = period32.minusYears((int) (byte) -1);
        org.joda.time.Period period35 = period30.withFields((org.joda.time.ReadablePeriod) period32);
        org.joda.time.Period period37 = period32.withMinutes((int) (short) -1);
        org.joda.time.Period period38 = period25.plus((org.joda.time.ReadablePeriod) period37);
        org.joda.time.Period period40 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period42 = period40.withMillis((int) (byte) 100);
        org.joda.time.Period period43 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = period43.toDurationTo(readableInstant44);
        org.joda.time.Period period47 = period43.plusHours((-1));
        int int48 = period47.getSeconds();
        org.joda.time.Period period49 = period42.withFields((org.joda.time.ReadablePeriod) period47);
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType58);
        org.joda.time.Period period61 = period59.withMillis((int) (short) 10);
        org.joda.time.Period period63 = period59.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType65 = period59.getFieldType((int) (short) 1);
        org.joda.time.Period period67 = period42.withField(durationFieldType65, 100);
        boolean boolean68 = period25.isSupported(durationFieldType65);
        org.joda.time.Period period70 = period15.withField(durationFieldType65, (int) '#');
        org.joda.time.Period period72 = period1.withField(durationFieldType65, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType74 = period1.getFieldType((-11));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -11 out of bounds for length 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(durationFieldType65);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(period72);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period3.plusSeconds((int) ' ');
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = period3.indexOf(durationFieldType6);
        org.joda.time.DurationFieldType[] durationFieldTypeArray8 = period3.getFieldTypes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(durationFieldTypeArray8);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period11, periodType12);
        org.joda.time.Period period15 = period11.withMonths(0);
        org.joda.time.Period period17 = period15.minusWeeks((int) (short) -1);
        org.joda.time.Period period19 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period21 = period19.withMillis((int) (byte) 100);
        org.joda.time.Period period22 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationTo(readableInstant23);
        org.joda.time.Period period26 = period22.plusHours((-1));
        int int27 = period26.getSeconds();
        org.joda.time.Period period28 = period21.withFields((org.joda.time.ReadablePeriod) period26);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableDuration31, readableInstant32, periodType33);
        org.joda.time.PeriodType periodType35 = period34.getPeriodType();
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant29, readableInstant30, periodType35);
        org.joda.time.Period period37 = period21.normalizedStandard(periodType35);
        org.joda.time.Period period39 = period21.minusYears((int) (byte) 1);
        org.joda.time.Period period40 = period17.plus((org.joda.time.ReadablePeriod) period39);
        int int41 = period39.getMonths();
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period11, periodType12);
        org.joda.time.Period period15 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period17 = period15.withMillis((int) (byte) 100);
        org.joda.time.Period period19 = period15.withMonths((int) ' ');
        org.joda.time.Period period21 = period15.withHours(100);
        org.joda.time.Period period22 = period11.withFields((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Period period24 = period22.withWeeks((int) (short) 10);
        int int25 = period22.size();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((long) (short) 1, chronology27);
        org.joda.time.Period period32 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period34 = period32.minusYears((int) (byte) -1);
        org.joda.time.Duration duration35 = period32.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableDuration39, readableInstant40, periodType41);
        org.joda.time.PeriodType periodType43 = period42.getPeriodType();
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant37, readableInstant38, periodType43);
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration35, readableInstant36, periodType43);
        org.joda.time.Period period46 = new org.joda.time.Period(1L, (long) (short) 10, periodType43);
        org.joda.time.Period period47 = period28.withPeriodType(periodType43);
        org.joda.time.Period period49 = period28.minusHours((int) (short) 10);
        org.joda.time.Period period51 = period28.withHours((int) (short) -1);
        boolean boolean52 = period22.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableDuration1, readableInstant2, periodType3);
        org.joda.time.PeriodType periodType5 = period4.getPeriodType();
        org.joda.time.Period period7 = period4.plusMonths(8);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period4.toDurationTo(readableInstant8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period12 = org.joda.time.Period.millis((int) ' ');
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period17 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period19 = period17.withMillis((int) (byte) 100);
        org.joda.time.Period period20 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = period20.toDurationTo(readableInstant21);
        org.joda.time.Period period24 = period20.plusHours((-1));
        int int25 = period24.getSeconds();
        org.joda.time.Period period26 = period19.withFields((org.joda.time.ReadablePeriod) period24);
        org.joda.time.Period period28 = period26.plusMillis((int) '#');
        org.joda.time.Period period30 = period28.plusMinutes((int) (short) -1);
        org.joda.time.Duration duration31 = period30.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant32 = null;
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
        org.joda.time.Period period49 = new org.joda.time.Period((long) 0, periodType46);
        org.joda.time.Period period50 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration31, readableInstant32, periodType46);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period((long) 8, periodType46, chronology51);
        org.joda.time.Period period53 = new org.joda.time.Period(readableInstant13, readableInstant14, periodType46);
        org.joda.time.Period period54 = period12.normalizedStandard(periodType46);
        org.joda.time.Period period55 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration9, readableInstant10, periodType46);
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration9);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(period54);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) 10, (int) 'a', 10, 100, (int) (short) 100, 0, (int) (short) 0, (int) '4');
        org.joda.time.Period period10 = period8.plusYears(11);
        org.joda.time.Chronology chronology11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = new org.joda.time.Period((java.lang.Object) 11, chronology11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
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
        int int51 = period4.getDays();
        org.joda.time.Period period53 = period4.withHours((int) (byte) -1);
        org.joda.time.Period period55 = period4.plusYears((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration56 = period55.toStandardDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Duration as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.minusYears((int) (byte) -1);
        org.joda.time.Duration duration4 = period1.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant11);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration4);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-1), chronology1);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) 'a');
        org.joda.time.MutablePeriod mutablePeriod2 = period1.toMutablePeriod();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableDuration1, readableInstant2, periodType3);
        org.joda.time.PeriodType periodType5 = period4.getPeriodType();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) (byte) 10, periodType5, chronology6);
        int int8 = period7.getDays();
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 10, periodType1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period6 = period4.withMillis((int) (byte) 100);
        org.joda.time.Period period8 = period4.withMinutes((int) (byte) 0);
        org.joda.time.MutablePeriod mutablePeriod9 = period8.toMutablePeriod();
        org.joda.time.Period period10 = period8.normalizedStandard();
        int int11 = period8.getMonths();
        org.joda.time.Period period13 = period8.withDays((int) (short) 100);
        org.joda.time.Period period14 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period14.toDurationTo(readableInstant15);
        org.joda.time.Period period18 = period14.plusHours((-1));
        org.joda.time.Period period20 = period18.plusYears((int) (short) -1);
        org.joda.time.Period period22 = period18.plusMillis((int) ' ');
        org.joda.time.MutablePeriod mutablePeriod23 = period22.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant24, readableDuration25);
        org.joda.time.Period period28 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period30 = period28.minusYears((int) (byte) -1);
        org.joda.time.Period period31 = period26.withFields((org.joda.time.ReadablePeriod) period28);
        int[] intArray32 = period26.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter33 = null;
        java.lang.String str34 = period26.toString(periodFormatter33);
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType43);
        org.joda.time.Period period46 = period44.withMillis((int) (short) 10);
        org.joda.time.Period period48 = period44.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType50 = period44.getFieldType((int) (short) 1);
        org.joda.time.Period period52 = period26.withField(durationFieldType50, (int) (short) 10);
        int int53 = period22.get(durationFieldType50);
        boolean boolean54 = period13.isSupported(durationFieldType50);
        int int55 = period2.indexOf(durationFieldType50);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period56 = new org.joda.time.Period((java.lang.Object) durationFieldType50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DurationFieldType$StandardDurationFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(mutablePeriod23);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PT0S" + "'", str34, "PT0S");
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(durationFieldType50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
    }
}

