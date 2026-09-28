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
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strSet0);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
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
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("ICT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'ICT' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 25200000 + "'", int7 == 25200000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
// flaky "1) test0012(org.joda.time.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.100' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "1) test0012(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "1) test0012(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        long long11 = dateTimeZone1.convertLocalToUTC((-1570084924101L), true);
        java.lang.Class<?> wildcardClass12 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "2) test0015(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
// flaky "2) test0015(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570084924100L) + "'", long11 == (-1570084924100L));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.Class<?> wildcardClass3 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        long long7 = dateTimeZone1.previousTransition(10L);
        java.lang.String str9 = dateTimeZone1.getShortName(100L);
        long long11 = dateTimeZone1.previousTransition(2L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "3) test0017(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky "3) test0017(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky "2) test0017(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
// flaky "1) test0017(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        long long11 = dateTimeZone1.convertLocalToUTC((-1570084924101L), true);
        int int13 = dateTimeZone1.getStandardOffset((long) (byte) 0);
        boolean boolean15 = dateTimeZone1.isStandardOffset((long) 25200000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "4) test0018(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
// flaky "4) test0018(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570084924100L) + "'", long11 == (-1570084924100L));
// flaky "3) test0018(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = false; // flaky "5) test0019(org.joda.time.RegressionTest0)": dateTimeZone3.isLocalDateTimeGap(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "5) test0019(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "4) test0019(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
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
        java.lang.String str16 = dateTimeZone3.toString();
        java.util.TimeZone timeZone17 = dateTimeZone3.toTimeZone();
        java.lang.String str18 = dateTimeZone3.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "6) test0020(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "6) test0020(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "5) test0020(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "2) test0020(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
// flaky "1) test0020(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
// flaky "1) test0020(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone17);
// flaky "1) test0020(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
// flaky "1) test0020(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.convertUTCToLocal(0L);
        java.lang.Class<?> wildcardClass12 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "7) test0021(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "7) test0021(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "6) test0021(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
// flaky "3) test0021(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
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
        java.lang.String str16 = dateTimeZone3.toString();
        java.util.TimeZone timeZone17 = dateTimeZone3.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
// flaky "8) test0022(org.joda.time.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.100' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "8) test0022(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "7) test0022(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "4) test0022(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
// flaky "2) test0022(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
// flaky "2) test0022(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
// flaky "2) test0022(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone17);
// flaky "2) test0022(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = false; // flaky "9) test0023(org.joda.time.RegressionTest0)": dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        int int5 = dateTimeZone1.getStandardOffset((long) (short) 0);
        int int7 = dateTimeZone1.getOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "9) test0023(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
// flaky "8) test0023(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC(25200000L, true, 100L);
        int int10 = dateTimeZone1.getOffsetFromLocal(1L);
        java.lang.Class<?> wildcardClass11 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "10) test0024(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
// flaky "10) test0024(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
// flaky "9) test0024(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-10800000L) + "'", long8 == (-10800000L));
// flaky "5) test0024(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36000000 + "'", int10 == 36000000);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Class<?> wildcardClass3 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(115800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
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
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 25200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 25200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Class<?> wildcardClass10 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "11) test0028(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.lang.String str7 = dateTimeZone1.getName((long) (byte) 10);
        boolean boolean9 = dateTimeZone1.isStandardOffset(1L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "12) test0029(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.100" + "'", str7, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (short) 1);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, 115800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(25200000, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) false);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((long) 100, locale12);
        long long15 = dateTimeZone1.convertUTCToLocal((-1570084924101L));
        java.lang.String str16 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "13) test0034(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "11) test0034(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
// flaky "10) test0034(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924001L) + "'", long15 == (-1570084924001L));
// flaky "6) test0034(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        long long7 = dateTimeZone1.convertUTCToLocal(0L);
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 36000000L + "'", long7 == 36000000L);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffsetFromLocal(25199999L);
        int int5 = dateTimeZone1.getOffsetFromLocal((long) '4');
        java.lang.Class<?> wildcardClass6 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36000000 + "'", int3 == 36000000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36000000 + "'", int5 == 36000000);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(25200000, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
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
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        long long6 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        java.lang.Class<?> wildcardClass7 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-36000001L) + "'", long6 == (-36000001L));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.getID();
        long long3 = dateTimeZone0.previousTransition((long) 10);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "+10:00" + "'", str1, "+10:00");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long5 = dateTimeZone1.nextTransition(115800000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "14) test0041(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115800000L + "'", long5 == 115800000L);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(36000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '-00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
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
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.convertUTCToLocal(0L);
        boolean boolean13 = dateTimeZone3.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone14 = dateTimeZone3.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '-00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (byte) 1, false);
        java.lang.String str7 = dateTimeZone1.getName(97L);
        java.lang.String str9 = dateTimeZone1.getNameKey(0L);
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
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
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 349800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 349800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        java.lang.Object obj5 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.Object obj3 = dateTimeZone1.writeReplace();
        int int5 = dateTimeZone1.getOffset((long) (short) -1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) 36000000);
        java.lang.Class<?> wildcardClass8 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(349800000, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        long long7 = dateTimeZone5.nextTransition((long) (short) 100);
        int int9 = dateTimeZone5.getOffsetFromLocal(100L);
        long long11 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (long) 115800000);
        long long13 = dateTimeZone5.nextTransition(79800000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "15) test0051(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
// flaky "12) test0051(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 79800000L + "'", long13 == 79800000L);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 1);
        boolean boolean9 = dateTimeZone1.isFixed();
        java.lang.Class<?> wildcardClass10 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(349800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
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
        long long15 = dateTimeZone3.convertLocalToUTC(10L, false);
        int int17 = dateTimeZone3.getOffset((-1570084924099L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "16) test0054(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
// flaky "13) test0054(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
// flaky "11) test0054(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-90L) + "'", long15 == (-90L));
// flaky "7) test0054(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.lang.Object obj11 = dateTimeZone1.writeReplace();
        java.lang.Object obj12 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.100' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "17) test0055(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
// flaky "14) test0055(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.getID();
        long long6 = dateTimeZone3.previousTransition((-1L));
        long long10 = dateTimeZone3.convertLocalToUTC(25200000L, true, 100L);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 100L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getShortName((long) (short) 10, locale14);
        java.lang.Class<?> wildcardClass16 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "18) test0056(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
// flaky "15) test0056(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25199900L + "'", long10 == 25199900L);
// flaky "12) test0056(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 187200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 187200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(25200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.Object obj3 = dateTimeZone1.writeReplace();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) false);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((long) 100, locale12);
        long long15 = dateTimeZone1.convertUTCToLocal((-1570084924101L));
        int int17 = dateTimeZone1.getOffsetFromLocal((-1570084924001L));
        int int19 = dateTimeZone1.getOffsetFromLocal(25200001L);
        long long21 = dateTimeZone1.convertUTCToLocal((-1570048924000L));
        java.lang.Class<?> wildcardClass22 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "19) test0060(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "16) test0060(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
// flaky "13) test0060(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924001L) + "'", long15 == (-1570084924001L));
// flaky "8) test0060(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
// flaky "3) test0060(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
// flaky "3) test0060(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1570048923900L) + "'", long21 == (-1570048923900L));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str3 = dateTimeZone1.toString();
        long long7 = dateTimeZone1.convertLocalToUTC((-1L), false, (long) 1);
        java.lang.Class<?> wildcardClass8 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "20) test0061(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
// flaky "17) test0061(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.100" + "'", str3, "+00:00:00.100");
// flaky "14) test0061(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-101L) + "'", long7 == (-101L));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str3 = dateTimeZone1.getShortName((-3L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 25200000, true, (long) (short) 10);
        int int8 = dateTimeZone1.getStandardOffset(115799900L);
        java.lang.String str10 = dateTimeZone1.getShortName(110L);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 25199999L + "'", long6 == 25199999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+52:01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+52:01\" is malformed at \"52:01\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.lang.Class<?> wildcardClass9 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "21) test0066(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj6);
// flaky "18) test0066(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(187200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.getID();
        long long6 = dateTimeZone3.previousTransition((-1L));
        long long10 = dateTimeZone3.convertLocalToUTC(25200000L, true, 100L);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 100L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getShortName((long) (short) 10, locale14);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long20 = dateTimeZone17.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone17);
        boolean boolean22 = dateTimeZone17.isFixed();
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        java.lang.String str25 = dateTimeZone24.getID();
        long long27 = dateTimeZone24.previousTransition((-1L));
        boolean boolean29 = dateTimeZone24.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone24.getName((long) (short) 0, locale31);
        long long34 = dateTimeZone24.nextTransition((long) ' ');
        int int36 = dateTimeZone24.getStandardOffset(115799900L);
        long long38 = dateTimeZone17.getMillisKeepLocal(dateTimeZone24, 110L);
        long long40 = dateTimeZone1.getMillisKeepLocal(dateTimeZone24, (long) ' ');
        long long44 = dateTimeZone1.convertLocalToUTC((-1570084924100L), true, (-1570084924202L));
        int int46 = dateTimeZone1.getStandardOffset(25200001L);
        java.lang.String str47 = dateTimeZone1.getID();
        long long50 = dateTimeZone1.convertLocalToUTC(115799901L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "22) test0068(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
// flaky "19) test0068(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25199900L + "'", long10 == 25199900L);
// flaky "15) test0068(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-99L) + "'", long20 == (-99L));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.100" + "'", str32, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 32L + "'", long34 == 32L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 110L + "'", long38 == 110L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-67L) + "'", long40 == (-67L));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1570084924101L) + "'", long44 == (-1570084924101L));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:00:00.001" + "'", str47, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 115799900L + "'", long50 == 115799900L);
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
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) false);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((long) 100, locale12);
        long long15 = dateTimeZone1.convertUTCToLocal((-1570084924101L));
        int int17 = dateTimeZone1.getOffsetFromLocal((-1570084924001L));
        int int19 = dateTimeZone1.getOffsetFromLocal(25200001L);
        java.lang.String str20 = dateTimeZone1.getID();
        java.lang.String str22 = dateTimeZone1.getShortName(0L);
        java.util.TimeZone timeZone23 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.100' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924001L) + "'", long15 == (-1570084924001L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.convertUTCToLocal(0L);
        boolean boolean13 = dateTimeZone3.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone14 = dateTimeZone3.toTimeZone();
        int int16 = dateTimeZone3.getOffsetFromLocal((long) ' ');
        long long19 = dateTimeZone3.convertLocalToUTC((long) 187200000, true);
        java.lang.Class<?> wildcardClass20 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 187199900L + "'", long19 == 187199900L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 0, locale8);
        long long11 = dateTimeZone1.nextTransition((long) ' ');
        long long15 = dateTimeZone1.convertLocalToUTC((long) '4', false, 115799900L);
        long long19 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 36000000L);
        java.lang.Object obj20 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-48L) + "'", long15 == (-48L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-101L) + "'", long19 == (-101L));
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        boolean boolean8 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.100' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
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
        java.lang.String str17 = dateTimeZone3.getNameKey(115799900L);
        boolean boolean19 = dateTimeZone3.isStandardOffset(110L);
        java.lang.String str20 = dateTimeZone3.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        int int8 = dateTimeZone1.getStandardOffset(0L);
        long long12 = dateTimeZone1.convertLocalToUTC(111L, false, 25199999L);
        long long16 = dateTimeZone1.convertLocalToUTC(25199999L, false, (-48L));
        java.lang.String str18 = dateTimeZone1.getNameKey((-90L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 112L + "'", long12 == 112L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 25200000L + "'", long16 == 25200000L);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        long long8 = dateTimeZone4.getMillisKeepLocal(dateTimeZone6, (long) 'a');
        int int10 = dateTimeZone6.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone11 = dateTimeZone6.toTimeZone();
        java.util.TimeZone timeZone12 = dateTimeZone6.toTimeZone();
        long long14 = dateTimeZone6.nextTransition((long) (short) -1);
        long long16 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, 110L);
        java.lang.Class<?> wildcardClass17 = dateTimeZone6.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 110L + "'", long16 == 110L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        long long5 = dateTimeZone1.convertLocalToUTC((long) 25200000, false, (long) (-1));
        java.lang.Class<?> wildcardClass6 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25199948L + "'", long5 == 25199948L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        long long5 = dateTimeZone1.convertLocalToUTC((-1570084924102L), false);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1570084924202L) + "'", long5 == (-1570084924202L));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        java.lang.String str10 = dateTimeZone1.getName((long) '#');
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((-35999948L), locale12);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getName(25200001L, locale15);
        java.lang.Class<?> wildcardClass17 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '4');
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        int int6 = dateTimeZone1.getOffset((long) 115800000);
        int int8 = dateTimeZone1.getStandardOffset((long) 10);
        java.lang.String str9 = dateTimeZone1.getID();
        long long11 = dateTimeZone1.previousTransition((-1570084924000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570084924000L) + "'", long11 == (-1570084924000L));
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        java.lang.String str3 = dateTimeZone2.toString();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone2.getName((-35999899L), locale5);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+01:00" + "'", str3, "+01:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+01:00" + "'", str6, "+01:00");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        java.lang.Object obj5 = dateTimeZone1.writeReplace();
        java.lang.Class<?> wildcardClass6 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "23) test0083(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        java.lang.Class<?> wildcardClass8 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "24) test0084(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky "20) test0084(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '4');
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        long long5 = dateTimeZone1.convertUTCToLocal((-101L));
        java.lang.Class<?> wildcardClass6 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 187200000 + "'", int3 == 187200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 187199899L + "'", long5 == 187199899L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+32:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+32:00\" is malformed at \"32:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.nextTransition((long) 1);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long17 = dateTimeZone13.getMillisKeepLocal(dateTimeZone15, (long) 'a');
        boolean boolean18 = dateTimeZone13.isFixed();
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone13.getShortName((long) '4', locale20);
        long long23 = dateTimeZone3.getMillisKeepLocal(dateTimeZone13, 2L);
        java.lang.String str24 = dateTimeZone13.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 2L + "'", long23 == 2L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(349800000, 36600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 36600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getShortName(25200001L);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((-199L), locale8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.Object obj3 = dateTimeZone1.writeReplace();
        int int5 = dateTimeZone1.getOffset((long) (short) -1);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '-00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int4 = dateTimeZone2.getStandardOffset((long) 10);
        long long6 = dateTimeZone2.previousTransition((long) (-1));
        java.lang.Class<?> wildcardClass7 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        int int4 = dateTimeZone1.getStandardOffset((-10800000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
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
        java.lang.String str16 = dateTimeZone3.toString();
        java.util.TimeZone timeZone17 = dateTimeZone3.toTimeZone();
        java.lang.String str18 = dateTimeZone3.toString();
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        long long22 = dateTimeZone20.nextTransition((long) (short) 100);
        int int24 = dateTimeZone20.getOffsetFromLocal(100L);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone20.getName((-99L), locale26);
        long long29 = dateTimeZone3.getMillisKeepLocal(dateTimeZone20, 10L);
        boolean boolean31 = dateTimeZone20.isStandardOffset((-1570084924102L));
        int int33 = dateTimeZone20.getOffset((-48L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long5 = dateTimeZone1.convertLocalToUTC(25199999L, false, 0L);
        long long7 = dateTimeZone1.nextTransition(115799800L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25199999L + "'", long5 == 25199999L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 115799800L + "'", long7 == 115799800L);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 'a');
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone6.getName((long) (short) 1, locale12);
        boolean boolean15 = dateTimeZone6.equals((java.lang.Object) false);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone6.getName((long) 100, locale17);
        long long20 = dateTimeZone6.convertUTCToLocal((-1570084924101L));
        int int22 = dateTimeZone6.getOffsetFromLocal((-1570084924001L));
        int int24 = dateTimeZone6.getOffsetFromLocal(25200001L);
        long long26 = dateTimeZone6.convertUTCToLocal((-1570048924000L));
        long long28 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, 25199999L);
        org.joda.time.ReadableInstant readableInstant29 = null;
        int int30 = dateTimeZone6.getOffset(readableInstant29);
        java.util.TimeZone timeZone31 = dateTimeZone6.toTimeZone();
        long long33 = dateTimeZone6.nextTransition((long) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1570084924001L) + "'", long20 == (-1570084924001L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1570048923900L) + "'", long26 == (-1570048923900L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 25199999L + "'", long28 == 25199999L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.getID();
        long long6 = dateTimeZone3.previousTransition((-1L));
        long long10 = dateTimeZone3.convertLocalToUTC(25200000L, true, 100L);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 100L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getShortName((long) (short) 10, locale14);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long20 = dateTimeZone17.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone17);
        boolean boolean22 = dateTimeZone17.isFixed();
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        java.lang.String str25 = dateTimeZone24.getID();
        long long27 = dateTimeZone24.previousTransition((-1L));
        boolean boolean29 = dateTimeZone24.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone24.getName((long) (short) 0, locale31);
        long long34 = dateTimeZone24.nextTransition((long) ' ');
        int int36 = dateTimeZone24.getStandardOffset(115799900L);
        long long38 = dateTimeZone17.getMillisKeepLocal(dateTimeZone24, 110L);
        long long40 = dateTimeZone1.getMillisKeepLocal(dateTimeZone24, (long) ' ');
        java.lang.String str42 = dateTimeZone24.getShortName((-35999999L));
        java.lang.Class<?> wildcardClass43 = dateTimeZone24.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25199900L + "'", long10 == 25199900L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-99L) + "'", long20 == (-99L));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.100" + "'", str32, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 32L + "'", long34 == 32L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 110L + "'", long38 == 110L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-67L) + "'", long40 == (-67L));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00:00.100" + "'", str42, "+00:00:00.100");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        int int8 = dateTimeZone1.getOffsetFromLocal((long) 25200000);
        boolean boolean10 = dateTimeZone1.isStandardOffset(52L);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.100' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        java.lang.String str12 = dateTimeZone1.getName((long) 'a');
        int int14 = dateTimeZone1.getStandardOffset((-98L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
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
        java.lang.Class<?> wildcardClass24 = dateTimeZone13.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "25) test0099(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
// flaky "21) test0099(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(timeZone18);
// flaky "16) test0099(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone19);
// flaky "9) test0099(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "4) test0099(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone1.getOffset(readableInstant3);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'a');
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((long) 25200000);
        int int4 = dateTimeZone0.getOffset(98L);
        java.lang.String str5 = dateTimeZone0.toString();
        int int7 = dateTimeZone0.getOffsetFromLocal((long) 187200000);
        java.lang.String str9 = dateTimeZone0.getNameKey(10799998L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone1.getOffset(readableInstant3);
        boolean boolean5 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        int int4 = dateTimeZone1.getOffsetFromLocal(99L);
        long long6 = dateTimeZone1.previousTransition((-101L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-101L) + "'", long6 == (-101L));
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        int int10 = dateTimeZone1.getOffset((long) (short) 1);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((-1570084924202L), locale12);
        long long15 = dateTimeZone1.convertUTCToLocal((-1570084924201L));
        int int17 = dateTimeZone1.getStandardOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 360000000 + "'", int8 == 360000000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 360000000 + "'", int10 == 360000000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:00" + "'", str13, "+100:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1569724924201L) + "'", long15 == (-1569724924201L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 360000000 + "'", int17 == 360000000);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.Object obj3 = dateTimeZone1.writeReplace();
        int int5 = dateTimeZone1.getOffsetFromLocal((long) (short) 10);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '-00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        long long6 = dateTimeZone1.adjustOffset((long) ' ', true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
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
        java.lang.Class<?> wildcardClass24 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "26) test0109(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.052" + "'", str8, "+00:00:00.052");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
// flaky "22) test0109(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(timeZone18);
// flaky "17) test0109(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
// flaky "10) test0109(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
// flaky "5) test0109(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 52L + "'", long21 == 52L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(35, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        long long7 = dateTimeZone1.convertUTCToLocal(0L);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName((-1570084924201L), locale9);
        long long12 = dateTimeZone1.previousTransition(0L);
        java.lang.Class<?> wildcardClass13 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "27) test0111(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
// flaky "23) test0111(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.adjustOffset((-68L), true);
        java.lang.Class<?> wildcardClass4 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-68L) + "'", long3 == (-68L));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
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
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone13.getName((-1570048924101L), locale25);
        java.lang.Class<?> wildcardClass27 = dateTimeZone13.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "28) test0113(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
// flaky "24) test0113(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(timeZone18);
// flaky "18) test0113(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
// flaky "11) test0113(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
// flaky "6) test0113(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
// flaky "4) test0113(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-00:00:00.001" + "'", str26, "-00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        boolean boolean9 = dateTimeZone1.isFixed();
        long long11 = dateTimeZone1.nextTransition((-1570084924201L));
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone1.getOffset(readableInstant12);
        java.lang.Class<?> wildcardClass14 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "29) test0115(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky "25) test0115(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570084924201L) + "'", long11 == (-1570084924201L));
