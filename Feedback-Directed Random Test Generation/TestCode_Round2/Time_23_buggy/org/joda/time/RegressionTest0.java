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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.lang.Class<?> wildcardClass7 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("ICT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'ICT' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Class<?> wildcardClass4 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asia/Bangkok" + "'", str2, "Asia/Bangkok");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((long) 25200000);
        java.lang.Class<?> wildcardClass3 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        int int10 = dateTimeZone1.getOffset((long) 1);
        java.lang.Class<?> wildcardClass11 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+07:00" + "'", str8, "+07:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25200000 + "'", int10 == 25200000);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        java.lang.Class<?> wildcardClass4 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(115800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        long long6 = dateTimeZone1.previousTransition((long) ' ');
        int int8 = dateTimeZone1.getOffset(25200001L);
        java.lang.String str10 = dateTimeZone1.getNameKey((long) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 115800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getShortName((long) (short) 0, locale13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone3.getName((long) (short) 100, locale16);
        java.lang.String str19 = dateTimeZone3.getName((long) (-1));
        long long23 = dateTimeZone3.convertLocalToUTC((long) (byte) 1, true, (long) 10);
        java.lang.String str24 = dateTimeZone3.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "1) test0016(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "1) test0016(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "1) test0016(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "1) test0016(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
// flaky "1) test0016(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
// flaky "1) test0016(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
// flaky "1) test0016(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 2L + "'", long23 == 2L);
// flaky "1) test0016(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-00:00:00.001" + "'", str24, "-00:00:00.001");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        boolean boolean8 = dateTimeZone1.isFixed();
        java.lang.Class<?> wildcardClass9 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "2) test0017(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
// flaky "2) test0017(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        int int4 = dateTimeZone1.getStandardOffset(0L);
        long long6 = dateTimeZone1.convertUTCToLocal((long) (byte) 10);
        java.lang.Class<?> wildcardClass7 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 11L + "'", long6 == 11L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        long long8 = dateTimeZone1.previousTransition((long) (short) 1);
        java.lang.String str10 = dateTimeZone1.getNameKey((-99L));
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 115800000);
        int int14 = dateTimeZone1.getStandardOffset(32L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "3) test0019(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky "3) test0019(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
// flaky "2) test0019(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
// flaky "2) test0019(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str10);
// flaky "2) test0019(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
// flaky "2) test0019(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(25200000, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(115800000, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 36000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 36000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        java.lang.Class<?> wildcardClass4 = provider0.getClass();
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.getID();
        long long6 = dateTimeZone3.previousTransition((-1L));
        long long10 = dateTimeZone3.convertLocalToUTC(25200000L, true, 100L);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 100L);
        long long15 = dateTimeZone1.adjustOffset((-1570200724001L), false);
        java.lang.Class<?> wildcardClass16 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "4) test0024(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:10" + "'", str4, "+32:10");
// flaky "4) test0024(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
// flaky "3) test0024(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-90600000L) + "'", long10 == (-90600000L));
// flaky "3) test0024(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-115799899L) + "'", long12 == (-115799899L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570200724001L) + "'", long15 == (-1570200724001L));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, 115800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(25200000, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((long) 25200000);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        long long8 = dateTimeZone4.getMillisKeepLocal(dateTimeZone6, (long) 'a');
        int int10 = dateTimeZone6.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone11 = dateTimeZone6.toTimeZone();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone6.getShortName((long) (byte) 100, locale13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone6.getShortName((long) (short) 0, locale16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone6.getName((long) (short) 100, locale19);
        java.lang.String str22 = dateTimeZone6.getName((long) (-1));
        boolean boolean24 = dateTimeZone6.isStandardOffset((long) (short) -1);
        boolean boolean25 = dateTimeZone0.equals((java.lang.Object) dateTimeZone6);
        long long27 = dateTimeZone6.previousTransition(115799900L);
        java.lang.Class<?> wildcardClass28 = dateTimeZone6.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
// flaky "5) test0030(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115800000 + "'", int10 == 115800000);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky "5) test0030(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
// flaky "4) test0030(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:10" + "'", str14, "+32:10");
// flaky "4) test0030(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:10" + "'", str17, "+32:10");
// flaky "3) test0030(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:10" + "'", str20, "+32:10");
// flaky "3) test0030(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+32:10" + "'", str22, "+32:10");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky "2) test0030(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 115799900L + "'", long27 == 115799900L);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, (int) (short) 1);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.lang.Class<?> wildcardClass5 = timeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT-01:01");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone1.getStandardOffset((long) 25200000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "6) test0033(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115800000 + "'", int7 == 115800000);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        long long13 = dateTimeZone1.adjustOffset(2L, true);
        java.lang.String str14 = dateTimeZone1.toString();
        java.lang.Class<?> wildcardClass15 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        boolean boolean7 = dateTimeZone1.isFixed();
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass10 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "7) test0035(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+32:10" + "'", str2, "+32:10");
// flaky "6) test0035(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "5) test0035(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(36000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 0);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName((-35999901L), locale4);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+10:00" + "'", str5, "+10:00");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+32:10");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+32:10\" is malformed at \"32:10\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone10.convertUTCToLocal((long) 36000000);
        java.lang.Object obj13 = dateTimeZone10.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "8) test0039(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "7) test0039(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "6) test0039(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky "5) test0039(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 72000000L + "'", long12 == 72000000L);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 115800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        java.lang.Class<?> wildcardClass7 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "9) test0041(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
// flaky "8) test0041(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
// flaky "7) test0041(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "10) test0043(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "9) test0043(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(100L, locale11);
        long long14 = dateTimeZone1.convertUTCToLocal((long) 100);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "11) test0044(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
