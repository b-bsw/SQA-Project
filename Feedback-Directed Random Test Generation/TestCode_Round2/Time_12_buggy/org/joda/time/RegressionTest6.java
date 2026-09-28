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
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate5 = property4.getLocalDate();
        org.joda.time.LocalDate.Property property6 = localDate5.era();
        int int7 = property6.get();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minus(readablePeriod6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime10 = property8.addToCopy((long) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withFieldAdded(durationFieldType11, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
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
        org.joda.time.DateTimeField dateTimeField15 = property14.getField();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.minusWeeks((int) (byte) 10);
        org.joda.time.LocalDate.Property property3 = localDate2.yearOfEra();
        org.joda.time.LocalDate localDate5 = property3.setCopy(18);
        org.joda.time.LocalDate.Property property6 = localDate5.yearOfEra();
        org.joda.time.LocalDate.Property property7 = localDate5.dayOfYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withYear(10);
        org.joda.time.Chronology chronology8 = localDateTime5.getChronology();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withCenturyOfEra((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime5.minusYears(25200064);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate localDate10 = property8.addWrapFieldToCopy((int) (short) 0);
        int[] intArray11 = localDate10.getValues();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 2026, 9, 28 });
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1970, dateTimeZone1);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localDateTime2.getFields();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.minusDays(59);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.dayOfYear();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.withWeekyear(0);
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withCenturyOfEra(1);
        int int3 = localDateTime0.getYear();
        org.joda.time.DateTime dateTime4 = localDateTime0.toDateTime();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withHourOfDay(0);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        int int9 = localDateTime8.getYearOfEra();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        int int11 = property10.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime12 = property10.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime14 = property10.addWrapFieldToCopy((int) '#');
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
        int int29 = localDateTime14.get(dateTimeFieldType27);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime6.withField(dateTimeFieldType27, 2);
        int int32 = localDateTime6.getEra();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2026 + "'", int3 == 2026);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate0.year();
        long long4 = property3.remainder();
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate5.withPeriodAdded(readablePeriod6, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate10 = localDate5.minus(readablePeriod9);
        org.joda.time.LocalDate localDate12 = localDate10.plusYears(5232);
        int int13 = property3.compareTo((org.joda.time.ReadablePartial) localDate12);
        long long14 = property3.getMillis();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 23328000000L + "'", long4 == 23328000000L);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1790553600000L + "'", long14 == 1790553600000L);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
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
        org.joda.time.LocalDateTime localDateTime15 = property3.addToCopy(365);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) '4');
        int int18 = localDateTime17.getYearOfEra();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime21 = property19.addToCopy((int) '4');
        int int22 = localDateTime21.getEra();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.plus(readableDuration23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime21.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withDurationAdded(readableDuration27, 0);
        int int31 = localDateTime26.getValue(2);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime26.plusMonths(2);
        int int34 = property3.compareTo((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.LocalDateTime.Property property35 = localDateTime26.year();
        org.joda.time.LocalDateTime localDateTime36 = property35.roundCeilingCopy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 420L + "'", long10 == 420L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1970 + "'", int18 == 1970);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime36);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
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
        org.joda.time.LocalDateTime localDateTime16 = localDateTime1.plusMinutes(242);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
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
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime2.minus(readablePeriod16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.monthOfYear();
        org.joda.time.LocalDateTime localDateTime19 = property18.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfSecond();
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
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        int int6 = localDateTime1.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.year();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusDays(0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusMillis(69);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMonths(366);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.minusYears(42);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime11.withDurationAdded(readableDuration16, 2037);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withMillisOfDay(7);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withYear(53);
        int int7 = localDateTime4.getEra();
        int int8 = localDateTime4.getEra();
        org.joda.time.LocalDateTime.Property property9 = localDateTime4.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime4.withMinuteOfHour((int) ' ');
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) '4');
        int int14 = localDateTime13.getYearOfEra();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime17 = property15.addToCopy((int) '4');
        int int18 = localDateTime17.getEra();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) '4');
        int int21 = localDateTime20.getYearOfEra();
        org.joda.time.LocalDateTime.Property property22 = localDateTime20.minuteOfHour();
        int int23 = property22.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime25 = property22.addWrapFieldToCopy((int) 'a');
        int int26 = localDateTime25.getWeekyear();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) '4');
        int int29 = localDateTime28.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime28.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime38 = localDateTime28.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        java.util.Date date39 = localDateTime28.toDate();
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) '4');
        int int42 = localDateTime41.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property43 = localDateTime41.dayOfYear();
        org.joda.time.LocalDateTime.Property property44 = localDateTime41.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime45 = property44.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = property44.getFieldType();
        int int47 = localDateTime28.get(dateTimeFieldType46);
        boolean boolean48 = localDateTime25.isSupported(dateTimeFieldType46);
        org.joda.time.LocalDateTime.Property property49 = localDateTime17.property(dateTimeFieldType46);
        org.joda.time.LocalDateTime.Property property50 = localDateTime4.property(dateTimeFieldType46);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1970 + "'", int21 == 1970);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 59 + "'", int23 == 59);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1970 + "'", int26 == 1970);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(property50);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.DateMidnight dateMidnight7 = localDate0.toDateMidnight();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) '4');
        int int10 = localDateTime9.getYearOfEra();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime13 = property11.addToCopy((int) '4');
        org.joda.time.Chronology chronology14 = property11.getChronology();
        java.util.Locale locale15 = null;
        java.lang.String str16 = property11.getAsShortText(locale15);
        org.joda.time.LocalDateTime localDateTime17 = property11.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) '4');
        int int20 = localDateTime19.getYearOfEra();
        org.joda.time.LocalDateTime.Property property21 = localDateTime19.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime23 = property21.addToCopy((int) '4');
        org.joda.time.Chronology chronology24 = property21.getChronology();
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now(chronology24);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withDurationAdded(readableDuration26, 53);
        boolean boolean29 = localDateTime17.equals((java.lang.Object) localDateTime25);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.minusMillis(100);
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now(chronology32);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(chronology32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((java.lang.Object) localDate0, chronology32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(localDateTime33);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
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
        int int14 = localDate10.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property15 = localDate10.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) localDate10, dateTimeZone16);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
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
        org.joda.time.LocalDate localDate14 = localDate12.plusDays((int) (short) -1);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMinimumValue();
        java.util.Date date6 = localDateTime5.toDate();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime8 = property7.withMinimumValue();
        java.lang.String str9 = property7.getName();
        org.joda.time.LocalDateTime localDateTime10 = property7.withMaximumValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Jan 01 07:00:00 ICT 1");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "minuteOfHour" + "'", str9, "minuteOfHour");
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
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
        org.joda.time.LocalDateTime.Property property21 = localDateTime18.dayOfYear();
        org.joda.time.DurationField durationField22 = property21.getLeapDurationField();
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
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNull(durationField22);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
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
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.withYearOfCentury(8);
        int int23 = localDateTime18.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime18.plusMinutes((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withMinuteOfHour(55);
        int int28 = localDateTime25.getMonthOfYear();
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
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("1970-01-01T00:00:00.100");
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
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
        org.joda.time.DurationField durationField18 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime20 = property2.addToCopy((long) 68);
        org.joda.time.LocalDateTime localDateTime22 = property2.setCopy(0);
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
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
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
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfSecond();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01T07:52:00.052" + "'", str12, "1970-01-01T07:52:00.052");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localDateTime2.getFields();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.minusDays(59);
        int int6 = localDateTime5.getMonthOfYear();
        org.joda.time.Chronology chronology7 = localDateTime5.getChronology();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.LocalDate localDate10 = localDate7.plusDays(5);
        org.joda.time.LocalDate localDate12 = localDate7.withDayOfMonth(28);
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        int int14 = localDate12.getMonthOfYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate9 = localDate0.withWeekyear((int) (short) 10);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) (short) 0);
        int int12 = localDate0.compareTo((org.joda.time.ReadablePartial) localDate11);
        org.joda.time.LocalDate localDate14 = localDate0.plusYears(56);
        java.lang.String str15 = localDate14.toString();
        org.joda.time.LocalDate.Property property16 = localDate14.era();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2082-09-28" + "'", str15, "2082-09-28");
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
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
        int int23 = localDate21.getEra();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        java.util.Locale locale11 = null;
        java.lang.String str12 = localDate9.toString("271", locale11);
        int int13 = localDate9.getMonthOfYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "271" + "'", str12, "271");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withSecondOfMinute((int) ' ');
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readableDuration12);
        org.joda.time.DurationFieldType durationFieldType14 = null;
        boolean boolean15 = localDateTime11.isSupported(durationFieldType14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDateTime4.toDateTime(dateTimeZone5);
        java.lang.Class<?> wildcardClass7 = dateTime6.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
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
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate15 = localDate12.withPeriodAdded(readablePeriod13, (int) (byte) -1);
        org.joda.time.LocalDate localDate17 = localDate12.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate20 = localDate17.withPeriodAdded(readablePeriod18, 0);
        org.joda.time.LocalDate localDate22 = localDate20.minusMonths(40);
        org.joda.time.LocalDate localDate24 = localDate20.plusYears(999);
        org.joda.time.LocalDate localDate25 = localDate11.withFields((org.joda.time.ReadablePartial) localDate20);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate25);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(25200052L);
        org.joda.time.LocalDate localDate3 = localDate1.withLocalMillis(10L);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate5.withPeriodAdded(readablePeriod6, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight9 = localDate5.toDateMidnight();
        org.joda.time.LocalDate localDate11 = localDate5.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property12 = localDate11.year();
        org.joda.time.Chronology chronology13 = localDate11.getChronology();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) "2026", chronology13);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((java.lang.Object) 10L, chronology13);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology13);
        org.joda.time.DateMidnight dateMidnight17 = localDate16.toDateMidnight();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateMidnight17);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.DurationField durationField8 = property7.getDurationField();
        java.lang.String str9 = property7.getAsText();
        boolean boolean10 = property7.isLeap();
        org.joda.time.LocalDate localDate12 = property7.setCopy((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = property7.setCopy("1832-11-28");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1832-11-28\" for dayOfYear is not supported");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withCenturyOfEra(1);
        int int4 = localDateTime1.getYear();
        org.joda.time.DateTime dateTime5 = localDateTime1.toDateTime();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withHourOfDay(0);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) '4');
        int int10 = localDateTime9.getYearOfEra();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.minuteOfHour();
        int int12 = property11.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime13 = property11.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime15 = property11.addWrapFieldToCopy((int) '#');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusSeconds(0);
        int int21 = localDateTime18.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) '4');
        int int24 = localDateTime23.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property25 = localDateTime23.dayOfYear();
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime27 = property26.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = property26.getFieldType();
        int int29 = localDateTime18.indexOf(dateTimeFieldType28);
        int int30 = localDateTime15.get(dateTimeFieldType28);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime7.withField(dateTimeFieldType28, 2);
        org.joda.time.Chronology chronology33 = localDateTime32.getChronology();
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) 39, chronology33);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 59 + "'", int12 == 59);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(chronology33);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) ' ', 0, 2001, 6, 28319952);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28319952 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
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
        int int19 = localDateTime13.getEra();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
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
        org.joda.time.LocalDateTime.Property property21 = localDateTime18.dayOfYear();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.minusMonths(25200000);
        int int24 = localDateTime18.getMillisOfDay();
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
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 28319952 + "'", int24 == 28319952);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate9 = property7.addWrapFieldToCopy((int) (short) 1);
        org.joda.time.Chronology chronology10 = property7.getChronology();
        org.joda.time.LocalDate localDate11 = property7.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate15 = localDate12.withPeriodAdded(readablePeriod13, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight16 = localDate12.toDateMidnight();
        org.joda.time.LocalDate localDate18 = localDate12.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property19 = localDate18.weekyear();
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = property19.getDifference(readableInstant20);
        org.joda.time.LocalDate localDate22 = property19.withMinimumValue();
        org.joda.time.LocalDate localDate24 = property19.addWrapFieldToCopy(1);
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDate localDate28 = localDate25.withPeriodAdded(readablePeriod26, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight29 = localDate25.toDateMidnight();
        org.joda.time.LocalDate localDate31 = localDate25.plusDays((int) (short) 0);
        org.joda.time.LocalDate localDate33 = localDate25.plusYears((int) (short) 1);
        org.joda.time.LocalDate localDate35 = localDate33.withYearOfCentury(52);
        org.joda.time.LocalTime localTime36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = localDate35.toDateTime(localTime36, dateTimeZone37);
        int int39 = property19.compareTo((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.LocalDate localDate40 = property19.roundHalfFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.LocalDate localDate42 = localDate40.plus(readablePeriod41);
        int int43 = localDate11.compareTo((org.joda.time.ReadablePartial) localDate40);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
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
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate19 = localDate15.withPeriodAdded(readablePeriod17, 0);
        org.joda.time.LocalDate.Property property20 = localDate19.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.dayOfMonth();
        int int24 = localDateTime22.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) '4');
        int int27 = localDateTime26.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property28 = localDateTime26.dayOfYear();
        org.joda.time.LocalDateTime.Property property29 = localDateTime26.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime30 = property29.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property29.getFieldType();
        org.joda.time.LocalDateTime.Property property32 = localDateTime22.property(dateTimeFieldType31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate34 = localDate19.withField(dateTimeFieldType31, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfMinute' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 25 + "'", int16 == 25);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 25200052 + "'", int24 == 25200052);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(property32);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) property16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
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
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate5 = property4.getLocalDate();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate7 = localDate5.minus(readablePeriod6);
        int int8 = localDate7.getEra();
        org.joda.time.LocalDate localDate10 = localDate7.minusDays(28320052);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate localDate10 = localDate0.plusMonths((int) (short) 100);
        org.joda.time.LocalDate.Property property11 = localDate10.weekyear();
        org.joda.time.LocalDate localDate13 = property11.addWrapFieldToCopy(1973);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (-292275054));
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
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
        org.joda.time.LocalDateTime localDateTime16 = localDateTime9.plusMinutes(0);
        int int17 = localDateTime9.getWeekOfWeekyear();
        org.joda.time.LocalDateTime.Property property18 = localDateTime9.dayOfYear();
        org.joda.time.LocalDateTime.Property property19 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime20 = property19.roundFloorCopy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 39 + "'", int17 == 39);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.Interval interval4 = localDate0.toInterval();
        java.lang.String str5 = localDate0.toString();
        org.joda.time.LocalDate localDate7 = localDate0.withYear((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDate localDate9 = localDate7.minus(readablePeriod8);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-09-28" + "'", str5, "2026-09-28");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        java.lang.String str3 = property2.toString();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDateTime5.toDateTime(dateTimeZone6);
        int int8 = property2.getDifference((org.joda.time.ReadableInstant) dateTime7);
        java.util.Locale locale9 = null;
        int int10 = property2.getMaximumShortTextLength(locale9);
        org.joda.time.LocalDateTime localDateTime11 = property2.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime12 = property2.getLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone14);
        org.joda.time.DateTimeField[] dateTimeFieldArray16 = localDateTime15.getFields();
        org.joda.time.LocalDateTime.Property property17 = localDateTime15.monthOfYear();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withWeekyear(26);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) '4');
        int int22 = localDateTime21.getYearOfEra();
        org.joda.time.LocalDateTime.Property property23 = localDateTime21.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime25 = property23.addToCopy((int) '4');
        int int26 = localDateTime25.getEra();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.plus(readableDuration27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime25.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withDurationAdded(readableDuration31, 0);
        int int34 = localDateTime30.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) '4');
        int int37 = localDateTime36.getYearOfEra();
        org.joda.time.LocalDateTime.Property property38 = localDateTime36.minuteOfHour();
        org.joda.time.LocalDateTime.Property property39 = localDateTime36.era();
        long long40 = property39.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property39.getFieldType();
        boolean boolean42 = localDateTime30.isSupported(dateTimeFieldType41);
        int int43 = localDateTime19.get(dateTimeFieldType41);
        boolean boolean44 = localDateTime12.isSupported(dateTimeFieldType41);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.LocalDateTime localDateTime46 = localDateTime12.minus(readablePeriod45);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[centuryOfEra]" + "'", str3, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldArray16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1970 + "'", int22 == 1970);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 28320052 + "'", int34 == 28320052);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1970 + "'", int37 == 1970);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 25200052L + "'", long40 == 25200052L);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(localDateTime46);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
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
        org.joda.time.LocalDateTime.Property property20 = localDateTime1.hourOfDay();
        java.util.Locale locale22 = null;
        java.lang.String str23 = localDateTime1.toString("7", locale22);
        int int24 = localDateTime1.getYear();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime1.plusYears(20);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "7" + "'", str23, "7");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1970 + "'", int24 == 1970);
        org.junit.Assert.assertNotNull(localDateTime26);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate localDate8 = localDate0.plusYears((int) (short) 1);
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfCentury(52);
        org.joda.time.LocalTime localTime11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate10.toDateTime(localTime11, dateTimeZone12);
        org.joda.time.LocalDate.Property property14 = localDate10.dayOfMonth();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime1.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime1.withDayOfWeek(86399999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399999 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((-3205), 28787742, 333, 0, 2026, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2026 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate10 = localDate7.minus(readablePeriod9);
        int int11 = localDate10.getMonthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate10.withYearOfEra(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.DurationField durationField8 = property7.getDurationField();
        org.joda.time.DurationField durationField9 = property7.getLeapDurationField();
        org.joda.time.Chronology chronology10 = property7.getChronology();
        org.joda.time.LocalDate localDate11 = property7.roundFloorCopy();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
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
        java.lang.String str16 = property15.getAsShortText();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "26" + "'", str16, "26");
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
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
        java.lang.String str19 = localDateTime14.toString();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1969-01-01T07:52:00.052" + "'", str19, "1969-01-01T07:52:00.052");
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate9 = property7.addWrapFieldToCopy((int) (short) 1);
        org.joda.time.LocalDate localDate10 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate12 = localDate10.withYearOfCentury(25);
        org.joda.time.LocalDate localDate14 = localDate12.plusMonths(25200064);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
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
        org.joda.time.Chronology chronology25 = localDate24.getChronology();
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
        org.junit.Assert.assertNotNull(chronology25);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("\u0e1e\u0e24.", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
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
        int int54 = localDateTime13.getMonthOfYear();
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
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime1.withHourOfDay((int) (byte) 0);
        int int14 = localDateTime13.getCenturyOfEra();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minus(readableDuration15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 19 + "'", int14 == 19);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.minusWeeks((int) (byte) 10);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays((-3205));
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusYears(12);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusMonths(1969);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plus(readableDuration10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusSeconds(0);
        int int14 = localDateTime9.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property15 = localDateTime9.year();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime9.plusHours(10);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime17, dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime5.withFields((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.centuryOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        org.joda.time.LocalDate localDate11 = localDate7.minusWeeks((int) (byte) 1);
        org.joda.time.LocalDate.Property property12 = localDate7.dayOfYear();
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate16 = localDate13.withPeriodAdded(readablePeriod14, (int) (byte) -1);
        int int17 = localDate13.getYearOfEra();
        org.joda.time.LocalDate localDate19 = localDate13.plusDays(1970);
        org.joda.time.LocalDate.Property property20 = localDate13.dayOfYear();
        org.joda.time.LocalDate localDate22 = localDate13.withYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.Interval interval24 = localDate13.toInterval(dateTimeZone23);
        org.joda.time.LocalDate.Property property25 = localDate13.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDate localDate28 = localDate13.withPeriodAdded(readablePeriod26, 53);
        boolean boolean29 = localDate7.isAfter((org.joda.time.ReadablePartial) localDate13);
        org.joda.time.LocalDate localDate31 = localDate7.withYear(2058);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2026 + "'", int17 == 2026);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(localDate31);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withHourOfDay(32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
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
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.minusMonths(521);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withPeriodAdded(readablePeriod19, 25200000);
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
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
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
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(chronology17);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundFloorCopy();
        org.joda.time.DurationField durationField8 = property3.getRangeDurationField();
        boolean boolean9 = property3.isLeap();
        org.joda.time.LocalDateTime localDateTime11 = property3.addToCopy((long) 55);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.DateTime dateTime10 = localDate9.toDateTimeAtStartOfDay();
        int int11 = localDate9.getYear();
        org.joda.time.LocalDate.Property property12 = localDate9.dayOfYear();
        org.joda.time.LocalDate.Property property13 = localDate9.year();
        java.util.Locale locale14 = null;
        int int15 = property13.getMaximumShortTextLength(locale14);
        org.joda.time.LocalDate localDate16 = property13.roundHalfCeilingCopy();
        long long17 = localDate16.getLocalMillis();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2001 + "'", int11 == 2001);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1009843200000L + "'", long17 == 1009843200000L);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate.Property property9 = localDate5.year();
        org.joda.time.LocalDate.Property property10 = localDate5.dayOfMonth();
        org.joda.time.LocalDate localDate11 = property10.roundCeilingCopy();
        org.joda.time.LocalDate localDate13 = localDate11.withDayOfYear(32);
        java.util.Date date14 = localDate11.toDate();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 00:00:00 ICT 2026");
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 100);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMinutes(31);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withSecondOfMinute(52);
        int int16 = localDateTime15.getMonthOfYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = localDateTime4.getFields();
        int int7 = localDateTime4.getValue((int) (short) 1);
        int int8 = localDateTime4.getYearOfEra();
        org.joda.time.LocalDateTime.Property property9 = localDateTime4.millisOfDay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        java.util.Locale locale5 = null;
        int int6 = property4.getMaximumTextLength(locale5);
        org.joda.time.LocalDateTime localDateTime7 = property4.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusSeconds(28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
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
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime9);
        int int14 = localDateTime9.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(5, 3938, 40, 39, 0, 1970, 36);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
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
        org.joda.time.LocalDate localDate13 = property12.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate17 = localDate14.withPeriodAdded(readablePeriod15, (int) (byte) -1);
        org.joda.time.LocalDate localDate19 = localDate14.minusWeeks((int) (short) 0);
        int int20 = localDate19.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = localDate19.toDateMidnight(dateTimeZone21);
        int int23 = property12.compareTo((org.joda.time.ReadableInstant) dateMidnight22);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        boolean boolean6 = property5.isLeap();
        java.util.Locale locale7 = null;
        int int8 = property5.getMaximumTextLength(locale7);
        org.joda.time.LocalDateTime localDateTime10 = property5.addToCopy((long) 9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusMinutes(9);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusMillis((int) (short) 10);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
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
        int int35 = localDateTime5.getWeekyear();
        int int36 = localDateTime5.getYearOfEra();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1970 + "'", int35 == 1970);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1970 + "'", int36 == 1970);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
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
        org.joda.time.Chronology chronology16 = localDate15.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray17 = localDate15.getFields();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeFieldArray17, dateTimeZone18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: [Lorg.joda.time.DateTimeField;");
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
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeFieldArray17);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = localDate0.indexOf(dateTimeFieldType5);
        org.joda.time.DurationFieldType durationFieldType7 = null;
        boolean boolean8 = localDate0.isSupported(durationFieldType7);
        org.joda.time.LocalDate localDate10 = localDate0.minusMonths(3);
        org.joda.time.DateTime dateTime11 = localDate0.toDateTimeAtCurrentTime();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.minusWeeks((int) (byte) 10);
        org.joda.time.LocalDate.Property property3 = localDate2.year();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate.Property property9 = localDate8.dayOfWeek();
        int int10 = localDate8.getDayOfMonth();
        org.joda.time.LocalDate localDate12 = localDate8.plusMonths(2001);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate15 = localDate13.minusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology16 = localDate15.getChronology();
        boolean boolean17 = localDate8.equals((java.lang.Object) chronology16);
        java.util.Date date18 = localDate8.toDate();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Wed Dec 31 00:00:00 ICT 1969");
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.dayOfYear();
        int int2 = property1.getMinimumValueOverall();
        org.joda.time.LocalDate localDate3 = property1.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 8, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusDays(42);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.yearOfEra();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        java.lang.String str7 = localDateTime6.toString();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withMinuteOfHour(0);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.weekyear();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundHalfFloorCopy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0035-01-04T07:00:00.052" + "'", str7, "0035-01-04T07:00:00.052");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYear();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusYears(14);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.minuteOfHour();
        int int6 = property5.get();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
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
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.minusHours(365);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = localDateTime17.getValue(40);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 40");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("2026-09-28");
        org.joda.time.LocalDate.Property property2 = localDate1.dayOfYear();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate6 = localDate3.withPeriodAdded(readablePeriod4, (int) (byte) -1);
        org.joda.time.LocalDate localDate8 = localDate3.plusWeeks(0);
        org.joda.time.LocalDate localDate10 = localDate8.withYear((int) ' ');
        org.joda.time.LocalDate.Property property11 = localDate8.monthOfYear();
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate14 = localDate12.minusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate12.toDateTimeAtCurrentTime(dateTimeZone15);
        int int17 = property11.compareTo((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DurationField durationField18 = property11.getRangeDurationField();
        org.joda.time.LocalDate localDate19 = property11.roundFloorCopy();
        org.joda.time.LocalDate.Property property20 = localDate19.weekyear();
        org.joda.time.LocalDate localDate22 = localDate19.plusMonths(52);
        org.joda.time.LocalDate localDate24 = localDate19.withDayOfYear(26);
        int int25 = property2.compareTo((org.joda.time.ReadablePartial) localDate24);
        org.joda.time.LocalDate localDate26 = property2.roundCeilingCopy();
        org.joda.time.LocalDate localDate28 = localDate26.plusWeeks(70);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
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
        org.joda.time.DateTimeField[] dateTimeFieldArray15 = localDateTime10.getFields();
        int int17 = localDateTime10.getValue((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 28320052 + "'", int14 == 28320052);
        org.junit.Assert.assertNotNull(dateTimeFieldArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withCenturyOfEra(652);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
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
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.weekOfWeekyear();
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
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
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
        java.lang.String str18 = localDate13.toString();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "5232-02-10" + "'", str18, "5232-02-10");
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withMillisOfDay(7);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(chronology3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withDayOfMonth(231);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 231 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(743, (int) (byte) 100, 53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        java.lang.String str8 = property7.getAsText();
        java.util.Locale locale10 = null;
        org.joda.time.LocalDate localDate11 = property7.setCopy("2026", locale10);
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate15 = localDate12.withPeriodAdded(readablePeriod13, (int) (byte) -1);
        org.joda.time.LocalDate localDate17 = localDate12.plusWeeks(0);
        org.joda.time.LocalDate localDate19 = localDate17.withYear((int) ' ');
        org.joda.time.LocalDate localDate21 = localDate19.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property22 = localDate19.yearOfCentury();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDate localDate27 = localDate24.withPeriodAdded(readablePeriod25, (int) (byte) -1);
        int int28 = localDate24.getYearOfEra();
        org.joda.time.LocalDate localDate30 = localDate24.plusDays(1970);
        org.joda.time.LocalDate localDate31 = localDate23.withFields((org.joda.time.ReadablePartial) localDate30);
        org.joda.time.LocalDate.Property property32 = localDate30.monthOfYear();
        org.joda.time.LocalDate localDate34 = localDate30.withCenturyOfEra((int) '4');
        org.joda.time.LocalDate localDate36 = localDate34.withDayOfMonth((int) (byte) 10);
        boolean boolean37 = localDate19.isAfter((org.joda.time.ReadablePartial) localDate36);
        org.joda.time.LocalDate.Property property38 = localDate36.dayOfMonth();
        java.util.Date date39 = localDate36.toDate();
        boolean boolean40 = localDate11.isAfter((org.joda.time.ReadablePartial) localDate36);
        org.joda.time.LocalDate.Property property41 = localDate36.weekOfWeekyear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026" + "'", str8, "2026");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2026 + "'", int28 == 2026);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Tue Feb 10 00:00:00 ICT 5232");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(property41);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.DurationField durationField4 = property3.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.centuryOfEra();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.withYearOfCentury(0);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate9 = localDate6.withPeriodAdded(readablePeriod7, (int) (byte) -1);
        int int10 = localDate6.getYearOfEra();
        org.joda.time.LocalDate localDate12 = localDate6.plusDays(1970);
        org.joda.time.LocalDate localDate13 = localDate5.withFields((org.joda.time.ReadablePartial) localDate12);
        long long14 = localDate5.getLocalMillis();
        java.lang.String str15 = localDate5.toString();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate17 = localDate5.minus(readablePeriod16);
        int int18 = localDate0.compareTo((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property19 = localDate5.era();
        int int20 = property19.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2026 + "'", int10 == 2026);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1790553600000L + "'", long14 == 1790553600000L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2026-09-28" + "'", str15, "2026-09-28");
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 999, chronology1);
        int int3 = localDate2.getWeekyear();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = localDate2.getFieldTypes();
        org.joda.time.LocalDate localDate6 = localDate2.minusDays(2027);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
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
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime2.minus(readablePeriod16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime2.withWeekOfWeekyear(0);
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
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        int int10 = localDate5.getDayOfMonth();
        org.joda.time.LocalDate.Property property11 = localDate5.dayOfMonth();
        org.joda.time.LocalDate localDate12 = property11.roundCeilingCopy();
        org.joda.time.LocalDate localDate14 = localDate12.minusMonths(24208);
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
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime6 = property4.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = property4.addWrapFieldToCopy(521);
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = property4.setCopy("1832-11-28", locale10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1832-11-28\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.year();
        org.joda.time.LocalDateTime localDateTime12 = property10.addToCopy(244);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusMinutes(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField7 = localDateTime5.getField(25200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 25200000");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        java.util.Locale locale11 = null;
        java.lang.String str12 = localDate9.toString("271", locale11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 2026, dateTimeZone14);
        int[] intArray16 = localDate15.getValues();
        org.joda.time.LocalDate.Property property17 = localDate15.weekOfWeekyear();
        org.joda.time.LocalDate localDate19 = property17.addToCopy(10);
        org.joda.time.LocalDate localDate21 = property17.addToCopy(1970);
        int int22 = localDate21.getYearOfEra();
        org.joda.time.LocalDate.Property property23 = localDate21.weekOfWeekyear();
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDate localDate27 = localDate24.withPeriodAdded(readablePeriod25, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight28 = localDate24.toDateMidnight();
        org.joda.time.LocalDate localDate30 = localDate24.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property31 = localDate30.year();
        org.joda.time.DateTimeField dateTimeField32 = property31.getField();
        org.joda.time.LocalDate.Property property33 = new org.joda.time.LocalDate.Property(localDate21, dateTimeField32);
        org.joda.time.LocalDate.Property property34 = new org.joda.time.LocalDate.Property(localDate9, dateTimeField32);
        org.joda.time.LocalDate.Property property35 = localDate9.year();
        long long36 = property35.getMillis();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "271" + "'", str12, "271");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2007 + "'", int22 == 2007);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-61133961600000L) + "'", long36 == (-61133961600000L));
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate.Property property9 = localDate5.year();
        org.joda.time.LocalDate.Property property10 = localDate5.dayOfMonth();
        org.joda.time.LocalDate localDate11 = property10.roundCeilingCopy();
        org.joda.time.LocalDate localDate13 = property10.setCopy((int) (byte) 1);
        org.joda.time.Chronology chronology14 = property10.getChronology();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
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
        org.joda.time.DateTime dateTime14 = localDate13.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate16 = localDate13.plusWeeks((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = localDate13.toString(dateTimeFormatter17);
        org.joda.time.LocalDate localDate20 = localDate13.withWeekyear(365);
        int int21 = localDate20.getWeekyear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0743-09-28" + "'", str18, "0743-09-28");
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 365 + "'", int21 == 365);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withCenturyOfEra(1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.withMillisOfDay(4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.centuryOfEra();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
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
        org.joda.time.LocalDate.Property property17 = localDate0.monthOfYear();
        int int18 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate20 = localDate0.withYear(271);
        int int21 = localDate0.getDayOfWeek();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 28 + "'", int18 == 28);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate9 = localDate6.withPeriodAdded(readablePeriod7, (int) (byte) -1);
        int int10 = localDate6.getYearOfEra();
        org.joda.time.LocalDate localDate12 = localDate6.plusDays(1970);
        org.joda.time.LocalDate localDate13 = localDate5.withFields((org.joda.time.ReadablePartial) localDate12);
        org.joda.time.LocalDate.Property property14 = localDate12.monthOfYear();
        int int15 = localDate12.getMonthOfYear();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate18 = localDate12.withPeriodAdded(readablePeriod16, 25200052);
        org.joda.time.LocalDate localDate20 = localDate18.plusWeeks(269);
        org.joda.time.LocalDate localDate22 = localDate20.plusWeeks(242);
        org.joda.time.LocalDate localDate24 = localDate20.withDayOfMonth(1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = localDateTime4.compareTo((org.joda.time.ReadablePartial) localDate24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2026 + "'", int10 == 2026);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 8, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusHours(28319952);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusHours((-292275054));
        org.joda.time.DurationFieldType durationFieldType7 = null;
        boolean boolean8 = localDateTime4.isSupported(durationFieldType7);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        boolean boolean6 = property5.isLeap();
        java.util.Locale locale7 = null;
        int int8 = property5.getMaximumTextLength(locale7);
        java.util.Locale locale9 = null;
        int int10 = property5.getMaximumTextLength(locale9);
        int int11 = property5.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-292275054) + "'", int11 == (-292275054));
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
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
        org.joda.time.Chronology chronology16 = property14.getChronology();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now(chronology16);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now(chronology16);
        java.util.Date date19 = localDateTime18.toDate();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "7" + "'", str15, "7");
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(date19);
// flaky "1) test3112(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals(date19.toString(), "Mon Sep 28 08:00:27 ICT 2026");
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfEra(59);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(43, 36526, 58, 55, 15, 50);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 55 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        int int12 = localDateTime11.getMillisOfSecond();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.plus(readableDuration13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withPeriodAdded(readablePeriod15, 1970);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.minus(readablePeriod18);
        org.joda.time.DateTime dateTime20 = localDateTime14.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = localDateTime14.withMonthOfYear(740341);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 740341 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
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
        org.joda.time.LocalDateTime.Property property16 = localDateTime13.yearOfEra();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 19 + "'", int14 == 19);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate.Property property9 = localDate8.dayOfWeek();
        int int10 = localDate8.getDayOfMonth();
        int int11 = localDate8.getYearOfCentury();
        org.joda.time.LocalDate.Property property12 = localDate8.monthOfYear();
        org.joda.time.LocalDate.Property property13 = localDate8.monthOfYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 69 + "'", int11 == 69);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        org.joda.time.DateTime dateTime10 = localDate7.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate7.plus(readablePeriod11);
        org.joda.time.DateMidnight dateMidnight13 = localDate7.toDateMidnight();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateMidnight13);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
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
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate19 = localDate15.withPeriodAdded(readablePeriod17, 0);
        org.joda.time.LocalDate.Property property20 = localDate19.dayOfMonth();
        org.joda.time.LocalDate.Property property21 = localDate19.dayOfMonth();
        org.joda.time.LocalDate localDate23 = localDate19.withWeekOfWeekyear(24);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 25 + "'", int16 == 25);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDate23);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay();
        java.util.Date date7 = localDate0.toDate();
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.fromDateFields(date7);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromDateFields(date7);
        int int10 = localDate9.size();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Mon Sep 28 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = localDateTime4.getFields();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYear(743);
        java.util.Locale locale9 = null;
        java.lang.String str10 = localDateTime7.toString("7", locale9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withMillisOfDay(3938);
        long long13 = localDateTime7.getLocalMillis();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "7" + "'", str10, "7");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-38720393999990L) + "'", long13 == (-38720393999990L));
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate6 = property4.addToCopy(10);
        org.joda.time.LocalDate localDate8 = property4.addToCopy(1970);
        org.joda.time.LocalDate.Property property9 = localDate8.centuryOfEra();
        org.joda.time.LocalDate localDate11 = localDate8.withWeekyear(1970);
        org.joda.time.LocalDate.Property property12 = localDate8.weekyear();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate localDate10 = localDate8.minusYears(25200052);
        int int11 = localDate10.getDayOfWeek();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTimeAtStartOfDay(dateTimeZone13);
        org.joda.time.LocalDate localDate16 = localDate12.withDayOfYear(4);
        org.joda.time.LocalDate localDate18 = localDate16.minusWeeks((int) (short) 10);
        int int19 = localDate16.getYear();
        org.joda.time.LocalDate.Property property20 = localDate16.dayOfMonth();
        org.joda.time.LocalDate localDate21 = property20.withMaximumValue();
        org.joda.time.DurationFieldType durationFieldType22 = null;
        boolean boolean23 = localDate21.isSupported(durationFieldType22);
        org.joda.time.LocalDate localDate24 = localDate10.withFields((org.joda.time.ReadablePartial) localDate21);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2026 + "'", int19 == 2026);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localDate24);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks(10);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusDays((int) (short) -1);
        int int13 = localDateTime10.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("0070-01-01T07:00:00.052", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        java.util.Date date6 = localDateTime1.toDate();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.plusDays(0);
        int int9 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readableDuration12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.minusSeconds(0);
        int int16 = localDateTime11.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property17 = localDateTime11.year();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime11.plusDays(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = localDateTime19.getFieldType((int) (byte) 0);
        int int22 = localDateTime1.get(dateTimeFieldType21);
        int int23 = localDateTime1.getWeekyear();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1970 + "'", int22 == 1970);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1970 + "'", int23 == 1970);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = property3.withMinimumValue();
        org.joda.time.Interval interval8 = property3.toInterval();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(interval8);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = localDate0.indexOf(dateTimeFieldType5);
        org.joda.time.LocalDate localDate8 = localDate0.withWeekyear((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate10 = localDate8.minus(readablePeriod9);
        java.util.Date date11 = localDate10.toDate();
        org.joda.time.LocalDate localDate13 = localDate10.withMonthOfYear((int) (byte) 1);
        org.joda.time.LocalDate.Property property14 = localDate13.year();
        org.joda.time.DurationField durationField15 = property14.getDurationField();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Oct 04 00:00:00 ICT 2");
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate10 = localDate0.minusMonths((int) '#');
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate13 = localDate0.withPeriodAdded(readablePeriod11, 1970);
        org.joda.time.LocalDate.Property property14 = localDate13.year();
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate18 = localDate15.withPeriodAdded(readablePeriod16, (int) (byte) -1);
        org.joda.time.LocalDate localDate20 = localDate15.plusWeeks(0);
        org.joda.time.LocalDate localDate22 = localDate20.withYear((int) ' ');
        org.joda.time.LocalDate.Property property23 = localDate20.monthOfYear();
        org.joda.time.LocalDate.Property property24 = localDate20.year();
        org.joda.time.LocalDate.Property property25 = localDate20.dayOfMonth();
        org.joda.time.LocalDate localDate26 = property25.roundCeilingCopy();
        org.joda.time.LocalDate localDate28 = localDate26.withDayOfYear(32);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate30 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDate localDate33 = localDate30.withPeriodAdded(readablePeriod31, (int) (byte) -1);
        int int34 = localDate30.getYearOfEra();
        org.joda.time.LocalDate localDate36 = localDate30.plusDays(1970);
        org.joda.time.LocalDate localDate37 = localDate29.withFields((org.joda.time.ReadablePartial) localDate36);
        long long38 = localDate29.getLocalMillis();
        org.joda.time.LocalDate.Property property39 = localDate29.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = null;
        boolean boolean41 = localDate29.isSupported(dateTimeFieldType40);
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate43 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalDate localDate46 = localDate43.withPeriodAdded(readablePeriod44, (int) (byte) -1);
        int int47 = localDate43.getYearOfEra();
        org.joda.time.LocalDate localDate49 = localDate43.plusDays(1970);
        org.joda.time.LocalDate localDate50 = localDate42.withFields((org.joda.time.ReadablePartial) localDate49);
        boolean boolean51 = localDate29.equals((java.lang.Object) localDate50);
        org.joda.time.LocalDate localDate53 = localDate50.minusMonths(4);
        boolean boolean54 = localDate28.equals((java.lang.Object) 4);
        int int55 = property14.compareTo((org.joda.time.ReadablePartial) localDate28);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2026 + "'", int34 == 2026);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1790553600000L + "'", long38 == 1790553600000L);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2026 + "'", int47 == 2026);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate localDate9 = property8.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate9.withDayOfWeek(58);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 58 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
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
        int int19 = localDateTime14.getDayOfMonth();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.secondOfMinute();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.DurationField durationField8 = property7.getDurationField();
        java.lang.String str9 = property7.getAsShortText();
        boolean boolean10 = property7.isLeap();
        java.util.Locale locale11 = null;
        int int12 = property7.getMaximumTextLength(locale11);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "271" + "'", str9, "271");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
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
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.plusDays(292278993);
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
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
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
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusMillis(25);
        org.joda.time.LocalDateTime.Property property21 = localDateTime18.millisOfSecond();
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
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.Interval interval4 = localDate0.toInterval();
        org.joda.time.LocalDate.Property property5 = localDate0.dayOfYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("2027-01-04");
        org.junit.Assert.assertNotNull(localDate1);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 740341, dateTimeZone1);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYearOfCentury(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withDayOfWeek(59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
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
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withWeekyear(292278993);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plus(readableDuration7);
        boolean boolean9 = property4.equals((java.lang.Object) localDateTime6);
        java.lang.String str10 = property4.getAsString();
        org.joda.time.LocalDateTime localDateTime11 = property4.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime12 = property4.withMaximumValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.withDayOfYear(4);
        org.joda.time.LocalDate localDate6 = localDate4.minusWeeks((int) (short) 10);
        int int7 = localDate4.getYear();
        org.joda.time.LocalDate.Property property8 = localDate4.dayOfMonth();
        org.joda.time.LocalDate localDate9 = property8.withMaximumValue();
        org.joda.time.DurationFieldType durationFieldType10 = null;
        boolean boolean11 = localDate9.isSupported(durationFieldType10);
        org.joda.time.DateTimeField[] dateTimeFieldArray12 = localDate9.getFields();
        int int13 = localDate9.getYearOfCentury();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2026 + "'", int7 == 2026);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfDay(2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime7 = property5.withMaximumValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundHalfFloorCopy();
        int int6 = localDateTime5.getDayOfYear();
        int int7 = localDateTime5.getWeekyear();
        int int8 = localDateTime5.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.minusWeeks((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeZone2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.weekyear();
        int int6 = localDateTime4.getYearOfEra();
        int int7 = localDateTime4.getHourOfDay();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.plus(readablePeriod8);
        int int10 = localDateTime9.size();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.dayOfWeek();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2026 + "'", int6 == 2026);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMinimumValue();
        java.util.Date date6 = localDateTime5.toDate();
        org.joda.time.DateTime dateTime7 = localDateTime5.toDateTime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Jan 01 07:00:00 ICT 1");
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(25200064, 36, 2001, 2058, 58);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2058 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = localDate5.withWeekOfWeekyear(1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for weekOfWeekyear must be in the range [1,53]");
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
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate9 = localDate0.withLocalMillis((long) 24);
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate13 = localDate10.withPeriodAdded(readablePeriod11, (int) (byte) -1);
        org.joda.time.LocalDate localDate15 = localDate10.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate18 = localDate10.withPeriodAdded(readablePeriod16, (-1));
        org.joda.time.LocalDate localDate20 = localDate18.withYear(25200052);
        java.lang.String str22 = localDate18.toString("2026");
        org.joda.time.Chronology chronology23 = localDate18.getChronology();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((java.lang.Object) localDate9, chronology23);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2026" + "'", str22, "2026");
        org.junit.Assert.assertNotNull(chronology23);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime6 = property3.roundFloorCopy();
        int int7 = property3.getLeapAmount();
        org.joda.time.DateTimeField dateTimeField8 = property3.getField();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
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
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime2.minus(readablePeriod16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.monthOfYear();
        int int19 = localDateTime17.getMillisOfDay();
        org.joda.time.DateTime dateTime20 = localDateTime17.toDateTime();
        int int21 = localDateTime17.getDayOfYear();
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
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 25200000 + "'", int19 == 25200000);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, (-1));
        org.joda.time.LocalDate localDate10 = localDate8.withLocalMillis((long) 5);
        org.joda.time.LocalTime localTime11 = null;
        org.joda.time.DateTime dateTime12 = localDate8.toDateTime(localTime11);
        org.joda.time.LocalTime localTime13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate8.toDateTime(localTime13, dateTimeZone14);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = localDate8.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate8.plus(readablePeriod17);
        org.joda.time.DateTime dateTime19 = localDate8.toDateTimeAtStartOfDay();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfSecond();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
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
        org.joda.time.LocalDateTime.Property property18 = localDateTime10.secondOfMinute();
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
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMonthOfYear(2);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.minus(readableDuration6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withPeriodAdded(readablePeriod8, 2);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.plusSeconds(2922789);
        int int13 = localDateTime7.getDayOfYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minusHours((int) 'a');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withYearOfCentury(9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime8.year();
        int int12 = localDateTime8.getMillisOfDay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21600052 + "'", int12 == 21600052);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
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
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime2.minus(readablePeriod16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime19 = property18.roundHalfFloorCopy();
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
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) '4');
        int int4 = localDateTime3.getYearOfEra();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy((int) '4');
        org.joda.time.Chronology chronology8 = property5.getChronology();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property5.getAsShortText(locale9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundHalfCeilingCopy();
        int int12 = localDateTime11.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime14.monthOfYear();
        org.joda.time.DateTimeField dateTimeField18 = property17.getField();
        org.joda.time.LocalDateTime.Property property19 = new org.joda.time.LocalDateTime.Property(localDateTime11, dateTimeField18);
        org.joda.time.LocalDateTime.Property property20 = new org.joda.time.LocalDateTime.Property(localDateTime1, dateTimeField18);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1970 + "'", int4 == 1970);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.Interval interval7 = property3.toInterval();
        org.joda.time.LocalDateTime localDateTime9 = property3.addWrapFieldToCopy(50);
        int int10 = property3.getMinimumValue();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property3.getAsText(locale11);
        org.joda.time.LocalDateTime localDateTime14 = property3.addToCopy(53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        java.util.Date date12 = localDateTime1.toDate();
        java.util.Locale locale14 = null;
        java.lang.String str15 = localDateTime1.toString("2026-01-04", locale14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.plusYears(14403717);
        org.joda.time.LocalDate localDate18 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDate localDate21 = localDate18.withPeriodAdded(readablePeriod19, (int) (byte) -1);
        org.joda.time.LocalDate localDate23 = localDate18.plusWeeks(0);
        org.joda.time.LocalDate localDate25 = localDate23.withYear((int) ' ');
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDate localDate29 = localDate26.withPeriodAdded(readablePeriod27, (int) (byte) -1);
        org.joda.time.LocalDate localDate31 = localDate26.plusWeeks(0);
        org.joda.time.LocalDate localDate33 = localDate31.withYear((int) ' ');
        org.joda.time.LocalDate localDate35 = localDate31.withYearOfCentury((int) (byte) 1);
        int int36 = localDate31.getDayOfMonth();
        boolean boolean38 = localDate31.equals((java.lang.Object) "Property[minuteOfHour]");
        org.joda.time.LocalDate localDate39 = localDate23.withFields((org.joda.time.ReadablePartial) localDate31);
        int int40 = localDate23.getEra();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.LocalDate localDate43 = localDate23.withPeriodAdded(readablePeriod41, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = localDateTime17.compareTo((org.joda.time.ReadablePartial) localDate43);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2026-01-04" + "'", str15, "2026-01-04");
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 28 + "'", int36 == 28);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(localDate43);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 32);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfYear(3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfDay();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) '4');
        int int8 = localDateTime7.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.dayOfYear();
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime11 = property10.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property10.getFieldType();
        int int13 = localDateTime4.get(dateTimeFieldType12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime4.minusYears(8);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime4.minusYears(269);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((java.lang.Object) 269);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.DurationField durationField4 = property3.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime6 = property3.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime7 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime8 = property3.roundHalfFloorCopy();
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = property3.setCopy("2026-09-28T15:00:14.501", locale10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2026-09-28T15:00:14.501\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = localDate0.indexOf(dateTimeFieldType5);
        org.joda.time.LocalDate localDate8 = localDate0.withWeekyear((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate10 = localDate8.minus(readablePeriod9);
        java.util.Date date11 = localDate10.toDate();
        org.joda.time.LocalDate localDate13 = localDate10.withMonthOfYear((int) (byte) 1);
        org.joda.time.LocalDate.Property property14 = localDate13.year();
        org.joda.time.LocalDate.Property property15 = localDate13.monthOfYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Oct 04 00:00:00 ICT 2");
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
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
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDate localDate22 = localDate19.withPeriodAdded(readablePeriod20, (int) (byte) -1);
        int int23 = localDate19.getYearOfEra();
        org.joda.time.LocalDate localDate25 = localDate19.plusDays(1970);
        org.joda.time.LocalDate localDate26 = localDate18.withFields((org.joda.time.ReadablePartial) localDate25);
        org.joda.time.LocalDate localDate28 = localDate18.minusMonths((int) '#');
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localDate18.toDateTimeAtCurrentTime(dateTimeZone29);
        boolean boolean31 = localDate17.equals((java.lang.Object) dateTimeZone29);
        int int32 = localDate17.getYearOfEra();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "271" + "'", str12, "271");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2026 + "'", int23 == 2026);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 31 + "'", int32 == 31);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundHalfFloorCopy();
        int int8 = localDateTime7.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.plusMinutes((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        int int9 = localDateTime8.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime16 = localDateTime8.withFields((org.joda.time.ReadablePartial) localDateTime15);
        java.util.Date date17 = localDateTime16.toDate();
        int int18 = localDateTime16.getDayOfYear();
        org.joda.time.LocalDateTime.Property property19 = localDateTime16.weekyear();
        org.joda.time.LocalDateTime localDateTime20 = property19.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) '4');
        int int24 = localDateTime23.getYearOfEra();
        org.joda.time.LocalDateTime.Property property25 = localDateTime23.minuteOfHour();
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.era();
        org.joda.time.LocalDateTime.Property property27 = localDateTime23.hourOfDay();
        int int28 = localDateTime23.getYear();
        java.lang.String str30 = localDateTime23.toString("\u0e04\u0e28.");
        org.joda.time.LocalDateTime localDateTime32 = localDateTime23.minusSeconds((int) ' ');
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withMillisOfDay(7);
        org.joda.time.Chronology chronology36 = localDateTime35.getChronology();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime32, chronology36);
        org.joda.time.DateTimeField dateTimeField38 = localDateTime20.getField((int) (byte) 1, chronology36);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(8, 5232, 52, 25200000, 41, 24208, 269, chronology36);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25200000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1970 + "'", int24 == 1970);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1970 + "'", int28 == 1970);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u0e04\u0e28." + "'", str30, "\u0e04\u0e28.");
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField38);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(28815681, (int) (byte) -1, 2026, (int) '#', 20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate10 = localDate0.minusMonths((int) '#');
        org.joda.time.LocalDate.Property property11 = localDate0.monthOfYear();
        org.joda.time.LocalDate.Property property12 = localDate0.yearOfEra();
        int int13 = localDate0.getYear();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2026 + "'", int13 == 2026);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        boolean boolean17 = localDateTime13.isSupported(dateTimeFieldType16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.plusWeeks((-1790557193));
        java.util.Locale locale21 = null;
        java.lang.String str22 = localDateTime19.toString("2036-06-19", locale21);
        int int23 = localDateTime19.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T07:00:00.000" + "'", str5, "1970-01-01T07:00:00.000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 59 + "'", int10 == 59);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2036-06-19" + "'", str22, "2036-06-19");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 22 + "'", int23 == 22);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
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
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime9);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusDays(365);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withDayOfWeek(33);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 33 for dayOfWeek must be in the range [1,7]");
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
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.DateTime dateTime10 = localDate9.toDateTimeAtStartOfDay();
        int int11 = localDate9.getYear();
        org.joda.time.LocalDate.Property property12 = localDate9.dayOfYear();
        org.joda.time.LocalDate.Property property13 = localDate9.year();
        org.joda.time.Chronology chronology14 = localDate9.getChronology();
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now(chronology14);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2001 + "'", int11 == 2001);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.millisOfSecond();
        int int8 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property9 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime12 = property9.addToCopy(2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 25200052 + "'", int8 == 25200052);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYear();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        boolean boolean4 = property3.isLeap();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate0.dayOfMonth();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        int int12 = localDateTime5.getValue(2);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime5.minusDays(28);
        int[] intArray15 = localDateTime5.getValues();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = localDateTime5.toString("centuryOfEra");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: c");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1970, 1, 1, 28320052 });
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        int int4 = localDateTime1.getHourOfDay();
        int int5 = localDateTime1.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusHours((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withTime((int) '#', 269, (int) (short) 1, 28825373);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime1.withHourOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.yearOfCentury();
        org.joda.time.Chronology chronology15 = property14.getChronology();
        org.joda.time.LocalDateTime localDateTime16 = property14.getLocalDateTime();
        int int17 = localDateTime16.getMillisOfDay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
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
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.plusHours(1973);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
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
            int int13 = localDate10.getValue(28320052);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 28320052");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
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
        org.joda.time.LocalDate localDate16 = localDate14.plusYears(9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = localDate14.withMonthOfYear(69);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        boolean boolean10 = localDate7.equals((java.lang.Object) 100.0d);
        org.joda.time.LocalDate.Property property11 = localDate7.era();
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate15 = localDate12.withPeriodAdded(readablePeriod13, (int) (byte) -1);
        org.joda.time.LocalDate localDate17 = localDate12.plusWeeks(0);
        org.joda.time.LocalDate localDate19 = localDate17.withYear((int) ' ');
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDate localDate23 = localDate20.withPeriodAdded(readablePeriod21, (int) (byte) -1);
        org.joda.time.LocalDate localDate25 = localDate20.plusWeeks(0);
        org.joda.time.LocalDate localDate27 = localDate25.withYear((int) ' ');
        org.joda.time.LocalDate localDate29 = localDate25.withYearOfCentury((int) (byte) 1);
        int int30 = localDate25.getDayOfMonth();
        boolean boolean32 = localDate25.equals((java.lang.Object) "Property[minuteOfHour]");
        org.joda.time.LocalDate localDate33 = localDate17.withFields((org.joda.time.ReadablePartial) localDate25);
        org.joda.time.DateMidnight dateMidnight34 = localDate17.toDateMidnight();
        // The following exception was thrown during execution in test generation
        try {
            long long35 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight34);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 28 + "'", int30 == 28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(dateMidnight34);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.hourOfDay();
        int int6 = localDateTime1.getYear();
        java.lang.String str8 = localDateTime1.toString("\u0e04\u0e28.");
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minusSeconds((int) ' ');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusSeconds(269);
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.era();
        long long14 = property13.getMillis();
        org.joda.time.LocalDateTime localDateTime15 = property13.roundCeilingCopy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u0e04\u0e28." + "'", str8, "\u0e04\u0e28.");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 25168052L + "'", long14 == 25168052L);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, (-1));
        org.joda.time.LocalDate localDate10 = localDate8.withLocalMillis((long) 5);
        org.joda.time.LocalDate localDate12 = localDate10.withMonthOfYear(5);
        int int13 = localDate10.getDayOfYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
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
        java.util.Locale locale15 = null;
        int int16 = property14.getMaximumShortTextLength(locale15);
        org.joda.time.LocalDateTime localDateTime18 = property14.addToCopy(4233600000L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
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
        org.joda.time.LocalDate localDate17 = localDate13.withDayOfMonth(7);
        int int18 = localDate17.getCenturyOfEra();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDateTime1.toDateTime(dateTimeZone3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withDurationAdded(readableDuration5, (int) (byte) 10);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.millisOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        int int10 = localDate5.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight11 = localDate5.toDateMidnight();
        org.joda.time.LocalDate.Property property12 = localDate5.weekOfWeekyear();
        org.joda.time.LocalDate localDate13 = property12.roundHalfFloorCopy();
        int int14 = property12.getMaximumValueOverall();
        int int15 = property12.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 28 + "'", int10 == 28);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        int int9 = localDate6.getDayOfYear();
        org.joda.time.LocalDate localDate11 = localDate6.minusWeeks((int) (short) 0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 50 + "'", int9 == 50);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(652, 21600052, 10, 28, 251980, 43, 7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
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
        org.joda.time.LocalDate localDate28 = property27.withMinimumValue();
        org.joda.time.LocalDate localDate29 = property27.roundCeilingCopy();
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
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate29);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("2026-09-28T15:00:09.408");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2026-09-28T15:00:09.408\" is malformed at \"T15:00:09.408\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDateTime1.toDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minusWeeks(14403717);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
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
        org.joda.time.LocalDate localDate16 = localDate14.plusYears(9);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localDate16.toDateTimeAtStartOfDay(dateTimeZone17);
        org.joda.time.LocalDate.Property property19 = localDate16.centuryOfEra();
        org.joda.time.DateMidnight dateMidnight20 = localDate16.toDateMidnight();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateMidnight20);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
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
        org.joda.time.LocalDate localDate13 = localDate7.plusMonths(100);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((-292275054), 1973, 69);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1973 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 26);
        int int2 = localDateTime1.getWeekyear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDateTime1.toDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.secondOfMinute();
        int int6 = property5.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime8 = property5.addWrapFieldToCopy(7);
        org.joda.time.LocalDateTime localDateTime10 = property5.addToCopy(25);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        int int12 = localDateTime5.getValue(2);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime5.minusDays(28);
        int[] intArray15 = localDateTime5.getValues();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime5.withMillisOfDay(1969);
        org.joda.time.LocalDateTime.Property property18 = localDateTime5.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime5.minusMonths((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1970, 1, 1, 28320052 });
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
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
        int int14 = localDate7.getCenturyOfEra();
        org.joda.time.DateTime dateTime15 = localDate7.toDateTimeAtCurrentTime();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMinutes(31);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.hourOfDay();
        int int15 = localDateTime13.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
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
        org.joda.time.Chronology chronology16 = localDate9.getChronology();
        org.joda.time.Interval interval17 = localDate9.toInterval();
        int int18 = localDate9.getDayOfWeek();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "271" + "'", str12, "271");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate0.minus(readablePeriod4);
        org.joda.time.LocalDate localDate7 = localDate5.plusYears(5232);
        int int8 = localDate5.size();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = localDate5.getFieldTypes();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
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
        org.joda.time.LocalDate localDate12 = property7.roundHalfCeilingCopy();
        int int13 = localDate12.getYearOfEra();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2027 + "'", int13 == 2027);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 48, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears(20);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusDays((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withMonthOfYear((int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMinutes(31);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.plusHours(59);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate20 = localDate17.withPeriodAdded(readablePeriod18, (int) (byte) -1);
        int int21 = localDate17.getYearOfEra();
        org.joda.time.LocalDate localDate23 = localDate17.plusDays(1970);
        org.joda.time.LocalDate localDate24 = localDate16.withFields((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.LocalDate.Property property25 = localDate23.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property25.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime28 = localDateTime11.withField(dateTimeFieldType26, 5232);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 5232 for monthOfYear must be in the range [1,12]");
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
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2026 + "'", int21 == 2026);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.DurationField durationField4 = property3.getDurationField();
        java.lang.String str5 = property3.getAsShortText();
        org.joda.time.LocalDateTime localDateTime6 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        int int9 = localDateTime8.getYearOfEra();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime12 = property10.addToCopy((int) '4');
        int int13 = localDateTime12.getEra();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.plus(readableDuration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.plusMillis(0);
        int int18 = localDateTime12.getYearOfCentury();
        int int19 = localDateTime12.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusSeconds(0);
        int int25 = localDateTime22.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) '4');
        int int28 = localDateTime27.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property29 = localDateTime27.dayOfYear();
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime31 = property30.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property30.getFieldType();
        int int33 = localDateTime22.indexOf(dateTimeFieldType32);
        int int34 = localDateTime12.get(dateTimeFieldType32);
        boolean boolean35 = localDateTime6.isAfter((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.LocalDateTime.Property property36 = localDateTime6.dayOfMonth();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 70 + "'", int18 == 70);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(property36);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        int int6 = localDateTime1.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.year();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusDays(0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusMillis(69);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime1.minusDays((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime1.minusSeconds(28320052);
        int int16 = localDateTime15.size();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMonthOfYear(2);
        java.util.Locale locale7 = null;
        java.lang.String str8 = localDateTime3.toString("9", locale7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime3.plusWeeks((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localDateTime3.getValue(14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 14");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "9" + "'", str8, "9");
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
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
        int int21 = localDateTime9.getWeekOfWeekyear();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 40 + "'", int21 == 40);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(0, (int) (byte) 100, 2026);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = localDate0.indexOf(dateTimeFieldType5);
        org.joda.time.LocalDate localDate8 = localDate0.withWeekyear((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate11 = localDate0.withPeriodAdded(readablePeriod9, 59);
        long long12 = localDate0.getLocalMillis();
        long long13 = localDate0.getLocalMillis();
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate18 = localDate15.withPeriodAdded(readablePeriod16, (int) (byte) -1);
        org.joda.time.LocalDate localDate20 = localDate15.plusWeeks(0);
        org.joda.time.LocalDate.Property property21 = localDate15.era();
        org.joda.time.DateTime dateTime22 = localDate15.toDateTimeAtCurrentTime();
        int int23 = localDate15.getCenturyOfEra();
        org.joda.time.Chronology chronology24 = localDate15.getChronology();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) 333, chronology24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((java.lang.Object) localDate0, chronology24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1790553600000L + "'", long12 == 1790553600000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1790553600000L + "'", long13 == 1790553600000L);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20 + "'", int23 == 20);
        org.junit.Assert.assertNotNull(chronology24);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        int int6 = localDateTime1.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.year();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusDays(0);
        org.joda.time.LocalDateTime.Property property10 = localDateTime1.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime1.withDayOfYear(2037);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2037 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        java.lang.String str7 = localDateTime6.toString();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withSecondOfMinute(26);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusDays(0);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusMillis(39);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minus(readableDuration16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0035-01-04T07:00:00.052" + "'", str7, "0035-01-04T07:00:00.052");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        org.joda.time.DateTime dateTime7 = localDate0.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate.Property property8 = localDate0.weekOfWeekyear();
        org.joda.time.LocalDate.Property property9 = localDate0.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = property9.getDurationField();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
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
        org.joda.time.LocalDateTime localDateTime30 = property26.withMinimumValue();
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
        org.junit.Assert.assertNotNull(localDateTime30);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
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
        int int15 = localDate7.getYear();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2032 + "'", int15 == 2032);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
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
        org.joda.time.LocalDate.Property property14 = localDate11.year();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = localDate11.toDateMidnight(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate11.withYearOfEra(269);
        int int19 = localDate18.getMonthOfYear();
        int int20 = localDate18.getYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 269 + "'", int20 == 269);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundCeilingCopy();
        java.util.Date date6 = localDateTime5.toDate();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.centuryOfEra();
        org.joda.time.DateTime dateTime8 = localDateTime5.toDateTime();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Jan 01 00:00:00 ICT 2000");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks(1970);
        org.joda.time.DateTimeField[] dateTimeFieldArray11 = localDateTime8.getFields();
        int int12 = localDateTime8.getDayOfMonth();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        int int9 = localDateTime8.getYearOfEra();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime12 = property10.addToCopy((int) '4');
        int int13 = localDateTime12.getEra();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.plus(readableDuration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.plusMillis(0);
        int int18 = localDateTime12.getYear();
        org.joda.time.Chronology chronology19 = localDateTime12.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(867, 59, (-3205), 40, 5701010, 9, 25200010, chronology19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 40 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1970 + "'", int18 == 1970);
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.weekyear();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = property7.getDifference(readableInstant8);
        org.joda.time.LocalDate localDate10 = property7.withMinimumValue();
        org.joda.time.LocalDate.Property property11 = localDate10.weekyear();
        org.joda.time.DurationFieldType durationFieldType12 = null;
        boolean boolean13 = localDate10.isSupported(durationFieldType12);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
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
        org.joda.time.LocalDate.Property property15 = localDate8.dayOfWeek();
        org.joda.time.LocalDate localDate16 = property15.withMinimumValue();
        org.joda.time.LocalDate.Property property17 = localDate16.dayOfWeek();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
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
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withWeekOfWeekyear((int) (short) 1);
        int int19 = localDateTime16.getCenturyOfEra();
        int int20 = localDateTime16.getYearOfCentury();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 19 + "'", int19 == 19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 70 + "'", int20 == 70);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withMillisOfDay(7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withDate((-1790557189), 2007, 26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1790557189 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.monthOfYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(2026);
        org.joda.time.LocalDate localDate13 = localDate11.plusWeeks(19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType15 = localDate13.getFieldType(244);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 244");
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
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate12.isSupported(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.DurationField durationField4 = property3.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.yearOfEra();
        org.joda.time.LocalDateTime localDateTime7 = property6.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusMonths((-1));
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withMillisOfSecond(68);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
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
        org.joda.time.LocalDateTime localDateTime18 = localDateTime10.withYear(28787742);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.weekOfWeekyear();
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
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.LocalDate localDate10 = localDate7.plusDays(5);
        org.joda.time.LocalDate localDate12 = localDate7.withDayOfMonth(28);
        int int13 = localDate7.getDayOfMonth();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 28 + "'", int13 == 28);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
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
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate19 = localDate15.withPeriodAdded(readablePeriod17, 0);
        org.joda.time.LocalDate.Property property20 = localDate19.dayOfMonth();
        org.joda.time.LocalDate.Property property21 = localDate19.dayOfMonth();
        int int22 = property21.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 25 + "'", int16 == 25);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property3.getAsShortText(locale7);
        boolean boolean9 = property3.isLeap();
        org.joda.time.LocalDateTime localDateTime11 = property3.addWrapFieldToCopy(0);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withCenturyOfEra((int) '4');
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.plusHours(52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = localDate0.indexOf(dateTimeFieldType5);
        org.joda.time.LocalDate localDate8 = localDate0.withWeekyear((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate11 = localDate0.withPeriodAdded(readablePeriod9, 59);
        long long12 = localDate0.getLocalMillis();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 2026, dateTimeZone14);
        int[] intArray16 = localDate15.getValues();
        org.joda.time.LocalDate.Property property17 = localDate15.weekOfWeekyear();
        org.joda.time.LocalDate localDate19 = localDate15.minusDays((int) '#');
        org.joda.time.LocalDate localDate21 = localDate15.withYearOfCentury(8);
        boolean boolean22 = localDate0.isEqual((org.joda.time.ReadablePartial) localDate21);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1790553600000L + "'", long12 == 1790553600000L);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        java.lang.String str8 = property7.getAsString();
        org.joda.time.LocalDate localDate9 = property7.withMinimumValue();
        org.joda.time.LocalDate localDate10 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate12 = property7.addWrapFieldToCopy(100);
        org.joda.time.LocalDate localDate14 = localDate12.withYearOfCentury((int) (byte) 1);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026" + "'", str8, "2026");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) '4');
        int int11 = localDateTime10.getYearOfEra();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.minuteOfHour();
        int int13 = property12.getMaximumValue();
        java.util.Locale locale14 = null;
        int int15 = property12.getMaximumTextLength(locale14);
        org.joda.time.LocalDateTime localDateTime16 = property12.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = property17.getField();
        org.joda.time.LocalDateTime.Property property19 = new org.joda.time.LocalDateTime.Property(localDateTime8, dateTimeField18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 59 + "'", int13 == 59);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        java.util.Date date7 = localDateTime1.toDate();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.fromDateFields(date7);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.fromDateFields(date7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.year();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime12 = property10.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.hourOfDay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
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
        org.joda.time.LocalDateTime localDateTime17 = localDateTime10.plusWeeks(55);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate localDate10 = localDate8.minusYears(25200052);
        int int11 = localDate10.getDayOfWeek();
        org.joda.time.LocalDate.Property property12 = localDate10.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = localDate10.withMonthOfYear(952);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 952 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
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
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        org.joda.time.LocalDate localDate11 = localDate7.minusWeeks((int) (byte) 1);
        org.joda.time.LocalTime localTime12 = null;
        org.joda.time.DateTime dateTime13 = localDate11.toDateTime(localTime12);
        java.lang.String str14 = localDate11.toString();
        int int15 = localDate11.getMonthOfYear();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2032-02-12" + "'", str14, "2032-02-12");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, (-1));
        org.joda.time.LocalDate.Property property9 = localDate0.weekOfWeekyear();
        int int10 = localDate0.getDayOfYear();
        org.joda.time.LocalDate localDate12 = localDate0.minusWeeks(2058);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 271 + "'", int10 == 271);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
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
        org.joda.time.LocalDate localDate26 = property15.roundHalfFloorCopy();
        int int27 = localDate26.getEra();
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
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
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
        org.joda.time.LocalDateTime localDateTime18 = localDateTime10.withMinuteOfHour(8);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.era();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withMillisOfDay(985);
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
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.withDayOfYear(4);
        org.joda.time.LocalDate localDate6 = localDate0.plusMonths(2);
        org.joda.time.LocalDate.Property property7 = localDate0.yearOfEra();
        java.util.Locale locale9 = null;
        java.lang.String str10 = localDate0.toString("70", locale9);
        int int11 = localDate0.size();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "70" + "'", str10, "70");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.hourOfDay();
        int int6 = localDateTime1.getYear();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withLocalMillis((long) 28320052);
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime1, chronology11);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) '4');
        int int15 = localDateTime14.getYearOfEra();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime18 = property16.addToCopy((int) '4');
        org.joda.time.Chronology chronology19 = property16.getChronology();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minusMonths((int) ' ');
        org.joda.time.LocalDateTime.Property property23 = localDateTime20.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime20.plusHours(70);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withLocalMillis(1580400052L);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) '4');
        int int30 = localDateTime29.getYearOfEra();
        org.joda.time.LocalDateTime.Property property31 = localDateTime29.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime33 = property31.addToCopy((int) '4');
        org.joda.time.Chronology chronology34 = property31.getChronology();
        java.util.Locale locale35 = null;
        java.lang.String str36 = property31.getAsShortText(locale35);
        org.joda.time.LocalDateTime localDateTime37 = property31.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) '4');
        int int40 = localDateTime39.getYearOfEra();
        org.joda.time.LocalDateTime.Property property41 = localDateTime39.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime43 = property41.addToCopy((int) '4');
        org.joda.time.Chronology chronology44 = property41.getChronology();
        org.joda.time.LocalDateTime localDateTime45 = org.joda.time.LocalDateTime.now(chronology44);
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withDurationAdded(readableDuration46, 53);
        boolean boolean49 = localDateTime37.equals((java.lang.Object) localDateTime45);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime45.minusMillis(100);
        int int52 = localDateTime27.compareTo((org.joda.time.ReadablePartial) localDateTime51);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = localDateTime51.toDateTime(dateTimeZone53);
        org.joda.time.DateTime dateTime55 = localDateTime1.toDateTime((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime1.minusYears(69);
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.monthOfYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1970 + "'", int30 == 1970);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0" + "'", str36, "0");
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1970 + "'", int40 == 1970);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(property58);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        java.lang.String str6 = property3.getAsString();
        org.joda.time.LocalDateTime localDateTime8 = property3.addToCopy(19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = localDateTime8.toString(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01T07:19:00.052" + "'", str10, "1970-01-01T07:19:00.052");
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) '4');
        int int4 = localDateTime3.getYearOfEra();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy((int) '4');
        org.joda.time.Chronology chronology8 = property5.getChronology();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property5.getAsShortText(locale9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) '4');
        int int14 = localDateTime13.getYearOfEra();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime17 = property15.addToCopy((int) '4');
        org.joda.time.Chronology chronology18 = property15.getChronology();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now(chronology18);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withDurationAdded(readableDuration20, 53);
        boolean boolean23 = localDateTime11.equals((java.lang.Object) localDateTime19);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.minusMillis(100);
        org.joda.time.Chronology chronology26 = localDateTime25.getChronology();
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now(chronology26);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology26);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(1L, chronology26);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(chronology26);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(chronology26);
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) 333, chronology26);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1970 + "'", int4 == 1970);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(localDateTime27);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("7");
        org.junit.Assert.assertNotNull(localDate1);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
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
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.yearOfEra();
        long long25 = property24.getMillis();
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
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 6368192982000052L + "'", long25 == 6368192982000052L);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        java.util.Date date10 = localDateTime9.toDate();
        int int11 = localDateTime9.getDayOfYear();
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDateTime9.toDateTime(dateTimeZone13);
        int int15 = localDateTime9.getDayOfWeek();
        int int16 = localDateTime9.getDayOfWeek();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        org.joda.time.LocalDateTime.Property property6 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.minusWeeks(652);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withWeekyear(68);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
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
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withHourOfDay(3);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime9.minusYears((int) '4');
        org.joda.time.LocalDateTime localDateTime18 = localDateTime9.plusHours(25260000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
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
        org.joda.time.LocalDateTime localDateTime16 = localDateTime9.plusMinutes(0);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withWeekOfWeekyear(53);
        int int19 = localDateTime18.getWeekyear();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.minusSeconds(19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2026 + "'", int19 == 2026);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((int) '#', 0, 6, 26340000, 0, 53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26340000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        int int10 = localDate5.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight11 = localDate5.toDateMidnight();
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate15 = localDate12.withPeriodAdded(readablePeriod13, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight16 = localDate12.toDateMidnight();
        org.joda.time.LocalDate localDate18 = localDate12.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property19 = localDate18.year();
        org.joda.time.DateTimeField dateTimeField20 = property19.getField();
        org.joda.time.LocalDate.Property property21 = new org.joda.time.LocalDate.Property(localDate5, dateTimeField20);
        org.joda.time.LocalDate.Property property22 = localDate5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate5.toDateTimeAtCurrentTime(dateTimeZone23);
        org.joda.time.LocalDate localDate26 = localDate5.minusDays(652);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = localDate26.getValue(2010);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2010");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 28 + "'", int10 == 28);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(localDate26);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMinimumValue();
        int int6 = property4.getLeapAmount();
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = property4.getDifference(readableInstant7);
        org.joda.time.LocalDateTime localDateTime10 = property4.setCopy(36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "2) test3257(org.joda.time.RegressionTest6)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1790557228) + "'", int8 == (-1790557228));
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
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
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.withDurationAdded(readableDuration26, 2032);
        long long29 = localDateTime28.getLocalMillis();
        org.joda.time.LocalDateTime.Property property30 = localDateTime28.dayOfWeek();
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
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-31510799948L) + "'", long29 == (-31510799948L));
        org.junit.Assert.assertNotNull(property30);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
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
        org.joda.time.LocalDate.Property property19 = localDate18.dayOfMonth();
        org.joda.time.LocalDate.Property property20 = localDate18.dayOfYear();
        java.util.Locale locale21 = null;
        java.lang.String str22 = property20.getAsShortText(locale21);
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
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "118" + "'", str22, "118");
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        java.lang.String str8 = localDate6.toString("333");
        org.joda.time.LocalDate.Property property9 = localDate6.dayOfWeek();
        java.lang.String str10 = property9.toString();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "333" + "'", str8, "333");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Property[dayOfWeek]" + "'", str10, "Property[dayOfWeek]");
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        org.joda.time.LocalDate localDate11 = localDate9.withYearOfCentury(52);
        org.joda.time.LocalDate localDate13 = localDate9.withYear(0);
        org.joda.time.LocalDate localDate15 = localDate9.plusDays(25200000);
        org.joda.time.LocalDate localDate17 = localDate9.minusMonths(2026);
        org.joda.time.LocalDate.Property property18 = localDate9.weekOfWeekyear();
        org.joda.time.LocalDate localDate20 = property18.addWrapFieldToCopy(1869);
        int int21 = property18.getMaximumValueOverall();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 53 + "'", int21 == 53);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMinutes(31);
        long long14 = localDateTime13.getLocalMillis();
        java.lang.String str16 = localDateTime13.toString("2026-01-04");
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.plusDays(521);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 27092052L + "'", long14 == 27092052L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2026-01-04" + "'", str16, "2026-01-04");
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime5.withFields(readablePartial11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localDateTime2.getFields();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = localDateTime2.toString(dateTimeFormatter4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withWeekOfWeekyear((int) (short) 10);
        int int8 = localDateTime7.getYearOfEra();
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T07:00:00.000" + "'", str5, "1970-01-01T07:00:00.000");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate3 = property1.addToCopy(0);
        org.joda.time.LocalDate localDate5 = localDate3.withCenturyOfEra((int) '4');
        org.joda.time.DateMidnight dateMidnight6 = localDate3.toDateMidnight();
        org.joda.time.LocalDate localDate8 = localDate3.plusDays(50);
        org.joda.time.LocalDate.Property property9 = localDate8.yearOfCentury();
        org.joda.time.Interval interval10 = localDate8.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = localDate8.withWeekOfWeekyear(750);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 750 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withCenturyOfEra((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property6 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        int int9 = localDateTime8.getYearOfEra();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        int int11 = property10.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime13 = property10.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime14 = property10.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.plusWeeks(52);
        int int18 = property6.compareTo((org.joda.time.ReadablePartial) localDateTime14);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusMillis(4);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime7, dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime7.millisOfSecond();
        org.joda.time.LocalDateTime.Property property13 = localDateTime7.yearOfEra();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) '4');
        int int3 = localDateTime2.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime2.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        int int13 = localDateTime12.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withWeekOfWeekyear(7);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        java.lang.String str17 = property16.getAsShortText();
        org.joda.time.Chronology chronology18 = property16.getChronology();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) 271, chronology18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10" + "'", str17, "10");
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
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
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.minusYears(867);
        int int19 = localDateTime14.getDayOfWeek();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray20 = localDateTime14.getFieldTypes();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray20);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        java.util.Locale locale11 = null;
        java.lang.String str12 = localDate9.toString("271", locale11);
        org.joda.time.LocalDate.Property property13 = localDate9.weekyear();
        org.joda.time.LocalDate localDate15 = property13.setCopy(39);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate15.toDateTimeAtMidnight(dateTimeZone16);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "271" + "'", str12, "271");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
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
        org.joda.time.LocalDate.Property property16 = localDate15.centuryOfEra();
        org.joda.time.LocalDate localDate18 = localDate15.withYearOfCentury(7);
        org.joda.time.LocalDate.Property property19 = localDate18.weekOfWeekyear();
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDate localDate23 = localDate20.withPeriodAdded(readablePeriod21, (int) (byte) -1);
        int int24 = localDate20.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        int int26 = localDate20.indexOf(dateTimeFieldType25);
        org.joda.time.LocalDate localDate28 = localDate20.withWeekyear((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDate localDate31 = localDate20.withPeriodAdded(readablePeriod29, 59);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateMidnight dateMidnight33 = localDate20.toDateMidnight(dateTimeZone32);
        org.joda.time.Chronology chronology34 = localDate20.getChronology();
        org.joda.time.LocalDate.Property property35 = localDate20.yearOfCentury();
        org.joda.time.LocalDate localDate36 = property35.roundHalfCeilingCopy();
        org.joda.time.DurationField durationField37 = property35.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = property35.getFieldType();
        boolean boolean39 = localDate18.isSupported(dateTimeFieldType38);
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
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2026 + "'", int24 == 2026);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
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
        int int16 = property13.getMaximumValueOverall();
        int int17 = property13.get();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2922789 + "'", int16 == 2922789);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 19 + "'", int17 == 19);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        java.lang.String str6 = property5.getAsText();
        java.util.Locale locale7 = null;
        int int8 = property5.getMaximumShortTextLength(locale7);
        java.lang.String str9 = property5.getAsShortText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970" + "'", str6, "1970");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970" + "'", str9, "1970");
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        java.lang.String str8 = property7.getAsText();
        org.joda.time.DurationField durationField9 = property7.getLeapDurationField();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026" + "'", str8, "2026");
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate localDate10 = localDate8.minusYears(25200052);
        int int11 = localDate10.getDayOfWeek();
        org.joda.time.LocalDate localDate13 = localDate10.withWeekOfWeekyear(15);
        long long14 = localDate10.getLocalMillis();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-795236831481600000L) + "'", long14 == (-795236831481600000L));
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
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
        org.joda.time.LocalDate localDate18 = localDate10.withYear(0);
        org.joda.time.LocalDate localDate20 = localDate18.withYearOfEra((int) '#');
        java.lang.String str21 = localDate18.toString();
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
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0000-09-28" + "'", str21, "0000-09-28");
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(24, 28319952, (int) (short) 100, 11, (int) (byte) 10, 1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("5232");
        org.junit.Assert.assertNotNull(localDate1);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate.Property property9 = localDate5.year();
        org.joda.time.LocalDate.Property property10 = localDate5.dayOfMonth();
        org.joda.time.LocalDate localDate11 = property10.roundCeilingCopy();
        org.joda.time.LocalDate localDate13 = localDate11.withDayOfYear(32);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate18 = localDate15.withPeriodAdded(readablePeriod16, (int) (byte) -1);
        int int19 = localDate15.getYearOfEra();
        org.joda.time.LocalDate localDate21 = localDate15.plusDays(1970);
        org.joda.time.LocalDate localDate22 = localDate14.withFields((org.joda.time.ReadablePartial) localDate21);
        long long23 = localDate14.getLocalMillis();
        org.joda.time.LocalDate.Property property24 = localDate14.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        boolean boolean26 = localDate14.isSupported(dateTimeFieldType25);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate28 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDate localDate31 = localDate28.withPeriodAdded(readablePeriod29, (int) (byte) -1);
        int int32 = localDate28.getYearOfEra();
        org.joda.time.LocalDate localDate34 = localDate28.plusDays(1970);
        org.joda.time.LocalDate localDate35 = localDate27.withFields((org.joda.time.ReadablePartial) localDate34);
        boolean boolean36 = localDate14.equals((java.lang.Object) localDate35);
        org.joda.time.LocalDate localDate38 = localDate35.minusMonths(4);
        boolean boolean39 = localDate13.equals((java.lang.Object) 4);
        int int40 = localDate13.size();
        org.joda.time.LocalDate localDate42 = localDate13.withYearOfEra(28814668);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) 2026, dateTimeZone44);
        int[] intArray46 = localDate45.getValues();
        org.joda.time.LocalDate.Property property47 = localDate45.weekOfWeekyear();
        org.joda.time.LocalDate localDate49 = property47.addToCopy(10);
        org.joda.time.LocalDate localDate51 = property47.addToCopy(1970);
        long long52 = property47.getMillis();
        java.lang.String str53 = property47.getAsShortText();
        boolean boolean54 = property47.isLeap();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = property47.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate57 = localDate13.withField(dateTimeFieldType55, 24208);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 24208 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2026 + "'", int19 == 2026);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1790553600000L + "'", long23 == 1790553600000L);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2026 + "'", int32 == 2026);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1" + "'", str53, "1");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType55);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localDateTime2.getFields();
        org.joda.time.LocalDateTime.Property property4 = localDateTime2.monthOfYear();
        java.lang.String str5 = localDateTime2.toString();
        int int6 = localDateTime2.getMinuteOfHour();
        org.joda.time.DurationFieldType durationFieldType7 = null;
        boolean boolean8 = localDateTime2.isSupported(durationFieldType7);
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T07:00:00.000" + "'", str5, "1970-01-01T07:00:00.000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
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
        long long13 = property12.remainder();
        org.joda.time.Chronology chronology14 = property12.getChronology();
        org.joda.time.LocalDate localDate15 = property12.roundCeilingCopy();
        java.lang.String str16 = localDate15.toString();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate15.plus(readablePeriod17);
        org.joda.time.LocalDate localDate20 = localDate15.plusYears(31140052);
        org.joda.time.LocalDate localDate22 = localDate15.minusYears(35);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 4233600000L + "'", long13 == 4233600000L);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2033-01-01" + "'", str16, "2033-01-01");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
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
        org.joda.time.DurationField durationField14 = property13.getRangeDurationField();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNull(durationField14);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate0.minus(readablePeriod4);
        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate5.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = localDate5.getFields();
        org.joda.time.LocalDate.Property property10 = localDate5.monthOfYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear(70);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plus(readablePeriod7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfWeek(22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 22 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = localDate7.withDayOfYear(1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2032 + "'", int12 == 2032);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        java.util.Date date6 = localDateTime4.toDate();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.minusHours(1969);
        int int9 = localDateTime4.getSecondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Mon Jan 19 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay();
        java.util.Date date7 = localDate0.toDate();
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.fromDateFields(date7);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromDateFields(date7);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.DateTime dateTime11 = localDate9.toDateTime(readableInstant10);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Mon Sep 28 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withMillisOfDay(7);
        int int3 = localDateTime0.getMonthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) int3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
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
        org.joda.time.LocalDateTime.Property property17 = localDateTime14.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = property17.setCopy("2032-02-12");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2032-02-12\" for yearOfEra is not supported");
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
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
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
        org.joda.time.LocalDate localDate13 = localDate0.withWeekOfWeekyear(28);
        long long14 = localDate13.getLocalMillis();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1783296000000L + "'", long14 == 1783296000000L);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(41, (int) (byte) 100, 324, (-3205), 652, 39, 1964);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3205 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withCenturyOfEra(1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.millisOfSecond();
        long long4 = property3.getMillis();
        org.joda.time.Chronology chronology5 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
// flaky "3) test3292(org.joda.time.RegressionTest6)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1790607628481L + "'", long4 == 1790607628481L);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.hourOfDay();
        int int6 = localDateTime1.getYear();
        java.lang.String str8 = localDateTime1.toString("\u0e04\u0e28.");
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minusSeconds((int) ' ');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusMonths((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone14);
        org.joda.time.DateTimeField[] dateTimeFieldArray16 = localDateTime15.getFields();
        org.joda.time.LocalDateTime.Property property17 = localDateTime15.monthOfYear();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withWeekyear(26);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) '4');
        int int22 = localDateTime21.getYearOfEra();
        org.joda.time.LocalDateTime.Property property23 = localDateTime21.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime25 = property23.addToCopy((int) '4');
        int int26 = localDateTime25.getEra();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.plus(readableDuration27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime25.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withDurationAdded(readableDuration31, 0);
        int int34 = localDateTime30.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) '4');
        int int37 = localDateTime36.getYearOfEra();
        org.joda.time.LocalDateTime.Property property38 = localDateTime36.minuteOfHour();
        org.joda.time.LocalDateTime.Property property39 = localDateTime36.era();
        long long40 = property39.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property39.getFieldType();
        boolean boolean42 = localDateTime30.isSupported(dateTimeFieldType41);
        int int43 = localDateTime19.get(dateTimeFieldType41);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime12.withField(dateTimeFieldType41, 1);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.plusMonths(28);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.withLocalMillis(4233600000L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u0e04\u0e28." + "'", str8, "\u0e04\u0e28.");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldArray16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1970 + "'", int22 == 1970);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 28320052 + "'", int34 == 28320052);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1970 + "'", int37 == 1970);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 25200052L + "'", long40 == 25200052L);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime49);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("2026");
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plus(readablePeriod3);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, (-1));
        org.joda.time.LocalDate localDate10 = localDate8.withLocalMillis((long) 5);
        org.joda.time.Chronology chronology11 = localDate8.getChronology();
        java.util.Date date12 = localDate8.toDate();
        org.joda.time.LocalDate localDate14 = localDate8.minusWeeks(32);
        int int15 = localDate8.getYearOfEra();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2026 + "'", int15 == 2026);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        int int12 = localDateTime5.getValue(2);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime5.minusDays(28);
        int[] intArray15 = localDateTime5.getValues();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime5.minus(readablePeriod16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime5.minusMinutes(2026);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusMillis(53994173);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1970, 1, 1, 28320052 });
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate localDate10 = localDate0.plusMonths((int) (short) 100);
        org.joda.time.LocalDate.Property property11 = localDate0.dayOfMonth();
        org.joda.time.LocalDate localDate13 = localDate0.minusYears(68);
        org.joda.time.LocalDate.Property property14 = localDate0.dayOfYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = localDate0.indexOf(dateTimeFieldType5);
        int int7 = localDate0.getYearOfCentury();
        int int8 = localDate0.getEra();
        org.joda.time.DateTime dateTime9 = localDate0.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate14 = localDate11.withPeriodAdded(readablePeriod12, (int) (byte) -1);
        int int15 = localDate11.getYearOfEra();
        org.joda.time.LocalDate localDate17 = localDate11.plusDays(1970);
        org.joda.time.LocalDate localDate18 = localDate10.withFields((org.joda.time.ReadablePartial) localDate17);
        org.joda.time.LocalDate.Property property19 = localDate17.monthOfYear();
        org.joda.time.LocalDate.Property property20 = localDate17.weekyear();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.Interval interval22 = localDate17.toInterval(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate17.toDateTimeAtMidnight(dateTimeZone23);
        org.joda.time.DateTime dateTime25 = localDate0.toDateTime((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.LocalDate localDate27 = localDate0.plusMonths(1964);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDate localDate29 = localDate27.plus(readablePeriod28);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 26 + "'", int7 == 26);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2026 + "'", int15 == 2026);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plus(readableDuration7);
        boolean boolean9 = property4.equals((java.lang.Object) localDateTime6);
        java.lang.String str10 = property4.getAsString();
        org.joda.time.LocalDateTime localDateTime11 = property4.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime12 = property4.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime13 = property4.withMinimumValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        int int10 = localDate5.getDayOfMonth();
        org.joda.time.LocalDate.Property property11 = localDate5.dayOfMonth();
        org.joda.time.DateTime dateTime12 = localDate5.toDateTimeAtStartOfDay();
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate28 = localDate5.withField(dateTimeFieldType25, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfMinute' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 28 + "'", int10 == 28);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
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
        int int16 = localDate7.getEra();
        org.joda.time.LocalDate localDate18 = localDate7.minusDays(41);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(localDate18);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
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
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDate localDate28 = localDate24.withPeriodAdded(readablePeriod26, 19);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localDate24.toDateTimeAtCurrentTime(dateTimeZone29);
        org.joda.time.LocalDate localDate32 = localDate24.withCenturyOfEra(2037);
        org.joda.time.LocalDate.Property property33 = localDate24.dayOfMonth();
        org.joda.time.LocalDate localDate34 = property33.roundFloorCopy();
        long long35 = localDate34.getLocalMillis();
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
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 102942230400000L + "'", long35 == 102942230400000L);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
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
        org.joda.time.LocalDateTime.Property property30 = localDateTime26.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime26.minusDays(10);
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
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
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
        org.joda.time.LocalDateTime.Property property18 = localDateTime10.dayOfYear();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime10.minusDays((int) (byte) 10);
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
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        java.util.Date date6 = localDateTime1.toDate();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime.Property property8 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property9 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime localDateTime11 = property9.addToCopy(52);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = localDateTime11.getValue(26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 26");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = localDate0.toDateMidnight(dateTimeZone8);
        java.util.Date date10 = localDate0.toDate();
        org.joda.time.LocalDate.Property property11 = localDate0.era();
        org.joda.time.DateTime dateTime12 = localDate0.toDateTimeAtMidnight();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
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
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withWeekOfWeekyear((int) (short) 1);
        int int19 = localDateTime16.getWeekOfWeekyear();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfWeek();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = property7.setCopy(2922750);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922750 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        boolean boolean6 = property5.isLeap();
        java.util.Locale locale7 = null;
        int int8 = property5.getMaximumTextLength(locale7);
        org.joda.time.LocalDateTime localDateTime9 = property5.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusYears(1969);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusMillis((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.minus(readablePeriod14);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
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
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate16 = localDate13.withPeriodAdded(readablePeriod14, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight17 = localDate13.toDateMidnight();
        org.joda.time.LocalDate localDate19 = localDate13.plusDays((int) (short) 0);
        org.joda.time.LocalDate localDate21 = localDate13.plusYears((int) (short) 1);
        org.joda.time.LocalDate localDate23 = localDate21.withYearOfCentury(52);
        org.joda.time.LocalTime localTime24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = localDate23.toDateTime(localTime24, dateTimeZone25);
        int int27 = property7.compareTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.LocalDate localDate28 = property7.roundHalfFloorCopy();
        org.joda.time.LocalDate.Property property29 = localDate28.weekyear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(property29);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.minusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.LocalDate localDate5 = localDate2.withEra(0);
        org.joda.time.LocalDate localDate7 = localDate5.withLocalMillis((-61942060800000L));
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtStartOfDay(dateTimeZone8);
        long long10 = localDate7.getLocalMillis();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-61942060800000L) + "'", long10 == (-61942060800000L));
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate9 = localDate0.withPeriodAdded(readablePeriod7, (int) (short) -1);
        org.joda.time.LocalDate.Property property10 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate12 = property10.addToCopy(28);
        int int13 = property10.getLeapAmount();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate9 = localDate0.withWeekyear((int) (short) 10);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) (short) 0);
        int int12 = localDate0.compareTo((org.joda.time.ReadablePartial) localDate11);
        org.joda.time.LocalDate localDate14 = localDate0.plusYears(56);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = localDate0.getFieldTypes();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray15);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
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
        org.joda.time.LocalDateTime localDateTime16 = localDateTime5.minusYears(1869);
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
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        int int5 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate7 = localDate0.withLocalMillis((long) 2001);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfCentury(2);
        org.joda.time.LocalTime localTime10 = null;
        org.joda.time.DateTime dateTime11 = localDate7.toDateTime(localTime10);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((java.lang.Object) localDate7);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
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
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDate localDate20 = localDate18.minus(readablePeriod19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.Interval interval22 = localDate18.toInterval(dateTimeZone21);
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
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(interval22);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        java.lang.String str6 = property3.getAsString();
        org.joda.time.LocalDateTime localDateTime7 = property3.withMaximumValue();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        org.joda.time.LocalDateTime localDateTime10 = property8.addToCopy((long) 242);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime13 = property11.addWrapFieldToCopy(99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        boolean boolean10 = localDate7.equals((java.lang.Object) 100.0d);
        org.joda.time.LocalDate.Property property11 = localDate7.centuryOfEra();
        org.joda.time.LocalDate.Property property12 = localDate7.yearOfCentury();
        org.joda.time.LocalDate localDate14 = localDate7.minusYears(14);
        int int15 = localDate7.getYear();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2032 + "'", int15 == 2032);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
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
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withWeekyear(25200000);
        int int30 = localDateTime29.getYearOfCentury();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.millisOfSecond();
        long long8 = property7.getMillis();
        org.joda.time.LocalDateTime localDateTime9 = property7.withMinimumValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25200052L + "'", long8 == 25200052L);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(2922789, 292278993, 0, 2025, 2922789);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2025 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withMinuteOfHour(7);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMillisOfSecond(40);
        org.joda.time.LocalDateTime.Property property16 = localDateTime11.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = localDateTime11.withDayOfMonth(952);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 952 for dayOfMonth must be in the range [1,30]");
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
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readableDuration5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withDayOfWeek(867);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 867 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
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
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = localDate21.toDateTimeAtMidnight(dateTimeZone22);
        org.joda.time.LocalDate localDate25 = localDate21.withDayOfYear(271);
        org.joda.time.Chronology chronology26 = localDate21.getChronology();
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
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(chronology26);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        java.lang.String str7 = property6.getAsText();
        long long8 = property6.getMillis();
        org.joda.time.LocalDate localDate9 = property6.withMinimumValue();
        int int10 = property6.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