// flaky "19) test0115(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        java.lang.String str10 = dateTimeZone1.getShortName(25199900L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj13 = dateTimeZone12.writeReplace();
        long long17 = dateTimeZone12.convertLocalToUTC((long) 25200000, true, (long) (short) 10);
        int int19 = dateTimeZone12.getStandardOffset(115799900L);
        long long21 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, (-25200001L));
        int int23 = dateTimeZone1.getOffsetFromLocal((-47L));
        long long25 = dateTimeZone1.convertUTCToLocal(35999900L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "30) test0116(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
// flaky "26) test0116(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 25199999L + "'", long17 == 25199999L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
// flaky "20) test0116(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-25200003L) + "'", long21 == (-25200003L));
// flaky "12) test0116(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
// flaky "7) test0116(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 35999899L + "'", long25 == 35999899L);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.getID();
        long long3 = dateTimeZone0.previousTransition(32L);
        long long5 = dateTimeZone0.nextTransition(36L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "31) test0117(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-00:00:00.001" + "'", str1, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 36L + "'", long5 == 36L);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 0, locale8);
        long long11 = dateTimeZone1.nextTransition((long) ' ');
        long long15 = dateTimeZone1.convertLocalToUTC((long) '4', false, 115799900L);
        long long19 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 36000000L);
        java.lang.String str21 = dateTimeZone1.getNameKey((long) (short) -1);
        java.lang.String str23 = dateTimeZone1.getNameKey((long) (short) -1);
        java.lang.Class<?> wildcardClass24 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "32) test0118(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "27) test0118(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky "21) test0118(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 53L + "'", long15 == 53L);
// flaky "13) test0118(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        long long8 = dateTimeZone6.nextTransition((long) 36000000);
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (-35999945L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 36000000L + "'", long8 == 36000000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-35999979L) + "'", long10 == (-35999979L));
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(115800000, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str3 = dateTimeZone1.getID();
        java.lang.String str4 = dateTimeZone1.getID();
        boolean boolean5 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+10:00" + "'", str3, "+10:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+10:00" + "'", str4, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        int int8 = dateTimeZone1.getOffsetFromLocal((long) 25200000);
        boolean boolean10 = dateTimeZone1.isStandardOffset(52L);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36000000 + "'", int8 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+10:00");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        long long5 = dateTimeZone1.convertLocalToUTC((long) 25200000, false, (long) (-1));
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        long long11 = dateTimeZone7.getMillisKeepLocal(dateTimeZone9, (long) 'a');
        int int13 = dateTimeZone9.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone14 = dateTimeZone9.toTimeZone();
        java.util.TimeZone timeZone15 = dateTimeZone9.toTimeZone();
        java.lang.String str17 = dateTimeZone9.getName(102L);
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, 3L);
        java.lang.String str21 = dateTimeZone9.getName(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25199948L + "'", long5 == 25199948L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36000000 + "'", int13 == 36000000);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+10:00" + "'", str17, "+10:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-35999945L) + "'", long19 == (-35999945L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+10:00" + "'", str21, "+10:00");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
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
        java.lang.Class<?> wildcardClass15 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        boolean boolean3 = dateTimeZone1.isFixed();
        java.lang.Object obj4 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.lang.String str5 = dateTimeZone1.toString();
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        int int8 = dateTimeZone1.getOffsetFromLocal((long) 25200000);
        int int10 = dateTimeZone1.getOffsetFromLocal((-47L));
        java.lang.Class<?> wildcardClass11 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "33) test0127(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "28) test0127(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
// flaky "22) test0127(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        int int8 = dateTimeZone1.getStandardOffset(0L);
        long long12 = dateTimeZone1.convertLocalToUTC(111L, false, 25199999L);
        long long16 = dateTimeZone1.convertLocalToUTC(25199999L, false, (-48L));
        int int18 = dateTimeZone1.getOffsetFromLocal((long) (short) 100);
        java.lang.Class<?> wildcardClass19 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 112L + "'", long12 == 112L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 25200000L + "'", long16 == 25200000L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        java.lang.String str3 = dateTimeZone1.getShortName(32L);
        int int5 = dateTimeZone1.getStandardOffset((long) '#');
        boolean boolean7 = dateTimeZone1.isStandardOffset((-91L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        java.lang.String str5 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        long long10 = dateTimeZone1.convertLocalToUTC((-25199902L), false);
        java.lang.String str11 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-25199901L) + "'", long10 == (-25199901L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.Object obj3 = dateTimeZone1.writeReplace();
        int int5 = dateTimeZone1.getOffsetFromLocal((long) (short) 10);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        long long9 = dateTimeZone1.adjustOffset((-1570084923900L), true);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getShortName((-1570048924000L), locale11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1570084923900L) + "'", long9 == (-1570084923900L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.getID();
        long long6 = dateTimeZone3.previousTransition((-1L));
        long long10 = dateTimeZone3.convertLocalToUTC(25200000L, true, 100L);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 100L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        long long16 = dateTimeZone1.getMillisKeepLocal(dateTimeZone14, 97L);
        long long18 = dateTimeZone14.previousTransition((-360000068L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "34) test0134(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
// flaky "29) test0134(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25199900L + "'", long10 == 25199900L);
// flaky "23) test0134(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-3599902L) + "'", long16 == (-3599902L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-360000068L) + "'", long18 == (-360000068L));
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
        java.lang.String str17 = dateTimeZone3.getNameKey(115799900L);
        java.lang.String str19 = dateTimeZone3.getName((long) '4');
        boolean boolean21 = dateTimeZone3.isStandardOffset(97L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        int int24 = dateTimeZone3.getOffset((-10800100L));
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        int int28 = dateTimeZone26.getOffsetFromLocal(25199999L);
        int int30 = dateTimeZone26.getOffsetFromLocal((long) '4');
        long long32 = dateTimeZone3.getMillisKeepLocal(dateTimeZone26, (-115799900L));
        java.lang.String str34 = dateTimeZone3.getShortName(25199948L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "35) test0135(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "30) test0135(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "24) test0135(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
// flaky "14) test0135(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
// flaky "8) test0135(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertNull(str17);
// flaky "5) test0135(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
// flaky "3) test0135(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(dateTimeZone26);
// flaky "3) test0135(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
// flaky "1) test0135(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-115799900L) + "'", long32 == (-115799900L));
// flaky "1) test0135(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.100" + "'", str34, "+00:00:00.100");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int4 = dateTimeZone2.getOffset(101L);
        long long6 = dateTimeZone2.nextTransition((-191L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-191L) + "'", long6 == (-191L));
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        boolean boolean9 = dateTimeZone1.isFixed();
        long long11 = dateTimeZone1.nextTransition((-1570084924201L));
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone1.getOffset(readableInstant12);
        long long16 = dateTimeZone1.convertLocalToUTC((-1570048924001L), true);
        java.util.TimeZone timeZone17 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "36) test0137(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
// flaky "31) test0137(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570084924201L) + "'", long11 == (-1570084924201L));
// flaky "25) test0137(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
// flaky "15) test0137(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1570048924101L) + "'", long16 == (-1570048924101L));
        org.junit.Assert.assertNotNull(timeZone17);
// flaky "9) test0137(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
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
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getShortName((long) (short) 0, locale13);
        java.lang.String str15 = dateTimeZone3.getID();
        java.lang.String str17 = dateTimeZone3.getNameKey(115799900L);
        java.lang.String str19 = dateTimeZone3.getName((long) '4');
        boolean boolean21 = dateTimeZone3.isStandardOffset(97L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        int int24 = dateTimeZone3.getOffset((-10800100L));
        java.lang.String str25 = dateTimeZone3.getID();
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone3.getShortName((-25200000L), locale27);
        java.lang.String str29 = dateTimeZone3.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "37) test0138(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "32) test0138(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "26) test0138(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "16) test0138(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
// flaky "10) test0138(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertNull(str17);
// flaky "6) test0138(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
// flaky "4) test0138(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
// flaky "4) test0138(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-00:00:00.001" + "'", str25, "-00:00:00.001");
// flaky "2) test0138(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-00:00:00.001" + "'", str28, "-00:00:00.001");
// flaky "2) test0138(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-00:00:00.001" + "'", str29, "-00:00:00.001");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 349800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 349800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.getID();
        long long6 = dateTimeZone3.previousTransition((-1L));
        long long10 = dateTimeZone3.convertLocalToUTC(25200000L, true, 100L);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 100L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getShortName((long) (short) 10, locale14);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long20 = dateTimeZone17.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone17);
        boolean boolean22 = dateTimeZone17.isFixed();
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        java.lang.String str25 = dateTimeZone24.getID();
        long long27 = dateTimeZone24.previousTransition((-1L));
        boolean boolean29 = dateTimeZone24.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone24.getName((long) (short) 0, locale31);
        long long34 = dateTimeZone24.nextTransition((long) ' ');
        int int36 = dateTimeZone24.getStandardOffset(115799900L);
        long long38 = dateTimeZone17.getMillisKeepLocal(dateTimeZone24, 110L);
        long long40 = dateTimeZone1.getMillisKeepLocal(dateTimeZone24, (long) ' ');
        java.util.TimeZone timeZone41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        java.util.TimeZone timeZone43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        long long46 = dateTimeZone42.getMillisKeepLocal(dateTimeZone44, (long) 'a');
        int int48 = dateTimeZone44.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone49 = dateTimeZone44.toTimeZone();
        java.util.TimeZone timeZone50 = dateTimeZone44.toTimeZone();
        java.util.Locale locale52 = null;
        java.lang.String str53 = dateTimeZone44.getName((long) (short) 10, locale52);
        int int55 = dateTimeZone44.getOffsetFromLocal((long) (byte) 1);
        int int57 = dateTimeZone44.getStandardOffset((long) 115800000);
        boolean boolean59 = dateTimeZone44.isStandardOffset((-99L));
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        long long63 = dateTimeZone44.getMillisKeepLocal(dateTimeZone61, 3L);
        boolean boolean64 = dateTimeZone24.equals((java.lang.Object) 3L);
        java.util.Locale locale66 = null;
        java.lang.String str67 = dateTimeZone24.getShortName((-199L), locale66);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "38) test0140(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
// flaky "33) test0140(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25200001L + "'", long10 == 25200001L);
// flaky "27) test0140(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 102L + "'", long12 == 102L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-99L) + "'", long20 == (-99L));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.100" + "'", str32, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 32L + "'", long34 == 32L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 110L + "'", long38 == 110L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-67L) + "'", long40 == (-67L));
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 97L + "'", long46 == 97L);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone50);
        org.junit.Assert.assertEquals(timeZone50.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "+00:00:00.100" + "'", str53, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-35999897L) + "'", long63 == (-35999897L));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "+00:00:00.100" + "'", str67, "+00:00:00.100");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        long long5 = dateTimeZone1.convertLocalToUTC((-1570084924102L), false);
        long long7 = dateTimeZone1.convertUTCToLocal((-35999990L));
        java.lang.Class<?> wildcardClass8 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1570084924202L) + "'", long5 == (-1570084924202L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-35999890L) + "'", long7 == (-35999890L));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC(25200000L, true, 100L);
        int int10 = dateTimeZone1.getOffsetFromLocal(1L);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getShortName(0L, locale12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25199900L + "'", long8 == 25199900L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(36000000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 10);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        java.lang.String str5 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+100:10" + "'", str5, "+100:10");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360000000, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.getID();
        long long6 = dateTimeZone3.previousTransition((-1L));
        long long10 = dateTimeZone3.convertLocalToUTC(25200000L, true, 100L);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 100L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getShortName((long) (short) 10, locale14);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long20 = dateTimeZone17.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone17);
        boolean boolean22 = dateTimeZone17.isFixed();
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        java.lang.String str25 = dateTimeZone24.getID();
        long long27 = dateTimeZone24.previousTransition((-1L));
        boolean boolean29 = dateTimeZone24.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone24.getName((long) (short) 0, locale31);
        long long34 = dateTimeZone24.nextTransition((long) ' ');
        int int36 = dateTimeZone24.getStandardOffset(115799900L);
        long long38 = dateTimeZone17.getMillisKeepLocal(dateTimeZone24, 110L);
        long long40 = dateTimeZone1.getMillisKeepLocal(dateTimeZone24, (long) ' ');
        long long42 = dateTimeZone1.convertUTCToLocal((long) 1);
        long long44 = dateTimeZone1.previousTransition((-1570084924199L));
        long long47 = dateTimeZone1.adjustOffset(211L, true);
        java.lang.String str48 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25199900L + "'", long10 == 25199900L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-99L) + "'", long20 == (-99L));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.100" + "'", str32, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 32L + "'", long34 == 32L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 110L + "'", long38 == 110L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-67L) + "'", long40 == (-67L));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 2L + "'", long42 == 2L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1570084924199L) + "'", long44 == (-1570084924199L));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 211L + "'", long47 == 211L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:00:00.001" + "'", str48, "+00:00:00.001");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.lang.Object obj11 = dateTimeZone1.writeReplace();
        java.lang.Object obj12 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        long long18 = dateTimeZone14.getMillisKeepLocal(dateTimeZone16, (long) 'a');
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone14.getName((long) (short) 1, locale20);
        boolean boolean22 = dateTimeZone1.equals((java.lang.Object) dateTimeZone14);
        java.lang.String str23 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.100" + "'", str23, "+00:00:00.100");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.lang.String str10 = dateTimeZone3.getNameKey(52L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        java.lang.String str10 = dateTimeZone1.getName((long) '#');
        java.lang.String str11 = dateTimeZone1.getID();
        long long14 = dateTimeZone1.adjustOffset(25199948L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 25199948L + "'", long14 == 25199948L);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        int int8 = dateTimeZone1.getStandardOffset(0L);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        long long14 = dateTimeZone10.getMillisKeepLocal(dateTimeZone12, (long) 'a');
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone10.getName((long) (short) 1, locale16);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        java.lang.String str19 = dateTimeZone10.getID();
        boolean boolean20 = dateTimeZone1.equals((java.lang.Object) str19);
        long long24 = dateTimeZone1.convertLocalToUTC(98L, false, 100L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
// flaky "39) test0150(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
// flaky "34) test0150(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 99L + "'", long24 == 99L);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long5 = dateTimeZone1.convertLocalToUTC(25199999L, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        long long11 = dateTimeZone7.adjustOffset((long) (byte) 1, false);
        java.lang.String str13 = dateTimeZone7.getName(97L);
        java.lang.String str15 = dateTimeZone7.getNameKey(0L);
        long long17 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (-1570084924101L));
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone7.isLocalDateTimeGap(localDateTime18);
        int int21 = dateTimeZone7.getOffsetFromLocal((-1570200724100L));
        int int23 = dateTimeZone7.getStandardOffset((-1570048923899L));
        java.lang.Class<?> wildcardClass24 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25199999L + "'", long5 == 25199999L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1570084924102L) + "'", long17 == (-1570084924102L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, true);
        java.lang.String str6 = dateTimeZone1.getShortName((-25200001L));
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        java.lang.String str9 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        long long8 = dateTimeZone1.convertUTCToLocal((-3599902L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3599802L) + "'", long8 == (-3599802L));
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36000000, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.lang.Object obj11 = dateTimeZone1.writeReplace();
        java.lang.Class<?> wildcardClass12 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "40) test0155(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36000000 + "'", int5 == 36000000);
