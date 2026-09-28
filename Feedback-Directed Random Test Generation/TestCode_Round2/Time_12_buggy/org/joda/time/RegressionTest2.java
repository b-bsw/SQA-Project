package org.joda.time;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property3.getAsShortText(locale7);
        org.joda.time.LocalDateTime localDateTime9 = property3.roundHalfCeilingCopy();
        int int10 = localDateTime9.getDayOfMonth();
        int int11 = localDateTime9.getYearOfCentury();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 70 + "'", int11 == 70);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
        int int25 = localDateTime22.getMillisOfDay();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 25200052 + "'", int25 == 25200052);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        java.lang.String str3 = property2.toString();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundHalfFloorCopy();
        java.util.Locale locale6 = null;
        org.joda.time.LocalDateTime localDateTime7 = property2.setCopy("1970", locale6);
        org.joda.time.LocalDateTime localDateTime8 = property2.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) '4');
        int int11 = localDateTime10.getYearOfEra();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.minuteOfHour();
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray14 = localDateTime10.getFieldTypes();
        org.joda.time.LocalDateTime.Property property15 = localDateTime10.secondOfMinute();
        org.joda.time.LocalDateTime.Property property16 = localDateTime10.monthOfYear();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime10.minusWeeks(652);
        int int19 = localDateTime10.getYear();
        int int20 = property2.compareTo((org.joda.time.ReadablePartial) localDateTime10);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[centuryOfEra]" + "'", str3, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = localDate0.indexOf(dateTimeFieldType5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate0.isSupported(dateTimeFieldType7);
        int[] intArray9 = localDate0.getValues();
        int int10 = localDate0.getYearOfCentury();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 2026, 9, 28 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 26 + "'", int10 == 26);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(25200052L);
        org.joda.time.LocalDate localDate4 = localDate2.withLocalMillis(10L);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate9 = localDate6.withPeriodAdded(readablePeriod7, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight10 = localDate6.toDateMidnight();
        org.joda.time.LocalDate localDate12 = localDate6.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property13 = localDate12.year();
        org.joda.time.Chronology chronology14 = localDate12.getChronology();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((java.lang.Object) "2026", chronology14);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((java.lang.Object) 10L, chronology14);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) (short) 1, chronology14);
        org.joda.time.LocalDate localDate18 = org.joda.time.LocalDate.now(chronology14);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localDate18);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.withDayOfYear(32);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate8 = localDate6.plus(readablePeriod7);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        org.joda.time.LocalDateTime localDateTime16 = localDateTime8.withWeekyear(8);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.minuteOfHour();
        int int18 = localDateTime16.getDayOfMonth();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        java.lang.String str8 = property7.getAsText();
        org.joda.time.LocalDate localDate9 = property7.roundFloorCopy();
        org.joda.time.LocalDate localDate11 = property7.addToCopy((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = localDate11.withField(dateTimeFieldType12, 28319952);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
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
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = localDateTime18.toString(dateTimeFormatter20);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0012-01-05T00:00:00.052" + "'", str21, "0012-01-05T00:00:00.052");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        org.joda.time.LocalDate.Property property19 = localDate9.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((java.lang.Object) property19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDate$Property");
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
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMinimumValue();
        java.util.Date date6 = localDateTime5.toDate();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime8 = property7.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks(269);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Jan 01 07:00:00 ICT 1");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withMillisOfDay(7);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(chronology3);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(chronology3);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = localDateTime13.withEra(86399999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399999 for era must be in the range [0,1]");
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
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate9 = property7.addWrapFieldToCopy((int) (short) 1);
        long long10 = property7.getMillis();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1790553600000L + "'", long10 == 1790553600000L);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField16 = localDate13.getField(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 3");
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
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime6 = property3.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYearOfEra(12);
        int int9 = localDateTime8.getYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12 + "'", int9 == 12);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        org.joda.time.DateTime dateTime14 = localDate7.toDateTimeAtMidnight();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = localDate7.toString("2026-09-26T04:00:01.558");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        int int15 = localDate9.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 40 + "'", int15 == 40);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("2026-09-28", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        org.joda.time.LocalDateTime.Property property6 = localDateTime1.secondOfMinute();
        org.joda.time.Interval interval7 = property6.toInterval();
        java.lang.String str8 = property6.getAsString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMinimumValue();
        java.util.Date date6 = localDateTime5.toDate();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withDurationAdded(readableDuration7, 3938);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.withWeekOfWeekyear(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Jan 01 07:00:00 ICT 1");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate localDate8 = localDate0.plusMonths(2026);
        long long9 = localDate0.getLocalMillis();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1790553600000L + "'", long9 == 1790553600000L);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("2026-09-26T04:00:01.558", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDateTime1.toDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusYears(0);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withWeekyear(25);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.minusHours(1869);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 242, dateTimeZone1);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = localDateTime13.withWeekOfWeekyear(0);
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
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate localDate10 = localDate5.minusDays(2001);
        org.joda.time.LocalDate localDate12 = localDate10.plusDays((-292275054));
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate.Property property9 = localDate5.year();
        org.joda.time.LocalDate.Property property10 = localDate5.dayOfMonth();
        org.joda.time.Interval interval11 = localDate5.toInterval();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(interval11);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.DateTime dateTime7 = localDate0.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate9 = localDate0.withYear(25200052);
        org.joda.time.LocalDate localDate11 = localDate9.minusYears(28);
        org.joda.time.DurationFieldType durationFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = localDate9.withFieldAdded(durationFieldType12, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
            org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withTime(2, 2025, 15, 2007);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2025 for minuteOfHour must be in the range [0,59]");
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
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
        java.lang.String str25 = property10.getAsText();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "40" + "'", str25, "40");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusWeeks((-1790557189));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(25200052L);
        org.joda.time.LocalDate localDate3 = localDate1.withLocalMillis(10L);
        org.joda.time.LocalDate.Property property4 = localDate1.yearOfCentury();
        org.joda.time.DurationField durationField5 = property4.getRangeDurationField();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withMonthOfYear(32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
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
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfWeek();
        java.util.Locale locale5 = null;
        java.lang.String str6 = localDateTime1.toString("40", locale5);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "40" + "'", str6, "40");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        java.lang.String str6 = property5.getAsText();
        long long7 = property5.remainder();
        org.joda.time.LocalDateTime localDateTime9 = property5.addToCopy((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localDateTime9.getValue((-1790557193));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1790557193");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970" + "'", str6, "1970");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1580400052L + "'", long7 == 1580400052L);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        boolean boolean6 = property5.isLeap();
        java.util.Locale locale7 = null;
        int int8 = property5.getMaximumTextLength(locale7);
        org.joda.time.DurationField durationField9 = property5.getDurationField();
        org.joda.time.LocalDateTime localDateTime10 = property5.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusMillis(4);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusMinutes((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withMinuteOfHour(1832);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1832 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = localDate0.indexOf(dateTimeFieldType5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate0.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate.Property property9 = localDate0.yearOfCentury();
        int int10 = localDate0.getEra();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        int int8 = property7.getMaximumValue();
        org.joda.time.LocalDate localDate9 = property7.withMinimumValue();
        org.joda.time.LocalDate localDate10 = property7.withMaximumValue();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 365 + "'", int8 == 365);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
        org.joda.time.LocalDateTime.Property property15 = localDateTime7.millisOfDay();
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
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusMonths(26);
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
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.DurationField durationField4 = property3.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundCeilingCopy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.plusWeeks(52);
        int int11 = localDateTime10.getDayOfWeek();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localDateTime16.toDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.plusMillis(53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minus(readablePeriod6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime1.minuteOfHour();
        java.lang.String str9 = property8.getAsString();
        org.joda.time.LocalDateTime localDateTime11 = property8.setCopy("7");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localDateTime2.getFields();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = localDateTime2.toString(dateTimeFormatter4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMillisOfSecond(31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withEra(242);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 242 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T07:00:00.000" + "'", str5, "1970-01-01T07:00:00.000");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.hourOfDay();
        int int6 = localDateTime1.getYear();
        java.lang.String str8 = localDateTime1.toString("\u0e04\u0e28.");
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minusSeconds((int) ' ');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusMonths((int) (short) 1);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.centuryOfEra();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u0e04\u0e28." + "'", str8, "\u0e04\u0e28.");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear(35);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime8 = property6.addToCopy(1869);
        java.util.Locale locale9 = null;
        java.lang.String str10 = property6.getAsShortText(locale9);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970" + "'", str10, "1970");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        int int16 = localDateTime15.getYearOfEra();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2027 + "'", int16 == 2027);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate0.year();
        org.joda.time.LocalDate localDate5 = property3.addToCopy(3);
        long long6 = localDate5.getLocalMillis();
        org.joda.time.DurationFieldType durationFieldType7 = null;
        boolean boolean8 = localDate5.isSupported(durationFieldType7);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1885248000000L + "'", long6 == 1885248000000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        java.lang.String str17 = localDateTime13.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
// flaky "1) test1052(org.joda.time.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2026-09-24T04:00:04.537" + "'", str17, "2026-09-24T04:00:04.537");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = localDate7.toDateMidnight(dateTimeZone14);
        org.joda.time.DateTimeField[] dateTimeFieldArray16 = localDate7.getFields();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(dateTimeFieldArray16);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        org.joda.time.DurationFieldType durationFieldType24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withFieldAdded(durationFieldType24, 242);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear(70);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withPeriodAdded(readablePeriod7, 35);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfMonth();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        java.lang.String str6 = property3.getAsString();
        org.joda.time.LocalDateTime localDateTime8 = property3.addToCopy(19);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfMonth(28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        int int6 = localDateTime1.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.year();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusDays(0);
        int int10 = localDateTime9.getEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType12 = localDateTime9.getFieldType((-1790557189));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1790557189");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        java.lang.String str3 = property2.toString();
        int int4 = property2.getLeapAmount();
        java.util.Locale locale5 = null;
        int int6 = property2.getMaximumShortTextLength(locale5);
        org.joda.time.LocalDateTime localDateTime7 = property2.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = property2.setCopy("2031-10-19");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2031-10-19\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[centuryOfEra]" + "'", str3, "Property[centuryOfEra]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusDays(28319952);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        boolean boolean10 = localDate7.equals((java.lang.Object) 100.0d);
        org.joda.time.LocalDate localDate12 = localDate7.withWeekyear(28320052);
        org.joda.time.LocalDate localDate14 = localDate7.withCenturyOfEra(42);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        int int9 = localDateTime8.getYearOfEra();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime12 = property10.addToCopy((int) '4');
        org.joda.time.Chronology chronology13 = property10.getChronology();
        java.util.Locale locale14 = null;
        java.lang.String str15 = property10.getAsShortText(locale14);
        org.joda.time.LocalDateTime localDateTime16 = property10.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) '4');
        int int20 = localDateTime19.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime27 = localDateTime19.withFields((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) '4');
        int int30 = localDateTime29.getYearOfEra();
        org.joda.time.LocalDateTime.Property property31 = localDateTime29.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime33 = property31.addToCopy((int) '4');
        org.joda.time.Chronology chronology34 = property31.getChronology();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime19, chronology34);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(chronology34);
        org.joda.time.DateTimeField dateTimeField37 = localDateTime16.getField(0, chronology34);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(chronology34);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(867, 2026, 2001, (int) '4', 1869, 365, 2037, chronology34);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1970 + "'", int30 == 1970);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField37);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '#');
        java.util.Locale locale3 = null;
        java.lang.String str4 = localDateTime1.toString("1970", locale3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.plusHours(25200052);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970" + "'", str4, "1970");
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        org.joda.time.LocalDateTime localDateTime19 = property17.addToCopy(35);
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
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate0.year();
        org.joda.time.LocalDate localDate5 = property3.addToCopy(3);
        int int6 = property3.getMinimumValue();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-292275054) + "'", int6 == (-292275054));
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        int int12 = localDate0.getCenturyOfEra();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfWeek();
        int int17 = localDateTime15.getMinuteOfHour();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now(chronology27);
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
        org.junit.Assert.assertNotNull(localDateTime31);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withYear(10);
        org.joda.time.Chronology chronology8 = localDateTime5.getChronology();
        int int9 = localDateTime5.getDayOfMonth();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        int int9 = localDateTime7.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.plusSeconds((-1790557189));
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.minusHours((int) (short) 0);
        org.joda.time.LocalDateTime.Property property14 = localDateTime7.minuteOfHour();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusSeconds(0);
        java.lang.String str5 = localDateTime2.toString();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T07:00:00.000" + "'", str5, "1970-01-01T07:00:00.000");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        org.joda.time.LocalTime localTime10 = null;
        org.joda.time.DateTime dateTime11 = localDate7.toDateTime(localTime10);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) '4');
        int int15 = localDateTime14.getYearOfEra();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime18 = property16.addToCopy((int) '4');
        org.joda.time.Chronology chronology19 = property16.getChronology();
        java.util.Locale locale20 = null;
        java.lang.String str21 = property16.getAsShortText(locale20);
        org.joda.time.LocalDateTime localDateTime22 = property16.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) '4');
        int int25 = localDateTime24.getYearOfEra();
        org.joda.time.LocalDateTime.Property property26 = localDateTime24.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime28 = property26.addToCopy((int) '4');
        org.joda.time.Chronology chronology29 = property26.getChronology();
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now(chronology29);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withDurationAdded(readableDuration31, 53);
        boolean boolean34 = localDateTime22.equals((java.lang.Object) localDateTime30);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.minusMillis(100);
        org.joda.time.Chronology chronology37 = localDateTime36.getChronology();
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(chronology37);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(chronology37);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField40 = localDate7.getField(26, chronology37);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 26");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0" + "'", str21, "0");
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1970 + "'", int25 == 1970);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(localDateTime38);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
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
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime21 = property20.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime22 = property20.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) '4');
        int int25 = localDateTime24.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property26 = localDateTime24.dayOfYear();
        org.joda.time.LocalDateTime.Property property27 = localDateTime24.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime28 = property27.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = property27.getFieldType();
        int int30 = localDateTime22.get(dateTimeFieldType29);
        int int31 = localDateTime13.get(dateTimeFieldType29);
        org.joda.time.DurationFieldType durationFieldType32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime34 = localDateTime13.withFieldAdded(durationFieldType32, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
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
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        org.joda.time.DateTimeField dateTimeField16 = property12.getField();
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
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = localDate0.indexOf(dateTimeFieldType5);
        org.joda.time.LocalDate localDate8 = localDate0.withWeekyear((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) '4');
        int int11 = localDateTime10.getYearOfEra();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime14 = property12.addToCopy((int) '4');
        int int15 = localDateTime14.getEra();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.plus(readableDuration16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.plusMillis(0);
        int int21 = localDateTime14.getValue(2);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime14.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusYears(3);
        org.joda.time.DateTime dateTime26 = localDateTime25.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = localDate0.isAfter((org.joda.time.ReadablePartial) localDateTime25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
        int int12 = property5.get();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        int int10 = localDate7.getMonthOfYear();
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
            org.joda.time.DateTimeField dateTimeField23 = localDate7.getField(35, chronology22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 35");
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
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        org.joda.time.LocalDateTime.Property property33 = localDateTime14.weekOfWeekyear();
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
        org.junit.Assert.assertNotNull(property33);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate0.withDayOfYear(2037);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2037 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateMidnight11);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfDay(2);
        int int5 = localDateTime4.getEra();
        int int6 = localDateTime4.getCenturyOfEra();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1885248000000L);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withMinuteOfHour(28787742);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28787742 for minuteOfHour must be in the range [0,59]");
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
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime6 = property3.roundFloorCopy();
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.weekOfWeekyear();
        java.lang.Class<?> wildcardClass9 = property8.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDateTime1.toDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusYears(0);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withWeekyear(25);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.dayOfMonth();
        org.joda.time.Interval interval14 = property13.toInterval();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(interval14);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.LocalDate localDate10 = localDate7.plusDays(5);
        org.joda.time.LocalDate localDate12 = localDate7.withDayOfMonth(28);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = localDate7.getFieldTypes();
        java.util.Locale locale15 = null;
        java.lang.String str16 = localDate7.toString("1", locale15);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime1.withCenturyOfEra(271);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.era();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.withDayOfYear(4);
        org.joda.time.LocalDate localDate6 = localDate4.minusWeeks((int) (short) 10);
        int int7 = localDate4.getYear();
        org.joda.time.LocalDate.Property property8 = localDate4.dayOfMonth();
        org.joda.time.LocalDate.Property property9 = localDate4.year();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2026 + "'", int7 == 2026);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        int int10 = localDate5.getDayOfMonth();
        int int11 = localDate5.getDayOfMonth();
        java.lang.String str13 = localDate5.toString("52");
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 28 + "'", int10 == 28);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 28 + "'", int11 == 28);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "52" + "'", str13, "52");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        org.joda.time.LocalDate localDate33 = localDate30.minusMonths(25);
        org.joda.time.LocalDate.Property property34 = localDate33.yearOfCentury();
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
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(property34);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusWeeks(25260000);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) '4');
        int int14 = localDateTime13.getYearOfEra();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime17 = property15.addToCopy((int) '4');
        int int18 = localDateTime17.getEra();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) '4');
        int int21 = localDateTime20.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime20.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime28 = localDateTime20.withFields((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = null;
        int int30 = localDateTime27.indexOf(dateTimeFieldType29);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.plus(readableDuration31);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) '4');
        int int35 = localDateTime34.getYearOfEra();
        org.joda.time.LocalDateTime.Property property36 = localDateTime34.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime38 = property36.addToCopy((int) '4');
        int int39 = localDateTime38.getEra();
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.plus(readableDuration40);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime38.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.withDurationAdded(readableDuration44, 0);
        int int48 = localDateTime43.getValue(2);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime43.plusMonths(2);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = property51.getFieldType();
        org.joda.time.LocalDateTime.Property property53 = localDateTime32.property(dateTimeFieldType52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime17.property(dateTimeFieldType52);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate56 = localDate9.withField(dateTimeFieldType52, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1970 + "'", int35 == 1970);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTimeFieldType52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(property54);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        java.lang.String str3 = property2.toString();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDateTime5.toDateTime(dateTimeZone6);
        int int8 = property2.getDifference((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.LocalDateTime localDateTime10 = property2.addToCopy(12);
        java.lang.String str11 = property2.getName();
        org.joda.time.LocalDateTime localDateTime12 = property2.withMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[centuryOfEra]" + "'", str3, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "centuryOfEra" + "'", str11, "centuryOfEra");
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusMillis((int) (byte) 10);
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
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
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
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDate localDate22 = localDate19.withPeriodAdded(readablePeriod20, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight23 = localDate19.toDateMidnight();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = localDate24.toDateMidnight(dateTimeZone25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = localDateTime16.isEqual((org.joda.time.ReadablePartial) localDate24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(dateMidnight26);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate6 = property4.addToCopy(10);
        org.joda.time.LocalDate localDate8 = property4.addToCopy(1970);
        int int9 = localDate8.getYearOfEra();
        int int10 = localDate8.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2007 + "'", int9 == 2007);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        org.joda.time.LocalDateTime localDateTime14 = localDateTime1.minusMinutes(1);
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = localDateTime1.toString("0035-01-04T07:00:00.052", locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        int int7 = localDateTime1.getMillisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withPeriodAdded(readablePeriod8, 40);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime1.withField(dateTimeFieldType11, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
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
        java.lang.String str15 = property8.getAsString();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9" + "'", str15, "9");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
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
        org.joda.time.LocalDate localDate17 = localDate13.plusYears(31);
        org.joda.time.LocalDate localDate19 = localDate17.plusYears(0);
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
        org.junit.Assert.assertNotNull(localDate19);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.minusWeeks((int) (byte) 10);
        org.joda.time.LocalDate.Property property3 = localDate2.yearOfEra();
        java.lang.String str4 = property3.getAsString();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2026" + "'", str4, "2026");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate10 = localDate7.minusWeeks(5);
        int int11 = localDate7.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType13 = localDate7.getFieldType((-1790557193));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1790557193");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDate localDate10 = localDate7.withPeriodAdded(readablePeriod8, (int) (byte) -1);
        org.joda.time.LocalDate localDate12 = localDate7.plusWeeks(0);
        org.joda.time.LocalDate localDate14 = localDate12.withYear((int) ' ');
        org.joda.time.LocalDate localDate16 = localDate14.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property17 = localDate14.yearOfCentury();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDate localDate22 = localDate19.withPeriodAdded(readablePeriod20, (int) (byte) -1);
        int int23 = localDate19.getYearOfEra();
        org.joda.time.LocalDate localDate25 = localDate19.plusDays(1970);
        org.joda.time.LocalDate localDate26 = localDate18.withFields((org.joda.time.ReadablePartial) localDate25);
        org.joda.time.LocalDate.Property property27 = localDate25.monthOfYear();
        org.joda.time.LocalDate localDate29 = localDate25.withCenturyOfEra((int) '4');
        org.joda.time.LocalDate localDate31 = localDate29.withDayOfMonth((int) (byte) 10);
        boolean boolean32 = localDate14.isAfter((org.joda.time.ReadablePartial) localDate31);
        org.joda.time.LocalDate.Property property33 = localDate31.dayOfMonth();
        org.joda.time.LocalDate localDate34 = property33.roundHalfFloorCopy();
        org.joda.time.Chronology chronology35 = localDate34.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(59, 99, 5232, 40, 25, 3, 3, chronology35);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 40 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2026 + "'", int23 == 2026);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(chronology35);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDateTime1.toDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval6 = property5.toInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        int[] intArray20 = localDateTime17.getValues();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.minusYears(365);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 1970, 1, 1, 25200052 });
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMonthOfYear(2);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.minus(readableDuration6);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) '4');
        int int10 = localDateTime9.getYearOfEra();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.minuteOfHour();
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = localDateTime9.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) '4');
        int int16 = localDateTime15.getYearOfEra();
        org.joda.time.LocalDateTime.Property property17 = localDateTime15.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime19 = property17.addToCopy((int) '4');
        org.joda.time.Chronology chronology20 = property17.getChronology();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.minusHours((-1));
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusWeeks(52);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusMillis(8);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) '#');
        java.util.Locale locale33 = null;
        java.lang.String str34 = localDateTime31.toString("1970", locale33);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) '4');
        int int37 = localDateTime36.getYearOfEra();
        org.joda.time.LocalDateTime.Property property38 = localDateTime36.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime40 = property38.addToCopy((int) '4');
        int int41 = localDateTime40.getEra();
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.plus(readableDuration42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime40.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withDurationAdded(readableDuration46, 0);
        int int49 = localDateTime45.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) '4');
        int int52 = localDateTime51.getYearOfEra();
        org.joda.time.LocalDateTime.Property property53 = localDateTime51.minuteOfHour();
        org.joda.time.LocalDateTime.Property property54 = localDateTime51.era();
        long long55 = property54.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = property54.getFieldType();
        boolean boolean57 = localDateTime45.isSupported(dateTimeFieldType56);
        boolean boolean58 = localDateTime31.isSupported(dateTimeFieldType56);
        boolean boolean59 = localDateTime27.isSupported(dateTimeFieldType56);
        org.joda.time.LocalDateTime.Property property60 = localDateTime9.property(dateTimeFieldType56);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime62 = localDateTime7.withField(dateTimeFieldType56, 999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1970 + "'", int16 == 1970);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1970" + "'", str34, "1970");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1970 + "'", int37 == 1970);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 28320052 + "'", int49 == 28320052);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1970 + "'", int52 == 1970);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 25200052L + "'", long55 == 25200052L);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(property60);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate.Property property9 = localDate5.year();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate12 = localDate5.withPeriodAdded(readablePeriod10, 2026);
        org.joda.time.LocalDate.Property property13 = localDate12.monthOfYear();
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate17 = localDate14.withPeriodAdded(readablePeriod15, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight18 = localDate14.toDateMidnight();
        int int19 = property13.getDifference((org.joda.time.ReadableInstant) dateMidnight18);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfWeek();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundHalfEvenCopy();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withPeriodAdded(readablePeriod6, 1969);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime5.withDayOfMonth(333);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 333 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now(chronology11);
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate19 = localDate16.withPeriodAdded(readablePeriod17, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight20 = localDate16.toDateMidnight();
        org.joda.time.LocalDate localDate22 = localDate16.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property23 = localDate22.year();
        org.joda.time.Chronology chronology24 = localDate22.getChronology();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((java.lang.Object) "2026", chronology24);
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.now(chronology24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField27 = localDateTime13.getField(1869, chronology24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 1869");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(localDate26);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusWeeks((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withDurationAdded(readableDuration8, 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plus(readableDuration3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = localDateTime1.toString("\u0e21\u0e04.", locale6);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u0e21\u0e04." + "'", str7, "\u0e21\u0e04.");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType12 = null;
        boolean boolean13 = localDateTime11.isSupported(durationFieldType12);
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
        java.lang.String str39 = localDate38.toString();
        org.joda.time.Interval interval40 = localDate38.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            int int41 = localDateTime11.compareTo((org.joda.time.ReadablePartial) localDate38);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "2031-10-19" + "'", str39, "2031-10-19");
        org.junit.Assert.assertNotNull(interval40);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy(0L);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusMinutes(59);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate14 = localDate11.withPeriodAdded(readablePeriod12, (int) (byte) -1);
        int int15 = localDate11.getYearOfEra();
        org.joda.time.LocalDate localDate17 = localDate11.plusDays(1970);
        org.joda.time.LocalDate localDate18 = localDate10.withFields((org.joda.time.ReadablePartial) localDate17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDate localDate20 = localDate17.minus(readablePeriod19);
        int int21 = localDate17.getDayOfMonth();
        int int22 = localDate17.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = localDateTime9.compareTo((org.joda.time.ReadablePartial) localDate17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2026 + "'", int15 == 2026);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19 + "'", int21 == 19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        org.joda.time.DurationField durationField9 = property8.getRangeDurationField();
        org.joda.time.Chronology chronology10 = property8.getChronology();
        org.joda.time.LocalDateTime localDateTime12 = property8.addToCopy(2026);
        java.lang.String str13 = property8.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = property8.getFieldType();
        java.lang.String str15 = property8.getAsText();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "dayOfMonth" + "'", str13, "dayOfMonth");
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(2026);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate9.withEra(69);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType32 = localDateTime6.getFieldType(11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 11");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        java.lang.String str3 = property2.toString();
        int int4 = property2.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundHalfEvenCopy();
        long long6 = property2.getMillis();
        java.lang.String str7 = property2.getAsShortText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[centuryOfEra]" + "'", str3, "Property[centuryOfEra]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 25200052L + "'", long6 == 25200052L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "19" + "'", str7, "19");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withMillisOfDay(7);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plus(readableDuration5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime4.withTime(271, 25200052, (int) '#', 35);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 271 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate localDate8 = localDate6.withYearOfEra(100);
        org.joda.time.Interval interval9 = localDate6.toInterval();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(interval9);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        int int14 = localDate5.getDayOfYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 271 + "'", int14 == 271);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 2);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate6 = property4.addToCopy(10);
        org.joda.time.LocalDate localDate8 = property4.addToCopy(1970);
        int int9 = localDate8.getYearOfEra();
        org.joda.time.LocalDate.Property property10 = localDate8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = property10.getField();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeField11, dateTimeZone12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField");
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
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
        int[] intArray14 = localDate10.getValues();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Oct 04 00:00:00 ICT 2");
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 10, 4 });
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        java.lang.Object obj0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(obj0);
        org.joda.time.LocalDate localDate3 = localDate1.minusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) '4');
        int int6 = localDateTime5.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.withFields((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime5.plusYears((int) (byte) -1);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plus(readableDuration16);
        int int18 = localDateTime17.size();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.plus(readablePeriod19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = localDate3.isAfter((org.joda.time.ReadablePartial) localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        org.joda.time.LocalDate localDate8 = property7.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField10 = localDate8.getField(55);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 55");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
        int int21 = localDateTime20.getMinuteOfHour();
        org.joda.time.DateTime dateTime22 = localDateTime20.toDateTime();
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDate localDate27 = localDate24.withPeriodAdded(readablePeriod25, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight28 = localDate24.toDateMidnight();
        org.joda.time.LocalDate localDate30 = localDate24.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property31 = localDate30.year();
        org.joda.time.Chronology chronology32 = localDate30.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField33 = localDateTime20.getField(25200000, chronology32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 25200000");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(chronology32);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
        int[] intArray20 = localDateTime16.getValues();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = localDateTime16.withCenturyOfEra((-1790557189));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1790557189 for centuryOfEra must be in the range [0,2922789]");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 70 + "'", int19 == 70);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 1970, 1, 1, 28319952 });
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.minusWeeks((int) (byte) 10);
        org.joda.time.LocalDate localDate4 = localDate0.withYear(69);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate localDate10 = localDate5.plusWeeks((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) '4');
        int int13 = localDateTime12.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime20 = localDateTime12.withFields((org.joda.time.ReadablePartial) localDateTime19);
        java.util.Date date21 = localDateTime20.toDate();
        int int22 = localDateTime20.getDayOfYear();
        org.joda.time.LocalDateTime.Property property23 = localDateTime20.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime25 = property23.addWrapFieldToCopy(5);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withYearOfEra((int) '4');
        org.joda.time.LocalDateTime.Property property28 = localDateTime25.era();
        java.util.Locale locale29 = null;
        java.lang.String str30 = property28.getAsText(locale29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property28.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate33 = localDate5.withField(dateTimeFieldType31, 55);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 55 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property28);
// flaky "2) test1126(org.joda.time.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u0e04\u0e28." + "'", str30, "\u0e04\u0e28.");
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate0.minus(readablePeriod2);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = localDateTime14.withDate(35, 28, 366);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28 for monthOfYear must be in the range [1,12]");
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
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        boolean boolean10 = localDate7.equals((java.lang.Object) 100.0d);
        org.joda.time.LocalDate localDate12 = localDate7.withWeekyear(28320052);
        org.joda.time.DateMidnight dateMidnight13 = localDate7.toDateMidnight();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateMidnight13);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate15 = localDate0.withPeriodAdded(readablePeriod13, 53);
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
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plusSeconds(32);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.minusHours(8);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDateTime localDateTime37 = localDateTime32.withPeriodAdded(readablePeriod35, 99);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.withLocalMillis(1799020800000L);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = localDate15.compareTo((org.joda.time.ReadablePartial) localDateTime37);
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
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1970 + "'", int18 == 1970);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
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
        boolean boolean14 = property10.isLeap();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        org.joda.time.LocalDateTime.Property property6 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.minusWeeks(652);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withMonthOfYear(48);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 48 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
        org.joda.time.LocalDateTime localDateTime19 = localDateTime9.minusMillis(1969);
        int int20 = localDateTime19.getMillisOfDay();
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
        org.junit.Assert.assertNotNull(localDateTime19);
// flaky "3) test1133(org.joda.time.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 14403717 + "'", int20 == 14403717);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(9, 42, 14, 12, 333, 0, 50);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 333 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate10 = localDate7.minus(readablePeriod9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = localDate7.withDayOfWeek((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withMillisOfDay(7);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withYear(53);
        int int7 = localDateTime4.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 40 + "'", int7 == 40);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("2026-09-28T14:59:53.564", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        java.lang.String str6 = property5.getAsText();
        long long7 = property5.remainder();
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = property5.setCopy("\u0e04\u0e28.", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"?.?.\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970" + "'", str6, "1970");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1580400052L + "'", long7 == 1580400052L);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.joda.time.LocalDateTime localDateTime0 = null;
        org.joda.time.DateTimeField dateTimeField1 = null;
        org.joda.time.LocalDateTime.Property property2 = new org.joda.time.LocalDateTime.Property(localDateTime0, dateTimeField1);
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = property2.getAsText(locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        int int7 = property6.getLeapAmount();
        org.joda.time.LocalDate localDate9 = property6.addWrapFieldToCopy(2026);
        int int10 = localDate9.getDayOfYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 271 + "'", int10 == 271);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDateTime15.toDateTime(dateTimeZone16);
        int int18 = localDateTime15.size();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        java.lang.String str6 = property3.getAsString();
        org.joda.time.LocalDateTime localDateTime7 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withLocalMillis((long) (-1));
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.plusDays((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) '4');
        int int15 = localDateTime14.getYearOfEra();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime18 = property16.addToCopy((int) '4');
        org.joda.time.Chronology chronology19 = property16.getChronology();
        java.util.Locale locale20 = null;
        java.lang.String str21 = property16.getAsShortText(locale20);
        org.joda.time.LocalDateTime localDateTime22 = property16.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) '4');
        int int26 = localDateTime25.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime25.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime33 = localDateTime25.withFields((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) '4');
        int int36 = localDateTime35.getYearOfEra();
        org.joda.time.LocalDateTime.Property property37 = localDateTime35.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime39 = property37.addToCopy((int) '4');
        org.joda.time.Chronology chronology40 = property37.getChronology();
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime25, chronology40);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(chronology40);
        org.joda.time.DateTimeField dateTimeField43 = localDateTime22.getField(0, chronology40);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(chronology40);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField45 = localDateTime11.getField(35, chronology40);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0" + "'", str21, "0");
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1970 + "'", int36 == 1970);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTimeField43);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYearOfCentury(53);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withLocalMillis((long) 28320052);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        int int5 = localDateTime3.getHourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withDayOfWeek(999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate0.year();
        org.joda.time.LocalDate localDate5 = property3.addToCopy(3);
        org.joda.time.LocalDate localDate6 = property3.roundHalfFloorCopy();
        java.lang.String str7 = property3.toString();
        long long8 = property3.remainder();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Property[year]" + "'", str7, "Property[year]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 23328000000L + "'", long8 == 23328000000L);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        org.joda.time.LocalDate localDate11 = localDate9.withYearOfCentury(52);
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate15 = localDate12.withPeriodAdded(readablePeriod13, (int) (byte) -1);
        org.joda.time.LocalDate localDate17 = localDate12.plusWeeks(0);
        org.joda.time.LocalDate localDate19 = localDate17.withYear((int) ' ');
        org.joda.time.LocalDate localDate21 = localDate19.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property22 = localDate19.yearOfCentury();
        org.joda.time.LocalDate localDate23 = property22.roundHalfCeilingCopy();
        boolean boolean24 = localDate11.isAfter((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.ReadablePartial readablePartial25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = localDate11.compareTo(readablePartial25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("\u0e01\u0e1e.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"?.?.\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate0.minus(readablePeriod4);
        org.joda.time.LocalDate localDate7 = localDate5.plusYears(5232);
        int int8 = localDate5.size();
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
        int int23 = localDateTime19.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.minusMillis((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plus(readableDuration26);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) '4');
        int int30 = localDateTime29.getYearOfEra();
        org.joda.time.LocalDateTime.Property property31 = localDateTime29.minuteOfHour();
        int int32 = property31.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime33 = property31.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime35 = property31.addWrapFieldToCopy((int) '#');
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plusSeconds(0);
        int int41 = localDateTime38.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) '4');
        int int44 = localDateTime43.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property45 = localDateTime43.dayOfYear();
        org.joda.time.LocalDateTime.Property property46 = localDateTime43.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime47 = property46.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property46.getFieldType();
        int int49 = localDateTime38.indexOf(dateTimeFieldType48);
        int int50 = localDateTime35.get(dateTimeFieldType48);
        boolean boolean51 = localDateTime25.isSupported(dateTimeFieldType48);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property52 = localDate5.property(dateTimeFieldType48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfMinute' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 28320052 + "'", int23 == 28320052);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1970 + "'", int30 == 1970);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 59 + "'", int32 == 59);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        boolean boolean10 = localDate7.equals((java.lang.Object) 100.0d);
        org.joda.time.LocalDate.Property property11 = localDate7.era();
        long long12 = property11.getMillis();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1960761600000L + "'", long12 == 1960761600000L);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMinimumValue();
        java.util.Date date6 = localDateTime5.toDate();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.minuteOfHour();
        int int8 = localDateTime5.getHourOfDay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Jan 01 07:00:00 ICT 1");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getWeekyear();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withDurationAdded(readableDuration7, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        boolean boolean6 = property5.isLeap();
        java.util.Locale locale7 = null;
        int int8 = property5.getMaximumTextLength(locale7);
        org.joda.time.LocalDateTime localDateTime10 = property5.addToCopy((long) 9);
        java.lang.String str11 = property5.getAsShortText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970" + "'", str11, "1970");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        org.joda.time.DateTimeField dateTimeField15 = property8.getField();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        java.lang.String str8 = property7.getAsText();
        java.util.Locale locale10 = null;
        org.joda.time.LocalDate localDate11 = property7.setCopy("2026", locale10);
        java.util.Locale locale12 = null;
        int int13 = property7.getMaximumTextLength(locale12);
        java.util.Locale locale14 = null;
        java.lang.String str15 = property7.getAsText(locale14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = property7.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for year is not supported");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2026" + "'", str15, "2026");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusMonths((int) ' ');
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.plusMonths(8);
        org.joda.time.LocalDateTime.Property property13 = localDateTime7.dayOfWeek();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((-25198114L));
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withLocalMillis(2611094400000L);
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.DurationField durationField8 = property7.getDurationField();
        java.lang.String str9 = property7.getAsShortText();
        int int10 = property7.get();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "271" + "'", str9, "271");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 271 + "'", int10 == 271);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(2026);
        org.joda.time.DateMidnight dateMidnight12 = localDate11.toDateMidnight();
        org.joda.time.LocalDate localDate14 = localDate11.withYearOfEra(3);
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
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDateTime1.toDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.secondOfMinute();
        int int6 = property5.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime8 = property5.addWrapFieldToCopy(7);
        long long9 = property5.getMillis();
        org.joda.time.DateTimeField dateTimeField10 = property5.getField();
        boolean boolean12 = property5.equals((java.lang.Object) 40);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 25200052L + "'", long9 == 25200052L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusWeeks((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
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
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDate localDate22 = localDate19.withPeriodAdded(readablePeriod20, (int) (byte) -1);
        int int23 = localDate19.getYearOfEra();
        org.joda.time.LocalDate localDate25 = localDate19.plusDays(1970);
        org.joda.time.LocalDate localDate26 = localDate18.withFields((org.joda.time.ReadablePartial) localDate25);
        org.joda.time.LocalDate.Property property27 = localDate25.monthOfYear();
        org.joda.time.LocalDate localDate29 = localDate25.withCenturyOfEra((int) '4');
        org.joda.time.LocalDate localDate31 = localDate29.withDayOfMonth((int) (byte) 10);
        org.joda.time.LocalDate localDate33 = localDate31.plusWeeks(0);
        boolean boolean34 = localDate16.equals((java.lang.Object) localDate33);
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
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2026 + "'", int23 == 2026);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("9", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
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
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withYearOfEra((int) '4');
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withWeekyear(2922789);
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
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundFloorCopy();
        org.joda.time.DurationField durationField8 = property3.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property3.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray10 = localDateTime9.getFieldTypes();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray10);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withYear(10);
        org.joda.time.Chronology chronology8 = localDateTime5.getChronology();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withCenturyOfEra((int) (byte) 0);
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate14 = localDate11.withPeriodAdded(readablePeriod12, (int) (byte) -1);
        int int15 = localDate11.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        int int17 = localDate11.indexOf(dateTimeFieldType16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        boolean boolean19 = localDate11.isSupported(dateTimeFieldType18);
        org.joda.time.LocalDate.Property property20 = localDate11.yearOfCentury();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray21 = localDate11.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = localDateTime5.isEqual((org.joda.time.ReadablePartial) localDate11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2026 + "'", int15 == 2026);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray21);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        java.lang.String str7 = property6.getAsText();
        long long8 = property6.getMillis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = property6.setCopy("2026-01-04");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2026-01-04\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
// flaky "4) test1166(org.joda.time.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u0e04\u0e28." + "'", str7, "\u0e04\u0e28.");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1790553600000L + "'", long8 == 1790553600000L);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
        long long25 = localDate24.getLocalMillis();
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1798675200000L + "'", long25 == 1798675200000L);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = localDate15.toString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
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
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
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
        org.joda.time.LocalDate.Property property18 = localDate17.weekOfWeekyear();
        int int19 = localDate17.getYearOfCentury();
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
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 26 + "'", int19 == 26);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        int int3 = localDateTime1.getYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate0.minus(readablePeriod4);
        org.joda.time.LocalDate.Property property6 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate7 = property6.withMinimumValue();
        long long8 = property6.getMillis();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1790553600000L + "'", long8 == 1790553600000L);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.withDayOfYear(4);
        org.joda.time.LocalDate localDate6 = localDate4.minusWeeks((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate8 = localDate4.plus(readablePeriod7);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localDateTime2.getFields();
        org.joda.time.LocalDateTime.Property property4 = localDateTime2.monthOfYear();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withWeekyear(26);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.minusHours(0);
        org.joda.time.LocalDateTime.Property property9 = localDateTime2.dayOfMonth();
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) '4');
        int int5 = localDateTime4.getYearOfEra();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime8 = property6.addToCopy((int) '4');
        org.joda.time.Chronology chronology9 = property6.getChronology();
        java.util.Locale locale10 = null;
        java.lang.String str11 = property6.getAsShortText(locale10);
        org.joda.time.LocalDateTime localDateTime12 = property6.roundHalfCeilingCopy();
        int int13 = localDateTime12.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDateTime15.toDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime15.monthOfYear();
        org.joda.time.DateTimeField dateTimeField19 = property18.getField();
        org.joda.time.LocalDateTime.Property property20 = new org.joda.time.LocalDateTime.Property(localDateTime12, dateTimeField19);
        org.joda.time.Chronology chronology21 = property20.getChronology();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(42, 7, 5232, chronology21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 5232 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate5 = property4.getLocalDate();
        org.joda.time.DateTime dateTime6 = localDate5.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate.Property property7 = localDate5.year();
        org.joda.time.LocalDate localDate8 = property7.withMinimumValue();
        org.joda.time.LocalDate localDate9 = property7.roundFloorCopy();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMinutes(31);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withYear(100);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withMillisOfDay(50);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.plusMillis(26);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minus(readableDuration20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate5.withPeriodAdded(readablePeriod6, 0);
        org.joda.time.LocalDate localDate10 = localDate8.minusMonths(40);
        java.util.Locale locale12 = null;
        java.lang.String str13 = localDate8.toString("2032-02-19", locale12);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2032-02-19" + "'", str13, "2032-02-19");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
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
        org.joda.time.DurationField durationField28 = property27.getDurationField();
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
        org.junit.Assert.assertNotNull(durationField28);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.monthOfYear();
        int int5 = localDateTime1.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property6 = localDateTime1.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minus(readablePeriod7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfYear(31);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        java.util.Locale locale20 = null;
        org.joda.time.LocalDateTime localDateTime21 = property18.setCopy("20", locale20);
        long long22 = property18.remainder();
        int int23 = property18.get();
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
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 28320052 + "'", int23 == 28320052);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusSeconds(0);
        int int5 = localDateTime2.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) '4');
        int int8 = localDateTime7.getYearOfEra();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.minuteOfHour();
        int int10 = property9.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime12 = property9.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime13 = property9.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfMonth();
        java.lang.String str15 = localDateTime13.toString();
        int int16 = localDateTime13.size();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.withYear((int) ' ');
        org.joda.time.LocalDateTime localDateTime19 = localDateTime2.withFields((org.joda.time.ReadablePartial) localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 59 + "'", int10 == 59);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01T07:00:00.000" + "'", str15, "1970-01-01T07:00:00.000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
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
        org.joda.time.LocalDateTime localDateTime16 = localDateTime5.withSecondOfMinute(35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType18 = localDateTime16.getFieldType(2001);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2001");
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
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
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
        org.joda.time.LocalDate.Property property16 = localDate15.dayOfWeek();
        org.joda.time.DurationField durationField17 = property16.getDurationField();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = localDate0.indexOf(dateTimeFieldType5);
        org.joda.time.LocalDate localDate8 = localDate0.withWeekyear((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate10 = localDate8.minus(readablePeriod9);
        org.joda.time.LocalTime localTime11 = null;
        org.joda.time.DateTime dateTime12 = localDate8.toDateTime(localTime11);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) '4');
        int int3 = localDateTime2.getYearOfEra();
        org.joda.time.LocalDateTime.Property property4 = localDateTime2.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime6 = property4.addToCopy((int) '4');
        int int7 = localDateTime6.getEra();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.plus(readableDuration8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.plusMillis(0);
        int int12 = localDateTime6.getYear();
        org.joda.time.Chronology chronology13 = localDateTime6.getChronology();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 3, chronology13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withWeekOfWeekyear(2025);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2025 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = localDate12.withDayOfMonth((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1790553600000L + "'", long9 == 1790553600000L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-09-28" + "'", str10, "2026-09-28");
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        java.lang.String str8 = property7.getAsText();
        org.joda.time.LocalDate localDate9 = property7.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate9.toDateTimeAtMidnight(dateTimeZone10);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026" + "'", str8, "2026");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate23 = localDate21.withDayOfMonth((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,28]");
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
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u0e01\u0e31\u0e19\u0e22\u0e32\u0e22\u0e19" + "'", str20, "\u0e01\u0e31\u0e19\u0e22\u0e32\u0e22\u0e19");
        org.junit.Assert.assertNotNull(localDate21);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        java.util.Date date6 = localDateTime1.toDate();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.plusDays(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusMillis(365);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField12 = localDateTime10.getField(19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 19");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.minuteOfHour();
        java.lang.String str8 = property7.getAsText();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "52" + "'", str8, "52");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate5.withPeriodAdded(readablePeriod6, 0);
        org.joda.time.LocalDate.Property property9 = localDate8.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType11 = localDate8.getFieldType(26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 26");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        int int22 = localDate5.getYearOfEra();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2026 + "'", int22 == 2026);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        org.joda.time.LocalDate localDate13 = property7.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate14 = property7.withMinimumValue();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.withYearOfEra(69);
        int int12 = localDate11.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) '4');
        int int15 = localDateTime14.getYearOfEra();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime18 = property16.addToCopy((int) '4');
        int int19 = localDateTime18.getEra();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.plus(readableDuration20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusWeeks(1970);
        int int24 = localDateTime23.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.plusWeeks((int) '4');
        org.joda.time.LocalDateTime.Property property27 = localDateTime23.year();
        org.joda.time.LocalDateTime localDateTime29 = property27.addToCopy((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = localDate11.isBefore((org.joda.time.ReadablePartial) localDateTime29);
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
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 40 + "'", int24 == 40);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        java.lang.String str18 = property17.getAsText();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970" + "'", str18, "1970");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate9 = localDate0.withWeekyear((int) (short) 10);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(25200052L);
        org.joda.time.LocalDate localDate14 = localDate12.withLocalMillis(10L);
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate19 = localDate16.withPeriodAdded(readablePeriod17, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight20 = localDate16.toDateMidnight();
        org.joda.time.LocalDate localDate22 = localDate16.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property23 = localDate22.year();
        org.joda.time.Chronology chronology24 = localDate22.getChronology();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((java.lang.Object) "2026", chronology24);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((java.lang.Object) 10L, chronology24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField27 = localDate9.getField(4, chronology24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(chronology24);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minusHours((-1));
        int int12 = localDateTime7.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime7.withHourOfDay(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
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
        int[] intArray20 = localDateTime16.getValues();
        org.joda.time.LocalDateTime.Property property21 = localDateTime16.era();
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
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 1970, 1, 1, 28319952 });
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears((int) (byte) -1);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readableDuration12);
        int int14 = localDateTime13.getWeekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = localDateTime13.toString("minuteOfHour");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localDateTime2.getFields();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.minusDays(59);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.dayOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime2.weekyear();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minus(readableDuration8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minusWeeks((int) (short) 10);
        int int7 = localDateTime6.getYear();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.plus(readableDuration8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1969 + "'", int7 == 1969);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.centuryOfEra();
        java.util.Locale locale4 = null;
        int int5 = property3.getMaximumShortTextLength(locale4);
        java.util.Locale locale6 = null;
        java.lang.String str7 = property3.getAsShortText(locale6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property3.getFieldType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "19" + "'", str7, "19");
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        java.lang.String str8 = property7.getName();
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate12 = localDate9.withPeriodAdded(readablePeriod10, (int) (byte) -1);
        int int13 = localDate9.getYearOfEra();
        org.joda.time.LocalDate localDate15 = localDate9.plusDays(1970);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate15.toDateTimeAtMidnight(dateTimeZone16);
        int int18 = property7.compareTo((org.joda.time.ReadableInstant) dateTime17);
        java.util.Locale locale20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate21 = property7.setCopy("2031-10-19", locale20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2031-10-19\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "dayOfYear" + "'", str8, "dayOfYear");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2026 + "'", int13 == 2026);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        int int6 = localDateTime1.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.year();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusHours(10);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime9, dateTimeZone10);
        int int12 = localDateTime9.getYearOfCentury();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 70 + "'", int12 == 70);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        java.lang.String str8 = property7.getAsText();
        java.util.Locale locale10 = null;
        org.joda.time.LocalDate localDate11 = property7.setCopy("2026", locale10);
        java.util.Locale locale12 = null;
        int int13 = property7.getMaximumTextLength(locale12);
        java.util.Locale locale14 = null;
        java.lang.String str15 = property7.getAsText(locale14);
        int int16 = property7.getMinimumValueOverall();
        java.lang.String str17 = property7.getAsString();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026" + "'", str8, "2026");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2026" + "'", str15, "2026");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-292275054) + "'", int16 == (-292275054));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2026" + "'", str17, "2026");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        java.util.Locale locale13 = null;
        java.lang.String str14 = property12.getAsShortText(locale13);
        java.util.Locale locale16 = null;
        org.joda.time.LocalDate localDate17 = property12.setCopy("1832", locale16);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "20" + "'", str14, "20");
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDate localDate10 = localDate7.withPeriodAdded(readablePeriod8, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight11 = localDate7.toDateMidnight();
        org.joda.time.LocalDate localDate13 = localDate7.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property14 = localDate13.year();
        org.joda.time.Chronology chronology15 = localDate13.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(2032, 652, 2026, 52, 366, 25200000, (-1), chronology15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
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
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        java.lang.String str12 = property11.getAsShortText();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
// flaky "5) test1208(org.joda.time.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u0e04\u0e28." + "'", str12, "\u0e04\u0e28.");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = property8.setCopy("2026-09-26T04:01:34.521");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2026-09-26T04:01:34.521\" for monthOfYear is not supported");
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
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        int int21 = localDateTime20.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property22 = localDateTime20.era();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 28319952 + "'", int21 == 28319952);
        org.junit.Assert.assertNotNull(property22);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.minuteOfHour();
        int int2 = localDateTime0.getCenturyOfEra();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(10, 0, 269, 242, 25200052, (-1790557189), 7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 242 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.minusWeeks((int) (short) 0);
        int int6 = localDate5.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate5.toDateMidnight(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Interval interval10 = localDate5.toInterval(dateTimeZone9);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(interval10);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        java.lang.String str7 = localDateTime6.toString();
        int int8 = localDateTime6.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withYearOfEra(20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0035-01-04T07:00:00.052" + "'", str7, "0035-01-04T07:00:00.052");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
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
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = property12.setCopy("1969-01-01T07:52:00.052", locale14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1969-01-01T07:52:00.052\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 69 + "'", int11 == 69);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
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
        java.lang.String str12 = localDate7.toString();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2032-02-19" + "'", str12, "2032-02-19");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate6 = property4.addToCopy(10);
        org.joda.time.LocalDate localDate8 = property4.addToCopy(1970);
        long long9 = property4.getMillis();
        java.lang.String str10 = property4.getAsShortText();
        boolean boolean11 = property4.isLeap();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property4.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = property4.setCopy(14403717);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 14403717 for weekOfWeekyear must be in the range [1,53]");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plus(readablePeriod6);
        org.joda.time.DurationFieldType durationFieldType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withFieldAdded(durationFieldType8, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfDay(2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusYears(53);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField10 = localDateTime8.getField(19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 19");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(2025, 35, 32, 39, (-1), 25, 28, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withYear(25200000);
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
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
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
        int int22 = localDateTime16.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime16.plusHours(50);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
        org.joda.time.DurationField durationField21 = property17.getRangeDurationField();
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
// flaky "6) test1223(org.joda.time.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u0e04\u0e28." + "'", str19, "\u0e04\u0e28.");
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNull(durationField21);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getDayOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology9 = property7.getChronology();
        java.lang.String str10 = property7.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Property[yearOfCentury]" + "'", str10, "Property[yearOfCentury]");
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
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
        java.util.Locale locale20 = null;
        org.joda.time.LocalDateTime localDateTime21 = property18.setCopy("20", locale20);
        int int22 = localDateTime21.getEra();
        int int23 = localDateTime21.getMinuteOfHour();
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
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(40, 42, (-1), 39, 25200052, 2026, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = localDateTime10.withWeekOfWeekyear(1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for weekOfWeekyear must be in the range [1,53]");
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
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        org.joda.time.LocalDate localDate13 = property12.withMinimumValue();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = localDate13.toString(dateTimeFormatter14);
        int int16 = localDate13.getYearOfEra();
        int int17 = localDate13.getDayOfWeek();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2032-01-01" + "'", str15, "2032-01-01");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2032 + "'", int16 == 2032);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 5);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) '4');
        int int5 = localDateTime4.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.yearOfEra();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.plusWeeks(28);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) '4');
        int int19 = localDateTime18.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime26 = localDateTime18.withFields((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime18.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime18.withHourOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.yearOfCentury();
        org.joda.time.Chronology chronology32 = property31.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = localDateTime11.getField((int) (short) 0, chronology32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate(5232, 4, 365, chronology32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localDateTime2.getFields();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.minusDays(59);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.dayOfYear();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.minusSeconds((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localDateTime8.getValue(2001);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2001");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(1, (-1790557193), 59, 2, 2007, 2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2007 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
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
        org.joda.time.LocalDateTime localDateTime17 = property14.withMaximumValue();
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
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        org.joda.time.DateTime dateTime7 = localDate0.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate.Property property8 = localDate0.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = property8.getLeapDurationField();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNull(durationField9);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
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
        int int44 = localDateTime39.getYearOfCentury();
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 69 + "'", int44 == 69);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        long long19 = property18.getMillis();
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 25200000L + "'", long19 == 25200000L);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.withDayOfYear(4);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        org.joda.time.LocalDate localDate6 = property5.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate8 = localDate6.minusWeeks((int) (byte) 100);
        int int9 = localDate6.size();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(521, 100, (-1790557189), (int) (short) 10, 1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("1970-01-19T07:00:00.052", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        org.joda.time.LocalTime localTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDate7.toLocalDateTime(localTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The time must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) '4');
        int int24 = localDateTime23.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime31 = localDateTime23.withFields((org.joda.time.ReadablePartial) localDateTime30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime23.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime23.withHourOfDay((int) (byte) 0);
        int int36 = localDateTime35.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.minusMinutes(32);
        org.joda.time.Chronology chronology39 = localDateTime35.getChronology();
        org.joda.time.LocalDateTime.Property property40 = localDateTime35.weekOfWeekyear();
        org.joda.time.Chronology chronology41 = property40.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((java.lang.Object) 4, chronology41);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 28320052 + "'", int14 == 28320052);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 19 + "'", int19 == 19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 19 + "'", int36 == 19);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(chronology41);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        java.lang.String str9 = property8.getAsString();
        org.joda.time.DurationField durationField10 = property8.getRangeDurationField();
        org.joda.time.LocalDate localDate11 = property8.roundCeilingCopy();
        long long12 = property8.getMillis();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "9" + "'", str9, "9");
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1790553600000L + "'", long12 == 1790553600000L);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate.Property property9 = localDate8.dayOfWeek();
        int int10 = localDate8.getDayOfMonth();
        int int11 = localDate8.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) '4');
        int int14 = localDateTime13.getYearOfEra();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime17 = property15.addToCopy((int) '4');
        int int18 = localDateTime17.getEra();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.plus(readableDuration19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.plusMillis(0);
        int int23 = localDateTime17.getYearOfCentury();
        int int24 = localDateTime17.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusSeconds(0);
        int int30 = localDateTime27.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) '4');
        int int33 = localDateTime32.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property34 = localDateTime32.dayOfYear();
        org.joda.time.LocalDateTime.Property property35 = localDateTime32.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime36 = property35.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property35.getFieldType();
        int int38 = localDateTime27.indexOf(dateTimeFieldType37);
        int int39 = localDateTime17.get(dateTimeFieldType37);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = localDate8.get(dateTimeFieldType37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfMinute' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 69 + "'", int11 == 69);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 70 + "'", int23 == 70);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
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
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.yearOfCentury();
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
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
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
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.minusMinutes((int) '#');
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
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(2026, (int) (short) 1, 2922789, 15, 1869, 14403717);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1869 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusSeconds(0);
        int int5 = localDateTime2.getDayOfWeek();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.withYear((int) (short) 10);
        org.joda.time.DurationFieldType durationFieldType9 = null;
        boolean boolean10 = localDateTime2.isSupported(durationFieldType9);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = localDateTime5.withTime((int) (byte) 1, 999, 14, 39);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate5 = localDate2.withPeriodAdded(readablePeriod3, (int) (byte) -1);
        org.joda.time.LocalDate localDate7 = localDate2.plusWeeks(0);
        org.joda.time.LocalDate localDate9 = localDate7.withYear((int) ' ');
        org.joda.time.LocalDate localDate11 = localDate9.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property12 = localDate9.yearOfCentury();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate17 = localDate14.withPeriodAdded(readablePeriod15, (int) (byte) -1);
        int int18 = localDate14.getYearOfEra();
        org.joda.time.LocalDate localDate20 = localDate14.plusDays(1970);
        org.joda.time.LocalDate localDate21 = localDate13.withFields((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.LocalDate.Property property22 = localDate20.monthOfYear();
        org.joda.time.LocalDate localDate24 = localDate20.withCenturyOfEra((int) '4');
        org.joda.time.LocalDate localDate26 = localDate24.withDayOfMonth((int) (byte) 10);
        boolean boolean27 = localDate9.isAfter((org.joda.time.ReadablePartial) localDate26);
        org.joda.time.LocalDate.Property property28 = localDate26.dayOfMonth();
        org.joda.time.LocalDate localDate29 = property28.roundHalfFloorCopy();
        org.joda.time.Chronology chronology30 = localDate29.getChronology();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(25200000L, chronology30);
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate(chronology30);
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) 743, chronology30);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2026 + "'", int18 == 2026);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(chronology30);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.withDayOfYear(4);
        org.joda.time.LocalDate localDate6 = localDate4.minusWeeks((int) (short) 10);
        int int7 = localDate4.getYear();
        java.lang.String str8 = localDate4.toString();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2026 + "'", int7 == 2026);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026-01-04" + "'", str8, "2026-01-04");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("1832", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate0.minus(readablePeriod4);
        org.joda.time.LocalDate.Property property6 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate7 = property6.roundHalfCeilingCopy();
        int int8 = localDate7.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = localDate7.withYearOfCentury(14403717);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 14403717 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.dayOfWeek();
        org.joda.time.DateTime dateTime26 = localDateTime24.toDateTime();
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
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
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
        boolean boolean19 = localDateTime17.equals((java.lang.Object) 1790553600000L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withDayOfMonth(42);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 42 for dayOfMonth must be in the range [1,31]");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        org.joda.time.LocalDate localDate11 = localDate9.withYearOfCentury(52);
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate15 = localDate12.withPeriodAdded(readablePeriod13, (int) (byte) -1);
        org.joda.time.LocalDate localDate17 = localDate12.plusWeeks(0);
        org.joda.time.LocalDate localDate19 = localDate17.withYear((int) ' ');
        org.joda.time.LocalDate localDate21 = localDate19.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property22 = localDate19.yearOfCentury();
        org.joda.time.LocalDate localDate23 = property22.roundHalfCeilingCopy();
        boolean boolean24 = localDate11.isAfter((org.joda.time.ReadablePartial) localDate23);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = localDate23.getValue(28787742);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 28787742");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.plus(readableDuration16);
        int int18 = localDateTime17.getWeekyear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2026 + "'", int18 == 2026);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        java.util.Date date10 = localDateTime9.toDate();
        int int11 = localDateTime9.getDayOfYear();
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.weekyear();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.minusDays(2025);
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
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        java.lang.String str6 = property3.getAsString();
        org.joda.time.LocalDateTime localDateTime7 = property3.withMaximumValue();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        org.joda.time.LocalDateTime localDateTime10 = property8.addToCopy((long) 242);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate10 = localDate7.minus(readablePeriod9);
        org.joda.time.LocalDate.Property property11 = localDate10.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = property11.setCopy(3938);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3938 for dayOfYear must be in the range [1,366]");
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
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime1.withYear(1969);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withDayOfYear(70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        org.joda.time.LocalDate localDate9 = property7.roundHalfEvenCopy();
        int int10 = localDate9.getDayOfYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 271 + "'", int10 == 271);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
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
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.year();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
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
        java.lang.String str15 = localDate0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = localDate0.withEra(3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3 for era must be in the range [0,1]");
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
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2026-09-28" + "'", str15, "2026-09-28");
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.minusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.LocalDate localDate5 = localDate2.withEra(0);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((int) (byte) 1);
        org.joda.time.LocalDate localDate9 = localDate5.withCenturyOfEra((int) (short) 0);
        org.joda.time.LocalTime localTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDate5.toLocalDateTime(localTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The time must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(chronology31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(2007, 0, 39, 53, 2032, 2032, 20, chronology31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53 for hourOfDay must be in the range [0,23]");
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
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
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
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate0.toDateTimeAtMidnight(dateTimeZone12);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minusHours((-1));
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withLocalMillis((long) 28);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusYears(14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) '4');
        int int19 = localDateTime18.getYearOfEra();
        org.joda.time.LocalDateTime.Property property20 = localDateTime18.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime22 = property20.addToCopy((int) '4');
        int int23 = localDateTime22.getEra();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) '4');
        int int26 = localDateTime25.getYearOfEra();
        org.joda.time.LocalDateTime.Property property27 = localDateTime25.minuteOfHour();
        int int28 = property27.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime30 = property27.addWrapFieldToCopy((int) 'a');
        int int31 = localDateTime30.getWeekyear();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) '4');
        int int34 = localDateTime33.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime33.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime43 = localDateTime33.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        java.util.Date date44 = localDateTime33.toDate();
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((long) '4');
        int int47 = localDateTime46.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property48 = localDateTime46.dayOfYear();
        org.joda.time.LocalDateTime.Property property49 = localDateTime46.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime50 = property49.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = property49.getFieldType();
        int int52 = localDateTime33.get(dateTimeFieldType51);
        boolean boolean53 = localDateTime30.isSupported(dateTimeFieldType51);
        org.joda.time.LocalDateTime.Property property54 = localDateTime22.property(dateTimeFieldType51);
        org.joda.time.LocalDateTime.Property property55 = localDateTime15.property(dateTimeFieldType51);
        org.joda.time.LocalDateTime.Property property56 = localDateTime15.era();
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.centuryOfEra();
        org.joda.time.LocalDateTime.Property property60 = localDateTime58.yearOfEra();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime58.minusYears(12);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime15.withFields((org.joda.time.ReadablePartial) localDateTime62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1970 + "'", int26 == 1970);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 59 + "'", int28 == 59);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1970 + "'", int31 == 1970);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(localDateTime63);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((-1790557189), (int) '4', 2025, 1970, 5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withCenturyOfEra(1);
        int int3 = localDateTime0.getYear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.withWeekyear(2007);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime0.plusDays(0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2026 + "'", int3 == 2026);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        java.lang.String str6 = property5.getAsText();
        long long7 = property5.remainder();
        org.joda.time.LocalDateTime localDateTime9 = property5.setCopy(4);
        int int10 = property5.getMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970" + "'", str6, "1970");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1580400052L + "'", long7 == 1580400052L);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292278993 + "'", int10 == 292278993);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = property14.setCopy("Property[year]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Property[year]\" for hourOfDay is not supported");
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
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.minusWeeks((int) (byte) 10);
        org.joda.time.LocalTime localTime3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = localDate2.toLocalDateTime(localTime3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The time must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = localDate0.indexOf(dateTimeFieldType5);
        org.joda.time.DurationFieldType durationFieldType7 = null;
        boolean boolean8 = localDate0.isSupported(durationFieldType7);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate12 = localDate9.withPeriodAdded(readablePeriod10, (int) (byte) -1);
        int int13 = localDate9.getYearOfEra();
        org.joda.time.LocalDate localDate15 = localDate9.plusDays(1970);
        org.joda.time.LocalDate localDate17 = localDate9.withLocalMillis((long) (-1));
        org.joda.time.LocalDate.Property property18 = localDate17.dayOfWeek();
        int int19 = localDate17.getDayOfMonth();
        int int20 = localDate17.getYearOfCentury();
        org.joda.time.LocalDate localDate21 = localDate0.withFields((org.joda.time.ReadablePartial) localDate17);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone23);
        org.joda.time.DateTimeField[] dateTimeFieldArray25 = localDateTime24.getFields();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.minusDays(59);
        int int28 = localDateTime27.getMonthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = localDate0.isAfter((org.joda.time.ReadablePartial) localDateTime27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2026 + "'", int13 == 2026);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 31 + "'", int19 == 31);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 69 + "'", int20 == 69);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(dateTimeFieldArray25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 11 + "'", int28 == 11);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(35, 58, (int) (short) 1, 4, 28320052, 2001, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28320052 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
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
        int int14 = property13.getMinimumValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-292275054) + "'", int14 == (-292275054));
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 28320052, dateTimeZone1);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
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
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withMillisOfDay(365);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.minusMillis(25200000);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) '4');
        int int23 = localDateTime22.getYearOfEra();
        org.joda.time.LocalDateTime.Property property24 = localDateTime22.minuteOfHour();
        org.joda.time.LocalDateTime.Property property25 = localDateTime22.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray26 = localDateTime22.getFieldTypes();
        org.joda.time.LocalDateTime.Property property27 = localDateTime22.secondOfMinute();
        org.joda.time.LocalDateTime.Property property28 = localDateTime22.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = property28.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime31 = localDateTime20.withField(dateTimeFieldType29, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
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
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1970 + "'", int23 == 1970);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        long long9 = localDate0.getLocalMillis();
        java.lang.String str10 = localDate0.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = localDate0.toString(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1790553600000L + "'", long9 == 1790553600000L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-09-28" + "'", str10, "2026-09-28");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2026-09-28" + "'", str12, "2026-09-28");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.DurationField durationField8 = property7.getDurationField();
        java.lang.String str9 = property7.getAsText();
        boolean boolean10 = property7.isLeap();
        java.lang.String str11 = property7.toString();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate16 = localDate13.withPeriodAdded(readablePeriod14, (int) (byte) -1);
        int int17 = localDate13.getYearOfEra();
        org.joda.time.LocalDate localDate19 = localDate13.plusDays(1970);
        org.joda.time.LocalDate localDate20 = localDate12.withFields((org.joda.time.ReadablePartial) localDate19);
        long long21 = localDate12.getLocalMillis();
        org.joda.time.LocalDate.Property property22 = localDate12.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        boolean boolean24 = localDate12.isSupported(dateTimeFieldType23);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDate localDate29 = localDate26.withPeriodAdded(readablePeriod27, (int) (byte) -1);
        int int30 = localDate26.getYearOfEra();
        org.joda.time.LocalDate localDate32 = localDate26.plusDays(1970);
        org.joda.time.LocalDate localDate33 = localDate25.withFields((org.joda.time.ReadablePartial) localDate32);
        boolean boolean34 = localDate12.equals((java.lang.Object) localDate33);
        org.joda.time.LocalDate localDate36 = localDate33.minusMonths(4);
        java.lang.String str37 = localDate36.toString();
        int int38 = property7.compareTo((org.joda.time.ReadablePartial) localDate36);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "271" + "'", str9, "271");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Property[dayOfYear]" + "'", str11, "Property[dayOfYear]");
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2026 + "'", int17 == 2026);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1790553600000L + "'", long21 == 1790553600000L);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2026 + "'", int30 == 2026);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "2031-10-19" + "'", str37, "2031-10-19");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.yearOfCentury();
        java.lang.String str8 = property7.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[yearOfCentury]" + "'", str8, "Property[yearOfCentury]");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
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
        java.util.Locale locale16 = null;
        int int17 = property13.getMaximumTextLength(locale16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01T07:00:00.052" + "'", str12, "1970-01-01T07:00:00.052");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime6 = property3.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusHours((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withTime((int) '#', 5, 25200000, 7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
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
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMillis(12);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.dayOfMonth();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        boolean boolean10 = localDate7.equals((java.lang.Object) 100.0d);
        org.joda.time.LocalDate localDate12 = localDate7.withWeekyear(28320052);
        java.lang.String str14 = localDate12.toString("2026-09-28");
        org.joda.time.LocalTime localTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDate12.toLocalDateTime(localTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The time must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2026-09-28" + "'", str14, "2026-09-28");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusMinutes(19);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.hourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        java.lang.String str3 = property2.toString();
        int int4 = property2.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withDayOfMonth(242);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 242 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[centuryOfEra]" + "'", str3, "Property[centuryOfEra]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(10, (-1790557193), 2001, 52, (-1790557193), (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.DateTimeField dateTimeField5 = property3.getField();
        java.lang.String str6 = property3.getAsText();
        org.joda.time.Chronology chronology7 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now(chronology7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.secondOfMinute();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.weekOfWeekyear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
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
        int int27 = localDate24.getYearOfCentury();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 31 + "'", int27 == 31);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
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
        org.joda.time.LocalDateTime localDateTime17 = property15.setCopy("1");
        org.joda.time.LocalDateTime localDateTime18 = property15.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withMinuteOfHour(28319952);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28319952 for minuteOfHour must be in the range [0,59]");
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
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate10 = localDate7.minusWeeks(5);
        int int11 = localDate7.getDayOfWeek();
        org.joda.time.DateTime dateTime12 = localDate7.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology13 = localDate7.getChronology();
        org.joda.time.DateTime dateTime14 = localDate7.toDateTimeAtStartOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = localDate7.toString(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2032-02-19" + "'", str16, "2032-02-19");
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
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
        boolean boolean25 = property15.isLeap();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        java.lang.String str6 = property3.getAsString();
        org.joda.time.LocalDateTime localDateTime8 = property3.addWrapFieldToCopy(70);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusMonths(100);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) '4');
        int int13 = localDateTime12.getYearOfEra();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime16 = property14.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDateTime18.toDateTime(dateTimeZone19);
        long long21 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime20);
        int int22 = property14.getMinimumValue();
        java.lang.String str23 = property14.getAsString();
        int int24 = property14.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime26 = property14.addToCopy(365);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) '4');
        int int29 = localDateTime28.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property30 = localDateTime28.dayOfYear();
        org.joda.time.LocalDateTime.Property property31 = localDateTime28.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime32 = property31.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property31.getFieldType();
        boolean boolean34 = localDateTime26.isSupported(dateTimeFieldType33);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime36 = localDateTime10.withField(dateTimeFieldType33, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 420L + "'", long21 == 420L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
        java.lang.String str17 = property14.getAsText();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "70" + "'", str17, "70");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
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
        int int19 = localDateTime18.size();
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
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = localDateTime17.get(dateTimeFieldType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 19 + "'", int14 == 19);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        int int8 = property7.getMaximumValue();
        org.joda.time.LocalDate localDate9 = property7.withMinimumValue();
        org.joda.time.DurationField durationField10 = property7.getDurationField();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 365 + "'", int8 == 365);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, (-1));
        org.joda.time.LocalDate localDate10 = localDate0.withDayOfYear((int) '#');
        org.joda.time.Chronology chronology11 = localDate0.getChronology();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) '4');
        int int14 = localDateTime13.getYearOfEra();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime17 = property15.addToCopy((int) '4');
        org.joda.time.Chronology chronology18 = property15.getChronology();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.minusHours((-1));
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.withLocalMillis((long) 28);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusYears(14);
        int int28 = localDateTime27.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) '4');
        int int31 = localDateTime30.getYearOfEra();
        org.joda.time.LocalDateTime.Property property32 = localDateTime30.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime34 = property32.addToCopy((int) '4');
        int int35 = localDateTime34.getEra();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) '4');
        int int38 = localDateTime37.getYearOfEra();
        org.joda.time.LocalDateTime.Property property39 = localDateTime37.minuteOfHour();
        int int40 = property39.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime42 = property39.addWrapFieldToCopy((int) 'a');
        int int43 = localDateTime42.getWeekyear();
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((long) '4');
        int int46 = localDateTime45.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime45.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime55 = localDateTime45.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        java.util.Date date56 = localDateTime45.toDate();
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime((long) '4');
        int int59 = localDateTime58.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property60 = localDateTime58.dayOfYear();
        org.joda.time.LocalDateTime.Property property61 = localDateTime58.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime62 = property61.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = property61.getFieldType();
        int int64 = localDateTime45.get(dateTimeFieldType63);
        boolean boolean65 = localDateTime42.isSupported(dateTimeFieldType63);
        org.joda.time.LocalDateTime.Property property66 = localDateTime34.property(dateTimeFieldType63);
        org.joda.time.LocalDateTime.Property property67 = localDateTime27.property(dateTimeFieldType63);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate69 = localDate0.withField(dateTimeFieldType63, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfMinute' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1970 + "'", int31 == 1970);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1970 + "'", int38 == 1970);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 59 + "'", int40 == 59);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1970 + "'", int43 == 1970);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(dateTimeFieldType63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(property67);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("5232-02-10");
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
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
        org.joda.time.LocalDateTime.Property property17 = localDateTime14.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime14.withDayOfYear(867);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 867 for dayOfYear must be in the range [1,365]");
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
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
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
        int int18 = localDateTime5.getYear();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1970 + "'", int18 == 1970);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        int int7 = localDateTime1.getMillisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withPeriodAdded(readablePeriod8, 40);
        int int11 = localDateTime10.getYearOfEra();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.joda.time.Chronology chronology3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(48, 70, 2922789, chronology3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("Property[yearOfCentury]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Property[yearOfCentury]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        java.lang.String str3 = property2.toString();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDateTime5.toDateTime(dateTimeZone6);
        int int8 = property2.getDifference((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.LocalDateTime localDateTime9 = property2.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[centuryOfEra]" + "'", str3, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
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
        org.joda.time.LocalDate localDate15 = localDate11.withWeekOfWeekyear(5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = localDate11.withDayOfWeek(40);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 40 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        java.lang.String str3 = property2.toString();
        int int4 = property2.getLeapAmount();
        java.lang.String str5 = property2.toString();
        org.joda.time.LocalDateTime localDateTime7 = property2.setCopy(7);
        long long8 = property2.getMillis();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[centuryOfEra]" + "'", str3, "Property[centuryOfEra]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Property[centuryOfEra]" + "'", str5, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25200052L + "'", long8 == 25200052L);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
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
        org.joda.time.LocalDate.Property property17 = localDate15.weekyear();
        org.joda.time.LocalDate localDate18 = property17.roundFloorCopy();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 25 + "'", int16 == 25);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate18);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
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
        org.joda.time.LocalDate.Property property15 = localDate11.weekyear();
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
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
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
        org.joda.time.LocalDate localDate25 = localDate22.withYear(86399999);
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
        org.junit.Assert.assertNotNull(localDate25);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        int int6 = localDateTime1.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.year();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusHours(10);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withYearOfCentury(271);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 271 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
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
        org.joda.time.Interval interval27 = localDate24.toInterval(dateTimeZone26);
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
        org.junit.Assert.assertNotNull(interval27);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localDateTime2.getFields();
        org.joda.time.LocalDateTime.Property property4 = localDateTime2.monthOfYear();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withWeekyear(26);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfWeek();
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(867, 10, (int) (short) 100, 5, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withMillisOfDay(7);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.centuryOfEra();
        long long4 = property3.remainder();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
// flaky "7) test1316(org.joda.time.RegressionTest2)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1365152391906L) + "'", long4 == (-1365152391906L));
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, (-1));
        org.joda.time.LocalDate localDate10 = localDate0.withDayOfYear((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = localDate10.withWeekOfWeekyear(621);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 621 for weekOfWeekyear must be in the range [1,53]");
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
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
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
        int int18 = localDateTime16.getYearOfEra();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1969 + "'", int18 == 1969);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        org.joda.time.LocalDateTime.Property property36 = localDateTime32.dayOfMonth();
        int int37 = property36.get();
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.minusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.LocalDate localDate5 = localDate2.withEra(0);
        org.joda.time.LocalDate localDate7 = localDate2.withCenturyOfEra(365);
        org.joda.time.LocalDate localDate9 = localDate7.withLocalMillis((long) 269);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYear(2007);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("\u0e01\u0e38\u0e21\u0e20\u0e32\u0e1e\u0e31\u0e19\u0e18\u0e4c");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"??????????\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        java.lang.String str8 = property7.getAsString();
        java.util.Locale locale10 = null;
        org.joda.time.LocalDate localDate11 = property7.setCopy("271", locale10);
        java.util.Locale locale12 = null;
        java.lang.String str13 = property7.getAsShortText(locale12);
        org.joda.time.LocalDate localDate15 = property7.addToCopy(40);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026" + "'", str8, "2026");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2026" + "'", str13, "2026");
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate9 = localDate0.withYear((int) '4');
        org.joda.time.LocalDate localDate11 = localDate9.withWeekyear(100);
        org.joda.time.LocalDate localDate13 = localDate9.withYear(2026);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate15 = localDate13.plus(readablePeriod14);
        int int16 = localDate13.getEra();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.withDayOfYear(4);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        org.joda.time.LocalDate localDate6 = property5.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate8 = localDate6.minusWeeks((int) (byte) 100);
        org.joda.time.LocalTime localTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDate8.toLocalDateTime(localTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The time must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((int) (short) 0, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
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
        org.joda.time.LocalDateTime localDateTime22 = property21.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime23 = property21.roundFloorCopy();
        java.lang.String str24 = property21.getAsText();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property21.getFieldType();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime16.withField(dateTimeFieldType25, (int) (short) 0);
        org.joda.time.DurationFieldType durationFieldType28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withFieldAdded(durationFieldType28, 99);
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
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
// flaky "8) test1327(org.joda.time.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u0e04\u0e28." + "'", str24, "\u0e04\u0e28.");
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(localDateTime27);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
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
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = property15.setCopy(242);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 242 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
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
        org.joda.time.LocalDateTime localDateTime24 = localDateTime17.withDate(271, 12, 3);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.withWeekyear(0);
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
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
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
        int int16 = localDateTime10.getCenturyOfEra();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 19 + "'", int16 == 19);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localDateTime1.isSupported(durationFieldType5);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        java.lang.Object obj0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(obj0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) localDate1, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withMinuteOfHour((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withWeekyear(69);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate6 = localDate1.withPeriodAdded(readablePeriod4, 25260000);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate6.withYearOfCentury(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, (-1));
        org.joda.time.LocalDate.Property property9 = localDate8.yearOfEra();
        java.lang.Class<?> wildcardClass10 = localDate8.getClass();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate localDate9 = property8.roundHalfFloorCopy();
        org.joda.time.LocalDate.Property property10 = localDate9.dayOfWeek();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withDayOfWeek(271);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 271 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 19 + "'", int14 == 19);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) (byte) -1, 2037, 366, 40, 621);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 40 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(40, (int) (short) 100, 0, 2032, (-1790557193), 70, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2032 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
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
        int int23 = property22.getMinimumValueOverall();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
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
            org.joda.time.LocalDateTime localDateTime32 = localDateTime26.withTime(521, 7, 48, 14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 521 for hourOfDay must be in the range [0,23]");
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
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        boolean boolean15 = property14.isLeap();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = property14.setCopy("-25198082");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -25198082 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (short) 100, (int) (short) 10, 521, 8, (int) ' ', 8, (-1790557189));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1790557189 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
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
        org.joda.time.LocalDate.Property property29 = localDate28.dayOfYear();
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
        org.junit.Assert.assertNotNull(property29);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.minusWeeks((int) (byte) 10);
        org.joda.time.LocalDate.Property property3 = localDate2.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) property3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDate$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = localDateTime17.withDayOfWeek((-1790557199));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1790557199 for dayOfWeek must be in the range [1,7]");
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
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
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
        org.joda.time.LocalDate.Property property17 = localDate15.weekyear();
        org.joda.time.LocalDate localDate18 = property17.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 25 + "'", int16 == 25);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate18);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
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
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) '4');
        int int18 = localDateTime17.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.dayOfYear();
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime21 = property20.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property20.getFieldType();
        boolean boolean23 = localDateTime10.isSupported(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 28320052 + "'", int14 == 28320052);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withEra(999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for era must be in the range [0,1]");
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
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
        org.joda.time.LocalDateTime localDateTime25 = localDateTime13.minusDays((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.minusSeconds(652);
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
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime28);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusMillis((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withDate(999, 0, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        java.util.Date date17 = localDate16.toDate();
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
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
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
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate18 = localDate15.withPeriodAdded(readablePeriod16, (int) (byte) -1);
        org.joda.time.LocalDate localDate20 = localDate15.plusWeeks(0);
        org.joda.time.LocalDate localDate22 = localDate20.withYear((int) ' ');
        org.joda.time.LocalDate localDate24 = localDate20.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalTime localTime25 = null;
        org.joda.time.DateTime dateTime26 = localDate20.toDateTime(localTime25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = localDate20.toDateTimeAtCurrentTime(dateTimeZone27);
        org.joda.time.DateTime dateTime29 = localDate7.toDateTime((org.joda.time.ReadableInstant) dateTime28);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withCenturyOfEra(1);
        int int3 = localDateTime0.getYear();
        org.joda.time.DateTime dateTime4 = localDateTime0.toDateTime();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withHourOfDay(0);
        org.joda.time.DurationFieldType durationFieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime0.withFieldAdded(durationFieldType7, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2026 + "'", int3 == 2026);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMillis(12);
        long long7 = localDateTime6.getLocalMillis();
        org.joda.time.DateTime dateTime8 = localDateTime6.toDateTime();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withYear(999);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1580400064L + "'", long7 == 1580400064L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
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
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.minus(readablePeriod18);
        int int20 = localDateTime16.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfDay();
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
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(0, (int) (byte) 1, 743);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 743 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
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
        org.joda.time.LocalDate localDate21 = property19.addWrapFieldToCopy(99);
        long long22 = localDate21.getLocalMillis();
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
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-57378758400000L) + "'", long22 == (-57378758400000L));
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withMillisOfDay(7);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plus(readableDuration5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plusMonths(15);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withYear(4);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime7.minusDays((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime7.minusHours(39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate15 = localDate12.withPeriodAdded(readablePeriod13, (int) (byte) -1);
        org.joda.time.LocalDate localDate17 = localDate12.plusWeeks(0);
        org.joda.time.LocalDate localDate19 = localDate17.withYear((int) ' ');
        org.joda.time.LocalDate localDate21 = localDate19.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property22 = localDate19.yearOfCentury();
        org.joda.time.LocalDate localDate23 = property22.roundHalfCeilingCopy();
        int int24 = localDate23.getCenturyOfEra();
        org.joda.time.LocalDate.Property property25 = localDate23.weekyear();
        org.joda.time.Chronology chronology26 = localDate23.getChronology();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(chronology26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((java.lang.Object) localDate0, chronology26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(chronology26);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        java.util.Date date15 = localDate13.toDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = localDate13.withCenturyOfEra((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Feb 19 00:00:00 ICT 2032");
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
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
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.centuryOfEra();
        java.lang.String str46 = property45.toString();
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = localDateTime48.toDateTime(dateTimeZone49);
        int int51 = property45.getDifference((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.LocalDateTime localDateTime53 = property45.addToCopy(12);
        org.joda.time.LocalDateTime localDateTime54 = property45.withMinimumValue();
        int int55 = localDateTime5.compareTo((org.joda.time.ReadablePartial) localDateTime54);
        int int56 = localDateTime54.getYear();
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
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Property[centuryOfEra]" + "'", str46, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 70 + "'", int56 == 70);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, (-1));
        org.joda.time.LocalDate localDate10 = localDate0.withDayOfYear((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = localDate10.plusYears(292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292281019 for year must be in the range [-292275054,292278993]");
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
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
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
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfDay();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) '4');
        int int22 = localDateTime21.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withDayOfYear(3);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = localDateTime21.toDateTime(dateTimeZone25);
        int int27 = property19.compareTo((org.joda.time.ReadableInstant) dateTime26);
        java.lang.String str28 = property19.toString();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1970 + "'", int22 == 1970);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Property[millisOfDay]" + "'", str28, "Property[millisOfDay]");
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
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
        org.joda.time.LocalDate localDate13 = property12.withMinimumValue();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = localDate13.toString(dateTimeFormatter14);
        int int16 = localDate13.getYearOfEra();
        java.lang.String str17 = localDate13.toString();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2032-01-01" + "'", str15, "2032-01-01");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2032 + "'", int16 == 2032);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2032-01-01" + "'", str17, "2032-01-01");
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
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
        int int12 = localDateTime8.getMillisOfSecond();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.Interval interval2 = localDate1.toInterval();
        int int3 = localDate1.getEra();
        org.junit.Assert.assertNotNull(interval2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
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
        org.joda.time.LocalDateTime localDateTime22 = localDateTime1.plusDays((int) (byte) 100);
        java.lang.String str24 = localDateTime1.toString("1832");
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1832" + "'", str24, "1832");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        java.util.Date date10 = localDateTime9.toDate();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.fromDateFields(date10);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.fromDateFields(date10);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusMillis(7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = property2.setCopy("2026-09-26T04:01:34.521");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2026-09-26T04:01:34.521\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(59, 4, 269, 2007, 2026);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2007 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (short) -1, 39, 15, 25200000, 14403717, (-292275054), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25200000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
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
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.centuryOfEra();
        java.lang.String str17 = localDateTime12.toString("271");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime12.withDayOfWeek(2025);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2025 for dayOfWeek must be in the range [1,7]");
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
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "271" + "'", str17, "271");
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        int int7 = property3.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime8 = property3.roundHalfFloorCopy();
        int int9 = property3.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime10 = property3.roundCeilingCopy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
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
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) '4');
        int int36 = localDateTime35.getYearOfEra();
        org.joda.time.LocalDateTime.Property property37 = localDateTime35.minuteOfHour();
        org.joda.time.LocalDateTime.Property property38 = localDateTime35.era();
        long long39 = property38.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = property38.getFieldType();
        boolean boolean41 = localDateTime29.isSupported(dateTimeFieldType40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime10.property(dateTimeFieldType40);
        org.joda.time.LocalDateTime localDateTime43 = property42.roundHalfEvenCopy();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1970 + "'", int21 == 1970);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 28320052 + "'", int33 == 28320052);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1970 + "'", int36 == 1970);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 25200052L + "'", long39 == 25200052L);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDateTime43);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        java.lang.String str10 = property9.getAsShortText();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property9.getAsText(locale11);
        org.joda.time.DateTimeField dateTimeField13 = property9.getField();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
// flaky "9) test1378(org.joda.time.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u0e01\u0e1e." + "'", str10, "\u0e01\u0e1e.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u0e01\u0e38\u0e21\u0e20\u0e32\u0e1e\u0e31\u0e19\u0e18\u0e4c" + "'", str12, "\u0e01\u0e38\u0e21\u0e20\u0e32\u0e1e\u0e31\u0e19\u0e18\u0e4c");
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
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
        org.joda.time.LocalDate localDate25 = property10.withMaximumValue();
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
        org.junit.Assert.assertNotNull(localDate25);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
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
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localDate25.toDateTimeAtStartOfDay(dateTimeZone26);
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
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate22 = property20.setCopy("5232-02-10");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"5232-02-10\" for dayOfYear is not supported");
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
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("2026");
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusSeconds((int) (byte) 100);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDateTime1.toDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.secondOfMinute();
        int int6 = property5.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime8 = property5.addWrapFieldToCopy(7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusSeconds((int) (short) 100);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks(1970);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMonthOfYear(2);
        int int13 = localDateTime12.getYear();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.secondOfMinute();
        boolean boolean15 = property14.isLeap();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2007 + "'", int13 == 2007);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
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
        org.joda.time.LocalDateTime localDateTime14 = property3.roundHalfEvenCopy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 420L + "'", long10 == 420L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.hourOfDay();
        int int6 = localDateTime1.getYear();
        java.lang.String str8 = localDateTime1.toString("\u0e04\u0e28.");
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minusSeconds((int) ' ');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusSeconds(269);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.weekOfWeekyear();
        boolean boolean14 = property13.isLeap();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u0e04\u0e28." + "'", str8, "\u0e04\u0e28.");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withWeekOfWeekyear((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        boolean boolean6 = property5.isLeap();
        java.util.Locale locale7 = null;
        int int8 = property5.getMaximumTextLength(locale7);
        java.util.Locale locale9 = null;
        java.lang.String str10 = property5.getAsText(locale9);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970" + "'", str10, "1970");
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        java.lang.String str7 = localDateTime6.toString();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withMinuteOfHour(0);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.weekyear();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.minus(readableDuration11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0035-01-04T07:00:00.052" + "'", str7, "0035-01-04T07:00:00.052");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate0.year();
        org.joda.time.LocalDate localDate5 = property3.addToCopy(3);
        org.joda.time.LocalDate localDate6 = property3.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((java.lang.Object) localDate6, dateTimeZone7);
        org.joda.time.LocalDate.Property property9 = localDate8.yearOfCentury();
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = property9.setCopy("2026-01-04", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2026-01-04\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
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
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDate localDate23 = localDate20.withPeriodAdded(readablePeriod21, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight24 = localDate20.toDateMidnight();
        org.joda.time.LocalDate localDate26 = localDate20.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property27 = localDate20.dayOfYear();
        org.joda.time.LocalDate localDate29 = property27.addWrapFieldToCopy((int) (short) 1);
        org.joda.time.Chronology chronology30 = property27.getChronology();
        org.joda.time.LocalDate localDate31 = org.joda.time.LocalDate.now(chronology30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((java.lang.Object) localDate7, chronology30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(localDate31);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate localDate10 = localDate5.plusWeeks((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight11 = localDate5.toDateMidnight();
        int int12 = localDate5.getMonthOfYear();
        org.joda.time.DateTime dateTime13 = localDate5.toDateTimeAtCurrentTime();
        org.joda.time.LocalTime localTime14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate5.toDateTime(localTime14, dateTimeZone15);
        org.joda.time.LocalDate.Property property17 = localDate5.era();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
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
        org.joda.time.LocalDateTime.Property property15 = localDateTime10.hourOfDay();
        org.joda.time.LocalDateTime localDateTime16 = property15.getLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withWeekOfWeekyear(99);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for weekOfWeekyear must be in the range [1,53]");
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
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(2026);
        org.joda.time.LocalDate localDate13 = localDate11.plusWeeks(19);
        org.joda.time.LocalDate.Property property14 = localDate11.dayOfYear();
        java.lang.String str15 = property14.getName();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "dayOfYear" + "'", str15, "dayOfYear");
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
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
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 25200000, chronology15);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.DateTime dateTime7 = localDate0.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate9 = localDate0.withYear(25200052);
        org.joda.time.LocalDate localDate11 = localDate9.minusYears(28);
        org.joda.time.LocalDate.Property property12 = localDate11.weekyear();
        java.util.Locale locale13 = null;
        java.lang.String str14 = property12.getAsText(locale13);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "25200024" + "'", str14, "25200024");
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
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
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTimeAtMidnight(dateTimeZone13);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
        org.joda.time.DateTime dateTime18 = localDateTime16.toDateTime(dateTimeZone17);
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
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withMillisOfDay(7);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.centuryOfEra();
        java.lang.String str9 = property8.toString();
        int int10 = property8.getLeapAmount();
        java.lang.String str11 = property8.toString();
        org.joda.time.LocalDateTime localDateTime13 = property8.setCopy(7);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minus(readableDuration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) '4');
        int int21 = localDateTime20.getYearOfEra();
        org.joda.time.LocalDateTime.Property property22 = localDateTime20.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime24 = property22.addToCopy((int) '4');
        org.joda.time.Chronology chronology25 = property22.getChronology();
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now(chronology25);
        org.joda.time.DateTimeField dateTimeField27 = localDateTime13.getField(0, chronology25);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) '4');
        int int30 = localDateTime29.getYearOfEra();
        org.joda.time.LocalDateTime.Property property31 = localDateTime29.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime33 = property31.addToCopy((int) '4');
        org.joda.time.Chronology chronology34 = property31.getChronology();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(chronology34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime39 = localDateTime35.minusHours((-1));
        org.joda.time.LocalDateTime localDateTime41 = localDateTime35.withLocalMillis((long) 28);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.minusYears(14);
        int int44 = localDateTime43.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((long) '4');
        int int47 = localDateTime46.getYearOfEra();
        org.joda.time.LocalDateTime.Property property48 = localDateTime46.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime50 = property48.addToCopy((int) '4');
        int int51 = localDateTime50.getEra();
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((long) '4');
        int int54 = localDateTime53.getYearOfEra();
        org.joda.time.LocalDateTime.Property property55 = localDateTime53.minuteOfHour();
        int int56 = property55.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime58 = property55.addWrapFieldToCopy((int) 'a');
        int int59 = localDateTime58.getWeekyear();
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime((long) '4');
        int int62 = localDateTime61.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime61.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime61.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime71 = localDateTime61.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        java.util.Date date72 = localDateTime61.toDate();
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime((long) '4');
        int int75 = localDateTime74.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property76 = localDateTime74.dayOfYear();
        org.joda.time.LocalDateTime.Property property77 = localDateTime74.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime78 = property77.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType79 = property77.getFieldType();
        int int80 = localDateTime61.get(dateTimeFieldType79);
        boolean boolean81 = localDateTime58.isSupported(dateTimeFieldType79);
        org.joda.time.LocalDateTime.Property property82 = localDateTime50.property(dateTimeFieldType79);
        org.joda.time.LocalDateTime.Property property83 = localDateTime43.property(dateTimeFieldType79);
        org.joda.time.LocalDateTime localDateTime85 = localDateTime13.withField(dateTimeFieldType79, (int) (short) 1);
        int int86 = localDateTime5.get(dateTimeFieldType79);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Property[centuryOfEra]" + "'", str9, "Property[centuryOfEra]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Property[centuryOfEra]" + "'", str11, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1970 + "'", int21 == 1970);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1970 + "'", int30 == 1970);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1970 + "'", int47 == 1970);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1970 + "'", int54 == 1970);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 59 + "'", int56 == 59);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1970 + "'", int59 == 1970);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertNotNull(localDateTime78);
        org.junit.Assert.assertNotNull(dateTimeFieldType79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(property82);
        org.junit.Assert.assertNotNull(property83);
        org.junit.Assert.assertNotNull(localDateTime85);
// flaky "10) test1399(org.joda.time.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int86 + "' != '" + 9 + "'", int86 == 9);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
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
            org.joda.time.LocalDate localDate19 = localDate17.withEra((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for era must be in the range [0,1]");
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
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) '4');
        int int14 = localDateTime13.getYearOfEra();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.minuteOfHour();
        org.joda.time.LocalDateTime.Property property16 = localDateTime13.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = localDateTime13.getFieldTypes();
        org.joda.time.LocalDateTime.Property property18 = localDateTime13.secondOfMinute();
        org.joda.time.LocalDateTime.Property property19 = localDateTime13.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property19.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = localDateTime10.withField(dateTimeFieldType20, (-1790557189));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1790557189 for monthOfYear must be in the range [1,12]");
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
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(119, (int) '#', 40);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withLocalMillis((long) 28320052);
        org.joda.time.Chronology chronology12 = localDateTime11.getChronology();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 31, chronology12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(242, 42, 0, 69, 0, (int) (byte) 1, 69, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
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
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localDateTime16.toDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime16.year();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundHalfFloorCopy();
        int int6 = localDateTime5.getDayOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.minusDays(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(10, 2, 14, 3, (-1790557199), (int) (short) 100, 53994173);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1790557199 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate localDate8 = localDate0.plusYears((int) (short) 1);
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfCentury(52);
        java.util.Date date11 = localDate8.toDate();
        int int12 = localDate8.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = localDate8.withDayOfMonth(99);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Tue Sep 28 00:00:00 ICT 2027");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        org.joda.time.LocalDateTime.Property property6 = localDateTime1.secondOfMinute();
        org.joda.time.DurationField durationField7 = property6.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property6.addWrapFieldToCopy(0);
        int int10 = localDateTime9.getMonthOfYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = localDate25.getFieldType((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate6 = localDate3.withPeriodAdded(readablePeriod4, (int) (byte) -1);
        org.joda.time.LocalDate localDate8 = localDate3.plusWeeks(0);
        org.joda.time.LocalDate localDate10 = localDate8.withYear((int) ' ');
        org.joda.time.LocalDate localDate12 = localDate10.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property13 = localDate10.yearOfCentury();
        org.joda.time.LocalDate localDate14 = property13.roundHalfCeilingCopy();
        int int15 = localDate14.getCenturyOfEra();
        org.joda.time.LocalDate.Property property16 = localDate14.weekyear();
        org.joda.time.Chronology chronology17 = localDate14.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((int) (short) 100, (int) (byte) -1, (int) (short) 10, chronology17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(chronology17);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
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
        java.util.Locale locale14 = null;
        java.lang.String str15 = property11.getAsShortText(locale14);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "8" + "'", str15, "8");
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        int int12 = localDateTime11.getMillisOfSecond();
        int int13 = localDateTime11.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.dayOfYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
        org.joda.time.LocalDateTime.Property property15 = localDateTime1.hourOfDay();
        java.lang.String str16 = property15.getAsString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "7" + "'", str16, "7");
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localDateTime2.getFields();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.minusDays(59);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.dayOfYear();
        long long7 = localDateTime2.getLocalMillis();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) '4');
        int int10 = localDateTime9.getYearOfEra();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime13 = property11.addToCopy((int) '4');
        int int14 = localDateTime13.getEra();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.plus(readableDuration15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.plusMillis(0);
        int int20 = localDateTime13.getValue(2);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime13.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusMinutes(0);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) '4');
        int int27 = localDateTime26.getYearOfEra();
        org.joda.time.LocalDateTime.Property property28 = localDateTime26.minuteOfHour();
        org.joda.time.LocalDateTime.Property property29 = localDateTime26.era();
        org.joda.time.LocalDateTime localDateTime30 = property29.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime31 = property29.roundFloorCopy();
        java.lang.String str32 = property29.getAsText();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property29.getFieldType();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime24.withField(dateTimeFieldType33, (int) (short) 0);
        int int36 = localDateTime2.get(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 25200000L + "'", long7 == 25200000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1970 + "'", int27 == 1970);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime31);
// flaky "11) test1414(org.joda.time.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u0e04\u0e28." + "'", str32, "\u0e04\u0e28.");
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        org.joda.time.LocalDateTime.Property property6 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.minusWeeks(652);
        int int10 = localDateTime1.getYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime1.withWeekOfWeekyear(28320052);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28320052 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate5 = property4.getLocalDate();
        int int6 = property4.getLeapAmount();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) property4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDate$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekOfWeekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = localDateTime2.toString(dateTimeFormatter4);
        int int6 = localDateTime2.getSecondOfMinute();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T07:00:00.000" + "'", str5, "1970-01-01T07:00:00.000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusMillis(39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
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
        org.joda.time.LocalDateTime localDateTime25 = localDateTime13.minusDays((int) (byte) 1);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minus(readableDuration26);
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
        org.junit.Assert.assertNotNull(localDateTime27);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(2026);
        java.lang.Class<?> wildcardClass12 = localDate9.getClass();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        org.joda.time.DateTime dateTime7 = localDate0.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate.Property property8 = localDate0.weekOfWeekyear();
        org.joda.time.DateTime dateTime9 = localDate0.toDateTimeAtStartOfDay();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(999, 28, 28, (int) ' ', 50);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
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
        org.joda.time.LocalDate.Property property17 = localDate15.dayOfWeek();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 25 + "'", int16 == 25);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.DateTime dateTime10 = localDate9.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate12 = localDate9.withCenturyOfEra((int) '4');
        org.joda.time.LocalDate.Property property13 = localDate12.dayOfMonth();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray14 = localDate12.getFieldTypes();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray14);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate localDate8 = localDate0.withYear(69);
        org.joda.time.LocalDate localDate10 = localDate8.minusWeeks(999);
        org.joda.time.LocalTime localTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDate8.toLocalDateTime(localTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The time must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        org.joda.time.LocalDate localDate9 = property7.roundHalfEvenCopy();
        int int10 = localDate9.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = localDate9.withMonthOfYear(14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 14 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 26 + "'", int10 == 26);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate.Property property9 = localDate5.year();
        org.joda.time.LocalDate localDate11 = property9.setCopy("25200024");
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        int int12 = localDateTime5.getValue(2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime5.getFieldType(2025);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2025");
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
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(28319952L, dateTimeZone1);
        int int3 = localDate2.size();
        long long4 = localDate2.getLocalMillis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = localDate2.withEra(86399999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399999 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate localDate10 = localDate5.minusDays(2001);
        org.joda.time.LocalTime localTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDate5.toLocalDateTime(localTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The time must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = localDate18.withDayOfMonth(3938);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3938 for dayOfMonth must be in the range [1,30]");
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
        org.junit.Assert.assertNotNull(localDate18);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        int int7 = localDate6.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = localDate6.toDateMidnight(dateTimeZone8);
        int int10 = localDate6.getYearOfCentury();
        org.joda.time.DurationFieldType durationFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate6.withFieldAdded(durationFieldType11, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 28 + "'", int7 == 28);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 26 + "'", int10 == 26);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(25680052L, dateTimeZone1);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
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
        java.lang.String str24 = localDateTime1.toString();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01T07:00:00.052" + "'", str24, "1970-01-01T07:00:00.052");
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        int int6 = localDateTime1.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.year();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusDays(0);
        int int10 = localDateTime9.getEra();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withPeriodAdded(readablePeriod11, 521);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime9.withDayOfWeek(999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.millisOfSecond();
        int int8 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property9 = localDateTime1.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withDayOfYear(2025);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2025 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 25200052 + "'", int8 == 25200052);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
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
        int int25 = localDateTime13.getYearOfEra();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1970 + "'", int25 == 1970);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
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
        org.joda.time.LocalDate.Property property15 = localDate11.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.Interval interval17 = localDate11.toInterval(dateTimeZone16);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5232 + "'", int14 == 5232);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval17);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        boolean boolean9 = property8.isLeap();
        org.joda.time.LocalDate localDate10 = property8.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Interval interval12 = localDate10.toInterval(dateTimeZone11);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(interval12);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = localDate11.withWeekOfWeekyear(1869);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1869 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((-292275054), 25260000, 28, 7, 2026);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2026 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.Interval interval7 = property3.toInterval();
        org.joda.time.LocalDateTime localDateTime8 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime9 = property3.withMinimumValue();
        java.lang.String str10 = property3.getAsText();
        org.joda.time.LocalDateTime localDateTime11 = property3.getLocalDateTime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
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
        org.joda.time.LocalDate localDate16 = localDate7.plusMonths(10);
        org.joda.time.DurationFieldType durationFieldType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate19 = localDate16.withFieldAdded(durationFieldType17, 9);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(0L);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        java.lang.String str8 = property7.getAsText();
        java.util.Locale locale10 = null;
        org.joda.time.LocalDate localDate11 = property7.setCopy("2026", locale10);
        java.util.Locale locale12 = null;
        int int13 = property7.getMaximumTextLength(locale12);
        org.joda.time.DurationField durationField14 = property7.getDurationField();
        java.util.Locale locale15 = null;
        java.lang.String str16 = property7.getAsShortText(locale15);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026" + "'", str8, "2026");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2026" + "'", str16, "2026");
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate localDate10 = localDate8.minusYears(25200052);
        org.joda.time.Interval interval11 = localDate10.toInterval();
        int int12 = localDate10.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 2026, dateTimeZone14);
        int[] intArray16 = localDate15.getValues();
        org.joda.time.LocalDate.Property property17 = localDate15.weekOfWeekyear();
        org.joda.time.LocalDate localDate19 = property17.addToCopy(10);
        org.joda.time.LocalDate localDate21 = property17.addToCopy(1970);
        long long22 = property17.getMillis();
        java.lang.String str23 = property17.getAsShortText();
        boolean boolean24 = property17.isLeap();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property17.getFieldType();
        boolean boolean26 = localDate10.isSupported(dateTimeFieldType25);
        org.joda.time.LocalDate localDate27 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDate localDate30 = localDate27.withPeriodAdded(readablePeriod28, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight31 = localDate27.toDateMidnight();
        org.joda.time.LocalDate localDate33 = localDate27.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property34 = localDate27.dayOfYear();
        org.joda.time.DurationField durationField35 = property34.getDurationField();
        java.lang.String str36 = property34.getAsText();
        boolean boolean37 = property34.isLeap();
        org.joda.time.LocalDate localDate39 = property34.setCopy((int) ' ');
        org.joda.time.DateTime dateTime40 = localDate39.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime41 = localDate39.toDateTimeAtStartOfDay();
        boolean boolean42 = localDate10.isEqual((org.joda.time.ReadablePartial) localDate39);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1" + "'", str23, "1");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(dateMidnight31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "271" + "'", str36, "271");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property18.getFieldType();
        org.joda.time.LocalDateTime localDateTime22 = property18.addWrapFieldToCopy(28319952);
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
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
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
        org.joda.time.LocalDate localDate19 = localDate17.plusWeeks(2001);
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
        org.junit.Assert.assertNotNull(localDate19);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusMillis(4);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime7, dateTimeZone10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withHourOfDay(32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
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
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.weekyear();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = property7.getDifference(readableInstant8);
        org.joda.time.LocalDate localDate10 = property7.withMinimumValue();
        org.joda.time.LocalDate localDate11 = property7.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(25200000, 999, 3938, 35, 25260000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        boolean boolean6 = property5.isLeap();
        java.util.Locale locale7 = null;
        int int8 = property5.getMaximumTextLength(locale7);
        org.joda.time.LocalDateTime localDateTime10 = property5.addToCopy((long) 9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withWeekyear(6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withEra((int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("\u0e01\u0e38\u0e21\u0e20\u0e32\u0e1e\u0e31\u0e19\u0e18\u0e4c");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"??????????\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = property18.setCopy(28320052);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28320052 for dayOfYear must be in the range [1,365]");
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
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 39 + "'", int17 == 39);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
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
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.plusHours(2025);
        java.util.Locale locale25 = null;
        java.lang.String str26 = localDateTime17.toString("7", locale25);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "7" + "'", str26, "7");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("2026-09-28");
        int int2 = localDate1.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = localDate1.toString("2026-09-26T04:00:01.558");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime6 = property4.roundFloorCopy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = localDateTime6.toString(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0001-01-01T00:00:00.000" + "'", str8, "0001-01-01T00:00:00.000");
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
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
        org.joda.time.LocalDate.Property property14 = localDate13.era();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 28 + "'", int10 == 28);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 28 + "'", int11 == 28);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        int int7 = localDate6.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = localDate6.toDateMidnight(dateTimeZone8);
        int int10 = localDate6.getYearOfCentury();
        org.joda.time.DateMidnight dateMidnight11 = localDate6.toDateMidnight();
        org.joda.time.LocalTime localTime12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate6.toDateTime(localTime12, dateTimeZone13);
        org.joda.time.LocalDate.Property property15 = localDate6.weekOfWeekyear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 28 + "'", int7 == 28);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 26 + "'", int10 == 26);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(1970, 28787742, 2001);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28787742 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.DurationField durationField4 = property3.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.yearOfEra();
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDate localDate10 = localDate7.withPeriodAdded(readablePeriod8, (int) (byte) -1);
        org.joda.time.LocalDate localDate12 = localDate7.plusWeeks(0);
        org.joda.time.LocalDate.Property property13 = localDate7.era();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = localDateTime5.isEqual((org.joda.time.ReadablePartial) localDate7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfWeek();
        long long4 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime5 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime7 = property3.addToCopy((long) 1869);
        org.joda.time.DurationField durationField8 = property3.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 25200052L + "'", long4 == 25200052L);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNull(durationField8);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDateTime1.toDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.secondOfMinute();
        int int6 = property5.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime8 = property5.addWrapFieldToCopy(7);
        long long9 = property5.getMillis();
        int int10 = property5.getMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 25200052L + "'", long9 == 25200052L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 59 + "'", int10 == 59);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
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
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusDays(269);
        int int16 = localDateTime13.getSecondOfMinute();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = localDateTime13.getFieldTypes();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 55 + "'", int16 == 55);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMinimumValue();
        java.util.Date date6 = localDateTime5.toDate();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.minuteOfHour();
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.millisOfSecond();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Jan 01 07:00:00 ICT 1");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
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
        boolean boolean19 = localDateTime17.equals((java.lang.Object) 1790553600000L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField21 = localDateTime17.getField(14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 14");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime5.withHourOfDay(25200000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25200000 for hourOfDay must be in the range [0,23]");
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
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
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
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = localDateTime8.getFieldTypes();
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
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray12);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
        org.joda.time.DateTime dateTime22 = localDate16.toDateTimeAtStartOfDay();
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
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
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
        org.joda.time.LocalDateTime localDateTime17 = localDateTime4.withLocalMillis(10L);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusMonths(0);
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
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
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
        org.joda.time.Chronology chronology14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) localDate13, chronology14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
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
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
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
        int int14 = property13.getMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property18.getFieldType();
        org.joda.time.LocalDateTime localDateTime20 = property18.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = property18.setCopy("\u0e01\u0e38\u0e21\u0e20\u0e32\u0e1e\u0e31\u0e19\u0e18\u0e4c");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"??????????\" for millisOfDay is not supported");
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
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
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
        long long18 = localDate17.getLocalMillis();
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1939680000000L + "'", long18 == 1939680000000L);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(2026);
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
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        int int12 = localDateTime11.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withWeekOfWeekyear(7);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime16 = property15.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = property15.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfWeek();
        long long4 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime5 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime7 = property3.addToCopy((long) 1869);
        java.lang.String str8 = property3.getAsShortText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 25200052L + "'", long4 == 25200052L);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u0e1e\u0e24." + "'", str8, "\u0e1e\u0e24.");
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
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
        org.joda.time.LocalDate.Property property15 = localDate14.era();
        long long16 = property15.getMillis();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2032 + "'", int12 == 2032);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-61942060800000L) + "'", long16 == (-61942060800000L));
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        java.util.Locale locale23 = null;
        int int24 = property8.getMaximumTextLength(locale23);
        java.util.Locale locale26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate27 = property8.setCopy("2026-09-28T15:00:09.837", locale26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2026-09-28T15:00:09.837\" for monthOfYear is not supported");
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
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
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
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = localDateTime9.toString("1970-01-01T07:00:00.052", locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.DateTimeField dateTimeField5 = property3.getField();
        java.lang.String str6 = property3.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Property[minuteOfHour]" + "'", str6, "Property[minuteOfHour]");
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.withDurationAdded(readableDuration9, 50);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime5.withPeriodAdded(readablePeriod12, 999);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
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
        org.joda.time.LocalDateTime localDateTime15 = localDateTime5.withYear(743);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusYears(39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate localDate8 = localDate0.plusYears((int) (short) 1);
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfCentury(52);
        java.util.Date date11 = localDate8.toDate();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = localDate8.getValue(2037);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2037");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Tue Sep 28 00:00:00 ICT 2027");
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.withDayOfYear(32);
        int int7 = localDate6.getYearOfEra();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2026 + "'", int7 == 2026);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
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
        java.lang.String str13 = localDate0.toString("5232-02-10");
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 26 + "'", int7 == 26);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 28 + "'", int11 == 28);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "5232-02-10" + "'", str13, "5232-02-10");
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
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
        org.joda.time.LocalDate.Property property16 = localDate15.dayOfWeek();
        int int17 = localDate15.getDayOfYear();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 324 + "'", int17 == 324);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime6 = property4.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withWeekyear((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
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
        org.joda.time.LocalDate localDate18 = localDate16.plusDays((-1790557193));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = localDate16.withWeekOfWeekyear(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for weekOfWeekyear must be in the range [1,52]");
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
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "28" + "'", str12, "28");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate localDate5 = localDate2.minusYears((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks(0);
        int int8 = localDate5.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate10 = localDate5.plus(readablePeriod9);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        org.joda.time.LocalDate.Property property10 = localDate7.weekyear();
        org.joda.time.LocalDate localDate12 = localDate7.minusWeeks(652);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = localDate7.withMonthOfYear(2032);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2032 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        java.lang.String str7 = localDateTime6.toString();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withMinuteOfHour(0);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.centuryOfEra();
        org.joda.time.DurationFieldType durationFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withFieldAdded(durationFieldType11, 5232);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0035-01-04T07:00:00.052" + "'", str7, "0035-01-04T07:00:00.052");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(5, 2032, 53, (int) ' ', 32, 999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.LocalDate localDate10 = localDate7.plusDays(5);
        org.joda.time.LocalDate localDate12 = localDate7.withDayOfMonth(28);
        org.joda.time.LocalDate.Property property13 = localDate12.era();
        org.joda.time.DateTime dateTime14 = localDate12.toDateTimeAtMidnight();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        boolean boolean6 = property5.isLeap();
        java.util.Locale locale7 = null;
        int int8 = property5.getMaximumTextLength(locale7);
        org.joda.time.LocalDateTime localDateTime10 = property5.addToCopy((long) 9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDateTime10.toDateTime(dateTimeZone11);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
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
        java.util.Locale locale13 = null;
        java.lang.String str14 = property12.getAsShortText(locale13);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "32" + "'", str14, "32");
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
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
        org.joda.time.LocalDateTime.Property property36 = localDateTime32.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime37 = property36.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.era();
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
        org.junit.Assert.assertNotNull(property38);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.withDayOfYear(4);
        org.joda.time.LocalDate localDate6 = localDate0.plusMonths(2);
        int int7 = localDate6.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property8 = localDate6.yearOfCentury();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        java.lang.String str6 = property3.getAsString();
        org.joda.time.LocalDateTime localDateTime7 = property3.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfMonth(14403717);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 14403717 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.DurationField durationField8 = property7.getDurationField();
        org.joda.time.DurationField durationField9 = property7.getLeapDurationField();
        org.joda.time.LocalDate localDate10 = property7.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertNotNull(localDate10);
    }
}
