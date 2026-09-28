package org.joda.time;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime10 = localDate7.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate14 = localDate11.withPeriodAdded(readablePeriod12, (int) (byte) -1);
        org.joda.time.LocalDate localDate16 = localDate11.plusWeeks(0);
        org.joda.time.LocalDate localDate18 = localDate16.withYear((int) ' ');
        org.joda.time.LocalDate localDate20 = localDate16.withYearOfCentury((int) (byte) 1);
        int int21 = localDate16.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = localDate16.toDateTimeAtCurrentTime(dateTimeZone22);
        org.joda.time.DateTime dateTime24 = localDate7.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 28 + "'", int21 == 28);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
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
        org.joda.time.LocalDate localDate18 = localDate0.withDayOfYear((int) '4');
        org.joda.time.LocalTime localTime19 = null;
        org.joda.time.DateTime dateTime20 = localDate0.toDateTime(localTime19);
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
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = localDateTime4.getFields();
        int int7 = localDateTime4.getValue((int) (short) 1);
        int int8 = localDateTime4.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 35, dateTimeZone10);
        boolean boolean12 = localDateTime4.isBefore((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.millisOfSecond();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
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
        org.joda.time.DurationField durationField17 = property16.getLeapDurationField();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNull(durationField17);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 99, dateTimeZone1);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusMonths((int) ' ');
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.plusHours(70);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withEra((-1790557189));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1790557189 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minusHours((-1));
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks(52);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.plusSeconds(31);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusMonths(2007);
        org.joda.time.DateTimeField[] dateTimeFieldArray18 = localDateTime17.getFields();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.plusDays(2001);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.minusHours((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withSecondOfMinute(28319952);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28319952 for secondOfMinute must be in the range [0,59]");
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
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldArray18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        int int5 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate7 = localDate0.withLocalMillis((long) 2001);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfCentury(2);
        org.joda.time.LocalDate localDate11 = localDate9.minusWeeks(4);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = localDate0.indexOf(dateTimeFieldType5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate0.isSupported(dateTimeFieldType7);
        int[] intArray9 = localDate0.getValues();
        org.joda.time.DurationFieldType durationFieldType10 = null;
        boolean boolean11 = localDate0.isSupported(durationFieldType10);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 2026, 9, 28 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMinuteOfHour(9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withDate(15, 2026, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2026 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
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
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDate localDate29 = localDate26.withPeriodAdded(readablePeriod27, (int) (byte) -1);
        org.joda.time.LocalDate localDate31 = localDate26.plusWeeks(0);
        org.joda.time.LocalDate localDate33 = localDate31.withYear((int) ' ');
        org.joda.time.LocalDate localDate35 = localDate33.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property36 = localDate33.yearOfCentury();
        org.joda.time.LocalDate localDate37 = property36.roundHalfCeilingCopy();
        int int38 = localDate37.getCenturyOfEra();
        org.joda.time.LocalDate.Property property39 = localDate37.weekyear();
        org.joda.time.Chronology chronology40 = localDate37.getChronology();
        boolean boolean41 = localDate24.equals((java.lang.Object) localDate37);
        int int42 = localDate37.getDayOfWeek();
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
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 6 + "'", int42 == 6);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        long long5 = property4.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = property4.getFieldType();
        long long7 = property4.getMillis();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25200052L + "'", long5 == 25200052L);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 25200052L + "'", long7 == 25200052L);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate localDate8 = localDate0.minusYears(12);
        org.joda.time.LocalDate.Property property9 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate11 = property9.addWrapFieldToCopy(4);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
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
        org.joda.time.LocalDate localDate28 = localDate24.withYear((int) (byte) -1);
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
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
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
        int int17 = localDateTime5.getYearOfCentury();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 70 + "'", int17 == 70);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
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
        org.joda.time.LocalDateTime localDateTime18 = property15.roundFloorCopy();
        org.joda.time.DateTimeField dateTimeField19 = property15.getField();
        org.joda.time.LocalDateTime localDateTime20 = property15.withMaximumValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 19 + "'", int14 == 19);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
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
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate16 = localDate13.minus(readablePeriod15);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate10 = localDate7.minusWeeks(5);
        org.joda.time.LocalDate localDate12 = localDate10.withYearOfCentury((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.plus(readablePeriod13);
        org.joda.time.LocalDate.Property property15 = localDate14.dayOfWeek();
        org.joda.time.DurationFieldType durationFieldType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = localDate14.withFieldAdded(durationFieldType16, 521);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = localDate0.toString(dateTimeFormatter17);
        int int19 = localDate0.getWeekOfWeekyear();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2026-09-28" + "'", str18, "2026-09-28");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 40 + "'", int19 == 40);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
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
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = localDate15.toDateMidnight(dateTimeZone19);
        org.joda.time.LocalDate localDate22 = localDate15.minusYears(0);
        int int23 = localDate22.getDayOfMonth();
        org.joda.time.Interval interval24 = localDate22.toInterval();
        int int25 = localDate22.getDayOfYear();
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
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 28 + "'", int23 == 28);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 272 + "'", int25 == 272);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYear();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property3.getFieldType();
        java.lang.String str5 = property3.getAsShortText();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "52" + "'", str5, "52");
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("2031-10-19");
        org.junit.Assert.assertNotNull(localDate1);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
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
        org.joda.time.LocalDate localDate41 = localDate13.minusYears(70);
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
        org.junit.Assert.assertNotNull(localDate41);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        int int5 = localDate0.getYearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, 0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26 + "'", int5 == 26);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
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
        org.joda.time.DurationField durationField20 = property19.getLeapDurationField();
        org.joda.time.Chronology chronology21 = property19.getChronology();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(chronology21);
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
        org.junit.Assert.assertNull(durationField20);
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = property19.setCopy(28825373);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28825373 for centuryOfEra must be in the range [0,2922789]");
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
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
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
        org.joda.time.LocalDate localDate16 = localDate0.minusWeeks(6);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) '4');
        int int19 = localDateTime18.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property20 = localDateTime18.dayOfYear();
        org.joda.time.LocalDateTime.Property property21 = localDateTime18.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.minus(readableDuration22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = localDate16.isAfter((org.joda.time.ReadablePartial) localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 48, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears(20);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusDays((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.minusDays(26340000);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 7);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
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
        org.joda.time.LocalDateTime.Property property20 = localDateTime9.yearOfEra();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime9.minusDays(1832);
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
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate localDate10 = localDate5.plusWeeks((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight11 = localDate5.toDateMidnight();
        org.joda.time.LocalDate.Property property12 = localDate5.weekOfWeekyear();
        org.joda.time.LocalDate localDate14 = property12.addWrapFieldToCopy(2025);
        org.joda.time.LocalDate localDate16 = localDate14.withCenturyOfEra((int) (short) 100);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
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
        int int11 = property10.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2026 + "'", int6 == 2026);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 292278993 + "'", int11 == 292278993);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear(70);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withPeriodAdded(readablePeriod7, 35);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plus(readablePeriod10);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
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
        java.lang.String str16 = localDate10.toString("1970-01-01");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
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
        int int20 = localDateTime9.getDayOfWeek();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight10 = localDate9.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate9.toDateTimeAtCurrentTime(dateTimeZone11);
        int int13 = localDate9.getDayOfMonth();
        org.joda.time.LocalDate localDate15 = localDate9.plusWeeks(15);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 28 + "'", int13 == 28);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withCenturyOfEra(1);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.centuryOfEra();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withCenturyOfEra((int) (byte) 10);
        int int9 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.LocalDateTime.Property property10 = localDateTime4.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime4.withPeriodAdded(readablePeriod11, (int) (short) 100);
        org.joda.time.DateTime dateTime14 = localDateTime4.toDateTime();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        java.lang.String str8 = property7.getAsText();
        org.joda.time.LocalDate localDate9 = property7.withMinimumValue();
        boolean boolean10 = property7.isLeap();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026" + "'", str8, "2026");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.withDayOfYear(4);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        org.joda.time.LocalDate localDate6 = property5.roundHalfEvenCopy();
        int int7 = localDate6.getDayOfWeek();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime6 = property4.addWrapFieldToCopy(3);
        java.util.Locale locale7 = null;
        int int8 = property4.getMaximumTextLength(locale7);
        long long9 = property4.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property4.getFieldType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 25200052L + "'", long9 == 25200052L);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("9");
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusMonths(20);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withYear(3);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withYear(5);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
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
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.millisOfSecond();
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
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        int int5 = property4.get();
        org.joda.time.LocalDate localDate7 = property4.addToCopy(11);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        org.joda.time.DateTime dateTime7 = localDate0.toDateTimeAtCurrentTime();
        org.joda.time.DurationFieldType durationFieldType8 = null;
        boolean boolean9 = localDate0.isSupported(durationFieldType8);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
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
        org.joda.time.LocalDateTime localDateTime28 = localDateTime13.minusMinutes(40);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 365, dateTimeZone30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withMillisOfDay(5232);
        boolean boolean34 = localDateTime28.equals((java.lang.Object) 5232);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime36 = localDateTime28.withMillisOfSecond(2052);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2052 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        java.lang.String str8 = localDate6.toString("333");
        org.joda.time.LocalDate.Property property9 = localDate6.weekyear();
        org.joda.time.LocalDate localDate10 = property9.withMinimumValue();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "333" + "'", str8, "333");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
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
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusSeconds(0);
        int int27 = localDateTime24.getDayOfWeek();
        org.joda.time.DateTime dateTime28 = localDateTime24.toDateTime();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.withYear((int) (short) 10);
        boolean boolean31 = localDateTime21.isEqual((org.joda.time.ReadablePartial) localDateTime24);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((java.lang.Object) boolean31, dateTimeZone32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 25200000L + "'", long19 == 25200000L);
