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
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.fieldDifference(readablePartial0, readablePartial1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.joda.time.Chronology chronology1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = new org.joda.time.Period((java.lang.Object) 100.0f, chronology1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("PT0S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("PT0.068S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = new org.joda.time.Period(readablePartial0, readablePartial1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (byte) 1, (int) '#', (int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        org.joda.time.Weeks weeks5 = period4.toStandardWeeks();
        org.joda.time.Period period6 = period4.toPeriod();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType8 = period4.getFieldType((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.plusYears((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = period4.withField(durationFieldType7, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType2, chronology3);
        java.lang.String str5 = period4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType7 = period4.getFieldType((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT0.068S" + "'", str5, "PT0.068S");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        org.joda.time.DurationFieldType[] durationFieldTypeArray8 = period1.getFieldTypes();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period1.toDurationTo(readableInstant9);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(durationFieldTypeArray8);
        org.junit.Assert.assertNotNull(duration10);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.withMillis((int) (short) 1);
        org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) period4);
        java.lang.Class<?> wildcardClass8 = period4.getClass();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.minusYears((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period6 = period3.withField(durationFieldType4, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = new org.joda.time.Period((java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        org.joda.time.DurationFieldType[] durationFieldTypeArray8 = period1.getFieldTypes();
        org.joda.time.Hours hours9 = period1.toStandardHours();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(durationFieldTypeArray8);
        org.junit.Assert.assertNotNull(hours9);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        org.joda.time.Hours hours5 = period4.toStandardHours();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period4.toDurationTo(readableInstant6);
        java.lang.Class<?> wildcardClass8 = period4.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        org.joda.time.Period period6 = period4.withWeeks(0);
        int int8 = period6.getValue((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = period6.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.Period period13 = period9.plusYears((int) (byte) 10);
        org.joda.time.Period period14 = period13.normalizedStandard();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = period13.getValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period2 = period1.negated();
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = period2.get(durationFieldType3);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 10, periodType1);
        java.lang.String str3 = period2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0.010S" + "'", str3, "PT0.010S");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) 1, (long) 'a', periodType2, chronology3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = period4.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        org.joda.time.Weeks weeks8 = period1.toStandardWeeks();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(weeks8);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        org.joda.time.Weeks weeks5 = period4.toStandardWeeks();
        org.joda.time.Period period6 = period4.toPeriod();
        java.lang.Class<?> wildcardClass7 = period4.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(0);
        int int2 = period1.size();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.minusYears((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType4 = null;
        int int5 = period1.get(durationFieldType4);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = period1.getValue(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        org.joda.time.DurationFieldType[] durationFieldTypeArray8 = period1.getFieldTypes();
        java.lang.Class<?> wildcardClass9 = period1.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(durationFieldTypeArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
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
        org.joda.time.Period period16 = period14.plusMinutes(1);
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
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType2, chronology3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        java.lang.Class<?> wildcardClass7 = period4.getClass();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) (byte) 10);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks2 = period1.toStandardWeeks();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Weeks as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        int int10 = period9.getMillis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days11 = period9.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        int int1 = period0.getHours();
        org.joda.time.Period period3 = period0.multipliedBy((-1));
        int int4 = period0.getYears();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period24 = new org.joda.time.Period((java.lang.Object) (byte) 10, periodType18, chronology23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(period22);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        int int5 = period4.size();
        org.joda.time.Minutes minutes6 = period4.toStandardMinutes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertNotNull(minutes6);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.joda.time.Period period2 = new org.joda.time.Period(10L, (long) (short) 10);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.minusMillis((int) (short) 0);
        org.joda.time.Period period5 = org.joda.time.Period.minutes((int) (byte) 0);
        org.joda.time.Period period7 = period5.withSeconds((-1));
        org.joda.time.Period period8 = period3.minus((org.joda.time.ReadablePeriod) period7);
        int int9 = period3.getMillis();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableDuration6, readableInstant7, periodType8);
        org.joda.time.PeriodType periodType10 = period9.getPeriodType();
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant4, readableInstant5, periodType10);
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.withYears((int) (short) 10);
        int int7 = period4.size();
        int int8 = period4.getWeeks();
        int int9 = period4.getSeconds();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
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
        java.lang.String str20 = period3.toString();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PT0.100S" + "'", str20, "PT0.100S");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.joda.time.Period period1 = org.joda.time.Period.millis(1);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.joda.time.Period period4 = new org.joda.time.Period((int) '#', (int) (short) 0, (int) (byte) 0, (int) (byte) 0);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.joda.time.Period period4 = new org.joda.time.Period((-1), (int) (short) 100, (int) (short) 0, (int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        java.lang.Class<?> wildcardClass7 = period4.getClass();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period20 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration15 = period14.toStandardDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Duration as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
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
        org.joda.time.Hours hours20 = period19.toStandardHours();
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
        org.junit.Assert.assertNotNull(hours20);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period11, periodType12);
        org.joda.time.Period period15 = period13.withHours((int) 'a');
        org.joda.time.Period period17 = period13.withMonths(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType19 = period17.getFieldType((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        int[] intArray5 = period4.getValues();
        org.joda.time.Period period7 = period4.minusMinutes((int) '#');
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
        int int47 = period4.indexOf(durationFieldType42);
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period(readableDuration56, readableInstant57, periodType58);
        org.joda.time.PeriodType periodType60 = period59.getPeriodType();
        org.joda.time.Period period61 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType60);
        org.joda.time.Chronology chronology62 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period63 = new org.joda.time.Period((java.lang.Object) int47, periodType60, chronology62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(period7);
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
        org.junit.Assert.assertNotNull(periodType60);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        int int8 = period7.getMinutes();
        java.lang.String str9 = period7.toString();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT100H" + "'", str9, "PT100H");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = period1.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period11, periodType12);
        org.joda.time.Period period15 = period13.withHours((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days16 = period15.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (byte) 10, (int) (byte) 100, (int) '#', (int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.DurationFieldType durationFieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = period4.withField(durationFieldType7, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration6);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        int int1 = period0.getHours();
        org.joda.time.Period period3 = period0.multipliedBy((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType5 = period3.getFieldType((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("hi!", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) '#', periodType2);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds29 = period28.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Seconds as this period contains months and months vary in length");
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
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(10);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.joda.time.Period period1 = new org.joda.time.Period((long) ' ');
        org.joda.time.Period period10 = new org.joda.time.Period((-1), (int) (byte) 10, 8, 1, (int) (byte) 10, 10, (int) (byte) 1, 1);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableDuration11, readableInstant12, periodType13);
        org.joda.time.PeriodType periodType15 = period14.getPeriodType();
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) 10, periodType17);
        org.joda.time.Period period20 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period22 = period20.withMillis((int) (byte) 100);
        org.joda.time.Period period23 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period23.toDurationTo(readableInstant24);
        org.joda.time.Period period27 = period23.plusHours((-1));
        int int28 = period27.getSeconds();
        org.joda.time.Period period29 = period22.withFields((org.joda.time.ReadablePeriod) period27);
        int int30 = period27.getHours();
        org.joda.time.Period period31 = period18.minus((org.joda.time.ReadablePeriod) period27);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant32, readableDuration33);
        org.joda.time.Period period36 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period38 = period36.minusYears((int) (byte) -1);
        org.joda.time.Period period39 = period34.withFields((org.joda.time.ReadablePeriod) period36);
        org.joda.time.Period period41 = period36.withMinutes((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Duration duration43 = period41.toDurationTo(readableInstant42);
        org.joda.time.Period period44 = period18.withFields((org.joda.time.ReadablePeriod) period41);
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType47, chronology48);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = period49.toDurationFrom(readableInstant50);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant52, readableDuration53);
        org.joda.time.Period period56 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period58 = period56.minusYears((int) (byte) -1);
        org.joda.time.Period period59 = period54.withFields((org.joda.time.ReadablePeriod) period56);
        org.joda.time.Period period61 = period56.withMinutes((int) (short) -1);
        org.joda.time.Period period62 = period49.plus((org.joda.time.ReadablePeriod) period61);
        org.joda.time.Period period64 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period66 = period64.withMillis((int) (byte) 100);
        org.joda.time.Period period67 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.Duration duration69 = period67.toDurationTo(readableInstant68);
        org.joda.time.Period period71 = period67.plusHours((-1));
        int int72 = period71.getSeconds();
        org.joda.time.Period period73 = period66.withFields((org.joda.time.ReadablePeriod) period71);
        org.joda.time.PeriodType periodType82 = null;
        org.joda.time.Period period83 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType82);
        org.joda.time.Period period85 = period83.withMillis((int) (short) 10);
        org.joda.time.Period period87 = period83.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType89 = period83.getFieldType((int) (short) 1);
        org.joda.time.Period period91 = period66.withField(durationFieldType89, 100);
        boolean boolean92 = period49.isSupported(durationFieldType89);
        org.joda.time.Period period94 = period44.withField(durationFieldType89, 35);
        org.joda.time.Period period96 = period14.withFieldAdded(durationFieldType89, 8);
        org.joda.time.Period period98 = period10.withField(durationFieldType89, 1);
        int int99 = period1.indexOf(durationFieldType89);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNotNull(durationFieldType89);
        org.junit.Assert.assertNotNull(period91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(period94);
        org.junit.Assert.assertNotNull(period96);
        org.junit.Assert.assertNotNull(period98);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 1 + "'", int99 == 1);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.joda.time.Period period1 = org.joda.time.Period.weeks(8);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) '#');
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) 1, 0, (int) (byte) 100, 0, 0, (int) (byte) 1, (int) (short) 10, 0);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableDuration10, readableInstant11, periodType12);
        org.joda.time.PeriodType periodType14 = period13.getPeriodType();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) (byte) 10, periodType14, chronology15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period17 = new org.joda.time.Period((java.lang.Object) (short) 1, periodType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType14);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
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
        org.joda.time.Period period21 = new org.joda.time.Period((long) ' ', (long) (byte) 1, periodType20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) ' ', (long) (byte) -1, periodType20, chronology22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period24 = new org.joda.time.Period((java.lang.Object) 1.0d, periodType20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        int int8 = period7.getMinutes();
        org.joda.time.Period period10 = period7.withWeeks((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationFrom(readableInstant11);
        org.joda.time.Period period13 = period10.normalizedStandard();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) 'a');
        int int2 = period1.getMillis();
        org.joda.time.Period period4 = period1.withWeeks((int) (byte) 100);
        int int5 = period1.getYears();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        org.joda.time.Weeks weeks5 = period4.toStandardWeeks();
        org.joda.time.Period period7 = period4.minusDays(100);
        org.joda.time.format.PeriodFormatter periodFormatter8 = null;
        java.lang.String str9 = period4.toString(periodFormatter8);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT0S" + "'", str9, "PT0S");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
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
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((java.lang.Object) weeks13, chronology14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period17 = period15.minusMinutes(10);
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
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(weeks13);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
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
        org.joda.time.Period period18 = period2.withFields((org.joda.time.ReadablePeriod) period17);
        int int19 = period17.getWeeks();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("PT100H", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.Period period13 = period9.plusYears((int) (byte) 10);
        org.joda.time.Period period15 = period13.withHours((int) (short) 1);
        int int16 = period15.getMinutes();
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationTo(readableInstant4);
        boolean boolean6 = period2.equals((java.lang.Object) duration5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration5, readableInstant7);
        org.joda.time.Period period9 = period8.toPeriod();
        org.joda.time.DurationFieldType durationFieldType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = period9.withFieldAdded(durationFieldType10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        int int1 = period0.getHours();
        org.joda.time.Period period3 = period0.multipliedBy((-1));
        org.joda.time.Period period5 = period0.plusHours((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType7 = period5.getFieldType((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
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
        java.lang.Class<?> wildcardClass40 = period39.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        org.joda.time.Weeks weeks5 = period4.toStandardWeeks();
        org.joda.time.Period period6 = period4.toPeriod();
        org.joda.time.Period period8 = period6.withWeeks((int) (short) 10);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        org.joda.time.Weeks weeks5 = period4.toStandardWeeks();
        org.joda.time.Period period6 = period4.toPeriod();
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((java.lang.Object) period6, periodType7);
        org.joda.time.Period period10 = period8.plusHours(8);
        int int11 = period10.getMinutes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 0);
        org.joda.time.Period period3 = period1.withSeconds((-1));
        int int4 = period1.getMillis();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.Period period13 = period9.plusYears((int) (byte) 10);
        org.joda.time.Period period14 = period13.normalizedStandard();
        int int15 = period13.getMinutes();
        org.joda.time.Period period17 = period13.withMonths((int) (byte) 100);
        int[] intArray18 = period13.getValues();
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 20, 32, (-1), 0, 35, 100, 10, 1 });
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.minusYears((int) (byte) -1);
        org.joda.time.Chronology chronology4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) (byte) -1, chronology4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) -1, (long) 8, chronology2);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) 'a');
        int int2 = period1.getMillis();
        org.joda.time.Period period4 = period1.withWeeks((int) (byte) 100);
        int int5 = period1.size();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) (short) 1);
        org.joda.time.Chronology chronology2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period3 = new org.joda.time.Period((java.lang.Object) (short) 1, chronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period11, periodType12);
        org.joda.time.Period period15 = period11.withMonths(0);
        org.joda.time.Period period17 = period15.minusWeeks((int) (short) -1);
        int int18 = period15.getMonths();
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period3.plusSeconds((int) ' ');
        int[] intArray6 = period3.getValues();
        org.joda.time.Period period8 = period3.withMonths(1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((java.lang.Object) period8, chronology9);
        int int11 = period10.getYears();
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableDuration22, readableInstant23, periodType24);
        org.joda.time.PeriodType periodType26 = period25.getPeriodType();
        org.joda.time.Period period27 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType26);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant12, readableInstant13, periodType26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period29 = new org.joda.time.Period((java.lang.Object) int11, periodType26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 100 });
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(periodType26);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT-1S");
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
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
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((java.lang.Object) weeks13, chronology14);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = period15.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusDays((int) (byte) 10);
        org.joda.time.Period period6 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period7 = period6.negated();
        org.joda.time.PeriodType periodType8 = period7.getPeriodType();
        org.joda.time.Period period9 = new org.joda.time.Period((java.lang.Object) period4, periodType8);
        int[] intArray10 = period4.getValues();
        org.joda.time.Period period12 = period4.plusMonths(1);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 10, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.plusYears((int) (short) -1);
        org.joda.time.Period period8 = period4.plusMillis((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int10 = period8.getValue(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period3.plusSeconds((int) ' ');
        int[] intArray6 = period3.getValues();
        org.joda.time.Period period8 = period3.withMonths(1);
        java.lang.String str9 = period3.toString();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 100 });
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT0.100S" + "'", str9, "PT0.100S");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        org.joda.time.Weeks weeks5 = period4.toStandardWeeks();
        org.joda.time.Period period6 = period4.toPeriod();
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((java.lang.Object) period6, periodType7);
        org.joda.time.Period period10 = period8.plusHours(8);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableDuration15, readableInstant16, periodType17);
        org.joda.time.PeriodType periodType19 = period18.getPeriodType();
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant13, readableInstant14, periodType19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) (byte) -1, (long) (byte) 1, periodType19, chronology21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((java.lang.Object) period10, periodType19, chronology23);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Chronology chronology26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period27 = new org.joda.time.Period((java.lang.Object) periodType19, periodType25, chronology26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(periodType19);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
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
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((java.lang.Object) weeks13, chronology14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period17 = period15.minusSeconds((int) 'a');
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
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(weeks13);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 0);
        int int2 = period1.getDays();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableDuration12, readableInstant13, periodType14);
        org.joda.time.PeriodType periodType16 = period15.getPeriodType();
        org.joda.time.Period period17 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType16);
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period19 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.withYears((int) (short) 10);
        org.joda.time.Period period8 = period4.withDays((int) (short) 100);
        org.joda.time.Period period10 = period4.plusMillis((int) (short) -1);
        int int11 = period10.getMillis();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Weeks weeks2 = period1.toStandardWeeks();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(weeks2);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.joda.time.Period period1 = new org.joda.time.Period((-1L));
        // The following exception was thrown during execution in test generation
        try {
            int int3 = period1.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("PT-1S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        int int8 = period7.getMinutes();
        org.joda.time.Period period10 = period7.withMinutes(0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((java.lang.Object) period7, chronology11);
        org.joda.time.Seconds seconds13 = period7.toStandardSeconds();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(seconds13);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) (short) 10);
        org.joda.time.DurationFieldType durationFieldType2 = null;
        int int3 = period1.indexOf(durationFieldType2);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.joda.time.Period period1 = org.joda.time.Period.years(8);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) '#');
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 1, periodType1, chronology2);
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks5 = period4.toStandardWeeks();
        org.joda.time.Period period6 = period3.plus((org.joda.time.ReadablePeriod) period4);
        java.lang.Class<?> wildcardClass7 = period6.getClass();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.minusMinutes((-1));
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableDuration12, readableInstant13, periodType14);
        org.joda.time.PeriodType periodType16 = period15.getPeriodType();
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((long) 10, periodType18);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period23 = period21.withMillis((int) (byte) 100);
        org.joda.time.Period period24 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period24.toDurationTo(readableInstant25);
        org.joda.time.Period period28 = period24.plusHours((-1));
        int int29 = period28.getSeconds();
        org.joda.time.Period period30 = period23.withFields((org.joda.time.ReadablePeriod) period28);
        int int31 = period28.getHours();
        org.joda.time.Period period32 = period19.minus((org.joda.time.ReadablePeriod) period28);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant33, readableDuration34);
        org.joda.time.Period period37 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period39 = period37.minusYears((int) (byte) -1);
        org.joda.time.Period period40 = period35.withFields((org.joda.time.ReadablePeriod) period37);
        org.joda.time.Period period42 = period37.withMinutes((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Duration duration44 = period42.toDurationTo(readableInstant43);
        org.joda.time.Period period45 = period19.withFields((org.joda.time.ReadablePeriod) period42);
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
        org.joda.time.Period period95 = period45.withField(durationFieldType90, 35);
        org.joda.time.Period period97 = period15.withFieldAdded(durationFieldType90, 8);
        org.joda.time.Period period99 = period11.withField(durationFieldType90, 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(period45);
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
        org.junit.Assert.assertNotNull(period97);
        org.junit.Assert.assertNotNull(period99);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.joda.time.Period period1 = org.joda.time.Period.hours(100);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = period1.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.joda.time.Period period1 = org.joda.time.Period.months(0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.Period period8 = period4.plusHours((-1));
        int int9 = period8.getSeconds();
        org.joda.time.Period period10 = period3.withFields((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period12 = period10.withMonths(1);
        org.joda.time.format.PeriodFormatter periodFormatter13 = null;
        java.lang.String str14 = period10.toString(periodFormatter13);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT-1H" + "'", str14, "PT-1H");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (short) -1);
        int int2 = period1.getMillis();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.joda.time.Period period2 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period4 = period2.minusYears((int) (byte) -1);
        org.joda.time.Duration duration5 = period2.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableDuration9, readableInstant10, periodType11);
        org.joda.time.PeriodType periodType13 = period12.getPeriodType();
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant7, readableInstant8, periodType13);
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration5, readableInstant6, periodType13);
        org.joda.time.Period period16 = new org.joda.time.Period((long) 0, periodType13);
        org.joda.time.Chronology chronology17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period18 = new org.joda.time.Period((java.lang.Object) periodType13, chronology17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(periodType13);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (short) 100, 10, (int) ' ', (int) (byte) 1);
        int[] intArray5 = period4.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = period4.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 0, 0, 0, 100, 10, 32, 1 });
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period2 = period1.negated();
        org.joda.time.Weeks weeks3 = period1.toStandardWeeks();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(weeks3);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
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
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration16, readableInstant17);
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
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((-1));
        java.lang.Class<?> wildcardClass2 = period1.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
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
        org.joda.time.Period period23 = period21.plusDays((int) 'a');
        java.lang.Class<?> wildcardClass24 = period23.getClass();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.Period period13 = period9.plus(readablePeriod12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration14 = period13.toStandardDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Duration as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
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
        org.joda.time.Hours hours17 = period16.toStandardHours();
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(hours17);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) 10, periodType3);
        org.joda.time.Period period6 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period8 = period6.withMillis((int) (byte) 100);
        org.joda.time.Period period9 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationTo(readableInstant10);
        org.joda.time.Period period13 = period9.plusHours((-1));
        int int14 = period13.getSeconds();
        org.joda.time.Period period15 = period8.withFields((org.joda.time.ReadablePeriod) period13);
        int int16 = period13.getHours();
        org.joda.time.Period period17 = period4.minus((org.joda.time.ReadablePeriod) period13);
        org.joda.time.PeriodType periodType18 = period13.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period19 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(periodType18);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) (byte) 100);
        org.joda.time.Period period2 = period1.normalizedStandard();
        org.joda.time.DurationFieldType[] durationFieldTypeArray3 = period2.getFieldTypes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(durationFieldTypeArray3);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) 10);
        org.joda.time.Period period3 = period1.plusWeeks(0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.PeriodType periodType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period3 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(0L, 1L, chronology2);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = period1.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
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
        org.joda.time.Period period23 = period21.minusSeconds(100);
        int int24 = period21.size();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
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
        org.joda.time.Period period22 = period19.withYears((int) (byte) 100);
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
        org.junit.Assert.assertNotNull(period22);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period7 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period8 = period7.negated();
        org.joda.time.PeriodType periodType9 = period8.getPeriodType();
        org.joda.time.Period period10 = new org.joda.time.Period((long) '4', (long) (short) 0, periodType9);
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration2, readableInstant3, periodType9);
        org.joda.time.Seconds seconds12 = period11.toStandardSeconds();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(seconds12);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period2 = period0.plusHours(100);
        org.joda.time.format.PeriodFormatter periodFormatter3 = null;
        java.lang.String str4 = period2.toString(periodFormatter3);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT100H" + "'", str4, "PT100H");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) (byte) 0);
        int int2 = period1.getMonths();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((-1));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationTo(readableInstant4);
        boolean boolean6 = period2.equals((java.lang.Object) duration5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration5, readableInstant7);
        org.joda.time.Period period9 = period8.toPeriod();
        org.joda.time.Days days10 = period9.toStandardDays();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(days10);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) ' ', 0, (int) (short) 100, 100, (int) (byte) 10, 100, (-1), (int) (short) 100, periodType8);
        org.joda.time.Period period11 = period9.minusYears((int) '#');
        org.joda.time.DurationFieldType[] durationFieldTypeArray12 = period11.getFieldTypes();
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldTypeArray12);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.plusYears((int) '#');
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) 10, (int) (byte) 100, (int) '#', (int) (byte) 10);
        org.joda.time.Period period9 = period3.plus((org.joda.time.ReadablePeriod) period8);
        int int10 = period8.getMillis();
        org.joda.time.Period period12 = period8.minusHours(8);
        int int13 = period8.getHours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray14 = period8.getFieldTypes();
        org.joda.time.Period period16 = period8.plusSeconds((int) (byte) 100);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(durationFieldTypeArray14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.joda.time.Period period1 = org.joda.time.Period.years(0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
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
        org.joda.time.Period period21 = period20.negated();
        org.joda.time.PeriodType periodType22 = period21.getPeriodType();
        org.joda.time.Period period23 = new org.joda.time.Period((long) '4', (long) (short) 0, periodType22);
        org.joda.time.Chronology chronology24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period25 = new org.joda.time.Period((java.lang.Object) (byte) 0, periodType22, chronology24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(periodType22);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationTo(readableInstant11);
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration12);
        org.joda.time.Period period15 = period13.withYears((int) '#');
        java.lang.String str16 = period15.toString();
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "P35Y7M3W4DT12H40M10.001S" + "'", str16, "P35Y7M3W4DT12H40M10.001S");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
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
        org.joda.time.Period period74 = period1.plusHours(35);
        org.joda.time.Period period76 = period74.withMonths((int) (short) 1);
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
        org.junit.Assert.assertNotNull(period76);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.joda.time.Period period8 = new org.joda.time.Period((-1), (int) (byte) 10, 8, 1, (int) (byte) 10, 10, (int) (byte) 1, 1);
        org.joda.time.Period period10 = period8.multipliedBy((int) (short) -1);
        org.joda.time.Period period12 = period8.plusMonths((int) (byte) 0);
        org.joda.time.Period period14 = period12.plusSeconds((int) (short) 1);
        org.joda.time.Period period16 = period14.plusMinutes((int) (short) -1);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((long) 10, periodType18);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period23 = period21.withMillis((int) (byte) 100);
        org.joda.time.Period period24 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period24.toDurationTo(readableInstant25);
        org.joda.time.Period period28 = period24.plusHours((-1));
        int int29 = period28.getSeconds();
        org.joda.time.Period period30 = period23.withFields((org.joda.time.ReadablePeriod) period28);
        int int31 = period28.getHours();
        org.joda.time.Period period32 = period19.minus((org.joda.time.ReadablePeriod) period28);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant33, readableDuration34);
        org.joda.time.Period period37 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period39 = period37.minusYears((int) (byte) -1);
        org.joda.time.Period period40 = period35.withFields((org.joda.time.ReadablePeriod) period37);
        org.joda.time.Period period42 = period37.withMinutes((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Duration duration44 = period42.toDurationTo(readableInstant43);
        org.joda.time.Period period45 = period19.withFields((org.joda.time.ReadablePeriod) period42);
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
        org.joda.time.Period period95 = period45.withField(durationFieldType90, 35);
        boolean boolean96 = period16.isSupported(durationFieldType90);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(period45);
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
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
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
        org.joda.time.Period period16 = period14.plusDays(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours17 = period16.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Hours as this period contains months and months vary in length");
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
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        int int8 = period7.getMinutes();
        org.joda.time.Period period10 = period7.withWeeks((int) (short) 10);
        org.joda.time.Period period12 = period10.withYears(10);
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period10);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
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
        org.joda.time.Period period14 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period16 = period14.withMillis((int) (byte) 100);
        org.joda.time.Period period18 = period14.withMonths((int) ' ');
        org.joda.time.Period period20 = period14.withDays((int) '4');
        boolean boolean21 = period12.equals((java.lang.Object) '4');
        org.joda.time.MutablePeriod mutablePeriod22 = period12.toMutablePeriod();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(mutablePeriod22);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
        org.joda.time.Period period21 = period3.minusYears((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days22 = period21.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains years and years vary in length");
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
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.joda.time.Period period4 = new org.joda.time.Period((int) '4', (int) ' ', (int) '#', 35);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
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
        int int96 = period94.getMillis();
        org.joda.time.ReadableInstant readableInstant97 = null;
        org.joda.time.Duration duration98 = period94.toDurationFrom(readableInstant97);
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
        org.junit.Assert.assertNotNull(duration98);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period3.plusSeconds((int) ' ');
        int[] intArray6 = period3.getValues();
        org.joda.time.Period period8 = period3.withMonths(1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((java.lang.Object) period8, chronology9);
        int int12 = period8.getValue(0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 100 });
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
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
        int int15 = period14.getMonths();
        org.joda.time.Period period17 = period14.minusWeeks((int) (short) -1);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationTo(readableInstant3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration4);
        org.joda.time.Weeks weeks6 = period5.toStandardWeeks();
        org.joda.time.Period period7 = period5.toPeriod();
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((java.lang.Object) period7, periodType8);
        org.joda.time.Period period11 = period9.plusHours(8);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableDuration16, readableInstant17, periodType18);
        org.joda.time.PeriodType periodType20 = period19.getPeriodType();
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant14, readableInstant15, periodType20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) (byte) -1, (long) (byte) 1, periodType20, chronology22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((java.lang.Object) period11, periodType20, chronology24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period26 = new org.joda.time.Period((java.lang.Object) 1L, periodType20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(periodType20);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) ' ');
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) 1, (-1), (int) (byte) -1, (int) (short) 1, 0, 8, 10, (int) (short) 1);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationTo(readableInstant11);
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration12);
        org.joda.time.Period period15 = period13.withYears((int) '#');
        org.joda.time.DurationFieldType[] durationFieldTypeArray16 = period13.getFieldTypes();
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(durationFieldTypeArray16);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
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
        org.joda.time.MutablePeriod mutablePeriod36 = period32.toMutablePeriod();
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
        org.junit.Assert.assertNotNull(mutablePeriod36);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
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
        org.joda.time.Period period21 = period19.withMinutes((int) (byte) 10);
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
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period2 = period0.plusHours(100);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.minusHours(100);
        org.joda.time.Period period8 = period2.plusMillis((int) (byte) 100);
        org.joda.time.Period period9 = period2.normalizedStandard();
        org.joda.time.DurationFieldType durationFieldType10 = null;
        int int11 = period9.indexOf(durationFieldType10);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableDuration8, readableInstant9, periodType10);
        org.joda.time.PeriodType periodType12 = period11.getPeriodType();
        org.joda.time.Period period13 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType12);
        org.joda.time.Period period15 = period13.minusMonths((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days16 = period13.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
        int int18 = period4.getHours();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.minusMillis((int) (short) 0);
        org.joda.time.Period period4 = period1.negated();
        int int5 = period1.getMillis();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT0.068S");
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 0, (long) 1, chronology2);
        org.joda.time.Period period4 = period3.negated();
        org.joda.time.Period period6 = period3.minusWeeks((int) (short) -1);
        org.joda.time.Period period8 = period3.plusYears(0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = period8.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        int int4 = period3.getSeconds();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period8 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period10 = period8.minusYears((int) (byte) -1);
        org.joda.time.Duration duration11 = period8.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableDuration15, readableInstant16, periodType17);
        org.joda.time.PeriodType periodType19 = period18.getPeriodType();
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant13, readableInstant14, periodType19);
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration11, readableInstant12, periodType19);
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant5, readableInstant6, periodType19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period23 = new org.joda.time.Period((java.lang.Object) int4, periodType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(periodType19);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.minusMillis((int) (short) 0);
        org.joda.time.Period period5 = org.joda.time.Period.minutes((int) (byte) 0);
        org.joda.time.Period period7 = period5.withSeconds((-1));
        org.joda.time.Period period8 = period3.minus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period9 = period8.normalizedStandard();
        org.joda.time.Period period11 = period9.plusHours((int) (byte) 0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period3.plusSeconds((int) ' ');
        int[] intArray6 = period3.getValues();
        org.joda.time.Period period8 = period3.withMonths(1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((java.lang.Object) period8, chronology9);
        int int11 = period10.getYears();
        org.joda.time.Period period13 = period10.multipliedBy((int) '4');
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 100 });
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.joda.time.Period period1 = org.joda.time.Period.days(1);
        org.joda.time.Period period3 = period1.plusDays((int) (short) 100);
        int int4 = period3.getYears();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
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
        org.joda.time.Period period97 = period94.withMillis(100);
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
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        int int10 = period9.getMillis();
        int int11 = period9.getWeeks();
        org.joda.time.Period period13 = period9.withDays(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds14 = period9.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Seconds as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
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
        org.joda.time.Period period33 = period31.withMinutes((int) (short) 10);
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
        org.junit.Assert.assertNotNull(period33);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableDuration1, readableInstant2, periodType3);
        org.joda.time.PeriodType periodType5 = period4.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period6 = new org.joda.time.Period((java.lang.Object) (byte) -1, periodType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) -1, (int) (short) 10, 10, (-1), (int) (short) 10, 10, 10, 4);
        int int9 = period8.getYears();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationTo(readableInstant3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration4);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration4, periodType6);
        org.joda.time.Period period9 = period7.plusWeeks(0);
        org.joda.time.Period period10 = period9.toPeriod();
        org.joda.time.Period period12 = period9.minusWeeks(0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableDuration4, readableInstant5, periodType6);
        org.joda.time.PeriodType periodType8 = period7.getPeriodType();
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) (byte) -1, (long) (byte) 1, periodType8, chronology10);
        int int12 = period11.getDays();
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 0);
        org.joda.time.Period period3 = period1.withSeconds((-1));
        org.joda.time.Hours hours4 = period3.toStandardHours();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(hours4);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) 1, 0, (int) (byte) 100, 0, 0, (int) (byte) 1, (int) (short) 10, 0);
        org.joda.time.Period period10 = period8.plusMonths(1);
        org.joda.time.Period period12 = period8.minusHours(100);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) ' ');
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableDuration0, readableInstant1, periodType2);
        java.lang.String str4 = period3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0S" + "'", str4, "PT0S");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableDuration16, readableInstant17, periodType18);
        org.joda.time.PeriodType periodType20 = period19.getPeriodType();
        org.joda.time.Period period21 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType20);
        org.joda.time.Period period22 = new org.joda.time.Period((-1), 0, (int) (short) 1, (int) '4', 10, (int) (byte) 0, 100, (int) (byte) 1, periodType20);
        org.joda.time.Period period24 = period22.plusHours((int) (short) -1);
        org.joda.time.MutablePeriod mutablePeriod25 = period22.toMutablePeriod();
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(mutablePeriod25);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.minusYears((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType4 = null;
        int int5 = period1.get(durationFieldType4);
        org.joda.time.MutablePeriod mutablePeriod6 = period1.toMutablePeriod();
        java.lang.Class<?> wildcardClass7 = period1.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
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
        org.joda.time.Period period22 = period20.withMinutes((int) (short) -1);
        org.joda.time.Period period24 = period20.minusMinutes((-1));
        java.lang.Class<?> wildcardClass25 = period24.getClass();
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
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.plusYears((int) (short) -1);
        org.joda.time.Period period8 = period6.minusWeeks((int) (short) 100);
        org.joda.time.Period period10 = period6.withDays((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration11 = period10.toStandardDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Duration as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
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
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.Period period4 = period2.plusDays((int) 'a');
        org.joda.time.Period period6 = period2.withMinutes((int) 'a');
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableDuration12, readableInstant13, periodType14);
        org.joda.time.PeriodType periodType16 = period15.getPeriodType();
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((long) (byte) -1, (long) (byte) 1, periodType16, chronology18);
        org.joda.time.Period period20 = new org.joda.time.Period((long) 10, periodType16);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) (-1), (long) '#', periodType16, chronology21);
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType16);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) 'a', periodType16, chronology24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period26 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 8);
        org.joda.time.Period period3 = period1.plusWeeks((int) (short) 1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Period period7 = period3.minusYears(100);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 35);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
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
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period20 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.withMillis((int) (short) 1);
        org.joda.time.Period period8 = period4.minusMinutes((int) (short) 0);
        org.joda.time.Period period10 = new org.joda.time.Period((long) 8);
        org.joda.time.PeriodType periodType11 = period10.getPeriodType();
        org.joda.time.Period period12 = period4.withFields((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Period period14 = period4.plusSeconds((int) (short) -1);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        org.joda.time.Weeks weeks5 = period4.toStandardWeeks();
        org.joda.time.Period period7 = period4.withSeconds((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType9 = period7.getFieldType((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (byte) -1, 0L, chronology2);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) 'a', chronology3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration6);
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration6);
        org.joda.time.Period period10 = period8.minusHours((int) 'a');
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) 1, 0, (int) (byte) 100, 0, 0, (int) (byte) 1, (int) (short) 10, 0);
        org.joda.time.Period period10 = period8.plusMonths(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds11 = period8.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Seconds as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableDuration1, readableInstant2, periodType3);
        org.joda.time.PeriodType periodType5 = period4.getPeriodType();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) (byte) 10, periodType5, chronology6);
        org.joda.time.Minutes minutes8 = period7.toStandardMinutes();
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(minutes8);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (short) 100);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType3 = period1.getFieldType((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
        org.joda.time.Period period22 = period20.withMinutes((int) (short) -1);
        org.joda.time.Period period24 = period20.withMillis((int) (byte) 0);
        org.joda.time.Period period26 = period24.minusDays(0);
        int int27 = period24.getMinutes();
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
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("PT0.010S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (byte) -1, (long) '#', chronology2);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.plusYears((int) (short) -1);
        org.joda.time.Period period8 = period6.minusWeeks((int) (short) 100);
        org.joda.time.Period period10 = period6.withDays((int) (byte) 0);
        org.joda.time.Period period11 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationTo(readableInstant12);
        org.joda.time.Period period15 = period11.plusHours((-1));
        int int16 = period15.getSeconds();
        org.joda.time.Period period18 = period15.withSeconds(10);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant19, readableDuration20);
        org.joda.time.Period period23 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period25 = period23.minusYears((int) (byte) -1);
        org.joda.time.Period period26 = period21.withFields((org.joda.time.ReadablePeriod) period23);
        int[] intArray27 = period21.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter28 = null;
        java.lang.String str29 = period21.toString(periodFormatter28);
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType38);
        org.joda.time.Period period41 = period39.withMillis((int) (short) 10);
        org.joda.time.Period period43 = period39.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType45 = period39.getFieldType((int) (short) 1);
        org.joda.time.Period period47 = period21.withField(durationFieldType45, (int) (short) 10);
        org.joda.time.Period period49 = period18.withFieldAdded(durationFieldType45, (int) (byte) 10);
        org.joda.time.Period period50 = period10.plus((org.joda.time.ReadablePeriod) period18);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PT0S" + "'", str29, "PT0S");
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(durationFieldType45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period50);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
        org.joda.time.Chronology chronology18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period19 = new org.joda.time.Period((java.lang.Object) (byte) 0, chronology18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Byte");
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
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMinutes((int) (byte) 0);
        org.joda.time.Period period7 = period5.plusHours((int) (short) 1);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((int) ' ', 0, (int) (short) 100, 100, (int) (byte) 10, 100, (-1), (int) (short) 100, periodType16);
        org.joda.time.Period period19 = period17.minusYears((int) '#');
        org.joda.time.Period period21 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period23 = period21.withMillis((int) (byte) 100);
        org.joda.time.Period period24 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period24.toDurationTo(readableInstant25);
        org.joda.time.Period period28 = period24.plusHours((-1));
        int int29 = period28.getSeconds();
        org.joda.time.Period period30 = period23.withFields((org.joda.time.ReadablePeriod) period28);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType39);
        org.joda.time.Period period42 = period40.withMillis((int) (short) 10);
        org.joda.time.Period period44 = period40.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType46 = period40.getFieldType((int) (short) 1);
        org.joda.time.Period period48 = period23.withField(durationFieldType46, 100);
        int int49 = period17.indexOf(durationFieldType46);
        boolean boolean50 = period5.isSupported(durationFieldType46);
        org.joda.time.Period period52 = period5.minusDays(10);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(durationFieldType46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(period52);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period2 = period1.negated();
        int int3 = period1.getYears();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
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
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((java.lang.Object) period19, chronology21);
        int int23 = period22.getMillis();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
        int int96 = period94.getMillis();
        org.joda.time.Period period98 = period94.minusMonths((-1));
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
        org.junit.Assert.assertNotNull(period98);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks2 = period1.toStandardWeeks();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Weeks as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 0, (long) 1, chronology2);
        org.joda.time.Period period4 = period3.negated();
        org.joda.time.Period period6 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period8 = period6.withMillis((int) (byte) 100);
        org.joda.time.Period period9 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationTo(readableInstant10);
        org.joda.time.Period period13 = period9.plusHours((-1));
        int int14 = period13.getSeconds();
        org.joda.time.Period period15 = period8.withFields((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period17 = period15.plusMillis((int) '#');
        org.joda.time.Period period19 = period17.plusMinutes((int) (short) -1);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType22, chronology23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period24.toDurationFrom(readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant27, readableDuration28);
        org.joda.time.Period period31 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period33 = period31.minusYears((int) (byte) -1);
        org.joda.time.Period period34 = period29.withFields((org.joda.time.ReadablePeriod) period31);
        org.joda.time.Period period36 = period31.withMinutes((int) (short) -1);
        org.joda.time.Period period37 = period24.plus((org.joda.time.ReadablePeriod) period36);
        org.joda.time.Period period38 = period19.plus((org.joda.time.ReadablePeriod) period37);
        org.joda.time.Period period40 = period37.plusYears(8);
        org.joda.time.Period period42 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period44 = period42.withMillis((int) (byte) 100);
        org.joda.time.Period period45 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Duration duration47 = period45.toDurationTo(readableInstant46);
        org.joda.time.Period period49 = period45.plusHours((-1));
        int int50 = period49.getSeconds();
        org.joda.time.Period period51 = period44.withFields((org.joda.time.ReadablePeriod) period49);
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.Period period61 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType60);
        org.joda.time.Period period63 = period61.withMillis((int) (short) 10);
        org.joda.time.Period period65 = period61.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType67 = period61.getFieldType((int) (short) 1);
        org.joda.time.Period period69 = period44.withField(durationFieldType67, 100);
        boolean boolean70 = period40.isSupported(durationFieldType67);
        boolean boolean71 = period4.isSupported(durationFieldType67);
        int int72 = period4.getYears();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(durationFieldType67);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.plusYears((int) (short) -1);
        org.joda.time.Period period8 = period6.minusWeeks((int) (short) 100);
        org.joda.time.Period period10 = period6.withDays((int) (byte) 0);
        org.joda.time.Period period12 = period10.withWeeks((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration13 = period10.toStandardDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Duration as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks1 = period0.toStandardWeeks();
        org.joda.time.Period period2 = period0.negated();
        org.joda.time.Period period4 = period0.plusWeeks((int) '4');
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period14 = period12.plusMinutes((int) (byte) 10);
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
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.joda.time.Period period8 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period8.toDurationTo(readableInstant9);
        org.joda.time.Period period12 = period8.plusHours((-1));
        org.joda.time.Period period14 = period8.withYears(1);
        org.joda.time.Period period15 = new org.joda.time.Period((java.lang.Object) period14);
        org.joda.time.PeriodType periodType16 = period14.getPeriodType();
        org.joda.time.Period period17 = new org.joda.time.Period((int) (short) 10, 0, 0, (int) (byte) -1, (int) (byte) 100, (int) (byte) 0, (int) (byte) -1, (int) '4', periodType16);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.joda.time.Period period4 = new org.joda.time.Period((int) 'a', (int) (short) 100, 1, (int) '4');
        int int5 = period4.getHours();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 1, periodType1, chronology2);
        java.lang.String str4 = period3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0.001S" + "'", str4, "PT0.001S");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period2 = period0.plusHours(100);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.minusHours(100);
        org.joda.time.Period period8 = period2.plusMillis((int) (byte) 100);
        org.joda.time.Period period9 = period2.normalizedStandard();
        org.joda.time.Period period11 = period2.plusMonths((int) (byte) 1);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.joda.time.Period period4 = new org.joda.time.Period((int) '4', (int) (byte) 0, (int) '#', 100);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period11, periodType12);
        int int14 = period11.getYears();
        int int15 = period11.getSeconds();
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 0);
        boolean boolean5 = period0.equals((java.lang.Object) period4);
        org.joda.time.Period period6 = period4.negated();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationTo(readableInstant10);
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant8, (org.joda.time.ReadableDuration) duration11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period12.toDurationTo(readableInstant13);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period20 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period22 = period20.minusYears((int) (byte) -1);
        org.joda.time.Duration duration23 = period20.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableDuration27, readableInstant28, periodType29);
        org.joda.time.PeriodType periodType31 = period30.getPeriodType();
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant25, readableInstant26, periodType31);
        org.joda.time.Period period33 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration23, readableInstant24, periodType31);
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant17, readableInstant18, periodType31);
        org.joda.time.Period period35 = new org.joda.time.Period((long) (short) 1, periodType31);
        org.joda.time.Period period36 = new org.joda.time.Period((long) (byte) 1, periodType31);
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant7, (org.joda.time.ReadableDuration) duration14, periodType31);
        org.joda.time.Period period38 = new org.joda.time.Period((java.lang.Object) period4, periodType31);
        int int39 = period4.getMonths();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("P10Y32M-1WT35H100M10.010S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
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
        org.joda.time.Period period18 = period2.withFields((org.joda.time.ReadablePeriod) period17);
        int int19 = period2.getHours();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) (short) 100);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.Period period8 = period4.plusHours((-1));
        int int9 = period8.getSeconds();
        org.joda.time.Period period10 = period3.withFields((org.joda.time.ReadablePeriod) period8);
        org.joda.time.DurationFieldType durationFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = period10.withField(durationFieldType11, 97);
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
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (byte) 10, (int) '4', 100, (int) (short) 100);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.Period period8 = period4.plusHours((-1));
        int int9 = period8.getSeconds();
        org.joda.time.Period period10 = period3.withFields((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period12 = period10.plusMillis((int) '#');
        org.joda.time.Days days13 = period10.toStandardDays();
        org.joda.time.Period period15 = period10.withSeconds(100);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.Period period13 = period9.plusYears((int) (byte) 10);
        org.joda.time.Period period14 = period13.normalizedStandard();
        int int15 = period13.getMinutes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks16 = period13.toStandardWeeks();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Weeks as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT-1H");
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period11, periodType12);
        org.joda.time.Period period14 = period11.normalizedStandard();
        org.joda.time.Period period16 = period11.plusWeeks(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds17 = period16.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Seconds as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableDuration8, readableInstant9, periodType10);
        org.joda.time.PeriodType periodType12 = period11.getPeriodType();
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant6, readableInstant7, periodType12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) (byte) -1, (long) (byte) 1, periodType12, chronology14);
        org.joda.time.Period period16 = new org.joda.time.Period((long) (short) 1, (long) (short) -1, periodType12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period17 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.plusYears((int) '#');
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) 10, (int) (byte) 100, (int) '#', (int) (byte) 10);
        org.joda.time.Period period9 = period3.plus((org.joda.time.ReadablePeriod) period8);
        int int10 = period8.getMillis();
        org.joda.time.Period period12 = period8.minusHours(8);
        int int13 = period8.getHours();
        org.joda.time.Period period14 = period8.toPeriod();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.minusYears((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType4 = null;
        int int5 = period1.get(durationFieldType4);
        org.joda.time.MutablePeriod mutablePeriod6 = period1.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = mutablePeriod6.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod6);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
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
        int int15 = period14.getMonths();
        java.lang.Class<?> wildcardClass16 = period14.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        int int16 = period15.getHours();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationTo(readableInstant10);
        org.joda.time.Period period13 = period9.withDays((int) (short) 10);
        org.joda.time.Period period15 = period13.minusSeconds(100);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.Period period13 = period9.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType15 = period9.getFieldType((int) (short) 1);
        org.joda.time.Period period17 = period9.multipliedBy(35);
        java.lang.String str18 = period17.toString();
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "P350Y1120M-35WT1225H3500M350.035S" + "'", str18, "P350Y1120M-35WT1225H3500M350.035S");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.joda.time.Period period4 = new org.joda.time.Period(97, (int) ' ', (-1), (int) (byte) -1);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.joda.time.Period period4 = new org.joda.time.Period((int) ' ', 97, (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableDuration10, readableInstant11, periodType12);
        org.joda.time.PeriodType periodType14 = period13.getPeriodType();
        org.joda.time.Period period15 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType14);
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType14);
        org.joda.time.Period period18 = period16.plusDays((int) (byte) 100);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("P35Y7M3W4DT12H40M10.001S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        org.joda.time.MutablePeriod mutablePeriod25 = period24.toMutablePeriod();
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
        org.junit.Assert.assertNotNull(mutablePeriod25);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
        org.joda.time.Period period33 = period31.withMillis((int) (short) 0);
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
        org.junit.Assert.assertNotNull(period33);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
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
        org.joda.time.Period period15 = period8.withWeeks((int) (byte) 10);
        int int16 = period8.getMonths();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
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
        org.joda.time.Seconds seconds24 = period23.toStandardSeconds();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(seconds24);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) -1, chronology1);
        int int3 = period2.getMonths();
        org.joda.time.Period period5 = period2.withHours((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) 35, periodType2);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        int int5 = period4.getSeconds();
        org.joda.time.Period period7 = period4.withSeconds(10);
        org.joda.time.Period period9 = period7.minusMillis((int) (byte) -1);
        org.joda.time.Period period11 = period9.minusHours(0);
        org.joda.time.Period period13 = period9.minusHours(97);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period2 = period1.negated();
        org.joda.time.PeriodType periodType3 = period2.getPeriodType();
        org.joda.time.Period period5 = period2.minusMillis((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod6 = period5.toMutablePeriod();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
        org.joda.time.Period period16 = period12.plusDays((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType18 = period12.getFieldType((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((java.lang.Object) period19, chronology21);
        java.lang.Class<?> wildcardClass23 = period19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days70 = period69.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains months and months vary in length");
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
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period6 = period4.minusYears((int) (byte) -1);
        org.joda.time.Period period7 = period2.withFields((org.joda.time.ReadablePeriod) period4);
        int[] intArray8 = period2.getValues();
        org.joda.time.Period period10 = period2.plusDays((int) (byte) -1);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType19);
        org.joda.time.Period period22 = period20.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((java.lang.Object) period22, periodType23);
        org.joda.time.Period period25 = period10.withFields((org.joda.time.ReadablePeriod) period24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes26 = period25.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period25);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) '#');
        org.joda.time.Period period3 = period1.minusWeeks((int) (byte) 0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks1 = period0.toStandardWeeks();
        org.joda.time.Period period2 = period0.negated();
        int int3 = period2.getMillis();
        java.lang.Class<?> wildcardClass4 = period2.getClass();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.joda.time.Period period1 = org.joda.time.Period.months(4);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.minusMillis((int) (short) 0);
        org.joda.time.Period period4 = period1.negated();
        org.joda.time.Period period6 = period4.minusYears((int) '4');
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.Period period8 = period4.plusHours((-1));
        int int9 = period8.getSeconds();
        org.joda.time.Period period10 = period3.withFields((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period11 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationTo(readableInstant12);
        org.joda.time.Period period15 = period11.plusHours((-1));
        int int16 = period15.getSeconds();
        org.joda.time.Period period18 = period15.withSeconds(10);
        int int19 = period18.getDays();
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period18.toDurationFrom(readableInstant20);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableDuration39, readableInstant40, periodType41);
        org.joda.time.PeriodType periodType43 = period42.getPeriodType();
        org.joda.time.Period period44 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType43);
        org.joda.time.Period period45 = new org.joda.time.Period((-1), 0, (int) (short) 1, (int) '4', 10, (int) (byte) 0, 100, (int) (byte) 1, periodType43);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((long) 100, periodType43, chronology46);
        org.joda.time.Period period48 = period18.normalizedStandard(periodType43);
        org.joda.time.Period period49 = new org.joda.time.Period((java.lang.Object) period10, periodType43);
        org.joda.time.Period period51 = period49.withWeeks((int) '4');
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period51);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.plusYears((int) '#');
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) 10, (int) (byte) 100, (int) '#', (int) (byte) 10);
        org.joda.time.Period period9 = period3.plus((org.joda.time.ReadablePeriod) period8);
        int int10 = period8.getMillis();
        org.joda.time.Period period12 = period8.minusHours(8);
        org.joda.time.Days days13 = period12.toStandardDays();
        org.joda.time.Period period15 = period12.withHours(100);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.joda.time.Period period1 = org.joda.time.Period.hours(8);
        org.joda.time.Period period3 = period1.minusDays(97);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.minusMillis((int) (short) 0);
        org.joda.time.Period period5 = org.joda.time.Period.minutes((int) (byte) 0);
        org.joda.time.Period period7 = period5.withSeconds((-1));
        org.joda.time.Period period8 = period3.minus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period10 = org.joda.time.Period.seconds(0);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType19);
        org.joda.time.Period period22 = period20.withMillis((int) (short) 10);
        org.joda.time.Period period24 = period20.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType26 = period20.getFieldType((int) (short) 1);
        int int27 = period10.indexOf(durationFieldType26);
        org.joda.time.Period period29 = period8.withField(durationFieldType26, 100);
        int[] intArray30 = period29.getValues();
        int int31 = period29.getMillis();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 0, 100, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
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
        org.joda.time.Period period29 = period27.minusMillis((int) (short) 100);
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
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
        org.joda.time.Hours hours22 = period21.toStandardHours();
        int[] intArray23 = period21.getValues();
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
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 0, 0, 0, (-97), 0, 0, 0, 0 });
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
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
        org.joda.time.PeriodType periodType16 = period13.getPeriodType();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) (short) 1, periodType16, chronology17);
        org.joda.time.format.PeriodFormatter periodFormatter19 = null;
        java.lang.String str20 = period18.toString(periodFormatter19);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PT0.001S" + "'", str20, "PT0.001S");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 0);
        org.joda.time.Period period3 = period1.withDays(0);
        org.joda.time.Period period5 = period3.minusDays((int) (byte) 100);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) ' ', 0, (int) (short) 100, 100, (int) (byte) 10, 100, (-1), (int) (short) 100, periodType8);
        org.joda.time.Period period11 = period9.minusYears((int) '#');
        org.joda.time.Period period13 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period15 = period13.withMillis((int) (byte) 100);
        org.joda.time.Period period16 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationTo(readableInstant17);
        org.joda.time.Period period20 = period16.plusHours((-1));
        int int21 = period20.getSeconds();
        org.joda.time.Period period22 = period15.withFields((org.joda.time.ReadablePeriod) period20);
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType31);
        org.joda.time.Period period34 = period32.withMillis((int) (short) 10);
        org.joda.time.Period period36 = period32.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType38 = period32.getFieldType((int) (short) 1);
        org.joda.time.Period period40 = period15.withField(durationFieldType38, 100);
        int int41 = period9.indexOf(durationFieldType38);
        org.joda.time.Period period43 = period9.plusSeconds(32);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(durationFieldType38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(period43);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) (byte) 100);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (short) 1, (-1), (int) (short) 1, (int) '#');
        java.lang.Class<?> wildcardClass5 = period4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
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
        int int18 = period2.getMillis();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 0, (long) 1, chronology5);
        org.joda.time.Period period7 = period6.negated();
        org.joda.time.Period period8 = period2.withFields((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period10 = period8.plusWeeks(0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.minusMillis((int) (short) 0);
        org.joda.time.DurationFieldType[] durationFieldTypeArray4 = period3.getFieldTypes();
        org.joda.time.Hours hours5 = period3.toStandardHours();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(durationFieldTypeArray4);
        org.junit.Assert.assertNotNull(hours5);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) ' ', (long) (byte) 100, periodType2);
        org.joda.time.Period period5 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period7 = period5.minusMillis((int) (short) 0);
        org.joda.time.Period period9 = org.joda.time.Period.minutes((int) (byte) 0);
        org.joda.time.Period period11 = period9.withSeconds((-1));
        org.joda.time.Period period12 = period7.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period13 = period3.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period15 = period7.minusDays(32);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        int int8 = period7.getMinutes();
        org.joda.time.Period period10 = period7.withMinutes(0);
        org.joda.time.MutablePeriod mutablePeriod11 = period7.toMutablePeriod();
        int int12 = period7.getMillis();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        org.joda.time.Period period16 = period12.plusYears((int) '#');
        org.joda.time.Period period17 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period17.toDurationTo(readableInstant18);
        org.joda.time.Period period21 = period17.plusHours((-1));
        int int22 = period21.getSeconds();
        org.joda.time.Period period24 = period21.withSeconds(10);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableDuration26);
        org.joda.time.Period period29 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period31 = period29.minusYears((int) (byte) -1);
        org.joda.time.Period period32 = period27.withFields((org.joda.time.ReadablePeriod) period29);
        int[] intArray33 = period27.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter34 = null;
        java.lang.String str35 = period27.toString(periodFormatter34);
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType44);
        org.joda.time.Period period47 = period45.withMillis((int) (short) 10);
        org.joda.time.Period period49 = period45.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType51 = period45.getFieldType((int) (short) 1);
        org.joda.time.Period period53 = period27.withField(durationFieldType51, (int) (short) 10);
        org.joda.time.Period period55 = period24.withFieldAdded(durationFieldType51, (int) (byte) 10);
        int int56 = period16.indexOf(durationFieldType51);
        java.lang.Class<?> wildcardClass57 = durationFieldType51.getClass();
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
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PT0S" + "'", str35, "PT0S");
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(durationFieldType51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.plusYears((int) '#');
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.DurationFieldType durationFieldType7 = null;
        int int8 = period4.get(durationFieldType7);
        org.joda.time.Period period9 = period3.plus((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period11 = period4.minusWeeks((int) '4');
        org.joda.time.Period period13 = period4.plusWeeks(0);
        org.joda.time.Days days14 = period13.toStandardDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(days14);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
        org.joda.time.Period period50 = period48.withMinutes((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int52 = period48.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.joda.time.Period period8 = new org.joda.time.Period((-1), (int) (byte) 10, 8, 1, (int) (byte) 10, 10, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds9 = period8.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Seconds as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.joda.time.Period period2 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationTo(readableInstant3);
        org.joda.time.Period period6 = period2.plusHours((-1));
        org.joda.time.Period period8 = period2.withYears(1);
        org.joda.time.Period period9 = new org.joda.time.Period((java.lang.Object) period8);
        org.joda.time.PeriodType periodType10 = period8.getPeriodType();
        org.joda.time.Period period11 = new org.joda.time.Period((long) '4', 10L, periodType10);
        org.joda.time.Period period13 = period11.minusYears(0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.plusYears((int) (short) -1);
        int[] intArray7 = period4.getValues();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((java.lang.Object) period4, chronology8);
        int int10 = period4.getHours();
        org.joda.time.DurationFieldType durationFieldType11 = null;
        boolean boolean12 = period4.isSupported(durationFieldType11);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0, 0, 0, 0, (-1), 0, 0, 0 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.plusYears((int) '#');
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) 10, (int) (byte) 100, (int) '#', (int) (byte) 10);
        org.joda.time.Period period9 = period3.plus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period11 = period9.plusMonths(0);
        org.joda.time.Period period12 = period11.normalizedStandard();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration13 = period12.toStandardDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Duration as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) (short) -1);
        org.joda.time.Period period3 = period1.minusYears((-1));
        org.joda.time.Period period5 = period1.withDays((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int7 = period1.getValue(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType21 = period16.getFieldType(35);
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
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationTo(readableInstant11);
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration12);
        org.joda.time.Period period15 = period13.withSeconds((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days16 = period13.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationTo(readableInstant3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration4);
        org.joda.time.Hours hours6 = period5.toStandardHours();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period5.toDurationTo(readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration8, readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period13 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period15 = period13.withMillis((int) (byte) 100);
        org.joda.time.Period period17 = period13.withMonths((int) ' ');
        org.joda.time.Period period19 = period13.withHours(100);
        int int20 = period19.getMinutes();
        org.joda.time.Period period22 = period19.withWeeks((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationFrom(readableInstant23);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableDuration41, readableInstant42, periodType43);
        org.joda.time.PeriodType periodType45 = period44.getPeriodType();
        org.joda.time.Period period46 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType45);
        org.joda.time.Period period47 = new org.joda.time.Period((-1), 0, (int) (short) 1, (int) '4', 10, (int) (byte) 0, 100, (int) (byte) 1, periodType45);
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant11, (org.joda.time.ReadableDuration) duration24, periodType45);
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration8, periodType45);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration8, readableInstant50);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(periodType45);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        org.joda.time.Period period97 = period7.withSeconds(35);
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
        org.junit.Assert.assertNotNull(period97);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Period period2 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks3 = period2.toStandardWeeks();
        org.joda.time.Period period4 = period2.negated();
        org.joda.time.Period period6 = period4.plusMillis(0);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period9 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period11 = period9.withMillis((int) (byte) 100);
        org.joda.time.Period period13 = period9.withMonths((int) ' ');
        org.joda.time.Period period15 = period9.withHours(100);
        int int16 = period15.getMinutes();
        org.joda.time.Period period18 = period15.withWeeks((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = period18.toDurationFrom(readableInstant19);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period(readableDuration37, readableInstant38, periodType39);
        org.joda.time.PeriodType periodType41 = period40.getPeriodType();
        org.joda.time.Period period42 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType41);
        org.joda.time.Period period43 = new org.joda.time.Period((-1), 0, (int) (short) 1, (int) '4', 10, (int) (byte) 0, 100, (int) (byte) 1, periodType41);
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant7, (org.joda.time.ReadableDuration) duration20, periodType41);
        org.joda.time.Period period45 = period4.normalizedStandard(periodType41);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period46 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(period45);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        java.lang.String str8 = period7.toString();
        java.lang.String str9 = period7.toString();
        org.joda.time.DurationFieldType durationFieldType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = period7.withFieldAdded(durationFieldType10, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT100H" + "'", str8, "PT100H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT100H" + "'", str9, "PT100H");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = new org.joda.time.Period((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period3.plusSeconds((int) ' ');
        org.joda.time.Period period7 = period3.minusWeeks(10);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = period7.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.joda.time.Period period1 = org.joda.time.Period.weeks(10);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        org.joda.time.Weeks weeks5 = period4.toStandardWeeks();
        org.joda.time.Period period7 = period4.minusDays(100);
        int int8 = period4.getDays();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((-1), (int) (byte) 10, 8, 1, (int) (byte) 10, 10, (int) (byte) 1, 1);
        org.joda.time.PeriodType periodType22 = period21.getPeriodType();
        org.joda.time.Period period23 = new org.joda.time.Period((long) (short) 100, periodType22);
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) ' ', periodType22, chronology25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period27 = new org.joda.time.Period((java.lang.Object) int8, periodType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(periodType22);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
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
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant4, readableInstant5, periodType18);
        org.joda.time.Period period22 = new org.joda.time.Period((long) (short) 1, periodType18);
        org.joda.time.Period period23 = new org.joda.time.Period((long) (byte) 1, periodType18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period24 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(periodType18);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
        org.joda.time.Period period26 = period4.withYears(97);
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
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period0.withYears(1);
        int int8 = period6.getValue(1);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationTo(readableInstant3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationTo(readableInstant6);
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
        org.joda.time.Period period28 = new org.joda.time.Period((long) (short) 1, periodType24);
        org.joda.time.Period period29 = new org.joda.time.Period((long) (byte) 1, periodType24);
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration7, periodType24);
        int int31 = period30.getWeeks();
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        org.joda.time.Period period6 = period4.withWeeks(0);
        java.lang.String str7 = period6.toString();
        org.joda.time.Period period8 = period6.toPeriod();
        int int9 = period8.getWeeks();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT0S" + "'", str7, "PT0S");
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.plusYears((int) (short) -1);
        org.joda.time.Period period8 = period6.minusWeeks((int) (short) 100);
        org.joda.time.Period period10 = period6.withDays((int) (byte) 0);
        org.joda.time.Period period12 = period6.withHours((int) ' ');
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (short) 10);
        org.joda.time.Period period2 = period1.normalizedStandard();
        org.junit.Assert.assertNotNull(period2);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusDays((int) (byte) 10);
        org.joda.time.Period period6 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period7 = period6.negated();
        org.joda.time.PeriodType periodType8 = period7.getPeriodType();
        org.joda.time.Period period9 = new org.joda.time.Period((java.lang.Object) period4, periodType8);
        org.joda.time.Period period11 = period4.plusWeeks((int) (short) 1);
        org.joda.time.Period period13 = period4.withMillis((int) (byte) -1);
        int int14 = period13.getHours();
        org.joda.time.Period period16 = period13.plusHours(100);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(4);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.joda.time.Period period0 = new org.joda.time.Period();
        org.joda.time.Period period2 = period0.withWeeks((int) (short) -1);
        org.junit.Assert.assertNotNull(period2);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
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
        org.joda.time.Period period18 = new org.joda.time.Period((long) 0, periodType15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period19 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.withMillis((int) (short) 1);
        org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) period4);
        org.joda.time.Duration duration8 = period4.toStandardDuration();
        org.joda.time.Period period9 = period4.toPeriod();
        org.joda.time.Period period11 = period4.withMinutes((int) (byte) 10);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.Period period13 = period9.plusYears((int) (byte) 10);
        org.joda.time.Period period14 = period13.normalizedStandard();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks15 = period13.toStandardWeeks();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Weeks as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(0L, periodType1, chronology2);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period2 = period1.negated();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableDuration3, readableInstant4, periodType5);
        org.joda.time.PeriodType periodType7 = period6.getPeriodType();
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) 10, periodType9);
        org.joda.time.Period period12 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period14 = period12.withMillis((int) (byte) 100);
        org.joda.time.Period period15 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period15.toDurationTo(readableInstant16);
        org.joda.time.Period period19 = period15.plusHours((-1));
        int int20 = period19.getSeconds();
        org.joda.time.Period period21 = period14.withFields((org.joda.time.ReadablePeriod) period19);
        int int22 = period19.getHours();
        org.joda.time.Period period23 = period10.minus((org.joda.time.ReadablePeriod) period19);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant24, readableDuration25);
        org.joda.time.Period period28 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period30 = period28.minusYears((int) (byte) -1);
        org.joda.time.Period period31 = period26.withFields((org.joda.time.ReadablePeriod) period28);
        org.joda.time.Period period33 = period28.withMinutes((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Duration duration35 = period33.toDurationTo(readableInstant34);
        org.joda.time.Period period36 = period10.withFields((org.joda.time.ReadablePeriod) period33);
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
        org.joda.time.Period period56 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period58 = period56.withMillis((int) (byte) 100);
        org.joda.time.Period period59 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.Duration duration61 = period59.toDurationTo(readableInstant60);
        org.joda.time.Period period63 = period59.plusHours((-1));
        int int64 = period63.getSeconds();
        org.joda.time.Period period65 = period58.withFields((org.joda.time.ReadablePeriod) period63);
        org.joda.time.PeriodType periodType74 = null;
        org.joda.time.Period period75 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType74);
        org.joda.time.Period period77 = period75.withMillis((int) (short) 10);
        org.joda.time.Period period79 = period75.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType81 = period75.getFieldType((int) (short) 1);
        org.joda.time.Period period83 = period58.withField(durationFieldType81, 100);
        boolean boolean84 = period41.isSupported(durationFieldType81);
        org.joda.time.Period period86 = period36.withField(durationFieldType81, 35);
        org.joda.time.Period period88 = period6.withFieldAdded(durationFieldType81, 8);
        org.joda.time.Period period90 = period2.withFieldAdded(durationFieldType81, 35);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(durationFieldType81);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(period88);
        org.junit.Assert.assertNotNull(period90);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
        java.lang.Class<?> wildcardClass25 = period4.getClass();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
        org.joda.time.Period period50 = period4.minusDays((int) (short) 10);
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
        org.junit.Assert.assertNotNull(period50);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        org.joda.time.Period period15 = period12.withMillis(0);
        int int16 = period15.getWeeks();
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks1 = period0.toStandardWeeks();
        org.joda.time.Period period2 = period0.negated();
        org.joda.time.Period period4 = org.joda.time.Period.seconds(0);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType13);
        org.joda.time.Period period16 = period14.withMillis((int) (short) 10);
        org.joda.time.Period period18 = period14.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType20 = period14.getFieldType((int) (short) 1);
        int int21 = period4.indexOf(durationFieldType20);
        org.joda.time.Period period23 = period2.withFieldAdded(durationFieldType20, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType25 = period23.getFieldType((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(period23);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        int int8 = period7.getMinutes();
        org.joda.time.Period period10 = period7.withMinutes(0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((java.lang.Object) period7, chronology11);
        org.joda.time.Period period14 = period7.plusSeconds(35);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableDuration8, readableInstant9, periodType10);
        org.joda.time.PeriodType periodType12 = period11.getPeriodType();
        org.joda.time.Period period13 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType12);
        org.joda.time.Period period15 = period13.minusMonths((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds16 = period15.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Seconds as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableDuration10, readableInstant11, periodType12);
        org.joda.time.PeriodType periodType14 = period13.getPeriodType();
        org.joda.time.Period period15 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType14);
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType18 = period16.getFieldType((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType14);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Period period3 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period4 = period3.negated();
        org.joda.time.PeriodType periodType5 = period4.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period6 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.Period period13 = period9.plusYears((int) (byte) 10);
        int int14 = period13.getMonths();
        org.joda.time.Period period15 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks16 = period15.toStandardWeeks();
        org.joda.time.Period period18 = period15.minusHours((int) '#');
        org.joda.time.Period period20 = period18.multipliedBy((int) (byte) 0);
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType24, chronology25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = period26.toDurationFrom(readableInstant27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant29, readableDuration30);
        org.joda.time.Period period33 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period35 = period33.minusYears((int) (byte) -1);
        org.joda.time.Period period36 = period31.withFields((org.joda.time.ReadablePeriod) period33);
        org.joda.time.Period period38 = period33.withMinutes((int) (short) -1);
        org.joda.time.Period period39 = period26.plus((org.joda.time.ReadablePeriod) period38);
        org.joda.time.PeriodType periodType40 = period39.getPeriodType();
        org.joda.time.Period period41 = new org.joda.time.Period((long) (short) 0, periodType40);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((java.lang.Object) period18, periodType40, chronology42);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period44 = new org.joda.time.Period((java.lang.Object) int14, periodType40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(periodType40);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-1), (long) (short) 0);
        int int3 = period2.getYears();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType2, chronology3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, readableInstant7, periodType8);
        org.joda.time.Hours hours10 = period9.toStandardHours();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(hours10);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        org.joda.time.Period period6 = period4.withWeeks(0);
        java.lang.String str7 = period6.toString();
        org.joda.time.Period period8 = period6.toPeriod();
        org.joda.time.Weeks weeks9 = period6.toStandardWeeks();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT0S" + "'", str7, "PT0S");
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(weeks9);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        org.joda.time.Period period23 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period24 = period23.negated();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableDuration26, readableInstant27, periodType28);
        org.joda.time.PeriodType periodType30 = period29.getPeriodType();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((long) (byte) 10, periodType30, chronology31);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((java.lang.Object) period24, periodType30, chronology33);
        org.joda.time.Period period35 = period21.minus((org.joda.time.ReadablePeriod) period24);
        org.joda.time.Period period36 = period24.negated();
        int int37 = period24.size();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 8 + "'", int37 == 8);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType2, chronology3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, readableInstant7, periodType8);
        org.joda.time.Period period11 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period13 = period11.withMillis((int) (byte) 100);
        org.joda.time.Period period14 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period14.toDurationTo(readableInstant15);
        org.joda.time.Period period18 = period14.plusHours((-1));
        int int19 = period18.getSeconds();
        org.joda.time.Period period20 = period13.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Period period22 = period20.plusMillis((int) '#');
        org.joda.time.Period period24 = period22.plusMinutes((int) (short) -1);
        org.joda.time.Seconds seconds25 = period22.toStandardSeconds();
        org.joda.time.Period period26 = period9.plus((org.joda.time.ReadablePeriod) seconds25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((java.lang.Object) seconds25, chronology27);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(period26);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
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
        int int61 = period56.getDays();
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
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        org.joda.time.Period period34 = period32.withMonths(1);
        org.joda.time.Period period36 = period34.multipliedBy((-1));
        org.joda.time.PeriodType periodType37 = period34.getPeriodType();
        org.joda.time.Period period38 = period34.toPeriod();
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period(readableDuration43, readableInstant44, periodType45);
        org.joda.time.PeriodType periodType47 = period46.getPeriodType();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period((long) (byte) 10, periodType47, chronology48);
        org.joda.time.Period period50 = new org.joda.time.Period((long) (byte) 10, periodType47);
        org.joda.time.Period period51 = new org.joda.time.Period((long) (byte) 10, (-1L), periodType47);
        org.joda.time.Period period53 = period51.plusSeconds(1);
        org.joda.time.Period period54 = period38.minus((org.joda.time.ReadablePeriod) period51);
        org.joda.time.Period period55 = period4.minus((org.joda.time.ReadablePeriod) period51);
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
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period55);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
        org.joda.time.Period period94 = period92.plusWeeks((int) (short) 100);
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
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
        org.joda.time.Period period28 = period22.toPeriod();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes29 = period22.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(period28);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.joda.time.Period period1 = org.joda.time.Period.years(32);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) (byte) 1);
        org.joda.time.Period period3 = period1.plusYears(100);
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period46 = new org.joda.time.Period((java.lang.Object) 100, periodType39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(period44);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '4');
        org.joda.time.Period period3 = period1.minusMonths(52);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(0L, (long) (byte) -1, periodType2);
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
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableDuration21);
        org.joda.time.Period period24 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period26 = period24.minusYears((int) (byte) -1);
        org.joda.time.Period period27 = period22.withFields((org.joda.time.ReadablePeriod) period24);
        org.joda.time.Period period29 = period24.withMinutes((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = period29.toDurationTo(readableInstant30);
        org.joda.time.Period period32 = period6.withFields((org.joda.time.ReadablePeriod) period29);
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
        org.joda.time.Period period52 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period54 = period52.withMillis((int) (byte) 100);
        org.joda.time.Period period55 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.Duration duration57 = period55.toDurationTo(readableInstant56);
        org.joda.time.Period period59 = period55.plusHours((-1));
        int int60 = period59.getSeconds();
        org.joda.time.Period period61 = period54.withFields((org.joda.time.ReadablePeriod) period59);
        org.joda.time.PeriodType periodType70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType70);
        org.joda.time.Period period73 = period71.withMillis((int) (short) 10);
        org.joda.time.Period period75 = period71.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType77 = period71.getFieldType((int) (short) 1);
        org.joda.time.Period period79 = period54.withField(durationFieldType77, 100);
        boolean boolean80 = period37.isSupported(durationFieldType77);
        org.joda.time.Period period82 = period32.withField(durationFieldType77, 35);
        int int83 = period3.get(durationFieldType77);
        org.joda.time.PeriodType periodType84 = null;
        org.joda.time.Period period85 = period3.normalizedStandard(periodType84);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(durationFieldType77);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(period85);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        int int5 = period4.getSeconds();
        org.joda.time.Period period7 = period4.withSeconds(10);
        int int8 = period7.getDays();
        org.joda.time.Period period10 = period7.plusYears((int) ' ');
        org.joda.time.Period period11 = period10.normalizedStandard();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.joda.time.Period period1 = org.joda.time.Period.millis(52);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period5 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period6 = period5.negated();
        org.joda.time.PeriodType periodType7 = period6.getPeriodType();
        org.joda.time.Period period8 = new org.joda.time.Period((long) '4', (long) (short) 0, periodType7);
        org.joda.time.Period period9 = new org.joda.time.Period(readableDuration0, readableInstant1, periodType7);
        org.joda.time.Chronology chronology10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = new org.joda.time.Period((java.lang.Object) periodType7, chronology10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
        org.joda.time.format.PeriodFormatter periodFormatter37 = null;
        java.lang.String str38 = period10.toString(periodFormatter37);
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "P4DT4H" + "'", str38, "P4DT4H");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.minusYears((int) (byte) -1);
        org.joda.time.Period period5 = period3.minusMinutes((int) ' ');
        org.joda.time.PeriodType periodType6 = period5.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter7 = null;
        java.lang.String str8 = period5.toString(periodFormatter7);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P1YT-32M" + "'", str8, "P1YT-32M");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (byte) 0);
        org.joda.time.Period period3 = period1.minusMillis(100);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.plusYears((int) (short) -1);
        org.joda.time.Period period8 = period6.minusWeeks((int) (short) 100);
        org.joda.time.PeriodType periodType9 = period8.getPeriodType();
        org.joda.time.Period period11 = period8.withSeconds(1);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        int int8 = period7.getMinutes();
        org.joda.time.Period period10 = period7.withMinutes(0);
        org.joda.time.Period period12 = period7.minusMonths((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableDuration29, readableInstant30, periodType31);
        org.joda.time.PeriodType periodType33 = period32.getPeriodType();
        org.joda.time.Period period34 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType33);
        org.joda.time.Period period35 = new org.joda.time.Period((-1), 0, (int) (short) 1, (int) '4', 10, (int) (byte) 0, 100, (int) (byte) 1, periodType33);
        org.joda.time.Period period37 = period35.plusHours((int) (short) -1);
        org.joda.time.Period period39 = period35.withWeeks((int) (byte) -1);
        int int40 = period35.getHours();
        org.joda.time.Period period41 = period35.toPeriod();
        boolean boolean42 = period12.equals((java.lang.Object) period35);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) -1, (int) (byte) 10, 32, (int) (short) 10, 97, (int) '4', 8, (int) (short) 100);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.joda.time.Period period2 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period4 = period2.minusYears((int) (byte) -1);
        org.joda.time.Duration duration5 = period2.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableDuration9, readableInstant10, periodType11);
        org.joda.time.PeriodType periodType13 = period12.getPeriodType();
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant7, readableInstant8, periodType13);
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration5, readableInstant6, periodType13);
        org.joda.time.Period period16 = new org.joda.time.Period((long) 0, periodType13);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = period16.normalizedStandard(periodType17);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = period0.get(durationFieldType3);
        org.joda.time.Period period6 = period0.withMonths((int) ' ');
        org.joda.time.DurationFieldType[] durationFieldTypeArray7 = period0.getFieldTypes();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(durationFieldTypeArray7);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableDuration8, readableInstant9, periodType10);
        org.joda.time.PeriodType periodType12 = period11.getPeriodType();
        org.joda.time.Period period13 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType12);
        org.joda.time.Period period15 = period13.minusMonths((int) (short) 100);
        org.joda.time.Period period17 = period15.multipliedBy((int) (byte) 10);
        int int18 = period15.getSeconds();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableDuration19, readableInstant20, periodType21);
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
        int int37 = period36.getMonths();
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Period period39 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Duration duration41 = period39.toDurationTo(readableInstant40);
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant38, (org.joda.time.ReadableDuration) duration41);
        int int43 = period42.size();
        org.joda.time.Period period45 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period47 = period45.withMillis((int) (byte) 100);
        org.joda.time.Period period48 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Duration duration50 = period48.toDurationTo(readableInstant49);
        org.joda.time.Period period52 = period48.plusHours((-1));
        int int53 = period52.getSeconds();
        org.joda.time.Period period54 = period47.withFields((org.joda.time.ReadablePeriod) period52);
        org.joda.time.Period period56 = period52.withMinutes((int) (short) 0);
        org.joda.time.Period period58 = period52.withMinutes(10);
        org.joda.time.Period period60 = period52.minusHours(100);
        org.joda.time.Period period61 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks62 = period61.toStandardWeeks();
        org.joda.time.Period period63 = period61.negated();
        org.joda.time.Period period65 = org.joda.time.Period.seconds(0);
        org.joda.time.PeriodType periodType74 = null;
        org.joda.time.Period period75 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType74);
        org.joda.time.Period period77 = period75.withMillis((int) (short) 10);
        org.joda.time.Period period79 = period75.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType81 = period75.getFieldType((int) (short) 1);
        int int82 = period65.indexOf(durationFieldType81);
        org.joda.time.Period period84 = period63.withFieldAdded(durationFieldType81, (int) 'a');
        org.joda.time.Period period86 = period52.withFieldAdded(durationFieldType81, 0);
        org.joda.time.Period period88 = period42.withField(durationFieldType81, (int) (byte) 1);
        org.joda.time.Period period90 = period36.withFieldAdded(durationFieldType81, (int) (byte) 10);
        int int91 = period22.get(durationFieldType81);
        org.joda.time.Period period93 = period15.withField(durationFieldType81, (int) (byte) 10);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 8 + "'", int43 == 8);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(weeks62);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(durationFieldType81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(period88);
        org.junit.Assert.assertNotNull(period90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertNotNull(period93);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.minusMillis((int) (short) 0);
        org.joda.time.Period period5 = org.joda.time.Period.minutes((int) (byte) 0);
        org.joda.time.Period period7 = period5.withSeconds((-1));
        org.joda.time.Period period8 = period3.minus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Duration duration9 = period3.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration9, readableInstant10);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration9);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(0L, chronology1);
        org.joda.time.Period period4 = period2.plusMinutes(100);
        int int5 = period2.getMinutes();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks1 = period0.toStandardWeeks();
        org.joda.time.Period period3 = period0.minusSeconds((int) (byte) 1);
        org.joda.time.Period period5 = period0.withYears((int) (byte) 10);
        org.joda.time.Period period7 = period5.plusSeconds(0);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
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
        int int22 = period20.getDays();
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
        boolean boolean41 = period20.equals((java.lang.Object) '#');
        org.joda.time.Period period43 = period20.minusMonths((int) 'a');
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period(readableDuration49, readableInstant50, periodType51);
        org.joda.time.PeriodType periodType53 = period52.getPeriodType();
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant47, readableInstant48, periodType53);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period((long) (byte) -1, (long) (byte) 1, periodType53, chronology55);
        org.joda.time.Period period57 = new org.joda.time.Period((long) 10, periodType53);
        org.joda.time.Period period58 = period43.normalizedStandard(periodType53);
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.Period period61 = new org.joda.time.Period((long) 10, periodType60);
        org.joda.time.Period period63 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period65 = period63.withMillis((int) (byte) 100);
        org.joda.time.Period period66 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.Duration duration68 = period66.toDurationTo(readableInstant67);
        org.joda.time.Period period70 = period66.plusHours((-1));
        int int71 = period70.getSeconds();
        org.joda.time.Period period72 = period65.withFields((org.joda.time.ReadablePeriod) period70);
        int int73 = period70.getHours();
        org.joda.time.Period period74 = period61.minus((org.joda.time.ReadablePeriod) period70);
        org.joda.time.PeriodType periodType75 = period70.getPeriodType();
        org.joda.time.Period period76 = period58.withPeriodType(periodType75);
        org.joda.time.Period period77 = new org.joda.time.Period((long) (byte) 100, (long) (byte) -1, periodType75);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period78 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(periodType75);
        org.junit.Assert.assertNotNull(period76);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("PT0.097S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        int int1 = period0.getHours();
        org.joda.time.Period period3 = period0.multipliedBy((-1));
        org.joda.time.Duration duration4 = period3.toStandardDuration();
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
        org.joda.time.Period period25 = new org.joda.time.Period((long) ' ', (long) (byte) 1, periodType24);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) ' ', (long) (byte) -1, periodType24, chronology26);
        org.joda.time.Period period29 = period27.plusYears((int) (short) 1);
        org.joda.time.Period period30 = period3.minus((org.joda.time.ReadablePeriod) period29);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration4);
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
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period7 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period7.toDurationTo(readableInstant8);
        org.joda.time.Period period11 = period7.plusDays((int) (byte) 10);
        org.joda.time.Period period13 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period14 = period13.negated();
        org.joda.time.PeriodType periodType15 = period14.getPeriodType();
        org.joda.time.Period period16 = new org.joda.time.Period((java.lang.Object) period11, periodType15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) (short) 10, (long) '#', periodType15, chronology17);
        org.joda.time.Period period19 = new org.joda.time.Period(10L, periodType15);
        org.joda.time.Period period20 = new org.joda.time.Period(readableDuration2, readableInstant3, periodType15);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) 32, (long) 32, periodType15, chronology21);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 32, (long) (short) 10);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks1 = period0.toStandardWeeks();
        org.joda.time.Period period2 = period0.negated();
        org.joda.time.Period period4 = period2.plusMillis(0);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period7 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period9 = period7.withMillis((int) (byte) 100);
        org.joda.time.Period period11 = period7.withMonths((int) ' ');
        org.joda.time.Period period13 = period7.withHours(100);
        int int14 = period13.getMinutes();
        org.joda.time.Period period16 = period13.withWeeks((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationFrom(readableInstant17);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period(readableDuration35, readableInstant36, periodType37);
        org.joda.time.PeriodType periodType39 = period38.getPeriodType();
        org.joda.time.Period period40 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType39);
        org.joda.time.Period period41 = new org.joda.time.Period((-1), 0, (int) (short) 1, (int) '4', 10, (int) (byte) 0, 100, (int) (byte) 1, periodType39);
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant5, (org.joda.time.ReadableDuration) duration18, periodType39);
        org.joda.time.Period period43 = period2.normalizedStandard(periodType39);
        org.joda.time.Period period45 = period43.withWeeks((int) 'a');
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
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
        int int20 = period17.size();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period6 = period4.minusYears((int) (byte) -1);
        org.joda.time.Period period7 = period2.withFields((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period9 = period2.withHours((int) (short) 0);
        org.joda.time.DurationFieldType durationFieldType10 = null;
        int int11 = period9.indexOf(durationFieldType10);
        int int12 = period9.getMonths();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (short) -1);
        org.joda.time.Minutes minutes2 = period1.toStandardMinutes();
        org.joda.time.Period period4 = period1.minusSeconds(32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) (short) -1);
        org.joda.time.Period period3 = period1.minusYears((-1));
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.Period period5 = period1.plus(readablePeriod4);
        java.lang.String str6 = period5.toString();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT-1S" + "'", str6, "PT-1S");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
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
        // The following exception was thrown during execution in test generation
        try {
            int int30 = period28.getValue(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.plusYears((int) '#');
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) 10, (int) (byte) 100, (int) '#', (int) (byte) 10);
        org.joda.time.Period period9 = period3.plus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType13, chronology14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period15.toDurationFrom(readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant18, readableDuration19);
        org.joda.time.Period period22 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period24 = period22.minusYears((int) (byte) -1);
        org.joda.time.Period period25 = period20.withFields((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Period period27 = period22.withMinutes((int) (short) -1);
        org.joda.time.Period period28 = period15.plus((org.joda.time.ReadablePeriod) period27);
        org.joda.time.PeriodType periodType29 = period28.getPeriodType();
        org.joda.time.Period period30 = new org.joda.time.Period((long) (short) 0, periodType29);
        org.joda.time.Period period31 = period3.normalizedStandard(periodType29);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = period31.toDurationTo(readableInstant32);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(duration33);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        int int8 = period7.getMinutes();
        org.joda.time.Period period10 = period7.withMinutes(0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((java.lang.Object) period7, chronology11);
        org.joda.time.Days days13 = period7.toStandardDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(days13);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
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
        org.joda.time.Period period16 = period14.plusDays(0);
        int int17 = period14.getMillis();
        org.joda.time.Period period19 = period14.withWeeks((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
        org.joda.time.Period period18 = period15.minusDays(0);
        java.lang.String str19 = period15.toString();
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
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT1H0.010S" + "'", str19, "PT1H0.010S");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.joda.time.Period period1 = org.joda.time.Period.years((-1));
        org.joda.time.Period period3 = period1.withHours(0);
        org.joda.time.Period period5 = period3.withSeconds((int) (short) 10);
        org.joda.time.Period period7 = period5.minusMinutes((int) (byte) 100);
        org.joda.time.Period period9 = period5.withSeconds((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days10 = period5.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        int int2 = period1.getSeconds();
        int int3 = period1.getMonths();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        org.joda.time.Period period56 = period54.withMinutes((int) '4');
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
        org.junit.Assert.assertNotNull(period56);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) ' ', 0, (int) (short) 100, 100, (int) (byte) 10, 100, (-1), (int) (short) 100, periodType8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes10 = period9.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.joda.time.Period period5 = period1.plusHours((-1));
        org.joda.time.Period period7 = period5.plusYears((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period7.toDurationFrom(readableInstant8);
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration9);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
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
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period10, chronology12);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 11, (long) 35, chronology2);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(40);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 4, chronology1);
        org.joda.time.Period period4 = period2.minusYears(1);
        org.joda.time.Period period6 = period2.plusDays((int) (byte) 0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("P97YT-1H", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) -1, 11, (int) (byte) -1, (int) (byte) 0, (int) (byte) 10, 68, (int) (byte) 100, 52);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
        org.joda.time.Period period22 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationTo(readableInstant23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Period period29 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period30 = period29.negated();
        org.joda.time.PeriodType periodType31 = period30.getPeriodType();
        org.joda.time.Period period32 = new org.joda.time.Period((long) '4', (long) (short) 0, periodType31);
        org.joda.time.Period period33 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration24, readableInstant25, periodType31);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration24, readableInstant34);
        org.joda.time.Period period36 = period21.minus((org.joda.time.ReadablePeriod) period35);
        int int37 = period21.getHours();
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
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        int int8 = period7.getMinutes();
        org.joda.time.Period period10 = period7.withMinutes(0);
        int int11 = period7.getHours();
        int int12 = period7.getSeconds();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("PT10H", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 0, (long) 1, chronology2);
        org.joda.time.Period period4 = period3.negated();
        org.joda.time.Period period6 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period8 = period6.withMillis((int) (byte) 100);
        org.joda.time.Period period9 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationTo(readableInstant10);
        org.joda.time.Period period13 = period9.plusHours((-1));
        int int14 = period13.getSeconds();
        org.joda.time.Period period15 = period8.withFields((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period17 = period15.plusMillis((int) '#');
        org.joda.time.Period period19 = period17.plusMinutes((int) (short) -1);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType22, chronology23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period24.toDurationFrom(readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant27, readableDuration28);
        org.joda.time.Period period31 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period33 = period31.minusYears((int) (byte) -1);
        org.joda.time.Period period34 = period29.withFields((org.joda.time.ReadablePeriod) period31);
        org.joda.time.Period period36 = period31.withMinutes((int) (short) -1);
        org.joda.time.Period period37 = period24.plus((org.joda.time.ReadablePeriod) period36);
        org.joda.time.Period period38 = period19.plus((org.joda.time.ReadablePeriod) period37);
        org.joda.time.Period period40 = period37.plusYears(8);
        org.joda.time.Period period42 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period44 = period42.withMillis((int) (byte) 100);
        org.joda.time.Period period45 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Duration duration47 = period45.toDurationTo(readableInstant46);
        org.joda.time.Period period49 = period45.plusHours((-1));
        int int50 = period49.getSeconds();
        org.joda.time.Period period51 = period44.withFields((org.joda.time.ReadablePeriod) period49);
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.Period period61 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType60);
        org.joda.time.Period period63 = period61.withMillis((int) (short) 10);
        org.joda.time.Period period65 = period61.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType67 = period61.getFieldType((int) (short) 1);
        org.joda.time.Period period69 = period44.withField(durationFieldType67, 100);
        boolean boolean70 = period40.isSupported(durationFieldType67);
        boolean boolean71 = period4.isSupported(durationFieldType67);
        int[] intArray72 = period4.getValues();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(durationFieldType67);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new int[] { 0, 0, 0, 0, 0, 0, 0, (-1) });
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        java.lang.String str22 = period21.toString();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PT0.001S" + "'", str22, "PT0.001S");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 0);
        org.joda.time.Period period3 = period1.withDays((int) (short) 100);
        int int4 = period1.getMonths();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.joda.time.Period period2 = new org.joda.time.Period(0L, (long) (byte) 100);
        org.joda.time.Minutes minutes3 = period2.toStandardMinutes();
        org.joda.time.Period period5 = period2.minusHours(35);
        int[] intArray6 = period2.getValues();
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 100 });
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
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
        org.joda.time.Period period16 = period12.plusDays((int) (short) -1);
        org.joda.time.Period period18 = period16.withHours(68);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 97, (long) (byte) 100, chronology2);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        org.joda.time.Period period21 = new org.joda.time.Period(10L, (long) 35, periodType20);
        org.joda.time.Period period22 = new org.joda.time.Period((long) 1, (long) 0, periodType20);
        int int23 = period22.getMonths();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.lang.Object obj0 = null;
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableDuration17, readableInstant18, periodType19);
        org.joda.time.PeriodType periodType21 = period20.getPeriodType();
        org.joda.time.Period period22 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType21);
        org.joda.time.Period period23 = new org.joda.time.Period((-1), 0, (int) (short) 1, (int) '4', 10, (int) (byte) 0, 100, (int) (byte) 1, periodType21);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(obj0, periodType21, chronology24);
        org.junit.Assert.assertNotNull(periodType21);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.ReadableInstant readableInstant70 = null;
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
        org.joda.time.Period period88 = new org.joda.time.Period((long) (-1), (long) '#', periodType82, chronology87);
        org.joda.time.Period period89 = new org.joda.time.Period(readableInstant69, readableInstant70, periodType82);
        org.joda.time.Chronology chronology90 = null;
        org.joda.time.Period period91 = new org.joda.time.Period((long) 10, periodType82, chronology90);
        org.joda.time.Period period92 = period91.toPeriod();
        org.joda.time.Period period93 = period67.withFields((org.joda.time.ReadablePeriod) period92);
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
        org.junit.Assert.assertNotNull(periodType82);
        org.junit.Assert.assertNotNull(period92);
        org.junit.Assert.assertNotNull(period93);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("P100D", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period14.toDurationTo(readableInstant15);
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
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days92 = period16.toStandardDays();
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
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        org.joda.time.Period period6 = period4.withMillis((int) (short) 10);
        org.joda.time.Seconds seconds7 = period6.toStandardSeconds();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(seconds7);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        org.joda.time.Period period13 = period10.toPeriod();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT0.032S" + "'", str12, "PT0.032S");
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant18, readableDuration19);
        org.joda.time.Period period22 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period24 = period22.minusYears((int) (byte) -1);
        org.joda.time.Period period25 = period20.withFields((org.joda.time.ReadablePeriod) period22);
        int int26 = period25.getHours();
        org.joda.time.Period period28 = period25.withMinutes((int) (byte) 1);
        org.joda.time.Period period29 = period17.minus((org.joda.time.ReadablePeriod) period28);
        int int30 = period29.getHours();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.joda.time.Period period1 = org.joda.time.Period.months((-1));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.joda.time.Period period4 = new org.joda.time.Period(10, 4, 35, (int) '4');
        org.joda.time.Period period6 = period4.plusDays((int) (short) 0);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.withYears((int) (short) 10);
        org.joda.time.Period period8 = period4.withDays((int) (short) 100);
        org.joda.time.Period period10 = period8.plusYears(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes11 = period10.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
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
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.withYears((int) (short) 10);
        org.joda.time.Period period8 = period4.withDays((int) (short) 100);
        org.joda.time.Period period18 = new org.joda.time.Period((-1), (int) (byte) 10, 8, 1, (int) (byte) 10, 10, (int) (byte) 1, 1);
        org.joda.time.PeriodType periodType19 = period18.getPeriodType();
        org.joda.time.Period period20 = new org.joda.time.Period((long) (short) 100, periodType19);
        org.joda.time.Period period21 = period8.minus((org.joda.time.ReadablePeriod) period20);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(period21);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) 1);
        org.joda.time.Period period2 = period1.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod3 = period1.toMutablePeriod();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(mutablePeriod3);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 0);
        org.joda.time.MutablePeriod mutablePeriod2 = period1.toMutablePeriod();
        org.joda.time.Period period3 = period1.normalizedStandard();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = period3.getValue(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) '#');
        org.joda.time.MutablePeriod mutablePeriod2 = period1.toMutablePeriod();
        java.lang.Class<?> wildcardClass3 = mutablePeriod2.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.joda.time.Period period1 = org.joda.time.Period.hours((-35));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusDays((int) (byte) 10);
        org.joda.time.Period period6 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period7 = period6.negated();
        org.joda.time.PeriodType periodType8 = period7.getPeriodType();
        org.joda.time.Period period9 = new org.joda.time.Period((java.lang.Object) period4, periodType8);
        int int10 = period4.getMonths();
        org.joda.time.Days days11 = period4.toStandardDays();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(days11);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period11, periodType12);
        org.joda.time.Period period15 = period11.minusYears((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds16 = period11.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Seconds as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 100, chronology1);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.joda.time.Period period8 = new org.joda.time.Period((int) '#', 35, 68, 8, 0, 40, 68, (int) 'a');
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        org.joda.time.Period period25 = period22.normalizedStandard();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        boolean boolean58 = period17.isSupported(durationFieldType53);
        org.joda.time.MutablePeriod mutablePeriod59 = period17.toMutablePeriod();
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
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(mutablePeriod59);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period2 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period4 = period2.withMillis((int) (byte) 100);
        org.joda.time.Period period6 = period2.withMonths((int) ' ');
        org.joda.time.Period period8 = period2.withHours(100);
        int int9 = period8.getMinutes();
        org.joda.time.Period period11 = period8.withWeeks((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationFrom(readableInstant12);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableDuration30, readableInstant31, periodType32);
        org.joda.time.PeriodType periodType34 = period33.getPeriodType();
        org.joda.time.Period period35 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType34);
        org.joda.time.Period period36 = new org.joda.time.Period((-1), 0, (int) (short) 1, (int) '4', 10, (int) (byte) 0, 100, (int) (byte) 1, periodType34);
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration13, periodType34);
        java.lang.Class<?> wildcardClass38 = periodType34.getClass();
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) (byte) 0);
        org.joda.time.MutablePeriod mutablePeriod2 = period1.toMutablePeriod();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        org.joda.time.Period period23 = period2.withMonths((int) (byte) 1);
        org.joda.time.Period period25 = period23.plusMonths((int) (byte) 1);
        org.joda.time.Period period28 = new org.joda.time.Period((long) (short) 10, (long) (short) 0);
        org.joda.time.Period period29 = period28.negated();
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
        org.joda.time.Period period47 = period32.multipliedBy((int) (byte) 100);
        org.joda.time.Period period48 = period32.toPeriod();
        org.joda.time.Period period50 = org.joda.time.Period.minutes(35);
        org.joda.time.Period period53 = new org.joda.time.Period((long) (short) 10, (long) (short) 0);
        org.joda.time.Period period54 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.Duration duration56 = period54.toDurationTo(readableInstant55);
        org.joda.time.Period period58 = period54.plusHours((-1));
        int int59 = period58.getSeconds();
        org.joda.time.Period period61 = period58.withSeconds(10);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.ReadableDuration readableDuration63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period(readableInstant62, readableDuration63);
        org.joda.time.Period period66 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period68 = period66.minusYears((int) (byte) -1);
        org.joda.time.Period period69 = period64.withFields((org.joda.time.ReadablePeriod) period66);
        int[] intArray70 = period64.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter71 = null;
        java.lang.String str72 = period64.toString(periodFormatter71);
        org.joda.time.PeriodType periodType81 = null;
        org.joda.time.Period period82 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType81);
        org.joda.time.Period period84 = period82.withMillis((int) (short) 10);
        org.joda.time.Period period86 = period82.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType88 = period82.getFieldType((int) (short) 1);
        org.joda.time.Period period90 = period64.withField(durationFieldType88, (int) (short) 10);
        org.joda.time.Period period92 = period61.withFieldAdded(durationFieldType88, (int) (byte) 10);
        int int93 = period53.indexOf(durationFieldType88);
        boolean boolean94 = period50.isSupported(durationFieldType88);
        org.joda.time.Period period96 = period32.withField(durationFieldType88, (int) '4');
        int int97 = period28.get(durationFieldType88);
        org.joda.time.Period period99 = period23.withField(durationFieldType88, 8);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
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
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "PT0S" + "'", str72, "PT0S");
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(durationFieldType88);
        org.junit.Assert.assertNotNull(period90);
        org.junit.Assert.assertNotNull(period92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 1 + "'", int93 == 1);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(period96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertNotNull(period99);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationTo(readableInstant23);
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant21, (org.joda.time.ReadableDuration) duration24);
        int int26 = period25.size();
        org.joda.time.Period period28 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period30 = period28.withMillis((int) (byte) 100);
        org.joda.time.Period period31 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = period31.toDurationTo(readableInstant32);
        org.joda.time.Period period35 = period31.plusHours((-1));
        int int36 = period35.getSeconds();
        org.joda.time.Period period37 = period30.withFields((org.joda.time.ReadablePeriod) period35);
        org.joda.time.Period period39 = period35.withMinutes((int) (short) 0);
        org.joda.time.Period period41 = period35.withMinutes(10);
        org.joda.time.Period period43 = period35.minusHours(100);
        org.joda.time.Period period44 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks45 = period44.toStandardWeeks();
        org.joda.time.Period period46 = period44.negated();
        org.joda.time.Period period48 = org.joda.time.Period.seconds(0);
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType57);
        org.joda.time.Period period60 = period58.withMillis((int) (short) 10);
        org.joda.time.Period period62 = period58.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType64 = period58.getFieldType((int) (short) 1);
        int int65 = period48.indexOf(durationFieldType64);
        org.joda.time.Period period67 = period46.withFieldAdded(durationFieldType64, (int) 'a');
        org.joda.time.Period period69 = period35.withFieldAdded(durationFieldType64, 0);
        org.joda.time.Period period71 = period25.withField(durationFieldType64, (int) (byte) 1);
        org.joda.time.Period period73 = period20.withFieldAdded(durationFieldType64, 0);
        int int74 = period73.getSeconds();
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
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(weeks45);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(durationFieldType64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) (short) 100);
        org.joda.time.Period period3 = period1.plusSeconds(35);
        int int4 = period3.getWeeks();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((-1L), 0L, chronology2);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
        org.joda.time.Duration duration15 = period14.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period19 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period21 = period19.minusYears((int) (byte) -1);
        org.joda.time.Duration duration22 = period19.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableDuration26, readableInstant27, periodType28);
        org.joda.time.PeriodType periodType30 = period29.getPeriodType();
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant24, readableInstant25, periodType30);
        org.joda.time.Period period32 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration22, readableInstant23, periodType30);
        org.joda.time.Period period33 = new org.joda.time.Period((long) 0, periodType30);
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration15, readableInstant16, periodType30);
        java.lang.Class<?> wildcardClass35 = duration15.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
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
        org.joda.time.Period period21 = org.joda.time.Period.years((-1));
        org.joda.time.Period period23 = period21.withHours(0);
        org.joda.time.Period period24 = period23.toPeriod();
        org.joda.time.Period period25 = period17.minus((org.joda.time.ReadablePeriod) period24);
        org.joda.time.Period period27 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period28 = period27.negated();
        org.joda.time.Period period30 = period27.minusDays((-1));
        org.joda.time.Period period32 = period30.plusWeeks(0);
        org.joda.time.Period period34 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period36 = period34.withMillis((int) (byte) 100);
        org.joda.time.Period period38 = period36.plusSeconds((int) ' ');
        org.joda.time.Period period40 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period42 = period40.withMillis((int) (byte) 100);
        org.joda.time.Period period43 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = period43.toDurationTo(readableInstant44);
        org.joda.time.Period period47 = period43.plusHours((-1));
        int int48 = period47.getSeconds();
        org.joda.time.Period period49 = period42.withFields((org.joda.time.ReadablePeriod) period47);
        org.joda.time.Period period51 = period47.withMinutes((int) (short) 0);
        org.joda.time.Period period53 = period47.withMinutes(10);
        org.joda.time.Period period55 = period47.minusHours(100);
        org.joda.time.Period period56 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks57 = period56.toStandardWeeks();
        org.joda.time.Period period58 = period56.negated();
        org.joda.time.Period period60 = org.joda.time.Period.seconds(0);
        org.joda.time.PeriodType periodType69 = null;
        org.joda.time.Period period70 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType69);
        org.joda.time.Period period72 = period70.withMillis((int) (short) 10);
        org.joda.time.Period period74 = period70.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType76 = period70.getFieldType((int) (short) 1);
        int int77 = period60.indexOf(durationFieldType76);
        org.joda.time.Period period79 = period58.withFieldAdded(durationFieldType76, (int) 'a');
        org.joda.time.Period period81 = period47.withFieldAdded(durationFieldType76, 0);
        org.joda.time.Period period83 = period36.withField(durationFieldType76, 0);
        int int84 = period30.get(durationFieldType76);
        org.joda.time.Period period86 = period25.withFieldAdded(durationFieldType76, (int) (short) 0);
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
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(weeks57);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(durationFieldType76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(period86);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.joda.time.Period period5 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period7 = period5.withMillis((int) (byte) 100);
        org.joda.time.Period period8 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period8.toDurationTo(readableInstant9);
        org.joda.time.Period period12 = period8.plusHours((-1));
        int int13 = period12.getSeconds();
        org.joda.time.Period period14 = period7.withFields((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Period period16 = period14.withMonths(1);
        org.joda.time.Period period18 = period16.multipliedBy((-1));
        org.joda.time.PeriodType periodType19 = period16.getPeriodType();
        org.joda.time.Period period20 = new org.joda.time.Period((long) ' ', (long) (byte) 1, periodType19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) ' ', (long) (byte) -1, periodType19, chronology21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationTo(readableInstant23);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(duration24);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) (byte) 1);
        org.joda.time.Period period3 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period5 = period3.plusYears((int) '#');
        org.joda.time.Period period6 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationTo(readableInstant7);
        org.joda.time.DurationFieldType durationFieldType9 = null;
        int int10 = period6.get(durationFieldType9);
        org.joda.time.Period period11 = period5.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period13 = period6.minusWeeks((int) '4');
        org.joda.time.Period period14 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period14.toDurationTo(readableInstant15);
        org.joda.time.Period period18 = period14.plusHours((-1));
        int int19 = period18.getSeconds();
        org.joda.time.Period period21 = period18.withSeconds(10);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant22, readableDuration23);
        org.joda.time.Period period26 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period28 = period26.minusYears((int) (byte) -1);
        org.joda.time.Period period29 = period24.withFields((org.joda.time.ReadablePeriod) period26);
        int[] intArray30 = period24.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter31 = null;
        java.lang.String str32 = period24.toString(periodFormatter31);
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType41);
        org.joda.time.Period period44 = period42.withMillis((int) (short) 10);
        org.joda.time.Period period46 = period42.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType48 = period42.getFieldType((int) (short) 1);
        org.joda.time.Period period50 = period24.withField(durationFieldType48, (int) (short) 10);
        org.joda.time.Period period52 = period21.withFieldAdded(durationFieldType48, (int) (byte) 10);
        org.joda.time.Period period53 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Duration duration55 = period53.toDurationTo(readableInstant54);
        org.joda.time.Period period57 = period53.plusHours((-1));
        org.joda.time.Period period59 = period57.plusYears((int) (short) -1);
        org.joda.time.Period period61 = period57.plusMillis((int) ' ');
        org.joda.time.MutablePeriod mutablePeriod62 = period61.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.ReadableDuration readableDuration64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period(readableInstant63, readableDuration64);
        org.joda.time.Period period67 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period69 = period67.minusYears((int) (byte) -1);
        org.joda.time.Period period70 = period65.withFields((org.joda.time.ReadablePeriod) period67);
        int[] intArray71 = period65.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter72 = null;
        java.lang.String str73 = period65.toString(periodFormatter72);
        org.joda.time.PeriodType periodType82 = null;
        org.joda.time.Period period83 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType82);
        org.joda.time.Period period85 = period83.withMillis((int) (short) 10);
        org.joda.time.Period period87 = period83.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType89 = period83.getFieldType((int) (short) 1);
        org.joda.time.Period period91 = period65.withField(durationFieldType89, (int) (short) 10);
        int int92 = period61.get(durationFieldType89);
        boolean boolean93 = period21.isSupported(durationFieldType89);
        org.joda.time.Period period95 = period13.withField(durationFieldType89, (-1));
        int int96 = period1.indexOf(durationFieldType89);
        org.joda.time.Period period98 = period1.withMinutes(11);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PT0S" + "'", str32, "PT0S");
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(durationFieldType48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(mutablePeriod62);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "PT0S" + "'", str73, "PT0S");
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNotNull(durationFieldType89);
        org.junit.Assert.assertNotNull(period91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(period95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 1 + "'", int96 == 1);
        org.junit.Assert.assertNotNull(period98);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType19 = period4.getFieldType((int) ' ');
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
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) (short) 1, chronology3);
        org.joda.time.Period period8 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period10 = period8.minusYears((int) (byte) -1);
        org.joda.time.Duration duration11 = period8.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableDuration15, readableInstant16, periodType17);
        org.joda.time.PeriodType periodType19 = period18.getPeriodType();
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant13, readableInstant14, periodType19);
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration11, readableInstant12, periodType19);
        org.joda.time.Period period22 = new org.joda.time.Period(1L, (long) (short) 10, periodType19);
        org.joda.time.Period period23 = period4.withPeriodType(periodType19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period24 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(period23);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.Period period13 = period9.plusYears((int) (byte) 10);
        org.joda.time.Period period14 = period13.normalizedStandard();
        org.joda.time.DurationFieldType[] durationFieldTypeArray15 = period13.getFieldTypes();
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(durationFieldTypeArray15);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        org.joda.time.Weeks weeks22 = period19.toStandardWeeks();
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
        org.junit.Assert.assertNotNull(weeks22);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.joda.time.Period period8 = new org.joda.time.Period(8, (int) (byte) 1, (int) (byte) 100, 40, 52, 1, (int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 100, (long) 32, chronology2);
        int int4 = period3.getSeconds();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 35, (long) 10, chronology2);
        int int4 = period3.getHours();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (byte) 10);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 'a', chronology1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationTo(readableInstant3);
        java.lang.Class<?> wildcardClass5 = period2.getClass();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
        int int20 = period19.getMonths();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
        org.joda.time.Period period18 = period15.minusDays(0);
        org.joda.time.Period period20 = period18.minusMillis((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        org.joda.time.Period period9 = period7.withYears((int) ' ');
        org.joda.time.Period period11 = period9.withMonths((-1));
        org.joda.time.Period period13 = period9.plusMillis((int) (short) 1);
        org.joda.time.Period period15 = period13.withYears(52);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.joda.time.Period period1 = org.joda.time.Period.months(100);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period6 = period4.minusYears((int) (byte) -1);
        org.joda.time.Period period7 = period2.withFields((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period9 = period7.minusMillis(35);
        org.joda.time.Period period11 = period9.withDays((int) ' ');
        org.joda.time.DurationFieldType[] durationFieldTypeArray12 = period11.getFieldTypes();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldTypeArray12);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusDays((int) (byte) 10);
        org.joda.time.Period period6 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period7 = period6.negated();
        org.joda.time.PeriodType periodType8 = period7.getPeriodType();
        org.joda.time.Period period9 = new org.joda.time.Period((java.lang.Object) period4, periodType8);
        org.joda.time.Period period11 = period4.plusWeeks((int) (short) 1);
        org.joda.time.Period period13 = period4.withMillis((int) (byte) -1);
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
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("P350Y1120M-35WT1225H3500M350.035S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) 10, (int) 'a', 8, 35, (int) (short) -1, (int) (short) 1, (int) (short) 100, 10);
        org.joda.time.Period period10 = period8.withMonths((int) '4');
        org.joda.time.Period period12 = period8.withMillis(0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-1), (long) (short) -1);
        org.joda.time.Period period4 = period2.plusWeeks(0);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.joda.time.Period period8 = new org.joda.time.Period(8, 0, 0, 40, (-1), 68, 52, (int) (byte) -1);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks1 = period0.toStandardWeeks();
        org.joda.time.Period period3 = period0.plusYears((-1));
        int int4 = period3.getWeeks();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableDuration3, readableInstant4, periodType5);
        org.joda.time.PeriodType periodType7 = period6.getPeriodType();
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant1, readableInstant2, periodType7);
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', periodType7);
        org.joda.time.Period period11 = period9.withWeeks(8);
        org.joda.time.DurationFieldType[] durationFieldTypeArray12 = period11.getFieldTypes();
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldTypeArray12);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        int int16 = period15.getMonths();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableDuration6, readableInstant7, periodType8);
        org.joda.time.PeriodType periodType10 = period9.getPeriodType();
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant4, readableInstant5, periodType10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) (byte) -1, (long) (byte) 1, periodType10, chronology12);
        org.joda.time.Period period14 = new org.joda.time.Period((long) (short) 1, (long) (short) -1, periodType10);
        org.joda.time.Period period16 = period14.plusMinutes((int) (byte) 1);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks1 = period0.toStandardWeeks();
        org.joda.time.Period period3 = period0.plusYears((-1));
        org.joda.time.Period period4 = period3.normalizedStandard();
        org.joda.time.Period period6 = period3.minusMinutes((int) (byte) 100);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        org.joda.time.Period period74 = period1.plusHours(35);
        int int75 = period74.getWeeks();
        java.lang.String str76 = period74.toString();
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
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "PT35H" + "'", str76, "PT35H");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (byte) 100);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        org.joda.time.Period period93 = period16.multipliedBy(97);
        org.joda.time.Period period95 = period93.plusSeconds(52);
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
        org.junit.Assert.assertNotNull(period93);
        org.junit.Assert.assertNotNull(period95);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
        org.joda.time.Period period21 = period17.plusSeconds((int) '4');
        int int22 = period21.getHours();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.joda.time.Period period1 = org.joda.time.Period.days(1);
        org.joda.time.Period period3 = period1.plusDays((int) (short) 100);
        org.joda.time.Period period4 = period3.toPeriod();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
        int int18 = period16.getMinutes();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        org.joda.time.Period period21 = period3.minusYears((int) (byte) 1);
        org.joda.time.Period period22 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks23 = period22.toStandardWeeks();
        org.joda.time.Period period24 = period22.negated();
        org.joda.time.Period period26 = period24.plusMillis(0);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Period period29 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period31 = period29.withMillis((int) (byte) 100);
        org.joda.time.Period period33 = period29.withMonths((int) ' ');
        org.joda.time.Period period35 = period29.withHours(100);
        int int36 = period35.getMinutes();
        org.joda.time.Period period38 = period35.withWeeks((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = period38.toDurationFrom(readableInstant39);
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period(readableDuration57, readableInstant58, periodType59);
        org.joda.time.PeriodType periodType61 = period60.getPeriodType();
        org.joda.time.Period period62 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType61);
        org.joda.time.Period period63 = new org.joda.time.Period((-1), 0, (int) (short) 1, (int) '4', 10, (int) (byte) 0, 100, (int) (byte) 1, periodType61);
        org.joda.time.Period period64 = new org.joda.time.Period(readableInstant27, (org.joda.time.ReadableDuration) duration40, periodType61);
        org.joda.time.Period period65 = period24.normalizedStandard(periodType61);
        org.joda.time.Chronology chronology66 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period67 = new org.joda.time.Period((java.lang.Object) (byte) 1, periodType61, chronology66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Byte");
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
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(periodType61);
        org.junit.Assert.assertNotNull(period65);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 8);
        org.joda.time.Period period3 = period1.plusWeeks((int) (short) 1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Period period7 = period3.minusMinutes((int) '4');
        org.joda.time.Period period9 = period7.minusSeconds((int) '4');
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.joda.time.Period period1 = org.joda.time.Period.hours(40);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.withYears((int) (short) 10);
        org.joda.time.Period period8 = period4.withDays((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = period8.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("P4DT4H", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.joda.time.Period period1 = org.joda.time.Period.millis(68);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        org.joda.time.Period period36 = period33.minusMinutes(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days37 = period36.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
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
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = period0.plusHours((-1));
        org.joda.time.Period period6 = period4.withMillis((int) (short) 1);
        org.joda.time.Period period8 = period4.minusMinutes((int) (short) 0);
        int int9 = period8.getMinutes();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Period period3 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period5 = period3.withMillis((int) (byte) 100);
        org.joda.time.Period period6 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationTo(readableInstant7);
        org.joda.time.Period period10 = period6.plusHours((-1));
        int int11 = period10.getSeconds();
        org.joda.time.Period period12 = period5.withFields((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Period period14 = period10.withMinutes((int) (short) 0);
        org.joda.time.Period period16 = period10.withMinutes(10);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period10.toDurationFrom(readableInstant17);
        org.joda.time.Period period19 = period10.toPeriod();
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType22, chronology23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period24.toDurationFrom(readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant27, readableDuration28);
        org.joda.time.Period period31 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period33 = period31.minusYears((int) (byte) -1);
        org.joda.time.Period period34 = period29.withFields((org.joda.time.ReadablePeriod) period31);
        org.joda.time.Period period36 = period31.withMinutes((int) (short) -1);
        org.joda.time.Period period37 = period24.plus((org.joda.time.ReadablePeriod) period36);
        org.joda.time.PeriodType periodType38 = period37.getPeriodType();
        org.joda.time.Period period39 = new org.joda.time.Period((java.lang.Object) period10, periodType38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period40 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(periodType38);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        int int23 = period22.getDays();
        org.joda.time.Period period24 = new org.joda.time.Period((java.lang.Object) period22);
        org.joda.time.Period period26 = period22.plusMonths(11);
        int int27 = period26.size();
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        int int19 = period18.getWeeks();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = period18.getValue(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 1, 10L, periodType4, chronology5);
        org.joda.time.Period period8 = period6.plusWeeks((int) (byte) -1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) 0, (long) 1, chronology11);
        org.joda.time.Period period13 = period12.negated();
        org.joda.time.Period period15 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period17 = period15.withMillis((int) (byte) 100);
        org.joda.time.Period period18 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = period18.toDurationTo(readableInstant19);
        org.joda.time.Period period22 = period18.plusHours((-1));
        int int23 = period22.getSeconds();
        org.joda.time.Period period24 = period17.withFields((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Period period26 = period24.plusMillis((int) '#');
        org.joda.time.Period period28 = period26.plusMinutes((int) (short) -1);
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType31, chronology32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Duration duration35 = period33.toDurationFrom(readableInstant34);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant36, readableDuration37);
        org.joda.time.Period period40 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period42 = period40.minusYears((int) (byte) -1);
        org.joda.time.Period period43 = period38.withFields((org.joda.time.ReadablePeriod) period40);
        org.joda.time.Period period45 = period40.withMinutes((int) (short) -1);
        org.joda.time.Period period46 = period33.plus((org.joda.time.ReadablePeriod) period45);
        org.joda.time.Period period47 = period28.plus((org.joda.time.ReadablePeriod) period46);
        org.joda.time.Period period49 = period46.plusYears(8);
        org.joda.time.Period period51 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period53 = period51.withMillis((int) (byte) 100);
        org.joda.time.Period period54 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.Duration duration56 = period54.toDurationTo(readableInstant55);
        org.joda.time.Period period58 = period54.plusHours((-1));
        int int59 = period58.getSeconds();
        org.joda.time.Period period60 = period53.withFields((org.joda.time.ReadablePeriod) period58);
        org.joda.time.PeriodType periodType69 = null;
        org.joda.time.Period period70 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType69);
        org.joda.time.Period period72 = period70.withMillis((int) (short) 10);
        org.joda.time.Period period74 = period70.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType76 = period70.getFieldType((int) (short) 1);
        org.joda.time.Period period78 = period53.withField(durationFieldType76, 100);
        boolean boolean79 = period49.isSupported(durationFieldType76);
        boolean boolean80 = period13.isSupported(durationFieldType76);
        org.joda.time.Period period82 = period6.withField(durationFieldType76, 100);
        org.joda.time.ReadableInstant readableInstant87 = null;
        org.joda.time.ReadableInstant readableInstant88 = null;
        org.joda.time.ReadableDuration readableDuration89 = null;
        org.joda.time.ReadableInstant readableInstant90 = null;
        org.joda.time.PeriodType periodType91 = null;
        org.joda.time.Period period92 = new org.joda.time.Period(readableDuration89, readableInstant90, periodType91);
        org.joda.time.PeriodType periodType93 = period92.getPeriodType();
        org.joda.time.Period period94 = new org.joda.time.Period(readableInstant87, readableInstant88, periodType93);
        org.joda.time.Chronology chronology95 = null;
        org.joda.time.Period period96 = new org.joda.time.Period((long) (byte) -1, (long) (byte) 1, periodType93, chronology95);
        org.joda.time.Period period97 = new org.joda.time.Period((long) (short) 1, (long) (short) -1, periodType93);
        org.joda.time.Period period98 = period6.withPeriodType(periodType93);
        org.joda.time.Period period99 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType93);
        org.junit.Assert.assertNotNull(period8);
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
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(durationFieldType76);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(periodType93);
        org.junit.Assert.assertNotNull(period98);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.minusMillis((int) (short) 0);
        org.joda.time.Minutes minutes4 = period1.toStandardMinutes();
        org.joda.time.Period period6 = period1.minusYears((int) (byte) -1);
        org.joda.time.Period period8 = period1.plusYears((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int10 = period8.getValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', chronology2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationTo(readableInstant4);
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period9 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period10 = period9.negated();
        org.joda.time.PeriodType periodType11 = period10.getPeriodType();
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration5, readableInstant7, periodType11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period14 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period14.toDurationTo(readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Period period21 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period22 = period21.negated();
        org.joda.time.PeriodType periodType23 = period22.getPeriodType();
        org.joda.time.Period period24 = new org.joda.time.Period((long) '4', (long) (short) 0, periodType23);
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration16, readableInstant17, periodType23);
        org.joda.time.Period period26 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration5, readableInstant13, periodType23);
        int int27 = period26.getSeconds();
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.joda.time.Period period1 = org.joda.time.Period.years(1);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = new org.joda.time.Period((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.Period period13 = period9.plusYears((int) (byte) 10);
        org.joda.time.Period period14 = period13.normalizedStandard();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.Period period16 = period13.minus(readablePeriod15);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMinutes((int) (byte) 0);
        org.joda.time.MutablePeriod mutablePeriod6 = period5.toMutablePeriod();
        org.joda.time.Period period7 = period5.normalizedStandard();
        int int8 = period5.getMillis();
        org.joda.time.Period period9 = new org.joda.time.Period((java.lang.Object) period5);
        org.joda.time.format.PeriodFormatter periodFormatter10 = null;
        java.lang.String str11 = period9.toString(periodFormatter10);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT0S" + "'", str11, "PT0S");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
        org.joda.time.Period period21 = period17.plusSeconds((int) '4');
        org.joda.time.Period period23 = period17.minusMillis(0);
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
        org.junit.Assert.assertNotNull(period23);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) -1, (int) (byte) 1, (int) (short) 10, 1, (int) (byte) 100, (int) (short) 10, (int) (short) 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType10 = period8.getFieldType(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.plusYears((int) '#');
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) 10, (int) (byte) 100, (int) '#', (int) (byte) 10);
        org.joda.time.Period period9 = period3.plus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period11 = period3.withYears((int) (short) 0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (short) 100);
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
        org.joda.time.Period period35 = period16.plus((org.joda.time.ReadablePeriod) period34);
        org.joda.time.Period period37 = period16.withWeeks(100);
        org.joda.time.Period period38 = period1.minus((org.joda.time.ReadablePeriod) period16);
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
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period38);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(1);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("P35YT-1S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period11, periodType12);
        org.joda.time.Period period15 = period13.withMinutes(10);
        org.joda.time.Period period17 = period13.plusSeconds(97);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = period17.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("PT0.001S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period2 = period1.negated();
        org.joda.time.Period period4 = period1.minusDays((-1));
        org.joda.time.Period period6 = period4.plusWeeks(0);
        org.joda.time.Period period8 = period6.minusMinutes((int) (short) 10);
        org.joda.time.Minutes minutes9 = period6.toStandardMinutes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(minutes9);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period3.plusSeconds((int) ' ');
        org.joda.time.Period period7 = period5.minusHours((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType9 = period5.getFieldType(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        org.joda.time.Period period14 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period16 = period14.withMillis((int) (byte) 100);
        org.joda.time.Period period18 = period14.withMonths((int) ' ');
        org.joda.time.Period period20 = period14.withDays((int) '4');
        boolean boolean21 = period12.equals((java.lang.Object) '4');
        org.joda.time.Period period23 = period12.withYears((int) (byte) 0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(period23);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (-1L), chronology2);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        org.joda.time.Period period6 = period4.withWeeks(0);
        org.joda.time.Period period8 = period4.plusHours((int) (short) 10);
        org.joda.time.Hours hours9 = period4.toStandardHours();
        int int10 = period4.size();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
        org.joda.time.Period period23 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period24 = period23.negated();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableDuration26, readableInstant27, periodType28);
        org.joda.time.PeriodType periodType30 = period29.getPeriodType();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((long) (byte) 10, periodType30, chronology31);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((java.lang.Object) period24, periodType30, chronology33);
        org.joda.time.Period period35 = period21.minus((org.joda.time.ReadablePeriod) period24);
        int int36 = period35.size();
        org.joda.time.Period period38 = period35.plusHours(4);
        int int39 = period35.getMonths();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8 + "'", int36 == 8);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.joda.time.Period period1 = org.joda.time.Period.hours(35);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 10, (long) (short) 0);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        org.joda.time.DurationFieldType[] durationFieldTypeArray8 = period1.getFieldTypes();
        org.joda.time.Period period10 = period1.minusSeconds((int) (byte) 1);
        org.joda.time.Period period12 = period1.plusWeeks((int) (short) 1);
        org.joda.time.format.PeriodFormatter periodFormatter13 = null;
        java.lang.String str14 = period1.toString(periodFormatter13);
        java.lang.Class<?> wildcardClass15 = period1.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(durationFieldTypeArray8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT0S" + "'", str14, "PT0S");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        org.joda.time.Period period13 = period9.plusYears((int) (byte) 10);
        org.joda.time.Period period15 = period13.withHours((int) (short) 1);
        org.joda.time.Period period17 = period13.withWeeks((int) (short) 0);
        org.joda.time.Period period19 = period17.minusDays(0);
        org.joda.time.Period period21 = period17.minusYears((int) (byte) 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        org.joda.time.Period period34 = period11.minusDays((int) (short) 1);
        org.joda.time.Period period36 = period11.plusWeeks(35);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
        org.joda.time.Period period43 = period41.plusYears(97);
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
        org.junit.Assert.assertNotNull(period43);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 0, chronology1);
        org.joda.time.Period period4 = period2.multipliedBy(0);
        org.joda.time.Period period6 = period4.withMonths(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType8 = period6.getFieldType((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
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
        org.joda.time.PeriodType periodType20 = period19.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period21 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType20);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("P10WT-1H", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.joda.time.Period period1 = org.joda.time.Period.months(97);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) -1, chronology1);
        int int3 = period2.getMonths();
        org.joda.time.Duration duration4 = period2.toStandardDuration();
        org.joda.time.Hours hours5 = period2.toStandardHours();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(hours5);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 97, (long) 35, periodType2);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (byte) 0, (int) (byte) -1, 35, 8);
        org.joda.time.Period period6 = period4.withSeconds((int) (byte) 100);
        int int7 = period4.getSeconds();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
        org.joda.time.Duration duration18 = period17.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period22 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period24 = period22.minusYears((int) (byte) -1);
        org.joda.time.Duration duration25 = period22.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableDuration29, readableInstant30, periodType31);
        org.joda.time.PeriodType periodType33 = period32.getPeriodType();
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant27, readableInstant28, periodType33);
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration25, readableInstant26, periodType33);
        org.joda.time.Period period36 = new org.joda.time.Period((long) 0, periodType33);
        org.joda.time.Period period37 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration18, readableInstant19, periodType33);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((long) 8, periodType33, chronology38);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((long) 32, (long) 4, periodType33, chronology40);
        org.joda.time.Period period43 = org.joda.time.Period.minutes(35);
        org.joda.time.Period period46 = new org.joda.time.Period((long) (short) 10, (long) (short) 0);
        org.joda.time.Period period47 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Duration duration49 = period47.toDurationTo(readableInstant48);
        org.joda.time.Period period51 = period47.plusHours((-1));
        int int52 = period51.getSeconds();
        org.joda.time.Period period54 = period51.withSeconds(10);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant55, readableDuration56);
        org.joda.time.Period period59 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period61 = period59.minusYears((int) (byte) -1);
        org.joda.time.Period period62 = period57.withFields((org.joda.time.ReadablePeriod) period59);
        int[] intArray63 = period57.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter64 = null;
        java.lang.String str65 = period57.toString(periodFormatter64);
        org.joda.time.PeriodType periodType74 = null;
        org.joda.time.Period period75 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType74);
        org.joda.time.Period period77 = period75.withMillis((int) (short) 10);
        org.joda.time.Period period79 = period75.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType81 = period75.getFieldType((int) (short) 1);
        org.joda.time.Period period83 = period57.withField(durationFieldType81, (int) (short) 10);
        org.joda.time.Period period85 = period54.withFieldAdded(durationFieldType81, (int) (byte) 10);
        int int86 = period46.indexOf(durationFieldType81);
        boolean boolean87 = period43.isSupported(durationFieldType81);
        org.joda.time.Period period89 = period41.withFieldAdded(durationFieldType81, 97);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "PT0S" + "'", str65, "PT0S");
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(durationFieldType81);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(period89);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.joda.time.Period period4 = new org.joda.time.Period(1, 0, (int) (short) 1, (int) (short) 10);
        int[] intArray5 = period4.getValues();
        java.lang.Class<?> wildcardClass6 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 0, 0, 0, 1, 0, 1, 10 });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        int int96 = period94.getMillis();
        java.lang.Class<?> wildcardClass97 = period94.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableDuration16, readableInstant17, periodType18);
        org.joda.time.PeriodType periodType20 = period19.getPeriodType();
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant14, readableInstant15, periodType20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) (byte) -1, (long) (byte) 1, periodType20, chronology22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) 35, (long) 35, periodType20, chronology24);
        org.joda.time.Period period26 = new org.joda.time.Period(100, 97, 35, 1, (int) (short) 10, (int) '4', (int) (short) 0, 100, periodType20);
        org.joda.time.Period period27 = new org.joda.time.Period((long) (byte) -1, (long) 40, periodType20);
        org.junit.Assert.assertNotNull(periodType20);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) 1, 10L, periodType2, chronology3);
        org.joda.time.Period period6 = period4.plusWeeks((int) (byte) -1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) 0, (long) 1, chronology9);
        org.joda.time.Period period11 = period10.negated();
        org.joda.time.Period period13 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period15 = period13.withMillis((int) (byte) 100);
        org.joda.time.Period period16 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationTo(readableInstant17);
        org.joda.time.Period period20 = period16.plusHours((-1));
        int int21 = period20.getSeconds();
        org.joda.time.Period period22 = period15.withFields((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Period period24 = period22.plusMillis((int) '#');
        org.joda.time.Period period26 = period24.plusMinutes((int) (short) -1);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) ' ', (long) (short) 100, periodType29, chronology30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = period31.toDurationFrom(readableInstant32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant34, readableDuration35);
        org.joda.time.Period period38 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period40 = period38.minusYears((int) (byte) -1);
        org.joda.time.Period period41 = period36.withFields((org.joda.time.ReadablePeriod) period38);
        org.joda.time.Period period43 = period38.withMinutes((int) (short) -1);
        org.joda.time.Period period44 = period31.plus((org.joda.time.ReadablePeriod) period43);
        org.joda.time.Period period45 = period26.plus((org.joda.time.ReadablePeriod) period44);
        org.joda.time.Period period47 = period44.plusYears(8);
        org.joda.time.Period period49 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period51 = period49.withMillis((int) (byte) 100);
        org.joda.time.Period period52 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Duration duration54 = period52.toDurationTo(readableInstant53);
        org.joda.time.Period period56 = period52.plusHours((-1));
        int int57 = period56.getSeconds();
        org.joda.time.Period period58 = period51.withFields((org.joda.time.ReadablePeriod) period56);
        org.joda.time.PeriodType periodType67 = null;
        org.joda.time.Period period68 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType67);
        org.joda.time.Period period70 = period68.withMillis((int) (short) 10);
        org.joda.time.Period period72 = period68.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType74 = period68.getFieldType((int) (short) 1);
        org.joda.time.Period period76 = period51.withField(durationFieldType74, 100);
        boolean boolean77 = period47.isSupported(durationFieldType74);
        boolean boolean78 = period11.isSupported(durationFieldType74);
        org.joda.time.Period period80 = period4.withField(durationFieldType74, 100);
        org.joda.time.ReadableInstant readableInstant85 = null;
        org.joda.time.ReadableInstant readableInstant86 = null;
        org.joda.time.ReadableDuration readableDuration87 = null;
        org.joda.time.ReadableInstant readableInstant88 = null;
        org.joda.time.PeriodType periodType89 = null;
        org.joda.time.Period period90 = new org.joda.time.Period(readableDuration87, readableInstant88, periodType89);
        org.joda.time.PeriodType periodType91 = period90.getPeriodType();
        org.joda.time.Period period92 = new org.joda.time.Period(readableInstant85, readableInstant86, periodType91);
        org.joda.time.Chronology chronology93 = null;
        org.joda.time.Period period94 = new org.joda.time.Period((long) (byte) -1, (long) (byte) 1, periodType91, chronology93);
        org.joda.time.Period period95 = new org.joda.time.Period((long) (short) 1, (long) (short) -1, periodType91);
        org.joda.time.Period period96 = period4.withPeriodType(periodType91);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType98 = period4.getFieldType(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(durationFieldType74);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(periodType91);
        org.junit.Assert.assertNotNull(period96);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        org.joda.time.MutablePeriod mutablePeriod19 = period17.toMutablePeriod();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(mutablePeriod19);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) 100);
        org.joda.time.Period period5 = period1.withMonths((int) ' ');
        org.joda.time.Period period7 = period1.withHours(100);
        org.joda.time.Period period9 = period1.withDays((int) (short) -1);
        org.joda.time.Minutes minutes10 = period1.toStandardMinutes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType12 = period1.getFieldType((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(minutes10);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours15 = period12.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Hours as this period contains months and months vary in length");
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
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        org.joda.time.Period period22 = period20.withMinutes((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType24 = period22.getFieldType(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = org.joda.time.Period.ZERO;
        org.joda.time.Period period5 = period3.plusHours(100);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationFrom(readableInstant6);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration7, periodType8);
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration7, periodType10);
        org.joda.time.Period period13 = period11.minusMonths(10);
        org.joda.time.Period period15 = period13.withSeconds((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period13.toDurationFrom(readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period20 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period22 = period20.withMillis((int) (byte) 100);
        org.joda.time.Period period24 = period20.withMonths((int) ' ');
        org.joda.time.Period period26 = period20.withHours(100);
        int int27 = period26.getMinutes();
        org.joda.time.Period period29 = period26.withWeeks((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = period29.toDurationFrom(readableInstant30);
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period(readableDuration48, readableInstant49, periodType50);
        org.joda.time.PeriodType periodType52 = period51.getPeriodType();
        org.joda.time.Period period53 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType52);
        org.joda.time.Period period54 = new org.joda.time.Period((-1), 0, (int) (short) 1, (int) '4', 10, (int) (byte) 0, 100, (int) (byte) 1, periodType52);
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant18, (org.joda.time.ReadableDuration) duration31, periodType52);
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration17, periodType52);
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration17, readableInstant57);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.ReadableDuration readableDuration68 = null;
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.PeriodType periodType70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period(readableDuration68, readableInstant69, periodType70);
        org.joda.time.PeriodType periodType72 = period71.getPeriodType();
        org.joda.time.Period period73 = new org.joda.time.Period(readableInstant66, readableInstant67, periodType72);
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.Period period75 = new org.joda.time.Period((long) (byte) -1, (long) (byte) 1, periodType72, chronology74);
        org.joda.time.Period period76 = new org.joda.time.Period((long) 10, periodType72);
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.Period period78 = new org.joda.time.Period((long) (byte) 10, (long) ' ', periodType72, chronology77);
        org.joda.time.Period period79 = new org.joda.time.Period((long) (byte) 1, periodType72);
        org.joda.time.Period period80 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration17, readableInstant59, periodType72);
        org.joda.time.Chronology chronology81 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period82 = new org.joda.time.Period((java.lang.Object) periodType72, chronology81);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(periodType72);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.plusYears((int) '#');
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) 10, (int) (byte) 100, (int) '#', (int) (byte) 10);
        org.joda.time.Period period9 = period3.plus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.format.PeriodFormatter periodFormatter10 = null;
        java.lang.String str11 = period3.toString(periodFormatter10);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P35YT-1S" + "'", str11, "P35YT-1S");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period6 = period4.minusYears((int) (byte) -1);
        org.joda.time.Period period7 = period2.withFields((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period9 = period2.withHours((int) (short) 0);
        org.joda.time.Period period11 = period2.multipliedBy((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = period11.getClass();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = period1.getValue(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (byte) 0);
        java.lang.String str2 = period1.toString();
        int int3 = period1.getHours();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT0S" + "'", str2, "PT0S");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks3 = period2.toStandardWeeks();
        org.joda.time.Period period4 = period2.negated();
        org.joda.time.Period period6 = period4.plusMillis(0);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period9 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period11 = period9.withMillis((int) (byte) 100);
        org.joda.time.Period period13 = period9.withMonths((int) ' ');
        org.joda.time.Period period15 = period9.withHours(100);
        int int16 = period15.getMinutes();
        org.joda.time.Period period18 = period15.withWeeks((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = period18.toDurationFrom(readableInstant19);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period(readableDuration37, readableInstant38, periodType39);
        org.joda.time.PeriodType periodType41 = period40.getPeriodType();
        org.joda.time.Period period42 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType41);
        org.joda.time.Period period43 = new org.joda.time.Period((-1), 0, (int) (short) 1, (int) '4', 10, (int) (byte) 0, 100, (int) (byte) 1, periodType41);
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant7, (org.joda.time.ReadableDuration) duration20, periodType41);
        org.joda.time.Period period45 = period4.normalizedStandard(periodType41);
        org.joda.time.Period period46 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType41);
        org.joda.time.MutablePeriod mutablePeriod47 = period46.toMutablePeriod();
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(mutablePeriod47);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 10, periodType4);
        org.joda.time.Period period7 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period9 = period7.withMillis((int) (byte) 100);
        org.joda.time.Period period10 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationTo(readableInstant11);
        org.joda.time.Period period14 = period10.plusHours((-1));
        int int15 = period14.getSeconds();
        org.joda.time.Period period16 = period9.withFields((org.joda.time.ReadablePeriod) period14);
        int int17 = period14.getHours();
        org.joda.time.Period period18 = period5.minus((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Period period20 = period5.multipliedBy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = period20.toDurationTo(readableInstant21);
        org.joda.time.Period period24 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period26 = period24.withMillis((int) (byte) 100);
        org.joda.time.Period period27 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period27.toDurationTo(readableInstant28);
        org.joda.time.Period period31 = period27.plusHours((-1));
        int int32 = period31.getSeconds();
        org.joda.time.Period period33 = period26.withFields((org.joda.time.ReadablePeriod) period31);
        org.joda.time.Period period35 = period31.withMinutes((int) (short) 0);
        org.joda.time.Period period37 = period31.withMinutes(10);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Duration duration39 = period31.toDurationFrom(readableInstant38);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableDuration42, readableInstant43, periodType44);
        org.joda.time.PeriodType periodType46 = period45.getPeriodType();
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant40, readableInstant41, periodType46);
        org.joda.time.Period period48 = period31.normalizedStandard(periodType46);
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration22, periodType46);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period50 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(period48);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
        org.joda.time.Period period20 = period17.normalizedStandard();
        int int21 = period17.getDays();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 0, 0, 0, 0, 0, (-1), 0, 68 });
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
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
        org.joda.time.Period period23 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period24 = period23.negated();
        org.joda.time.PeriodType periodType25 = period24.getPeriodType();
        org.joda.time.Period period26 = period21.withPeriodType(periodType25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((long) (-1), 1L, periodType25, chronology27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period29 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(period26);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 0);
        org.joda.time.Period period3 = period1.withDays(0);
        org.joda.time.format.PeriodFormatter periodFormatter4 = null;
        java.lang.String str5 = period3.toString(periodFormatter4);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT0S" + "'", str5, "PT0S");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType8);
        org.joda.time.Period period11 = period9.withMillis((int) (short) 10);
        int int12 = period11.getHours();
        org.joda.time.Period period13 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period13.toDurationTo(readableInstant14);
        org.joda.time.Period period17 = period13.plusHours((-1));
        int int18 = period17.getSeconds();
        org.joda.time.Period period20 = period17.withSeconds(10);
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
        org.joda.time.Period period51 = period20.withFieldAdded(durationFieldType47, (int) (byte) 10);
        org.joda.time.Period period52 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Duration duration54 = period52.toDurationTo(readableInstant53);
        org.joda.time.Period period56 = period52.plusHours((-1));
        org.joda.time.Period period58 = period56.plusYears((int) (short) -1);
        org.joda.time.Period period60 = period56.plusMillis((int) ' ');
        org.joda.time.MutablePeriod mutablePeriod61 = period60.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.ReadableDuration readableDuration63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period(readableInstant62, readableDuration63);
        org.joda.time.Period period66 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period68 = period66.minusYears((int) (byte) -1);
        org.joda.time.Period period69 = period64.withFields((org.joda.time.ReadablePeriod) period66);
        int[] intArray70 = period64.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter71 = null;
        java.lang.String str72 = period64.toString(periodFormatter71);
        org.joda.time.PeriodType periodType81 = null;
        org.joda.time.Period period82 = new org.joda.time.Period((int) (byte) 10, (int) ' ', (-1), (int) (short) 0, (int) '#', 100, 10, (int) (byte) 1, periodType81);
        org.joda.time.Period period84 = period82.withMillis((int) (short) 10);
        org.joda.time.Period period86 = period82.plusYears((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType88 = period82.getFieldType((int) (short) 1);
        org.joda.time.Period period90 = period64.withField(durationFieldType88, (int) (short) 10);
        int int91 = period60.get(durationFieldType88);
        boolean boolean92 = period20.isSupported(durationFieldType88);
        org.joda.time.Period period94 = period11.withFieldAdded(durationFieldType88, 4);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period20);
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
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(mutablePeriod61);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "PT0S" + "'", str72, "PT0S");
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(durationFieldType88);
        org.junit.Assert.assertNotNull(period90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(period94);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
        org.joda.time.Period period30 = period28.minusYears(100);
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
        org.junit.Assert.assertNotNull(period30);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((-35));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.joda.time.Period period4 = new org.joda.time.Period((int) '#', 40, 4, 8);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, chronology1);
        org.joda.time.Period period4 = period2.withMinutes((int) (short) 0);
        org.joda.time.Period period6 = period2.minusSeconds((int) '4');
        org.joda.time.Period period8 = period2.withMinutes((int) (short) 100);
        int int9 = period2.getHours();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableDuration42, readableInstant43, periodType44);
        org.joda.time.PeriodType periodType46 = period45.getPeriodType();
        org.joda.time.Period period47 = new org.joda.time.Period(1, (int) ' ', 1, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) '#', periodType46);
        org.joda.time.Period period48 = new org.joda.time.Period((int) (byte) 100, 0, 35, 100, (int) (byte) -1, (int) (byte) -1, (int) (byte) 0, (int) (byte) 10, periodType46);
        org.joda.time.Chronology chronology49 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period50 = new org.joda.time.Period((java.lang.Object) periodType24, periodType46, chronology49);
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
        org.junit.Assert.assertNotNull(periodType46);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
        int int49 = period36.getMonths();
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
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', chronology2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationTo(readableInstant4);
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration5);
        org.joda.time.Period period8 = period6.withWeeks(8);
        org.joda.time.Period period10 = period8.minusMillis((int) (byte) -1);
        org.joda.time.Seconds seconds11 = period8.toStandardSeconds();
        org.joda.time.Period period13 = period8.plusSeconds(10);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        org.joda.time.Period period23 = period19.withMillis(0);
        org.joda.time.Period period25 = period23.minusSeconds(8);
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
        org.junit.Assert.assertNotNull(period25);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationTo(readableInstant1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 0);
        boolean boolean5 = period0.equals((java.lang.Object) period4);
        org.joda.time.Period period6 = period4.negated();
        org.joda.time.Period period8 = period4.minusSeconds((int) (short) 10);
        org.joda.time.Period period10 = period8.minusMonths(68);
        int int11 = period8.getMinutes();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }
}