// flaky "35) test0155(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:00" + "'", str8, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        long long5 = dateTimeZone1.convertLocalToUTC((-1570084924102L), false);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        java.lang.String str8 = dateTimeZone1.getNameKey((-48L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "41) test0156(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
// flaky "36) test0156(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1570120924102L) + "'", long5 == (-1570120924102L));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) (byte) 0);
        java.lang.String str5 = dateTimeZone1.getName((-2L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.010" + "'", str5, "+00:00:00.010");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        long long7 = dateTimeZone1.previousTransition((long) (short) 10);
        long long10 = dateTimeZone1.convertLocalToUTC((-1570084924099L), false);
        java.lang.String str12 = dateTimeZone1.getShortName((long) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1570084924199L) + "'", long10 == (-1570084924199L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int4 = dateTimeZone2.getStandardOffset((long) 10);
        long long8 = dateTimeZone2.convertLocalToUTC(115800000L, true, 99L);
        java.lang.String str10 = dateTimeZone2.getName((long) 'a');
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone2.getShortName((-1570084924102L), locale12);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:10" + "'", str10, "+32:10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:10" + "'", str13, "+32:10");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(52);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        int int5 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str7 = dateTimeZone1.getName((long) 100);
        java.lang.Object obj8 = dateTimeZone1.writeReplace();
        java.lang.Class<?> wildcardClass9 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.100" + "'", str7, "+00:00:00.100");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
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
        long long11 = dateTimeZone3.convertUTCToLocal(0L);
        int int13 = dateTimeZone3.getOffset((-1570048924001L));
        boolean boolean15 = dateTimeZone3.isStandardOffset((-48L));
        java.util.TimeZone timeZone16 = dateTimeZone3.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.100' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.getID();
        long long6 = dateTimeZone3.previousTransition((-1L));
        long long10 = dateTimeZone3.convertLocalToUTC(25200000L, true, 100L);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 100L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        long long16 = dateTimeZone1.getMillisKeepLocal(dateTimeZone14, 97L);
        long long18 = dateTimeZone14.previousTransition(25199900L);
        java.lang.String str20 = dateTimeZone14.getName((-10800100L));
        java.lang.Class<?> wildcardClass21 = dateTimeZone14.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25199900L + "'", long10 == 25199900L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-3599902L) + "'", long16 == (-3599902L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 25199900L + "'", long18 == 25199900L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+01:00" + "'", str20, "+01:00");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        long long4 = dateTimeZone1.nextTransition(98L);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 'a');
        int int12 = dateTimeZone8.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone13 = dateTimeZone8.toTimeZone();
        java.lang.String str15 = dateTimeZone8.getNameKey((long) 10);
        boolean boolean16 = dateTimeZone1.equals((java.lang.Object) dateTimeZone8);
        java.util.TimeZone timeZone17 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.100' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
// flaky "42) test0165(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNull(str15);
// flaky "37) test0165(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        int int10 = dateTimeZone1.getOffset(52L);
        boolean boolean11 = dateTimeZone1.isFixed();
        java.lang.Class<?> wildcardClass12 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "43) test0166(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
// flaky "38) test0166(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) false);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((long) 100, locale12);
        long long15 = dateTimeZone1.convertUTCToLocal((-1570084924101L));
        int int17 = dateTimeZone1.getOffsetFromLocal((-1570084924001L));
        int int19 = dateTimeZone1.getOffsetFromLocal(25200001L);
        java.lang.String str20 = dateTimeZone1.getID();
        long long22 = dateTimeZone1.nextTransition((-91L));
        java.lang.Class<?> wildcardClass23 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924001L) + "'", long15 == (-1570084924001L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-91L) + "'", long22 == (-91L));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        int int10 = dateTimeZone1.getStandardOffset(98L);
        boolean boolean12 = dateTimeZone1.isStandardOffset(99L);
        java.lang.Class<?> wildcardClass13 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(349800000, 360000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 360000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        int int8 = dateTimeZone1.getStandardOffset((-25200002L));
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.100' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        boolean boolean8 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        long long13 = dateTimeZone1.convertLocalToUTC(3L, false, 35999900L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-97L) + "'", long13 == (-97L));
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.convertUTCToLocal(0L);
        int int13 = dateTimeZone3.getOffset((-1570048924001L));
        boolean boolean15 = dateTimeZone3.isStandardOffset((-48L));
        boolean boolean16 = dateTimeZone3.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
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
        int int17 = dateTimeZone3.getOffsetFromLocal(25200000L);
        long long19 = dateTimeZone3.previousTransition((long) (short) -1);
        java.lang.String str20 = dateTimeZone3.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        long long10 = dateTimeZone1.convertLocalToUTC((-25199902L), true, (-35999990L));
        long long14 = dateTimeZone1.convertLocalToUTC((-115799965L), false, (-35999801L));
        boolean boolean15 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-25200002L) + "'", long10 == (-25200002L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115800065L) + "'", long14 == (-115800065L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        int int4 = dateTimeZone1.getOffset((-36000001L));
        long long6 = dateTimeZone1.nextTransition((-10800000L));
        long long9 = dateTimeZone1.adjustOffset(115800000L, false);
        int int11 = dateTimeZone1.getOffsetFromLocal((-1570048923899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-10800000L) + "'", long6 == (-10800000L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 115800000L + "'", long9 == 115800000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int4 = dateTimeZone2.getStandardOffset((long) 10);
        long long8 = dateTimeZone2.convertLocalToUTC(115800000L, true, 99L);
        java.lang.String str10 = dateTimeZone2.getName((long) 'a');
        java.util.TimeZone timeZone11 = dateTimeZone2.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:10" + "'", str10, "+32:10");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        long long7 = dateTimeZone5.nextTransition((long) (short) 100);
        int int9 = dateTimeZone5.getOffsetFromLocal(100L);
        long long11 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (long) 115800000);
        long long13 = dateTimeZone5.previousTransition((-1570084924000L));
        java.lang.String str14 = dateTimeZone5.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1570084924000L) + "'", long13 == (-1570084924000L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 'a');
        java.lang.String str13 = dateTimeZone1.getID();
        java.lang.Object obj14 = dateTimeZone1.writeReplace();
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone1.getShortName((long) '4', locale16);
        long long20 = dateTimeZone1.adjustOffset((-200L), true);
        boolean boolean21 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-200L) + "'", long20 == (-200L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
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
        long long14 = dateTimeZone3.convertUTCToLocal((-115800065L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115799965L) + "'", long14 == (-115799965L));
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.getID();
        long long6 = dateTimeZone3.previousTransition((-1L));
        long long10 = dateTimeZone3.convertLocalToUTC(25200000L, true, 100L);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 100L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getShortName((long) (short) 10, locale14);
        boolean boolean17 = dateTimeZone1.isStandardOffset(25200001L);
        java.util.TimeZone timeZone18 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25199900L + "'", long10 == 25199900L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(3600000, 115800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 'a');
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone6.getName((long) (short) 1, locale12);
        boolean boolean15 = dateTimeZone6.equals((java.lang.Object) false);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone6.getName((long) 100, locale17);
        long long20 = dateTimeZone6.convertUTCToLocal((-1570084924101L));
        int int22 = dateTimeZone6.getOffsetFromLocal((-1570084924001L));
        int int24 = dateTimeZone6.getOffsetFromLocal(25200001L);
        long long26 = dateTimeZone6.convertUTCToLocal((-1570048924000L));
        long long28 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, 25199999L);
        long long32 = dateTimeZone6.convertLocalToUTC((-1570048923800L), true, 115799900L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1570084924100L) + "'", long20 == (-1570084924100L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1570048923999L) + "'", long26 == (-1570048923999L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 25199999L + "'", long28 == 25199999L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1570048923801L) + "'", long32 == (-1570048923801L));
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
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
        java.lang.String str16 = dateTimeZone3.toString();
        java.util.TimeZone timeZone17 = dateTimeZone3.toTimeZone();
        java.lang.String str18 = dateTimeZone3.toString();
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        long long22 = dateTimeZone20.nextTransition((long) (short) 100);
        int int24 = dateTimeZone20.getOffsetFromLocal(100L);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone20.getName((-99L), locale26);
        long long29 = dateTimeZone3.getMillisKeepLocal(dateTimeZone20, 10L);
        int int31 = dateTimeZone3.getOffsetFromLocal(98L);
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
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.001" + "'", str27, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long9 = dateTimeZone1.convertLocalToUTC(25199999L, false, 79800000L);
        long long11 = dateTimeZone1.nextTransition((-115799999L));
        long long13 = dateTimeZone1.nextTransition((long) (-1));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 25199899L + "'", long9 == 25199899L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115799999L) + "'", long11 == (-115799999L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
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
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.convertUTCToLocal(0L);
        boolean boolean13 = dateTimeZone3.equals((java.lang.Object) 100);
        long long15 = dateTimeZone3.convertUTCToLocal((long) 10);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        long long19 = dateTimeZone17.nextTransition((long) (short) 100);
        java.lang.String str21 = dateTimeZone17.getNameKey(1L);
        boolean boolean22 = dateTimeZone3.equals((java.lang.Object) str21);
        int int24 = dateTimeZone3.getStandardOffset((-1L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 110L + "'", long15 == 110L);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffsetFromLocal(25199999L);
        long long7 = dateTimeZone1.convertLocalToUTC(98L, true, (long) (-1));
        long long9 = dateTimeZone1.nextTransition((-25200001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-2L) + "'", long7 == (-2L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-25200001L) + "'", long9 == (-25200001L));
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 349800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 349800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        java.lang.String str3 = dateTimeZone1.getShortName((long) (short) 10);
        long long6 = dateTimeZone1.convertLocalToUTC((long) (short) 100, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+01:00" + "'", str3, "+01:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-3599900L) + "'", long6 == (-3599900L));
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 0, locale8);
        long long11 = dateTimeZone1.previousTransition((long) '4');
        int int13 = dateTimeZone1.getStandardOffset((long) 3600000);
        java.lang.Class<?> wildcardClass14 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(349800000, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffsetFromLocal(25199999L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.Object obj3 = dateTimeZone1.writeReplace();
        int int5 = dateTimeZone1.getOffsetFromLocal((long) (short) 10);
        java.lang.String str7 = dateTimeZone1.getShortName((-3600000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360000000, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.lang.Object obj11 = dateTimeZone1.writeReplace();
        java.lang.Object obj12 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        long long19 = dateTimeZone15.getMillisKeepLocal(dateTimeZone17, (long) 'a');
        boolean boolean20 = dateTimeZone15.isFixed();
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone15, (-1570048923900L));
        java.lang.Object obj23 = dateTimeZone1.writeReplace();
        long long27 = dateTimeZone1.convertLocalToUTC((long) 360000000, true, (-39599799L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1570048923900L) + "'", long22 == (-1570048923900L));
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 359999900L + "'", long27 == 359999900L);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.lang.String str9 = dateTimeZone8.getID();
        long long11 = dateTimeZone8.previousTransition((-1L));
        boolean boolean13 = dateTimeZone8.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone8.getName((long) (short) 0, locale15);
        long long18 = dateTimeZone8.nextTransition((long) ' ');
        int int20 = dateTimeZone8.getStandardOffset(115799900L);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, 110L);
        java.lang.String str24 = dateTimeZone1.getNameKey((-98L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 110L + "'", long22 == 110L);
        org.junit.Assert.assertNull(str24);
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
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone3.getName((long) (short) 10, locale11);
        int int14 = dateTimeZone3.getOffsetFromLocal((long) (byte) 1);
        int int16 = dateTimeZone3.getStandardOffset((long) 115800000);
        java.lang.Object obj17 = dateTimeZone3.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
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
        int int14 = dateTimeZone3.getOffsetFromLocal((long) (byte) 1);
        long long16 = dateTimeZone3.convertUTCToLocal((-99L));
        java.util.TimeZone timeZone17 = dateTimeZone3.toTimeZone();
        int int19 = dateTimeZone3.getOffsetFromLocal(0L);
        long long21 = dateTimeZone3.previousTransition(324000002L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 324000002L + "'", long21 == 324000002L);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        long long15 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, (long) 'a');
        int int17 = dateTimeZone13.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone18 = dateTimeZone13.toTimeZone();
        java.util.TimeZone timeZone19 = dateTimeZone13.toTimeZone();
        long long21 = dateTimeZone13.nextTransition((long) (short) -1);
        long long23 = dateTimeZone8.getMillisKeepLocal(dateTimeZone13, 110L);
        long long25 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, (-67L));
        int int27 = dateTimeZone8.getStandardOffset((long) '#');
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone8.getShortName(100L, locale29);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "44) test0204(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
// flaky "39) test0204(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
// flaky "28) test0204(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 209L + "'", long23 == 209L);
// flaky "17) test0204(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-166L) + "'", long25 == (-166L));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.100" + "'", str30, "+00:00:00.100");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        long long7 = dateTimeZone3.getMillisKeepLocal(dateTimeZone5, (long) 'a');
        long long9 = dateTimeZone3.convertUTCToLocal(0L);
        java.util.TimeZone timeZone10 = dateTimeZone3.toTimeZone();
        boolean boolean11 = dateTimeZone1.equals((java.lang.Object) timeZone10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.100' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(10);
        long long3 = dateTimeZone1.nextTransition(25199900L);
        java.lang.String str5 = dateTimeZone1.getNameKey(25200001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 25199900L + "'", long3 == 25199900L);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((long) 25200000);
        int int4 = dateTimeZone0.getOffset(98L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone0.getShortName((-10800000L), locale6);
        int int9 = dateTimeZone0.getStandardOffset(36599900L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        long long3 = dateTimeZone1.previousTransition((long) '4');
        long long5 = dateTimeZone1.convertUTCToLocal(111L);
        int int7 = dateTimeZone1.getOffset((-115800001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 360000111L + "'", long5 == 360000111L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 360000000 + "'", int7 == 360000000);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(187200000, 360000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 360000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long9 = dateTimeZone1.convertLocalToUTC(25199999L, false, 79800000L);
        long long11 = dateTimeZone1.nextTransition((-115799999L));
        java.lang.Object obj12 = dateTimeZone1.writeReplace();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str15 = dateTimeZone1.getNameKey((-39599798L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 25199899L + "'", long9 == 25199899L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115799999L) + "'", long11 == (-115799999L));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 115800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((-35999890L), locale4);
        java.lang.String str6 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str11 = dateTimeZone10.getID();
        long long13 = dateTimeZone10.previousTransition((-1L));
        long long17 = dateTimeZone10.convertLocalToUTC(25200000L, true, 100L);
        long long19 = dateTimeZone8.getMillisKeepLocal(dateTimeZone10, 100L);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone8.getShortName((long) (short) 10, locale21);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long27 = dateTimeZone24.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone24);
        boolean boolean29 = dateTimeZone24.isFixed();
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        java.lang.String str32 = dateTimeZone31.getID();
        long long34 = dateTimeZone31.previousTransition((-1L));
        boolean boolean36 = dateTimeZone31.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale38 = null;
        java.lang.String str39 = dateTimeZone31.getName((long) (short) 0, locale38);
        long long41 = dateTimeZone31.nextTransition((long) ' ');
        int int43 = dateTimeZone31.getStandardOffset(115799900L);
        long long45 = dateTimeZone24.getMillisKeepLocal(dateTimeZone31, 110L);
        long long47 = dateTimeZone8.getMillisKeepLocal(dateTimeZone31, (long) ' ');
        long long49 = dateTimeZone8.convertUTCToLocal((long) 1);
        long long51 = dateTimeZone8.previousTransition((-1570084924199L));
        int int53 = dateTimeZone8.getOffsetFromLocal(79800000L);
        boolean boolean54 = dateTimeZone1.equals((java.lang.Object) 79800000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.032" + "'", str5, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.032" + "'", str6, "+00:00:00.032");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 25199900L + "'", long17 == 25199900L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.001" + "'", str22, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-99L) + "'", long27 == (-99L));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.100" + "'", str32, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.100" + "'", str39, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 32L + "'", long41 == 32L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 110L + "'", long45 == 110L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-67L) + "'", long47 == (-67L));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 2L + "'", long49 == 2L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1570084924199L) + "'", long51 == (-1570084924199L));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        int int6 = dateTimeZone1.getOffset((-48L));
        int int8 = dateTimeZone1.getOffsetFromLocal((-25200001L));
        java.lang.Class<?> wildcardClass9 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        java.lang.Object obj2 = null;
        boolean boolean3 = dateTimeZone1.equals(obj2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (-35999990L));
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        java.lang.String str10 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-71999989L) + "'", long7 == (-71999989L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(3600000, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((long) 25200000);
        int int4 = dateTimeZone0.getOffset(98L);
        java.lang.String str6 = dateTimeZone0.getName((long) 115800000);
        java.lang.String str7 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.100' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int4 = dateTimeZone2.getStandardOffset((long) 10);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        long long13 = dateTimeZone9.getMillisKeepLocal(dateTimeZone11, (long) 'a');
        int int15 = dateTimeZone11.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone16 = dateTimeZone11.toTimeZone();
        java.util.TimeZone timeZone17 = dateTimeZone11.toTimeZone();
        long long19 = dateTimeZone11.nextTransition((long) (short) -1);
        long long21 = dateTimeZone6.getMillisKeepLocal(dateTimeZone11, 110L);
        long long23 = dateTimeZone2.getMillisKeepLocal(dateTimeZone6, (-1570048923900L));
        java.lang.Object obj24 = dateTimeZone6.writeReplace();
        java.lang.String str25 = dateTimeZone6.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
// flaky "45) test0219(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
// flaky "40) test0219(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 211L + "'", long21 == 211L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1569933124000L) + "'", long23 == (-1569933124000L));
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.lang.Object obj11 = dateTimeZone1.writeReplace();
        boolean boolean12 = dateTimeZone1.isFixed();
        boolean boolean13 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone14 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '-00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "46) test0220(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky "41) test0220(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (byte) 1, false);
        java.lang.String str7 = dateTimeZone1.getName(97L);
        java.lang.String str9 = dateTimeZone1.getNameKey(0L);
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        long long13 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, 187199900L);
        java.lang.String str15 = dateTimeZone1.getName((-25200000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
// flaky "47) test0221(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 187199902L + "'", long13 == 187199902L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        java.lang.String str3 = dateTimeZone1.getName((-35999799L));
        java.lang.String str4 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+100:00" + "'", str3, "+100:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+100:00" + "'", str4, "+100:00");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) false);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((long) 100, locale12);
        long long15 = dateTimeZone1.convertUTCToLocal((-1570084924101L));
        int int17 = dateTimeZone1.getOffsetFromLocal((-1570084924001L));
        int int19 = dateTimeZone1.getOffsetFromLocal(25200001L);
        long long21 = dateTimeZone1.convertUTCToLocal((-1570048924000L));
        java.lang.String str22 = dateTimeZone1.toString();
        java.lang.Class<?> wildcardClass23 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "48) test0223(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "42) test0223(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
// flaky "29) test0223(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924102L) + "'", long15 == (-1570084924102L));
// flaky "18) test0223(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
// flaky "11) test0223(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
// flaky "7) test0223(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1570048924001L) + "'", long21 == (-1570048924001L));
// flaky "5) test0223(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass23);
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
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        boolean boolean9 = dateTimeZone3.equals((java.lang.Object) (byte) 0);
        long long13 = dateTimeZone3.convertLocalToUTC((long) (byte) 1, false, 25200000L);
        java.lang.String str15 = dateTimeZone3.getNameKey(98L);
        boolean boolean16 = dateTimeZone3.isFixed();
        java.lang.String str17 = dateTimeZone3.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "49) test0224(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "43) test0224(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky "30) test0224(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
        boolean boolean17 = dateTimeZone3.isStandardOffset((long) (short) -1);
        int int19 = dateTimeZone3.getStandardOffset((long) 100);
        long long23 = dateTimeZone3.convertLocalToUTC((-360600001L), true, (-3599802L));
        java.lang.Class<?> wildcardClass24 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "50) test0225(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "44) test0225(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "31) test0225(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
// flaky "19) test0225(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "12) test0225(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
// flaky "8) test0225(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-360600000L) + "'", long23 == (-360600000L));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
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
        java.lang.String str17 = dateTimeZone3.getNameKey(115799900L);
        java.lang.Class<?> wildcardClass18 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "51) test0226(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "45) test0226(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "32) test0226(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
// flaky "20) test0226(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 0, locale8);
        long long11 = dateTimeZone1.previousTransition((long) '4');
        java.lang.Class<?> wildcardClass12 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "52) test0227(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "46) test0227(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str3 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+10:00" + "'", str3, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((-46800000L), locale8);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        long long13 = dateTimeZone11.nextTransition((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj16 = dateTimeZone15.writeReplace();
        java.lang.Object obj17 = dateTimeZone15.writeReplace();
        int int19 = dateTimeZone15.getOffsetFromLocal((long) (short) 10);
        boolean boolean20 = dateTimeZone11.equals((java.lang.Object) int19);
        boolean boolean21 = dateTimeZone1.equals((java.lang.Object) int19);
        int int23 = dateTimeZone1.getStandardOffset(187199900L);
        java.lang.Class<?> wildcardClass24 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+10:00" + "'", str4, "+10:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:00" + "'", str9, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 36000000 + "'", int23 == 36000000);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        long long11 = dateTimeZone1.convertLocalToUTC((-1570084924101L), true);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getShortName((long) 115800000, locale13);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone1.isLocalDateTimeGap(localDateTime15);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:00" + "'", str8, "+10:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570120924101L) + "'", long11 == (-1570120924101L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.lang.String str5 = dateTimeZone1.toString();
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        java.lang.String str8 = dateTimeZone1.getShortName((-35999903L));
        long long12 = dateTimeZone1.convertLocalToUTC(21600001L, true, (-1570120923900L));
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        long long16 = dateTimeZone14.nextTransition((long) (short) 100);
        java.lang.String str18 = dateTimeZone14.getNameKey(1L);
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone14.isLocalDateTimeGap(localDateTime19);
        java.lang.String str22 = dateTimeZone14.getShortName(0L);
        boolean boolean23 = dateTimeZone1.equals((java.lang.Object) str22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone1.getOffset(readableInstant24);
        java.lang.String str27 = dateTimeZone1.getNameKey((-25200003L));
        int int29 = dateTimeZone1.getOffsetFromLocal(34L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 21600000L + "'", long12 == 21600000L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "53) test0231(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.001" + "'", str22, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
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
        boolean boolean14 = dateTimeZone3.equals((java.lang.Object) (byte) 0);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone3.getOffset(readableInstant15);
        long long20 = dateTimeZone3.convertLocalToUTC((long) '4', true, (long) 349800000);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        java.lang.Object obj23 = null;
        boolean boolean24 = dateTimeZone22.equals(obj23);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        long long28 = dateTimeZone22.getMillisKeepLocal(dateTimeZone26, (-35999990L));
        java.util.TimeZone timeZone29 = dateTimeZone22.toTimeZone();
        boolean boolean30 = dateTimeZone3.equals((java.lang.Object) timeZone29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "54) test0232(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "47) test0232(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "33) test0232(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
// flaky "21) test0232(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "13) test0232(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
// flaky "9) test0232(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 51L + "'", long20 == 51L);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-71999989L) + "'", long28 == (-71999989L));
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(35, 25200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 25200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        java.lang.String str25 = dateTimeZone1.getNameKey((-1569969124202L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "55) test0234(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
// flaky "48) test0234(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(timeZone18);
// flaky "34) test0234(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
// flaky "22) test0234(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
// flaky "14) test0234(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        long long12 = dateTimeZone1.previousTransition((long) (short) 100);
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '-00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, 349800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 349800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        long long5 = dateTimeZone1.convertLocalToUTC((-1570084924102L), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int8 = dateTimeZone1.getOffsetFromLocal((-1569724924100L));
        java.lang.Class<?> wildcardClass9 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "56) test0237(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "49) test0237(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1570084924102L) + "'", long5 == (-1570084924102L));
// flaky "35) test0237(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 100);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone3 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.100' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffsetFromLocal(25199999L);
        long long7 = dateTimeZone1.convertLocalToUTC(98L, true, (long) (-1));
        int int9 = dateTimeZone1.getOffset(3L);
        java.lang.String str11 = dateTimeZone1.getName((-100L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "57) test0239(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky "50) test0239(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 99L + "'", long7 == 99L);
// flaky "36) test0239(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
// flaky "23) test0239(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((long) 25200000);
        int int4 = dateTimeZone0.getOffset(98L);
        java.lang.String str5 = dateTimeZone0.toString();
        boolean boolean6 = dateTimeZone0.isFixed();
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone0.isLocalDateTimeGap(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        java.lang.String str21 = dateTimeZone3.getShortName((-1570084924000L));
        java.lang.String str23 = dateTimeZone3.getShortName((-3599803L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "58) test0241(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 360000000 + "'", int7 == 360000000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "51) test0241(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+:0:00");
// flaky "37) test0241(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+100:00" + "'", str11, "+100:00");
// flaky "24) test0241(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+100:00" + "'", str14, "+100:00");
// flaky "15) test0241(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+100:00" + "'", str17, "+100:00");
// flaky "10) test0241(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+100:00" + "'", str19, "+100:00");
// flaky "6) test0241(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+100:00" + "'", str21, "+100:00");
// flaky "5) test0241(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+100:00" + "'", str23, "+100:00");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (byte) 1, false);
        java.lang.String str7 = dateTimeZone1.getName(97L);
        java.lang.String str9 = dateTimeZone1.getNameKey(0L);
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        long long13 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, 187199900L);
        java.lang.Object obj14 = dateTimeZone1.writeReplace();
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone1.getShortName(0L, locale16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getName((-3599902L), locale19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
// flaky "59) test0242(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 187199902L + "'", long13 == 187199902L);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.001" + "'", str20, "+00:00:00.001");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        java.lang.Object obj2 = null;
        boolean boolean3 = dateTimeZone1.equals(obj2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (-35999990L));
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-71999989L) + "'", long7 == (-71999989L));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        int int5 = dateTimeZone1.getStandardOffset((long) (byte) 10);
        int int7 = dateTimeZone1.getStandardOffset(115799901L);
        boolean boolean9 = dateTimeZone1.isStandardOffset((long) ' ');
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, true);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getShortName((-1570084924000L), locale6);
        long long9 = dateTimeZone1.nextTransition((-20L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-20L) + "'", long9 == (-20L));
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
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        java.lang.String str9 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        int int13 = dateTimeZone11.getOffset(111L);
        long long16 = dateTimeZone11.adjustOffset((long) 349800000, true);
        int int18 = dateTimeZone11.getOffsetFromLocal(135L);
        java.lang.String str20 = dateTimeZone11.getNameKey(3L);
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone11.getOffset(readableInstant21);
        long long24 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, 110L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "60) test0246(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
// flaky "52) test0246(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 349800000L + "'", long16 == 349800000L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
// flaky "38) test0246(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 210L + "'", long24 == 210L);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '4');
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        long long5 = dateTimeZone1.convertUTCToLocal((-101L));
        boolean boolean6 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 187200000 + "'", int3 == 187200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 187199899L + "'", long5 == 187199899L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName((-1570048924001L), locale4);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+52:01" + "'", str5, "+52:01");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str7 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "61) test0249(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
// flaky "53) test0249(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.100" + "'", str7, "+00:00:00.100");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC(25200000L, true, 100L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName((-1L), locale10);
        boolean boolean12 = dateTimeZone1.isFixed();
        java.lang.String str13 = dateTimeZone1.getID();
        java.lang.Object obj14 = dateTimeZone1.writeReplace();
        long long18 = dateTimeZone1.convertLocalToUTC((long) 36600000, true, (-47L));
        java.util.TimeZone timeZone19 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
// flaky "62) test0250(org.joda.time.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.100' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "54) test0250(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
// flaky "39) test0250(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25199900L + "'", long8 == 25199900L);
// flaky "25) test0250(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "16) test0250(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertNotNull(obj14);
// flaky "11) test0250(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 36599900L + "'", long18 == 36599900L);
        org.junit.Assert.assertNotNull(timeZone19);
// flaky "7) test0250(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        long long5 = dateTimeZone1.convertLocalToUTC((-1570084924102L), false);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        long long9 = dateTimeZone1.convertLocalToUTC((-3599802L), true);
        int int11 = dateTimeZone1.getOffsetFromLocal((-1570048924000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "63) test0251(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
// flaky "55) test0251(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1570084924202L) + "'", long5 == (-1570084924202L));
        org.junit.Assert.assertNotNull(timeZone6);
// flaky "40) test0251(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
// flaky "26) test0251(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-3599902L) + "'", long9 == (-3599902L));
// flaky "17) test0251(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36000000, 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getOffset((long) 1);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName(2L, locale10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long17 = dateTimeZone13.getMillisKeepLocal(dateTimeZone15, (long) 'a');
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone13.getName((long) (short) 1, locale19);
        boolean boolean22 = dateTimeZone13.equals((java.lang.Object) false);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone13.getName((long) 100, locale24);
        long long27 = dateTimeZone13.convertUTCToLocal((-1570084924101L));
        int int29 = dateTimeZone13.getOffsetFromLocal((-1570084924001L));
        int int31 = dateTimeZone13.getOffsetFromLocal(25200001L);
        java.lang.String str32 = dateTimeZone13.getID();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        int int36 = dateTimeZone34.getOffset(111L);
        int int38 = dateTimeZone34.getOffset((long) (short) 0);
        boolean boolean39 = dateTimeZone13.equals((java.lang.Object) int38);
        long long41 = dateTimeZone1.getMillisKeepLocal(dateTimeZone13, (long) (-3600000));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "64) test0253(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(obj6);
// flaky "56) test0253(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
// flaky "41) test0253(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
// flaky "27) test0253(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "18) test0253(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
// flaky "12) test0253(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1570084924001L) + "'", long27 == (-1570084924001L));
// flaky "8) test0253(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
// flaky "6) test0253(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
// flaky "3) test0253(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.100" + "'", str32, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-3600000L) + "'", long41 == (-3600000L));
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        boolean boolean7 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        boolean boolean10 = dateTimeZone1.isFixed();
        int int12 = dateTimeZone1.getOffset((long) 115800000);
        java.lang.String str13 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (byte) 1, false);
        java.lang.String str7 = dateTimeZone1.getName(97L);
        java.lang.String str9 = dateTimeZone1.getNameKey(0L);
        int int11 = dateTimeZone1.getOffset(115799800L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) '#');
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        long long5 = dateTimeZone1.convertLocalToUTC((-99L), true, 187199801L);
        java.lang.Class<?> wildcardClass6 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-36000099L) + "'", long5 == (-36000099L));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36600000, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        long long5 = dateTimeZone1.convertLocalToUTC((-1570084924102L), false);
        int int7 = dateTimeZone1.getOffset(115800000L);
        java.lang.String str9 = dateTimeZone1.getShortName(25200000L);
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1570120924102L) + "'", long5 == (-1570120924102L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:00" + "'", str9, "+10:00");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+10:00");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36000000 + "'", int5 == 36000000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:00" + "'", str8, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        long long7 = dateTimeZone1.previousTransition((long) (short) 10);
        java.lang.String str8 = dateTimeZone1.toString();
        long long12 = dateTimeZone1.convertLocalToUTC((-51L), true, (long) (short) 100);
        long long14 = dateTimeZone1.previousTransition((long) 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "65) test0261(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky "57) test0261(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
// flaky "42) test0261(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-51L) + "'", long12 == (-51L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 115800000L + "'", long14 == 115800000L);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.lang.String str10 = dateTimeZone3.getNameKey((long) 10);
        long long14 = dateTimeZone3.convertLocalToUTC((-10800000L), false, (-10800000L));
        int int16 = dateTimeZone3.getOffsetFromLocal(25199999L);
        long long18 = dateTimeZone3.nextTransition((-1569724924301L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "66) test0262(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "58) test0262(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNull(str10);
// flaky "43) test0262(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-10800100L) + "'", long14 == (-10800100L));
// flaky "28) test0262(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1569724924301L) + "'", long18 == (-1569724924301L));
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
        java.lang.String str24 = dateTimeZone13.toString();
        java.lang.String str26 = dateTimeZone13.getNameKey((long) (short) 100);
        long long29 = dateTimeZone13.convertLocalToUTC((-1570084924000L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "67) test0263(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:00" + "'", str8, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
// flaky "59) test0263(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3600000 + "'", int17 == 3600000);
        org.junit.Assert.assertNotNull(timeZone18);
// flaky "44) test0263(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertNotNull(timeZone19);
// flaky "29) test0263(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+01:00");
// flaky "19) test0263(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3600000L + "'", long21 == 3600000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
// flaky "13) test0263(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+01:00" + "'", str24, "+01:00");
        org.junit.Assert.assertNull(str26);
// flaky "9) test0263(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1570088524000L) + "'", long29 == (-1570088524000L));
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.lang.String str9 = dateTimeZone8.getID();
        long long11 = dateTimeZone8.previousTransition((-1L));
        boolean boolean13 = dateTimeZone8.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone8.getName((long) (short) 0, locale15);
        long long18 = dateTimeZone8.nextTransition((long) ' ');
        int int20 = dateTimeZone8.getStandardOffset(115799900L);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, 110L);
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        long long28 = dateTimeZone24.getMillisKeepLocal(dateTimeZone26, (long) 'a');
        long long30 = dateTimeZone24.convertUTCToLocal(0L);
        java.util.TimeZone timeZone31 = dateTimeZone24.toTimeZone();
        long long33 = dateTimeZone24.previousTransition((long) 360000000);
        boolean boolean34 = dateTimeZone8.equals((java.lang.Object) long33);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 110L + "'", long22 == 110L);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 97L + "'", long28 == 97L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 100L + "'", long30 == 100L);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 360000000L + "'", long33 == 360000000L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.convertUTCToLocal(0L);
        boolean boolean13 = dateTimeZone3.equals((java.lang.Object) 100);
        long long15 = dateTimeZone3.convertUTCToLocal((long) 10);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        long long19 = dateTimeZone17.nextTransition((long) (short) 100);
        java.lang.String str21 = dateTimeZone17.getNameKey(1L);
        boolean boolean22 = dateTimeZone3.equals((java.lang.Object) str21);
        long long26 = dateTimeZone3.convertLocalToUTC(0L, false, 32L);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        long long30 = dateTimeZone3.getMillisKeepLocal(dateTimeZone28, 25199899L);
        long long32 = dateTimeZone3.previousTransition(25200000L);
        int int34 = dateTimeZone3.getOffsetFromLocal(115799999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 110L + "'", long15 == 110L);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-100L) + "'", long26 == (-100L));
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 25200000L + "'", long30 == 25200000L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 25200000L + "'", long32 == 25200000L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.nextTransition((long) 1);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long17 = dateTimeZone13.getMillisKeepLocal(dateTimeZone15, (long) 'a');
        boolean boolean18 = dateTimeZone13.isFixed();
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone13.getShortName((long) '4', locale20);
        long long23 = dateTimeZone3.getMillisKeepLocal(dateTimeZone13, 2L);
        long long27 = dateTimeZone13.convertLocalToUTC((-168L), false, (long) 349800000);
        java.lang.String str28 = dateTimeZone13.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 2L + "'", long23 == 2L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-268L) + "'", long27 == (-268L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.100" + "'", str28, "+00:00:00.100");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+100:10");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+100:10\" is malformed at \"0:10\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.convertUTCToLocal(0L);
        boolean boolean13 = dateTimeZone3.equals((java.lang.Object) 100);
        java.lang.String str15 = dateTimeZone3.getName(53L);
        long long17 = dateTimeZone3.nextTransition((-187199900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-187199900L) + "'", long17 == (-187199900L));
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset(115800001L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 115800001L + "'", long4 == 115800001L);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        long long25 = dateTimeZone1.convertUTCToLocal((-1570084924000L));
        java.lang.String str27 = dateTimeZone1.getName(10L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1570084923900L) + "'", long25 == (-1570084923900L));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long5 = dateTimeZone1.convertLocalToUTC(25199999L, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        long long11 = dateTimeZone7.adjustOffset((long) (byte) 1, false);
        java.lang.String str13 = dateTimeZone7.getName(97L);
        java.lang.String str15 = dateTimeZone7.getNameKey(0L);
        long long17 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (-1570084924101L));
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone7.isLocalDateTimeGap(localDateTime18);
        int int21 = dateTimeZone7.getOffsetFromLocal((-1570200724100L));
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        boolean boolean24 = dateTimeZone23.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone23);
        boolean boolean26 = dateTimeZone7.equals((java.lang.Object) dateTimeZone23);
        java.lang.Class<?> wildcardClass27 = dateTimeZone23.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25199999L + "'", long5 == 25199999L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1570084924102L) + "'", long17 == (-1570084924102L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.getID();
        long long6 = dateTimeZone3.previousTransition((-1L));
        long long10 = dateTimeZone3.convertLocalToUTC(25200000L, true, 100L);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 100L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        long long16 = dateTimeZone1.getMillisKeepLocal(dateTimeZone14, 97L);
        long long18 = dateTimeZone14.previousTransition(25199900L);
        java.lang.String str20 = dateTimeZone14.getName((-10800100L));
        long long24 = dateTimeZone14.convertLocalToUTC((-35999899L), true, 102L);
        int int26 = dateTimeZone14.getOffsetFromLocal((-61199902L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25199999L + "'", long10 == 25199999L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-3599902L) + "'", long16 == (-3599902L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 25199900L + "'", long18 == 25199900L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+01:00" + "'", str20, "+01:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-39599899L) + "'", long24 == (-39599899L));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3600000 + "'", int26 == 3600000);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        java.lang.Object obj9 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        int int5 = dateTimeZone1.getStandardOffset((long) (byte) 10);
        int int7 = dateTimeZone1.getStandardOffset(115799901L);
        boolean boolean9 = dateTimeZone1.isStandardOffset((long) ' ');
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone1.getOffset(readableInstant10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
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
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getShortName((long) (short) 10, locale14);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long20 = dateTimeZone17.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone17);
        boolean boolean22 = dateTimeZone17.isFixed();
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        java.lang.String str25 = dateTimeZone24.getID();
        long long27 = dateTimeZone24.previousTransition((-1L));
        boolean boolean29 = dateTimeZone24.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone24.getName((long) (short) 0, locale31);
        long long34 = dateTimeZone24.nextTransition((long) ' ');
        int int36 = dateTimeZone24.getStandardOffset(115799900L);
        long long38 = dateTimeZone17.getMillisKeepLocal(dateTimeZone24, 110L);
        long long40 = dateTimeZone1.getMillisKeepLocal(dateTimeZone24, (long) ' ');
        long long42 = dateTimeZone1.convertUTCToLocal((long) 1);
        long long44 = dateTimeZone1.previousTransition((-1570084924199L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25199999L + "'", long10 == 25199999L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-99L) + "'", long20 == (-99L));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.100" + "'", str32, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 32L + "'", long34 == 32L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 110L + "'", long38 == 110L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-67L) + "'", long40 == (-67L));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 2L + "'", long42 == 2L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1570084924199L) + "'", long44 == (-1570084924199L));
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        int int6 = dateTimeZone1.getOffset((long) 115800000);
        int int8 = dateTimeZone1.getStandardOffset((long) 10);
        java.lang.String str9 = dateTimeZone1.getID();
        boolean boolean11 = dateTimeZone1.isStandardOffset((-47L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(349800000, (-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        int int10 = dateTimeZone3.getOffset((long) (short) 1);
        java.lang.String str12 = dateTimeZone3.getName(101L);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone3.isLocalDateTimeGap(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        int int8 = dateTimeZone1.getStandardOffset(0L);
        java.lang.String str10 = dateTimeZone1.getShortName((-3599902L));
        java.lang.String str11 = dateTimeZone1.getID();
        long long15 = dateTimeZone1.convertLocalToUTC((-1570048923999L), false, (-36000001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570048923998L) + "'", long15 == (-1570048923998L));
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.adjustOffset((-68L), true);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-99L), locale5);
        int int8 = dateTimeZone0.getStandardOffset((-46800000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-68L) + "'", long3 == (-68L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        long long7 = dateTimeZone1.previousTransition(10L);
        long long9 = dateTimeZone1.previousTransition((-25199901L));
        int int11 = dateTimeZone1.getOffsetFromLocal(187199801L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-25199901L) + "'", long9 == (-25199901L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
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
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.convertUTCToLocal(0L);
        int int13 = dateTimeZone3.getOffset((long) (short) 0);
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
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        boolean boolean9 = dateTimeZone1.isFixed();
        long long11 = dateTimeZone1.nextTransition((-1570084924201L));
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone1.getOffset(readableInstant12);
        long long16 = dateTimeZone1.convertLocalToUTC((-1570048924001L), true);
        java.lang.String str18 = dateTimeZone1.getName((-115799900L));
        java.lang.Class<?> wildcardClass19 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570084924201L) + "'", long11 == (-1570084924201L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1570048924002L) + "'", long16 == (-1570048924002L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.001" + "'", str18, "+00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.052");
        long long4 = dateTimeZone1.adjustOffset(359999900L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 359999900L + "'", long4 == 359999900L);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int4 = dateTimeZone2.getOffset(101L);
        int int6 = dateTimeZone2.getOffset((-35999801L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115800000 + "'", int6 == 115800000);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        int int10 = dateTimeZone1.getOffset(52L);
        boolean boolean11 = dateTimeZone1.isFixed();
        java.lang.String str13 = dateTimeZone1.getShortName((-1569724924101L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "68) test0286(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
// flaky "60) test0286(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "45) test0286(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
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
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone3.getName((long) (short) 10, locale11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone3.getShortName((-36000045L), locale15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "69) test0287(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
// flaky "61) test0287(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
// flaky "46) test0287(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffsetFromLocal(25199999L);
        int int5 = dateTimeZone1.getOffsetFromLocal((long) '4');
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        int int8 = dateTimeZone1.getStandardOffset((-25200001L));
        long long11 = dateTimeZone1.convertLocalToUTC(115800054L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "70) test0288(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3600000 + "'", int3 == 3600000);
// flaky "62) test0288(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3600000 + "'", int5 == 3600000);
        org.junit.Assert.assertNotNull(obj6);
// flaky "47) test0288(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3600000 + "'", int8 == 3600000);
// flaky "30) test0288(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 112200054L + "'", long11 == 112200054L);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.convertUTCToLocal(0L);
        int int13 = dateTimeZone3.getOffset((-1570048924001L));
        boolean boolean15 = dateTimeZone3.isStandardOffset((-48L));
        java.util.TimeZone timeZone16 = dateTimeZone3.toTimeZone();
        int int18 = dateTimeZone3.getOffset(187200000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "71) test0289(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600000 + "'", int7 == 3600000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "63) test0289(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "48) test0289(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+01:00");
// flaky "31) test0289(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3600000L + "'", long11 == 3600000L);
// flaky "20) test0289(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3600000 + "'", int13 == 3600000);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(timeZone16);
// flaky "14) test0289(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+01:00");
// flaky "10) test0289(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3600000 + "'", int18 == 3600000);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        long long5 = dateTimeZone1.convertLocalToUTC((-1570084924102L), false);
        int int7 = dateTimeZone1.getOffset(115800000L);
        java.lang.String str9 = dateTimeZone1.getShortName(25200000L);
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        java.lang.String str12 = dateTimeZone1.getNameKey((-115799999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "72) test0290(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:00" + "'", str2, "+01:00");
// flaky "64) test0290(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1570088524102L) + "'", long5 == (-1570088524102L));
// flaky "49) test0290(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600000 + "'", int7 == 3600000);
// flaky "32) test0290(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+01:00" + "'", str9, "+01:00");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((-35999948L), locale3);
        java.lang.Class<?> wildcardClass5 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertNotNull(wildcardClass5);
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
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone3.getName((long) (short) 10, locale11);
        int int14 = dateTimeZone3.getOffsetFromLocal((long) (byte) 1);
        boolean boolean16 = dateTimeZone3.isStandardOffset(0L);
        long long18 = dateTimeZone3.convertUTCToLocal(25199901L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "73) test0292(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600000 + "'", int7 == 3600000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "65) test0292(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "50) test0292(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+01:00");
// flaky "33) test0292(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+01:00" + "'", str12, "+01:00");
// flaky "21) test0292(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3600000 + "'", int14 == 3600000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky "15) test0292(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 28799901L + "'", long18 == 28799901L);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        long long7 = dateTimeZone5.nextTransition((long) (short) 100);
        int int9 = dateTimeZone5.getOffsetFromLocal(100L);
        long long11 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (long) 115800000);
        java.lang.String str13 = dateTimeZone1.getNameKey((long) 1);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int18 = dateTimeZone16.getStandardOffset((long) 10);
        java.lang.String str19 = dateTimeZone16.getID();
        long long21 = dateTimeZone1.getMillisKeepLocal(dateTimeZone16, (-1570084924099L));
        java.lang.String str23 = dateTimeZone1.getNameKey((-71999989L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "74) test0293(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:00" + "'", str2, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
// flaky "66) test0293(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3600000 + "'", int9 == 3600000);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115800000 + "'", int18 == 115800000);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:10" + "'", str19, "+32:10");
// flaky "51) test0293(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1570197124099L) + "'", long21 == (-1570197124099L));
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(25200000, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        long long7 = dateTimeZone5.nextTransition((long) (short) 100);
        int int9 = dateTimeZone5.getOffsetFromLocal(100L);
        long long11 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (long) 115800000);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone5.getOffset(readableInstant12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "75) test0295(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:00" + "'", str2, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
// flaky "67) test0295(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3600000 + "'", int9 == 3600000);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
// flaky "52) test0295(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3600000 + "'", int13 == 3600000);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        int int10 = dateTimeZone1.getOffset((-35999865L));
        java.lang.Class<?> wildcardClass11 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC(25200000L, true, 100L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName((-1L), locale10);
        boolean boolean12 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        long long18 = dateTimeZone14.getMillisKeepLocal(dateTimeZone16, (long) 'a');
        int int20 = dateTimeZone16.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone21 = dateTimeZone16.toTimeZone();
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone16.getShortName((long) (byte) 100, locale23);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone16.getShortName((long) (short) 0, locale26);
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone16.getName((long) (short) 100, locale29);
        boolean boolean31 = dateTimeZone1.equals((java.lang.Object) locale29);
        long long34 = dateTimeZone1.adjustOffset(21600000L, false);
        org.joda.time.ReadableInstant readableInstant35 = null;
        int int36 = dateTimeZone1.getOffset(readableInstant35);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "76) test0297(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
// flaky "68) test0297(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25199900L + "'", long8 == 25199900L);
// flaky "53) test0297(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
// flaky "34) test0297(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "GMT+00:00");
// flaky "22) test0297(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
// flaky "16) test0297(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
// flaky "11) test0297(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.100" + "'", str30, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 21600000L + "'", long34 == 21600000L);
// flaky "7) test0297(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        int int28 = dateTimeZone1.getStandardOffset((-25200002L));
        int int30 = dateTimeZone1.getOffsetFromLocal((-91L));
        long long32 = dateTimeZone1.nextTransition((-3599802L));
        long long34 = dateTimeZone1.previousTransition(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "77) test0299(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
// flaky "69) test0299(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
// flaky "54) test0299(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
// flaky "35) test0299(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1570084924101L) + "'", long26 == (-1570084924101L));
// flaky "23) test0299(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
// flaky "17) test0299(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-3599802L) + "'", long32 == (-3599802L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360000000, 36600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 36600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        int int8 = dateTimeZone1.getStandardOffset(0L);
        long long12 = dateTimeZone1.convertLocalToUTC(111L, false, 25199999L);
        long long16 = dateTimeZone1.convertLocalToUTC(25199999L, false, (-48L));
        java.lang.Object obj17 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 112L + "'", long12 == 112L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 25200000L + "'", long16 == 25200000L);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
        long long21 = dateTimeZone3.nextTransition(1L);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone3.getName(100L, locale23);
        java.lang.String str26 = dateTimeZone3.getNameKey((-1570084923899L));
        long long29 = dateTimeZone3.adjustOffset(115800009L, true);
        org.joda.time.ReadableInstant readableInstant30 = null;
        int int31 = dateTimeZone3.getOffset(readableInstant30);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "78) test0302(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "70) test0302(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
// flaky "55) test0302(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
// flaky "36) test0302(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
// flaky "24) test0302(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
// flaky "18) test0302(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 115800009L + "'", long29 == 115800009L);
// flaky "12) test0302(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        int int5 = dateTimeZone1.getStandardOffset((long) (byte) 10);
        int int7 = dateTimeZone1.getStandardOffset(115799901L);
        boolean boolean9 = dateTimeZone1.isStandardOffset((long) ' ');
        java.lang.Object obj10 = null;
        boolean boolean11 = dateTimeZone1.equals(obj10);
        int int13 = dateTimeZone1.getOffset(324000003L);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone1.isLocalDateTimeGap(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        boolean boolean8 = dateTimeZone1.isFixed();
        long long10 = dateTimeZone1.nextTransition((long) 25200000);
        long long12 = dateTimeZone1.previousTransition((-35999903L));
        long long15 = dateTimeZone1.adjustOffset((-1570048924002L), true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long18 = dateTimeZone1.nextTransition((-115799966L));
        java.lang.String str19 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "79) test0304(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6720000 + "'", int5 == 6720000);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25200000L + "'", long10 == 25200000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-35999903L) + "'", long12 == (-35999903L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570048924002L) + "'", long15 == (-1570048924002L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-115799966L) + "'", long18 == (-115799966L));
// flaky "71) test0304(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+01:52" + "'", str19, "+01:52");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC(25200000L, true, 100L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName((-1L), locale10);
        boolean boolean12 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        long long18 = dateTimeZone14.getMillisKeepLocal(dateTimeZone16, (long) 'a');
        int int20 = dateTimeZone16.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone21 = dateTimeZone16.toTimeZone();
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone16.getShortName((long) (byte) 100, locale23);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone16.getShortName((long) (short) 0, locale26);
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone16.getName((long) (short) 100, locale29);
        boolean boolean31 = dateTimeZone1.equals((java.lang.Object) locale29);
        long long34 = dateTimeZone1.adjustOffset(21600000L, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "80) test0305(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:52" + "'", str2, "+01:52");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
// flaky "72) test0305(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 18480000L + "'", long8 == 18480000L);
// flaky "56) test0305(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:52" + "'", str11, "+01:52");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
// flaky "37) test0305(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6720000 + "'", int20 == 6720000);
        org.junit.Assert.assertNotNull(timeZone21);
// flaky "25) test0305(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "GMT+01:52");
// flaky "19) test0305(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+01:52" + "'", str24, "+01:52");
// flaky "13) test0305(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+01:52" + "'", str27, "+01:52");
// flaky "8) test0305(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+01:52" + "'", str30, "+01:52");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 21600000L + "'", long34 == 21600000L);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, 360600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 360600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 25200000, true, (long) (short) 10);
        int int8 = dateTimeZone1.getStandardOffset(115799900L);
        java.lang.String str10 = dateTimeZone1.getShortName(110L);
        long long12 = dateTimeZone1.previousTransition((long) '#');
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getName((-25199901L), locale14);
        long long17 = dateTimeZone1.previousTransition((-35999901L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 25199999L + "'", long6 == 25199999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-35999901L) + "'", long17 == (-35999901L));
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.lang.Object obj11 = dateTimeZone1.writeReplace();
        long long15 = dateTimeZone1.convertLocalToUTC(110L, true, 110L);
        boolean boolean17 = dateTimeZone1.isStandardOffset(9L);
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone1.getOffset(readableInstant18);
        java.lang.Class<?> wildcardClass20 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "81) test0308(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6720000 + "'", int5 == 6720000);
// flaky "73) test0308(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:52" + "'", str8, "+01:52");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
// flaky "57) test0308(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-6719890L) + "'", long15 == (-6719890L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "38) test0308(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6720000 + "'", int19 == 6720000);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        int int8 = dateTimeZone1.getOffset(97L);
        java.lang.Class<?> wildcardClass9 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        java.lang.String str13 = dateTimeZone1.getShortName(32L);
        java.lang.String str14 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "82) test0310(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
// flaky "74) test0310(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
// flaky "58) test0310(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
// flaky "39) test0310(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.lang.Object obj11 = dateTimeZone1.writeReplace();
        boolean boolean12 = dateTimeZone1.isFixed();
        boolean boolean13 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 1);
        boolean boolean17 = dateTimeZone1.equals((java.lang.Object) dateTimeZone16);
        boolean boolean19 = dateTimeZone1.equals((java.lang.Object) (-97L));
        java.util.TimeZone timeZone20 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.100' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "83) test0311(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
// flaky "75) test0311(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(360600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.convertUTCToLocal(0L);
        boolean boolean13 = dateTimeZone3.equals((java.lang.Object) 100);
        long long15 = dateTimeZone3.convertUTCToLocal((long) 10);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        long long19 = dateTimeZone17.nextTransition((long) (short) 100);
        java.lang.String str21 = dateTimeZone17.getNameKey(1L);
        boolean boolean22 = dateTimeZone3.equals((java.lang.Object) str21);
        long long26 = dateTimeZone3.convertLocalToUTC(0L, false, 32L);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        long long30 = dateTimeZone3.getMillisKeepLocal(dateTimeZone28, 25199899L);
        long long32 = dateTimeZone28.convertUTCToLocal((-3599802L));
        long long34 = dateTimeZone28.previousTransition((-1570084924000L));
        java.lang.Object obj35 = dateTimeZone28.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "84) test0313(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
// flaky "76) test0313(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "59) test0313(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 110L + "'", long15 == 110L);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "40) test0313(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-100L) + "'", long26 == (-100L));
        org.junit.Assert.assertNotNull(dateTimeZone28);
// flaky "26) test0313(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 25200000L + "'", long30 == 25200000L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-3599803L) + "'", long32 == (-3599803L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1570084924000L) + "'", long34 == (-1570084924000L));
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        long long5 = dateTimeZone1.convertLocalToUTC((long) 25200000, false, (long) (-1));
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        long long11 = dateTimeZone7.getMillisKeepLocal(dateTimeZone9, (long) 'a');
        int int13 = dateTimeZone9.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone14 = dateTimeZone9.toTimeZone();
        java.util.TimeZone timeZone15 = dateTimeZone9.toTimeZone();
        java.lang.String str17 = dateTimeZone9.getName(102L);
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, 3L);
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = dateTimeZone1.getOffset(readableInstant20);
        java.lang.Class<?> wildcardClass22 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25199948L + "'", long5 == 25199948L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
// flaky "85) test0314(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
// flaky "77) test0314(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
// flaky "60) test0314(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-45L) + "'", long19 == (-45L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int4 = dateTimeZone2.getStandardOffset((long) 10);
        java.lang.String str5 = dateTimeZone2.getID();
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone2.getShortName((-91L), locale7);
        java.lang.String str10 = dateTimeZone2.getName((long) '#');
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone2.getShortName((-3599900L), locale12);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:10" + "'", str5, "+32:10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:10" + "'", str8, "+32:10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:10" + "'", str10, "+32:10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:10" + "'", str13, "+32:10");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
        boolean boolean17 = dateTimeZone3.isStandardOffset((long) (short) -1);
        int int19 = dateTimeZone3.getStandardOffset((long) 100);
        long long22 = dateTimeZone3.convertLocalToUTC((-36000199L), true);
        boolean boolean23 = dateTimeZone3.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "86) test0316(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "78) test0316(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
// flaky "61) test0316(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
// flaky "41) test0316(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "27) test0316(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
// flaky "20) test0316(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-36000299L) + "'", long22 == (-36000299L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC(25200000L, true, 100L);
        int int10 = dateTimeZone1.getOffsetFromLocal(1L);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.100' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "87) test0317(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
// flaky "79) test0317(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25199900L + "'", long8 == 25199900L);
// flaky "62) test0317(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (byte) 1, false);
        java.lang.String str7 = dateTimeZone1.getName(97L);
        java.lang.String str9 = dateTimeZone1.getNameKey(0L);
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        java.lang.String str11 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.convertUTCToLocal(0L);
        boolean boolean13 = dateTimeZone3.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone14 = dateTimeZone3.toTimeZone();
        int int16 = dateTimeZone3.getOffsetFromLocal((long) ' ');
        long long19 = dateTimeZone3.convertLocalToUTC((-1570084923900L), false);
        int int21 = dateTimeZone3.getOffset((-115799900L));
        boolean boolean23 = dateTimeZone3.isStandardOffset((-1570197124099L));
        java.lang.String str25 = dateTimeZone3.getShortName((long) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "88) test0319(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
// flaky "80) test0319(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
// flaky "63) test0319(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
// flaky "42) test0319(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1570084924000L) + "'", long19 == (-1570084924000L));
// flaky "28) test0319(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
// flaky "21) test0319(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long8 = dateTimeZone5.convertLocalToUTC((long) 1, true);
        int int10 = dateTimeZone5.getOffset((long) 115800000);
        int int12 = dateTimeZone5.getStandardOffset((long) 10);
        java.lang.Object obj13 = dateTimeZone5.writeReplace();
        boolean boolean14 = dateTimeZone1.equals((java.lang.Object) dateTimeZone5);
        java.lang.String str15 = dateTimeZone1.getID();
        long long17 = dateTimeZone1.previousTransition(211L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-99L) + "'", long8 == (-99L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.010" + "'", str15, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 211L + "'", long17 == 211L);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        int int10 = dateTimeZone1.getOffset((long) (short) 1);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((-1570084924202L), locale12);
        int int15 = dateTimeZone1.getStandardOffset(35L);
        long long18 = dateTimeZone1.adjustOffset((long) '#', true);
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        long long22 = dateTimeZone20.previousTransition((long) (short) 1);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone20.getName(25199899L, locale24);
        boolean boolean26 = dateTimeZone1.equals((java.lang.Object) str25);
        boolean boolean28 = dateTimeZone1.isStandardOffset((-1570084924102L));
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        boolean boolean31 = dateTimeZone1.equals((java.lang.Object) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.001" + "'", str25, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        int int8 = dateTimeZone1.getOffsetFromLocal((long) 25200000);
        java.lang.String str9 = dateTimeZone1.getID();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.lang.String str12 = dateTimeZone11.getID();
        long long14 = dateTimeZone11.previousTransition((-1L));
        long long16 = dateTimeZone11.previousTransition(102L);
        long long18 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, 25199948L);
        long long20 = dateTimeZone11.previousTransition((-1569969124002L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 102L + "'", long16 == 102L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 25199948L + "'", long18 == 25199948L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1569969124002L) + "'", long20 == (-1569969124002L));
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(6720000, 360600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 360600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC((-99L), true, (-3599902L));
        long long10 = dateTimeZone1.nextTransition((-35999897L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "89) test0325(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
// flaky "81) test0325(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-36000099L) + "'", long8 == (-36000099L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-35999897L) + "'", long10 == (-35999897L));
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        boolean boolean7 = dateTimeZone1.isFixed();
        long long11 = dateTimeZone1.convertLocalToUTC((-115799999L), true, (long) ' ');
        long long14 = dateTimeZone1.convertLocalToUTC((-1570088524000L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115799998L) + "'", long11 == (-115799998L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1570088523999L) + "'", long14 == (-1570088523999L));
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        long long7 = dateTimeZone3.getMillisKeepLocal(dateTimeZone5, (long) 'a');
        long long9 = dateTimeZone3.convertUTCToLocal(0L);
        java.util.TimeZone timeZone10 = dateTimeZone3.toTimeZone();
        boolean boolean11 = dateTimeZone1.equals((java.lang.Object) timeZone10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getName(99L, locale13);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone1.isLocalDateTimeGap(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
// flaky "90) test0327(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) false);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((long) 100, locale12);
        long long15 = dateTimeZone1.convertUTCToLocal((-1570084924101L));
        int int17 = dateTimeZone1.getOffsetFromLocal((-1570084924001L));
        int int19 = dateTimeZone1.getOffsetFromLocal(25200001L);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        long long23 = dateTimeZone21.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone21.getOffset(readableInstant24);
        java.lang.String str26 = dateTimeZone21.toString();
        java.lang.String str27 = dateTimeZone21.toString();
        int int29 = dateTimeZone21.getOffset((-1570084924000L));
        boolean boolean30 = dateTimeZone1.equals((java.lang.Object) int29);
        java.lang.String str31 = dateTimeZone1.toString();
        java.lang.String str33 = dateTimeZone1.getNameKey(0L);
        boolean boolean35 = dateTimeZone1.equals((java.lang.Object) (byte) 10);
        java.lang.String str37 = dateTimeZone1.getShortName((-39599902L));
        java.lang.Class<?> wildcardClass38 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "91) test0328(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "82) test0328(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
// flaky "64) test0328(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924001L) + "'", long15 == (-1570084924001L));
// flaky "43) test0328(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
// flaky "29) test0328(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
// flaky "22) test0328(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
// flaky "14) test0328(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.100" + "'", str26, "+00:00:00.100");
// flaky "9) test0328(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
// flaky "4) test0328(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky "3) test0328(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.100" + "'", str31, "+00:00:00.100");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
// flaky "1) test0328(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00:00.100" + "'", str37, "+00:00:00.100");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        int int5 = dateTimeZone1.getStandardOffset((long) (byte) 10);
        int int7 = dateTimeZone1.getStandardOffset(115799901L);
        boolean boolean9 = dateTimeZone1.isStandardOffset((long) ' ');
        java.lang.Object obj10 = null;
        boolean boolean11 = dateTimeZone1.equals(obj10);
        int int13 = dateTimeZone1.getOffset(324000003L);
        long long15 = dateTimeZone1.previousTransition(100L);
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = dateTimeZone1.isLocalDateTimeGap(localDateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        java.lang.String str3 = dateTimeZone1.getShortName((long) (short) 10);
        int int5 = dateTimeZone1.getOffsetFromLocal((-1570084924102L));
        long long7 = dateTimeZone1.convertUTCToLocal((-90L));
        java.lang.Class<?> wildcardClass8 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+01:00" + "'", str3, "+01:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3600000 + "'", int5 == 3600000);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3599910L + "'", long7 == 3599910L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+97:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+97:00\" is malformed at \"97:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        java.lang.String str10 = dateTimeZone1.getShortName(25199900L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj13 = dateTimeZone12.writeReplace();
        long long17 = dateTimeZone12.convertLocalToUTC((long) 25200000, true, (long) (short) 10);
        int int19 = dateTimeZone12.getStandardOffset(115799900L);
        long long21 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, (-25200001L));
        java.lang.String str22 = dateTimeZone12.getID();
        java.lang.Class<?> wildcardClass23 = dateTimeZone12.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "92) test0332(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
// flaky "83) test0332(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 25199999L + "'", long17 == 25199999L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
// flaky "65) test0332(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-25199902L) + "'", long21 == (-25199902L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.001" + "'", str22, "+00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        java.util.TimeZone timeZone12 = dateTimeZone1.toTimeZone();
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone1.getOffset(readableInstant13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "93) test0333(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
// flaky "84) test0333(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
// flaky "66) test0333(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        int int8 = dateTimeZone1.getOffsetFromLocal((long) 25200000);
        java.lang.String str9 = dateTimeZone1.getID();
        long long11 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.lang.Class<?> wildcardClass14 = dateTimeZone13.getClass();
        boolean boolean15 = dateTimeZone1.equals((java.lang.Object) wildcardClass14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "94) test0334(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "85) test0334(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
// flaky "67) test0334(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
// flaky "44) test0334(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (byte) 1, false);
        java.lang.String str7 = dateTimeZone1.getName(97L);
        java.lang.String str9 = dateTimeZone1.getNameKey(0L);
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
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
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        java.lang.Object obj10 = dateTimeZone3.writeReplace();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str13 = dateTimeZone12.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        java.lang.Class<?> wildcardClass15 = dateTimeZone12.getClass();
        boolean boolean16 = dateTimeZone3.equals((java.lang.Object) dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "95) test0336(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
// flaky "86) test0336(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.lang.Object obj11 = dateTimeZone1.writeReplace();
        long long14 = dateTimeZone1.convertLocalToUTC(115799900L, false);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone1.getOffset(readableInstant15);
        java.lang.String str18 = dateTimeZone1.getNameKey((-67L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone20 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+100:00' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "96) test0337(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 360000000 + "'", int5 == 360000000);
// flaky "87) test0337(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+100:00" + "'", str8, "+100:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
// flaky "68) test0337(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-244200100L) + "'", long14 == (-244200100L));
// flaky "45) test0337(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 360000000 + "'", int16 == 360000000);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(timeZone20);
// flaky "30) test0337(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+:0:00");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        int int10 = dateTimeZone1.getOffset((long) (short) 1);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((-1570084924202L), locale12);
        int int15 = dateTimeZone1.getStandardOffset(35L);
        long long18 = dateTimeZone1.adjustOffset((long) '#', true);
        java.lang.String str20 = dateTimeZone1.getShortName((-35999948L));
        long long24 = dateTimeZone1.convertLocalToUTC(25200001L, false, 115799798L);
        boolean boolean26 = dateTimeZone1.isStandardOffset((-168L));
        boolean boolean27 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "97) test0338(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
// flaky "88) test0338(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
// flaky "69) test0338(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
// flaky "46) test0338(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
// flaky "31) test0338(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
// flaky "23) test0338(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 25199901L + "'", long24 == 25199901L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        long long9 = dateTimeZone1.adjustOffset((long) '#', true);
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        long long13 = dateTimeZone1.adjustOffset((-3599903L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "98) test0339(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
// flaky "89) test0339(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
// flaky "70) test0339(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-3599903L) + "'", long13 == (-3599903L));
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 0, locale8);
        long long11 = dateTimeZone1.nextTransition((long) ' ');
        long long15 = dateTimeZone1.convertLocalToUTC((long) '4', false, 115799900L);
        long long19 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 36000000L);
        java.lang.String str20 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone1.getOffset(readableInstant21);
        long long24 = dateTimeZone1.nextTransition((-115799900L));
        java.lang.String str26 = dateTimeZone1.getName((-25200103L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "99) test0340(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "90) test0340(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky "71) test0340(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-48L) + "'", long15 == (-48L));
// flaky "47) test0340(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-101L) + "'", long19 == (-101L));
// flaky "32) test0340(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
// flaky "24) test0340(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-115799900L) + "'", long24 == (-115799900L));
// flaky "15) test0340(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.100" + "'", str26, "+00:00:00.100");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        int int6 = dateTimeZone1.getOffset((long) 115800000);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.100' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.getID();
        long long6 = dateTimeZone3.previousTransition((-1L));
        long long10 = dateTimeZone3.convertLocalToUTC(25200000L, true, 100L);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 100L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        long long16 = dateTimeZone1.getMillisKeepLocal(dateTimeZone14, 97L);
        long long18 = dateTimeZone14.previousTransition(25199900L);
        java.lang.String str20 = dateTimeZone14.getName((-10800100L));
        long long24 = dateTimeZone14.convertLocalToUTC((-35999899L), true, 102L);
        org.joda.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = dateTimeZone14.isLocalDateTimeGap(localDateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "100) test0342(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
// flaky "91) test0342(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25199900L + "'", long10 == 25199900L);
// flaky "72) test0342(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-3599902L) + "'", long16 == (-3599902L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 25199900L + "'", long18 == 25199900L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+01:00" + "'", str20, "+01:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-39599899L) + "'", long24 == (-39599899L));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36600000, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 'a');
        java.lang.String str13 = dateTimeZone1.getID();
        java.lang.Object obj14 = dateTimeZone1.writeReplace();
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone1.getName((-35999999L), locale16);
        int int19 = dateTimeZone1.getStandardOffset((-1569724924100L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "101) test0344(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky "92) test0344(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "73) test0344(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
// flaky "48) test0344(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj14);
// flaky "33) test0344(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
// flaky "25) test0344(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.lang.Object obj11 = dateTimeZone1.writeReplace();
        long long15 = dateTimeZone1.convertLocalToUTC(110L, true, 110L);
        long long19 = dateTimeZone1.convertLocalToUTC((-35999890L), false, (-115800001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "102) test0345(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky "93) test0345(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
// flaky "74) test0345(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 111L + "'", long15 == 111L);
// flaky "49) test0345(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-35999889L) + "'", long19 == (-35999889L));
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int4 = dateTimeZone2.getStandardOffset((long) 10);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        long long13 = dateTimeZone9.getMillisKeepLocal(dateTimeZone11, (long) 'a');
        int int15 = dateTimeZone11.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone16 = dateTimeZone11.toTimeZone();
        java.util.TimeZone timeZone17 = dateTimeZone11.toTimeZone();
        long long19 = dateTimeZone11.nextTransition((long) (short) -1);
        long long21 = dateTimeZone6.getMillisKeepLocal(dateTimeZone11, 110L);
        long long23 = dateTimeZone2.getMillisKeepLocal(dateTimeZone6, (-1570048923900L));
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone2.getName((long) ' ', locale25);
        java.lang.String str27 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
// flaky "103) test0346(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
// flaky "94) test0346(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 211L + "'", long21 == 211L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1569933124000L) + "'", long23 == (-1569933124000L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+32:10" + "'", str26, "+32:10");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+32:10" + "'", str27, "+32:10");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getOffset(0L);
        java.lang.Class<?> wildcardClass9 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.Object obj3 = dateTimeZone1.writeReplace();
        int int5 = dateTimeZone1.getOffsetFromLocal((long) (short) 10);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        long long8 = dateTimeZone1.nextTransition((-10800000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-10800000L) + "'", long8 == (-10800000L));
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        int int3 = dateTimeZone1.getStandardOffset((-91L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36000000 + "'", int3 == 36000000);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        int int8 = dateTimeZone1.getOffset(97L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360600000, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        int int5 = dateTimeZone1.getStandardOffset((long) (byte) 10);
        int int7 = dateTimeZone1.getStandardOffset(115799901L);
        boolean boolean9 = dateTimeZone1.isStandardOffset((long) ' ');
        java.lang.Object obj10 = null;
        boolean boolean11 = dateTimeZone1.equals(obj10);
        int int13 = dateTimeZone1.getOffset(324000003L);
        long long15 = dateTimeZone1.previousTransition(100L);
        long long18 = dateTimeZone1.convertLocalToUTC((-10799999L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-10799998L) + "'", long18 == (-10799998L));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((long) 25200000);
        int int4 = dateTimeZone0.getOffset(98L);
        java.lang.String str6 = dateTimeZone0.getName(25199899L);
        java.lang.String str8 = dateTimeZone0.getShortName((-6720045L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(3600000);
        int int3 = dateTimeZone1.getOffsetFromLocal(32L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3600000 + "'", int3 == 3600000);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        long long7 = dateTimeZone5.nextTransition((long) (short) 100);
        int int9 = dateTimeZone5.getOffsetFromLocal(100L);
        long long11 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (long) 115800000);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        java.lang.Object obj14 = dateTimeZone13.writeReplace();
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone13.getName((-35999890L), locale16);
        java.lang.String str18 = dateTimeZone13.toString();
        java.lang.String str20 = dateTimeZone13.getNameKey(56L);
        boolean boolean21 = dateTimeZone5.equals((java.lang.Object) dateTimeZone13);
        int int23 = dateTimeZone13.getOffset(115799900L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115800000L + "'", long11 == 115800000L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.032" + "'", str17, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.032" + "'", str18, "+00:00:00.032");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str10 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.nextTransition(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.lang.String str7 = dateTimeZone1.getName((long) (byte) 10);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getName(1L, locale9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone1.getOffset(readableInstant11);
        int int14 = dateTimeZone1.getOffset((long) (byte) 0);
        long long16 = dateTimeZone1.previousTransition((-1569969124002L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1569969124002L) + "'", long16 == (-1569969124002L));
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC((-99L), true, (-3599902L));
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long13 = dateTimeZone10.convertLocalToUTC((long) 1, true);
        int int15 = dateTimeZone10.getOffset((long) 115800000);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        long long21 = dateTimeZone17.getMillisKeepLocal(dateTimeZone19, (long) 'a');
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone17.getName((long) (short) 1, locale23);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone17);
        java.lang.String str26 = dateTimeZone17.getID();
        long long28 = dateTimeZone17.previousTransition((-10800000L));
        boolean boolean29 = dateTimeZone10.equals((java.lang.Object) long28);
        long long32 = dateTimeZone10.convertLocalToUTC(52L, true);
        long long34 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, 0L);
        long long36 = dateTimeZone1.convertUTCToLocal((long) 'a');
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-98L) + "'", long8 == (-98L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-99L) + "'", long13 == (-99L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-00:00:00.001" + "'", str24, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-00:00:00.001" + "'", str26, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-10800000L) + "'", long28 == (-10800000L));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-48L) + "'", long32 == (-48L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-101L) + "'", long34 == (-101L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 96L + "'", long36 == 96L);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        int int14 = dateTimeZone1.getOffset(35999899L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "104) test0359(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
// flaky "95) test0359(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
// flaky "75) test0359(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
        java.lang.String str17 = dateTimeZone3.getNameKey(115799900L);
        java.lang.String str19 = dateTimeZone3.getName((long) '4');
        boolean boolean21 = dateTimeZone3.isStandardOffset(97L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        int int24 = dateTimeZone3.getOffset((-10800100L));
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = dateTimeZone3.getOffset(readableInstant25);
        java.lang.Class<?> wildcardClass27 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "105) test0360(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "96) test0360(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
// flaky "76) test0360(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
// flaky "50) test0360(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
// flaky "34) test0360(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
// flaky "26) test0360(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
// flaky "16) test0360(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
// flaky "10) test0360(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
// flaky "5) test0360(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        int int8 = dateTimeZone1.getOffsetFromLocal((long) 25200000);
        java.lang.String str9 = dateTimeZone1.getID();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.lang.String str12 = dateTimeZone11.getID();
        long long14 = dateTimeZone11.previousTransition((-1L));
        long long16 = dateTimeZone11.previousTransition(102L);
        long long18 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, 25199948L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone1.isLocalDateTimeGap(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "106) test0361(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "97) test0361(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "77) test0361(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky "51) test0361(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 102L + "'", long16 == 102L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 25199948L + "'", long18 == 25199948L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(115800000);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        java.util.TimeZone timeZone4 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 'a');
        int int12 = dateTimeZone8.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone13 = dateTimeZone8.toTimeZone();
        java.util.TimeZone timeZone14 = dateTimeZone8.toTimeZone();
        long long16 = dateTimeZone8.nextTransition((long) (short) -1);
        long long18 = dateTimeZone3.getMillisKeepLocal(dateTimeZone8, 110L);
        long long20 = dateTimeZone3.previousTransition((-35999899L));
        boolean boolean21 = dateTimeZone1.equals((java.lang.Object) long20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
// flaky "107) test0362(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky "98) test0362(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone14);
// flaky "78) test0362(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
// flaky "52) test0362(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 210L + "'", long18 == 210L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-35999899L) + "'", long20 == (-35999899L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+52:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+52:00\" is malformed at \"52:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        java.lang.String str5 = dateTimeZone1.getNameKey(1L);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        java.lang.String str9 = dateTimeZone1.getShortName(0L);
        java.lang.Class<?> wildcardClass10 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "108) test0365(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, true);
        java.lang.String str6 = dateTimeZone1.getShortName((-25200001L));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName(35999900L, locale8);
        java.lang.String str10 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        long long3 = dateTimeZone1.nextTransition((long) 36000000);
        java.lang.Object obj4 = dateTimeZone1.writeReplace();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        long long9 = dateTimeZone1.adjustOffset((-1570048923899L), true);
        java.lang.String str11 = dateTimeZone1.getShortName(389279900L);
        long long15 = dateTimeZone1.convertLocalToUTC((-115800065L), false, (-1570088524102L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 36000000L + "'", long3 == 36000000L);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1570048923899L) + "'", long9 == (-1570048923899L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.035" + "'", str11, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115800100L) + "'", long15 == (-115800100L));
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        long long3 = dateTimeZone1.previousTransition((long) '4');
        long long5 = dateTimeZone1.convertUTCToLocal(111L);
        long long7 = dateTimeZone1.convertUTCToLocal(9L);
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 360000111L + "'", long5 == 360000111L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 360000009L + "'", long7 == 360000009L);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+:0:00");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (short) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long6 = dateTimeZone1.previousTransition((-115800065L));
        java.lang.String str8 = dateTimeZone1.getShortName((-46800000L));
        java.lang.Class<?> wildcardClass9 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-115800065L) + "'", long6 == (-115800065L));
// flaky "109) test0369(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(36600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        java.lang.Class<?> wildcardClass4 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        int int10 = dateTimeZone1.getOffset(52L);
        long long13 = dateTimeZone1.convertLocalToUTC(1L, false);
        java.lang.String str14 = dateTimeZone1.toString();
        java.lang.Class<?> wildcardClass15 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "110) test0372(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
// flaky "99) test0372(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
// flaky "79) test0372(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-99L) + "'", long13 == (-99L));
// flaky "53) test0372(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, 115800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        int int5 = dateTimeZone1.getStandardOffset((long) (byte) 10);
        int int7 = dateTimeZone1.getStandardOffset(115799901L);
        boolean boolean9 = dateTimeZone1.isStandardOffset((long) ' ');
        java.lang.Object obj10 = null;
        boolean boolean11 = dateTimeZone1.equals(obj10);
        long long14 = dateTimeZone1.convertLocalToUTC(21600001L, true);
        boolean boolean16 = dateTimeZone1.isStandardOffset((-1570084924000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 21600002L + "'", long14 == 21600002L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean6 = dateTimeZone1.isFixed();
        long long8 = dateTimeZone1.previousTransition(115800000L);
        long long12 = dateTimeZone1.convertLocalToUTC(97L, true, (-35999903L));
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getName((long) '#', locale14);
        boolean boolean16 = dateTimeZone1.isFixed();
        long long18 = dateTimeZone1.convertUTCToLocal((-1569963004201L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 115800000L + "'", long8 == 115800000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3L) + "'", long12 == (-3L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1569963004101L) + "'", long18 == (-1569963004101L));
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+32:10");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+32:10\" is malformed at \"32:10\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (byte) 1, false);
        java.lang.String str7 = dateTimeZone1.getName(97L);
        int int9 = dateTimeZone1.getOffsetFromLocal((long) 1);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone1.isLocalDateTimeGap(localDateTime10);
        java.lang.String str13 = dateTimeZone1.getShortName((-168L));
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone1.isLocalDateTimeGap(localDateTime14);
        java.lang.String str17 = dateTimeZone1.getName((-25199903L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        int int8 = dateTimeZone1.getStandardOffset(0L);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        long long14 = dateTimeZone10.getMillisKeepLocal(dateTimeZone12, (long) 'a');
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone10.getName((long) (short) 1, locale16);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        java.lang.String str19 = dateTimeZone10.getID();
        boolean boolean20 = dateTimeZone1.equals((java.lang.Object) str19);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone1.isLocalDateTimeGap(localDateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.Object obj3 = dateTimeZone1.writeReplace();
        int int5 = dateTimeZone1.getOffset((long) (short) -1);
        boolean boolean6 = dateTimeZone1.isFixed();
        java.lang.String str7 = dateTimeZone1.getID();
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '-00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Object obj10 = dateTimeZone1.writeReplace();
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        java.lang.Class<?> wildcardClass12 = timeZone11.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        int int10 = dateTimeZone1.getOffset(52L);
        long long13 = dateTimeZone1.convertLocalToUTC(1L, false);
        long long16 = dateTimeZone1.adjustOffset((-35999799L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-35999799L) + "'", long16 == (-35999799L));
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        java.lang.String str17 = dateTimeZone3.getNameKey(115799900L);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone3.getShortName(10L, locale19);
        int int22 = dateTimeZone3.getOffsetFromLocal((-1569969124202L));
        int int24 = dateTimeZone3.getOffset(25199901L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+01:52");
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        long long7 = dateTimeZone3.getMillisKeepLocal(dateTimeZone5, (long) 'a');
        int int9 = dateTimeZone5.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone10 = dateTimeZone5.toTimeZone();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone5.getShortName((long) (byte) 100, locale12);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone5.getShortName((long) (short) 0, locale15);
        java.lang.String str17 = dateTimeZone5.getID();
        java.lang.String str18 = dateTimeZone5.toString();
        java.util.TimeZone timeZone19 = dateTimeZone5.toTimeZone();
        java.lang.String str20 = dateTimeZone5.toString();
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        long long24 = dateTimeZone22.nextTransition((long) (short) 100);
        int int26 = dateTimeZone22.getOffsetFromLocal(100L);
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone22.getName((-99L), locale28);
        long long31 = dateTimeZone5.getMillisKeepLocal(dateTimeZone22, 10L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        long long34 = dateTimeZone5.convertUTCToLocal((-1570084924100L));
        java.util.TimeZone timeZone35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        java.util.TimeZone timeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        long long40 = dateTimeZone36.getMillisKeepLocal(dateTimeZone38, (long) 'a');
        java.util.Locale locale42 = null;
        java.lang.String str43 = dateTimeZone36.getName((long) (short) 1, locale42);
        int int45 = dateTimeZone36.getOffset((long) 1);
        int int47 = dateTimeZone36.getOffset((long) '#');
        boolean boolean48 = dateTimeZone36.isFixed();
        long long50 = dateTimeZone5.getMillisKeepLocal(dateTimeZone36, (-35999799L));
        boolean boolean51 = dateTimeZone5.isFixed();
        long long53 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (-61199801L));
        org.joda.time.LocalDateTime localDateTime54 = null;
        boolean boolean55 = dateTimeZone5.isLocalDateTimeGap(localDateTime54);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-00:00:00.001" + "'", str29, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1570084924101L) + "'", long34 == (-1570084924101L));
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 97L + "'", long40 == 97L);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "-00:00:00.001" + "'", str43, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-35999799L) + "'", long50 == (-35999799L));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-54479800L) + "'", long53 == (-54479800L));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(6720000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        long long13 = dateTimeZone1.convertUTCToLocal(0L);
        long long15 = dateTimeZone1.convertUTCToLocal((long) (-3600000));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-3600001L) + "'", long15 == (-3600001L));
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.lang.String str9 = dateTimeZone8.getID();
        long long11 = dateTimeZone8.previousTransition((-1L));
        boolean boolean13 = dateTimeZone8.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone8.getName((long) (short) 0, locale15);
        long long18 = dateTimeZone8.nextTransition((long) ' ');
        int int20 = dateTimeZone8.getStandardOffset(115799900L);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, 110L);
        java.lang.Class<?> wildcardClass23 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 110L + "'", long22 == 110L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
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
        java.lang.String str16 = dateTimeZone3.getName((long) 'a');
        java.lang.String str17 = dateTimeZone3.getID();
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone3.getOffset(readableInstant18);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(115800000);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.lang.String str3 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+32:10" + "'", str3, "+32:10");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-00:00:00.001");
        long long3 = dateTimeZone1.convertUTCToLocal((-10800099L));
        long long6 = dateTimeZone1.adjustOffset((-35999900L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-10800100L) + "'", long3 == (-10800100L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-35999900L) + "'", long6 == (-35999900L));
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str3 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Class<?> wildcardClass6 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+10:00" + "'", str3, "+10:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36000000 + "'", int5 == 36000000);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.Object obj3 = dateTimeZone1.writeReplace();
        boolean boolean5 = dateTimeZone1.isStandardOffset(360000000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName((long) 25200000);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.TimeZone timeZone4 = dateTimeZone0.toTimeZone();
        java.lang.Class<?> wildcardClass5 = timeZone4.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 10);
        int int4 = dateTimeZone2.getStandardOffset((long) 10);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        long long13 = dateTimeZone9.getMillisKeepLocal(dateTimeZone11, (long) 'a');
        int int15 = dateTimeZone11.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone16 = dateTimeZone11.toTimeZone();
        java.util.TimeZone timeZone17 = dateTimeZone11.toTimeZone();
        long long19 = dateTimeZone11.nextTransition((long) (short) -1);
        long long21 = dateTimeZone6.getMillisKeepLocal(dateTimeZone11, 110L);
        long long23 = dateTimeZone2.getMillisKeepLocal(dateTimeZone6, (-1570048923900L));
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        long long29 = dateTimeZone25.getMillisKeepLocal(dateTimeZone27, (long) 'a');
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone25.getName((long) (short) 1, locale31);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        long long39 = dateTimeZone35.getMillisKeepLocal(dateTimeZone37, (long) 'a');
        int int41 = dateTimeZone37.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone42 = dateTimeZone37.toTimeZone();
        java.util.TimeZone timeZone43 = dateTimeZone37.toTimeZone();
        long long45 = dateTimeZone37.convertUTCToLocal(0L);
        long long47 = dateTimeZone25.getMillisKeepLocal(dateTimeZone37, (long) (short) -1);
        long long50 = dateTimeZone25.convertLocalToUTC((-1570084924001L), false);
        boolean boolean51 = dateTimeZone2.equals((java.lang.Object) (-1570084924001L));
        org.joda.time.ReadableInstant readableInstant52 = null;
        int int53 = dateTimeZone2.getOffset(readableInstant52);
        java.lang.Class<?> wildcardClass54 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
// flaky "111) test0393(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36600000 + "'", int15 == 36600000);
        org.junit.Assert.assertNotNull(timeZone16);
// flaky "100) test0393(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+10:10");
        org.junit.Assert.assertNotNull(timeZone17);
// flaky "80) test0393(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+10:10");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
// flaky "54) test0393(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-36599790L) + "'", long21 == (-36599790L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1569933124000L) + "'", long23 == (-1569933124000L));
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 97L + "'", long29 == 97L);
// flaky "35) test0393(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+10:10" + "'", str32, "+10:10");
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 97L + "'", long39 == 97L);
// flaky "27) test0393(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 36600000 + "'", int41 == 36600000);
        org.junit.Assert.assertNotNull(timeZone42);
// flaky "17) test0393(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "GMT+10:10");
        org.junit.Assert.assertNotNull(timeZone43);
// flaky "11) test0393(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "GMT+10:10");
// flaky "6) test0393(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long45 + "' != '" + 36600000L + "'", long45 == 36600000L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
// flaky "4) test0393(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1570121524001L) + "'", long50 == (-1570121524001L));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 115800000 + "'", int53 == 115800000);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 'a');
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone6.getName((long) (short) 1, locale12);
        boolean boolean15 = dateTimeZone6.equals((java.lang.Object) false);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone6.getName((long) 100, locale17);
        long long20 = dateTimeZone6.convertUTCToLocal((-1570084924101L));
        int int22 = dateTimeZone6.getOffsetFromLocal((-1570084924001L));
        int int24 = dateTimeZone6.getOffsetFromLocal(25200001L);
        long long26 = dateTimeZone6.convertUTCToLocal((-1570048924000L));
        long long28 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, 25199999L);
        org.joda.time.ReadableInstant readableInstant29 = null;
        int int30 = dateTimeZone6.getOffset(readableInstant29);
        int int32 = dateTimeZone6.getStandardOffset(35999899L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "112) test0394(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:10" + "'", str2, "+10:10");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
// flaky "101) test0394(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+10:10" + "'", str13, "+10:10");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky "81) test0394(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+10:10" + "'", str18, "+10:10");
// flaky "55) test0394(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1570048324101L) + "'", long20 == (-1570048324101L));
// flaky "36) test0394(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 36600000 + "'", int22 == 36600000);
// flaky "28) test0394(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 36600000 + "'", int24 == 36600000);
// flaky "18) test0394(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1570012324000L) + "'", long26 == (-1570012324000L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 25199999L + "'", long28 == 25199999L);
// flaky "12) test0394(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 36600000 + "'", int30 == 36600000);
// flaky "7) test0394(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 36600000 + "'", int32 == 36600000);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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
        int int17 = dateTimeZone3.getOffsetFromLocal(25200000L);
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone3.getOffset(readableInstant18);
        int int21 = dateTimeZone3.getStandardOffset((long) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "113) test0395(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36600000 + "'", int7 == 36600000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "102) test0395(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:10");
// flaky "82) test0395(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:10" + "'", str11, "+10:10");
// flaky "56) test0395(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:10" + "'", str14, "+10:10");
// flaky "37) test0395(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+10:10" + "'", str15, "+10:10");
// flaky "29) test0395(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36600000 + "'", int17 == 36600000);
// flaky "19) test0395(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 36600000 + "'", int19 == 36600000);
// flaky "13) test0395(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 36600000 + "'", int21 == 36600000);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.lang.String str9 = dateTimeZone8.getID();
        long long11 = dateTimeZone8.previousTransition((-1L));
        boolean boolean13 = dateTimeZone8.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone8.getName((long) (short) 0, locale15);
        long long18 = dateTimeZone8.nextTransition((long) ' ');
        int int20 = dateTimeZone8.getStandardOffset(115799900L);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, 110L);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone8.getName((-35999890L), locale24);
        long long27 = dateTimeZone8.previousTransition(115800000L);
        long long29 = dateTimeZone8.nextTransition(45L);
        long long31 = dateTimeZone8.convertUTCToLocal(18480001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 110L + "'", long22 == 110L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 115800000L + "'", long27 == 115800000L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 45L + "'", long29 == 45L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 18480101L + "'", long31 == 18480101L);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        java.lang.String str16 = dateTimeZone3.toString();
        java.util.TimeZone timeZone17 = dateTimeZone3.toTimeZone();
        java.lang.String str18 = dateTimeZone3.toString();
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        long long22 = dateTimeZone20.nextTransition((long) (short) 100);
        int int24 = dateTimeZone20.getOffsetFromLocal(100L);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone20.getName((-99L), locale26);
        long long29 = dateTimeZone3.getMillisKeepLocal(dateTimeZone20, 10L);
        long long31 = dateTimeZone3.nextTransition((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant32 = null;
        int int33 = dateTimeZone3.getOffset(readableInstant32);
        long long36 = dateTimeZone3.adjustOffset(359999900L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 359999900L + "'", long36 == 359999900L);
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
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getShortName((long) (short) 0, locale13);
        java.lang.String str15 = dateTimeZone3.getID();
        java.lang.String str17 = dateTimeZone3.getNameKey(115799900L);
        boolean boolean19 = dateTimeZone3.isStandardOffset(110L);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        boolean boolean22 = dateTimeZone21.isFixed();
        long long24 = dateTimeZone3.getMillisKeepLocal(dateTimeZone21, (-1570048923900L));
        java.lang.String str25 = dateTimeZone3.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1570048923800L) + "'", long24 == (-1570048923800L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) false);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((long) 100, locale12);
        long long15 = dateTimeZone1.convertUTCToLocal((-1570084924101L));
        int int17 = dateTimeZone1.getOffsetFromLocal((-1570084924001L));
        int int19 = dateTimeZone1.getOffsetFromLocal(25200001L);
        java.lang.String str20 = dateTimeZone1.getID();
        long long22 = dateTimeZone1.previousTransition((-45L));
        boolean boolean24 = dateTimeZone1.isStandardOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570084924001L) + "'", long15 == (-1570084924001L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-45L) + "'", long22 == (-45L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long8 = dateTimeZone5.convertLocalToUTC((long) 1, true);
        int int10 = dateTimeZone5.getOffset((long) 115800000);
        int int12 = dateTimeZone5.getStandardOffset((long) 10);
        java.lang.Object obj13 = dateTimeZone5.writeReplace();
        boolean boolean14 = dateTimeZone1.equals((java.lang.Object) dateTimeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-99L) + "'", long8 == (-99L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
        java.lang.String str16 = dateTimeZone3.toString();
        java.util.TimeZone timeZone17 = dateTimeZone3.toTimeZone();
        java.lang.String str18 = dateTimeZone3.toString();
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        long long22 = dateTimeZone20.nextTransition((long) (short) 100);
        int int24 = dateTimeZone20.getOffsetFromLocal(100L);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone20.getName((-99L), locale26);
        long long29 = dateTimeZone3.getMillisKeepLocal(dateTimeZone20, 10L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone3.getName((-1570048923801L), locale32);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.010" + "'", str11, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.010" + "'", str15, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.010" + "'", str16, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.010" + "'", str18, "+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.010" + "'", str27, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.010" + "'", str33, "+00:00:00.010");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Object obj6 = dateTimeZone1.writeReplace();
        java.lang.Object obj7 = dateTimeZone1.writeReplace();
        boolean boolean8 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        long long15 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, (long) 'a');
        int int17 = dateTimeZone13.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone18 = dateTimeZone13.toTimeZone();
        java.util.TimeZone timeZone19 = dateTimeZone13.toTimeZone();
        long long21 = dateTimeZone13.convertUTCToLocal(0L);
        boolean boolean23 = dateTimeZone13.equals((java.lang.Object) 100);
        long long25 = dateTimeZone13.previousTransition(0L);
        long long27 = dateTimeZone1.getMillisKeepLocal(dateTimeZone13, (-1570084924101L));
        long long29 = dateTimeZone13.previousTransition(115800009L);
        org.joda.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = dateTimeZone13.isLocalDateTimeGap(localDateTime30);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1570084924101L) + "'", long27 == (-1570084924101L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 115800009L + "'", long29 == 115800009L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 349800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 349800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long4 = dateTimeZone0.convertLocalToUTC((long) 3600000, false, (-25200001L));
        java.util.TimeZone timeZone5 = dateTimeZone0.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.010' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3599990L + "'", long4 == 3599990L);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(360000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        int int4 = dateTimeZone1.getOffset((-1570084923900L));
        java.lang.String str6 = dateTimeZone1.getName((-67L));
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        long long10 = dateTimeZone1.previousTransition((-1570091644001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.010" + "'", str2, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.010" + "'", str6, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1570091644001L) + "'", long10 == (-1570091644001L));
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
        java.lang.String str21 = dateTimeZone3.getShortName((-1570084924000L));
        int int23 = dateTimeZone3.getStandardOffset(32L);
        java.lang.Object obj24 = dateTimeZone3.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.010" + "'", str11, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.010" + "'", str19, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.010" + "'", str21, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        long long8 = dateTimeZone4.getMillisKeepLocal(dateTimeZone6, (long) 'a');
        int int10 = dateTimeZone6.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone11 = dateTimeZone6.toTimeZone();
        java.util.TimeZone timeZone12 = dateTimeZone6.toTimeZone();
        long long14 = dateTimeZone6.nextTransition((long) (short) -1);
        long long16 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, 110L);
        boolean boolean18 = dateTimeZone1.isStandardOffset((long) (short) -1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Class<?> wildcardClass20 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 200L + "'", long16 == 200L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
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
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone3.getName((long) (short) 10, locale11);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone3.getName((long) '#', locale14);
        long long19 = dateTimeZone3.convertLocalToUTC((-35999799L), true, (-36000299L));
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone3.isLocalDateTimeGap(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-35999899L) + "'", long19 == (-35999899L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.convertUTCToLocal(0L);
        int int13 = dateTimeZone3.getOffset((-1570048924001L));
        int int15 = dateTimeZone3.getOffset(10L);
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
        java.lang.String str37 = dateTimeZone19.getShortName((-1570084924000L));
        boolean boolean38 = dateTimeZone3.equals((java.lang.Object) dateTimeZone19);
        java.lang.String str39 = dateTimeZone19.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.100" + "'", str30, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.100" + "'", str33, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.100" + "'", str35, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00:00.100" + "'", str37, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.100" + "'", str39, "+00:00:00.100");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        int int4 = dateTimeZone1.getStandardOffset(0L);
        boolean boolean5 = dateTimeZone1.isFixed();
        java.lang.String str7 = dateTimeZone1.getShortName(100L);
        java.lang.Class<?> wildcardClass8 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
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
        int int14 = dateTimeZone3.getOffsetFromLocal((long) (byte) 1);
        long long16 = dateTimeZone3.convertUTCToLocal((-99L));
        java.util.TimeZone timeZone17 = dateTimeZone3.toTimeZone();
        long long20 = dateTimeZone3.adjustOffset(25199899L, false);
        long long22 = dateTimeZone3.nextTransition((-35999948L));
        java.lang.String str24 = dateTimeZone3.getName(36599968L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25199899L + "'", long20 == 25199899L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-35999948L) + "'", long22 == (-35999948L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        int int3 = dateTimeZone1.getOffset(111L);
        long long6 = dateTimeZone1.adjustOffset((long) 349800000, true);
        int int8 = dateTimeZone1.getOffsetFromLocal(135L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName(35L, locale10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 349800000L + "'", long6 == 349800000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        long long3 = dateTimeZone1.nextTransition((long) 36000000);
        java.lang.Object obj4 = dateTimeZone1.writeReplace();
        java.lang.Class<?> wildcardClass5 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 36000000L + "'", long3 == 36000000L);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC(25200000L, true, 100L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName((-1L), locale10);
        boolean boolean12 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        long long18 = dateTimeZone14.getMillisKeepLocal(dateTimeZone16, (long) 'a');
        int int20 = dateTimeZone16.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone21 = dateTimeZone16.toTimeZone();
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone16.getShortName((long) (byte) 100, locale23);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone16.getShortName((long) (short) 0, locale26);
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone16.getName((long) (short) 100, locale29);
        boolean boolean31 = dateTimeZone1.equals((java.lang.Object) locale29);
        java.util.TimeZone timeZone32 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.100' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25199900L + "'", long8 == 25199900L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.100" + "'", str30, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(25200000);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 1, false, (long) 25200000);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (-1), locale7);
        java.lang.Class<?> wildcardClass9 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-25199999L) + "'", long5 == (-25199999L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+07:00" + "'", str8, "+07:00");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.getID();
        long long6 = dateTimeZone3.previousTransition((-1L));
        long long10 = dateTimeZone3.convertLocalToUTC(25200000L, true, 100L);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 100L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        long long16 = dateTimeZone1.getMillisKeepLocal(dateTimeZone14, 97L);
        long long18 = dateTimeZone1.previousTransition((-67L));
        java.lang.String str20 = dateTimeZone1.getNameKey(18480101L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 25199900L + "'", long10 == 25199900L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-3599902L) + "'", long16 == (-3599902L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-67L) + "'", long18 == (-67L));
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.lang.String str9 = dateTimeZone8.getID();
        long long11 = dateTimeZone8.previousTransition((-1L));
        boolean boolean13 = dateTimeZone8.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone8.getName((long) (short) 0, locale15);
        long long18 = dateTimeZone8.nextTransition((long) ' ');
        int int20 = dateTimeZone8.getStandardOffset(115799900L);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, 110L);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone8.getName((-35999890L), locale24);
        java.lang.String str27 = dateTimeZone8.getNameKey((-35999688L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 110L + "'", long22 == 110L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        long long4 = dateTimeZone1.nextTransition(98L);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 'a');
        int int12 = dateTimeZone8.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone13 = dateTimeZone8.toTimeZone();
        java.lang.String str15 = dateTimeZone8.getNameKey((long) 10);
        boolean boolean16 = dateTimeZone1.equals((java.lang.Object) dateTimeZone8);
        long long19 = dateTimeZone8.convertLocalToUTC(10L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-90L) + "'", long19 == (-90L));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffsetFromLocal(25199999L);
        java.lang.String str5 = dateTimeZone1.getNameKey((-115800100L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        int int10 = dateTimeZone1.getOffset((long) (short) 1);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((-1570084924202L), locale12);
        int int15 = dateTimeZone1.getStandardOffset(35L);
        long long18 = dateTimeZone1.adjustOffset((long) '#', true);
        java.lang.String str20 = dateTimeZone1.getShortName((-35999948L));
        long long24 = dateTimeZone1.convertLocalToUTC(25200001L, false, 115799798L);
        java.lang.String str26 = dateTimeZone1.getName(395999900L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 25199901L + "'", long24 == 25199901L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.100" + "'", str26, "+00:00:00.100");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        long long18 = dateTimeZone3.convertLocalToUTC(0L, true);
        long long21 = dateTimeZone3.convertLocalToUTC((-35999699L), false);
        int int23 = dateTimeZone3.getOffsetFromLocal(187199902L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-100L) + "'", long18 == (-100L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-35999799L) + "'", long21 == (-35999799L));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(25200000, 6720000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 6720000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(6720000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(6720000, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        long long8 = dateTimeZone1.convertLocalToUTC((-1570084924100L), true, 1L);
        java.lang.Class<?> wildcardClass9 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1570084924099L) + "'", long8 == (-1570084924099L));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 10);
        java.lang.String str4 = dateTimeZone2.getShortName((-36599790L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+100:10" + "'", str4, "+100:10");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC(25200000L, true, 100L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName(18480001L, locale10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25199900L + "'", long8 == 25199900L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
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
        java.lang.String str24 = dateTimeZone13.toString();
        org.joda.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = dateTimeZone13.isLocalDateTimeGap(localDateTime25);
        long long29 = dateTimeZone13.adjustOffset(359999901L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 359999901L + "'", long29 == 359999901L);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        java.lang.String str6 = dateTimeZone5.getID();
        long long8 = dateTimeZone5.previousTransition((-1L));
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        long long14 = dateTimeZone10.getMillisKeepLocal(dateTimeZone12, (long) 'a');
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone10.getName((long) (short) 1, locale16);
        boolean boolean19 = dateTimeZone10.equals((java.lang.Object) false);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone10.getName((long) 100, locale21);
        long long24 = dateTimeZone10.convertUTCToLocal((-1570084924101L));
        int int26 = dateTimeZone10.getOffsetFromLocal((-1570084924001L));
        int int28 = dateTimeZone10.getOffsetFromLocal(25200001L);
        long long30 = dateTimeZone10.convertUTCToLocal((-1570048924000L));
        long long32 = dateTimeZone5.getMillisKeepLocal(dateTimeZone10, 25199999L);
        org.joda.time.ReadableInstant readableInstant33 = null;
        int int34 = dateTimeZone10.getOffset(readableInstant33);
        long long38 = dateTimeZone10.convertLocalToUTC((-100L), true, (long) 'a');
        boolean boolean39 = dateTimeZone1.equals((java.lang.Object) (-100L));
        long long42 = dateTimeZone1.adjustOffset((-3599802L), false);
        int int44 = dateTimeZone1.getOffsetFromLocal((-223199900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1570084924001L) + "'", long24 == (-1570084924001L));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1570048923900L) + "'", long30 == (-1570048923900L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 25199999L + "'", long32 == 25199999L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-200L) + "'", long38 == (-200L));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-3599802L) + "'", long42 == (-3599802L));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 35);
        long long6 = dateTimeZone2.convertLocalToUTC(187200000L, false, (-360000068L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-174900000L) + "'", long6 == (-174900000L));
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        long long12 = dateTimeZone1.previousTransition((long) (short) 100);
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        java.lang.Class<?> wildcardClass14 = timeZone13.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        java.lang.String str3 = dateTimeZone1.getNameKey((-201L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
        long long21 = dateTimeZone3.nextTransition(1L);
        java.lang.String str23 = dateTimeZone3.getNameKey((long) 115800000);
        long long25 = dateTimeZone3.nextTransition((-1570048923900L));
        java.lang.String str26 = dateTimeZone3.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "114) test0434(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
// flaky "103) test0434(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "83) test0434(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
// flaky "57) test0434(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
// flaky "38) test0434(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1570048923900L) + "'", long25 == (-1570048923900L));
// flaky "30) test0434(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-00:00:00.001" + "'", str26, "-00:00:00.001");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        int int14 = dateTimeZone3.getOffsetFromLocal((long) (byte) 1);
        int int16 = dateTimeZone3.getStandardOffset((long) 115800000);
        boolean boolean18 = dateTimeZone3.isStandardOffset((-99L));
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        long long24 = dateTimeZone20.getMillisKeepLocal(dateTimeZone22, (long) 'a');
        boolean boolean25 = dateTimeZone20.isFixed();
        int int27 = dateTimeZone20.getStandardOffset((-1L));
        java.lang.String str29 = dateTimeZone20.getShortName(25199900L);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj32 = dateTimeZone31.writeReplace();
        long long36 = dateTimeZone31.convertLocalToUTC((long) 25200000, true, (long) (short) 10);
        int int38 = dateTimeZone31.getStandardOffset(115799900L);
        long long40 = dateTimeZone20.getMillisKeepLocal(dateTimeZone31, (-25200001L));
        java.lang.String str41 = dateTimeZone31.getID();
        java.lang.String str43 = dateTimeZone31.getName(35L);
        long long45 = dateTimeZone3.getMillisKeepLocal(dateTimeZone31, 0L);
        boolean boolean46 = dateTimeZone31.isFixed();
        java.lang.String str47 = dateTimeZone31.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "115) test0435(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
// flaky "104) test0435(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
// flaky "84) test0435(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
// flaky "58) test0435(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
// flaky "39) test0435(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
// flaky "31) test0435(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.001" + "'", str29, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 25199999L + "'", long36 == 25199999L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
// flaky "20) test0435(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-25200001L) + "'", long40 == (-25200001L));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00:00.001" + "'", str41, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+00:00:00.001" + "'", str43, "+00:00:00.001");
// flaky "14) test0435(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:00:00.001" + "'", str47, "+00:00:00.001");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        int int10 = dateTimeZone1.getStandardOffset((long) 0);
        long long12 = dateTimeZone1.convertUTCToLocal((-1570120924102L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1570120924103L) + "'", long12 == (-1570120924103L));
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        java.lang.String str5 = dateTimeZone1.toString();
        long long9 = dateTimeZone1.convertLocalToUTC((-39599899L), true, (-25199901L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-39599898L) + "'", long9 == (-39599898L));
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        int int8 = dateTimeZone1.getOffsetFromLocal((long) 25200000);
        long long12 = dateTimeZone1.convertLocalToUTC(9L, true, (-67L));
        java.lang.String str13 = dateTimeZone1.getID();
        boolean boolean15 = dateTimeZone1.isStandardOffset(10L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) (byte) 1, false);
        java.lang.String str7 = dateTimeZone1.getName(97L);
        int int9 = dateTimeZone1.getOffsetFromLocal((long) 1);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone1.isLocalDateTimeGap(localDateTime10);
        java.lang.String str13 = dateTimeZone1.getShortName((-168L));
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone1.isLocalDateTimeGap(localDateTime14);
        long long17 = dateTimeZone1.previousTransition((-3599902L));
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getName(134L, locale19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-3599902L) + "'", long17 == (-3599902L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.001" + "'", str20, "+00:00:00.001");
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
        long long25 = dateTimeZone1.convertUTCToLocal((-1570084924000L));
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone1.getName(32L, locale27);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone1.getName(36000000L, locale30);
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone1.getShortName(395999900L, locale33);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1570084924001L) + "'", long25 == (-1570084924001L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-00:00:00.001" + "'", str28, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-00:00:00.001" + "'", str31, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-00:00:00.001" + "'", str34, "-00:00:00.001");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC(25200000L, true, 100L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName((-1L), locale10);
        boolean boolean12 = dateTimeZone1.isFixed();
        java.lang.String str13 = dateTimeZone1.getID();
        java.lang.Object obj14 = dateTimeZone1.writeReplace();
        long long18 = dateTimeZone1.convertLocalToUTC((long) 36600000, true, (-47L));
        java.util.TimeZone timeZone19 = dateTimeZone1.toTimeZone();
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = dateTimeZone1.getOffset(readableInstant20);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone1.getShortName((long) 1, locale23);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25200001L + "'", long8 == 25200001L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 36600001L + "'", long18 == 36600001L);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-00:00:00.001" + "'", str24, "-00:00:00.001");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.lang.String str9 = dateTimeZone8.getID();
        long long11 = dateTimeZone8.previousTransition((-1L));
        boolean boolean13 = dateTimeZone8.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone8.getName((long) (short) 0, locale15);
        long long18 = dateTimeZone8.nextTransition((long) ' ');
        int int20 = dateTimeZone8.getStandardOffset(115799900L);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, 110L);
        java.lang.Class<?> wildcardClass23 = dateTimeZone8.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 110L + "'", long22 == 110L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) false);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((long) 100, locale12);
        long long15 = dateTimeZone1.convertUTCToLocal((-1570084924101L));
        int int17 = dateTimeZone1.getOffsetFromLocal((-1570084924001L));
        int int19 = dateTimeZone1.getOffsetFromLocal(25200001L);
        java.lang.String str20 = dateTimeZone1.getID();
        java.lang.String str22 = dateTimeZone1.getShortName(0L);
        java.util.TimeZone timeZone23 = dateTimeZone1.toTimeZone();
        long long25 = dateTimeZone1.convertUTCToLocal((-35999901L));
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        long long31 = dateTimeZone27.getMillisKeepLocal(dateTimeZone29, (long) 'a');
        int int33 = dateTimeZone29.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone34 = dateTimeZone29.toTimeZone();
        java.util.TimeZone timeZone35 = dateTimeZone29.toTimeZone();
        long long37 = dateTimeZone29.convertUTCToLocal(0L);
        boolean boolean39 = dateTimeZone29.equals((java.lang.Object) 100);
        long long41 = dateTimeZone29.convertUTCToLocal((long) 10);
        java.util.TimeZone timeZone42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        long long45 = dateTimeZone43.nextTransition((long) (short) 100);
        java.lang.String str47 = dateTimeZone43.getNameKey(1L);
        boolean boolean48 = dateTimeZone29.equals((java.lang.Object) str47);
        long long52 = dateTimeZone29.convertLocalToUTC(0L, false, 32L);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        long long56 = dateTimeZone29.getMillisKeepLocal(dateTimeZone54, 25199899L);
        java.lang.Object obj57 = dateTimeZone29.writeReplace();
        boolean boolean58 = dateTimeZone1.equals(obj57);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "116) test0443(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:52" + "'", str8, "+01:52");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "105) test0443(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+01:52" + "'", str13, "+01:52");
// flaky "85) test0443(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570078204101L) + "'", long15 == (-1570078204101L));
// flaky "59) test0443(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6720000 + "'", int17 == 6720000);
// flaky "40) test0443(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6720000 + "'", int19 == 6720000);
// flaky "32) test0443(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+01:52" + "'", str20, "+01:52");
// flaky "21) test0443(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+01:52" + "'", str22, "+01:52");
        org.junit.Assert.assertNotNull(timeZone23);
// flaky "15) test0443(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+01:52");
// flaky "8) test0443(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-29279901L) + "'", long25 == (-29279901L));
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 97L + "'", long31 == 97L);
// flaky "5) test0443(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6720000 + "'", int33 == 6720000);
        org.junit.Assert.assertNotNull(timeZone34);
// flaky "2) test0443(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "GMT+01:52");
        org.junit.Assert.assertNotNull(timeZone35);
// flaky "1) test0443(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "GMT+01:52");
// flaky "1) test0443(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 6720000L + "'", long37 == 6720000L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
// flaky "1) test0443(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 6720010L + "'", long41 == 6720010L);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 100L + "'", long45 == 100L);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
// flaky "1) test0443(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-6720000L) + "'", long52 == (-6720000L));
        org.junit.Assert.assertNotNull(dateTimeZone54);
// flaky "1) test0443(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long56 + "' != '" + 31919900L + "'", long56 == 31919900L);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        java.lang.Object obj2 = null;
        boolean boolean3 = dateTimeZone1.equals(obj2);
        long long6 = dateTimeZone1.adjustOffset(25199900L, false);
        long long10 = dateTimeZone1.convertLocalToUTC((-1570444923900L), false, (-25200103L));
        java.lang.String str12 = dateTimeZone1.getName((long) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 25199900L + "'", long6 == 25199900L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1570444923901L) + "'", long10 == (-1570444923901L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) false);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((long) 100, locale12);
        long long15 = dateTimeZone1.convertUTCToLocal((-1570084924101L));
        int int17 = dateTimeZone1.getOffsetFromLocal((-1570084924001L));
        int int19 = dateTimeZone1.getOffsetFromLocal(25200001L);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        long long23 = dateTimeZone21.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone21.getOffset(readableInstant24);
        java.lang.String str26 = dateTimeZone21.toString();
        java.lang.String str27 = dateTimeZone21.toString();
        int int29 = dateTimeZone21.getOffset((-1570084924000L));
        boolean boolean30 = dateTimeZone1.equals((java.lang.Object) int29);
        java.lang.String str31 = dateTimeZone1.toString();
        java.lang.String str33 = dateTimeZone1.getNameKey(0L);
        boolean boolean35 = dateTimeZone1.equals((java.lang.Object) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone38 = dateTimeZone37.toTimeZone();
        int int40 = dateTimeZone37.getStandardOffset(0L);
        long long43 = dateTimeZone37.adjustOffset((-1570084924100L), false);
        long long47 = dateTimeZone37.convertLocalToUTC(115800000L, false, (-1570084924202L));
        long long49 = dateTimeZone1.getMillisKeepLocal(dateTimeZone37, (-1570048924000L));
        org.joda.time.LocalDateTime localDateTime50 = null;
        boolean boolean51 = dateTimeZone37.isLocalDateTimeGap(localDateTime50);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "117) test0445(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:52" + "'", str8, "+01:52");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "106) test0445(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+01:52" + "'", str13, "+01:52");
// flaky "86) test0445(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1570078204101L) + "'", long15 == (-1570078204101L));
// flaky "60) test0445(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6720000 + "'", int17 == 6720000);
// flaky "41) test0445(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6720000 + "'", int19 == 6720000);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
// flaky "33) test0445(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6720000 + "'", int25 == 6720000);
// flaky "22) test0445(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+01:52" + "'", str26, "+01:52");
// flaky "16) test0445(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+01:52" + "'", str27, "+01:52");
// flaky "9) test0445(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 6720000 + "'", int29 == 6720000);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky "6) test0445(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+01:52" + "'", str31, "+01:52");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1570084924100L) + "'", long43 == (-1570084924100L));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 115799999L + "'", long47 == 115799999L);
// flaky "3) test0445(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1570042204001L) + "'", long49 == (-1570042204001L));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
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
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.convertUTCToLocal(0L);
        boolean boolean13 = dateTimeZone3.equals((java.lang.Object) 100);
        java.lang.String str15 = dateTimeZone3.getName(53L);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone3.getName((-10800100L), locale17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "118) test0446(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6720000 + "'", int7 == 6720000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "107) test0446(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:52");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "87) test0446(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+01:52");
// flaky "61) test0446(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 6720000L + "'", long11 == 6720000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "42) test0446(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+01:52" + "'", str15, "+01:52");
// flaky "34) test0446(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+01:52" + "'", str18, "+01:52");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        int int14 = dateTimeZone3.getOffsetFromLocal((long) (byte) 1);
        long long16 = dateTimeZone3.convertUTCToLocal((-99L));
        java.util.TimeZone timeZone17 = dateTimeZone3.toTimeZone();
        long long20 = dateTimeZone3.adjustOffset(25199899L, false);
        long long22 = dateTimeZone3.nextTransition((-35999948L));
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        java.lang.String str25 = dateTimeZone24.toString();
        long long27 = dateTimeZone3.getMillisKeepLocal(dateTimeZone24, 349800000L);
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone24.getName((-25199999L), locale29);
        java.util.TimeZone timeZone31 = dateTimeZone24.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone32 = null; // flaky "119) test0447(org.joda.time.RegressionTest0)": org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "108) test0447(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6720000 + "'", int7 == 6720000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "88) test0447(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:52");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "62) test0447(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+01:52");
// flaky "43) test0447(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+01:52" + "'", str12, "+01:52");
// flaky "35) test0447(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6720000 + "'", int14 == 6720000);
// flaky "23) test0447(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 6719901L + "'", long16 == 6719901L);
        org.junit.Assert.assertNotNull(timeZone17);
// flaky "17) test0447(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+01:52");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25199899L + "'", long20 == 25199899L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-35999948L) + "'", long22 == (-35999948L));
        org.junit.Assert.assertNotNull(dateTimeZone24);
// flaky "10) test0447(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+01:52" + "'", str25, "+01:52");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 349800000L + "'", long27 == 349800000L);
// flaky "7) test0447(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+01:52" + "'", str30, "+01:52");
        org.junit.Assert.assertNotNull(timeZone31);
// flaky "4) test0447(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "GMT+01:52");
// flaky "2) test0447(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNotNull(dateTimeZone32);
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
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone3.getName((long) (short) 10, locale11);
        int int14 = dateTimeZone3.getOffsetFromLocal((long) (byte) 1);
        boolean boolean16 = dateTimeZone3.isStandardOffset(0L);
        long long19 = dateTimeZone3.adjustOffset((-1570078204101L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "120) test0448(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6720000 + "'", int7 == 6720000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "109) test0448(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:52");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "89) test0448(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+01:52");
// flaky "63) test0448(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+01:52" + "'", str12, "+01:52");
// flaky "44) test0448(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6720000 + "'", int14 == 6720000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1570078204101L) + "'", long19 == (-1570078204101L));
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.nextTransition((long) 1);
        int int13 = dateTimeZone3.getOffsetFromLocal(35999999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "121) test0449(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6720000 + "'", int7 == 6720000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "110) test0449(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:52");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "90) test0449(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+01:52");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
// flaky "64) test0449(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6720000 + "'", int13 == 6720000);
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
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getShortName((long) (short) 0, locale13);
        java.lang.String str15 = dateTimeZone3.getID();
        java.lang.String str16 = dateTimeZone3.toString();
        java.util.TimeZone timeZone17 = dateTimeZone3.toTimeZone();
        java.lang.String str18 = dateTimeZone3.toString();
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        long long22 = dateTimeZone20.nextTransition((long) (short) 100);
        int int24 = dateTimeZone20.getOffsetFromLocal(100L);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone20.getName((-99L), locale26);
        long long29 = dateTimeZone3.getMillisKeepLocal(dateTimeZone20, 10L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        java.lang.String str32 = dateTimeZone3.getShortName((-1569724924201L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "122) test0450(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6720000 + "'", int7 == 6720000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "111) test0450(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:52");
// flaky "91) test0450(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:52" + "'", str11, "+01:52");
// flaky "65) test0450(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:52" + "'", str14, "+01:52");
// flaky "45) test0450(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+01:52" + "'", str15, "+01:52");
// flaky "36) test0450(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+01:52" + "'", str16, "+01:52");
        org.junit.Assert.assertNotNull(timeZone17);
// flaky "24) test0450(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+01:52");
// flaky "18) test0450(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+01:52" + "'", str18, "+01:52");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
// flaky "11) test0450(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6720000 + "'", int24 == 6720000);
// flaky "8) test0450(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+01:52" + "'", str27, "+01:52");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
// flaky "5) test0450(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+01:52" + "'", str32, "+01:52");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.Object obj3 = dateTimeZone1.writeReplace();
        int int5 = dateTimeZone1.getOffset((long) (short) -1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) 36000000);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName((long) 25200000, locale9);
        long long12 = dateTimeZone1.previousTransition(359999900L);
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 359999900L + "'", long12 == 359999900L);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        long long15 = dateTimeZone1.adjustOffset((-90L), false);
        long long17 = dateTimeZone1.convertUTCToLocal((long) 115800000);
        int int19 = dateTimeZone1.getOffset(323999901L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "123) test0452(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:00" + "'", str8, "+01:00");
// flaky "112) test0452(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+01:00" + "'", str12, "+01:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-90L) + "'", long15 == (-90L));
// flaky "92) test0452(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 119400000L + "'", long17 == 119400000L);
// flaky "66) test0452(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3600000 + "'", int19 == 3600000);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 0, locale8);
        long long11 = dateTimeZone1.nextTransition((long) ' ');
        long long15 = dateTimeZone1.convertLocalToUTC((long) '4', false, 115799900L);
        long long19 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 36000000L);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        java.lang.String str24 = dateTimeZone23.getID();
        long long26 = dateTimeZone23.previousTransition((-1L));
        long long30 = dateTimeZone23.convertLocalToUTC(25200000L, true, 100L);
        long long32 = dateTimeZone21.getMillisKeepLocal(dateTimeZone23, 100L);
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone21.getShortName((long) (short) 10, locale34);
        boolean boolean37 = dateTimeZone21.isStandardOffset(25200001L);
        long long39 = dateTimeZone1.getMillisKeepLocal(dateTimeZone21, (-1570084924100L));
        java.util.Locale locale41 = null;
        java.lang.String str42 = dateTimeZone21.getShortName(115800054L, locale41);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "124) test0453(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:00" + "'", str2, "+01:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "113) test0453(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+01:00" + "'", str9, "+01:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky "93) test0453(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-3599948L) + "'", long15 == (-3599948L));
// flaky "67) test0453(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-3600001L) + "'", long19 == (-3600001L));
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
// flaky "46) test0453(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+01:00" + "'", str24, "+01:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
// flaky "37) test0453(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 21600000L + "'", long30 == 21600000L);
// flaky "25) test0453(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-3599899L) + "'", long32 == (-3599899L));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.001" + "'", str35, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
// flaky "19) test0453(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1570081324101L) + "'", long39 == (-1570081324101L));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00:00.001" + "'", str42, "+00:00:00.001");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(115800000, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffsetFromLocal(25199999L);
        long long7 = dateTimeZone1.convertLocalToUTC(98L, true, (long) (-1));
        int int9 = dateTimeZone1.getOffset(3L);
        long long11 = dateTimeZone1.convertUTCToLocal((-1570084924200L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "125) test0455(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3600000 + "'", int3 == 3600000);
// flaky "114) test0455(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-3599902L) + "'", long7 == (-3599902L));
// flaky "94) test0455(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3600000 + "'", int9 == 3600000);
// flaky "68) test0455(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570081324200L) + "'", long11 == (-1570081324200L));
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long4 = dateTimeZone1.convertLocalToUTC((-1570084924001L), false);
        int int6 = dateTimeZone1.getOffsetFromLocal((-1570084924000L));
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 1);
        boolean boolean9 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1570084924000L) + "'", long4 == (-1570084924000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long3 = dateTimeZone1.nextTransition((long) (-1));
        java.lang.String str5 = dateTimeZone1.getName((-10800098L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
        java.lang.String str16 = dateTimeZone3.getName((long) 'a');
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone3.isLocalDateTimeGap(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "126) test0458(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600000 + "'", int7 == 3600000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "115) test0458(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "95) test0458(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+01:00");
// flaky "69) test0458(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+01:00" + "'", str12, "+01:00");
// flaky "47) test0458(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:00" + "'", str14, "+01:00");
// flaky "38) test0458(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+01:00" + "'", str16, "+01:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone3.isLocalDateTimeGap(localDateTime8);
        boolean boolean11 = dateTimeZone3.isStandardOffset((-35999900L));
        java.lang.Object obj12 = dateTimeZone3.writeReplace();
        boolean boolean13 = dateTimeZone3.isFixed();
        long long17 = dateTimeZone3.convertLocalToUTC(360000009L, false, 134L);
        long long19 = dateTimeZone3.previousTransition((-1570048923801L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "127) test0459(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600000 + "'", int7 == 3600000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "116) test0459(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 356400009L + "'", long17 == 356400009L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1570048923801L) + "'", long19 == (-1570048923801L));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
        int int14 = dateTimeZone3.getOffsetFromLocal((long) (byte) 1);
        int int16 = dateTimeZone3.getStandardOffset((long) 115800000);
        boolean boolean18 = dateTimeZone3.isStandardOffset((-99L));
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        long long22 = dateTimeZone3.getMillisKeepLocal(dateTimeZone20, 3L);
        long long24 = dateTimeZone20.previousTransition(46L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "128) test0460(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600000 + "'", int7 == 3600000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "117) test0460(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "96) test0460(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+01:00");
// flaky "70) test0460(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+01:00" + "'", str12, "+01:00");
// flaky "48) test0460(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3600000 + "'", int14 == 3600000);
// flaky "39) test0460(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3600000 + "'", int16 == 3600000);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTimeZone20);
// flaky "26) test0460(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-32399997L) + "'", long22 == (-32399997L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 46L + "'", long24 == 46L);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        long long8 = dateTimeZone1.nextTransition(98L);
        long long10 = dateTimeZone1.nextTransition((long) (byte) 1);
        long long12 = dateTimeZone1.previousTransition((long) (short) 100);
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        java.lang.String str15 = dateTimeZone1.getShortName((-35999999L));
        java.lang.String str17 = dateTimeZone1.getShortName(324000002L);
        boolean boolean18 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        int int4 = dateTimeZone1.getStandardOffset((long) 32);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        long long25 = dateTimeZone1.convertUTCToLocal((-1570084924000L));
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone1.getName(32L, locale27);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone1.getName(36000000L, locale30);
        org.joda.time.LocalDateTime localDateTime32 = null;
        boolean boolean33 = dateTimeZone1.isLocalDateTimeGap(localDateTime32);
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone1.getShortName(360000000L, locale35);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "129) test0463(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:00" + "'", str8, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
// flaky "118) test0463(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3600000 + "'", int17 == 3600000);
        org.junit.Assert.assertNotNull(timeZone18);
// flaky "97) test0463(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertNotNull(timeZone19);
// flaky "71) test0463(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+01:00");
// flaky "49) test0463(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3600000L + "'", long21 == 3600000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
// flaky "40) test0463(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1570081324000L) + "'", long25 == (-1570081324000L));
// flaky "27) test0463(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+01:00" + "'", str28, "+01:00");
// flaky "20) test0463(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+01:00" + "'", str31, "+01:00");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
// flaky "12) test0463(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+01:00" + "'", str36, "+01:00");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.toString();
        java.lang.String str7 = dateTimeZone1.toString();
        int int9 = dateTimeZone1.getOffset((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone1.isLocalDateTimeGap(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky "130) test0464(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3600000 + "'", int5 == 3600000);
// flaky "119) test0464(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+01:00" + "'", str6, "+01:00");
// flaky "98) test0464(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+01:00" + "'", str7, "+01:00");
// flaky "72) test0464(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3600000 + "'", int9 == 3600000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, (-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        long long5 = dateTimeZone1.convertLocalToUTC((-1570084924102L), false);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = null; // flaky "131) test0466(org.joda.time.RegressionTest0)": org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "120) test0466(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
// flaky "99) test0466(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1570120924102L) + "'", long5 == (-1570120924102L));
        org.junit.Assert.assertNotNull(timeZone6);
// flaky "73) test0466(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+10:00");
// flaky "50) test0466(org.joda.time.RegressionTest0)":         org.junit.Assert.assertNotNull(dateTimeZone7);
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
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getShortName((long) (byte) 100, locale10);
        java.lang.Class<?> wildcardClass12 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "132) test0467(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky "121) test0467(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:00");
// flaky "100) test0467(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:00" + "'", str11, "+10:00");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '4');
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        long long5 = dateTimeZone1.convertUTCToLocal((-101L));
        long long7 = dateTimeZone1.previousTransition((-36000299L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 187200000 + "'", int3 == 187200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 187199899L + "'", long5 == 187199899L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-36000299L) + "'", long7 == (-36000299L));
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.lang.String str5 = dateTimeZone1.toString();
        long long7 = dateTimeZone1.nextTransition((-1570084924001L));
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getName((-1570200723999L), locale9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1570084924001L) + "'", long7 == (-1570084924001L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        int int3 = dateTimeZone1.getOffset((-1570200723999L));
        java.lang.String str4 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3600000) + "'", int3 == (-3600000));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:00" + "'", str4, "-01:00");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00");
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.Class<?> wildcardClass3 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 360600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 360600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 1, locale3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (-1570084924201L));
        long long9 = dateTimeZone1.previousTransition((-54479800L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky "133) test0473(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1569771724201L) + "'", long7 == (-1569771724201L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-54479800L) + "'", long9 == (-54479800L));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        java.lang.String str24 = dateTimeZone13.toString();
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        long long30 = dateTimeZone26.getMillisKeepLocal(dateTimeZone28, (long) 'a');
        boolean boolean31 = dateTimeZone26.isFixed();
        int int33 = dateTimeZone26.getStandardOffset((-1L));
        java.lang.String str34 = dateTimeZone26.getID();
        boolean boolean35 = dateTimeZone13.equals((java.lang.Object) str34);
        java.lang.String str36 = dateTimeZone13.getID();
        java.lang.String str37 = dateTimeZone13.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "134) test0474(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:00" + "'", str8, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
// flaky "122) test0474(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36000000 + "'", int17 == 36000000);
        org.junit.Assert.assertNotNull(timeZone18);
// flaky "101) test0474(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(timeZone19);
// flaky "74) test0474(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+10:00");
// flaky "51) test0474(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 36000000L + "'", long21 == 36000000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
// flaky "41) test0474(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+10:00" + "'", str24, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 97L + "'", long30 == 97L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
// flaky "28) test0474(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 36000000 + "'", int33 == 36000000);
// flaky "21) test0474(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+10:00" + "'", str34, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
// flaky "13) test0474(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+10:00" + "'", str36, "+10:00");
// flaky "9) test0474(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+10:00" + "'", str37, "+10:00");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        long long11 = dateTimeZone1.convertLocalToUTC((-1570084924101L), true);
        boolean boolean13 = dateTimeZone1.isStandardOffset(0L);
        boolean boolean15 = dateTimeZone1.equals((java.lang.Object) 0.0f);
        java.lang.String str17 = dateTimeZone1.getName((long) (short) 0);
        long long19 = dateTimeZone1.convertUTCToLocal((-39599899L));
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone1.isLocalDateTimeGap(localDateTime20);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone1.getShortName((-3600000L), locale23);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "135) test0475(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:00" + "'", str8, "+10:00");
// flaky "123) test0475(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570120924101L) + "'", long11 == (-1570120924101L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky "102) test0475(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+10:00" + "'", str17, "+10:00");
// flaky "75) test0475(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-3599899L) + "'", long19 == (-3599899L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky "52) test0475(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+10:00" + "'", str24, "+10:00");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) 1.0f);
        int int8 = dateTimeZone1.getOffsetFromLocal((long) 25200000);
        java.lang.String str9 = dateTimeZone1.getID();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.lang.String str12 = dateTimeZone11.getID();
        long long14 = dateTimeZone11.previousTransition((-1L));
        long long16 = dateTimeZone11.previousTransition(102L);
        long long18 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, 25199948L);
        java.lang.Object obj19 = dateTimeZone11.writeReplace();
        boolean boolean21 = dateTimeZone11.equals((java.lang.Object) 198L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 102L + "'", long16 == 102L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 25199948L + "'", long18 == 25199948L);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 0, locale8);
        long long11 = dateTimeZone1.nextTransition((long) ' ');
        long long15 = dateTimeZone1.convertLocalToUTC((long) '4', false, 115799900L);
        long long19 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 36000000L);
        java.lang.String str21 = dateTimeZone1.getNameKey((long) (short) -1);
        int int23 = dateTimeZone1.getOffsetFromLocal(35999999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-48L) + "'", long15 == (-48L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-101L) + "'", long19 == (-101L));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
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
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) false);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((long) 100, locale12);
        long long15 = dateTimeZone1.convertUTCToLocal((-1570084924101L));
        int int17 = dateTimeZone1.getOffsetFromLocal((-1570084924001L));
        int int19 = dateTimeZone1.getOffsetFromLocal(25200001L);
        long long21 = dateTimeZone1.nextTransition((-396600001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "136) test0478(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+100:00" + "'", str8, "+100:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "124) test0478(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:00" + "'", str13, "+100:00");
// flaky "103) test0478(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1569724924101L) + "'", long15 == (-1569724924101L));
// flaky "76) test0478(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 360000000 + "'", int17 == 360000000);
// flaky "53) test0478(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 360000000 + "'", int19 == 360000000);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-396600001L) + "'", long21 == (-396600001L));
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 25200000, true, (long) (short) 10);
        int int8 = dateTimeZone1.getStandardOffset(115799900L);
        java.lang.String str10 = dateTimeZone1.getShortName(110L);
        java.lang.String str12 = dateTimeZone1.getShortName((-25200001L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 25199999L + "'", long6 == 25199999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.001" + "'", str10, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        long long3 = dateTimeZone1.nextTransition((long) 36000000);
        java.lang.Object obj4 = dateTimeZone1.writeReplace();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        long long9 = dateTimeZone1.adjustOffset((-1570048923899L), true);
        java.lang.String str11 = dateTimeZone1.getShortName(389279900L);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getShortName((-166L), locale13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 36000000L + "'", long3 == 36000000L);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1570048923899L) + "'", long9 == (-1570048923899L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.035" + "'", str11, "+00:00:00.035");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.035" + "'", str14, "+00:00:00.035");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        int int4 = dateTimeZone1.getStandardOffset(0L);
        long long7 = dateTimeZone1.adjustOffset((-1570084924100L), false);
        long long11 = dateTimeZone1.convertLocalToUTC(115800000L, false, (-1570084924202L));
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getName(79800000L, locale13);
        java.lang.String str16 = dateTimeZone1.getNameKey(0L);
        long long20 = dateTimeZone1.convertLocalToUTC((-1570120924101L), true, (-1570084924199L));
        java.lang.Class<?> wildcardClass21 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1570084924100L) + "'", long7 == (-1570084924100L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115799999L + "'", long11 == 115799999L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1570120924102L) + "'", long20 == (-1570120924102L));
        org.junit.Assert.assertNotNull(wildcardClass21);
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
        int int14 = dateTimeZone3.getOffsetFromLocal((long) (byte) 1);
        long long16 = dateTimeZone3.convertUTCToLocal((-99L));
        java.util.TimeZone timeZone17 = dateTimeZone3.toTimeZone();
        int int19 = dateTimeZone3.getOffsetFromLocal(0L);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj22 = dateTimeZone21.writeReplace();
        java.lang.Object obj23 = dateTimeZone21.writeReplace();
        boolean boolean24 = dateTimeZone3.equals(obj23);
        java.lang.Object obj25 = dateTimeZone3.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
// flaky "137) test0482(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
// flaky "125) test0482(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
// flaky "104) test0482(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
// flaky "77) test0482(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
// flaky "54) test0482(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        boolean boolean7 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        boolean boolean10 = dateTimeZone1.isFixed();
        int int12 = dateTimeZone1.getOffset((long) 115800000);
        java.lang.String str14 = dateTimeZone1.getNameKey((long) 115800000);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone1.isLocalDateTimeGap(localDateTime15);
        java.lang.Object obj17 = null;
        boolean boolean18 = dateTimeZone1.equals(obj17);
        java.lang.Class<?> wildcardClass19 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        java.lang.String str3 = dateTimeZone1.getName((-35999799L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int6 = dateTimeZone1.getStandardOffset((-1570084924200L));
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+100:00" + "'", str3, "+100:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 360000000 + "'", int6 == 360000000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.Object obj2 = dateTimeZone1.writeReplace();
        java.lang.String str3 = dateTimeZone1.getID();
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        java.lang.String str6 = dateTimeZone5.getID();
        long long8 = dateTimeZone5.previousTransition((-1L));
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        long long14 = dateTimeZone10.getMillisKeepLocal(dateTimeZone12, (long) 'a');
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone10.getName((long) (short) 1, locale16);
        boolean boolean19 = dateTimeZone10.equals((java.lang.Object) false);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone10.getName((long) 100, locale21);
        long long24 = dateTimeZone10.convertUTCToLocal((-1570084924101L));
        int int26 = dateTimeZone10.getOffsetFromLocal((-1570084924001L));
        int int28 = dateTimeZone10.getOffsetFromLocal(25200001L);
        long long30 = dateTimeZone10.convertUTCToLocal((-1570048924000L));
        long long32 = dateTimeZone5.getMillisKeepLocal(dateTimeZone10, 25199999L);
        org.joda.time.ReadableInstant readableInstant33 = null;
        int int34 = dateTimeZone10.getOffset(readableInstant33);
        long long38 = dateTimeZone10.convertLocalToUTC((-100L), true, (long) 'a');
        boolean boolean39 = dateTimeZone1.equals((java.lang.Object) (-100L));
        java.lang.Object obj40 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+100:00" + "'", str6, "+100:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+100:00" + "'", str17, "+100:00");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+100:00" + "'", str22, "+100:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1569724924101L) + "'", long24 == (-1569724924101L));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 360000000 + "'", int26 == 360000000);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 360000000 + "'", int28 == 360000000);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1569688924000L) + "'", long30 == (-1569688924000L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 25199999L + "'", long32 == 25199999L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 360000000 + "'", int34 == 360000000);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-360000100L) + "'", long38 == (-360000100L));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.lang.String str9 = dateTimeZone8.getID();
        long long11 = dateTimeZone8.previousTransition((-1L));
        boolean boolean13 = dateTimeZone8.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone8.getName((long) (short) 0, locale15);
        long long18 = dateTimeZone8.nextTransition((long) ' ');
        int int20 = dateTimeZone8.getStandardOffset(115799900L);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, 110L);
        boolean boolean24 = dateTimeZone1.isStandardOffset(25199999L);
        long long26 = dateTimeZone1.nextTransition((-1570329124102L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 110L + "'", long22 == 110L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1570329124102L) + "'", long26 == (-1570329124102L));
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        long long7 = dateTimeZone1.previousTransition(10L);
        long long9 = dateTimeZone1.previousTransition((-25199901L));
        boolean boolean11 = dateTimeZone1.isStandardOffset((-1570084924001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-25199901L) + "'", long9 == (-25199901L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) '4');
        java.lang.String str4 = dateTimeZone2.getName((long) '#');
        boolean boolean6 = dateTimeZone2.isStandardOffset((-115799900L));
        long long9 = dateTimeZone2.convertLocalToUTC((-20L), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.Class<?> wildcardClass11 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:52" + "'", str4, "+01:52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-6720020L) + "'", long9 == (-6720020L));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
        java.lang.String str14 = dateTimeZone1.getName(0L);
        java.lang.Class<?> wildcardClass15 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:52" + "'", str8, "+01:52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+01:52" + "'", str12, "+01:52");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:52" + "'", str14, "+01:52");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) '#');
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (short) 1, locale7);
        long long11 = dateTimeZone1.convertLocalToUTC((-1570084924101L), true);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getShortName((long) 115800000, locale13);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone1.isLocalDateTimeGap(localDateTime15);
        java.lang.Class<?> wildcardClass17 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:52" + "'", str8, "+01:52");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1570091644101L) + "'", long11 == (-1570091644101L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:52" + "'", str14, "+01:52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.getID();
        long long6 = dateTimeZone3.previousTransition((-1L));
        long long10 = dateTimeZone3.convertLocalToUTC(25200000L, true, 100L);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 100L);
        boolean boolean14 = dateTimeZone1.isStandardOffset((-36000000L));
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone1.isLocalDateTimeGap(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:52" + "'", str4, "+01:52");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 18480000L + "'", long10 == 18480000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-6719899L) + "'", long12 == (-6719899L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(25200000, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 'a');
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 100);
        java.util.TimeZone timeZone8 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        long long11 = dateTimeZone3.convertUTCToLocal(0L);
        boolean boolean13 = dateTimeZone3.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone14 = dateTimeZone3.toTimeZone();
        int int16 = dateTimeZone3.getOffsetFromLocal((long) ' ');
        long long19 = dateTimeZone3.convertLocalToUTC((-1570084923900L), false);
        boolean boolean20 = dateTimeZone3.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6720000 + "'", int7 == 6720000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+01:52");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+01:52");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 6720000L + "'", long11 == 6720000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+01:52");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6720000 + "'", int16 == 6720000);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1570091643900L) + "'", long19 == (-1570091643900L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-1L));
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) (-1.0f));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 0, locale8);
        long long11 = dateTimeZone1.nextTransition((long) ' ');
        int int13 = dateTimeZone1.getStandardOffset(115799900L);
        java.lang.String str14 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:52" + "'", str2, "+01:52");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+01:52" + "'", str9, "+01:52");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6720000 + "'", int13 == 6720000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:52" + "'", str14, "+01:52");
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
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getStandardOffset((-1L));
        java.lang.String str10 = dateTimeZone1.getShortName(25199900L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Object obj13 = dateTimeZone12.writeReplace();
        long long17 = dateTimeZone12.convertLocalToUTC((long) 25200000, true, (long) (short) 10);
        int int19 = dateTimeZone12.getStandardOffset(115799900L);
        long long21 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, (-25200001L));
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = dateTimeZone1.getOffset(readableInstant22);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6720000 + "'", int8 == 6720000);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+01:52" + "'", str10, "+01:52");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 25199999L + "'", long17 == 25199999L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-18480002L) + "'", long21 == (-18480002L));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6720000 + "'", int23 == 6720000);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-99L), locale7);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 'a');
        java.lang.String str13 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone1.getOffset(readableInstant14);
        java.lang.String str16 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6720000 + "'", int5 == 6720000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:52" + "'", str8, "+01:52");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6720000 + "'", int12 == 6720000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+01:52" + "'", str13, "+01:52");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6720000 + "'", int15 == 6720000);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+01:52" + "'", str16, "+01:52");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.adjustOffset((long) (short) 1, false);
        java.lang.String str5 = dateTimeZone1.toString();
        long long8 = dateTimeZone1.convertLocalToUTC((-2L), false);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName((-71999989L), locale10);
        java.lang.String str12 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3L) + "'", long8 == (-3L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 115800000);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1570084924001L), locale5);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '-00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        long long9 = dateTimeZone1.adjustOffset((long) '#', true);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone1.isLocalDateTimeGap(localDateTime10);
        long long13 = dateTimeZone1.nextTransition((-25200101L));
        int int15 = dateTimeZone1.getOffsetFromLocal((-35999945L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:52" + "'", str2, "+01:52");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:52" + "'", str4, "+01:52");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+01:52" + "'", str6, "+01:52");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-25200101L) + "'", long13 == (-25200101L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6720000 + "'", int15 == 6720000);
    }
}
