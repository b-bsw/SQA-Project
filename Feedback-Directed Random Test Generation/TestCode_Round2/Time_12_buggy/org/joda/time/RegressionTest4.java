package org.joda.time;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
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
        org.joda.time.LocalDateTime localDateTime16 = property14.addToCopy((-1790557193));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = property14.setCopy("2032-01-01");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2032-01-01\" for secondOfMinute is not supported");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2007 + "'", int13 == 2007);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withMillisOfDay(7);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withYear(53);
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.weekyear();
        java.util.Locale locale8 = null;
        int int9 = property7.getMaximumShortTextLength(locale8);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        java.util.Date date12 = localDateTime1.toDate();
        java.util.Locale locale14 = null;
        java.lang.String str15 = localDateTime1.toString("2026-01-04", locale14);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) '4');
        int int18 = localDateTime17.getYearOfEra();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.minuteOfHour();
        int int20 = property19.getMaximumValue();
        org.joda.time.DateTimeField dateTimeField21 = property19.getField();
        java.lang.String str22 = property19.getAsText();
        org.joda.time.Chronology chronology23 = property19.getChronology();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now(chronology23);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(chronology23);
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
        int int61 = localDateTime25.indexOf(dateTimeFieldType59);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime1.withField(dateTimeFieldType59, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2026-01-04" + "'", str15, "2026-01-04");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1970 + "'", int18 == 1970);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 59 + "'", int20 == 59);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(localDateTime24);
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
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 3 + "'", int61 == 3);
        org.junit.Assert.assertNotNull(localDateTime63);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        java.lang.String str6 = property3.getAsString();
        org.joda.time.LocalDateTime localDateTime8 = property3.addWrapFieldToCopy(70);
        org.joda.time.LocalDateTime localDateTime10 = property3.setCopy(56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        int int17 = localDateTime10.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime10.plusHours(119);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 28320052 + "'", int14 == 28320052);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        java.lang.String str8 = property7.getAsString();
        long long9 = property7.getMillis();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026" + "'", str8, "2026");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1790553600000L + "'", long9 == 1790553600000L);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        org.joda.time.LocalDateTime localDateTime15 = property13.addToCopy((long) 271);
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
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("2026-09-28");
        int int2 = localDateTime1.getMonthOfYear();
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate.Property property9 = localDate5.year();
        org.joda.time.LocalDate.Property property10 = localDate5.dayOfMonth();
        org.joda.time.LocalDate localDate12 = localDate5.plusWeeks((int) '#');
        org.joda.time.LocalDate localDate14 = localDate12.withDayOfMonth(25);
        org.joda.time.DateTime dateTime15 = localDate14.toDateTimeAtCurrentTime();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        org.joda.time.LocalDateTime.Property property19 = localDateTime9.weekyear();
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
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
        org.joda.time.Chronology chronology20 = property19.getChronology();
        org.joda.time.LocalDate localDate21 = property19.roundHalfEvenCopy();
        java.lang.Class<?> wildcardClass22 = property19.getClass();
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
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusYears(271);
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
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        org.joda.time.LocalDateTime.Property property6 = localDateTime1.secondOfMinute();
        org.joda.time.DurationField durationField7 = property6.getLeapDurationField();
        long long8 = property6.getMillis();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNull(durationField7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25200052L + "'", long8 == 25200052L);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        boolean boolean10 = localDate7.equals((java.lang.Object) 100.0d);
        org.joda.time.LocalDate localDate12 = localDate7.withWeekyear(28320052);
        org.joda.time.LocalDate localDate14 = localDate7.plusDays(2025);
        int int15 = localDate14.getWeekyear();
        int int16 = localDate14.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = localDate14.toDateMidnight(dateTimeZone17);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2037 + "'", int15 == 2037);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2037 + "'", int16 == 2037);
        org.junit.Assert.assertNotNull(dateMidnight18);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        int int14 = localDateTime9.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = localDate24.toDateTimeAtStartOfDay(dateTimeZone27);
        int int29 = localDate24.getDayOfMonth();
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
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        org.joda.time.LocalDate localDate15 = property10.withMaximumValue();
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
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.Interval interval21 = localDate9.toInterval(dateTimeZone20);
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
        org.junit.Assert.assertNotNull(interval21);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.plusMonths(1969);
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
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        org.joda.time.LocalDate localDate18 = localDate16.withYearOfEra(28319952);
        org.joda.time.LocalDate localDate20 = localDate18.withCenturyOfEra(33);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDate localDate25 = localDate22.withPeriodAdded(readablePeriod23, (int) (byte) -1);
        int int26 = localDate22.getYearOfEra();
        org.joda.time.LocalDate localDate28 = localDate22.plusDays(1970);
        org.joda.time.LocalDate localDate29 = localDate21.withFields((org.joda.time.ReadablePartial) localDate28);
        long long30 = localDate21.getLocalMillis();
        org.joda.time.LocalDate.Property property31 = localDate21.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = null;
        boolean boolean33 = localDate21.isSupported(dateTimeFieldType32);
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate35 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDate localDate38 = localDate35.withPeriodAdded(readablePeriod36, (int) (byte) -1);
        int int39 = localDate35.getYearOfEra();
        org.joda.time.LocalDate localDate41 = localDate35.plusDays(1970);
        org.joda.time.LocalDate localDate42 = localDate34.withFields((org.joda.time.ReadablePartial) localDate41);
        boolean boolean43 = localDate21.equals((java.lang.Object) localDate42);
        org.joda.time.LocalDate localDate45 = localDate21.withYear(100);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((java.lang.Object) localDate45, dateTimeZone46);
        org.joda.time.LocalDate.Property property48 = localDate45.dayOfWeek();
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((java.lang.Object) localDate45);
        org.joda.time.LocalDate localDate50 = localDate18.withFields((org.joda.time.ReadablePartial) localDate45);
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
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2026 + "'", int26 == 2026);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1790553600000L + "'", long30 == 1790553600000L);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2026 + "'", int39 == 2026);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(localDate50);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = localDate0.toDateMidnight(dateTimeZone8);
        java.util.Date date10 = localDate0.toDate();
        org.joda.time.LocalTime localTime11 = null;
        org.joda.time.DateTime dateTime12 = localDate0.toDateTime(localTime11);
        int int13 = localDate0.getDayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = localDate0.withWeekyear((-1790557193));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1790557193 for weekyear must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 271 + "'", int13 == 271);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        org.joda.time.LocalDateTime.Property property19 = localDateTime10.era();
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
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minusMonths(2);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusHours((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusMillis(2032);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        org.joda.time.LocalDate localDate23 = localDate5.minusYears(365);
        org.joda.time.LocalDate localDate25 = localDate5.minusMonths(867);
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
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.yearOfEra();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.plusWeeks(28);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withMillisOfSecond((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusDays(1969);
        int int17 = localDateTime16.getHourOfDay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plus(readablePeriod6);
        int int8 = localDateTime7.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withYearOfEra(53);
        int int11 = localDateTime10.getMillisOfDay();
        int int12 = localDateTime10.getYearOfCentury();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25200052 + "'", int11 == 25200052);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localDateTime2.getFields();
        org.joda.time.LocalDateTime.Property property4 = localDateTime2.monthOfYear();
        org.joda.time.DurationField durationField5 = property4.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime6 = property4.roundCeilingCopy();
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.DurationField durationField5 = property4.getLeapDurationField();
        int int6 = property4.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNull(durationField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("Property[weekyear]", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        boolean boolean10 = localDate7.equals((java.lang.Object) 100.0d);
        org.joda.time.LocalDate.Property property11 = localDate7.era();
        java.util.Locale locale12 = null;
        int int13 = property11.getMaximumShortTextLength(locale12);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.withDayOfYear(4);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        org.joda.time.DateTime dateTime6 = localDate4.toDateTimeAtCurrentTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate4.withMonthOfYear(3938);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3938 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = property12.setCopy("2026-09-28T15:00:14.501", locale15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2026-09-28T15:00:14.501\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 4233600000L + "'", long13 == 4233600000L);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeZone2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.minuteOfHour();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property5.getAsText(locale6);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate localDate10 = localDate5.plusWeeks((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight11 = localDate5.toDateMidnight();
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate16 = localDate13.withPeriodAdded(readablePeriod14, (int) (byte) -1);
        org.joda.time.LocalDate localDate18 = localDate13.plusWeeks(0);
        org.joda.time.LocalDate localDate20 = localDate18.withYear((int) ' ');
        org.joda.time.LocalDate localDate22 = localDate20.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property23 = localDate20.yearOfCentury();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDate localDate28 = localDate25.withPeriodAdded(readablePeriod26, (int) (byte) -1);
        int int29 = localDate25.getYearOfEra();
        org.joda.time.LocalDate localDate31 = localDate25.plusDays(1970);
        org.joda.time.LocalDate localDate32 = localDate24.withFields((org.joda.time.ReadablePartial) localDate31);
        org.joda.time.LocalDate.Property property33 = localDate31.monthOfYear();
        org.joda.time.LocalDate localDate35 = localDate31.withCenturyOfEra((int) '4');
        org.joda.time.LocalDate localDate37 = localDate35.withDayOfMonth((int) (byte) 10);
        boolean boolean38 = localDate20.isAfter((org.joda.time.ReadablePartial) localDate37);
        org.joda.time.LocalDate.Property property39 = localDate37.dayOfMonth();
        org.joda.time.LocalDate localDate40 = property39.roundHalfFloorCopy();
        org.joda.time.Chronology chronology41 = localDate40.getChronology();
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate(25200000L, chronology41);
        org.joda.time.LocalDate.Property property43 = localDate42.dayOfWeek();
        org.joda.time.LocalDate localDate45 = localDate42.minusMonths(25);
        boolean boolean46 = localDate5.equals((java.lang.Object) localDate45);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2026 + "'", int29 == 2026);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
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
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.yearOfCentury();
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
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
        org.joda.time.LocalDate localDate19 = localDate17.withWeekyear(867);
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
        org.junit.Assert.assertNotNull(localDate19);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withDayOfWeek(251980);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 251980 for dayOfWeek must be in the range [1,7]");
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
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate.Property property9 = localDate5.year();
        org.joda.time.LocalDate.Property property10 = localDate5.dayOfMonth();
        org.joda.time.LocalDate localDate12 = property10.addToCopy((int) ' ');
        int int13 = localDate12.getCenturyOfEra();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfDay(2);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMonths(55);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.weekyear();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = property7.getDifference(readableInstant8);
        org.joda.time.LocalDate localDate10 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate12 = localDate10.withCenturyOfEra((int) '#');
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("2026-09-28T14:59:53.564");
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.minusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.LocalDate localDate5 = localDate2.plusDays(0);
        org.joda.time.LocalTime localTime6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate5.toDateTime(localTime6, dateTimeZone7);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        boolean boolean6 = property5.isLeap();
        java.util.Locale locale7 = null;
        int int8 = property5.getMaximumTextLength(locale7);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) '4');
        int int11 = localDateTime10.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime18 = localDateTime10.withFields((org.joda.time.ReadablePartial) localDateTime17);
        java.util.Date date19 = localDateTime18.toDate();
        int int20 = localDateTime18.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.minusMinutes(9);
        org.joda.time.DateTime dateTime23 = localDateTime22.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localDateTime22.toDateTime(dateTimeZone24);
        long long26 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime25);
        boolean boolean28 = property5.equals((java.lang.Object) "2026-09-28T15:00:09.837");
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalTime localTime7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate0.toDateTime(localTime7, dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate0.withMonthOfYear(14403717);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 14403717 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate localDate5 = localDate2.minusYears((int) (byte) 1);
        org.joda.time.LocalTime localTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDate2.toLocalDateTime(localTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The time must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        int int12 = localDateTime11.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.millisOfSecond();
        int int14 = property13.getLeapAmount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate.Property property9 = localDate5.weekOfWeekyear();
        org.joda.time.LocalDate localDate11 = localDate5.plusMonths(28320052);
        org.joda.time.DateMidnight dateMidnight12 = localDate5.toDateMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) localDate5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateMidnight12);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate localDate10 = localDate5.plusWeeks((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight11 = localDate5.toDateMidnight();
        int int12 = localDate5.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) '4');
        int int15 = localDateTime14.getYearOfEra();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.minuteOfHour();
        org.joda.time.LocalDateTime.Property property17 = localDateTime14.yearOfEra();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.withMillisOfSecond(32);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withLocalMillis((long) 9);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = localDate5.compareTo((org.joda.time.ReadablePartial) localDateTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
        org.joda.time.LocalDate localDate17 = property15.getLocalDate();
        java.util.Locale locale19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = property15.setCopy("", locale19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for yearOfCentury is not supported");
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
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.yearOfEra();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.plusWeeks(28);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) '4');
        int int16 = localDateTime15.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime23 = localDateTime15.withFields((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime15.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime15.withHourOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.yearOfCentury();
        org.joda.time.Chronology chronology29 = property28.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = localDateTime8.getField((int) (short) 0, chronology29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime8.minusMonths(242);
        long long33 = localDateTime32.getLocalMillis();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-636397199948L) + "'", long33 == (-636397199948L));
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        int int6 = localDateTime1.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.year();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusDays(0);
        org.joda.time.LocalDateTime.Property property10 = localDateTime1.year();
        int int11 = property10.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime12 = property10.getLocalDateTime();
        java.lang.String str13 = property10.getName();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-292275054) + "'", int11 == (-292275054));
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "year" + "'", str13, "year");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        java.util.Locale locale12 = null;
        java.lang.String str13 = localDateTime5.toString("2032-02-19", locale12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime5.withDurationAdded(readableDuration14, 69);
        int int17 = localDateTime5.getDayOfWeek();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2032-02-19" + "'", str13, "2032-02-19");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.yearOfEra();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.plusWeeks(28);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.withCenturyOfEra(365);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withFieldAdded(durationFieldType16, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate6 = localDate3.withPeriodAdded(readablePeriod4, (int) (byte) -1);
        org.joda.time.LocalDate localDate8 = localDate3.plusWeeks(0);
        org.joda.time.LocalDate localDate10 = localDate8.withYear((int) ' ');
        org.joda.time.LocalDate localDate12 = localDate10.minusDays((int) (short) 0);
        java.util.Locale locale14 = null;
        java.lang.String str15 = localDate12.toString("271", locale14);
        org.joda.time.DateTime dateTime16 = localDate12.toDateTimeAtMidnight();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate12.plus(readablePeriod17);
        org.joda.time.Chronology chronology19 = localDate12.getChronology();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((int) '#', (int) (short) 1, (int) (byte) 10, chronology19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDate localDate22 = localDate20.minus(readablePeriod21);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "271" + "'", str15, "271");
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(localDate22);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
        int int24 = localDateTime10.getWeekyear();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1970 + "'", int24 == 1970);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        java.util.Date date10 = localDateTime9.toDate();
        int int11 = localDateTime9.getDayOfYear();
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.secondOfMinute();
        org.joda.time.DurationField durationField13 = property12.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime14 = property12.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) '4');
        int int17 = localDateTime16.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime24 = localDateTime16.withFields((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime23.yearOfEra();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.plusWeeks(28);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) '4');
        int int31 = localDateTime30.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime30.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime38 = localDateTime30.withFields((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime30.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime30.withHourOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.yearOfCentury();
        org.joda.time.Chronology chronology44 = property43.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = localDateTime23.getField((int) (short) 0, chronology44);
        org.joda.time.LocalDateTime.Property property46 = new org.joda.time.LocalDateTime.Property(localDateTime14, dateTimeField45);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime48 = localDateTime14.withDayOfMonth(2027);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2027 for dayOfMonth must be in the range [1,31]");
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
        org.junit.Assert.assertNull(durationField13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
        int int14 = localDate10.getDayOfWeek();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        org.joda.time.DurationField durationField9 = property8.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime10 = property8.roundHalfFloorCopy();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property8.getAsText(locale11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withDayOfWeek(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate localDate5 = localDate2.minusYears((int) (byte) 1);
        int int6 = localDate2.size();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate12 = localDate9.withPeriodAdded(readablePeriod10, (int) (byte) -1);
        org.joda.time.LocalDate localDate14 = localDate9.plusWeeks(0);
        org.joda.time.LocalDate localDate16 = localDate14.withYear((int) ' ');
        org.joda.time.LocalDate localDate18 = localDate14.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate20 = localDate18.minusMonths(2026);
        org.joda.time.LocalDate localDate22 = localDate20.plusWeeks(19);
        org.joda.time.LocalDate localDate24 = localDate20.withWeekOfWeekyear(4);
        int int25 = localDate24.getDayOfMonth();
        org.joda.time.LocalDate localDate27 = localDate24.withYearOfCentury((int) (short) 1);
        int int28 = localDate2.compareTo((org.joda.time.ReadablePartial) localDate24);
        org.joda.time.LocalDate.Property property29 = localDate24.yearOfEra();
        org.joda.time.Interval interval30 = property29.toInterval();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 25 + "'", int25 == 25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(interval30);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.joda.time.Chronology chronology3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(25200052, 1, 26340000, chronology3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26340000 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        int int6 = localDateTime1.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.year();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusHours(10);
        org.joda.time.LocalDateTime.Property property10 = localDateTime1.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = property10.setCopy(14403717);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 14403717 for minuteOfHour must be in the range [0,59]");
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
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate2.minus(readablePeriod3);
        org.joda.time.LocalDate.Property property5 = localDate4.era();
        org.joda.time.LocalDate localDate6 = property5.roundCeilingCopy();
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withMillisOfDay(7);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.centuryOfEra();
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate5.withPeriodAdded(readablePeriod6, (int) (byte) -1);
        org.joda.time.LocalDate localDate10 = localDate5.plusWeeks(0);
        org.joda.time.LocalDate localDate12 = localDate10.withYear((int) ' ');
        org.joda.time.LocalDate localDate14 = localDate10.withYearOfCentury((int) (byte) 1);
        int int15 = localDate10.getDayOfMonth();
        int int16 = localDate10.getDayOfMonth();
        org.joda.time.LocalDate.Property property17 = localDate10.yearOfCentury();
        org.joda.time.LocalDate localDate19 = localDate10.plusMonths((int) '4');
        org.joda.time.Chronology chronology20 = localDate10.getChronology();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(chronology20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField22 = localDateTime0.getField(33, chronology20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 33");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 28 + "'", int15 == 28);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 28 + "'", int16 == 28);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(chronology20);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType21 = localDate19.getFieldType(324);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 324");
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
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Wed Nov 28 00:00:00 ICT 1832");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        java.lang.Object obj0 = null;
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
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology15);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(obj0, chronology15);
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
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime1.withHourOfDay((int) (byte) 0);
        int int14 = localDateTime13.getYear();
        int int15 = localDateTime13.getMonthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = localDateTime13.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property10 = localDate7.yearOfCentury();
        java.lang.String str11 = property10.getAsText();
        int int12 = property10.getMaximumValue();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32" + "'", str11, "32");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        int int1 = localDateTime0.getDayOfMonth();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDayOfMonth((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        int int4 = localDateTime1.getHourOfDay();
        int int5 = localDateTime1.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusHours((int) (byte) 100);
        int int8 = localDateTime1.getMillisOfDay();
        org.joda.time.DurationFieldType durationFieldType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withFieldAdded(durationFieldType9, 2025);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 25200052 + "'", int8 == 25200052);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy(0L);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusMinutes(59);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusYears(35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withDayOfMonth(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        org.joda.time.LocalDate localDate17 = localDate11.withLocalMillis((long) 55);
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
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.millisOfSecond();
        java.util.Locale locale47 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime48 = property45.setCopy("2027-01-04", locale47);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2027-01-04\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
        org.junit.Assert.assertNotNull(property45);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.dayOfYear();
        int int2 = property1.getMinimumValueOverall();
        org.joda.time.LocalDate localDate4 = property1.addWrapFieldToCopy((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property1.getFieldType();
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = property1.setCopy("2026-09-26T04:00:01.558", locale7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2026-09-26T04:00:01.558\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        int int9 = localDate6.getDayOfYear();
        org.joda.time.LocalDate.Property property10 = localDate6.year();
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = property10.setCopy("", locale12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 50 + "'", int9 == 50);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("1970-01-01T07:00:00.052", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        boolean boolean9 = property8.isLeap();
        org.joda.time.LocalDate localDate10 = property8.roundFloorCopy();
        org.joda.time.LocalDate localDate12 = localDate10.minusWeeks(4);
        org.joda.time.LocalDate localDate14 = localDate10.withLocalMillis((long) '#');
        org.joda.time.DurationFieldType durationFieldType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = localDate14.withFieldAdded(durationFieldType15, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
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
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType21 = localDateTime16.getFieldType(14403717);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 14403717");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
        org.joda.time.LocalDate localDate17 = property7.setCopy(58);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026" + "'", str8, "2026");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2026" + "'", str15, "2026");
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate5 = property4.getLocalDate();
        org.joda.time.DurationField durationField6 = property4.getLeapDurationField();
        org.joda.time.LocalDate localDate7 = property4.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate7.withEra(12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 12 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNull(durationField6);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
        org.joda.time.LocalDate.Property property17 = localDate16.weekyear();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localDate16.toDateTimeAtStartOfDay(dateTimeZone18);
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
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
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
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = localDate0.toDateMidnight(dateTimeZone23);
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
        org.junit.Assert.assertNotNull(dateMidnight24);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate5 = localDate2.withPeriodAdded(readablePeriod3, (int) (byte) -1);
        int int6 = localDate2.getYearOfEra();
        org.joda.time.LocalDate localDate8 = localDate2.plusDays(1970);
        org.joda.time.LocalDate localDate9 = localDate1.withFields((org.joda.time.ReadablePartial) localDate8);
        boolean boolean11 = localDate8.equals((java.lang.Object) 100.0d);
        org.joda.time.LocalDate.Property property12 = localDate8.era();
        org.joda.time.LocalDate.Property property13 = localDate8.yearOfCentury();
        long long14 = property13.remainder();
        org.joda.time.Chronology chronology15 = property13.getChronology();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 28319952, chronology15);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2026 + "'", int6 == 2026);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 4233600000L + "'", long14 == 4233600000L);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        int int32 = localDateTime7.getMillisOfSecond();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusSeconds((int) 'a');
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withDayOfMonth((int) (short) 10);
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
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = null;
        boolean boolean3 = localDateTime1.isSupported(durationFieldType2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusYears((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((-1790557199));
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.plus(readablePeriod8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) 0);
        int int2 = localDateTime1.getEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusYears(11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withYear(10);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withMonthOfYear(11);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusMillis(2026);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundFloorCopy();
        org.joda.time.DurationField durationField8 = property3.getRangeDurationField();
        org.joda.time.DurationField durationField9 = property3.getRangeDurationField();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
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
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.minusHours(2027);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2007 + "'", int13 == 2007);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
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
        int int33 = localDate24.getWeekOfWeekyear();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7 + "'", int33 == 7);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.DateTime dateTime7 = localDate0.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate9 = localDate0.withYear(25200052);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) '4');
        int int12 = localDateTime11.getYearOfEra();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime15 = property13.addToCopy((int) '4');
        int int16 = localDateTime15.getEra();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) '4');
        int int19 = localDateTime18.getYearOfEra();
        org.joda.time.LocalDateTime.Property property20 = localDateTime18.minuteOfHour();
        int int21 = property20.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime23 = property20.addWrapFieldToCopy((int) 'a');
        int int24 = localDateTime23.getWeekyear();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) '4');
        int int27 = localDateTime26.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime36 = localDateTime26.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        java.util.Date date37 = localDateTime26.toDate();
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) '4');
        int int40 = localDateTime39.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property41 = localDateTime39.dayOfYear();
        org.joda.time.LocalDateTime.Property property42 = localDateTime39.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime43 = property42.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property42.getFieldType();
        int int45 = localDateTime26.get(dateTimeFieldType44);
        boolean boolean46 = localDateTime23.isSupported(dateTimeFieldType44);
        org.joda.time.LocalDateTime.Property property47 = localDateTime15.property(dateTimeFieldType44);
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = localDate9.isAfter((org.joda.time.ReadablePartial) localDateTime48);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 59 + "'", int21 == 59);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1970 + "'", int24 == 1970);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(property47);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("9");
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusDays(56);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime38 = localDateTime6.withWeekOfWeekyear(25200000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25200000 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate28 = localDate26.withDayOfMonth(2037);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2037 for dayOfMonth must be in the range [1,31]");
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
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate26);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond(55);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withDayOfYear(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = localDate9.toDateMidnight(dateTimeZone10);
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = localDate9.toString("Property[year]", locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
        org.joda.time.Interval interval14 = localDate11.toInterval();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(interval14);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        int int7 = property6.getLeapAmount();
        org.joda.time.LocalDate localDate9 = property6.addWrapFieldToCopy(2026);
        java.lang.String str10 = property6.toString();
        java.lang.String str11 = property6.getName();
        int int12 = property6.getMinimumValue();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Property[era]" + "'", str10, "Property[era]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "era" + "'", str11, "era");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plus(readableDuration7);
        boolean boolean9 = property4.equals((java.lang.Object) localDateTime6);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.plusMillis(25);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.plusHours((int) ' ');
        int int14 = localDateTime13.getHourOfDay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.minusYears(251980);
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
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        java.lang.String str3 = property2.toString();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDateTime5.toDateTime(dateTimeZone6);
        int int8 = property2.getDifference((org.joda.time.ReadableInstant) dateTime7);
        java.util.Locale locale9 = null;
        int int10 = property2.getMaximumShortTextLength(locale9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = property2.setCopy("1975-02-13T07:00:00.052");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1975-02-13T07:00:00.052\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[centuryOfEra]" + "'", str3, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate localDate5 = localDate2.minusYears((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks(0);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears(2026);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate9.toDateTimeAtCurrentTime(dateTimeZone10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withWeekyear(69);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate6 = localDate1.withPeriodAdded(readablePeriod4, 25260000);
        org.joda.time.LocalDate localDate8 = localDate6.minusMonths(0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        int int9 = localDateTime5.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDateTime5.toDateTime(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.plusHours(4);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusWeeks(0);
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
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        java.lang.String str6 = property3.getAsString();
        org.joda.time.LocalDateTime localDateTime7 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime8 = property3.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime10 = property3.setCopy("28");
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusWeeks(333);
        org.joda.time.DurationFieldType durationFieldType13 = null;
        boolean boolean14 = localDateTime10.isSupported(durationFieldType13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withYear(4);
        int int14 = localDateTime7.getMillisOfSecond();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky "1) test2108(org.joda.time.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 750 + "'", int14 == 750);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDateTime1.toDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusYears(0);
        int int10 = localDateTime9.getMonthOfYear();
        org.joda.time.DurationFieldType durationFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withFieldAdded(durationFieldType11, 2001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.withDayOfYear(4);
        org.joda.time.LocalDate localDate6 = localDate0.withYearOfCentury(3);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        int int9 = localDateTime8.getYearOfEra();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        int int11 = property10.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime13 = property10.addWrapFieldToCopy((int) 'a');
        int int14 = localDateTime13.getWeekyear();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) '4');
        int int17 = localDateTime16.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime26 = localDateTime16.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        java.util.Date date27 = localDateTime16.toDate();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) '4');
        int int30 = localDateTime29.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property31 = localDateTime29.dayOfYear();
        org.joda.time.LocalDateTime.Property property32 = localDateTime29.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime33 = property32.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property32.getFieldType();
        int int35 = localDateTime16.get(dateTimeFieldType34);
        boolean boolean36 = localDateTime13.isSupported(dateTimeFieldType34);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate38 = localDate6.withField(dateTimeFieldType34, 28787742);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfMinute' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        boolean boolean6 = property5.isLeap();
        java.util.Locale locale7 = null;
        int int8 = property5.getMaximumTextLength(locale7);
        org.joda.time.LocalDateTime localDateTime10 = property5.addToCopy((long) 9);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate15 = localDate12.withPeriodAdded(readablePeriod13, (int) (byte) -1);
        int int16 = localDate12.getYearOfEra();
        org.joda.time.LocalDate localDate18 = localDate12.plusDays(1970);
        org.joda.time.LocalDate localDate19 = localDate11.withFields((org.joda.time.ReadablePartial) localDate18);
        boolean boolean21 = localDate18.equals((java.lang.Object) 100.0d);
        org.joda.time.LocalDate.Property property22 = localDate18.era();
        org.joda.time.LocalDate.Property property23 = localDate18.yearOfCentury();
        long long24 = property23.remainder();
        org.joda.time.Chronology chronology25 = property23.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((java.lang.Object) property5, chronology25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2026 + "'", int16 == 2026);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 4233600000L + "'", long24 == 4233600000L);
        org.junit.Assert.assertNotNull(chronology25);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField5 = property4.getField();
        org.joda.time.Interval interval6 = property4.toInterval();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(interval6);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDateTime15.toDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime15.secondOfMinute();
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.plus(readablePeriod20);
        int int22 = localDateTime21.getCenturyOfEra();
        int int23 = localDateTime21.getDayOfYear();
        boolean boolean24 = localDateTime12.isBefore((org.joda.time.ReadablePartial) localDateTime21);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 19 + "'", int22 == 19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("\u0e21\u0e04.", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate10 = localDate7.minusWeeks(5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = localDate7.withEra(292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for era must be in the range [0,1]");
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
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
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
        org.joda.time.LocalDate localDate20 = localDate13.withCenturyOfEra(0);
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
        org.junit.Assert.assertNotNull(localDate20);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        int int11 = localDateTime5.getYear();
        java.lang.String str13 = localDateTime5.toString("5232-02-10");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "5232-02-10" + "'", str13, "5232-02-10");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
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
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime19 = property18.roundFloorCopy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate10 = localDate7.minusWeeks(5);
        org.joda.time.LocalDate localDate12 = localDate10.withYearOfCentury((int) (byte) 10);
        java.lang.String str14 = localDate12.toString("8");
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "8" + "'", str14, "8");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
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
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = localDateTime30.toDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime30.secondOfMinute();
        boolean boolean35 = property33.equals((java.lang.Object) 70);
        org.joda.time.LocalDateTime localDateTime36 = property33.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) '4');
        int int39 = localDateTime38.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime38.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime46 = localDateTime38.withFields((org.joda.time.ReadablePartial) localDateTime45);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime38.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime38.withHourOfDay((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.withPeriodAdded(readablePeriod51, (int) '#');
        org.joda.time.LocalDateTime.Property property54 = localDateTime50.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime50, dateTimeZone55);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone58);
        org.joda.time.DateTimeField[] dateTimeFieldArray60 = localDateTime59.getFields();
        org.joda.time.LocalDateTime.Property property61 = localDateTime59.monthOfYear();
        org.joda.time.LocalDateTime localDateTime63 = localDateTime59.withWeekyear(26);
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((long) '4');
        int int66 = localDateTime65.getYearOfEra();
        org.joda.time.LocalDateTime.Property property67 = localDateTime65.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime69 = property67.addToCopy((int) '4');
        int int70 = localDateTime69.getEra();
        org.joda.time.ReadableDuration readableDuration71 = null;
        org.joda.time.LocalDateTime localDateTime72 = localDateTime69.plus(readableDuration71);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime69.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration75 = null;
        org.joda.time.LocalDateTime localDateTime77 = localDateTime74.withDurationAdded(readableDuration75, 0);
        int int78 = localDateTime74.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime80 = new org.joda.time.LocalDateTime((long) '4');
        int int81 = localDateTime80.getYearOfEra();
        org.joda.time.LocalDateTime.Property property82 = localDateTime80.minuteOfHour();
        org.joda.time.LocalDateTime.Property property83 = localDateTime80.era();
        long long84 = property83.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType85 = property83.getFieldType();
        boolean boolean86 = localDateTime74.isSupported(dateTimeFieldType85);
        int int87 = localDateTime63.get(dateTimeFieldType85);
        boolean boolean88 = localDateTime50.isSupported(dateTimeFieldType85);
        org.joda.time.LocalDateTime.Property property89 = localDateTime36.property(dateTimeFieldType85);
        org.joda.time.LocalDateTime.Property property90 = localDateTime6.property(dateTimeFieldType85);
        org.joda.time.ReadableDuration readableDuration91 = null;
        org.joda.time.LocalDateTime localDateTime92 = localDateTime6.plus(readableDuration91);
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
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(dateTimeFieldArray60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1970 + "'", int66 == 1970);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(localDateTime72);
        org.junit.Assert.assertNotNull(localDateTime74);
        org.junit.Assert.assertNotNull(localDateTime77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 28320052 + "'", int78 == 28320052);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1970 + "'", int81 == 1970);
        org.junit.Assert.assertNotNull(property82);
        org.junit.Assert.assertNotNull(property83);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 25200052L + "'", long84 == 25200052L);
        org.junit.Assert.assertNotNull(dateTimeFieldType85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(property89);
        org.junit.Assert.assertNotNull(property90);
        org.junit.Assert.assertNotNull(localDateTime92);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusMonths((int) ' ');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusMonths(269);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusDays(1869);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
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
        org.joda.time.LocalDateTime.Property property29 = localDateTime4.millisOfSecond();
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
        org.junit.Assert.assertNotNull(property29);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(2026);
        org.joda.time.LocalDate localDate13 = localDate11.plusWeeks(19);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate15 = localDate11.minus(readablePeriod14);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
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
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.withLocalMillis((long) 28320052);
        org.joda.time.Chronology chronology59 = localDateTime58.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField60 = localDate53.getField(1869, chronology59);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 1869");
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
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(chronology59);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
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
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = localDateTime30.toDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime30.secondOfMinute();
        boolean boolean35 = property33.equals((java.lang.Object) 70);
        org.joda.time.LocalDateTime localDateTime36 = property33.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) '4');
        int int39 = localDateTime38.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime38.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime46 = localDateTime38.withFields((org.joda.time.ReadablePartial) localDateTime45);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime38.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime38.withHourOfDay((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.withPeriodAdded(readablePeriod51, (int) '#');
        org.joda.time.LocalDateTime.Property property54 = localDateTime50.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime50, dateTimeZone55);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone58);
        org.joda.time.DateTimeField[] dateTimeFieldArray60 = localDateTime59.getFields();
        org.joda.time.LocalDateTime.Property property61 = localDateTime59.monthOfYear();
        org.joda.time.LocalDateTime localDateTime63 = localDateTime59.withWeekyear(26);
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((long) '4');
        int int66 = localDateTime65.getYearOfEra();
        org.joda.time.LocalDateTime.Property property67 = localDateTime65.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime69 = property67.addToCopy((int) '4');
        int int70 = localDateTime69.getEra();
        org.joda.time.ReadableDuration readableDuration71 = null;
        org.joda.time.LocalDateTime localDateTime72 = localDateTime69.plus(readableDuration71);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime69.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration75 = null;
        org.joda.time.LocalDateTime localDateTime77 = localDateTime74.withDurationAdded(readableDuration75, 0);
        int int78 = localDateTime74.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime80 = new org.joda.time.LocalDateTime((long) '4');
        int int81 = localDateTime80.getYearOfEra();
        org.joda.time.LocalDateTime.Property property82 = localDateTime80.minuteOfHour();
        org.joda.time.LocalDateTime.Property property83 = localDateTime80.era();
        long long84 = property83.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType85 = property83.getFieldType();
        boolean boolean86 = localDateTime74.isSupported(dateTimeFieldType85);
        int int87 = localDateTime63.get(dateTimeFieldType85);
        boolean boolean88 = localDateTime50.isSupported(dateTimeFieldType85);
        org.joda.time.LocalDateTime.Property property89 = localDateTime36.property(dateTimeFieldType85);
        org.joda.time.LocalDateTime.Property property90 = localDateTime6.property(dateTimeFieldType85);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime92 = property90.addToCopy(1580400052L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(dateTimeFieldArray60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1970 + "'", int66 == 1970);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(localDateTime72);
        org.junit.Assert.assertNotNull(localDateTime74);
        org.junit.Assert.assertNotNull(localDateTime77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 28320052 + "'", int78 == 28320052);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1970 + "'", int81 == 1970);
        org.junit.Assert.assertNotNull(property82);
        org.junit.Assert.assertNotNull(property83);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 25200052L + "'", long84 == 25200052L);
        org.junit.Assert.assertNotNull(dateTimeFieldType85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(property89);
        org.junit.Assert.assertNotNull(property90);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(0, (int) (byte) 1, 0, 0, 15, 1832, 26340000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1832 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.minusYears(2026);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate5.withPeriodAdded(readablePeriod6, (int) (byte) -1);
        org.joda.time.LocalDate localDate10 = localDate5.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate13 = localDate5.withPeriodAdded(readablePeriod11, (-1));
        org.joda.time.LocalDate localDate15 = localDate13.withYear(25200052);
        java.lang.String str17 = localDate13.toString("2026");
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = localDate13.getFieldType((int) (short) 0);
        int int20 = localDate4.get(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2026" + "'", str17, "2026");
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
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
        int int32 = localDateTime9.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime34 = localDateTime9.withEra(2058);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2058 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.withDurationAdded(readableDuration9, 50);
        int int12 = localDateTime5.getHourOfDay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
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
        org.joda.time.DurationFieldType durationFieldType26 = null;
        boolean boolean27 = localDateTime25.isSupported(durationFieldType26);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMillis(12);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusMillis(242);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withDayOfWeek(1980);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1980 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime28 = localDateTime24.withDate(0, 42, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 42 for monthOfYear must be in the range [1,12]");
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
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime1.withCenturyOfEra((int) (byte) 100);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate17 = localDate14.withPeriodAdded(readablePeriod15, (int) (byte) -1);
        org.joda.time.LocalDate localDate19 = localDate14.plusWeeks(0);
        org.joda.time.DateTime dateTime20 = localDate14.toDateTimeAtStartOfDay();
        java.util.Date date21 = localDate14.toDate();
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.fromDateFields(date21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = localDateTime1.isAfter((org.joda.time.ReadablePartial) localDate22);
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
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Mon Sep 28 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(localDate22);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate localDate9 = property8.withMaximumValue();
        int int10 = localDate9.getMonthOfYear();
        org.joda.time.LocalDate.Property property11 = localDate9.yearOfCentury();
        org.joda.time.DurationField durationField12 = property11.getRangeDurationField();
        org.joda.time.LocalDate localDate13 = property11.roundCeilingCopy();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate18 = localDate15.withPeriodAdded(readablePeriod16, (int) (byte) -1);
        int int19 = localDate15.getYearOfEra();
        org.joda.time.LocalDate localDate21 = localDate15.plusDays(1970);
        org.joda.time.LocalDate localDate22 = localDate14.withFields((org.joda.time.ReadablePartial) localDate21);
        org.joda.time.LocalDate.Property property23 = localDate21.monthOfYear();
        org.joda.time.LocalDate localDate25 = localDate21.withCenturyOfEra((int) '4');
        org.joda.time.LocalDate localDate27 = localDate25.withDayOfMonth((int) (byte) 10);
        org.joda.time.LocalDate localDate29 = localDate27.plusWeeks(0);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate31 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalDate localDate34 = localDate31.withPeriodAdded(readablePeriod32, (int) (byte) -1);
        int int35 = localDate31.getYearOfEra();
        org.joda.time.LocalDate localDate37 = localDate31.plusDays(1970);
        org.joda.time.LocalDate localDate38 = localDate30.withFields((org.joda.time.ReadablePartial) localDate37);
        org.joda.time.LocalDate.Property property39 = localDate37.monthOfYear();
        org.joda.time.LocalDate localDate41 = localDate37.withCenturyOfEra((int) '4');
        org.joda.time.LocalDate localDate43 = localDate37.minusDays((int) (byte) 100);
        org.joda.time.LocalDate.Property property44 = localDate43.dayOfWeek();
        org.joda.time.LocalDate localDate45 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalDate localDate48 = localDate45.withPeriodAdded(readablePeriod46, (int) (byte) -1);
        org.joda.time.LocalDate localDate50 = localDate45.plusWeeks(0);
        org.joda.time.LocalDate localDate52 = localDate50.withYear((int) ' ');
        org.joda.time.LocalDate localDate54 = localDate50.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalTime localTime55 = null;
        org.joda.time.DateTime dateTime56 = localDate50.toDateTime(localTime55);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = localDate50.toDateTimeAtCurrentTime(dateTimeZone57);
        int int59 = property44.getDifference((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DateTime dateTime60 = localDate29.toDateTime((org.joda.time.ReadableInstant) dateTime58);
        int int61 = property11.getDifference((org.joda.time.ReadableInstant) dateTime60);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2026 + "'", int19 == 2026);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2026 + "'", int35 == 2026);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1869 + "'", int59 == 1869);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-3205) + "'", int61 == (-3205));
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, (-1));
        org.joda.time.LocalDate localDate10 = localDate0.withDayOfYear((int) '#');
        int int11 = localDate0.size();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) '4');
        int int3 = localDateTime2.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime2.withFields((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime2.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime2.withHourOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.yearOfCentury();
        org.joda.time.Chronology chronology16 = property15.getChronology();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(1191456000000L, chronology16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withMillisOfDay(99);
        int int21 = localDateTime20.getDayOfMonth();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
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
        int int15 = localDate9.getYearOfEra();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2001 + "'", int15 == 2001);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, (-1));
        org.joda.time.LocalDate localDate10 = localDate8.withLocalMillis((long) 5);
        org.joda.time.DateTime dateTime11 = localDate8.toDateTimeAtMidnight();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = localDateTime4.getFields();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYear(743);
        java.util.Locale locale9 = null;
        java.lang.String str10 = localDateTime7.toString("7", locale9);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = localDateTime7.getFieldTypes();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "7" + "'", str10, "7");
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray11);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
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
        java.util.Locale locale19 = null;
        java.lang.String str20 = property18.getAsText(locale19);
        org.joda.time.DateTimeField dateTimeField21 = property18.getField();
        org.joda.time.LocalDateTime localDateTime23 = property18.addToCopy(0L);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970" + "'", str20, "1970");
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate5 = property4.getLocalDate();
        org.joda.time.DateTime dateTime6 = localDate5.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate.Property property7 = localDate5.year();
        org.joda.time.LocalDate localDate8 = property7.withMinimumValue();
        long long9 = localDate8.getLocalMillis();
        org.joda.time.LocalDate localDate11 = localDate8.plusWeeks((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) (short) 1, dateTimeZone12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-9223372017043200000L) + "'", long9 == (-9223372017043200000L));
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
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
        int int26 = localDateTime25.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime31 = localDateTime25.withTime(24208, (int) (short) 1, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 24208 for hourOfDay must be in the range [0,23]");
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        int int6 = localDateTime1.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.year();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusDays(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = localDateTime9.getFieldType((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withWeekyear(28787742);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) '4');
        int int16 = localDateTime15.getYearOfEra();
        org.joda.time.LocalDateTime.Property property17 = localDateTime15.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime19 = property17.addToCopy((int) '4');
        org.joda.time.Chronology chronology20 = property17.getChronology();
        java.util.Locale locale21 = null;
        java.lang.String str22 = property17.getAsShortText(locale21);
        org.joda.time.LocalDateTime localDateTime23 = property17.roundHalfCeilingCopy();
        int int24 = localDateTime23.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = localDateTime26.toDateTime(dateTimeZone27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime26.monthOfYear();
        org.joda.time.DateTimeField dateTimeField30 = property29.getField();
        org.joda.time.LocalDateTime.Property property31 = new org.joda.time.LocalDateTime.Property(localDateTime23, dateTimeField30);
        org.joda.time.Chronology chronology32 = property31.getChronology();
        long long33 = property31.getMillis();
        java.lang.String str34 = property31.getAsShortText();
        org.joda.time.LocalDateTime localDateTime35 = property31.getLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plusSeconds(0);
        int int41 = localDateTime38.getDayOfWeek();
        org.joda.time.DateTime dateTime42 = localDateTime38.toDateTime();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime38.withYear((int) (short) 10);
        boolean boolean45 = localDateTime35.isEqual((org.joda.time.ReadablePartial) localDateTime38);
        int int46 = localDateTime9.compareTo((org.joda.time.ReadablePartial) localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1970 + "'", int16 == 1970);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 25200000L + "'", long33 == 25200000L);
// flaky "2) test2143(org.joda.time.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\u0e21\u0e04." + "'", str34, "\u0e21\u0e04.");
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
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
        org.joda.time.LocalDateTime localDateTime28 = localDateTime13.minusMonths(26340000);
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
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
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
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.yearOfEra();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) '4');
        int int32 = localDateTime31.getYearOfEra();
        org.joda.time.LocalDateTime.Property property33 = localDateTime31.minuteOfHour();
        org.joda.time.LocalDateTime.Property property34 = localDateTime31.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray35 = localDateTime31.getFieldTypes();
        java.util.Date date36 = localDateTime31.toDate();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime31.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.minuteOfHour();
        java.lang.String str40 = localDateTime38.toString();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime28.withFields((org.joda.time.ReadablePartial) localDateTime38);
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
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1970 + "'", int32 == 1970);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray35);
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1970-01-01T00:00:00.100" + "'", str40, "1970-01-01T00:00:00.100");
        org.junit.Assert.assertNotNull(localDateTime41);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        int int10 = localDate5.getDayOfMonth();
        org.joda.time.LocalDate.Property property11 = localDate5.dayOfMonth();
        org.joda.time.DurationField durationField12 = property11.getLeapDurationField();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 28 + "'", int10 == 28);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNull(durationField12);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
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
        org.joda.time.LocalDate.Property property13 = localDate12.dayOfYear();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
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
        // The following exception was thrown during execution in test generation
        try {
            int int22 = localDateTime20.getValue(70);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 70");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 28320052 + "'", int14 == 28320052);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
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
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((java.lang.Object) property19, dateTimeZone22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
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
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.Interval interval7 = property3.toInterval();
        java.util.Locale locale9 = null;
        org.joda.time.LocalDateTime localDateTime10 = property3.setCopy("9", locale9);
        org.joda.time.DateTimeField dateTimeField11 = property3.getField();
        int int12 = property3.get();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
        org.joda.time.Chronology chronology20 = property19.getChronology();
        int int21 = property19.getMaximumValueOverall();
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
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 292278993 + "'", int21 == 292278993);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
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
        org.joda.time.LocalDate.Property property30 = localDate27.dayOfWeek();
        org.joda.time.LocalDate.Property property31 = localDate27.dayOfMonth();
        int int32 = localDate27.getDayOfMonth();
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
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
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
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) localDate13, dateTimeZone20);
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
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
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
        int[] intArray23 = localDateTime22.getValues();
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
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 1970, 1, 1, 25 });
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
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
        java.lang.String str18 = property15.getAsString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10" + "'", str16, "10");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10" + "'", str18, "10");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
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
        org.joda.time.LocalDateTime localDateTime15 = property5.addWrapFieldToCopy((-1790557199));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withMillisOfSecond(28814668);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28814668 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
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
        int int13 = localDate7.getDayOfMonth();
        org.joda.time.LocalDate localDate15 = localDate7.plusMonths(52);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = localDate15.toString(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 19 + "'", int13 == 19);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2036-06-19" + "'", str17, "2036-06-19");
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
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
        org.joda.time.LocalDate.Property property12 = localDate0.era();
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = property12.setCopy("2007", locale14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2007\" for era is not supported");
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
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusWeeks(25260000);
        org.joda.time.LocalDate localDate13 = localDate11.withYearOfEra(25260000);
        int int14 = localDate13.getYearOfEra();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 25260000 + "'", int14 == 25260000);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((int) '#', 8, 652, 58, 100, 54013758);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 58 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(23414400000L);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(2026);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate11.minus(readablePeriod12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = localDate13.toDateMidnight(dateTimeZone14);
        org.joda.time.LocalDate.Property property16 = localDate13.monthOfYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDateTime1.toDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusYears(0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.minusHours(366);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate9 = property7.addWrapFieldToCopy((int) (short) 1);
        org.joda.time.Chronology chronology10 = property7.getChronology();
        org.joda.time.LocalDate localDate11 = property7.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate12 = property7.roundHalfCeilingCopy();
        int int13 = localDate12.getDayOfWeek();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        long long9 = localDate0.getLocalMillis();
        java.lang.String str10 = localDate0.toString();
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate14 = localDate11.withPeriodAdded(readablePeriod12, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight15 = localDate11.toDateMidnight();
        org.joda.time.LocalDate localDate17 = localDate11.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property18 = localDate17.weekyear();
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = property18.getDifference(readableInstant19);
        org.joda.time.LocalDate localDate21 = property18.withMinimumValue();
        int int22 = localDate0.compareTo((org.joda.time.ReadablePartial) localDate21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((java.lang.Object) localDate0, dateTimeZone23);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1790553600000L + "'", long9 == 1790553600000L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-09-28" + "'", str10, "2026-09-28");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
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
        int int21 = localDateTime14.getCenturyOfEra();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19 + "'", int21 == 19);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
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
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withYearOfEra(53);
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
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeZone2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.weekyear();
        int int6 = localDateTime4.getYearOfEra();
        int int7 = localDateTime4.getHourOfDay();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.plus(readablePeriod8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2026 + "'", int6 == 2026);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
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
        int int21 = localDate9.getDayOfMonth();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 28 + "'", int21 == 28);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate localDate10 = localDate8.minusYears(25200052);
        org.joda.time.Interval interval11 = localDate10.toInterval();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.Interval interval13 = localDate10.toInterval(dateTimeZone12);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(interval13);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        java.lang.String str8 = localDate6.toString("333");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = localDate6.withDayOfYear(28816124);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28816124 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "333" + "'", str8, "333");
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minusMonths(2);
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime9 = property7.addToCopy((int) (byte) 1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("2026-09-28");
        int int2 = localDate1.getYearOfCentury();
        org.joda.time.LocalDate.Property property3 = localDate1.dayOfWeek();
        int int4 = property3.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
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
        int int22 = localDate5.getEra();
        int int23 = localDate5.getYearOfCentury();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 26 + "'", int23 == 26);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withCenturyOfEra(1);
        int int3 = localDateTime0.getYear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.withWeekyear(2007);
        long long6 = localDateTime5.getLocalMillis();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2026 + "'", int3 == 2026);
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky "3) test2176(org.joda.time.RegressionTest4)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1191250818549L + "'", long6 == 1191250818549L);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
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
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime17 = property16.withMaximumValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((-61133961600000L));
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate23 = localDate21.withWeekOfWeekyear(324);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 324 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        org.joda.time.LocalDateTime.Property property6 = localDateTime1.secondOfMinute();
        org.joda.time.DurationField durationField7 = property6.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property6.addWrapFieldToCopy(0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withWeekyear(2058);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate6 = property4.addToCopy(10);
        org.joda.time.LocalDate localDate8 = property4.addToCopy(1970);
        int int9 = localDate8.getYearOfEra();
        org.joda.time.LocalDate.Property property10 = localDate8.weekOfWeekyear();
        org.joda.time.LocalDate localDate12 = localDate8.withYearOfCentury((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2007 + "'", int9 == 2007);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(10, 15, 32, (-3205), (-3205), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3205 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
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
        org.joda.time.LocalDate localDate14 = property12.withMaximumValue();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 28 + "'", int10 == 28);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
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
        org.joda.time.LocalDateTime localDateTime14 = property13.roundHalfEvenCopy();
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
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(1832, 5232, 59, 0, 2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 5232 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 8, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusDays(42);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.dayOfWeek();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalTime localTime6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate0.toDateTime(localTime6, dateTimeZone7);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withMillisOfDay(7);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plus(readableDuration5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plusWeeks(999);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("1970-01-01T07:00:01.000");
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
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
        org.joda.time.DurationFieldType durationFieldType14 = null;
        boolean boolean15 = localDate13.isSupported(durationFieldType14);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMinimumValue();
        int int6 = property4.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime7 = property4.getLocalDateTime();
        int int8 = localDateTime7.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate localDate10 = localDate0.plusMonths((int) (short) 100);
        org.joda.time.LocalTime localTime11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate0.toDateTime(localTime11, dateTimeZone12);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(2026);
        org.joda.time.LocalDate localDate13 = localDate11.plusWeeks(19);
        int int14 = localDate13.getDayOfYear();
        org.joda.time.LocalTime localTime15 = null;
        org.joda.time.DateTime dateTime16 = localDate13.toDateTime(localTime15);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withCenturyOfEra(1);
        int int3 = localDateTime0.getYear();
        org.joda.time.DateTime dateTime4 = localDateTime0.toDateTime();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withDayOfYear(52);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime0.withYear(58);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2026 + "'", int3 == 2026);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
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
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime6.withPeriodAdded(readablePeriod15, (int) (byte) 100);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property10 = localDate7.yearOfCentury();
        java.lang.String str11 = property10.getName();
        int int12 = property10.getMinimumValueOverall();
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate16 = localDate13.withPeriodAdded(readablePeriod14, (int) (byte) -1);
        org.joda.time.LocalDate localDate18 = localDate13.plusWeeks(0);
        org.joda.time.LocalDate localDate20 = localDate18.withYear((int) ' ');
        org.joda.time.LocalDate localDate22 = localDate18.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate24 = localDate22.minusMonths(2026);
        org.joda.time.DateMidnight dateMidnight25 = localDate24.toDateMidnight();
        int int26 = property10.compareTo((org.joda.time.ReadableInstant) dateMidnight25);
        org.joda.time.LocalDate localDate27 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDate localDate30 = localDate27.withPeriodAdded(readablePeriod28, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight31 = localDate27.toDateMidnight();
        org.joda.time.LocalDate localDate33 = localDate27.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property34 = localDate33.weekyear();
        org.joda.time.ReadableInstant readableInstant35 = null;
        int int36 = property34.getDifference(readableInstant35);
        org.joda.time.LocalDate localDate37 = property34.withMinimumValue();
        org.joda.time.LocalDate localDate38 = property34.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate40 = localDate38.minusYears(2);
        long long41 = localDate38.getLocalMillis();
        int int42 = property10.compareTo((org.joda.time.ReadablePartial) localDate38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate44 = localDate38.withMonthOfYear(242);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 242 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "yearOfCentury" + "'", str11, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(dateMidnight31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1799020800000L + "'", long41 == 1799020800000L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 8, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusHours(28319952);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusHours((-292275054));
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plus(readableDuration7);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
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
        java.lang.String str16 = localDateTime7.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
// flaky "4) test2198(org.joda.time.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2026-09-28T08:00:18.751" + "'", str16, "2026-09-28T08:00:18.751");
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
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
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withDayOfYear(31);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = localDateTime21.getValue(2058);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2058");
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
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        org.joda.time.Chronology chronology12 = localDateTime1.getChronology();
        int int13 = localDateTime1.getYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
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
            org.joda.time.LocalDateTime localDateTime24 = localDateTime17.withWeekOfWeekyear(24208);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 24208 for weekOfWeekyear must be in the range [1,52]");
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
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        int int6 = localDateTime1.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.year();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusDays(0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusMillis(69);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withMillisOfSecond(999);
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) '4');
        int int17 = localDateTime16.getYearOfEra();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.minuteOfHour();
        int int19 = property18.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime21 = property18.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime22 = property18.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.dayOfMonth();
        int int24 = localDateTime22.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property25 = localDateTime22.dayOfMonth();
        boolean boolean26 = localDateTime11.isBefore((org.joda.time.ReadablePartial) localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 59 + "'", int19 == 59);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.weekyear();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = property7.getDifference(readableInstant8);
        org.joda.time.LocalDate localDate10 = property7.withMinimumValue();
        org.joda.time.DurationFieldType durationFieldType11 = null;
        boolean boolean12 = localDate10.isSupported(durationFieldType11);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
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
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localDate12.toDateTimeAtCurrentTime(dateTimeZone26);
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
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        boolean boolean6 = property5.isLeap();
        java.util.Locale locale7 = null;
        int int8 = property5.getMaximumTextLength(locale7);
        org.joda.time.LocalDateTime localDateTime10 = property5.addToCopy((long) 9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.weekyear();
        java.util.Date date12 = localDateTime10.toDate();
        int int13 = localDateTime10.getDayOfMonth();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Fri Jan 19 07:00:00 ICT 1979");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 19 + "'", int13 == 19);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusSeconds(0);
        int int5 = localDateTime2.getDayOfWeek();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = localDateTime2.toString(dateTimeFormatter6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.withYearOfCentury(9);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.secondOfMinute();
        int int11 = property10.get();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01T07:00:00.000" + "'", str7, "1970-01-01T07:00:00.000");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = localDate0.indexOf(dateTimeFieldType5);
        org.joda.time.DurationFieldType durationFieldType7 = null;
        boolean boolean8 = localDate0.isSupported(durationFieldType7);
        org.joda.time.LocalDate localDate10 = localDate0.minusMonths(3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = localDate10.withDayOfWeek(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
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
        java.lang.String str20 = property2.toString();
        org.joda.time.LocalDateTime localDateTime21 = property2.getLocalDateTime();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Property[centuryOfEra]" + "'", str20, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.DurationField durationField4 = property3.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.yearOfEra();
        org.joda.time.LocalDateTime localDateTime7 = property6.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime8 = property6.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withMillisOfSecond(31140052);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 31140052 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = localDate9.toDateMidnight(dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate9.plusYears(366);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear(35);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withDayOfYear(242);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withCenturyOfEra(5);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(1869, 2032, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2032 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
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
        org.joda.time.LocalDate.Property property35 = localDate14.centuryOfEra();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
// flaky "5) test2213(org.joda.time.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u0e01\u0e1e." + "'", str13, "\u0e01\u0e1e.");
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
        org.junit.Assert.assertNotNull(property35);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = property2.addToCopy((-161999972L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -16199997200");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withMillisOfDay(7);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plus(readableDuration5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withYear(12);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.dayOfWeek();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMinimumValue();
        java.util.Date date6 = localDateTime5.toDate();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.minuteOfHour();
        int int8 = property7.getLeapAmount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Jan 01 07:00:00 ICT 1");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localDateTime2.getFields();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.minusDays(59);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withYear((int) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(25260000, 0, 251980, 3938, 24208, 28319952, 292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3938 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((-3205), 2007, (-1790557193), 0, 292278993, 14, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
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
            org.joda.time.LocalDate localDate30 = localDate24.withWeekOfWeekyear(365);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for weekOfWeekyear must be in the range [1,53]");
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
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.minusWeeks((int) (short) 0);
        int int6 = localDate5.getDayOfWeek();
        org.joda.time.LocalTime localTime7 = null;
        org.joda.time.DateTime dateTime8 = localDate5.toDateTime(localTime7);
        org.joda.time.LocalDate.Property property9 = localDate5.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = property9.getField();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        org.joda.time.LocalDate localDate9 = property8.withMaximumValue();
        int int10 = property8.getMaximumValueOverall();
        int int11 = property8.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 12 + "'", int11 == 12);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        java.lang.String str6 = property3.getAsString();
        org.joda.time.LocalDateTime localDateTime8 = property3.addWrapFieldToCopy(70);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withSecondOfMinute(32);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.era();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate0.year();
        org.joda.time.LocalDate localDate5 = property3.addToCopy(3);
        org.joda.time.LocalDate localDate6 = property3.roundHalfFloorCopy();
        java.lang.String str7 = property3.getAsText();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2026" + "'", str7, "2026");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMinimumValue();
        java.util.Date date6 = localDateTime5.toDate();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withDurationAdded(readableDuration7, 3938);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime5.withEra(33);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 33 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Jan 01 07:00:00 ICT 1");
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = localDate0.indexOf(dateTimeFieldType5);
        org.joda.time.LocalDate localDate8 = localDate0.withWeekyear((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate11 = localDate0.withPeriodAdded(readablePeriod9, 59);
        org.joda.time.DurationFieldType durationFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = localDate0.withFieldAdded(durationFieldType12, 119);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100, 521, 55, 2025, 35, (-1790557193), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2025 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        org.joda.time.LocalDate localDate7 = property6.getLocalDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = property6.setCopy("1832-11-28");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1832-11-28\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = localDateTime1.withDate((int) '4', 1869, 119);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1869 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
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
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
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
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.yearOfCentury();
        java.util.Locale locale21 = null;
        int int22 = property20.getMaximumTextLength(locale21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        int int8 = localDate5.getMonthOfYear();
        int int9 = localDate5.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property10 = localDate5.monthOfYear();
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate14 = localDate11.withPeriodAdded(readablePeriod12, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight15 = localDate11.toDateMidnight();
        org.joda.time.LocalDate localDate17 = localDate11.withMonthOfYear(4);
        org.joda.time.LocalDate localDate19 = localDate11.withYear(69);
        org.joda.time.LocalDate localDate21 = localDate19.minusWeeks(999);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = localDate19.toDateMidnight(dateTimeZone22);
        long long24 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight23);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 40 + "'", int9 == 40);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 23484L + "'", long24 == 23484L);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.DurationField durationField6 = property5.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNull(durationField6);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
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
        int int20 = localDate18.getWeekOfWeekyear();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 18 + "'", int20 == 18);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
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
        org.joda.time.LocalDateTime localDateTime16 = localDateTime8.withYear((-292275054));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withDate(1980, 25200052, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25200052 for monthOfYear must be in the range [1,12]");
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
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
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
        org.joda.time.LocalDateTime.Property property18 = localDateTime14.dayOfYear();
        org.joda.time.DurationField durationField19 = property18.getDurationField();
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
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withLocalMillis(1790553600000L);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) '4');
        int int14 = localDateTime13.getYearOfEra();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime17 = property15.addToCopy((int) '4');
        org.joda.time.Chronology chronology18 = property15.getChronology();
        java.util.Locale locale19 = null;
        java.lang.String str20 = property15.getAsShortText(locale19);
        org.joda.time.LocalDateTime localDateTime21 = property15.roundHalfCeilingCopy();
        int int22 = localDateTime21.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = localDateTime24.toDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime24.monthOfYear();
        org.joda.time.DateTimeField dateTimeField28 = property27.getField();
        org.joda.time.LocalDateTime.Property property29 = new org.joda.time.LocalDateTime.Property(localDateTime21, dateTimeField28);
        int int31 = localDateTime21.getValue((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localDateTime21.toDateTime(dateTimeZone32);
        org.joda.time.Chronology chronology34 = localDateTime21.getChronology();
        boolean boolean35 = localDateTime11.equals((java.lang.Object) localDateTime21);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime11.withEra(0);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.hourOfDay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(property38);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
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
        int int22 = localDateTime20.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = localDateTime20.withDate(867, 9, 25200010);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25200010 for dayOfMonth must be in the range [1,30]");
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 28319952 + "'", int21 == 28319952);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 70 + "'", int22 == 70);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = localDate0.withMonthOfYear(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for monthOfYear must be in the range [1,12]");
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
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
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
        org.joda.time.LocalDate localDate17 = localDate5.withLocalMillis((long) 39);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = localDate17.getValue((-2026));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -2026");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
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
            java.lang.String str13 = localDate11.toString("centuryOfEra");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: c");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        int int10 = localDate5.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight11 = localDate5.toDateMidnight();
        org.joda.time.LocalDate.Property property12 = localDate5.weekOfWeekyear();
        org.joda.time.LocalDate localDate13 = property12.withMaximumValue();
        org.joda.time.LocalDate localDate14 = property12.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 28 + "'", int10 == 28);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
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
        int int15 = localDate14.getEra();
        org.joda.time.DateTime dateTime16 = localDate14.toDateTimeAtStartOfDay();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 28 + "'", int10 == 28);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 28 + "'", int11 == 28);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
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
        org.joda.time.LocalDate localDate16 = property14.setCopy(24208);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        int int6 = localDateTime1.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.year();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusDays(0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusMillis(69);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withMillisOfSecond(999);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) '4');
        int int16 = localDateTime15.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime23 = localDateTime15.withFields((org.joda.time.ReadablePartial) localDateTime22);
        java.util.Date date24 = localDateTime23.toDate();
        int int25 = localDateTime23.getDayOfYear();
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime28 = property26.addWrapFieldToCopy(5);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.withYearOfEra((int) '4');
        org.joda.time.LocalDateTime.Property property31 = localDateTime28.era();
        java.util.Locale locale32 = null;
        java.lang.String str33 = property31.getAsText(locale32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property31.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime36 = localDateTime13.withField(dateTimeFieldType34, 25200010);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25200010 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property31);
// flaky "6) test2244(org.joda.time.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u0e04\u0e28." + "'", str33, "\u0e04\u0e28.");
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withWeekyear(69);
        int int4 = localDate3.getWeekyear();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 69 + "'", int4 == 69);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) '4');
        int int4 = localDateTime3.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime3.withFields((org.joda.time.ReadablePartial) localDateTime10);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) '4');
        int int14 = localDateTime13.getYearOfEra();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime17 = property15.addToCopy((int) '4');
        org.joda.time.Chronology chronology18 = property15.getChronology();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime3, chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime3.plusHours(26);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = localDate1.compareTo((org.joda.time.ReadablePartial) localDateTime3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
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
        org.joda.time.LocalDate localDate26 = localDate12.minusYears(50);
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
        org.junit.Assert.assertNotNull(localDate26);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
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
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withLocalMillis((long) 333);
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
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withCenturyOfEra(1);
        int int3 = localDateTime0.getYear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.withWeekyear(2007);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) '4');
        int int8 = localDateTime7.getYearOfEra();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.minuteOfHour();
        int int10 = property9.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime12 = property9.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime13 = property9.roundHalfFloorCopy();
        int[] intArray14 = localDateTime13.getValues();
        boolean boolean15 = localDateTime0.isEqual((org.joda.time.ReadablePartial) localDateTime13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime0.withDate(3938, 743, 58);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 743 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2026 + "'", int3 == 2026);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 59 + "'", int10 == 59);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1970, 1, 1, 25200000 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
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
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.minus(readablePeriod24);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) '4');
        int int31 = localDateTime30.getYearOfEra();
        org.joda.time.LocalDateTime.Property property32 = localDateTime30.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime34 = property32.addToCopy((int) '4');
        org.joda.time.Chronology chronology35 = property32.getChronology();
        java.util.Locale locale36 = null;
        java.lang.String str37 = property32.getAsShortText(locale36);
        org.joda.time.LocalDateTime localDateTime38 = property32.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) '4');
        int int41 = localDateTime40.getYearOfEra();
        org.joda.time.LocalDateTime.Property property42 = localDateTime40.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime44 = property42.addToCopy((int) '4');
        org.joda.time.Chronology chronology45 = property42.getChronology();
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now(chronology45);
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.withDurationAdded(readableDuration47, 53);
        boolean boolean50 = localDateTime38.equals((java.lang.Object) localDateTime46);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime46.minusMillis(100);
        org.joda.time.Chronology chronology53 = localDateTime52.getChronology();
        org.joda.time.LocalDateTime localDateTime54 = org.joda.time.LocalDateTime.now(chronology53);
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(chronology53);
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(1L, chronology53);
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime(chronology53);
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime((java.lang.Object) 1L, chronology53);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField59 = localDateTime19.getField(55, chronology53);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 55");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1970 + "'", int31 == 1970);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0" + "'", str37, "0");
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1970 + "'", int41 == 1970);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(localDateTime54);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
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
        org.joda.time.LocalDate localDate25 = property15.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) '4');
        int int29 = localDateTime28.getYearOfEra();
        org.joda.time.LocalDateTime.Property property30 = localDateTime28.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime32 = property30.addToCopy((int) '4');
        int int33 = localDateTime32.getEra();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.plus(readableDuration34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.plusWeeks(1970);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.withMonthOfYear(2);
        org.joda.time.Chronology chronology40 = localDateTime39.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField41 = localDate25.getField(55, chronology40);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 55");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1970 + "'", int29 == 1970);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(chronology40);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.weekyear();
        org.joda.time.LocalDate localDate9 = property7.setCopy(25200000);
        org.joda.time.LocalDate localDate10 = property7.getLocalDate();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("\u0e04\u0e28.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"?.?.\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis(0);
        java.util.Locale locale12 = null;
        java.lang.String str13 = localDateTime5.toString("2032-02-19", locale12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime5.weekyear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2032-02-19" + "'", str13, "2032-02-19");
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((-61942060800000L));
        org.joda.time.DurationFieldType durationFieldType2 = null;
        boolean boolean3 = localDate1.isSupported(durationFieldType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withTime(10, 52, (int) (short) 10, 11);
        int int11 = localDateTime10.getMillisOfDay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39130011 + "'", int11 == 39130011);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
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
        java.util.Date date17 = localDateTime16.toDate();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYear(269);
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
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Tue Jan 01 07:00:00 ICT 1918");
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        long long12 = localDateTime11.getLocalMillis();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.minusWeeks(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5701010L + "'", long12 == 5701010L);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
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
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) '4');
        int int15 = localDateTime14.getYearOfEra();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime18 = property16.addToCopy((int) '4');
        org.joda.time.Chronology chronology19 = property16.getChronology();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now(chronology19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withDurationAdded(readableDuration21, 53);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) '4');
        int int27 = localDateTime26.getYearOfEra();
        org.joda.time.LocalDateTime.Property property28 = localDateTime26.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime30 = property28.addToCopy((int) '4');
        org.joda.time.Chronology chronology31 = property28.getChronology();
        java.util.Locale locale32 = null;
        java.lang.String str33 = property28.getAsShortText(locale32);
        org.joda.time.LocalDateTime localDateTime34 = property28.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) '4');
        int int38 = localDateTime37.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime37.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime45 = localDateTime37.withFields((org.joda.time.ReadablePartial) localDateTime44);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((long) '4');
        int int48 = localDateTime47.getYearOfEra();
        org.joda.time.LocalDateTime.Property property49 = localDateTime47.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime51 = property49.addToCopy((int) '4');
        org.joda.time.Chronology chronology52 = property49.getChronology();
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime37, chronology52);
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(chronology52);
        org.joda.time.DateTimeField dateTimeField55 = localDateTime34.getField(0, chronology52);
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(chronology52);
        org.joda.time.DateTimeField dateTimeField57 = localDateTime20.getField(0, chronology52);
        // The following exception was thrown during execution in test generation
        try {
            int int58 = localDate12.compareTo((org.joda.time.ReadablePartial) localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1970 + "'", int27 == 1970);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0" + "'", str33, "0");
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1970 + "'", int48 == 1970);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTimeField57);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        int int6 = localDateTime1.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = property7.addToCopy(1790553600007L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1790553600007");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime9 = property7.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withWeekOfWeekyear(35);
        org.joda.time.LocalDateTime.Property property16 = localDateTime12.yearOfEra();
        org.joda.time.LocalDateTime localDateTime18 = property16.addToCopy(1869);
        boolean boolean19 = localDateTime9.isAfter((org.joda.time.ReadablePartial) localDateTime18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
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
        int int17 = localDateTime16.getMillisOfDay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 28320052 + "'", int17 == 28320052);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy(0L);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusMinutes(59);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusYears(35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField13 = localDateTime11.getField(14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 14");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeZone2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusSeconds((int) ' ');
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate0.year();
        org.joda.time.LocalDate localDate5 = property3.addToCopy(3);
        org.joda.time.LocalDate localDate6 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate8 = property3.setCopy(10);
        org.joda.time.LocalDate localDate9 = property3.withMinimumValue();
        org.joda.time.LocalDate localDate10 = property3.roundCeilingCopy();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusHours((int) '4');
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.year();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundFloorCopy();
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = property10.setCopy("", locale13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
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
        org.joda.time.LocalDate.Property property18 = localDate7.centuryOfEra();
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
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.joda.time.LocalDateTime localDateTime0 = null;
        org.joda.time.DateTimeField dateTimeField1 = null;
        org.joda.time.LocalDateTime.Property property2 = new org.joda.time.LocalDateTime.Property(localDateTime0, dateTimeField1);
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate6 = localDate3.withPeriodAdded(readablePeriod4, (int) (byte) -1);
        org.joda.time.LocalDate localDate8 = localDate3.plusWeeks(0);
        org.joda.time.LocalDate localDate10 = localDate8.withYear((int) ' ');
        org.joda.time.LocalDate localDate12 = localDate10.minusDays((int) (short) 0);
        java.util.Locale locale14 = null;
        java.lang.String str15 = localDate12.toString("271", locale14);
        org.joda.time.DateTime dateTime16 = localDate12.toDateTimeAtMidnight();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate12.plus(readablePeriod17);
        org.joda.time.LocalDate localDate20 = localDate18.minusMonths(20);
        org.joda.time.DateMidnight dateMidnight21 = localDate18.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = localDate18.toDateMidnight(dateTimeZone22);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = property2.compareTo((org.joda.time.ReadableInstant) dateMidnight23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "271" + "'", str15, "271");
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(dateMidnight23);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
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
            org.joda.time.LocalDateTime localDateTime24 = localDateTime20.withDate((int) (byte) 0, 867, 2032);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 867 for monthOfYear must be in the range [1,12]");
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
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
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
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withYear(8);
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
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.DurationField durationField8 = property7.getDurationField();
        java.lang.String str9 = property7.getAsShortText();
        org.joda.time.DurationField durationField10 = property7.getRangeDurationField();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "271" + "'", str9, "271");
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
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
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) '4');
        int int30 = localDateTime29.getYearOfEra();
        org.joda.time.LocalDateTime.Property property31 = localDateTime29.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime33 = property31.addToCopy((int) '4');
        int int34 = localDateTime33.getEra();
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.plus(readableDuration35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime33.plusMillis(0);
        int int39 = localDateTime33.getYearOfCentury();
        int int40 = localDateTime33.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.plusSeconds(0);
        int int46 = localDateTime43.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) '4');
        int int49 = localDateTime48.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property50 = localDateTime48.dayOfYear();
        org.joda.time.LocalDateTime.Property property51 = localDateTime48.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime52 = property51.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = property51.getFieldType();
        int int54 = localDateTime43.indexOf(dateTimeFieldType53);
        int int55 = localDateTime33.get(dateTimeFieldType53);
        int int56 = localDateTime22.get(dateTimeFieldType53);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1970 + "'", int30 == 1970);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 70 + "'", int39 == 70);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate5.withPeriodAdded(readablePeriod6, 0);
        org.joda.time.LocalDate.Property property9 = localDate8.yearOfEra();
        org.joda.time.LocalDate localDate10 = property9.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate12 = property9.addWrapFieldToCopy(20);
        org.joda.time.LocalDate.Property property13 = localDate12.dayOfYear();
        long long14 = property13.getMillis();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2421705600000L + "'", long14 == 2421705600000L);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate localDate10 = localDate0.plusMonths((int) (short) 100);
        org.joda.time.LocalDate.Property property11 = localDate10.weekyear();
        java.lang.String str12 = property11.getName();
        java.lang.String str13 = property11.getAsShortText();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "weekyear" + "'", str12, "weekyear");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2035" + "'", str13, "2035");
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
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
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withMinuteOfHour(26);
        org.joda.time.DurationFieldType durationFieldType21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withFieldAdded(durationFieldType21, 25200052);
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
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
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
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) '4');
        int int18 = localDateTime17.getYearOfEra();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.minuteOfHour();
        int int20 = property19.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime22 = property19.addWrapFieldToCopy((int) 'a');
        org.joda.time.Interval interval23 = property19.toInterval();
        java.util.Locale locale25 = null;
        org.joda.time.LocalDateTime localDateTime26 = property19.setCopy("9", locale25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone28);
        org.joda.time.DateTimeField[] dateTimeFieldArray30 = localDateTime29.getFields();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.minusDays(59);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime26.withFields((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime26.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime35 = property34.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) '4');
        int int38 = localDateTime37.getYearOfEra();
        org.joda.time.LocalDateTime.Property property39 = localDateTime37.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime41 = property39.addToCopy((int) '4');
        int int42 = localDateTime41.getEra();
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.plus(readableDuration43);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.plusWeeks(10);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.minusDays((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.plusMonths(9);
        org.joda.time.LocalDateTime.Property property51 = localDateTime48.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = property51.getFieldType();
        int int53 = localDateTime35.get(dateTimeFieldType52);
        boolean boolean54 = localDateTime15.isSupported(dateTimeFieldType52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1970 + "'", int18 == 1970);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 59 + "'", int20 == 59);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldArray30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1970 + "'", int38 == 1970);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTimeFieldType52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 4 + "'", int53 == 4);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        org.joda.time.LocalDate localDate6 = localDate1.plusWeeks(0);
        org.joda.time.LocalDate localDate8 = localDate6.withYear((int) ' ');
        org.joda.time.LocalDate localDate10 = localDate8.minusDays((int) (short) 0);
        org.joda.time.LocalDate localDate12 = localDate10.withYearOfCentury(52);
        org.joda.time.LocalDate localDate14 = localDate10.withYear(0);
        org.joda.time.LocalDate localDate16 = localDate10.plusDays(25200000);
        org.joda.time.LocalDate localDate18 = localDate10.minusMonths(2026);
        org.joda.time.LocalDate.Property property19 = localDate10.weekOfWeekyear();
        org.joda.time.LocalDate.Property property20 = localDate10.weekyear();
        org.joda.time.Chronology chronology21 = property20.getChronology();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(0L, chronology21);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        java.lang.String str3 = property2.toString();
        int int4 = property2.getLeapAmount();
        java.lang.String str5 = property2.toString();
        org.joda.time.LocalDateTime localDateTime7 = property2.setCopy(7);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withDayOfWeek((int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[centuryOfEra]" + "'", str3, "Property[centuryOfEra]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Property[centuryOfEra]" + "'", str5, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        org.joda.time.DurationField durationField9 = property8.getRangeDurationField();
        org.joda.time.Chronology chronology10 = property8.getChronology();
        org.joda.time.Interval interval11 = property8.toInterval();
        java.lang.String str12 = property8.getAsText();
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = property8.setCopy("2026-09-28T08:00:02.058", locale14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2026-09-28T08:00:02.058\" for dayOfMonth is not supported");
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
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.millisOfSecond();
        long long8 = property7.getMillis();
        org.joda.time.LocalDateTime localDateTime10 = property7.addToCopy(48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25200052L + "'", long8 == 25200052L);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
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
        org.joda.time.Chronology chronology20 = localDateTime17.getChronology();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDateTime17.toDateTime(dateTimeZone21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = localDateTime17.withHourOfDay(750);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 750 for hourOfDay must be in the range [0,23]");
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
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.plusWeeks(52);
        int int11 = localDateTime7.getYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        int[] intArray3 = localDate2.getValues();
        org.joda.time.LocalDate localDate5 = localDate2.minusYears((int) (byte) 1);
        org.joda.time.LocalDate.Property property6 = localDate5.weekOfWeekyear();
        java.lang.String str7 = property6.getAsShortText();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property6.getAsShortText(locale8);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
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
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.weekyear();
        int int14 = localDateTime12.getYear();
        org.joda.time.DateTime dateTime15 = localDateTime12.toDateTime();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1980 + "'", int14 == 1980);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfYear(3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfDay();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.plusMillis(25200052);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        int int7 = localDateTime5.size();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) '4');
        int int10 = localDateTime9.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime17 = localDateTime9.withFields((org.joda.time.ReadablePartial) localDateTime16);
        java.util.Date date18 = localDateTime17.toDate();
        int int19 = localDateTime17.getDayOfYear();
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.secondOfMinute();
        org.joda.time.DurationField durationField21 = property20.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime22 = property20.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) '4');
        int int25 = localDateTime24.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime24.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime32 = localDateTime24.withFields((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime31.yearOfEra();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime31.plusWeeks(28);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) '4');
        int int39 = localDateTime38.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime38.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime46 = localDateTime38.withFields((org.joda.time.ReadablePartial) localDateTime45);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime38.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime38.withHourOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.yearOfCentury();
        org.joda.time.Chronology chronology52 = property51.getChronology();
        org.joda.time.DateTimeField dateTimeField53 = localDateTime31.getField((int) (short) 0, chronology52);
        org.joda.time.LocalDateTime.Property property54 = new org.joda.time.LocalDateTime.Property(localDateTime22, dateTimeField53);
        boolean boolean55 = localDateTime5.isAfter((org.joda.time.ReadablePartial) localDateTime22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNull(durationField21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.millisOfSecond();
        int int8 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property9 = localDateTime1.centuryOfEra();
        int int10 = property9.getMinimumValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 25200052 + "'", int8 == 25200052);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("1");
        org.junit.Assert.assertNotNull(localDate1);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfDay(2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusYears(53);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusDays(42);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        int int6 = localDateTime1.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.year();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusDays(0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusMillis(69);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime1.minusDays((int) (short) 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localDateTime1.getFields();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
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
        org.joda.time.DateTime dateTime26 = localDate12.toDateTimeAtMidnight();
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
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
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
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = localDate22.toDateTimeAtMidnight(dateTimeZone25);
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
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = localDate5.toDateMidnight(dateTimeZone6);
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate11 = localDate8.withPeriodAdded(readablePeriod9, (int) (byte) -1);
        org.joda.time.LocalDate localDate13 = localDate8.plusWeeks(0);
        org.joda.time.LocalDate localDate15 = localDate13.withYear((int) ' ');
        org.joda.time.LocalDate localDate17 = localDate15.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime18 = localDate15.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate20 = localDate15.minusWeeks(19);
        boolean boolean21 = localDate5.isBefore((org.joda.time.ReadablePartial) localDate15);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
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
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.dayOfYear();
        org.joda.time.LocalDateTime localDateTime48 = property46.addToCopy(242);
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
        org.junit.Assert.assertNotNull(localDateTime48);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 2026, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate2.minus(readablePeriod3);
        org.joda.time.LocalDate.Property property5 = localDate4.era();
        org.joda.time.LocalDate localDate6 = property5.withMaximumValue();
        org.joda.time.LocalTime localTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDate6.toLocalDateTime(localTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The time must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
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
        int int19 = localDateTime18.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime26 = localDateTime18.withFields((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime18.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime18.withHourOfDay((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withPeriodAdded(readablePeriod31, (int) '#');
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withWeekyear(12);
        java.util.Date date36 = localDateTime35.toDate();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = localDateTime35.toDateTime(dateTimeZone37);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) '4');
        int int41 = localDateTime40.getYearOfEra();
        org.joda.time.LocalDateTime.Property property42 = localDateTime40.minuteOfHour();
        org.joda.time.LocalDateTime.Property property43 = localDateTime40.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray44 = localDateTime40.getFieldTypes();
        org.joda.time.LocalDateTime.Property property45 = localDateTime40.secondOfMinute();
        org.joda.time.LocalDateTime.Property property46 = localDateTime40.monthOfYear();
        org.joda.time.Chronology chronology47 = property46.getChronology();
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime35, chronology47);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField49 = localDate11.getField(26, chronology47);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 26");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Tue Jan 05 00:00:00 ICT 12");
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1970 + "'", int41 == 1970);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(chronology47);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.centuryOfEra();
        java.util.Locale locale4 = null;
        int int5 = property3.getMaximumShortTextLength(locale4);
        java.util.Locale locale6 = null;
        int int7 = property3.getMaximumTextLength(locale6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
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
        java.util.Locale locale21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = localDateTime14.toString("minuteOfHour", locale21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1969, 1, 1, 28320052 });
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
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
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusHours(2922789);
        int int18 = localDateTime15.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) '4');
        int int21 = localDateTime20.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime20.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime30 = localDateTime20.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        java.util.Date date31 = localDateTime20.toDate();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) '4');
        int int34 = localDateTime33.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property35 = localDateTime33.dayOfYear();
        org.joda.time.LocalDateTime.Property property36 = localDateTime33.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime37 = property36.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = property36.getFieldType();
        int int39 = localDateTime20.get(dateTimeFieldType38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime20.plusDays((int) (byte) 100);
        int int42 = localDateTime15.compareTo((org.joda.time.ReadablePartial) localDateTime41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
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
        org.joda.time.LocalDate localDate18 = localDate11.minusMonths(2);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDate localDate20 = localDate18.minus(readablePeriod19);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plus(readableDuration23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.minusSeconds(0);
        java.util.Date date27 = localDateTime22.toDate();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime22.plusDays(0);
        int int30 = localDateTime22.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            int int31 = localDate18.compareTo((org.joda.time.ReadablePartial) localDateTime22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
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
        int[] intArray26 = localDate24.getValues();
        org.joda.time.DateTime dateTime27 = localDate24.toDateTimeAtStartOfDay();
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
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 5232, 2, 10 });
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
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
        int int25 = property15.getMinimumValueOverall();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-292275054) + "'", int25 == (-292275054));
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((-25198114L));
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.weekyear();
        int int3 = localDateTime1.getCenturyOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(2026);
        org.joda.time.LocalDate localDate13 = localDate11.plusWeeks(19);
        org.joda.time.LocalDate.Property property14 = localDate11.dayOfYear();
        org.joda.time.LocalDate localDate15 = property14.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate16 = property14.getLocalDate();
        java.lang.String str17 = property14.getAsString();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "333" + "'", str17, "333");
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
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
        int int18 = localDate15.getYear();
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDate localDate22 = localDate19.withPeriodAdded(readablePeriod20, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDate localDate24 = localDate19.minus(readablePeriod23);
        org.joda.time.DateTime dateTime25 = localDate24.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime26 = localDate15.toDateTime((org.joda.time.ReadableInstant) dateTime25);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
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
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = localDate7.toDateMidnight(dateTimeZone14);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateMidnight15);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.minusWeeks((int) (short) 0);
        int int6 = localDate5.getDayOfWeek();
        org.joda.time.LocalTime localTime7 = null;
        org.joda.time.DateTime dateTime8 = localDate5.toDateTime(localTime7);
        org.joda.time.LocalDate.Property property9 = localDate5.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate5.withYearOfCentury(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate.Property property8 = localDate5.monthOfYear();
        java.util.Locale locale9 = null;
        int int10 = property8.getMaximumTextLength(locale9);
        java.util.Locale locale11 = null;
        int int12 = property8.getMaximumShortTextLength(locale11);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
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
        int int16 = property14.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime18 = property14.addWrapFieldToCopy((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
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
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) '4');
        int int16 = localDateTime15.getYearOfEra();
        org.joda.time.LocalDateTime.Property property17 = localDateTime15.minuteOfHour();
        int int18 = property17.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime20 = property17.addWrapFieldToCopy((int) 'a');
        org.joda.time.Interval interval21 = property17.toInterval();
        org.joda.time.LocalDateTime localDateTime22 = property17.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) '4');
        int int25 = localDateTime24.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime24.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime32 = localDateTime24.withFields((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime24.plusYears((int) (byte) -1);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plus(readableDuration35);
        int int37 = localDateTime36.size();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime22.withFields((org.joda.time.ReadablePartial) localDateTime36);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = property39.getFieldType();
        int int41 = localDateTime13.get(dateTimeFieldType40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1970 + "'", int16 == 1970);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 59 + "'", int18 == 59);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        java.util.Locale locale5 = null;
        int int6 = property4.getMaximumTextLength(locale5);
        org.joda.time.LocalDateTime localDateTime7 = property4.roundHalfFloorCopy();
        int int8 = localDateTime7.getYearOfEra();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
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
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plus(readableDuration15);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) '4');
        int int19 = localDateTime18.getYearOfEra();
        org.joda.time.LocalDateTime.Property property20 = localDateTime18.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime22 = property20.addToCopy((int) '4');
        int int23 = localDateTime22.getEra();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.plus(readableDuration24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.plusMillis(0);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withDurationAdded(readableDuration28, 0);
        int int32 = localDateTime27.getValue(2);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime27.plusMonths(2);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusDays(1970);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalDateTime localDateTime38 = localDateTime34.plus(readablePeriod37);
        boolean boolean39 = localDateTime14.isBefore((org.joda.time.ReadablePartial) localDateTime34);
        int int40 = localDateTime14.getYearOfEra();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1964 + "'", int40 == 1964);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate localDate10 = localDate0.plusMonths((int) (short) 100);
        org.joda.time.LocalDate localDate12 = localDate0.withEra(0);
        int int13 = localDate12.getWeekyear();
        java.util.Locale locale15 = null;
        java.lang.String str16 = localDate12.toString("40", locale15);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2026) + "'", int13 == (-2026));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "40" + "'", str16, "40");
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minus(readablePeriod6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundCeilingCopy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate0.minus(readablePeriod4);
        org.joda.time.LocalDate.Property property6 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate7 = property6.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate9 = localDate7.minusMonths((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) '4');
        int int12 = localDateTime11.getYearOfEra();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime15 = property13.addToCopy((int) '4');
        org.joda.time.Chronology chronology16 = property13.getChronology();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now(chronology16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withDurationAdded(readableDuration18, 53);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withMillisOfSecond(269);
        int int23 = localDateTime20.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = localDate7.isBefore((org.joda.time.ReadablePartial) localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
// flaky "7) test2315(org.joda.time.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 996 + "'", int23 == 996);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalTime localTime7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate0.toDateTime(localTime7, dateTimeZone8);
        org.joda.time.LocalDate.Property property10 = localDate0.dayOfWeek();
        int int11 = property10.getMaximumValue();
        org.joda.time.LocalDate localDate12 = property10.roundHalfCeilingCopy();
        int int13 = property10.get();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minus(readablePeriod6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime1.minuteOfHour();
        java.lang.String str9 = property8.getAsString();
        java.lang.String str10 = property8.getName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "minuteOfHour" + "'", str10, "minuteOfHour");
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYear();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusYears(14);
        int int5 = localDateTime4.getWeekyear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1955 + "'", int5 == 1955);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
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
        java.util.Locale locale13 = null;
        java.lang.String str14 = property3.getAsText(locale13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = property3.setCopy("2026-09-26T04:00:01.558");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2026-09-26T04:00:01.558\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 420L + "'", long10 == 420L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
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
        long long20 = localDate16.getLocalMillis();
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1788220800000L + "'", long20 == 1788220800000L);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
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
        org.joda.time.LocalDateTime localDateTime18 = property14.addToCopy((long) 19);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusSeconds(2027);
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
        int int35 = localDateTime31.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) '4');
        int int38 = localDateTime37.getYearOfEra();
        org.joda.time.LocalDateTime.Property property39 = localDateTime37.minuteOfHour();
        org.joda.time.LocalDateTime.Property property40 = localDateTime37.era();
        long long41 = property40.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property40.getFieldType();
        boolean boolean43 = localDateTime31.isSupported(dateTimeFieldType42);
        int int44 = localDateTime18.get(dateTimeFieldType42);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1970 + "'", int23 == 1970);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 28320052 + "'", int35 == 28320052);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1970 + "'", int38 == 1970);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 25200052L + "'", long41 == 25200052L);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
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
        org.joda.time.DateTime dateTime15 = localDate10.toDateTimeAtMidnight(dateTimeZone14);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.minusWeeks((int) (short) 0);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((java.lang.Object) localDate0, dateTimeZone7);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localDate8.getValue(2037);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2037");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate0.minus(readablePeriod4);
        org.joda.time.LocalDate.Property property6 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate7 = property6.roundCeilingCopy();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
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
        java.util.Date date18 = localDate17.toDate();
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
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Tue Feb 03 00:00:00 ICT 5232");
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
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
        org.joda.time.LocalDate localDate18 = property16.addWrapFieldToCopy((-1790557199));
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate18);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(12, 15, 119, 48, 3938, 1980);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 48 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime5.withYearOfEra(0);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 70 + "'", int12 == 70);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
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
        org.joda.time.DateTime dateTime21 = localDate15.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDate localDate26 = localDate23.withPeriodAdded(readablePeriod24, (int) (byte) -1);
        int int27 = localDate23.getYearOfEra();
        org.joda.time.LocalDate localDate29 = localDate23.plusDays(1970);
        org.joda.time.LocalDate localDate30 = localDate22.withFields((org.joda.time.ReadablePartial) localDate29);
        org.joda.time.LocalDate.Property property31 = localDate29.monthOfYear();
        org.joda.time.DateTime dateTime32 = localDate29.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalDate localDate34 = localDate29.plus(readablePeriod33);
        org.joda.time.LocalDate localDate35 = localDate15.withFields((org.joda.time.ReadablePartial) localDate29);
        org.joda.time.DurationFieldType durationFieldType36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate38 = localDate15.withFieldAdded(durationFieldType36, 2025);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
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
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2026 + "'", int27 == 2026);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(localDate35);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        int int8 = property7.getMaximumValue();
        org.joda.time.LocalDate localDate9 = property7.withMinimumValue();
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.LocalDate.Property property11 = localDate9.era();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 365 + "'", int8 == 365);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
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
        org.joda.time.LocalDate localDate30 = property27.withMinimumValue();
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
        org.junit.Assert.assertNotNull(localDate30);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readableDuration7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        int int10 = property9.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime12 = property9.addWrapFieldToCopy(39);
        java.lang.String str13 = property9.getAsShortText();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "70" + "'", str13, "70");
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundFloorCopy();
        int int8 = localDateTime7.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusWeeks(100);
        int int11 = localDateTime10.getMonthOfYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
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
        int int18 = localDateTime17.getYearOfCentury();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 68 + "'", int18 == 68);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        java.util.Date date10 = localDateTime9.toDate();
        int int11 = localDateTime9.getDayOfYear();
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime13 = property12.getLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withSecondOfMinute(28815681);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28815681 for secondOfMinute must be in the range [0,59]");
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
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.LocalDate localDate10 = localDate7.plusDays(5);
        org.joda.time.LocalDate localDate12 = localDate7.withDayOfMonth(28);
        org.joda.time.DateTime dateTime13 = localDate12.toDateTimeAtCurrentTime();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusYears(12);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusMonths(1969);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYearOfCentury(52);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withMonthOfYear(39130011);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39130011 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
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
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withSecondOfMinute(0);
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
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate0.minus(readablePeriod4);
        org.joda.time.DateTime dateTime6 = localDate5.toDateTimeAtMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Interval interval8 = localDate5.toInterval(dateTimeZone7);
        int int9 = localDate5.getYearOfEra();
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate13 = localDate10.withPeriodAdded(readablePeriod11, (int) (byte) -1);
        int int14 = localDate10.getYearOfEra();
        org.joda.time.LocalDate localDate16 = localDate10.plusDays(1970);
        org.joda.time.LocalDate localDate18 = localDate10.withLocalMillis((long) (-1));
        org.joda.time.LocalDate localDate20 = localDate18.minusYears(25200052);
        org.joda.time.Interval interval21 = localDate20.toInterval();
        int int22 = localDate20.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) 2026, dateTimeZone24);
        int[] intArray26 = localDate25.getValues();
        org.joda.time.LocalDate.Property property27 = localDate25.weekOfWeekyear();
        org.joda.time.LocalDate localDate29 = property27.addToCopy(10);
        org.joda.time.LocalDate localDate31 = property27.addToCopy(1970);
        long long32 = property27.getMillis();
        java.lang.String str33 = property27.getAsShortText();
        boolean boolean34 = property27.isLeap();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = property27.getFieldType();
        boolean boolean36 = localDate20.isSupported(dateTimeFieldType35);
        int int37 = localDate5.get(dateTimeFieldType35);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2026 + "'", int9 == 2026);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2026 + "'", int14 == 2026);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 31 + "'", int22 == 31);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 1970, 1, 1 });
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1" + "'", str33, "1");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 40 + "'", int37 == 40);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        int int9 = localDateTime8.getYearOfEra();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        int int11 = property10.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime13 = property10.addWrapFieldToCopy((int) 'a');
        int int14 = localDateTime13.getWeekyear();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) '4');
        int int17 = localDateTime16.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime26 = localDateTime16.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        java.util.Date date27 = localDateTime16.toDate();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) '4');
        int int30 = localDateTime29.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property31 = localDateTime29.dayOfYear();
        org.joda.time.LocalDateTime.Property property32 = localDateTime29.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime33 = property32.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property32.getFieldType();
        int int35 = localDateTime16.get(dateTimeFieldType34);
        boolean boolean36 = localDateTime13.isSupported(dateTimeFieldType34);
        org.joda.time.LocalDateTime.Property property37 = localDateTime5.property(dateTimeFieldType34);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime5);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plusDays(999);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDateTime40);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        java.lang.String str8 = property7.getAsText();
        boolean boolean9 = property7.isLeap();
        org.joda.time.DurationField durationField10 = property7.getRangeDurationField();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026" + "'", str8, "2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(durationField10);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
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
            org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withCenturyOfEra((-1790557199));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1790557199 for centuryOfEra must be in the range [0,2922789]");
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
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        java.lang.String str3 = property2.toString();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundHalfFloorCopy();
        java.util.Locale locale6 = null;
        org.joda.time.LocalDateTime localDateTime7 = property2.setCopy("1970", locale6);
        org.joda.time.DateTimeField dateTimeField8 = property2.getField();
        java.lang.String str9 = property2.getAsString();
        org.joda.time.LocalDateTime localDateTime11 = property2.addWrapFieldToCopy(14403717);
        org.joda.time.LocalDateTime localDateTime13 = property2.setCopy((int) (byte) 1);
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
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
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
        java.util.Locale locale24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = localDateTime21.toString("Property[weekyear]", locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 32);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withHourOfDay(53994173);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53994173 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
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
        int int14 = localDateTime5.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime5.plusWeeks(28816124);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 19 + "'", int14 == 19);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(621, 3938, 652, (-2026), 99, 28814668);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2026 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(25200052L);
        org.joda.time.LocalDate localDate3 = localDate1.withLocalMillis(10L);
        org.joda.time.LocalDate.Property property4 = localDate1.yearOfCentury();
        java.util.Locale locale6 = null;
        java.lang.String str7 = localDate1.toString("\u0e01\u0e1e.", locale6);
        org.joda.time.LocalDate.Property property8 = localDate1.yearOfCentury();
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate12 = localDate9.withPeriodAdded(readablePeriod10, (int) (byte) -1);
        org.joda.time.LocalDate localDate14 = localDate9.plusWeeks(0);
        org.joda.time.LocalDate localDate16 = localDate14.withYear((int) ' ');
        org.joda.time.LocalDate localDate18 = localDate14.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate20 = localDate18.minusMonths(2026);
        org.joda.time.LocalDate localDate22 = localDate20.plusWeeks(19);
        org.joda.time.LocalDate.Property property23 = localDate20.dayOfYear();
        org.joda.time.LocalDate localDate24 = property23.roundHalfCeilingCopy();
        int int25 = localDate1.compareTo((org.joda.time.ReadablePartial) localDate24);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u0e01\u0e1e." + "'", str7, "\u0e01\u0e1e.");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
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
        int int15 = localDate14.getDayOfMonth();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property3.getAsShortText(locale7);
        org.joda.time.LocalDateTime localDateTime9 = property3.roundHalfCeilingCopy();
        int int10 = localDateTime9.getDayOfMonth();
        int int11 = localDateTime9.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusDays(56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(2026);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate11.plus(readablePeriod12);
        int int14 = localDate13.getYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1832 + "'", int14 == 1832);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusWeeks((int) (short) -1);
        int int8 = localDateTime7.getHourOfDay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
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
        int int16 = localDate13.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) '4');
        int int19 = localDateTime18.getYearOfEra();
        org.joda.time.LocalDateTime.Property property20 = localDateTime18.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime22 = property20.addToCopy((int) '4');
        int int23 = localDateTime22.getEra();
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
        org.joda.time.LocalDateTime.Property property59 = localDateTime22.property(dateTimeFieldType57);
        org.joda.time.LocalDateTime localDateTime61 = property59.addToCopy(32);
        org.joda.time.LocalDateTime localDateTime63 = property59.setCopy(119);
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((long) '4');
        int int66 = localDateTime65.getYearOfEra();
        org.joda.time.LocalDateTime.Property property67 = localDateTime65.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime69 = property67.addToCopy((int) '4');
        int int70 = localDateTime69.getEra();
        org.joda.time.ReadableDuration readableDuration71 = null;
        org.joda.time.LocalDateTime localDateTime72 = localDateTime69.plus(readableDuration71);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime69.plusMillis(0);
        int int75 = localDateTime69.getYearOfCentury();
        int int76 = localDateTime69.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.LocalDateTime localDateTime79 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone78);
        org.joda.time.LocalDateTime localDateTime81 = localDateTime79.plusSeconds(0);
        int int82 = localDateTime79.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime84 = new org.joda.time.LocalDateTime((long) '4');
        int int85 = localDateTime84.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property86 = localDateTime84.dayOfYear();
        org.joda.time.LocalDateTime.Property property87 = localDateTime84.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime88 = property87.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType89 = property87.getFieldType();
        int int90 = localDateTime79.indexOf(dateTimeFieldType89);
        int int91 = localDateTime69.get(dateTimeFieldType89);
        int int92 = localDateTime63.indexOf(dateTimeFieldType89);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate94 = localDate13.withField(dateTimeFieldType89, 867);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
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
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1970 + "'", int66 == 1970);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(localDateTime72);
        org.junit.Assert.assertNotNull(localDateTime74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 70 + "'", int75 == 70);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNotNull(localDateTime81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 4 + "'", int82 == 4);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertNotNull(property86);
        org.junit.Assert.assertNotNull(property87);
        org.junit.Assert.assertNotNull(localDateTime88);
        org.junit.Assert.assertNotNull(dateTimeFieldType89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        java.lang.String str5 = localDateTime4.toString();
        int int6 = localDateTime4.getYearOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-19T07:00:00.052" + "'", str5, "1970-01-19T07:00:00.052");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = localDate0.toString("1970-01-01T07:00:00.008");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
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
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(0, 1980, 5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1980 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
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
        org.joda.time.DurationFieldType durationFieldType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = localDate8.withFieldAdded(durationFieldType13, 54013758);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
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
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
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
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withMillisOfDay(31);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) '4');
        int int17 = localDateTime16.getYearOfEra();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime20 = property18.addToCopy((int) '4');
        org.joda.time.Chronology chronology21 = property18.getChronology();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.minusHours((-1));
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusWeeks(52);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.plusSeconds(31);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plusMonths(2007);
        org.joda.time.DateTimeField[] dateTimeFieldArray33 = localDateTime32.getFields();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime14.withFields((org.joda.time.ReadablePartial) localDateTime32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(dateTimeFieldArray33);
        org.junit.Assert.assertNotNull(localDateTime34);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
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
        int int24 = localDateTime23.getYearOfEra();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 28 + "'", int24 == 28);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        long long9 = localDate0.getLocalMillis();
        java.lang.String str10 = localDate0.toString();
        int int11 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate13 = localDate0.withWeekyear(31);
        org.joda.time.LocalDate.Property property14 = localDate13.dayOfYear();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1790553600000L + "'", long9 == 1790553600000L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-09-28" + "'", str10, "2026-09-28");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 28 + "'", int11 == 28);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        org.joda.time.Interval interval10 = localDate7.toInterval();
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay();
        int int12 = localDate7.getDayOfMonth();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
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
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) 2007, dateTimeZone18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
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
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
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
        org.joda.time.DateTime dateTime14 = localDate11.toDateTimeAtCurrentTime();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
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
        long long15 = property10.getMillis();
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1790553600000L + "'", long15 == 1790553600000L);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
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
        long long12 = property10.getMillis();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1960761600000L + "'", long12 == 1960761600000L);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        java.lang.String str6 = property3.getAsString();
        org.joda.time.LocalDateTime localDateTime7 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withLocalMillis((long) (-1));
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.plusDays((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withHourOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime7.minusHours(12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        org.joda.time.LocalDate localDate11 = localDate7.withCenturyOfEra((int) '4');
        org.joda.time.LocalDate localDate13 = localDate11.withLocalMillis((long) 4);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate17 = localDate14.withPeriodAdded(readablePeriod15, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight18 = localDate14.toDateMidnight();
        org.joda.time.LocalDate localDate20 = localDate14.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property21 = localDate20.weekyear();
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = property21.getDifference(readableInstant22);
        org.joda.time.LocalDate localDate24 = property21.withMinimumValue();
        org.joda.time.LocalDate localDate26 = property21.addWrapFieldToCopy(1);
        org.joda.time.LocalDate localDate27 = property21.roundFloorCopy();
        org.joda.time.LocalDate localDate28 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDate localDate31 = localDate28.withPeriodAdded(readablePeriod29, (int) (byte) -1);
        org.joda.time.LocalDate localDate33 = localDate28.plusWeeks(0);
        org.joda.time.LocalDate localDate35 = localDate33.withYear((int) ' ');
        org.joda.time.LocalDate localDate37 = localDate33.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDate localDate39 = localDate37.withYearOfEra(69);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = localDate37.toDateTimeAtCurrentTime(dateTimeZone40);
        int int42 = property21.getDifference((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTime dateTime43 = localDate11.toDateTime((org.joda.time.ReadableInstant) dateTime41);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 25 + "'", int42 == 25);
        org.junit.Assert.assertNotNull(dateTime43);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(1899030L, dateTimeZone1);
        org.joda.time.DateTime dateTime3 = localDate2.toDateTimeAtStartOfDay();
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1964, dateTimeZone1);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minusMonths(2);
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) '4');
        int int10 = localDateTime9.getYearOfEra();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime13 = property11.addToCopy((int) '4');
        int int14 = localDateTime13.getEra();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.plus(readableDuration15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusWeeks(10);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusDays((int) (short) -1);
        java.util.Date date21 = localDateTime18.toDate();
        boolean boolean22 = localDateTime1.equals((java.lang.Object) date21);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Mar 12 07:52:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
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
        int int29 = localDate15.getCenturyOfEra();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20 + "'", int29 == 20);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
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
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.centuryOfEra();
        org.joda.time.LocalDateTime.Property property22 = localDateTime20.yearOfEra();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.minusYears(12);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusMonths(1969);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = localDate11.isAfter((org.joda.time.ReadablePartial) localDateTime26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField5 = property4.getField();
        long long6 = property4.getMillis();
        java.util.Locale locale7 = null;
        int int8 = property4.getMaximumTextLength(locale7);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 25200052L + "'", long6 == 25200052L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
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
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.Interval interval23 = localDate17.toInterval(dateTimeZone22);
        int int24 = localDate17.getMonthOfYear();
        int int25 = localDate17.getDayOfMonth();
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
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12 + "'", int24 == 12);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 31 + "'", int25 == 31);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
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
        org.joda.time.LocalDate localDate19 = property14.getLocalDate();
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
        org.junit.Assert.assertNotNull(localDate19);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withHourOfDay(652);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 652 for hourOfDay must be in the range [0,23]");
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
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, (-1));
        org.joda.time.LocalDate.Property property9 = localDate0.weekOfWeekyear();
        org.joda.time.LocalDate localDate11 = property9.addToCopy((-292275054));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate11.withWeekOfWeekyear(70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMinimumValue();
        java.util.Date date6 = localDateTime5.toDate();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime8 = property7.withMinimumValue();
        java.lang.String str9 = property7.getName();
        org.joda.time.LocalDateTime localDateTime10 = property7.withMinimumValue();
        java.util.Locale locale11 = null;
        int int12 = property7.getMaximumShortTextLength(locale11);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
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
        int int19 = localDateTime18.getWeekOfWeekyear();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 40 + "'", int19 == 40);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.yearOfCentury();
        int int11 = localDate7.getValue(0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2032 + "'", int11 == 2032);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
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
        java.util.Locale locale34 = null;
        java.lang.String str35 = property31.getAsShortText(locale34);
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u0e1e\u0e24." + "'", str35, "\u0e1e\u0e24.");
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
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
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withCenturyOfEra(68);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[centuryOfEra]" + "'", str3, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
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
        int int16 = localDate15.size();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDate(333, 3, 28);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.year();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        boolean boolean6 = property4.equals((java.lang.Object) 70);
        org.joda.time.LocalDateTime localDateTime7 = property4.roundCeilingCopy();
        java.lang.String str8 = property4.getName();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "secondOfMinute" + "'", str8, "secondOfMinute");
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate5.withPeriodAdded(readablePeriod6, 0);
        org.joda.time.LocalDate.Property property9 = localDate8.yearOfEra();
        org.joda.time.Interval interval10 = localDate8.toInterval();
        java.lang.String str11 = localDate8.toString();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-09-28" + "'", str11, "2026-09-28");
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readableDuration2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds(0);
        java.util.Date date6 = localDateTime1.toDate();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.dayOfYear();
        int int8 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minusMonths(14403717);
        int int11 = localDateTime10.getMonthOfYear();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 25200052 + "'", int8 == 25200052);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
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
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.withDurationAdded(readableDuration35, 333);
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
        org.junit.Assert.assertNotNull(localDateTime37);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
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
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Interval interval15 = localDate13.toInterval(dateTimeZone14);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1790553600000L + "'", long9 == 1790553600000L);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(interval15);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
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
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.fromDateFields(date18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = localDate19.toDateMidnight(dateTimeZone20);
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
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(dateMidnight21);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
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
        org.joda.time.LocalDate.Property property30 = localDate27.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) 53994173, dateTimeZone32);
        org.joda.time.LocalDate localDate35 = localDate33.plusMonths((int) '#');
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = localDate35.toDateTimeAtMidnight(dateTimeZone36);
        int int38 = property30.compareTo((org.joda.time.ReadableInstant) dateTime37);
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
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1869, dateTimeZone1);
        int int3 = localDate2.getDayOfYear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 40);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localDateTime2.getFields();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.minusDays(59);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.dayOfYear();
        java.util.Locale locale7 = null;
        int int8 = property6.getMaximumTextLength(locale7);
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(42, (int) '#', 28, 10, 333, 2007);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 333 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate8 = property7.getLocalDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = localDate8.withWeekOfWeekyear(867);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 867 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("1970-01-01T07:00:00.000", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
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
        int int12 = localDateTime1.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 25200052 + "'", int3 == 25200052);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
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
        int int24 = localDateTime23.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withDayOfWeek((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfWeek must be in the range [1,7]");
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
// flaky "8) test2399(org.joda.time.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withMillisOfDay(7);
        org.joda.time.Chronology chronology9 = localDateTime8.getChronology();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withYear(53);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime1.minus(readablePeriod14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
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
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDate localDate28 = localDate25.withPeriodAdded(readablePeriod26, (int) (byte) -1);
        int int29 = localDate25.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = null;
        int int31 = localDate25.indexOf(dateTimeFieldType30);
        int int32 = localDate25.getYearOfCentury();
        int int33 = localDate25.getEra();
        org.joda.time.LocalDate localDate35 = localDate25.withYearOfEra(14);
        boolean boolean36 = localDate11.isEqual((org.joda.time.ReadablePartial) localDate35);
        org.joda.time.LocalDate localDate38 = localDate11.minusMonths(24208);
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
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2026 + "'", int29 == 2026);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 26 + "'", int32 == 26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(localDate38);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
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
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate19 = localDate16.withPeriodAdded(readablePeriod17, (int) (byte) -1);
        int int20 = localDate16.getYearOfEra();
        org.joda.time.LocalDate localDate22 = localDate16.plusDays(1970);
        org.joda.time.LocalDate localDate23 = localDate15.withFields((org.joda.time.ReadablePartial) localDate22);
        long long24 = localDate15.getLocalMillis();
        java.lang.String str25 = localDate15.toString();
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDate localDate29 = localDate26.withPeriodAdded(readablePeriod27, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight30 = localDate26.toDateMidnight();
        org.joda.time.LocalDate localDate32 = localDate26.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property33 = localDate32.weekyear();
        org.joda.time.ReadableInstant readableInstant34 = null;
        int int35 = property33.getDifference(readableInstant34);
        org.joda.time.LocalDate localDate36 = property33.withMinimumValue();
        int int37 = localDate15.compareTo((org.joda.time.ReadablePartial) localDate36);
        int int38 = localDate15.getDayOfYear();
        int int39 = localDate15.size();
        org.joda.time.LocalTime localTime40 = null;
        org.joda.time.DateTime dateTime41 = localDate15.toDateTime(localTime40);
        int int42 = property12.getDifference((org.joda.time.ReadableInstant) dateTime41);
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
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2026 + "'", int20 == 2026);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1790553600000L + "'", long24 == 1790553600000L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2026-09-28" + "'", str25, "2026-09-28");
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 271 + "'", int38 == 271);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        int int7 = localDate6.getDayOfMonth();
        int int8 = localDate6.getWeekyear();
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate12 = localDate9.withPeriodAdded(readablePeriod10, (int) (byte) -1);
        org.joda.time.LocalDate localDate14 = localDate9.plusWeeks(0);
        org.joda.time.LocalDate localDate16 = localDate14.withYear((int) ' ');
        org.joda.time.LocalDate localDate18 = localDate14.withYearOfCentury((int) (byte) 1);
        int int19 = localDate14.getDayOfMonth();
        int int20 = localDate14.getDayOfMonth();
        org.joda.time.LocalDate.Property property21 = localDate14.yearOfCentury();
        org.joda.time.LocalDate localDate23 = localDate14.plusMonths((int) '4');
        org.joda.time.LocalDate.Property property24 = localDate14.year();
        org.joda.time.Chronology chronology25 = property24.getChronology();
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDate localDate29 = localDate26.withPeriodAdded(readablePeriod27, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDate localDate31 = localDate26.minus(readablePeriod30);
        org.joda.time.DateTime dateTime32 = localDate31.toDateTimeAtMidnight();
        int int33 = property24.getDifference((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.LocalDate localDate34 = property24.withMinimumValue();
        boolean boolean35 = localDate6.equals((java.lang.Object) property24);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 28 + "'", int7 == 28);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2026 + "'", int8 == 2026);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 28 + "'", int19 == 28);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 28 + "'", int20 == 28);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
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
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYearOfEra(985);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 1);
        org.joda.time.LocalDate.Property property2 = localDate1.monthOfYear();
        int int3 = localDate1.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        int int6 = localDateTime5.getEra();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        int int9 = localDateTime8.getYearOfEra();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        int int11 = property10.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime13 = property10.addWrapFieldToCopy((int) 'a');
        int int14 = localDateTime13.getWeekyear();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) '4');
        int int17 = localDateTime16.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime26 = localDateTime16.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        java.util.Date date27 = localDateTime16.toDate();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) '4');
        int int30 = localDateTime29.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property31 = localDateTime29.dayOfYear();
        org.joda.time.LocalDateTime.Property property32 = localDateTime29.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime33 = property32.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property32.getFieldType();
        int int35 = localDateTime16.get(dateTimeFieldType34);
        boolean boolean36 = localDateTime13.isSupported(dateTimeFieldType34);
        org.joda.time.LocalDateTime.Property property37 = localDateTime5.property(dateTimeFieldType34);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime5);
        int int39 = localDateTime38.getDayOfWeek();
        org.joda.time.LocalDate localDate41 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDate localDate44 = localDate41.withPeriodAdded(readablePeriod42, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight45 = localDate41.toDateMidnight();
        org.joda.time.LocalDate localDate47 = localDate41.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property48 = localDate47.weekyear();
        org.joda.time.ReadableInstant readableInstant49 = null;
        int int50 = property48.getDifference(readableInstant49);
        org.joda.time.LocalDate localDate51 = property48.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate52 = property48.roundHalfEvenCopy();
        org.joda.time.Chronology chronology53 = property48.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField54 = localDateTime38.getField(70, chronology53);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 70");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(dateMidnight45);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertNotNull(chronology53);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
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
            org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(10, 32, 70, chronology21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
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
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) '4');
        int int6 = localDateTime5.getYearOfEra();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.minuteOfHour();
        int int8 = property7.getMaximumValue();
        org.joda.time.DateTimeField dateTimeField9 = property7.getField();
        java.lang.String str10 = property7.getAsText();
        org.joda.time.Chronology chronology11 = property7.getChronology();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(1798675200000L, chronology11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(54013758, 32, 5, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minusHours((int) 'a');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withYearOfCentury(9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime8.year();
        org.joda.time.LocalDateTime localDateTime13 = property11.addToCopy(28787742);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.DurationField durationField4 = property3.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.yearOfEra();
        org.joda.time.LocalDateTime localDateTime7 = property6.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime8 = property6.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property6.getFieldType();
        org.joda.time.LocalDateTime localDateTime10 = property6.roundHalfCeilingCopy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
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
        int int20 = localDateTime19.getMillisOfSecond();
        org.joda.time.DateTimeField dateTimeField22 = localDateTime19.getField(0);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
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
        int int15 = localDate12.getWeekyear();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2010 + "'", int15 == 2010);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("0001-01-01T00:00:00.000", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
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
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate19 = localDate16.withPeriodAdded(readablePeriod17, (int) (byte) -1);
        org.joda.time.LocalDate localDate21 = localDate16.plusWeeks(0);
        org.joda.time.LocalDate localDate23 = localDate21.withYear((int) ' ');
        org.joda.time.LocalDate.Property property24 = localDate21.monthOfYear();
        boolean boolean25 = property24.isLeap();
        org.joda.time.LocalDate localDate26 = property24.roundFloorCopy();
        org.joda.time.LocalDate localDate28 = localDate26.minusWeeks(4);
        long long29 = localDate26.getLocalMillis();
        org.joda.time.LocalDate localDate30 = localDate15.withFields((org.joda.time.ReadablePartial) localDate26);
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
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1788220800000L + "'", long29 == 1788220800000L);
        org.junit.Assert.assertNotNull(localDate30);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withWeekOfWeekyear((-3205));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3205 for weekOfWeekyear must be in the range [1,52]");
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
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        int int6 = localDate0.getDayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) int6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 271 + "'", int6 == 271);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withDate((-3205), 12, 55);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 55 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.minusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.LocalDate localDate5 = localDate2.withEra(0);
        org.joda.time.LocalDate localDate7 = localDate5.withLocalMillis((-61942060800000L));
        int int8 = localDate5.getDayOfMonth();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
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
        java.util.Locale locale17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = property14.setCopy("Property[minuteOfHour]", locale17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Property[minuteOfHour]\" for yearOfCentury is not supported");
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
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtCurrentTime();
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
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.minusMillis((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plus(readableDuration22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withWeekyear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.withYearOfCentury(8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = localDate0.isAfter((org.joda.time.ReadablePartial) localDateTime27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1970 + "'", int7 == 1970);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 28320052 + "'", int19 == 28320052);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
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
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime5.minus(readableDuration18);
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
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMinutes(31);
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.yearOfEra();
        int int15 = localDateTime11.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property16 = localDateTime11.year();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime11.withDayOfYear((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 70 + "'", int15 == 70);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property3.getAsShortText(locale7);
        boolean boolean9 = property3.isLeap();
        org.joda.time.LocalDateTime localDateTime11 = property3.addWrapFieldToCopy(0);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusMinutes(5232);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay(dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate0.year();
        org.joda.time.LocalDate localDate4 = property3.withMinimumValue();
        java.lang.String str5 = property3.getAsString();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026" + "'", str5, "2026");
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
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
        int int31 = localDateTime5.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property32 = localDateTime5.weekOfWeekyear();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 70 + "'", int31 == 70);
        org.junit.Assert.assertNotNull(property32);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 35, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withPeriodAdded(readablePeriod3, (int) ' ');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusDays(14);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
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
        org.joda.time.LocalDate localDate16 = localDate14.withWeekyear(53);
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
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate0.minus(readablePeriod4);
        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
        org.joda.time.LocalDate localDate7 = property6.roundHalfEvenCopy();
        boolean boolean9 = localDate7.equals((java.lang.Object) 'a');
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
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
        int int15 = localDate12.getDayOfMonth();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 28 + "'", int15 == 28);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMinutes(31);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) '4');
        int int16 = localDateTime15.getYearOfEra();
        org.joda.time.LocalDateTime.Property property17 = localDateTime15.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime19 = property17.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime20 = property17.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withYearOfEra(12);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) '4');
        int int25 = localDateTime24.getYearOfEra();
        org.joda.time.LocalDateTime.Property property26 = localDateTime24.minuteOfHour();
        int int27 = property26.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime29 = property26.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime30 = property26.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.dayOfMonth();
        org.joda.time.DurationField durationField32 = property31.getRangeDurationField();
        org.joda.time.Chronology chronology33 = property31.getChronology();
        org.joda.time.LocalDateTime localDateTime35 = property31.addToCopy(2026);
        java.lang.String str36 = property31.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property31.getFieldType();
        int int38 = localDateTime20.get(dateTimeFieldType37);
        int int39 = localDateTime13.get(dateTimeFieldType37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1970 + "'", int16 == 1970);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1970 + "'", int25 == 1970);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 59 + "'", int27 == 59);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "dayOfMonth" + "'", str36, "dayOfMonth");
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        int int10 = localDate5.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight11 = localDate5.toDateMidnight();
        org.joda.time.LocalDate.Property property12 = localDate5.year();
        org.joda.time.LocalDate localDate14 = localDate5.withCenturyOfEra(2001);
        org.joda.time.LocalDate localDate16 = localDate14.plusYears(70);
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
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, (-1));
        org.joda.time.LocalDate localDate10 = localDate0.withDayOfYear((int) '#');
        org.joda.time.Chronology chronology11 = localDate0.getChronology();
        org.joda.time.LocalDate localDate13 = localDate0.withYearOfEra(269);
        org.joda.time.LocalDate.Property property14 = localDate0.weekOfWeekyear();
        java.util.Locale locale16 = null;
        org.joda.time.LocalDate localDate17 = property14.setCopy("8", locale16);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
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
        java.util.Locale locale16 = null;
        java.lang.String str17 = property8.getAsShortText(locale16);
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
// flaky "9) test2433(org.joda.time.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u0e01\u0e22." + "'", str17, "\u0e01\u0e22.");
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        org.joda.time.LocalDateTime.Property property6 = localDateTime1.secondOfMinute();
        org.joda.time.DurationField durationField7 = property6.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property6.roundHalfFloorCopy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
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
        org.joda.time.LocalDate localDate16 = property13.roundFloorCopy();
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
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minusHours((int) 'a');
        java.util.Locale locale10 = null;
        java.lang.String str11 = localDateTime8.toString("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21", locale10);
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
        int int31 = localDateTime8.get(dateTimeFieldType30);
        int int32 = localDateTime8.getCenturyOfEra();
        int int33 = localDateTime8.getYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21" + "'", str11, "\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21");
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 19 + "'", int32 == 19);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1969 + "'", int33 == 1969);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
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
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime((long) '4');
        int int58 = localDateTime57.getYearOfEra();
        org.joda.time.LocalDateTime.Property property59 = localDateTime57.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime61 = property59.addToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateTime dateTime65 = localDateTime63.toDateTime(dateTimeZone64);
        long long66 = property59.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.DateTime dateTime67 = localDateTime54.toDateTime((org.joda.time.ReadableInstant) dateTime65);
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
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1970 + "'", int58 == 1970);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 420L + "'", long66 == 420L);
        org.junit.Assert.assertNotNull(dateTime67);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalTime localTime10 = null;
        org.joda.time.DateTime dateTime11 = localDate5.toDateTime(localTime10);
        org.joda.time.Chronology chronology12 = localDate5.getChronology();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime.Property property8 = localDateTime1.year();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime6 = property4.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withDayOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withMillisOfDay(7);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology3);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(chronology3);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
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
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.minusHours(521);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withDayOfMonth((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,28]");
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
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withTime((int) (byte) 1, (int) '#', (int) (short) 1, (int) (byte) 10);
        int int12 = localDateTime11.getMillisOfSecond();
        int int13 = localDateTime11.getSecondOfMinute();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate0.withPeriodAdded(readablePeriod6, (-1));
        org.joda.time.LocalDate localDate10 = localDate0.withDayOfYear((int) '#');
        org.joda.time.Chronology chronology11 = localDate0.getChronology();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate3 = localDate1.minusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology4 = localDate3.getChronology();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 24208, chronology4);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(chronology4);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withLocalMillis((long) (-1));
        org.joda.time.LocalDate.Property property9 = localDate8.dayOfWeek();
        org.joda.time.LocalDate localDate10 = property9.roundCeilingCopy();
        org.joda.time.DurationFieldType durationFieldType11 = null;
        boolean boolean12 = localDate10.isSupported(durationFieldType11);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
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
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfWeek();
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
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property25.getFieldType();
        org.joda.time.LocalDateTime localDateTime27 = property25.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withCenturyOfEra(1);
        org.joda.time.DateTime dateTime30 = localDateTime29.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime34 = localDateTime29.withDate(2922789, 2058, 40);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2058 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.centuryOfEra();
        java.lang.String str10 = property9.toString();
        int int11 = property9.getLeapAmount();
        java.lang.String str12 = property9.toString();
        org.joda.time.LocalDateTime localDateTime14 = property9.setCopy(7);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minus(readableDuration15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) '4');
        int int22 = localDateTime21.getYearOfEra();
        org.joda.time.LocalDateTime.Property property23 = localDateTime21.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime25 = property23.addToCopy((int) '4');
        org.joda.time.Chronology chronology26 = property23.getChronology();
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now(chronology26);
        org.joda.time.DateTimeField dateTimeField28 = localDateTime14.getField(0, chronology26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(251980, 251980, 0, 54013758, 0, (-1), 251980, chronology26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54013758 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Property[centuryOfEra]" + "'", str10, "Property[centuryOfEra]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[centuryOfEra]" + "'", str12, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1970 + "'", int22 == 1970);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTimeField28);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
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
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.withMillisOfSecond((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((-2026), 7, 18, 33, 1964, 244);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 33 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("centuryOfEra", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 25);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withSecondOfMinute(10);
        int int4 = localDateTime3.getMinuteOfHour();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("1970-09-28");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = localDate1.getValue(244);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 244");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
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
        org.joda.time.LocalDateTime.Property property18 = localDateTime2.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime19 = property18.roundCeilingCopy();
        java.util.Locale locale20 = null;
        java.lang.String str21 = property18.getAsShortText(locale20);
        int int22 = property18.getMinimumValueOverall();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "70" + "'", str21, "70");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
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
        org.joda.time.LocalDate localDate18 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDate localDate21 = localDate18.withPeriodAdded(readablePeriod19, (int) (byte) -1);
        int int22 = localDate18.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        int int24 = localDate18.indexOf(dateTimeFieldType23);
        org.joda.time.LocalDate localDate26 = localDate18.withWeekyear((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDate localDate29 = localDate18.withPeriodAdded(readablePeriod27, 59);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateMidnight dateMidnight31 = localDate18.toDateMidnight(dateTimeZone30);
        org.joda.time.Chronology chronology32 = localDate18.getChronology();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(chronology32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField34 = localDate13.getField(652, chronology32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 652");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2026 + "'", int22 == 2026);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(dateMidnight31);
        org.junit.Assert.assertNotNull(chronology32);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.weekyear();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = property7.getDifference(readableInstant8);
        org.joda.time.LocalDate localDate10 = property7.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate10.toDateTimeAtStartOfDay(dateTimeZone11);
        org.joda.time.LocalDate.Property property13 = localDate10.weekOfWeekyear();
        org.joda.time.LocalDate localDate15 = property13.addWrapFieldToCopy(0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
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
        int int13 = property7.getMinimumValueOverall();
        org.joda.time.LocalDate localDate14 = property7.roundCeilingCopy();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026" + "'", str8, "2026");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-292275054) + "'", int13 == (-292275054));
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfDay(2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusYears(53);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDateTime10.toDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime10.era();
        org.joda.time.DateTimeField dateTimeField15 = property14.getField();
        org.joda.time.LocalDateTime.Property property16 = new org.joda.time.LocalDateTime.Property(localDateTime8, dateTimeField15);
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate20 = localDate17.withPeriodAdded(readablePeriod18, (int) (byte) -1);
        int int21 = localDate17.getYearOfEra();
        int int22 = localDate17.getDayOfWeek();
        org.joda.time.LocalDate localDate24 = localDate17.withDayOfYear(100);
        org.joda.time.LocalDate localDate26 = localDate24.minusWeeks(0);
        int int27 = localDate24.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = localDate24.toDateTimeAtCurrentTime(dateTimeZone28);
        // The following exception was thrown during execution in test generation
        try {
            long long30 = property16.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2026 + "'", int21 == 2026);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20 + "'", int27 == 20);
        org.junit.Assert.assertNotNull(dateTime29);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        org.joda.time.LocalDate localDate6 = localDate1.plusWeeks(0);
        org.joda.time.LocalDate localDate8 = localDate6.withYear((int) ' ');
        org.joda.time.LocalDate.Property property9 = localDate6.monthOfYear();
        org.joda.time.LocalDate.Property property10 = localDate6.year();
        org.joda.time.LocalDate.Property property11 = localDate6.dayOfMonth();
        org.joda.time.LocalDate localDate12 = property11.roundCeilingCopy();
        org.joda.time.LocalDate localDate14 = localDate12.withDayOfYear(32);
        org.joda.time.Chronology chronology15 = localDate12.getChronology();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 2001, chronology15);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
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
        org.joda.time.DateTime dateTime14 = localDate11.toDateTimeAtMidnight();
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
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
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
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localDateTime9.toDateTime(dateTimeZone20);
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
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withMillisOfSecond(59);
        int int7 = localDateTime6.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.minuteOfHour();
        int int9 = property8.getMinimumValue();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
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
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) '4');
        int int22 = localDateTime21.getYearOfEra();
        org.joda.time.LocalDateTime.Property property23 = localDateTime21.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime25 = property23.addToCopy((int) '4');
        org.joda.time.Chronology chronology26 = property23.getChronology();
        java.util.Locale locale27 = null;
        java.lang.String str28 = property23.getAsShortText(locale27);
        org.joda.time.LocalDateTime localDateTime29 = property23.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) '4');
        int int33 = localDateTime32.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime32.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime40 = localDateTime32.withFields((org.joda.time.ReadablePartial) localDateTime39);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) '4');
        int int43 = localDateTime42.getYearOfEra();
        org.joda.time.LocalDateTime.Property property44 = localDateTime42.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime46 = property44.addToCopy((int) '4');
        org.joda.time.Chronology chronology47 = property44.getChronology();
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime32, chronology47);
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(chronology47);
        org.joda.time.DateTimeField dateTimeField50 = localDateTime29.getField(0, chronology47);
        org.joda.time.LocalDateTime.Property property51 = localDateTime29.millisOfDay();
        int int52 = property51.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime53 = property51.roundHalfCeilingCopy();
        boolean boolean54 = localDateTime5.isAfter((org.joda.time.ReadablePartial) localDateTime53);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1970 + "'", int22 == 1970);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0" + "'", str28, "0");
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1970 + "'", int43 == 1970);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("2026-09-28");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField3 = localDate1.getField(36526);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 36526");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
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
        long long20 = property19.remainder();
        int int21 = property19.getMinimumValue();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDate localDate26 = localDate23.withPeriodAdded(readablePeriod24, (int) (byte) -1);
        int int27 = localDate23.getYearOfEra();
        org.joda.time.LocalDate localDate29 = localDate23.plusDays(1970);
        org.joda.time.LocalDate localDate30 = localDate22.withFields((org.joda.time.ReadablePartial) localDate29);
        org.joda.time.LocalDate.Property property31 = localDate29.monthOfYear();
        java.lang.String str32 = property31.getAsShortText();
        org.joda.time.LocalDate localDate33 = property31.roundHalfFloorCopy();
        java.util.Locale locale34 = null;
        int int35 = property31.getMaximumShortTextLength(locale34);
        org.joda.time.LocalDate localDate37 = property31.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.LocalDate localDate38 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalDate localDate41 = localDate38.withPeriodAdded(readablePeriod39, (int) (byte) -1);
        int int42 = localDate38.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = null;
        int int44 = localDate38.indexOf(dateTimeFieldType43);
        int int45 = localDate38.getYearOfCentury();
        int int46 = localDate38.getEra();
        org.joda.time.LocalDate localDate48 = localDate38.withYearOfEra(14);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = localDate48.toDateTimeAtCurrentTime(dateTimeZone49);
        int int51 = property31.getDifference((org.joda.time.ReadableInstant) dateTime50);
        int int52 = property19.compareTo((org.joda.time.ReadableInstant) dateTime50);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1384128000000L) + "'", long20 == (-1384128000000L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2026 + "'", int27 == 2026);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(property31);