// flaky "1) test3547(org.joda.time.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u0e21\u0e04." + "'", str20, "\u0e21\u0e04.");
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
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
        java.util.Date date14 = localDateTime11.toDate();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "dayOfMonth" + "'", str9, "dayOfMonth");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 07:00:00 ICT 1970");
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, (-1));
        org.joda.time.LocalDate.Property property9 = localDate0.weekOfWeekyear();
        org.joda.time.LocalDate localDate11 = property9.addToCopy((-292275054));
        org.joda.time.LocalDate.Property property12 = localDate11.dayOfWeek();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate0.minus(readablePeriod4);
        org.joda.time.LocalDate.Property property6 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate7 = property6.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate9 = localDate7.minusMonths((int) (byte) -1);
        org.joda.time.LocalDate.Property property10 = localDate7.monthOfYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
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
        org.joda.time.LocalDateTime localDateTime18 = property16.addToCopy(25200000);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withDayOfWeek(251980);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 251980 for dayOfWeek must be in the range [1,7]");
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
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
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
        org.joda.time.LocalDateTime localDateTime34 = localDateTime18.withYearOfCentury(59);
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
        org.junit.Assert.assertNotNull(localDateTime34);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
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
        int int13 = property7.getLeapAmount();
        org.joda.time.LocalDate localDate14 = property7.roundFloorCopy();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        int int6 = localDateTime1.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.year();
        org.joda.time.LocalDateTime localDateTime9 = property7.addWrapFieldToCopy(0);
        org.joda.time.DurationField durationField10 = property7.getDurationField();
        org.joda.time.LocalDateTime localDateTime11 = property7.getLocalDateTime();
        long long12 = localDateTime11.getLocalMillis();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 25200052L + "'", long12 == 25200052L);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        java.util.Date date6 = localDateTime1.toDate();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.plusDays(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusMillis(365);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusMillis((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withMonthOfYear(33);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 33 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        boolean boolean10 = localDate7.equals((java.lang.Object) 100.0d);
        org.joda.time.LocalDate.Property property11 = localDate7.centuryOfEra();
        java.util.Date date12 = localDate7.toDate();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Feb 19 00:00:00 ICT 2032");
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property10 = localDate9.weekOfWeekyear();
        int int11 = localDate9.getWeekyear();
        org.joda.time.LocalDate.Property property12 = localDate9.weekyear();
        org.joda.time.LocalDate localDate14 = localDate9.withYear(0);
        org.joda.time.LocalDate.Property property15 = localDate9.dayOfWeek();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withLocalMillis((long) 28320052);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 31, chronology5);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        int int9 = localDateTime8.getYearOfEra();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime12 = property10.addToCopy((int) '4');
        int int13 = localDateTime12.getEra();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.plus(readableDuration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks(10);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusDays((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusMonths(9);
        int int22 = localDateTime19.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) '4');
        int int25 = localDateTime24.getYearOfEra();
        org.joda.time.LocalDateTime.Property property26 = localDateTime24.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime28 = property26.addToCopy((int) '4');
        int int29 = localDateTime28.getEra();
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.plus(readableDuration30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime28.plusMillis(0);
        int int35 = localDateTime28.getValue(2);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime28.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusMinutes(0);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = localDateTime39.toDateTime(dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime19.withFields((org.joda.time.ReadablePartial) localDateTime39);
        boolean boolean43 = localDateTime6.equals((java.lang.Object) localDateTime39);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime6.withYearOfCentury(10);
        org.joda.time.LocalDateTime.Property property46 = localDateTime6.centuryOfEra();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 19 + "'", int22 == 19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1970 + "'", int25 == 1970);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(property46);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        long long9 = localDate0.getLocalMillis();
        org.joda.time.LocalDate localDate11 = localDate0.plusWeeks(11);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.Interval interval13 = localDate0.toInterval(dateTimeZone12);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1790553600000L + "'", long9 == 1790553600000L);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(interval13);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
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
        int int29 = localDate28.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = localDate28.toDateTimeAtStartOfDay(dateTimeZone30);
        org.joda.time.LocalDate localDate33 = localDate28.plusYears(621);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(localDate33);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate5.withPeriodAdded(readablePeriod6, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight9 = localDate5.toDateMidnight();
        int int10 = property4.compareTo((org.joda.time.ReadableInstant) dateMidnight9);
        java.util.Locale locale11 = null;
        java.lang.String str12 = property4.getAsText(locale11);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate localDate5 = localDate2.minusYears((int) (byte) 1);
        org.joda.time.LocalDate.Property property6 = localDate5.weekOfWeekyear();
        org.joda.time.LocalDate.Property property7 = localDate5.yearOfCentury();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.withDurationAdded(readableDuration9, 50);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusSeconds(0);
        int int17 = localDateTime14.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) '4');
        int int20 = localDateTime19.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property21 = localDateTime19.dayOfYear();
        org.joda.time.LocalDateTime.Property property22 = localDateTime19.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime23 = property22.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property22.getFieldType();
        int int25 = localDateTime14.indexOf(dateTimeFieldType24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime14.plusYears(365);
        int int28 = localDateTime5.compareTo((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.plusMonths(999);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(localDateTime30);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        java.util.Locale locale5 = null;
        int int6 = property3.getMaximumTextLength(locale5);
        org.joda.time.LocalDateTime localDateTime7 = property3.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((java.lang.Object) property3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate.Property property9 = localDate5.weekOfWeekyear();
        org.joda.time.LocalDate localDate10 = property9.withMaximumValue();
        org.joda.time.LocalDate.Property property11 = localDate10.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate14 = localDate10.withPeriodAdded(readablePeriod12, 1);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate16 = localDate14.plus(readablePeriod15);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.DurationField durationField8 = property7.getDurationField();
        java.lang.String str9 = property7.getAsText();
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = property7.setCopy("2026-09-24T04:00:04.537", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2026-09-24T04:00:04.537\" for dayOfYear is not supported");
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
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate localDate8 = localDate6.withYearOfEra(100);
        int int9 = localDate6.getYearOfCentury();
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate15 = localDate12.withPeriodAdded(readablePeriod13, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight16 = localDate12.toDateMidnight();
        org.joda.time.LocalDate localDate18 = localDate12.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property19 = localDate18.year();
        org.joda.time.Chronology chronology20 = localDate18.getChronology();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) "2026", chronology20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField22 = localDate6.getField(3, chronology20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 26 + "'", int9 == 26);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(chronology20);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate.Property property9 = localDate8.dayOfWeek();
        int int10 = localDate8.getDayOfMonth();
        org.joda.time.LocalDate.Property property11 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(25200052L);
        org.joda.time.LocalDate localDate15 = localDate13.withLocalMillis(10L);
        org.joda.time.LocalDate localDate17 = localDate15.minusYears(19);
        int int18 = property11.compareTo((org.joda.time.ReadablePartial) localDate17);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(1964, 231, 271, 3, 740341);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 740341 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localDateTime7.getValue(59);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 59");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
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
        org.joda.time.LocalDateTime localDateTime18 = property15.roundFloorCopy();
        java.lang.String str19 = property15.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 19 + "'", int14 == 19);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Property[weekOfWeekyear]" + "'", str19, "Property[weekOfWeekyear]");
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        int int7 = localDateTime1.getMillisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withPeriodAdded(readablePeriod8, 40);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = localDateTime1.getFieldType(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.DurationField durationField4 = property3.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.yearOfEra();
        org.joda.time.LocalDateTime localDateTime7 = property6.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime8 = property6.withMinimumValue();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.year();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.plusMillis(1973);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        int int5 = localDateTime4.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = localDateTime7.getFieldTypes();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
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
        org.joda.time.LocalDate.Property property14 = localDate7.weekyear();
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
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate6 = property4.addToCopy(10);
        org.joda.time.LocalDate localDate8 = property4.addToCopy(1970);
        long long9 = property4.getMillis();
        java.lang.String str10 = property4.getAsShortText();
        org.joda.time.LocalDate localDate11 = property4.roundCeilingCopy();
        org.joda.time.LocalDate localDate12 = property4.roundCeilingCopy();
        org.joda.time.DurationField durationField13 = property4.getLeapDurationField();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNull(durationField13);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate10 = localDate7.minusWeeks(5);
        int int11 = localDate7.getYearOfEra();
        org.joda.time.LocalDate localDate13 = localDate7.withLocalMillis(4233600000L);
        org.joda.time.LocalDate localDate15 = localDate7.plusYears((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = localDate15.toString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2032 + "'", int11 == 2032);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate localDate10 = localDate8.minusYears(25200052);
        int int11 = localDate10.getDayOfWeek();
        org.joda.time.LocalDate.Property property12 = localDate10.dayOfYear();
        java.lang.String str14 = localDate10.toString("5232-02-19");
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "5232-02-19" + "'", str14, "5232-02-19");
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDate localDate10 = localDate7.withPeriodAdded(readablePeriod8, (int) (byte) -1);
        int int11 = localDate7.getYearOfEra();
        org.joda.time.LocalDate localDate13 = localDate7.plusDays(1970);
        org.joda.time.LocalDate localDate15 = localDate7.withLocalMillis((long) (-1));
        org.joda.time.LocalDate.Property property16 = localDate15.dayOfWeek();
        int int17 = localDate15.getDayOfMonth();
        org.joda.time.LocalDate localDate19 = localDate15.plusMonths(2001);
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate22 = localDate20.minusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology23 = localDate22.getChronology();
        boolean boolean24 = localDate15.equals((java.lang.Object) chronology23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(31, 333, (int) (short) -1, (int) (byte) 100, 1, 28, 985, chronology23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2026 + "'", int11 == 2026);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 31 + "'", int17 == 31);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
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
        org.joda.time.LocalDateTime localDateTime11 = property8.withMinimumValue();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withDurationAdded(readableDuration12, 324);
        org.joda.time.DurationFieldType durationFieldType15 = null;
        boolean boolean16 = localDateTime11.isSupported(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        int int6 = localDateTime1.getMonthOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = localDateTime1.toString(dateTimeFormatter7);
        int int9 = localDateTime1.getDayOfMonth();
        int int10 = localDateTime1.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime1.withYearOfEra(28320052);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01T07:00:00.052" + "'", str8, "1970-01-01T07:00:00.052");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusDays((-1));
        int int8 = localDateTime7.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusMillis(36526);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
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
        org.joda.time.LocalDateTime localDateTime32 = localDateTime1.withMillisOfSecond(100);
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
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate5 = property4.getLocalDate();
        org.joda.time.DateTime dateTime6 = localDate5.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate.Property property7 = localDate5.year();
        java.util.Locale locale8 = null;
        int int9 = property7.getMaximumShortTextLength(locale8);
        org.joda.time.LocalDate localDate10 = property7.withMaximumValue();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
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
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusHours(8);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.dayOfWeek();
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
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        org.joda.time.DateTime dateTime10 = localDate7.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate12 = localDate7.withYearOfCentury(70);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate16 = localDate13.withPeriodAdded(readablePeriod14, (int) (byte) -1);
        org.joda.time.LocalDate localDate18 = localDate13.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDate localDate21 = localDate18.withPeriodAdded(readablePeriod19, 0);
        int int22 = localDate21.getCenturyOfEra();
        int int23 = localDate12.compareTo((org.joda.time.ReadablePartial) localDate21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate25 = localDate12.withDayOfMonth(41);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 41 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20 + "'", int22 == 20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusMonths((int) ' ');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusDays(70);
        int int12 = localDateTime9.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property13 = localDateTime9.dayOfWeek();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 28 + "'", int12 == 28);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate32 = localDate27.withDayOfYear(2037);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2037 for dayOfYear must be in the range [1,366]");
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
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        boolean boolean10 = localDate7.equals((java.lang.Object) 100.0d);
        org.joda.time.LocalDate.Property property11 = localDate7.dayOfYear();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
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
        org.joda.time.LocalDate.Property property27 = localDate24.dayOfMonth();
        org.joda.time.LocalDate localDate29 = property27.addWrapFieldToCopy(867);
        org.joda.time.ReadablePartial readablePartial30 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = localDate29.isAfter(readablePartial30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Partial cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDate29);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
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
        org.joda.time.LocalDate localDate16 = localDate8.withCenturyOfEra((int) ' ');
        org.joda.time.LocalDate.Property property17 = localDate16.monthOfYear();
        boolean boolean18 = property17.isLeap();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plus(readablePeriod6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusDays(67);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        java.lang.String str9 = property8.getName();
        org.joda.time.LocalDateTime localDateTime11 = property8.setCopy((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusHours(32);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withSecondOfMinute(15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "dayOfMonth" + "'", str9, "dayOfMonth");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        int int6 = localDateTime1.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.year();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusDays(0);
        int int10 = localDateTime9.getEra();
        int int11 = localDateTime9.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withWeekOfWeekyear(12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime9.secondOfMinute();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
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
        org.joda.time.DateTime dateTime30 = localDateTime7.toDateTime();
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
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
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
        org.joda.time.DateMidnight dateMidnight15 = localDate7.toDateMidnight();
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
        org.junit.Assert.assertNotNull(dateMidnight15);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        int int10 = localDate5.getDayOfMonth();
        int int11 = localDate5.getDayOfMonth();
        org.joda.time.LocalDate.Property property12 = localDate5.yearOfCentury();
        int int13 = localDate5.getDayOfWeek();
        org.joda.time.LocalDate localDate15 = localDate5.plusYears(1980);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 28 + "'", int10 == 28);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 28 + "'", int11 == 28);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        java.lang.String str9 = property8.getName();
        org.joda.time.LocalDateTime localDateTime11 = property8.setCopy((int) (short) 1);
        long long12 = property8.remainder();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "dayOfMonth" + "'", str9, "dayOfMonth");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 25200000L + "'", long12 == 25200000L);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        long long7 = localDate0.getLocalMillis();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1790553600000L + "'", long7 == 1790553600000L);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDateTime1.toDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusYears(0);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime12 = property10.addToCopy((long) 292278993);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
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
        org.joda.time.LocalDate localDate12 = property7.withMinimumValue();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime6 = property4.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = property4.addWrapFieldToCopy(521);
        int int9 = property4.getMaximumValueOverall();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(28320052, 54013758, (int) '#', 28320052, 39, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28320052 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        java.util.Date date6 = localDateTime1.toDate();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime.Property property8 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusWeeks((int) (short) 1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
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
        org.joda.time.LocalDate localDate22 = property8.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate22.toDateTimeAtCurrentTime(dateTimeZone23);
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
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateTime24);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(1969, (-1790557228), 25200000, 2058, (-1790557193));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2058 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minusHours((-1));
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks(52);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusMillis(8);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.weekOfWeekyear();
        int int17 = localDateTime15.getCenturyOfEra();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20 + "'", int17 == 20);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property10 = localDate7.yearOfCentury();
        org.joda.time.LocalDate localDate11 = property10.roundHalfCeilingCopy();
        int int12 = localDate11.getCenturyOfEra();
        org.joda.time.LocalDate localDate14 = localDate11.withYear((int) '4');
        org.joda.time.LocalDate localDate16 = localDate14.withYearOfEra(119);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) '4');
        int int19 = localDateTime18.getYearOfEra();
        org.joda.time.LocalDateTime.Property property20 = localDateTime18.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime22 = property20.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withYear(10);
        org.joda.time.Chronology chronology25 = localDateTime22.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((java.lang.Object) 119, chronology25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(chronology25);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        int int7 = localDateTime1.getMillisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withPeriodAdded(readablePeriod8, 40);
        org.joda.time.DurationFieldType durationFieldType11 = null;
        boolean boolean12 = localDateTime1.isSupported(durationFieldType11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
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
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withDayOfYear(2);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) '4');
        int int24 = localDateTime23.getYearOfEra();
        org.joda.time.LocalDateTime.Property property25 = localDateTime23.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime27 = property25.addToCopy((int) '4');
        int int28 = localDateTime27.getEra();
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.plus(readableDuration29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.withDurationAdded(readableDuration33, 0);
        int int37 = localDateTime32.getValue(2);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime32.plusMonths(2);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property40.getFieldType();
        boolean boolean42 = localDateTime20.isSupported(dateTimeFieldType41);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1970 + "'", int24 == 1970);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate11 = localDate8.withPeriodAdded(readablePeriod9, (int) (byte) -1);
        int int12 = localDate8.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        int int14 = localDate8.indexOf(dateTimeFieldType13);
        org.joda.time.LocalDate localDate16 = localDate8.withWeekyear((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate19 = localDate8.withPeriodAdded(readablePeriod17, 59);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = localDate8.toDateMidnight(dateTimeZone20);
        org.joda.time.Chronology chronology22 = localDate8.getChronology();
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.now(chronology22);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(1788220800000L, chronology22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(67, 5701010, 42, (int) '#', 2058, 67, 24208, chronology22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2026 + "'", int12 == 2026);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(localDate23);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
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
        org.joda.time.LocalDate.Property property16 = localDate13.weekyear();
        java.util.Locale locale17 = null;
        java.lang.String str18 = property16.getAsShortText(locale17);
        org.joda.time.DurationField durationField19 = property16.getRangeDurationField();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "5232" + "'", str18, "5232");
        org.junit.Assert.assertNull(durationField19);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(28319952L, dateTimeZone1);
        java.lang.String str3 = localDate2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        org.joda.time.Chronology chronology9 = property8.getChronology();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localDateTime2.getFields();
        org.joda.time.LocalDateTime.Property property4 = localDateTime2.monthOfYear();
        org.joda.time.DurationField durationField5 = property4.getLeapDurationField();
        org.joda.time.DurationField durationField6 = property4.getRangeDurationField();
        java.lang.String str7 = property4.getName();
        org.joda.time.LocalDateTime localDateTime8 = property4.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "monthOfYear" + "'", str7, "monthOfYear");
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        org.joda.time.Interval interval10 = localDate7.toInterval();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate15 = localDate12.withPeriodAdded(readablePeriod13, (int) (byte) -1);
        int int16 = localDate12.getYearOfEra();
        org.joda.time.LocalDate localDate18 = localDate12.plusDays(1970);
        org.joda.time.LocalDate localDate19 = localDate11.withFields((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.LocalDate.Property property20 = localDate18.monthOfYear();
        org.joda.time.LocalDate localDate22 = localDate18.minusWeeks((int) (byte) 1);
        org.joda.time.LocalDate.Property property23 = localDate18.dayOfYear();
        boolean boolean24 = localDate7.equals((java.lang.Object) property23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = localDate7.toDateTimeAtMidnight(dateTimeZone25);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2026 + "'", int16 == 2026);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
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
        int int14 = localDateTime13.getYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(date12);
// flaky "2) test3617(org.joda.time.RegressionTest7)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 08:00:30 ICT 2026");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2026 + "'", int14 == 2026);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate0.minus(readablePeriod4);
        org.joda.time.DateTime dateTime6 = localDate5.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate11 = localDate8.withPeriodAdded(readablePeriod9, (int) (byte) -1);
        int int12 = localDate8.getYearOfEra();
        org.joda.time.LocalDate localDate14 = localDate8.plusDays(1970);
        org.joda.time.LocalDate localDate15 = localDate7.withFields((org.joda.time.ReadablePartial) localDate14);
        long long16 = localDate7.getLocalMillis();
        java.lang.String str17 = localDate7.toString();
        int int18 = localDate7.getDayOfMonth();
        org.joda.time.LocalDate localDate19 = localDate5.withFields((org.joda.time.ReadablePartial) localDate7);
        int int20 = localDate19.getMonthOfYear();
        org.joda.time.LocalDate.Property property21 = localDate19.yearOfCentury();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2026 + "'", int12 == 2026);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1790553600000L + "'", long16 == 1790553600000L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2026-09-28" + "'", str17, "2026-09-28");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 28 + "'", int18 == 28);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plus(readablePeriod6);
        int int8 = localDateTime7.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withYearOfEra(53);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDateTime10.toDateTime(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        int int9 = localDate6.getDayOfWeek();
        org.joda.time.LocalDate localDate11 = localDate6.plusYears(9);
        int int12 = localDate11.size();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.LocalDate localDate10 = localDate7.plusDays(5);
        org.joda.time.LocalDate localDate12 = localDate7.withDayOfMonth(28);
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.LocalDate localDate15 = localDate12.minusDays(2025);
        org.joda.time.DurationFieldType durationFieldType16 = null;
        boolean boolean17 = localDate15.isSupported(durationFieldType16);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDateTime1.toDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.era();
        org.joda.time.DateTimeField dateTimeField6 = property5.getField();
        org.joda.time.DurationField durationField7 = property5.getLeapDurationField();
        org.joda.time.DurationField durationField8 = property5.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property5.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNull(durationField7);
        org.junit.Assert.assertNull(durationField8);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.DurationField durationField8 = property7.getDurationField();
        java.lang.String str9 = property7.getAsShortText();
        java.lang.String str10 = property7.getAsText();
        java.lang.String str11 = property7.toString();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "271" + "'", str9, "271");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "271" + "'", str10, "271");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Property[dayOfYear]" + "'", str11, "Property[dayOfYear]");
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
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
        org.joda.time.Interval interval15 = property13.toInterval();
        org.joda.time.LocalDate localDate16 = property13.withMinimumValue();
        org.joda.time.LocalDate localDate17 = property13.roundFloorCopy();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1790553600000L + "'", long14 == 1790553600000L);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate19 = localDate17.minusYears((-1790557193));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1790557192 for year must be in the range [-292275054,292278993]");
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
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        boolean boolean6 = property5.isLeap();
        java.util.Locale locale7 = null;
        int int8 = property5.getMaximumTextLength(locale7);
        org.joda.time.LocalDateTime localDateTime10 = property5.addToCopy((long) 9);
        int int11 = property5.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-292275054) + "'", int11 == (-292275054));
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundFloorCopy();
        org.joda.time.DurationField durationField8 = property3.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.yearOfEra();
        java.util.Locale locale12 = null;
        java.lang.String str13 = localDateTime9.toString("\u0e01\u0e1e.", locale12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.withEra((int) (short) 1);
        java.lang.String str16 = localDateTime15.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u0e01\u0e1e." + "'", str13, "\u0e01\u0e1e.");
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01T07:00:00.000" + "'", str16, "1970-01-01T07:00:00.000");
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now(chronology6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withDurationAdded(readableDuration8, 53);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMillisOfSecond(269);
        int int13 = localDateTime12.getMillisOfDay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
// flaky "3) test3628(org.joda.time.RegressionTest7)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 28831269 + "'", int13 == 28831269);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        org.joda.time.DateTime dateTime10 = localDate7.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate12 = localDate7.withWeekyear((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = localDate7.withFieldAdded(durationFieldType13, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusMonths((int) ' ');
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.plusHours(70);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withLocalMillis(1580400052L);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) '4');
        int int17 = localDateTime16.getYearOfEra();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime20 = property18.addToCopy((int) '4');
        org.joda.time.Chronology chronology21 = property18.getChronology();
        java.util.Locale locale22 = null;
        java.lang.String str23 = property18.getAsShortText(locale22);
        org.joda.time.LocalDateTime localDateTime24 = property18.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) '4');
        int int27 = localDateTime26.getYearOfEra();
        org.joda.time.LocalDateTime.Property property28 = localDateTime26.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime30 = property28.addToCopy((int) '4');
        org.joda.time.Chronology chronology31 = property28.getChronology();
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now(chronology31);
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.withDurationAdded(readableDuration33, 53);
        boolean boolean36 = localDateTime24.equals((java.lang.Object) localDateTime32);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime32.minusMillis(100);
        int int39 = localDateTime14.compareTo((org.joda.time.ReadablePartial) localDateTime38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = localDateTime38.toDateTime(dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) '4');
        int int44 = localDateTime43.getYearOfEra();
        org.joda.time.LocalDateTime.Property property45 = localDateTime43.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime47 = property45.addToCopy((int) '4');
        int int48 = localDateTime47.getEra();
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.plus(readableDuration49);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime47.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.LocalDateTime localDateTime55 = localDateTime52.withDurationAdded(readableDuration53, 0);
        int int56 = localDateTime52.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime52.minusMillis((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.plus(readableDuration59);
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime((long) '4');
        int int63 = localDateTime62.getYearOfEra();
        org.joda.time.LocalDateTime.Property property64 = localDateTime62.minuteOfHour();
        int int65 = property64.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime66 = property64.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime68 = property64.addWrapFieldToCopy((int) '#');
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone70);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime71.plusSeconds(0);
        int int74 = localDateTime71.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime76 = new org.joda.time.LocalDateTime((long) '4');
        int int77 = localDateTime76.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property78 = localDateTime76.dayOfYear();
        org.joda.time.LocalDateTime.Property property79 = localDateTime76.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime80 = property79.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType81 = property79.getFieldType();
        int int82 = localDateTime71.indexOf(dateTimeFieldType81);
        int int83 = localDateTime68.get(dateTimeFieldType81);
        boolean boolean84 = localDateTime58.isSupported(dateTimeFieldType81);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime86 = localDateTime38.withField(dateTimeFieldType81, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1970 + "'", int27 == 1970);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1970 + "'", int44 == 1970);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 28320052 + "'", int56 == 28320052);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1970 + "'", int63 == 1970);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 59 + "'", int65 == 59);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 4 + "'", int74 == 4);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertNotNull(localDateTime80);
        org.junit.Assert.assertNotNull(dateTimeFieldType81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
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
        int int18 = localDateTime17.getHourOfDay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        int int8 = localDate5.getMonthOfYear();
        int int9 = localDate5.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate11 = localDate5.minusWeeks(1964);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) localDate11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 40 + "'", int9 == 40);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.Interval interval4 = property2.toInterval();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withMonthOfYear(231);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 231 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime6 = property4.roundFloorCopy();
        int int7 = localDateTime6.getMinuteOfHour();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime7 = property3.addWrapFieldToCopy((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = property3.getLocalDateTime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(100);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.dayOfMonth();
        org.joda.time.Chronology chronology6 = property5.getChronology();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate localDate10 = localDate8.minusYears(25200052);
        int int11 = localDate10.getDayOfWeek();
        org.joda.time.LocalDate localDate13 = localDate10.plusWeeks(25200052);
        org.joda.time.LocalDate localDate15 = localDate13.withDayOfYear(40);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate13.toDateTimeAtStartOfDay(dateTimeZone16);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalTime localTime10 = null;
        org.joda.time.DateTime dateTime11 = localDate5.toDateTime(localTime10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate5.toDateTimeAtCurrentTime(dateTimeZone12);
        int int14 = localDate5.getYearOfEra();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2026 + "'", int14 == 2026);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(10, 40, 2007, 365, 867);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, (-1));
        org.joda.time.LocalDate.Property property9 = localDate0.weekyear();
        org.joda.time.LocalDate localDate10 = property9.withMaximumValue();
        org.joda.time.LocalDate localDate11 = property9.getLocalDate();
        org.joda.time.LocalDate localDate13 = localDate11.minusWeeks(242);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate9 = localDate0.withYear((int) '4');
        org.joda.time.LocalDate localDate11 = localDate9.withWeekyear(100);
        org.joda.time.LocalDate localDate13 = localDate9.withYear(2026);
        org.joda.time.LocalDate.Property property14 = localDate9.year();
        org.joda.time.LocalDate localDate15 = property14.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate localDate10 = localDate0.plusMonths((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = localDate0.withDayOfMonth(31140052);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 31140052 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
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
        org.joda.time.LocalDate localDate28 = localDate24.minusYears(2026);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = localDate24.toDateMidnight(dateTimeZone29);
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
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(dateMidnight30);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("2026-09-28");
        org.joda.time.LocalDate.Property property2 = localDate1.dayOfYear();
        org.joda.time.LocalDate localDate4 = localDate1.minusMonths((int) (byte) 10);
        org.joda.time.LocalDate localDate6 = localDate1.plusMonths(952);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        java.lang.String str8 = property7.getName();
        java.lang.String str9 = property7.getAsString();
        boolean boolean10 = property7.isLeap();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "year" + "'", str8, "year");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2026" + "'", str9, "2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks(1970);
        org.joda.time.DateTimeField[] dateTimeFieldArray11 = localDateTime8.getFields();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.plus(readablePeriod12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldArray11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = null;
        boolean boolean3 = localDateTime1.isSupported(durationFieldType2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withDate(271, 6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withTime(54013758, 55, 324, 3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54013758 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, (-1));
        org.joda.time.LocalDate.Property property9 = localDate0.weekOfWeekyear();
        org.joda.time.LocalDate localDate10 = property9.roundFloorCopy();
        int int11 = localDate10.getDayOfWeek();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("12", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        int int7 = localDateTime6.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYear(53);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withLocalMillis((long) 32);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundCeilingCopy();
        org.joda.time.DurationField durationField15 = property13.getRangeDurationField();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        int int6 = localDateTime1.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.year();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusHours(10);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears((int) (short) 1);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.monthOfYear();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.yearOfEra();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((int) (short) 0, 33, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 33 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate0.minus(readablePeriod4);
        org.joda.time.LocalDate localDate7 = localDate5.plusYears(5232);
        int int8 = localDate5.size();
        org.joda.time.LocalDate localDate10 = localDate5.minusWeeks((int) (byte) 100);
        java.lang.String str11 = localDate5.toString();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-09-28" + "'", str11, "2026-09-28");
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate5.withPeriodAdded(readablePeriod6, 0);
        org.joda.time.LocalDate.Property property9 = localDate8.yearOfEra();
        org.joda.time.LocalDate localDate10 = property9.withMinimumValue();
        java.util.Date date11 = localDate10.toDate();
        org.joda.time.LocalDate.Property property12 = localDate10.era();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Sep 28 00:00:00 ICT 1");
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMinutes(31);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withYear(100);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plus(readableDuration16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        int int7 = localDateTime1.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withWeekyear(14403717);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withDayOfYear(324);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.plusDays(521);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
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
        org.joda.time.LocalDate localDate15 = localDate10.minusWeeks(0);
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate19 = localDate16.withPeriodAdded(readablePeriod17, (int) (byte) -1);
        int int20 = localDate16.getYearOfEra();
        org.joda.time.LocalDate localDate22 = localDate16.plusDays(1970);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDate localDate25 = localDate16.withPeriodAdded(readablePeriod23, (int) (short) -1);
        org.joda.time.LocalDate localDate27 = localDate25.minusMonths(53);
        int int28 = localDate15.compareTo((org.joda.time.ReadablePartial) localDate27);
        int int29 = localDate27.getYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2026 + "'", int20 == 2026);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("1969-12-11");
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("1970-12-13T07:52:00.052");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1970-12-13T07:52:00.052\" is malformed at \"T07:52:00.052\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withSecondOfMinute((int) ' ');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = localDateTime1.toString(dateTimeFormatter12);
        int int14 = localDateTime1.getWeekyear();
        int int15 = localDateTime1.getMinuteOfHour();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01T07:00:00.052" + "'", str13, "1970-01-01T07:00:00.052");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
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
        org.joda.time.LocalDate localDate24 = localDate17.plusWeeks(25200064);
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
        org.junit.Assert.assertNotNull(localDate24);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfYear(3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 32);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.weekOfWeekyear();
        boolean boolean10 = localDateTime1.equals((java.lang.Object) localDateTime8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        org.joda.time.LocalDate localDate11 = localDate7.withCenturyOfEra((int) '4');
        org.joda.time.LocalDate.Property property12 = localDate7.yearOfCentury();
        org.joda.time.Chronology chronology13 = property12.getChronology();
        org.joda.time.LocalDate localDate15 = property12.addToCopy((int) (byte) 100);
        long long16 = property12.getMillis();
        org.joda.time.LocalDate localDate17 = property12.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1960761600000L + "'", long16 == 1960761600000L);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 69);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate.Property property9 = localDate5.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = property9.setCopy("2007-10-04T07:52:00.052");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2007-10-04T07:52:00.052\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
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
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate18 = localDate15.withPeriodAdded(readablePeriod16, 2037);
        org.joda.time.LocalDate localDate20 = localDate18.withWeekOfWeekyear(14);
        org.joda.time.LocalDate localDate22 = localDate20.minusMonths(28319952);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now(chronology6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withDurationAdded(readableDuration8, 53);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMillisOfSecond(269);
        int int13 = localDateTime12.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.secondOfMinute();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 26340000, dateTimeZone1);
        org.joda.time.LocalTime localTime3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = localDate2.toLocalDateTime(localTime3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The time must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("1970-01-19T07:00:00.052");
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusSeconds(0);
        int int5 = localDateTime2.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) '4');
        int int8 = localDateTime7.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.dayOfYear();
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime11 = property10.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property10.getFieldType();
        int int13 = localDateTime2.indexOf(dateTimeFieldType12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime2.plusYears(365);
        int int16 = localDateTime2.getYearOfEra();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1970 + "'", int16 == 1970);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = localDateTime13.withTime(52, 0, 28815681, 28);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
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
        org.joda.time.LocalDateTime localDateTime18 = localDateTime10.minusWeeks((int) (short) -1);
        java.util.Date date19 = localDateTime10.toDate();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.fromDateFields(date19);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.fromDateFields(date19);
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.fromDateFields(date19);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plus(readablePeriod23);
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
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 07:52:00 ICT 1970");
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
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
        java.lang.String str14 = property8.getAsText();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate5 = property4.getLocalDate();
        org.joda.time.DateTime dateTime6 = localDate5.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate.Property property7 = localDate5.year();
        long long8 = property7.getMillis();
        org.joda.time.LocalDate localDate9 = property7.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((java.lang.Object) localDate9, dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime15 = property14.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime16 = property14.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) '4');
        int int19 = localDateTime18.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property20 = localDateTime18.dayOfYear();
        org.joda.time.LocalDateTime.Property property21 = localDateTime18.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime22 = property21.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property21.getFieldType();
        int int24 = localDateTime16.get(dateTimeFieldType23);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = localDate9.get(dateTimeFieldType23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfMinute' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(2027, 4, 15, 4, 32);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
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
            org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((int) (byte) 0, 743, 25260000, 25200010, 521, (-1790557228), 621, chronology36);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25200010 for hourOfDay must be in the range [0,23]");
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
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property15.getFieldType();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
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
        org.joda.time.DurationField durationField25 = property24.getDurationField();
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
        org.junit.Assert.assertNotNull(durationField25);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plus(readableDuration4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.era();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime5.withDayOfWeek(1955);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1955 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 59, dateTimeZone1);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
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
        org.joda.time.LocalDateTime localDateTime28 = localDateTime13.minusMinutes(40);
        java.util.Date date29 = localDateTime28.toDate();
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
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Wed Dec 31 23:20:00 ICT 1969");
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
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
        org.joda.time.LocalDate.Property property13 = localDate12.yearOfCentury();
        org.joda.time.LocalDate localDate15 = localDate12.withWeekyear(4);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "271" + "'", str9, "271");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.Interval interval7 = property3.toInterval();
        org.joda.time.LocalDateTime localDateTime8 = property3.withMaximumValue();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withDurationAdded(readableDuration9, 740341);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.minuteOfHour();
        int int7 = property6.getMaximumValue();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 59 + "'", int7 == 59);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
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
        org.joda.time.LocalDate.Property property20 = localDate19.dayOfWeek();
        org.joda.time.LocalDate localDate21 = property20.withMinimumValue();
        org.joda.time.LocalDate localDate23 = localDate21.minusMonths(39);
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
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
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
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.Interval interval18 = localDate10.toInterval(dateTimeZone17);
        int int19 = localDate10.getWeekyear();
        org.joda.time.DateTime dateTime20 = localDate10.toDateTimeAtCurrentTime();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2026 + "'", int19 == 2026);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
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
        java.lang.String str12 = property11.getAsShortText();
        long long13 = property11.getMillis();
        org.joda.time.DateTimeField dateTimeField14 = property11.getField();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "8" + "'", str12, "8");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1960761600000L + "'", long13 == 1960761600000L);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, (-1));
        org.joda.time.LocalDate.Property property9 = localDate0.weekyear();
        long long10 = property9.getMillis();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1790553600000L + "'", long10 == 1790553600000L);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate9 = property7.addWrapFieldToCopy((int) (short) 1);
        org.joda.time.DurationField durationField10 = property7.getRangeDurationField();
        org.joda.time.LocalDate localDate11 = property7.withMinimumValue();
        org.joda.time.LocalDate localDate13 = localDate11.plusDays((int) '#');
        org.joda.time.LocalDate localDate15 = localDate13.plusMonths(2026);
        int int16 = localDate13.getCenturyOfEra();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.withYearOfEra(54013758);
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(localTime5);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = localDateTime4.getFields();
        int int7 = localDateTime4.getValue((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withYearOfEra((int) (short) 1);
        int int10 = localDateTime9.getMinuteOfHour();
        java.lang.String str12 = localDateTime9.toString("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35" + "'", str12, "\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35");
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
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
        org.joda.time.LocalDate localDate15 = localDate13.minusDays(25200064);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2007 + "'", int9 == 2007);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
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
        org.joda.time.LocalTime localTime16 = null;
        org.joda.time.DateTime dateTime17 = localDate15.toDateTime(localTime16);
        org.joda.time.LocalDate.Property property18 = localDate15.centuryOfEra();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
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
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusHours(8);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withPeriodAdded(readablePeriod19, 99);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withLocalMillis(1799020800000L);
        java.util.Date date24 = localDateTime21.toDate();
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
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Wed Jan 01 07:52:32 ICT 1969");
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
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
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusMillis(48);
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
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate0.year();
        org.joda.time.LocalDate localDate5 = property3.addToCopy(3);
        org.joda.time.LocalDate localDate6 = property3.roundHalfEvenCopy();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate8 = localDate6.plus(readablePeriod7);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
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
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray30 = localDateTime14.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime14.minus(readablePeriod31);
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
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray30);
        org.junit.Assert.assertNotNull(localDateTime32);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
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
        org.joda.time.LocalDateTime localDateTime19 = localDateTime2.withDayOfYear((int) ' ');
        org.joda.time.LocalDateTime localDateTime21 = localDateTime2.plusSeconds(2027);
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
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
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
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.minusMillis(28816124);
        org.joda.time.LocalDateTime.Property property20 = localDateTime13.yearOfEra();
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
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate0.minus(readablePeriod4);
        org.joda.time.LocalDate.Property property6 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate7 = property6.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 2026, dateTimeZone9);
        int[] intArray11 = localDate10.getValues();
        org.joda.time.LocalDate.Property property12 = localDate10.weekOfWeekyear();
        org.joda.time.LocalDate localDate14 = property12.addToCopy(10);
        int int15 = localDate14.getYearOfCentury();
        org.joda.time.DateTime dateTime16 = localDate14.toDateTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localDate14.toDateTimeAtCurrentTime(dateTimeZone17);
        long long19 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime18);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 70 + "'", int15 == 70);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 20653L + "'", long19 == 20653L);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusYears(12);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusMonths(1969);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYearOfCentury(52);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime7);
        int int11 = localDateTime10.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusDays(56);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        int int7 = localDate1.indexOf(dateTimeFieldType6);
        org.joda.time.LocalDate localDate9 = localDate1.withWeekyear((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate12 = localDate1.withPeriodAdded(readablePeriod10, 59);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = localDate1.toDateMidnight(dateTimeZone13);
        org.joda.time.Chronology chronology15 = localDate1.getChronology();
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now(chronology15);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(1788220800000L, chronology15);
        org.joda.time.LocalDate.Property property18 = localDate17.weekOfWeekyear();
        org.joda.time.LocalDate localDate19 = property18.roundFloorCopy();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDate19);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
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
        int int18 = localDateTime17.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.dayOfYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.weekyear();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = property7.getDifference(readableInstant8);
        org.joda.time.LocalDate localDate10 = property7.withMinimumValue();
        org.joda.time.LocalDate localDate11 = property7.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate13 = localDate11.minusYears(2);
        long long14 = localDate11.getLocalMillis();
        org.joda.time.LocalDate.Property property15 = localDate11.yearOfEra();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plus(readableDuration19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.minusSeconds(0);
        int int23 = localDateTime18.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property24 = localDateTime18.year();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime18.plusHours(10);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime26, dateTimeZone27);
        org.joda.time.Chronology chronology29 = localDateTime28.getChronology();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) '4');
        int int32 = localDateTime31.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime31.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime39 = localDateTime31.withFields((org.joda.time.ReadablePartial) localDateTime38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime31.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime31.withHourOfDay((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.withPeriodAdded(readablePeriod44, (int) '#');
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.withWeekyear(12);
        java.util.Date date49 = localDateTime48.toDate();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = localDateTime48.toDateTime(dateTimeZone50);
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((long) '4');
        int int54 = localDateTime53.getYearOfEra();
        org.joda.time.LocalDateTime.Property property55 = localDateTime53.minuteOfHour();
        org.joda.time.LocalDateTime.Property property56 = localDateTime53.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray57 = localDateTime53.getFieldTypes();
        org.joda.time.LocalDateTime.Property property58 = localDateTime53.secondOfMinute();
        org.joda.time.LocalDateTime.Property property59 = localDateTime53.monthOfYear();
        org.joda.time.Chronology chronology60 = property59.getChronology();
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime48, chronology60);
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime28, chronology60);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField63 = localDate11.getField(2922789, chronology60);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2922789");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1799020800000L + "'", long14 == 1799020800000L);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Tue Jan 05 00:00:00 ICT 12");
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1970 + "'", int54 == 1970);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(chronology60);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minusHours((-1));
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withLocalMillis((long) 28);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withDayOfYear(10);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) '4');
        int int18 = localDateTime17.getYearOfEra();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime21 = property19.addToCopy((int) '4');
        int int22 = localDateTime21.getEra();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.plus(readableDuration23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime21.withPeriodAdded(readablePeriod25, 2922789);
        org.joda.time.DurationFieldType durationFieldType28 = null;
        boolean boolean29 = localDateTime21.isSupported(durationFieldType28);
        boolean boolean30 = localDateTime13.isBefore((org.joda.time.ReadablePartial) localDateTime21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1970 + "'", int18 == 1970);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.weekyear();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = property7.getDifference(readableInstant8);
        org.joda.time.LocalDate localDate10 = property7.withMinimumValue();
        org.joda.time.LocalDate localDate11 = property7.roundHalfCeilingCopy();
        int int12 = localDate11.size();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate15 = localDate11.withPeriodAdded(readablePeriod13, 2037);
        org.joda.time.LocalDate localDate17 = localDate11.plusDays(324);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        boolean boolean6 = property4.equals((java.lang.Object) 70);
        org.joda.time.LocalDateTime localDateTime7 = property4.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = property4.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.year();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate9 = property7.addWrapFieldToCopy((int) (short) 1);
        org.joda.time.DurationField durationField10 = property7.getRangeDurationField();
        org.joda.time.LocalDate localDate11 = property7.withMinimumValue();
        int int12 = property7.getMinimumValue();
        java.lang.String str13 = property7.getAsString();
        org.joda.time.DurationField durationField14 = property7.getLeapDurationField();
        org.joda.time.LocalDate localDate15 = property7.roundFloorCopy();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "271" + "'", str13, "271");
        org.junit.Assert.assertNull(durationField14);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withDate(2, (int) (byte) 100, 2027);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate6 = property4.addToCopy(10);
        org.joda.time.LocalDate localDate8 = property4.addToCopy(1970);
        org.joda.time.LocalDate.Property property9 = localDate8.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localDate8.getValue(20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 20");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate63 = localDate7.withDayOfMonth(26340000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26340000 for dayOfMonth must be in the range [1,29]");
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
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        java.lang.String str7 = property3.toString();
        org.joda.time.LocalDateTime localDateTime9 = property3.addToCopy((long) 99);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plus(readableDuration10);
        int int12 = localDateTime11.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Property[minuteOfHour]" + "'", str7, "Property[minuteOfHour]");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMinutes(31);
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.yearOfEra();
        org.joda.time.LocalDateTime localDateTime15 = property14.withMaximumValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        int int5 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate7 = localDate0.withDayOfYear(100);
        org.joda.time.LocalDate localDate9 = localDate7.minusWeeks(0);
        java.util.Date date10 = localDate9.toDate();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = localDate9.toDateMidnight(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = localDate9.toDateMidnight(dateTimeZone13);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Fri Apr 10 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(dateMidnight14);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        int int11 = localDateTime10.getYearOfEra();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = localDateTime10.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withDayOfYear(985);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 985 for dayOfYear must be in the range [1,365]");
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
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray12);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate.Property property9 = localDate5.year();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate12 = localDate5.withPeriodAdded(readablePeriod10, 2026);
        int int13 = localDate5.getDayOfMonth();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = localDate5.toString(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 28 + "'", int13 == 28);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2026-09-28" + "'", str15, "2026-09-28");
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
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
        // The following exception was thrown during execution in test generation
        try {
            int int18 = localDateTime12.getValue(24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 24");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky "4) test3719(org.joda.time.RegressionTest7)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 28831766 + "'", int10 == 28831766);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(date13);