// flaky "10) test0044(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
// flaky "8) test0044(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 200L + "'", long14 == 200L);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        long long6 = dateTimeZone1.previousTransition((long) ' ');
        int int8 = dateTimeZone1.getOffset(25200001L);
        java.lang.String str10 = dateTimeZone1.getName((-1569969664099L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone3.getName((long) (short) 10, locale11);
        java.lang.String str14 = dateTimeZone3.getName(0L);
        long long16 = dateTimeZone3.previousTransition(25200052L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone3.getShortName((long) 0, locale18);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone3.getName(36000100L, locale21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "12) test0046(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "11) test0046(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "9) test0046(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
// flaky "6) test0046(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
// flaky "4) test0046(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
// flaky "4) test0046(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 25200052L + "'", long16 == 25200052L);
// flaky "3) test0046(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
// flaky "2) test0046(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        boolean boolean2 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        int int5 = dateTimeZone1.getStandardOffset(0L);
        int int7 = dateTimeZone1.getStandardOffset((-1570084924201L));
        java.lang.String str8 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        long long8 = dateTimeZone1.previousTransition(97L);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = false; // flaky "13) test0049(org.joda.time.RegressionTest0)": dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "12) test0049(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(obj6);
// flaky "10) test0049(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36000000, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        long long3 = dateTimeZone1.convertUTCToLocal((long) 25200000);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) ' ');
        long long7 = dateTimeZone1.previousTransition((long) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25200052L + "'", long3 == 25200052L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        int int4 = dateTimeZone1.getStandardOffset(0L);
        long long6 = dateTimeZone1.convertUTCToLocal((long) 36000000);
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 36000001L + "'", long6 == 36000001L);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        int int10 = dateTimeZone1.getOffset((long) 1);
        int int12 = dateTimeZone1.getOffset((-90L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "14) test0053(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
// flaky "13) test0053(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
// flaky "11) test0053(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(360600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone3.getName((long) (short) 10, locale11);
        java.lang.String str14 = dateTimeZone3.getName(0L);
        long long16 = dateTimeZone3.previousTransition(25200052L);
        boolean boolean18 = dateTimeZone3.isStandardOffset((-35999901L));
        long long21 = dateTimeZone3.convertLocalToUTC((long) 35, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "15) test0055(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "14) test0055(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "12) test0055(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
// flaky "7) test0055(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
// flaky "5) test0055(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
// flaky "5) test0055(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 25200052L + "'", long16 == 25200052L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky "4) test0055(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-65L) + "'", long21 == (-65L));
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        long long7 = dateTimeZone5.nextTransition((long) (short) 100);
        int int9 = dateTimeZone5.getOffsetFromLocal(100L);
        long long11 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (long) 115800000);
        java.lang.String str13 = dateTimeZone1.getNameKey((-25200000L));
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getShortName((long) (byte) -1, locale15);
        java.lang.Object obj17 = dateTimeZone1.writeReplace();
        int int19 = dateTimeZone1.getOffset((-1569969664099L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "16) test0056(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
// flaky "15) test0056(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
// flaky "13) test0056(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str13);
// flaky "8) test0056(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertNotNull(obj17);
// flaky "6) test0056(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        long long8 = dateTimeZone1.previousTransition((-115799904L));
        java.lang.Class<?> wildcardClass9 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "17) test0057(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
// flaky "16) test0057(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
// flaky "14) test0057(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
// flaky "9) test0057(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115799904L) + "'", long8 == (-115799904L));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        long long10 = dateTimeZone1.convertLocalToUTC((-1L), false, (long) '#');
        java.lang.String str11 = dateTimeZone1.getID();
        java.lang.Class<?> wildcardClass12 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2L) + "'", long10 == (-2L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.getID();
        long long6 = dateTimeZone3.previousTransition((-1L));
        long long10 = dateTimeZone3.convertLocalToUTC(25200000L, true, 100L);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 100L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getName((long) 100, locale15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "18) test0059(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
// flaky "17) test0059(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
// flaky "15) test0059(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25199900L + "'", long10 == 25199900L);
// flaky "10) test0059(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.001" + "'", str16, "+00:00:00.001");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int6 = dateTimeZone4.getStandardOffset((long) 10);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone8.getMillisKeepLocal(dateTimeZone10, (long) 'a');
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone8.getName((long) (short) 1, locale14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        boolean boolean17 = dateTimeZone4.equals((java.lang.Object) dateTimeZone8);
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, (long) (byte) 0);
        java.lang.Class<?> wildcardClass20 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115800000 + "'", int6 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 99L + "'", long19 == 99L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        int int4 = dateTimeZone1.getStandardOffset(0L);
        int int6 = dateTimeZone1.getStandardOffset(36000032L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.lang.Class<?> wildcardClass8 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) '4');
        java.lang.Class<?> wildcardClass3 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getShortName((long) (short) 0, locale13);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        long long17 = dateTimeZone3.nextTransition((-115799900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-115799900L) + "'", long17 == (-115799900L));
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 1);
        java.lang.String str4 = dateTimeZone2.getNameKey(9L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone3.getName((long) (short) 10, locale11);
        boolean boolean14 = dateTimeZone3.equals((java.lang.Object) (byte) 0);
        long long18 = dateTimeZone3.convertLocalToUTC((long) 10, true, (-35999991L));
        java.lang.String str20 = dateTimeZone3.getNameKey((-25200000L));
        java.lang.Class<?> wildcardClass21 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9L + "'", long18 == 9L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 1);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone10.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone10.getOffset(readableInstant13);
        java.lang.Object obj15 = dateTimeZone10.writeReplace();
        java.lang.Object obj16 = dateTimeZone10.writeReplace();
        boolean boolean17 = dateTimeZone10.isFixed();
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        long long21 = dateTimeZone19.nextTransition((long) (short) 100);
        java.lang.String str23 = dateTimeZone19.getNameKey(1L);
        long long25 = dateTimeZone10.getMillisKeepLocal(dateTimeZone19, (-25200001L));
        long long27 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, (long) 'a');
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        java.lang.Object obj30 = dateTimeZone29.writeReplace();
        boolean boolean31 = dateTimeZone10.equals(obj30);
        java.lang.Class<?> wildcardClass32 = dateTimeZone10.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-25200001L) + "'", long25 == (-25200001L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 95L + "'", long27 == 95L);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+52:01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+52:01\" is malformed at \"52:01\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(100L, locale11);
        int int14 = dateTimeZone1.getOffsetFromLocal((-25200000L));
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone1.getOffset(readableInstant15);
        long long18 = dateTimeZone1.nextTransition((-206400000L));
        java.lang.String str19 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-206400000L) + "'", long18 == (-206400000L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.001" + "'", str19, "+00:00:00.001");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.Class<?> wildcardClass4 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        int int5 = dateTimeZone1.getStandardOffset((long) (short) 0);
        long long7 = dateTimeZone1.previousTransition((long) '#');
        java.lang.String str8 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int4 = dateTimeZone2.getStandardOffset((long) 10);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 'a');
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone6.getName((long) (short) 1, locale12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        boolean boolean15 = dateTimeZone2.equals((java.lang.Object) dateTimeZone6);
        java.lang.String str17 = dateTimeZone2.getName(3L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:10" + "'", str17, "+32:10");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        long long13 = dateTimeZone1.adjustOffset(2L, true);
        int int15 = dateTimeZone1.getOffsetFromLocal(25200052L);
        java.lang.Class<?> wildcardClass16 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        boolean boolean7 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str11 = dateTimeZone9.getNameKey((long) 115800000);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone9.getShortName((-1570084924001L), locale13);
        long long16 = dateTimeZone9.nextTransition(98L);
        long long18 = dateTimeZone9.nextTransition((long) (byte) 1);
        long long20 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, 9L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 98L + "'", long16 == 98L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9L + "'", long20 == 9L);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        int int5 = dateTimeZone1.getStandardOffset((long) (short) 0);
        int int7 = dateTimeZone1.getOffsetFromLocal(10L);
        java.lang.Class<?> wildcardClass8 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        int int10 = dateTimeZone1.getOffset((long) 1);
        long long13 = dateTimeZone1.convertLocalToUTC((long) 115800000, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 115799999L + "'", long13 == 115799999L);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.nextTransition((long) 1);
        int int13 = dateTimeZone3.getOffset((long) (-1));
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone3.getOffset(readableInstant14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        int int6 = dateTimeZone2.getStandardOffset(9L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36000000 + "'", int4 == 36000000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36000000 + "'", int6 == 36000000);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        int int10 = dateTimeZone1.getOffset((long) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, 100L);
        boolean boolean15 = dateTimeZone1.isFixed();
        java.lang.Class<?> wildcardClass16 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "19) test0081(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3660000) + "'", int8 == (-3660000));
// flaky "18) test0081(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-3660000) + "'", int10 == (-3660000));
        org.junit.Assert.assertNotNull(dateTimeZone12);
// flaky "16) test0081(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-39659900L) + "'", long14 == (-39659900L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        int int8 = dateTimeZone1.getStandardOffset(0L);
        long long12 = dateTimeZone1.convertLocalToUTC(102L, false, 2L);
        java.lang.Class<?> wildcardClass13 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 103L + "'", long12 == 103L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(52, 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360600000, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36000000, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        int int5 = dateTimeZone1.getStandardOffset(0L);
        java.lang.Class<?> wildcardClass6 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        int int4 = dateTimeZone1.getStandardOffset(0L);
        boolean boolean6 = dateTimeZone1.isStandardOffset(0L);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName(115799900L, locale8);
        java.lang.Class<?> wildcardClass10 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+10:00");
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        long long8 = dateTimeZone1.previousTransition((long) (short) 1);
        java.lang.String str9 = dateTimeZone1.getID();
        int int11 = dateTimeZone1.getStandardOffset((-1570048924000L));
        java.lang.Class<?> wildcardClass12 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "20) test0091(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky "19) test0091(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
// flaky "17) test0091(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
// flaky "11) test0091(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36000000, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        java.lang.Object obj5 = dateTimeZone2.writeReplace();
        int int7 = dateTimeZone2.getOffset((-115799990L));
        java.lang.Class<?> wildcardClass8 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36000000 + "'", int4 == 36000000);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        boolean boolean7 = dateTimeZone1.isFixed();
        java.lang.String str8 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "21) test0094(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "20) test0094(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        int int10 = dateTimeZone1.getOffset((long) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, 100L);
        int int16 = dateTimeZone1.getOffsetFromLocal(98L);
        java.lang.String str17 = dateTimeZone1.toString();
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getShortName((long) 1, locale19);
        java.lang.Class<?> wildcardClass21 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-35999899L) + "'", long14 == (-35999899L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.001" + "'", str20, "+00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        int int3 = dateTimeZone1.getOffset((-1570200724001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36000000 + "'", int3 == 36000000);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(100L, locale11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Class<?> wildcardClass14 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        java.lang.String str10 = dateTimeZone1.getName((long) '#');
        java.lang.String str12 = dateTimeZone1.getName(0L);
        boolean boolean14 = dateTimeZone1.isStandardOffset(25200052L);
        java.lang.Class<?> wildcardClass15 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getShortName((long) (short) 0, locale13);
        java.lang.String str15 = dateTimeZone3.getID();
        java.lang.String str16 = dateTimeZone3.getID();
        long long18 = dateTimeZone3.nextTransition(25200001L);
        long long20 = dateTimeZone3.previousTransition(90060000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.001" + "'", str16, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 25200001L + "'", long18 == 25200001L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 90060000L + "'", long20 == 90060000L);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getOffset((long) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str11 = dateTimeZone1.getNameKey(101L);
        long long15 = dateTimeZone1.convertLocalToUTC((long) (byte) 100, true, (-35999904L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 99L + "'", long15 == 99L);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        int int10 = dateTimeZone1.getOffset((long) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, 100L);
        boolean boolean15 = dateTimeZone1.isFixed();
        int int17 = dateTimeZone1.getStandardOffset((long) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-35999899L) + "'", long14 == (-35999899L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        int int10 = dateTimeZone3.getOffset((long) (short) 1);
        java.lang.Class<?> wildcardClass11 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        long long7 = dateTimeZone1.previousTransition((long) ' ');
        java.lang.Class<?> wildcardClass8 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        long long7 = dateTimeZone1.previousTransition(10L);
        long long9 = dateTimeZone1.nextTransition((-115799999L));
        java.util.Set<java.lang.String> strSet10 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean11 = dateTimeZone1.equals((java.lang.Object) strSet10);
        long long13 = dateTimeZone1.nextTransition((-115799899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-115799999L) + "'", long9 == (-115799999L));
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115799899L) + "'", long13 == (-115799899L));
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        java.lang.String str8 = dateTimeZone1.getName((-1570084924101L));
        java.lang.Object obj9 = dateTimeZone1.writeReplace();
        java.lang.String str11 = dateTimeZone1.getName(115800002L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 1);
        boolean boolean4 = dateTimeZone2.equals((java.lang.Object) 25200001L);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 'a');
        int int12 = dateTimeZone8.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone13 = dateTimeZone8.toTimeZone();
        java.util.TimeZone timeZone14 = dateTimeZone8.toTimeZone();
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone8.getName((long) (short) 10, locale16);
        java.lang.String str19 = dateTimeZone8.getName(0L);
        long long21 = dateTimeZone8.previousTransition(25200052L);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone8.getShortName((long) 0, locale23);
        long long26 = dateTimeZone2.getMillisKeepLocal(dateTimeZone8, (-25200001L));
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        long long32 = dateTimeZone28.getMillisKeepLocal(dateTimeZone30, (long) 'a');
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone28.getName((long) (short) 1, locale34);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        java.util.Locale locale38 = null;
        java.lang.String str39 = dateTimeZone28.getName(100L, locale38);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        int int42 = dateTimeZone28.getOffsetFromLocal(100L);
        long long44 = dateTimeZone2.getMillisKeepLocal(dateTimeZone28, (-25740000L));
        java.lang.String str45 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.001" + "'", str19, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 25200052L + "'", long21 == 25200052L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.001" + "'", str24, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 90059998L + "'", long26 == 90059998L);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 97L + "'", long32 == 97L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.001" + "'", str35, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.001" + "'", str39, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 89519999L + "'", long44 == 89519999L);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+32:01" + "'", str45, "+32:01");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        long long9 = dateTimeZone1.adjustOffset(36000000L, false);
        long long12 = dateTimeZone1.convertLocalToUTC((-1569969124102L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 36000000L + "'", long9 == 36000000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1569969124103L) + "'", long12 == (-1569969124103L));
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(3600000, 360600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 360600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (short) 0, true);
        long long7 = dateTimeZone1.nextTransition(1L);
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName(101L, locale10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        long long10 = dateTimeZone1.convertLocalToUTC((-1L), false, (long) '#');
        java.lang.String str11 = dateTimeZone1.getID();
        int int13 = dateTimeZone1.getOffset((-1570200724001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2L) + "'", long10 == (-2L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.getID();
        long long6 = dateTimeZone3.previousTransition((-1L));
        long long10 = dateTimeZone3.convertLocalToUTC(25200000L, true, 100L);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 100L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean14 = dateTimeZone1.isFixed();
        int int16 = dateTimeZone1.getOffsetFromLocal(35L);
        java.lang.String str17 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25199999L + "'", long10 == 25199999L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        boolean boolean9 = dateTimeZone1.isStandardOffset(115800002L);
        java.lang.Class<?> wildcardClass10 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "22) test0114(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36000000 + "'", int5 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone1.getOffset(readableInstant3);
        java.lang.String str5 = dateTimeZone1.toString();
        java.lang.Class<?> wildcardClass6 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(2100000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(25200000, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str8 = dateTimeZone1.getShortName(115800002L);
        long long11 = dateTimeZone1.adjustOffset(39600000L, false);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long16 = dateTimeZone13.convertLocalToUTC((-1570084924001L), false);
        int int18 = dateTimeZone13.getOffsetFromLocal((-1570084924000L));
        java.lang.String str19 = dateTimeZone13.getID();
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone13.isLocalDateTimeGap(localDateTime20);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        long long24 = dateTimeZone1.getMillisKeepLocal(dateTimeZone13, 0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "23) test0118(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky "21) test0118(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 39600000L + "'", long11 == 39600000L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1570084924000L) + "'", long16 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky "18) test0118(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(35, 36000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 36000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long11 = dateTimeZone1.nextTransition((long) ' ');
        java.lang.Class<?> wildcardClass12 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getShortName((long) (short) 0, locale13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone3.getName((long) (short) 100, locale16);
        java.lang.String str19 = dateTimeZone3.getName((long) (-1));
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone3.isLocalDateTimeGap(localDateTime20);
        int int23 = dateTimeZone3.getOffsetFromLocal((-1570120924102L));
        long long27 = dateTimeZone3.convertLocalToUTC((-39659900L), true, (long) '#');
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-39659899L) + "'", long27 == (-39659899L));
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (short) 0, true);
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getOffsetFromLocal((-1570120924101L));
        java.lang.Class<?> wildcardClass9 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getShortName((long) (short) 0, locale13);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        long long19 = dateTimeZone3.convertLocalToUTC(0L, false, 35L);
        long long23 = dateTimeZone3.convertLocalToUTC((-35999902L), false, (-1570084924100L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-35999901L) + "'", long23 == (-35999901L));
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        long long3 = dateTimeZone1.convertUTCToLocal((long) 25200000);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) ' ');
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25200052L + "'", long3 == 25200052L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(25200000, (-3660000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3660000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long11 = dateTimeZone1.nextTransition((long) ' ');
        boolean boolean13 = dateTimeZone1.isStandardOffset((long) (short) 1);
        int int15 = dateTimeZone1.getOffset((-35999990L));
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        long long21 = dateTimeZone17.getMillisKeepLocal(dateTimeZone19, (long) 'a');
        int int23 = dateTimeZone19.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone24 = dateTimeZone19.toTimeZone();
        java.util.TimeZone timeZone25 = dateTimeZone19.toTimeZone();
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone19.getName((long) (short) 10, locale27);
        boolean boolean30 = dateTimeZone19.equals((java.lang.Object) (byte) 0);
        boolean boolean31 = dateTimeZone1.equals((java.lang.Object) dateTimeZone19);
        java.lang.String str32 = dateTimeZone1.toString();
        java.lang.String str33 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "24) test0126(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-01:01" + "'", str8, "-01:01");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "22) test0126(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3660000) + "'", int15 == (-3660000));
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
// flaky "19) test0126(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-3660000) + "'", int23 == (-3660000));
        org.junit.Assert.assertNotNull(timeZone24);
// flaky "12) test0126(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT-01:01");
        org.junit.Assert.assertNotNull(timeZone25);
// flaky "7) test0126(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "GMT-01:01");
// flaky "6) test0126(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-01:01" + "'", str28, "-01:01");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
// flaky "5) test0126(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-01:01" + "'", str32, "-01:01");
// flaky "3) test0126(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-01:01" + "'", str33, "-01:01");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 25200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 25200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+35:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+35:00\" is malformed at \"35:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(60000, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((long) 25200000);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        long long8 = dateTimeZone4.getMillisKeepLocal(dateTimeZone6, (long) 'a');
        int int10 = dateTimeZone6.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone11 = dateTimeZone6.toTimeZone();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone6.getShortName((long) (byte) 100, locale13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone6.getShortName((long) (short) 0, locale16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone6.getName((long) (short) 100, locale19);
        java.lang.String str22 = dateTimeZone6.getName((long) (-1));
        boolean boolean24 = dateTimeZone6.isStandardOffset((long) (short) -1);
        boolean boolean25 = dateTimeZone0.equals((java.lang.Object) dateTimeZone6);
        long long27 = dateTimeZone6.previousTransition(115799900L);
        long long30 = dateTimeZone6.convertLocalToUTC((long) 0, false);
        long long32 = dateTimeZone6.convertUTCToLocal(2L);
        boolean boolean34 = dateTimeZone6.equals((java.lang.Object) (-115799990L));
        java.lang.Class<?> wildcardClass35 = dateTimeZone6.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
// flaky "25) test0130(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-3660000) + "'", int10 == (-3660000));
        org.junit.Assert.assertNotNull(timeZone11);
// flaky "23) test0130(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT-01:01");
// flaky "20) test0130(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-01:01" + "'", str14, "-01:01");
// flaky "13) test0130(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-01:01" + "'", str17, "-01:01");
// flaky "8) test0130(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-01:01" + "'", str20, "-01:01");
// flaky "7) test0130(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-01:01" + "'", str22, "-01:01");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 115799900L + "'", long27 == 115799900L);
// flaky "6) test0130(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 3660000L + "'", long30 == 3660000L);
// flaky "4) test0130(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-3659998L) + "'", long32 == (-3659998L));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getShortName((long) (short) 0, locale13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone3.getName((long) (short) 100, locale16);
        java.lang.String str19 = dateTimeZone3.getName((-1570012924001L));
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone3.isLocalDateTimeGap(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "26) test0131(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115800000 + "'", int7 == 115800000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "24) test0131(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
// flaky "21) test0131(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:10" + "'", str11, "+32:10");
// flaky "14) test0131(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:10" + "'", str14, "+32:10");
// flaky "9) test0131(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:10" + "'", str17, "+32:10");
// flaky "8) test0131(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:10" + "'", str19, "+32:10");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        java.lang.String str8 = dateTimeZone1.getName((-1570084924101L));
        java.lang.Object obj9 = dateTimeZone1.writeReplace();
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        int int12 = dateTimeZone1.getStandardOffset((long) (byte) 100);
        java.lang.String str13 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(100L, locale11);
        int int14 = dateTimeZone1.getOffsetFromLocal((-25200000L));
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone1.getOffset(readableInstant15);
        long long20 = dateTimeZone1.convertLocalToUTC(25200052L, false, 12L);
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone1.getOffset(readableInstant21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "27) test0133(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:01" + "'", str8, "+32:01");
// flaky "25) test0133(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:01" + "'", str12, "+32:01");
// flaky "22) test0133(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115260000 + "'", int14 == 115260000);
// flaky "15) test0133(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115260000 + "'", int16 == 115260000);
// flaky "10) test0133(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-90059948L) + "'", long20 == (-90059948L));
// flaky "9) test0133(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115260000 + "'", int22 == 115260000);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((long) 25200000);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        long long8 = dateTimeZone4.getMillisKeepLocal(dateTimeZone6, (long) 'a');
        int int10 = dateTimeZone6.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone11 = dateTimeZone6.toTimeZone();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone6.getShortName((long) (byte) 100, locale13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone6.getShortName((long) (short) 0, locale16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone6.getName((long) (short) 100, locale19);
        java.lang.String str22 = dateTimeZone6.getName((long) (-1));
        boolean boolean24 = dateTimeZone6.isStandardOffset((long) (short) -1);
        boolean boolean25 = dateTimeZone0.equals((java.lang.Object) dateTimeZone6);
        java.lang.Class<?> wildcardClass26 = dateTimeZone6.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
// flaky "28) test0134(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115260000 + "'", int10 == 115260000);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky "26) test0134(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
// flaky "23) test0134(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:01" + "'", str14, "+32:01");
// flaky "16) test0134(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:01" + "'", str17, "+32:01");
// flaky "11) test0134(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:01" + "'", str20, "+32:01");
// flaky "10) test0134(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+32:01" + "'", str22, "+32:01");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        long long7 = dateTimeZone5.nextTransition((long) (short) 100);
        int int9 = dateTimeZone5.getOffsetFromLocal(100L);
        long long11 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (long) 115800000);
        java.lang.String str13 = dateTimeZone5.getNameKey((long) 115800000);
        java.lang.String str14 = dateTimeZone5.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "29) test0135(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+32:01" + "'", str2, "+32:01");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
// flaky "27) test0135(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115260000 + "'", int9 == 115260000);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
        org.junit.Assert.assertNull(str13);
// flaky "24) test0135(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:01" + "'", str14, "+32:01");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        long long7 = dateTimeZone5.nextTransition((long) (short) 100);
        int int9 = dateTimeZone5.getOffsetFromLocal(100L);
        long long11 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (long) 115800000);
        int int13 = dateTimeZone1.getStandardOffset((-35999899L));
        boolean boolean15 = dateTimeZone1.isStandardOffset((-90L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "30) test0136(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+32:01" + "'", str2, "+32:01");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
// flaky "28) test0136(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115260000 + "'", int9 == 115260000);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
// flaky "25) test0136(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115260000 + "'", int13 == 115260000);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.lang.String str7 = dateTimeZone1.getNameKey(25200000L);
        long long10 = dateTimeZone1.convertLocalToUTC((long) 100, false);
        java.lang.String str12 = dateTimeZone1.getName((long) 36000000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertNull(str7);
// flaky "31) test0138(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115259900L) + "'", long10 == (-115259900L));
// flaky "29) test0138(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:01" + "'", str12, "+32:01");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (-3660000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3660000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        long long8 = dateTimeZone1.previousTransition(97L);
        java.lang.String str10 = dateTimeZone1.getName((-115799901L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 1);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone10.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone10.getOffset(readableInstant13);
        java.lang.Object obj15 = dateTimeZone10.writeReplace();
        java.lang.Object obj16 = dateTimeZone10.writeReplace();
        boolean boolean17 = dateTimeZone10.isFixed();
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        long long21 = dateTimeZone19.nextTransition((long) (short) 100);
        java.lang.String str23 = dateTimeZone19.getNameKey(1L);
        long long25 = dateTimeZone10.getMillisKeepLocal(dateTimeZone19, (-25200001L));
        long long27 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, (long) 'a');
        long long31 = dateTimeZone1.convertLocalToUTC((-25740001L), false, (-25200001L));
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone1.getName((-35999991L), locale33);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-25200001L) + "'", long25 == (-25200001L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 97L + "'", long27 == 97L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-25740000L) + "'", long31 == (-25740000L));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-00:00:00.001" + "'", str34, "-00:00:00.001");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        long long8 = dateTimeZone1.previousTransition((long) (short) 1);
        java.lang.String str9 = dateTimeZone1.getID();
        long long11 = dateTimeZone1.convertUTCToLocal(51L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "32) test0142(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "30) test0142(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
// flaky "26) test0142(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
// flaky "17) test0142(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        long long15 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, (long) 'a');
        int int17 = dateTimeZone13.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone18 = dateTimeZone13.toTimeZone();
        java.util.TimeZone timeZone19 = dateTimeZone13.toTimeZone();
        long long21 = dateTimeZone13.convertUTCToLocal(0L);
        long long23 = dateTimeZone1.getMillisKeepLocal(dateTimeZone13, (long) (short) -1);
        long long26 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        java.lang.String str28 = dateTimeZone1.getName((-90600000L));
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        long long34 = dateTimeZone30.getMillisKeepLocal(dateTimeZone32, (long) 'a');
        boolean boolean35 = dateTimeZone30.isFixed();
        int int37 = dateTimeZone30.getStandardOffset((-1L));
        int int39 = dateTimeZone30.getOffset((long) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        long long43 = dateTimeZone30.getMillisKeepLocal(dateTimeZone41, 100L);
        int int45 = dateTimeZone30.getOffsetFromLocal(98L);
        long long47 = dateTimeZone1.getMillisKeepLocal(dateTimeZone30, 25200001L);
        int int49 = dateTimeZone30.getOffsetFromLocal(36000100L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "33) test0143(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
// flaky "31) test0143(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
// flaky "27) test0143(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
// flaky "18) test0143(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1570084924002L) + "'", long26 == (-1570084924002L));
// flaky "12) test0143(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.001" + "'", str28, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 97L + "'", long34 == 97L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
// flaky "11) test0143(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
// flaky "7) test0143(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone41);
// flaky "5) test0143(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-35999899L) + "'", long43 == (-35999899L));
// flaky "1) test0143(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 25200001L + "'", long47 == 25200001L);
// flaky "1) test0143(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getShortName((-1570012924100L), locale4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getOffset((-1570084923999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.035" + "'", str5, "+00:00:00.035");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+32:01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+32:01\" is malformed at \"32:01\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        boolean boolean10 = dateTimeZone3.equals((java.lang.Object) ' ');
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj13 = dateTimeZone12.writeReplace();
        java.lang.String str14 = dateTimeZone12.getID();
        long long17 = dateTimeZone12.convertLocalToUTC((long) 'a', true);
        java.lang.String str19 = dateTimeZone12.getNameKey((-1570084924201L));
        boolean boolean20 = dateTimeZone3.equals((java.lang.Object) dateTimeZone12);
        java.lang.Class<?> wildcardClass21 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "34) test0146(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 98L + "'", long17 == 98L);
        org.junit.Assert.assertNull(str19);
// flaky "32) test0146(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int6 = dateTimeZone4.getStandardOffset((long) 10);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone8.getMillisKeepLocal(dateTimeZone10, (long) 'a');
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone8.getName((long) (short) 1, locale14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        boolean boolean17 = dateTimeZone4.equals((java.lang.Object) dateTimeZone8);
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, (long) (byte) 0);
        long long23 = dateTimeZone8.convertLocalToUTC(0L, true, (long) (short) -1);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone8.getName((long) (byte) -1, locale25);
        long long28 = dateTimeZone8.convertUTCToLocal((-1570048924000L));
        java.lang.Class<?> wildcardClass29 = dateTimeZone8.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115800000 + "'", int6 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
// flaky "35) test0147(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "33) test0147(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 99L + "'", long19 == 99L);
// flaky "28) test0147(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
// flaky "19) test0147(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.001" + "'", str26, "+00:00:00.001");
// flaky "13) test0147(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1570048923999L) + "'", long28 == (-1570048923999L));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean4 = dateTimeZone1.isFixed();
        java.lang.String str5 = dateTimeZone1.toString();
        long long7 = dateTimeZone1.nextTransition((-115799901L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "36) test0148(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "34) test0148(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-115799901L) + "'", long7 == (-115799901L));
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long13 = dateTimeZone1.convertLocalToUTC((-1570517524001L), true, (-1570120924201L));
        java.lang.String str15 = dateTimeZone1.getName((long) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1570517524000L) + "'", long13 == (-1570517524000L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        boolean boolean7 = dateTimeZone1.isFixed();
        java.lang.String str9 = dateTimeZone1.getShortName(115800000L);
        int int11 = dateTimeZone1.getOffsetFromLocal(0L);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long17 = dateTimeZone13.getMillisKeepLocal(dateTimeZone15, (long) 'a');
        int int19 = dateTimeZone15.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone20 = dateTimeZone15.toTimeZone();
        java.util.TimeZone timeZone21 = dateTimeZone15.toTimeZone();
        long long23 = dateTimeZone15.nextTransition((long) 1);
        boolean boolean24 = dateTimeZone15.isFixed();
        long long28 = dateTimeZone15.convertLocalToUTC(119400000L, false, (long) 52);
        java.lang.String str30 = dateTimeZone15.getName(25200051L);
        boolean boolean31 = dateTimeZone1.equals((java.lang.Object) dateTimeZone15);
        boolean boolean33 = dateTimeZone1.isStandardOffset(35999979L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 119400001L + "'", long28 == 119400001L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-00:00:00.001" + "'", str30, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        boolean boolean8 = dateTimeZone1.isFixed();
        long long10 = dateTimeZone1.nextTransition(11L);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        long long14 = dateTimeZone12.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone12.getOffset(readableInstant15);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, (-1570200724001L));
        long long22 = dateTimeZone12.convertLocalToUTC((-1570012924000L), true);
        java.lang.Object obj23 = dateTimeZone12.writeReplace();
        java.lang.Class<?> wildcardClass24 = dateTimeZone12.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11L + "'", long10 == 11L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1570200724001L) + "'", long19 == (-1570200724001L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1570012923999L) + "'", long22 == (-1570012923999L));
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone3.getName((long) (short) 10, locale11);
        boolean boolean14 = dateTimeZone3.equals((java.lang.Object) (byte) 0);
        long long18 = dateTimeZone3.convertLocalToUTC((long) 10, true, (-35999991L));
        java.lang.String str20 = dateTimeZone3.getNameKey((-25200000L));
        java.util.TimeZone timeZone21 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        java.lang.Class<?> wildcardClass23 = dateTimeZone22.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 11L + "'", long18 == 11L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone3.getName((long) (short) 10, locale11);
        boolean boolean14 = dateTimeZone3.equals((java.lang.Object) (byte) 0);
        java.lang.String str16 = dateTimeZone3.getName(115799900L);
        int int18 = dateTimeZone3.getOffset((-1570084924001L));
        long long20 = dateTimeZone3.convertUTCToLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        long long24 = dateTimeZone3.adjustOffset(36000100L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 31L + "'", long20 == 31L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 36000100L + "'", long24 == 36000100L);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        long long7 = dateTimeZone1.previousTransition(10L);
        long long9 = dateTimeZone1.nextTransition((-115799999L));
        int int11 = dateTimeZone1.getOffset((long) (byte) -1);
        java.lang.String str12 = dateTimeZone1.toString();
        java.lang.Class<?> wildcardClass13 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-115799999L) + "'", long9 == (-115799999L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        long long8 = dateTimeZone1.previousTransition((long) (short) 1);
        java.lang.String str10 = dateTimeZone1.getNameKey((-99L));
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 115800000);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone1.getOffset(readableInstant13);
        int int16 = dateTimeZone1.getOffset(2100001L);
        long long19 = dateTimeZone1.adjustOffset(89519999L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 89519999L + "'", long19 == 89519999L);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone3.getName((long) (short) 10, locale11);
        java.lang.String str14 = dateTimeZone3.getName(0L);
        long long16 = dateTimeZone3.previousTransition(25200052L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone3.getShortName((long) 0, locale18);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone3.getName(231059997L, locale21);
        long long26 = dateTimeZone3.convertLocalToUTC((long) 0, true, (-1570012923999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 25200052L + "'", long16 == 25200052L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 1);
        long long4 = dateTimeZone2.convertUTCToLocal((-1570084924099L));
        long long6 = dateTimeZone2.previousTransition((-1570048924000L));
        long long9 = dateTimeZone2.adjustOffset(35999932L, false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1569969664099L) + "'", long4 == (-1569969664099L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1570048924000L) + "'", long6 == (-1570048924000L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35999932L + "'", long9 == 35999932L);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getShortName((long) (short) 0, locale13);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        long long19 = dateTimeZone3.convertLocalToUTC(0L, false, 35L);
        long long22 = dateTimeZone3.adjustOffset((-35999899L), false);
        long long24 = dateTimeZone3.previousTransition(79800002L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-35999899L) + "'", long22 == (-35999899L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 79800002L + "'", long24 == 79800002L);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long16 = dateTimeZone13.convertLocalToUTC((-1570084924001L), false);
        boolean boolean17 = dateTimeZone1.equals((java.lang.Object) (-1570084924001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1570084924000L) + "'", long16 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        java.lang.String str10 = dateTimeZone1.getName((long) '#');
        java.lang.String str12 = dateTimeZone1.getName(0L);
        long long14 = dateTimeZone1.nextTransition((-35999991L));
        java.lang.Class<?> wildcardClass15 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-35999991L) + "'", long14 == (-35999991L));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone3.getName((long) (short) 10, locale11);
        boolean boolean14 = dateTimeZone3.equals((java.lang.Object) (byte) 0);
        java.lang.String str16 = dateTimeZone3.getName(115799900L);
        int int18 = dateTimeZone3.getOffset((-1570084924001L));
        long long20 = dateTimeZone3.convertUTCToLocal((long) ' ');
        boolean boolean21 = dateTimeZone3.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 31L + "'", long20 == 31L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone1.getOffset(readableInstant3);
        java.lang.String str6 = dateTimeZone1.getShortName(97L);
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "37) test0164(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
// flaky "35) test0164(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
// flaky "29) test0164(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(3600000, 115800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        long long8 = dateTimeZone1.previousTransition((long) (short) 1);
        java.lang.String str10 = dateTimeZone1.getNameKey((-99L));
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 115800000);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone1.getOffset(readableInstant13);
        java.lang.Object obj15 = dateTimeZone1.writeReplace();
        boolean boolean17 = dateTimeZone1.isStandardOffset((long) 115800000);
        java.lang.String str18 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "38) test0166(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36000000 + "'", int5 == 36000000);
// flaky "36) test0166(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNull(str10);
// flaky "30) test0166(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36000000 + "'", int12 == 36000000);
// flaky "20) test0166(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36000000 + "'", int14 == 36000000);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "14) test0166(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+10:00" + "'", str18, "+10:00");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long15 = dateTimeZone12.convertLocalToUTC((-1570084924001L), false);
        boolean boolean16 = dateTimeZone1.equals((java.lang.Object) long15);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone1.getShortName((-35999901L), locale18);
        java.lang.String str20 = dateTimeZone1.toString();
        int int22 = dateTimeZone1.getOffset((-91L));
        java.lang.Object obj23 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924000L) + "'", long15 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getShortName((long) (short) 0, locale13);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone3.getOffset(readableInstant16);
        boolean boolean19 = dateTimeZone3.isStandardOffset((-25200001L));
        int int21 = dateTimeZone3.getStandardOffset(98L);
        long long23 = dateTimeZone3.previousTransition((-59968L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "39) test0169(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "37) test0169(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
// flaky "31) test0169(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:00" + "'", str11, "+10:00");
// flaky "21) test0169(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
// flaky "15) test0169(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36000000 + "'", int17 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
// flaky "12) test0169(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 36000000 + "'", int21 == 36000000);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-59968L) + "'", long23 == (-59968L));
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        long long7 = dateTimeZone1.previousTransition(10L);
        long long9 = dateTimeZone1.nextTransition((-115799999L));
        java.util.Set<java.lang.String> strSet10 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean11 = dateTimeZone1.equals((java.lang.Object) strSet10);
        java.lang.String str12 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "40) test0170(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36000000 + "'", int5 == 36000000);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-115799999L) + "'", long9 == (-115799999L));
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "38) test0170(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 60000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        int int8 = dateTimeZone1.getStandardOffset(0L);
        long long12 = dateTimeZone1.convertLocalToUTC(102L, false, 2L);
        java.lang.String str13 = dateTimeZone1.toString();
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getName(0L, locale15);
        java.lang.String str17 = dateTimeZone1.toString();
        long long20 = dateTimeZone1.adjustOffset((-4L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 103L + "'", long12 == 103L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-4L) + "'", long20 == (-4L));
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((-1570084924101L), locale8);
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int13 = dateTimeZone1.getOffsetFromLocal((long) 35);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone1.getOffset(readableInstant14);
        java.lang.String str16 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "41) test0174(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "39) test0174(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:00" + "'", str9, "+10:00");
        org.junit.Assert.assertNotNull(obj10);
// flaky "32) test0174(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36000000 + "'", int13 == 36000000);
// flaky "22) test0174(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36000000 + "'", int15 == 36000000);
// flaky "16) test0174(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+10:00" + "'", str16, "+10:00");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean4 = dateTimeZone1.isFixed();
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((-3660000L), locale6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "42) test0175(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "40) test0175(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+10:00" + "'", str7, "+10:00");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long12 = dateTimeZone1.convertLocalToUTC((-1570084924100L), true);
        long long16 = dateTimeZone1.convertLocalToUTC((long) (byte) 1, false, (long) (short) 1);
        long long18 = dateTimeZone1.previousTransition((-1570084924201L));
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone1.getName((-1570120924200L), locale20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "43) test0176(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:00" + "'", str8, "+10:00");
// flaky "41) test0176(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1570120924100L) + "'", long12 == (-1570120924100L));
// flaky "33) test0176(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-35999999L) + "'", long16 == (-35999999L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1570084924201L) + "'", long18 == (-1570084924201L));
// flaky "23) test0176(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+10:00" + "'", str21, "+10:00");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((-1570084924000L), locale6);
        java.lang.String str8 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((long) 25200000);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        long long8 = dateTimeZone4.getMillisKeepLocal(dateTimeZone6, (long) 'a');
        int int10 = dateTimeZone6.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone11 = dateTimeZone6.toTimeZone();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone6.getShortName((long) (byte) 100, locale13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone6.getShortName((long) (short) 0, locale16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone6.getName((long) (short) 100, locale19);
        java.lang.String str22 = dateTimeZone6.getName((long) (-1));
        boolean boolean24 = dateTimeZone6.isStandardOffset((long) (short) -1);
        boolean boolean25 = dateTimeZone0.equals((java.lang.Object) dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) '4');
        long long29 = dateTimeZone0.getMillisKeepLocal(dateTimeZone27, (long) 60000);
        org.joda.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = dateTimeZone27.isLocalDateTimeGap(localDateTime30);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
// flaky "44) test0178(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36000000 + "'", int10 == 36000000);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky "42) test0178(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+10:00");
// flaky "34) test0178(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
// flaky "24) test0178(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+10:00" + "'", str17, "+10:00");
// flaky "17) test0178(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+10:00" + "'", str20, "+10:00");
// flaky "13) test0178(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+10:00" + "'", str22, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-187140000L) + "'", long29 == (-187140000L));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        boolean boolean9 = dateTimeZone1.isStandardOffset(115800002L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, true);
        long long8 = dateTimeZone1.convertLocalToUTC(25199999L, false, (-25200000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25199998L + "'", long8 == 25199998L);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        long long14 = dateTimeZone10.convertLocalToUTC((long) 0, false, 36000001L);
        int int16 = dateTimeZone10.getOffset(0L);
        java.lang.Class<?> wildcardClass17 = dateTimeZone10.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        boolean boolean7 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int10 = dateTimeZone1.getStandardOffset(31L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        java.lang.String str8 = dateTimeZone1.getName((-1570084924101L));
        java.lang.Object obj9 = dateTimeZone1.writeReplace();
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((-35999901L), locale12);
        long long17 = dateTimeZone1.convertLocalToUTC(95L, false, 36000001L);
        java.lang.String str19 = dateTimeZone1.getShortName((-1570084924047L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 96L + "'", long17 == 96L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        int int10 = dateTimeZone3.getOffset((long) (short) 1);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone3.getShortName((long) 25200000, locale12);
        long long17 = dateTimeZone3.convertLocalToUTC((-25200001L), true, 25200052L);
        boolean boolean19 = dateTimeZone3.equals((java.lang.Object) 79800002L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-25200000L) + "'", long17 == (-25200000L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.lang.String str6 = dateTimeZone1.getID();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((-35999991L), locale8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, (int) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int6 = dateTimeZone4.getStandardOffset((long) 10);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone8.getMillisKeepLocal(dateTimeZone10, (long) 'a');
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone8.getName((long) (short) 1, locale14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        boolean boolean17 = dateTimeZone4.equals((java.lang.Object) dateTimeZone8);
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, (long) (byte) 0);
        java.lang.String str20 = dateTimeZone8.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115800000 + "'", int6 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 101L + "'", long19 == 101L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+35:52");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+35:52\" is malformed at \"35:52\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        java.lang.String str8 = dateTimeZone1.getName((-2L));
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName((long) '#', locale10);
        long long13 = dateTimeZone1.nextTransition(61200002L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "45) test0190(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "43) test0190(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:00" + "'", str8, "+10:00");
// flaky "35) test0190(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:00" + "'", str11, "+10:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 61200002L + "'", long13 == 61200002L);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((-1570084924101L), locale8);
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int13 = dateTimeZone1.getOffsetFromLocal((long) 35);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone1.getOffset(readableInstant14);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone1.getShortName((-35999902L), locale17);
        boolean boolean19 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "46) test0193(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "44) test0193(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:00" + "'", str9, "+10:00");
        org.junit.Assert.assertNotNull(obj10);
// flaky "36) test0193(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36000000 + "'", int13 == 36000000);
// flaky "25) test0193(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36000000 + "'", int15 == 36000000);
// flaky "18) test0193(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+10:00" + "'", str18, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getShortName((long) (short) 0, locale13);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        int int17 = dateTimeZone3.getOffsetFromLocal((long) 1);
        java.lang.Object obj18 = dateTimeZone3.writeReplace();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "47) test0194(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "45) test0194(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
// flaky "37) test0194(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:00" + "'", str11, "+10:00");
// flaky "26) test0194(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
// flaky "19) test0194(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36000000 + "'", int17 == 36000000);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone3.getName((long) (short) 10, locale11);
        boolean boolean14 = dateTimeZone3.equals((java.lang.Object) (byte) 0);
        java.lang.String str16 = dateTimeZone3.getName(115799900L);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone3.isLocalDateTimeGap(localDateTime17);
        java.lang.String str20 = dateTimeZone3.getNameKey(89520000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "48) test0195(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "46) test0195(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "38) test0195(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+10:00");
// flaky "27) test0195(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "20) test0195(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+10:00" + "'", str16, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.lang.String str10 = dateTimeZone1.getShortName(1L);
        long long12 = dateTimeZone1.nextTransition((long) 10);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone1.isLocalDateTimeGap(localDateTime13);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        int int19 = dateTimeZone16.getStandardOffset(0L);
        boolean boolean21 = dateTimeZone16.isStandardOffset(0L);
        java.lang.String str23 = dateTimeZone16.getShortName((-3659998L));
        boolean boolean24 = dateTimeZone1.equals((java.lang.Object) str23);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "49) test0196(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36000000 + "'", int5 == 36000000);
// flaky "47) test0196(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
// flaky "39) test0196(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36000000 + "'", int8 == 36000000);
// flaky "28) test0196(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+10:00" + "'", str10, "+10:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.001" + "'", str23, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str13 = dateTimeZone11.getNameKey(84L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "50) test0197(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "48) test0197(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "40) test0197(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky "29) test0197(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        long long12 = dateTimeZone1.previousTransition((long) (short) 100);
        boolean boolean14 = dateTimeZone1.isStandardOffset(51L);
        long long16 = dateTimeZone1.nextTransition((long) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360600000, (-3660000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3660000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(100L, locale11);
        java.lang.Object obj13 = dateTimeZone1.writeReplace();
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone1.isLocalDateTimeGap(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "51) test0200(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:00" + "'", str8, "+10:00");
// flaky "49) test0200(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.lang.String str9 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "52) test0201(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36000000 + "'", int5 == 36000000);
// flaky "50) test0201(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
// flaky "41) test0201(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36000000 + "'", int8 == 36000000);
// flaky "30) test0201(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:00" + "'", str9, "+10:00");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.Class<?> wildcardClass3 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "53) test0202(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (byte) 1, false);
        long long7 = dateTimeZone1.previousTransition(0L);
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        java.lang.String str12 = dateTimeZone1.getName(102L);
        long long14 = dateTimeZone1.nextTransition(3L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone1.getOffset(readableInstant3);
        java.lang.String str6 = dateTimeZone1.getShortName((long) (byte) 10);
        int int8 = dateTimeZone1.getStandardOffset((long) 10);
        java.lang.Class<?> wildcardClass9 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((long) 25200000);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        long long8 = dateTimeZone4.getMillisKeepLocal(dateTimeZone6, (long) 'a');
        int int10 = dateTimeZone6.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone11 = dateTimeZone6.toTimeZone();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone6.getShortName((long) (byte) 100, locale13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone6.getShortName((long) (short) 0, locale16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone6.getName((long) (short) 100, locale19);
        java.lang.String str22 = dateTimeZone6.getName((long) (-1));
        boolean boolean24 = dateTimeZone6.isStandardOffset((long) (short) -1);
        boolean boolean25 = dateTimeZone0.equals((java.lang.Object) dateTimeZone6);
        java.util.TimeZone timeZone26 = dateTimeZone0.toTimeZone();
        java.lang.Class<?> wildcardClass27 = timeZone26.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
// flaky "54) test0205(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
// flaky "51) test0205(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
// flaky "42) test0205(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
// flaky "31) test0205(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
// flaky "21) test0205(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long12 = dateTimeZone1.convertLocalToUTC((-1570084924100L), true);
        long long14 = dateTimeZone1.convertUTCToLocal((-1570120924001L));
        java.lang.String str16 = dateTimeZone1.getNameKey((-35939969L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "55) test0206(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
// flaky "52) test0206(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1570084924200L) + "'", long12 == (-1570084924200L));
// flaky "43) test0206(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1570120923901L) + "'", long14 == (-1570120923901L));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        int int10 = dateTimeZone1.getOffset((long) 1);
        int int12 = dateTimeZone1.getOffset((long) '#');
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getName((long) (short) 10, locale14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "56) test0207(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
// flaky "53) test0207(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
// flaky "44) test0207(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
// flaky "32) test0207(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long11 = dateTimeZone1.nextTransition((long) ' ');
        boolean boolean13 = dateTimeZone1.isStandardOffset((long) (short) 1);
        int int15 = dateTimeZone1.getOffset((-35999990L));
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = dateTimeZone1.isLocalDateTimeGap(localDateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "57) test0208(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "54) test0208(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60000 + "'", int15 == 60000);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getShortName((long) (short) 0, locale13);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        long long19 = dateTimeZone3.convertLocalToUTC(0L, false, 35L);
        long long22 = dateTimeZone3.adjustOffset((-35999899L), false);
        java.lang.Class<?> wildcardClass23 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "58) test0209(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "55) test0209(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:01");
// flaky "45) test0209(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
// flaky "33) test0209(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
// flaky "22) test0209(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-60000L) + "'", long19 == (-60000L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-35999899L) + "'", long22 == (-35999899L));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, (-3660000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3660000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int9 = dateTimeZone7.getStandardOffset((long) 10);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        long long15 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, (long) 'a');
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone11.getName((long) (short) 1, locale17);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        boolean boolean20 = dateTimeZone7.equals((java.lang.Object) dateTimeZone11);
        long long22 = dateTimeZone4.getMillisKeepLocal(dateTimeZone11, (long) (byte) 0);
        long long24 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 115800097L);
        boolean boolean26 = dateTimeZone2.isStandardOffset((-1569969664099L));
        long long28 = dateTimeZone2.previousTransition(61200002L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115800000 + "'", int9 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
// flaky "59) test0211(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "56) test0211(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-59900L) + "'", long22 == (-59900L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 231059997L + "'", long24 == 231059997L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 61200002L + "'", long28 == 61200002L);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        int int10 = dateTimeZone3.getOffset((long) (short) 1);
        int int12 = dateTimeZone3.getOffsetFromLocal(0L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str16 = dateTimeZone14.getNameKey((long) 115800000);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone14.getShortName((-1570084924001L), locale18);
        java.lang.String str21 = dateTimeZone14.getName((-1570084924101L));
        long long23 = dateTimeZone3.getMillisKeepLocal(dateTimeZone14, (long) (byte) 1);
        java.lang.Class<?> wildcardClass24 = dateTimeZone14.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-00:00:00.001" + "'", str21, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 1);
        boolean boolean4 = dateTimeZone2.equals((java.lang.Object) 25200001L);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 'a');
        java.lang.String str12 = dateTimeZone6.getName((long) (byte) 10);
        long long14 = dateTimeZone2.getMillisKeepLocal(dateTimeZone6, (long) '4');
        java.lang.String str15 = dateTimeZone6.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 115260053L + "'", long14 == 115260053L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.nextTransition((long) 1);
        boolean boolean12 = dateTimeZone3.isFixed();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str15 = dateTimeZone13.getShortName((long) 25200000);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        long long21 = dateTimeZone17.getMillisKeepLocal(dateTimeZone19, (long) 'a');
        int int23 = dateTimeZone19.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone24 = dateTimeZone19.toTimeZone();
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone19.getShortName((long) (byte) 100, locale26);
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone19.getShortName((long) (short) 0, locale29);
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone19.getName((long) (short) 100, locale32);
        java.lang.String str35 = dateTimeZone19.getName((long) (-1));
        boolean boolean37 = dateTimeZone19.isStandardOffset((long) (short) -1);
        boolean boolean38 = dateTimeZone13.equals((java.lang.Object) dateTimeZone19);
        long long40 = dateTimeZone3.getMillisKeepLocal(dateTimeZone13, (-1570120924101L));
        int int42 = dateTimeZone13.getOffset((-1570048924000L));
        long long45 = dateTimeZone13.convertLocalToUTC((long) 2100000, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-00:00:00.001" + "'", str27, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-00:00:00.001" + "'", str30, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-00:00:00.001" + "'", str33, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-00:00:00.001" + "'", str35, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1570120924102L) + "'", long40 == (-1570120924102L));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 2100000L + "'", long45 == 2100000L);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-01:01");
        java.lang.String str3 = dateTimeZone1.getNameKey(101L);
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT-01:01");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(60000, 25200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 25200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone3.getName((long) (short) 10, locale11);
        java.lang.String str14 = dateTimeZone3.getName(0L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        int int17 = dateTimeZone3.getStandardOffset((long) 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "60) test0217(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "57) test0217(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "46) test0217(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+10:00");
// flaky "34) test0217(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
// flaky "23) test0217(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
// flaky "14) test0217(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36000000 + "'", int17 == 36000000);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int4 = dateTimeZone2.getStandardOffset((long) 10);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 'a');
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone6.getName((long) (short) 1, locale12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        boolean boolean15 = dateTimeZone2.equals((java.lang.Object) dateTimeZone6);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone2.getOffset(readableInstant16);
        long long21 = dateTimeZone2.convertLocalToUTC((-99L), false, 36000002L);
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone2.isLocalDateTimeGap(localDateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
// flaky "61) test0218(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115800000 + "'", int17 == 115800000);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-115800099L) + "'", long21 == (-115800099L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        int int4 = dateTimeZone1.getStandardOffset(0L);
        boolean boolean6 = dateTimeZone1.isStandardOffset(0L);
        java.lang.String str8 = dateTimeZone1.getShortName((-3659998L));
        boolean boolean10 = dateTimeZone1.isStandardOffset(36000032L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int6 = dateTimeZone4.getStandardOffset((long) 10);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone8.getMillisKeepLocal(dateTimeZone10, (long) 'a');
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone8.getName((long) (short) 1, locale14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        boolean boolean17 = dateTimeZone4.equals((java.lang.Object) dateTimeZone8);
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, (long) (byte) 0);
        boolean boolean21 = dateTimeZone1.isStandardOffset(0L);
        java.util.TimeZone timeZone22 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115800000 + "'", int6 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
// flaky "62) test0220(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "58) test0220(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 99L + "'", long19 == 99L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone23);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        int int6 = dateTimeZone1.getOffset((long) 115800000);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((-1570200724001L), locale8);
        java.lang.String str11 = dateTimeZone1.getNameKey((long) (byte) 1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getName((long) 25200000, locale13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        boolean boolean8 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone10.nextTransition((long) (short) 100);
        java.lang.String str14 = dateTimeZone10.getNameKey(1L);
        long long16 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, (-25200001L));
        java.lang.String str17 = dateTimeZone1.getID();
        java.util.TimeZone timeZone18 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.lang.Class<?> wildcardClass20 = timeZone18.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "63) test0223(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-25200001L) + "'", long16 == (-25200001L));
// flaky "59) test0223(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        long long15 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, (long) 'a');
        int int17 = dateTimeZone13.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone18 = dateTimeZone13.toTimeZone();
        java.util.TimeZone timeZone19 = dateTimeZone13.toTimeZone();
        long long21 = dateTimeZone13.convertUTCToLocal(0L);
        long long23 = dateTimeZone1.getMillisKeepLocal(dateTimeZone13, (long) (short) -1);
        long long26 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int28 = dateTimeZone1.getStandardOffset((-231599899L));
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone1.getName((-35939969L), locale30);
        int int33 = dateTimeZone1.getOffsetFromLocal(3L);
        int int35 = dateTimeZone1.getStandardOffset((-1570196524001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "64) test0224(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
// flaky "60) test0224(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60000 + "'", int17 == 60000);
        org.junit.Assert.assertNotNull(timeZone18);
// flaky "47) test0224(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(timeZone19);
// flaky "35) test0224(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:01");
// flaky "24) test0224(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 60000L + "'", long21 == 60000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
// flaky "15) test0224(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1570084984001L) + "'", long26 == (-1570084984001L));
// flaky "8) test0224(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 60000 + "'", int28 == 60000);
// flaky "6) test0224(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:01" + "'", str31, "+00:01");
// flaky "2) test0224(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 60000 + "'", int33 == 60000);
// flaky "2) test0224(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 60000 + "'", int35 == 60000);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', 1);
        int int4 = dateTimeZone2.getOffset((-39659899L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 126060000 + "'", int4 == 126060000);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        boolean boolean10 = dateTimeZone1.isStandardOffset((-90600000L));
        java.lang.String str12 = dateTimeZone1.getShortName((-1570048923902L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        int int8 = dateTimeZone1.getStandardOffset(0L);
        long long12 = dateTimeZone1.convertLocalToUTC(102L, false, 2L);
        java.lang.String str13 = dateTimeZone1.toString();
        int int15 = dateTimeZone1.getOffset(53520001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 103L + "'", long12 == 103L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone3.getName((long) (short) 10, locale11);
        boolean boolean13 = dateTimeZone3.isFixed();
        java.util.TimeZone timeZone14 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long17 = dateTimeZone15.previousTransition((-39659900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "65) test0228(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "61) test0228(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "48) test0228(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:01");
// flaky "36) test0228(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
// flaky "25) test0228(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-39659900L) + "'", long17 == (-39659900L));
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getShortName((long) (short) 0, locale13);
        java.lang.String str15 = dateTimeZone3.getID();
        java.lang.String str16 = dateTimeZone3.getID();
        boolean boolean17 = dateTimeZone3.isFixed();
        int int19 = dateTimeZone3.getOffset(79800002L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "66) test0229(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "62) test0229(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:01");
// flaky "49) test0229(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
// flaky "37) test0229(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
// flaky "26) test0229(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
// flaky "16) test0229(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "9) test0229(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60000 + "'", int19 == 60000);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long12 = dateTimeZone1.convertLocalToUTC((long) (short) 10, true, 25199999L);
        long long14 = dateTimeZone1.convertUTCToLocal(52L);
        java.lang.String str16 = dateTimeZone1.getNameKey(25200000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 11L + "'", long12 == 11L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 51L + "'", long14 == 51L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 1);
        boolean boolean4 = dateTimeZone2.equals((java.lang.Object) 25200001L);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 'a');
        int int12 = dateTimeZone8.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone13 = dateTimeZone8.toTimeZone();
        java.util.TimeZone timeZone14 = dateTimeZone8.toTimeZone();
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone8.getName((long) (short) 10, locale16);
        java.lang.String str19 = dateTimeZone8.getName(0L);
        long long21 = dateTimeZone8.previousTransition(25200052L);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone8.getShortName((long) 0, locale23);
        long long26 = dateTimeZone2.getMillisKeepLocal(dateTimeZone8, (-25200001L));
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        long long32 = dateTimeZone28.getMillisKeepLocal(dateTimeZone30, (long) 'a');
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone28.getName((long) (short) 1, locale34);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        java.util.Locale locale38 = null;
        java.lang.String str39 = dateTimeZone28.getName(100L, locale38);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        int int42 = dateTimeZone28.getOffsetFromLocal(100L);
        long long44 = dateTimeZone2.getMillisKeepLocal(dateTimeZone28, (-25740000L));
        long long47 = dateTimeZone2.adjustOffset((-1570164724101L), true);
        long long49 = dateTimeZone2.convertUTCToLocal((-1570084923900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
// flaky "67) test0231(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
// flaky "63) test0231(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
// flaky "50) test0231(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.001" + "'", str19, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 25200052L + "'", long21 == 25200052L);
// flaky "38) test0231(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.001" + "'", str24, "+00:00:00.001");
// flaky "27) test0231(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 90059998L + "'", long26 == 90059998L);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 97L + "'", long32 == 97L);
// flaky "17) test0231(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.001" + "'", str35, "+00:00:00.001");
// flaky "10) test0231(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.001" + "'", str39, "+00:00:00.001");
// flaky "7) test0231(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
// flaky "3) test0231(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long44 + "' != '" + 89519999L + "'", long44 == 89519999L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1570164724101L) + "'", long47 == (-1570164724101L));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1569969663900L) + "'", long49 == (-1569969663900L));
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone3.getName((long) (short) 10, locale11);
        java.lang.String str14 = dateTimeZone3.getName(0L);
        java.lang.String str15 = dateTimeZone3.getID();
        java.util.TimeZone timeZone16 = dateTimeZone3.toTimeZone();
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone3.getShortName(25200051L, locale18);
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone3.isLocalDateTimeGap(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "68) test0232(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
// flaky "64) test0232(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
// flaky "51) test0232(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
// flaky "39) test0232(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:00");
// flaky "28) test0232(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.001" + "'", str19, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 1);
        long long12 = dateTimeZone1.convertLocalToUTC(25200001L, true, 231059997L);
        long long14 = dateTimeZone1.previousTransition((-35999991L));
        int int16 = dateTimeZone1.getOffsetFromLocal((long) '#');
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 25200002L + "'", long12 == 25200002L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-35999991L) + "'", long14 == (-35999991L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str6 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        long long10 = dateTimeZone1.convertLocalToUTC((-1L), false, (long) '#');
        java.lang.String str11 = dateTimeZone1.getID();
        java.lang.Object obj12 = dateTimeZone1.writeReplace();
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getName((-206400000L), locale14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        long long21 = dateTimeZone17.getMillisKeepLocal(dateTimeZone19, (long) 'a');
        java.lang.String str23 = dateTimeZone17.getNameKey(25200000L);
        long long26 = dateTimeZone17.convertLocalToUTC((long) 100, false);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str30 = dateTimeZone28.getNameKey((long) 115800000);
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone28.getShortName((-1570084924001L), locale32);
        java.lang.String str35 = dateTimeZone28.getName((-1570084924101L));
        long long37 = dateTimeZone28.previousTransition((long) (short) 10);
        boolean boolean38 = dateTimeZone17.equals((java.lang.Object) long37);
        boolean boolean39 = dateTimeZone1.equals((java.lang.Object) long37);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2L) + "'", long10 == (-2L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-00:00:00.001" + "'", str33, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-00:00:00.001" + "'", str35, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10L + "'", long37 == 10L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        int int9 = dateTimeZone1.getStandardOffset((-61199968L));
        long long11 = dateTimeZone1.nextTransition(119340000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 119340000L + "'", long11 == 119340000L);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long11 = dateTimeZone1.nextTransition((long) ' ');
        boolean boolean13 = dateTimeZone1.isStandardOffset((long) (short) 1);
        int int15 = dateTimeZone1.getOffset((-35999990L));
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        long long21 = dateTimeZone17.getMillisKeepLocal(dateTimeZone19, (long) 'a');
        int int23 = dateTimeZone19.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone24 = dateTimeZone19.toTimeZone();
        java.util.TimeZone timeZone25 = dateTimeZone19.toTimeZone();
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone19.getName((long) (short) 10, locale27);
        boolean boolean30 = dateTimeZone19.equals((java.lang.Object) (byte) 0);
        boolean boolean31 = dateTimeZone1.equals((java.lang.Object) dateTimeZone19);
        java.lang.String str32 = dateTimeZone19.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.100" + "'", str28, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.100" + "'", str32, "+00:00:00.100");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        boolean boolean4 = dateTimeZone1.isStandardOffset(98L);
        long long8 = dateTimeZone1.convertLocalToUTC(35999900L, false, (-1570197064001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35999800L + "'", long8 == 35999800L);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(360600000);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) 52);
        long long6 = dateTimeZone1.convertLocalToUTC((long) '4', false);
        int int8 = dateTimeZone1.getOffset(89520000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-360599948L) + "'", long6 == (-360599948L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 360600000 + "'", int8 == 360600000);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        int int8 = dateTimeZone1.getOffsetFromLocal(25200052L);
        java.lang.String str9 = dateTimeZone1.toString();
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "69) test0240(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "65) test0240(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "52) test0240(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long5 = dateTimeZone1.convertUTCToLocal(100L);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        java.lang.String str9 = dateTimeZone1.getNameKey((-91L));
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName((-35999904L), locale11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 99L + "'", long5 == 99L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        long long15 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, (long) 'a');
        int int17 = dateTimeZone13.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone18 = dateTimeZone13.toTimeZone();
        java.util.TimeZone timeZone19 = dateTimeZone13.toTimeZone();
        long long21 = dateTimeZone13.convertUTCToLocal(0L);
        long long23 = dateTimeZone1.getMillisKeepLocal(dateTimeZone13, (long) (short) -1);
        long long26 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int28 = dateTimeZone1.getStandardOffset((-231599899L));
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone1.getName((-35939969L), locale30);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int36 = dateTimeZone34.getStandardOffset((long) 10);
        java.util.TimeZone timeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        long long42 = dateTimeZone38.getMillisKeepLocal(dateTimeZone40, (long) 'a');
        java.util.Locale locale44 = null;
        java.lang.String str45 = dateTimeZone38.getName((long) (short) 1, locale44);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone38);
        boolean boolean47 = dateTimeZone34.equals((java.lang.Object) dateTimeZone38);
        boolean boolean48 = dateTimeZone1.equals((java.lang.Object) dateTimeZone34);
        java.lang.Class<?> wildcardClass49 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "70) test0242(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
// flaky "66) test0242(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(timeZone18);
// flaky "53) test0242(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone19);
// flaky "40) test0242(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "29) test0242(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
// flaky "18) test0242(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1570084924001L) + "'", long26 == (-1570084924001L));
// flaky "11) test0242(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
// flaky "8) test0242(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 115800000 + "'", int36 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 97L + "'", long42 == 97L);
// flaky "4) test0242(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00" + "'", str45, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 1, false, 97L);
        int int7 = dateTimeZone1.getOffset((long) 10);
        int int9 = dateTimeZone1.getOffsetFromLocal((-1569969124103L));
        int int11 = dateTimeZone1.getOffset(25200052L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "71) test0243(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky "67) test0243(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
// flaky "54) test0243(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
// flaky "41) test0243(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        java.lang.String str6 = dateTimeZone1.getShortName(2L);
        java.lang.String str8 = dateTimeZone1.getName(99L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.nextTransition((long) 1);
        long long13 = dateTimeZone3.previousTransition((-10800000L));
        int int15 = dateTimeZone3.getOffsetFromLocal((long) (byte) 0);
        java.lang.String str17 = dateTimeZone3.getName(60002L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "72) test0245(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-10800000L) + "'", long13 == (-10800000L));
// flaky "68) test0245(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
// flaky "55) test0245(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.lang.Class<?> wildcardClass10 = dateTimeZone9.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "73) test0246(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        long long3 = dateTimeZone1.previousTransition(115799999L);
        java.lang.String str5 = dateTimeZone1.getShortName((-60000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 115799999L + "'", long3 == 115799999L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.010" + "'", str5, "+00:00:00.010");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long13 = dateTimeZone1.convertLocalToUTC((-1570517524001L), true, (-1570120924201L));
        int int15 = dateTimeZone1.getOffset(25199998L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1570517524000L) + "'", long13 == (-1570517524000L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((-25200001L));
        java.lang.Object obj3 = dateTimeZone0.writeReplace();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(2100000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        int int8 = dateTimeZone1.getOffsetFromLocal(25200052L);
        java.lang.String str9 = dateTimeZone1.toString();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName((-1570200724100L), locale11);
        long long14 = dateTimeZone1.previousTransition((-115799904L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 349200000 + "'", int8 == 349200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115799904L) + "'", long14 == (-115799904L));
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        java.lang.String str8 = dateTimeZone1.getNameKey((-1570084924201L));
        long long10 = dateTimeZone1.previousTransition((long) (byte) -1);
        long long12 = dateTimeZone1.previousTransition((long) 2100000);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2100000L + "'", long12 == 2100000L);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.nextTransition((long) 1);
        int int13 = dateTimeZone3.getOffset((long) (-1));
        java.lang.String str14 = dateTimeZone3.toString();
        long long16 = dateTimeZone3.nextTransition((-1570048924000L));
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone3.isLocalDateTimeGap(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1570048924000L) + "'", long16 == (-1570048924000L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        long long7 = dateTimeZone1.convertLocalToUTC((long) ' ', false, (-25740001L));
        java.lang.String str8 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "74) test0255(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 31L + "'", long7 == 31L);
// flaky "69) test0255(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(60000, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        long long5 = dateTimeZone1.adjustOffset(36000000L, true);
        java.lang.String str7 = dateTimeZone1.getNameKey((-1570200724001L));
        int int9 = dateTimeZone1.getOffsetFromLocal(0L);
        int int11 = dateTimeZone1.getOffsetFromLocal((long) 360600000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 36000000L + "'", long5 == 36000000L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (short) 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getName(25200000L, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone2.getOffset(readableInstant6);
        java.lang.Class<?> wildcardClass8 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        int int3 = dateTimeZone1.getOffset((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((-115799866L), false, 0L);
        java.lang.String str9 = dateTimeZone1.getName(115740100L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-115799901L) + "'", long7 == (-115799901L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.035" + "'", str9, "+00:00:00.035");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (byte) 1, false);
        long long7 = dateTimeZone1.previousTransition(0L);
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        java.lang.String str12 = dateTimeZone1.getName(102L);
        long long15 = dateTimeZone1.convertLocalToUTC(8L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 7L + "'", long15 == 7L);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(115260000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 1);
        boolean boolean4 = dateTimeZone2.equals((java.lang.Object) 25200001L);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 'a');
        int int12 = dateTimeZone8.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone13 = dateTimeZone8.toTimeZone();
        java.util.TimeZone timeZone14 = dateTimeZone8.toTimeZone();
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone8.getName((long) (short) 10, locale16);
        java.lang.String str19 = dateTimeZone8.getName(0L);
        long long21 = dateTimeZone8.previousTransition(25200052L);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone8.getShortName((long) 0, locale23);
        long long26 = dateTimeZone2.getMillisKeepLocal(dateTimeZone8, (-25200001L));
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        long long32 = dateTimeZone28.getMillisKeepLocal(dateTimeZone30, (long) 'a');
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone28.getName((long) (short) 1, locale34);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        java.util.Locale locale38 = null;
        java.lang.String str39 = dateTimeZone28.getName(100L, locale38);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        int int42 = dateTimeZone28.getOffsetFromLocal(100L);
        long long44 = dateTimeZone2.getMillisKeepLocal(dateTimeZone28, (-25740000L));
        java.lang.String str46 = dateTimeZone2.getNameKey(3L);
        long long48 = dateTimeZone2.nextTransition((-43L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
// flaky "75) test0264(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
// flaky "70) test0264(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
// flaky "56) test0264(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.001" + "'", str19, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 25200052L + "'", long21 == 25200052L);
// flaky "42) test0264(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.001" + "'", str24, "+00:00:00.001");
// flaky "30) test0264(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 90059998L + "'", long26 == 90059998L);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 97L + "'", long32 == 97L);
// flaky "19) test0264(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.001" + "'", str35, "+00:00:00.001");
// flaky "12) test0264(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.001" + "'", str39, "+00:00:00.001");
// flaky "9) test0264(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
// flaky "5) test0264(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long44 + "' != '" + 89519999L + "'", long44 == 89519999L);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-43L) + "'", long48 == (-43L));
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 1);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone10.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone10.getOffset(readableInstant13);
        java.lang.Object obj15 = dateTimeZone10.writeReplace();
        java.lang.Object obj16 = dateTimeZone10.writeReplace();
        boolean boolean17 = dateTimeZone10.isFixed();
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        long long21 = dateTimeZone19.nextTransition((long) (short) 100);
        java.lang.String str23 = dateTimeZone19.getNameKey(1L);
        long long25 = dateTimeZone10.getMillisKeepLocal(dateTimeZone19, (-25200001L));
        long long27 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, (long) 'a');
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        java.lang.Object obj30 = dateTimeZone29.writeReplace();
        boolean boolean31 = dateTimeZone10.equals(obj30);
        long long34 = dateTimeZone10.adjustOffset(3659900L, false);
        java.util.TimeZone timeZone35 = dateTimeZone10.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
// flaky "76) test0265(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-25200001L) + "'", long25 == (-25200001L));
// flaky "71) test0265(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 95L + "'", long27 == 95L);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 3659900L + "'", long34 == 3659900L);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (short) 0, true);
        long long7 = dateTimeZone1.nextTransition(1L);
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        int int10 = dateTimeZone1.getOffsetFromLocal(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (-3660000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3660000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        java.lang.String str8 = dateTimeZone1.getName((-1570084924101L));
        java.lang.Object obj9 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        long long15 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, (long) 'a');
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone11.getName((long) (short) 1, locale17);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long25 = dateTimeZone21.getMillisKeepLocal(dateTimeZone23, (long) 'a');
        int int27 = dateTimeZone23.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone28 = dateTimeZone23.toTimeZone();
        java.util.TimeZone timeZone29 = dateTimeZone23.toTimeZone();
        long long31 = dateTimeZone23.convertUTCToLocal(0L);
        long long33 = dateTimeZone11.getMillisKeepLocal(dateTimeZone23, (long) (short) -1);
        long long36 = dateTimeZone11.convertLocalToUTC((-1570084924001L), false);
        int int38 = dateTimeZone11.getStandardOffset((-231599899L));
        boolean boolean39 = dateTimeZone1.equals((java.lang.Object) int38);
        java.lang.Class<?> wildcardClass40 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
// flaky "77) test0268(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 97L + "'", long25 == 97L);
// flaky "72) test0268(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "GMT+00:00");
// flaky "57) test0268(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
// flaky "43) test0268(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1570084924002L) + "'", long36 == (-1570084924002L));
// flaky "31) test0268(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((long) 25200000);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        long long8 = dateTimeZone4.getMillisKeepLocal(dateTimeZone6, (long) 'a');
        int int10 = dateTimeZone6.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone11 = dateTimeZone6.toTimeZone();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone6.getShortName((long) (byte) 100, locale13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone6.getShortName((long) (short) 0, locale16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone6.getName((long) (short) 100, locale19);
        java.lang.String str22 = dateTimeZone6.getName((long) (-1));
        boolean boolean24 = dateTimeZone6.isStandardOffset((long) (short) -1);
        boolean boolean25 = dateTimeZone0.equals((java.lang.Object) dateTimeZone6);
        long long27 = dateTimeZone6.previousTransition(115799900L);
        long long30 = dateTimeZone6.convertLocalToUTC((long) 0, false);
        long long32 = dateTimeZone6.convertUTCToLocal(2L);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int37 = dateTimeZone35.getStandardOffset((long) 10);
        java.util.TimeZone timeZone38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        java.util.TimeZone timeZone40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        long long43 = dateTimeZone39.getMillisKeepLocal(dateTimeZone41, (long) 'a');
        java.util.Locale locale45 = null;
        java.lang.String str46 = dateTimeZone39.getName((long) (short) 1, locale45);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone39);
        boolean boolean48 = dateTimeZone35.equals((java.lang.Object) dateTimeZone39);
        long long50 = dateTimeZone39.convertUTCToLocal((-1570084924099L));
        long long52 = dateTimeZone6.getMillisKeepLocal(dateTimeZone39, 36000000L);
        long long55 = dateTimeZone6.adjustOffset(100L, true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
// flaky "78) test0269(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
// flaky "73) test0269(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
// flaky "58) test0269(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
// flaky "44) test0269(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.001" + "'", str20, "+00:00:00.001");
// flaky "32) test0269(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.001" + "'", str22, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 115799900L + "'", long27 == 115799900L);
// flaky "20) test0269(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
// flaky "13) test0269(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 3L + "'", long32 == 3L);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 115800000 + "'", int37 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 97L + "'", long43 == 97L);
// flaky "10) test0269(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00:00.001" + "'", str46, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
// flaky "6) test0269(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1570084924098L) + "'", long50 == (-1570084924098L));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 36000000L + "'", long52 == 36000000L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 100L + "'", long55 == 100L);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 1);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone10.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone10.getOffset(readableInstant13);
        java.lang.Object obj15 = dateTimeZone10.writeReplace();
        java.lang.Object obj16 = dateTimeZone10.writeReplace();
        boolean boolean17 = dateTimeZone10.isFixed();
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        long long21 = dateTimeZone19.nextTransition((long) (short) 100);
        java.lang.String str23 = dateTimeZone19.getNameKey(1L);
        long long25 = dateTimeZone10.getMillisKeepLocal(dateTimeZone19, (-25200001L));
        long long27 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, (long) 'a');
        int int29 = dateTimeZone1.getOffset((-35999900L));
        long long32 = dateTimeZone1.convertLocalToUTC(99L, false);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long37 = dateTimeZone34.convertLocalToUTC((long) 1, true);
        long long39 = dateTimeZone34.previousTransition((long) ' ');
        int int41 = dateTimeZone34.getOffset(25200001L);
        java.lang.String str42 = dateTimeZone34.getID();
        int int44 = dateTimeZone34.getOffset((long) (short) 1);
        long long46 = dateTimeZone1.getMillisKeepLocal(dateTimeZone34, (-10800000L));
        java.util.TimeZone timeZone47 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forTimeZone(timeZone47);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
// flaky "79) test0270(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-25200001L) + "'", long25 == (-25200001L));
// flaky "74) test0270(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 95L + "'", long27 == 95L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-99L) + "'", long37 == (-99L));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 32L + "'", long39 == 32L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00:00.100" + "'", str42, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-10800101L) + "'", long46 == (-10800101L));
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone48);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((long) 25200000);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        long long8 = dateTimeZone4.getMillisKeepLocal(dateTimeZone6, (long) 'a');
        int int10 = dateTimeZone6.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone11 = dateTimeZone6.toTimeZone();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone6.getShortName((long) (byte) 100, locale13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone6.getShortName((long) (short) 0, locale16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone6.getName((long) (short) 100, locale19);
        java.lang.String str22 = dateTimeZone6.getName((long) (-1));
        boolean boolean24 = dateTimeZone6.isStandardOffset((long) (short) -1);
        boolean boolean25 = dateTimeZone0.equals((java.lang.Object) dateTimeZone6);
        long long27 = dateTimeZone6.previousTransition(115799900L);
        long long30 = dateTimeZone6.convertLocalToUTC((long) 0, false);
        long long32 = dateTimeZone6.convertUTCToLocal(2L);
        boolean boolean34 = dateTimeZone6.equals((java.lang.Object) (-115799990L));
        java.util.TimeZone timeZone35 = dateTimeZone6.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
// flaky "80) test0271(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
// flaky "75) test0271(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
// flaky "59) test0271(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
// flaky "45) test0271(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.001" + "'", str20, "+00:00:00.001");
// flaky "33) test0271(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.001" + "'", str22, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 115799900L + "'", long27 == 115799900L);
// flaky "21) test0271(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
// flaky "14) test0271(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 3L + "'", long32 == 3L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(100L, locale11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int15 = dateTimeZone1.getOffsetFromLocal(100L);
        long long17 = dateTimeZone1.previousTransition((long) 10);
        boolean boolean19 = dateTimeZone1.isStandardOffset((-1570120924200L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "81) test0272(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
// flaky "76) test0272(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
// flaky "60) test0272(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        long long7 = dateTimeZone5.nextTransition((long) (short) 100);
        int int9 = dateTimeZone5.getOffsetFromLocal(100L);
        long long11 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (long) 115800000);
        java.lang.String str13 = dateTimeZone5.getShortName((long) 'a');
        java.util.TimeZone timeZone14 = dateTimeZone5.toTimeZone();
        int int16 = dateTimeZone5.getOffset((-1570084924045L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "82) test0273(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
// flaky "77) test0273(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
// flaky "61) test0273(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
// flaky "46) test0273(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone9.isLocalDateTimeGap(localDateTime10);
        long long13 = dateTimeZone9.convertUTCToLocal(200L);
        long long15 = dateTimeZone9.nextTransition(10L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "83) test0274(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 200L + "'", long13 == 200L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.getID();
        long long6 = dateTimeZone3.previousTransition((-1L));
        long long10 = dateTimeZone3.convertLocalToUTC(25200000L, true, 100L);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 100L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Class<?> wildcardClass14 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "84) test0275(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
// flaky "78) test0275(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25199999L + "'", long10 == 25199999L);
// flaky "62) test0275(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((long) 25200000);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        long long8 = dateTimeZone4.getMillisKeepLocal(dateTimeZone6, (long) 'a');
        int int10 = dateTimeZone6.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone11 = dateTimeZone6.toTimeZone();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone6.getShortName((long) (byte) 100, locale13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone6.getShortName((long) (short) 0, locale16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone6.getName((long) (short) 100, locale19);
        java.lang.String str22 = dateTimeZone6.getName((long) (-1));
        boolean boolean24 = dateTimeZone6.isStandardOffset((long) (short) -1);
        boolean boolean25 = dateTimeZone0.equals((java.lang.Object) dateTimeZone6);
        long long27 = dateTimeZone6.previousTransition(115799900L);
        long long30 = dateTimeZone6.convertLocalToUTC((long) 0, false);
        long long32 = dateTimeZone6.previousTransition((long) (byte) 0);
        boolean boolean34 = dateTimeZone6.isStandardOffset((long) ' ');
        java.lang.Object obj35 = dateTimeZone6.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.001" + "'", str20, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.001" + "'", str22, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 115799900L + "'", long27 == 115799900L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long3 = dateTimeZone1.nextTransition(36000000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 36000000L + "'", long3 == 36000000L);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.lang.String str10 = dateTimeZone1.getShortName(1L);
        long long12 = dateTimeZone1.nextTransition((long) 10);
        long long14 = dateTimeZone1.convertUTCToLocal(115799999L);
        java.lang.String str16 = dateTimeZone1.getShortName((-1570084923900L));
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forID("Asia/Bangkok");
        long long20 = dateTimeZone1.getMillisKeepLocal(dateTimeZone18, (-36000001L));
        java.lang.Class<?> wildcardClass21 = dateTimeZone18.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 115800000L + "'", long14 == 115800000L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.001" + "'", str16, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-61200000L) + "'", long20 == (-61200000L));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (-3660000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3660000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+01:52");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone3 = dateTimeZone1.toTimeZone();
        java.lang.String str5 = dateTimeZone1.getName(115800000L);
        java.lang.String str6 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.100" + "'", str5, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        int int10 = dateTimeZone1.getOffset((long) 1);
        java.lang.Object obj11 = dateTimeZone1.writeReplace();
        boolean boolean12 = dateTimeZone1.isFixed();
        int int14 = dateTimeZone1.getOffsetFromLocal((-126600000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        boolean boolean8 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone10.nextTransition((long) (short) 100);
        java.lang.String str14 = dateTimeZone10.getNameKey(1L);
        long long16 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, (-25200001L));
        java.lang.String str17 = dateTimeZone1.getID();
        java.util.TimeZone timeZone18 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        boolean boolean20 = dateTimeZone19.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-25200001L) + "'", long16 == (-25200001L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(100L, locale11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long17 = dateTimeZone1.convertLocalToUTC(100L, false, 119400000L);
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone1.getOffset(readableInstant18);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 99L + "'", long17 == 99L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        int int6 = dateTimeZone1.getOffset((long) 115800000);
        java.lang.String str8 = dateTimeZone1.getName((-35999900L));
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, 126060000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 126060000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getShortName((long) (short) 0, locale13);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone3.getOffset(readableInstant16);
        java.lang.String str19 = dateTimeZone3.getNameKey((long) (short) 1);
        long long21 = dateTimeZone3.previousTransition((-59900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-59900L) + "'", long21 == (-59900L));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.lang.String str12 = dateTimeZone10.getShortName(25199900L);
        long long15 = dateTimeZone10.convertLocalToUTC((long) 25200000, true);
        int int17 = dateTimeZone10.getOffsetFromLocal((long) (short) -1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 25200000L + "'", long15 == 25200000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 10);
        boolean boolean4 = dateTimeZone2.isStandardOffset(36000100L);
        long long7 = dateTimeZone2.adjustOffset(53520001L, true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 53520001L + "'", long7 == 53520001L);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        long long5 = dateTimeZone1.convertLocalToUTC(100L, false, (-99L));
        java.lang.String str7 = dateTimeZone1.getShortName(200L);
        java.lang.Class<?> wildcardClass8 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        java.lang.Class<?> wildcardClass4 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.nextTransition((long) 1);
        boolean boolean12 = dateTimeZone3.isFixed();
        int int14 = dateTimeZone3.getStandardOffset(100L);
        long long17 = dateTimeZone3.adjustOffset(0L, false);
        java.lang.String str18 = dateTimeZone3.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(126060000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        int int10 = dateTimeZone1.getOffset((long) 1);
        boolean boolean11 = dateTimeZone1.isFixed();
        java.lang.Class<?> wildcardClass12 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone3.getName((long) (short) 10, locale11);
        java.lang.String str14 = dateTimeZone3.getName(0L);
        long long16 = dateTimeZone3.previousTransition(25200052L);
        java.lang.String str17 = dateTimeZone3.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        java.lang.Class<?> wildcardClass19 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 25200052L + "'", long16 == 25200052L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (short) 0, true);
        long long7 = dateTimeZone1.nextTransition(1L);
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        long long10 = dateTimeZone1.nextTransition(100L);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((-1570048984099L), locale12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 1);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone10.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone10.getOffset(readableInstant13);
        java.lang.Object obj15 = dateTimeZone10.writeReplace();
        java.lang.Object obj16 = dateTimeZone10.writeReplace();
        boolean boolean17 = dateTimeZone10.isFixed();
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        long long21 = dateTimeZone19.nextTransition((long) (short) 100);
        java.lang.String str23 = dateTimeZone19.getNameKey(1L);
        long long25 = dateTimeZone10.getMillisKeepLocal(dateTimeZone19, (-25200001L));
        long long27 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, (long) 'a');
        int int29 = dateTimeZone1.getOffset((-35999900L));
        long long32 = dateTimeZone1.convertLocalToUTC(99L, false);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long37 = dateTimeZone34.convertLocalToUTC((long) 1, true);
        long long39 = dateTimeZone34.previousTransition((long) ' ');
        int int41 = dateTimeZone34.getOffset(25200001L);
        java.lang.String str42 = dateTimeZone34.getID();
        int int44 = dateTimeZone34.getOffset((long) (short) 1);
        long long46 = dateTimeZone1.getMillisKeepLocal(dateTimeZone34, (-10800000L));
        org.joda.time.ReadableInstant readableInstant47 = null;
        int int48 = dateTimeZone34.getOffset(readableInstant47);
        java.lang.String str49 = dateTimeZone34.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-25200001L) + "'", long25 == (-25200001L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 95L + "'", long27 == 95L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-99L) + "'", long37 == (-99L));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 32L + "'", long39 == 32L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00:00.100" + "'", str42, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-10800101L) + "'", long46 == (-10800101L));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+00:00:00.100" + "'", str49, "+00:00:00.100");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(36000000);
        java.lang.String str3 = dateTimeZone1.getShortName(115799965L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+10:00" + "'", str3, "+10:00");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str3 = dateTimeZone1.toString();
        java.lang.String str5 = dateTimeZone1.getName(11L);
        java.lang.String str7 = dateTimeZone1.getShortName((-1570084924001L));
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        long long10 = dateTimeZone1.previousTransition((long) 25200000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.001" + "'", str3, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25200000L + "'", long10 == 25200000L);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        long long13 = dateTimeZone1.adjustOffset(2L, true);
        java.lang.String str14 = dateTimeZone1.toString();
        long long18 = dateTimeZone1.convertLocalToUTC((-25740001L), false, (-1570048923900L));
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone1.getName(112079899L, locale20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-25740000L) + "'", long18 == (-25740000L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-00:00:00.001" + "'", str21, "-00:00:00.001");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        boolean boolean8 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone10.nextTransition((long) (short) 100);
        java.lang.String str14 = dateTimeZone10.getNameKey(1L);
        long long16 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, (-25200001L));
        java.util.TimeZone timeZone17 = dateTimeZone1.toTimeZone();
        java.lang.String str18 = dateTimeZone1.getID();
        long long21 = dateTimeZone1.convertLocalToUTC((-1570084924047L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "85) test0301(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-25200001L) + "'", long16 == (-25200001L));
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
// flaky "79) test0301(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.052" + "'", str18, "+00:00:00.052");
// flaky "63) test0301(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1570084924099L) + "'", long21 == (-1570084924099L));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long5 = dateTimeZone1.convertUTCToLocal(100L);
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone8.getMillisKeepLocal(dateTimeZone10, (long) 'a');
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone8.getName((long) (short) 1, locale14);
        int int17 = dateTimeZone8.getOffset((long) 1);
        long long19 = dateTimeZone8.nextTransition((long) (byte) 100);
        long long21 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, (long) 10);
        int int23 = dateTimeZone1.getOffsetFromLocal(101L);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone1.getShortName(25199999L, locale25);
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        long long32 = dateTimeZone28.getMillisKeepLocal(dateTimeZone30, (long) 'a');
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone28.getName((long) (short) 1, locale34);
        int int37 = dateTimeZone28.getOffset((long) 1);
        int int39 = dateTimeZone28.getOffset((long) '#');
        long long41 = dateTimeZone28.nextTransition((-2L));
        boolean boolean42 = dateTimeZone1.equals((java.lang.Object) long41);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 99L + "'", long5 == 99L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
// flaky "86) test0302(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.052" + "'", str15, "+00:00:00.052");
// flaky "80) test0302(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
// flaky "64) test0302(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-43L) + "'", long21 == (-43L));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-00:00:00.001" + "'", str26, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 97L + "'", long32 == 97L);
// flaky "47) test0302(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.052" + "'", str35, "+00:00:00.052");
// flaky "34) test0302(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 52 + "'", int37 == 52);
// flaky "22) test0302(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-2L) + "'", long41 == (-2L));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        long long10 = dateTimeZone1.previousTransition((-1570084924099L));
        long long12 = dateTimeZone1.previousTransition((-36000001L));
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(360600000);
        long long17 = dateTimeZone14.adjustOffset((-35999999L), true);
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone14, 0L);
        boolean boolean20 = dateTimeZone14.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "87) test0303(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.052" + "'", str2, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "81) test0303(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1570084924099L) + "'", long10 == (-1570084924099L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-36000001L) + "'", long12 == (-36000001L));
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-35999999L) + "'", long17 == (-35999999L));
// flaky "65) test0303(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-360599948L) + "'", long19 == (-360599948L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getShortName((long) (short) 0, locale13);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        int int17 = dateTimeZone3.getOffsetFromLocal((long) 1);
        java.lang.String str19 = dateTimeZone3.getName(0L);
        java.lang.String str21 = dateTimeZone3.getName(36000002L);
        boolean boolean22 = dateTimeZone3.isFixed();
        java.lang.String str24 = dateTimeZone3.getShortName((long) (short) 100);
        boolean boolean26 = dateTimeZone3.isStandardOffset(324600001L);
        int int28 = dateTimeZone3.getOffset(3599999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "88) test0304(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "82) test0304(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.052" + "'", str11, "+00:00:00.052");
// flaky "66) test0304(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.052" + "'", str14, "+00:00:00.052");
// flaky "48) test0304(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
// flaky "35) test0304(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.052" + "'", str19, "+00:00:00.052");
// flaky "23) test0304(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.052" + "'", str21, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky "15) test0304(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.052" + "'", str24, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
// flaky "11) test0304(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) '#');
        boolean boolean3 = dateTimeZone2.isFixed();
        java.lang.String str4 = dateTimeZone2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:35" + "'", str4, "+00:35");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(115260000, 25200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 25200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        boolean boolean7 = dateTimeZone1.isFixed();
        java.lang.String str9 = dateTimeZone1.getShortName(115800000L);
        int int11 = dateTimeZone1.getOffsetFromLocal(0L);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long17 = dateTimeZone13.getMillisKeepLocal(dateTimeZone15, (long) 'a');
        int int19 = dateTimeZone15.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone20 = dateTimeZone15.toTimeZone();
        java.util.TimeZone timeZone21 = dateTimeZone15.toTimeZone();
        long long23 = dateTimeZone15.nextTransition((long) 1);
        boolean boolean24 = dateTimeZone15.isFixed();
        long long28 = dateTimeZone15.convertLocalToUTC(119400000L, false, (long) 52);
        java.lang.String str30 = dateTimeZone15.getName(25200051L);
        boolean boolean31 = dateTimeZone1.equals((java.lang.Object) dateTimeZone15);
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone1.getName(51L, locale33);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "89) test0307(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky "83) test0307(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "67) test0307(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
// flaky "49) test0307(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
// flaky "36) test0307(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(timeZone20);
// flaky "24) test0307(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone21);
// flaky "16) test0307(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
// flaky "12) test0307(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 119400000L + "'", long28 == 119400000L);
// flaky "7) test0307(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
// flaky "3) test0307(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00" + "'", str34, "+00:00");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((-1570084924000L), locale6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        java.lang.String str10 = dateTimeZone1.toString();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str13 = dateTimeZone12.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        java.lang.String str15 = dateTimeZone12.getID();
        java.lang.String str16 = dateTimeZone12.toString();
        long long18 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, 89520001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.001" + "'", str16, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 89520001L + "'", long18 == 89520001L);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        long long12 = dateTimeZone1.convertLocalToUTC((long) (short) 0, true, 102L);
        java.lang.Class<?> wildcardClass13 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        long long8 = dateTimeZone1.previousTransition((long) 100);
        boolean boolean10 = dateTimeZone1.isStandardOffset((-65L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC((-115799899L), true, 36000100L);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone1.isLocalDateTimeGap(localDateTime10);
        java.lang.Class<?> wildcardClass12 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115799900L) + "'", long8 == (-115799900L));
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.lang.String str8 = dateTimeZone1.getShortName((long) (byte) 100);
        long long10 = dateTimeZone1.previousTransition(61200002L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 61200002L + "'", long10 == 61200002L);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        int int8 = dateTimeZone1.getStandardOffset(0L);
        long long12 = dateTimeZone1.convertLocalToUTC(102L, false, 2L);
        java.lang.String str13 = dateTimeZone1.toString();
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getName(0L, locale15);
        java.lang.String str17 = dateTimeZone1.toString();
        boolean boolean18 = dateTimeZone1.isFixed();
        java.lang.String str20 = dateTimeZone1.getShortName(115799965L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 103L + "'", long12 == 103L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone3.getName((long) (short) 10, locale11);
        boolean boolean13 = dateTimeZone3.isFixed();
        java.util.TimeZone timeZone14 = dateTimeZone3.toTimeZone();
        int int16 = dateTimeZone3.getOffset((long) (byte) 10);
        long long19 = dateTimeZone3.adjustOffset(119400101L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 119400101L + "'", long19 == 119400101L);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        long long15 = dateTimeZone11.adjustOffset((long) (byte) 1, false);
        java.lang.Object obj16 = dateTimeZone11.writeReplace();
        java.lang.String str18 = dateTimeZone11.getNameKey((long) 36000000);
        long long20 = dateTimeZone11.nextTransition(98L);
        boolean boolean21 = dateTimeZone9.equals((java.lang.Object) dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 98L + "'", long20 == 98L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.lang.String str3 = dateTimeZone1.getShortName((-1570084924100L));
        int int5 = dateTimeZone1.getOffset((long) 115800000);
        java.lang.String str7 = dateTimeZone1.getName(89519999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.035" + "'", str3, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.035" + "'", str7, "+00:00:00.035");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long5 = dateTimeZone1.previousTransition(25200000L);
        long long7 = dateTimeZone1.nextTransition((-1570048923999L));
        java.lang.String str8 = dateTimeZone1.getID();
        int int10 = dateTimeZone1.getOffsetFromLocal((-35939900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25200000L + "'", long5 == 25200000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1570048923999L) + "'", long7 == (-1570048923999L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getOffset((long) 1);
        boolean boolean10 = dateTimeZone1.isStandardOffset((-35999901L));
        java.lang.String str12 = dateTimeZone1.getName((-35999800L));
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone1.getOffset(readableInstant13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        long long7 = dateTimeZone5.nextTransition((long) (short) 100);
        int int9 = dateTimeZone5.getOffsetFromLocal(100L);
        long long11 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (long) 115800000);
        java.lang.String str13 = dateTimeZone1.getNameKey((-25200000L));
        java.lang.String str15 = dateTimeZone1.getName(119400101L);
        int int17 = dateTimeZone1.getOffsetFromLocal((-35939900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "90) test0319(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
// flaky "84) test0319(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
        org.junit.Assert.assertNull(str13);
// flaky "68) test0319(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
// flaky "50) test0319(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60000 + "'", int17 == 60000);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        int int3 = dateTimeZone1.getOffset((-90600001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 126000000 + "'", int3 == 126000000);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (byte) 1, false);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        java.lang.String str8 = dateTimeZone1.getNameKey((long) 36000000);
        long long10 = dateTimeZone1.nextTransition(98L);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getShortName((-1570084924102L), locale12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 98L + "'", long10 == 98L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        int int10 = dateTimeZone3.getOffset(115739900L);
        long long13 = dateTimeZone3.adjustOffset(89519999L, false);
        long long15 = dateTimeZone3.convertUTCToLocal(84L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "91) test0322(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "85) test0322(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:01");
// flaky "69) test0322(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 89519999L + "'", long13 == 89519999L);
// flaky "51) test0322(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60084L + "'", long15 == 60084L);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) ' ', locale4);
        boolean boolean7 = dateTimeZone1.isStandardOffset(119399999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.100" + "'", str5, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        java.lang.String str8 = dateTimeZone1.getNameKey((-1570084924201L));
        long long10 = dateTimeZone1.previousTransition((long) (byte) -1);
        long long12 = dateTimeZone1.previousTransition((long) 2100000);
        java.lang.String str14 = dateTimeZone1.getShortName(103L);
        java.lang.String str16 = dateTimeZone1.getNameKey((-1570048984099L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2100000L + "'", long12 == 2100000L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(360600000);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) 52);
        long long5 = dateTimeZone1.previousTransition(479399900L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 479399900L + "'", long5 == 479399900L);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.lang.String str3 = dateTimeZone1.getShortName((-1L));
        java.lang.String str5 = dateTimeZone1.getShortName(8L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.052" + "'", str3, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.052" + "'", str5, "+00:00:00.052");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        long long14 = dateTimeZone10.adjustOffset((long) (short) 0, true);
        long long16 = dateTimeZone10.nextTransition(1L);
        java.util.TimeZone timeZone17 = dateTimeZone10.toTimeZone();
        boolean boolean18 = dateTimeZone1.equals((java.lang.Object) timeZone17);
        long long22 = dateTimeZone1.convertLocalToUTC((long) 0, false, (long) '4');
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "92) test0327(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "86) test0327(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((-1570084924000L), locale6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        long long12 = dateTimeZone1.adjustOffset(11L, true);
        java.lang.String str14 = dateTimeZone1.getName((-1570012924100L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 11L + "'", long12 == 11L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int4 = dateTimeZone2.getStandardOffset((long) 10);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 'a');
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone6.getName((long) (short) 1, locale12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        boolean boolean15 = dateTimeZone2.equals((java.lang.Object) dateTimeZone6);
        java.lang.String str16 = dateTimeZone6.toString();
        java.lang.String str17 = dateTimeZone6.getID();
        int int19 = dateTimeZone6.getStandardOffset((-115799999L));
        java.util.TimeZone timeZone20 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        int int24 = dateTimeZone22.getOffset((-39660000L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
// flaky "93) test0329(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky "87) test0329(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
// flaky "70) test0329(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
// flaky "52) test0329(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(timeZone20);
// flaky "37) test0329(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        long long8 = dateTimeZone1.previousTransition((-115799904L));
        long long11 = dateTimeZone1.adjustOffset((-1570120924001L), false);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getShortName((long) 115800000, locale13);
        java.lang.Class<?> wildcardClass15 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "94) test0330(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "88) test0330(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
// flaky "71) test0330(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115799904L) + "'", long8 == (-115799904L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570120924001L) + "'", long11 == (-1570120924001L));
// flaky "53) test0330(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+100:52");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+100:52\" is malformed at \"0:52\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        boolean boolean7 = dateTimeZone1.isFixed();
        boolean boolean8 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        long long3 = dateTimeZone1.convertUTCToLocal((long) 25200000);
        long long6 = dateTimeZone1.convertLocalToUTC((-115799999L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25200052L + "'", long3 == 25200052L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-115800051L) + "'", long6 == (-115800051L));
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(60000);
        java.lang.String str3 = dateTimeZone1.getShortName(115800002L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.lang.String str13 = dateTimeZone3.getNameKey((long) 10);
        long long16 = dateTimeZone3.adjustOffset((long) (byte) 100, false);
        java.lang.String str18 = dateTimeZone3.getShortName(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "95) test0336(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "89) test0336(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "72) test0336(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
// flaky "54) test0336(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
// flaky "38) test0336(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getShortName((long) (short) 0, locale13);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        int int17 = dateTimeZone3.getOffsetFromLocal((long) 1);
        long long20 = dateTimeZone3.convertLocalToUTC((long) 2100000, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "96) test0337(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "90) test0337(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "73) test0337(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
// flaky "55) test0337(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
// flaky "39) test0337(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
// flaky "25) test0337(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2100000L + "'", long20 == 2100000L);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getOffset((long) 1);
        java.lang.String str9 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str12 = dateTimeZone1.getName(90060000L);
        int int14 = dateTimeZone1.getOffset(89519999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "97) test0338(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
// flaky "91) test0338(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "74) test0338(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
// flaky "56) test0338(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
// flaky "40) test0338(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.lang.String str10 = dateTimeZone9.getID();
        java.lang.String str11 = dateTimeZone9.toString();
        long long13 = dateTimeZone3.getMillisKeepLocal(dateTimeZone9, (-25740000L));
        int int15 = dateTimeZone3.getOffset(3660035L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "98) test0339(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
// flaky "92) test0339(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
// flaky "75) test0339(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-25740000L) + "'", long13 == (-25740000L));
// flaky "57) test0339(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        int int10 = dateTimeZone1.getOffset((long) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, 100L);
        int int16 = dateTimeZone1.getOffsetFromLocal(98L);
        java.lang.String str17 = dateTimeZone1.toString();
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getShortName((long) 1, locale19);
        java.lang.String str21 = dateTimeZone1.getID();
        long long23 = dateTimeZone1.nextTransition((long) 3600000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "99) test0340(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "93) test0340(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone12);
// flaky "76) test0340(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-35999900L) + "'", long14 == (-35999900L));
// flaky "58) test0340(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
// flaky "41) test0340(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
// flaky "26) test0340(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
// flaky "17) test0340(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 3600000L + "'", long23 == 3600000L);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        boolean boolean10 = dateTimeZone3.equals((java.lang.Object) ' ');
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj13 = dateTimeZone12.writeReplace();
        java.lang.String str14 = dateTimeZone12.getID();
        long long17 = dateTimeZone12.convertLocalToUTC((long) 'a', true);
        java.lang.String str19 = dateTimeZone12.getNameKey((-1570084924201L));
        boolean boolean20 = dateTimeZone3.equals((java.lang.Object) dateTimeZone12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        java.lang.Class<?> wildcardClass22 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "100) test0341(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 98L + "'", long17 == 98L);
        org.junit.Assert.assertNull(str19);
// flaky "94) test0341(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(60000, 129120000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 129120000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.lang.String str7 = dateTimeZone1.getID();
        java.lang.Object obj8 = dateTimeZone1.writeReplace();
        int int10 = dateTimeZone1.getOffset(60084L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "101) test0343(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "95) test0343(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj8);
// flaky "77) test0343(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(25200000, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone3.getName((long) (short) 10, locale11);
        boolean boolean13 = dateTimeZone3.isFixed();
        java.util.TimeZone timeZone14 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.lang.String str16 = dateTimeZone15.toString();
        long long18 = dateTimeZone15.previousTransition(36000002L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "102) test0345(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
// flaky "96) test0345(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 36000002L + "'", long18 == 36000002L);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone3.getName((long) (short) 10, locale11);
        boolean boolean14 = dateTimeZone3.equals((java.lang.Object) (byte) 0);
        long long18 = dateTimeZone3.convertLocalToUTC((long) 10, true, (-35999991L));
        java.lang.String str20 = dateTimeZone3.getShortName(3660000L);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone22.isLocalDateTimeGap(localDateTime23);
        int int26 = dateTimeZone22.getStandardOffset((long) (short) 0);
        long long28 = dateTimeZone22.previousTransition((long) '#');
        int int30 = dateTimeZone22.getOffsetFromLocal(115799900L);
        long long32 = dateTimeZone22.convertUTCToLocal((-36000000L));
        boolean boolean34 = dateTimeZone22.equals((java.lang.Object) (-39659899L));
        boolean boolean35 = dateTimeZone3.equals((java.lang.Object) boolean34);
        java.lang.Class<?> wildcardClass36 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "103) test0346(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
// flaky "97) test0346(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "78) test0346(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 11L + "'", long18 == 11L);
// flaky "59) test0346(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky "42) test0346(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 35L + "'", long28 == 35L);
// flaky "27) test0346(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
// flaky "18) test0346(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-36000001L) + "'", long32 == (-36000001L));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:01");
        long long4 = dateTimeZone1.adjustOffset((long) 'a', true);
        boolean boolean5 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        boolean boolean8 = dateTimeZone3.isFixed();
        long long11 = dateTimeZone3.convertLocalToUTC((-1570084924101L), false);
        long long13 = dateTimeZone3.convertUTCToLocal((-1570084924002L));
        boolean boolean14 = dateTimeZone3.isFixed();
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone3.isLocalDateTimeGap(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "104) test0348(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "98) test0348(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570084924201L) + "'", long11 == (-1570084924201L));
// flaky "79) test0348(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1570084923902L) + "'", long13 == (-1570084923902L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-3660000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int4 = dateTimeZone2.getStandardOffset((long) 10);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 'a');
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone6.getName((long) (short) 1, locale12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        boolean boolean15 = dateTimeZone2.equals((java.lang.Object) dateTimeZone6);
        long long17 = dateTimeZone6.convertUTCToLocal((-1570084924099L));
        long long20 = dateTimeZone6.convertLocalToUTC((-151199905L), true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
// flaky "105) test0350(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky "99) test0350(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1570084923999L) + "'", long17 == (-1570084923999L));
// flaky "80) test0350(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-151200005L) + "'", long20 == (-151200005L));
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(52, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        java.lang.String str8 = dateTimeZone1.getName((-1570084924101L));
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.lang.Object obj11 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 1);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone10.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone10.getOffset(readableInstant13);
        java.lang.Object obj15 = dateTimeZone10.writeReplace();
        java.lang.Object obj16 = dateTimeZone10.writeReplace();
        boolean boolean17 = dateTimeZone10.isFixed();
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        long long21 = dateTimeZone19.nextTransition((long) (short) 100);
        java.lang.String str23 = dateTimeZone19.getNameKey(1L);
        long long25 = dateTimeZone10.getMillisKeepLocal(dateTimeZone19, (-25200001L));
        long long27 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, (long) 'a');
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        java.lang.Object obj30 = dateTimeZone29.writeReplace();
        boolean boolean31 = dateTimeZone10.equals(obj30);
        long long33 = dateTimeZone10.convertUTCToLocal((-2L));
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone10.getName((long) 3600000, locale35);
        java.util.Locale locale38 = null;
        java.lang.String str39 = dateTimeZone10.getShortName(25200001L, locale38);
        java.util.Locale locale41 = null;
        java.lang.String str42 = dateTimeZone10.getShortName((-65L), locale41);
        java.lang.Class<?> wildcardClass43 = dateTimeZone10.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
// flaky "106) test0353(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-25200001L) + "'", long25 == (-25200001L));
// flaky "100) test0353(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-4L) + "'", long27 == (-4L));
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
// flaky "81) test0353(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 98L + "'", long33 == 98L);
// flaky "60) test0353(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.100" + "'", str36, "+00:00:00.100");
// flaky "43) test0353(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.100" + "'", str39, "+00:00:00.100");
// flaky "28) test0353(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00:00.100" + "'", str42, "+00:00:00.100");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, 35);
        long long4 = dateTimeZone2.convertUTCToLocal(39599999L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 401699999L + "'", long4 == 401699999L);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+52:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+52:00\" is malformed at \"52:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        int int10 = dateTimeZone1.getOffset((long) 1);
        java.lang.Object obj11 = dateTimeZone1.writeReplace();
        boolean boolean12 = dateTimeZone1.isFixed();
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getShortName(35999932L, locale14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "107) test0356(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
// flaky "101) test0356(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "82) test0356(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(349200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        long long7 = dateTimeZone2.adjustOffset(200L, false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36000000 + "'", int4 == 36000000);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 200L + "'", long7 == 200L);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        boolean boolean7 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.lang.String str10 = dateTimeZone9.getID();
        long long12 = dateTimeZone9.previousTransition((-1L));
        boolean boolean14 = dateTimeZone9.equals((java.lang.Object) (-1.0f));
        java.lang.String str15 = dateTimeZone9.getID();
        java.lang.String str16 = dateTimeZone9.getID();
        int int18 = dateTimeZone9.getStandardOffset(0L);
        boolean boolean19 = dateTimeZone1.equals((java.lang.Object) int18);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "108) test0359(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTimeZone9);
// flaky "102) test0359(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "83) test0359(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
// flaky "61) test0359(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
// flaky "44) test0359(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        long long8 = dateTimeZone1.previousTransition((-115799904L));
        boolean boolean9 = dateTimeZone1.isFixed();
        boolean boolean11 = dateTimeZone1.isStandardOffset((-1569969664099L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "109) test0360(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "103) test0360(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
// flaky "84) test0360(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115799904L) + "'", long8 == (-115799904L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int6 = dateTimeZone4.getStandardOffset((long) 10);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone8.getMillisKeepLocal(dateTimeZone10, (long) 'a');
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone8.getName((long) (short) 1, locale14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        boolean boolean17 = dateTimeZone4.equals((java.lang.Object) dateTimeZone8);
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, (long) (byte) 0);
        boolean boolean21 = dateTimeZone1.isStandardOffset(0L);
        java.lang.String str22 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115800000 + "'", int6 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
// flaky "110) test0361(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "104) test0361(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(25200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.lang.String str13 = dateTimeZone3.getNameKey((long) 10);
        long long17 = dateTimeZone3.convertLocalToUTC((long) (byte) 1, false, 25200000L);
        long long20 = dateTimeZone3.adjustOffset((-3660000L), false);
        long long23 = dateTimeZone3.adjustOffset((-1570084924001L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "111) test0363(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "105) test0363(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
// flaky "85) test0363(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+52:00" + "'", str11, "+52:00");
        org.junit.Assert.assertNull(str13);
// flaky "62) test0363(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-187199999L) + "'", long17 == (-187199999L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-3660000L) + "'", long20 == (-3660000L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1570084924001L) + "'", long23 == (-1570084924001L));
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str7 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        int int11 = dateTimeZone1.getOffsetFromLocal(33L);
        int int13 = dateTimeZone1.getStandardOffset((-115259999L));
        long long15 = dateTimeZone1.nextTransition(119399998L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 119399998L + "'", long15 == 119399998L);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.getID();
        long long6 = dateTimeZone3.previousTransition((-1L));
        long long10 = dateTimeZone3.convertLocalToUTC(25200000L, true, 100L);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 100L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getShortName((long) (short) 10, locale14);
        long long17 = dateTimeZone1.previousTransition((-115799999L));
        long long20 = dateTimeZone1.adjustOffset((-115800099L), true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "112) test0365(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
// flaky "106) test0365(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-162000000L) + "'", long10 == (-162000000L));
// flaky "86) test0365(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187199899L) + "'", long12 == (-187199899L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-115799999L) + "'", long17 == (-115799999L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-115800099L) + "'", long20 == (-115800099L));
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        int int5 = dateTimeZone1.getStandardOffset(0L);
        int int7 = dateTimeZone1.getStandardOffset((-1570084924201L));
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        int int11 = dateTimeZone1.getOffset(90060000L);
        long long14 = dateTimeZone1.adjustOffset(103L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 103L + "'", long14 == 103L);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) (short) -1);
        long long6 = dateTimeZone1.convertLocalToUTC(35940032L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32340032L + "'", long6 == 32340032L);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        long long3 = dateTimeZone1.convertUTCToLocal((long) 25200000);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) ' ');
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        long long10 = dateTimeZone1.adjustOffset(0L, true);
        java.lang.Class<?> wildcardClass11 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25200052L + "'", long3 == 25200052L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+100:35");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+100:35\" is malformed at \"0:35\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        java.lang.Object obj5 = dateTimeZone2.writeReplace();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        boolean boolean7 = dateTimeZone2.isFixed();
        java.lang.Class<?> wildcardClass8 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36000000 + "'", int4 == 36000000);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int4 = dateTimeZone2.getStandardOffset((long) 10);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 'a');
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone6.getName((long) (short) 1, locale12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        boolean boolean15 = dateTimeZone2.equals((java.lang.Object) dateTimeZone6);
        java.lang.String str17 = dateTimeZone2.getName(0L);
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone2.getOffset(readableInstant18);
        java.lang.String str21 = dateTimeZone2.getNameKey(115260051L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+10:00" + "'", str13, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:10" + "'", str17, "+32:10");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115800000 + "'", int19 == 115800000);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName(25200052L, locale8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getShortName((long) (byte) 0, locale11);
        java.lang.Class<?> wildcardClass13 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:00" + "'", str9, "+10:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long11 = dateTimeZone1.nextTransition((long) ' ');
        boolean boolean13 = dateTimeZone1.isStandardOffset((long) (short) 1);
        int int15 = dateTimeZone1.getOffset((-35999990L));
        boolean boolean16 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:00" + "'", str8, "+10:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36000000 + "'", int15 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(100);
        int int3 = dateTimeZone1.getOffset((long) 3600000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 360000000 + "'", int3 == 360000000);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getShortName((long) (short) 0, locale13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone3.getName((long) (short) 100, locale16);
        java.lang.String str19 = dateTimeZone3.getName((long) (-1));
        long long21 = dateTimeZone3.previousTransition(35L);
        int int23 = dateTimeZone3.getStandardOffset(32L);
        int int25 = dateTimeZone3.getOffsetFromLocal((-1570120924001L));
        java.lang.Class<?> wildcardClass26 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "113) test0375(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "107) test0375(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "87) test0375(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
// flaky "63) test0375(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
// flaky "45) test0375(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
// flaky "29) test0375(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
// flaky "19) test0375(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
// flaky "13) test0375(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        long long7 = dateTimeZone1.previousTransition(10L);
        long long9 = dateTimeZone1.nextTransition((-115799999L));
        java.util.Set<java.lang.String> strSet10 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean11 = dateTimeZone1.equals((java.lang.Object) strSet10);
        java.lang.String str13 = dateTimeZone1.getShortName(119400101L);
        java.lang.Object obj14 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "114) test0376(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-115799999L) + "'", long9 == (-115799999L));
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "108) test0376(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        long long15 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, (long) 'a');
        int int17 = dateTimeZone13.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone18 = dateTimeZone13.toTimeZone();
        java.util.TimeZone timeZone19 = dateTimeZone13.toTimeZone();
        long long21 = dateTimeZone13.convertUTCToLocal(0L);
        long long23 = dateTimeZone1.getMillisKeepLocal(dateTimeZone13, (long) (short) -1);
        long long26 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int28 = dateTimeZone1.getStandardOffset((-231599899L));
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone1.getName((-35939969L), locale30);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int36 = dateTimeZone34.getStandardOffset((long) 10);
        java.util.TimeZone timeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        long long42 = dateTimeZone38.getMillisKeepLocal(dateTimeZone40, (long) 'a');
        java.util.Locale locale44 = null;
        java.lang.String str45 = dateTimeZone38.getName((long) (short) 1, locale44);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone38);
        boolean boolean47 = dateTimeZone34.equals((java.lang.Object) dateTimeZone38);
        boolean boolean48 = dateTimeZone1.equals((java.lang.Object) dateTimeZone34);
        long long51 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, true);
        long long53 = dateTimeZone1.previousTransition(39599999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "115) test0377(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
// flaky "109) test0377(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(timeZone18);
// flaky "88) test0377(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
// flaky "64) test0377(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
// flaky "46) test0377(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
// flaky "30) test0377(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1570084924101L) + "'", long26 == (-1570084924101L));
// flaky "20) test0377(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
// flaky "14) test0377(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.100" + "'", str31, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 115800000 + "'", int36 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 97L + "'", long42 == 97L);
// flaky "8) test0377(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00:00.100" + "'", str45, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
// flaky "4) test0377(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-101L) + "'", long51 == (-101L));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 39599999L + "'", long53 == 39599999L);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '4');
        boolean boolean2 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        int int10 = dateTimeZone3.getOffset((long) (short) 1);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone3.isLocalDateTimeGap(localDateTime11);
        long long15 = dateTimeZone3.convertLocalToUTC(25200000L, false);
        int int17 = dateTimeZone3.getOffsetFromLocal(115799901L);
        int int19 = dateTimeZone3.getStandardOffset((-61199968L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "116) test0379(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "110) test0379(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "89) test0379(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "65) test0379(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 25199900L + "'", long15 == 25199900L);
// flaky "47) test0379(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
// flaky "31) test0379(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        boolean boolean8 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone10.nextTransition((long) (short) 100);
        java.lang.String str14 = dateTimeZone10.getNameKey(1L);
        long long16 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, (-25200001L));
        java.lang.Class<?> wildcardClass17 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "117) test0380(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-25200001L) + "'", long16 == (-25200001L));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((-1570084924101L), locale8);
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str12 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "118) test0381(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "111) test0381(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertNotNull(obj10);
// flaky "90) test0381(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(187200000, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean4 = dateTimeZone1.isFixed();
        int int6 = dateTimeZone1.getStandardOffset((-36059848L));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((-1570084924001L), locale8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "119) test0383(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "112) test0383(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
// flaky "91) test0383(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone11.getOffset(readableInstant12);
        int int15 = dateTimeZone11.getStandardOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "120) test0384(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "113) test0384(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "92) test0384(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky "66) test0384(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky "48) test0384(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        long long13 = dateTimeZone1.adjustOffset(2L, true);
        int int15 = dateTimeZone1.getOffsetFromLocal(25200052L);
        java.util.TimeZone timeZone16 = dateTimeZone1.toTimeZone();
        java.lang.Class<?> wildcardClass17 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        java.lang.String str8 = dateTimeZone1.getName((-2L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "121) test0387(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "114) test0387(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.lang.String str10 = dateTimeZone1.getShortName(1L);
        long long12 = dateTimeZone1.nextTransition((long) 10);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone1.isLocalDateTimeGap(localDateTime13);
        java.lang.Class<?> wildcardClass15 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "122) test0388(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
// flaky "115) test0388(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
// flaky "93) test0388(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
// flaky "67) test0388(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 2100000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 2100000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long15 = dateTimeZone12.convertLocalToUTC((-1570084924001L), false);
        boolean boolean16 = dateTimeZone1.equals((java.lang.Object) long15);
        java.util.TimeZone timeZone17 = dateTimeZone1.toTimeZone();
        java.lang.String str19 = dateTimeZone1.getShortName((-25200000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924000L) + "'", long15 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, 0L);
        boolean boolean12 = dateTimeZone8.isStandardOffset((long) '4');
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "123) test0391(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.052" + "'", str2, "+00:00:00.052");
// flaky "116) test0391(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.052" + "'", str4, "+00:00:00.052");
// flaky "94) test0391(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(dateTimeZone8);
// flaky "68) test0391(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600052L + "'", long10 == 3600052L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        java.lang.String str8 = dateTimeZone1.getName((-1570084924101L));
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        int int14 = dateTimeZone12.getOffsetFromLocal(36000037L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getShortName((long) (short) 0, locale13);
        long long17 = dateTimeZone3.convertLocalToUTC(115739900L, false);
        long long20 = dateTimeZone3.adjustOffset((long) (byte) 100, false);
        long long22 = dateTimeZone3.previousTransition(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "124) test0393(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "117) test0393(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "95) test0393(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.052" + "'", str11, "+00:00:00.052");
// flaky "69) test0393(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.052" + "'", str14, "+00:00:00.052");
// flaky "49) test0393(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 115739848L + "'", long17 == 115739848L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        long long7 = dateTimeZone5.nextTransition((long) (short) 100);
        int int9 = dateTimeZone5.getOffsetFromLocal(100L);
        long long11 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (long) 115800000);
        java.lang.String str13 = dateTimeZone1.getNameKey((-25200000L));
        boolean boolean15 = dateTimeZone1.equals((java.lang.Object) 115800097L);
        long long18 = dateTimeZone1.adjustOffset((-1570214044100L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "125) test0394(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.052" + "'", str2, "+00:00:00.052");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
// flaky "118) test0394(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1570214044100L) + "'", long18 == (-1570214044100L));
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone1.getOffset(readableInstant3);
        long long7 = dateTimeZone1.adjustOffset((long) 36000000, true);
        int int9 = dateTimeZone1.getOffsetFromLocal((-324000000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "126) test0395(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
// flaky "119) test0395(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 36000000L + "'", long7 == 36000000L);
// flaky "96) test0395(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 1);
        boolean boolean4 = dateTimeZone2.equals((java.lang.Object) 25200001L);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 'a');
        int int12 = dateTimeZone8.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone13 = dateTimeZone8.toTimeZone();
        java.util.TimeZone timeZone14 = dateTimeZone8.toTimeZone();
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone8.getName((long) (short) 10, locale16);
        java.lang.String str19 = dateTimeZone8.getName(0L);
        long long21 = dateTimeZone8.previousTransition(25200052L);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone8.getShortName((long) 0, locale23);
        long long26 = dateTimeZone2.getMillisKeepLocal(dateTimeZone8, (-25200001L));
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        long long32 = dateTimeZone28.getMillisKeepLocal(dateTimeZone30, (long) 'a');
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone28.getName((long) (short) 1, locale34);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        java.util.Locale locale38 = null;
        java.lang.String str39 = dateTimeZone28.getName(100L, locale38);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        int int42 = dateTimeZone28.getOffsetFromLocal(100L);
        long long44 = dateTimeZone2.getMillisKeepLocal(dateTimeZone28, (-25740000L));
        java.util.TimeZone timeZone45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        java.util.TimeZone timeZone47 = null;
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forTimeZone(timeZone47);
        long long50 = dateTimeZone46.getMillisKeepLocal(dateTimeZone48, (long) 'a');
        int int52 = dateTimeZone48.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone53 = dateTimeZone48.toTimeZone();
        java.util.TimeZone timeZone54 = dateTimeZone48.toTimeZone();
        java.util.Locale locale56 = null;
        java.lang.String str57 = dateTimeZone48.getName((long) (short) 10, locale56);
        java.lang.String str59 = dateTimeZone48.getName(0L);
        long long61 = dateTimeZone48.previousTransition(25200052L);
        java.util.Locale locale63 = null;
        java.lang.String str64 = dateTimeZone48.getShortName((long) 0, locale63);
        java.util.Locale locale66 = null;
        java.lang.String str67 = dateTimeZone48.getName(231059997L, locale66);
        java.util.Locale locale69 = null;
        java.lang.String str70 = dateTimeZone48.getName(36000036L, locale69);
        boolean boolean71 = dateTimeZone28.equals((java.lang.Object) 36000036L);
        java.lang.Class<?> wildcardClass72 = dateTimeZone28.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
// flaky "127) test0396(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky "120) test0396(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone14);
// flaky "97) test0396(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "70) test0396(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
// flaky "50) test0396(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 25200052L + "'", long21 == 25200052L);
// flaky "32) test0396(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
// flaky "21) test0396(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 90059999L + "'", long26 == 90059999L);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 97L + "'", long32 == 97L);
// flaky "15) test0396(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00" + "'", str35, "+00:00");
// flaky "9) test0396(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00" + "'", str39, "+00:00");
// flaky "5) test0396(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
// flaky "1) test0396(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long44 + "' != '" + 89520000L + "'", long44 == 89520000L);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 97L + "'", long50 == 97L);
// flaky "1) test0396(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(timeZone53);
// flaky "1) test0396(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone54);
// flaky "1) test0396(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "1) test0396(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "+00:00" + "'", str57, "+00:00");
// flaky "1) test0396(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "+00:00" + "'", str59, "+00:00");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 25200052L + "'", long61 == 25200052L);
// flaky "1) test0396(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "+00:00" + "'", str64, "+00:00");
// flaky "1) test0396(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "+00:00" + "'", str67, "+00:00");
// flaky "1) test0396(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "+00:00" + "'", str70, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        long long11 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, (-1570197064001L));
        java.lang.Class<?> wildcardClass12 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "128) test0397(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "121) test0397(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
// flaky "98) test0397(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky "71) test0397(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateTimeZone9);
// flaky "51) test0397(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570200664001L) + "'", long11 == (-1570200664001L));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.nextTransition((long) 1);
        long long13 = dateTimeZone3.previousTransition((-10800000L));
        java.util.TimeZone timeZone14 = dateTimeZone3.toTimeZone();
        long long16 = dateTimeZone3.previousTransition((-115259999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "129) test0398(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "122) test0398(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "99) test0398(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-10800000L) + "'", long13 == (-10800000L));
        org.junit.Assert.assertNotNull(timeZone14);
// flaky "72) test0398(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115259999L) + "'", long16 == (-115259999L));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((long) 25200000);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        long long8 = dateTimeZone4.getMillisKeepLocal(dateTimeZone6, (long) 'a');
        int int10 = dateTimeZone6.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone11 = dateTimeZone6.toTimeZone();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone6.getShortName((long) (byte) 100, locale13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone6.getShortName((long) (short) 0, locale16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone6.getName((long) (short) 100, locale19);
        java.lang.String str22 = dateTimeZone6.getName((long) (-1));
        boolean boolean24 = dateTimeZone6.isStandardOffset((long) (short) -1);
        boolean boolean25 = dateTimeZone0.equals((java.lang.Object) dateTimeZone6);
        long long27 = dateTimeZone6.previousTransition(115799900L);
        long long31 = dateTimeZone6.convertLocalToUTC(25200001L, false, 31L);
        long long33 = dateTimeZone6.nextTransition(119400101L);
        java.lang.String str35 = dateTimeZone6.getNameKey((-25200001L));
        java.lang.Class<?> wildcardClass36 = dateTimeZone6.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
// flaky "130) test0399(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky "123) test0399(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
// flaky "100) test0399(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
// flaky "73) test0399(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
// flaky "52) test0399(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.001" + "'", str20, "+00:00:00.001");
// flaky "33) test0399(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.001" + "'", str22, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 115799900L + "'", long27 == 115799900L);
// flaky "22) test0399(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 25200000L + "'", long31 == 25200000L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 119400101L + "'", long33 == 119400101L);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+100:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+100:00\" is malformed at \"0:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.getID();
        long long6 = dateTimeZone3.previousTransition((-1L));
        long long10 = dateTimeZone3.convertLocalToUTC(25200000L, true, 100L);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 100L);
        java.lang.Class<?> wildcardClass13 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "131) test0401(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
// flaky "124) test0401(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25199999L + "'", long10 == 25199999L);
// flaky "101) test0401(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int4 = dateTimeZone2.getStandardOffset((long) 10);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 'a');
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone6.getName((long) (short) 1, locale12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        boolean boolean15 = dateTimeZone2.equals((java.lang.Object) dateTimeZone6);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone2.getOffset(readableInstant16);
        long long21 = dateTimeZone2.convertLocalToUTC((-99L), false, 36000002L);
        int int23 = dateTimeZone2.getStandardOffset(0L);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        long long29 = dateTimeZone25.getMillisKeepLocal(dateTimeZone27, (long) 'a');
        int int31 = dateTimeZone27.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone32 = dateTimeZone27.toTimeZone();
        java.util.TimeZone timeZone33 = dateTimeZone27.toTimeZone();
        org.joda.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = dateTimeZone27.isLocalDateTimeGap(localDateTime34);
        boolean boolean36 = dateTimeZone2.equals((java.lang.Object) boolean35);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
// flaky "132) test0402(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115800000 + "'", int17 == 115800000);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-115800099L) + "'", long21 == (-115800099L));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 115800000 + "'", int23 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 97L + "'", long29 == 97L);
// flaky "125) test0402(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(timeZone32);
// flaky "102) test0402(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone33);
// flaky "74) test0402(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.nextTransition((long) 1);
        int int13 = dateTimeZone3.getOffset((long) (-1));
        java.lang.String str14 = dateTimeZone3.getID();
        long long16 = dateTimeZone3.convertUTCToLocal((-1570084924000L));
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        long long20 = dateTimeZone3.getMillisKeepLocal(dateTimeZone18, (long) (byte) 10);
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone18.getOffset(readableInstant21);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone25 = dateTimeZone24.toTimeZone();
        long long28 = dateTimeZone24.adjustOffset((long) (byte) 1, false);
        java.lang.Object obj29 = dateTimeZone24.writeReplace();
        java.lang.String str31 = dateTimeZone24.getNameKey((long) 36000000);
        boolean boolean32 = dateTimeZone18.equals((java.lang.Object) dateTimeZone24);
        long long35 = dateTimeZone24.convertLocalToUTC((-59900L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "133) test0403(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "126) test0403(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "103) test0403(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
// flaky "75) test0403(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
// flaky "53) test0403(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
// flaky "34) test0403(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1570084923999L) + "'", long16 == (-1570084923999L));
        org.junit.Assert.assertNotNull(dateTimeZone18);
// flaky "23) test0403(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 12L + "'", long20 == 12L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-59901L) + "'", long35 == (-59901L));
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        boolean boolean8 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone10.nextTransition((long) (short) 100);
        java.lang.String str14 = dateTimeZone10.getNameKey(1L);
        long long16 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, (-25200001L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Class<?> wildcardClass18 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "134) test0404(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-25200001L) + "'", long16 == (-25200001L));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        boolean boolean8 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone10.nextTransition((long) (short) 100);
        java.lang.String str14 = dateTimeZone10.getNameKey(1L);
        long long16 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, (-25200001L));
        java.lang.String str17 = dateTimeZone1.getID();
        java.util.TimeZone timeZone18 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.lang.Class<?> wildcardClass21 = dateTimeZone20.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "135) test0405(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-25200001L) + "'", long16 == (-25200001L));
// flaky "127) test0405(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone18);
// flaky "104) test0405(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        int int6 = dateTimeZone1.getOffset((long) 115800000);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((-1570200724001L), locale8);
        java.lang.String str10 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        long long8 = dateTimeZone1.previousTransition((long) (short) 1);
        java.lang.String str10 = dateTimeZone1.getNameKey((-99L));
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 115800000);
        int int14 = dateTimeZone1.getOffset((-35999900L));
        java.lang.Class<?> wildcardClass15 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "136) test0407(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky "128) test0407(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNull(str10);
// flaky "105) test0407(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
// flaky "76) test0407(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.getID();
        long long6 = dateTimeZone3.previousTransition((-1L));
        long long10 = dateTimeZone3.convertLocalToUTC(25200000L, true, 100L);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 100L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str17 = dateTimeZone15.getNameKey((long) 115800000);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone15.getShortName((-1570084924001L), locale19);
        long long22 = dateTimeZone15.nextTransition(98L);
        long long24 = dateTimeZone1.getMillisKeepLocal(dateTimeZone15, 99L);
        long long26 = dateTimeZone15.nextTransition((-1570012923999L));
        int int28 = dateTimeZone15.getStandardOffset(115739848L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "137) test0408(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
// flaky "129) test0408(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25200001L + "'", long10 == 25200001L);
// flaky "106) test0408(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 102L + "'", long12 == 102L);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 98L + "'", long22 == 98L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 101L + "'", long24 == 101L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1570012923999L) + "'", long26 == (-1570012923999L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(100L, locale11);
        int int14 = dateTimeZone1.getOffsetFromLocal((-25200000L));
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone1.getShortName((long) 10, locale16);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.lang.String str20 = dateTimeZone19.toString();
        long long22 = dateTimeZone19.convertUTCToLocal((-35999901L));
        long long24 = dateTimeZone1.getMillisKeepLocal(dateTimeZone19, 115799999L);
        java.lang.Object obj25 = dateTimeZone19.writeReplace();
        long long27 = dateTimeZone19.nextTransition((-35999898L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.001" + "'", str20, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-35999900L) + "'", long22 == (-35999900L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 115799999L + "'", long24 == 115799999L);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-35999898L) + "'", long27 == (-35999898L));
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 1, false, 97L);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        int int9 = dateTimeZone1.getOffsetFromLocal((-1570200724100L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str7 = dateTimeZone1.getNameKey(36000100L);
        java.lang.String str8 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.lang.String str3 = dateTimeZone1.getShortName((-1570084924100L));
        long long6 = dateTimeZone1.adjustOffset((long) 36000000, false);
        java.lang.String str7 = dateTimeZone1.getID();
        java.lang.Class<?> wildcardClass8 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.035" + "'", str3, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 36000000L + "'", long6 == 36000000L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.035" + "'", str7, "+00:00:00.035");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int4 = dateTimeZone2.getStandardOffset((long) 10);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 'a');
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone6.getName((long) (short) 1, locale12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        boolean boolean15 = dateTimeZone2.equals((java.lang.Object) dateTimeZone6);
        java.lang.String str16 = dateTimeZone6.toString();
        java.lang.String str17 = dateTimeZone6.getID();
        int int19 = dateTimeZone6.getStandardOffset((-115799999L));
        int int21 = dateTimeZone6.getOffsetFromLocal((-115799899L));
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj24 = dateTimeZone23.writeReplace();
        boolean boolean25 = dateTimeZone23.isFixed();
        boolean boolean26 = dateTimeZone6.equals((java.lang.Object) boolean25);
        boolean boolean28 = dateTimeZone6.isStandardOffset((-1570120924001L));
        java.lang.String str29 = dateTimeZone6.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.100" + "'", str29, "+00:00:00.100");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        int int3 = dateTimeZone1.getStandardOffset(89519900L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:35");
        long long4 = dateTimeZone1.adjustOffset((-1570081264200L), false);
        java.lang.String str6 = dateTimeZone1.getNameKey((-187199999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570081264200L) + "'", long4 == (-1570081264200L));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(100L, locale11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long15 = dateTimeZone1.convertUTCToLocal(0L);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.lang.String str18 = dateTimeZone17.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone17);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        long long23 = dateTimeZone21.nextTransition((long) (short) 100);
        int int25 = dateTimeZone21.getOffsetFromLocal(100L);
        long long27 = dateTimeZone17.getMillisKeepLocal(dateTimeZone21, (long) 115800000);
        java.lang.String str29 = dateTimeZone21.getNameKey((long) 115800000);
        boolean boolean30 = dateTimeZone1.equals((java.lang.Object) str29);
        boolean boolean32 = dateTimeZone1.isStandardOffset((-1570120924000L));
        java.lang.String str34 = dateTimeZone1.getName(111L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "138) test0416(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
// flaky "130) test0416(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
// flaky "107) test0416(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone17);
// flaky "77) test0416(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
// flaky "54) test0416(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 115800000L + "'", long27 == 115800000L);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
// flaky "35) test0416(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.001" + "'", str34, "+00:00:00.001");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str3 = dateTimeZone1.toString();
        long long7 = dateTimeZone1.convertLocalToUTC((-59904L), false, 89520002L);
        boolean boolean8 = dateTimeZone1.isFixed();
        long long12 = dateTimeZone1.convertLocalToUTC((-25200001L), true, 115800004L);
        int int14 = dateTimeZone1.getOffsetFromLocal(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "139) test0417(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
// flaky "131) test0417(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.001" + "'", str3, "+00:00:00.001");
// flaky "108) test0417(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-59905L) + "'", long7 == (-59905L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "78) test0417(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-25200002L) + "'", long12 == (-25200002L));
// flaky "55) test0417(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        long long12 = dateTimeZone1.convertLocalToUTC((long) (short) 0, true, 102L);
        java.lang.String str13 = dateTimeZone1.getID();
        boolean boolean14 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "140) test0418(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
// flaky "132) test0418(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
// flaky "109) test0418(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        int int10 = dateTimeZone3.getOffset((long) (short) 1);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone3.isLocalDateTimeGap(localDateTime11);
        long long15 = dateTimeZone3.convertLocalToUTC(25200000L, false);
        long long18 = dateTimeZone3.convertLocalToUTC((-1570517524001L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "141) test0419(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "133) test0419(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "110) test0419(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 25199999L + "'", long15 == 25199999L);
// flaky "79) test0419(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1570517524002L) + "'", long18 == (-1570517524002L));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        long long15 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, (long) 'a');
        int int17 = dateTimeZone13.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone18 = dateTimeZone13.toTimeZone();
        java.util.TimeZone timeZone19 = dateTimeZone13.toTimeZone();
        long long21 = dateTimeZone13.convertUTCToLocal(0L);
        long long23 = dateTimeZone1.getMillisKeepLocal(dateTimeZone13, (long) (short) -1);
        long long26 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int28 = dateTimeZone1.getStandardOffset((-231599899L));
        java.lang.Object obj29 = null;
        boolean boolean30 = dateTimeZone1.equals(obj29);
        long long32 = dateTimeZone1.previousTransition((long) 10);
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone1.getShortName((long) ' ', locale34);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "142) test0420(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
// flaky "134) test0420(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
// flaky "111) test0420(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
// flaky "80) test0420(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1570084924002L) + "'", long26 == (-1570084924002L));
// flaky "56) test0420(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
// flaky "36) test0420(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.001" + "'", str35, "+00:00:00.001");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(126000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        long long7 = dateTimeZone5.nextTransition((long) (short) 100);
        int int9 = dateTimeZone5.getOffsetFromLocal(100L);
        long long11 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (long) 115800000);
        int int13 = dateTimeZone1.getStandardOffset(11L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getShortName(89519999L, locale15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "143) test0422(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
// flaky "135) test0422(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
// flaky "112) test0422(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
// flaky "81) test0422(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.001" + "'", str16, "+00:00:00.001");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.lang.Object obj5 = dateTimeZone4.writeReplace();
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone4.getShortName((-1570012924100L), locale7);
        java.lang.Object obj9 = dateTimeZone4.writeReplace();
        boolean boolean10 = dateTimeZone1.equals(obj9);
        java.lang.Object obj11 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        long long15 = dateTimeZone13.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone13.getOffset(readableInstant16);
        java.lang.String str18 = dateTimeZone13.toString();
        long long20 = dateTimeZone13.previousTransition((long) (short) 1);
        java.lang.String str21 = dateTimeZone13.getID();
        int int23 = dateTimeZone13.getStandardOffset((-1570048924000L));
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone13.getShortName((long) '4', locale25);
        boolean boolean27 = dateTimeZone1.equals((java.lang.Object) str26);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "144) test0423(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.035" + "'", str8, "+00:00:00.035");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
// flaky "136) test0423(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
// flaky "113) test0423(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
// flaky "82) test0423(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.001" + "'", str21, "+00:00:00.001");
// flaky "57) test0423(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
// flaky "37) test0423(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.001" + "'", str26, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, (int) (short) 1);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        java.lang.String str6 = dateTimeZone2.getShortName((-1570120924002L));
        long long8 = dateTimeZone2.nextTransition((-129119999L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-01:01" + "'", str6, "-01:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-129119999L) + "'", long8 == (-129119999L));
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        long long5 = dateTimeZone1.nextTransition(115799900L);
        int int7 = dateTimeZone1.getOffsetFromLocal(2100000L);
        int int9 = dateTimeZone1.getOffsetFromLocal(63L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115799900L + "'", long5 == 115799900L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) '#');
        boolean boolean5 = dateTimeZone1.equals((java.lang.Object) dateTimeZone4);
        long long7 = dateTimeZone1.nextTransition((-39659900L));
        java.lang.Class<?> wildcardClass8 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-39659900L) + "'", long7 == (-39659900L));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int6 = dateTimeZone4.getStandardOffset((long) 10);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone8.getMillisKeepLocal(dateTimeZone10, (long) 'a');
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone8.getName((long) (short) 1, locale14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        boolean boolean17 = dateTimeZone4.equals((java.lang.Object) dateTimeZone8);
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, (long) (byte) 0);
        long long23 = dateTimeZone8.convertLocalToUTC(0L, true, (long) (short) -1);
        java.lang.String str25 = dateTimeZone8.getNameKey(89520001L);
        java.lang.String str26 = dateTimeZone8.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115800000 + "'", int6 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
// flaky "145) test0427(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "137) test0427(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 99L + "'", long19 == 99L);
// flaky "114) test0427(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertNull(str25);
// flaky "83) test0427(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.001" + "'", str26, "+00:00:00.001");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, (int) (short) 1);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        long long7 = dateTimeZone2.convertLocalToUTC((-1570084924047L), false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1570081264047L) + "'", long7 == (-1570081264047L));
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.nextTransition((long) 1);
        int int13 = dateTimeZone3.getOffset((long) (-1));
        java.lang.String str14 = dateTimeZone3.getID();
        long long16 = dateTimeZone3.convertUTCToLocal((-1570084924000L));
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        long long20 = dateTimeZone3.getMillisKeepLocal(dateTimeZone18, (long) (byte) 10);
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone18.getOffset(readableInstant21);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone25 = dateTimeZone24.toTimeZone();
        long long28 = dateTimeZone24.adjustOffset((long) (byte) 1, false);
        java.lang.Object obj29 = dateTimeZone24.writeReplace();
        java.lang.String str31 = dateTimeZone24.getNameKey((long) 36000000);
        boolean boolean32 = dateTimeZone18.equals((java.lang.Object) dateTimeZone24);
        java.lang.String str34 = dateTimeZone24.getNameKey((long) '#');
        int int36 = dateTimeZone24.getOffsetFromLocal(89520001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "146) test0429(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
// flaky "138) test0429(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
// flaky "115) test0429(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
// flaky "84) test0429(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1570084924001L) + "'", long16 == (-1570084924001L));
        org.junit.Assert.assertNotNull(dateTimeZone18);
// flaky "58) test0429(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getShortName((long) (short) 0, locale13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone3.getName((long) (short) 100, locale16);
        java.lang.String str19 = dateTimeZone3.getName((long) (-1));
        long long23 = dateTimeZone3.convertLocalToUTC((long) (byte) 1, true, (long) 10);
        long long27 = dateTimeZone3.convertLocalToUTC((-61200000L), false, 103L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "147) test0430(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "139) test0430(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "116) test0430(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
// flaky "85) test0430(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
// flaky "59) test0430(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
// flaky "38) test0430(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 2L + "'", long23 == 2L);
// flaky "24) test0430(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-61199999L) + "'", long27 == (-61199999L));
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        long long10 = dateTimeZone1.convertLocalToUTC((-1L), false, (long) '#');
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone1.getOffset(readableInstant11);
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        org.joda.time.tz.Provider provider14 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider14);
        org.joda.time.DateTimeZone.setProvider(provider14);
        org.joda.time.DateTimeZone.setProvider(provider14);
        org.joda.time.DateTimeZone.setProvider(provider14);
        org.joda.time.DateTimeZone.setProvider(provider14);
        org.joda.time.DateTimeZone.setProvider(provider14);
        org.joda.time.DateTimeZone.setProvider(provider14);
        boolean boolean22 = dateTimeZone1.equals((java.lang.Object) provider14);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone1.getName((-1570048984099L), locale24);
        java.lang.String str27 = dateTimeZone1.getName(115739900L);
        long long31 = dateTimeZone1.convertLocalToUTC((-129119897L), true, (-1570200664001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2L) + "'", long10 == (-2L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(provider14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.001" + "'", str25, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.001" + "'", str27, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-129119898L) + "'", long31 == (-129119898L));
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.nextTransition((long) 1);
        int int13 = dateTimeZone3.getOffset((long) (-1));
        java.lang.String str14 = dateTimeZone3.toString();
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone3.getName(36000100L, locale16);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "148) test0432(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
// flaky "140) test0432(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
// flaky "117) test0432(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
// flaky "86) test0432(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        long long5 = dateTimeZone1.convertLocalToUTC(100L, false, (-99L));
        java.lang.Class<?> wildcardClass6 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.getID();
        long long6 = dateTimeZone3.previousTransition((-1L));
        long long10 = dateTimeZone3.convertLocalToUTC(25200000L, true, 100L);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 100L);
        java.lang.String str14 = dateTimeZone1.getNameKey(115799900L);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        long long20 = dateTimeZone16.getMillisKeepLocal(dateTimeZone18, (long) 'a');
        int int22 = dateTimeZone18.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone23 = dateTimeZone18.toTimeZone();
        java.util.TimeZone timeZone24 = dateTimeZone18.toTimeZone();
        boolean boolean25 = dateTimeZone1.equals((java.lang.Object) timeZone24);
        int int27 = dateTimeZone1.getStandardOffset(96L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "149) test0434(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+10:00" + "'", str4, "+10:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
// flaky "141) test0434(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-10800000L) + "'", long10 == (-10800000L));
// flaky "118) test0434(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-35999899L) + "'", long12 == (-35999899L));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
// flaky "87) test0434(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 36000000 + "'", int22 == 36000000);
        org.junit.Assert.assertNotNull(timeZone23);
// flaky "60) test0434(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(timeZone24);
// flaky "39) test0434(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        java.lang.String str8 = dateTimeZone1.getName((-1570084924101L));
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str12 = dateTimeZone11.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.lang.String str10 = dateTimeZone1.getShortName(1L);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        long long16 = dateTimeZone12.getMillisKeepLocal(dateTimeZone14, (long) 'a');
        int int18 = dateTimeZone14.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone19 = dateTimeZone14.toTimeZone();
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone14.getShortName((long) (byte) 100, locale21);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone14.getShortName((long) (short) 0, locale24);
        java.lang.String str26 = dateTimeZone14.getID();
        java.lang.String str28 = dateTimeZone14.getNameKey((long) (byte) -1);
        long long31 = dateTimeZone14.convertLocalToUTC((-90600000L), false);
        long long34 = dateTimeZone14.adjustOffset(36000032L, false);
        java.lang.Object obj35 = dateTimeZone14.writeReplace();
        long long37 = dateTimeZone1.getMillisKeepLocal(dateTimeZone14, 4140000L);
        boolean boolean39 = dateTimeZone14.isStandardOffset((-36000000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "150) test0436(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115260000 + "'", int5 == 115260000);
// flaky "142) test0436(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:01" + "'", str6, "+32:01");
// flaky "119) test0436(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115260000 + "'", int8 == 115260000);
// flaky "88) test0436(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:01" + "'", str10, "+32:01");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
// flaky "61) test0436(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115260000 + "'", int18 == 115260000);
        org.junit.Assert.assertNotNull(timeZone19);
// flaky "40) test0436(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
// flaky "25) test0436(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+32:01" + "'", str22, "+32:01");
// flaky "16) test0436(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+32:01" + "'", str25, "+32:01");
// flaky "10) test0436(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+32:01" + "'", str26, "+32:01");
        org.junit.Assert.assertNull(str28);
// flaky "6) test0436(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-205860000L) + "'", long31 == (-205860000L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 36000032L + "'", long34 == 36000032L);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 4140000L + "'", long37 == 4140000L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(100L, locale11);
        int int14 = dateTimeZone1.getOffsetFromLocal((-25200000L));
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone1.getShortName((long) 10, locale16);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.lang.String str20 = dateTimeZone19.toString();
        long long22 = dateTimeZone19.convertUTCToLocal((-35999901L));
        long long24 = dateTimeZone1.getMillisKeepLocal(dateTimeZone19, 115799999L);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        long long30 = dateTimeZone26.getMillisKeepLocal(dateTimeZone28, (long) 'a');
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone26.getName((long) (short) 1, locale32);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        java.util.Locale locale36 = null;
        java.lang.String str37 = dateTimeZone26.getName(100L, locale36);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        boolean boolean39 = dateTimeZone19.equals((java.lang.Object) dateTimeZone26);
        boolean boolean40 = dateTimeZone19.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "151) test0437(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
// flaky "143) test0437(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
// flaky "120) test0437(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
// flaky "89) test0437(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone19);
// flaky "62) test0437(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.001" + "'", str20, "+00:00:00.001");
// flaky "41) test0437(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-35999900L) + "'", long22 == (-35999900L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 115799999L + "'", long24 == 115799999L);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 97L + "'", long30 == 97L);
// flaky "26) test0437(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.001" + "'", str33, "+00:00:00.001");
// flaky "17) test0437(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00:00.001" + "'", str37, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.nextTransition((long) 1);
        int int13 = dateTimeZone3.getOffset((long) (-1));
        int int15 = dateTimeZone3.getOffsetFromLocal(3L);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone3.getShortName((-1570156924001L), locale17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "152) test0438(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
// flaky "144) test0438(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
// flaky "121) test0438(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
// flaky "90) test0438(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "153) test0439(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
// flaky "145) test0439(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
// flaky "122) test0439(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        boolean boolean9 = dateTimeZone1.isStandardOffset((-35999900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.lang.String str7 = dateTimeZone1.getNameKey(25200000L);
        java.lang.String str8 = dateTimeZone1.toString();
        boolean boolean10 = dateTimeZone1.isStandardOffset(115800002L);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((-206400000L), locale12);
        long long16 = dateTimeZone1.adjustOffset(31L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertNull(str7);
// flaky "154) test0441(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "146) test0441(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 31L + "'", long16 == 31L);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        long long10 = dateTimeZone1.previousTransition((-1570084924099L));
        long long12 = dateTimeZone1.previousTransition((-36000001L));
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(360600000);
        long long17 = dateTimeZone14.adjustOffset((-35999999L), true);
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone14, 0L);
        java.util.TimeZone timeZone20 = dateTimeZone14.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+:0:10\" is malformed at \":0:10\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "155) test0443(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "147) test0443(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1570084924099L) + "'", long10 == (-1570084924099L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-36000001L) + "'", long12 == (-36000001L));
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-35999999L) + "'", long17 == (-35999999L));
// flaky "123) test0443(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-360599999L) + "'", long19 == (-360599999L));
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+:0:10");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(360000000);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 115799900L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName(4140001L, locale7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 479399900L + "'", long5 == 479399900L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+100:00" + "'", str8, "+100:00");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 10);
        boolean boolean4 = dateTimeZone2.isStandardOffset(36000100L);
        int int6 = dateTimeZone2.getOffset(72000000L);
        long long8 = dateTimeZone2.nextTransition((-35939969L));
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone2.getShortName((-1570164724101L), locale10);
        long long15 = dateTimeZone2.convertLocalToUTC(79800000L, true, (-129119897L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 360600000 + "'", int6 == 360600000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-35939969L) + "'", long8 == (-35939969L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+100:10" + "'", str11, "+100:10");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-280800000L) + "'", long15 == (-280800000L));
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        long long15 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, (long) 'a');
        int int17 = dateTimeZone13.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone18 = dateTimeZone13.toTimeZone();
        java.util.TimeZone timeZone19 = dateTimeZone13.toTimeZone();
        long long21 = dateTimeZone13.convertUTCToLocal(0L);
        long long23 = dateTimeZone1.getMillisKeepLocal(dateTimeZone13, (long) (short) -1);
        long long26 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int28 = dateTimeZone1.getStandardOffset((-231599899L));
        java.lang.Object obj29 = null;
        boolean boolean30 = dateTimeZone1.equals(obj29);
        boolean boolean32 = dateTimeZone1.isStandardOffset(3599999L);
        java.lang.String str33 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "156) test0446(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
// flaky "148) test0446(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
// flaky "124) test0446(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
// flaky "91) test0446(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1570084924002L) + "'", long26 == (-1570084924002L));
// flaky "63) test0446(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
// flaky "42) test0446(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.001" + "'", str33, "+00:00:00.001");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (byte) 1, false);
        long long7 = dateTimeZone1.previousTransition(0L);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.nextTransition((long) 1);
        boolean boolean12 = dateTimeZone3.isFixed();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str15 = dateTimeZone13.getShortName((long) 25200000);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        long long21 = dateTimeZone17.getMillisKeepLocal(dateTimeZone19, (long) 'a');
        int int23 = dateTimeZone19.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone24 = dateTimeZone19.toTimeZone();
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone19.getShortName((long) (byte) 100, locale26);
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone19.getShortName((long) (short) 0, locale29);
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone19.getName((long) (short) 100, locale32);
        java.lang.String str35 = dateTimeZone19.getName((long) (-1));
        boolean boolean37 = dateTimeZone19.isStandardOffset((long) (short) -1);
        boolean boolean38 = dateTimeZone13.equals((java.lang.Object) dateTimeZone19);
        long long40 = dateTimeZone3.getMillisKeepLocal(dateTimeZone13, (-1570120924101L));
        int int42 = dateTimeZone13.getOffset((-1570048924000L));
        java.util.TimeZone timeZone43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        java.util.TimeZone timeZone45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        long long48 = dateTimeZone44.getMillisKeepLocal(dateTimeZone46, (long) 'a');
        int int50 = dateTimeZone46.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone51 = dateTimeZone46.toTimeZone();
        java.util.TimeZone timeZone52 = dateTimeZone46.toTimeZone();
        java.util.Locale locale54 = null;
        java.lang.String str55 = dateTimeZone46.getName((long) (short) 10, locale54);
        boolean boolean56 = dateTimeZone46.isFixed();
        long long58 = dateTimeZone13.getMillisKeepLocal(dateTimeZone46, (-1569688324000L));
        int int60 = dateTimeZone46.getOffsetFromLocal(11L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "157) test0448(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
// flaky "149) test0448(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
// flaky "125) test0448(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.001" + "'", str27, "+00:00:00.001");
// flaky "92) test0448(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.001" + "'", str30, "+00:00:00.001");
// flaky "64) test0448(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.001" + "'", str33, "+00:00:00.001");
// flaky "43) test0448(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.001" + "'", str35, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
// flaky "27) test0448(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1570120924100L) + "'", long40 == (-1570120924100L));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 97L + "'", long48 == 97L);
// flaky "18) test0448(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(timeZone51);
        org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone52);
        org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "GMT+00:00");
// flaky "11) test0448(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "+00:00:00.001" + "'", str55, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
// flaky "7) test0448(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1569688324001L) + "'", long58 == (-1569688324001L));
// flaky "2) test0448(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        boolean boolean4 = dateTimeZone1.isStandardOffset(98L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getShortName((long) 187200000, locale6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "158) test0449(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "150) test0449(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        int int10 = dateTimeZone1.getOffset((long) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, 100L);
        int int16 = dateTimeZone1.getStandardOffset(36000031L);
        long long18 = dateTimeZone1.convertUTCToLocal((-1570084923902L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "159) test0450(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
// flaky "151) test0450(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone12);
// flaky "126) test0450(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-35999899L) + "'", long14 == (-35999899L));
// flaky "93) test0450(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
// flaky "65) test0450(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1570084923901L) + "'", long18 == (-1570084923901L));
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) '4');
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getName(35999900L, locale4);
        java.lang.String str7 = dateTimeZone2.getNameKey(8L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.Class<?> wildcardClass9 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+35:52" + "'", str5, "+35:52");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '4');
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone3.previousTransition((-1570048924000L));
        long long8 = dateTimeZone3.convertLocalToUTC((long) (byte) 10, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1570048924000L) + "'", long5 == (-1570048924000L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        long long6 = dateTimeZone1.previousTransition((long) ' ');
        java.lang.String str8 = dateTimeZone1.getShortName((long) 10);
        int int10 = dateTimeZone1.getOffset((long) (short) 0);
        long long12 = dateTimeZone1.previousTransition((-115799901L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-115799901L) + "'", long12 == (-115799901L));
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        int int10 = dateTimeZone1.getOffset((long) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, 100L);
        int int16 = dateTimeZone1.getOffsetFromLocal(98L);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone1.isLocalDateTimeGap(localDateTime17);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone1.getShortName((-129119897L), locale20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 129120000 + "'", int8 == 129120000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 129120000 + "'", int10 == 129120000);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 93120100L + "'", long14 == 93120100L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 129120000 + "'", int16 == 129120000);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+35:52" + "'", str21, "+35:52");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        int int10 = dateTimeZone1.getOffset((long) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, 100L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        java.lang.String str17 = dateTimeZone12.getNameKey(231059997L);
        boolean boolean18 = dateTimeZone12.isFixed();
        java.lang.String str20 = dateTimeZone12.getNameKey((-115799904L));
        long long23 = dateTimeZone12.adjustOffset(36000032L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 129120000 + "'", int8 == 129120000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 129120000 + "'", int10 == 129120000);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 93120100L + "'", long14 == 93120100L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 36000032L + "'", long23 == 36000032L);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 360000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 360000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.lang.String str7 = dateTimeZone1.getID();
        java.lang.Object obj8 = dateTimeZone1.writeReplace();
        int int10 = dateTimeZone1.getOffset((-1570200184100L));
        long long13 = dateTimeZone1.adjustOffset(25199965L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "160) test0457(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "152) test0457(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertNotNull(obj8);
// flaky "127) test0457(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 25199965L + "'", long13 == 25199965L);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int4 = dateTimeZone2.getStandardOffset((long) 10);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 'a');
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone6.getName((long) (short) 1, locale12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        boolean boolean15 = dateTimeZone2.equals((java.lang.Object) dateTimeZone6);
        java.lang.String str17 = dateTimeZone2.getNameKey((-35999901L));
        java.util.TimeZone timeZone18 = dateTimeZone2.toTimeZone();
        java.lang.Object obj19 = dateTimeZone2.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
// flaky "161) test0458(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        int int5 = dateTimeZone1.getStandardOffset(0L);
        int int7 = dateTimeZone1.getStandardOffset((-1570084924201L));
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        int int11 = dateTimeZone1.getOffset(90060000L);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone1.getOffset(readableInstant12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-00:00:00.001");
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long11 = dateTimeZone1.nextTransition((long) ' ');
        boolean boolean13 = dateTimeZone1.isStandardOffset((long) (short) 1);
        int int15 = dateTimeZone1.getOffset((-35999990L));
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        long long21 = dateTimeZone17.getMillisKeepLocal(dateTimeZone19, (long) 'a');
        int int23 = dateTimeZone19.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone24 = dateTimeZone19.toTimeZone();
        java.util.TimeZone timeZone25 = dateTimeZone19.toTimeZone();
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone19.getName((long) (short) 10, locale27);
        boolean boolean30 = dateTimeZone19.equals((java.lang.Object) (byte) 0);
        boolean boolean31 = dateTimeZone1.equals((java.lang.Object) dateTimeZone19);
        long long33 = dateTimeZone1.previousTransition((-115799899L));
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone1.getName((-115199900L), locale35);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:00" + "'", str8, "+10:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36000000 + "'", int15 == 36000000);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 36000000 + "'", int23 == 36000000);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+10:00" + "'", str28, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-115799899L) + "'", long33 == (-115799899L));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+10:00" + "'", str36, "+10:00");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.getID();
        long long6 = dateTimeZone3.previousTransition((-1L));
        long long10 = dateTimeZone3.convertLocalToUTC(25200000L, true, 100L);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 100L);
        java.lang.String str14 = dateTimeZone1.getNameKey(115799900L);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        long long20 = dateTimeZone16.getMillisKeepLocal(dateTimeZone18, (long) 'a');
        int int22 = dateTimeZone18.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone23 = dateTimeZone18.toTimeZone();
        java.util.TimeZone timeZone24 = dateTimeZone18.toTimeZone();
        boolean boolean25 = dateTimeZone1.equals((java.lang.Object) timeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int32 = dateTimeZone30.getStandardOffset((long) 10);
        java.util.TimeZone timeZone33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        java.util.TimeZone timeZone35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        long long38 = dateTimeZone34.getMillisKeepLocal(dateTimeZone36, (long) 'a');
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone34.getName((long) (short) 1, locale40);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone34);
        boolean boolean43 = dateTimeZone30.equals((java.lang.Object) dateTimeZone34);
        long long46 = dateTimeZone34.adjustOffset((long) (short) -1, false);
        boolean boolean47 = dateTimeZone34.isFixed();
        boolean boolean48 = dateTimeZone27.equals((java.lang.Object) dateTimeZone34);
        java.lang.String str50 = dateTimeZone34.getName(11L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+10:00" + "'", str4, "+10:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-10800000L) + "'", long10 == (-10800000L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-35999899L) + "'", long12 == (-35999899L));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 36000000 + "'", int22 == 36000000);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 115800000 + "'", int32 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 97L + "'", long38 == 97L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+10:00" + "'", str41, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+10:00" + "'", str50, "+10:00");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        long long10 = dateTimeZone1.convertLocalToUTC((-1L), false, (long) '#');
        java.lang.String str11 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long16 = dateTimeZone13.adjustOffset((long) (short) 1, false);
        java.lang.String str18 = dateTimeZone13.getShortName(0L);
        java.util.TimeZone timeZone19 = dateTimeZone13.toTimeZone();
        boolean boolean20 = dateTimeZone1.equals((java.lang.Object) timeZone19);
        boolean boolean21 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2L) + "'", long10 == (-2L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        boolean boolean9 = dateTimeZone3.equals((java.lang.Object) (byte) 0);
        java.util.TimeZone timeZone10 = dateTimeZone3.toTimeZone();
        long long12 = dateTimeZone3.convertUTCToLocal((-35999968L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        long long7 = dateTimeZone5.nextTransition((long) (short) 100);
        int int9 = dateTimeZone5.getOffsetFromLocal(100L);
        long long11 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (long) 115800000);
        java.lang.String str13 = dateTimeZone5.getShortName((long) 'a');
        java.lang.String str15 = dateTimeZone5.getShortName(115260050L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36000000 + "'", int9 == 36000000);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+10:00" + "'", str13, "+10:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+10:00" + "'", str15, "+10:00");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str8 = dateTimeZone1.getShortName(115799999L);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (short) 1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone11.getName(25200000L, locale13);
        boolean boolean15 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        long long21 = dateTimeZone17.adjustOffset((long) (byte) 1, false);
        long long23 = dateTimeZone17.previousTransition(0L);
        java.util.TimeZone timeZone24 = dateTimeZone17.toTimeZone();
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = dateTimeZone17.getOffset(readableInstant25);
        java.lang.String str28 = dateTimeZone17.getName(102L);
        long long30 = dateTimeZone11.getMillisKeepLocal(dateTimeZone17, (-35999968L));
        long long32 = dateTimeZone11.convertUTCToLocal(0L);
        long long35 = dateTimeZone11.convertLocalToUTC((long) 36000000, false);
        long long37 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, (long) 115800000);
        long long39 = dateTimeZone11.previousTransition(115260050L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:00" + "'", str8, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.001" + "'", str28, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-35939969L) + "'", long30 == (-35939969L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 60000L + "'", long32 == 60000L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 35940000L + "'", long35 == 35940000L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 151740000L + "'", long37 == 151740000L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 115260050L + "'", long39 == 115260050L);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.nextTransition((long) 1);
        int int13 = dateTimeZone3.getOffset((long) (-1));
        int int15 = dateTimeZone3.getOffsetFromLocal(3L);
        long long18 = dateTimeZone3.convertLocalToUTC(115259950L, false);
        long long20 = dateTimeZone3.nextTransition((-35999899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "162) test0467(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115800000 + "'", int7 == 115800000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "153) test0467(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "128) test0467(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
// flaky "94) test0467(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115800000 + "'", int13 == 115800000);
// flaky "66) test0467(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115800000 + "'", int15 == 115800000);
// flaky "44) test0467(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-540050L) + "'", long18 == (-540050L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-35999899L) + "'", long20 == (-35999899L));
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        java.lang.String str6 = dateTimeZone1.getShortName(2L);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        int int10 = dateTimeZone8.getOffset((-35999991L));
        boolean boolean12 = dateTimeZone8.isStandardOffset((-35999999L));
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone8.getShortName(4140001L, locale14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        long long5 = dateTimeZone2.getMillisKeepLocal(dateTimeZone3, (-59899L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
// flaky "163) test0469(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 233340101L + "'", long5 == 233340101L);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getShortName((long) (short) 0, locale13);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        long long20 = dateTimeZone16.getMillisKeepLocal(dateTimeZone18, (long) 'a');
        int int22 = dateTimeZone18.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone23 = dateTimeZone18.toTimeZone();
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone18.getShortName((long) (byte) 100, locale25);
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone18.getShortName((long) (short) 0, locale28);
        long long31 = dateTimeZone3.getMillisKeepLocal(dateTimeZone18, (-115800099L));
        long long34 = dateTimeZone18.convertLocalToUTC(0L, true);
        long long36 = dateTimeZone18.previousTransition((-35999901L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "164) test0470(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115800000 + "'", int7 == 115800000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "154) test0470(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
// flaky "129) test0470(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:10" + "'", str11, "+32:10");
// flaky "95) test0470(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:10" + "'", str14, "+32:10");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
// flaky "67) test0470(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115800000 + "'", int22 == 115800000);
        org.junit.Assert.assertNotNull(timeZone23);
// flaky "45) test0470(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
// flaky "28) test0470(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+32:10" + "'", str26, "+32:10");
// flaky "19) test0470(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+32:10" + "'", str29, "+32:10");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-115800099L) + "'", long31 == (-115800099L));
// flaky "12) test0470(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-115800000L) + "'", long34 == (-115800000L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-35999901L) + "'", long36 == (-35999901L));
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getShortName((long) (short) 0, locale13);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        java.lang.Object obj16 = dateTimeZone3.writeReplace();
        int int18 = dateTimeZone3.getOffsetFromLocal(115260051L);
        long long22 = dateTimeZone3.convertLocalToUTC((-35999848L), true, 35999899L);
        long long25 = dateTimeZone3.adjustOffset(111L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "165) test0471(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "155) test0471(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "130) test0471(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
// flaky "96) test0471(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertNotNull(obj16);
// flaky "68) test0471(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
// flaky "46) test0471(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-35999849L) + "'", long22 == (-35999849L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 111L + "'", long25 == 111L);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360000000, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        java.lang.Object obj5 = dateTimeZone2.writeReplace();
        long long8 = dateTimeZone2.convertLocalToUTC(25140000L, true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36000000 + "'", int4 == 36000000);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-10860000L) + "'", long8 == (-10860000L));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(129120000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getOffset((long) 1);
        boolean boolean10 = dateTimeZone1.isStandardOffset((-35999901L));
        java.lang.Class<?> wildcardClass11 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "166) test0475(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj6);
// flaky "156) test0475(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(60000, 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-01:01");
        java.lang.String str3 = dateTimeZone1.getNameKey(101L);
        long long5 = dateTimeZone1.nextTransition(83400000L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj8 = dateTimeZone7.writeReplace();
        java.lang.String str9 = dateTimeZone7.getID();
        long long11 = dateTimeZone7.convertUTCToLocal(100L);
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone7.isLocalDateTimeGap(localDateTime12);
        long long15 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, 119400001L);
        int int17 = dateTimeZone1.getOffset((-1570085464099L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 83400000L + "'", long5 == 83400000L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 99L + "'", long11 == 99L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115740002L + "'", long15 == 115740002L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-3660000) + "'", int17 == (-3660000));
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(100L, locale11);
        boolean boolean14 = dateTimeZone1.equals((java.lang.Object) (-101L));
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        long long20 = dateTimeZone16.getMillisKeepLocal(dateTimeZone18, (long) 'a');
        int int22 = dateTimeZone18.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone23 = dateTimeZone18.toTimeZone();
        java.util.TimeZone timeZone24 = dateTimeZone18.toTimeZone();
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone18.getName((long) (short) 10, locale26);
        boolean boolean29 = dateTimeZone18.equals((java.lang.Object) (byte) 0);
        long long33 = dateTimeZone18.convertLocalToUTC((long) 10, true, (-35999991L));
        java.lang.String str35 = dateTimeZone18.getShortName(3660000L);
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        org.joda.time.LocalDateTime localDateTime38 = null;
        boolean boolean39 = dateTimeZone37.isLocalDateTimeGap(localDateTime38);
        int int41 = dateTimeZone37.getStandardOffset((long) (short) 0);
        long long43 = dateTimeZone37.previousTransition((long) '#');
        int int45 = dateTimeZone37.getOffsetFromLocal(115799900L);
        long long47 = dateTimeZone37.convertUTCToLocal((-36000000L));
        boolean boolean49 = dateTimeZone37.equals((java.lang.Object) (-39659899L));
        boolean boolean50 = dateTimeZone18.equals((java.lang.Object) boolean49);
        long long52 = dateTimeZone1.getMillisKeepLocal(dateTimeZone18, 3660035L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "167) test0478(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
// flaky "157) test0478(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
// flaky "131) test0478(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(timeZone23);
// flaky "97) test0478(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone24);
// flaky "69) test0478(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "47) test0478(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
// flaky "29) test0478(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
// flaky "20) test0478(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00" + "'", str35, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
// flaky "13) test0478(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 35L + "'", long43 == 35L);
// flaky "8) test0478(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
// flaky "3) test0478(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-36000000L) + "'", long47 == (-36000000L));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 3660035L + "'", long52 == 3660035L);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        int int10 = dateTimeZone1.getOffset((long) 1);
        java.lang.Object obj11 = dateTimeZone1.writeReplace();
        java.lang.String str13 = dateTimeZone1.getShortName((-1570084924001L));
        long long16 = dateTimeZone1.adjustOffset((long) '#', false);
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone1.getOffset(readableInstant17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone1.getOffset(readableInstant19);
        java.util.TimeZone timeZone21 = dateTimeZone1.toTimeZone();
        long long24 = dateTimeZone1.convertLocalToUTC((-35999990L), true);
        long long26 = dateTimeZone1.previousTransition(89520001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "168) test0479(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
// flaky "158) test0479(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
// flaky "132) test0479(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
// flaky "98) test0479(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
// flaky "70) test0479(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(timeZone21);
// flaky "48) test0479(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "30) test0479(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-35999990L) + "'", long24 == (-35999990L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 89520001L + "'", long26 == 89520001L);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone3.getName((long) (short) 10, locale11);
        java.lang.String str14 = dateTimeZone3.getName(0L);
        long long16 = dateTimeZone3.previousTransition(25200052L);
        java.lang.Object obj17 = dateTimeZone3.writeReplace();
        java.lang.String str18 = dateTimeZone3.getID();
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone3.getOffset(readableInstant19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "169) test0480(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "159) test0480(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "133) test0480(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
// flaky "99) test0480(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
// flaky "71) test0480(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 25200052L + "'", long16 == 25200052L);
        org.junit.Assert.assertNotNull(obj17);
// flaky "49) test0480(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
// flaky "31) test0480(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        long long5 = dateTimeZone1.adjustOffset(36000000L, true);
        java.lang.String str7 = dateTimeZone1.getNameKey((-1570200724001L));
        int int9 = dateTimeZone1.getOffsetFromLocal(0L);
        java.lang.Class<?> wildcardClass10 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 36000000L + "'", long5 == 36000000L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone3.getName((long) (short) 10, locale11);
        boolean boolean14 = dateTimeZone3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        int int17 = dateTimeZone3.getOffsetFromLocal(2L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "170) test0482(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "160) test0482(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "134) test0482(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
// flaky "100) test0482(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "72) test0482(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        java.lang.Object obj5 = dateTimeZone2.writeReplace();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int10 = dateTimeZone8.getStandardOffset((long) 10);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        long long16 = dateTimeZone12.getMillisKeepLocal(dateTimeZone14, (long) 'a');
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone12.getName((long) (short) 1, locale18);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        boolean boolean21 = dateTimeZone8.equals((java.lang.Object) dateTimeZone12);
        long long24 = dateTimeZone12.adjustOffset((long) (short) -1, false);
        boolean boolean26 = dateTimeZone12.isStandardOffset(112139999L);
        long long28 = dateTimeZone2.getMillisKeepLocal(dateTimeZone12, 0L);
        java.lang.String str30 = dateTimeZone2.getShortName(3600001L);
        long long32 = dateTimeZone2.convertUTCToLocal((-36000090L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36000000 + "'", int4 == 36000000);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115800000 + "'", int10 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
// flaky "171) test0483(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.001" + "'", str19, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
// flaky "161) test0483(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 35999999L + "'", long28 == 35999999L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+10:00" + "'", str30, "+10:00");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-90L) + "'", long32 == (-90L));
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        int int3 = dateTimeZone1.getOffset((long) '4');
        java.lang.String str5 = dateTimeZone1.getName(60001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-01:01");
        java.lang.String str3 = dateTimeZone1.getNameKey(101L);
        long long5 = dateTimeZone1.nextTransition(83400000L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj8 = dateTimeZone7.writeReplace();
        java.lang.String str9 = dateTimeZone7.getID();
        long long11 = dateTimeZone7.convertUTCToLocal(100L);
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone7.isLocalDateTimeGap(localDateTime12);
        long long15 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, 119400001L);
        java.lang.String str16 = dateTimeZone1.getID();
        int int18 = dateTimeZone1.getOffset(115800004L);
        java.lang.Class<?> wildcardClass19 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 83400000L + "'", long5 == 83400000L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 99L + "'", long11 == 99L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115740002L + "'", long15 == 115740002L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-01:01" + "'", str16, "-01:01");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3660000) + "'", int18 == (-3660000));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+100:10");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+100:10\" is malformed at \"0:10\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.getID();
        long long6 = dateTimeZone3.previousTransition((-1L));
        long long10 = dateTimeZone3.convertLocalToUTC(25200000L, true, 100L);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 100L);
        java.lang.String str14 = dateTimeZone1.getNameKey(115799900L);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        long long20 = dateTimeZone16.getMillisKeepLocal(dateTimeZone18, (long) 'a');
        int int22 = dateTimeZone18.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone23 = dateTimeZone18.toTimeZone();
        java.util.TimeZone timeZone24 = dateTimeZone18.toTimeZone();
        boolean boolean25 = dateTimeZone1.equals((java.lang.Object) timeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        int int28 = dateTimeZone26.getOffsetFromLocal(0L);
        int int30 = dateTimeZone26.getOffsetFromLocal((long) 360000000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "172) test0487(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
// flaky "162) test0487(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25199999L + "'", long10 == 25199999L);
// flaky "135) test0487(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
// flaky "101) test0487(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(timeZone23);
// flaky "73) test0487(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone24);
// flaky "50) test0487(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeZone26);
// flaky "32) test0487(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
// flaky "21) test0487(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str8 = dateTimeZone1.getShortName(115800002L);
        long long11 = dateTimeZone1.adjustOffset(39600000L, false);
        int int13 = dateTimeZone1.getOffsetFromLocal((-35999990L));
        long long15 = dateTimeZone1.previousTransition((-99L));
        int int17 = dateTimeZone1.getStandardOffset((-25200002L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "173) test0488(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "163) test0488(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 39600000L + "'", long11 == 39600000L);
// flaky "136) test0488(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-99L) + "'", long15 == (-99L));
// flaky "102) test0488(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC((-115799899L), true, 36000100L);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "174) test0489(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
// flaky "164) test0489(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115799900L) + "'", long8 == (-115799900L));
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "137) test0489(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        long long3 = dateTimeZone1.convertUTCToLocal((long) 25200000);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) ' ');
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        long long10 = dateTimeZone1.adjustOffset(0L, true);
        int int12 = dateTimeZone1.getOffsetFromLocal(115260000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25200052L + "'", long3 == 25200052L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.convertUTCToLocal(72000000L);
        long long10 = dateTimeZone1.nextTransition((long) (-1));
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone1.isLocalDateTimeGap(localDateTime11);
        boolean boolean14 = dateTimeZone1.isStandardOffset((-35999968L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 71999999L + "'", long8 == 71999999L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long15 = dateTimeZone12.convertLocalToUTC((-1570084924001L), false);
        boolean boolean16 = dateTimeZone1.equals((java.lang.Object) long15);
        java.util.TimeZone timeZone17 = dateTimeZone1.toTimeZone();
        java.lang.Class<?> wildcardClass18 = timeZone17.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924000L) + "'", long15 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.lang.String str7 = dateTimeZone1.getID();
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        long long10 = dateTimeZone1.previousTransition(54L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 54L + "'", long10 == 54L);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        java.lang.String str6 = dateTimeZone1.getShortName(2L);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        boolean boolean9 = dateTimeZone1.isStandardOffset(3660101L);
        java.lang.String str11 = dateTimeZone1.getShortName((long) 360600000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        boolean boolean8 = dateTimeZone1.isFixed();
        long long10 = dateTimeZone1.nextTransition(11L);
        int int12 = dateTimeZone1.getOffsetFromLocal((-1570120924101L));
        int int14 = dateTimeZone1.getStandardOffset(36000037L);
        int int16 = dateTimeZone1.getOffsetFromLocal(119399999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "175) test0495(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11L + "'", long10 == 11L);
// flaky "165) test0495(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
// flaky "138) test0495(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
// flaky "103) test0495(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        long long15 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, (long) 'a');
        int int17 = dateTimeZone13.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone18 = dateTimeZone13.toTimeZone();
        java.util.TimeZone timeZone19 = dateTimeZone13.toTimeZone();
        long long21 = dateTimeZone13.convertUTCToLocal(0L);
        long long23 = dateTimeZone1.getMillisKeepLocal(dateTimeZone13, (long) (short) -1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "176) test0496(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
// flaky "166) test0496(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
// flaky "139) test0496(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((-1570084924101L), locale8);
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName(102L, locale12);
        long long17 = dateTimeZone1.convertLocalToUTC((-1570120924111L), true, (-1570120924001L));
        java.lang.Class<?> wildcardClass18 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "177) test0497(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "167) test0497(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertNotNull(obj10);
// flaky "140) test0497(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
// flaky "104) test0497(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1570120924112L) + "'", long17 == (-1570120924112L));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, 115800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(360000000);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 115799900L);
        java.util.TimeZone timeZone6 = dateTimeZone3.toTimeZone();
        java.lang.Class<?> wildcardClass7 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 479399900L + "'", long5 == 479399900L);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int4 = dateTimeZone2.getStandardOffset((long) 10);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 'a');
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone6.getName((long) (short) 1, locale12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        boolean boolean15 = dateTimeZone2.equals((java.lang.Object) dateTimeZone6);
        java.lang.String str17 = dateTimeZone2.getNameKey((-35999901L));
        java.util.TimeZone timeZone18 = dateTimeZone2.toTimeZone();
        long long21 = dateTimeZone2.convertLocalToUTC(112139999L, true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
// flaky "178) test0500(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-3660001L) + "'", long21 == (-3660001L));
    }
}