// flaky "4) test3326(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u0e04\u0e28." + "'", str7, "\u0e04\u0e28.");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1790553600000L + "'", long8 == 1790553600000L);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
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
        int int17 = localDateTime16.getMonthOfYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "7" + "'", str15, "7");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        java.lang.String str3 = property2.toString();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundHalfFloorCopy();
        int int5 = property2.get();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[centuryOfEra]" + "'", str3, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.hourOfDay();
        int int6 = localDateTime1.getYear();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withLocalMillis((long) 28320052);
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime1, chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusMonths((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) '4');
        int int17 = localDateTime16.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withMillisOfDay(2);
        org.joda.time.LocalDateTime.Property property20 = localDateTime16.monthOfYear();
        org.joda.time.LocalDateTime localDateTime21 = property20.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusYears(53);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = localDateTime25.toDateTime(dateTimeZone27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime25.era();
        org.joda.time.DateTimeField dateTimeField30 = property29.getField();
        org.joda.time.LocalDateTime.Property property31 = new org.joda.time.LocalDateTime.Property(localDateTime23, dateTimeField30);
        org.joda.time.LocalDateTime.Property property32 = new org.joda.time.LocalDateTime.Property(localDateTime12, dateTimeField30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTimeField30);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, (-1));
        org.joda.time.LocalDate.Property property9 = localDate8.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) localDate8, dateTimeZone10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.withDayOfYear(4);
        org.joda.time.LocalDate.Property property5 = localDate4.dayOfYear();
        java.lang.String str6 = property5.getAsText();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4" + "'", str6, "4");
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
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
        org.joda.time.Chronology chronology19 = property18.getChronology();
        org.joda.time.LocalDateTime localDateTime21 = property18.addToCopy((long) 59);
        org.joda.time.Chronology chronology22 = localDateTime21.getChronology();
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
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(chronology22);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
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
        org.joda.time.LocalTime localTime16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localDate5.toDateTime(localTime16, dateTimeZone17);
        org.joda.time.Interval interval19 = localDate5.toInterval();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 28 + "'", int10 == 28);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(interval19);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime6 = property3.roundFloorCopy();
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime10 = property8.addToCopy((long) ' ');
        org.joda.time.LocalDateTime localDateTime11 = property8.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime12 = property8.roundHalfFloorCopy();
        boolean boolean13 = property8.isLeap();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime25 = localDateTime9.withDate(1, 231, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 231 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        org.joda.time.LocalDateTime.Property property11 = localDateTime5.weekyear();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) '4');
        int int14 = localDateTime13.getYearOfEra();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime17 = property15.addToCopy((int) '4');
        int int18 = localDateTime17.getEra();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.plus(readableDuration19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.plusMillis(0);
        int int23 = localDateTime17.getYear();
        int int24 = localDateTime17.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime17.minusDays(2032);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plus(readableDuration27);
        boolean boolean29 = property11.equals((java.lang.Object) localDateTime26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime31 = localDateTime26.withHourOfDay(2058);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2058 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1970 + "'", int23 == 1970);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 70 + "'", int24 == 70);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        org.joda.time.LocalDate localDate11 = localDate9.withYearOfCentury(52);
        int int12 = localDate9.getYear();
        org.joda.time.LocalTime localTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDate9.toLocalDateTime(localTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The time must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate6 = localDate2.withLocalMillis((long) 2026);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withWeekOfWeekyear(32);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.withHourOfDay((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) '4');
        int int14 = localDateTime13.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime21 = localDateTime13.withFields((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime13.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime13.withHourOfDay((int) (byte) 0);
        int int26 = localDateTime25.getCenturyOfEra();
        org.joda.time.LocalDateTime.Property property27 = localDateTime25.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime29 = property27.addWrapFieldToCopy((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property27.getFieldType();
        int int31 = localDateTime5.indexOf(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 19 + "'", int26 == 19);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate5 = property4.getLocalDate();
        org.joda.time.DateTime dateTime6 = localDate5.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate.Property property7 = localDate5.year();
        org.joda.time.LocalDate localDate8 = property7.withMinimumValue();
        int int9 = localDate8.getDayOfMonth();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
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
        org.joda.time.LocalDate localDate14 = property7.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = localDate14.withYearOfCentury(743);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 743 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = localDate0.indexOf(dateTimeFieldType5);
        int int7 = localDate0.getYearOfCentury();
        int int8 = localDate0.getEra();
        org.joda.time.LocalDate localDate10 = localDate0.withYearOfEra(14);
        int int11 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate.Property property12 = localDate0.dayOfWeek();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 26 + "'", int7 == 26);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 28 + "'", int11 == 28);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime6 = property4.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.minuteOfHour();
        org.joda.time.DurationField durationField8 = property7.getDurationField();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate9 = localDate0.withYear((int) '4');
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate13 = localDate10.withPeriodAdded(readablePeriod11, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight14 = localDate10.toDateMidnight();
        org.joda.time.LocalDate localDate16 = localDate10.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property17 = localDate16.year();
        org.joda.time.DateTimeField dateTimeField18 = property17.getField();
        org.joda.time.LocalDate.Property property19 = new org.joda.time.LocalDate.Property(localDate9, dateTimeField18);
        int int20 = localDate9.getYearOfEra();
        org.joda.time.LocalDate.Property property21 = localDate9.weekOfWeekyear();
        org.joda.time.LocalTime localTime22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = localDate9.toLocalDateTime(localTime22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The time must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, (-1));
        org.joda.time.LocalDate.Property property9 = localDate8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = property9.getField();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("2026");
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = localDateTime1.toString("monthOfYear");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate0.year();
        org.joda.time.LocalDate localDate5 = property3.addToCopy(3);
        org.joda.time.LocalDate localDate6 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate8 = property3.setCopy(10);
        org.joda.time.LocalDate localDate9 = property3.withMinimumValue();
        org.joda.time.ReadableInstant readableInstant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = property3.compareTo(readableInstant10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The instant must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
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
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) '4');
        int int16 = localDateTime15.getYearOfEra();
        org.joda.time.LocalDateTime.Property property17 = localDateTime15.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime19 = property17.addToCopy((int) '4');
        org.joda.time.Chronology chronology20 = property17.getChronology();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime21.withYear(4);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withLocalMillis((long) 1970);
        boolean boolean30 = localDateTime13.equals((java.lang.Object) 1970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1970 + "'", int16 == 1970);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
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
        org.joda.time.LocalDate localDate13 = property11.withMinimumValue();
        org.joda.time.DateTime dateTime14 = localDate13.toDateTimeAtMidnight();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) (byte) 1, 54013758, 25, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
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
        java.lang.String str16 = localDateTime10.toString();
        int int17 = localDateTime10.getCenturyOfEra();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 28320052 + "'", int14 == 28320052);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01T07:52:00.052" + "'", str16, "1970-01-01T07:52:00.052");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 19 + "'", int17 == 19);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withCenturyOfEra(1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.millisOfSecond();
        long long4 = property3.getMillis();
        org.joda.time.Chronology chronology5 = property3.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        int int7 = property3.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
// flaky "5) test3352(org.joda.time.RegressionTest6)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1790607628937L + "'", long4 == 1790607628937L);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        int int11 = localDateTime10.getHourOfDay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
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
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withWeekyear(8);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.withLocalMillis((long) 25);
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
        int int44 = localDateTime17.get(dateTimeFieldType42);
        int int45 = localDateTime17.getDayOfMonth();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 7 + "'", int44 == 7);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 242, dateTimeZone1);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        java.lang.String str9 = localDateTime7.toString();
        int int10 = localDateTime7.size();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.plusYears(251980);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusMillis(39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01T07:00:00.000" + "'", str9, "1970-01-01T07:00:00.000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
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
        org.joda.time.LocalDate localDate13 = property10.roundHalfFloorCopy();
        int int14 = localDate13.getYearOfCentury();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1790553600000L + "'", long9 == 1790553600000L);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "28" + "'", str12, "28");
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 26 + "'", int14 == 26);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate localDate8 = localDate0.plusYears((int) (short) 1);
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfCentury(52);
        org.joda.time.LocalTime localTime11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate10.toDateTime(localTime11, dateTimeZone12);
        int int14 = localDate10.getEra();
        int int15 = localDate10.getYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2052 + "'", int15 == 2052);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate.Property property9 = localDate5.year();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate12 = localDate5.withPeriodAdded(readablePeriod10, 2026);
        int int13 = localDate5.getDayOfYear();
        org.joda.time.LocalDate.Property property14 = localDate5.yearOfCentury();
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = property14.setCopy("1970-01-01T07:00:00.052", locale16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970-01-01T07:00:00.052\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 271 + "'", int13 == 271);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        int int12 = localDateTime11.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.minusSeconds(999);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate20 = localDate17.withPeriodAdded(readablePeriod18, (int) (byte) -1);
        int int21 = localDate17.getYearOfEra();
        org.joda.time.LocalDate localDate23 = localDate17.plusDays(1970);
        org.joda.time.LocalDate localDate24 = localDate16.withFields((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.LocalDate.Property property25 = localDate23.monthOfYear();
        org.joda.time.LocalDate localDate27 = localDate23.minusWeeks((int) (byte) 1);
        org.joda.time.LocalDate.Property property28 = localDate23.dayOfYear();
        org.joda.time.LocalDate localDate29 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDate localDate32 = localDate29.withPeriodAdded(readablePeriod30, (int) (byte) -1);
        int int33 = localDate29.getYearOfEra();
        org.joda.time.LocalDate localDate35 = localDate29.plusDays(1970);
        org.joda.time.LocalDate.Property property36 = localDate29.dayOfYear();
        org.joda.time.LocalDate localDate38 = localDate29.withYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.Interval interval40 = localDate29.toInterval(dateTimeZone39);
        org.joda.time.LocalDate.Property property41 = localDate29.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDate localDate44 = localDate29.withPeriodAdded(readablePeriod42, 53);
        boolean boolean45 = localDate23.isAfter((org.joda.time.ReadablePartial) localDate29);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = localDateTime15.compareTo((org.joda.time.ReadablePartial) localDate23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2026 + "'", int21 == 2026);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2026 + "'", int33 == 2026);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
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
        org.joda.time.LocalDate localDate22 = property8.setCopy(4);
        org.joda.time.Interval interval23 = localDate22.toInterval();
        org.joda.time.LocalDate localDate25 = localDate22.minusMonths(2001);
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
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(localDate25);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        java.lang.String str9 = property8.getName();
        java.util.Locale locale10 = null;
        java.lang.String str11 = property8.getAsShortText(locale10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "dayOfMonth" + "'", str9, "dayOfMonth");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusMinutes(59);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusYears(1869);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withPeriodAdded(readablePeriod8, 1970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(2026);
        org.joda.time.LocalDate localDate13 = localDate11.plusWeeks(19);
        org.joda.time.LocalDate.Property property14 = localDate11.era();
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
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withMillisOfDay(7);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.centuryOfEra();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plus(readableDuration4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withYearOfEra((int) (byte) 100);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        org.joda.time.LocalDateTime.Property property6 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.monthOfYear();
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = property7.setCopy("\u0e27\u0e31\u0e19\u0e28\u0e38\u0e01\u0e23\u0e4c", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"????????\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = localDate0.indexOf(dateTimeFieldType5);
        int int7 = localDate0.getYearOfCentury();
        int int8 = localDate0.getEra();
        org.joda.time.LocalDate localDate10 = localDate0.withYearOfEra(14);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((java.lang.Object) localDate10);
        int int12 = localDate10.getDayOfWeek();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 26 + "'", int7 == 26);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = property4.setCopy("2031-10-19");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2031-10-19\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 70);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
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
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(chronology25);
        org.joda.time.LocalDate localDate28 = org.joda.time.LocalDate.now(chronology25);
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
        org.junit.Assert.assertNotNull(localDate28);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfYear(3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfDay();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) '4');
        int int8 = localDateTime7.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.dayOfYear();
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime11 = property10.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property10.getFieldType();
        int int13 = localDateTime4.get(dateTimeFieldType12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime4.minusYears(8);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime4.minusYears(269);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = localDateTime17.getValue(70);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 70");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
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
        org.joda.time.LocalDateTime localDateTime18 = localDateTime10.withYear(28787742);
        int int19 = localDateTime18.getDayOfMonth();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
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
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusMinutes(2026);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withCenturyOfEra(2026);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withYearOfEra(271);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusMonths(11);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.plusMillis(2027);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime1.withCenturyOfEra(271);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime1.minus(readableDuration14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
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
        org.joda.time.LocalDate localDate26 = localDate0.plusWeeks(55);
        org.joda.time.LocalDate.Property property27 = localDate0.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = localDate0.toDateMidnight(dateTimeZone28);
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
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateMidnight29);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.DateTime dateTime7 = localDate0.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate9 = localDate0.withYear(25200052);
        org.joda.time.LocalDate localDate11 = localDate9.minusYears(28);
        int int12 = localDate11.getDayOfWeek();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.DurationField durationField8 = property7.getDurationField();
        java.lang.String str9 = property7.getAsText();
        boolean boolean10 = property7.isLeap();
        org.joda.time.LocalDate localDate12 = property7.setCopy((int) ' ');
        org.joda.time.DateTime dateTime13 = localDate12.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate.Property property14 = localDate12.weekyear();
        org.joda.time.LocalDate localDate15 = property14.roundFloorCopy();
        java.util.Locale locale17 = null;
        org.joda.time.LocalDate localDate18 = property14.setCopy("19", locale17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.Interval interval20 = localDate18.toInterval(dateTimeZone19);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "271" + "'", str9, "271");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(interval20);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
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
        int int19 = localDateTime9.getValue((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localDateTime9.toDateTime(dateTimeZone20);
        org.joda.time.Chronology chronology22 = localDateTime9.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime27 = localDateTime9.withTime(119, 999, 54013758, (-1790557189));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 119 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(chronology22);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
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
        org.joda.time.LocalDate localDate13 = property10.getLocalDate();
        long long14 = property10.getMillis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = property10.setCopy(52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 28 + "'", int12 == 28);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1790553600000L + "'", long14 == 1790553600000L);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
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
        java.lang.String str18 = localDate11.toString();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1832-11-28" + "'", str18, "1832-11-28");
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        int int10 = localDate5.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight11 = localDate5.toDateMidnight();
        org.joda.time.LocalDate.Property property12 = localDate5.year();
        org.joda.time.LocalDate localDate13 = property12.withMaximumValue();
        org.joda.time.DurationField durationField14 = property12.getRangeDurationField();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 28 + "'", int10 == 28);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNull(durationField14);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
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
        org.joda.time.LocalDate.Property property14 = localDate0.centuryOfEra();
        int int15 = localDate0.getWeekyear();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2026 + "'", int15 == 2026);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
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
        org.joda.time.LocalDateTime localDateTime21 = localDateTime5.plusMinutes(67);
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
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
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
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.withCenturyOfEra(366);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        org.joda.time.LocalDate localDate9 = property7.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight10 = localDate9.toDateMidnight();
        org.joda.time.LocalDate localDate12 = localDate9.plusMonths((-1));
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        int int9 = localDateTime8.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime16 = localDateTime8.withFields((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        int int18 = localDateTime15.indexOf(dateTimeFieldType17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.plus(readableDuration19);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) '4');
        int int23 = localDateTime22.getYearOfEra();
        org.joda.time.LocalDateTime.Property property24 = localDateTime22.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime26 = property24.addToCopy((int) '4');
        int int27 = localDateTime26.getEra();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.plus(readableDuration28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withDurationAdded(readableDuration32, 0);
        int int36 = localDateTime31.getValue(2);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime31.plusMonths(2);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = property39.getFieldType();
        org.joda.time.LocalDateTime.Property property41 = localDateTime20.property(dateTimeFieldType40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime5.property(dateTimeFieldType40);
        org.joda.time.LocalDateTime localDateTime44 = property42.addToCopy(32);
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((long) '4');
        int int47 = localDateTime46.getYearOfEra();
        org.joda.time.LocalDateTime.Property property48 = localDateTime46.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime50 = property48.addToCopy((int) '4');
        int int51 = localDateTime50.getEra();
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.plus(readableDuration52);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.plusWeeks(1970);
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime((long) '4');
        int int58 = localDateTime57.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime57.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime57.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime67 = localDateTime57.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        java.util.Date date68 = localDateTime57.toDate();
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime((long) '4');
        int int71 = localDateTime70.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property72 = localDateTime70.dayOfYear();
        org.joda.time.LocalDateTime.Property property73 = localDateTime70.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime74 = property73.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = property73.getFieldType();
        int int76 = localDateTime57.get(dateTimeFieldType75);
        int int77 = localDateTime55.get(dateTimeFieldType75);
        int int78 = localDateTime44.indexOf(dateTimeFieldType75);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str80 = localDateTime44.toString("1969-01-01T07:52:00.052");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1970 + "'", int23 == 1970);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1970 + "'", int47 == 1970);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(localDateTime74);
        org.junit.Assert.assertNotNull(dateTimeFieldType75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfWeek();
        long long4 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime5 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime7 = property3.addToCopy((long) 1869);
        int int8 = property3.getLeapAmount();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = property3.setCopy("dayOfMonth");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"dayOfMonth\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 25200052L + "'", long4 == 25200052L);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        org.joda.time.Interval interval9 = property8.toInterval();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
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
        org.joda.time.LocalDate localDate15 = localDate7.minusWeeks(35);
        org.joda.time.LocalDate localDate17 = localDate15.plusDays((int) (byte) 1);
        org.joda.time.Interval interval18 = localDate15.toInterval();
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
        org.junit.Assert.assertNotNull(interval18);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
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
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime16, dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.yearOfEra();
        java.util.Locale locale20 = null;
        int int21 = property19.getMaximumTextLength(locale20);
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
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        org.joda.time.LocalDate localDate11 = localDate7.minusWeeks((int) (byte) 1);
        org.joda.time.LocalDate.Property property12 = localDate7.dayOfYear();
        org.joda.time.LocalDate localDate13 = property12.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plus(readableDuration4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minus(readableDuration6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.era();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minus(readablePeriod9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withSecondOfMinute(242);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 242 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
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
        org.joda.time.LocalDate.Property property25 = localDate19.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) '4');
        int int28 = localDateTime27.getYearOfEra();
        org.joda.time.LocalDateTime.Property property29 = localDateTime27.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime31 = property29.addToCopy((int) '4');
        int int32 = localDateTime31.getEra();
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.plus(readableDuration33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime31.plusMillis(0);
        int int37 = localDateTime31.getYearOfCentury();
        int int38 = localDateTime31.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.plusSeconds(0);
        int int44 = localDateTime41.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((long) '4');
        int int47 = localDateTime46.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property48 = localDateTime46.dayOfYear();
        org.joda.time.LocalDateTime.Property property49 = localDateTime46.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime50 = property49.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = property49.getFieldType();
        int int52 = localDateTime41.indexOf(dateTimeFieldType51);
        int int53 = localDateTime31.get(dateTimeFieldType51);
        // The following exception was thrown during execution in test generation
        try {
            int int54 = localDate19.get(dateTimeFieldType51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfMinute' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1970 + "'", int28 == 1970);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 70 + "'", int37 == 70);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 4 + "'", int44 == 4);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        org.joda.time.DateTime dateTime7 = localDate0.toDateTimeAtCurrentTime();
        int int8 = localDate0.getCenturyOfEra();
        int int9 = localDate0.getEra();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localDateTime2.getFields();
        org.joda.time.LocalDateTime.Property property4 = localDateTime2.monthOfYear();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withWeekyear(26);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = property7.addToCopy(1790607612602L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1790607612602 * 86400000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        java.lang.String str8 = property7.getAsText();
        org.joda.time.LocalDate localDate9 = property7.roundFloorCopy();
        org.joda.time.LocalDate localDate11 = property7.addToCopy((int) (short) 0);
        java.lang.String str12 = property7.getAsString();
        int int13 = property7.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026" + "'", str8, "2026");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2026" + "'", str12, "2026");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-292275054) + "'", int13 == (-292275054));
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
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
        org.joda.time.LocalDate.Property property14 = localDate7.yearOfCentury();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2032 + "'", int12 == 2032);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
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
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.yearOfCentury();
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
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.DurationField durationField4 = property3.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.yearOfEra();
        org.joda.time.LocalDateTime localDateTime7 = property6.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusMonths((-1));
        int int10 = localDateTime7.getDayOfWeek();
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate14 = localDate11.withPeriodAdded(readablePeriod12, (int) (byte) -1);
        org.joda.time.LocalDate localDate16 = localDate11.plusWeeks(0);
        org.joda.time.LocalDate localDate18 = localDate16.withYear((int) ' ');
        org.joda.time.LocalDate localDate20 = localDate16.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate22 = localDate20.minusMonths(2026);
        org.joda.time.LocalDate localDate24 = localDate22.plusWeeks(19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = localDateTime7.isBefore((org.joda.time.ReadablePartial) localDate22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
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
        org.joda.time.LocalDateTime.Property property17 = localDateTime10.millisOfSecond();
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
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) '#');
        org.joda.time.LocalDate localDate3 = localDate1.withDayOfMonth(14);
        org.joda.time.LocalDate.Property property4 = localDate1.monthOfYear();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("\u0e08.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"?.\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusMillis(4);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime7, dateTimeZone10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = localDateTime7.toString("20", locale13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime7.weekyear();
        int int16 = localDateTime7.getYearOfCentury();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "20" + "'", str14, "20");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 70 + "'", int16 == 70);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        int int12 = localDateTime5.getValue(2);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime5.minusDays(28);
        org.joda.time.DurationFieldType durationFieldType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withFieldAdded(durationFieldType15, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
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
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withWeekOfWeekyear((int) (short) 1);
        int int19 = localDateTime16.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.plusDays(4);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.minusMonths((int) ' ');
        org.joda.time.LocalDateTime localDateTime26 = localDateTime21.plusMillis((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 19 + "'", int19 == 19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        int int5 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate7 = localDate0.withDayOfYear(100);
        org.joda.time.LocalTime localTime8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate7.toDateTime(localTime8, dateTimeZone9);
        int int11 = localDate7.getYear();
        org.joda.time.DateTimeField dateTimeField13 = localDate7.getField(0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2026 + "'", int11 == 2026);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
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
        int int13 = property12.getMaximumValueOverall();
        org.joda.time.LocalDateTime localDateTime14 = property12.roundHalfFloorCopy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
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
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDate localDate28 = localDate24.withPeriodAdded(readablePeriod26, 19);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localDate24.toDateTimeAtCurrentTime(dateTimeZone29);
        org.joda.time.LocalDate localDate32 = localDate24.withCenturyOfEra(2037);
        org.joda.time.LocalDate.Property property33 = localDate24.weekyear();
        org.joda.time.LocalDate.Property property34 = localDate24.dayOfWeek();
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
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property34);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate localDate10 = localDate5.minusDays(2001);
        int int11 = localDate5.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property12 = localDate5.monthOfYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 40 + "'", int11 == 40);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
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
        org.joda.time.LocalDateTime localDateTime18 = property17.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime19 = property17.roundHalfFloorCopy();
        int int20 = localDateTime19.getMillisOfSecond();
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
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withMillisOfDay(7);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        int int4 = localDateTime2.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) '4');
        int int7 = localDateTime6.getYearOfEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime10 = property8.addToCopy((int) '4');
        int int11 = localDateTime10.getEra();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.plus(readableDuration12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.plusMillis(0);
        int int17 = localDateTime10.getValue(2);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime10.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusMonths(25200052);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.withYear(2);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.plusMonths(5);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) '4');
        int int28 = localDateTime27.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime35 = localDateTime27.withFields((org.joda.time.ReadablePartial) localDateTime34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = null;
        int int37 = localDateTime34.indexOf(dateTimeFieldType36);
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.LocalDateTime localDateTime39 = localDateTime34.plus(readableDuration38);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) '4');
        int int42 = localDateTime41.getYearOfEra();
        org.joda.time.LocalDateTime.Property property43 = localDateTime41.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime45 = property43.addToCopy((int) '4');
        int int46 = localDateTime45.getEra();
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.plus(readableDuration47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime45.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.withDurationAdded(readableDuration51, 0);
        int int55 = localDateTime50.getValue(2);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime50.plusMonths(2);
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = property58.getFieldType();
        org.joda.time.LocalDateTime.Property property60 = localDateTime39.property(dateTimeFieldType59);
        boolean boolean61 = localDateTime19.isSupported(dateTimeFieldType59);
        org.joda.time.LocalDateTime.Property property62 = localDateTime2.property(dateTimeFieldType59);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 28 + "'", int4 == 28);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1970 + "'", int7 == 1970);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1970 + "'", int42 == 1970);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(dateTimeFieldType59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(property62);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate5.withPeriodAdded(readablePeriod6, 0);
        org.joda.time.LocalDate.Property property9 = localDate8.yearOfEra();
        org.joda.time.LocalDate localDate10 = property9.withMinimumValue();
        int int11 = localDate10.getCenturyOfEra();
        org.joda.time.LocalDate localDate13 = localDate10.withLocalMillis((long) 55);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
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
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.minusYears(867);
        int int19 = localDateTime14.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = localDateTime14.withWeekOfWeekyear(2922789);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922789 for weekOfWeekyear must be in the range [1,52]");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
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
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusMillis(8);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.monthOfYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        int int12 = localDateTime11.getMillisOfSecond();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.plus(readableDuration13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime11.dayOfMonth();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, (-1));
        org.joda.time.LocalDate.Property property9 = localDate8.yearOfEra();
        org.joda.time.LocalDate.Property property10 = localDate8.weekyear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
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
        org.joda.time.LocalDateTime.Property property14 = localDateTime8.millisOfDay();
        long long15 = property14.remainder();
        int int16 = property14.getLeapAmount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        boolean boolean17 = localDateTime13.isSupported(dateTimeFieldType16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.withDayOfYear(9);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) '4');
        int int22 = localDateTime21.getYearOfEra();
        org.joda.time.LocalDateTime.Property property23 = localDateTime21.minuteOfHour();
        org.joda.time.LocalDateTime.Property property24 = localDateTime21.era();
        org.joda.time.LocalDateTime.Property property25 = localDateTime21.hourOfDay();
        int int26 = localDateTime21.getYear();
        java.lang.String str28 = localDateTime21.toString("\u0e04\u0e28.");
        org.joda.time.LocalDateTime localDateTime30 = localDateTime21.minusSeconds((int) ' ');
        int int31 = localDateTime21.getDayOfMonth();
        boolean boolean32 = localDateTime19.isAfter((org.joda.time.ReadablePartial) localDateTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T07:00:00.000" + "'", str5, "1970-01-01T07:00:00.000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 59 + "'", int10 == 59);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1970 + "'", int22 == 1970);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1970 + "'", int26 == 1970);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u0e04\u0e28." + "'", str28, "\u0e04\u0e28.");
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
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
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.centuryOfEra();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate.Property property9 = localDate8.dayOfWeek();
        int int10 = localDate8.getDayOfMonth();
        org.joda.time.LocalDate.Property property11 = localDate8.yearOfCentury();
        org.joda.time.LocalDate.Property property12 = localDate8.dayOfWeek();
        org.joda.time.Chronology chronology13 = property12.getChronology();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        org.joda.time.LocalDateTime.Property property10 = localDateTime5.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime11 = property10.withMinimumValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = localDate0.indexOf(dateTimeFieldType5);
        int int7 = localDate0.getYearOfCentury();
        int int8 = localDate0.getEra();
        org.joda.time.LocalDate localDate10 = localDate0.plusYears(0);
        org.joda.time.LocalDate localDate12 = localDate10.plusWeeks(0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 26 + "'", int7 == 26);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getWeekyear();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) '4');
        int int11 = localDateTime10.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime20 = localDateTime10.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        java.util.Date date21 = localDateTime10.toDate();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) '4');
        int int24 = localDateTime23.getYearOfEra();
        org.joda.time.LocalDateTime.Property property25 = localDateTime23.minuteOfHour();
        int int26 = property25.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime28 = property25.addWrapFieldToCopy((int) 'a');
        org.joda.time.Interval interval29 = property25.toInterval();
        java.util.Locale locale31 = null;
        org.joda.time.LocalDateTime localDateTime32 = property25.setCopy("9", locale31);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone34);
        org.joda.time.DateTimeField[] dateTimeFieldArray36 = localDateTime35.getFields();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.minusDays(59);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime32.withFields((org.joda.time.ReadablePartial) localDateTime38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime32.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime41 = property40.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property40.getFieldType();
        int int43 = localDateTime10.get(dateTimeFieldType42);
        org.joda.time.LocalDateTime.Property property44 = localDateTime8.property(dateTimeFieldType42);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1970 + "'", int24 == 1970);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 59 + "'", int26 == 59);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(dateTimeFieldArray36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 52 + "'", int43 == 52);
        org.junit.Assert.assertNotNull(property44);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.withDurationAdded(readableDuration9, 50);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.minusSeconds((int) (byte) -1);
        int int14 = localDateTime13.getYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate5.withPeriodAdded(readablePeriod6, 0);
        org.joda.time.LocalDate localDate10 = localDate5.withYearOfCentury(4);
        org.joda.time.DateTime dateTime11 = localDate10.toDateTimeAtMidnight();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.DateTime dateTime10 = localDate9.toDateTimeAtStartOfDay();
        int int11 = localDate9.getYear();
        org.joda.time.LocalDate.Property property12 = localDate9.dayOfYear();
        org.joda.time.LocalDate.Property property13 = localDate9.year();
        org.joda.time.LocalDate localDate15 = localDate9.withDayOfYear(14);
        org.joda.time.DateTimeField[] dateTimeFieldArray16 = localDate15.getFields();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = localDate15.withDayOfYear(31140052);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 31140052 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2001 + "'", int11 == 2001);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeFieldArray16);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
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
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusHours(14);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withLocalMillis((long) 25200000);
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
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
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
        long long14 = property13.getMillis();
        org.joda.time.LocalDate localDate15 = property13.roundFloorCopy();
        org.joda.time.LocalDate.Property property16 = localDate15.dayOfMonth();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1790553600000L + "'", long14 == 1790553600000L);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        org.joda.time.LocalDate localDate10 = property7.setCopy(12);
        org.joda.time.LocalDate localDate12 = property7.setCopy(24);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
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
        java.lang.String str14 = localDate7.toString();
        org.joda.time.LocalDate.Property property15 = localDate7.dayOfYear();
        org.joda.time.LocalDate.Property property16 = localDate7.year();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2032 + "'", int12 == 2032);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2032-02-19" + "'", str14, "2032-02-19");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        java.util.Date date10 = localDateTime9.toDate();
        int int11 = localDateTime9.getDayOfYear();
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property12.getFieldType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(269, 333, (int) (short) 100, (int) (short) 1, (int) (byte) 1, 21600052);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 21600052 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = localDate5.isSupported(dateTimeFieldType6);
        org.joda.time.DateTime dateTime8 = localDate5.toDateTimeAtStartOfDay();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = localDate5.toString("2026-09-28T14:59:53.564");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate0.minus(readablePeriod4);
        org.joda.time.LocalDate.Property property6 = localDate0.dayOfWeek();
        java.lang.String str7 = property6.getAsShortText();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u0e08." + "'", str7, "\u0e08.");
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        int int6 = localDateTime1.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.year();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusDays(0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusMillis(69);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime1.minusDays((int) (short) 0);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate17 = localDate14.withPeriodAdded(readablePeriod15, (int) (byte) -1);
        int int18 = localDate14.getYearOfEra();
        org.joda.time.LocalDate localDate20 = localDate14.plusDays(1970);
        org.joda.time.LocalDate localDate22 = localDate14.withLocalMillis((long) (-1));
        org.joda.time.LocalDate localDate24 = localDate14.plusMonths((int) (short) 100);
        org.joda.time.LocalDate.Property property25 = localDate24.weekyear();
        org.joda.time.DateTime dateTime26 = localDate24.toDateTimeAtCurrentTime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = localDateTime13.isAfter((org.joda.time.ReadablePartial) localDate24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2026 + "'", int18 == 2026);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = property3.roundFloorCopy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 2025, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(2026);
        org.joda.time.DateMidnight dateMidnight12 = localDate11.toDateMidnight();
        org.joda.time.DateTime dateTime13 = localDate11.toDateTimeAtStartOfDay();
        java.lang.String str14 = localDate11.toString();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1832-11-28" + "'", str14, "1832-11-28");
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDateTime1.toDateTime(dateTimeZone3);
        int int5 = localDateTime1.getWeekyear();
        int int6 = localDateTime1.getMillisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        java.lang.String str8 = property7.getAsString();
        org.joda.time.LocalDate localDate9 = property7.withMinimumValue();
        org.joda.time.LocalDate localDate10 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate12 = property7.addWrapFieldToCopy(100);
        java.lang.Class<?> wildcardClass13 = localDate12.getClass();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026" + "'", str8, "2026");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
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
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withHourOfDay(3);
        int int15 = localDateTime14.getYearOfCentury();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 70 + "'", int15 == 70);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
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
        long long21 = localDateTime18.getLocalMillis();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime18.withDurationAdded(readableDuration22, 99);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime18.plus(readablePeriod25);
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 28319952L + "'", long21 == 28319952L);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        java.lang.String str8 = property7.getName();
        org.joda.time.LocalDate localDate10 = property7.addWrapFieldToCopy(25);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "dayOfYear" + "'", str8, "dayOfYear");
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        int int7 = localDate6.getDayOfMonth();
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate11 = localDate8.withPeriodAdded(readablePeriod9, (int) (byte) -1);
        org.joda.time.LocalDate localDate13 = localDate8.plusWeeks(0);
        org.joda.time.LocalDate localDate15 = localDate13.withYear((int) ' ');
        org.joda.time.LocalDate.Property property16 = localDate13.monthOfYear();
        java.lang.String str17 = property16.getAsString();
        org.joda.time.LocalDate localDate19 = property16.addWrapFieldToCopy(40);
        boolean boolean20 = localDate6.isBefore((org.joda.time.ReadablePartial) localDate19);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 28 + "'", int7 == 28);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "9" + "'", str17, "9");
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        int int4 = localDateTime3.size();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withMillisOfDay(1969);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withDate((int) (short) 100, 55, 25200010);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 55 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((-1), 251980, 1980);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 251980 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, (-1));
        org.joda.time.LocalDate.Property property9 = localDate0.weekyear();
        org.joda.time.LocalDate.Property property10 = localDate0.era();
        org.joda.time.LocalDate localDate11 = property10.roundCeilingCopy();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
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
        org.joda.time.LocalDate localDate17 = localDate13.withDayOfMonth(7);
        org.joda.time.DateTime dateTime18 = localDate17.toDateTimeAtCurrentTime();
        java.lang.String str20 = localDate17.toString("2026-09-28");
        org.joda.time.LocalTime localTime21 = null;
        org.joda.time.DateTime dateTime22 = localDate17.toDateTime(localTime21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate24 = localDate17.withDayOfYear(26340000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26340000 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2026-09-28" + "'", str20, "2026-09-28");
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeZone2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.weekyear();
        int int6 = localDateTime4.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        int int9 = localDateTime8.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.dayOfYear();
        org.joda.time.LocalDateTime.Property property11 = localDateTime8.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime12 = property11.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property11.getFieldType();
        boolean boolean14 = localDateTime4.isSupported(dateTimeFieldType13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime4.minuteOfHour();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2026 + "'", int6 == 2026);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate5.withPeriodAdded(readablePeriod6, 0);
        org.joda.time.LocalDate.Property property9 = localDate8.yearOfEra();
        org.joda.time.DateTime dateTime10 = localDate8.toDateTimeAtCurrentTime();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime(dateTimeZone8);
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        int int11 = property3.getMinimumValue();
        java.lang.String str12 = property3.getName();
        org.joda.time.LocalDateTime localDateTime13 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime15 = property3.addToCopy(102942230400000L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 420L + "'", long10 == 420L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "minuteOfHour" + "'", str12, "minuteOfHour");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withMillisOfDay(7);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withYear(53);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        int int9 = localDateTime8.getYearOfEra();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        int int11 = property10.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime12 = property10.roundCeilingCopy();
        org.joda.time.DateTimeField dateTimeField13 = property10.getField();
        org.joda.time.LocalDateTime.Property property14 = new org.joda.time.LocalDateTime.Property(localDateTime6, dateTimeField13);
        org.joda.time.LocalDateTime localDateTime15 = property14.roundFloorCopy();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        int int12 = localDateTime5.getValue(2);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime5.minusDays(28);
        int[] intArray15 = localDateTime5.getValues();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime5.withMillisOfDay(1969);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localDateTime5.toDateTime(dateTimeZone18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = localDateTime5.withDate(28815681, 25200010, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25200010 for monthOfYear must be in the range [1,12]");
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1970, 1, 1, 28320052 });
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate6 = property4.addToCopy(10);
        org.joda.time.LocalDate localDate8 = property4.addToCopy(1970);
        long long9 = property4.getMillis();
        org.joda.time.LocalDate localDate11 = property4.addToCopy(2027);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        int int5 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate7 = localDate0.withDayOfYear(100);
        org.joda.time.LocalDate localDate9 = localDate7.minusWeeks(0);
        java.util.Date date10 = localDate9.toDate();
        org.joda.time.LocalDate localDate12 = localDate9.withYear(11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = localDate9.toString("0001-01-01T00:00:00.000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Fri Apr 10 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '#');
        java.util.Locale locale3 = null;
        java.lang.String str4 = localDateTime1.toString("1970", locale3);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) '4');
        int int7 = localDateTime6.getYearOfEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime10 = property8.addToCopy((int) '4');
        int int11 = localDateTime10.getEra();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.plus(readableDuration12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withDurationAdded(readableDuration16, 0);
        int int19 = localDateTime15.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) '4');
        int int22 = localDateTime21.getYearOfEra();
        org.joda.time.LocalDateTime.Property property23 = localDateTime21.minuteOfHour();
        org.joda.time.LocalDateTime.Property property24 = localDateTime21.era();
        long long25 = property24.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property24.getFieldType();
        boolean boolean27 = localDateTime15.isSupported(dateTimeFieldType26);
        boolean boolean28 = localDateTime1.isSupported(dateTimeFieldType26);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime1.minus(readablePeriod29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.minusYears(6);
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate34 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDate localDate37 = localDate34.withPeriodAdded(readablePeriod35, (int) (byte) -1);
        int int38 = localDate34.getYearOfEra();
        org.joda.time.LocalDate localDate40 = localDate34.plusDays(1970);
        org.joda.time.LocalDate localDate41 = localDate33.withFields((org.joda.time.ReadablePartial) localDate40);
        org.joda.time.LocalDate.Property property42 = localDate40.monthOfYear();
        org.joda.time.LocalDate localDate44 = localDate40.minusWeeks((int) (byte) 1);
        org.joda.time.LocalDate.Property property45 = localDate40.dayOfYear();
        org.joda.time.LocalDate localDate46 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.LocalDate localDate49 = localDate46.withPeriodAdded(readablePeriod47, (int) (byte) -1);
        int int50 = localDate46.getYearOfEra();
        org.joda.time.LocalDate localDate52 = localDate46.plusDays(1970);
        org.joda.time.LocalDate.Property property53 = localDate46.dayOfYear();
        org.joda.time.LocalDate localDate55 = localDate46.withYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.Interval interval57 = localDate46.toInterval(dateTimeZone56);
        org.joda.time.LocalDate.Property property58 = localDate46.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.LocalDate localDate61 = localDate46.withPeriodAdded(readablePeriod59, 53);
        boolean boolean62 = localDate40.isAfter((org.joda.time.ReadablePartial) localDate46);
        // The following exception was thrown during execution in test generation
        try {
            int int63 = localDateTime32.compareTo((org.joda.time.ReadablePartial) localDate46);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970" + "'", str4, "1970");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1970 + "'", int7 == 1970);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 28320052 + "'", int19 == 28320052);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1970 + "'", int22 == 1970);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 25200052L + "'", long25 == 25200052L);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2026 + "'", int38 == 2026);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2026 + "'", int50 == 2026);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(localDate61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
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
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.plusMinutes(2026);
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
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.DurationField durationField4 = property3.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.yearOfEra();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.monthOfYear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withSecondOfMinute(55);
        java.lang.String str10 = localDateTime9.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01T07:00:55.000" + "'", str10, "1970-01-01T07:00:55.000");
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
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
        org.joda.time.LocalDate localDate15 = localDate13.plusMonths(9);
        org.joda.time.LocalDate localDate17 = localDate13.minusDays(0);
        org.joda.time.LocalDate.Property property18 = localDate13.era();
        org.joda.time.LocalDate.Property property19 = localDate13.dayOfWeek();
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
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
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
        org.joda.time.LocalDate.Property property15 = localDate12.dayOfYear();
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
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("2026-09-28");
        org.joda.time.DateTime dateTime2 = localDate1.toDateTimeAtMidnight();
        int int3 = localDate1.getCenturyOfEra();
        org.joda.time.LocalDate.Property property4 = localDate1.dayOfYear();
        org.joda.time.LocalDate localDate6 = localDate1.plusWeeks((int) (byte) 1);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight5 = localDate1.toDateMidnight();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property8 = localDate7.year();
        org.joda.time.Chronology chronology9 = localDate7.getChronology();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((java.lang.Object) "2026", chronology9);
        org.joda.time.Interval interval11 = localDate10.toInterval();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(interval11);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = localDate5.isSupported(dateTimeFieldType6);
        java.lang.String str8 = localDate5.toString();
        int int9 = localDate5.getMonthOfYear();
        org.joda.time.LocalDate.Property property10 = localDate5.era();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026-09-28" + "'", str8, "2026-09-28");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate9 = localDate0.withYear((int) '4');
        org.joda.time.LocalDate localDate11 = localDate9.withWeekyear(100);
        int int12 = localDate9.getYearOfCentury();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        org.joda.time.LocalDate localDate9 = property7.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) property7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDate$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
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
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.plusMinutes(53);
        int int19 = localDateTime18.size();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.plusMinutes((-1));
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withYear(32);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 14403717);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField3 = localDateTime1.getField(25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 25");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        java.lang.String str3 = property2.toString();
        int int4 = property2.getLeapAmount();
        java.lang.String str5 = property2.toString();
        org.joda.time.LocalDateTime localDateTime7 = property2.setCopy(7);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plus(readableDuration11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.minusSeconds(0);
        int int15 = localDateTime10.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property16 = localDateTime10.year();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime10.plusHours(10);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime10.plusYears((int) (short) 1);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.monthOfYear();
        org.joda.time.LocalDateTime.Property property22 = localDateTime20.yearOfEra();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime7.withFields((org.joda.time.ReadablePartial) localDateTime20);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[centuryOfEra]" + "'", str3, "Property[centuryOfEra]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Property[centuryOfEra]" + "'", str5, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.hourOfDay();
        int int6 = localDateTime1.getYear();
        java.lang.String str8 = localDateTime1.toString("\u0e04\u0e28.");
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minusSeconds((int) ' ');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusMonths((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusSeconds(0);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.weekyear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u0e04\u0e28." + "'", str8, "\u0e04\u0e28.");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        java.lang.String str3 = property2.toString();
        int int4 = property2.getLeapAmount();
        java.lang.String str5 = property2.toString();
        org.joda.time.LocalDateTime localDateTime7 = property2.setCopy(7);
        java.lang.String str8 = localDateTime7.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[centuryOfEra]" + "'", str3, "Property[centuryOfEra]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Property[centuryOfEra]" + "'", str5, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0770-01-01T07:00:00.052" + "'", str8, "0770-01-01T07:00:00.052");
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        boolean boolean6 = property5.isLeap();
        java.util.Locale locale7 = null;
        int int8 = property5.getMaximumTextLength(locale7);
        java.util.Locale locale9 = null;
        int int10 = property5.getMaximumTextLength(locale9);
        long long11 = property5.getMillis();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1580400052L + "'", long11 == 1580400052L);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
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
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withWeekOfWeekyear((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.plus(readablePeriod19);
        org.joda.time.DateTime dateTime21 = localDateTime20.toDateTime();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate22.toDateTimeAtStartOfDay(dateTimeZone23);
        org.joda.time.LocalDate localDate26 = localDate22.withYearOfCentury(0);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate28 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDate localDate31 = localDate28.withPeriodAdded(readablePeriod29, (int) (byte) -1);
        int int32 = localDate28.getYearOfEra();
        org.joda.time.LocalDate localDate34 = localDate28.plusDays(1970);
        org.joda.time.LocalDate localDate35 = localDate27.withFields((org.joda.time.ReadablePartial) localDate34);
        long long36 = localDate27.getLocalMillis();
        java.lang.String str37 = localDate27.toString();
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalDate localDate39 = localDate27.minus(readablePeriod38);
        int int40 = localDate22.compareTo((org.joda.time.ReadablePartial) localDate27);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = localDateTime20.isAfter((org.joda.time.ReadablePartial) localDate22);
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
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2026 + "'", int32 == 2026);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1790553600000L + "'", long36 == 1790553600000L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "2026-09-28" + "'", str37, "2026-09-28");
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) '4');
        int int3 = localDateTime2.getYearOfEra();
        org.joda.time.LocalDateTime.Property property4 = localDateTime2.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime6 = property4.addToCopy((int) '4');
        org.joda.time.Chronology chronology7 = property4.getChronology();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property4.getAsShortText(locale8);
        org.joda.time.LocalDateTime localDateTime10 = property4.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) '4');
        int int14 = localDateTime13.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime21 = localDateTime13.withFields((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) '4');
        int int24 = localDateTime23.getYearOfEra();
        org.joda.time.LocalDateTime.Property property25 = localDateTime23.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime27 = property25.addToCopy((int) '4');
        org.joda.time.Chronology chronology28 = property25.getChronology();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime13, chronology28);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(chronology28);
        org.joda.time.DateTimeField dateTimeField31 = localDateTime10.getField(0, chronology28);
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) 119, chronology28);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.minusMillis(70);
        int int35 = localDateTime34.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime37 = localDateTime34.withEra(324);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 324 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1970 + "'", int24 == 1970);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate.Property property9 = localDate5.year();
        org.joda.time.LocalDate localDate11 = property9.addWrapFieldToCopy(25200052);
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = property9.setCopy("\u0e01\u0e38\u0e21\u0e20\u0e32\u0e1e\u0e31\u0e19\u0e18\u0e4c", locale13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"??????????\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
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
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate18 = localDate15.withPeriodAdded(readablePeriod16, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight19 = localDate15.toDateMidnight();
        org.joda.time.LocalDate localDate21 = localDate15.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property22 = localDate21.year();
        java.lang.String str23 = property22.getAsText();
        org.joda.time.LocalDate localDate24 = property22.roundFloorCopy();
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDate localDate28 = localDate25.withPeriodAdded(readablePeriod26, (int) (byte) -1);
        int int29 = localDate25.getYearOfEra();
        org.joda.time.LocalDate localDate31 = localDate25.plusDays(1970);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalDate localDate34 = localDate25.withPeriodAdded(readablePeriod32, (int) (short) -1);
        org.joda.time.LocalDate localDate35 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDate localDate38 = localDate35.withPeriodAdded(readablePeriod36, (int) (byte) -1);
        org.joda.time.LocalDate localDate40 = localDate35.minusWeeks((int) (short) 0);
        int int41 = localDate25.compareTo((org.joda.time.ReadablePartial) localDate35);
        int int42 = localDate25.getDayOfMonth();
        org.joda.time.LocalDate localDate43 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalDate localDate46 = localDate43.withPeriodAdded(readablePeriod44, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.LocalDate localDate48 = localDate43.minus(readablePeriod47);
        org.joda.time.LocalDate.Property property49 = localDate43.dayOfWeek();
        org.joda.time.LocalDate localDate50 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.LocalDate localDate53 = localDate50.withPeriodAdded(readablePeriod51, (int) (byte) -1);
        org.joda.time.LocalDate localDate55 = localDate50.plusWeeks(0);
        org.joda.time.LocalDate.Property property56 = localDate50.era();
        org.joda.time.DateTime dateTime57 = localDate50.toDateTimeAtCurrentTime();
        long long58 = property49.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTime dateTime59 = localDate25.toDateTime((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTime dateTime60 = localDate24.toDateTime((org.joda.time.ReadableInstant) dateTime59);
        boolean boolean61 = localDate7.isEqual((org.joda.time.ReadablePartial) localDate24);
        org.joda.time.LocalTime localTime62 = null;
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.DateTime dateTime64 = localDate24.toDateTime(localTime62, dateTimeZone63);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2032 + "'", int12 == 2032);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2026" + "'", str23, "2026");
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2026 + "'", int29 == 2026);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 28 + "'", int42 == 28);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(dateTime64);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime6 = property3.roundFloorCopy();
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minus(readablePeriod9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.withYearOfEra(8);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusMonths(5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
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
        org.joda.time.LocalDate localDate21 = property8.roundHalfCeilingCopy();
        int int22 = property8.getMaximumValue();
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
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 12 + "'", int22 == 12);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.DurationField durationField4 = property3.getDurationField();
        org.joda.time.DurationField durationField5 = property3.getLeapDurationField();
        int int6 = property3.getMinimumValue();
        java.lang.String str7 = property3.getAsShortText();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNull(durationField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMillis(12);
        long long7 = localDateTime6.getLocalMillis();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.millisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1580400064L + "'", long7 == 1580400064L);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDateTime2.toDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.secondOfMinute();
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.plus(readablePeriod7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.yearOfCentury();
        org.joda.time.Chronology chronology10 = property9.getChronology();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (-1790557193), chronology10);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology10);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withCenturyOfEra(1);
        int int3 = localDateTime0.getYear();
        org.joda.time.DateTime dateTime4 = localDateTime0.toDateTime();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withDayOfYear(52);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime0.withYearOfEra(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2026 + "'", int3 == 2026);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
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
        org.joda.time.LocalDate localDate21 = localDate19.minusMonths(1964);
        org.joda.time.LocalDate.Property property22 = localDate19.centuryOfEra();
        org.joda.time.LocalDate localDate24 = localDate19.withYear(2001);
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
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDate24);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        java.lang.String str3 = property2.toString();
        int int4 = property2.getLeapAmount();
        java.lang.String str5 = property2.toString();
        org.joda.time.LocalDateTime localDateTime7 = property2.setCopy(7);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minus(readableDuration8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate16 = localDate13.withPeriodAdded(readablePeriod14, (int) (byte) -1);
        int int17 = localDate13.getYearOfEra();
        org.joda.time.LocalDate localDate19 = localDate13.plusDays(1970);
        org.joda.time.LocalDate localDate20 = localDate12.withFields((org.joda.time.ReadablePartial) localDate19);
        boolean boolean22 = localDate19.equals((java.lang.Object) 100.0d);
        org.joda.time.LocalDate localDate24 = localDate19.withWeekyear(28320052);
        org.joda.time.LocalDate.Property property25 = localDate19.yearOfEra();
        org.joda.time.DurationFieldType durationFieldType26 = null;
        boolean boolean27 = localDate19.isSupported(durationFieldType26);
        org.joda.time.LocalDate.Property property28 = localDate19.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            int int29 = localDateTime11.compareTo((org.joda.time.ReadablePartial) localDate19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[centuryOfEra]" + "'", str3, "Property[centuryOfEra]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Property[centuryOfEra]" + "'", str5, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2026 + "'", int17 == 2026);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(property28);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        int int5 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate7 = localDate0.withLocalMillis((long) 2001);
        java.lang.String str9 = localDate0.toString("1970-01-01");
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 35, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusMonths(50);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.yearOfCentury();
        org.joda.time.DurationField durationField8 = property7.getLeapDurationField();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNull(durationField8);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate7 = localDate4.withPeriodAdded(readablePeriod5, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight8 = localDate4.toDateMidnight();
        org.joda.time.LocalDate localDate10 = localDate4.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property11 = localDate10.year();
        org.joda.time.Chronology chronology12 = localDate10.getChronology();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((java.lang.Object) "2026", chronology12);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now(chronology12);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now(chronology12);
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now(chronology12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((int) (byte) 0, (-292275054), 621, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
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
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) '4');
        int int14 = localDateTime13.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime21 = localDateTime13.withFields((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        int int23 = localDateTime20.indexOf(dateTimeFieldType22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime20.plus(readableDuration24);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) '4');
        int int28 = localDateTime27.getYearOfEra();
        org.joda.time.LocalDateTime.Property property29 = localDateTime27.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime31 = property29.addToCopy((int) '4');
        int int32 = localDateTime31.getEra();
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.plus(readableDuration33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime31.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.withDurationAdded(readableDuration37, 0);
        int int41 = localDateTime36.getValue(2);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime36.plusMonths(2);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = property44.getFieldType();
        org.joda.time.LocalDateTime.Property property46 = localDateTime25.property(dateTimeFieldType45);
        boolean boolean47 = localDateTime8.isSupported(dateTimeFieldType45);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1970 + "'", int28 == 1970);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.DateTime dateTime10 = localDate9.toDateTimeAtStartOfDay();
        int int11 = localDate9.getYear();
        org.joda.time.LocalDate.Property property12 = localDate9.dayOfYear();
        org.joda.time.LocalDate.Property property13 = localDate9.year();
        org.joda.time.Chronology chronology14 = localDate9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = localDate9.toString(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2001 + "'", int11 == 2001);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2001-09-28" + "'", str16, "2001-09-28");
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withCenturyOfEra(1);
        int int3 = localDateTime0.getYear();
        org.joda.time.DateTime dateTime4 = localDateTime0.toDateTime();
        int int5 = localDateTime0.getDayOfYear();
        org.joda.time.LocalDateTime.Property property6 = localDateTime0.year();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2026 + "'", int3 == 2026);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 271 + "'", int5 == 271);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minusHours((int) 'a');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withYearOfCentury(9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime8.minuteOfHour();
        int int12 = property11.getLeapAmount();
        java.lang.String str13 = property11.getAsText();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("centuryOfEra");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"centuryOfEra\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
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
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.fromDateFields(date12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(date12);
// flaky "6) test3493(org.joda.time.RegressionTest6)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 08:00:30 ICT 2026");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
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
        org.joda.time.LocalDate localDate18 = localDate16.plusDays((-1790557193));
        org.joda.time.DateTime dateTime19 = localDate16.toDateTimeAtMidnight();
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
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
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
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate16 = localDate13.withPeriodAdded(readablePeriod14, (int) (byte) -1);
        org.joda.time.LocalDate localDate18 = localDate13.minusWeeks((int) (short) 0);
        int int19 = localDate18.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = localDate18.toDateMidnight(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = localDate12.toDateTime((org.joda.time.ReadableInstant) dateMidnight21);
        org.joda.time.LocalDate localDate24 = localDate12.minusDays(40);
        org.joda.time.LocalDate.Property property25 = localDate12.dayOfMonth();
        java.lang.String str26 = property25.getAsText();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "4" + "'", str26, "4");
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
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
        org.joda.time.LocalDateTime localDateTime29 = localDateTime12.plusMinutes(119);
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
        org.junit.Assert.assertNotNull(localDateTime29);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
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
        org.joda.time.LocalDate localDate21 = localDate19.withWeekyear(0);
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
        org.junit.Assert.assertNotNull(localDate21);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
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
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.plusMinutes(53);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusMillis(99);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = localDateTime20.getValue(999);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 999");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
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
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plus(readableDuration22);
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
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks(10);
        int int11 = localDateTime10.getDayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withPeriodAdded(readablePeriod12, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 12 + "'", int11 == 12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }
}
