package org.joda.time;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The calendar must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMonthOfYear((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withDayOfMonth((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = localDateTime1.toString("hi!", locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("Property[centuryOfEra]", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("Property[centuryOfEra]", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withTime((int) (byte) 10, 100, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) '4');
        int int3 = localDateTime2.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localDate0.compareTo((org.joda.time.ReadablePartial) localDateTime2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = localDate3.withDayOfYear((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.minusWeeks((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = localDate0.withFieldAdded(durationFieldType3, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        int int9 = localDateTime8.getYearOfEra();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime12 = property10.addToCopy((int) '4');
        org.joda.time.Chronology chronology13 = property10.getChronology();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(0, (int) (short) 100, (-1), (-1), (int) (short) 10, 59, 52, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((java.lang.Object) 'a', dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DurationFieldType durationFieldType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withFieldAdded(durationFieldType2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localDate6.get(dateTimeFieldType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now(dateTimeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Zone must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localDate0.getValue(1970);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 1970");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType7 = localDateTime5.getFieldType(52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.DurationFieldType durationFieldType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = localDate7.withFieldAdded(durationFieldType8, 2026);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = property9.setCopy("Property[centuryOfEra]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Property[centuryOfEra]\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now(dateTimeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Zone must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime7.withTime((int) (byte) -1, 2026, 1, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime1.withHourOfDay((int) (byte) 0);
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = localDateTime1.toString("", locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = localDateTime1.getSecondOfMinute();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        int int11 = localDateTime5.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = localDateTime5.toString("Property[centuryOfEra]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 70 + "'", int11 == 70);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = property7.setCopy("Property[centuryOfEra]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Property[centuryOfEra]\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) '4');
        int int3 = localDateTime2.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime2.withFields((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) '4');
        int int13 = localDateTime12.getYearOfEra();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime16 = property14.addToCopy((int) '4');
        org.joda.time.Chronology chronology17 = property14.getChronology();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime2, chronology17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) 0.0f, chronology17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(chronology17);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate9 = localDate7.minusWeeks((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localDateTime6.compareTo((org.joda.time.ReadablePartial) localDate7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType12 = null;
        boolean boolean13 = localDateTime11.isSupported(durationFieldType12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withDayOfMonth(52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) '4');
        int int7 = localDateTime6.getYearOfEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime10 = property8.addToCopy((int) '4');
        org.joda.time.Chronology chronology11 = property8.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField12 = localDateTime1.getField((int) (byte) 10, chronology11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1970 + "'", int7 == 1970);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = localDateTime4.getFields();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = localDateTime4.get(dateTimeFieldType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.DurationFieldType durationFieldType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withFieldAdded(durationFieldType4, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        int int6 = localDateTime5.getMinuteOfHour();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate5.withDayOfMonth((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        org.joda.time.LocalDate.Property property10 = localDate7.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localDate7.get(dateTimeFieldType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        java.util.Date date6 = localDateTime1.toDate();
        java.lang.String str7 = localDateTime1.toString();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01T07:00:00.052" + "'", str7, "1970-01-01T07:00:00.052");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        int int8 = localDate7.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) '4');
        int int11 = localDateTime10.getYearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localDate7.compareTo((org.joda.time.ReadablePartial) localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        int int7 = localDateTime6.getWeekyear();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.minuteOfHour();
        int int9 = localDateTime6.getDayOfMonth();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1970 + "'", int7 == 1970);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime1.withDate(1970, (int) '4', 52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
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
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate18 = localDate15.withPeriodAdded(readablePeriod16, (int) (byte) -1);
        org.joda.time.LocalDate localDate20 = localDate15.plusWeeks(0);
        org.joda.time.LocalDate localDate22 = localDate20.withYear((int) ' ');
        org.joda.time.LocalDate localDate24 = localDate22.minusDays((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = localDateTime10.compareTo((org.joda.time.ReadablePartial) localDate22);
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
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withFieldAdded(durationFieldType8, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval5 = property4.toInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        org.joda.time.LocalDate localDate11 = localDate7.withCenturyOfEra((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate7.withDayOfWeek(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
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
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate7.withDayOfMonth(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
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
        java.util.Locale locale17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = property8.setCopy("1970-01-01T07:00:00.052", locale17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970-01-01T07:00:00.052\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
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
        java.lang.Class<?> wildcardClass14 = localDateTime10.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withYearOfCentury((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfCentury must be in the range [0,99]");
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
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The calendar must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.minusWeeks((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate0.withMonthOfYear(26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("Property[centuryOfEra]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Property[centuryOfEra]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = property3.setCopy("\u0e01\u0e1e.");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"?.?.\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) '4');
        int int3 = localDateTime2.getYearOfEra();
        org.joda.time.LocalDateTime.Property property4 = localDateTime2.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime6 = property4.addToCopy((int) '4');
        org.joda.time.Chronology chronology7 = property4.getChronology();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((java.lang.Object) 70, chronology7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minus(readablePeriod6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withTime(52, 4, 26, 1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(9, 1970, (int) (short) 0, 0, 26, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        int int9 = localDateTime8.getYearOfEra();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime12 = property10.addToCopy((int) '4');
        org.joda.time.Chronology chronology13 = property10.getChronology();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((int) (byte) 1, 70, 12, (int) (short) 1, 25200052, 2001, 32, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25200052 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = localDate0.indexOf(dateTimeFieldType5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate0.withMonthOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        boolean boolean5 = property3.isLeap();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minus(readablePeriod6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        java.util.Locale locale10 = null;
        java.lang.String str11 = localDate5.toString("0", locale10);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
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
        java.lang.Class<?> wildcardClass16 = localDate15.getClass();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withLocalMillis((long) 28320052);
        org.joda.time.Chronology chronology7 = localDateTime6.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(1970, 70, (int) (byte) 10, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundFloorCopy();
        org.joda.time.DurationField durationField8 = property3.getRangeDurationField();
        boolean boolean9 = property3.isLeap();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) '4');
        int int12 = localDateTime11.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime19 = localDateTime11.withFields((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) '4');
        int int22 = localDateTime21.getYearOfEra();
        org.joda.time.LocalDateTime.Property property23 = localDateTime21.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime25 = property23.addToCopy((int) '4');
        org.joda.time.Chronology chronology26 = property23.getChronology();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime11, chronology26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((java.lang.Object) boolean9, chronology26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1970 + "'", int22 == 1970);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(chronology26);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        int int9 = localDateTime8.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime16 = localDateTime8.withFields((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) '4');
        int int19 = localDateTime18.getYearOfEra();
        org.joda.time.LocalDateTime.Property property20 = localDateTime18.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime22 = property20.addToCopy((int) '4');
        org.joda.time.Chronology chronology23 = property20.getChronology();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime8, chronology23);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(chronology23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((int) (byte) 10, (int) (byte) -1, 25200052, 12, 2001, 28, 0, chronology23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2001 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(chronology23);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        long long9 = localDate0.getLocalMillis();
        org.joda.time.LocalDate.Property property10 = localDate0.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = property10.setCopy((int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for dayOfMonth must be in the range [1,30]");
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
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate9 = localDate0.withYear((int) '4');
        java.lang.Class<?> wildcardClass10 = localDate9.getClass();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusSeconds(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime4.getFieldType((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        int int11 = localDateTime5.getYear();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) int11, dateTimeZone12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
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
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
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
        java.lang.Class<?> wildcardClass17 = localDateTime10.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 28320052 + "'", int14 == 28320052);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        java.util.Date date10 = localDateTime9.toDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = localDateTime9.toString(dateTimeFormatter11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withYearOfCentury((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01T07:00:00.052" + "'", str12, "1970-01-01T07:00:00.052");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = localDate0.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        org.joda.time.Interval interval10 = localDate7.toInterval();
        org.joda.time.DurationFieldType durationFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate7.withFieldAdded(durationFieldType11, 4);
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
        org.junit.Assert.assertNotNull(interval10);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears((int) (byte) -1);
        int int12 = localDateTime1.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((java.lang.Object) int12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
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
        java.util.Locale locale20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = localDateTime18.toString("Property[minuteOfHour]", locale20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(25200052L);
        int int2 = localDate1.getYearOfCentury();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundFloorCopy();
        java.util.Locale locale9 = null;
        org.joda.time.LocalDateTime localDateTime10 = property3.setCopy("0", locale9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("\u0e01\u0e1e.", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight10 = localDate9.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localDate9.get(dateTimeFieldType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateMidnight10);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        java.lang.Class<?> wildcardClass8 = localDate6.getClass();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = property9.setCopy("0");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"0\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime5.withYearOfEra((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate.Property property8 = localDate0.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = property8.setCopy("Property[centuryOfEra]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Property[centuryOfEra]\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate6 = property4.addToCopy(10);
        int int7 = property4.getMaximumValue();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localDateTime2.getFields();
        org.joda.time.LocalDateTime.Property property4 = localDateTime2.monthOfYear();
        int int5 = property4.getLeapAmount();
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) '4');
        int int5 = localDateTime4.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) '4');
        int int15 = localDateTime14.getYearOfEra();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime18 = property16.addToCopy((int) '4');
        org.joda.time.Chronology chronology19 = property16.getChronology();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime4, chronology19);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((int) (byte) 10, (-1), (int) (byte) 10, chronology19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withLocalMillis((long) 28320052);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMonthOfYear((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(12, 2001, 53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2001 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
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
            org.joda.time.LocalDate localDate17 = property15.setCopy("0035-01-04T07:00:00.052");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"0035-01-04T07:00:00.052\" for year is not supported");
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
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("1970-01-01T07:00:00.000", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusSeconds((int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withFieldAdded(durationFieldType12, 0);
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
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        java.util.Locale locale5 = null;
        int int6 = property3.getMaximumTextLength(locale5);
        org.joda.time.LocalDateTime localDateTime7 = property3.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((java.lang.Object) property3, dateTimeZone8);
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
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withMonthOfYear(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
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
        // The following exception was thrown during execution in test generation
        try {
            int int18 = localDate16.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusMillis(4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withDayOfMonth((int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.monthOfYear();
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = localDateTime1.toString("1970-01-01T07:00:00.000", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        int[] intArray10 = localDate9.getValues();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 32, 9, 28 });
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = property11.setCopy("0");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
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
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusMillis(4);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localDateTime7.getValue(2001);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2001");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime6 = property3.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusMillis(2026);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withMillisOfSecond((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) property4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, (-1));
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate12 = localDate9.withPeriodAdded(readablePeriod10, (int) (byte) -1);
        int int13 = localDate9.getYearOfEra();
        org.joda.time.LocalDate localDate15 = localDate9.plusDays(1970);
        org.joda.time.LocalTime localTime16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localDate9.toDateTime(localTime16, dateTimeZone17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = localDate0.isEqual((org.joda.time.ReadablePartial) localTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Partial cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2026 + "'", int13 == 2026);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) '4');
        int int5 = localDateTime4.getYearOfEra();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime8 = property6.addToCopy((int) '4');
        org.joda.time.Chronology chronology9 = property6.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(28, 0, 2, chronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        int int9 = localDateTime8.getYearOfEra();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime12 = property10.addToCopy((int) '4');
        org.joda.time.Chronology chronology13 = property10.getChronology();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(70, 0, 59, (int) (byte) 0, 1970, (int) (byte) -1, (-1), chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate.Property property9 = localDate5.year();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate12 = localDate5.withPeriodAdded(readablePeriod10, 2026);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = localDate5.toString("1970-01-01T07:00:00.000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.junit.Assert.assertNotNull(localDateTime0);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) ' ', 5, 12, (int) 'a', 53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        java.lang.String str10 = property9.getAsShortText();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = property9.setCopy("Property[centuryOfEra]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Property[centuryOfEra]\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
// flaky "1) test0107(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u0e01\u0e1e." + "'", str10, "\u0e01\u0e1e.");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withEra(28);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeZone2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField7 = localDateTime4.getField(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime6 = property3.roundFloorCopy();
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.DurationFieldType durationFieldType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withFieldAdded(durationFieldType8, 365);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(2026, 2001, 2001, 59, 0, 10, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        org.joda.time.LocalDate localDate11 = localDate7.withCenturyOfEra((int) '4');
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfDay(7);
        org.joda.time.Chronology chronology16 = localDateTime15.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField17 = localDate11.getField((int) (byte) -1, chronology16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
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
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime6 = property3.roundFloorCopy();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusMonths(1970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("0", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        int int7 = localDate6.getDayOfMonth();
        org.joda.time.Interval interval8 = localDate6.toInterval();
        org.joda.time.DurationFieldType durationFieldType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate6.withFieldAdded(durationFieldType9, 26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 28 + "'", int7 == 28);
        org.junit.Assert.assertNotNull(interval8);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime1.withHourOfDay((int) (byte) 0);
        int int14 = localDateTime13.getYear();
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate18 = localDate15.withPeriodAdded(readablePeriod16, (int) (byte) -1);
        int int19 = localDate15.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        int int21 = localDate15.indexOf(dateTimeFieldType20);
        int int22 = localDate15.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = localDateTime13.compareTo((org.joda.time.ReadablePartial) localDate15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2026 + "'", int19 == 2026);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 26 + "'", int22 == 26);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        java.util.Date date12 = localDateTime1.toDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime1.withMonthOfYear((int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 07:00:00 ICT 1970");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusDays((-1));
        int int8 = localDateTime7.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withYearOfCentury((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        java.util.Date date6 = localDateTime1.toDate();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        int int9 = localDateTime8.getDayOfYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(0, 2001, (int) '#', 2032, 0, 2026);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2032 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property17 = localDate15.property(dateTimeFieldType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) '4');
        int int5 = localDateTime4.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) '4');
        int int15 = localDateTime14.getYearOfEra();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime18 = property16.addToCopy((int) '4');
        org.joda.time.Chronology chronology19 = property16.getChronology();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime4, chronology19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(100, 12, (int) (short) -1, chronology19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = property3.setCopy("271");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 271 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = property5.getLeapDurationField();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNull(durationField6);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        java.lang.String str3 = property2.toString();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withDayOfYear((int) (short) 100);
        org.joda.time.DurationFieldType durationFieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withFieldAdded(durationFieldType7, 59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[centuryOfEra]" + "'", str3, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
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
        java.lang.Class<?> wildcardClass23 = localDate0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withDayOfMonth(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
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
        java.lang.String str18 = property17.getAsText();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21" + "'", str18, "\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate9 = localDate0.withYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Interval interval11 = localDate0.toInterval(dateTimeZone10);
        org.joda.time.DurationFieldType durationFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = localDate0.withFieldAdded(durationFieldType12, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(interval11);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withCenturyOfEra((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property27 = localDate24.property(dateTimeFieldType26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
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
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withTime((int) (byte) 1, (int) (byte) 10, 4, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withLocalMillis((long) 28320052);
        int int4 = localDateTime1.getEra();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
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
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.plusSeconds((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate localDate9 = property8.withMaximumValue();
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = property8.setCopy("Property[minuteOfHour]", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Property[minuteOfHour]\" for monthOfYear is not supported");
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
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.year();
        long long11 = property10.remainder();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
// flaky "2) test0136(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 23169585874L + "'", long11 == 23169585874L);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusMillis(4);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusMinutes((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime.Property property13 = localDateTime9.property(dateTimeFieldType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        org.joda.time.DurationField durationField9 = property8.getRangeDurationField();
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = property8.setCopy("1970-01-01T07:00:00.052", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970-01-01T07:00:00.052\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        org.joda.time.Interval interval10 = localDate7.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localDate7.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate0.minus(readablePeriod4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate5.withMonthOfYear((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withLocalMillis(5701010L);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = localDateTime2.get(dateTimeFieldType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundCeilingCopy();
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = property2.setCopy("2026-09-28", locale7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2026-09-28\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) property4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        java.lang.String str3 = property2.toString();
        int int4 = property2.getLeapAmount();
        java.util.Locale locale5 = null;
        int int6 = property2.getMaximumShortTextLength(locale5);
        int int7 = property2.getMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[centuryOfEra]" + "'", str3, "Property[centuryOfEra]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2922789 + "'", int7 == 2922789);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.hourOfDay();
        int int6 = localDateTime1.getYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withHourOfDay(32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((int) (short) 1, (int) (byte) 1, (int) 'a', (int) (short) 0, (int) (byte) 10, 2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        int int10 = localDate5.getDayOfMonth();
        int int11 = localDate5.getDayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate5.minus(readablePeriod12);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) '4');
        int int16 = localDateTime15.getYearOfEra();
        org.joda.time.LocalDateTime.Property property17 = localDateTime15.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime19 = property17.addToCopy((int) '4');
        org.joda.time.Chronology chronology20 = property17.getChronology();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusHours((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = localDate5.compareTo((org.joda.time.ReadablePartial) localDateTime23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 28 + "'", int10 == 28);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 28 + "'", int11 == 28);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1970 + "'", int16 == 1970);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localDateTime6.getFields();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.weekyear();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = property7.getDifference(readableInstant8);
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = property7.setCopy("0035-01-04T07:00:00.052", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"0035-01-04T07:00:00.052\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) '4');
        int int26 = localDateTime25.getYearOfEra();
        org.joda.time.LocalDateTime.Property property27 = localDateTime25.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime29 = property27.addToCopy((int) '4');
        org.joda.time.Chronology chronology30 = property27.getChronology();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(chronology30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.minusSeconds((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime33.plusSeconds((int) (short) 100);
        boolean boolean38 = localDateTime17.equals((java.lang.Object) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1970 + "'", int26 == 1970);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minus(readablePeriod6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.yearOfCentury();
        int int9 = localDateTime7.getDayOfMonth();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = localDate9.withEra(2026);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2026 for era must be in the range [0,1]");
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
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((java.lang.Object) 271, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        java.util.Locale locale5 = null;
        int int6 = property3.getMaximumTextLength(locale5);
        org.joda.time.LocalDateTime localDateTime7 = property3.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusMinutes(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property10 = localDate9.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        int int12 = localDate9.indexOf(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("1970-01-01T07:00:00.052", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        org.joda.time.DurationField durationField7 = property6.getRangeDurationField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = property6.addToCopy((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNull(durationField7);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        int int10 = localDate5.getDayOfMonth();
        int int11 = localDate5.getDayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate5.minus(readablePeriod12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = localDate5.toString("1970-01-01T07:00:00.000");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 28 + "'", int11 == 28);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("1970-01-01T07:00:00.052");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1970-01-01T07:00:00.052\" is malformed at \"T07:00:00.052\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withCenturyOfEra(1);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMillisOfDay(7);
        org.joda.time.Chronology chronology7 = localDateTime6.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField8 = localDateTime0.getField((int) (byte) -1, chronology7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property3.getAsShortText(locale7);
        org.joda.time.DurationField durationField9 = property3.getRangeDurationField();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
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
        org.joda.time.DurationFieldType durationFieldType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = localDate13.withFieldAdded(durationFieldType14, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
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
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        int int6 = localDate0.size();
        org.joda.time.LocalTime localTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDate0.toLocalDateTime(localTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The time must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        int int9 = localDateTime8.getYearOfEra();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property11 = localDateTime8.era();
        org.joda.time.LocalDateTime.Property property12 = localDateTime8.hourOfDay();
        int int13 = localDateTime8.getYear();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withLocalMillis((long) 28320052);
        org.joda.time.Chronology chronology18 = localDateTime17.getChronology();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime8, chronology18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(5, 3, (int) (short) -1, 2026, (int) (byte) 10, (int) (short) 10, 2001, chronology18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2026 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(2026);
        org.joda.time.DateMidnight dateMidnight12 = localDate11.toDateMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = localDate11.withDayOfMonth(70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateMidnight12);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withLocalMillis((long) 28320052);
        org.joda.time.Chronology chronology8 = localDateTime7.getChronology();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 31, chronology8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(25200052, (int) ' ', (int) (short) 10, chronology8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withSecondOfMinute((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localDateTime2.getFields();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.minusDays(59);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.dayOfYear();
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = property6.setCopy("", locale8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
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
            org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((int) (byte) 100, (int) (short) 10, 10, (int) (short) 0, 2001, 0, 12, chronology31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2001 for minuteOfHour must be in the range [0,59]");
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
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(2026);
        org.joda.time.LocalDate localDate13 = localDate11.plusWeeks(19);
        org.joda.time.LocalDate.Property property14 = localDate11.dayOfYear();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "333" + "'", str16, "333");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundHalfFloorCopy();
        int int8 = localDateTime7.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate9 = localDate0.withPeriodAdded(readablePeriod7, (int) (short) -1);
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(53);
        org.joda.time.DurationFieldType durationFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = localDate11.withFieldAdded(durationFieldType12, 1970);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.minus(readablePeriod9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDateTime1.toDateTime(dateTimeZone3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withDurationAdded(readableDuration5, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYearOfEra((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        int int7 = localDateTime6.getWeekyear();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime9 = property8.withMinimumValue();
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = property8.setCopy("\u0e04\u0e28.", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"?.?.\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1970 + "'", int7 == 1970);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate5.withPeriodAdded(readablePeriod6, 0);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Interval interval10 = localDate8.toInterval(dateTimeZone9);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(interval10);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minusHours((-1));
        java.util.Date date12 = localDateTime7.toDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime7.withWeekOfWeekyear((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(date12);
// flaky "3) test0178(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 07:59:46 ICT 2026");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        int int5 = localDateTime4.getYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withEra(53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) '4');
        int int5 = localDateTime4.getYearOfEra();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime8 = property6.addToCopy((int) '4');
        org.joda.time.Chronology chronology9 = property6.getChronology();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(53, 28, 0, chronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        int int5 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate7 = localDate0.withDayOfYear(100);
        org.joda.time.LocalDate localDate9 = localDate7.minusWeeks(0);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) '4');
        int int12 = localDateTime11.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.dayOfYear();
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime15 = property14.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property14.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = localDate9.get(dateTimeFieldType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfMinute' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = localDate0.withWeekOfWeekyear((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) '4');
        int int10 = localDateTime9.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.dayOfYear();
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime13 = property12.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = property12.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property15 = localDate5.property(dateTimeFieldType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfMinute' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMinutes(31);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withYear(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime11.withDayOfMonth((int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for dayOfMonth must be in the range [1,31]");
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
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        org.joda.time.LocalDate localDate11 = localDate9.withYearOfCentury(52);
        org.joda.time.DurationFieldType durationFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = localDate9.withFieldAdded(durationFieldType12, 70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DurationField durationField5 = property4.getLeapDurationField();
        int int6 = property4.getMinimumValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNull(durationField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.withDayOfYear(4);
        org.joda.time.LocalDate localDate6 = localDate0.withYearOfCentury(3);
        int int7 = localDate0.getYearOfEra();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2026 + "'", int7 == 2026);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.withDayOfYear(4);
        org.joda.time.LocalDate localDate6 = localDate4.minusWeeks((int) (short) 10);
        org.joda.time.DurationFieldType durationFieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate6.withFieldAdded(durationFieldType7, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(8, 365, 59, 8, (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        boolean boolean6 = property5.isLeap();
        java.util.Locale locale7 = null;
        int int8 = property5.getMaximumTextLength(locale7);
        org.joda.time.LocalDateTime localDateTime10 = property5.addToCopy((long) 9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.weekyear();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusSeconds(5);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = localDateTime10.getValue(2001);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2001");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
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
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.millisOfSecond();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDate localDate26 = localDate23.withPeriodAdded(readablePeriod24, (int) (byte) -1);
        int int27 = localDate23.getYearOfEra();
        org.joda.time.LocalDate localDate29 = localDate23.plusDays(1970);
        org.joda.time.LocalDate localDate30 = localDate22.withFields((org.joda.time.ReadablePartial) localDate29);
        org.joda.time.LocalDate.Property property31 = localDate29.monthOfYear();
        org.joda.time.DateTime dateTime32 = localDate29.toDateTimeAtCurrentTime();
        // The following exception was thrown during execution in test generation
        try {
            int int33 = property21.getDifference((org.joda.time.ReadableInstant) dateTime32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -60971702867349");
        } catch (java.lang.ArithmeticException e) {
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
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2026 + "'", int27 == 2026);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTime32);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate localDate10 = localDate0.plusMonths((int) (short) 100);
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((java.lang.Object) localDate0, chronology27);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1970 + "'", int23 == 1970);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(chronology27);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withEra((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalTime localTime7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate0.toDateTime(localTime7, dateTimeZone8);
        org.joda.time.DateTime dateTime10 = localDate0.toDateTimeAtCurrentTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = localDate0.withDayOfWeek(40);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 40 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundHalfFloorCopy();
        org.joda.time.Chronology chronology6 = property4.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = property4.setCopy((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(2922789, (int) 'a', 0, (int) (byte) 0, 25200052, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25200052 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.DateTime dateTime10 = localDate9.toDateTimeAtStartOfDay();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) '4');
        int int13 = localDateTime12.getYearOfEra();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime16 = property14.addToCopy((int) '4');
        int int17 = localDateTime16.getEra();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = localDate9.isBefore((org.joda.time.ReadablePartial) localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate9 = localDate0.withYear((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType11 = localDate9.getFieldType(53);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate localDate10 = localDate5.minusDays(2001);
        int int11 = localDate5.getYearOfCentury();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 26 + "'", int11 == 26);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        java.lang.String str6 = property3.getAsString();
        org.joda.time.LocalDateTime localDateTime7 = property3.withMaximumValue();
        org.joda.time.DurationField durationField8 = property3.getRangeDurationField();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
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
        long long23 = property22.getMillis();
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1790553600000L + "'", long23 == 1790553600000L);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = localDate15.withDayOfYear((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfYear must be in the range [1,366]");
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
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localDateTime2.getFields();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = localDateTime2.toString(dateTimeFormatter4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withWeekOfWeekyear((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withCenturyOfEra(25200052);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25200052 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T07:00:00.000" + "'", str5, "1970-01-01T07:00:00.000");
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
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
        java.util.Locale locale23 = null;
        java.lang.String str24 = localDate5.toString("1970", locale23);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970" + "'", str24, "1970");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight10 = localDate9.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate9.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate9.minusDays(28);
        org.joda.time.DurationFieldType durationFieldType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = localDate9.withFieldAdded(durationFieldType15, 70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDate localDate10 = localDate7.withPeriodAdded(readablePeriod8, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight11 = localDate7.toDateMidnight();
        org.joda.time.LocalDate localDate13 = localDate7.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property14 = localDate13.year();
        org.joda.time.Chronology chronology15 = localDate13.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((int) ' ', 2032, 19, 1, 2, 25, 69, chronology15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2032 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        java.util.Date date10 = localDateTime9.toDate();
        int int11 = localDateTime9.getDayOfYear();
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withYear((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withWeekOfWeekyear(2922789);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922789 for weekOfWeekyear must be in the range [1,52]");
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
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(5, 11, (int) ' ', (int) 'a', 52, 0, 2001);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy(0L);
        org.joda.time.DurationFieldType durationFieldType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withFieldAdded(durationFieldType8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = localDate15.withEra(26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26 for era must be in the range [0,1]");
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
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
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
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localDate7.toDateTimeAtStartOfDay(dateTimeZone26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate29 = localDate7.withMonthOfYear(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
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
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(1, (int) (byte) 1, 28320052, 0, (int) (short) 100, 2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withDayOfWeek(2026);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2026 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) property19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDate$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        int int14 = localDate13.getCenturyOfEra();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        int int21 = localDateTime1.getDayOfMonth();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate0.minus(readablePeriod4);
        org.joda.time.LocalDate.Property property6 = localDate0.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = property6.setCopy("1970");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType12 = null;
        boolean boolean13 = localDateTime11.isSupported(durationFieldType12);
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = localDateTime11.toString("", locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusSeconds((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.plusSeconds((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDateTime13.toDateTime(dateTimeZone14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withMillisOfSecond((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
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
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        int int19 = property18.get();
        org.joda.time.DateTimeField dateTimeField20 = property18.getField();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        int int6 = localDateTime1.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.year();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusHours(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime1.withTime(25, (int) (short) 1, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime(dateTimeZone8);
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = property3.setCopy(70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 420L + "'", long10 == 420L);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        int int7 = localDate6.getDayOfMonth();
        org.joda.time.Interval interval8 = localDate6.toInterval();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) '4');
        int int11 = localDateTime10.getYearOfEra();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime14 = property12.addToCopy((int) '4');
        int int15 = localDateTime14.getEra();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.plus(readableDuration16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withDurationAdded(readableDuration20, 0);
        int int24 = localDateTime19.getValue(2);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime19.plusMonths(2);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = property27.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            int int29 = localDate6.get(dateTimeFieldType28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 28 + "'", int7 == 28);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) '#', 5, 271, 1970, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate6.withDayOfWeek(20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 20 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("333", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withCenturyOfEra(1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = localDate13.isBefore((org.joda.time.ReadablePartial) localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
        org.joda.time.LocalDate.Property property17 = localDate16.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate19 = localDate16.withWeekOfWeekyear((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.DateTime dateTime10 = localDate9.toDateTimeAtStartOfDay();
        int int11 = localDate9.getYear();
        org.joda.time.LocalTime localTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDate9.toLocalDateTime(localTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The time must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2001 + "'", int11 == 2001);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate localDate10 = localDate5.plusWeeks((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField12 = localDate10.getField(50);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 50");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = localDate8.withMonthOfYear(50);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 50 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusSeconds((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.plusSeconds((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDateTime13.toDateTime(dateTimeZone14);
        int int16 = localDateTime13.size();
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate20 = localDate17.withPeriodAdded(readablePeriod18, (int) (byte) -1);
        org.joda.time.LocalDate localDate22 = localDate17.plusWeeks(0);
        org.joda.time.LocalDate localDate24 = localDate22.withYear((int) ' ');
        org.joda.time.LocalDate localDate26 = localDate22.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate28 = localDate26.minusMonths(2026);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDate localDate30 = localDate28.plus(readablePeriod29);
        org.joda.time.Interval interval31 = localDate28.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            int int32 = localDateTime13.compareTo((org.joda.time.ReadablePartial) localDate28);
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
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(interval31);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withMillisOfDay(7);
        int int3 = localDateTime2.size();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate9 = localDate7.minusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(25200052, (-1), 20, 11, 70, 25200052, 2032, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate9 = localDate0.withYear((int) '4');
        long long10 = localDate0.getLocalMillis();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) '4');
        int int13 = localDateTime12.getYearOfEra();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime16 = property14.addToCopy((int) '4');
        int int17 = localDateTime16.getEra();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.plus(readableDuration18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withDurationAdded(readableDuration22, 0);
        int int25 = localDateTime21.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime21.minusMillis((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = localDate0.isEqual((org.joda.time.ReadablePartial) localDateTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1790553600000L + "'", long10 == 1790553600000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 28320052 + "'", int25 == 28320052);
        org.junit.Assert.assertNotNull(localDateTime27);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now(chronology6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withDurationAdded(readableDuration8, 53);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) '4');
        int int14 = localDateTime13.getYearOfEra();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.minuteOfHour();
        org.joda.time.LocalDateTime.Property property16 = localDateTime13.era();
        org.joda.time.LocalDateTime.Property property17 = localDateTime13.hourOfDay();
        int int18 = localDateTime13.getYear();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withLocalMillis((long) 28320052);
        org.joda.time.Chronology chronology23 = localDateTime22.getChronology();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime13, chronology23);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now(chronology23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField26 = localDateTime10.getField(1970, chronology23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 1970");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1970 + "'", int18 == 1970);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withYear(10);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withYearOfEra(12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(28, 11, 0, (int) '#', (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.LocalDate localDate10 = localDate7.plusDays(5);
        org.joda.time.DurationFieldType durationFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate10.withFieldAdded(durationFieldType11, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        int int9 = localDate8.size();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
        org.joda.time.LocalDate.Property property14 = localDate0.dayOfMonth();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withDayOfWeek((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        long long5 = property4.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = property4.getFieldType();
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDate localDate10 = localDate7.withPeriodAdded(readablePeriod8, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight11 = localDate7.toDateMidnight();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight11);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = property4.getDifference((org.joda.time.ReadableInstant) dateMidnight11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25200052L + "'", long5 == 25200052L);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateMidnight11);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField33 = localDate0.getField(2026, chronology32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2026");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
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
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDate localDate10 = localDate7.withPeriodAdded(readablePeriod8, (int) (byte) -1);
        org.joda.time.LocalDate localDate12 = localDate7.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate15 = localDate12.withPeriodAdded(readablePeriod13, 0);
        org.joda.time.Chronology chronology16 = localDate12.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(28, (int) '#', 2922789, 365, (int) (byte) 10, (-1), 7, chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
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
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) '4');
        int int17 = localDateTime16.getYearOfEra();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.minuteOfHour();
        org.joda.time.LocalDateTime.Property property19 = localDateTime16.era();
        long long20 = property19.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property19.getFieldType();
        boolean boolean22 = localDateTime10.isSupported(dateTimeFieldType21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = localDateTime10.withEra(40);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 40 for era must be in the range [0,1]");
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25200052L + "'", long20 == 25200052L);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDate localDate28 = localDate25.withPeriodAdded(readablePeriod26, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight29 = localDate25.toDateMidnight();
        org.joda.time.LocalDate localDate31 = localDate25.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property32 = localDate31.year();
        org.joda.time.Chronology chronology33 = localDate31.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((java.lang.Object) chronology24, chronology33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(chronology33);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 2032, dateTimeZone1);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("1970-01-01T07:00:00.000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1970-01-01T07:00:00.000\" is malformed at \"T07:00:00.000\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.centuryOfEra();
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = property1.setCopy("\u0e01\u0e31\u0e19\u0e22\u0e32\u0e22\u0e19", locale3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"???????\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.yearOfEra();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.plusWeeks(28);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate17 = localDate14.withPeriodAdded(readablePeriod15, (int) (byte) -1);
        org.joda.time.LocalDate localDate19 = localDate14.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDate localDate22 = localDate19.withPeriodAdded(readablePeriod20, 0);
        org.joda.time.Chronology chronology23 = localDate19.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField24 = localDateTime8.getField((int) (short) 10, chronology23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(chronology23);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        org.joda.time.LocalDate localDate11 = localDate7.withCenturyOfEra((int) '4');
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) '4');
        int int14 = localDateTime13.getYearOfEra();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.minuteOfHour();
        org.joda.time.LocalDateTime.Property property16 = localDateTime13.era();
        org.joda.time.LocalDateTime localDateTime17 = property16.roundHalfFloorCopy();
        org.joda.time.Chronology chronology18 = property16.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) '4', chronology18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Character");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        int int5 = property4.getMaximumValueOverall();
        org.joda.time.LocalDateTime localDateTime6 = property4.withMinimumValue();
        int int7 = property4.getMaximumValueOverall();
        boolean boolean8 = property4.isLeap();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 59 + "'", int5 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 59 + "'", int7 == 59);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(28320052, 2922789, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922789 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = property11.setCopy("hi!", locale13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for yearOfCentury is not supported");
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
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        org.joda.time.DurationField durationField7 = property6.getRangeDurationField();
        org.joda.time.ReadableInstant readableInstant8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = property6.getDifferenceAsLong(readableInstant8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNull(durationField7);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) '4');
        int int14 = localDateTime13.getYearOfEra();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.minuteOfHour();
        org.joda.time.LocalDateTime.Property property16 = localDateTime13.era();
        org.joda.time.LocalDateTime localDateTime17 = property16.roundHalfFloorCopy();
        org.joda.time.Chronology chronology18 = property16.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) (byte) 10, chronology18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        java.util.Date date6 = localDateTime1.toDate();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.plusDays(0);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((java.lang.Object) property9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate9 = localDate0.withYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Interval interval11 = localDate0.toInterval(dateTimeZone10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate0.withEra(7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 7 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(interval11);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate localDate10 = localDate0.plusMonths((int) (short) 100);
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
        org.joda.time.LocalDateTime localDateTime30 = localDateTime12.plusHours(26);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = localDate10.isBefore((org.joda.time.ReadablePartial) localDateTime30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1970 + "'", int23 == 1970);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(localDateTime30);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = localDate5.isSupported(dateTimeFieldType6);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) '4');
        int int10 = localDateTime9.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime17 = localDateTime9.withFields((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        int int19 = localDateTime16.indexOf(dateTimeFieldType18);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.plus(readableDuration20);
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
        org.joda.time.LocalDateTime.Property property42 = localDateTime21.property(dateTimeFieldType41);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate44 = localDate5.withField(dateTimeFieldType41, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(localDateTime21);
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
        org.junit.Assert.assertNotNull(property42);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
            org.joda.time.LocalDate localDate16 = localDate14.withDayOfWeek((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfWeek must be in the range [1,7]");
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
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) '4');
        int int17 = localDateTime16.getYearOfEra();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime20 = property18.addToCopy((int) '4');
        int int21 = localDateTime20.getEra();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.plus(readableDuration22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime20.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withDurationAdded(readableDuration26, 0);
        int int30 = localDateTime25.getValue(2);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime25.plusMonths(2);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property33.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate36 = localDate0.withField(dateTimeFieldType34, 28787742);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.weekyear();
        java.util.Locale locale8 = null;
        int int9 = property7.getMaximumShortTextLength(locale8);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
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
        int int29 = localDate24.getCenturyOfEra();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        org.joda.time.LocalDate localDate18 = localDate16.minusDays((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = localDate18.toDateMidnight(dateTimeZone19);
        long long21 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight20);
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
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 728293L + "'", long21 == 728293L);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        java.lang.String str6 = property5.getAsText();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = property5.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970" + "'", str6, "1970");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
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
        java.lang.Class<?> wildcardClass20 = property19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.yearOfEra();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.plusWeeks(28);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate16 = localDate13.withPeriodAdded(readablePeriod14, (int) (byte) -1);
        org.joda.time.LocalDate localDate18 = localDate13.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDate localDate21 = localDate13.withPeriodAdded(readablePeriod19, (-1));
        org.joda.time.LocalDate localDate23 = localDate21.withLocalMillis((long) 5);
        org.joda.time.LocalTime localTime24 = null;
        org.joda.time.DateTime dateTime25 = localDate21.toDateTime(localTime24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = localDateTime8.isAfter((org.joda.time.ReadablePartial) localDate21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(25200052L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = localDate1.withDayOfMonth(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
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
        org.joda.time.DurationField durationField14 = property9.getLeapDurationField();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
// flaky "4) test0272(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u0e01\u0e1e." + "'", str10, "\u0e01\u0e1e.");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears((int) (byte) -1);
        int int12 = localDateTime1.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property13 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime14 = property13.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.weekOfWeekyear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = localDateTime7.toString("1970-01-01T07:00:00.052");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
        org.joda.time.LocalDateTime.Property property18 = localDateTime10.monthOfYear();
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
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusSeconds((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.plusSeconds((int) (short) 100);
        int int14 = localDateTime9.getMinuteOfHour();
        java.util.Date date15 = localDateTime9.toDate();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky "5) test0276(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 59 + "'", int14 == 59);
        org.junit.Assert.assertNotNull(date15);
// flaky "1) test0276(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(date15.toString(), "Sat Sep 26 03:59:49 ICT 2026");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate6 = localDate3.withPeriodAdded(readablePeriod4, (int) (byte) -1);
        org.joda.time.LocalDate localDate8 = localDate3.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate11 = localDate8.withPeriodAdded(readablePeriod9, 0);
        org.joda.time.Chronology chronology12 = localDate8.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(2001, 69, (int) (short) 10, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = property3.setCopy("0035-01-04T07:00:00.052");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"0035-01-04T07:00:00.052\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, (-1));
        org.joda.time.LocalDate localDate10 = localDate8.withLocalMillis((long) 5);
        org.joda.time.LocalTime localTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDate10.toLocalDateTime(localTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The time must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate9 = localDate0.withYear((int) '4');
        org.joda.time.LocalDate localDate11 = localDate9.withWeekyear(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate9.withWeekOfWeekyear(69);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate localDate10 = localDate0.plusMonths((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) '4');
        int int14 = localDateTime13.getYearOfEra();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.minuteOfHour();
        int int16 = property15.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime18 = property15.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime19 = property15.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.dayOfMonth();
        org.joda.time.DurationField durationField21 = property20.getRangeDurationField();
        org.joda.time.Chronology chronology22 = property20.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField23 = localDate0.getField(3, chronology22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 59 + "'", int16 == 59);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(chronology22);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        org.joda.time.LocalDate localDate11 = localDate7.withCenturyOfEra((int) '4');
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) '4');
        int int14 = localDateTime13.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withDayOfYear(3);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfDay();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) '4');
        int int20 = localDateTime19.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property21 = localDateTime19.dayOfYear();
        org.joda.time.LocalDateTime.Property property22 = localDateTime19.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime23 = property22.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property22.getFieldType();
        int int25 = localDateTime16.get(dateTimeFieldType24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property26 = localDate7.property(dateTimeFieldType24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfMinute' is not supported");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusSeconds((int) (short) 1);
        int int12 = localDateTime9.getDayOfYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 269 + "'", int12 == 269);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        int int6 = localDateTime5.size();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.dayOfWeek();
        java.util.Locale locale17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = localDateTime12.toString("1970-01-01T07:00:00.000", locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(2026);
        org.joda.time.DateMidnight dateMidnight12 = localDate11.toDateMidnight();
        int int13 = localDate11.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) '4');
        int int16 = localDateTime15.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime25 = localDateTime15.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        java.util.Date date26 = localDateTime15.toDate();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) '4');
        int int29 = localDateTime28.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property30 = localDateTime28.dayOfYear();
        org.joda.time.LocalDateTime.Property property31 = localDateTime28.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime32 = property31.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property31.getFieldType();
        int int34 = localDateTime15.get(dateTimeFieldType33);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = localDate11.get(dateTimeFieldType33);
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
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 28 + "'", int13 == 28);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
        org.joda.time.LocalDateTime localDateTime19 = property18.roundFloorCopy();
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
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        java.lang.String str8 = property7.getAsString();
        java.util.Locale locale10 = null;
        org.joda.time.LocalDate localDate11 = property7.setCopy("271", locale10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType13 = localDate11.getFieldType((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026" + "'", str8, "2026");
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        int int5 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate7 = localDate0.withDayOfYear(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate0.withDayOfMonth(28787742);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28787742 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, (-1));
        org.joda.time.LocalDate localDate10 = localDate0.withDayOfYear((int) '#');
        org.joda.time.Chronology chronology11 = localDate0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray12 = localDate0.getFields();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = localDate0.getValue(25200052);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 25200052");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeFieldArray12);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
        int int12 = property2.get();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[centuryOfEra]" + "'", str3, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        boolean boolean9 = property8.isLeap();
        org.joda.time.LocalDate localDate10 = property8.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((java.lang.Object) property8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDate$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate0.year();
        org.joda.time.DurationField durationField4 = property3.getDurationField();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = localDate0.indexOf(dateTimeFieldType5);
        org.joda.time.DurationFieldType durationFieldType7 = null;
        boolean boolean8 = localDate0.isSupported(durationFieldType7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = localDate0.withYearOfCentury(2032);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2032 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDate localDate10 = localDate7.withPeriodAdded(readablePeriod8, (int) (byte) -1);
        org.joda.time.LocalDate localDate12 = localDate7.plusWeeks(0);
        org.joda.time.LocalDate localDate14 = localDate12.withYear((int) ' ');
        org.joda.time.LocalDate localDate16 = localDate12.withYearOfCentury((int) (byte) 1);
        int int17 = localDate12.getDayOfMonth();
        int int18 = localDate12.getDayOfMonth();
        org.joda.time.LocalDate.Property property19 = localDate12.yearOfCentury();
        org.joda.time.LocalDate localDate21 = localDate12.plusMonths((int) '4');
        org.joda.time.LocalDate.Property property22 = localDate12.year();
        org.joda.time.Chronology chronology23 = property22.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((int) ' ', 2922789, 11, 19, (int) (byte) 0, (int) '4', 1970, chronology23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 28 + "'", int17 == 28);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 28 + "'", int18 == 28);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(chronology23);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
        int int18 = localDateTime17.getMinuteOfHour();
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
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
        int int25 = localDate24.getWeekyear();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime9.withHourOfDay(2007);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2007 for hourOfDay must be in the range [0,23]");
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
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        int int7 = property6.getLeapAmount();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = property6.addToCopy(59);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withYear(4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withDayOfWeek(365);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for dayOfWeek must be in the range [1,7]");
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
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 70);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        java.lang.String str6 = property3.getAsString();
        org.joda.time.LocalDateTime localDateTime7 = property3.withMaximumValue();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        java.lang.Class<?> wildcardClass9 = property8.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        int int8 = property7.getMaximumValue();
        java.util.Locale locale9 = null;
        int int10 = property7.getMaximumShortTextLength(locale9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) property7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDate$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 365 + "'", int8 == 365);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((-1L));
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMinimumValue();
        int int6 = property4.getLeapAmount();
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = property4.getDifference(readableInstant7);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate12 = localDate9.withPeriodAdded(readablePeriod10, (int) (byte) -1);
        org.joda.time.LocalDate localDate14 = localDate9.plusWeeks(0);
        org.joda.time.LocalDate localDate16 = localDate14.withYear((int) ' ');
        org.joda.time.LocalDate localDate18 = localDate16.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property19 = localDate16.yearOfCentury();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDate localDate24 = localDate21.withPeriodAdded(readablePeriod22, (int) (byte) -1);
        int int25 = localDate21.getYearOfEra();
        org.joda.time.LocalDate localDate27 = localDate21.plusDays(1970);
        org.joda.time.LocalDate localDate28 = localDate20.withFields((org.joda.time.ReadablePartial) localDate27);
        org.joda.time.LocalDate.Property property29 = localDate27.monthOfYear();
        org.joda.time.LocalDate localDate31 = localDate27.withCenturyOfEra((int) '4');
        org.joda.time.LocalDate localDate33 = localDate31.withDayOfMonth((int) (byte) 10);
        boolean boolean34 = localDate16.isAfter((org.joda.time.ReadablePartial) localDate33);
        int int35 = localDate33.getDayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            int int36 = property4.compareTo((org.joda.time.ReadablePartial) localDate33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfMinute' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "6) test0306(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1790557190) + "'", int8 == (-1790557190));
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2026 + "'", int25 == 2026);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        java.util.Date date6 = localDateTime1.toDate();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.plusDays(0);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.monthOfYear();
        org.joda.time.Interval interval10 = property9.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = property9.setCopy("0035-01-04T07:00:00.052");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"0035-01-04T07:00:00.052\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((int) (byte) 100, (int) (short) 100, 2922789, 365, 70, 53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, (-1));
        org.joda.time.LocalDate localDate10 = localDate0.withDayOfYear((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = localDate0.toString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        int int10 = localDate5.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight11 = localDate5.toDateMidnight();
        org.joda.time.DateTime dateTime12 = localDate5.toDateTimeAtMidnight();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 28 + "'", int10 == 28);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(12, (int) (short) -1, 31, 32, 99, 28);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        java.lang.String str6 = property3.getAsString();
        org.joda.time.LocalDateTime localDateTime7 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withLocalMillis((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withMonthOfYear(26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = localDate3.withEra(8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 8 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("2026-09-28");
        org.joda.time.LocalDate.Property property2 = localDate1.dayOfYear();
        java.lang.String str3 = property2.toString();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[dayOfYear]" + "'", str3, "Property[dayOfYear]");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks(10);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withMinuteOfHour(0);
        int int13 = localDateTime8.getEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime8.withMonthOfYear(59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for monthOfYear must be in the range [1,12]");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        long long9 = localDate0.getLocalMillis();
        java.lang.String str10 = localDate0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localDate0.getValue(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1790553600000L + "'", long9 == 1790553600000L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-09-28" + "'", str10, "2026-09-28");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = property2.setCopy("centuryOfEra");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"centuryOfEra\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
        // The following exception was thrown during execution in test generation
        try {
            int int16 = localDateTime4.getValue(50);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 50");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2026 + "'", int6 == 2026);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.millisOfSecond();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = property7.compareTo(readablePartial8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        org.joda.time.DurationFieldType durationFieldType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = localDate7.withFieldAdded(durationFieldType13, 50);
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
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        int int10 = localDate9.getDayOfWeek();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        java.lang.String str5 = property3.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Property[dayOfYear]" + "'", str5, "Property[dayOfYear]");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        org.joda.time.LocalDate localDate11 = localDate9.withYearOfCentury(52);
        org.joda.time.LocalDate localDate13 = localDate9.withYear(0);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtStartOfDay(dateTimeZone14);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = localDateTime16.withTime((int) (short) -1, (int) (short) 100, 53, 40);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
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
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 19 + "'", int19 == 19);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.plusMinutes((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        int int5 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate7 = localDate0.withDayOfYear(100);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localDate7.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime6 = property3.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusDays(26);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withWeekyear((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withHourOfDay(25200052);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25200052 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        java.lang.Class<?> wildcardClass10 = localDate7.getClass();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        int int5 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate7 = localDate0.withDayOfYear(100);
        org.joda.time.LocalDate localDate9 = localDate7.minusWeeks(0);
        org.joda.time.DurationFieldType durationFieldType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = localDate7.withFieldAdded(durationFieldType10, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
        int int14 = localDate13.getCenturyOfEra();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusHours((int) '#');
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.plusWeeks((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withYearOfCentury((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plus(readableDuration7);
        boolean boolean9 = property4.equals((java.lang.Object) localDateTime6);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.minusYears(11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withDayOfWeek(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for dayOfWeek must be in the range [1,7]");
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears((int) (byte) -1);
        int int12 = localDateTime1.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property13 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime14 = property13.withMinimumValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate19 = localDate16.withPeriodAdded(readablePeriod17, (int) (byte) -1);
        org.joda.time.LocalDate localDate21 = localDate16.plusWeeks(0);
        org.joda.time.LocalDate localDate23 = localDate21.withYear((int) ' ');
        org.joda.time.LocalDate localDate25 = localDate23.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property26 = localDate23.yearOfCentury();
        org.joda.time.LocalDate localDate27 = property26.roundHalfCeilingCopy();
        int int28 = localDate27.getCenturyOfEra();
        org.joda.time.LocalDate.Property property29 = localDate27.weekyear();
        org.joda.time.Chronology chronology30 = localDate27.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField31 = localDate10.getField((int) '#', chronology30);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(chronology30);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withMonthOfYear(25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25 for monthOfYear must be in the range [1,12]");
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
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 28319952L + "'", long21 == 28319952L);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        java.lang.Object obj5 = null;
        boolean boolean6 = property4.equals(obj5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
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
        int int19 = property18.get();
        org.joda.time.LocalDateTime localDateTime21 = property18.addToCopy((long) (-1));
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        long long6 = property3.getMillis();
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = property3.setCopy("\u0e01\u0e31\u0e19\u0e22\u0e32\u0e22\u0e19", locale8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"???????\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 25200052L + "'", long6 == 25200052L);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withHourOfDay((-1790557189));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1790557189 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = localDate11.withDayOfYear(28320052);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28320052 for dayOfYear must be in the range [1,366]");
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
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate0.minus(readablePeriod4);
        org.joda.time.LocalDate.Property property6 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate7 = property6.roundHalfCeilingCopy();
        int int8 = localDate7.getCenturyOfEra();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
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
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfMonth();
        int int25 = localDateTime23.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) '4');
        int int28 = localDateTime27.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property29 = localDateTime27.dayOfYear();
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime31 = property30.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property30.getFieldType();
        org.joda.time.LocalDateTime.Property property33 = localDateTime23.property(dateTimeFieldType32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property34 = localDate13.property(dateTimeFieldType32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfMinute' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 25200052 + "'", int25 == 25200052);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertNotNull(property33);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, (-1));
        org.joda.time.LocalDate localDate10 = localDate0.withDayOfYear((int) '#');
        org.joda.time.Chronology chronology11 = localDate0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray12 = localDate0.getFields();
        org.joda.time.Interval interval13 = localDate0.toInterval();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeFieldArray12);
        org.junit.Assert.assertNotNull(interval13);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeZone2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((java.lang.Object) property5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        boolean boolean6 = property5.isLeap();
        java.util.Locale locale7 = null;
        int int8 = property5.getMaximumTextLength(locale7);
        org.joda.time.LocalDateTime localDateTime10 = property5.addToCopy((long) 9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.weekyear();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusSeconds(5);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime.Property property15 = localDateTime10.property(dateTimeFieldType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray21 = localDateTime1.getFieldTypes();
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
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray21);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate.Property property9 = localDate5.year();
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
        org.joda.time.LocalDate.Property property25 = localDate15.year();
        org.joda.time.Chronology chronology26 = property25.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((java.lang.Object) property9, chronology26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDate$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 28 + "'", int20 == 28);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 28 + "'", int21 == 28);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(chronology26);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        java.lang.String str9 = localDateTime7.toString();
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate13 = localDate10.withPeriodAdded(readablePeriod11, (int) (byte) -1);
        int int14 = localDate10.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        int int16 = localDate10.indexOf(dateTimeFieldType15);
        int int17 = localDate10.getYear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = localDateTime7.isBefore((org.joda.time.ReadablePartial) localDate10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01T07:00:00.000" + "'", str9, "1970-01-01T07:00:00.000");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2026 + "'", int14 == 2026);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2026 + "'", int17 == 2026);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
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
        int int13 = localDate12.getYearOfCentury();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "271" + "'", str9, "271");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        org.joda.time.LocalDateTime.Property property6 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minusMillis(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.withDayOfYear(4);
        org.joda.time.LocalDate localDate6 = localDate4.minusWeeks((int) (short) 10);
        java.lang.String str7 = localDate4.toString();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2026-01-04" + "'", str7, "2026-01-04");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate11 = localDate8.withPeriodAdded(readablePeriod9, (int) (byte) -1);
        int int12 = localDate8.getYearOfEra();
        org.joda.time.LocalDate localDate14 = localDate8.plusDays(1970);
        org.joda.time.LocalDate localDate15 = localDate7.withFields((org.joda.time.ReadablePartial) localDate14);
        boolean boolean17 = localDate14.equals((java.lang.Object) 100.0d);
        org.joda.time.LocalDate.Property property18 = localDate14.era();
        org.joda.time.LocalDate.Property property19 = localDate14.yearOfCentury();
        long long20 = property19.remainder();
        org.joda.time.Chronology chronology21 = property19.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(70, 50, (int) (byte) 100, 9, 28320052, 0, 40, chronology21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28320052 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2026 + "'", int12 == 2026);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 4233600000L + "'", long20 == 4233600000L);
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = localDate0.indexOf(dateTimeFieldType5);
        org.joda.time.DurationFieldType durationFieldType7 = null;
        boolean boolean8 = localDate0.isSupported(durationFieldType7);
        org.joda.time.LocalDate localDate10 = localDate0.minusMonths(3);
        org.joda.time.DurationFieldType durationFieldType11 = null;
        boolean boolean12 = localDate0.isSupported(durationFieldType11);
        int int13 = localDate0.size();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) '4');
        int int23 = localDateTime22.getYearOfEra();
        org.joda.time.LocalDateTime.Property property24 = localDateTime22.minuteOfHour();
        org.joda.time.LocalDateTime.Property property25 = localDateTime22.era();
        org.joda.time.LocalDateTime.Property property26 = localDateTime22.hourOfDay();
        int int27 = localDateTime22.getYear();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withLocalMillis((long) 28320052);
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime22, chronology32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField34 = localDateTime18.getField(25, chronology32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 25");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1970 + "'", int23 == 1970);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1970 + "'", int27 == 1970);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(chronology32);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.weekyear();
        org.joda.time.LocalDate localDate8 = property7.getLocalDate();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
        // The following exception was thrown during execution in test generation
        try {
            int int29 = localDateTime26.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
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
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1" + "'", str25, "1");
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfYear(3);
        int int5 = localDateTime1.getYearOfCentury();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 70 + "'", int5 == 70);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now(chronology6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withDurationAdded(readableDuration8, 53);
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate15 = localDate12.withPeriodAdded(readablePeriod13, (int) (byte) -1);
        org.joda.time.LocalDate localDate17 = localDate12.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate20 = localDate12.withPeriodAdded(readablePeriod18, (-1));
        org.joda.time.LocalDate localDate22 = localDate12.withDayOfYear((int) '#');
        org.joda.time.Chronology chronology23 = localDate12.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField24 = localDateTime7.getField(2922789, chronology23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2922789");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(chronology23);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        int int5 = property4.getMaximumValueOverall();
        org.joda.time.LocalDateTime localDateTime6 = property4.withMinimumValue();
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = property4.setCopy("", locale8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 59 + "'", int5 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
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
        int int16 = localDateTime15.getYearOfCentury();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 26 + "'", int16 == 26);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withTime(53, 3, 0, 28787742);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
            org.joda.time.LocalDateTime localDateTime14 = localDateTime5.withSecondOfMinute(365);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for secondOfMinute must be in the range [0,59]");
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
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusDays((-1));
        int int8 = localDateTime7.getHourOfDay();
        int int9 = localDateTime7.getMillisOfDay();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25200052 + "'", int9 == 25200052);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate0.minus(readablePeriod4);
        org.joda.time.LocalDate.Property property6 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate7 = property6.roundHalfCeilingCopy();
        int int8 = localDate7.getDayOfWeek();
        org.joda.time.LocalDate localDate10 = localDate7.withYear(0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = localDate0.indexOf(dateTimeFieldType5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate0.isSupported(dateTimeFieldType7);
        org.joda.time.DurationFieldType durationFieldType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate0.withFieldAdded(durationFieldType9, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        java.lang.String str8 = property7.getAsString();
        org.joda.time.LocalDate localDate9 = property7.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((java.lang.Object) property7, dateTimeZone10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDate$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026" + "'", str8, "2026");
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property10 = localDate9.weekOfWeekyear();
        int int11 = localDate9.getWeekyear();
        org.joda.time.LocalDate.Property property12 = localDate9.weekyear();
        org.joda.time.LocalDate localDate14 = property12.setCopy(9);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now(chronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((java.lang.Object) chronology6, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        int int19 = localDateTime16.getYearOfCentury();
        int int20 = localDateTime16.getDayOfWeek();
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDate localDate24 = localDate21.withPeriodAdded(readablePeriod22, (int) (byte) -1);
        org.joda.time.LocalDate localDate26 = localDate21.plusWeeks(0);
        org.joda.time.LocalDate localDate28 = localDate26.withYear((int) ' ');
        org.joda.time.LocalDate localDate30 = localDate28.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property31 = localDate28.yearOfCentury();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate33 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDate localDate36 = localDate33.withPeriodAdded(readablePeriod34, (int) (byte) -1);
        int int37 = localDate33.getYearOfEra();
        org.joda.time.LocalDate localDate39 = localDate33.plusDays(1970);
        org.joda.time.LocalDate localDate40 = localDate32.withFields((org.joda.time.ReadablePartial) localDate39);
        org.joda.time.LocalDate.Property property41 = localDate39.monthOfYear();
        org.joda.time.LocalDate localDate43 = localDate39.withCenturyOfEra((int) '4');
        org.joda.time.LocalDate localDate45 = localDate43.withDayOfMonth((int) (byte) 10);
        boolean boolean46 = localDate28.isAfter((org.joda.time.ReadablePartial) localDate45);
        int int47 = localDate45.getDayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean48 = localDateTime16.isBefore((org.joda.time.ReadablePartial) localDate45);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 70 + "'", int19 == 70);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2026 + "'", int37 == 2026);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 'a');
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate5 = localDate2.withPeriodAdded(readablePeriod3, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight6 = localDate2.toDateMidnight();
        org.joda.time.LocalDate localDate8 = localDate2.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property9 = localDate2.dayOfYear();
        org.joda.time.LocalDate localDate11 = property9.addWrapFieldToCopy((int) (short) 1);
        org.joda.time.DurationField durationField12 = property9.getRangeDurationField();
        org.joda.time.LocalDate localDate13 = property9.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDate13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) '4');
        int int27 = localDateTime26.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime34 = localDateTime26.withFields((org.joda.time.ReadablePartial) localDateTime33);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = null;
        int int36 = localDateTime33.indexOf(dateTimeFieldType35);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.LocalDateTime localDateTime38 = localDateTime33.plus(readableDuration37);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) '4');
        int int41 = localDateTime40.getYearOfEra();
        org.joda.time.LocalDateTime.Property property42 = localDateTime40.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime44 = property42.addToCopy((int) '4');
        int int45 = localDateTime44.getEra();
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.LocalDateTime localDateTime47 = localDateTime44.plus(readableDuration46);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime44.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.LocalDateTime localDateTime52 = localDateTime49.withDurationAdded(readableDuration50, 0);
        int int54 = localDateTime49.getValue(2);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime49.plusMonths(2);
        org.joda.time.LocalDateTime.Property property57 = localDateTime56.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = property57.getFieldType();
        org.joda.time.LocalDateTime.Property property59 = localDateTime38.property(dateTimeFieldType58);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate61 = localDate0.withField(dateTimeFieldType58, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2026 + "'", int18 == 2026);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1970 + "'", int41 == 1970);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(dateTimeFieldType58);
        org.junit.Assert.assertNotNull(property59);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        int int15 = localDateTime5.getMillisOfDay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 28320052 + "'", int15 == 28320052);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        int int18 = localDateTime15.getYearOfCentury();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 70 + "'", int18 == 70);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("centuryOfEra", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withMonthOfYear(2025);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2025 for monthOfYear must be in the range [1,12]");
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
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minusWeeks((int) (short) 10);
        int int7 = localDateTime6.getYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withHourOfDay(2001);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2001 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1969 + "'", int7 == 1969);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.withDayOfYear(4);
        org.joda.time.LocalDate localDate6 = localDate0.withYearOfCentury(3);
        int int7 = localDate0.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 40 + "'", int7 == 40);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfMonth();
        int int3 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) '4');
        int int6 = localDateTime5.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.dayOfYear();
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime9 = property8.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        org.joda.time.LocalDateTime.Property property11 = localDateTime1.property(dateTimeFieldType10);
        org.joda.time.DurationField durationField12 = property11.getRangeDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 25200052 + "'", int3 == 25200052);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(0, 28, 28, 11, (-1790557189), 2001, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1790557189 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(2026, 0, 26, (int) (byte) 0, (int) (short) 0, (int) (byte) 1, 31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime6 = property3.roundFloorCopy();
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.weekOfWeekyear();
        java.util.Locale locale9 = null;
        int int10 = property8.getMaximumTextLength(locale9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = property8.setCopy("2026");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2026 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.plus(readablePeriod14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withDayOfWeek(99);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for dayOfWeek must be in the range [1,7]");
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
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.DateTimeField dateTimeField5 = property3.getField();
        java.lang.String str6 = property3.getAsText();
        org.joda.time.Chronology chronology7 = property3.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((java.lang.Object) chronology7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("yearOfCentury", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 53);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = localDateTime1.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = localDate8.withDayOfMonth(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = property2.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withDayOfMonth(59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.lang.Object obj0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(obj0);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        java.lang.String str3 = property2.toString();
        int int4 = property2.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundHalfEvenCopy();
        long long6 = property2.getMillis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = property2.setCopy((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[centuryOfEra]" + "'", str3, "Property[centuryOfEra]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 25200052L + "'", long6 == 25200052L);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        boolean boolean10 = localDate7.equals((java.lang.Object) 100.0d);
        org.joda.time.LocalDate.Property property11 = localDate7.centuryOfEra();
        int int12 = localDate7.getDayOfWeek();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMillis(12);
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.yearOfCentury();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMinutes(31);
        int int14 = localDateTime11.getCenturyOfEra();
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate19 = localDate16.withPeriodAdded(readablePeriod17, (int) (byte) -1);
        org.joda.time.LocalDate localDate21 = localDate16.plusWeeks(0);
        org.joda.time.LocalDate localDate23 = localDate21.withYear((int) ' ');
        org.joda.time.LocalDate.Property property24 = localDate21.monthOfYear();
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate27 = localDate25.minusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = localDate25.toDateTimeAtCurrentTime(dateTimeZone28);
        int int30 = property24.compareTo((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DurationField durationField31 = property24.getRangeDurationField();
        org.joda.time.LocalDate localDate32 = property24.roundFloorCopy();
        org.joda.time.Chronology chronology33 = property24.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField34 = localDateTime11.getField(20, chronology33);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 20");
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
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(chronology33);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(0, 10, 100, 7, 10, 2001, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2001 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        // The following exception was thrown during execution in test generation
        try {
            int int15 = localDate7.getValue(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 9");
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
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withTime((int) (short) 0, 9, 69, 1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for secondOfMinute must be in the range [0,59]");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "7" + "'", str15, "7");
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate5 = property4.getLocalDate();
        int int6 = property4.getLeapAmount();
        org.joda.time.LocalDate localDate7 = property4.roundCeilingCopy();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalTime localTime7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate0.toDateTime(localTime7, dateTimeZone8);
        boolean boolean11 = localDate0.equals((java.lang.Object) "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) int15, dateTimeZone16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundFloorCopy();
        int int8 = localDateTime7.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withEra(52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(0L, dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = localDateTime17.withDate(25200000, 2007, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2007 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2026 + "'", int6 == 2026);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 70, dateTimeZone1);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = localDateTime4.getFields();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withHourOfDay(2001);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2001 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate10 = localDate7.minusWeeks(5);
        int int11 = localDate7.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate7.toDateTimeAtStartOfDay(dateTimeZone12);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2032 + "'", int11 == 2032);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = property11.setCopy("\u0e01\u0e1e.");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"?.?.\" for weekyear is not supported");
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
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = localDate9.toDateMidnight(dateTimeZone10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate9.withMonthOfYear(1869);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1869 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateMidnight11);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate10 = localDate7.minus(readablePeriod9);
        int int11 = localDate7.getDayOfMonth();
        org.joda.time.DateTimeField[] dateTimeFieldArray12 = localDate7.getFields();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 19 + "'", int11 == 19);
        org.junit.Assert.assertNotNull(dateTimeFieldArray12);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDateTime1.toDateTime(dateTimeZone6);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate12 = localDate9.withPeriodAdded(readablePeriod10, (int) (byte) -1);
        org.joda.time.LocalDate localDate14 = localDate9.plusWeeks(0);
        org.joda.time.LocalDate localDate16 = localDate14.withYear((int) ' ');
        org.joda.time.LocalDate localDate18 = localDate16.minusDays((int) (short) 0);
        java.util.Locale locale20 = null;
        java.lang.String str21 = localDate18.toString("271", locale20);
        org.joda.time.DateTime dateTime22 = localDate18.toDateTimeAtMidnight();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDate localDate24 = localDate18.plus(readablePeriod23);
        org.joda.time.Chronology chronology25 = localDate18.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField26 = localDateTime1.getField(12, chronology25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 12");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "271" + "'", str21, "271");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(chronology25);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate21 = localDate5.withWeekOfWeekyear(28320052);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28320052 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
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
        org.joda.time.LocalDate localDate17 = localDate9.plusDays(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField19 = localDate9.getField(53);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate localDate8 = localDate0.plusYears((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) localDate0, dateTimeZone9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("dayOfYear", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withEra(10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for era must be in the range [0,1]");
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
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("2026-09-28");
        org.joda.time.LocalDate.Property property2 = localDate1.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = property2.getFieldType();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = localDateTime21.toDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime21.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime21.withMillisOfSecond(28);
        boolean boolean27 = localDateTime9.isEqual((org.joda.time.ReadablePartial) localDateTime21);
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
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMinimumValue();
        java.util.Date date6 = localDateTime5.toDate();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromDateFields(date6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Jan 01 07:00:00 ICT 1");
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = localDate24.toString("Property[minuteOfHour]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
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
        org.junit.Assert.assertNotNull(localDate28);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
        int int28 = property7.getMinimumValueOverall();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-292275054) + "'", int28 == (-292275054));
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.monthOfYear();
        int int5 = localDateTime1.getMonthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = localDateTime1.getValue(28787742);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 28787742");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.withMillisOfDay(7);
        org.joda.time.Chronology chronology31 = localDateTime30.getChronology();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(chronology31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((java.lang.Object) property7, chronology31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDate$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(chronology31);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime(dateTimeZone8);
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        int int11 = property3.getMinimumValue();
        java.lang.String str12 = property3.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 420L + "'", long10 == 420L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[minuteOfHour]" + "'", str12, "Property[minuteOfHour]");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
        int int23 = localDate12.size();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.Interval interval7 = property3.toInterval();
        org.joda.time.LocalDateTime localDateTime8 = property3.withMaximumValue();
        java.util.Date date9 = localDateTime8.toDate();
        int int10 = localDateTime8.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withDayOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 07:59:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 70 + "'", int10 == 70);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate19 = localDate16.withPeriodAdded(readablePeriod17, (int) (byte) -1);
        org.joda.time.LocalDate localDate21 = localDate16.plusWeeks(0);
        org.joda.time.LocalDate localDate23 = localDate21.withYear((int) ' ');
        org.joda.time.LocalDate localDate25 = localDate21.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalTime localTime26 = null;
        org.joda.time.DateTime dateTime27 = localDate21.toDateTime(localTime26);
        org.joda.time.DateTime dateTime28 = localDate11.toDateTime((org.joda.time.ReadableInstant) dateTime27);
        int int29 = localDate11.getYearOfCentury();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 28 + "'", int13 == 28);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusMonths((int) ' ');
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.plusMonths(8);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate16 = localDate13.withPeriodAdded(readablePeriod14, (int) (byte) -1);
        int int17 = localDate13.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        int int19 = localDate13.indexOf(dateTimeFieldType18);
        int int20 = localDate13.getYearOfCentury();
        int int21 = localDate13.getEra();
        org.joda.time.LocalDate localDate23 = localDate13.withYearOfEra(14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = localDateTime7.isAfter((org.joda.time.ReadablePartial) localDate23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2026 + "'", int17 == 2026);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 26 + "'", int20 == 26);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(localDate23);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.yearOfCentury();
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = property4.setCopy("yearOfCentury", locale6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"yearOfCentury\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear(70);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localDateTime1.getFields();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        int int16 = property13.get();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
        org.joda.time.LocalDate.Property property17 = localDate16.weekyear();
        org.joda.time.LocalDate localDate19 = localDate16.plusMonths(52);
        org.joda.time.LocalDate localDate21 = localDate16.withDayOfYear(26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType23 = localDate16.getFieldType(52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeZone15);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.weekyear();
        int int19 = localDateTime17.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) '4');
        int int22 = localDateTime21.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property23 = localDateTime21.dayOfYear();
        org.joda.time.LocalDateTime.Property property24 = localDateTime21.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime25 = property24.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property24.getFieldType();
        boolean boolean27 = localDateTime17.isSupported(dateTimeFieldType26);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = localDate7.get(dateTimeFieldType26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfMinute' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2026 + "'", int19 == 2026);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.dayOfYear();
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = property1.setCopy("Property[dayOfYear]", locale3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Property[dayOfYear]\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime4.withTime((int) (byte) -1, 31, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate localDate10 = localDate0.plusMonths((int) (short) 100);
        org.joda.time.LocalDate.Property property11 = localDate10.weekyear();
        long long12 = property11.getMillis();
        org.joda.time.ReadableInstant readableInstant13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = property11.compareTo(readableInstant13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The instant must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2053555200000L + "'", long12 == 2053555200000L);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withDayOfWeek(28);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28 for dayOfWeek must be in the range [1,7]");
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = localDate0.indexOf(dateTimeFieldType5);
        org.joda.time.LocalDate localDate8 = localDate0.withWeekyear((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate10 = localDate8.minus(readablePeriod9);
        java.lang.Object obj11 = null;
        boolean boolean12 = localDate10.equals(obj11);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.Interval interval17 = localDate15.toInterval(dateTimeZone16);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(interval17);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        int int10 = localDate5.getDayOfMonth();
        int int11 = localDate5.getDayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate5.minus(readablePeriod12);
        org.joda.time.LocalDate.Property property14 = localDate13.year();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate13.toDateTimeAtCurrentTime(dateTimeZone15);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 28 + "'", int10 == 28);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 28 + "'", int11 == 28);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = property2.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '#');
        java.util.Locale locale10 = null;
        java.lang.String str11 = localDateTime8.toString("1970", locale10);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) '4');
        int int14 = localDateTime13.getYearOfEra();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime17 = property15.addToCopy((int) '4');
        int int18 = localDateTime17.getEra();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.plus(readableDuration19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withDurationAdded(readableDuration23, 0);
        int int26 = localDateTime22.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) '4');
        int int29 = localDateTime28.getYearOfEra();
        org.joda.time.LocalDateTime.Property property30 = localDateTime28.minuteOfHour();
        org.joda.time.LocalDateTime.Property property31 = localDateTime28.era();
        long long32 = property31.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property31.getFieldType();
        boolean boolean34 = localDateTime22.isSupported(dateTimeFieldType33);
        boolean boolean35 = localDateTime8.isSupported(dateTimeFieldType33);
        org.joda.time.LocalDateTime.Property property36 = localDateTime6.property(dateTimeFieldType33);
        org.joda.time.LocalDateTime localDateTime37 = property36.withMaximumValue();
        java.lang.String str38 = property36.getName();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970" + "'", str11, "1970");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 28320052 + "'", int26 == 28320052);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1970 + "'", int29 == 1970);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 25200052L + "'", long32 == 25200052L);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "era" + "'", str38, "era");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = localDate0.withMonthOfYear(271);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 271 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMinutes(31);
        long long14 = localDateTime13.getLocalMillis();
        int int15 = localDateTime13.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withWeekOfWeekyear(25260000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25260000 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 27092052L + "'", long14 == 27092052L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate20 = localDate17.withPeriodAdded(readablePeriod18, (int) (byte) -1);
        int int21 = localDate17.getYearOfEra();
        org.joda.time.LocalDate localDate23 = localDate17.plusDays(1970);
        org.joda.time.LocalDate localDate24 = localDate16.withFields((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.LocalDate.Property property25 = localDate23.monthOfYear();
        org.joda.time.LocalDate localDate27 = localDate23.withCenturyOfEra((int) '4');
        org.joda.time.LocalDate.Property property28 = localDate23.yearOfCentury();
        org.joda.time.Chronology chronology29 = property28.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField30 = localDate14.getField(32, chronology29);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2026 + "'", int21 == 2026);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(chronology29);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
        org.joda.time.Interval interval16 = localDate7.toInterval();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(interval16);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withMonthOfYear(2922789);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922789 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("1", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(2026);
        org.joda.time.DateMidnight dateMidnight12 = localDate11.toDateMidnight();
        int int13 = localDate11.getDayOfMonth();
        org.joda.time.LocalDate localDate15 = localDate11.plusDays(53);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 28 + "'", int13 == 28);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = localDateTime19.withDate(52, 365, 35);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for monthOfYear must be in the range [1,12]");
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
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(11, 100, 35, 2007, 2001);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2007 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = property2.withMaximumValue();
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localDateTime6.getFields();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate0.year();
        long long4 = property3.remainder();
        java.lang.String str5 = property3.toString();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 23328000000L + "'", long4 == 23328000000L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Property[year]" + "'", str5, "Property[year]");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
        java.util.Locale locale20 = null;
        int int21 = property19.getMaximumTextLength(locale20);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        int int19 = localDateTime16.getYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = localDateTime16.withDate(25260000, 25200052, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25200052 for monthOfYear must be in the range [1,12]");
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
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusMonths((int) ' ');
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.plusMonths(8);
        int int13 = localDateTime12.getMillisOfSecond();
        int int14 = localDateTime12.getDayOfMonth();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
// flaky "7) test0455(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 867 + "'", int13 == 867);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 28 + "'", int14 == 28);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        int int6 = localDateTime1.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.year();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusHours(10);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime9, dateTimeZone10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = localDateTime11.toString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        org.joda.time.LocalDate localDate11 = localDate7.minusWeeks((int) (byte) 1);
        int int12 = localDate7.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
        org.joda.time.DurationFieldType durationFieldType16 = null;
        boolean boolean17 = localDate13.isSupported(durationFieldType16);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeZone2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.weekyear();
        int int6 = localDateTime4.getYearOfEra();
        int int7 = localDateTime4.getMonthOfYear();
        int int8 = localDateTime4.getYearOfEra();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2026 + "'", int6 == 2026);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2026 + "'", int8 == 2026);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMinimumValue();
        int int6 = property4.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime7 = property4.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plus(readableDuration10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusSeconds(0);
        int int14 = localDateTime9.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property15 = localDateTime9.year();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime9.plusDays(0);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime9.plusMillis(69);
        boolean boolean20 = localDateTime7.isBefore((org.joda.time.ReadablePartial) localDateTime19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
        int int15 = property12.getMaximumValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(2032, (-1790557193), 69, 25, 28);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.minusYears(2026);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
        org.joda.time.LocalDateTime.Property property15 = localDateTime5.monthOfYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 70 + "'", int12 == 70);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalTime localTime10 = null;
        org.joda.time.DateTime dateTime11 = localDate5.toDateTime(localTime10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate5.withEra((-1790557189));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1790557189 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        long long14 = localDate10.getLocalMillis();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2611094400000L + "'", long14 == 2611094400000L);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withMillisOfSecond(28);
        int int7 = localDateTime6.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYear(28);
        int int10 = localDateTime6.getEra();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 19 + "'", int7 == 19);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfWeek();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withLocalMillis(0L);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        int int14 = localDateTime10.getCenturyOfEra();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((int) '4', 0, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeZone2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.minuteOfHour();
        int int6 = localDateTime4.getMillisOfDay();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property5);
// flaky "8) test0471(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53994173 + "'", int6 == 53994173);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((int) '#', 0, 2001);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withDayOfMonth(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
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
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("2026");
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withHourOfDay(2);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate7 = localDate4.withPeriodAdded(readablePeriod5, (int) (byte) -1);
        org.joda.time.LocalDate localDate9 = localDate4.plusWeeks(0);
        org.joda.time.LocalDate localDate11 = localDate9.withYear((int) ' ');
        org.joda.time.LocalDate localDate13 = localDate11.minusDays((int) (short) 0);
        java.util.Locale locale15 = null;
        java.lang.String str16 = localDate13.toString("271", locale15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 2026, dateTimeZone18);
        int[] intArray20 = localDate19.getValues();
        org.joda.time.LocalDate.Property property21 = localDate19.weekOfWeekyear();
        org.joda.time.LocalDate localDate23 = property21.addToCopy(10);
        org.joda.time.LocalDate localDate25 = property21.addToCopy(1970);
        int int26 = localDate25.getYearOfEra();
        org.joda.time.LocalDate.Property property27 = localDate25.weekOfWeekyear();
        org.joda.time.LocalDate localDate28 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDate localDate31 = localDate28.withPeriodAdded(readablePeriod29, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight32 = localDate28.toDateMidnight();
        org.joda.time.LocalDate localDate34 = localDate28.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property35 = localDate34.year();
        org.joda.time.DateTimeField dateTimeField36 = property35.getField();
        org.joda.time.LocalDate.Property property37 = new org.joda.time.LocalDate.Property(localDate25, dateTimeField36);
        org.joda.time.LocalDate.Property property38 = new org.joda.time.LocalDate.Property(localDate13, dateTimeField36);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = localDateTime1.isAfter((org.joda.time.ReadablePartial) localDate13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "271" + "'", str16, "271");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2007 + "'", int26 == 2007);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTimeField36);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusHours(20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate14 = localDate11.withPeriodAdded(readablePeriod12, (int) (byte) -1);
        org.joda.time.LocalDate localDate16 = localDate11.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate19 = localDate16.withPeriodAdded(readablePeriod17, 0);
        org.joda.time.Chronology chronology20 = localDate16.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField21 = localDate7.getField(25, chronology20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 25");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(chronology20);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(28320052, 9, 28320052, 28320052, 52, 271);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28320052 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        boolean boolean6 = property5.isLeap();
        java.util.Locale locale7 = null;
        int int8 = property5.getMaximumTextLength(locale7);
        org.joda.time.LocalDateTime localDateTime9 = property5.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusYears(1969);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusMinutes((int) (byte) 10);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtCurrentTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = localDate0.withDayOfMonth(40);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 40 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        org.joda.time.DateTimeField dateTimeField16 = property13.getField();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plus(readableDuration7);
        boolean boolean9 = property4.equals((java.lang.Object) localDateTime6);
        org.joda.time.LocalDateTime localDateTime10 = property4.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime11 = property4.withMinimumValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
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
        int int19 = localDate18.getWeekyear();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2026 + "'", int19 == 2026);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minus(readablePeriod6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        org.joda.time.LocalDate localDate11 = localDate9.withYearOfCentury(52);
        int int12 = localDate11.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) '4');
        int int15 = localDateTime14.getYearOfEra();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.minuteOfHour();
        int int17 = property16.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime19 = property16.addWrapFieldToCopy((int) 'a');
        org.joda.time.Interval interval20 = property16.toInterval();
        java.util.Locale locale22 = null;
        org.joda.time.LocalDateTime localDateTime23 = property16.setCopy("9", locale22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = localDate11.isEqual((org.joda.time.ReadablePartial) localDateTime23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 59 + "'", int17 == 59);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate9 = localDate0.withYear((int) '4');
        org.joda.time.LocalDate localDate11 = localDate9.withWeekyear(100);
        org.joda.time.LocalDate localDate13 = localDate9.withYear(2026);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = localDate9.withWeekOfWeekyear(28787742);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28787742 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        long long19 = property2.getMillis();
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 25200052L + "'", long19 == 25200052L);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        org.joda.time.LocalDate localDate11 = localDate7.withCenturyOfEra((int) '4');
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = localDate7.toString("dayOfYear", locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: O");
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
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(1969, (int) (short) 100, 1, (int) (byte) 100, 2025, (-292275054), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(0, 2007, 12, 8, 9, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2007 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        org.joda.time.LocalDate localDate22 = property8.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray23 = localDate22.getFieldTypes();
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
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray23);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minusHours((int) 'a');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withYearOfCentury(9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withMonthOfYear(26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
        org.joda.time.LocalDate localDate15 = property14.getLocalDate();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, (-1));
        org.joda.time.LocalDate localDate10 = localDate8.withLocalMillis((long) 5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = localDate10.withYearOfCentury(867);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 867 for yearOfCentury must be in the range [0,99]");
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
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.withDayOfYear(4);
        org.joda.time.LocalDate localDate6 = localDate0.plusMonths(2);
        org.joda.time.LocalDate.Property property7 = localDate0.yearOfEra();
        org.joda.time.LocalDate.Property property8 = localDate0.centuryOfEra();
        long long9 = property8.getMillis();
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = property8.setCopy("Property[year]", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Property[year]\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1790553600000L + "'", long9 == 1790553600000L);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate27 = localDate24.withDayOfWeek((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfWeek must be in the range [1,7]");
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
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2026 + "'", int18 == 2026);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2031-10-19" + "'", str25, "2031-10-19");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withEra(69);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
        org.joda.time.LocalDate.Property property25 = localDate0.yearOfCentury();
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
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = localDateTime13.toString(dateTimeFormatter15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky "9) test0498(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 521 + "'", int14 == 521);
// flaky "2) test0498(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2026-09-26T04:01:34.521" + "'", str16, "2026-09-26T04:01:34.521");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate20 = localDate17.withPeriodAdded(readablePeriod18, (int) (byte) -1);
        int int21 = localDate17.getYearOfEra();
        org.joda.time.LocalDate localDate23 = localDate17.plusDays(1970);
        org.joda.time.LocalDate localDate24 = localDate16.withFields((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.LocalDate.Property property25 = localDate23.monthOfYear();
        org.joda.time.LocalDate localDate27 = localDate23.withCenturyOfEra((int) '4');
        org.joda.time.LocalDate localDate29 = localDate23.minusDays((int) (byte) 100);
        org.joda.time.LocalDate.Property property30 = localDate29.dayOfWeek();
        org.joda.time.LocalDate localDate31 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalDate localDate34 = localDate31.withPeriodAdded(readablePeriod32, (int) (byte) -1);
        org.joda.time.LocalDate localDate36 = localDate31.plusWeeks(0);
        org.joda.time.LocalDate localDate38 = localDate36.withYear((int) ' ');
        org.joda.time.LocalDate localDate40 = localDate36.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalTime localTime41 = null;
        org.joda.time.DateTime dateTime42 = localDate36.toDateTime(localTime41);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = localDate36.toDateTimeAtCurrentTime(dateTimeZone43);
        int int45 = property30.getDifference((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime46 = localDate15.toDateTime((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateMidnight dateMidnight48 = localDate15.toDateMidnight(dateTimeZone47);
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
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2026 + "'", int21 == 2026);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1869 + "'", int45 == 1869);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateMidnight48);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate9 = property7.addWrapFieldToCopy((int) (short) 1);
        org.joda.time.DurationField durationField10 = property7.getRangeDurationField();
        org.joda.time.LocalDate localDate11 = property7.withMinimumValue();
        int int12 = localDate11.getDayOfMonth();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }
}
