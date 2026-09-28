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
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        org.joda.time.LocalDate localDate11 = localDate7.withCenturyOfEra((int) '4');
        org.joda.time.LocalDate localDate13 = localDate11.withDayOfMonth((int) (byte) 10);
        org.joda.time.LocalDate localDate15 = localDate13.plusWeeks(0);
        org.joda.time.LocalDate.Property property16 = localDate15.weekOfWeekyear();
        int int17 = property16.getMinimumValueOverall();
        org.joda.time.LocalDate localDate18 = property16.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(localDate18);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight10 = localDate9.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate9.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate9.minusYears(31);
        org.joda.time.LocalDate.Property property15 = localDate9.dayOfMonth();
        org.joda.time.LocalDate localDate16 = property15.withMaximumValue();
        org.joda.time.LocalDate localDate17 = property15.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.LocalDate localDate10 = localDate7.plusDays(5);
        org.joda.time.LocalDate localDate12 = localDate7.minusWeeks(28787742);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate16 = localDate13.withPeriodAdded(readablePeriod14, (int) (byte) -1);
        int int17 = localDate13.getYearOfEra();
        org.joda.time.LocalDate localDate19 = localDate13.plusDays(1970);
        org.joda.time.LocalDate localDate21 = localDate13.withLocalMillis((long) (-1));
        org.joda.time.LocalDate localDate23 = localDate13.plusMonths((int) (short) 100);
        org.joda.time.LocalDate.Property property24 = localDate23.weekyear();
        org.joda.time.DateTime dateTime25 = localDate23.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 2026, dateTimeZone27);
        int[] intArray29 = localDate28.getValues();
        org.joda.time.LocalDate.Property property30 = localDate28.weekOfWeekyear();
        org.joda.time.LocalDate localDate31 = property30.getLocalDate();
        org.joda.time.DateTime dateTime32 = localDate31.toDateTimeAtStartOfDay();
        org.joda.time.DateTime dateTime33 = localDate23.toDateTime((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.LocalDate localDate34 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDate localDate37 = localDate34.withPeriodAdded(readablePeriod35, (int) (byte) -1);
        int int38 = localDate34.getYearOfEra();
        org.joda.time.LocalDate localDate40 = localDate34.plusDays(1970);
        org.joda.time.LocalDate localDate42 = localDate34.withLocalMillis((long) (-1));
        org.joda.time.LocalDate localDate44 = localDate42.minusYears(25200052);
        org.joda.time.Interval interval45 = localDate44.toInterval();
        int int46 = localDate44.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((long) 2026, dateTimeZone48);
        int[] intArray50 = localDate49.getValues();
        org.joda.time.LocalDate.Property property51 = localDate49.weekOfWeekyear();
        org.joda.time.LocalDate localDate53 = property51.addToCopy(10);
        org.joda.time.LocalDate localDate55 = property51.addToCopy(1970);
        long long56 = property51.getMillis();
        java.lang.String str57 = property51.getAsShortText();
        boolean boolean58 = property51.isLeap();
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = property51.getFieldType();
        boolean boolean60 = localDate44.isSupported(dateTimeFieldType59);
        boolean boolean61 = localDate23.isSupported(dateTimeFieldType59);
        int int62 = localDate12.indexOf(dateTimeFieldType59);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2026 + "'", int17 == 2026);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2026 + "'", int38 == 2026);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 31 + "'", int46 == 31);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "1" + "'", str57, "1");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMinutes(31);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.hourOfDay();
        java.lang.String str15 = property14.getAsShortText();
        org.joda.time.LocalDateTime localDateTime17 = property14.addToCopy(10L);
        org.joda.time.DurationField durationField18 = property14.getLeapDurationField();
        org.joda.time.DateTimeField dateTimeField19 = property14.getField();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "7" + "'", str15, "7");
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property9.getFieldType();
        org.joda.time.LocalDate localDate11 = property9.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime12 = localDate11.toDateTimeAtCurrentTime();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minusHours((-1));
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks(52);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusMillis(26);
        int int16 = localDateTime13.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.withWeekOfWeekyear(39);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusHours(32);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) '4');
        int int23 = localDateTime22.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime30 = localDateTime22.withFields((org.joda.time.ReadablePartial) localDateTime29);
        java.util.Date date31 = localDateTime30.toDate();
        int int32 = localDateTime30.getDayOfYear();
        org.joda.time.LocalDateTime.Property property33 = localDateTime30.weekyear();
        org.joda.time.LocalDateTime localDateTime34 = property33.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) '4');
        int int38 = localDateTime37.getYearOfEra();
        org.joda.time.LocalDateTime.Property property39 = localDateTime37.minuteOfHour();
        org.joda.time.LocalDateTime.Property property40 = localDateTime37.era();
        org.joda.time.LocalDateTime.Property property41 = localDateTime37.hourOfDay();
        int int42 = localDateTime37.getYear();
        java.lang.String str44 = localDateTime37.toString("\u0e04\u0e28.");
        org.joda.time.LocalDateTime localDateTime46 = localDateTime37.minusSeconds((int) ' ');
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.withMillisOfDay(7);
        org.joda.time.Chronology chronology50 = localDateTime49.getChronology();
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime46, chronology50);
        org.joda.time.DateTimeField dateTimeField52 = localDateTime34.getField((int) (byte) 1, chronology50);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime18.withFields((org.joda.time.ReadablePartial) localDateTime34);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.minusSeconds(333);
        int int56 = localDateTime53.getMillisOfDay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1970 + "'", int38 == 1970);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1970 + "'", int42 == 1970);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\u0e04\u0e28." + "'", str44, "\u0e04\u0e28.");
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 25200052 + "'", int56 == 25200052);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate5.withPeriodAdded(readablePeriod6, 0);
        org.joda.time.Chronology chronology9 = localDate5.getChronology();
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now(chronology9);
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = localDate10.toString("1970-01-01T07:00:02.025", locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalTime localTime8 = null;
        org.joda.time.DateTime dateTime9 = localDate5.toDateTime(localTime8);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate5.withPeriodAdded(readablePeriod6, 0);
        org.joda.time.LocalDate localDate10 = localDate8.minusMonths(40);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = localDate10.withWeekOfWeekyear(25200064);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25200064 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears((int) (byte) -1);
        int int12 = localDateTime1.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property13 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime1.minusYears(26);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.plus(readablePeriod16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.withMinuteOfHour(11);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime1.plusMinutes(2058);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalTime localTime7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate0.toDateTime(localTime7, dateTimeZone8);
        org.joda.time.DateTime dateTime10 = localDate0.toDateTimeAtCurrentTime();
        org.joda.time.DateMidnight dateMidnight11 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate13 = localDate0.minusDays(3938);
        org.joda.time.LocalDate localDate15 = localDate0.plusYears(621);
        org.joda.time.LocalDate.Property property16 = localDate0.weekOfWeekyear();
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate20 = localDate17.withPeriodAdded(readablePeriod18, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight21 = localDate17.toDateMidnight();
        org.joda.time.LocalDate localDate23 = localDate17.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property24 = localDate17.dayOfYear();
        org.joda.time.LocalDate localDate26 = property24.addWrapFieldToCopy((int) (short) 1);
        org.joda.time.Chronology chronology27 = property24.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((java.lang.Object) property16, chronology27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDate$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(chronology27);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears((int) (byte) -1);
        int int12 = localDateTime1.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property13 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime1.minusYears(26);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.plus(readablePeriod16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.withMinuteOfHour(11);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusDays(31140052);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        int int9 = localDate6.getDayOfYear();
        org.joda.time.LocalDate localDate11 = localDate6.plusMonths(324);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 50 + "'", int9 == 50);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        org.joda.time.LocalDate.Property property10 = localDate7.weekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = localDate7.toDateMidnight(dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate7.withYear((int) '#');
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks(10);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withDayOfYear(4);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusSeconds(0);
        int int18 = localDateTime15.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) '4');
        int int21 = localDateTime20.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property22 = localDateTime20.dayOfYear();
        org.joda.time.LocalDateTime.Property property23 = localDateTime20.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime24 = property23.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property23.getFieldType();
        int int26 = localDateTime15.indexOf(dateTimeFieldType25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime12.property(dateTimeFieldType25);
        org.joda.time.DateTimeField dateTimeField28 = property27.getField();
        org.joda.time.LocalDateTime localDateTime29 = property27.getLocalDateTime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(localDateTime29);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property10 = localDate7.yearOfCentury();
        org.joda.time.LocalDate localDate11 = property10.roundHalfCeilingCopy();
        org.joda.time.LocalDate.Property property12 = localDate11.weekyear();
        org.joda.time.LocalDate.Property property13 = localDate11.weekyear();
        int int14 = localDate11.getWeekyear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        org.joda.time.LocalDate localDate11 = localDate7.withCenturyOfEra((int) '4');
        org.joda.time.LocalDate localDate13 = localDate7.minusDays((int) (byte) 100);
        org.joda.time.LocalDate.Property property14 = localDate13.dayOfWeek();
        int int15 = localDate13.getDayOfWeek();
        org.joda.time.LocalDate localDate17 = localDate13.minusMonths((int) (byte) 10);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property10 = localDate7.yearOfCentury();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate15 = localDate12.withPeriodAdded(readablePeriod13, (int) (byte) -1);
        int int16 = localDate12.getYearOfEra();
        org.joda.time.LocalDate localDate18 = localDate12.plusDays(1970);
        org.joda.time.LocalDate localDate19 = localDate11.withFields((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.LocalDate.Property property20 = localDate18.monthOfYear();
        org.joda.time.LocalDate localDate22 = localDate18.withCenturyOfEra((int) '4');
        org.joda.time.LocalDate localDate24 = localDate22.withDayOfMonth((int) (byte) 10);
        boolean boolean25 = localDate7.isAfter((org.joda.time.ReadablePartial) localDate24);
        org.joda.time.LocalDate.Property property26 = localDate24.dayOfMonth();
        org.joda.time.LocalDate localDate27 = property26.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate28 = property26.roundCeilingCopy();
        org.joda.time.DurationField durationField29 = property26.getLeapDurationField();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2026 + "'", int16 == 2026);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNull(durationField29);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        int int11 = localDateTime5.getYearOfCentury();
        int int12 = localDateTime5.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusSeconds(0);
        int int18 = localDateTime15.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) '4');
        int int21 = localDateTime20.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property22 = localDateTime20.dayOfYear();
        org.joda.time.LocalDateTime.Property property23 = localDateTime20.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime24 = property23.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property23.getFieldType();
        int int26 = localDateTime15.indexOf(dateTimeFieldType25);
        int int27 = localDateTime5.get(dateTimeFieldType25);
        org.joda.time.Chronology chronology28 = localDateTime5.getChronology();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime5.plusMonths(50);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime5.plusHours(28816124);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 70 + "'", int11 == 70);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(25200052L);
        org.joda.time.LocalDate localDate3 = localDate1.withLocalMillis(10L);
        org.joda.time.LocalDate localDate5 = localDate1.minusWeeks(5);
        org.joda.time.LocalDate localDate7 = localDate1.minusYears(25200052);
        org.joda.time.LocalDate localDate9 = localDate7.withWeekyear(35);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone10);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate localDate10 = localDate5.plusWeeks((int) (short) 100);
        long long11 = localDate5.getLocalMillis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate5.withDayOfMonth((int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1790553600000L + "'", long11 == 1790553600000L);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(2026);
        org.joda.time.LocalDate localDate13 = localDate11.plusWeeks(19);
        org.joda.time.LocalDate.Property property14 = localDate11.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate17 = localDate11.withPeriodAdded(readablePeriod15, (-292275054));
        java.util.Date date18 = localDate11.toDate();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) date18);
        org.joda.time.LocalDate.Property property20 = localDate19.dayOfMonth();
        int int21 = localDate19.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) 2026, dateTimeZone23);
        int[] intArray25 = localDate24.getValues();
        org.joda.time.LocalDate.Property property26 = localDate24.weekOfWeekyear();
        org.joda.time.LocalDate localDate28 = property26.addToCopy(10);
        org.joda.time.LocalDate localDate30 = property26.addToCopy(1970);
        int int31 = localDate30.getYearOfEra();
        org.joda.time.LocalDate.Property property32 = localDate30.weekOfWeekyear();
        java.lang.String str33 = property32.getAsShortText();
        org.joda.time.LocalDate localDate35 = property32.setCopy(40);
        int int36 = property32.getMaximumValueOverall();
        org.joda.time.DateTimeField dateTimeField37 = property32.getField();
        org.joda.time.LocalDate.Property property38 = new org.joda.time.LocalDate.Property(localDate19, dateTimeField37);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Wed Nov 28 00:00:00 ICT 1832");
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18 + "'", int21 == 18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2007 + "'", int31 == 2007);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "40" + "'", str33, "40");
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 53 + "'", int36 == 53);
        org.junit.Assert.assertNotNull(dateTimeField37);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusSeconds((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.plusSeconds((int) (short) 100);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate19 = localDate16.withPeriodAdded(readablePeriod17, (int) (byte) -1);
        int int20 = localDate16.getYearOfEra();
        org.joda.time.LocalDate localDate22 = localDate16.plusDays(1970);
        org.joda.time.LocalDate localDate23 = localDate15.withFields((org.joda.time.ReadablePartial) localDate22);
        long long24 = localDate15.getLocalMillis();
        org.joda.time.LocalDate.Property property25 = localDate15.dayOfMonth();
        org.joda.time.Chronology chronology26 = property25.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField27 = localDateTime13.getField((-1790557228), chronology26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1790557228");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2026 + "'", int20 == 2026);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1790553600000L + "'", long24 == 1790553600000L);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(chronology26);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) '4');
        int int12 = localDateTime11.getYearOfEra();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime15 = property13.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localDateTime17.toDateTime(dateTimeZone18);
        long long20 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime21 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Chronology chronology22 = localDateTime9.getChronology();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 420L + "'", long20 == 420L);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(chronology22);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.minusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.LocalDate localDate5 = localDate2.plusDays(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate7 = localDate2.plus(readablePeriod6);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localDateTime2.getFields();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.minusDays(59);
        int int6 = localDateTime5.getMonthOfYear();
        int int7 = localDateTime5.getMillisOfSecond();
        int int8 = localDateTime5.getMinuteOfHour();
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        long long9 = localDate0.getLocalMillis();
        org.joda.time.LocalDate.Property property10 = localDate0.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = localDate0.isSupported(dateTimeFieldType11);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate17 = localDate14.withPeriodAdded(readablePeriod15, (int) (byte) -1);
        int int18 = localDate14.getYearOfEra();
        org.joda.time.LocalDate localDate20 = localDate14.plusDays(1970);
        org.joda.time.LocalDate localDate21 = localDate13.withFields((org.joda.time.ReadablePartial) localDate20);
        boolean boolean22 = localDate0.equals((java.lang.Object) localDate21);
        org.joda.time.LocalDate localDate24 = localDate0.withYear(100);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((java.lang.Object) localDate24, dateTimeZone25);
        org.joda.time.LocalDate.Property property27 = localDate24.dayOfWeek();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate(25200052L);
        org.joda.time.LocalDate localDate31 = localDate29.withLocalMillis(10L);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localDate31.toDateTimeAtCurrentTime(dateTimeZone32);
        int int34 = property27.compareTo((org.joda.time.ReadableInstant) dateTime33);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1790553600000L + "'", long9 == 1790553600000L);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2026 + "'", int18 == 2026);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusMonths((int) ' ');
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.plusHours(70);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.plus(readableDuration14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundFloorCopy();
        int int8 = localDateTime7.getYearOfCentury();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 70 + "'", int8 == 70);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        int int9 = localDateTime8.getYearOfEra();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        int int11 = property10.getMaximumValue();
        org.joda.time.DateTimeField dateTimeField12 = property10.getField();
        org.joda.time.LocalDateTime.Property property13 = new org.joda.time.LocalDateTime.Property(localDateTime5, dateTimeField12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime5.minusMinutes(40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusMonths((int) ' ');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusDays(70);
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.weekyear();
        java.util.Locale locale13 = null;
        java.lang.String str14 = property12.getAsText(locale13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2024" + "'", str14, "2024");
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withDurationAdded(readableDuration11, 0);
        int int14 = localDateTime10.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.minusMillis((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plus(readableDuration17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withWeekyear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.plus(readablePeriod21);
        int int23 = localDateTime22.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 28320052 + "'", int14 == 28320052);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        long long9 = localDate0.getLocalMillis();
        org.joda.time.LocalDate.Property property10 = localDate0.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = localDate0.isSupported(dateTimeFieldType11);
        org.joda.time.LocalDate.Property property13 = localDate0.weekyear();
        org.joda.time.LocalDate.Property property14 = localDate0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate16 = localDate0.plus(readablePeriod15);
        org.joda.time.LocalDate.Property property17 = localDate16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField18 = property17.getField();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1790553600000L + "'", long9 == 1790553600000L);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusMillis(4);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusMinutes((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withYear(39130011);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.minusHours(31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        int int10 = localDate7.getMonthOfYear();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate13 = localDate7.withPeriodAdded(readablePeriod11, 25200052);
        org.joda.time.LocalDate.Property property14 = localDate13.weekyear();
        java.lang.String str15 = localDate13.toString();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2032-02-19" + "'", str15, "2032-02-19");
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(2026);
        org.joda.time.LocalDate localDate13 = localDate11.plusWeeks(19);
        org.joda.time.LocalDate localDate15 = localDate11.withWeekOfWeekyear(4);
        org.joda.time.LocalDate localDate17 = localDate15.withYearOfEra(26);
        org.joda.time.LocalDate.Property property18 = localDate15.dayOfMonth();
        org.joda.time.LocalDate localDate20 = localDate15.minusMonths(1980);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDate20);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate11 = localDate9.minusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate9.toDateTimeAtCurrentTime(dateTimeZone12);
        int int14 = property8.compareTo((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.LocalDate localDate15 = property8.roundHalfFloorCopy();
        org.joda.time.LocalDate.Property property16 = localDate15.dayOfMonth();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.year();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.plus(readableDuration11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.minusMillis(0);
        org.joda.time.LocalDateTime.Property property15 = localDateTime9.monthOfYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) '4');
        int int12 = localDateTime11.getYearOfEra();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime15 = property13.addToCopy((int) '4');
        org.joda.time.Chronology chronology16 = property13.getChronology();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime1, chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.plusHours(26);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime1.plus(readableDuration20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime1.yearOfCentury();
        org.joda.time.LocalDateTime.Property property23 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) '4');
        int int26 = localDateTime25.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime25.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime33 = localDateTime25.withFields((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = null;
        int int35 = localDateTime32.indexOf(dateTimeFieldType34);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.LocalDateTime localDateTime37 = localDateTime32.plus(readableDuration36);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) '4');
        int int40 = localDateTime39.getYearOfEra();
        org.joda.time.LocalDateTime.Property property41 = localDateTime39.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime43 = property41.addToCopy((int) '4');
        int int44 = localDateTime43.getEra();
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.plus(readableDuration45);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime43.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.LocalDateTime localDateTime51 = localDateTime48.withDurationAdded(readableDuration49, 0);
        int int53 = localDateTime48.getValue(2);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime48.plusMonths(2);
        org.joda.time.LocalDateTime.Property property56 = localDateTime55.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = property56.getFieldType();
        org.joda.time.LocalDateTime.Property property58 = localDateTime37.property(dateTimeFieldType57);
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime((long) '4');
        int int61 = localDateTime60.getYearOfEra();
        org.joda.time.LocalDateTime.Property property62 = localDateTime60.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime64 = property62.addToCopy((int) '4');
        int int65 = localDateTime64.getEra();
        org.joda.time.ReadableDuration readableDuration66 = null;
        org.joda.time.LocalDateTime localDateTime67 = localDateTime64.plus(readableDuration66);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime64.plusMillis(0);
        int int71 = localDateTime64.getValue(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = localDateTime64.getFieldType(2);
        int int74 = localDateTime37.get(dateTimeFieldType73);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime76 = localDateTime1.withField(dateTimeFieldType73, (-3205));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3205 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1970 + "'", int40 == 1970);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1970 + "'", int61 == 1970);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localDateTime2.getFields();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = localDateTime2.toString(dateTimeFormatter4);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) '4');
        int int8 = localDateTime7.getYearOfEra();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.minuteOfHour();
        int int10 = property9.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime12 = property9.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime13 = property9.roundFloorCopy();
        int int14 = localDateTime13.getDayOfWeek();
        boolean boolean15 = localDateTime2.equals((java.lang.Object) localDateTime13);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.plusSeconds(1969);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withEra(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T07:00:00.000" + "'", str5, "1970-01-01T07:00:00.000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 59 + "'", int10 == 59);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("Property[dayOfYear]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Property[dayOfYear]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks(1970);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMonthOfYear(2);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.minusWeeks(365);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.minus(readableDuration15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusMinutes((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withSecondOfMinute(35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = localDateTime20.withDate((int) (short) 0, 251980, (-2026));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 251980 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(1799020800000L, dateTimeZone1);
        java.lang.String str3 = localDate2.toString();
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = localDate2.toString("weekyear", locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: r");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2027-01-04" + "'", str3, "2027-01-04");
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight5 = localDate1.toDateMidnight();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property8 = localDate7.year();
        org.joda.time.Chronology chronology9 = localDate7.getChronology();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((java.lang.Object) "2026", chronology9);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology9);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        org.joda.time.LocalDate localDate11 = localDate9.withYearOfCentury(52);
        org.joda.time.LocalDate localDate13 = localDate9.withYearOfCentury(40);
        org.joda.time.LocalDate.Property property14 = localDate13.dayOfMonth();
        java.util.Locale locale15 = null;
        java.lang.String str16 = property14.getAsShortText(locale15);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "28" + "'", str16, "28");
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        org.joda.time.LocalDate localDate6 = localDate1.plusWeeks(0);
        org.joda.time.LocalDate localDate8 = localDate6.withYear((int) ' ');
        org.joda.time.LocalDate localDate10 = localDate8.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property11 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate16 = localDate13.withPeriodAdded(readablePeriod14, (int) (byte) -1);
        int int17 = localDate13.getYearOfEra();
        org.joda.time.LocalDate localDate19 = localDate13.plusDays(1970);
        org.joda.time.LocalDate localDate20 = localDate12.withFields((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.LocalDate.Property property21 = localDate19.monthOfYear();
        org.joda.time.LocalDate localDate23 = localDate19.withCenturyOfEra((int) '4');
        org.joda.time.LocalDate localDate25 = localDate23.withDayOfMonth((int) (byte) 10);
        boolean boolean26 = localDate8.isAfter((org.joda.time.ReadablePartial) localDate25);
        int int27 = localDate25.getDayOfMonth();
        org.joda.time.LocalDate.Property property28 = localDate25.dayOfMonth();
        org.joda.time.LocalDate localDate30 = property28.addWrapFieldToCopy(867);
        org.joda.time.Chronology chronology31 = property28.getChronology();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) 2922750, chronology31);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2026 + "'", int17 == 2026);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(chronology31);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks(1970);
        int int11 = localDateTime10.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.plusWeeks((int) '4');
        org.joda.time.LocalDateTime.Property property14 = localDateTime10.year();
        org.joda.time.LocalDateTime localDateTime16 = property14.addToCopy((int) ' ');
        org.joda.time.Chronology chronology17 = property14.getChronology();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 40 + "'", int11 == 40);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(chronology17);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears((int) (byte) -1);
        java.util.Date date12 = localDateTime1.toDate();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.fromDateFields(date12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property10 = localDate7.yearOfCentury();
        org.joda.time.LocalDate localDate11 = property10.roundHalfCeilingCopy();
        org.joda.time.LocalDate.Property property12 = localDate11.weekyear();
        java.lang.String str13 = property12.toString();
        org.joda.time.Chronology chronology14 = property12.getChronology();
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now(chronology14);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Property[weekyear]" + "'", str13, "Property[weekyear]");
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight10 = localDate9.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate9.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate9.minusYears(31);
        org.joda.time.LocalDate.Property property15 = localDate9.dayOfMonth();
        long long16 = property15.getMillis();
        org.joda.time.LocalDate localDate18 = property15.addWrapFieldToCopy(2058);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1001635200000L + "'", long16 == 1001635200000L);
        org.junit.Assert.assertNotNull(localDate18);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(5701010L);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        int int10 = localDate7.getMonthOfYear();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate13 = localDate7.withPeriodAdded(readablePeriod11, 25200052);
        org.joda.time.DateTime dateTime14 = localDate7.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property15 = localDate7.weekOfWeekyear();
        java.util.Locale locale16 = null;
        java.lang.String str17 = property15.getAsShortText(locale16);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "8" + "'", str17, "8");
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        java.lang.String str3 = property2.toString();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDateTime5.toDateTime(dateTimeZone6);
        int int8 = property2.getDifference((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.LocalDateTime localDateTime10 = property2.addToCopy(12);
        java.lang.String str11 = property2.getName();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withCenturyOfEra(1);
        int int15 = localDateTime12.getYear();
        org.joda.time.DateTime dateTime16 = localDateTime12.toDateTime();
        long long17 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime16);
        java.lang.String str18 = property2.getAsText();
        org.joda.time.LocalDateTime localDateTime19 = property2.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusSeconds(100);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.withYear(28);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withLocalMillis(1960761600000L);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[centuryOfEra]" + "'", str3, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "centuryOfEra" + "'", str11, "centuryOfEra");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2026 + "'", int15 == 2026);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "19" + "'", str18, "19");
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear(70);
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.secondOfMinute();
        java.util.Locale locale8 = null;
        int int9 = property7.getMaximumTextLength(locale8);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withMillisOfSecond(28);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.weekyear();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = property7.getDifference(readableInstant8);
        org.joda.time.LocalDate localDate10 = property7.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate11 = property7.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate12 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate14 = localDate12.withYear(28);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = localDate14.toDateMidnight(dateTimeZone15);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateMidnight16);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = localDate0.indexOf(dateTimeFieldType5);
        org.joda.time.LocalDate localDate8 = localDate0.withWeekyear((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate11 = localDate0.withPeriodAdded(readablePeriod9, 59);
        org.joda.time.LocalDate.Property property12 = localDate0.centuryOfEra();
        org.joda.time.LocalDate localDate14 = property12.addToCopy(14);
        long long15 = property12.getMillis();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1790553600000L + "'", long15 == 1790553600000L);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(272, 0, 985, (int) (short) -1, 1973, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        int int12 = localDateTime11.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withWeekOfWeekyear(7);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfSecond();
        java.lang.String str16 = property15.getAsShortText();
        org.joda.time.Chronology chronology17 = property15.getChronology();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now(chronology17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10" + "'", str16, "10");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property10 = localDate7.yearOfCentury();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate15 = localDate12.withPeriodAdded(readablePeriod13, (int) (byte) -1);
        int int16 = localDate12.getYearOfEra();
        org.joda.time.LocalDate localDate18 = localDate12.plusDays(1970);
        org.joda.time.LocalDate localDate19 = localDate11.withFields((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.LocalDate.Property property20 = localDate18.monthOfYear();
        org.joda.time.LocalDate localDate22 = localDate18.withCenturyOfEra((int) '4');
        org.joda.time.LocalDate localDate24 = localDate22.withDayOfMonth((int) (byte) 10);
        boolean boolean25 = localDate7.isAfter((org.joda.time.ReadablePartial) localDate24);
        org.joda.time.LocalDate.Property property26 = localDate24.dayOfMonth();
        org.joda.time.LocalDate localDate27 = property26.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate29 = localDate27.minusDays(50);
        int int30 = localDate27.size();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(25200052L);
        org.joda.time.LocalDate localDate35 = localDate33.withLocalMillis(10L);
        org.joda.time.LocalDate localDate37 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalDate localDate40 = localDate37.withPeriodAdded(readablePeriod38, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight41 = localDate37.toDateMidnight();
        org.joda.time.LocalDate localDate43 = localDate37.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property44 = localDate43.year();
        org.joda.time.Chronology chronology45 = localDate43.getChronology();
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((java.lang.Object) "2026", chronology45);
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((java.lang.Object) 10L, chronology45);
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate(chronology45);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField49 = localDate27.getField(4, chronology45);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2026 + "'", int16 == 2026);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(dateMidnight41);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(chronology45);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.DurationField durationField4 = property3.getDurationField();
        java.lang.String str5 = property3.getAsShortText();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) '4');
        int int8 = localDateTime7.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime15 = localDateTime7.withFields((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime7.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime7.withHourOfDay((int) (byte) 0);
        boolean boolean20 = property3.equals((java.lang.Object) localDateTime7);
        org.joda.time.LocalDateTime localDateTime22 = property3.addToCopy((long) 42);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(1580400064L, dateTimeZone1);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.DurationField durationField4 = property3.getDurationField();
        java.lang.String str5 = property3.getAsShortText();
        org.joda.time.LocalDateTime localDateTime6 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMillis(2001);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusMonths(28833789);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        java.lang.String str6 = property3.getAsString();
        org.joda.time.LocalDateTime localDateTime7 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime8 = property3.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime9 = property3.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime10 = property3.roundFloorCopy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.DurationField durationField8 = property7.getDurationField();
        java.lang.String str9 = property7.getAsText();
        boolean boolean10 = property7.isLeap();
        org.joda.time.LocalDate localDate12 = property7.addWrapFieldToCopy((int) (short) 100);
        org.joda.time.Chronology chronology13 = property7.getChronology();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "271" + "'", str9, "271");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        java.lang.String str7 = property3.toString();
        org.joda.time.LocalDateTime localDateTime9 = property3.addToCopy((long) 99);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plus(readableDuration10);
        int int12 = localDateTime9.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property13 = localDateTime9.era();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Property[minuteOfHour]" + "'", str7, "Property[minuteOfHour]");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31140052 + "'", int12 == 31140052);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime1.withHourOfDay((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withPeriodAdded(readablePeriod14, (int) '#');
        org.joda.time.LocalDateTime.Property property17 = localDateTime13.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime13, dateTimeZone18);
        int int20 = localDateTime13.getMillisOfDay();
        java.util.Locale locale22 = null;
        java.lang.String str23 = localDateTime13.toString("\u0e04\u0e28.", locale22);
        int int24 = localDateTime13.size();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime13.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) '4');
        int int29 = localDateTime28.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime28.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime36 = localDateTime28.withFields((org.joda.time.ReadablePartial) localDateTime35);
        java.util.Date date37 = localDateTime36.toDate();
        int int38 = localDateTime36.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime36.minusMinutes(9);
        org.joda.time.DateTime dateTime41 = localDateTime40.toDateTime();
        org.joda.time.DateTime dateTime42 = localDateTime13.toDateTime((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime13.minuteOfHour();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u0e04\u0e28." + "'", str23, "\u0e04\u0e28.");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(property43);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime1.withHourOfDay((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withPeriodAdded(readablePeriod14, (int) '#');
        org.joda.time.LocalDateTime.Property property17 = localDateTime13.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime13, dateTimeZone18);
        int int20 = localDateTime13.getMillisOfDay();
        java.util.Locale locale22 = null;
        java.lang.String str23 = localDateTime13.toString("\u0e04\u0e28.", locale22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime13.plusSeconds(15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u0e04\u0e28." + "'", str23, "\u0e04\u0e28.");
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = localDate0.indexOf(dateTimeFieldType5);
        org.joda.time.DurationFieldType durationFieldType7 = null;
        boolean boolean8 = localDate0.isSupported(durationFieldType7);
        org.joda.time.LocalDate localDate10 = localDate0.minusMonths(3);
        org.joda.time.Interval interval11 = localDate0.toInterval();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate14 = localDate0.withPeriodAdded(readablePeriod12, 24208);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withYear(4);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withLocalMillis((long) 1970);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) '4');
        int int18 = localDateTime17.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime25 = localDateTime17.withFields((org.joda.time.ReadablePartial) localDateTime24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime17.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime17.withHourOfDay((int) (byte) 0);
        int int30 = localDateTime29.getCenturyOfEra();
        org.joda.time.LocalDateTime.Property property31 = localDateTime29.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime33 = property31.addWrapFieldToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime34 = property31.roundFloorCopy();
        org.joda.time.DateTimeField dateTimeField35 = property31.getField();
        org.joda.time.LocalDateTime.Property property36 = new org.joda.time.LocalDateTime.Property(localDateTime15, dateTimeField35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 19 + "'", int30 == 19);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(dateTimeField35);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate localDate10 = localDate8.minusYears(25200052);
        org.joda.time.Interval interval11 = localDate10.toInterval();
        int int12 = localDate10.getDayOfMonth();
        org.joda.time.LocalDate.Property property13 = localDate10.weekyear();
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate17 = localDate14.withPeriodAdded(readablePeriod15, (int) (byte) -1);
        org.joda.time.LocalDate localDate19 = localDate14.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDate localDate22 = localDate14.withPeriodAdded(readablePeriod20, (-1));
        org.joda.time.LocalDate localDate24 = localDate22.withLocalMillis((long) 5);
        org.joda.time.LocalDate localDate26 = localDate24.withMonthOfYear(5);
        boolean boolean27 = localDate10.isAfter((org.joda.time.ReadablePartial) localDate26);
        int int28 = localDate26.getEra();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate localDate8 = localDate6.withYearOfEra(100);
        int int9 = localDate8.getYearOfEra();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(25200052L);
        org.joda.time.LocalDate localDate3 = localDate1.withLocalMillis(10L);
        org.joda.time.LocalDate.Property property4 = localDate1.yearOfCentury();
        java.util.Locale locale6 = null;
        java.lang.String str7 = localDate1.toString("\u0e01\u0e1e.", locale6);
        org.joda.time.LocalDate.Property property8 = localDate1.yearOfCentury();
        boolean boolean9 = property8.isLeap();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u0e01\u0e1e." + "'", str7, "\u0e01\u0e1e.");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        java.lang.String str3 = property2.toString();
        int int4 = property2.getLeapAmount();
        java.util.Locale locale5 = null;
        int int6 = property2.getMaximumShortTextLength(locale5);
        org.joda.time.LocalDateTime localDateTime8 = property2.addToCopy((int) ' ');
        org.joda.time.DurationFieldType durationFieldType9 = null;
        boolean boolean10 = localDateTime8.isSupported(durationFieldType9);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[centuryOfEra]" + "'", str3, "Property[centuryOfEra]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate2.minus(readablePeriod3);
        org.joda.time.LocalDate localDate6 = localDate4.withWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime7 = localDate6.toDateTimeAtMidnight();
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        org.joda.time.DurationFieldType durationFieldType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withFieldAdded(durationFieldType9, 67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withDurationAdded(readableDuration11, 0);
        int int14 = localDateTime10.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.minusMillis((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plus(readableDuration17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withWeekyear((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withDurationAdded(readableDuration21, 100);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusSeconds(6);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.withEra((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.millisOfDay();
        org.joda.time.LocalDateTime.Property property29 = localDateTime27.dayOfYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 28320052 + "'", int14 == 28320052);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property29);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        long long9 = localDate0.getLocalMillis();
        org.joda.time.LocalDate.Property property10 = localDate0.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = localDate0.isSupported(dateTimeFieldType11);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate17 = localDate14.withPeriodAdded(readablePeriod15, (int) (byte) -1);
        int int18 = localDate14.getYearOfEra();
        org.joda.time.LocalDate localDate20 = localDate14.plusDays(1970);
        org.joda.time.LocalDate localDate21 = localDate13.withFields((org.joda.time.ReadablePartial) localDate20);
        boolean boolean22 = localDate0.equals((java.lang.Object) localDate21);
        org.joda.time.LocalDate localDate24 = localDate0.withYear(100);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((java.lang.Object) localDate24, dateTimeZone25);
        org.joda.time.LocalDate.Property property27 = localDate24.dayOfWeek();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((java.lang.Object) localDate24);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localDate28.toDateTimeAtStartOfDay(dateTimeZone29);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1790553600000L + "'", long9 == 1790553600000L);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2026 + "'", int18 == 2026);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate.Property property9 = localDate8.dayOfWeek();
        int int10 = localDate8.getDayOfMonth();
        org.joda.time.LocalTime localTime11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate8.toDateTime(localTime11, dateTimeZone12);
        org.joda.time.LocalDate.Property property14 = localDate8.yearOfEra();
        org.joda.time.LocalDate localDate16 = localDate8.minusDays(271);
        org.joda.time.LocalDate.Property property17 = localDate16.weekyear();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate19 = localDate16.minus(readablePeriod18);
        org.joda.time.LocalDate.Property property20 = localDate16.dayOfYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight5 = localDate1.toDateMidnight();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property8 = localDate7.year();
        org.joda.time.Chronology chronology9 = localDate7.getChronology();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((java.lang.Object) "2026", chronology9);
        int int11 = localDate10.getYearOfEra();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2026 + "'", int11 == 2026);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalTime localTime7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate0.toDateTime(localTime7, dateTimeZone8);
        org.joda.time.LocalDate.Property property10 = localDate0.dayOfWeek();
        org.joda.time.LocalDate.Property property11 = localDate0.era();
        org.joda.time.LocalDate localDate13 = localDate0.withYear(743);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = localDate13.getValue((-1790557199));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1790557199");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        long long9 = localDate0.getLocalMillis();
        org.joda.time.LocalDate.Property property10 = localDate0.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = localDate0.isSupported(dateTimeFieldType11);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate17 = localDate14.withPeriodAdded(readablePeriod15, (int) (byte) -1);
        int int18 = localDate14.getYearOfEra();
        org.joda.time.LocalDate localDate20 = localDate14.plusDays(1970);
        org.joda.time.LocalDate localDate21 = localDate13.withFields((org.joda.time.ReadablePartial) localDate20);
        boolean boolean22 = localDate0.equals((java.lang.Object) localDate21);
        org.joda.time.LocalDate localDate24 = localDate0.withYear(100);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((java.lang.Object) localDate24, dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = localDate26.toDateTimeAtMidnight(dateTimeZone27);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1790553600000L + "'", long9 == 1790553600000L);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2026 + "'", int18 == 2026);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(dateTime28);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = localDate0.toDateMidnight(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate0.toDateTimeAtStartOfDay(dateTimeZone10);
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate15 = localDate12.withPeriodAdded(readablePeriod13, (int) (byte) -1);
        int int16 = localDate12.getYearOfEra();
        org.joda.time.LocalDate localDate18 = localDate12.plusDays(1970);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDate localDate21 = localDate12.withPeriodAdded(readablePeriod19, (int) (short) -1);
        org.joda.time.LocalDate.Property property22 = localDate12.dayOfYear();
        org.joda.time.LocalDate localDate24 = property22.addToCopy(28);
        long long25 = property22.getMillis();
        java.lang.String str26 = property22.getAsText();
        org.joda.time.DateTimeField dateTimeField27 = property22.getField();
        org.joda.time.LocalDate.Property property28 = new org.joda.time.LocalDate.Property(localDate0, dateTimeField27);
        org.joda.time.LocalDate localDate29 = property28.roundCeilingCopy();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2026 + "'", int16 == 2026);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1790553600000L + "'", long25 == 1790553600000L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "271" + "'", str26, "271");
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(localDate29);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        org.joda.time.LocalDate localDate6 = localDate1.plusWeeks(0);
        org.joda.time.LocalDate localDate8 = localDate6.withYear((int) ' ');
        org.joda.time.LocalDate localDate10 = localDate6.withYearOfCentury((int) (byte) 1);
        int int11 = localDate6.getDayOfMonth();
        int int12 = localDate6.getDayOfMonth();
        org.joda.time.LocalDate.Property property13 = localDate6.yearOfCentury();
        org.joda.time.LocalDate localDate15 = localDate6.plusMonths((int) '4');
        org.joda.time.Chronology chronology16 = localDate6.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) "\u0e1e\u0e24.", chronology16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"??.\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 28 + "'", int11 == 28);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 28 + "'", int12 == 28);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property3.getAsShortText(locale7);
        org.joda.time.LocalDateTime localDateTime9 = property3.roundHalfCeilingCopy();
        int int10 = localDateTime9.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.monthOfYear();
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        org.joda.time.LocalDateTime.Property property17 = new org.joda.time.LocalDateTime.Property(localDateTime9, dateTimeField16);
        org.joda.time.Chronology chronology18 = property17.getChronology();
        long long19 = property17.getMillis();
        java.lang.String str20 = property17.getAsShortText();
        org.joda.time.LocalDateTime localDateTime21 = property17.getLocalDateTime();
        int int22 = localDateTime21.getMinuteOfHour();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 25200000L + "'", long19 == 25200000L);
// flaky "1) test4085(org.joda.time.RegressionTest8)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u0e21\u0e04." + "'", str20, "\u0e21\u0e04.");
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate9 = localDate0.withPeriodAdded(readablePeriod7, (int) (short) -1);
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate13 = localDate10.withPeriodAdded(readablePeriod11, (int) (byte) -1);
        org.joda.time.LocalDate localDate15 = localDate10.minusWeeks((int) (short) 0);
        int int16 = localDate0.compareTo((org.joda.time.ReadablePartial) localDate10);
        org.joda.time.LocalDate localDate18 = localDate0.withYear((-3205));
        org.joda.time.DateTime dateTime19 = localDate0.toDateTimeAtMidnight();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate localDate10 = localDate8.minusYears(25200052);
        org.joda.time.Interval interval11 = localDate10.toInterval();
        org.joda.time.LocalDate localDate13 = localDate10.minusWeeks(26);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) localDate13, dateTimeZone14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localDateTime2.getFields();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = localDateTime2.toString(dateTimeFormatter4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withWeekOfWeekyear((int) (short) 10);
        int int8 = localDateTime2.getEra();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime2.withCenturyOfEra(333);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withDayOfMonth(19);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.year();
        java.lang.String str17 = property16.getAsText();
        long long18 = property16.remainder();
        long long19 = property16.remainder();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property16.getFieldType();
        org.joda.time.LocalDateTime.Property property21 = localDateTime10.property(dateTimeFieldType20);
        org.joda.time.DurationFieldType durationFieldType22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = localDateTime10.withFieldAdded(durationFieldType22, 28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T07:00:00.000" + "'", str5, "1970-01-01T07:00:00.000");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970" + "'", str17, "1970");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1580400052L + "'", long18 == 1580400052L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1580400052L + "'", long19 == 1580400052L);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.DurationField durationField4 = property3.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.yearOfEra();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.monthOfYear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withSecondOfMinute(55);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.plusMillis(5232);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.withWeekyear(22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        java.util.Locale locale5 = null;
        int int6 = property4.getMaximumTextLength(locale5);
        int int7 = property4.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property4.getFieldType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        int int12 = localDateTime5.getValue(2);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime5.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusMinutes(0);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) '4');
        int int19 = localDateTime18.getYearOfEra();
        org.joda.time.LocalDateTime.Property property20 = localDateTime18.minuteOfHour();
        org.joda.time.LocalDateTime.Property property21 = localDateTime18.era();
        org.joda.time.LocalDateTime.Property property22 = localDateTime18.hourOfDay();
        int int23 = localDateTime18.getYear();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withLocalMillis((long) 28320052);
        org.joda.time.Chronology chronology28 = localDateTime27.getChronology();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime18, chronology28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime18.minusMinutes(1);
        boolean boolean32 = localDateTime14.isBefore((org.joda.time.ReadablePartial) localDateTime18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime34 = localDateTime14.withEra((-2026));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2026 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1970 + "'", int23 == 1970);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDateTime1.toDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.era();
        org.joda.time.DateTimeField dateTimeField6 = property5.getField();
        org.joda.time.DurationField durationField7 = property5.getLeapDurationField();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((java.lang.Object) property5, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNull(durationField7);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now(chronology6);
        int int8 = localDateTime7.getWeekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.plus(readableDuration9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 40 + "'", int8 == 40);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.withDurationAdded(readableDuration9, 50);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDateTime11.toDateTime(dateTimeZone13);
        int int15 = localDateTime11.getMillisOfSecond();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("2026-09-28");
        int int2 = localDate1.getYearOfCentury();
        org.joda.time.LocalDate.Property property3 = localDate1.dayOfWeek();
        org.joda.time.LocalDate localDate5 = property3.addWrapFieldToCopy(1969);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks(10);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusDays((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusMonths(9);
        int int15 = localDateTime12.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) '4');
        int int18 = localDateTime17.getYearOfEra();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime21 = property19.addToCopy((int) '4');
        int int22 = localDateTime21.getEra();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.plus(readableDuration23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime21.plusMillis(0);
        int int28 = localDateTime21.getValue(2);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime21.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.minusMinutes(0);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = localDateTime32.toDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime12.withFields((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.LocalDateTime.Property property36 = localDateTime32.yearOfEra();
        org.joda.time.LocalDateTime localDateTime37 = property36.getLocalDateTime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1970 + "'", int18 == 1970);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime37);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        java.lang.String str6 = property3.getAsString();
        org.joda.time.LocalDateTime localDateTime7 = property3.withMaximumValue();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        org.joda.time.LocalDateTime localDateTime10 = property8.addToCopy((long) 242);
        java.lang.String str11 = property8.getAsString();
        int int12 = property8.getMaximumValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970" + "'", str11, "1970");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 292278993 + "'", int12 == 292278993);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        int int5 = localDate0.getWeekOfWeekyear();
        int int6 = localDate0.size();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 40 + "'", int5 == 40);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        java.lang.String str3 = property2.toString();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDateTime5.toDateTime(dateTimeZone6);
        int int8 = property2.getDifference((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.LocalDateTime localDateTime10 = property2.addToCopy(12);
        java.lang.String str11 = property2.getName();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withCenturyOfEra(1);
        int int15 = localDateTime12.getYear();
        org.joda.time.DateTime dateTime16 = localDateTime12.toDateTime();
        long long17 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime16);
        java.lang.String str18 = property2.getAsText();
        org.joda.time.LocalDateTime localDateTime19 = property2.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withCenturyOfEra(2);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusYears(652);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.plusWeeks(50);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[centuryOfEra]" + "'", str3, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "centuryOfEra" + "'", str11, "centuryOfEra");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2026 + "'", int15 == 2026);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "19" + "'", str18, "19");
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(2026);
        org.joda.time.DateMidnight dateMidnight12 = localDate11.toDateMidnight();
        int int13 = localDate11.getDayOfMonth();
        long long14 = localDate11.getLocalMillis();
        int int15 = localDate11.getDayOfYear();
        org.joda.time.LocalDate.Property property16 = localDate11.centuryOfEra();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 28 + "'", int13 == 28);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-4326220800000L) + "'", long14 == (-4326220800000L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 333 + "'", int15 == 333);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property10 = localDate9.weekOfWeekyear();
        int int11 = localDate9.getWeekyear();
        org.joda.time.LocalDate.Property property12 = localDate9.weekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusWeeks(10);
        org.joda.time.LocalDate localDate16 = localDate9.withDayOfYear(55);
        org.joda.time.Interval interval17 = localDate16.toInterval();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(interval17);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minusHours((-1));
        java.util.Date date12 = localDateTime7.toDate();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.fromDateFields(date12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.monthOfYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(date12);
// flaky "2) test4102(org.joda.time.RegressionTest8)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 08:00:34 ICT 2026");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks(10);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusDays((int) (short) -1);
        int int13 = localDateTime12.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.minuteOfHour();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        int int10 = localDateTime7.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withDayOfMonth((int) (short) 1);
        java.util.Date date13 = localDateTime12.toDate();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime12, dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.withCenturyOfEra(18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky "3) test4104(org.joda.time.RegressionTest8)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 28834694 + "'", int10 == 28834694);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(date13);
// flaky "1) test4104(org.joda.time.RegressionTest8)":         org.junit.Assert.assertEquals(date13.toString(), "Tue Sep 01 08:00:34 ICT 2026");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        int int11 = localDateTime5.getYear();
        int int12 = localDateTime5.getYearOfCentury();
        int int13 = localDateTime5.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property14 = localDateTime5.hourOfDay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 70 + "'", int12 == 70);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate6 = property4.addToCopy(10);
        org.joda.time.LocalDate localDate8 = property4.addToCopy(1970);
        int int9 = localDate8.getYearOfEra();
        org.joda.time.LocalDate.Property property10 = localDate8.weekOfWeekyear();
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate14 = localDate11.withPeriodAdded(readablePeriod12, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight15 = localDate11.toDateMidnight();
        org.joda.time.LocalDate localDate17 = localDate11.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property18 = localDate17.year();
        org.joda.time.DateTimeField dateTimeField19 = property18.getField();
        org.joda.time.LocalDate.Property property20 = new org.joda.time.LocalDate.Property(localDate8, dateTimeField19);
        org.joda.time.DateTime dateTime21 = localDate8.toDateTimeAtStartOfDay();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2007 + "'", int9 == 2007);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        java.util.Locale locale11 = null;
        java.lang.String str12 = localDate9.toString("271", locale11);
        org.joda.time.DateTime dateTime13 = localDate9.toDateTimeAtMidnight();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate15 = localDate9.plus(readablePeriod14);
        org.joda.time.LocalDate localDate17 = localDate15.minusMonths(20);
        org.joda.time.DateMidnight dateMidnight18 = localDate15.toDateMidnight();
        org.joda.time.LocalDate localDate20 = localDate15.plusYears((int) (byte) 0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "271" + "'", str12, "271");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(localDate20);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        int int10 = localDate5.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight11 = localDate5.toDateMidnight();
        org.joda.time.LocalDate.Property property12 = localDate5.year();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate15 = localDate5.withPeriodAdded(readablePeriod13, 1970);
        org.joda.time.LocalDate localDate17 = localDate15.withYear(3);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 28 + "'", int10 == 28);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime1.withHourOfDay((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withPeriodAdded(readablePeriod14, (int) '#');
        org.joda.time.LocalDateTime.Property property17 = localDateTime13.dayOfYear();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime19 = property17.roundFloorCopy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        boolean boolean10 = localDate7.equals((java.lang.Object) 100.0d);
        org.joda.time.LocalDate.Property property11 = localDate7.era();
        org.joda.time.LocalDate.Property property12 = localDate7.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType13 = null;
        boolean boolean14 = localDate7.isSupported(durationFieldType13);
        org.joda.time.LocalDate localDate16 = localDate7.withCenturyOfEra(11);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        org.joda.time.LocalDate localDate6 = localDate1.plusWeeks(0);
        org.joda.time.LocalDate localDate8 = localDate6.withYear((int) ' ');
        org.joda.time.LocalDate localDate10 = localDate8.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property11 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate16 = localDate13.withPeriodAdded(readablePeriod14, (int) (byte) -1);
        int int17 = localDate13.getYearOfEra();
        org.joda.time.LocalDate localDate19 = localDate13.plusDays(1970);
        org.joda.time.LocalDate localDate20 = localDate12.withFields((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.LocalDate.Property property21 = localDate19.monthOfYear();
        org.joda.time.LocalDate localDate23 = localDate19.withCenturyOfEra((int) '4');
        org.joda.time.LocalDate localDate25 = localDate23.withDayOfMonth((int) (byte) 10);
        boolean boolean26 = localDate8.isAfter((org.joda.time.ReadablePartial) localDate25);
        org.joda.time.LocalDate.Property property27 = localDate25.dayOfMonth();
        org.joda.time.LocalDate localDate28 = property27.roundHalfFloorCopy();
        org.joda.time.Chronology chronology29 = localDate28.getChronology();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(25200000L, chronology29);
        org.joda.time.LocalDate.Property property31 = localDate30.dayOfWeek();
        java.util.Locale locale32 = null;
        int int33 = property31.getMaximumShortTextLength(locale32);
        org.joda.time.LocalDate localDate34 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDate localDate37 = localDate34.withPeriodAdded(readablePeriod35, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight38 = localDate34.toDateMidnight();
        org.joda.time.LocalDate localDate40 = localDate34.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property41 = localDate34.dayOfYear();
        int int42 = property41.getMaximumValue();
        org.joda.time.LocalDate localDate43 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalDate localDate46 = localDate43.withPeriodAdded(readablePeriod44, (int) (byte) -1);
        org.joda.time.LocalDate localDate48 = localDate43.plusWeeks(0);
        org.joda.time.LocalDate localDate50 = localDate48.withYear((int) ' ');
        org.joda.time.LocalDate localDate52 = localDate48.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalTime localTime53 = null;
        org.joda.time.DateTime dateTime54 = localDate48.toDateTime(localTime53);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateTime dateTime56 = localDate48.toDateTimeAtCurrentTime(dateTimeZone55);
        int int57 = property41.getDifference((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.LocalDate localDate58 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.LocalDate localDate61 = localDate58.withPeriodAdded(readablePeriod59, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight62 = localDate58.toDateMidnight();
        org.joda.time.LocalDate localDate64 = localDate58.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property65 = localDate58.dayOfYear();
        org.joda.time.DurationField durationField66 = property65.getDurationField();
        java.lang.String str67 = property65.getAsText();
        boolean boolean68 = property65.isLeap();
        org.joda.time.LocalDate localDate70 = property65.setCopy((int) ' ');
        org.joda.time.DateTime dateTime71 = localDate70.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime72 = localDate70.toDateTimeAtStartOfDay();
        int int73 = property41.compareTo((org.joda.time.ReadableInstant) dateTime72);
        int int74 = property31.compareTo((org.joda.time.ReadableInstant) dateTime72);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2026 + "'", int17 == 2026);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(dateMidnight38);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 365 + "'", int42 == 365);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(localDate58);
        org.junit.Assert.assertNotNull(localDate61);
        org.junit.Assert.assertNotNull(dateMidnight62);
        org.junit.Assert.assertNotNull(localDate64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(durationField66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "271" + "'", str67, "271");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(localDate70);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withCenturyOfEra(1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.yearOfCentury();
        org.joda.time.DurationField durationField4 = property3.getLeapDurationField();
        org.joda.time.DateTimeField dateTimeField5 = property3.getField();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        java.util.Locale locale11 = null;
        java.lang.String str12 = localDate9.toString("271", locale11);
        org.joda.time.DateTime dateTime13 = localDate9.toDateTimeAtMidnight();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate15 = localDate9.plus(readablePeriod14);
        org.joda.time.LocalDate localDate17 = localDate15.minusMonths(20);
        org.joda.time.DateMidnight dateMidnight18 = localDate15.toDateMidnight();
        org.joda.time.LocalTime localTime19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = localDate15.toLocalDateTime(localTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The time must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "271" + "'", str12, "271");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateMidnight18);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localDateTime2.getFields();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = localDateTime2.toString(dateTimeFormatter4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withWeekOfWeekyear((int) (short) 10);
        int int8 = localDateTime2.getEra();
        org.joda.time.LocalDateTime.Property property9 = localDateTime2.dayOfYear();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDateTime localDateTime12 = property9.addWrapFieldToCopy(2007);
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T07:00:00.000" + "'", str5, "1970-01-01T07:00:00.000");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.withYearOfEra(69);
        int int12 = localDate11.getDayOfWeek();
        int int13 = localDate11.getWeekyear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 69 + "'", int13 == 69);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate.Property property9 = localDate5.weekOfWeekyear();
        org.joda.time.LocalDate localDate10 = property9.withMaximumValue();
        org.joda.time.LocalDate.Property property11 = localDate10.dayOfYear();
        java.util.Locale locale12 = null;
        int int13 = property11.getMaximumShortTextLength(locale12);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate11 = localDate8.withPeriodAdded(readablePeriod9, (int) (byte) -1);
        org.joda.time.LocalDate localDate13 = localDate8.plusWeeks(0);
        org.joda.time.LocalDate localDate15 = localDate13.withYear((int) ' ');
        org.joda.time.LocalDate localDate17 = localDate13.withYearOfCentury((int) (byte) 1);
        int int18 = localDate13.getDayOfMonth();
        boolean boolean20 = localDate13.equals((java.lang.Object) "Property[minuteOfHour]");
        org.joda.time.LocalDate localDate21 = localDate5.withFields((org.joda.time.ReadablePartial) localDate13);
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        int int23 = localDate21.getYearOfCentury();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 28 + "'", int18 == 28);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 26 + "'", int23 == 26);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.Interval interval4 = property2.toInterval();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(1799020800000L, dateTimeZone1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = localDate2.toString("2007", locale4);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate9 = localDate6.withPeriodAdded(readablePeriod7, (int) (byte) -1);
        int int10 = localDate6.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        int int12 = localDate6.indexOf(dateTimeFieldType11);
        org.joda.time.LocalDate localDate14 = localDate6.withWeekyear((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate17 = localDate6.withPeriodAdded(readablePeriod15, 59);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = localDate6.toDateMidnight(dateTimeZone18);
        org.joda.time.Chronology chronology20 = localDate6.getChronology();
        org.joda.time.LocalDate.Property property21 = localDate6.yearOfCentury();
        org.joda.time.LocalDate localDate22 = property21.roundHalfCeilingCopy();
        org.joda.time.DurationField durationField23 = property21.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property21.getFieldType();
        boolean boolean25 = localDate2.isSupported(dateTimeFieldType24);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2007" + "'", str5, "2007");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2026 + "'", int10 == 2026);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate localDate10 = localDate8.minusYears(25200052);
        org.joda.time.Interval interval11 = localDate10.toInterval();
        org.joda.time.LocalDate.Property property12 = localDate10.monthOfYear();
        org.joda.time.DateTime dateTime13 = localDate10.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate.Property property14 = localDate10.dayOfMonth();
        org.joda.time.LocalDate localDate15 = property14.roundFloorCopy();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        java.lang.String str3 = property2.toString();
        int int4 = property2.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusSeconds(1970);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[centuryOfEra]" + "'", str3, "Property[centuryOfEra]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate0.year();
        org.joda.time.LocalDate localDate5 = property3.addToCopy(3);
        org.joda.time.LocalDate localDate6 = property3.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((java.lang.Object) localDate6, dateTimeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = localDate8.withYearOfCentury(1955);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1955 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalTime localTime7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate0.toDateTime(localTime7, dateTimeZone8);
        org.joda.time.DateTime dateTime10 = localDate0.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property12 = localDate11.dayOfYear();
        int int13 = property12.getMinimumValueOverall();
        org.joda.time.LocalDate localDate15 = property12.addWrapFieldToCopy((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property12.getFieldType();
        int int17 = localDate0.get(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 271 + "'", int17 == 271);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 324);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("1970-09-28");
        int int2 = localDate1.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate6 = property4.addToCopy(10);
        org.joda.time.LocalDate localDate8 = property4.addToCopy(1970);
        int int9 = localDate8.getYearOfEra();
        org.joda.time.LocalDate.Property property10 = localDate8.weekOfWeekyear();
        java.lang.String str11 = property10.getAsShortText();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate16 = localDate13.withPeriodAdded(readablePeriod14, (int) (byte) -1);
        int int17 = localDate13.getYearOfEra();
        org.joda.time.LocalDate localDate19 = localDate13.plusDays(1970);
        org.joda.time.LocalDate localDate20 = localDate12.withFields((org.joda.time.ReadablePartial) localDate19);
        boolean boolean22 = localDate19.equals((java.lang.Object) 100.0d);
        org.joda.time.LocalDate.Property property23 = localDate19.era();
        boolean boolean24 = property10.equals((java.lang.Object) localDate19);
        int int25 = localDate19.getWeekyear();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2007 + "'", int9 == 2007);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "40" + "'", str11, "40");
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2026 + "'", int17 == 2026);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2032 + "'", int25 == 2032);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(70, 25200052, 999, (-1790557193), 36526, 39);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1790557193 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        int int7 = property3.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime8 = property3.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.minusSeconds(14403717);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.plusWeeks(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        java.util.Locale locale11 = null;
        java.lang.String str12 = localDate9.toString("271", locale11);
        org.joda.time.DateTime dateTime13 = localDate9.toDateTimeAtMidnight();
        org.joda.time.LocalTime localTime14 = null;
        org.joda.time.DateTime dateTime15 = localDate9.toDateTime(localTime14);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "271" + "'", str12, "271");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDateTime1.toDateTime(dateTimeZone3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withDurationAdded(readableDuration5, (int) (byte) 10);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekOfWeekyear();
        int int9 = property8.getMaximumValue();
        org.joda.time.DurationField durationField10 = property8.getRangeDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        int int12 = localDateTime5.getValue(2);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime5.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusMinutes(0);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusSeconds(366);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withMillisOfSecond((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withMillisOfDay(7);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        java.util.Locale locale5 = null;
        java.lang.String str6 = localDateTime2.toString("333", locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = localDateTime2.toString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "333" + "'", str6, "333");
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        int int5 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate7 = localDate0.withDayOfYear(100);
        org.joda.time.LocalDate localDate9 = localDate7.minusWeeks(0);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtCurrentTime(dateTimeZone10);
        org.joda.time.LocalDate.Property property12 = localDate7.weekOfWeekyear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minusHours((-1));
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.minusHours(100);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusHours(20);
        org.joda.time.LocalDateTime.Property property16 = localDateTime13.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime18 = property16.addWrapFieldToCopy(31);
        org.joda.time.LocalDateTime localDateTime20 = property16.addToCopy(2007);
        org.joda.time.Chronology chronology21 = localDateTime20.getChronology();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now(chronology21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.plusYears((int) (short) -1);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime7.withDurationAdded(readableDuration12, 0);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusSeconds(0);
        int int20 = localDateTime17.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) '4');
        int int23 = localDateTime22.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property24 = localDateTime22.dayOfYear();
        org.joda.time.LocalDateTime.Property property25 = localDateTime22.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime26 = property25.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property25.getFieldType();
        int int28 = localDateTime17.indexOf(dateTimeFieldType27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime14.property(dateTimeFieldType27);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime14.minusMinutes(55);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime31);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate10 = localDate7.minus(readablePeriod9);
        org.joda.time.LocalDate.Property property11 = localDate7.weekOfWeekyear();
        int int12 = localDate7.getYear();
        org.joda.time.LocalDate localDate14 = localDate7.withYearOfEra(7);
        org.joda.time.LocalDate localDate16 = localDate14.withYearOfCentury(69);
        java.lang.String str18 = localDate14.toString("28");
        org.joda.time.DurationFieldType durationFieldType19 = null;
        boolean boolean20 = localDate14.isSupported(durationFieldType19);
        org.joda.time.LocalTime localTime21 = null;
        org.joda.time.DateTime dateTime22 = localDate14.toDateTime(localTime21);
        org.joda.time.LocalDate localDate24 = localDate14.minusWeeks(28787742);
        org.joda.time.LocalDate.Property property25 = localDate14.year();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2032 + "'", int12 == 2032);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "28" + "'", str18, "28");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate6 = property4.addToCopy(10);
        org.joda.time.LocalDate localDate8 = property4.addToCopy(1970);
        int int9 = localDate8.getYearOfEra();
        org.joda.time.LocalDate.Property property10 = localDate8.weekOfWeekyear();
        org.joda.time.LocalDate localDate11 = property10.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate13 = property10.addWrapFieldToCopy(28320052);
        org.joda.time.Chronology chronology14 = property10.getChronology();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2007 + "'", int9 == 2007);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.weekyear();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = property7.getDifference(readableInstant8);
        org.joda.time.LocalDate localDate10 = property7.withMinimumValue();
        org.joda.time.LocalDate localDate12 = property7.addWrapFieldToCopy(1);
        org.joda.time.LocalDate localDate13 = property7.roundFloorCopy();
        org.joda.time.LocalDate localDate15 = localDate13.withYearOfCentury((int) (short) 10);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        long long9 = localDate0.getLocalMillis();
        org.joda.time.LocalDate.Property property10 = localDate0.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = localDate0.isSupported(dateTimeFieldType11);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate17 = localDate14.withPeriodAdded(readablePeriod15, (int) (byte) -1);
        int int18 = localDate14.getYearOfEra();
        org.joda.time.LocalDate localDate20 = localDate14.plusDays(1970);
        org.joda.time.LocalDate localDate21 = localDate13.withFields((org.joda.time.ReadablePartial) localDate20);
        boolean boolean22 = localDate0.equals((java.lang.Object) localDate21);
        org.joda.time.LocalDate localDate24 = localDate21.minusMonths(4);
        java.lang.String str25 = localDate24.toString();
        org.joda.time.Interval interval26 = localDate24.toInterval();
        org.joda.time.LocalDate.Property property27 = localDate24.dayOfYear();
        org.joda.time.LocalTime localTime28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localDate24.toDateTime(localTime28, dateTimeZone29);
        org.joda.time.LocalDate.Property property31 = localDate24.year();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1790553600000L + "'", long9 == 1790553600000L);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2026 + "'", int18 == 2026);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2031-10-19" + "'", str25, "2031-10-19");
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        long long9 = localDate0.getLocalMillis();
        org.joda.time.LocalDate.Property property10 = localDate0.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = localDate0.isSupported(dateTimeFieldType11);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate17 = localDate14.withPeriodAdded(readablePeriod15, (int) (byte) -1);
        int int18 = localDate14.getYearOfEra();
        org.joda.time.LocalDate localDate20 = localDate14.plusDays(1970);
        org.joda.time.LocalDate localDate21 = localDate13.withFields((org.joda.time.ReadablePartial) localDate20);
        boolean boolean22 = localDate0.equals((java.lang.Object) localDate21);
        org.joda.time.LocalDate localDate24 = localDate0.withYear(100);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((java.lang.Object) localDate24, dateTimeZone25);
        org.joda.time.LocalDate.Property property27 = localDate24.dayOfWeek();
        org.joda.time.LocalDate localDate28 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDate localDate31 = localDate28.withPeriodAdded(readablePeriod29, (int) (byte) -1);
        org.joda.time.LocalDate localDate33 = localDate28.plusWeeks(0);
        org.joda.time.LocalDate localDate35 = localDate33.withYear((int) ' ');
        org.joda.time.LocalDate localDate37 = localDate33.withYearOfCentury((int) (byte) 1);
        int int38 = localDate33.getDayOfMonth();
        int int39 = localDate33.getDayOfMonth();
        org.joda.time.LocalDate.Property property40 = localDate33.yearOfCentury();
        org.joda.time.LocalDate localDate42 = localDate33.plusMonths((int) '4');
        org.joda.time.LocalDate.Property property43 = localDate33.year();
        org.joda.time.Chronology chronology44 = property43.getChronology();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate(chronology44);
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((java.lang.Object) localDate24, chronology44);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1790553600000L + "'", long9 == 1790553600000L);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2026 + "'", int18 == 2026);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 28 + "'", int38 == 28);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 28 + "'", int39 == 28);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(chronology44);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = localDate5.isSupported(dateTimeFieldType6);
        org.joda.time.LocalDate.Property property8 = localDate5.dayOfWeek();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        int int9 = localDateTime8.getYearOfEra();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime12 = property10.addToCopy((int) '4');
        org.joda.time.Chronology chronology13 = property10.getChronology();
        java.util.Locale locale14 = null;
        java.lang.String str15 = property10.getAsShortText(locale14);
        org.joda.time.LocalDateTime localDateTime16 = property10.roundHalfCeilingCopy();
        int int17 = localDateTime16.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localDateTime19.toDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime19.monthOfYear();
        org.joda.time.DateTimeField dateTimeField23 = property22.getField();
        org.joda.time.LocalDateTime.Property property24 = new org.joda.time.LocalDateTime.Property(localDateTime16, dateTimeField23);
        int int26 = localDateTime16.getValue((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = localDateTime16.toDateTime(dateTimeZone27);
        org.joda.time.Chronology chronology29 = localDateTime16.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(70, 26, 1970, 652, 2052, 3, 28319952, chronology29);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 652 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(chronology29);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDateTime1.toDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.secondOfMinute();
        int int6 = property5.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime8 = property5.addWrapFieldToCopy(7);
        long long9 = property5.getMillis();
        org.joda.time.LocalDateTime localDateTime10 = property5.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minus(readablePeriod11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withYearOfCentury((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 25200052L + "'", long9 == 25200052L);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate5.withPeriodAdded(readablePeriod6, 0);
        org.joda.time.LocalDate localDate10 = localDate8.minusMonths(40);
        int int11 = localDate10.getCenturyOfEra();
        long long12 = localDate10.getLocalMillis();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1685232000000L + "'", long12 == 1685232000000L);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.year();
        java.util.Locale locale11 = null;
        int int12 = property10.getMaximumShortTextLength(locale11);
        org.joda.time.LocalDateTime localDateTime13 = property10.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusWeeks(2032);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) '4');
        int int20 = localDateTime19.getYearOfEra();
        org.joda.time.LocalDateTime.Property property21 = localDateTime19.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime23 = property21.addToCopy((int) '4');
        org.joda.time.Chronology chronology24 = property21.getChronology();
        java.util.Locale locale25 = null;
        java.lang.String str26 = property21.getAsShortText(locale25);
        org.joda.time.LocalDateTime localDateTime27 = property21.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) '4');
        int int30 = localDateTime29.getYearOfEra();
        org.joda.time.LocalDateTime.Property property31 = localDateTime29.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime33 = property31.addToCopy((int) '4');
        org.joda.time.Chronology chronology34 = property31.getChronology();
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now(chronology34);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withDurationAdded(readableDuration36, 53);
        boolean boolean39 = localDateTime27.equals((java.lang.Object) localDateTime35);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime35.minusMillis(100);
        org.joda.time.Chronology chronology42 = localDateTime41.getChronology();
        org.joda.time.LocalDateTime localDateTime43 = org.joda.time.LocalDateTime.now(chronology42);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(chronology42);
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(1L, chronology42);
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(chronology42);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((java.lang.Object) 1L, chronology42);
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(chronology42);
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = localDateTime50.toDateTime(dateTimeZone51);
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeZone51);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.weekyear();
        int int55 = localDateTime53.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime((long) '4');
        int int58 = localDateTime57.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property59 = localDateTime57.dayOfYear();
        org.joda.time.LocalDateTime.Property property60 = localDateTime57.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime61 = property60.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = property60.getFieldType();
        boolean boolean63 = localDateTime53.isSupported(dateTimeFieldType62);
        org.joda.time.LocalDateTime.Property property64 = localDateTime48.property(dateTimeFieldType62);
        int int65 = localDateTime15.get(dateTimeFieldType62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1970 + "'", int30 == 1970);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2026 + "'", int55 == 2026);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(dateTimeFieldType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        boolean boolean6 = property5.isLeap();
        java.util.Locale locale7 = null;
        int int8 = property5.getMaximumTextLength(locale7);
        org.joda.time.LocalDateTime localDateTime10 = property5.addToCopy((long) 9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.weekyear();
        org.joda.time.LocalDateTime localDateTime12 = property11.withMaximumValue();
        org.joda.time.DurationField durationField13 = property11.getRangeDurationField();
        org.joda.time.DurationField durationField14 = property11.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime15 = property11.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime17 = property11.addToCopy(58);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withWeekOfWeekyear(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNull(durationField13);
        org.junit.Assert.assertNull(durationField14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minus(readablePeriod6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property9 = localDateTime1.dayOfMonth();
        org.joda.time.LocalDateTime.Property property10 = localDateTime1.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundCeilingCopy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withMillisOfDay(7);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) '4');
        int int6 = localDateTime5.getYearOfEra();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.minuteOfHour();
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.era();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundHalfFloorCopy();
        int int10 = localDateTime9.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withDayOfMonth(19);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) '4');
        int int18 = localDateTime17.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime25 = localDateTime17.withFields((org.joda.time.ReadablePartial) localDateTime24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime17.plusYears((int) (byte) -1);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plus(readableDuration28);
        int int30 = localDateTime29.size();
        int int31 = localDateTime29.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.plus(readableDuration34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime33.minusSeconds(0);
        int int38 = localDateTime33.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property39 = localDateTime33.year();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime33.plusDays(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = localDateTime41.getFieldType((int) (byte) 0);
        int int44 = localDateTime29.get(dateTimeFieldType43);
        boolean boolean45 = localDateTime15.isSupported(dateTimeFieldType43);
        int int46 = localDateTime9.get(dateTimeFieldType43);
        org.joda.time.LocalDateTime.Property property47 = localDateTime0.property(dateTimeFieldType43);
        java.util.Locale locale48 = null;
        java.lang.String str49 = property47.getAsText(locale48);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1969 + "'", int44 == 1969);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "2026" + "'", str49, "2026");
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(2026);
        org.joda.time.DateMidnight dateMidnight12 = localDate11.toDateMidnight();
        int int13 = localDate11.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = localDate11.toDateMidnight(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = localDate11.toDateTimeAtStartOfDay();
        int int17 = localDate11.size();
        java.util.Date date18 = localDate11.toDate();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 28 + "'", int13 == 28);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Wed Nov 28 00:00:00 ICT 1832");
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        long long9 = localDate0.getLocalMillis();
        org.joda.time.LocalDate.Property property10 = localDate0.dayOfMonth();
        org.joda.time.DurationField durationField11 = property10.getDurationField();
        org.joda.time.LocalDate localDate12 = property10.withMinimumValue();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1790553600000L + "'", long9 == 1790553600000L);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(41, 2001, 28833789, 18, 2037, 53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2037 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.year();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.plus(readableDuration11);
        int int13 = localDateTime12.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.plusHours(54013758);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusWeeks(1955);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate10 = localDate7.minus(readablePeriod9);
        org.joda.time.LocalDate.Property property11 = localDate7.weekOfWeekyear();
        java.util.Locale locale12 = null;
        int int13 = property11.getMaximumShortTextLength(locale12);
        org.joda.time.LocalDate localDate14 = property11.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate16 = property11.addToCopy(31);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks(1970);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMonthOfYear(2);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime15 = property13.addWrapFieldToCopy(743);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfDay(2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.monthOfYear();
        long long6 = property5.remainder();
        java.lang.String str7 = property5.getAsShortText();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 25200052L + "'", long6 == 25200052L);
// flaky "4) test4155(org.joda.time.RegressionTest8)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u0e21\u0e04." + "'", str7, "\u0e21\u0e04.");
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate0.minus(readablePeriod4);
        org.joda.time.DateTime dateTime6 = localDate5.toDateTimeAtMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Interval interval8 = localDate5.toInterval(dateTimeZone7);
        org.joda.time.LocalDate.Property property9 = localDate5.year();
        java.util.Locale locale10 = null;
        java.lang.String str11 = property9.getAsShortText(locale10);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026" + "'", str11, "2026");
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        long long5 = property4.getMillis();
        org.joda.time.LocalDateTime localDateTime6 = property4.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusYears(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25200052L + "'", long5 == 25200052L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withYear(10);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDateTime9.toDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withMillisOfSecond(28);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime7.withFields((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime7.minusWeeks((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = localDateTime7.withDate((int) (byte) -1, 3, 28320052);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28320052 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMinutes(31);
        long long14 = localDateTime13.getLocalMillis();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withYear(41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 27092052L + "'", long14 == 27092052L);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime1.withCenturyOfEra((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property14 = localDateTime1.weekyear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.withDayOfYear(4);
        org.joda.time.LocalDate localDate6 = localDate0.plusMonths(2);
        org.joda.time.LocalDate.Property property7 = localDate0.yearOfEra();
        org.joda.time.LocalDate.Property property8 = localDate0.centuryOfEra();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property8.getAsShortText(locale9);
        java.util.Locale locale11 = null;
        java.lang.String str12 = property8.getAsShortText(locale11);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "20" + "'", str10, "20");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "20" + "'", str12, "20");
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withSecondOfMinute((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withTime(39, 28815681, 2026, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate0.year();
        org.joda.time.LocalDate localDate5 = property3.addToCopy(3);
        org.joda.time.LocalDate localDate6 = property3.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate6.withEra(68);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 68 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime1.withHourOfDay((int) (byte) 0);
        int int14 = localDateTime13.getCenturyOfEra();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime17 = property15.addWrapFieldToCopy((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property15.getFieldType();
        org.joda.time.LocalDateTime localDateTime19 = property15.roundHalfCeilingCopy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 19 + "'", int14 == 19);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        int int11 = localDateTime5.getYear();
        int int12 = localDateTime5.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime5.withEra(28834694);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28834694 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 70 + "'", int12 == 70);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType12 = null;
        boolean boolean13 = localDateTime11.isSupported(durationFieldType12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.plusMillis(70);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusSeconds(1832);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) '4');
        int int20 = localDateTime19.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime27 = localDateTime19.withFields((org.joda.time.ReadablePartial) localDateTime26);
        java.util.Date date28 = localDateTime27.toDate();
        int int29 = localDateTime27.getDayOfYear();
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime32 = property30.addWrapFieldToCopy(5);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.withYearOfEra((int) '4');
        org.joda.time.LocalDateTime.Property property35 = localDateTime32.era();
        java.util.Locale locale36 = null;
        java.lang.String str37 = property35.getAsText(locale36);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = property35.getFieldType();
        int int39 = localDateTime17.indexOf(dateTimeFieldType38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
// flaky "5) test4166(org.joda.time.RegressionTest8)":         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u0e04\u0e28." + "'", str37, "\u0e04\u0e28.");
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withSecondOfMinute((int) ' ');
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readableDuration12);
        int int14 = localDateTime11.size();
        org.joda.time.LocalDateTime.Property property15 = localDateTime11.yearOfCentury();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) (short) 100, 2058, 14431826, 26, 67);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.withPeriodAdded(readablePeriod9, 2922789);
        java.lang.String str12 = localDateTime5.toString();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime5.plusSeconds(33);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime5.minusHours((-3205));
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusMillis(28);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.minus(readablePeriod19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01T07:52:00.052" + "'", str12, "1970-01-01T07:52:00.052");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate.Property property9 = localDate5.weekOfWeekyear();
        org.joda.time.LocalDate localDate11 = localDate5.plusMonths(28320052);
        org.joda.time.DateTime dateTime12 = localDate11.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate.Property property13 = localDate11.monthOfYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime8 = property3.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDateTime10.toDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withMillisOfSecond(28);
        int int16 = localDateTime15.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYear(28);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime8.withFields((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusMonths(14403717);
        java.util.Date date22 = localDateTime21.toDate();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDateTime21.toDateTime(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 19 + "'", int16 == 19);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Wed Apr 01 07:00:00 ICT 1200283");
        org.junit.Assert.assertNotNull(dateTime24);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        java.util.Date date6 = localDateTime1.toDate();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime.Property property8 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        int int11 = localDateTime9.size();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime1.withHourOfDay((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withPeriodAdded(readablePeriod14, (int) '#');
        org.joda.time.LocalDateTime.Property property17 = localDateTime13.dayOfYear();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusMinutes(55);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withDurationAdded(readableDuration21, 2922789);
        int int24 = localDateTime18.getDayOfMonth();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate localDate10 = localDate0.plusMonths((int) (short) 100);
        org.joda.time.LocalDate localDate12 = localDate10.plusYears((int) '#');
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = localDate12.toDateMidnight(dateTimeZone13);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateMidnight14);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate localDate8 = localDate0.minusYears(12);
        org.joda.time.LocalDate.Property property9 = localDate8.yearOfCentury();
        org.joda.time.LocalTime localTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDate8.toLocalDateTime(localTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The time must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        java.util.Locale locale7 = null;
        java.lang.String str8 = localDate5.toString("2032-02-19", locale7);
        int int9 = localDate5.getYearOfEra();
        org.joda.time.LocalDate localDate11 = localDate5.withLocalMillis(28740052L);
        org.joda.time.DateMidnight dateMidnight12 = localDate11.toDateMidnight();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2032-02-19" + "'", str8, "2032-02-19");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2026 + "'", int9 == 2026);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateMidnight12);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate6 = property4.addToCopy(10);
        org.joda.time.LocalDate localDate8 = property4.addToCopy(1970);
        int int9 = localDate8.getYearOfEra();
        org.joda.time.LocalDate.Property property10 = localDate8.weekOfWeekyear();
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate14 = localDate11.withPeriodAdded(readablePeriod12, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight15 = localDate11.toDateMidnight();
        org.joda.time.LocalDate localDate17 = localDate11.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property18 = localDate17.year();
        org.joda.time.DateTimeField dateTimeField19 = property18.getField();
        org.joda.time.LocalDate.Property property20 = new org.joda.time.LocalDate.Property(localDate8, dateTimeField19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDate localDate22 = localDate8.minus(readablePeriod21);
        org.joda.time.LocalDate.Property property23 = localDate22.weekOfWeekyear();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2007 + "'", int9 == 2007);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(property23);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        java.lang.String str3 = property2.toString();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDateTime5.toDateTime(dateTimeZone6);
        int int8 = property2.getDifference((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) '4');
        int int11 = localDateTime10.getYearOfEra();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.minuteOfHour();
        int int13 = property12.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime15 = property12.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime16 = property12.roundFloorCopy();
        int int17 = property2.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.yearOfEra();
        org.joda.time.LocalDateTime localDateTime20 = property18.addToCopy((long) 3);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.minuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[centuryOfEra]" + "'", str3, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 59 + "'", int13 == 59);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("2032-02-12", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        java.util.Date date6 = localDateTime1.toDate();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minusYears(5);
        int int9 = localDateTime1.getMillisOfSecond();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate10 = localDate0.minusMonths((int) '#');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate0.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.Interval interval14 = localDate0.toInterval(dateTimeZone13);
        int int15 = localDate0.getWeekOfWeekyear();
        int int16 = localDate0.size();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 40 + "'", int15 == 40);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 39130011, dateTimeZone1);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate9 = localDate0.withPeriodAdded(readablePeriod7, (int) (short) -1);
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(53);
        int int12 = localDate11.getEra();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        org.joda.time.LocalDate localDate10 = property9.roundHalfFloorCopy();
        org.joda.time.Chronology chronology11 = property9.getChronology();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property9.getAsShortText(locale12);
        org.joda.time.LocalDate localDate14 = property9.withMinimumValue();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate16 = localDate14.plus(readablePeriod15);
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate20 = localDate17.withPeriodAdded(readablePeriod18, (int) (byte) -1);
        org.joda.time.LocalDate localDate22 = localDate17.plusWeeks(0);
        org.joda.time.LocalDate localDate24 = localDate22.withYear((int) ' ');
        org.joda.time.LocalDate localDate26 = localDate24.minusDays((int) (short) 0);
        java.util.Locale locale28 = null;
        java.lang.String str29 = localDate26.toString("271", locale28);
        org.joda.time.DateTime dateTime30 = localDate26.toDateTimeAtMidnight();
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDate localDate32 = localDate26.plus(readablePeriod31);
        org.joda.time.Chronology chronology33 = localDate26.getChronology();
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((java.lang.Object) localDate14, chronology33);
        org.joda.time.LocalDate localDate36 = localDate14.withWeekyear(5);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
// flaky "6) test4184(org.joda.time.RegressionTest8)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u0e01\u0e1e." + "'", str13, "\u0e01\u0e1e.");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "271" + "'", str29, "271");
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(localDate36);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        int int8 = property7.getMaximumValue();
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate12 = localDate9.withPeriodAdded(readablePeriod10, (int) (byte) -1);
        org.joda.time.LocalDate localDate14 = localDate9.plusWeeks(0);
        org.joda.time.LocalDate localDate16 = localDate14.withYear((int) ' ');
        org.joda.time.LocalDate localDate18 = localDate14.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalTime localTime19 = null;
        org.joda.time.DateTime dateTime20 = localDate14.toDateTime(localTime19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate14.toDateTimeAtCurrentTime(dateTimeZone21);
        int int23 = property7.getDifference((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.LocalDate localDate24 = property7.withMaximumValue();
        int int25 = localDate24.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) '4');
        int int28 = localDateTime27.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime35 = localDateTime27.withFields((org.joda.time.ReadablePartial) localDateTime34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime27.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime27.withHourOfDay((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDateTime localDateTime42 = localDateTime39.withPeriodAdded(readablePeriod40, (int) '#');
        org.joda.time.LocalDateTime.Property property43 = localDateTime39.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime39, dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone47);
        org.joda.time.DateTimeField[] dateTimeFieldArray49 = localDateTime48.getFields();
        org.joda.time.LocalDateTime.Property property50 = localDateTime48.monthOfYear();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime48.withWeekyear(26);
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((long) '4');
        int int55 = localDateTime54.getYearOfEra();
        org.joda.time.LocalDateTime.Property property56 = localDateTime54.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime58 = property56.addToCopy((int) '4');
        int int59 = localDateTime58.getEra();
        org.joda.time.ReadableDuration readableDuration60 = null;
        org.joda.time.LocalDateTime localDateTime61 = localDateTime58.plus(readableDuration60);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime58.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration64 = null;
        org.joda.time.LocalDateTime localDateTime66 = localDateTime63.withDurationAdded(readableDuration64, 0);
        int int67 = localDateTime63.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime((long) '4');
        int int70 = localDateTime69.getYearOfEra();
        org.joda.time.LocalDateTime.Property property71 = localDateTime69.minuteOfHour();
        org.joda.time.LocalDateTime.Property property72 = localDateTime69.era();
        long long73 = property72.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = property72.getFieldType();
        boolean boolean75 = localDateTime63.isSupported(dateTimeFieldType74);
        int int76 = localDateTime52.get(dateTimeFieldType74);
        boolean boolean77 = localDateTime39.isSupported(dateTimeFieldType74);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate79 = localDate24.withField(dateTimeFieldType74, (-1790557228));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1790557228 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 365 + "'", int8 == 365);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 31 + "'", int25 == 31);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateTimeFieldArray49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1970 + "'", int55 == 1970);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 28320052 + "'", int67 == 28320052);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1970 + "'", int70 == 1970);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 25200052L + "'", long73 == 25200052L);
        org.junit.Assert.assertNotNull(dateTimeFieldType74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        int int12 = localDateTime5.getValue(2);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime5.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property15 = localDateTime5.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property16 = localDateTime5.monthOfYear();
        int int17 = localDateTime5.getWeekyear();
        int int18 = localDateTime5.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        java.lang.String str8 = property7.getAsString();
        org.joda.time.LocalDate localDate9 = property7.withMinimumValue();
        int int10 = localDate9.getYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026" + "'", str8, "2026");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-292275054) + "'", int10 == (-292275054));
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime(dateTimeZone8);
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        int int11 = property3.getMinimumValue();
        java.lang.String str12 = property3.getAsString();
        int int13 = property3.getLeapAmount();
        java.lang.String str14 = property3.getAsShortText();
        org.joda.time.DurationField durationField15 = property3.getDurationField();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 420L + "'", long10 == 420L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.weekyear();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = property7.getDifference(readableInstant8);
        org.joda.time.LocalDate localDate10 = property7.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate11 = property7.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate12 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate14 = localDate12.withYear(28);
        org.joda.time.LocalDate localDate16 = localDate12.plusMonths(12);
        org.joda.time.DurationFieldType durationFieldType17 = null;
        boolean boolean18 = localDate12.isSupported(durationFieldType17);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withSecondOfMinute((int) (short) 1);
        int int12 = localDateTime11.getEra();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.minus(readableDuration13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.plusMonths(271);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withCenturyOfEra(1);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.centuryOfEra();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withCenturyOfEra((int) (byte) 10);
        int int9 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) '4');
        int int12 = localDateTime11.getYearOfEra();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime15 = property13.addToCopy((int) '4');
        org.joda.time.Chronology chronology16 = property13.getChronology();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.minusHours((-1));
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusWeeks(52);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) '4');
        int int26 = localDateTime25.getYearOfEra();
        org.joda.time.LocalDateTime.Property property27 = localDateTime25.minuteOfHour();
        int int28 = property27.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime30 = property27.addWrapFieldToCopy((int) 'a');
        org.joda.time.Interval interval31 = property27.toInterval();
        java.util.Locale locale33 = null;
        org.joda.time.LocalDateTime localDateTime34 = property27.setCopy("9", locale33);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone36);
        org.joda.time.DateTimeField[] dateTimeFieldArray38 = localDateTime37.getFields();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.minusDays(59);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime34.withFields((org.joda.time.ReadablePartial) localDateTime40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime34.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime43 = property42.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((long) '4');
        int int46 = localDateTime45.getYearOfEra();
        org.joda.time.LocalDateTime.Property property47 = localDateTime45.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime49 = property47.addToCopy((int) '4');
        int int50 = localDateTime49.getEra();
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.LocalDateTime localDateTime52 = localDateTime49.plus(readableDuration51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.plusWeeks(10);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.minusDays((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.plusMonths(9);
        org.joda.time.LocalDateTime.Property property59 = localDateTime56.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = property59.getFieldType();
        int int61 = localDateTime43.get(dateTimeFieldType60);
        int int62 = localDateTime21.indexOf(dateTimeFieldType60);
        int int63 = localDateTime4.get(dateTimeFieldType60);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1970 + "'", int26 == 1970);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 59 + "'", int28 == 59);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(dateTimeFieldArray38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1970 + "'", int46 == 1970);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(dateTimeFieldType60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 4 + "'", int61 == 4);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 4 + "'", int63 == 4);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.year();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.plus(readableDuration11);
        int int13 = localDateTime9.getEra();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.minus(readablePeriod14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.weekyear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minus(readablePeriod6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime1.minuteOfHour();
        java.lang.String str9 = property8.getAsString();
        org.joda.time.LocalDateTime localDateTime10 = property8.withMaximumValue();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.yearOfEra();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withCenturyOfEra(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.withDayOfYear(4);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        org.joda.time.LocalDate localDate6 = property5.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate8 = localDate6.minusWeeks((int) (byte) 100);
        org.joda.time.LocalDate localDate10 = localDate6.plusWeeks(50);
        org.joda.time.DurationFieldType durationFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate10.withFieldAdded(durationFieldType11, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusMinutes(10);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) '4');
        int int8 = localDateTime7.getYearOfEra();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime11 = property9.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime12 = property9.roundFloorCopy();
        int int13 = localDateTime12.getHourOfDay();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.minus(readablePeriod15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.withYearOfEra(8);
        int int19 = localDateTime5.compareTo((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime5.plusDays(867);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        int int10 = localDate5.getDayOfMonth();
        int int11 = localDate5.getDayOfMonth();
        org.joda.time.LocalDate.Property property12 = localDate5.yearOfCentury();
        org.joda.time.LocalDate localDate14 = localDate5.plusMonths((int) '4');
        org.joda.time.LocalDate.Property property15 = localDate5.year();
        org.joda.time.Chronology chronology16 = property15.getChronology();
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate20 = localDate17.withPeriodAdded(readablePeriod18, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDate localDate22 = localDate17.minus(readablePeriod21);
        org.joda.time.DateTime dateTime23 = localDate22.toDateTimeAtMidnight();
        int int24 = property15.getDifference((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.LocalDate localDate25 = property15.withMinimumValue();
        boolean boolean26 = property15.isLeap();
        org.joda.time.LocalDate localDate27 = property15.withMinimumValue();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 28 + "'", int10 == 28);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 28 + "'", int11 == 28);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localDate27);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        java.util.Locale locale5 = null;
        int int6 = property3.getMaximumTextLength(locale5);
        org.joda.time.LocalDateTime localDateTime7 = property3.roundFloorCopy();
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = localDateTime7.getFields();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldArray8);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate9 = localDate0.withYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Interval interval11 = localDate0.toInterval(dateTimeZone10);
        org.joda.time.LocalDate.Property property12 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate14 = localDate0.plusMonths(28787742);
        org.joda.time.LocalDate localDate16 = localDate0.minusDays(14);
        org.joda.time.LocalDate localDate18 = localDate16.minusDays(20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = localDate16.toString(dateTimeFormatter19);
        org.joda.time.LocalTime localTime21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = localDate16.toDateTime(localTime21, dateTimeZone22);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2026-09-14" + "'", str20, "2026-09-14");
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = property2.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime8 = property2.addToCopy(20);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withMillisOfSecond((int) '4');
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.monthOfYear();
        int int12 = localDateTime10.getCenturyOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 39 + "'", int12 == 39);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withDurationAdded(readableDuration11, 0);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withDayOfMonth(19);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.year();
        java.lang.String str20 = property19.getAsText();
        long long21 = property19.remainder();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property19.getFieldType();
        org.joda.time.LocalDateTime.Property property23 = localDateTime10.property(dateTimeFieldType22);
        java.util.Date date24 = localDateTime10.toDate();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime10.withYearOfCentury((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime10.plusHours(11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970" + "'", str20, "1970");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1580400052L + "'", long21 == 1580400052L);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 07:52:00 ICT 1970");
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundFloorCopy();
        org.joda.time.DurationField durationField8 = property3.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property3.roundHalfEvenCopy();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withDurationAdded(readableDuration10, 19);
        int int13 = localDateTime9.getDayOfYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withMillisOfDay(7);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.centuryOfEra();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plus(readableDuration4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusSeconds(11);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withLocalMillis((long) 28320052);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.secondOfMinute();
        int int13 = property12.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime15 = property12.addToCopy((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) '4');
        int int18 = localDateTime17.getYearOfEra();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime21 = property19.addToCopy((int) '4');
        java.lang.String str22 = property19.getAsString();
        org.joda.time.LocalDateTime localDateTime23 = property19.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withLocalMillis((long) (-1));
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.plusDays((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusYears((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) '4');
        int int32 = localDateTime31.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withMillisOfSecond((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray35 = localDateTime34.getFields();
        int int37 = localDateTime34.getValue((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) '4');
        int int40 = localDateTime39.getYearOfEra();
        org.joda.time.LocalDateTime.Property property41 = localDateTime39.minuteOfHour();
        int int42 = property41.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime44 = property41.addWrapFieldToCopy((int) 'a');
        org.joda.time.Interval interval45 = property41.toInterval();
        java.util.Locale locale47 = null;
        org.joda.time.LocalDateTime localDateTime48 = property41.setCopy("9", locale47);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone50);
        org.joda.time.DateTimeField[] dateTimeFieldArray52 = localDateTime51.getFields();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime51.minusDays(59);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime48.withFields((org.joda.time.ReadablePartial) localDateTime54);
        org.joda.time.LocalDateTime.Property property56 = localDateTime48.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime57 = property56.roundFloorCopy();
        boolean boolean58 = localDateTime34.equals((java.lang.Object) property56);
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime((long) '4');
        int int61 = localDateTime60.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime63 = localDateTime60.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime60.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime68 = localDateTime60.withFields((org.joda.time.ReadablePartial) localDateTime67);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = null;
        int int70 = localDateTime67.indexOf(dateTimeFieldType69);
        org.joda.time.ReadableDuration readableDuration71 = null;
        org.joda.time.LocalDateTime localDateTime72 = localDateTime67.plus(readableDuration71);
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime((long) '4');
        int int75 = localDateTime74.getYearOfEra();
        org.joda.time.LocalDateTime.Property property76 = localDateTime74.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime78 = property76.addToCopy((int) '4');
        int int79 = localDateTime78.getEra();
        org.joda.time.ReadableDuration readableDuration80 = null;
        org.joda.time.LocalDateTime localDateTime81 = localDateTime78.plus(readableDuration80);
        org.joda.time.LocalDateTime localDateTime83 = localDateTime78.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration84 = null;
        org.joda.time.LocalDateTime localDateTime86 = localDateTime83.withDurationAdded(readableDuration84, 0);
        int int88 = localDateTime83.getValue(2);
        org.joda.time.LocalDateTime localDateTime90 = localDateTime83.plusMonths(2);
        org.joda.time.LocalDateTime.Property property91 = localDateTime90.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType92 = property91.getFieldType();
        org.joda.time.LocalDateTime.Property property93 = localDateTime72.property(dateTimeFieldType92);
        int int94 = localDateTime34.get(dateTimeFieldType92);
        org.joda.time.LocalDateTime.Property property95 = localDateTime27.property(dateTimeFieldType92);
        org.joda.time.LocalDateTime.Property property96 = localDateTime15.property(dateTimeFieldType92);
        int int97 = localDateTime7.get(dateTimeFieldType92);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1970 + "'", int18 == 1970);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(dateTimeFieldArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1970 + "'", int40 == 1970);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 59 + "'", int42 == 59);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(dateTimeFieldArray52);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(localDateTime72);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1970 + "'", int75 == 1970);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(localDateTime78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertNotNull(localDateTime81);
        org.junit.Assert.assertNotNull(localDateTime83);
        org.junit.Assert.assertNotNull(localDateTime86);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertNotNull(localDateTime90);
        org.junit.Assert.assertNotNull(property91);
        org.junit.Assert.assertNotNull(dateTimeFieldType92);
        org.junit.Assert.assertNotNull(property93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 25200010 + "'", int94 == 25200010);
        org.junit.Assert.assertNotNull(property95);
        org.junit.Assert.assertNotNull(property96);
// flaky "7) test4202(org.joda.time.RegressionTest8)":         org.junit.Assert.assertTrue("'" + int97 + "' != '" + 54046466 + "'", int97 == 54046466);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("333");
        org.junit.Assert.assertNotNull(localDate1);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.withDayOfYear(4);
        org.joda.time.LocalDate localDate6 = localDate4.minusWeeks((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate4.toDateMidnight(dateTimeZone7);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate12 = localDate9.withPeriodAdded(readablePeriod10, (int) (byte) -1);
        org.joda.time.LocalDate localDate14 = localDate9.plusWeeks(0);
        org.joda.time.LocalDate localDate16 = localDate14.withYear((int) ' ');
        org.joda.time.LocalDate.Property property17 = localDate14.monthOfYear();
        org.joda.time.LocalDate.Property property18 = localDate14.weekOfWeekyear();
        org.joda.time.LocalDate localDate20 = localDate14.plusMonths(28320052);
        org.joda.time.DateTime dateTime21 = localDate20.toDateTimeAtCurrentTime();
        boolean boolean22 = localDate4.equals((java.lang.Object) localDate20);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.minusWeeks((int) (byte) 10);
        org.joda.time.LocalDate.Property property3 = localDate2.yearOfEra();
        org.joda.time.LocalDate localDate5 = property3.setCopy(18);
        org.joda.time.LocalDate.Property property6 = localDate5.yearOfEra();
        org.joda.time.LocalDate localDate7 = property6.roundCeilingCopy();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        int int12 = localDateTime5.getValue(2);
        int int13 = localDateTime5.getYear();
        org.joda.time.LocalDateTime.Property property14 = localDateTime5.era();
        org.joda.time.LocalDateTime.Property property15 = localDateTime5.year();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime1.withHourOfDay((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withPeriodAdded(readablePeriod14, (int) '#');
        org.joda.time.LocalDateTime.Property property17 = localDateTime13.dayOfYear();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.yearOfCentury();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekOfWeekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = localDateTime2.toString(dateTimeFormatter4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime7 = property6.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T07:00:00.000" + "'", str5, "1970-01-01T07:00:00.000");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime localDateTime5 = property3.setCopy("271");
        org.joda.time.LocalDateTime localDateTime7 = property3.addWrapFieldToCopy((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusYears(54022458);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readableDuration12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.minusSeconds(0);
        java.util.Date date16 = localDateTime11.toDate();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime11.plusDays(0);
        int int19 = localDateTime11.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plus(readableDuration22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.minusSeconds(0);
        int int26 = localDateTime21.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property27 = localDateTime21.year();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime21.plusDays(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = localDateTime29.getFieldType((int) (byte) 0);
        int int32 = localDateTime11.get(dateTimeFieldType31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime11.hourOfDay();
        boolean boolean34 = localDateTime9.equals((java.lang.Object) property33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1970 + "'", int32 == 1970);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(2026);
        org.joda.time.LocalDate localDate13 = localDate11.plusWeeks(19);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate11.toDateTimeAtStartOfDay(dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate11.withWeekyear(1970);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) '4');
        int int21 = localDateTime20.getYearOfEra();
        org.joda.time.LocalDateTime.Property property22 = localDateTime20.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime24 = property22.addToCopy((int) '4');
        int int25 = localDateTime24.getEra();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.plus(readableDuration26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusWeeks(1970);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withMonthOfYear(2);
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField33 = localDate11.getField(99, chronology32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 99");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1970 + "'", int21 == 1970);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(chronology32);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        java.util.Locale locale5 = null;
        int int6 = property3.getMaximumTextLength(locale5);
        org.joda.time.LocalDateTime localDateTime7 = property3.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundFloorCopy();
        int int10 = localDateTime9.getYearOfEra();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withLocalMillis((long) 28320052);
        org.joda.time.Chronology chronology12 = localDateTime11.getChronology();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 31, chronology12);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(chronology12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(26, 28833789, 621, (-3205), 333, 58, 2026, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3205 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        java.lang.String str8 = localDate6.toString("333");
        int int9 = localDate6.getYearOfEra();
        org.joda.time.DateMidnight dateMidnight10 = localDate6.toDateMidnight();
        int int11 = localDate6.getWeekyear();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDateTime13.toDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeZone14);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.weekyear();
        int int18 = localDateTime16.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) '4');
        int int21 = localDateTime20.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property22 = localDateTime20.dayOfYear();
        org.joda.time.LocalDateTime.Property property23 = localDateTime20.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime24 = property23.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property23.getFieldType();
        boolean boolean26 = localDateTime16.isSupported(dateTimeFieldType25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate28 = localDate6.withField(dateTimeFieldType25, 26340000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfMinute' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "333" + "'", str8, "333");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2032 + "'", int9 == 2032);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2032 + "'", int11 == 2032);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2026 + "'", int18 == 2026);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withYear(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek(99);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.DateTimeField dateTimeField5 = property3.getField();
        java.lang.String str6 = property3.getAsText();
        org.joda.time.Chronology chronology7 = property3.getChronology();
        java.lang.String str8 = property3.getAsString();
        org.joda.time.LocalDateTime localDateTime9 = property3.roundHalfCeilingCopy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime7 = property3.addWrapFieldToCopy((int) '#');
        org.joda.time.LocalDateTime localDateTime9 = property3.addToCopy((long) 31);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plus(readablePeriod10);
        org.joda.time.DurationFieldType durationFieldType12 = null;
        boolean boolean13 = localDateTime9.isSupported(durationFieldType12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        java.util.Date date6 = localDateTime1.toDate();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        int int10 = property9.getLeapAmount();
        int int11 = property9.getMinimumValueOverall();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate9 = property7.addWrapFieldToCopy((int) (short) 1);
        org.joda.time.LocalDate localDate10 = property7.roundCeilingCopy();
        int int11 = property7.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.minusMonths(28);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusMillis(5701010);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("1970-01-01T07:00:00.008", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        long long9 = localDate0.getLocalMillis();
        org.joda.time.LocalDate.Property property10 = localDate0.dayOfMonth();
        org.joda.time.LocalDate.Property property11 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate13 = localDate0.minusDays(2);
        org.joda.time.LocalDate.Property property14 = localDate0.centuryOfEra();
        org.joda.time.LocalDate localDate16 = property14.addToCopy(621);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1790553600000L + "'", long9 == 1790553600000L);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime1.withHourOfDay((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withPeriodAdded(readablePeriod14, (int) '#');
        org.joda.time.LocalDateTime.Property property17 = localDateTime13.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime13, dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone21);
        org.joda.time.DateTimeField[] dateTimeFieldArray23 = localDateTime22.getFields();
        org.joda.time.LocalDateTime.Property property24 = localDateTime22.monthOfYear();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.withWeekyear(26);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) '4');
        int int29 = localDateTime28.getYearOfEra();
        org.joda.time.LocalDateTime.Property property30 = localDateTime28.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime32 = property30.addToCopy((int) '4');
        int int33 = localDateTime32.getEra();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.plus(readableDuration34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime32.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withDurationAdded(readableDuration38, 0);
        int int41 = localDateTime37.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) '4');
        int int44 = localDateTime43.getYearOfEra();
        org.joda.time.LocalDateTime.Property property45 = localDateTime43.minuteOfHour();
        org.joda.time.LocalDateTime.Property property46 = localDateTime43.era();
        long long47 = property46.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property46.getFieldType();
        boolean boolean49 = localDateTime37.isSupported(dateTimeFieldType48);
        int int50 = localDateTime26.get(dateTimeFieldType48);
        boolean boolean51 = localDateTime13.isSupported(dateTimeFieldType48);
        org.joda.time.DurationFieldType durationFieldType52 = null;
        boolean boolean53 = localDateTime13.isSupported(durationFieldType52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime13.weekyear();
        org.joda.time.LocalDateTime localDateTime55 = property54.roundFloorCopy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeFieldArray23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1970 + "'", int29 == 1970);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 28320052 + "'", int41 == 28320052);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1970 + "'", int44 == 1970);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 25200052L + "'", long47 == 25200052L);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(localDateTime55);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime6 = property3.roundFloorCopy();
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.weekOfWeekyear();
        java.util.Locale locale9 = null;
        int int10 = property8.getMaximumTextLength(locale9);
        org.joda.time.LocalDateTime localDateTime11 = property8.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime13 = property8.addWrapFieldToCopy(28319952);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withYear(50);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("2026-09-26T04:00:16.005", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property10 = localDate7.yearOfCentury();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate15 = localDate12.withPeriodAdded(readablePeriod13, (int) (byte) -1);
        int int16 = localDate12.getYearOfEra();
        org.joda.time.LocalDate localDate18 = localDate12.plusDays(1970);
        org.joda.time.LocalDate localDate19 = localDate11.withFields((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.LocalDate.Property property20 = localDate18.monthOfYear();
        org.joda.time.LocalDate localDate22 = localDate18.withCenturyOfEra((int) '4');
        org.joda.time.LocalDate localDate24 = localDate22.withDayOfMonth((int) (byte) 10);
        boolean boolean25 = localDate7.isAfter((org.joda.time.ReadablePartial) localDate24);
        int int26 = localDate24.getDayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDate localDate28 = localDate24.minus(readablePeriod27);
        int int29 = localDate24.getYearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = localDate24.toString(dateTimeFormatter30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate33 = localDate24.withDayOfWeek(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2026 + "'", int16 == 2026);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "5232-02-10" + "'", str31, "5232-02-10");
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField5 = property4.getField();
        long long6 = property4.getMillis();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property4.getAsShortText(locale7);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 25200052L + "'", long6 == 25200052L);
// flaky "8) test4226(org.joda.time.RegressionTest8)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u0e21\u0e04." + "'", str8, "\u0e21\u0e04.");
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundFloorCopy();
        org.joda.time.DurationField durationField8 = property3.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property3.roundHalfEvenCopy();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withDurationAdded(readableDuration10, 19);
        int int13 = localDateTime9.getWeekyear();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.minus(readablePeriod14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minus(readableDuration16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        org.joda.time.LocalDate localDate11 = localDate7.withCenturyOfEra((int) '4');
        org.joda.time.LocalDate localDate13 = localDate7.minusDays((int) (byte) 100);
        int int14 = localDate13.getCenturyOfEra();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 8, dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusDays(42);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMillis(652);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = localDateTime1.getFieldTypes();
        org.joda.time.LocalDateTime.Property property16 = localDateTime1.minuteOfHour();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundCeilingCopy();
        java.util.Date date6 = localDateTime5.toDate();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.centuryOfEra();
        org.joda.time.Chronology chronology8 = property7.getChronology();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Jan 01 00:00:00 ICT 2000");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property10 = localDate7.yearOfCentury();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate15 = localDate12.withPeriodAdded(readablePeriod13, (int) (byte) -1);
        int int16 = localDate12.getYearOfEra();
        org.joda.time.LocalDate localDate18 = localDate12.plusDays(1970);
        org.joda.time.LocalDate localDate19 = localDate11.withFields((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.LocalDate.Property property20 = localDate18.monthOfYear();
        org.joda.time.LocalDate localDate22 = localDate18.withCenturyOfEra((int) '4');
        org.joda.time.LocalDate localDate24 = localDate22.withDayOfMonth((int) (byte) 10);
        boolean boolean25 = localDate7.isAfter((org.joda.time.ReadablePartial) localDate24);
        org.joda.time.LocalDate.Property property26 = localDate24.dayOfMonth();
        org.joda.time.LocalDate localDate27 = property26.roundHalfFloorCopy();
        int int28 = property26.getMinimumValueOverall();
        long long29 = property26.remainder();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2026 + "'", int16 == 2026);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime6 = property3.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYearOfEra(12);
        int int9 = localDateTime8.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plusMinutes((-1790557189));
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withMinuteOfHour(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusSeconds((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.plusSeconds((int) (short) 100);
        org.joda.time.LocalDateTime.Property property14 = localDateTime9.dayOfMonth();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = localDate0.indexOf(dateTimeFieldType5);
        org.joda.time.LocalDate localDate8 = localDate0.withWeekyear((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate11 = localDate0.withPeriodAdded(readablePeriod9, 59);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = localDate0.toDateMidnight(dateTimeZone12);
        org.joda.time.Chronology chronology14 = localDate0.getChronology();
        org.joda.time.LocalDate.Property property15 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate16 = property15.roundHalfCeilingCopy();
        org.joda.time.DurationField durationField17 = property15.getDurationField();
        org.joda.time.LocalDate localDate18 = property15.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField20 = localDate18.getField(42);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 42");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(localDate18);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate.Property property9 = localDate8.dayOfWeek();
        int int10 = localDate8.getDayOfMonth();
        org.joda.time.LocalTime localTime11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate8.toDateTime(localTime11, dateTimeZone12);
        org.joda.time.LocalDate.Property property14 = localDate8.yearOfEra();
        org.joda.time.DateTime dateTime15 = localDate8.toDateTimeAtMidnight();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate8.toDateTimeAtStartOfDay(dateTimeZone16);
        int int18 = localDate8.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate8.toDateTimeAtMidnight(dateTimeZone19);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate10 = localDate7.minus(readablePeriod9);
        org.joda.time.LocalDate.Property property11 = localDate7.weekOfWeekyear();
        int int12 = localDate7.getYear();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate7.toDateTimeAtStartOfDay(dateTimeZone13);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2032 + "'", int12 == 2032);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate6 = localDate2.withLocalMillis((long) 2026);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate2.withEra(10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = localDate0.indexOf(dateTimeFieldType5);
        org.joda.time.LocalDate localDate8 = localDate0.withWeekyear((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate11 = localDate0.withPeriodAdded(readablePeriod9, 59);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = localDate0.toDateMidnight(dateTimeZone12);
        org.joda.time.Chronology chronology14 = localDate0.getChronology();
        org.joda.time.DateMidnight dateMidnight15 = localDate0.toDateMidnight();
        org.joda.time.LocalDate.Property property16 = localDate0.dayOfMonth();
        org.joda.time.LocalDate localDate18 = property16.addWrapFieldToCopy(4);
        org.joda.time.LocalDate.Property property19 = localDate18.weekOfWeekyear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withYear(4);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withLocalMillis((long) 1970);
        org.joda.time.LocalDateTime.Property property16 = localDateTime13.weekOfWeekyear();
        int int17 = localDateTime13.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property18 = localDateTime13.dayOfYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks(1970);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMonthOfYear(2);
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.yearOfCentury();
        java.util.Locale locale14 = null;
        int int15 = property13.getMaximumShortTextLength(locale14);
        java.lang.String str16 = property13.getAsShortText();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "7" + "'", str16, "7");
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear(70);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay(21600052);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        java.util.Date date6 = localDateTime1.toDate();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundHalfFloorCopy();
        java.util.Locale locale9 = null;
        int int10 = property7.getMaximumTextLength(locale9);
        org.joda.time.LocalDateTime localDateTime11 = property7.withMaximumValue();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        java.util.Locale locale5 = null;
        int int6 = property4.getMaximumTextLength(locale5);
        int int7 = property4.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime8 = property4.withMinimumValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime8 = property3.roundCeilingCopy();
        java.lang.String str9 = property3.getName();
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = property3.setCopy("2082-09-28", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2082-09-28\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "minuteOfHour" + "'", str9, "minuteOfHour");
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = localDate0.indexOf(dateTimeFieldType5);
        org.joda.time.LocalDate localDate8 = localDate0.withWeekyear((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate11 = localDate0.withPeriodAdded(readablePeriod9, 59);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = localDate0.toDateMidnight(dateTimeZone12);
        org.joda.time.Chronology chronology14 = localDate0.getChronology();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.LocalDate.Property property16 = localDate15.centuryOfEra();
        org.joda.time.LocalDate localDate17 = property16.withMaximumValue();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalTime localTime7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate0.toDateTime(localTime7, dateTimeZone8);
        org.joda.time.LocalDate.Property property10 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate12 = property10.setCopy((int) (short) 1);
        java.lang.String str13 = property10.getAsShortText();
        java.lang.String str14 = property10.toString();
        org.joda.time.LocalDate localDate15 = property10.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u0e08." + "'", str13, "\u0e08.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Property[dayOfWeek]" + "'", str14, "Property[dayOfWeek]");
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDateTime5.toDateTime(dateTimeZone7);
        int int9 = property3.getDifference((org.joda.time.ReadableInstant) dateTime8);
        long long10 = property3.remainder();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25200052L + "'", long10 == 25200052L);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("weekyear", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withMillisOfSecond(28);
        int int7 = localDateTime1.getEra();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks(1970);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMonthOfYear(2);
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.weekyear();
        int int14 = localDateTime10.getSecondOfMinute();
        int int15 = localDateTime10.getWeekyear();
        org.joda.time.LocalDateTime.Property property16 = localDateTime10.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime10.minus(readableDuration17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2007 + "'", int15 == 2007);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minusHours((-1));
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks(52);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusMillis(26);
        int int16 = localDateTime13.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.withWeekOfWeekyear(39);
        int int19 = localDateTime13.getWeekyear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2027 + "'", int19 == 2027);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime1.withCenturyOfEra(271);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime1.withYearOfCentury((int) (short) 0);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withSecondOfMinute(244);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 244 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localDateTime2.getFields();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = localDateTime2.toString(dateTimeFormatter4);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) '4');
        int int8 = localDateTime7.getYearOfEra();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.minuteOfHour();
        int int10 = property9.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime12 = property9.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime13 = property9.roundFloorCopy();
        int int14 = localDateTime13.getDayOfWeek();
        boolean boolean15 = localDateTime2.equals((java.lang.Object) localDateTime13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withWeekOfWeekyear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T07:00:00.000" + "'", str5, "1970-01-01T07:00:00.000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 59 + "'", int10 == 59);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusMillis(4);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime7, dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.plusWeeks(32);
        java.util.Date date14 = localDateTime13.toDate();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Aug 13 07:00:00 ICT 1970");
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        int int12 = localDateTime5.getValue(2);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime5.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusMinutes(0);
        int[] intArray17 = localDateTime14.getValues();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.withYear((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withEra(58);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 58 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1969, 1, 1, 28320052 });
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate11 = property9.roundHalfFloorCopy();
        java.util.Locale locale12 = null;
        int int13 = property9.getMaximumShortTextLength(locale12);
        org.joda.time.LocalDate localDate15 = property9.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.LocalDate localDate16 = property9.roundFloorCopy();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
// flaky "9) test4256(org.joda.time.RegressionTest8)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u0e01\u0e1e." + "'", str10, "\u0e01\u0e1e.");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = null;
        boolean boolean3 = localDateTime1.isSupported(durationFieldType2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusYears((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((-1790557199));
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localDateTime7.getValue(292278993);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 292278993");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate10 = localDate7.minusWeeks(5);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate7.plus(readablePeriod11);
        org.joda.time.LocalDate localDate14 = localDate7.withLocalMillis(1799020800000L);
        org.joda.time.LocalDate.Property property15 = localDate14.weekyear();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property3.getAsShortText(locale7);
        org.joda.time.LocalDateTime localDateTime9 = property3.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) '4');
        int int12 = localDateTime11.getYearOfEra();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime15 = property13.addToCopy((int) '4');
        org.joda.time.Chronology chronology16 = property13.getChronology();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now(chronology16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withDurationAdded(readableDuration18, 53);
        boolean boolean21 = localDateTime9.equals((java.lang.Object) localDateTime17);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.minusMillis(100);
        org.joda.time.Chronology chronology24 = localDateTime23.getChronology();
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now(chronology24);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology24);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withDurationAdded(readableDuration27, 269);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.plusMinutes(3938);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusYears(2032);
        int int34 = localDateTime31.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime31.minusMonths(366);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertNotNull(localDateTime36);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.weekyear();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = property7.getDifference(readableInstant8);
        org.joda.time.LocalDate localDate10 = property7.roundHalfCeilingCopy();
        int int11 = property7.getLeapAmount();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localDateTime2.getFields();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = localDateTime2.toString(dateTimeFormatter4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.LocalDateTime.Property property8 = localDateTime2.year();
        org.joda.time.LocalDateTime localDateTime9 = property8.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusWeeks(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withDayOfMonth(42);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 42 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T07:00:00.000" + "'", str5, "1970-01-01T07:00:00.000");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        java.lang.String str6 = property5.getAsText();
        long long7 = property5.remainder();
        org.joda.time.LocalDateTime localDateTime9 = property5.setCopy(4);
        org.joda.time.LocalDateTime localDateTime11 = property5.addToCopy((long) 1969);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = property5.setCopy("-292275054-01-06T07:00:00.052");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"-292275054-01-06T07:00:00.052\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970" + "'", str6, "1970");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1580400052L + "'", long7 == 1580400052L);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minus(readablePeriod6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime1.minuteOfHour();
        java.lang.String str9 = property8.getAsString();
        org.joda.time.LocalDateTime localDateTime10 = property8.withMaximumValue();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.yearOfEra();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) '4');
        int int14 = localDateTime13.getYearOfEra();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime17 = property15.addToCopy((int) '4');
        int int18 = localDateTime17.getEra();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withWeekOfWeekyear(32);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime10.withFields((org.joda.time.ReadablePartial) localDateTime17);
        int int23 = localDateTime22.getYearOfCentury();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 70 + "'", int23 == 70);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate9 = localDate0.withPeriodAdded(readablePeriod7, (int) (short) -1);
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate13 = localDate10.withPeriodAdded(readablePeriod11, (int) (byte) -1);
        org.joda.time.LocalDate localDate15 = localDate10.minusWeeks((int) (short) 0);
        int int16 = localDate0.compareTo((org.joda.time.ReadablePartial) localDate10);
        org.joda.time.LocalDate localDate18 = localDate0.withYear((-3205));
        org.joda.time.DateTime dateTime19 = localDate18.toDateTimeAtMidnight();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("2026-09-28");
        org.joda.time.LocalDate.Property property2 = localDate1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = property2.getField();
        int int4 = property2.get();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property2.getAsText(locale5);
        org.joda.time.LocalDate localDate8 = property2.setCopy("52");
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 271 + "'", int4 == 271);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "271" + "'", str6, "271");
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 18, dateTimeZone1);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMinimumValue();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.LocalDateTime localDateTime8 = property4.withMinimumValue();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.era();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = localDate0.indexOf(dateTimeFieldType5);
        int int7 = localDate0.getYearOfCentury();
        int int8 = localDate0.getEra();
        org.joda.time.Interval interval9 = localDate0.toInterval();
        int int10 = localDate0.getCenturyOfEra();
        int int11 = localDate0.getYear();
        int int12 = localDate0.size();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 26 + "'", int7 == 26);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2026 + "'", int11 == 2026);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.weekyear();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = property7.getDifference(readableInstant8);
        org.joda.time.LocalDate localDate10 = property7.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate11 = property7.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property7.getFieldType();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime1.withCenturyOfEra((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.weekyear();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.weekyear();
        int int16 = localDateTime13.getWeekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = localDateTime13.withDayOfMonth(54013758);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54013758 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        java.util.Date date10 = localDateTime9.toDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = localDateTime9.toString(dateTimeFormatter11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime9.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.plus(readablePeriod14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime9.weekOfWeekyear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01T07:00:00.052" + "'", str12, "1970-01-01T07:00:00.052");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minusHours((-1));
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withLocalMillis((long) 28);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) '4');
        int int16 = localDateTime15.getYearOfEra();
        org.joda.time.LocalDateTime.Property property17 = localDateTime15.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime19 = property17.addToCopy((int) '4');
        int int20 = localDateTime19.getEra();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.plus(readableDuration21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusWeeks(10);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minusDays((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusMonths(9);
        org.joda.time.LocalDateTime.Property property29 = localDateTime26.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.withYear((int) '4');
        int int32 = localDateTime7.compareTo((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.DurationFieldType durationFieldType33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime35 = localDateTime31.withFieldAdded(durationFieldType33, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1970 + "'", int16 == 1970);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        int int5 = property4.getMaximumValueOverall();
        org.joda.time.LocalDateTime localDateTime6 = property4.withMinimumValue();
        int int7 = property4.getMaximumValueOverall();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property4.getAsShortText(locale8);
        int int10 = property4.getMaximumValueOverall();
        org.joda.time.LocalDateTime localDateTime11 = property4.roundCeilingCopy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 59 + "'", int5 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 59 + "'", int7 == 59);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 59 + "'", int10 == 59);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeZone2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy(0L);
        int int8 = localDateTime7.getYearOfCentury();
        int int9 = localDateTime7.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 40 + "'", int9 == 40);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears((int) (byte) -1);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readableDuration12);
        int int14 = localDateTime13.size();
        int int15 = localDateTime13.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plus(readableDuration18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.minusSeconds(0);
        int int22 = localDateTime17.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property23 = localDateTime17.year();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime17.plusDays(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = localDateTime25.getFieldType((int) (byte) 0);
        int int28 = localDateTime13.get(dateTimeFieldType27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime13.minusDays(53);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime13.withMillisOfDay(28830733);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1969 + "'", int28 == 1969);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime6 = property4.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime9 = property7.setCopy((int) (byte) 1);
        java.lang.String str10 = localDateTime9.toString();
        java.lang.String str11 = localDateTime9.toString();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusYears(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01T07:01:00.000" + "'", str10, "1970-01-01T07:01:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01T07:01:00.000" + "'", str11, "1970-01-01T07:01:00.000");
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalTime localTime7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate0.toDateTime(localTime7, dateTimeZone8);
        org.joda.time.LocalDate.Property property10 = localDate0.dayOfWeek();
        org.joda.time.LocalDate.Property property11 = localDate0.era();
        int int12 = property11.getMaximumValueOverall();
        int int13 = property11.get();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate11 = localDate9.minusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate9.toDateTimeAtCurrentTime(dateTimeZone12);
        int int14 = property8.compareTo((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DurationField durationField15 = property8.getRangeDurationField();
        org.joda.time.LocalDate localDate16 = property8.roundFloorCopy();
        org.joda.time.LocalDate localDate18 = property8.addWrapFieldToCopy(7);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) localDate18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDate localDate22 = localDate18.withPeriodAdded(readablePeriod20, 28787742);
        org.joda.time.LocalDate.Property property23 = localDate22.dayOfMonth();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(property23);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        org.joda.time.LocalDate localDate11 = localDate9.withYearOfCentury(52);
        org.joda.time.LocalDate localDate13 = localDate9.withYearOfCentury(40);
        org.joda.time.LocalDate.Property property14 = localDate13.dayOfMonth();
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = property14.setCopy("Property[year]", locale16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Property[year]\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime1.withHourOfDay((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withPeriodAdded(readablePeriod14, (int) '#');
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withWeekyear(12);
        int int19 = localDateTime16.getDayOfMonth();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minusHours((-1));
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.minusHours(100);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withLocalMillis((long) 28320052);
        org.joda.time.Chronology chronology19 = localDateTime18.getChronology();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 31, chronology19);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) '4');
        int int23 = localDateTime22.getYearOfEra();
        org.joda.time.LocalDateTime.Property property24 = localDateTime22.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime26 = property24.addToCopy((int) '4');
        int int27 = localDateTime26.getEra();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.plus(readableDuration28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusWeeks(10);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.minusDays((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.plusMonths(9);
        int int36 = localDateTime33.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) '4');
        int int39 = localDateTime38.getYearOfEra();
        org.joda.time.LocalDateTime.Property property40 = localDateTime38.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime42 = property40.addToCopy((int) '4');
        int int43 = localDateTime42.getEra();
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.plus(readableDuration44);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime42.plusMillis(0);
        int int49 = localDateTime42.getValue(2);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime42.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.minusMinutes(0);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = localDateTime53.toDateTime(dateTimeZone54);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime33.withFields((org.joda.time.ReadablePartial) localDateTime53);
        boolean boolean57 = localDateTime20.equals((java.lang.Object) localDateTime53);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime20.minusWeeks(28816124);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime7.withFields((org.joda.time.ReadablePartial) localDateTime59);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1970 + "'", int23 == 1970);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 19 + "'", int36 == 19);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1970 + "'", int39 == 1970);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(localDateTime60);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        int int7 = property6.getLeapAmount();
        org.joda.time.LocalDate localDate9 = property6.addWrapFieldToCopy(2026);
        java.lang.String str10 = property6.toString();
        java.lang.String str11 = property6.getName();
        long long12 = property6.getMillis();
        org.joda.time.LocalDate localDate13 = property6.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Property[era]" + "'", str10, "Property[era]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "era" + "'", str11, "era");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1790553600000L + "'", long12 == 1790553600000L);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = property4.withMinimumValue();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate3 = property1.addToCopy(0);
        org.joda.time.LocalDate localDate5 = localDate3.withCenturyOfEra((int) '4');
        org.joda.time.DateMidnight dateMidnight6 = localDate3.toDateMidnight();
        org.joda.time.LocalDate localDate8 = localDate3.plusDays(50);
        org.joda.time.LocalDate.Property property9 = localDate3.year();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, (-1));
        org.joda.time.LocalDate.Property property9 = localDate0.weekyear();
        org.joda.time.LocalDate localDate10 = property9.withMaximumValue();
        org.joda.time.LocalDate localDate11 = property9.getLocalDate();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property9.getAsText(locale12);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2026" + "'", str13, "2026");
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        org.joda.time.Interval interval10 = localDate7.toInterval();
        org.joda.time.LocalDate.Property property11 = localDate7.yearOfCentury();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now(chronology6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withDurationAdded(readableDuration8, 53);
        org.joda.time.LocalDateTime.Property property11 = localDateTime7.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundCeilingCopy();
        java.lang.String str13 = localDateTime12.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
// flaky "10) test4287(org.joda.time.RegressionTest8)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2026-09-28T08:00:37.000" + "'", str13, "2026-09-28T08:00:37.000");
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.Interval interval7 = property3.toInterval();
        org.joda.time.LocalDateTime localDateTime8 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) '4');
        int int11 = localDateTime10.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime18 = localDateTime10.withFields((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime10.plusYears((int) (byte) -1);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plus(readableDuration21);
        int int23 = localDateTime22.size();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime8.withFields((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray25 = localDateTime22.getFieldTypes();
        java.lang.String str27 = localDateTime22.toString("1970");
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime22.plus(readableDuration28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970" + "'", str27, "1970");
        org.junit.Assert.assertNotNull(localDateTime29);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, (-1));
        org.joda.time.LocalDate localDate10 = localDate8.withLocalMillis((long) 5);
        org.joda.time.LocalDate localDate12 = localDate10.withMonthOfYear(5);
        org.joda.time.LocalDate localDate14 = localDate12.plusDays((-292275054));
        org.joda.time.DateTime dateTime15 = localDate12.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate19 = localDate16.withPeriodAdded(readablePeriod17, (int) (byte) -1);
        org.joda.time.LocalDate localDate21 = localDate16.plusWeeks(0);
        org.joda.time.LocalDate localDate23 = localDate21.withYear((int) ' ');
        org.joda.time.LocalDate localDate25 = localDate21.withYearOfCentury((int) (byte) 1);
        int int26 = localDate21.getDayOfMonth();
        int int27 = localDate21.getDayOfMonth();
        org.joda.time.LocalDate.Property property28 = localDate21.yearOfCentury();
        org.joda.time.LocalDate localDate30 = localDate21.plusMonths((int) '4');
        org.joda.time.LocalDate.Property property31 = localDate21.year();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) 2026, dateTimeZone33);
        int[] intArray35 = localDate34.getValues();
        org.joda.time.LocalDate.Property property36 = localDate34.weekOfWeekyear();
        org.joda.time.LocalDate localDate38 = property36.addToCopy(10);
        org.joda.time.LocalDate localDate40 = property36.addToCopy(1970);
        long long41 = property36.getMillis();
        java.lang.String str42 = property36.getAsShortText();
        boolean boolean43 = property36.isLeap();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property36.getFieldType();
        org.joda.time.LocalDate.Property property45 = localDate21.property(dateTimeFieldType44);
        int int46 = localDate12.indexOf(dateTimeFieldType44);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 28 + "'", int26 == 28);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 28 + "'", int27 == 28);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1" + "'", str42, "1");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.withPeriodAdded(readablePeriod9, 2922789);
        java.lang.String str12 = localDateTime5.toString();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime5.plusMinutes(31140052);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01T07:52:00.052" + "'", str12, "1970-01-01T07:52:00.052");
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime1.withHourOfDay((int) (byte) 0);
        int int14 = localDateTime13.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusMinutes(32);
        org.joda.time.Chronology chronology17 = localDateTime13.getChronology();
        org.joda.time.LocalDateTime.Property property18 = localDateTime13.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) '4');
        int int22 = localDateTime21.getYearOfEra();
        org.joda.time.LocalDateTime.Property property23 = localDateTime21.minuteOfHour();
        int int24 = property23.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime26 = property23.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime27 = property23.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.dayOfMonth();
        java.lang.String str29 = localDateTime27.toString();
        int int30 = localDateTime27.size();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.withYear((int) ' ');
        org.joda.time.LocalDateTime localDateTime34 = localDateTime27.plusMinutes(19);
        java.util.Locale locale36 = null;
        java.lang.String str37 = localDateTime34.toString("9", locale36);
        int int38 = localDateTime34.getMillisOfDay();
        org.joda.time.Chronology chronology39 = localDateTime34.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField40 = localDateTime13.getField(58, chronology39);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 58");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 19 + "'", int14 == 19);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1970 + "'", int22 == 1970);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 59 + "'", int24 == 59);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01T07:00:00.000" + "'", str29, "1970-01-01T07:00:00.000");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "9" + "'", str37, "9");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 26340000 + "'", int38 == 26340000);
        org.junit.Assert.assertNotNull(chronology39);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate localDate10 = localDate8.minusYears(25200052);
        int int11 = localDate10.getDayOfWeek();
        org.joda.time.LocalDate.Property property12 = localDate10.weekOfWeekyear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        int int6 = localDateTime1.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.year();
        int int8 = localDateTime1.getMonthOfYear();
        int int9 = localDateTime1.size();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        java.lang.String str3 = property2.toString();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundHalfFloorCopy();
        java.util.Locale locale6 = null;
        org.joda.time.LocalDateTime localDateTime7 = property2.setCopy("1970", locale6);
        org.joda.time.DateTimeField dateTimeField8 = property2.getField();
        java.lang.String str9 = property2.getAsString();
        org.joda.time.LocalDateTime localDateTime11 = property2.addWrapFieldToCopy(14403717);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withLocalMillis((long) (-292275054));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[centuryOfEra]" + "'", str3, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19" + "'", str9, "19");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime6 = property4.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = property4.addWrapFieldToCopy(521);
        org.joda.time.LocalDateTime localDateTime9 = property4.withMinimumValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.DateTime dateTime10 = localDate9.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate12 = localDate9.withCenturyOfEra((int) '4');
        org.joda.time.LocalDate.Property property13 = localDate12.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate15 = localDate12.minus(readablePeriod14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = localDate12.withCenturyOfEra(28825373);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28825373 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears((int) (byte) -1);
        int int12 = localDateTime1.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property13 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime15 = property13.addToCopy(100);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusWeeks(272);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.Interval interval7 = property3.toInterval();
        org.joda.time.LocalDateTime localDateTime8 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) '4');
        int int11 = localDateTime10.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime18 = localDateTime10.withFields((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime10.plusYears((int) (byte) -1);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plus(readableDuration21);
        int int23 = localDateTime22.size();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime8.withFields((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime27 = property25.addToCopy((long) 621);
        int int28 = property25.get();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate11 = localDate9.minusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate9.toDateTimeAtCurrentTime(dateTimeZone12);
        int int14 = property8.compareTo((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DurationField durationField15 = property8.getRangeDurationField();
        org.joda.time.LocalDate localDate16 = property8.roundFloorCopy();
        org.joda.time.Chronology chronology17 = property8.getChronology();
        int int18 = property8.getMinimumValueOverall();
        java.util.Locale locale19 = null;
        java.lang.String str20 = property8.getAsText(locale19);
        java.util.Locale locale21 = null;
        java.lang.String str22 = property8.getAsShortText(locale21);
        org.joda.time.LocalDate localDate23 = property8.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u0e01\u0e31\u0e19\u0e22\u0e32\u0e22\u0e19" + "'", str20, "\u0e01\u0e31\u0e19\u0e22\u0e32\u0e22\u0e19");
// flaky "11) test4299(org.joda.time.RegressionTest8)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u0e01\u0e22." + "'", str22, "\u0e01\u0e22.");
        org.junit.Assert.assertNotNull(localDate23);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(2026);
        org.joda.time.LocalDate localDate13 = localDate11.plusWeeks(19);
        org.joda.time.LocalDate.Property property14 = localDate11.dayOfYear();
        org.joda.time.LocalDate.Property property15 = localDate11.weekyear();
        java.util.Locale locale17 = null;
        java.lang.String str18 = localDate11.toString("25200024", locale17);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "25200024" + "'", str18, "25200024");
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        int int11 = localDateTime5.getYear();
        int int12 = localDateTime5.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property13 = localDateTime5.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = property13.getFieldType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 70 + "'", int12 == 70);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMinutes(31);
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.yearOfEra();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withMillisOfSecond((int) ' ');
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withYearOfEra(99);
        int int19 = localDateTime16.getCenturyOfEra();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 19 + "'", int19 == 19);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate10 = localDate0.minusMonths((int) '#');
        org.joda.time.LocalDate.Property property11 = localDate0.yearOfCentury();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMillis(12);
        long long7 = localDateTime6.getLocalMillis();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours(2027);
        org.joda.time.DateTime dateTime10 = localDateTime9.toDateTime();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1580400064L + "'", long7 == 1580400064L);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minusHours((int) 'a');
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.monthOfYear();
        java.lang.String str10 = property9.getAsString();
        org.joda.time.LocalDateTime localDateTime11 = property9.withMaximumValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "12" + "'", str10, "12");
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.minusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.LocalDate.Property property4 = localDate2.year();
        java.util.Locale locale6 = null;
        java.lang.String str7 = localDate2.toString("20", locale6);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtCurrentTime();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "20" + "'", str7, "20");
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks(10);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.yearOfCentury();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minusHours((-1));
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.minusHours(100);
        org.joda.time.LocalDateTime.Property property14 = localDateTime7.hourOfDay();
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime7.minusHours(324);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime7.withWeekOfWeekyear(2027);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2027 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withYear(4);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withLocalMillis((long) 1970);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime15, dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        org.joda.time.LocalDate localDate11 = localDate9.withYearOfCentury(52);
        org.joda.time.LocalDate localDate13 = localDate9.withYear(0);
        org.joda.time.LocalDate localDate15 = localDate9.plusDays(25200000);
        long long16 = localDate9.getLocalMillis();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-61133961600000L) + "'", long16 == (-61133961600000L));
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime1.withHourOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.yearOfCentury();
        int int15 = localDateTime13.getYearOfEra();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        java.util.Date date6 = localDateTime4.toDate();
        int int7 = localDateTime4.getEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Mon Jan 19 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        int int12 = localDateTime11.getMillisOfSecond();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.plus(readableDuration13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime11.millisOfDay();
        int int16 = property15.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime17 = property15.roundCeilingCopy();
        long long18 = localDateTime17.getLocalMillis();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5701010L + "'", long18 == 5701010L);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        org.joda.time.Chronology chronology12 = localDateTime1.getChronology();
        int int13 = localDateTime1.getSecondOfMinute();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        java.lang.String str4 = property2.getAsText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "19" + "'", str4, "19");
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localDateTime2.getFields();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = localDateTime2.toString(dateTimeFormatter4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withWeekOfWeekyear((int) (short) 10);
        int int8 = localDateTime2.getEra();
        org.joda.time.LocalDateTime.Property property9 = localDateTime2.dayOfYear();
        org.joda.time.LocalDateTime localDateTime11 = property9.addToCopy(41);
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T07:00:00.000" + "'", str5, "1970-01-01T07:00:00.000");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.minusDays(53);
        int int10 = localDateTime9.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        org.joda.time.LocalDate localDate11 = localDate7.withCenturyOfEra((int) '4');
        org.joda.time.LocalDate localDate13 = localDate11.withDayOfMonth((int) (byte) 10);
        org.joda.time.LocalDate localDate15 = localDate13.minusMonths(10);
        org.joda.time.LocalDate localDate17 = localDate13.withYear((-1));
        int int18 = localDate17.getDayOfWeek();
        org.joda.time.LocalDate localDate20 = localDate17.withYear(53994173);
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDate localDate24 = localDate21.withPeriodAdded(readablePeriod22, (int) (byte) -1);
        org.joda.time.LocalDate localDate26 = localDate21.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDate localDate29 = localDate26.withPeriodAdded(readablePeriod27, 0);
        org.joda.time.Chronology chronology30 = localDate26.getChronology();
        org.joda.time.LocalDate localDate32 = localDate26.withDayOfYear(8);
        org.joda.time.LocalDate.Property property33 = localDate32.weekyear();
        int int34 = localDate32.getEra();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDate localDate36 = localDate32.minus(readablePeriod35);
        org.joda.time.LocalDate localDate38 = localDate32.minusWeeks(68);
        int int39 = localDate17.compareTo((org.joda.time.ReadablePartial) localDate32);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.hourOfDay();
        int int6 = localDateTime1.getYear();
        java.lang.String str8 = localDateTime1.toString("\u0e04\u0e28.");
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minusSeconds((int) ' ');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusMonths((int) (short) 1);
        int int13 = localDateTime12.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) '4');
        int int16 = localDateTime15.getYearOfEra();
        org.joda.time.LocalDateTime.Property property17 = localDateTime15.minuteOfHour();
        int int18 = property17.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime20 = property17.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime21 = property17.roundFloorCopy();
        org.joda.time.DurationField durationField22 = property17.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime23 = property17.roundHalfEvenCopy();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withDurationAdded(readableDuration24, 19);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.withHourOfDay(3);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.dayOfMonth();
        int int32 = localDateTime30.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) '4');
        int int35 = localDateTime34.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property36 = localDateTime34.dayOfYear();
        org.joda.time.LocalDateTime.Property property37 = localDateTime34.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime38 = property37.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = property37.getFieldType();
        org.joda.time.LocalDateTime.Property property40 = localDateTime30.property(dateTimeFieldType39);
        boolean boolean41 = localDateTime28.isSupported(dateTimeFieldType39);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime12.withField(dateTimeFieldType39, 50);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u0e04\u0e28." + "'", str8, "\u0e04\u0e28.");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1970 + "'", int16 == 1970);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 59 + "'", int18 == 59);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 25200052 + "'", int32 == 25200052);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(localDateTime43);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate9 = localDate0.withPeriodAdded(readablePeriod7, (int) (short) -1);
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate13 = localDate10.withPeriodAdded(readablePeriod11, (int) (byte) -1);
        org.joda.time.LocalDate localDate15 = localDate10.minusWeeks((int) (short) 0);
        int int16 = localDate0.compareTo((org.joda.time.ReadablePartial) localDate10);
        org.joda.time.LocalDate.Property property17 = localDate10.monthOfYear();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) '4');
        int int20 = localDateTime19.getYear();
        org.joda.time.LocalDateTime.Property property21 = localDateTime19.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property21.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = localDate10.get(dateTimeFieldType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfSecond' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withDurationAdded(readableDuration11, 0);
        int int14 = localDateTime10.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.minusMillis((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plus(readableDuration17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withWeekyear((int) (byte) 100);
        int int21 = localDateTime18.getYear();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.plusMinutes(14403717);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime26 = property24.addWrapFieldToCopy(55);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusHours(271);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 28320052 + "'", int14 == 28320052);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1970 + "'", int21 == 1970);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalTime localTime7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate0.toDateTime(localTime7, dateTimeZone8);
        org.joda.time.LocalDate.Property property10 = localDate0.dayOfWeek();
        org.joda.time.LocalDate.Property property11 = localDate0.era();
        org.joda.time.LocalDate localDate12 = property11.getLocalDate();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getDayOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDateTime8.toDateTime(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        long long9 = localDate0.getLocalMillis();
        org.joda.time.LocalDate.Property property10 = localDate0.dayOfMonth();
        org.joda.time.DurationField durationField11 = property10.getDurationField();
        java.lang.String str12 = property10.getAsText();
        org.joda.time.LocalDate localDate14 = property10.addToCopy((int) (byte) -1);
        org.joda.time.LocalDate localDate16 = localDate14.plusYears((int) ' ');
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) localDate16);
        int int18 = localDate17.getWeekyear();
        org.joda.time.LocalDate localDate20 = localDate17.minusWeeks(2007);
        java.util.Locale locale22 = null;
        java.lang.String str23 = localDate17.toString("1832", locale22);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1790553600000L + "'", long9 == 1790553600000L);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "28" + "'", str12, "28");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2058 + "'", int18 == 2058);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1832" + "'", str23, "1832");
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        java.util.Date date6 = localDateTime1.toDate();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.dayOfYear();
        int int8 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property9 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withYearOfEra(1964);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 25200052 + "'", int8 == 25200052);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property3.getAsShortText(locale7);
        org.joda.time.LocalDateTime localDateTime9 = property3.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) '4');
        int int13 = localDateTime12.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime20 = localDateTime12.withFields((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) '4');
        int int23 = localDateTime22.getYearOfEra();
        org.joda.time.LocalDateTime.Property property24 = localDateTime22.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime26 = property24.addToCopy((int) '4');
        org.joda.time.Chronology chronology27 = property24.getChronology();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime12, chronology27);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(chronology27);
        org.joda.time.DateTimeField dateTimeField30 = localDateTime9.getField(0, chronology27);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(chronology27);
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.withCenturyOfEra(1);
        int int35 = localDateTime32.getYear();
        org.joda.time.DateTime dateTime36 = localDateTime32.toDateTime();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime32.withHourOfDay(0);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime32.plusDays(2026);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.centuryOfEra();
        java.lang.String str44 = property43.toString();
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = localDateTime46.toDateTime(dateTimeZone47);
        int int49 = property43.getDifference((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) '4');
        int int52 = localDateTime51.getYearOfEra();
        org.joda.time.LocalDateTime.Property property53 = localDateTime51.minuteOfHour();
        int int54 = property53.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime56 = property53.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime57 = property53.roundFloorCopy();
        int int58 = property43.compareTo((org.joda.time.ReadablePartial) localDateTime57);
        org.joda.time.LocalDateTime.Property property59 = localDateTime57.yearOfEra();
        java.util.Locale locale60 = null;
        java.lang.String str61 = property59.getAsText(locale60);
        org.joda.time.DateTimeField dateTimeField62 = property59.getField();
        org.joda.time.LocalDateTime.Property property63 = new org.joda.time.LocalDateTime.Property(localDateTime40, dateTimeField62);
        org.joda.time.LocalDateTime.Property property64 = new org.joda.time.LocalDateTime.Property(localDateTime31, dateTimeField62);
        long long65 = property64.getMillis();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1970 + "'", int23 == 1970);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2026 + "'", int35 == 2026);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Property[centuryOfEra]" + "'", str44, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1970 + "'", int52 == 1970);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 59 + "'", int54 == 59);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "1970" + "'", str61, "1970");
        org.junit.Assert.assertNotNull(dateTimeField62);
// flaky "12) test4326(org.joda.time.RegressionTest8)":         org.junit.Assert.assertTrue("'" + long65 + "' != '" + 1790582436333L + "'", long65 == 1790582436333L);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(1969, 231, 25200052, (int) 'a', 1969, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        long long9 = localDate0.getLocalMillis();
        java.lang.String str10 = localDate0.toString();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate0.minus(readablePeriod11);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate16 = localDate13.withPeriodAdded(readablePeriod14, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight17 = localDate13.toDateMidnight();
        org.joda.time.LocalDate localDate19 = localDate13.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property20 = localDate19.weekyear();
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = property20.getDifference(readableInstant21);
        org.joda.time.LocalDate localDate23 = property20.withMinimumValue();
        org.joda.time.LocalDate localDate24 = property20.roundHalfCeilingCopy();
        boolean boolean25 = localDate0.isAfter((org.joda.time.ReadablePartial) localDate24);
        org.joda.time.DateTimeField[] dateTimeFieldArray26 = localDate24.getFields();
        org.joda.time.LocalDate.Property property27 = localDate24.dayOfMonth();
        org.joda.time.Chronology chronology28 = property27.getChronology();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1790553600000L + "'", long9 == 1790553600000L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-09-28" + "'", str10, "2026-09-28");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(chronology28);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears((int) (byte) -1);
        int int12 = localDateTime1.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property13 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime.Property property14 = localDateTime1.era();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        java.lang.String str3 = property2.toString();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDateTime5.toDateTime(dateTimeZone6);
        int int8 = property2.getDifference((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.LocalDateTime localDateTime10 = property2.addToCopy(12);
        java.lang.String str11 = property2.getName();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withCenturyOfEra(1);
        int int15 = localDateTime12.getYear();
        org.joda.time.DateTime dateTime16 = localDateTime12.toDateTime();
        long long17 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime16);
        java.lang.String str18 = property2.getAsText();
        org.joda.time.LocalDateTime localDateTime19 = property2.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withCenturyOfEra(2);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.withCenturyOfEra(2037);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime27 = localDateTime19.withDate(36, 25200010, 1955);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25200010 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[centuryOfEra]" + "'", str3, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "centuryOfEra" + "'", str11, "centuryOfEra");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2026 + "'", int15 == 2026);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "19" + "'", str18, "19");
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        int int12 = localDateTime11.getMillisOfSecond();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.plus(readableDuration13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusDays((int) (short) 0);
        int int17 = localDateTime14.getWeekyear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        int int11 = localDateTime8.indexOf(dateTimeFieldType10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.plus(readableDuration12);
        int int14 = localDateTime8.getDayOfYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plus(readableDuration7);
        boolean boolean9 = property4.equals((java.lang.Object) localDateTime6);
        org.joda.time.LocalDateTime localDateTime10 = property4.withMaximumValue();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDateTime10.toDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withMillisOfDay(52);
        int int16 = localDateTime10.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime10.minusHours(521);
        java.util.Locale locale20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = localDateTime18.toString("2007-10-04T07:52:00.052", locale20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 25200052 + "'", int16 == 25200052);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        org.joda.time.LocalDate localDate10 = property9.roundHalfFloorCopy();
        org.joda.time.Chronology chronology11 = property9.getChronology();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property9.getAsShortText(locale12);
        org.joda.time.LocalDate localDate14 = property9.withMinimumValue();
        org.joda.time.LocalDate.Property property15 = localDate14.centuryOfEra();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
// flaky "13) test4334(org.joda.time.RegressionTest8)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u0e01\u0e1e." + "'", str13, "\u0e01\u0e1e.");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfWeek();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        boolean boolean5 = property4.isLeap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.Interval interval2 = localDate1.toInterval();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDateTime4.toDateTime(dateTimeZone5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plus(readableDuration7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minus(readableDuration9);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localDate1.compareTo((org.joda.time.ReadablePartial) localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate localDate10 = localDate8.minusYears(25200052);
        org.joda.time.Interval interval11 = localDate10.toInterval();
        int int12 = localDate10.getDayOfMonth();
        org.joda.time.LocalDate localDate14 = localDate10.withDayOfYear(3);
        org.joda.time.LocalDate localDate16 = localDate14.withDayOfYear(2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = localDate16.withMonthOfYear(25200052);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25200052 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withLocalMillis((long) 28320052);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.secondOfMinute();
        int int5 = property4.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime7 = property4.addToCopy((int) (short) 0);
        org.joda.time.DurationFieldType durationFieldType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withFieldAdded(durationFieldType8, 2001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(2037, 1869, 24, 0, 292278993, 99);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        int int3 = localDateTime2.getYearOfCentury();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 26 + "'", int3 == 26);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        java.lang.String str8 = property7.getAsString();
        org.joda.time.LocalDate localDate10 = property7.addWrapFieldToCopy(70);
        org.joda.time.DurationField durationField11 = property7.getDurationField();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026" + "'", str8, "2026");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate6 = property4.addToCopy(10);
        int int7 = localDate6.getYearOfCentury();
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtStartOfDay();
        java.util.Date date9 = localDate6.toDate();
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.fromDateFields(date9);
        int int11 = localDate10.getYearOfCentury();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 70 + "'", int7 == 70);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 70 + "'", int11 == 70);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate9 = localDate0.withYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Interval interval11 = localDate0.toInterval(dateTimeZone10);
        org.joda.time.LocalDate.Property property12 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate13 = property12.roundFloorCopy();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundHalfFloorCopy();
        java.lang.String str6 = property4.getAsText();
        org.joda.time.LocalDateTime localDateTime7 = property4.roundHalfCeilingCopy();
        long long8 = localDateTime7.getLocalMillis();
        int int9 = localDateTime7.getYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky "14) test4344(org.joda.time.RegressionTest8)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u0e04\u0e28." + "'", str6, "\u0e04\u0e28.");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-62135596800000L) + "'", long8 == (-62135596800000L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate.Property property9 = localDate5.year();
        org.joda.time.LocalDate.Property property10 = localDate5.dayOfMonth();
        org.joda.time.LocalDate localDate11 = property10.roundCeilingCopy();
        int int12 = property10.get();
        org.joda.time.LocalDate localDate14 = property10.addToCopy((int) '#');
        org.joda.time.LocalDate localDate15 = property10.getLocalDate();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 28 + "'", int12 == 28);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) '4');
        int int10 = localDateTime9.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime17 = localDateTime9.withFields((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime9.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime9.withHourOfDay((int) (byte) 0);
        int int22 = localDateTime21.getCenturyOfEra();
        org.joda.time.LocalDateTime.Property property23 = localDateTime21.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime25 = property23.addWrapFieldToCopy((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property23.getFieldType();
        int int27 = localDateTime7.indexOf(dateTimeFieldType26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime7.plusWeeks(28787742);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) '4');
        int int32 = localDateTime31.getYearOfEra();
        org.joda.time.LocalDateTime.Property property33 = localDateTime31.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime35 = property33.addToCopy((int) '4');
        org.joda.time.Chronology chronology36 = property33.getChronology();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(chronology36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusHours((int) '4');
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.year();
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.LocalDateTime localDateTime42 = localDateTime39.plus(readableDuration41);
        boolean boolean43 = localDateTime29.equals((java.lang.Object) localDateTime42);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 19 + "'", int22 == 19);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1970 + "'", int32 == 1970);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate8 = property7.withMaximumValue();
        java.lang.String str9 = property7.getAsShortText();
        java.util.Locale locale10 = null;
        int int11 = property7.getMaximumShortTextLength(locale10);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "271" + "'", str9, "271");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeZone2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy(0L);
        int int8 = localDateTime7.getSecondOfMinute();
        int int9 = localDateTime7.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withYear(0);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime14 = property12.addWrapFieldToCopy(1832);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky "15) test4348(org.joda.time.RegressionTest8)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2026 + "'", int9 == 2026);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        int int12 = localDateTime5.getValue(2);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime5.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusMonths(25200052);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withYear(2);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime14.plusMonths(5);
        org.joda.time.LocalDateTime.Property property21 = localDateTime14.weekyear();
        org.joda.time.LocalDateTime.Property property22 = localDateTime14.centuryOfEra();
        java.lang.String str23 = property22.getName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "centuryOfEra" + "'", str23, "centuryOfEra");
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.weekyear();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = property7.getDifference(readableInstant8);
        org.joda.time.LocalDate localDate10 = property7.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate10.minus(readablePeriod12);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withYear(10);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withMonthOfYear(11);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusMillis(2026);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.monthOfYear();
        long long13 = property12.getMillis();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 26293922078L + "'", long13 == 26293922078L);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.minuteOfHour();
        boolean boolean9 = property7.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        java.util.Date date10 = localDateTime9.toDate();
        int int11 = localDateTime9.getDayOfYear();
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime14 = property12.addWrapFieldToCopy(5);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withYearOfEra((int) '4');
        org.joda.time.LocalDateTime.Property property17 = localDateTime14.era();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) '4');
        int int20 = localDateTime19.getYearOfEra();
        org.joda.time.LocalDateTime.Property property21 = localDateTime19.minuteOfHour();
        org.joda.time.LocalDateTime.Property property22 = localDateTime19.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray23 = localDateTime19.getFieldTypes();
        java.util.Date date24 = localDateTime19.toDate();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime19.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.minuteOfHour();
        boolean boolean28 = property17.equals((java.lang.Object) localDateTime26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime30 = localDateTime26.withMinuteOfHour(2922789);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922789 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray23);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        java.lang.String str8 = property7.getAsText();
        org.joda.time.LocalDate localDate9 = property7.withMinimumValue();
        org.joda.time.LocalDate localDate10 = property7.withMaximumValue();
        java.util.Locale locale11 = null;
        int int12 = property7.getMaximumTextLength(locale11);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026" + "'", str8, "2026");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = localDateTime4.getFields();
        int int7 = localDateTime4.getValue((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) '4');
        int int10 = localDateTime9.getYearOfEra();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.minuteOfHour();
        int int12 = property11.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime14 = property11.addWrapFieldToCopy((int) 'a');
        org.joda.time.Interval interval15 = property11.toInterval();
        java.util.Locale locale17 = null;
        org.joda.time.LocalDateTime localDateTime18 = property11.setCopy("9", locale17);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone20);
        org.joda.time.DateTimeField[] dateTimeFieldArray22 = localDateTime21.getFields();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.minusDays(59);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime18.withFields((org.joda.time.ReadablePartial) localDateTime24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime18.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime27 = property26.roundFloorCopy();
        boolean boolean28 = localDateTime4.equals((java.lang.Object) property26);
        java.lang.String str29 = property26.getAsText();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((java.lang.Object) str29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 59 + "'", int12 == 59);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldArray22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "52" + "'", str29, "52");
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalTime localTime7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate0.toDateTime(localTime7, dateTimeZone8);
        org.joda.time.DateTime dateTime10 = localDate0.toDateTimeAtCurrentTime();
        int int11 = localDate0.getYear();
        int int12 = localDate0.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2026 + "'", int11 == 2026);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 40 + "'", int12 == 40);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localDateTime2.getFields();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = localDateTime2.toString(dateTimeFormatter4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withWeekOfWeekyear((int) (short) 10);
        int int8 = localDateTime2.getEra();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime2.withCenturyOfEra(333);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withDayOfMonth(19);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.year();
        java.lang.String str17 = property16.getAsText();
        long long18 = property16.remainder();
        long long19 = property16.remainder();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property16.getFieldType();
        org.joda.time.LocalDateTime.Property property21 = localDateTime10.property(dateTimeFieldType20);
        org.joda.time.LocalDateTime localDateTime22 = property21.withMinimumValue();
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T07:00:00.000" + "'", str5, "1970-01-01T07:00:00.000");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970" + "'", str17, "1970");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1580400052L + "'", long18 == 1580400052L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1580400052L + "'", long19 == 1580400052L);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate5.withPeriodAdded(readablePeriod6, 0);
        int int9 = localDate8.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) '4');
        int int13 = localDateTime12.getYearOfEra();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime16 = property14.addToCopy((int) '4');
        int int17 = localDateTime16.getEra();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.plus(readableDuration18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.plusMillis(0);
        int int22 = localDateTime16.getYear();
        org.joda.time.Chronology chronology23 = localDateTime16.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField24 = localDate8.getField(740341, chronology23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 740341");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1970 + "'", int22 == 1970);
        org.junit.Assert.assertNotNull(chronology23);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate localDate10 = localDate0.plusMonths((int) (short) 100);
        org.joda.time.LocalDate.Property property11 = localDate10.weekyear();
        org.joda.time.LocalDate.Property property12 = localDate10.era();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate10.toDateTimeAtCurrentTime(dateTimeZone13);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        int int5 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate7 = localDate0.withDayOfYear(100);
        org.joda.time.LocalDate localDate9 = localDate7.minusWeeks(0);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtCurrentTime(dateTimeZone10);
        int int12 = localDate7.getYear();
        org.joda.time.LocalDate localDate14 = localDate7.withYearOfEra(9);
        int int15 = localDate14.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate14.toDateTimeAtMidnight(dateTimeZone16);
        int int18 = localDate14.getYearOfCentury();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2026 + "'", int12 == 2026);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(25200052L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfMonth();
        int int6 = localDateTime4.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        int int9 = localDateTime8.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.dayOfYear();
        org.joda.time.LocalDateTime.Property property11 = localDateTime8.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime12 = property11.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property11.getFieldType();
        org.joda.time.LocalDateTime.Property property14 = localDateTime4.property(dateTimeFieldType13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime2.property(dateTimeFieldType13);
        int int16 = property15.get();
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25200052 + "'", int6 == 25200052);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate localDate10 = localDate8.minusYears(25200052);
        int int11 = localDate10.getDayOfWeek();
        org.joda.time.LocalDate.Property property12 = localDate10.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = localDate10.toDateMidnight(dateTimeZone13);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateMidnight14);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.withPeriodAdded(readablePeriod9, 2922789);
        java.lang.String str12 = localDateTime5.toString();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime5.plusSeconds(33);
        int int15 = localDateTime14.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.secondOfMinute();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01T07:52:00.052" + "'", str12, "1970-01-01T07:52:00.052");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate localDate5 = localDate2.minusYears((int) (byte) 1);
        int[] intArray6 = localDate5.getValues();
        org.joda.time.LocalDate localDate8 = localDate5.minusYears(67);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1969, 1, 1 });
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        int int9 = localDateTime8.getYearOfEra();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime12 = property10.addToCopy((int) '4');
        org.joda.time.Chronology chronology13 = property10.getChronology();
        java.util.Locale locale14 = null;
        java.lang.String str15 = property10.getAsShortText(locale14);
        org.joda.time.LocalDateTime localDateTime16 = property10.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) '4');
        int int19 = localDateTime18.getYearOfEra();
        org.joda.time.LocalDateTime.Property property20 = localDateTime18.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime22 = property20.addToCopy((int) '4');
        org.joda.time.Chronology chronology23 = property20.getChronology();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now(chronology23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withDurationAdded(readableDuration25, 53);
        boolean boolean28 = localDateTime16.equals((java.lang.Object) localDateTime24);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.minusMillis(100);
        org.joda.time.Chronology chronology31 = localDateTime30.getChronology();
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now(chronology31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((int) '4', 1869, 2052, 32, 68, 952, 2922789, chronology31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(localDateTime32);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekOfWeekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = localDateTime2.toString(dateTimeFormatter4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.plusMonths(5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType10 = localDateTime2.getFieldType(12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 12");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T07:00:00.000" + "'", str5, "1970-01-01T07:00:00.000");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        org.joda.time.DateTime dateTime7 = localDate0.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate.Property property8 = localDate0.weekOfWeekyear();
        org.joda.time.LocalDate localDate10 = localDate0.withLocalMillis((long) 35);
        org.joda.time.LocalDate.Property property11 = localDate10.era();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(28816124, 0, 26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        int int6 = localDateTime1.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.year();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusDays(0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusMillis(69);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withMillisOfSecond(999);
        int int14 = localDateTime13.getYear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusMillis(41);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        java.lang.String str8 = property7.getAsText();
        org.joda.time.LocalDate localDate9 = property7.roundFloorCopy();
        org.joda.time.LocalDate localDate11 = localDate9.withDayOfYear(40);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026" + "'", str8, "2026");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears((int) (byte) -1);
        int int12 = localDateTime1.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property13 = localDateTime1.centuryOfEra();
        int int14 = localDateTime1.getYearOfEra();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime1.minus(readableDuration15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.yearOfEra();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundHalfFloorCopy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.Interval interval7 = property3.toInterval();
        java.util.Locale locale9 = null;
        org.joda.time.LocalDateTime localDateTime10 = property3.setCopy("9", locale9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone12);
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localDateTime13.getFields();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusDays(59);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime10.withFields((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = property18.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) '4');
        int int22 = localDateTime21.getYearOfEra();
        org.joda.time.LocalDateTime.Property property23 = localDateTime21.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime25 = property23.addToCopy((int) '4');
        int int26 = localDateTime25.getEra();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.plus(readableDuration27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusWeeks(10);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.minusDays((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plusMonths(9);
        org.joda.time.LocalDateTime.Property property35 = localDateTime32.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property35.getFieldType();
        int int37 = localDateTime19.get(dateTimeFieldType36);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) '4');
        int int40 = localDateTime39.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property41 = localDateTime39.dayOfYear();
        org.joda.time.LocalDateTime.Property property42 = localDateTime39.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime43 = property42.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property42.getFieldType();
        int int45 = localDateTime19.indexOf(dateTimeFieldType44);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((long) '4');
        int int48 = localDateTime47.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime47.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime55 = localDateTime47.withFields((org.joda.time.ReadablePartial) localDateTime54);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime47.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime47.withHourOfDay((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.LocalDateTime localDateTime62 = localDateTime59.withPeriodAdded(readablePeriod60, (int) '#');
        org.joda.time.LocalDateTime.Property property63 = localDateTime59.dayOfYear();
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property66 = localDateTime65.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime67 = property66.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime68 = property66.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime((long) '4');
        int int71 = localDateTime70.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property72 = localDateTime70.dayOfYear();
        org.joda.time.LocalDateTime.Property property73 = localDateTime70.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime74 = property73.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = property73.getFieldType();
        int int76 = localDateTime68.get(dateTimeFieldType75);
        int int77 = localDateTime59.get(dateTimeFieldType75);
        boolean boolean78 = localDateTime19.isSupported(dateTimeFieldType75);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1970 + "'", int22 == 1970);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(localDateTime74);
        org.junit.Assert.assertNotNull(dateTimeFieldType75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        java.lang.String str6 = property3.getAsString();
        org.joda.time.LocalDateTime localDateTime7 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime8 = property3.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime10 = property3.setCopy("28");
        java.util.Locale locale11 = null;
        java.lang.String str12 = property3.getAsShortText(locale11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(2026);
        org.joda.time.LocalDate localDate13 = localDate11.plusWeeks(19);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate11.toDateTimeAtStartOfDay(dateTimeZone14);
        org.joda.time.LocalDate.Property property16 = localDate11.yearOfEra();
        org.joda.time.LocalDate localDate17 = property16.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        java.util.Date date12 = localDateTime1.toDate();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) '4');
        int int15 = localDateTime14.getYearOfEra();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.minuteOfHour();
        org.joda.time.LocalDateTime.Property property17 = localDateTime14.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray18 = localDateTime14.getFieldTypes();
        java.util.Date date19 = localDateTime14.toDate();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime14.withMillisOfDay((int) (short) 100);
        boolean boolean22 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime14.withYearOfCentury(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        int int10 = localDate5.getDayOfMonth();
        int int11 = localDate5.getDayOfMonth();
        org.joda.time.LocalDate.Property property12 = localDate5.yearOfCentury();
        org.joda.time.LocalDate localDate14 = localDate5.plusMonths((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = localDate14.withYearOfEra((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 28 + "'", int10 == 28);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 28 + "'", int11 == 28);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate10 = localDate0.minusMonths((int) '#');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate0.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.LocalDate.Property property13 = localDate0.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = localDate0.withDayOfMonth(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) '4');
        int int3 = localDateTime2.getYearOfEra();
        org.joda.time.LocalDateTime.Property property4 = localDateTime2.minuteOfHour();
        int int5 = property4.getMaximumValue();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        java.lang.String str7 = property4.getAsText();
        org.joda.time.Chronology chronology8 = property4.getChronology();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(1798675200000L, chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withDayOfYear(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 59 + "'", int5 == 59);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withDayOfMonth(19);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusMillis(12);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.minusSeconds(50);
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 324, chronology10);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate.Property property9 = localDate5.year();
        org.joda.time.LocalDate.Property property10 = localDate5.dayOfMonth();
        org.joda.time.LocalDate localDate11 = property10.roundCeilingCopy();
        org.joda.time.LocalDate localDate13 = localDate11.plusWeeks(12);
        org.joda.time.LocalDate localDate15 = localDate13.withYear(19);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.minusWeeks((int) (byte) 10);
        org.joda.time.LocalDate.Property property3 = localDate2.yearOfEra();
        org.joda.time.Interval interval4 = property3.toInterval();
        org.joda.time.LocalDate localDate5 = property3.roundCeilingCopy();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        org.joda.time.LocalDate.Property property10 = localDate7.weekyear();
        org.joda.time.LocalDate localDate11 = property10.getLocalDate();
        int int12 = localDate11.getWeekyear();
        org.joda.time.DateMidnight dateMidnight13 = localDate11.toDateMidnight();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2032 + "'", int12 == 2032);
        org.junit.Assert.assertNotNull(dateMidnight13);
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime8 = property6.setCopy(4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = property6.setCopy("2032-02-12");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2032-02-12\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundHalfFloorCopy();
        int int6 = localDateTime5.getDayOfYear();
        int int7 = localDateTime5.getWeekyear();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withPeriodAdded(readablePeriod8, (-1));
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.era();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        int int10 = localDate5.getDayOfMonth();
        org.joda.time.LocalDate.Property property11 = localDate5.dayOfMonth();
        org.joda.time.LocalDate localDate12 = property11.roundCeilingCopy();
        org.joda.time.LocalDate localDate14 = property11.setCopy(25);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 28 + "'", int10 == 28);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(728293L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeZone2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.weekyear();
        int int6 = localDateTime4.getYearOfEra();
        int int7 = localDateTime4.getHourOfDay();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.plus(readablePeriod8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.year();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withWeekyear((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.centuryOfEra();
        java.lang.String str16 = property15.toString();
        int int17 = property15.getLeapAmount();
        java.lang.String str18 = property15.toString();
        org.joda.time.LocalDateTime localDateTime20 = property15.setCopy(7);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minus(readableDuration21);
        java.lang.Object obj23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(obj23, dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) '4');
        int int28 = localDateTime27.getYearOfEra();
        org.joda.time.LocalDateTime.Property property29 = localDateTime27.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime31 = property29.addToCopy((int) '4');
        int int32 = localDateTime31.getEra();
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.plus(readableDuration33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusWeeks(10);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.minusDays((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plusMonths(9);
        org.joda.time.LocalDateTime.Property property41 = localDateTime38.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property41.getFieldType();
        int int43 = localDateTime25.indexOf(dateTimeFieldType42);
        boolean boolean44 = localDateTime20.isSupported(dateTimeFieldType42);
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((long) '4');
        int int47 = localDateTime46.getYearOfEra();
        org.joda.time.LocalDateTime.Property property48 = localDateTime46.minuteOfHour();
        org.joda.time.LocalDateTime.Property property49 = localDateTime46.era();
        long long50 = property49.getMillis();
        org.joda.time.DateTimeField dateTimeField51 = property49.getField();
        org.joda.time.LocalDateTime.Property property52 = new org.joda.time.LocalDateTime.Property(localDateTime20, dateTimeField51);
        org.joda.time.LocalDateTime.Property property53 = new org.joda.time.LocalDateTime.Property(localDateTime9, dateTimeField51);
        org.joda.time.LocalDateTime.Property property54 = localDateTime9.hourOfDay();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2026 + "'", int6 == 2026);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Property[centuryOfEra]" + "'", str16, "Property[centuryOfEra]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Property[centuryOfEra]" + "'", str18, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1970 + "'", int28 == 1970);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1970 + "'", int47 == 1970);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 25200052L + "'", long50 == 25200052L);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(property54);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = localDate0.indexOf(dateTimeFieldType5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate0.isSupported(dateTimeFieldType7);
        int[] intArray9 = localDate0.getValues();
        org.joda.time.LocalDate localDate11 = localDate0.minusMonths(2027);
        org.joda.time.LocalDate localDate13 = localDate0.withDayOfMonth(24);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 2026, 9, 28 });
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) '4');
        int int12 = localDateTime11.getYearOfEra();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime15 = property13.addToCopy((int) '4');
        org.joda.time.Chronology chronology16 = property13.getChronology();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime1, chronology16);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withYearOfEra(365);
        org.joda.time.LocalDateTime.Property property21 = localDateTime18.hourOfDay();
        org.joda.time.LocalDateTime.Property property22 = localDateTime18.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime18.plus(readablePeriod23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.Interval interval7 = property3.toInterval();
        org.joda.time.LocalDateTime localDateTime8 = property3.withMaximumValue();
        java.util.Date date9 = localDateTime8.toDate();
        int int10 = localDateTime8.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property11 = localDateTime8.dayOfMonth();
        long long12 = property11.remainder();
        org.joda.time.LocalDateTime localDateTime14 = property11.addToCopy((long) 28816124);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 07:59:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 70 + "'", int10 == 70);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 28740052L + "'", long12 == 28740052L);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate5.withPeriodAdded(readablePeriod6, 0);
        org.joda.time.Chronology chronology9 = localDate5.getChronology();
        org.joda.time.LocalDate localDate11 = localDate5.withDayOfYear(8);
        org.joda.time.LocalDate.Property property12 = localDate11.weekyear();
        int int13 = localDate11.getEra();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate15 = localDate11.minus(readablePeriod14);
        org.joda.time.LocalDate localDate17 = localDate11.minusWeeks(68);
        java.util.Date date18 = localDate11.toDate();
        org.joda.time.DurationFieldType durationFieldType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate21 = localDate11.withFieldAdded(durationFieldType19, (-2026));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 08 00:00:00 ICT 2026");
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localDateTime2.getFields();
        org.joda.time.LocalDateTime.Property property4 = localDateTime2.monthOfYear();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withWeekyear(26);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        int int9 = localDateTime8.getYearOfEra();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime12 = property10.addToCopy((int) '4');
        int int13 = localDateTime12.getEra();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.plus(readableDuration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withDurationAdded(readableDuration18, 0);
        int int21 = localDateTime17.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) '4');
        int int24 = localDateTime23.getYearOfEra();
        org.joda.time.LocalDateTime.Property property25 = localDateTime23.minuteOfHour();
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.era();
        long long27 = property26.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = property26.getFieldType();
        boolean boolean29 = localDateTime17.isSupported(dateTimeFieldType28);
        int int30 = localDateTime6.get(dateTimeFieldType28);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime6.minus(readableDuration31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.withYearOfCentury(8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 28320052 + "'", int21 == 28320052);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1970 + "'", int24 == 1970);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 25200052L + "'", long27 == 25200052L);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        int int8 = property7.getMaximumValue();
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate12 = localDate9.withPeriodAdded(readablePeriod10, (int) (byte) -1);
        org.joda.time.LocalDate localDate14 = localDate9.plusWeeks(0);
        org.joda.time.LocalDate localDate16 = localDate14.withYear((int) ' ');
        org.joda.time.LocalDate localDate18 = localDate14.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalTime localTime19 = null;
        org.joda.time.DateTime dateTime20 = localDate14.toDateTime(localTime19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate14.toDateTimeAtCurrentTime(dateTimeZone21);
        int int23 = property7.getDifference((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.LocalDate localDate25 = property7.addToCopy(25200000);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 365 + "'", int8 == 365);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(localDate25);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate localDate10 = localDate8.minusYears(25200052);
        int int11 = localDate10.getDayOfWeek();
        org.joda.time.LocalDate.Property property12 = localDate10.dayOfYear();
        java.lang.String str13 = property12.getAsString();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "365" + "'", str13, "365");
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate6 = property4.addToCopy(10);
        int int7 = localDate6.getYearOfCentury();
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtStartOfDay();
        java.util.Date date9 = localDate6.toDate();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate6.toDateTimeAtMidnight(dateTimeZone10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 70 + "'", int7 == 70);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withDurationAdded(readableDuration11, 0);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withDayOfMonth(19);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.year();
        java.lang.String str20 = property19.getAsText();
        long long21 = property19.remainder();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property19.getFieldType();
        org.joda.time.LocalDateTime.Property property23 = localDateTime10.property(dateTimeFieldType22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime10.minuteOfHour();
        boolean boolean25 = property24.isLeap();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970" + "'", str20, "1970");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1580400052L + "'", long21 == 1580400052L);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalTime localTime7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate0.toDateTime(localTime7, dateTimeZone8);
        org.joda.time.DateTime dateTime10 = localDate0.toDateTimeAtCurrentTime();
        int int11 = localDate0.getYear();
        int int12 = localDate0.getDayOfMonth();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2026 + "'", int11 == 2026);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 28 + "'", int12 == 28);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate9 = localDate0.withYear((int) '4');
        org.joda.time.LocalDate localDate11 = localDate9.withWeekyear(100);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate9.plus(readablePeriod12);
        long long14 = localDate9.getLocalMillis();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-60502809600000L) + "'", long14 == (-60502809600000L));
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        long long9 = localDate0.getLocalMillis();
        org.joda.time.LocalDate.Property property10 = localDate0.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = localDate0.isSupported(dateTimeFieldType11);
        org.joda.time.LocalDate.Property property13 = localDate0.weekyear();
        org.joda.time.LocalDate.Property property14 = localDate0.dayOfYear();
        int int15 = localDate0.getWeekyear();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1790553600000L + "'", long9 == 1790553600000L);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2026 + "'", int15 == 2026);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withDurationAdded(readableDuration11, 0);
        int int14 = localDateTime10.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.minusMillis((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property17 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) '4');
        int int20 = localDateTime19.getYearOfEra();
        org.joda.time.LocalDateTime.Property property21 = localDateTime19.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime23 = property21.addToCopy((int) '4');
        int int24 = localDateTime23.getEra();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.plus(readableDuration25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.withDurationAdded(readableDuration29, 0);
        int int32 = localDateTime28.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime28.minusMillis((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plus(readableDuration35);
        int int37 = localDateTime34.getYearOfCentury();
        int int38 = localDateTime34.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = localDateTime40.toDateTime(dateTimeZone41);
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeZone41);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.weekyear();
        int int45 = localDateTime43.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((long) '4');
        int int48 = localDateTime47.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property49 = localDateTime47.dayOfYear();
        org.joda.time.LocalDateTime.Property property50 = localDateTime47.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime51 = property50.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = property50.getFieldType();
        boolean boolean53 = localDateTime43.isSupported(dateTimeFieldType52);
        int int54 = localDateTime34.get(dateTimeFieldType52);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime56 = localDateTime10.withField(dateTimeFieldType52, 28320052);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28320052 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 28320052 + "'", int14 == 28320052);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 28320052 + "'", int32 == 28320052);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 70 + "'", int37 == 70);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2026 + "'", int45 == 2026);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(dateTimeFieldType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 59 + "'", int54 == 59);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.dayOfYear();
        int int2 = property1.getMinimumValueOverall();
        org.joda.time.LocalDate localDate4 = property1.addWrapFieldToCopy((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property1.getFieldType();
        org.joda.time.LocalDate localDate6 = property1.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        int int9 = localDateTime7.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime11 = property10.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withMillisOfSecond((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        java.lang.String str7 = localDateTime6.toString();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withMinuteOfHour(0);
        int int10 = localDateTime9.size();
        int int11 = localDateTime9.getHourOfDay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0035-01-04T07:00:00.052" + "'", str7, "0035-01-04T07:00:00.052");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        java.lang.String str9 = property8.getName();
        org.joda.time.LocalDateTime localDateTime11 = property8.setCopy((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMillis(42);
        org.joda.time.DateTime dateTime14 = localDateTime11.toDateTime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "dayOfMonth" + "'", str9, "dayOfMonth");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate9 = localDate0.withPeriodAdded(readablePeriod7, (int) (short) -1);
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate13 = localDate10.withPeriodAdded(readablePeriod11, (int) (byte) -1);
        org.joda.time.LocalDate localDate15 = localDate10.minusWeeks((int) (short) 0);
        int int16 = localDate0.compareTo((org.joda.time.ReadablePartial) localDate10);
        org.joda.time.DateMidnight dateMidnight17 = localDate0.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) localDate0, dateTimeZone18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateMidnight17);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate10 = localDate7.minus(readablePeriod9);
        org.joda.time.LocalDate.Property property11 = localDate7.weekOfWeekyear();
        int int12 = localDate7.getYear();
        int int13 = localDate7.getWeekOfWeekyear();
        int int14 = localDate7.getYearOfCentury();
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate18 = localDate15.withPeriodAdded(readablePeriod16, (int) (byte) -1);
        org.joda.time.LocalDate localDate20 = localDate15.plusWeeks(0);
        org.joda.time.LocalDate localDate22 = localDate20.withYear((int) ' ');
        org.joda.time.LocalDate localDate24 = localDate20.withYearOfCentury((int) (byte) 1);
        int int25 = localDate20.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight26 = localDate20.toDateMidnight();
        org.joda.time.LocalDate localDate27 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDate localDate30 = localDate27.withPeriodAdded(readablePeriod28, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight31 = localDate27.toDateMidnight();
        org.joda.time.LocalDate localDate33 = localDate27.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property34 = localDate33.year();
        org.joda.time.DateTimeField dateTimeField35 = property34.getField();
        org.joda.time.LocalDate.Property property36 = new org.joda.time.LocalDate.Property(localDate20, dateTimeField35);
        org.joda.time.LocalDate.Property property37 = localDate20.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = localDate20.toDateTimeAtCurrentTime(dateTimeZone38);
        org.joda.time.LocalDate localDate41 = localDate20.minusDays(652);
        boolean boolean42 = localDate7.isBefore((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.LocalDate localDate44 = localDate20.plusWeeks(28319952);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2032 + "'", int12 == 2032);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 28 + "'", int25 == 28);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(dateMidnight31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(localDate44);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withYear(10);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withMonthOfYear(11);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusMillis(2026);
        long long12 = localDateTime11.getLocalMillis();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 26293922078L + "'", long12 == 26293922078L);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        java.lang.Object obj0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(obj0);
        java.lang.Class<?> wildcardClass2 = localDate1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        java.util.Date date6 = localDateTime1.toDate();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime.Property property8 = localDateTime1.secondOfMinute();
        java.util.Locale locale9 = null;
        int int10 = property8.getMaximumShortTextLength(locale9);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate11 = property9.roundHalfFloorCopy();
        java.util.Locale locale12 = null;
        int int13 = property9.getMaximumShortTextLength(locale12);
        int int14 = property9.getLeapAmount();
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate18 = localDate15.withPeriodAdded(readablePeriod16, (int) (byte) -1);
        org.joda.time.LocalDate localDate20 = localDate15.plusWeeks(0);
        org.joda.time.LocalDate localDate22 = localDate20.withYear((int) ' ');
        org.joda.time.LocalDate.Property property23 = localDate20.monthOfYear();
        org.joda.time.LocalDate.Property property24 = localDate20.year();
        org.joda.time.LocalDate.Property property25 = localDate20.dayOfMonth();
        org.joda.time.LocalDate localDate26 = property25.roundCeilingCopy();
        int int27 = property25.get();
        org.joda.time.LocalDate localDate28 = property25.getLocalDate();
        org.joda.time.LocalDate localDate29 = property25.getLocalDate();
        org.joda.time.DateTime dateTime30 = localDate29.toDateTimeAtStartOfDay();
        int int31 = property9.compareTo((org.joda.time.ReadablePartial) localDate29);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
// flaky "16) test4410(org.joda.time.RegressionTest8)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u0e01\u0e1e." + "'", str10, "\u0e01\u0e1e.");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 28 + "'", int27 == 28);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withDurationAdded(readableDuration11, 0);
        int int15 = localDateTime10.getValue(2);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime10.plusMonths(2);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusDays(1970);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.plus(readablePeriod20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.plusWeeks(750);
        java.lang.Class<?> wildcardClass24 = localDateTime17.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 39130011);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate9 = localDate0.withPeriodAdded(readablePeriod7, (int) (short) -1);
        int int10 = localDate9.getWeekyear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2026 + "'", int10 == 2026);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minus(readablePeriod6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime1.minuteOfHour();
        java.lang.String str9 = property8.getAsString();
        org.joda.time.LocalDateTime localDateTime10 = property8.withMaximumValue();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.yearOfEra();
        int int12 = property11.getLeapAmount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate5.withPeriodAdded(readablePeriod6, 0);
        org.joda.time.LocalDate.Property property9 = localDate8.yearOfEra();
        org.joda.time.LocalDate localDate10 = property9.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate11 = property9.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate12 = property9.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTimeAtMidnight(dateTimeZone13);
        org.joda.time.LocalDate localDate16 = localDate12.minusDays((int) (short) 10);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plus(readableDuration7);
        boolean boolean9 = property4.equals((java.lang.Object) localDateTime6);
        org.joda.time.LocalDateTime localDateTime10 = property4.withMaximumValue();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDateTime10.toDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withMillisOfDay(52);
        int int16 = localDateTime10.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime10.minusHours(521);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withYear(28825373);
        org.joda.time.LocalDateTime.Property property21 = localDateTime18.dayOfMonth();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 25200052 + "'", int16 == 25200052);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMinutes(31);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.hourOfDay();
        java.lang.String str15 = property14.getAsShortText();
        org.joda.time.LocalDateTime localDateTime16 = property14.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime17 = property14.roundHalfCeilingCopy();
        int int18 = localDateTime17.getDayOfMonth();
        int int19 = localDateTime17.getYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "7" + "'", str15, "7");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.withDayOfYear(4);
        org.joda.time.LocalDate localDate6 = localDate0.plusMonths(2);
        org.joda.time.LocalDate.Property property7 = localDate0.yearOfEra();
        org.joda.time.LocalDate.Property property8 = localDate0.centuryOfEra();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property8.getAsShortText(locale9);
        int int11 = property8.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "20" + "'", str10, "20");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        java.lang.String str8 = property7.getAsString();
        java.util.Locale locale10 = null;
        org.joda.time.LocalDate localDate11 = property7.setCopy("271", locale10);
        org.joda.time.LocalDate localDate12 = property7.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.Interval interval14 = localDate12.toInterval(dateTimeZone13);
        org.joda.time.Chronology chronology15 = localDate12.getChronology();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026" + "'", str8, "2026");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withDurationAdded(readableDuration11, 0);
        int int14 = localDateTime10.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.withDayOfMonth(31);
        int int17 = localDateTime10.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (short) -1, dateTimeZone19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDate localDate23 = localDate20.withPeriodAdded(readablePeriod21, 365);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = localDateTime10.isBefore((org.joda.time.ReadablePartial) localDate23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 28320052 + "'", int14 == 28320052);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(localDate23);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("1970-09-28");
        org.joda.time.LocalDate.Property property2 = localDate1.centuryOfEra();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.Interval interval7 = property3.toInterval();
        org.joda.time.LocalDateTime localDateTime8 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime9 = property3.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property3.getFieldType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundHalfCeilingCopy();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property2.getAsShortText(locale5);
        org.joda.time.LocalDateTime localDateTime8 = property2.addToCopy((long) 242);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "19" + "'", str6, "19");
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        org.joda.time.LocalDate localDate6 = localDate1.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate9 = localDate1.withPeriodAdded(readablePeriod7, (-1));
        org.joda.time.LocalDate localDate11 = localDate1.withDayOfYear((int) '#');
        org.joda.time.Chronology chronology12 = localDate1.getChronology();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((-9223310678340351564L), chronology12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = localDate13.withDayOfWeek((-1790557228));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1790557228 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        int int11 = localDateTime5.getYear();
        int int12 = localDateTime5.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property13 = localDateTime5.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime5.plusSeconds(25260000);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withMillisOfDay(21600052);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 70 + "'", int12 == 70);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusSeconds((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.plusSeconds((int) (short) 100);
        org.joda.time.LocalDateTime.Property property14 = localDateTime9.dayOfYear();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) '4');
        int int17 = localDateTime16.getYearOfEra();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.minuteOfHour();
        org.joda.time.LocalDateTime.Property property19 = localDateTime16.era();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plus(readableDuration22);
        boolean boolean24 = property19.equals((java.lang.Object) localDateTime21);
        java.lang.String str25 = property19.getAsString();
        org.joda.time.LocalDateTime localDateTime26 = property19.withMinimumValue();
        int int27 = property14.compareTo((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.LocalDateTime localDateTime29 = property14.addToCopy(14);
        java.util.Locale locale31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime32 = property14.setCopy("Property[minuteOfHour]", locale31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Property[minuteOfHour]\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1" + "'", str25, "1");
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(localDateTime29);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(2026);
        org.joda.time.LocalDate localDate13 = localDate11.plusWeeks(19);
        org.joda.time.LocalDate localDate15 = localDate11.withWeekOfWeekyear(4);
        int int16 = localDate15.getDayOfMonth();
        org.joda.time.LocalDate localDate18 = localDate15.withYearOfCentury((int) (short) 1);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDate localDate22 = localDate19.withPeriodAdded(readablePeriod20, (int) (byte) -1);
        int int23 = localDate19.getYearOfEra();
        org.joda.time.LocalDate localDate25 = localDate19.plusDays(1970);
        org.joda.time.LocalDate.Property property26 = localDate19.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = localDate19.toDateMidnight(dateTimeZone27);
        java.util.Date date29 = localDate19.toDate();
        org.joda.time.LocalTime localTime30 = null;
        org.joda.time.DateTime dateTime31 = localDate19.toDateTime(localTime30);
        int int32 = localDate19.getDayOfYear();
        org.joda.time.DateTime dateTime33 = localDate19.toDateTimeAtStartOfDay();
        org.joda.time.DateTime dateTime34 = localDate18.toDateTime((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = localDate18.toDateTimeAtStartOfDay(dateTimeZone35);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 25 + "'", int16 == 25);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2026 + "'", int23 == 2026);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Mon Sep 28 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 271 + "'", int32 == 271);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        java.lang.String str9 = localDateTime7.toString();
        int int10 = localDateTime7.size();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withYear((int) ' ');
        org.joda.time.LocalDateTime localDateTime14 = localDateTime7.plusMinutes(19);
        java.util.Locale locale16 = null;
        java.lang.String str17 = localDateTime14.toString("9", locale16);
        int int18 = localDateTime14.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) '4');
        int int21 = localDateTime20.getYearOfEra();
        org.joda.time.LocalDateTime.Property property22 = localDateTime20.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime24 = property22.addToCopy((int) '4');
        int int25 = localDateTime24.getEra();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.plus(readableDuration26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime24.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withDurationAdded(readableDuration30, 0);
        int int33 = localDateTime29.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime29.minusMillis((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.plus(readableDuration36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.withWeekyear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime37.plus(readablePeriod40);
        int int42 = localDateTime14.compareTo((org.joda.time.ReadablePartial) localDateTime41);
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime14.minus(readableDuration43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01T07:00:00.000" + "'", str9, "1970-01-01T07:00:00.000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "9" + "'", str17, "9");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26340000 + "'", int18 == 26340000);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1970 + "'", int21 == 1970);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 28320052 + "'", int33 == 28320052);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(localDateTime44);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property10 = localDate7.yearOfCentury();
        org.joda.time.LocalDate localDate11 = property10.roundHalfCeilingCopy();
        int int12 = localDate11.getCenturyOfEra();
        org.joda.time.LocalDate.Property property13 = localDate11.weekyear();
        org.joda.time.LocalDate localDate15 = property13.setCopy((int) (byte) 10);
        org.joda.time.LocalDate.Property property16 = localDate15.yearOfEra();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusDays((-1));
        org.joda.time.LocalDateTime.Property property8 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minusHours(3);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) '4');
        int int15 = localDateTime14.getYearOfEra();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.minuteOfHour();
        org.joda.time.LocalDateTime.Property property17 = localDateTime14.era();
        org.joda.time.LocalDateTime.Property property18 = localDateTime14.hourOfDay();
        int int19 = localDateTime14.getYear();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withLocalMillis((long) 28320052);
        org.joda.time.Chronology chronology24 = localDateTime23.getChronology();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime14, chronology24);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now(chronology24);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) 9, chronology24);
        org.joda.time.DateTimeField dateTimeField28 = localDateTime10.getField((int) (short) 0, chronology24);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((java.lang.Object) (short) 0, dateTimeZone29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTimeField28);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property3.getAsShortText(locale7);
        org.joda.time.LocalDateTime localDateTime9 = property3.roundHalfCeilingCopy();
        int int10 = localDateTime9.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.monthOfYear();
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        org.joda.time.LocalDateTime.Property property17 = new org.joda.time.LocalDateTime.Property(localDateTime9, dateTimeField16);
        int int18 = localDateTime9.getMillisOfSecond();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusSeconds((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.plusSeconds((int) (short) 100);
        int int14 = localDateTime13.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.yearOfEra();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky "17) test4433(org.joda.time.RegressionTest8)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 79 + "'", int14 == 79);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate.Property property9 = localDate8.dayOfWeek();
        int int10 = localDate8.getDayOfMonth();
        org.joda.time.LocalTime localTime11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate8.toDateTime(localTime11, dateTimeZone12);
        org.joda.time.LocalDate.Property property14 = localDate8.yearOfEra();
        org.joda.time.LocalDate localDate16 = localDate8.minusDays(271);
        org.joda.time.LocalDate.Property property17 = localDate16.weekyear();
        org.joda.time.LocalDate localDate19 = property17.addWrapFieldToCopy(25);
        org.joda.time.LocalDate localDate20 = property17.withMaximumValue();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate20);
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(2026);
        org.joda.time.LocalDate localDate13 = localDate11.plusWeeks(19);
        org.joda.time.LocalDate.Property property14 = localDate11.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate17 = localDate11.withPeriodAdded(readablePeriod15, (-292275054));
        java.util.Date date18 = localDate11.toDate();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) date18);
        org.joda.time.LocalDate localDate21 = localDate19.withYearOfEra(68);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Wed Nov 28 00:00:00 ICT 1832");
        org.junit.Assert.assertNotNull(localDate21);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.millisOfSecond();
        int int8 = localDateTime1.getMillisOfDay();
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 25200052 + "'", int8 == 25200052);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        int int10 = localDate7.getMonthOfYear();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate13 = localDate7.withPeriodAdded(readablePeriod11, 25200052);
        org.joda.time.LocalDate localDate15 = localDate13.plusWeeks(269);
        org.joda.time.LocalDate localDate17 = localDate15.plusWeeks((int) (byte) 1);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) '4');
        int int5 = localDateTime4.getYearOfEra();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.minuteOfHour();
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.era();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plus(readableDuration10);
        boolean boolean12 = property7.equals((java.lang.Object) localDateTime9);
        org.joda.time.LocalDateTime localDateTime13 = property7.withMaximumValue();
        java.util.Locale locale14 = null;
        java.lang.String str15 = property7.getAsText(locale14);
        org.joda.time.Chronology chronology16 = property7.getChronology();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(54022458, 31, 50, chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 31 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky "18) test4438(org.joda.time.RegressionTest8)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u0e04\u0e28." + "'", str15, "\u0e04\u0e28.");
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        int int6 = localDateTime1.getDayOfYear();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now(chronology6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withDurationAdded(readableDuration8, 53);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMillisOfSecond(269);
        int int13 = localDateTime10.getMillisOfSecond();
        int int14 = localDateTime10.getDayOfYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
// flaky "19) test4440(org.joda.time.RegressionTest8)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 123 + "'", int13 == 123);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 271 + "'", int14 == 271);
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        org.joda.time.LocalDateTime.Property property11 = localDateTime5.weekyear();
        org.joda.time.LocalDateTime.Property property12 = localDateTime5.yearOfCentury();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        java.lang.String str8 = property7.getAsText();
        java.util.Locale locale10 = null;
        org.joda.time.LocalDate localDate11 = property7.setCopy("2026", locale10);
        org.joda.time.DurationField durationField12 = property7.getLeapDurationField();
        org.joda.time.LocalDate localDate13 = property7.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate14 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate15 = property7.roundHalfFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate17 = localDate15.plus(readablePeriod16);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026" + "'", str8, "2026");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = localDate0.withDayOfWeek(28816124);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28816124 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.Chronology chronology8 = property7.getChronology();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMinimumValue();
        java.util.Date date6 = localDateTime5.toDate();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime8 = property7.withMinimumValue();
        int int9 = localDateTime8.getDayOfWeek();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Jan 01 07:00:00 ICT 1");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.DurationField durationField8 = property7.getDurationField();
        java.lang.String str9 = property7.getAsShortText();
        org.joda.time.LocalDate localDate11 = property7.addWrapFieldToCopy(53);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate11.withDayOfWeek(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "271" + "'", str9, "271");
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        int int11 = localDateTime5.getYear();
        int int12 = localDateTime5.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property13 = localDateTime5.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) '4');
        int int17 = localDateTime16.getYearOfEra();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime20 = property18.addToCopy((int) '4');
        int int21 = localDateTime20.getEra();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.plus(readableDuration22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime20.plusMillis(0);
        int int26 = localDateTime20.getYear();
        org.joda.time.Chronology chronology27 = localDateTime20.getChronology();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 3, chronology27);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(chronology27);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime5, chronology27);
        int int31 = localDateTime5.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property32 = localDateTime5.yearOfEra();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime5.minusYears(25200010);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDateTime localDateTime37 = localDateTime5.withPeriodAdded(readablePeriod35, 333);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 70 + "'", int12 == 70);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1970 + "'", int26 == 1970);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime37);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withDurationAdded(readableDuration11, 0);
        int int14 = localDateTime10.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDateTime10.toDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime10.weekyear();
        java.util.Locale locale18 = null;
        java.lang.String str19 = property17.getAsShortText(locale18);
        int int20 = property17.getLeapAmount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 28320052 + "'", int14 == 28320052);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970" + "'", str19, "1970");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks(10);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.plus(readablePeriod11);
        int int13 = localDateTime12.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withHourOfDay((int) (short) 10);
        int int16 = localDateTime12.getEra();
        org.joda.time.LocalDateTime.Property property17 = localDateTime12.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) '4');
        int int20 = localDateTime19.getYearOfEra();
        org.joda.time.LocalDateTime.Property property21 = localDateTime19.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime23 = property21.addToCopy((int) '4');
        int int24 = localDateTime23.getEra();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.plus(readableDuration25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.withDurationAdded(readableDuration29, 0);
        int int32 = localDateTime28.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime28.withDayOfMonth(31);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime28.minusWeeks((int) (short) -1);
        java.util.Date date37 = localDateTime28.toDate();
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.fromDateFields(date37);
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.fromDateFields(date37);
        org.joda.time.LocalDateTime localDateTime40 = org.joda.time.LocalDateTime.fromDateFields(date37);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime12.withFields((org.joda.time.ReadablePartial) localDateTime40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 28320052 + "'", int32 == 28320052);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 07:52:00 ICT 1970");
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime41);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(2026);
        org.joda.time.DateMidnight dateMidnight12 = localDate11.toDateMidnight();
        int int13 = localDate11.getDayOfMonth();
        long long14 = localDate11.getLocalMillis();
        int int15 = localDate11.getDayOfYear();
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate20 = localDate17.withPeriodAdded(readablePeriod18, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight21 = localDate17.toDateMidnight();
        org.joda.time.LocalDate localDate23 = localDate17.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property24 = localDate17.dayOfYear();
        int int25 = property24.getMaximumValue();
        org.joda.time.LocalDate localDate26 = property24.withMinimumValue();
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField28 = localDate11.getField(39, chronology27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 39");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 28 + "'", int13 == 28);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-4326220800000L) + "'", long14 == (-4326220800000L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 333 + "'", int15 == 333);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 365 + "'", int25 == 365);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(chronology27);
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = localDate0.indexOf(dateTimeFieldType5);
        org.joda.time.LocalDate localDate8 = localDate0.withWeekyear((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate10 = localDate8.minus(readablePeriod9);
        org.joda.time.Chronology chronology11 = localDate8.getChronology();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, (-1));
        org.joda.time.LocalDate.Property property9 = localDate0.weekyear();
        org.joda.time.LocalDate localDate10 = property9.withMaximumValue();
        org.joda.time.LocalDate.Property property11 = localDate10.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) property11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDate$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.LocalDate localDate10 = localDate7.plusDays(5);
        org.joda.time.LocalDate localDate12 = localDate10.withDayOfMonth(31);
        org.joda.time.LocalDate.Property property13 = localDate10.centuryOfEra();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate.Property property9 = localDate5.year();
        org.joda.time.LocalDate localDate11 = property9.addWrapFieldToCopy(25200052);
        org.joda.time.LocalDate localDate12 = property9.getLocalDate();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate localDate10 = localDate0.plusMonths((int) (short) 100);
        org.joda.time.LocalDate.Property property11 = localDate10.weekyear();
        long long12 = property11.getMillis();
        org.joda.time.LocalDate localDate14 = property11.addToCopy((-3205));
        org.joda.time.LocalDate localDate16 = property11.addToCopy(2037);
        org.joda.time.LocalDate localDate17 = property11.getLocalDate();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2053555200000L + "'", long12 == 2053555200000L);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        int int11 = localDateTime5.getYear();
        int int12 = localDateTime5.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime5.minusDays(2032);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusWeeks(1970);
        int[] intArray17 = localDateTime16.getValues();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.plusMillis(69);
        org.joda.time.LocalDateTime.Property property20 = localDateTime16.dayOfYear();
        boolean boolean21 = property20.isLeap();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 70 + "'", int12 == 70);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 2002, 3, 12, 28320052 });
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        int int10 = localDate5.getDayOfMonth();
        int int11 = localDate5.getDayOfMonth();
        org.joda.time.LocalDate.Property property12 = localDate5.yearOfCentury();
        org.joda.time.LocalDate localDate14 = localDate5.plusMonths((int) '4');
        org.joda.time.LocalDate.Property property15 = localDate5.year();
        org.joda.time.Chronology chronology16 = property15.getChronology();
        int int17 = property15.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 28 + "'", int10 == 28);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 28 + "'", int11 == 28);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 292278993 + "'", int17 == 292278993);
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withDurationAdded(readableDuration11, 0);
        int int14 = localDateTime10.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property15 = localDateTime10.yearOfEra();
        org.joda.time.LocalDateTime.Property property16 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = property16.addWrapFieldToCopy(3);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime21 = property19.addToCopy((long) 333);
        org.joda.time.Chronology chronology22 = property19.getChronology();
        org.joda.time.LocalDateTime localDateTime23 = property19.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime24 = property19.getLocalDateTime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 28320052 + "'", int14 == 28320052);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localDateTime2.getFields();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.plusMinutes(25200010);
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("2035", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeZone2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.weekyear();
        int int6 = localDateTime4.getYearOfEra();
        int int7 = localDateTime4.getHourOfDay();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.plus(readablePeriod8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.year();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withWeekyear((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withCenturyOfEra(1);
        int int16 = localDateTime13.getYear();
        org.joda.time.DateTime dateTime17 = localDateTime13.toDateTime();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.withHourOfDay(0);
        boolean boolean20 = localDateTime9.isAfter((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.Chronology chronology21 = localDateTime9.getChronology();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime9.withDurationAdded(readableDuration22, 1964);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2026 + "'", int6 == 2026);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2026 + "'", int16 == 2026);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMinutes(31);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.hourOfDay();
        java.lang.String str15 = property14.getAsShortText();
        org.joda.time.LocalDateTime localDateTime17 = property14.addToCopy(10L);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfDay();
        org.joda.time.DurationField durationField19 = property18.getLeapDurationField();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "7" + "'", str15, "7");
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNull(durationField19);
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDateTime4.toDateTime(dateTimeZone5);
        java.util.Date date7 = localDateTime4.toDate();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.minusMillis(48);
        int int10 = localDateTime9.getDayOfWeek();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withDurationAdded(readableDuration11, 740341);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfYear(3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minusMillis(25);
        java.util.Date date7 = localDateTime6.toDate();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 07:00:00 ICT 1970");
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plus(readableDuration7);
        boolean boolean9 = property4.equals((java.lang.Object) localDateTime6);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.plusMillis(25);
        org.joda.time.LocalDateTime.Property property12 = localDateTime6.year();
        org.joda.time.DurationField durationField13 = property12.getLeapDurationField();
        java.lang.Class<?> wildcardClass14 = durationField13.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate8 = localDate0.minusWeeks(86399999);
        org.joda.time.LocalDate localDate10 = localDate0.plusDays(26);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withDurationAdded(readableDuration11, 0);
        int int14 = localDateTime10.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.minusMillis((int) (byte) 100);
        int int17 = localDateTime10.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) '4');
        int int20 = localDateTime19.getYearOfEra();
        org.joda.time.LocalDateTime.Property property21 = localDateTime19.minuteOfHour();
        org.joda.time.LocalDateTime.Property property22 = localDateTime19.era();
        org.joda.time.LocalDateTime localDateTime23 = property22.roundHalfFloorCopy();
        java.lang.String str24 = property22.getAsText();
        org.joda.time.DateTimeField dateTimeField25 = property22.getField();
        org.joda.time.LocalDateTime.Property property26 = new org.joda.time.LocalDateTime.Property(localDateTime10, dateTimeField25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 28320052 + "'", int14 == 28320052);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 19 + "'", int17 == 19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime23);
// flaky "20) test4467(org.joda.time.RegressionTest8)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u0e04\u0e28." + "'", str24, "\u0e04\u0e28.");
        org.junit.Assert.assertNotNull(dateTimeField25);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) '4');
        int int12 = localDateTime11.getYearOfEra();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime15 = property13.addToCopy((int) '4');
        org.joda.time.Chronology chronology16 = property13.getChronology();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime1, chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withWeekOfWeekyear((int) '4');
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.dayOfYear();
        org.joda.time.LocalDateTime localDateTime21 = property20.withMinimumValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        int int7 = localDateTime1.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withWeekyear(14403717);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withDayOfYear(324);
        int int12 = localDateTime11.getHourOfDay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear(70);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withPeriodAdded(readablePeriod7, 35);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusMinutes(39);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minus(readablePeriod12);
        int int14 = localDateTime13.getMillisOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 25200052 + "'", int14 == 25200052);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withCenturyOfEra(1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.millisOfSecond();
        org.joda.time.LocalDateTime.Property property4 = localDateTime0.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = property4.setCopy(2058);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2058 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withMillisOfDay(7);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withLocalMillis((long) 9);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.hourOfDay();
        org.joda.time.LocalDateTime localDateTime7 = property6.roundCeilingCopy();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate.Property property9 = localDate5.weekOfWeekyear();
        org.joda.time.LocalDate localDate11 = localDate5.plusMonths(28320052);
        org.joda.time.DateMidnight dateMidnight12 = localDate5.toDateMidnight();
        org.joda.time.LocalDate localDate14 = localDate5.plusYears(7);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate6 = property4.addToCopy(10);
        org.joda.time.LocalDate localDate8 = property4.addWrapFieldToCopy(2007);
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate13 = localDate10.withPeriodAdded(readablePeriod11, (int) (byte) -1);
        org.joda.time.LocalDate localDate15 = localDate10.plusWeeks(0);
        org.joda.time.LocalDate localDate17 = localDate15.withYear((int) ' ');
        org.joda.time.LocalDate localDate19 = localDate15.withYearOfCentury((int) (byte) 1);
        int int20 = localDate15.getDayOfMonth();
        int int21 = localDate15.getDayOfMonth();
        org.joda.time.LocalDate.Property property22 = localDate15.yearOfCentury();
        org.joda.time.LocalDate localDate24 = localDate15.plusMonths((int) '4');
        org.joda.time.Chronology chronology25 = localDate15.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = localDate8.getField(0, chronology25);
        org.joda.time.DateTime dateTime27 = localDate8.toDateTimeAtStartOfDay();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 28 + "'", int20 == 28);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 28 + "'", int21 == 28);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        int int10 = localDate5.getDayOfMonth();
        int int11 = localDate5.getDayOfMonth();
        org.joda.time.LocalDate.Property property12 = localDate5.yearOfCentury();
        org.joda.time.LocalDate localDate14 = localDate5.plusMonths((int) '4');
        org.joda.time.LocalDate.Property property15 = localDate5.year();
        org.joda.time.Chronology chronology16 = property15.getChronology();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localDate17.toDateTimeAtMidnight(dateTimeZone18);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 28 + "'", int10 == 28);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 28 + "'", int11 == 28);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks(1970);
        int int11 = localDateTime10.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withDayOfYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusYears(1980);
        java.lang.Class<?> wildcardClass16 = localDateTime15.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) '4');
        int int7 = localDateTime6.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.dayOfYear();
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime10 = property9.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = property9.getFieldType();
        int int12 = localDateTime4.get(dateTimeFieldType11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime4.minusMillis(35);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minus(readablePeriod15);
        int int17 = localDateTime16.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.weekOfWeekyear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 31 + "'", int17 == 31);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.millisOfSecond();
        int int8 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property9 = localDateTime1.centuryOfEra();
        org.joda.time.Interval interval10 = property9.toInterval();
        java.util.Locale locale12 = null;
        org.joda.time.LocalDateTime localDateTime13 = property9.setCopy("26", locale12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 25200052 + "'", int8 == 25200052);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeZone2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.weekyear();
        int int6 = localDateTime4.getYearOfEra();
        int int7 = localDateTime4.getHourOfDay();
        org.joda.time.LocalDateTime.Property property8 = localDateTime4.dayOfWeek();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2026 + "'", int6 == 2026);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withDurationAdded(readableDuration11, 0);
        int int14 = localDateTime10.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property15 = localDateTime10.yearOfEra();
        org.joda.time.LocalDateTime.Property property16 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = property16.addWrapFieldToCopy(3);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime20 = property19.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime21 = property19.roundHalfFloorCopy();
        java.lang.String str22 = property19.getAsText();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 28320052 + "'", int14 == 28320052);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "19" + "'", str22, "19");
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime7 = property3.addWrapFieldToCopy((int) '#');
        org.joda.time.DurationField durationField8 = property3.getRangeDurationField();
        java.util.Locale locale9 = null;
        int int10 = property3.getMaximumShortTextLength(locale9);
        java.util.Locale locale12 = null;
        org.joda.time.LocalDateTime localDateTime13 = property3.setCopy("0", locale12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate.Property property9 = localDate5.year();
        org.joda.time.LocalDate localDate11 = property9.addWrapFieldToCopy(25200052);
        org.joda.time.LocalDate localDate12 = property9.roundCeilingCopy();
        org.joda.time.LocalDate localDate14 = localDate12.withYear(20);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundFloorCopy();
        org.joda.time.DurationField durationField8 = property3.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(28816124);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28816124 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusSeconds((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.plusSeconds((int) (short) 100);
        org.joda.time.LocalDateTime.Property property14 = localDateTime9.dayOfYear();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) '4');
        int int17 = localDateTime16.getYearOfEra();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.minuteOfHour();
        org.joda.time.LocalDateTime.Property property19 = localDateTime16.era();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plus(readableDuration22);
        boolean boolean24 = property19.equals((java.lang.Object) localDateTime21);
        java.lang.String str25 = property19.getAsString();
        org.joda.time.LocalDateTime localDateTime26 = property19.withMinimumValue();
        int int27 = property14.compareTo((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.LocalDateTime localDateTime29 = property14.addToCopy(14);
        org.joda.time.LocalDateTime localDateTime30 = property14.roundCeilingCopy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1" + "'", str25, "1");
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime30);
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        int int5 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate7 = localDate0.withLocalMillis((long) 2001);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfCentury(2);
        org.joda.time.DateTime dateTime10 = localDate7.toDateTimeAtMidnight();
        int int11 = localDate7.getCenturyOfEra();
        int int12 = localDate7.getMonthOfYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 19 + "'", int11 == 19);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(521, 365, 2052, 3, 28834694, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28834694 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalTime localTime7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate0.toDateTime(localTime7, dateTimeZone8);
        org.joda.time.LocalDate.Property property10 = localDate0.dayOfWeek();
        org.joda.time.LocalDate.Property property11 = localDate0.era();
        org.joda.time.LocalDate localDate13 = localDate0.withYear(743);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate0.toDateTimeAtStartOfDay(dateTimeZone14);
        org.joda.time.LocalDate.Property property16 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate17 = property16.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate19 = property16.addWrapFieldToCopy(31140052);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        int int12 = localDateTime5.getValue(2);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime5.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusSeconds(32);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusDays(69);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusWeeks(1980);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("2032", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = localDate0.indexOf(dateTimeFieldType5);
        int int7 = localDate0.getYearOfCentury();
        int int8 = localDate0.getEra();
        org.joda.time.LocalDate localDate10 = localDate0.withYearOfEra(14);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate0.minus(readablePeriod11);
        int int13 = localDate0.getYearOfCentury();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 26 + "'", int7 == 26);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundFloorCopy();
        org.joda.time.DurationField durationField8 = property3.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property3.roundHalfEvenCopy();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withDurationAdded(readableDuration10, 19);
        int int13 = localDateTime9.getWeekyear();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.minus(readablePeriod14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusHours(3938);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.withDurationAdded(readableDuration18, 1955);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime15.plus(readableDuration21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        org.joda.time.LocalDateTime.Property property11 = localDateTime5.weekyear();
        org.joda.time.DateTime dateTime12 = localDateTime5.toDateTime();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) '4');
        int int15 = localDateTime14.getYearOfEra();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime18 = property16.addToCopy((int) '4');
        int int19 = localDateTime18.getEra();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.plus(readableDuration20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withDurationAdded(readableDuration24, 0);
        int int27 = localDateTime23.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) '4');
        int int30 = localDateTime29.getYearOfEra();
        org.joda.time.LocalDateTime.Property property31 = localDateTime29.minuteOfHour();
        org.joda.time.LocalDateTime.Property property32 = localDateTime29.era();
        long long33 = property32.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property32.getFieldType();
        boolean boolean35 = localDateTime23.isSupported(dateTimeFieldType34);
        boolean boolean36 = localDateTime5.isSupported(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 28320052 + "'", int27 == 28320052);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1970 + "'", int30 == 1970);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 25200052L + "'", long33 == 25200052L);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minusHours((-1));
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks(52);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusMillis(26);
        int int16 = localDateTime13.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.withWeekOfWeekyear(39);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusHours(32);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) '4');
        int int23 = localDateTime22.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime30 = localDateTime22.withFields((org.joda.time.ReadablePartial) localDateTime29);
        java.util.Date date31 = localDateTime30.toDate();
        int int32 = localDateTime30.getDayOfYear();
        org.joda.time.LocalDateTime.Property property33 = localDateTime30.weekyear();
        org.joda.time.LocalDateTime localDateTime34 = property33.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) '4');
        int int38 = localDateTime37.getYearOfEra();
        org.joda.time.LocalDateTime.Property property39 = localDateTime37.minuteOfHour();
        org.joda.time.LocalDateTime.Property property40 = localDateTime37.era();
        org.joda.time.LocalDateTime.Property property41 = localDateTime37.hourOfDay();
        int int42 = localDateTime37.getYear();
        java.lang.String str44 = localDateTime37.toString("\u0e04\u0e28.");
        org.joda.time.LocalDateTime localDateTime46 = localDateTime37.minusSeconds((int) ' ');
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.withMillisOfDay(7);
        org.joda.time.Chronology chronology50 = localDateTime49.getChronology();
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime46, chronology50);
        org.joda.time.DateTimeField dateTimeField52 = localDateTime34.getField((int) (byte) 1, chronology50);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime18.withFields((org.joda.time.ReadablePartial) localDateTime34);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.era();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1970 + "'", int38 == 1970);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1970 + "'", int42 == 1970);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\u0e04\u0e28." + "'", str44, "\u0e04\u0e28.");
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(property54);
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property3.getAsShortText(locale7);
        org.joda.time.LocalDateTime localDateTime9 = property3.roundHalfCeilingCopy();
        int int10 = localDateTime9.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.monthOfYear();
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        org.joda.time.LocalDateTime.Property property17 = new org.joda.time.LocalDateTime.Property(localDateTime9, dateTimeField16);
        org.joda.time.Chronology chronology18 = property17.getChronology();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology18);
        long long21 = localDateTime20.getLocalMillis();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(chronology18);