// flaky "1) test3719(org.joda.time.RegressionTest7)":         org.junit.Assert.assertEquals(date13.toString(), "Tue Sep 01 08:00:31 ICT 2026");
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property10 = localDate7.yearOfCentury();
        org.joda.time.LocalDate localDate11 = property10.roundHalfCeilingCopy();
        int int12 = localDate11.getCenturyOfEra();
        org.joda.time.LocalDate localDate14 = localDate11.withYear((int) '4');
        org.joda.time.LocalDate localDate16 = localDate14.withYearOfEra(119);
        org.joda.time.LocalDate.Property property17 = localDate14.yearOfEra();
        org.joda.time.LocalDate localDate18 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDate localDate21 = localDate18.withPeriodAdded(readablePeriod19, (int) (byte) -1);
        int int22 = localDate18.getYearOfEra();
        org.joda.time.LocalDate localDate24 = localDate18.plusDays(1970);
        org.joda.time.LocalDate localDate26 = localDate18.withLocalMillis((long) (-1));
        org.joda.time.LocalDate.Property property27 = localDate26.dayOfWeek();
        int int28 = localDate26.getDayOfMonth();
        org.joda.time.LocalTime localTime29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = localDate26.toDateTime(localTime29, dateTimeZone30);
        org.joda.time.LocalDate.Property property32 = localDate26.yearOfEra();
        org.joda.time.DateTime dateTime33 = localDate26.toDateTimeAtMidnight();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = localDate26.toDateTimeAtStartOfDay(dateTimeZone34);
        long long36 = property17.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime35);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2026 + "'", int22 == 2026);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 31 + "'", int28 == 31);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1917L) + "'", long36 == (-1917L));
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("9");
        org.junit.Assert.assertNotNull(localDate1);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
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
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now(chronology14);
        int int16 = localDate15.getDayOfWeek();
        org.joda.time.LocalDate localDate18 = localDate15.withWeekyear(39);
        org.joda.time.LocalDate.Property property19 = localDate18.centuryOfEra();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withLocalMillis((long) 28320052);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.secondOfMinute();
        int int5 = property4.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime7 = property4.addToCopy((int) (short) 0);
        org.joda.time.DurationFieldType durationFieldType8 = null;
        boolean boolean9 = localDateTime7.isSupported(durationFieldType8);
        int int10 = localDateTime7.getCenturyOfEra();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        int int7 = localDateTime6.getEra();
        int[] intArray8 = localDateTime6.getValues();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 35, 1, 4, 25200052 });
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        long long12 = localDateTime11.getLocalMillis();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withWeekyear((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5701010L + "'", long12 == 5701010L);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localDateTime2.getFields();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = localDateTime2.toString(dateTimeFormatter4);
        int int6 = localDateTime2.getSecondOfMinute();
        int int7 = localDateTime2.getEra();
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T07:00:00.000" + "'", str5, "1970-01-01T07:00:00.000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
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
        int int19 = localDateTime18.getMillisOfDay();
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
// flaky "5) test3727(org.joda.time.RegressionTest7)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 14431826 + "'", int19 == 14431826);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
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
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.plusYears(86399999);
        org.joda.time.Chronology chronology32 = localDateTime26.getChronology();
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
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(chronology32);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate9 = localDate0.withYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Interval interval11 = localDate0.toInterval(dateTimeZone10);
        int int12 = localDate0.getDayOfMonth();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 28 + "'", int12 == 28);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate5.withPeriodAdded(readablePeriod6, 0);
        org.joda.time.Chronology chronology9 = localDate5.getChronology();
        org.joda.time.LocalDate localDate11 = localDate5.withDayOfYear(8);
        org.joda.time.LocalDate.Property property12 = localDate11.weekyear();
        int int13 = localDate11.getWeekyear();
        org.joda.time.LocalDate.Property property14 = localDate11.centuryOfEra();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2026 + "'", int13 == 2026);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
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
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusDays(750);
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
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfWeek();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundHalfEvenCopy();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withDurationAdded(readableDuration6, 53994173);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
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
        org.joda.time.Chronology chronology14 = localDate11.getChronology();
        org.joda.time.LocalDate.Property property15 = localDate11.yearOfEra();
        org.joda.time.LocalDate localDate16 = property15.getLocalDate();
        org.joda.time.LocalDate localDate18 = localDate16.plusMonths(272);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusSeconds(0);
        int int5 = localDateTime2.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) '4');
        int int8 = localDateTime7.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.dayOfYear();
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime11 = property10.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property10.getFieldType();
        int int13 = localDateTime2.indexOf(dateTimeFieldType12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime2.plusYears(365);
        int int16 = localDateTime2.getYearOfCentury();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 70 + "'", int16 == 70);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(2037, 28320052, 1832, 54022458, 28, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54022458 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, (-1));
        org.joda.time.LocalDate.Property property9 = localDate0.weekOfWeekyear();
        org.joda.time.LocalDate localDate10 = property9.getLocalDate();
        org.joda.time.DurationField durationField11 = property9.getRangeDurationField();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
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
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withWeekyear(36526);
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
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
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
        int int15 = localDate7.getDayOfWeek();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2032 + "'", int12 == 2032);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusDays((-1));
        org.joda.time.DateTime dateTime8 = localDateTime1.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withDayOfMonth(867);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 867 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        java.lang.String str7 = localDateTime6.toString();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withMinuteOfHour(0);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.centuryOfEra();
        java.lang.String str11 = property10.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0035-01-04T07:00:00.052" + "'", str7, "0035-01-04T07:00:00.052");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Property[centuryOfEra]" + "'", str11, "Property[centuryOfEra]");
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMinimumValue();
        java.util.Date date6 = localDateTime5.toDate();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime8 = property7.withMinimumValue();
        org.joda.time.Chronology chronology9 = property7.getChronology();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Jan 01 07:00:00 ICT 1");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
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
        org.joda.time.LocalDate.Property property19 = localDate18.centuryOfEra();
        org.joda.time.Chronology chronology20 = localDate18.getChronology();
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
        org.junit.Assert.assertNotNull(chronology20);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        boolean boolean6 = property5.isLeap();
        java.util.Locale locale7 = null;
        int int8 = property5.getMaximumTextLength(locale7);
        java.util.Locale locale9 = null;
        int int10 = property5.getMaximumTextLength(locale9);
        org.joda.time.LocalDateTime localDateTime12 = property5.addWrapFieldToCopy((int) (short) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property5.getFieldType();
        java.lang.String str14 = property5.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Property[year]" + "'", str14, "Property[year]");
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        java.lang.String str3 = property2.toString();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDateTime5.toDateTime(dateTimeZone6);
        int int8 = property2.getDifference((org.joda.time.ReadableInstant) dateTime7);
        java.util.Locale locale9 = null;
        int int10 = property2.getMaximumShortTextLength(locale9);
        org.joda.time.LocalDateTime localDateTime11 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) '4');
        int int14 = localDateTime13.getYearOfEra();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime17 = property15.addToCopy((int) '4');
        org.joda.time.Chronology chronology18 = property15.getChronology();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.minusHours((-1));
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusWeeks(52);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusMillis(8);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime11.withFields((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime11.minusMonths((-1790557193));
        int int31 = localDateTime30.getHourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[centuryOfEra]" + "'", str3, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate9 = localDate0.withPeriodAdded(readablePeriod7, (int) (short) -1);
        org.joda.time.LocalDate.Property property10 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate12 = property10.addToCopy(28);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = localDate12.getValue(54022458);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 54022458");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 25);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withSecondOfMinute(10);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) '4');
        int int7 = localDateTime6.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime14 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        int int16 = localDateTime13.indexOf(dateTimeFieldType15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.plus(readableDuration17);
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
        int int34 = localDateTime29.getValue(2);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime29.plusMonths(2);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = property37.getFieldType();
        org.joda.time.LocalDateTime.Property property39 = localDateTime18.property(dateTimeFieldType38);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) '4');
        int int42 = localDateTime41.getYearOfEra();
        org.joda.time.LocalDateTime.Property property43 = localDateTime41.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime45 = property43.addToCopy((int) '4');
        int int46 = localDateTime45.getEra();
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.plus(readableDuration47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime45.plusMillis(0);
        int int52 = localDateTime45.getValue(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = localDateTime45.getFieldType(2);
        int int55 = localDateTime18.get(dateTimeFieldType54);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime57 = localDateTime3.withField(dateTimeFieldType54, 251980);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 251980 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1970 + "'", int21 == 1970);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1970 + "'", int42 == 1970);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        java.lang.String str9 = localDateTime7.toString();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.plusYears(9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withEra(743);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 743 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01T07:00:00.000" + "'", str9, "1970-01-01T07:00:00.000");
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        org.joda.time.LocalDate localDate9 = localDate6.withDayOfWeek(3);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
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
        org.joda.time.LocalDate localDate17 = property15.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTime dateTime18 = localDate17.toDateTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate17.toDateTimeAtStartOfDay(dateTimeZone19);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        java.lang.String str3 = property2.toString();
        int int4 = property2.getLeapAmount();
        java.lang.String str5 = property2.toString();
        org.joda.time.LocalDateTime localDateTime7 = property2.setCopy(7);
        int int8 = property2.getMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[centuryOfEra]" + "'", str3, "Property[centuryOfEra]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Property[centuryOfEra]" + "'", str5, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2922789 + "'", int8 == 2922789);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        java.lang.String str8 = localDate6.toString("333");
        org.joda.time.LocalDate.Property property9 = localDate6.dayOfWeek();
        java.lang.String str10 = property9.getAsShortText();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "333" + "'", str8, "333");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u0e1e\u0e24." + "'", str10, "\u0e1e\u0e24.");
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        int int6 = localDateTime1.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.year();
        org.joda.time.LocalDateTime localDateTime9 = property7.addWrapFieldToCopy(0);
        org.joda.time.Chronology chronology10 = property7.getChronology();
        long long11 = property7.remainder();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 25200052L + "'", long11 == 25200052L);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
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
        java.util.Locale locale13 = null;
        int int14 = property7.getMaximumShortTextLength(locale13);
        org.joda.time.LocalDate localDate15 = property7.getLocalDate();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "271" + "'", str9, "271");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
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
        org.joda.time.LocalDateTime.Property property22 = localDateTime9.weekyear();
        org.joda.time.DurationField durationField23 = property22.getRangeDurationField();
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
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNull(durationField23);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        java.util.Locale locale11 = null;
        java.lang.String str12 = localDate9.toString("271", locale11);
        org.joda.time.LocalDate.Property property13 = localDate9.weekyear();
        long long14 = property13.remainder();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "271" + "'", str12, "271");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 23673600000L + "'", long14 == 23673600000L);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
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
        long long15 = property14.getMillis();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1952121600000L + "'", long15 == 1952121600000L);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime localDateTime5 = property3.setCopy("271");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withDate(40, 119, (-1790557199));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 119 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
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
        org.joda.time.LocalDate.Property property14 = localDate10.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = property14.setCopy("era");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"era\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
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
        org.joda.time.LocalDateTime.Property property19 = localDateTime16.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = localDateTime16.withTime(999, 1964, 365, 50);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for hourOfDay must be in the range [0,23]");
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
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        org.joda.time.DurationFieldType durationFieldType11 = null;
        boolean boolean12 = localDateTime5.isSupported(durationFieldType11);
        int int13 = localDateTime5.getDayOfWeek();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withYear(4);
        org.joda.time.DateTime dateTime14 = localDateTime7.toDateTime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
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
        java.lang.String str27 = localDate19.toString("2001");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2001" + "'", str27, "2001");
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        int int12 = localDateTime11.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.minusSeconds(999);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = localDateTime15.withTime(100, 0, 242, 14431826);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
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
        org.joda.time.LocalTime localTime13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate12.toDateTime(localTime13, dateTimeZone14);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1790553600000L + "'", long9 == 1790553600000L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-09-28" + "'", str10, "2026-09-28");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
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
        org.joda.time.LocalDate localDate13 = localDate10.plusDays(32);
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localDate10.getFields();
        int int15 = localDate10.getWeekyear();
        org.joda.time.LocalDate localDate17 = localDate10.plusMonths(119);
        org.joda.time.LocalDate localDate19 = localDate17.plusMonths(119);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Oct 04 00:00:00 ICT 2");
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate6 = property4.addToCopy(10);
        org.joda.time.LocalDate localDate8 = property4.addToCopy(1970);
        long long9 = property4.getMillis();
        java.lang.String str10 = property4.getAsShortText();
        org.joda.time.LocalDate localDate11 = property4.roundCeilingCopy();
        org.joda.time.LocalDate localDate12 = property4.roundCeilingCopy();
        java.lang.String str13 = property4.getName();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "weekOfWeekyear" + "'", str13, "weekOfWeekyear");
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
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
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate17 = localDate14.withPeriodAdded(readablePeriod15, (int) (byte) -1);
        java.lang.String str18 = localDate17.toString();
        org.joda.time.LocalDate localDate20 = localDate17.minusWeeks(28);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-09-28" + "'", str18, "1970-09-28");
        org.junit.Assert.assertNotNull(localDate20);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight10 = localDate9.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate9.toDateTimeAtCurrentTime(dateTimeZone11);
        int int13 = localDate9.getDayOfMonth();
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localDate9.getFields();
        int int15 = localDate9.getMonthOfYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 28 + "'", int13 == 28);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.DurationField durationField4 = property3.getDurationField();
        java.lang.String str5 = property3.getAsShortText();
        org.joda.time.LocalDateTime localDateTime6 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMillis(2001);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 2026, dateTimeZone11);
        int[] intArray13 = localDate12.getValues();
        org.joda.time.LocalDate.Property property14 = localDate12.weekOfWeekyear();
        org.joda.time.LocalDate localDate16 = property14.addToCopy(10);
        org.joda.time.LocalDate localDate18 = property14.addWrapFieldToCopy(2007);
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDate localDate23 = localDate20.withPeriodAdded(readablePeriod21, (int) (byte) -1);
        org.joda.time.LocalDate localDate25 = localDate20.plusWeeks(0);
        org.joda.time.LocalDate localDate27 = localDate25.withYear((int) ' ');
        org.joda.time.LocalDate localDate29 = localDate25.withYearOfCentury((int) (byte) 1);
        int int30 = localDate25.getDayOfMonth();
        int int31 = localDate25.getDayOfMonth();
        org.joda.time.LocalDate.Property property32 = localDate25.yearOfCentury();
        org.joda.time.LocalDate localDate34 = localDate25.plusMonths((int) '4');
        org.joda.time.Chronology chronology35 = localDate25.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = localDate18.getField(0, chronology35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField37 = localDateTime6.getField(32, chronology35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 28 + "'", int30 == 28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 28 + "'", int31 == 28);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = localDate0.indexOf(dateTimeFieldType5);
        org.joda.time.LocalDate localDate8 = localDate0.withWeekyear((int) (byte) -1);
        org.joda.time.LocalDate localDate10 = localDate0.withWeekOfWeekyear((int) (short) 10);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
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
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) '4');
        int int22 = localDateTime21.getYearOfEra();
        org.joda.time.LocalDateTime.Property property23 = localDateTime21.minuteOfHour();
        int int24 = property23.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime26 = property23.addWrapFieldToCopy((int) 'a');
        org.joda.time.Interval interval27 = property23.toInterval();
        java.util.Locale locale29 = null;
        org.joda.time.LocalDateTime localDateTime30 = property23.setCopy("9", locale29);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone32);
        org.joda.time.DateTimeField[] dateTimeFieldArray34 = localDateTime33.getFields();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.minusDays(59);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime30.withFields((org.joda.time.ReadablePartial) localDateTime36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime30.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime39 = property38.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = property38.getFieldType();
        boolean boolean41 = localDateTime19.isSupported(dateTimeFieldType40);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime19.withYear(271);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1970 + "'", int22 == 1970);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 59 + "'", int24 == 59);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(dateTimeFieldArray34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(localDateTime43);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
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
        org.joda.time.LocalTime localTime16 = null;
        org.joda.time.DateTime dateTime17 = localDate0.toDateTime(localTime16);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
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
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) '4');
        int int21 = localDateTime20.getYearOfEra();
        org.joda.time.LocalDateTime.Property property22 = localDateTime20.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime24 = property22.addToCopy((int) '4');
        int int25 = localDateTime24.getEra();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.plus(readableDuration26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusWeeks(10);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime27.withDayOfYear(4);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusSeconds(0);
        int int37 = localDateTime34.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) '4');
        int int40 = localDateTime39.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property41 = localDateTime39.dayOfYear();
        org.joda.time.LocalDateTime.Property property42 = localDateTime39.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime43 = property42.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property42.getFieldType();
        int int45 = localDateTime34.indexOf(dateTimeFieldType44);
        org.joda.time.LocalDateTime.Property property46 = localDateTime31.property(dateTimeFieldType44);
        org.joda.time.DateTimeField dateTimeField47 = property46.getField();
        org.joda.time.LocalDateTime.Property property48 = new org.joda.time.LocalDateTime.Property(localDateTime18, dateTimeField47);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1970 + "'", int21 == 1970);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(dateTimeField47);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
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
        int int15 = localDate13.getYearOfCentury();
        int int16 = localDate13.size();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 26 + "'", int15 == 26);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
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
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) '4');
        int int34 = localDateTime33.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime33.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime41 = localDateTime33.withFields((org.joda.time.ReadablePartial) localDateTime40);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = null;
        int int43 = localDateTime40.indexOf(dateTimeFieldType42);
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.LocalDateTime localDateTime45 = localDateTime40.plus(readableDuration44);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((long) '4');
        int int48 = localDateTime47.getYearOfEra();
        org.joda.time.LocalDateTime.Property property49 = localDateTime47.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime51 = property49.addToCopy((int) '4');
        int int52 = localDateTime51.getEra();
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.LocalDateTime localDateTime54 = localDateTime51.plus(readableDuration53);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime51.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.LocalDateTime localDateTime59 = localDateTime56.withDurationAdded(readableDuration57, 0);
        int int61 = localDateTime56.getValue(2);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime56.plusMonths(2);
        org.joda.time.LocalDateTime.Property property64 = localDateTime63.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = property64.getFieldType();
        org.joda.time.LocalDateTime.Property property66 = localDateTime45.property(dateTimeFieldType65);
        org.joda.time.LocalDateTime.Property property67 = localDateTime5.property(dateTimeFieldType65);
        int int68 = localDateTime5.getMillisOfSecond();
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1970 + "'", int48 == 1970);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(dateTimeFieldType65);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 52 + "'", int68 == 52);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
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
        long long19 = localDate15.getLocalMillis();
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-61133961600000L) + "'", long19 == (-61133961600000L));
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDateTime8.toDateTime(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minusHours((int) 'a');
        java.util.Locale locale10 = null;
        java.lang.String str11 = localDateTime8.toString("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21", locale10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime8.era();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21" + "'", str11, "\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21");
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
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
        org.joda.time.LocalDateTime localDateTime14 = property13.roundHalfFloorCopy();
        org.joda.time.DurationFieldType durationFieldType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withFieldAdded(durationFieldType15, 269);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 70 + "'", int12 == 70);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
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
        org.joda.time.LocalDate.Property property21 = localDate20.weekyear();
        org.joda.time.DurationFieldType durationFieldType22 = null;
        boolean boolean23 = localDate20.isSupported(durationFieldType22);
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
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
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
        long long17 = property16.remainder();
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) '4');
        int int3 = localDateTime2.getYearOfEra();
        org.joda.time.LocalDateTime.Property property4 = localDateTime2.minuteOfHour();
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.era();
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.hourOfDay();
        int int7 = localDateTime2.getYear();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withLocalMillis((long) 28320052);
        org.joda.time.Chronology chronology12 = localDateTime11.getChronology();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime2, chronology12);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 9, chronology12);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology12);
        long long17 = localDateTime16.getLocalMillis();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1970 + "'", int7 == 1970);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky "6) test3782(org.joda.time.RegressionTest7)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1790582432254L + "'", long17 == 1790582432254L);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("2026");
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime7 = property5.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) '4');
        int int10 = localDateTime9.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.dayOfYear();
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime13 = property12.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = property12.getFieldType();
        int int15 = localDateTime7.get(dateTimeFieldType14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime1.property(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
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
        org.joda.time.LocalDateTime localDateTime18 = localDateTime10.minusWeeks((int) (short) -1);
        java.util.Date date19 = localDateTime10.toDate();
        int int20 = localDateTime10.getWeekyear();
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
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 07:52:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfWeek();
        long long4 = property3.remainder();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property3.getAsText(locale5);
        org.joda.time.Interval interval7 = property3.toInterval();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 25200052L + "'", long4 == 25200052L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35" + "'", str6, "\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35");
        org.junit.Assert.assertNotNull(interval7);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime6 = property3.roundFloorCopy();
        java.lang.String str7 = property3.getAsShortText();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
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
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) '4');
        int int19 = localDateTime18.getYear();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.minusYears(14);
        org.joda.time.LocalDateTime.Property property22 = localDateTime18.minuteOfHour();
        boolean boolean23 = localDateTime9.isAfter((org.joda.time.ReadablePartial) localDateTime18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
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
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate17 = localDate14.withPeriodAdded(readablePeriod15, (int) (byte) -1);
        org.joda.time.LocalDate localDate19 = localDate14.plusWeeks(0);
        org.joda.time.LocalDate localDate21 = localDate19.withYear((int) ' ');
        org.joda.time.LocalDate.Property property22 = localDate19.monthOfYear();
        org.joda.time.LocalDate.Property property23 = localDate19.year();
        org.joda.time.LocalDate.Property property24 = localDate19.dayOfMonth();
        org.joda.time.LocalDate localDate25 = property24.roundCeilingCopy();
        org.joda.time.LocalDate localDate27 = localDate25.plusWeeks(12);
        org.joda.time.DateTime dateTime28 = localDate27.toDateTimeAtStartOfDay();
        org.joda.time.DateTime dateTime29 = localDate27.toDateTimeAtStartOfDay();
        boolean boolean30 = property11.equals((java.lang.Object) dateTime29);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
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
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusMinutes(1970);
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
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.era();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        java.lang.String str6 = property3.getAsString();
        org.joda.time.LocalDateTime localDateTime7 = property3.withMaximumValue();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        org.joda.time.LocalDateTime localDateTime10 = property8.addToCopy((long) 242);
        org.joda.time.LocalDateTime localDateTime11 = property8.getLocalDateTime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
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
        int int13 = localDate0.size();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        int int10 = localDate5.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight11 = localDate5.toDateMidnight();
        org.joda.time.LocalDate.Property property12 = localDate5.year();
        org.joda.time.LocalDate localDate14 = property12.addWrapFieldToCopy(25200000);
        org.joda.time.LocalDate localDate16 = localDate14.plusMonths((-292275054));
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate19 = localDate17.minusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        org.joda.time.LocalDate localDate22 = localDate19.withEra(0);
        org.joda.time.LocalDate localDate24 = localDate22.minusWeeks((int) (byte) 1);
        int int25 = localDate14.compareTo((org.joda.time.ReadablePartial) localDate24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = localDate24.toDateMidnight(dateTimeZone26);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 28 + "'", int10 == 28);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(dateMidnight27);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
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
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.minusYears(40);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime14.withMillisOfSecond(743);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = localDateTime14.toString(dateTimeFormatter21);
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
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1964-06-09T07:52:00.052" + "'", str22, "1964-06-09T07:52:00.052");
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeZone2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy(0L);
        int int8 = localDateTime7.getSecondOfMinute();
        int int9 = localDateTime7.getYearOfEra();
        org.joda.time.Chronology chronology10 = localDateTime7.getChronology();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusWeeks(39);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky "7) test3795(org.joda.time.RegressionTest7)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2026 + "'", int9 == 2026);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
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
        int int18 = localDateTime16.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property19 = localDateTime16.era();
        org.joda.time.DurationFieldType durationFieldType20 = null;
        boolean boolean21 = localDateTime16.isSupported(durationFieldType20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        int int6 = localDateTime1.getMonthOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = localDateTime1.toString(dateTimeFormatter7);
        int int9 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withMillisOfSecond(40);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withTime((int) (short) 10, 242, 50, 14403717);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 242 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01T07:00:00.052" + "'", str8, "1970-01-01T07:00:00.052");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.yearOfCentury();
        int int8 = localDateTime5.getDayOfYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears((int) (byte) -1);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readableDuration12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withYearOfCentury(99);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.minusDays((int) 'a');
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.era();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
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
        org.joda.time.LocalDate localDate26 = localDate24.withYearOfEra(269);
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
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
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
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.centuryOfEra();
        int int19 = property18.getMaximumValue();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2922789 + "'", int19 == 2922789);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 32);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.weekOfWeekyear();
        long long3 = property2.getMillis();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25200032L + "'", long3 == 25200032L);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        int int5 = localDateTime1.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withDayOfWeek(68);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 68 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusMonths((int) ' ');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusDays(70);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withDurationAdded(readableDuration12, 26340000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime7 = property3.addWrapFieldToCopy((int) '#');
        org.joda.time.LocalDateTime localDateTime9 = property3.addToCopy((long) 31);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plus(readablePeriod10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusMonths((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withLocalMillis(1580400052L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
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
        org.joda.time.LocalDate.Property property15 = localDate7.yearOfEra();
        java.util.Locale locale16 = null;
        int int17 = property15.getMaximumTextLength(locale16);
        java.lang.String str18 = property15.getAsString();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2032" + "'", str18, "2032");
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
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
        org.joda.time.LocalDateTime.Property property31 = localDateTime9.millisOfDay();
        int int32 = property31.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime33 = property31.roundHalfCeilingCopy();
        org.joda.time.DurationFieldType durationFieldType34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withFieldAdded(durationFieldType34, 54022458);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(localDateTime33);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        boolean boolean6 = property4.equals((java.lang.Object) 70);
        org.joda.time.LocalDateTime localDateTime7 = property4.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = property4.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime9 = property4.roundCeilingCopy();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1799020800000L);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
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
        org.joda.time.Interval interval27 = localDate26.toInterval();
        org.joda.time.LocalTime localTime28 = null;
        org.joda.time.DateTime dateTime29 = localDate26.toDateTime(localTime28);
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
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(dateTime29);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
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
        org.joda.time.LocalDateTime localDateTime44 = property42.addToCopy(2001);
        org.joda.time.DurationField durationField45 = property42.getDurationField();
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
        org.junit.Assert.assertNotNull(durationField45);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
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
        org.joda.time.Chronology chronology15 = localDate5.getChronology();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology15);
        org.joda.time.LocalTime localTime17 = null;
        org.joda.time.DateTime dateTime18 = localDate16.toDateTime(localTime17);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 28 + "'", int10 == 28);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 28 + "'", int11 == 28);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDateTime1.toDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.era();
        org.joda.time.DateTimeField dateTimeField6 = property5.getField();
        org.joda.time.DurationField durationField7 = property5.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property5.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfWeek();
        long long4 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime5 = property3.withMaximumValue();
        org.joda.time.Interval interval6 = property3.toInterval();
        org.joda.time.LocalDateTime localDateTime7 = property3.getLocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minus(readablePeriod8);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 25200052L + "'", long4 == 25200052L);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime7 = property3.addWrapFieldToCopy((int) '#');
        org.joda.time.LocalDateTime localDateTime9 = property3.addToCopy((long) 31);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plus(readablePeriod10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusMonths((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) '4');
        int int16 = localDateTime15.getYearOfEra();
        org.joda.time.LocalDateTime.Property property17 = localDateTime15.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime19 = property17.addToCopy((int) '4');
        int int20 = localDateTime19.getEra();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.plus(readableDuration21);
        int int23 = localDateTime19.getSecondOfMinute();
        int int24 = localDateTime13.compareTo((org.joda.time.ReadablePartial) localDateTime19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1970 + "'", int16 == 1970);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.DurationField durationField4 = property3.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.yearOfEra();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusHours(20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
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
        java.util.Date date16 = localDate7.toDate();
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
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Feb 19 00:00:00 ICT 2032");
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("5232-02-19", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
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
        org.joda.time.LocalDate localDate16 = property15.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate19 = localDate16.withPeriodAdded(readablePeriod17, 4);
        long long20 = localDate19.getLocalMillis();
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
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1001635200000L + "'", long20 == 1001635200000L);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
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
        org.joda.time.DurationField durationField14 = property13.getDurationField();
        java.lang.String str15 = property13.toString();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Property[weekyear]" + "'", str15, "Property[weekyear]");
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(2026);
        org.joda.time.DateMidnight dateMidnight12 = localDate11.toDateMidnight();
        org.joda.time.LocalDate localDate14 = localDate11.plusDays(2032);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
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
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.weekOfWeekyear();
        java.util.Locale locale14 = null;
        int int15 = property13.getMaximumTextLength(locale14);
        long long16 = property13.getMillis();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9223371987087600052L + "'", long16 == 9223371987087600052L);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        java.lang.String str8 = property7.getAsText();
        org.joda.time.LocalDate localDate9 = property7.withMinimumValue();
        org.joda.time.LocalDate localDate10 = property7.withMaximumValue();
        org.joda.time.LocalDate localDate11 = property7.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026" + "'", str8, "2026");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
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
        org.joda.time.LocalDate localDate18 = localDate0.withDayOfYear((int) '4');
        org.joda.time.LocalDate.Property property19 = localDate18.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate21 = localDate18.withWeekOfWeekyear(36526);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36526 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
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
        org.joda.time.LocalDateTime localDateTime11 = property8.withMinimumValue();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.era();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
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
        org.joda.time.LocalDateTime localDateTime23 = property22.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusHours(999);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minus(readableDuration26);
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
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        java.lang.String str3 = property2.toString();
        int int4 = property2.getLeapAmount();
        java.lang.String str5 = property2.toString();
        org.joda.time.LocalDateTime localDateTime7 = property2.setCopy(7);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minus(readableDuration8);
        java.lang.Object obj10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(obj10, dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) '4');
        int int15 = localDateTime14.getYearOfEra();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime18 = property16.addToCopy((int) '4');
        int int19 = localDateTime18.getEra();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.plus(readableDuration20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusWeeks(10);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusDays((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusMonths(9);
        org.joda.time.LocalDateTime.Property property28 = localDateTime25.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = property28.getFieldType();
        int int30 = localDateTime12.indexOf(dateTimeFieldType29);
        boolean boolean31 = localDateTime7.isSupported(dateTimeFieldType29);
        org.joda.time.DateTimeField[] dateTimeFieldArray32 = localDateTime7.getFields();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[centuryOfEra]" + "'", str3, "Property[centuryOfEra]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Property[centuryOfEra]" + "'", str5, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldArray32);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(2026);
        org.joda.time.LocalDate localDate13 = localDate11.plusWeeks(19);
        org.joda.time.LocalDate localDate15 = localDate11.withWeekOfWeekyear(4);
        org.joda.time.LocalDate localDate17 = localDate15.withCenturyOfEra(324);
        int int18 = localDate15.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate15.toDateTimeAtMidnight(dateTimeZone19);
        java.util.Locale locale22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = localDate15.toString("1970-01-01T00:00:00.100", locale22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
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
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 25 + "'", int18 == 25);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.weekyear();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = property7.getDifference(readableInstant8);
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate13 = localDate10.withPeriodAdded(readablePeriod11, (int) (byte) -1);
        org.joda.time.LocalDate localDate15 = localDate10.plusWeeks(0);
        org.joda.time.LocalDate localDate17 = localDate15.withYear((int) ' ');
        org.joda.time.LocalDate localDate19 = localDate17.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property20 = localDate19.weekOfWeekyear();
        int int21 = localDate19.getWeekyear();
        org.joda.time.LocalDate.Property property22 = localDate19.weekyear();
        org.joda.time.DateTime dateTime23 = localDate19.toDateTimeAtStartOfDay();
        boolean boolean24 = property7.equals((java.lang.Object) dateTime23);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeZone2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.weekyear();
        int int6 = localDateTime4.getYearOfEra();
        int int7 = localDateTime4.getHourOfDay();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.plus(readablePeriod8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = localDateTime9.toString(dateTimeFormatter10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.yearOfEra();
        int int13 = localDateTime9.getDayOfMonth();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2026 + "'", int6 == 2026);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky "8) test3830(org.joda.time.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-09-28T15:00:32.598" + "'", str11, "2026-09-28T15:00:32.598");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 28 + "'", int13 == 28);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusDays((-1));
        org.joda.time.LocalDateTime.Property property8 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minusHours(3);
        org.joda.time.Chronology chronology12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField13 = localDateTime10.getField(21600052, chronology12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 21600052");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate6 = localDate2.minusDays((int) '#');
        org.joda.time.LocalTime localTime7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate2.toDateTime(localTime7, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate2.withLocalMillis((long) 58);
        int[] intArray12 = localDate2.getValues();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1970, 1, 1 });
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
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
        java.util.Locale locale18 = null;
        java.lang.String str19 = property17.getAsText(locale18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property17.getFieldType();
        int int21 = property17.getMaximumValue();
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
// flaky "9) test3833(org.joda.time.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u0e04\u0e28." + "'", str19, "\u0e04\u0e28.");
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate localDate8 = localDate0.plusYears((int) (short) 1);
        int int9 = localDate0.getWeekyear();
        int int10 = localDate0.getWeekyear();
        int int11 = localDate0.getYearOfEra();
        org.joda.time.Chronology chronology12 = localDate0.getChronology();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2026 + "'", int9 == 2026);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2026 + "'", int10 == 2026);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2026 + "'", int11 == 2026);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime(dateTimeZone8);
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        int int11 = property3.getMinimumValue();
        int int12 = property3.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime13 = property3.roundHalfCeilingCopy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 420L + "'", long10 == 420L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
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
        org.joda.time.LocalDate.Property property27 = localDate24.weekyear();
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
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYear();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        long long4 = property3.remainder();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
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
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime18.withPeriodAdded(readablePeriod22, 0);
        java.lang.String str25 = localDateTime24.toString();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.plusMillis(743);
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
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01T07:51:59.952" + "'", str25, "1970-01-01T07:51:59.952");
        org.junit.Assert.assertNotNull(localDateTime27);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate6 = property4.addToCopy(10);
        org.joda.time.LocalDate localDate8 = property4.addToCopy(1970);
        int int9 = localDate8.getYearOfEra();
        org.joda.time.LocalDate.Property property10 = localDate8.weekOfWeekyear();
        org.joda.time.LocalDate localDate11 = property10.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate13 = localDate11.plusWeeks(743);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2007 + "'", int9 == 2007);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((java.lang.Object) 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate8 = property7.withMaximumValue();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property7.getAsText(locale9);
        int int11 = property7.getMaximumValue();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "271" + "'", str10, "271");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 365 + "'", int11 == 365);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
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
        org.joda.time.LocalDateTime localDateTime20 = localDateTime14.withMillisOfDay(985);
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
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        int int23 = localDateTime21.indexOf(dateTimeFieldType22);
        java.lang.String str24 = localDateTime21.toString();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime21.plusHours(5701010);
        int int27 = localDateTime26.getDayOfMonth();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01T07:00:00.052" + "'", str24, "1970-01-01T07:00:00.052");
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withYear(4);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withDurationAdded(readableDuration14, 19);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) '4');
        int int20 = localDateTime19.getYearOfEra();
        org.joda.time.LocalDateTime.Property property21 = localDateTime19.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime23 = property21.addToCopy((int) '4');
        org.joda.time.Chronology chronology24 = property21.getChronology();
        java.util.Locale locale25 = null;
        java.lang.String str26 = property21.getAsShortText(locale25);
        org.joda.time.LocalDateTime localDateTime27 = property21.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) '4');
        int int31 = localDateTime30.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime30.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime38 = localDateTime30.withFields((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) '4');
        int int41 = localDateTime40.getYearOfEra();
        org.joda.time.LocalDateTime.Property property42 = localDateTime40.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime44 = property42.addToCopy((int) '4');
        org.joda.time.Chronology chronology45 = property42.getChronology();
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime30, chronology45);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(chronology45);
        org.joda.time.DateTimeField dateTimeField48 = localDateTime27.getField(0, chronology45);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField49 = localDateTime13.getField(36, chronology45);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 36");
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
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1970 + "'", int41 == 1970);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTimeField48);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeZone2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.weekyear();
        org.joda.time.LocalDateTime localDateTime7 = property5.setCopy(3);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMillis(12);
        long long7 = localDateTime6.getLocalMillis();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours(2027);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.plusDays(86399999);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1580400064L + "'", long7 == 1580400064L);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate5.withPeriodAdded(readablePeriod6, 0);
        org.joda.time.LocalDate.Property property9 = localDate8.yearOfEra();
        org.joda.time.LocalDate localDate10 = property9.withMinimumValue();
        java.util.Date date11 = localDate10.toDate();
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.fromDateFields(date11);
        org.joda.time.LocalDate localDate14 = localDate12.withCenturyOfEra((int) (short) 100);
        org.joda.time.LocalDate.Property property15 = localDate14.monthOfYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Sep 28 00:00:00 ICT 1");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        java.lang.String str6 = property3.getAsString();
        org.joda.time.LocalDateTime localDateTime7 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime8 = property3.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime9 = property3.roundHalfCeilingCopy();
        int int10 = localDateTime9.getDayOfWeek();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
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
        org.joda.time.LocalDate localDate17 = localDate15.withWeekOfWeekyear(6);
        org.joda.time.LocalDate.Property property18 = localDate15.era();
        org.joda.time.LocalDate localDate20 = localDate15.minusDays(652);
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
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDate20);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, (-1));
        org.joda.time.LocalDate localDate10 = localDate8.withLocalMillis((long) 5);
        org.joda.time.LocalDate localDate12 = localDate10.withMonthOfYear(5);
        int int13 = localDate12.getYearOfCentury();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate16 = localDate14.minusDays(7);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate19 = localDate16.withPeriodAdded(readablePeriod17, 28320052);
        org.joda.time.LocalDate.Property property20 = localDate19.monthOfYear();
        org.joda.time.LocalDate localDate21 = localDate12.withFields((org.joda.time.ReadablePartial) localDate19);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 70 + "'", int13 == 70);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDate21);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
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
        org.joda.time.LocalDateTime localDateTime15 = property13.addWrapFieldToCopy(2);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withPeriodAdded(readablePeriod16, 25200010);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01T07:00:00.052" + "'", str12, "1970-01-01T07:00:00.052");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
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
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = localDate15.toDateMidnight(dateTimeZone19);
        org.joda.time.LocalDate localDate22 = localDate15.minusYears(0);
        int int23 = localDate22.getDayOfMonth();
        org.joda.time.DateTime dateTime24 = localDate22.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDate localDate26 = localDate22.minus(readablePeriod25);
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
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 28 + "'", int23 == 28);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(localDate26);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
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
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((java.lang.Object) localDate0);
        org.joda.time.DurationFieldType durationFieldType16 = null;
        boolean boolean17 = localDate15.isSupported(durationFieldType16);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        java.util.Date date6 = localDateTime1.toDate();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.plusDays(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusMillis(365);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusMinutes(365);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        org.joda.time.LocalDateTime.Property property10 = localDateTime5.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime5.withSecondOfMinute((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        java.lang.String str7 = localDateTime6.toString();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) '4');
        int int10 = localDateTime9.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime17 = localDateTime9.withFields((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) '4');
        int int20 = localDateTime19.getYearOfEra();
        org.joda.time.LocalDateTime.Property property21 = localDateTime19.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime23 = property21.addToCopy((int) '4');
        org.joda.time.Chronology chronology24 = property21.getChronology();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime9, chronology24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withWeekOfWeekyear((int) '4');
        boolean boolean28 = localDateTime6.equals((java.lang.Object) localDateTime27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime30 = localDateTime6.withHourOfDay((-1790557228));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1790557228 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0035-01-04T07:00:00.052" + "'", str7, "0035-01-04T07:00:00.052");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.withDurationAdded(readableDuration9, 50);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfMonth();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime9 = property7.addWrapFieldToCopy(11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType11 = localDateTime9.getFieldType(67);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 67");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType19 = localDateTime15.getFieldType(2037);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2037");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        java.lang.String str9 = property8.getName();
        org.joda.time.LocalDateTime localDateTime11 = property8.setCopy((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusHours(32);
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = localDateTime13.toString("", locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "dayOfMonth" + "'", str9, "dayOfMonth");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = localDateTime4.getFields();
        int int7 = localDateTime4.getValue((int) (short) 1);
        int int8 = localDateTime4.getYearOfEra();
        org.joda.time.DurationFieldType durationFieldType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime4.withFieldAdded(durationFieldType9, 1980);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
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
        java.util.Date date19 = localDateTime18.toDate();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localDateTime18.toDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) '4');
        int int24 = localDateTime23.getYearOfEra();
        org.joda.time.LocalDateTime.Property property25 = localDateTime23.minuteOfHour();
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray27 = localDateTime23.getFieldTypes();
        org.joda.time.LocalDateTime.Property property28 = localDateTime23.secondOfMinute();
        org.joda.time.LocalDateTime.Property property29 = localDateTime23.monthOfYear();
        org.joda.time.Chronology chronology30 = property29.getChronology();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime18, chronology30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.era();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Tue Jan 05 00:00:00 ICT 12");
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1970 + "'", int24 == 1970);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(property32);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusYears(12);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusMonths(1969);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYearOfCentury(52);
        int int10 = localDateTime7.getEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate6 = property4.addToCopy(10);
        org.joda.time.LocalDate localDate8 = property4.addToCopy(1970);
        long long9 = property4.getMillis();
        java.lang.String str10 = property4.getAsShortText();
        org.joda.time.LocalDate localDate11 = property4.roundCeilingCopy();
        org.joda.time.LocalDate localDate12 = property4.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = localDate12.withYearOfCentury((-3205));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3205 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
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
        org.joda.time.Chronology chronology14 = localDate11.getChronology();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.LocalDate localDate17 = localDate15.withCenturyOfEra(1964);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
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
        java.lang.String str15 = property13.getName();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "era" + "'", str15, "era");
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
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
        org.joda.time.LocalDate.Property property16 = localDate13.weekyear();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate13.minus(readablePeriod17);
        org.joda.time.LocalDate.Property property19 = localDate13.dayOfWeek();
        org.joda.time.DurationFieldType durationFieldType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate22 = localDate13.withFieldAdded(durationFieldType20, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) '4');
        int int3 = localDateTime2.getYearOfEra();
        org.joda.time.LocalDateTime.Property property4 = localDateTime2.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime6 = property4.addToCopy((int) '4');
        org.joda.time.Chronology chronology7 = property4.getChronology();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property4.getAsShortText(locale8);
        org.joda.time.LocalDateTime localDateTime10 = property4.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) '4');
        int int13 = localDateTime12.getYearOfEra();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime16 = property14.addToCopy((int) '4');
        org.joda.time.Chronology chronology17 = property14.getChronology();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now(chronology17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withDurationAdded(readableDuration19, 53);
        boolean boolean22 = localDateTime10.equals((java.lang.Object) localDateTime18);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime18.minusMillis(100);
        org.joda.time.Chronology chronology25 = localDateTime24.getChronology();
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now(chronology25);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(chronology25);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(1L, chronology25);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(chronology25);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withMinuteOfHour(58);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime31);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundHalfFloorCopy();
        int int6 = localDateTime5.getDayOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.centuryOfEra();
        java.lang.String str8 = property7.getAsShortText();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
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
        org.joda.time.LocalDate localDate29 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDate localDate32 = localDate29.withPeriodAdded(readablePeriod30, (int) (byte) -1);
        org.joda.time.LocalDate localDate34 = localDate29.plusWeeks(0);
        org.joda.time.LocalDate localDate36 = localDate34.withYear((int) ' ');
        org.joda.time.LocalDate localDate38 = localDate36.minusDays((int) (short) 0);
        java.util.Locale locale40 = null;
        java.lang.String str41 = localDate38.toString("271", locale40);
        org.joda.time.DateTime dateTime42 = localDate38.toDateTimeAtMidnight();
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalDate localDate44 = localDate38.plus(readablePeriod43);
        org.joda.time.LocalDate localDate46 = localDate44.minusMonths(20);
        org.joda.time.DateMidnight dateMidnight47 = localDate44.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateMidnight dateMidnight49 = localDate44.toDateMidnight(dateTimeZone48);
        long long50 = property26.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight49);
        org.joda.time.LocalDate localDate51 = property26.withMinimumValue();
        org.joda.time.LocalDate localDate53 = localDate51.minusMonths(100);
        org.joda.time.LocalDate localDate54 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.LocalDate localDate57 = localDate54.withPeriodAdded(readablePeriod55, (int) (byte) -1);
        int int58 = localDate54.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = null;
        int int60 = localDate54.indexOf(dateTimeFieldType59);
        org.joda.time.LocalDate localDate62 = localDate54.withWeekyear((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        org.joda.time.LocalDate localDate65 = localDate54.withPeriodAdded(readablePeriod63, 59);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.DateMidnight dateMidnight67 = localDate54.toDateMidnight(dateTimeZone66);
        org.joda.time.Chronology chronology68 = localDate54.getChronology();
        org.joda.time.LocalDate localDate69 = new org.joda.time.LocalDate(chronology68);
        boolean boolean70 = localDate51.isAfter((org.joda.time.ReadablePartial) localDate69);
        org.joda.time.LocalDate localDate72 = localDate69.minusWeeks(54013758);
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
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "271" + "'", str41, "271");
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertNotNull(dateMidnight47);
        org.junit.Assert.assertNotNull(dateMidnight49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1899030L + "'", long50 == 1899030L);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertNotNull(localDate57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2026 + "'", int58 == 2026);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(localDate62);
        org.junit.Assert.assertNotNull(localDate65);
        org.junit.Assert.assertNotNull(dateMidnight67);
        org.junit.Assert.assertNotNull(chronology68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(localDate72);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        boolean boolean6 = property5.isLeap();
        java.util.Locale locale7 = null;
        int int8 = property5.getMaximumTextLength(locale7);
        java.util.Locale locale9 = null;
        int int10 = property5.getMaximumTextLength(locale9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        org.joda.time.Chronology chronology12 = property5.getChronology();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now(chronology12);
        int int14 = localDateTime13.getSecondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky "10) test3871(org.joda.time.RegressionTest7)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate9 = property7.addWrapFieldToCopy((int) (short) 1);
        org.joda.time.Chronology chronology10 = property7.getChronology();
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now(chronology10);
        int int12 = localDate11.getDayOfWeek();
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate17 = localDate14.withPeriodAdded(readablePeriod15, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight18 = localDate14.toDateMidnight();
        org.joda.time.LocalDate localDate20 = localDate14.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property21 = localDate20.year();
        org.joda.time.Chronology chronology22 = localDate20.getChronology();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((java.lang.Object) "2026", chronology22);
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.now(chronology22);
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now(chronology22);
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.now(chronology22);
        org.joda.time.LocalDate localDate27 = localDate11.withFields((org.joda.time.ReadablePartial) localDate26);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate27);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
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
        org.joda.time.LocalDate.Property property17 = localDate8.dayOfYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.DurationField durationField8 = property7.getDurationField();
        int int9 = property7.getMinimumValue();
        org.joda.time.LocalDate localDate10 = property7.withMaximumValue();
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = property7.setCopy("1970-01-01T07:00:55.000", locale12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970-01-01T07:00:55.000\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
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
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.fromDateFields(date24);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.fromDateFields(date24);
        int int27 = localDateTime26.getMonthOfYear();
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
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
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
        org.joda.time.LocalDateTime localDateTime19 = property17.addWrapFieldToCopy(1980);
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
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusMonths((int) ' ');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusMonths(269);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = localDateTime9.toString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
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
        int int13 = localDate12.getYearOfCentury();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026" + "'", str8, "2026");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        java.lang.Object obj0 = null;
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate1.minus(readablePeriod5);
        org.joda.time.DateTime dateTime7 = localDate6.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate12 = localDate9.withPeriodAdded(readablePeriod10, (int) (byte) -1);
        int int13 = localDate9.getYearOfEra();
        org.joda.time.LocalDate localDate15 = localDate9.plusDays(1970);
        org.joda.time.LocalDate localDate16 = localDate8.withFields((org.joda.time.ReadablePartial) localDate15);
        long long17 = localDate8.getLocalMillis();
        java.lang.String str18 = localDate8.toString();
        int int19 = localDate8.getDayOfMonth();
        org.joda.time.LocalDate localDate20 = localDate6.withFields((org.joda.time.ReadablePartial) localDate8);
        int int21 = localDate6.getDayOfMonth();
        org.joda.time.Chronology chronology22 = localDate6.getChronology();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(obj0, chronology22);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2026 + "'", int13 == 2026);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1790553600000L + "'", long17 == 1790553600000L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2026-09-28" + "'", str18, "2026-09-28");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 28 + "'", int19 == 28);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 28 + "'", int21 == 28);
        org.junit.Assert.assertNotNull(chronology22);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
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
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusMonths(5);
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
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        java.util.Date date12 = localDateTime1.toDate();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) '4');
        int int15 = localDateTime14.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.dayOfYear();
        org.joda.time.LocalDateTime.Property property17 = localDateTime14.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime18 = property17.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property17.getFieldType();
        int int20 = localDateTime1.get(dateTimeFieldType19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime1.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withMillisOfSecond(4);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withPeriodAdded(readablePeriod25, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime27);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        java.lang.String str3 = property2.toString();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDateTime5.toDateTime(dateTimeZone6);
        int int8 = property2.getDifference((org.joda.time.ReadableInstant) dateTime7);
        java.util.Locale locale9 = null;
        int int10 = property2.getMaximumShortTextLength(locale9);
        org.joda.time.LocalDateTime localDateTime11 = property2.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withWeekOfWeekyear(271);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 271 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[centuryOfEra]" + "'", str3, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
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
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.plusWeeks(4);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) '4');
        int int26 = localDateTime25.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime25.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime33 = localDateTime25.withFields((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime25.plusYears((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType36 = null;
        boolean boolean37 = localDateTime35.isSupported(durationFieldType36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime35.plusMillis(70);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime35.minusHours(365);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.plusDays(28320052);
        int int44 = localDateTime17.compareTo((org.joda.time.ReadablePartial) localDateTime41);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime46 = localDateTime41.withMillisOfDay((-1790557193));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1790557193 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate6 = localDate3.withPeriodAdded(readablePeriod4, (int) (byte) -1);
        org.joda.time.LocalDate localDate8 = localDate3.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate11 = localDate3.withPeriodAdded(readablePeriod9, (-1));
        org.joda.time.LocalDate localDate13 = localDate11.withYear(25200052);
        java.lang.String str15 = localDate11.toString("2026");
        org.joda.time.Chronology chronology16 = localDate11.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(28787742, 6, 56, chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 56 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2026" + "'", str15, "2026");
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.LocalDate localDate10 = localDate7.plusDays(5);
        org.joda.time.LocalDate localDate12 = localDate7.withDayOfMonth(28);
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now(chronology13);
        java.lang.String str16 = localDate14.toString("\u0e01\u0e1e.");
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u0e01\u0e1e." + "'", str16, "\u0e01\u0e1e.");
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
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
        int int17 = localDate14.getYearOfEra();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localDateTime2.getFields();
        int int4 = localDateTime2.getYearOfEra();
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1970 + "'", int4 == 1970);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localDateTime2.getFields();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = localDateTime2.toString(dateTimeFormatter4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.LocalDateTime.Property property8 = localDateTime2.year();
        org.joda.time.LocalDateTime localDateTime9 = property8.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField10 = property8.getField();
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T07:00:00.000" + "'", str5, "1970-01-01T07:00:00.000");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
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
        org.joda.time.LocalDate.Property property14 = localDate10.yearOfCentury();
        int int15 = property14.getMaximumValue();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
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
        int int12 = localDateTime10.getMonthOfYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
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
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) '4');
        int int21 = localDateTime20.getYearOfEra();
        org.joda.time.LocalDateTime.Property property22 = localDateTime20.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime24 = property22.addToCopy((int) '4');
        org.joda.time.Chronology chronology25 = property22.getChronology();
        java.util.Locale locale26 = null;
        java.lang.String str27 = property22.getAsShortText(locale26);
        org.joda.time.LocalDateTime localDateTime28 = property22.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) '4');
        int int32 = localDateTime31.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime31.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime39 = localDateTime31.withFields((org.joda.time.ReadablePartial) localDateTime38);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) '4');
        int int42 = localDateTime41.getYearOfEra();
        org.joda.time.LocalDateTime.Property property43 = localDateTime41.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime45 = property43.addToCopy((int) '4');
        org.joda.time.Chronology chronology46 = property43.getChronology();
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime31, chronology46);
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(chronology46);
        org.joda.time.DateTimeField dateTimeField49 = localDateTime28.getField(0, chronology46);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField50 = localDate17.getField(42, chronology46);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 42");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1970 + "'", int21 == 1970);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0" + "'", str27, "0");
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1970 + "'", int42 == 1970);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeField49);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        int int8 = localDate7.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = localDate7.toDateMidnight(dateTimeZone9);
        org.joda.time.Interval interval11 = localDate7.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((java.lang.Object) interval11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.Interval");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(interval11);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate6 = localDate3.withPeriodAdded(readablePeriod4, (int) (byte) -1);
        org.joda.time.LocalDate localDate8 = localDate3.plusWeeks(0);
        org.joda.time.LocalDate localDate10 = localDate8.withYear((int) ' ');
        org.joda.time.LocalDate localDate12 = localDate8.withYearOfCentury((int) (byte) 1);
        int int13 = localDate8.getDayOfMonth();
        int int14 = localDate8.getDayOfMonth();
        org.joda.time.LocalDate.Property property15 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate17 = localDate8.plusMonths((int) '4');
        org.joda.time.LocalDate.Property property18 = localDate8.year();
        org.joda.time.Chronology chronology19 = property18.getChronology();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(10, 0, 40, chronology19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 28 + "'", int13 == 28);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 28 + "'", int14 == 28);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(1L);
        long long2 = localDate1.getLocalMillis();
        org.joda.time.LocalDate localDate4 = localDate1.withYear(1955);
        org.joda.time.DateTime dateTime5 = localDate1.toDateTimeAtCurrentTime();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
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
        org.joda.time.DurationField durationField18 = property14.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime19 = property14.roundCeilingCopy();
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
        org.junit.Assert.assertNull(durationField18);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        java.lang.String str3 = property2.toString();
        int int4 = property2.getLeapAmount();
        java.lang.String str5 = property2.toString();
        org.joda.time.LocalDateTime localDateTime7 = property2.setCopy(7);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minus(readableDuration8);
        java.lang.Object obj10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(obj10, dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) '4');
        int int15 = localDateTime14.getYearOfEra();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime18 = property16.addToCopy((int) '4');
        int int19 = localDateTime18.getEra();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.plus(readableDuration20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusWeeks(10);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusDays((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusMonths(9);
        org.joda.time.LocalDateTime.Property property28 = localDateTime25.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = property28.getFieldType();
        int int30 = localDateTime12.indexOf(dateTimeFieldType29);
        boolean boolean31 = localDateTime7.isSupported(dateTimeFieldType29);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) '4');
        int int34 = localDateTime33.getYearOfEra();
        org.joda.time.LocalDateTime.Property property35 = localDateTime33.minuteOfHour();
        org.joda.time.LocalDateTime.Property property36 = localDateTime33.era();
        long long37 = property36.getMillis();
        org.joda.time.DateTimeField dateTimeField38 = property36.getField();
        org.joda.time.LocalDateTime.Property property39 = new org.joda.time.LocalDateTime.Property(localDateTime7, dateTimeField38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime7.dayOfYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[centuryOfEra]" + "'", str3, "Property[centuryOfEra]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Property[centuryOfEra]" + "'", str5, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1970 + "'", int34 == 1970);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 25200052L + "'", long37 == 25200052L);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(property40);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
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
        org.joda.time.LocalDateTime.Property property16 = localDateTime7.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime7.withHourOfDay(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "20" + "'", str14, "20");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
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
        org.joda.time.LocalDate localDate14 = property10.roundHalfFloorCopy();
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
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        java.util.Date date6 = localDateTime1.toDate();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime.Property property8 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withWeekyear((int) (byte) 1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
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
        org.joda.time.LocalDate localDate27 = property15.withMaximumValue();
        org.joda.time.LocalTime localTime28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localDate27.toDateTime(localTime28, dateTimeZone29);
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
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
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
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusSeconds(0);
        int int27 = localDateTime24.getDayOfWeek();
        org.joda.time.DateTime dateTime28 = localDateTime24.toDateTime();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.withYear((int) (short) 10);
        boolean boolean31 = localDateTime21.isEqual((org.joda.time.ReadablePartial) localDateTime24);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime21.withCenturyOfEra(3);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.millisOfSecond();
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
// flaky "11) test3901(org.joda.time.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u0e21\u0e04." + "'", str20, "\u0e21\u0e04.");
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
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
        org.joda.time.DurationFieldType durationFieldType25 = null;
        boolean boolean26 = localDate5.isSupported(durationFieldType25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = localDate5.toString("0770-01-01T07:00:00.052");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
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
        java.util.Locale locale25 = null;
        java.lang.String str26 = property24.getAsShortText(locale25);
        org.joda.time.LocalDateTime localDateTime28 = property24.addToCopy(31);
        int int29 = localDateTime28.getWeekOfWeekyear();
        int int30 = localDateTime28.getWeekyear();
        org.joda.time.LocalDateTime.Property property31 = localDateTime28.weekyear();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "52" + "'", str26, "52");
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1970 + "'", int30 == 1970);
        org.junit.Assert.assertNotNull(property31);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.DurationField durationField4 = property3.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.yearOfEra();
        org.joda.time.LocalDateTime localDateTime7 = property6.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusSeconds((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withDayOfYear(25200064);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25200064 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
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
        java.util.Locale locale22 = null;
        int int23 = property19.getMaximumShortTextLength(locale22);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 7 + "'", int23 == 7);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(2026);
        org.joda.time.LocalDate localDate13 = localDate11.plusWeeks(19);
        java.util.Locale locale15 = null;
        java.lang.String str16 = localDate13.toString("2026-09-14", locale15);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2026-09-14" + "'", str16, "2026-09-14");
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
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
        org.joda.time.LocalDateTime localDateTime14 = localDateTime5.minusMinutes(48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (-1790557193), dateTimeZone1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = localDate2.toString(dateTimeFormatter3);
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDate2.toDateTime(localTime5, dateTimeZone6);
        org.joda.time.LocalTime localTime8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate2.toDateTime(localTime8, dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1969-12-11" + "'", str4, "1969-12-11");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMillis(12);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusMillis(242);
        int int11 = localDateTime10.getHourOfDay();
        int int12 = localDateTime10.getCenturyOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.withDayOfYear(4);
        org.joda.time.LocalDate.Property property5 = localDate4.dayOfYear();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property5.getAsText(locale6);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
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
        org.joda.time.LocalDate localDate31 = localDate7.minusYears(1970);
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
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        org.joda.time.LocalDate localDate6 = localDate1.plusWeeks(0);
        org.joda.time.LocalDate localDate8 = localDate6.withYear((int) ' ');
        org.joda.time.LocalDate localDate10 = localDate8.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property11 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate12 = property11.roundHalfCeilingCopy();
        int int13 = localDate12.getCenturyOfEra();
        org.joda.time.LocalDate.Property property14 = localDate12.weekyear();
        org.joda.time.Chronology chronology15 = localDate12.getChronology();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 2001, chronology15);
        int int17 = localDate16.getYear();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.yearOfCentury();
        org.joda.time.LocalDate.Property property10 = localDate7.dayOfMonth();
        org.joda.time.LocalDate localDate11 = property10.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
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
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDate localDate29 = localDate26.withPeriodAdded(readablePeriod27, (int) (byte) -1);
        org.joda.time.LocalDate localDate31 = localDate26.plusWeeks(0);
        org.joda.time.LocalDate localDate33 = localDate31.withYear((int) ' ');
        org.joda.time.LocalDate localDate35 = localDate33.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property36 = localDate33.yearOfCentury();
        org.joda.time.LocalDate localDate37 = property36.roundHalfCeilingCopy();
        int int38 = localDate37.getCenturyOfEra();
        org.joda.time.LocalDate.Property property39 = localDate37.weekyear();
        org.joda.time.Chronology chronology40 = localDate37.getChronology();
        boolean boolean41 = localDate24.equals((java.lang.Object) localDate37);
        int int42 = localDate37.getDayOfYear();
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
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
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
        int int18 = localDateTime13.getYear();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1970 + "'", int18 == 1970);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate6 = property4.addToCopy(10);
        int int7 = localDate6.getYearOfCentury();
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate6.toDateTimeAtCurrentTime(dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate6.minusDays(33);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 70 + "'", int7 == 70);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((java.lang.Object) (-636397199948L));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = localDate1.withWeekOfWeekyear(36526);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36526 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        org.joda.time.LocalDate localDate11 = localDate7.withCenturyOfEra((int) '4');
        org.joda.time.LocalDate.Property property12 = localDate7.yearOfCentury();
        org.joda.time.Chronology chronology13 = property12.getChronology();
        org.joda.time.DurationField durationField14 = property12.getRangeDurationField();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        java.lang.String str3 = property2.toString();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDateTime5.toDateTime(dateTimeZone6);
        int int8 = property2.getDifference((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.LocalDateTime localDateTime10 = property2.addToCopy(12);
        int int11 = property2.get();
        org.joda.time.LocalDateTime localDateTime12 = property2.withMaximumValue();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withWeekyear(521);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[centuryOfEra]" + "'", str3, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 19 + "'", int11 == 19);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 'a');
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusHours(743);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withYearOfEra(14403717);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        int int5 = property4.getMaximumValueOverall();
        org.joda.time.Chronology chronology6 = property4.getChronology();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 59 + "'", int5 == 59);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
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
        int int24 = localDateTime23.getMillisOfDay();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 28319952 + "'", int24 == 28319952);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
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
        org.joda.time.LocalDate.Property property14 = localDate13.dayOfYear();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate0.minus(readablePeriod4);
        org.joda.time.LocalDate.Property property6 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate7 = property6.getLocalDate();
        long long8 = property6.remainder();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plus(readableDuration7);
        boolean boolean9 = property4.equals((java.lang.Object) localDateTime6);
        int int10 = localDateTime6.size();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.minusMinutes(39);
        org.joda.time.LocalDateTime.Property property13 = localDateTime6.yearOfEra();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMillis(12);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.minusSeconds(50);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) '4');
        int int11 = localDateTime10.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime18 = localDateTime10.withFields((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) '4');
        int int21 = localDateTime20.getYearOfEra();
        org.joda.time.LocalDateTime.Property property22 = localDateTime20.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime24 = property22.addToCopy((int) '4');
        org.joda.time.Chronology chronology25 = property22.getChronology();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime10, chronology25);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime8.withFields((org.joda.time.ReadablePartial) localDateTime10);
        long long28 = localDateTime27.getLocalMillis();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1970 + "'", int21 == 1970);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 25200052L + "'", long28 == 25200052L);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.dayOfWeek();
        org.joda.time.LocalDate localDate11 = localDate7.withLocalMillis(2421705600000L);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = localDate11.getValue(12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 12");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
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
        org.joda.time.LocalDate.Property property17 = localDate0.yearOfCentury();
        org.joda.time.DurationField durationField18 = property17.getLeapDurationField();
        org.joda.time.LocalDate localDate19 = property17.roundHalfFloorCopy();
        org.joda.time.DurationField durationField20 = property17.getDurationField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate22 = property17.setCopy(2010);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2010 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
        org.junit.Assert.assertNull(durationField18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        java.lang.String str3 = property2.toString();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDateTime5.toDateTime(dateTimeZone6);
        int int8 = property2.getDifference((org.joda.time.ReadableInstant) dateTime7);
        java.util.Locale locale9 = null;
        int int10 = property2.getMaximumShortTextLength(locale9);
        org.joda.time.LocalDateTime localDateTime11 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) '4');
        int int14 = localDateTime13.getYearOfEra();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime17 = property15.addToCopy((int) '4');
        org.joda.time.Chronology chronology18 = property15.getChronology();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.minusHours((-1));
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusWeeks(52);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusMillis(8);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime11.withFields((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime11.monthOfYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[centuryOfEra]" + "'", str3, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        int int12 = localDateTime11.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withWeekOfWeekyear(7);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plus(readableDuration17);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.withFields((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withYearOfCentury(0);
        int int22 = localDateTime21.getDayOfMonth();
        java.lang.String str24 = localDateTime21.toString("5232");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "5232" + "'", str24, "5232");
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
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
        org.joda.time.LocalDateTime localDateTime19 = property18.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withDayOfYear(14);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) '4');
        int int24 = localDateTime23.getYearOfEra();
        org.joda.time.LocalDateTime.Property property25 = localDateTime23.minuteOfHour();
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.era();
        org.joda.time.LocalDateTime localDateTime27 = property26.roundHalfFloorCopy();
        int int28 = localDateTime27.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withDayOfMonth(19);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) '4');
        int int36 = localDateTime35.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime35.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime43 = localDateTime35.withFields((org.joda.time.ReadablePartial) localDateTime42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime35.plusYears((int) (byte) -1);
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.plus(readableDuration46);
        int int48 = localDateTime47.size();
        int int49 = localDateTime47.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.plus(readableDuration52);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime51.minusSeconds(0);
        int int56 = localDateTime51.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property57 = localDateTime51.year();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime51.plusDays(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = localDateTime59.getFieldType((int) (byte) 0);
        int int62 = localDateTime47.get(dateTimeFieldType61);
        boolean boolean63 = localDateTime33.isSupported(dateTimeFieldType61);
        int int64 = localDateTime27.get(dateTimeFieldType61);
        int int65 = localDateTime21.indexOf(dateTimeFieldType61);
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
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1970 + "'", int24 == 1970);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 4 + "'", int48 == 4);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(dateTimeFieldType61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1969 + "'", int62 == 1969);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        org.joda.time.Chronology chronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now(chronology0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Chronology must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        int int5 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate7 = localDate0.withDayOfYear(100);
        org.joda.time.LocalDate localDate9 = localDate7.minusWeeks(0);
        org.joda.time.DateMidnight dateMidnight10 = localDate9.toDateMidnight();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateMidnight10);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
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
        org.joda.time.LocalDate localDate14 = localDate7.withWeekyear(99);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate18 = localDate15.withPeriodAdded(readablePeriod16, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight19 = localDate15.toDateMidnight();
        org.joda.time.LocalDate localDate21 = localDate15.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property22 = localDate21.weekyear();
        org.joda.time.ReadableInstant readableInstant23 = null;
        int int24 = property22.getDifference(readableInstant23);
        org.joda.time.LocalDate localDate25 = property22.withMinimumValue();
        org.joda.time.LocalDate localDate27 = property22.addWrapFieldToCopy(1);
        org.joda.time.LocalDate localDate29 = property22.setCopy((int) (byte) -1);
        int int30 = localDate14.compareTo((org.joda.time.ReadablePartial) localDate29);
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localDate31.toDateTimeAtStartOfDay(dateTimeZone32);
        org.joda.time.LocalDate localDate35 = localDate31.withDayOfYear(4);
        org.joda.time.LocalDate localDate37 = localDate35.minusWeeks((int) (short) 10);
        int int38 = localDate35.getYear();
        org.joda.time.LocalDate localDate39 = localDate29.withFields((org.joda.time.ReadablePartial) localDate35);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2026 + "'", int12 == 2026);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2026 + "'", int38 == 2026);
        org.junit.Assert.assertNotNull(localDate39);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
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
        int int16 = localDate8.getYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2026 + "'", int16 == 2026);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        org.joda.time.DateTime dateTime7 = localDate0.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate.Property property8 = localDate0.weekOfWeekyear();
        org.joda.time.LocalDate.Property property9 = localDate0.weekOfWeekyear();
        org.joda.time.LocalDate localDate10 = property9.roundFloorCopy();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
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
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate19 = localDate16.withPeriodAdded(readablePeriod17, (int) (byte) -1);
        int int20 = localDate16.getYearOfEra();
        org.joda.time.LocalDate localDate22 = localDate16.plusDays(1970);
        org.joda.time.LocalDate localDate23 = localDate15.withFields((org.joda.time.ReadablePartial) localDate22);
        org.joda.time.LocalDate.Property property24 = localDate22.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property24.getFieldType();
        int int26 = property24.getMaximumValue();
        long long27 = property24.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = property24.getFieldType();
        int int29 = localDate9.indexOf(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2026 + "'", int20 == 2026);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 12 + "'", int26 == 12);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1960761600000L + "'", long27 == 1960761600000L);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("\u0e27\u0e31\u0e19\u0e28\u0e38\u0e01\u0e23\u0e4c");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"????????\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        java.util.Locale locale5 = null;
        int int6 = property4.getMaximumTextLength(locale5);
        int int7 = property4.getMaximumValue();
        org.joda.time.DurationField durationField8 = property4.getLeapDurationField();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(durationField8);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minusHours((-1));
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withLocalMillis((long) 28);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime7.withHourOfDay(6);
        int int16 = localDateTime15.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 2026, dateTimeZone19);
        int[] intArray21 = localDate20.getValues();
        org.joda.time.LocalDate.Property property22 = localDate20.weekOfWeekyear();
        org.joda.time.LocalDate localDate24 = property22.addToCopy(10);
        org.joda.time.LocalDate localDate26 = property22.addWrapFieldToCopy(2007);
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
        org.joda.time.Chronology chronology43 = localDate33.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = localDate26.getField(0, chronology43);
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate(chronology43);
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((-31510799948L), chronology43);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean47 = localDateTime15.isEqual((org.joda.time.ReadablePartial) localDate46);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 28 + "'", int16 == 28);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 28 + "'", int38 == 28);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 28 + "'", int39 == 28);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate0.minus(readablePeriod4);
        org.joda.time.LocalDate localDate7 = localDate5.plusYears(5232);
        int int8 = localDate5.size();
        org.joda.time.LocalDate localDate10 = localDate5.minusWeeks((int) (byte) 100);
        org.joda.time.LocalDate.Property property11 = localDate5.dayOfMonth();
        org.joda.time.LocalDate.Property property12 = localDate5.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate5.minus(readablePeriod13);
        int int15 = localDate14.getMonthOfYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusWeeks((int) (short) -1);
        int int8 = localDateTime1.getDayOfMonth();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        java.util.Date date6 = localDateTime1.toDate();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        java.lang.String str10 = localDateTime8.toString();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withYearOfCentury((int) ' ');
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) '4');
        int int15 = localDateTime14.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime22 = localDateTime14.withFields((org.joda.time.ReadablePartial) localDateTime21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime14.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusMinutes(31);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.plusHours(59);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) '4');
        int int31 = localDateTime30.getYearOfEra();
        org.joda.time.LocalDateTime.Property property32 = localDateTime30.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime34 = property32.addToCopy((int) '4');
        org.joda.time.Chronology chronology35 = property32.getChronology();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(chronology35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime40 = localDateTime36.minusHours((-1));
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.plusWeeks(52);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) '4');
        int int45 = localDateTime44.getYearOfEra();
        org.joda.time.LocalDateTime.Property property46 = localDateTime44.minuteOfHour();
        int int47 = property46.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime49 = property46.addWrapFieldToCopy((int) 'a');
        org.joda.time.Interval interval50 = property46.toInterval();
        java.util.Locale locale52 = null;
        org.joda.time.LocalDateTime localDateTime53 = property46.setCopy("9", locale52);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone55);
        org.joda.time.DateTimeField[] dateTimeFieldArray57 = localDateTime56.getFields();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime56.minusDays(59);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime53.withFields((org.joda.time.ReadablePartial) localDateTime59);
        org.joda.time.LocalDateTime.Property property61 = localDateTime53.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime62 = property61.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime((long) '4');
        int int65 = localDateTime64.getYearOfEra();
        org.joda.time.LocalDateTime.Property property66 = localDateTime64.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime68 = property66.addToCopy((int) '4');
        int int69 = localDateTime68.getEra();
        org.joda.time.ReadableDuration readableDuration70 = null;
        org.joda.time.LocalDateTime localDateTime71 = localDateTime68.plus(readableDuration70);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime71.plusWeeks(10);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime73.minusDays((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime75.plusMonths(9);
        org.joda.time.LocalDateTime.Property property78 = localDateTime75.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType79 = property78.getFieldType();
        int int80 = localDateTime62.get(dateTimeFieldType79);
        int int81 = localDateTime40.indexOf(dateTimeFieldType79);
        int int82 = localDateTime28.get(dateTimeFieldType79);
        boolean boolean83 = localDateTime12.isSupported(dateTimeFieldType79);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01T00:00:00.100" + "'", str10, "1970-01-01T00:00:00.100");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1970 + "'", int31 == 1970);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1970 + "'", int45 == 1970);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 59 + "'", int47 == 59);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(dateTimeFieldArray57);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1970 + "'", int65 == 1970);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertNotNull(localDateTime75);
        org.junit.Assert.assertNotNull(localDateTime77);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertNotNull(dateTimeFieldType79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 4 + "'", int80 == 4);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 6 + "'", int82 == 6);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withLocalMillis((long) 28320052);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) '4');
        int int7 = localDateTime6.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withWeekyear((int) '#');
        java.lang.String str12 = localDateTime11.toString();
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
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.withDayOfMonth(19);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.year();
        java.lang.String str33 = property32.getAsText();
        long long34 = property32.remainder();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = property32.getFieldType();
        org.joda.time.LocalDateTime.Property property36 = localDateTime23.property(dateTimeFieldType35);
        int int37 = localDateTime11.get(dateTimeFieldType35);
        org.joda.time.Chronology chronology38 = localDateTime11.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((java.lang.Object) property4, chronology38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0035-01-04T07:00:00.052" + "'", str12, "0035-01-04T07:00:00.052");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970" + "'", str33, "1970");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1580400052L + "'", long34 == 1580400052L);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertNotNull(chronology38);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
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
        org.joda.time.LocalDate.Property property12 = localDate11.weekyear();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
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
        org.joda.time.LocalDate localDate21 = localDate19.withYear((int) ' ');
        org.joda.time.LocalDate localDate23 = localDate21.minusDays((int) (short) 0);
        java.util.Locale locale25 = null;
        java.lang.String str26 = localDate23.toString("271", locale25);
        org.joda.time.DateTime dateTime27 = localDate23.toDateTimeAtMidnight();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDate localDate29 = localDate23.plus(readablePeriod28);
        org.joda.time.LocalDate localDate31 = localDate29.minusMonths(20);
        org.joda.time.DateMidnight dateMidnight32 = localDate29.toDateMidnight();
        long long33 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight32);
        org.joda.time.LocalDate localDate34 = property13.roundCeilingCopy();
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
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "271" + "'", str26, "271");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-25198114L) + "'", long33 == (-25198114L));
        org.junit.Assert.assertNotNull(localDate34);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
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
        java.lang.String str28 = localDate27.toString();
        int int29 = localDate27.getWeekyear();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2026-09-28" + "'", str28, "2026-09-28");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2026 + "'", int29 == 2026);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
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
        org.joda.time.DurationField durationField20 = property17.getDurationField();
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
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minusHours((-1));
        int int12 = localDateTime11.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.plusWeeks(70);
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
        java.lang.Object obj32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(obj32, dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) '4');
        int int37 = localDateTime36.getYearOfEra();
        org.joda.time.LocalDateTime.Property property38 = localDateTime36.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime40 = property38.addToCopy((int) '4');
        int int41 = localDateTime40.getEra();
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.plus(readableDuration42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.plusWeeks(10);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.minusDays((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.plusMonths(9);
        org.joda.time.LocalDateTime.Property property50 = localDateTime47.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = property50.getFieldType();
        int int52 = localDateTime34.indexOf(dateTimeFieldType51);
        boolean boolean53 = localDateTime23.isSupported(dateTimeFieldType51);
        int int54 = localDateTime14.indexOf(dateTimeFieldType51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1970 + "'", int37 == 1970);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusDays(7);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate5 = localDate2.withPeriodAdded(readablePeriod3, 28320052);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate7 = localDate2.minus(readablePeriod6);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
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
        org.joda.time.LocalDate.Property property17 = localDate0.yearOfCentury();
        org.joda.time.DurationField durationField18 = property17.getLeapDurationField();
        org.joda.time.LocalDate localDate19 = property17.roundFloorCopy();
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
        org.junit.Assert.assertNull(durationField18);
        org.junit.Assert.assertNotNull(localDate19);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minusHours((-1));
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withLocalMillis((long) 28);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusWeeks(985);
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
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
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
        org.joda.time.LocalDateTime localDateTime20 = localDateTime13.plusDays((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minusWeeks(86399999);
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
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime localDateTime5 = property3.setCopy("271");
        int int6 = property3.getLeapAmount();
        int int7 = property3.getMaximumValue();
        int int8 = property3.getMinimumValueOverall();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 365 + "'", int7 == 365);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
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
        org.joda.time.LocalDate localDate15 = localDate13.withCenturyOfEra(24);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2007 + "'", int9 == 2007);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfWeek();
        long long4 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime5 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime7 = property3.addToCopy((long) 1869);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plus(readablePeriod8);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 25200052L + "'", long4 == 25200052L);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
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
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime21, dateTimeZone24);
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
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        int int10 = localDate5.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight11 = localDate5.toDateMidnight();
        org.joda.time.LocalDate.Property property12 = localDate5.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.Interval interval14 = localDate5.toInterval(dateTimeZone13);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 28 + "'", int10 == 28);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval14);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusSeconds(0);
        int int5 = localDateTime2.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) '4');
        int int8 = localDateTime7.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.dayOfYear();
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime11 = property10.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property10.getFieldType();
        int int13 = localDateTime2.indexOf(dateTimeFieldType12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime2.plusYears(365);
        org.joda.time.LocalDateTime.Property property16 = localDateTime2.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = property16.setCopy(867);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 867 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        org.joda.time.LocalDate localDate11 = localDate7.withCenturyOfEra((int) '4');
        org.joda.time.LocalDate.Property property12 = localDate7.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = localDate7.toDateMidnight(dateTimeZone13);
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate19 = localDate16.withPeriodAdded(readablePeriod17, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight20 = localDate16.toDateMidnight();
        org.joda.time.LocalDate localDate22 = localDate16.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property23 = localDate16.dayOfYear();
        org.joda.time.DurationField durationField24 = property23.getDurationField();
        java.lang.String str25 = property23.getAsText();
        boolean boolean26 = property23.isLeap();
        org.joda.time.LocalDate localDate28 = property23.setCopy((int) ' ');
        org.joda.time.Chronology chronology29 = localDate28.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField30 = localDate7.getField(36, chronology29);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 36");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "271" + "'", str25, "271");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(chronology29);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
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
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withYear(42);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.plus(readableDuration17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
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
        org.joda.time.LocalDateTime localDateTime23 = localDateTime9.withSecondOfMinute(15);
        org.joda.time.ReadablePartial readablePartial24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = localDateTime23.isBefore(readablePartial24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Partial cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
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
        java.lang.String str13 = property7.getName();
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = property7.setCopy("1970-09-28", locale15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970-09-28\" for dayOfYear is not supported");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "dayOfYear" + "'", str13, "dayOfYear");
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
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
        org.joda.time.LocalDate localDate13 = localDate10.plusDays(32);
        int int14 = localDate13.getDayOfMonth();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Oct 04 00:00:00 ICT 2");
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withMillisOfDay(7);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        java.util.Locale locale5 = null;
        java.lang.String str6 = localDateTime2.toString("333", locale5);
        int int7 = localDateTime2.getYearOfCentury();
        int int8 = localDateTime2.getWeekyear();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "333" + "'", str6, "333");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 26 + "'", int7 == 26);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2026 + "'", int8 == 2026);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundHalfFloorCopy();
        org.joda.time.Interval interval3 = property1.toInterval();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(interval3);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.weekyear();
        org.joda.time.LocalDate localDate8 = property7.withMinimumValue();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
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
        org.joda.time.LocalDate localDate20 = property8.addToCopy(52);
        org.joda.time.LocalDate localDate21 = property8.getLocalDate();
        long long22 = property8.getMillis();
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
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1790553600000L + "'", long22 == 1790553600000L);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withWeekyear(69);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate6 = localDate1.withPeriodAdded(readablePeriod4, 25260000);
        org.joda.time.LocalDate localDate8 = localDate1.plusDays(68);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
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
        java.lang.String str27 = property26.toString();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Property[dayOfMonth]" + "'", str27, "Property[dayOfMonth]");
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
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
        org.joda.time.LocalDateTime localDateTime18 = property15.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDateTime18.toDateTime(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 19 + "'", int14 == 19);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        boolean boolean6 = property5.isLeap();
        java.util.Locale locale7 = null;
        int int8 = property5.getMaximumTextLength(locale7);
        org.joda.time.LocalDateTime localDateTime9 = property5.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime11 = property5.setCopy(2922789);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears((int) (byte) -1);
        int int12 = localDateTime1.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property13 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime15 = property13.addToCopy(0);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withPeriodAdded(readablePeriod16, 3938);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) '4');
        int int21 = localDateTime20.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime20.withWeekyear((int) '#');
        java.lang.String str26 = localDateTime25.toString();
        int int27 = localDateTime25.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.plusHours(1970);
        boolean boolean30 = localDateTime15.equals((java.lang.Object) 1970);
        int int31 = localDateTime15.getEra();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0035-01-04T07:00:00.052" + "'", str26, "0035-01-04T07:00:00.052");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate10.withWeekOfWeekyear(1869);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1869 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 26 + "'", int7 == 26);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        long long5 = property4.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = property4.getFieldType();
        org.joda.time.LocalDateTime localDateTime7 = property4.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime8 = property4.roundHalfFloorCopy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25200052L + "'", long5 == 25200052L);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime1.withCenturyOfEra(271);
        java.util.Date date14 = localDateTime13.toDate();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withLocalMillis((long) 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 07:00:00 ICT 27170");
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
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
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minus(readablePeriod26);
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
        org.junit.Assert.assertNotNull(localDateTime27);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        boolean boolean10 = localDate7.equals((java.lang.Object) 100.0d);
        org.joda.time.LocalDate localDate12 = localDate7.withWeekyear(28320052);
        org.joda.time.LocalDate.Property property13 = localDate7.yearOfEra();
        org.joda.time.DurationFieldType durationFieldType14 = null;
        boolean boolean15 = localDate7.isSupported(durationFieldType14);
        org.joda.time.DateTime dateTime16 = localDate7.toDateTimeAtStartOfDay();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
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
        org.joda.time.LocalDateTime localDateTime23 = property22.withMinimumValue();
        java.util.Date date24 = localDateTime23.toDate();
        long long25 = localDateTime23.getLocalMillis();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.minusDays(12);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withSecondOfMinute(53);
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.yearOfCentury();
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
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Mon Jan 01 07:00:00 ICT 1900");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-2208963599948L) + "'", long25 == (-2208963599948L));
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
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
        int int15 = localDateTime12.getDayOfMonth();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky "12) test3980(org.joda.time.RegressionTest7)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 28833789 + "'", int10 == 28833789);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(date13);
// flaky "2) test3980(org.joda.time.RegressionTest7)":         org.junit.Assert.assertEquals(date13.toString(), "Tue Sep 01 08:00:33 ICT 2026");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.centuryOfEra();
        java.util.Locale locale4 = null;
        int int5 = property3.getMaximumShortTextLength(locale4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = property3.getFieldType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        java.lang.Object obj0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(obj0);
        org.joda.time.LocalDate localDate3 = localDate1.minusWeeks((int) (short) -1);
        org.joda.time.Interval interval4 = localDate1.toInterval();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(interval4);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
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
        org.joda.time.LocalDate localDate16 = property13.addToCopy(15);
        org.joda.time.LocalDate localDate18 = localDate16.withLocalMillis((long) 271);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) '4');
        int int22 = localDateTime21.getYearOfEra();
        org.joda.time.LocalDateTime.Property property23 = localDateTime21.minuteOfHour();
        int int24 = property23.getMaximumValue();
        org.joda.time.DateTimeField dateTimeField25 = property23.getField();
        java.lang.String str26 = property23.getAsText();
        org.joda.time.Chronology chronology27 = property23.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField28 = localDate18.getField(3, chronology27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1790553600000L + "'", long14 == 1790553600000L);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1970 + "'", int22 == 1970);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 59 + "'", int24 == 59);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertNotNull(chronology27);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate localDate10 = localDate0.plusMonths((int) (short) 100);
        org.joda.time.DurationFieldType durationFieldType11 = null;
        boolean boolean12 = localDate10.isSupported(durationFieldType11);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(25, 6, (-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(324, 867, 14, 1980, (-1), 36);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1980 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("0000-09-28", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate localDate10 = localDate8.minusYears(25200052);
        java.lang.String str12 = localDate8.toString("\u0e04\u0e28.");
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u0e04\u0e28." + "'", str12, "\u0e04\u0e28.");
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
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
        org.joda.time.DateTime dateTime25 = localDate19.toDateTimeAtMidnight();
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
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((-25198114L));
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.weekyear();
        java.util.Locale locale3 = null;
        java.lang.String str4 = property2.getAsText(locale3);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970" + "'", str4, "1970");
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
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
        org.joda.time.LocalDateTime localDateTime17 = property14.roundFloorCopy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withPeriodAdded(readablePeriod5, 3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMillisOfSecond(2010);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2010 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(55, 271, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 271 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        int int5 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate7 = localDate0.withDayOfYear(100);
        org.joda.time.LocalTime localTime8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate7.toDateTime(localTime8, dateTimeZone9);
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate14 = localDate11.withPeriodAdded(readablePeriod12, (int) (byte) -1);
        org.joda.time.LocalDate localDate16 = localDate11.plusWeeks(0);
        boolean boolean17 = localDate7.equals((java.lang.Object) 0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.Interval interval19 = localDate7.toInterval(dateTimeZone18);
        int int20 = localDate7.getYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2026 + "'", int20 == 2026);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
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
        org.joda.time.LocalDateTime.Property property17 = localDateTime10.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundHalfCeilingCopy();
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
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate5 = property4.getLocalDate();
        org.joda.time.LocalDate localDate6 = property4.getLocalDate();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate.Property property8 = localDate0.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property8.getFieldType();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.withYearOfCentury(0);
        java.util.Date date5 = localDate4.toDate();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Sep 28 00:00:00 ICT 2000");
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
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
        int int14 = localDate11.getWeekyear();
        java.lang.String str15 = localDate11.toString();
        java.util.Date date16 = localDate11.toDate();
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.fromDateFields(date16);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5232 + "'", int14 == 5232);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "5232-02-19" + "'", str15, "5232-02-19");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Feb 19 00:00:00 ICT 5232");
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((-2208963599948L));
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks(0);
        org.junit.Assert.assertNotNull(localDateTime3);
    }
}