// flaky "10) test2466(org.joda.time.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u0e01\u0e1e." + "'", str32, "\u0e01\u0e1e.");
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2026 + "'", int42 == 2026);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 26 + "'", int45 == 26);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 24208 + "'", int51 == 24208);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
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
        org.joda.time.LocalDate localDate28 = property15.roundHalfFloorCopy();
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
        org.junit.Assert.assertNotNull(localDate28);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minus(readablePeriod6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime9 = property8.withMaximumValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundCeilingCopy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusMonths((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minus(readablePeriod10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.yearOfCentury();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = property8.setCopy("2026-09-28T15:00:09.837");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2026-09-28T15:00:09.837\" for dayOfMonth is not supported");
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
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) (short) 100, 69, 59, 8, 1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
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
        int int16 = localDate11.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = localDate11.withWeekOfWeekyear((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for weekOfWeekyear must be in the range [1,52]");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5232 + "'", int14 == 5232);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate9 = property7.addWrapFieldToCopy((int) (short) 1);
        org.joda.time.LocalDate localDate10 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate12 = localDate10.withYearOfCentury(25);
        org.joda.time.LocalDate.Property property13 = localDate12.dayOfYear();
        java.lang.String str15 = localDate12.toString("2032-02-19");
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2032-02-19" + "'", str15, "2032-02-19");
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("0");
        org.joda.time.ReadablePartial readablePartial2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.withFields(readablePartial2);
        org.joda.time.LocalDate localDate5 = localDate1.minusMonths(3);
        int int6 = localDate1.getDayOfWeek();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        int int4 = localDate0.getYearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.plusDays(1970);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = localDate0.toDateMidnight(dateTimeZone8);
        int int10 = localDate0.getWeekyear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2026 + "'", int10 == 2026);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(2032, 1, 1964);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1964 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusDays((-1));
        int int8 = localDateTime7.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfMonth(19);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withPeriodAdded(readablePeriod5, 3);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withPeriodAdded(readablePeriod8, 2025);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
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
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.minus(readablePeriod15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
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
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.hourOfDay();
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
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plus(readablePeriod6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withWeekOfWeekyear(1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withWeekyear((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withLocalMillis(1790553600000L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime1.withSecondOfMinute(1964);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1964 for secondOfMinute must be in the range [0,59]");
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
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((int) '4');
        org.joda.time.Chronology chronology6 = property3.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusMonths((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField11 = localDateTime7.getField(1969);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 1969");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        int int7 = property3.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime8 = property3.roundHalfFloorCopy();
        int int9 = localDateTime8.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
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
        int int14 = localDate10.getEra();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2026 + "'", int4 == 2026);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
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
        org.joda.time.LocalDate.Property property28 = localDate27.year();
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
        org.junit.Assert.assertNotNull(property28);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
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
        boolean boolean19 = property17.isLeap();
        java.lang.String str20 = property17.getAsShortText();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "26" + "'", str20, "26");
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
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
        int int29 = localDate28.getDayOfMonth();
        org.joda.time.DateTimeField[] dateTimeFieldArray30 = localDate28.getFields();
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
        org.junit.Assert.assertNotNull(dateTimeFieldArray30);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        int int2 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.minuteOfHour();
        int int4 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.plusWeeks(52);
        org.joda.time.LocalDateTime.Property property11 = localDateTime7.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.plus(readableDuration12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear(4);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfYear();
        org.joda.time.DurationField durationField8 = property7.getDurationField();
        java.lang.String str9 = property7.getAsText();
        int int10 = property7.getLeapAmount();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "271" + "'", str9, "271");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, (int) (byte) -1);
        int int5 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.plusDays(1970);
        org.joda.time.LocalDate localDate8 = localDate0.withFields((org.joda.time.ReadablePartial) localDate7);
        long long9 = localDate0.getLocalMillis();
        java.lang.String str10 = localDate0.toString();
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate14 = localDate11.withPeriodAdded(readablePeriod12, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight15 = localDate11.toDateMidnight();
        org.joda.time.LocalDate localDate17 = localDate11.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property18 = localDate17.weekyear();
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = property18.getDifference(readableInstant19);
        org.joda.time.LocalDate localDate21 = property18.withMinimumValue();
        int int22 = localDate0.compareTo((org.joda.time.ReadablePartial) localDate21);
        int int23 = localDate0.getDayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType25 = localDate0.getFieldType(41);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 41");
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
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 271 + "'", int23 == 271);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        int int6 = localDateTime1.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.plusMillis(2058);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("9");
        int int2 = localDateTime1.getWeekyear();
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
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
        org.joda.time.DurationFieldType durationFieldType16 = null;
        boolean boolean17 = localDateTime13.isSupported(durationFieldType16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
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
        int int32 = localDate17.getDayOfYear();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 28 + "'", int32 == 28);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
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
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusHours(31140052);
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
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
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
        org.joda.time.DateTimeField[] dateTimeFieldArray15 = localDate13.getFields();
        int int16 = localDate13.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeFieldArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
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
        org.joda.time.LocalDate localDate14 = property9.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2026 + "'", int5 == 2026);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
// flaky "11) test2499(org.joda.time.RegressionTest4)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u0e01\u0e1e." + "'", str13, "\u0e01\u0e1e.");
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
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
        org.joda.time.Chronology chronology17 = localDate15.getChronology();
        org.joda.time.DateTime dateTime18 = localDate15.toDateTimeAtCurrentTime();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 25 + "'", int16 == 25);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTime18);
    }
}