// flaky "21) test4494(org.joda.time.RegressionTest8)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1790582437490L + "'", long21 == 1790582437490L);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks(1970);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMonthOfYear(2);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.minusWeeks(365);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.minus(readableDuration15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusDays(251980);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property10 = localDate7.yearOfCentury();
        org.joda.time.LocalDate localDate11 = property10.roundHalfCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate11.plus(readablePeriod12);
        int int14 = localDate13.getDayOfMonth();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        int int12 = localDateTime5.getValue(2);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime5.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusMinutes(0);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.plusMinutes(19);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime14.withMinuteOfHour((int) '#');
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusSeconds(0);
        int int26 = localDateTime23.getDayOfWeek();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = localDateTime23.toString(dateTimeFormatter27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime23.withYearOfCentury(9);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.plusMonths(0);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.withMillisOfDay(7);
        org.joda.time.LocalDateTime.Property property37 = localDateTime34.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) '4');
        int int40 = localDateTime39.getYearOfEra();
        org.joda.time.LocalDateTime.Property property41 = localDateTime39.minuteOfHour();
        org.joda.time.LocalDateTime.Property property42 = localDateTime39.era();
        org.joda.time.LocalDateTime localDateTime43 = property42.roundHalfFloorCopy();
        int int44 = localDateTime43.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.withDayOfMonth(19);
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) '4');
        int int52 = localDateTime51.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime51.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime51.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime59 = localDateTime51.withFields((org.joda.time.ReadablePartial) localDateTime58);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime51.plusYears((int) (byte) -1);
        org.joda.time.ReadableDuration readableDuration62 = null;
        org.joda.time.LocalDateTime localDateTime63 = localDateTime61.plus(readableDuration62);
        int int64 = localDateTime63.size();
        int int65 = localDateTime63.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration68 = null;
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.plus(readableDuration68);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime67.minusSeconds(0);
        int int72 = localDateTime67.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property73 = localDateTime67.year();
        org.joda.time.LocalDateTime localDateTime75 = localDateTime67.plusDays(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = localDateTime75.getFieldType((int) (byte) 0);
        int int78 = localDateTime63.get(dateTimeFieldType77);
        boolean boolean79 = localDateTime49.isSupported(dateTimeFieldType77);
        int int80 = localDateTime43.get(dateTimeFieldType77);
        org.joda.time.LocalDateTime.Property property81 = localDateTime34.property(dateTimeFieldType77);
        boolean boolean82 = localDateTime33.isSupported(dateTimeFieldType77);
        boolean boolean83 = localDateTime14.isSupported(dateTimeFieldType77);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01T07:00:00.000" + "'", str28, "1970-01-01T07:00:00.000");
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1970 + "'", int40 == 1970);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 4 + "'", int64 == 4);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(localDateTime75);
        org.junit.Assert.assertNotNull(dateTimeFieldType77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1969 + "'", int78 == 1969);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertNotNull(property81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate.Property property9 = localDate5.year();
        org.joda.time.LocalDate.Property property10 = localDate5.dayOfMonth();
        org.joda.time.LocalDate localDate11 = property10.roundCeilingCopy();
        org.joda.time.LocalDate localDate13 = localDate11.plusWeeks(12);
        org.joda.time.DateTime dateTime14 = localDate13.toDateTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate16 = localDate13.plus(readablePeriod15);
        org.joda.time.ReadablePartial readablePartial17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = localDate16.isEqual(readablePartial17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Partial cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        int int10 = localDateTime7.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withDayOfMonth((int) (short) 1);
        java.util.Date date13 = localDateTime12.toDate();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.monthOfYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky "22) test4499(org.joda.time.RegressionTest8)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 28837536 + "'", int10 == 28837536);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(date13);
// flaky "2) test4499(org.joda.time.RegressionTest8)":         org.junit.Assert.assertEquals(date13.toString(), "Tue Sep 01 08:00:37 ICT 2026");
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        org.joda.time.LocalDate localDate11 = localDate9.minusYears(99);
        int int12 = localDate11.getYearOfCentury();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 67 + "'", int12 == 67);
    }
}
